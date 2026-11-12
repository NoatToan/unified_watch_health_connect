package z10;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0012B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000f¨\u0006\u0013"}, d2 = {"Lz10/f0;", "", "Lq92/x;", "consentTypeId", "", "revokeNavigateToMyDay", "Lhl/a;", "screenAccessRole", "isChildCreationConsent", "<init>", "(Lq92/x;ZLhl/a;Z)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILq92/x;ZLhl/a;ZLm63/u1;)V", "Companion", "a", "b", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class f0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f200981e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q92.x f200982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f200983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hl.a f200984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f200985d;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/consent/ConsentActivity.Navigation.Extras.$serializer", "Lm63/e0;", "Lz10/f0;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements m63.e0<f0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f200986a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f200986a = aVar;
            m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.consent.ConsentActivity.Navigation.Extras", aVar, 4);
            m1Var.j("consentTypeId", false);
            m1Var.j("revokeNavigateToMyDay", false);
            m1Var.j("screenAccessRole", true);
            m1Var.j("isChildCreationConsent", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = f0.f200981e;
            m63.g gVar = m63.g.f116948a;
            return new i63.c[]{lVarArr[0].getValue(), gVar, lVarArr[2].getValue(), gVar};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = f0.f200981e;
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            boolean zG = false;
            boolean zG2 = false;
            q92.x xVar = null;
            hl.a aVar = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    xVar = (q92.x) cVarC.l(eVar2, 0, lVarArr[0].getValue(), xVar);
                    i15 |= 1;
                } else if (iE == 1) {
                    zG = cVarC.g(eVar2, 1);
                    i15 |= 2;
                } else if (iE == 2) {
                    aVar = (hl.a) cVarC.l(eVar2, 2, lVarArr[2].getValue(), aVar);
                    i15 |= 4;
                } else {
                    if (iE != 3) {
                        hb.a.o(iE);
                        return null;
                    }
                    zG2 = cVarC.g(eVar2, 3);
                    i15 |= 8;
                }
            }
            cVarC.b(eVar2);
            return new f0(i15, xVar, zG, aVar, zG2, (m63.u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            f0 f0Var = (f0) obj;
            f0Var.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = f0.f200981e;
            i63.c<Object> value = lVarArr[0].getValue();
            q92.x xVar = f0Var.f200982a;
            boolean z14 = f0Var.f200985d;
            hl.a aVar = f0Var.f200984c;
            dVarC.e(eVar, 0, value, xVar);
            dVarC.n(eVar, 1, f0Var.f200983b);
            if (dVarC.C(eVar) || !p005kotlin.jvm.internal.s.g(aVar, hl.a.c.f84256b)) {
                dVarC.e(eVar, 2, lVarArr[2].getValue(), aVar);
            }
            if (dVarC.C(eVar) || z14) {
                dVarC.n(eVar, 3, z14);
            }
            dVarC.b(eVar);
        }
    }

    static {
        hl.a.Companion companion = hl.a.INSTANCE;
        o13.n nVar = o13.n.PUBLICATION;
        f200981e = new o13.l[]{o13.m.a(nVar, new yx2.b(18)), null, o13.m.a(nVar, new yx2.b(19)), null};
    }

    public /* synthetic */ f0(int i14, q92.x xVar, boolean z14, hl.a aVar, boolean z15, m63.u1 u1Var) {
        if (3 != (i14 & 3)) {
            m63.k1.h(i14, 3, a.f200986a.getF158591b());
            throw null;
        }
        this.f200982a = xVar;
        this.f200983b = z14;
        if ((i14 & 4) == 0) {
            this.f200984c = hl.a.c.f84256b;
        } else {
            this.f200984c = aVar;
        }
        if ((i14 & 8) == 0) {
            this.f200985d = false;
        } else {
            this.f200985d = z15;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f200982a == f0Var.f200982a && this.f200983b == f0Var.f200983b && p005kotlin.jvm.internal.s.g(this.f200984c, f0Var.f200984c) && this.f200985d == f0Var.f200985d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f200985d) + ((this.f200984c.hashCode() + q6.f.g(this.f200982a.hashCode() * 31, 31, this.f200983b)) * 31);
    }

    public final String toString() {
        return "Extras(consentTypeId=" + this.f200982a + ", revokeNavigateToMyDay=" + this.f200983b + ", screenAccessRole=" + this.f200984c + ", isChildCreationConsent=" + this.f200985d + ")";
    }

    /* JADX INFO: renamed from: z10.f0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lz10/f0$b;", "", "<init>", "()V", "Li63/c;", "Lz10/f0;", "serializer", "()Li63/c;", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<f0> serializer() {
            return a.f200986a;
        }

        private Companion() {
        }
    }

    public f0(q92.x xVar, boolean z14, hl.a aVar, boolean z15) {
        xVar.getClass();
        aVar.getClass();
        this.f200982a = xVar;
        this.f200983b = z14;
        this.f200984c = aVar;
        this.f200985d = z15;
    }

    public /* synthetic */ f0(q92.x xVar, boolean z14, hl.a aVar, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this(xVar, z14, (i14 & 4) != 0 ? hl.a.c.f84256b : aVar, (i14 & 8) != 0 ? false : z15);
    }
}
