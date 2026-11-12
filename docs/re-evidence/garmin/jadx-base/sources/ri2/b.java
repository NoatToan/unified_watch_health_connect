package ri2;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import i63.c;
import i63.h;
import l63.d;
import l63.f;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.y1;
import o13.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u0011B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000e¨\u0006\u0012"}, d2 = {"Lri2/b;", "", "", "userId", "", "firstName", "lastName", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@h
public final /* data */ class b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f152947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f152949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f152950d;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/auth/cmc/data/dto/ManagedAccountResponse.$serializer", "Lm63/e0;", "Lri2/b;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @e
    public /* synthetic */ class a implements e0<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f152951a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f152951a = aVar;
            m1 m1Var = new m1("com.garmin.auth.cmc.data.dto.ManagedAccountResponse", aVar, 4);
            m1Var.j("userProfilePk", true);
            m1Var.j("firstName", false);
            m1Var.j("lastName", false);
            m1Var.j(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final c<?>[] childSerializers() {
            y1 y1Var = y1.f117048a;
            return new c[]{v0.f117027a, j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var)};
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
            String str2 = null;
            String str3 = null;
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
                    str2 = (String) cVarC.v(eVar2, 2, y1.f117048a, str2);
                    i15 |= 4;
                } else {
                    if (iE != 3) {
                        hb.a.o(iE);
                        return null;
                    }
                    str3 = (String) cVarC.v(eVar2, 3, y1.f117048a, str3);
                    i15 |= 8;
                }
            }
            cVarC.b(eVar2);
            return new b(i15, jW, str, str2, str3, (u1) null);
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
            long j8 = bVar.f152947a;
            k63.e eVar = descriptor;
            d dVarC = fVar.c(eVar);
            if (dVarC.C(eVar) || j8 != -1) {
                dVarC.z(eVar, 0, j8);
            }
            y1 y1Var = y1.f117048a;
            dVarC.d(eVar, 1, y1Var, bVar.f152948b);
            dVarC.d(eVar, 2, y1Var, bVar.f152949c);
            dVarC.d(eVar, 3, y1Var, bVar.f152950d);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ b(int i14, long j8, String str, String str2, String str3, u1 u1Var) {
        if (14 != (i14 & 14)) {
            k1.h(i14, 14, a.f152951a.getF158591b());
            throw null;
        }
        if ((i14 & 1) == 0) {
            this.f152947a = -1L;
        } else {
            this.f152947a = j8;
        }
        this.f152948b = str;
        this.f152949c = str2;
        this.f152950d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f152947a == bVar.f152947a && s.g(this.f152948b, bVar.f152948b) && s.g(this.f152949c, bVar.f152949c) && s.g(this.f152950d, bVar.f152950d);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f152947a) * 31;
        String str = this.f152948b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f152949c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f152950d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f152947a, "ManagedAccountResponse(userId=", ", firstName=", this.f152948b);
        sn.a.t(sbK, ", lastName=", this.f152949c, ", countryCode=", this.f152950d);
        sbK.append(")");
        return sbK.toString();
    }

    /* JADX INFO: renamed from: ri2.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lri2/b$b;", "", "<init>", "()V", "Li63/c;", "Lri2/b;", "serializer", "()Li63/c;", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final c<b> serializer() {
            return a.f152951a;
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    public b(long j8, String str, String str2, String str3) {
        this.f152947a = j8;
        this.f152948b = str;
        this.f152949c = str2;
        this.f152950d = str3;
    }

    public /* synthetic */ b(long j8, String str, String str2, String str3, int i14, j jVar) {
        this((i14 & 1) != 0 ? -1L : j8, str, str2, str3);
    }
}
