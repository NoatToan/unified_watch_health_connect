package c42;

import m63.k1;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.y1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lc42/n;", "", "<init>", "()V", "c", "b", "d", "a", "Lc42/n$a;", "Lc42/n$b;", "Lc42/n$c;", "Lc42/n$d;", "gcm-vo2_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class n {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lc42/n$b;", "Lc42/n;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-vo2_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class b extends n {
        public static final b INSTANCE = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f24419a = o13.m.a(o13.n.PUBLICATION, new bv0.b(22));

        private b() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1072183710;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<b> serializer() {
            return (i63.c) f24419a.getValue();
        }

        public final String toString() {
            return "InitialStateCheck";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lc42/n$d;", "Lc42/n;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-vo2_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class d extends n {
        public static final d INSTANCE = new d();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f24422a = o13.m.a(o13.n.PUBLICATION, new bv0.b(23));

        private d() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1629672715;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<d> serializer() {
            return (i63.c) f24422a.getValue();
        }

        public final String toString() {
            return "SelectDevice";
        }
    }

    public /* synthetic */ n(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Lc42/n$a;", "Lc42/n;", "", "deviceId", "", "deviceName", "<init>", "(JLjava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IJLjava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-vo2_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class a extends n {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f24416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f24417b;

        /* JADX INFO: renamed from: c42.n$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/vo2/reports/presentation/onboarding/VO2MaxOnboardingNavigation.Genesis.$serializer", "Lm63/e0;", "Lc42/n$a;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-vo2_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class C0351a implements m63.e0<a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0351a f24418a;
            private static final k63.e descriptor;

            static {
                C0351a c0351a = new C0351a();
                f24418a = c0351a;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.vo2.reports.presentation.onboarding.VO2MaxOnboardingNavigation.Genesis", c0351a, 2);
                m1Var.j("deviceId", false);
                m1Var.j("deviceName", false);
                descriptor = m1Var;
            }

            private C0351a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{v0.f117027a, j63.a.d(y1.f117048a)};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                int i15 = 0;
                long jW = 0;
                String str = null;
                boolean z14 = true;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        jW = cVarC.w(eVar2, 0);
                        i15 |= 1;
                    } else {
                        if (iE != 1) {
                            hb.a.o(iE);
                            return null;
                        }
                        str = (String) cVarC.v(eVar2, 1, y1.f117048a, str);
                        i15 |= 2;
                    }
                }
                cVarC.b(eVar2);
                return new a(i15, jW, str, null);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                a aVar = (a) obj;
                aVar.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                dVarC.z(eVar, 0, aVar.f24416a);
                dVarC.d(eVar, 1, y1.f117048a, aVar.f24417b);
                dVarC.b(eVar);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ a(int i14, long j8, String str, u1 u1Var) {
            p005kotlin.jvm.internal.j jVar = null;
            if (3 != (i14 & 3)) {
                k1.h(i14, 3, C0351a.f24418a.getF158591b());
                throw null;
            }
            super(jVar);
            this.f24416a = j8;
            this.f24417b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f24416a == aVar.f24416a && p005kotlin.jvm.internal.s.g(this.f24417b, aVar.f24417b);
        }

        public final int hashCode() {
            int iHashCode = Long.hashCode(this.f24416a) * 31;
            String str = this.f24417b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f24416a, "Genesis(deviceId=", ", deviceName=", this.f24417b);
            sbK.append(")");
            return sbK.toString();
        }

        /* JADX INFO: renamed from: c42.n$a$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lc42/n$a$b;", "", "<init>", "()V", "Li63/c;", "Lc42/n$a;", "serializer", "()Li63/c;", "gcm-vo2_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<a> serializer() {
                return C0351a.f24418a;
            }

            private Companion() {
            }
        }

        public a(long j8, String str) {
            super(null);
            this.f24416a = j8;
            this.f24417b = str;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lc42/n$c;", "Lc42/n;", "Lc42/b;", "extraData", "<init>", "(Lc42/b;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILc42/b;Lm63/u1;)V", "Companion", "a", "b", "gcm-vo2_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class c extends n {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c42.b f24420a;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/vo2/reports/presentation/onboarding/VO2MaxOnboardingNavigation.OnboardingFlow.$serializer", "Lm63/e0;", "Lc42/n$c;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-vo2_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f24421a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f24421a = aVar;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.vo2.reports.presentation.onboarding.VO2MaxOnboardingNavigation.OnboardingFlow", aVar, 1);
                m1Var.j("extraData", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{c42.b.a.f24353a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                u1 u1Var = null;
                boolean z14 = true;
                int i15 = 0;
                c42.b bVar = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else {
                        if (iE != 0) {
                            hb.a.o(iE);
                            return null;
                        }
                        bVar = (c42.b) cVarC.l(eVar2, 0, c42.b.a.f24353a, bVar);
                        i15 = 1;
                    }
                }
                cVarC.b(eVar2);
                return new c(i15, bVar, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                c cVar = (c) obj;
                cVar.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                dVarC.e(eVar, 0, c42.b.a.f24353a, cVar.f24420a);
                dVarC.b(eVar);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ c(int i14, c42.b bVar, u1 u1Var) {
            p005kotlin.jvm.internal.j jVar = null;
            if (1 != (i14 & 1)) {
                k1.h(i14, 1, a.f24421a.getF158591b());
                throw null;
            }
            super(jVar);
            this.f24420a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p005kotlin.jvm.internal.s.g(this.f24420a, ((c) obj).f24420a);
        }

        public final int hashCode() {
            return this.f24420a.hashCode();
        }

        public final String toString() {
            return "OnboardingFlow(extraData=" + this.f24420a + ")";
        }

        /* JADX INFO: renamed from: c42.n$c$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lc42/n$c$b;", "", "<init>", "()V", "Li63/c;", "Lc42/n$c;", "serializer", "()Li63/c;", "gcm-vo2_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<c> serializer() {
                return a.f24421a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(c42.b bVar) {
            super(null);
            bVar.getClass();
            this.f24420a = bVar;
        }
    }

    private n() {
    }
}
