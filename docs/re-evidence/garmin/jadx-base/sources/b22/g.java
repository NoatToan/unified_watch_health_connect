package b22;

import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.y1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0015B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBU\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012¨\u0006\u0016"}, d2 = {"Lb22/g;", "", "", "uuid", "", "userProfilePk", "_calendarDate", "source", "Lb22/a;", "intensityMinutes", "Lb22/b;", "movement", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lb22/a;Lb22/b;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;Lb22/a;Lb22/b;Lm63/u1;)V", "Companion", "a", "b", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class g {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f15476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b22.a f15477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f15478f;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/usersummary/UserDailySummaryV2DTOData.$serializer", "Lm63/e0;", "Lb22/g;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f15479a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f15479a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.usersummary.UserDailySummaryV2DTOData", aVar, 6);
            m1Var.j("uuid", false);
            m1Var.j("userProfilePk", false);
            m1Var.j("calendarDate", false);
            m1Var.j("source", false);
            m1Var.j("intensityMinutes", true);
            m1Var.j("movement", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            i63.c<?> cVarD = j63.a.d(b22.a.C0216a.f15461a);
            i63.c<?> cVarD2 = j63.a.d(b.a.f15463a);
            y1 y1Var = y1.f117048a;
            return new i63.c[]{y1Var, v0.f117027a, y1Var, y1Var, cVarD, cVarD2};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            int i15 = 0;
            String strR = null;
            String strR2 = null;
            String strR3 = null;
            b22.a aVar = null;
            b bVar = null;
            long jW = 0;
            boolean z14 = true;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        break;
                    case 0:
                        strR = cVarC.r(eVar2, 0);
                        i15 |= 1;
                        break;
                    case 1:
                        jW = cVarC.w(eVar2, 1);
                        i15 |= 2;
                        break;
                    case 2:
                        strR2 = cVarC.r(eVar2, 2);
                        i15 |= 4;
                        break;
                    case 3:
                        strR3 = cVarC.r(eVar2, 3);
                        i15 |= 8;
                        break;
                    case 4:
                        aVar = (b22.a) cVarC.v(eVar2, 4, b22.a.C0216a.f15461a, aVar);
                        i15 |= 16;
                        break;
                    case 5:
                        bVar = (b) cVarC.v(eVar2, 5, b.a.f15463a, bVar);
                        i15 |= 32;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            cVarC.b(eVar2);
            return new g(i15, strR, jW, strR2, strR3, aVar, bVar, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            g gVar = (g) obj;
            gVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            String str = gVar.f15473a;
            b bVar = gVar.f15478f;
            b22.a aVar = gVar.f15477e;
            dVarC.k(eVar, 0, str);
            dVarC.z(eVar, 1, gVar.f15474b);
            dVarC.k(eVar, 2, gVar.f15475c);
            dVarC.k(eVar, 3, gVar.f15476d);
            if (dVarC.C(eVar) || aVar != null) {
                dVarC.d(eVar, 4, b22.a.C0216a.f15461a, aVar);
            }
            if (dVarC.C(eVar) || bVar != null) {
                dVarC.d(eVar, 5, b.a.f15463a, bVar);
            }
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ g(int i14, String str, long j8, String str2, String str3, b22.a aVar, b bVar, u1 u1Var) {
        if (15 != (i14 & 15)) {
            k1.h(i14, 15, a.f15479a.getF158591b());
            throw null;
        }
        this.f15473a = str;
        this.f15474b = j8;
        this.f15475c = str2;
        this.f15476d = str3;
        if ((i14 & 16) == 0) {
            this.f15477e = null;
        } else {
            this.f15477e = aVar;
        }
        if ((i14 & 32) == 0) {
            this.f15478f = null;
        } else {
            this.f15478f = bVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.f15473a, gVar.f15473a) && this.f15474b == gVar.f15474b && s.g(this.f15475c, gVar.f15475c) && s.g(this.f15476d, gVar.f15476d) && s.g(this.f15477e, gVar.f15477e) && s.g(this.f15478f, gVar.f15478f);
    }

    public final int hashCode() {
        int iJ = wr.g.j(wr.g.j(q6.f.e(this.f15473a.hashCode() * 31, 31, this.f15474b), 31, this.f15475c), 31, this.f15476d);
        b22.a aVar = this.f15477e;
        int iHashCode = (iJ + (aVar == null ? 0 : aVar.hashCode())) * 31;
        b bVar = this.f15478f;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(this.f15474b, "UserDailySummaryV2DTOData(uuid=", this.f15473a, ", userProfilePk=");
        sn.a.t(sbJ, ", _calendarDate=", this.f15475c, ", source=", this.f15476d);
        sbJ.append(", intensityMinutes=");
        sbJ.append(this.f15477e);
        sbJ.append(", movement=");
        sbJ.append(this.f15478f);
        sbJ.append(")");
        return sbJ.toString();
    }

    /* JADX INFO: renamed from: b22.g$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb22/g$b;", "", "<init>", "()V", "Li63/c;", "Lb22/g;", "serializer", "()Li63/c;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<g> serializer() {
            return a.f15479a;
        }

        private Companion() {
        }
    }

    public g(String str, long j8, String str2, String str3, b22.a aVar, b bVar) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.f15473a = str;
        this.f15474b = j8;
        this.f15475c = str2;
        this.f15476d = str3;
        this.f15477e = aVar;
        this.f15478f = bVar;
    }

    public /* synthetic */ g(String str, long j8, String str2, String str3, b22.a aVar, b bVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, j8, str2, str3, (i14 & 16) != 0 ? null : aVar, (i14 & 32) != 0 ? null : bVar);
    }
}
