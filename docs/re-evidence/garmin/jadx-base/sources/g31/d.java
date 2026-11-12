package g31;

import com.garmin.android.apps.connectmobile.f3;
import i63.h;
import l63.f;
import m63.e0;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.y1;
import o13.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0012BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000f¨\u0006\u0013"}, d2 = {"Lg31/d;", "", "", "badgeKey", "", "badgePk", "badgeUUID", "", "challengeCategory", "sharedImagePk", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lm63/u1;)V", "Companion", "a", "b", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f75699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f75701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f75702e;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/onboarding/data/remote/model/PartnerRewardMetaDataDTO.$serializer", "Lm63/e0;", "Lg31/d;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @e
    public static final /* synthetic */ class a implements e0<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f75703a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f75703a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.onboarding.data.remote.model.PartnerRewardMetaDataDTO", aVar, 5);
            m1Var.j("badgeKey", true);
            m1Var.j("badgePk", true);
            m1Var.j("badgeUUID", true);
            m1Var.j("challengeCategory", true);
            m1Var.j("sharedImagePk", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            y1 y1Var = y1.f117048a;
            i63.c<?> cVarD = j63.a.d(y1Var);
            i63.c<?> cVarD2 = j63.a.d(v0.f117027a);
            i63.c<?> cVarD3 = j63.a.d(y1Var);
            m0 m0Var = m0.f116981a;
            return new i63.c[]{cVarD, cVarD2, cVarD3, j63.a.d(m0Var), j63.a.d(m0Var)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            String str = null;
            Long l14 = null;
            String str2 = null;
            Integer num = null;
            Integer num2 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    str = (String) cVarC.v(eVar2, 0, y1.f117048a, str);
                    i15 |= 1;
                } else if (iE == 1) {
                    l14 = (Long) cVarC.v(eVar2, 1, v0.f117027a, l14);
                    i15 |= 2;
                } else if (iE == 2) {
                    str2 = (String) cVarC.v(eVar2, 2, y1.f117048a, str2);
                    i15 |= 4;
                } else if (iE == 3) {
                    num = (Integer) cVarC.v(eVar2, 3, m0.f116981a, num);
                    i15 |= 8;
                } else {
                    if (iE != 4) {
                        hb.a.o(iE);
                        return null;
                    }
                    num2 = (Integer) cVarC.v(eVar2, 4, m0.f116981a, num2);
                    i15 |= 16;
                }
            }
            cVarC.b(eVar2);
            return new d(i15, str, l14, str2, num, num2, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(f fVar, Object obj) {
            d dVar = (d) obj;
            dVar.getClass();
            Integer num = dVar.f75702e;
            Integer num2 = dVar.f75701d;
            String str = dVar.f75700c;
            Long l14 = dVar.f75699b;
            String str2 = dVar.f75698a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            if (dVarC.C(eVar) || str2 != null) {
                dVarC.d(eVar, 0, y1.f117048a, str2);
            }
            if (dVarC.C(eVar) || l14 != null) {
                dVarC.d(eVar, 1, v0.f117027a, l14);
            }
            if (dVarC.C(eVar) || str != null) {
                dVarC.d(eVar, 2, y1.f117048a, str);
            }
            if (dVarC.C(eVar) || num2 != null) {
                dVarC.d(eVar, 3, m0.f116981a, num2);
            }
            if (dVarC.C(eVar) || num != null) {
                dVarC.d(eVar, 4, m0.f116981a, num);
            }
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ d(int i14, String str, Long l14, String str2, Integer num, Integer num2, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f75698a = null;
        } else {
            this.f75698a = str;
        }
        if ((i14 & 2) == 0) {
            this.f75699b = null;
        } else {
            this.f75699b = l14;
        }
        if ((i14 & 4) == 0) {
            this.f75700c = null;
        } else {
            this.f75700c = str2;
        }
        if ((i14 & 8) == 0) {
            this.f75701d = null;
        } else {
            this.f75701d = num;
        }
        if ((i14 & 16) == 0) {
            this.f75702e = null;
        } else {
            this.f75702e = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f75698a, dVar.f75698a) && s.g(this.f75699b, dVar.f75699b) && s.g(this.f75700c, dVar.f75700c) && s.g(this.f75701d, dVar.f75701d) && s.g(this.f75702e, dVar.f75702e);
    }

    public final int hashCode() {
        String str = this.f75698a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l14 = this.f75699b;
        int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str2 = this.f75700c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f75701d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f75702e;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PartnerRewardMetaDataDTO(badgeKey=");
        sb3.append(this.f75698a);
        sb3.append(", badgePk=");
        sb3.append(this.f75699b);
        sb3.append(", badgeUUID=");
        fb1.c.u(this.f75701d, this.f75700c, ", challengeCategory=", ", sharedImagePk=", sb3);
        return f3.i(sb3, this.f75702e, ")");
    }

    /* JADX INFO: renamed from: g31.d$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg31/d$b;", "", "<init>", "()V", "Li63/c;", "Lg31/d;", "serializer", "()Li63/c;", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final i63.c<d> serializer() {
            return a.f75703a;
        }

        private Companion() {
        }
    }

    public d() {
        this((String) null, (Long) null, (String) null, (Integer) null, (Integer) null, 31, (j) null);
    }

    public d(String str, Long l14, String str2, Integer num, Integer num2) {
        this.f75698a = str;
        this.f75699b = l14;
        this.f75700c = str2;
        this.f75701d = num;
        this.f75702e = num2;
    }

    public /* synthetic */ d(String str, Long l14, String str2, Integer num, Integer num2, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : l14, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : num, (i14 & 16) != 0 ? null : num2);
    }
}
