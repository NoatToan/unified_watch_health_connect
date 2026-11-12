package com.huawei.openalliance.ad.utils;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public abstract class de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<String> f20638a = new ArrayList();

    public static boolean a(String str) {
        List<String> list = f20638a;
        if (list.isEmpty() || TextUtils.isEmpty(str)) {
            return false;
        }
        return list.contains(str);
    }

    public static void a(Context context) {
        List<String> list = f20638a;
        list.clear();
        list.add(dd.f(context));
        list.add(dd.d(context));
        list.add(dd.g(context));
        list.add(dd.e(context));
    }
}
