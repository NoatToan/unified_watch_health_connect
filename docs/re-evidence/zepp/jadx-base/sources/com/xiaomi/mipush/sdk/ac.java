package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes22.dex */
public class ac {
    public static AbstractPushManager a(Context context, c cVar) {
        return b(context, cVar);
    }

    private static AbstractPushManager b(Context context, c cVar) {
        j.a aVarM3481a = j.m3481a(cVar);
        if (aVarM3481a == null || TextUtils.isEmpty(aVarM3481a.a) || TextUtils.isEmpty(aVarM3481a.b)) {
            return null;
        }
        return (AbstractPushManager) com.xiaomi.push.z.a(aVarM3481a.a, aVarM3481a.b, context);
    }
}
