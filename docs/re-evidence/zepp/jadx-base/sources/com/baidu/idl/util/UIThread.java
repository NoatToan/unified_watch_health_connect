package com.baidu.idl.util;

import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public class UIThread {
    public static boolean isUITread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
