package com.mapbox.common;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0011\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0004H\u0086\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/mapbox/common/MapboxSDKCommon;", "", "()V", "appContext", "Landroid/content/Context;", "getContext", "invoke", CoreConstants.CONTEXT_SCOPE_VALUE, "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MapboxSDKCommon {
    public static final MapboxSDKCommon INSTANCE = new MapboxSDKCommon();
    private static Context appContext;

    private MapboxSDKCommon() {
    }

    public final Context getContext() {
        Context context = appContext;
        if (context != null) {
            return context;
        }
        s.m("appContext");
        throw null;
    }

    public final MapboxSDKCommon invoke(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        appContext = applicationContext;
        return this;
    }
}
