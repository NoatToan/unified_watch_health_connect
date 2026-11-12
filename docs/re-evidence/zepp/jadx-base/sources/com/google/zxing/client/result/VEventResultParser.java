package com.google.zxing.client.result;

import androidx.core.net.MailTo;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.stats.CodePackage;
import com.google.zxing.Result;
import com.huami.assistant.calendar.ICalendar;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class VEventResultParser extends ResultParser {
    private static String g(CharSequence charSequence, String str, boolean z) {
        List<String> listJ = VCardResultParser.j(charSequence, str, z, false);
        if (listJ == null || listJ.isEmpty()) {
            return null;
        }
        return listJ.get(0);
    }

    private static String[] h(CharSequence charSequence, String str, boolean z) {
        List<List<String>> listK = VCardResultParser.k(charSequence, str, z, false);
        if (listK == null || listK.isEmpty()) {
            return null;
        }
        int size = listK.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = listK.get(i).get(0);
        }
        return strArr;
    }

    private static String i(String str) {
        if (str != null) {
            return (str.startsWith(MailTo.MAILTO_SCHEME) || str.startsWith("MAILTO:")) ? str.substring(7) : str;
        }
        return str;
    }

    @Override // com.google.zxing.client.result.ResultParser
    public CalendarParsedResult parse(Result result) {
        double d;
        String massagedText = ResultParser.getMassagedText(result);
        if (massagedText.indexOf("BEGIN:VEVENT") < 0) {
            return null;
        }
        String strG = g("SUMMARY", massagedText, true);
        String strG2 = g(ICalendar.Property.DTSTART, massagedText, true);
        if (strG2 == null) {
            return null;
        }
        String strG3 = g(ICalendar.Property.DTEND, massagedText, true);
        String strG4 = g(ICalendar.Property.DURATION, massagedText, true);
        String strG5 = g(CodePackage.LOCATION, massagedText, true);
        String strI = i(g("ORGANIZER", massagedText, true));
        String[] strArrH = h("ATTENDEE", massagedText, true);
        if (strArrH != null) {
            for (int i = 0; i < strArrH.length; i++) {
                strArrH[i] = i(strArrH[i]);
            }
        }
        String strG6 = g(ShareConstants.DESCRIPTION, massagedText, true);
        String strG7 = g("GEO", massagedText, true);
        double d2 = Double.NaN;
        if (strG7 == null) {
            d = Double.NaN;
        } else {
            int iIndexOf = strG7.indexOf(59);
            if (iIndexOf < 0) {
                return null;
            }
            try {
                d2 = Double.parseDouble(strG7.substring(0, iIndexOf));
                d = Double.parseDouble(strG7.substring(iIndexOf + 1));
            } catch (NumberFormatException | IllegalArgumentException unused) {
                return null;
            }
        }
        return new CalendarParsedResult(strG, strG2, strG3, strG4, strG5, strI, strArrH, strG6, d2, d);
    }
}
