package tn2;

import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltn2/e0;", "Lms2/h;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e0 implements ms2.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f165549a = new e0();

    private e0() {
    }

    @Override // ms2.h
    public final is2.b a() {
        return is2.b.FELICA;
    }

    @Override // ms2.h
    public final boolean b(Set<? extends pl2.c> set) {
        set.getClass();
        kj0.b.f104940a.getClass();
        zi2.a aVarA = kj0.b.a();
        return aVarA == zi2.a.PROD || aVarA == zi2.a.TEST || aVarA == zi2.a.PINK;
    }

    @Override // ms2.h
    public final ms2.c c(Set<? extends pl2.c> set) {
        return new k();
    }

    @Override // ms2.h
    public final ms2.g d(Set<? extends pl2.c> set) {
        set.getClass();
        return new w0();
    }
}
