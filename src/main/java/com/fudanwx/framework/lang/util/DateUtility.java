package com.fudanwx.framework.lang.util;

import java.sql.Timestamp ;
import java.util.Calendar ;
import java.util.Date ;

import org.apache.commons.lang3.StringUtils ;
import org.joda.time.DateTime ;
import org.joda.time.format.DateTimeFormat ;
import org.joda.time.format.DateTimeFormatter ;

public final class DateUtility
{
    public final static String DATE_FORMAT = "yyyy-MM-dd" ;
    public final static String TIME_FORMAT = "HH:mm:ss" ;
    public final static String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss" ;

    private final static DateTimeFormatter dateFormat = DateTimeFormat.forPattern( DATE_FORMAT ) ;
    private final static DateTimeFormatter timeFormat = DateTimeFormat.forPattern( TIME_FORMAT ) ;
    private final static DateTimeFormatter dateTimeFormat = DateTimeFormat.forPattern( DATE_TIME_FORMAT ) ;

    public static java.sql.Date parseSqlDate( String value )
    {
        if( StringUtils.isEmpty( value ) )
        {
            return null ;
        }
        return new java.sql.Date( parseDate( value ).getTime() ) ;
    }

    public static java.sql.Date parseSqlTime( String value )
    {
        if( StringUtils.isEmpty( value ) )
        {
            return null ;
        }
        return new java.sql.Date( parseTime( value ).getTime() ) ;
    }

    public static java.sql.Date parseSqlDateTime( String value )
    {
        if( StringUtils.isEmpty( value ) )
        {
            return null ;
        }
        return new java.sql.Date( parseDateTime( value ).getTime() ) ;
    }

    public static Timestamp timestampDate( String value )
    {
        if( StringUtils.isEmpty( value ) )
        {
            return null ;
        }
        return new Timestamp( parseDate( value ).getTime() ) ;
    }

    public static Timestamp timestampTime( String value )
    {
        if( StringUtils.isEmpty( value ) )
        {
            return null ;
        }
        return new Timestamp( parseTime( value ).getTime() ) ;
    }

    public static Timestamp timestampDateTime( String value )
    {
        if( StringUtils.isEmpty( value ) )
        {
            return null ;
        }
        return new Timestamp( parseDateTime( value ).getTime() ) ;
    }

    public static Date parseDate( String value )
    {
        return parseJodaDate( value ).toDate() ;
    }

    public static Date parseTime( String value )
    {
        return parseJodaTime( value ).toDate() ;
    }

    public static Date parseDateTime( String value )
    {
        return parseJodaDateTime( value ).toDate() ;
    }

    public static Calendar parseCalendarDate( String value )
    {
        if( StringUtils.isEmpty( value ) )
        {
            return null ;
        }
        Calendar result = Calendar.getInstance() ;
        result.setTime( parseDate( value ) ) ;
        return result ;
    }

    public static Calendar parseCalendarTime( String value )
    {
        if( StringUtils.isEmpty( value ) )
        {
            return null ;
        }
        Calendar result = Calendar.getInstance() ;
        result.setTime( parseTime( value ) ) ;
        return result ;
    }

    public static Calendar parseCalendarDateTime( String value )
    {
        if( StringUtils.isEmpty( value ) )
        {
            return null ;
        }
        Calendar result = Calendar.getInstance() ;
        result.setTime( parseDateTime( value ) ) ;
        return result ;
    }

    public static DateTime parseJodaDate( String value )
    {
        if( StringUtils.isEmpty( value ) )
        {
            return null ;
        }
        return dateFormat.parseDateTime( value ) ;
    }

    public static DateTime parseJodaTime( String value )
    {
        if( StringUtils.isEmpty( value ) )
        {
            return null ;
        }
        return timeFormat.parseDateTime( value ) ;
    }

    public static DateTime parseJodaDateTime( String value )
    {
        if( StringUtils.isEmpty( value ) )
        {
            return null ;
        }
        return dateTimeFormat.parseDateTime( value ) ;
    }

    public static String dateString()
    {
        return new DateTime().toString( dateFormat ) ;
    }

    public static String dateString( Date date )
    {
        return new DateTime( date ).toString( dateFormat ) ;
    }

    public static String dateString( Calendar date )
    {
        return new DateTime( date ).toString( dateFormat ) ;
    }

    public static String dateString( java.sql.Date date )
    {
        return new DateTime( date ).toString( dateFormat ) ;
    }

    public static String dateString( Timestamp date )
    {
        return new DateTime( date ).toString( dateFormat ) ;
    }

    public static String dateString( DateTime date )
    {
        return date.toString( dateFormat ) ;
    }

    public static String timeString()
    {
        return new DateTime().toString( timeFormat ) ;
    }

    public static String timeString( Date date )
    {
        return new DateTime( date ).toString( timeFormat ) ;
    }

    public static String timeString( Calendar date )
    {
        return new DateTime( date ).toString( timeFormat ) ;
    }

    public static String timeString( java.sql.Date date )
    {
        return new DateTime( date ).toString( timeFormat ) ;
    }

    public static String timeString( Timestamp date )
    {
        return new DateTime( date ).toString( timeFormat ) ;
    }

    public static String timeString( DateTime date )
    {
        return date.toString( timeFormat ) ;
    }

    public static String dateTimeString()
    {
        return new DateTime().toString( dateTimeFormat ) ;
    }

    public static String dateTimeString( Date date )
    {
        return new DateTime( date ).toString( dateTimeFormat ) ;
    }

    public static String dateTimeString( Calendar date )
    {
        return new DateTime( date ).toString( dateTimeFormat ) ;
    }

    public static String dateTimeString( java.sql.Date date )
    {
        return new DateTime( date ).toString( dateTimeFormat ) ;
    }

    public static String dateTimeString( Timestamp date )
    {
        return new DateTime( date ).toString( dateTimeFormat ) ;
    }

    public static String dateTimeString( DateTime date )
    {
        return date.toString( dateTimeFormat ) ;
    }

    public static String formatString( String format )
    {
        return new DateTime().toString( format ) ;
    }

    public static String formatString( Date date, String format )
    {
        return new DateTime( date ).toString( format ) ;
    }

    public static String formatString( Calendar date, String format )
    {
        return new DateTime( date ).toString( format ) ;
    }

    public static String formatString( java.sql.Date date, String format )
    {
        return new DateTime( date ).toString( format ) ;
    }

    public static String formatString( Timestamp date, String format )
    {
        return new DateTime( date ).toString( format ) ;
    }

    public static String formatString( DateTime date, String format )
    {
        return date.toString( format ) ;
    }

    private DateUtility() {}
}

