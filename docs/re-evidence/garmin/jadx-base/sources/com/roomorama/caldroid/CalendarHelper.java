package com.roomorama.caldroid;

import h03.a;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class CalendarHelper {
    public static SimpleDateFormat yyyyMMddFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
    public static SimpleDateFormat MMMFormat = new SimpleDateFormat("MMM", Locale.getDefault());

    public static Date convertDateTimeToDate(a aVar) {
        aVar.g();
        int iIntValue = aVar.f80659b.intValue();
        aVar.g();
        int iIntValue2 = aVar.f80660c.intValue();
        aVar.g();
        int iIntValue3 = aVar.f80661d.intValue();
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(iIntValue, iIntValue2 - 1, iIntValue3);
        return calendar.getTime();
    }

    public static a convertDateToDateTime(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.setTime(date);
        return new a(Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5)), 0, 0, 0, 0);
    }

    public static ArrayList<String> convertToStringList(ArrayList<a> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        Iterator<a> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().i("YYYY-MM-DD"));
        }
        return arrayList2;
    }

    public static Date getDateFromString(String str, String str2) {
        return (str2 == null ? yyyyMMddFormat : new SimpleDateFormat(str2, Locale.ENGLISH)).parse(str);
    }

    public static a getDateTimeFromString(String str, String str2) {
        try {
            return convertDateToDateTime(getDateFromString(str, str2));
        } catch (ParseException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    public static ArrayList<a> getFullWeeks(int i14, int i15, int i16, boolean z14) {
        a aVarS;
        ArrayList<a> arrayList = new ArrayList<>();
        Integer numValueOf = Integer.valueOf(i15);
        Integer numValueOf2 = Integer.valueOf(i14);
        int i17 = 0;
        a aVar = new a(numValueOf, numValueOf2, 1, 0, 0, 0, 0);
        aVar.f();
        a aVarS2 = aVar.s(Integer.valueOf(a.l(aVar.f80659b, aVar.f80660c).intValue() - 1));
        int iIntValue = aVar.n().intValue();
        if (iIntValue < i16) {
            iIntValue += 7;
        }
        while (iIntValue > 0) {
            a aVarS3 = aVar.s(Integer.valueOf((iIntValue - i16) * (-1)));
            if (!aVarS3.r(aVar)) {
                break;
            }
            arrayList.add(aVarS3);
            iIntValue--;
        }
        while (true) {
            aVarS2.g();
            if (i17 >= aVarS2.f80661d.intValue()) {
                break;
            }
            arrayList.add(aVar.s(Integer.valueOf(i17)));
            i17++;
        }
        int i18 = i16 - 1;
        if (i18 == 0) {
            i18 = 7;
        }
        if (aVarS2.n().intValue() != i18) {
            int i19 = 1;
            do {
                aVarS = aVarS2.s(Integer.valueOf(i19));
                arrayList.add(aVarS);
                i19++;
            } while (aVarS.n().intValue() != i18);
        }
        if (z14) {
            int size = arrayList.size();
            int i24 = (6 - (size / 7)) * 7;
            a aVar2 = arrayList.get(size - 1);
            for (int i25 = 1; i25 <= i24; i25++) {
                arrayList.add(aVar2.s(Integer.valueOf(i25)));
            }
        }
        return arrayList;
    }
}
