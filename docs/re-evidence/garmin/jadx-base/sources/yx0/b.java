package yx0;

import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;
import o13.m;
import o13.t;
import o53.b0;
import o53.c2;
import o53.s0;
import p005kotlin.Metadata;
import t13.g;
import ya0.j;
import yq.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyx0/b;", "Lo53/b0;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static c2 f200018c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f200016a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ReentrantLock f200017b = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f200019d = m.b(new j(29));

    private b() {
    }

    public static final void a(Context context) {
        context.getClass();
        d dVar = new d(8);
        ReentrantLock reentrantLock = f200017b;
        reentrantLock.lock();
        try {
            c2 c2Var = f200018c;
            if (c2Var == null || !c2Var.isActive()) {
                f200018c = ge1.b.T(f200016a, null, null, new a(context, dVar, null), 3);
            }
            f200018c.getClass();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final g getF195311f() {
        return s0.f129406a;
    }
}
