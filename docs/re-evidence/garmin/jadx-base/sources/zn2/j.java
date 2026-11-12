package zn2;

import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzn2/j;", "Lms2/h;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j implements ms2.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f205593a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final is2.b f205594b = is2.b.FITPAY;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f205595c = p13.u0.e(new o13.p(pl2.c.f138556c, p13.u.m0(new zi2.a[]{zi2.a.PROD, zi2.a.TEST, zi2.a.TEST_SSO_CHINA, zi2.a.AQUA})), new o13.p(pl2.c.f138569p, p13.u.m0(new zi2.a[]{zi2.a.CHINA, zi2.a.JADE})));

    private j() {
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    public static boolean e(Set set) {
        Set set2;
        set.getClass();
        kj0.b.f104940a.getClass();
        zi2.a aVarA = kj0.b.a();
        pl2.c cVar = pl2.c.f138556c;
        return set.contains(cVar) && (set2 = (Set) f205595c.get(cVar)) != null && set2.contains(aVarA);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    public static boolean f(Set set) {
        Set set2;
        set.getClass();
        kj0.b.f104940a.getClass();
        zi2.a aVarA = kj0.b.a();
        pl2.c cVar = pl2.c.f138569p;
        return set.contains(cVar) && (set2 = (Set) f205595c.get(cVar)) != null && set2.contains(aVarA);
    }

    @Override // ms2.h
    public final is2.b a() {
        return f205594b;
    }

    @Override // ms2.h
    public final boolean b(Set<? extends pl2.c> set) {
        set.getClass();
        return f(set) || e(set);
    }

    @Override // ms2.h
    public final ms2.c c(Set set) {
        return new q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ms2.h
    public final ms2.g d(Set<? extends pl2.c> set) {
        set.getClass();
        return new z0(null, 1, 0 == true ? 1 : 0);
    }
}
