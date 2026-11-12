package j01;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import i63.h;
import java.util.List;
import l63.f;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.x;
import m63.y1;
import o13.e;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import wr.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0002\u0016\u0017BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fBo\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014¨\u0006\u0018"}, d2 = {"Lj01/a;", "", "", "recipeName", "", "yield", "servingUnit", "regionCode", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "brandName", "notes", "", "Lj01/b;", "ingredients", "<init>", "(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f95976i = {null, null, null, null, null, null, null, m.a(n.PUBLICATION, new ik2.b(18))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f95977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f95978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f95979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f95980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f95981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f95982f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f95983g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<b> f95984h;

    /* JADX INFO: renamed from: j01.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/data/model/recipe/CreateUpdateRecipeRequestDTO.$serializer", "Lm63/e0;", "Lj01/a;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @e
    public static final /* synthetic */ class C1837a implements e0<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1837a f95985a;
        private static final k63.e descriptor;

        static {
            C1837a c1837a = new C1837a();
            f95985a = c1837a;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.data.model.recipe.CreateUpdateRecipeRequestDTO", c1837a, 8);
            m1Var.j("recipeName", false);
            m1Var.j("yield", false);
            m1Var.j("servingUnit", false);
            m1Var.j("regionCode", false);
            m1Var.j(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, false);
            m1Var.j("brandName", true);
            m1Var.j("notes", true);
            m1Var.j("ingredients", false);
            descriptor = m1Var;
        }

        private C1837a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            l<i63.c<Object>>[] lVarArr = a.f95976i;
            y1 y1Var = y1.f117048a;
            return new i63.c[]{y1Var, x.f117036a, y1Var, y1Var, y1Var, j63.a.d(y1Var), j63.a.d(y1Var), lVarArr[7].getValue()};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            l<i63.c<Object>>[] lVarArr = a.f95976i;
            int i14 = l63.c.f110557a;
            double dT = 0.0d;
            List list = null;
            boolean z14 = true;
            String str = null;
            String str2 = null;
            int i15 = 0;
            String strR = null;
            String strR2 = null;
            String strR3 = null;
            String strR4 = null;
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
                        dT = cVarC.t(eVar2, 1);
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
                        strR4 = cVarC.r(eVar2, 4);
                        i15 |= 16;
                        break;
                    case 5:
                        str = (String) cVarC.v(eVar2, 5, y1.f117048a, str);
                        i15 |= 32;
                        break;
                    case 6:
                        str2 = (String) cVarC.v(eVar2, 6, y1.f117048a, str2);
                        i15 |= 64;
                        break;
                    case 7:
                        list = (List) cVarC.l(eVar2, 7, lVarArr[7].getValue(), list);
                        i15 |= 128;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            cVarC.b(eVar2);
            return new a(i15, strR, dT, strR2, strR3, strR4, str, str2, list, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(f fVar, Object obj) {
            a aVar = (a) obj;
            aVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            l<i63.c<Object>>[] lVarArr = a.f95976i;
            String str = aVar.f95977a;
            String str2 = aVar.f95983g;
            String str3 = aVar.f95982f;
            dVarC.k(eVar, 0, str);
            dVarC.B(eVar, 1, aVar.f95978b);
            dVarC.k(eVar, 2, aVar.f95979c);
            dVarC.k(eVar, 3, aVar.f95980d);
            dVarC.k(eVar, 4, aVar.f95981e);
            if (dVarC.C(eVar) || str3 != null) {
                dVarC.d(eVar, 5, y1.f117048a, str3);
            }
            if (dVarC.C(eVar) || str2 != null) {
                dVarC.d(eVar, 6, y1.f117048a, str2);
            }
            dVarC.e(eVar, 7, lVarArr[7].getValue(), aVar.f95984h);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ a(int i14, String str, double d14, String str2, String str3, String str4, String str5, String str6, List list, u1 u1Var) {
        if (159 != (i14 & 159)) {
            k1.h(i14, 159, C1837a.f95985a.getF158591b());
            throw null;
        }
        this.f95977a = str;
        this.f95978b = d14;
        this.f95979c = str2;
        this.f95980d = str3;
        this.f95981e = str4;
        if ((i14 & 32) == 0) {
            this.f95982f = null;
        } else {
            this.f95982f = str5;
        }
        if ((i14 & 64) == 0) {
            this.f95983g = null;
        } else {
            this.f95983g = str6;
        }
        this.f95984h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f95977a, aVar.f95977a) && Double.compare(this.f95978b, aVar.f95978b) == 0 && s.g(this.f95979c, aVar.f95979c) && s.g(this.f95980d, aVar.f95980d) && s.g(this.f95981e, aVar.f95981e) && s.g(this.f95982f, aVar.f95982f) && s.g(this.f95983g, aVar.f95983g) && s.g(this.f95984h, aVar.f95984h);
    }

    public final int hashCode() {
        int iJ = g.j(g.j(g.j(org.apache.commons.lang3.e.b(this.f95977a.hashCode() * 31, 31, this.f95978b), 31, this.f95979c), 31, this.f95980d), 31, this.f95981e);
        String str = this.f95982f;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f95983g;
        return this.f95984h.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CreateUpdateRecipeRequestDTO(recipeName=");
        sb3.append(this.f95977a);
        sb3.append(", yield=");
        sb3.append(this.f95978b);
        sn.a.t(sb3, ", servingUnit=", this.f95979c, ", regionCode=", this.f95980d);
        sn.a.t(sb3, ", languageCode=", this.f95981e, ", brandName=", this.f95982f);
        sb3.append(", notes=");
        sb3.append(this.f95983g);
        sb3.append(", ingredients=");
        sb3.append(this.f95984h);
        sb3.append(")");
        return sb3.toString();
    }

    /* JADX INFO: renamed from: j01.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lj01/a$b;", "", "<init>", "()V", "Li63/c;", "Lj01/a;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final i63.c<a> serializer() {
            return C1837a.f95985a;
        }

        private Companion() {
        }
    }

    public a(String str, double d14, String str2, String str3, String str4, String str5, String str6, List<b> list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        this.f95977a = str;
        this.f95978b = d14;
        this.f95979c = str2;
        this.f95980d = str3;
        this.f95981e = str4;
        this.f95982f = str5;
        this.f95983g = str6;
        this.f95984h = list;
    }

    public /* synthetic */ a(String str, double d14, String str2, String str3, String str4, String str5, String str6, List list, int i14, j jVar) {
        this(str, d14, str2, str3, str4, (i14 & 32) != 0 ? null : str5, (i14 & 64) != 0 ? null : str6, list);
    }
}
