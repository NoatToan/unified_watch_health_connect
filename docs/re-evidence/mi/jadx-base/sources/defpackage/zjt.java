package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class zjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f41391a = new AtomicReference(null);

    public static void a(wjt wjtVar) {
        AtomicReference atomicReference = f41391a;
        while (!d8i.a(atomicReference, null, wjtVar) && atomicReference.get() == null) {
        }
    }
}
