package g31;

import i63.h;
import l63.f;
import m63.e0;
import m63.g;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.y1;
import o13.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0019Bs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0010\u0010\u0011Bu\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016¨\u0006\u001a"}, d2 = {"Lg31/b;", "", "", "associationType", "", "coreItem", "", "deviceId", "Lg31/a;", "deviceInfoMetaData", "onboardingItemTypeKey", "Lg31/d;", "partnerRewardMetaDataDTO", "reminderDate", "status", "userProfilePk", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Lg31/a;Ljava/lang/String;Lg31/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Lg31/a;Ljava/lang/String;Lg31/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lm63/u1;)V", "Companion", "a", "b", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f75682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f75683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g31.a f75684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f75685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f75686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f75687g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f75688h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f75689i;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/onboarding/data/remote/model/OnboardingItemDTO.$serializer", "Lm63/e0;", "Lg31/b;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @e
    public static final /* synthetic */ class a implements e0<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f75690a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f75690a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.onboarding.data.remote.model.OnboardingItemDTO", aVar, 9);
            m1Var.j("associationType", true);
            m1Var.j("coreItem", true);
            m1Var.j("deviceId", true);
            m1Var.j("deviceInfoMetaData", true);
            m1Var.j("onboardingItemTypeKey", true);
            m1Var.j("partnerRewardMetaDataDTO", true);
            m1Var.j("reminderDate", true);
            m1Var.j("status", true);
            m1Var.j("userProfilePk", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            y1 y1Var = y1.f117048a;
            i63.c<?> cVarD = j63.a.d(y1Var);
            i63.c<?> cVarD2 = j63.a.d(g.f116948a);
            v0 v0Var = v0.f117027a;
            return new i63.c[]{cVarD, cVarD2, j63.a.d(v0Var), j63.a.d(g31.a.C1521a.f75680a), j63.a.d(y1Var), j63.a.d(d.a.f75703a), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(v0Var)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            Object obj = null;
            boolean z14 = true;
            Long l14 = null;
            String str = null;
            Boolean bool = null;
            Long l15 = null;
            g31.a aVar = null;
            String str2 = null;
            d dVar = null;
            String str3 = null;
            String str4 = null;
            int i15 = 0;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        break;
                    case 0:
                        str = (String) cVarC.v(eVar2, 0, y1.f117048a, str);
                        i15 |= 1;
                        break;
                    case 1:
                        bool = (Boolean) cVarC.v(eVar2, 1, g.f116948a, bool);
                        i15 |= 2;
                        break;
                    case 2:
                        l15 = (Long) cVarC.v(eVar2, 2, v0.f117027a, l15);
                        i15 |= 4;
                        break;
                    case 3:
                        aVar = (g31.a) cVarC.v(eVar2, 3, g31.a.C1521a.f75680a, aVar);
                        i15 |= 8;
                        break;
                    case 4:
                        str2 = (String) cVarC.v(eVar2, 4, y1.f117048a, str2);
                        i15 |= 16;
                        break;
                    case 5:
                        dVar = (d) cVarC.v(eVar2, 5, d.a.f75703a, dVar);
                        i15 |= 32;
                        break;
                    case 6:
                        str3 = (String) cVarC.v(eVar2, 6, y1.f117048a, str3);
                        i15 |= 64;
                        break;
                    case 7:
                        str4 = (String) cVarC.v(eVar2, 7, y1.f117048a, str4);
                        i15 |= 128;
                        break;
                    case 8:
                        l14 = (Long) cVarC.v(eVar2, 8, v0.f117027a, l14);
                        i15 |= 256;
                        break;
                    default:
                        hb.a.o(iE);
                        return obj;
                }
                obj = null;
            }
            cVarC.b(eVar2);
            return new b(i15, str, bool, l15, aVar, str2, dVar, str3, str4, l14, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF94809a() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(f fVar, Object obj) {
            b bVar = (b) obj;
            bVar.getClass();
            Long l14 = bVar.f75689i;
            String str = bVar.f75688h;
            String str2 = bVar.f75687g;
            d dVar = bVar.f75686f;
            String str3 = bVar.f75685e;
            g31.a aVar = bVar.f75684d;
            Long l15 = bVar.f75683c;
            Boolean bool = bVar.f75682b;
            String str4 = bVar.f75681a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            if (dVarC.C(eVar) || str4 != null) {
                dVarC.d(eVar, 0, y1.f117048a, str4);
            }
            if (dVarC.C(eVar) || bool != null) {
                dVarC.d(eVar, 1, g.f116948a, bool);
            }
            if (dVarC.C(eVar) || l15 != null) {
                dVarC.d(eVar, 2, v0.f117027a, l15);
            }
            if (dVarC.C(eVar) || aVar != null) {
                dVarC.d(eVar, 3, g31.a.C1521a.f75680a, aVar);
            }
            if (dVarC.C(eVar) || str3 != null) {
                dVarC.d(eVar, 4, y1.f117048a, str3);
            }
            if (dVarC.C(eVar) || dVar != null) {
                dVarC.d(eVar, 5, d.a.f75703a, dVar);
            }
            if (dVarC.C(eVar) || str2 != null) {
                dVarC.d(eVar, 6, y1.f117048a, str2);
            }
            if (dVarC.C(eVar) || str != null) {
                dVarC.d(eVar, 7, y1.f117048a, str);
            }
            if (dVarC.C(eVar) || l14 != null) {
                dVarC.d(eVar, 8, v0.f117027a, l14);
            }
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ b(int i14, String str, Boolean bool, Long l14, g31.a aVar, String str2, d dVar, String str3, String str4, Long l15, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f75681a = null;
        } else {
            this.f75681a = str;
        }
        if ((i14 & 2) == 0) {
            this.f75682b = null;
        } else {
            this.f75682b = bool;
        }
        if ((i14 & 4) == 0) {
            this.f75683c = null;
        } else {
            this.f75683c = l14;
        }
        if ((i14 & 8) == 0) {
            this.f75684d = null;
        } else {
            this.f75684d = aVar;
        }
        if ((i14 & 16) == 0) {
            this.f75685e = null;
        } else {
            this.f75685e = str2;
        }
        if ((i14 & 32) == 0) {
            this.f75686f = null;
        } else {
            this.f75686f = dVar;
        }
        if ((i14 & 64) == 0) {
            this.f75687g = null;
        } else {
            this.f75687g = str3;
        }
        if ((i14 & 128) == 0) {
            this.f75688h = null;
        } else {
            this.f75688h = str4;
        }
        if ((i14 & 256) == 0) {
            this.f75689i = null;
        } else {
            this.f75689i = l15;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f75681a, bVar.f75681a) && s.g(this.f75682b, bVar.f75682b) && s.g(this.f75683c, bVar.f75683c) && s.g(this.f75684d, bVar.f75684d) && s.g(this.f75685e, bVar.f75685e) && s.g(this.f75686f, bVar.f75686f) && s.g(this.f75687g, bVar.f75687g) && s.g(this.f75688h, bVar.f75688h) && s.g(this.f75689i, bVar.f75689i);
    }

    public final int hashCode() {
        String str = this.f75681a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f75682b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l14 = this.f75683c;
        int iHashCode3 = (iHashCode2 + (l14 == null ? 0 : l14.hashCode())) * 31;
        g31.a aVar = this.f75684d;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str2 = this.f75685e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        d dVar = this.f75686f;
        int iHashCode6 = (iHashCode5 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str3 = this.f75687g;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f75688h;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l15 = this.f75689i;
        return iHashCode8 + (l15 != null ? l15.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OnboardingItemDTO(associationType=");
        sb3.append(this.f75681a);
        sb3.append(", coreItem=");
        sb3.append(this.f75682b);
        sb3.append(", deviceId=");
        sb3.append(this.f75683c);
        sb3.append(", deviceInfoMetaData=");
        sb3.append(this.f75684d);
        sb3.append(", onboardingItemTypeKey=");
        sb3.append(this.f75685e);
        sb3.append(", partnerRewardMetaDataDTO=");
        sb3.append(this.f75686f);
        sb3.append(", reminderDate=");
        sn.a.t(sb3, this.f75687g, ", status=", this.f75688h, ", userProfilePk=");
        return p6.b.g(sb3, this.f75689i, ")");
    }

    /* JADX INFO: renamed from: g31.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg31/b$b;", "", "<init>", "()V", "Li63/c;", "Lg31/b;", "serializer", "()Li63/c;", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final i63.c<b> serializer() {
            return a.f75690a;
        }

        private Companion() {
        }
    }

    public b() {
        this((String) null, (Boolean) null, (Long) null, (g31.a) null, (String) null, (d) null, (String) null, (String) null, (Long) null, 511, (j) null);
    }

    public b(String str, Boolean bool, Long l14, g31.a aVar, String str2, d dVar, String str3, String str4, Long l15) {
        this.f75681a = str;
        this.f75682b = bool;
        this.f75683c = l14;
        this.f75684d = aVar;
        this.f75685e = str2;
        this.f75686f = dVar;
        this.f75687g = str3;
        this.f75688h = str4;
        this.f75689i = l15;
    }

    public /* synthetic */ b(String str, Boolean bool, Long l14, g31.a aVar, String str2, d dVar, String str3, String str4, Long l15, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : bool, (i14 & 4) != 0 ? null : l14, (i14 & 8) != 0 ? null : aVar, (i14 & 16) != 0 ? null : str2, (i14 & 32) != 0 ? null : dVar, (i14 & 64) != 0 ? null : str3, (i14 & 128) != 0 ? null : str4, (i14 & 256) != 0 ? null : l15);
    }
}
