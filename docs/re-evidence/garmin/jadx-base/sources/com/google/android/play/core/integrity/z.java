package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes14.dex */
final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static s f53401a;

    public static synchronized s a(Context context) {
        try {
            if (f53401a == null) {
                q qVar = new q(null);
                qVar.a(com.google.android.play.integrity.internal.ag.a(context));
                f53401a = qVar.b();
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return f53401a;
    }
}
