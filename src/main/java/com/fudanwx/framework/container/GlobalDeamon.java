package com.fudanwx.framework.container;

import com.fudanwx.framework.container.logging.LoggingDaemon;
import com.fudanwx.framework.lang.util.DateUtility;
import org.springframework.core.io.ClassPathResource;

/**
 * <p>全局上下文服务，应用入口。</p>
 * <p>单例服务类，不可继承
 */
public final class GlobalDeamon 
{
	private static String ConfigXml;
	private static boolean initialized = false;
	
    public static void main( String[] args )
    {
    	long startTime = System.currentTimeMillis() ;
        StringBuilder systemInfo = new StringBuilder( "\n---------------------------------------------------------------------------\n System starting [" )
            .append( DateUtility.dateTimeString() )
            .append( "]\n\n" ) ;
        initialize();
    }

	public static boolean isInitialized() {
		return initialized;
	}
	
    /**
     * <p>初始化方法。</p>
     * <p>启动日志和配置服务，注册日志输出器
     */
	private static void initialize() {
		LoggingDaemon.startup();
		
	}
}
