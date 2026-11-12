package zn2;

import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lzn2/q3;", "", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o13.t f205779a = o13.m.b(new zd0.r0(19));

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(long j8, int i14, v13.c cVar) throws Throwable {
        r3 r3Var;
        if (cVar instanceof r3) {
            r3Var = (r3) cVar;
            int i15 = r3Var.f205801e;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                r3Var.f205801e = i15 - Integer.MIN_VALUE;
            } else {
                r3Var = new r3(this, cVar);
            }
        } else {
            r3Var = new r3(this, cVar);
        }
        Object objB = r3Var.f205799c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = r3Var.f205801e;
        o13.t tVar = this.f205779a;
        try {
            if (i16 == 0) {
                o13.r.b(objB);
                r3Var.f205797a = j8;
                r3Var.f205798b = i14;
                r3Var.f205801e = 1;
                objB = b(j8, r3Var);
                if (objB == aVar) {
                    return aVar;
                }
            } else {
                if (i16 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i14 = r3Var.f205798b;
                j8 = r3Var.f205797a;
                o13.r.b(objB);
            }
            int iIntValue = ((Number) objB).intValue();
            ((Logger) tVar.getValue()).debug("checkAvailableSpace device:" + j8 + " estimatedSpace:" + i14 + " availableSpace:" + iIntValue);
            return iIntValue - i14 >= 0 ? a.C3843a.f205780a : a.c.f205782a;
        } catch (Exception e4) {
            ((Logger) tVar.getValue()).error("checkAvailableSpace - exception : " + e4);
            return a.b.f205781a;
        }
    }

    public final Object b(long j8, r3 r3Var) throws Throwable {
        o53.k kVar = new o53.k(u13.f.b(r3Var), 1);
        kVar.q();
        ((Logger) this.f205779a.getValue()).debug("getAvailableSpace");
        ps2.w.f140538a.getClass();
        ps2.n nVarI = ps2.w.i(j8);
        if (nVarI == null) {
            vb.h.z("device wallet is now available");
            return null;
        }
        nVarI.f140499b.z(new s3(kVar));
        Object objP = kVar.p();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objP;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lzn2/q3$a;", "", "<init>", "()V", "a", "c", "b", "Lzn2/q3$a$a;", "Lzn2/q3$a$b;", "Lzn2/q3$a$c;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: zn2.q3$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzn2/q3$a$a;", "Lzn2/q3$a;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C3843a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C3843a f205780a = new C3843a();

            private C3843a() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzn2/q3$a$b;", "Lzn2/q3$a;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f205781a = new b();

            private b() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzn2/q3$a$c;", "Lzn2/q3$a;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f205782a = new c();

            private c() {
                super(null);
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
