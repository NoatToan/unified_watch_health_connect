package com.huami.mifit.sportlib.gpx.data;

import com.google.android.material.datepicker.UtcDates;
import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.cybergarage.http.HTTP;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes11.dex */
public class GPXBaseEntity {
    public static String getTimeStampAsString(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(UtcDates.UTC));
        return simpleDateFormat.format(date);
    }

    public static Date parseTimestampIntoDate(String str) {
        try {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone(UtcDates.UTC));
                return simpleDateFormat.parse(str);
            } catch (ParseException unused) {
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault());
                simpleDateFormat2.setLenient(false);
                simpleDateFormat2.setTimeZone(TimeZone.getTimeZone(UtcDates.UTC));
                return simpleDateFormat2.parse(str);
            }
        } catch (ParseException unused2) {
            return null;
        }
    }

    public void closeXmlTag(String str, PrintStream printStream, boolean z, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            printStream.print(HTTP.TAB);
        }
        printStream.print("</" + str + SearchCriteria.GT);
        if (z) {
            putNewLine(printStream);
        }
    }

    public void headXml(String str, PrintStream printStream) {
        printStream.print(str);
        putNewLine(printStream);
    }

    public void openXmlTag(String str, PrintStream printStream, ArrayList<String> arrayList, ArrayList<String> arrayList2, boolean z, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            printStream.print(HTTP.TAB);
        }
        printStream.print(SearchCriteria.LT + str);
        if (arrayList != null && arrayList2 != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                printStream.print(" " + arrayList.get(i3) + "=\"" + arrayList2.get(i3) + "\"");
            }
        }
        printStream.print(SearchCriteria.GT);
        if (z) {
            putNewLine(printStream);
        }
    }

    public void putDateTimeValueInXmlIfNotNull(String str, Date date, PrintStream printStream, int i) {
        if (date == null) {
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            printStream.print(HTTP.TAB);
        }
        openXmlTag(str, printStream, false, 0);
        printStream.print(getTimeStampAsString(date));
        closeXmlTag(str, printStream, false, 0);
        putNewLine(printStream);
    }

    public void putFloatValueInXmlIfNotNull(String str, Float f, PrintStream printStream, int i) {
        if (f == null) {
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            printStream.print(HTTP.TAB);
        }
        openXmlTag(str, printStream, false, 0);
        printStream.print(Float.toString(f.floatValue()));
        closeXmlTag(str, printStream, false, 0);
        putNewLine(printStream);
    }

    public void putNewLine(PrintStream printStream) {
        printStream.print("\n");
    }

    public void putStringValueInXmlIfNotNull(String str, String str2, PrintStream printStream, int i) {
        if (str2 == null) {
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            printStream.print(HTTP.TAB);
        }
        openXmlTag(str, printStream, false, 0);
        printStream.print("<![CDATA[" + str2 + "]]>");
        closeXmlTag(str, printStream, false, 0);
        putNewLine(printStream);
    }

    public void openXmlTag(String str, PrintStream printStream, boolean z, int i) {
        openXmlTag(str, printStream, null, null, z, i);
    }
}
