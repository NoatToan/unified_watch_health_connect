package mc0;

import am.j;
import i63.c;
import i63.h;
import l63.d;
import l63.f;
import m63.e0;
import m63.k1;
import m63.m0;
import m63.m1;
import m63.u1;
import o13.e;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\n¨\u0006\u000e"}, d2 = {"Lmc0/b;", "", "", "productNumber", "minFirmwareVersion", "<init>", "(II)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IIILm63/u1;)V", "Companion", "a", "b", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f117769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f117770b;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/devices/domain/model/ViableFirmwareVersion.$serializer", "Lm63/e0;", "Lmc0/b;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @e
    public static final /* synthetic */ class a implements e0<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f117771a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f117771a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.devices.domain.model.ViableFirmwareVersion", aVar, 2);
            m1Var.j("productNumber", false);
            m1Var.j("minFirmwareVersion", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final c<?>[] childSerializers() {
            m0 m0Var = m0.f116981a;
            return new c[]{m0Var, m0Var};
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
                    return new b(i15, iA, iA2, u1Var);
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
            b bVar = (b) obj;
            bVar.getClass();
            k63.e eVar = descriptor;
            d dVarC = fVar.c(eVar);
            dVarC.v(0, bVar.f117769a, eVar);
            dVarC.v(1, bVar.f117770b, eVar);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ b(int i14, int i15, int i16, u1 u1Var) {
        if (3 != (i14 & 3)) {
            k1.h(i14, 3, a.f117771a.getF158591b());
            throw null;
        }
        this.f117769a = i15;
        this.f117770b = i16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f117769a == bVar.f117769a && this.f117770b == bVar.f117770b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f117770b) + (Integer.hashCode(this.f117769a) * 31);
    }

    public final String toString() {
        return j.g(this.f117769a, this.f117770b, "ViableFirmwareVersion(productNumber=", ", minFirmwareVersion=", ")");
    }

    /* JADX INFO: renamed from: mc0.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmc0/b$b;", "", "<init>", "()V", "Li63/c;", "Lmc0/b;", "serializer", "()Li63/c;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final c<b> serializer() {
            return a.f117771a;
        }

        private Companion() {
        }
    }

    public b(int i14, int i15) {
        this.f117769a = i14;
        this.f117770b = i15;
    }
}
