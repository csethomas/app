package com.fudanwx.framework;

import java.io.File;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.net.URL;

import org.springframework.core.io.ClassPathResource;

public final class GlobalContext {
	public final static String BASE_PACKAGE = "com.fudanwx";
	public final static String baseLocation = "com/fudanwx";
	
	private static URL url = null;
	private static String urlForRuntime = null;
	private static String locationForRuntime = null;
	private static String locationForLoggingStore = null;
	private static String pathForRuntime = null;
	
	private final static String processName = ManagementFactory.getRuntimeMXBean().getName();
	private final static String processId = processName.substring(0, processName.indexOf("@"));
	
	static 
	{
		try {
			url = new ClassPathResource("/").getURL();
		} catch (IOException e) {
			System.out.println("无法定位运行目录");
			System.exit(0);
		}
		urlForRuntime = url.toExternalForm();
		locationForRuntime = urlForRuntime.replace("file:/", "");
		locationForLoggingStore = locationForRuntime + "runtime/logs";
		pathForRuntime = new File( url.getPath() ).getPath() + "\\" ;
	}
	
	/**
	 * <p>获取基础包名。</p>
	 * @return 基础包名
	 */
	public static String getBasePackage() {
		return BASE_PACKAGE;
	}
	
	/**
	 * <p>获取基础类路径</p>
	 * @return 基础类路径
	 */
	public static String getBaseLocation() {
		return baseLocation;
	}
	
	/**
	 * <p>获取系统运行目录的<code>Url</code>格式字符串。</p>
	 * @return 系统运行目录
	 */
	public static String getUrlForRuntime() {
		return urlForRuntime;
	}
	
	/**
	 * <p>获取系统运行目录位置</P>
	 * @return 系统运行目录位置
	 */
	public static String getLocationForRuntime() {
		return locationForRuntime;
	}

	/**
	 * <p>获取运行日志目录位置</P>
	 * @return 运行日志目录位置
	 */
	public static String getLocationForLoggingStore() {
		return locationForLoggingStore;
	}
	
	/**
	 * <p>获取系统运行目录路径</P>
	 * @return 系统运行目录路径
	 */
	public static String getPathForRuntime() {
		return pathForRuntime;
	}
	
	public static String getProcessName() {
		return processName;
	}
	
	public static String getProcessId() {
		return processId;
	}
}
