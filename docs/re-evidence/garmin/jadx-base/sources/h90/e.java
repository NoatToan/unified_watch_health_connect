package h90;

import am.j;
import i63.h;
import m63.e0;
import m63.k1;
import m63.m0;
import m63.m1;
import m63.u1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\n¨\u0006\u000e"}, d2 = {"Lh90/e;", "", "", "landscapeImage", "portraitImage", "<init>", "(II)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IIILm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class e {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f82525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f82526b;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/domain/customization/DeviceScreenOrientationResources.$serializer", "Lm63/e0;", "Lh90/e;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f82527a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f82527a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.device.setup.domain.customization.DeviceScreenOrientationResources", aVar, 2);
            m1Var.j("landscapeImage", false);
            m1Var.j("portraitImage", false);
            descriptor = m1Var;
        }

        private a() {
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
                    return new e(i15, iA, iA2, u1Var);
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
        public final void serialize(l63.f fVar, Object obj) {
            e eVar = (e) obj;
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.d dVarC = fVar.c(eVar2);
            dVarC.v(0, eVar.f82525a, eVar2);
            dVarC.v(1, eVar.f82526b, eVar2);
            dVarC.b(eVar2);
        }
    }

    public /* synthetic */ e(int i14, int i15, int i16, u1 u1Var) {
        if (3 != (i14 & 3)) {
            k1.h(i14, 3, a.f82527a.getF158591b());
            throw null;
        }
        this.f82525a = i15;
        this.f82526b = i16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f82525a == eVar.f82525a && this.f82526b == eVar.f82526b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f82526b) + (Integer.hashCode(this.f82525a) * 31);
    }

    public final String toString() {
        return j.g(this.f82525a, this.f82526b, "DeviceScreenOrientationResources(landscapeImage=", ", portraitImage=", ")");
    }

    /* JADX INFO: renamed from: h90.e$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lh90/e$b;", "", "<init>", "()V", "Li63/c;", "Lh90/e;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<e> serializer() {
            return a.f82527a;
        }

        private Companion() {
        }
    }

    public e(int i14, int i15) {
        this.f82525a = i14;
        this.f82526b = i15;
    }
}
