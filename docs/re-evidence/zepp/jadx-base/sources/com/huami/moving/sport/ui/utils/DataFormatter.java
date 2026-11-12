package com.huami.moving.sport.ui.utils;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public class DataFormatter {
    public static String getMMSSTimeBySecond(Context context, int i) {
        StringBuilder sb;
        StringBuilder sb2;
        String str;
        int i2 = i / 3600;
        int i3 = (i - ((i2 * 60) * 60)) / 60;
        int i4 = (i - (i2 * 3600)) - (i3 * 60);
        if (i2 < 10) {
            sb = new StringBuilder();
            sb.append("0");
        } else {
            sb = new StringBuilder();
            sb.append("");
        }
        sb.append(i2);
        String string = sb.toString();
        if (i3 < 10) {
            sb2 = new StringBuilder();
            sb2.append("0");
        } else {
            sb2 = new StringBuilder();
            sb2.append("");
        }
        sb2.append(i3);
        String string2 = sb2.toString();
        if (i4 < 10) {
            str = "0" + i4;
        } else {
            str = "" + i4;
        }
        if (i2 <= 0) {
            return string2 + ":" + str;
        }
        return string + ":" + string2 + ":" + str;
    }
}
