package fi1;

import i63.h;
import l63.f;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.x;
import o13.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Lfi1/b;", "", "", "latitude", "longitude", "", "timestamp", "<init>", "(DDJ)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IDDJLm63/u1;)V", "Companion", "a", "b", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f71766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f71767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f71768c;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/settings/findmydevice/data/model/DeviceLocation.$serializer", "Lm63/e0;", "Lfi1/b;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @e
    public static final /* synthetic */ class a implements e0<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f71769a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f71769a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.settings.findmydevice.data.model.DeviceLocation", aVar, 3);
            m1Var.j("latitude", false);
            m1Var.j("longitude", false);
            m1Var.j("timestamp", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            x xVar = x.f117036a;
            return new i63.c[]{xVar, xVar, v0.f117027a};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            int i15 = 0;
            double dT = 0.0d;
            double dT2 = 0.0d;
            long jW = 0;
            boolean z14 = true;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    dT = cVarC.t(eVar2, 0);
                    i15 |= 1;
                } else if (iE == 1) {
                    dT2 = cVarC.t(eVar2, 1);
                    i15 |= 2;
                } else {
                    if (iE != 2) {
                        hb.a.o(iE);
                        return null;
                    }
                    jW = cVarC.w(eVar2, 2);
                    i15 |= 4;
                }
            }
            cVarC.b(eVar2);
            return new b(i15, dT, dT2, jW, null);
        }

        @Override // i63.i, i63.b
        public final k63.e getDescriptor() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(f fVar, Object obj) {
            b bVar = (b) obj;
            bVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            dVarC.B(eVar, 0, bVar.f71766a);
            dVarC.B(eVar, 1, bVar.f71767b);
            dVarC.z(eVar, 2, bVar.f71768c);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ b(int i14, double d14, double d15, long j8, u1 u1Var) {
        if (7 != (i14 & 7)) {
            k1.h(i14, 7, a.f71769a.getDescriptor());
            throw null;
        }
        this.f71766a = d14;
        this.f71767b = d15;
        this.f71768c = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Double.compare(this.f71766a, bVar.f71766a) == 0 && Double.compare(this.f71767b, bVar.f71767b) == 0 && this.f71768c == bVar.f71768c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f71768c) + org.apache.commons.lang3.e.b(Double.hashCode(this.f71766a) * 31, 31, this.f71767b);
    }

    public final String toString() {
        StringBuilder sbA = com.airbnb.lottie.parser.moshi.a.a("DeviceLocation(latitude=", this.f71766a, ", longitude=");
        sbA.append(this.f71767b);
        return com.nimbusds.jose.shaded.gson.internal.a.g(this.f71768c, ", timestamp=", ")", sbA);
    }

    /* JADX INFO: renamed from: fi1.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lfi1/b$b;", "", "<init>", "()V", "Li63/c;", "Lfi1/b;", "serializer", "()Li63/c;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final i63.c<b> serializer() {
            return a.f71769a;
        }

        private Companion() {
        }
    }

    public b(double d14, double d15, long j8) {
        this.f71766a = d14;
        this.f71767b = d15;
        this.f71768c = j8;
    }
}
