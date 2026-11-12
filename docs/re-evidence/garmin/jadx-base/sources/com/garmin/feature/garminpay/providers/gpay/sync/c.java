package com.garmin.feature.garminpay.providers.gpay.sync;

import java.util.concurrent.atomic.AtomicReference;
import o13.q;
import o53.j;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/sync/c;", "Lul2/d;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends ul2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f51361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewDeviceSyncQueue f51362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j<Unit> f51363c;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51364a;

        static {
            int[] iArr = new int[tl2.c.b.values().length];
            try {
                iArr[tl2.c.b.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f51364a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(m0 m0Var, NewDeviceSyncQueue newDeviceSyncQueue, j<? super Unit> jVar) {
        this.f51361a = m0Var;
        this.f51362b = newDeviceSyncQueue;
        this.f51363c = jVar;
    }

    @Override // tl2.f
    public final void b(tl2.c.b bVar) {
        bVar.getClass();
        String strN = fb1.c.n("transfer finished -> ", bVar.name());
        NewDeviceSyncQueue newDeviceSyncQueue = this.f51362b;
        newDeviceSyncQueue.f51334h.set(null);
        if (!this.f51361a.f105804a) {
            int i14 = q.f128596b;
            this.f51363c.resumeWith(new q.b(new NewDeviceSyncQueue.ApduPackageException("failed to start apdu transfer " + bVar, xo2.d.b.UNABLE_TO_OPEN_APDU_TRANSFER)));
        }
        if (a.f51364a[bVar.ordinal()] == 1) {
            newDeviceSyncQueue.f51331e.debug(strN);
        } else {
            newDeviceSyncQueue.f51331e.error(strN);
        }
    }

    @Override // ul2.d
    public final void c(ul2.c cVar) {
        j<Unit> jVar;
        this.f51361a.f105804a = true;
        AtomicReference<ul2.c> atomicReference = this.f51362b.f51334h;
        do {
            boolean zCompareAndSet = atomicReference.compareAndSet(null, cVar);
            jVar = this.f51363c;
            if (zCompareAndSet) {
                int i14 = q.f128596b;
                jVar.resumeWith(Unit.INSTANCE);
                return;
            }
        } while (atomicReference.get() == null);
        int i15 = q.f128596b;
        jVar.resumeWith(new q.b(new NewDeviceSyncQueue.ApduPackageException("failed to start apdu transfer", xo2.d.b.UNABLE_TO_OPEN_APDU_TRANSFER)));
    }
}
