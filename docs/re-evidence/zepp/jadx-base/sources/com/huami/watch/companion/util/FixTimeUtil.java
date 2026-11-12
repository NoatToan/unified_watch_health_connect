package com.huami.watch.companion.util;

import android.content.Context;
import com.huami.watch.companionlib.R;

/* JADX INFO: loaded from: classes16.dex */
public class FixTimeUtil {
    public static String formatFixTime(Context context, int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = i / 60;
        int i3 = i % 60;
        if (i2 > 0) {
            sb.append(context.getResources().getQuantityString(R.plurals.fix_hour, i2, Integer.valueOf(i2)));
        }
        if (i3 > 0) {
            sb.append(context.getResources().getQuantityString(R.plurals.fix_minute, i3, Integer.valueOf(i3)));
        }
        return sb.toString();
    }
}
