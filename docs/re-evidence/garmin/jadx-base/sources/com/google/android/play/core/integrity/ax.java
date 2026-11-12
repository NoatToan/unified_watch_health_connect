package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes14.dex */
final class ax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static aw f53319a;

    public static synchronized aw a(Context context) {
        try {
            if (f53319a == null) {
                u uVar = new u(null);
                uVar.a(com.google.android.play.integrity.internal.ag.a(context));
                f53319a = uVar.b();
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return f53319a;
    }
}
