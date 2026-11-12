package com.huawei.openalliance.ad;

import androidx.exifinterface.media.ExifInterface;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ia {
    public static String a(int i) {
        if (i == 3) {
            return "D";
        }
        if (i == 4) {
            return "I";
        }
        if (i != 5) {
            return i != 6 ? String.valueOf(i) : ExifInterface.LONGITUDE_EAST;
        }
        return "W";
    }
}
