package com.huawei.openalliance.ad;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.huawei.openalliance.ad.db.bean.ContentRecord;

/* JADX INFO: loaded from: classes12.dex */
public abstract class sf {
    private static final String[] e = {"com.huawei.openalliance.ad.views.reward", "com.huawei.openalliance.ad.activity", "com.huawei.openalliance.ad.utils", "com.huawei.openalliance.ad.views", "com.huawei.openalliance.ad.views.dsa", "java.lang.reflect", "com.android.internal.os", "android.app", "android.os", "android.view", "com.android.internal.policy", "dalvik.system", "java.lang", "com.huawei.hms.ads.uiengine.views.template", "com.huawei.hms.ads", "com.android.tools.profiler.support.event", "huawei.android.widget", "android.widget", "androidx.recyclerview.widget", "android.app.servertransaction", "com.huawei.hms.ads.uiengine.remote"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f20251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ContentRecord f20252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected br f20253c;
    protected sf d;

    public abstract boolean a();

    public void a(sf sfVar) {
        this.d = sfVar;
    }

    public static boolean a(StackTraceElement stackTraceElement) {
        if (stackTraceElement == null || TextUtils.isEmpty(stackTraceElement.toString()) || TextUtils.isEmpty(stackTraceElement.getClassName())) {
            return true;
        }
        String strH = com.huawei.openalliance.ad.utils.dg.h(stackTraceElement.getFileName(), stackTraceElement.getClassName());
        if (TextUtils.isEmpty(strH)) {
            return false;
        }
        int i = 0;
        while (true) {
            String[] strArr = e;
            if (i >= strArr.length) {
                return false;
            }
            if (strH.equals(strArr[i])) {
                return true;
            }
            i++;
        }
    }

    public static boolean a(View view) {
        if (view != null) {
            return !(view.getContext() instanceof Activity) || com.huawei.openalliance.ad.utils.dk.c((Activity) view.getContext());
        }
        return false;
    }

    public sf(Context context, ContentRecord contentRecord) {
        this.f20251a = context;
        this.f20252b = contentRecord;
        this.f20253c = new br(context);
    }

    public sf() {
    }
}
