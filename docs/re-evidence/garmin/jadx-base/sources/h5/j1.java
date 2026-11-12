package h5;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class j1 {
    public static final <T extends h4.r.c & i1> void a(T t7, e23.a<Unit> aVar) {
        k1 ownerScope = t7.getOwnerScope();
        if (ownerScope == null) {
            ownerScope = new k1(t7);
            t7.setOwnerScope$ui(ownerScope);
        }
        r1 snapshotObserver = k.h(t7).getSnapshotObserver();
        k1.f81855b.getClass();
        snapshotObserver.f81981a.d(ownerScope, k1.f81856c, aVar);
    }
}
