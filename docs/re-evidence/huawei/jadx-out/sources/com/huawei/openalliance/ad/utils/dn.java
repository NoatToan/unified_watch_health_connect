package com.huawei.openalliance.ad.utils;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;

/* JADX INFO: loaded from: classes12.dex */
public class dn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f20648a;

    public static Pair<String, Boolean> a(Context context) {
        String strA = cc.a(context);
        f20648a = strA;
        if (!TextUtils.isEmpty(strA)) {
            return new Pair<>(f20648a, false);
        }
        String strA2 = bq.a(context);
        f20648a = strA2;
        if (!TextUtils.isEmpty(strA2)) {
            return new Pair<>(f20648a, false);
        }
        String strA3 = dt.a(context);
        f20648a = strA3;
        return !TextUtils.isEmpty(strA3) ? new Pair<>(f20648a, false) : au.a(context, true);
    }
}
