package c63;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc63/q0;", "", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q0 f25045a = new q0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e63.b0<c1> f25046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e63.b0<c1> f25047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e63.b0<c1> f25048d;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"c63/q0$c", "Le63/m;", "Lc63/c1;", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements e63.m<c1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e63.w<c1, Boolean> f25051a = new e63.w<>(new p005kotlin.jvm.internal.b0() { // from class: c63.q0.c.a
            @Override // p005kotlin.jvm.internal.b0, k23.n
            public final Object get(Object obj) {
                return ((c1) obj).p();
            }

            @Override // p005kotlin.jvm.internal.b0, k23.j
            public final void p(Object obj, Object obj2) {
                ((c1) obj).z((Boolean) obj2);
            }
        }, null, 2, null);

        @Override // e63.m
        /* JADX INFO: renamed from: a, reason: from getter */
        public final e63.w getF25051a() {
            return this.f25051a;
        }

        @Override // e63.m
        public final boolean b(c1 c1Var) {
            c1 c1Var2 = c1Var;
            c1Var2.getClass();
            Integer numT = c1Var2.t();
            if ((numT != null ? numT.intValue() : 0) == 0) {
                Integer numA = c1Var2.A();
                if ((numA != null ? numA.intValue() : 0) == 0) {
                    Integer numG = c1Var2.g();
                    if ((numG != null ? numG.intValue() : 0) == 0) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    static {
        c cVar = new c();
        f25046b = new e63.b0<>(new e63.w(new p005kotlin.jvm.internal.b0() { // from class: c63.q0.d
            @Override // p005kotlin.jvm.internal.b0, k23.n
            public final Object get(Object obj) {
                return ((c1) obj).t();
            }

            @Override // p005kotlin.jvm.internal.b0, k23.j
            public final void p(Object obj, Object obj2) {
                ((c1) obj).h((Integer) obj2);
            }
        }, null, 2, null), 0, 18, null, 0, cVar, 8, null);
        f25047c = new e63.b0<>(new e63.w(new p005kotlin.jvm.internal.b0() { // from class: c63.q0.a
            @Override // p005kotlin.jvm.internal.b0, k23.n
            public final Object get(Object obj) {
                return ((c1) obj).A();
            }

            @Override // p005kotlin.jvm.internal.b0, k23.j
            public final void p(Object obj, Object obj2) {
                ((c1) obj).q((Integer) obj2);
            }
        }, null, 2, null), 0, 59, null, 0, cVar, 8, null);
        f25048d = new e63.b0<>(new e63.w(new p005kotlin.jvm.internal.b0() { // from class: c63.q0.b
            @Override // p005kotlin.jvm.internal.b0, k23.n
            public final Object get(Object obj) {
                return ((c1) obj).g();
            }

            @Override // p005kotlin.jvm.internal.b0, k23.j
            public final void p(Object obj, Object obj2) {
                ((c1) obj).d((Integer) obj2);
            }
        }, null, 2, null), 0, 59, null, 0, cVar, 8, null);
    }

    private q0() {
    }
}
