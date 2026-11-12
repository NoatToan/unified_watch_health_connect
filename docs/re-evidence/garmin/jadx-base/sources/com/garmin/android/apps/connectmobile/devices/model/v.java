package com.garmin.android.apps.connectmobile.devices.model;

import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.y1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0012B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB=\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/v;", "", "", "unitId", "", "referenceId", "completedAt", "", "hasActiveSubscription", "<init>", "(JLjava/lang/String;JZ)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IJLjava/lang/String;JZLm63/u1;)V", "Companion", "a", "b", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class v {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f34320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f34321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f34322d;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/devices/model/InReachDeviceData.$serializer", "Lm63/e0;", "Lcom/garmin/android/apps/connectmobile/devices/model/v;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<v> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f34323a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f34323a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.devices.model.InReachDeviceData", aVar, 4);
            m1Var.j("unitId", false);
            m1Var.j("referenceId", true);
            m1Var.j("completedAt", true);
            m1Var.j("hasActiveSubscription", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            i63.c<?> cVarD = j63.a.d(y1.f117048a);
            v0 v0Var = v0.f117027a;
            return new i63.c[]{v0Var, cVarD, v0Var, m63.g.f116948a};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            int i15 = 0;
            boolean zG = false;
            long jW = 0;
            long jW2 = 0;
            String str = null;
            boolean z14 = true;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    jW = cVarC.w(eVar2, 0);
                    i15 |= 1;
                } else if (iE == 1) {
                    str = (String) cVarC.v(eVar2, 1, y1.f117048a, str);
                    i15 |= 2;
                } else if (iE == 2) {
                    jW2 = cVarC.w(eVar2, 2);
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
            return new v(i15, jW, str, jW2, zG, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            v vVar = (v) obj;
            vVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            long j8 = vVar.f34319a;
            boolean z14 = vVar.f34322d;
            long j14 = vVar.f34321c;
            String str = vVar.f34320b;
            dVarC.z(eVar, 0, j8);
            if (dVarC.C(eVar) || str != null) {
                dVarC.d(eVar, 1, y1.f117048a, str);
            }
            if (dVarC.C(eVar) || j14 != -1) {
                dVarC.z(eVar, 2, j14);
            }
            if (dVarC.C(eVar) || z14) {
                dVarC.n(eVar, 3, z14);
            }
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ v(int i14, long j8, String str, long j14, boolean z14, u1 u1Var) {
        if (1 != (i14 & 1)) {
            k1.h(i14, 1, a.f34323a.getF158591b());
            throw null;
        }
        this.f34319a = j8;
        if ((i14 & 2) == 0) {
            this.f34320b = null;
        } else {
            this.f34320b = str;
        }
        if ((i14 & 4) == 0) {
            this.f34321c = -1L;
        } else {
            this.f34321c = j14;
        }
        if ((i14 & 8) == 0) {
            this.f34322d = false;
        } else {
            this.f34322d = z14;
        }
    }

    public static v a(v vVar, String str, long j8, boolean z14, int i14) {
        long j14 = vVar.f34319a;
        if ((i14 & 2) != 0) {
            str = vVar.f34320b;
        }
        String str2 = str;
        if ((i14 & 4) != 0) {
            j8 = vVar.f34321c;
        }
        long j15 = j8;
        if ((i14 & 8) != 0) {
            z14 = vVar.f34322d;
        }
        vVar.getClass();
        return new v(j14, str2, j15, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f34319a == vVar.f34319a && p005kotlin.jvm.internal.s.g(this.f34320b, vVar.f34320b) && this.f34321c == vVar.f34321c && this.f34322d == vVar.f34322d;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f34319a) * 31;
        String str = this.f34320b;
        return Boolean.hashCode(this.f34322d) + q6.f.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f34321c);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f34319a, "InReachDeviceData(unitId=", ", referenceId=", this.f34320b);
        j20.x.j(this.f34321c, ", completedAt=", ", hasActiveSubscription=", sbK);
        return hb.a.k(sbK, this.f34322d, ")");
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.devices.model.v$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/v$b;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/devices/model/v;", "serializer", "()Li63/c;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<v> serializer() {
            return a.f34323a;
        }

        private Companion() {
        }
    }

    public v(long j8, String str, long j14, boolean z14) {
        this.f34319a = j8;
        this.f34320b = str;
        this.f34321c = j14;
        this.f34322d = z14;
    }

    public /* synthetic */ v(long j8, String str, long j14, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j8, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? -1L : j14, (i14 & 8) != 0 ? false : z14);
    }
}
