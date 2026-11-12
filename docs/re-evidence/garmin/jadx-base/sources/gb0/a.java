package gb0;

import c22.l3;
import com.mapbox.turf.TurfConstants;
import d53.t;
import i63.h;
import java.text.DecimalFormat;
import l63.d;
import l63.f;
import lc.u0;
import m63.d0;
import m63.e0;
import m63.k1;
import m63.m0;
import m63.m1;
import m63.u1;
import o13.e;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \t2\u00020\u0001:\u0003\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\b\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lgb0/a;", "", "<init>", "()V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILm63/u1;)V", "Companion", "c", "b", "a", "Lgb0/a$b;", "Lgb0/a$c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public abstract class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f76636a = m.a(n.PUBLICATION, new g12.m(12));

    public /* synthetic */ a(j jVar) {
        this();
    }

    public final double a() {
        if (this instanceof b) {
            return ((b) this).f76637b;
        }
        if (!(this instanceof c)) {
            u0.r();
            return 0.0d;
        }
        c cVar = (c) this;
        double d14 = (((double) cVar.f76639b) * 12.0d) + ((double) cVar.f76640c);
        l3.f23124b.getClass();
        return new b((float) (((double) ((float) d14)) * 2.54d)).f76637b;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lgb0/a$b;", "Lgb0/a;", "", "heightInCm", "<init>", "(F)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IFLm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @h
    public static final /* data */ class b extends a {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f76637b;

        /* JADX INFO: renamed from: gb0.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/presentation/profile/height/model/HeightData.Metric.$serializer", "Lm63/e0;", "Lgb0/a$b;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @e
        public static final /* synthetic */ class C1542a implements e0<b> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1542a f76638a;
            private static final k63.e descriptor;

            static {
                C1542a c1542a = new C1542a();
                f76638a = c1542a;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.device.setup.presentation.profile.height.model.HeightData.Metric", c1542a, 1);
                m1Var.j("heightInCm", false);
                descriptor = m1Var;
            }

            private C1542a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{d0.f116930a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                float fN = 0.0f;
                boolean z14 = true;
                int i15 = 0;
                while (true) {
                    u1 u1Var = null;
                    if (!z14) {
                        cVarC.b(eVar2);
                        return new b(i15, fN, u1Var);
                    }
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else {
                        if (iE != 0) {
                            hb.a.o(iE);
                            return null;
                        }
                        fN = cVarC.n(eVar2, 0);
                        i15 = 1;
                    }
                }
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(f fVar, Object obj) {
                b bVar = (b) obj;
                bVar.getClass();
                k63.e eVar = descriptor;
                d dVarC = fVar.c(eVar);
                dVarC.x(eVar, 0, bVar.f76637b);
                dVarC.b(eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(int i14, float f14, u1 u1Var) {
            super(i14, u1Var);
            if (1 != (i14 & 1)) {
                k1.h(i14, 1, C1542a.f76638a.getF158591b());
                throw null;
            }
            this.f76637b = f14;
        }

        public final c b() {
            l3.f23124b.getClass();
            DecimalFormat decimalFormat = l3.f23131i;
            int[] iArrK1 = l3.a.K1(this.f76637b);
            int i14 = 0;
            if (iArrK1 == null) {
                return new c(i14, i14, 3, (j) null);
            }
            String str = decimalFormat.format(u.K(0, iArrK1));
            String str2 = decimalFormat.format(u.K(1, iArrK1));
            str.getClass();
            Integer numI = t.i(str);
            int iIntValue = numI != null ? numI.intValue() : 0;
            str2.getClass();
            Integer numI2 = t.i(str2);
            return new c(iIntValue, numI2 != null ? numI2.intValue() : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Float.compare(this.f76637b, ((b) obj).f76637b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f76637b);
        }

        public final String toString() {
            return "Metric(heightInCm=" + this.f76637b + ")";
        }

        /* JADX INFO: renamed from: gb0.a$b$b, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgb0/a$b$b;", "", "<init>", "()V", "Li63/c;", "Lgb0/a$b;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final i63.c<b> serializer() {
                return C1542a.f76638a;
            }

            private Companion() {
            }
        }

        public b(float f14) {
            super(null);
            this.f76637b = f14;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\n¨\u0006\u000e"}, d2 = {"Lgb0/a$c;", "Lgb0/a;", "", TurfConstants.UNIT_FEET, TurfConstants.UNIT_INCHES, "<init>", "(II)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IIILm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @h
    public static final /* data */ class c extends a {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f76639b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f76640c;

        /* JADX INFO: renamed from: gb0.a$c$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/presentation/profile/height/model/HeightData.Statute.$serializer", "Lm63/e0;", "Lgb0/a$c;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @e
        public static final /* synthetic */ class C1544a implements e0<c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1544a f76641a;
            private static final k63.e descriptor;

            static {
                C1544a c1544a = new C1544a();
                f76641a = c1544a;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.device.setup.presentation.profile.height.model.HeightData.Statute", c1544a, 2);
                m1Var.j(TurfConstants.UNIT_FEET, true);
                m1Var.j(TurfConstants.UNIT_INCHES, true);
                descriptor = m1Var;
            }

            private C1544a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                m0 m0Var = m0.f116981a;
                return new i63.c[]{m0Var, m0Var};
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
                while (true) {
                    u1 u1Var = null;
                    if (!z14) {
                        cVarC.b(eVar2);
                        return new c(i15, iA, iA2, u1Var);
                    }
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        iA = cVarC.A(eVar2, 0);
                        i15 |= 1;
                    } else {
                        if (iE != 1) {
                            hb.a.o(iE);
                            return null;
                        }
                        iA2 = cVarC.A(eVar2, 1);
                        i15 |= 2;
                    }
                }
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(f fVar, Object obj) {
                c cVar = (c) obj;
                cVar.getClass();
                int i14 = cVar.f76640c;
                int i15 = cVar.f76639b;
                k63.e eVar = descriptor;
                d dVarC = fVar.c(eVar);
                if (dVarC.C(eVar) || i15 != 0) {
                    dVarC.v(0, i15, eVar);
                }
                if (dVarC.C(eVar) || i14 != 0) {
                    dVarC.v(1, i14, eVar);
                }
                dVarC.b(eVar);
            }
        }

        public /* synthetic */ c(int i14, int i15, int i16, u1 u1Var) {
            super(i14, u1Var);
            if ((i14 & 1) == 0) {
                this.f76639b = 0;
            } else {
                this.f76639b = i15;
            }
            if ((i14 & 2) == 0) {
                this.f76640c = 0;
            } else {
                this.f76640c = i16;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f76639b == cVar.f76639b && this.f76640c == cVar.f76640c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f76640c) + (Integer.hashCode(this.f76639b) * 31);
        }

        public final String toString() {
            return am.j.g(this.f76639b, this.f76640c, "Statute(feet=", ", inches=", ")");
        }

        /* JADX INFO: renamed from: gb0.a$c$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgb0/a$c$b;", "", "<init>", "()V", "Li63/c;", "Lgb0/a$c;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final i63.c<c> serializer() {
                return C1544a.f76641a;
            }

            private Companion() {
            }
        }

        public c(int i14, int i15) {
            super(null);
            this.f76639b = i14;
            this.f76640c = i15;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public c() {
            int i14 = 0;
            this(i14, i14, 3, (j) null);
        }

        public /* synthetic */ c(int i14, int i15, int i16, j jVar) {
            this((i16 & 1) != 0 ? 0 : i14, (i16 & 2) != 0 ? 0 : i15);
        }
    }

    /* JADX INFO: renamed from: gb0.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgb0/a$a;", "", "<init>", "()V", "Li63/c;", "Lgb0/a;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<a> serializer() {
            return (i63.c) a.f76636a.getValue();
        }

        private Companion() {
        }
    }

    private a() {
    }

    public /* synthetic */ a(int i14, u1 u1Var) {
    }
}
