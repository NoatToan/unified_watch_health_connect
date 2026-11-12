package com.huawei.hianalytics.visual;

import com.huawei.hianalytics.core.log.HiLog;

/* JADX INFO: loaded from: classes33.dex */
public abstract /* synthetic */ class d0 {
    public static void a(Exception exc, StringBuilder sb, String str) {
        sb.append(exc.getMessage());
        HiLog.w(str, sb.toString());
    }
}
