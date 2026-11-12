package l90;

import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.y1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0015B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBQ\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012¨\u0006\u0016"}, d2 = {"Ll90/k;", "", "", "unitId", "", "macAddress", "", "readyToPair", "isDualPairing", "passkey", "Ll90/b;", "compatibleDevice", "<init>", "(JLjava/lang/String;ZZLjava/lang/String;Ll90/b;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IJLjava/lang/String;ZZLjava/lang/String;Ll90/b;Lm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class k {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f111577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f111579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f111580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f111581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f111582f;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/domain/discovery/model/ScannedDevice.$serializer", "Lm63/e0;", "Ll90/k;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<k> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f111583a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f111583a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.device.setup.domain.discovery.model.ScannedDevice", aVar, 6);
            m1Var.j("unitId", true);
            m1Var.j("macAddress", false);
            m1Var.j("readyToPair", false);
            m1Var.j("isDualPairing", false);
            m1Var.j("passkey", false);
            m1Var.j("compatibleDevice", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            y1 y1Var = y1.f117048a;
            i63.c<?> cVarD = j63.a.d(y1Var);
            m63.g gVar = m63.g.f116948a;
            return new i63.c[]{v0.f117027a, y1Var, gVar, gVar, cVarD, b.a.f111532a};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            int i15 = 0;
            boolean zG = false;
            boolean zG2 = false;
            long jW = 0;
            String strR = null;
            String str = null;
            b bVar = null;
            boolean z14 = true;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        break;
                    case 0:
                        jW = cVarC.w(eVar2, 0);
                        i15 |= 1;
                        break;
                    case 1:
                        strR = cVarC.r(eVar2, 1);
                        i15 |= 2;
                        break;
                    case 2:
                        zG = cVarC.g(eVar2, 2);
                        i15 |= 4;
                        break;
                    case 3:
                        zG2 = cVarC.g(eVar2, 3);
                        i15 |= 8;
                        break;
                    case 4:
                        str = (String) cVarC.v(eVar2, 4, y1.f117048a, str);
                        i15 |= 16;
                        break;
                    case 5:
                        bVar = (b) cVarC.l(eVar2, 5, b.a.f111532a, bVar);
                        i15 |= 32;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            cVarC.b(eVar2);
            return new k(i15, jW, strR, zG, zG2, str, bVar, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF94809a() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            k kVar = (k) obj;
            kVar.getClass();
            long j8 = kVar.f111577a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            if (dVarC.C(eVar) || j8 != -1) {
                dVarC.z(eVar, 0, j8);
            }
            dVarC.k(eVar, 1, kVar.f111578b);
            dVarC.n(eVar, 2, kVar.f111579c);
            dVarC.n(eVar, 3, kVar.f111580d);
            dVarC.d(eVar, 4, y1.f117048a, kVar.f111581e);
            dVarC.e(eVar, 5, b.a.f111532a, kVar.f111582f);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ k(int i14, long j8, String str, boolean z14, boolean z15, String str2, b bVar, u1 u1Var) {
        if (62 != (i14 & 62)) {
            k1.h(i14, 62, a.f111583a.getF94809a());
            throw null;
        }
        if ((i14 & 1) == 0) {
            this.f111577a = -1L;
        } else {
            this.f111577a = j8;
        }
        this.f111578b = str;
        this.f111579c = z14;
        this.f111580d = z15;
        this.f111581e = str2;
        this.f111582f = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f111577a == kVar.f111577a && s.g(this.f111578b, kVar.f111578b) && this.f111579c == kVar.f111579c && this.f111580d == kVar.f111580d && s.g(this.f111581e, kVar.f111581e) && s.g(this.f111582f, kVar.f111582f);
    }

    public final int hashCode() {
        int iG = q6.f.g(q6.f.g(wr.g.j(Long.hashCode(this.f111577a) * 31, 31, this.f111578b), 31, this.f111579c), 31, this.f111580d);
        String str = this.f111581e;
        return this.f111582f.hashCode() + ((iG + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f111577a, "ScannedDevice(unitId=", ", macAddress=", this.f111578b);
        com.airbnb.lottie.animation.keyframe.a.v(", readyToPair=", ", isDualPairing=", sbK, this.f111579c, this.f111580d);
        sbK.append(", passkey=");
        sbK.append(this.f111581e);
        sbK.append(", compatibleDevice=");
        sbK.append(this.f111582f);
        sbK.append(")");
        return sbK.toString();
    }

    /* JADX INFO: renamed from: l90.k$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ll90/k$b;", "", "<init>", "()V", "Li63/c;", "Ll90/k;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<k> serializer() {
            return a.f111583a;
        }

        private Companion() {
        }
    }

    public k(long j8, String str, boolean z14, boolean z15, String str2, b bVar) {
        str.getClass();
        bVar.getClass();
        this.f111577a = j8;
        this.f111578b = str;
        this.f111579c = z14;
        this.f111580d = z15;
        this.f111581e = str2;
        this.f111582f = bVar;
    }

    public /* synthetic */ k(long j8, String str, boolean z14, boolean z15, String str2, b bVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? -1L : j8, str, z14, z15, str2, bVar);
    }
}
