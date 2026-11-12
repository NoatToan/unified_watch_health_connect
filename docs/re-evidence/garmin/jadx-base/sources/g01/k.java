package g01;

import m63.k1;
import m63.m1;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0015BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rBa\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012¨\u0006\u0016"}, d2 = {"Lg01/k;", "", "", "regionCode", "foodId", "servingId", "barCode", "Lb63/l;", "reportedDateTime", "Lg01/l;", "issueType", "comments", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb63/l;Lg01/l;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb63/l;Lg01/l;Ljava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class k {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f74203h = {null, null, null, null, null, o13.m.a(o13.n.PUBLICATION, new fy1.h(25)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f74205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f74206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f74207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b63.l f74208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f74209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f74210g;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/data/model/consumable/FoodIssueDTO.$serializer", "Lm63/e0;", "Lg01/k;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements m63.e0<k> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f74211a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f74211a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.data.model.consumable.FoodIssueDTO", aVar, 7);
            m1Var.j("regionCode", false);
            m1Var.j("foodId", false);
            m1Var.j("servingId", true);
            m1Var.j("barCode", true);
            m1Var.j("reportedDateTime", false);
            m1Var.j("issueType", false);
            m1Var.j("comments", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = k.f74203h;
            y1 y1Var = y1.f117048a;
            return new i63.c[]{y1Var, y1Var, j63.a.d(y1Var), j63.a.d(y1Var), h63.j.f82302a, lVarArr[5].getValue(), j63.a.d(y1Var)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = k.f74203h;
            int i14 = l63.c.f110557a;
            Object obj = null;
            boolean z14 = true;
            int i15 = 0;
            String strR = null;
            String strR2 = null;
            String str = null;
            String str2 = null;
            b63.l lVar = null;
            l lVar2 = null;
            String str3 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        continue;
                    case 0:
                        strR = cVarC.r(eVar2, 0);
                        i15 |= 1;
                        break;
                    case 1:
                        strR2 = cVarC.r(eVar2, 1);
                        i15 |= 2;
                        break;
                    case 2:
                        str = (String) cVarC.v(eVar2, 2, y1.f117048a, str);
                        i15 |= 4;
                        break;
                    case 3:
                        str2 = (String) cVarC.v(eVar2, 3, y1.f117048a, str2);
                        i15 |= 8;
                        break;
                    case 4:
                        lVar = (b63.l) cVarC.l(eVar2, 4, h63.j.f82302a, lVar);
                        i15 |= 16;
                        break;
                    case 5:
                        lVar2 = (l) cVarC.l(eVar2, 5, lVarArr[5].getValue(), lVar2);
                        i15 |= 32;
                        break;
                    case 6:
                        str3 = (String) cVarC.v(eVar2, 6, y1.f117048a, str3);
                        i15 |= 64;
                        break;
                    default:
                        hb.a.o(iE);
                        return obj;
                }
                obj = null;
            }
            cVarC.b(eVar2);
            return new k(i15, strR, strR2, str, str2, lVar, lVar2, str3, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            k kVar = (k) obj;
            kVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = k.f74203h;
            String str = kVar.f74204a;
            String str2 = kVar.f74210g;
            String str3 = kVar.f74207d;
            String str4 = kVar.f74206c;
            dVarC.k(eVar, 0, str);
            dVarC.k(eVar, 1, kVar.f74205b);
            if (dVarC.C(eVar) || str4 != null) {
                dVarC.d(eVar, 2, y1.f117048a, str4);
            }
            if (dVarC.C(eVar) || str3 != null) {
                dVarC.d(eVar, 3, y1.f117048a, str3);
            }
            dVarC.e(eVar, 4, h63.j.f82302a, kVar.f74208e);
            dVarC.e(eVar, 5, lVarArr[5].getValue(), kVar.f74209f);
            if (dVarC.C(eVar) || str2 != null) {
                dVarC.d(eVar, 6, y1.f117048a, str2);
            }
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ k(int i14, String str, String str2, String str3, String str4, b63.l lVar, l lVar2, String str5, u1 u1Var) {
        if (51 != (i14 & 51)) {
            k1.h(i14, 51, a.f74211a.getF158591b());
            throw null;
        }
        this.f74204a = str;
        this.f74205b = str2;
        if ((i14 & 4) == 0) {
            this.f74206c = null;
        } else {
            this.f74206c = str3;
        }
        if ((i14 & 8) == 0) {
            this.f74207d = null;
        } else {
            this.f74207d = str4;
        }
        this.f74208e = lVar;
        this.f74209f = lVar2;
        if ((i14 & 64) == 0) {
            this.f74210g = null;
        } else {
            this.f74210g = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return p005kotlin.jvm.internal.s.g(this.f74204a, kVar.f74204a) && p005kotlin.jvm.internal.s.g(this.f74205b, kVar.f74205b) && p005kotlin.jvm.internal.s.g(this.f74206c, kVar.f74206c) && p005kotlin.jvm.internal.s.g(this.f74207d, kVar.f74207d) && p005kotlin.jvm.internal.s.g(this.f74208e, kVar.f74208e) && this.f74209f == kVar.f74209f && p005kotlin.jvm.internal.s.g(this.f74210g, kVar.f74210g);
    }

    public final int hashCode() {
        int iJ = wr.g.j(this.f74204a.hashCode() * 31, 31, this.f74205b);
        String str = this.f74206c;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f74207d;
        int iHashCode2 = (this.f74209f.hashCode() + wr.g.k(this.f74208e.f16204a, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31)) * 31;
        String str3 = this.f74210g;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("FoodIssueDTO(regionCode=", this.f74204a, ", foodId=", this.f74205b, ", servingId=");
        sn.a.t(sbI, this.f74206c, ", barCode=", this.f74207d, ", reportedDateTime=");
        sbI.append(this.f74208e);
        sbI.append(", issueType=");
        sbI.append(this.f74209f);
        sbI.append(", comments=");
        return am.j.o(this.f74210g, ")", sbI);
    }

    /* JADX INFO: renamed from: g01.k$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg01/k$b;", "", "<init>", "()V", "Li63/c;", "Lg01/k;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<k> serializer() {
            return a.f74211a;
        }

        private Companion() {
        }
    }

    public k(String str, String str2, String str3, String str4, b63.l lVar, l lVar2, String str5) {
        str.getClass();
        str2.getClass();
        lVar.getClass();
        lVar2.getClass();
        this.f74204a = str;
        this.f74205b = str2;
        this.f74206c = str3;
        this.f74207d = str4;
        this.f74208e = lVar;
        this.f74209f = lVar2;
        this.f74210g = str5;
    }

    public /* synthetic */ k(String str, String str2, String str3, String str4, b63.l lVar, l lVar2, String str5, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, lVar, lVar2, (i14 & 64) != 0 ? null : str5);
    }
}
