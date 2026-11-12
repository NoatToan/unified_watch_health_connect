package androidx.camera.core.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public interface j0 extends m0 {

    public interface a {
        @SuppressLint({"LambdaLast"})
        v.m a(Context context, g gVar, b0.t tVar, long j8, b0.y yVar, androidx.camera.core.internal.b bVar);
    }

    androidx.camera.camera2.internal.compat.q a();

    v.s c(String str);

    v.k0 d();

    LinkedHashSet e();

    z.a f();

    default void shutdown() {
    }
}
