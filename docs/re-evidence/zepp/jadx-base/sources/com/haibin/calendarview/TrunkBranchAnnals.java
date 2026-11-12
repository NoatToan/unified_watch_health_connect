package com.haibin.calendarview;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class TrunkBranchAnnals {
    private static String[] a;
    private static String[] b;

    public static int getBranchInt(int i) {
        int i2 = i % 12;
        if (i2 == 0) {
            return 11;
        }
        return i2 - 1;
    }

    public static String getBranchString(int i) {
        return b[getBranchInt(i)];
    }

    public static String getTrunkBranchYear(int i) {
        return String.format("%s%s", getTrunkString(i), getBranchString(i));
    }

    public static int getTrunkInt(int i) {
        int i2 = i % 10;
        if (i2 == 0) {
            return 9;
        }
        return i2 - 1;
    }

    public static String getTrunkString(int i) {
        return a[getTrunkInt(i)];
    }

    public static void init(Context context) {
        if (a != null) {
            return;
        }
        a = context.getResources().getStringArray(R.array.trunk_string_array);
        b = context.getResources().getStringArray(R.array.branch_string_array);
    }
}
