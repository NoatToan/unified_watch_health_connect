package j90;

import i3.e5;
import m63.e0;
import m63.k1;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u0011B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB=\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000e¨\u0006\u0012"}, d2 = {"Lj90/n;", "", "", "sportType", "sportSubType", "", "sportName", "", "enabled", "<init>", "(IILjava/lang/String;Z)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IIILjava/lang/String;ZLm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class n {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f97840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f97841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f97842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f97843d;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/domain/customization/model/SportProfileType.$serializer", "Lm63/e0;", "Lj90/n;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<n> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f97844a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f97844a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.device.setup.domain.customization.model.SportProfileType", aVar, 4);
            m1Var.j("sportType", false);
            m1Var.j("sportSubType", false);
            m1Var.j("sportName", false);
            m1Var.j("enabled", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            m0 m0Var = m0.f116981a;
            return new i63.c[]{m0Var, m0Var, y1.f117048a, m63.g.f116948a};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            int iA = 0;
            int iA2 = 0;
            boolean zG = false;
            String strR = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    iA = cVarC.A(eVar2, 0);
                    i15 |= 1;
                } else if (iE == 1) {
                    iA2 = cVarC.A(eVar2, 1);
                    i15 |= 2;
                } else if (iE == 2) {
                    strR = cVarC.r(eVar2, 2);
                    i15 |= 4;
                } else {
                    if (iE != 3) {
                        hb.a.o(iE);
                        return null;
                    }
                    zG = cVarC.g(eVar2, 3);
                    i15 |= 8;
                }
            }
            cVarC.b(eVar2);
            return new n(i15, iA, iA2, strR, zG, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            n nVar = (n) obj;
            nVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            dVarC.v(0, nVar.f97840a, eVar);
            dVarC.v(1, nVar.f97841b, eVar);
            dVarC.k(eVar, 2, nVar.f97842c);
            dVarC.n(eVar, 3, nVar.f97843d);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ n(int i14, int i15, int i16, String str, boolean z14, u1 u1Var) {
        if (15 != (i14 & 15)) {
            k1.h(i14, 15, a.f97844a.getF158591b());
            throw null;
        }
        this.f97840a = i15;
        this.f97841b = i16;
        this.f97842c = str;
        this.f97843d = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f97840a == nVar.f97840a && this.f97841b == nVar.f97841b && s.g(this.f97842c, nVar.f97842c) && this.f97843d == nVar.f97843d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f97843d) + wr.g.j(q2.d(this.f97841b, Integer.hashCode(this.f97840a) * 31, 31), 31, this.f97842c);
    }

    public final String toString() {
        return am.j.n(this.f97842c, ", enabled=", ")", e5.j(this.f97840a, this.f97841b, "SportProfileType(sportType=", ", sportSubType=", ", sportName="), this.f97843d);
    }

    /* JADX INFO: renamed from: j90.n$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lj90/n$b;", "", "<init>", "()V", "Li63/c;", "Lj90/n;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<n> serializer() {
            return a.f97844a;
        }

        private Companion() {
        }
    }

    public n(int i14, int i15, String str, boolean z14) {
        str.getClass();
        this.f97840a = i14;
        this.f97841b = i15;
        this.f97842c = str;
        this.f97843d = z14;
    }
}
