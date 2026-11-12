package j01;

import b71.i;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import g01.u;
import i63.h;
import l63.f;
import m63.e0;
import m63.g;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0002\u0015\u0016BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBa\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013¨\u0006\u0017"}, d2 = {"Lj01/b;", "", "Lg01/u;", "foodSource", "", "regionCode", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "foodId", "servingId", "", FirebaseAnalytics.Param.QUANTITY, "", "deleteIngredient", "<init>", "(Lg01/u;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILg01/u;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f95986h = {m.a(n.PUBLICATION, new ik2.b(19)), null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f95987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f95988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f95989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f95990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f95991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Double f95992f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Boolean f95993g;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/data/model/recipe/IngredientInputDTO.$serializer", "Lm63/e0;", "Lj01/b;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @e
    public static final /* synthetic */ class a implements e0<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f95994a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f95994a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.data.model.recipe.IngredientInputDTO", aVar, 7);
            m1Var.j("foodSource", false);
            m1Var.j("regionCode", false);
            m1Var.j(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, false);
            m1Var.j("foodId", true);
            m1Var.j("servingId", true);
            m1Var.j("servingQty", true);
            m1Var.j("deleteIngredient", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            y1 y1Var = y1.f117048a;
            return new i63.c[]{b.f95986h[0].getValue(), y1Var, y1Var, j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(x.f117036a), j63.a.d(g.f116948a)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            l<i63.c<Object>>[] lVarArr = b.f95986h;
            int i14 = l63.c.f110557a;
            Object obj = null;
            boolean z14 = true;
            int i15 = 0;
            u uVar = null;
            String strR = null;
            String strR2 = null;
            String str = null;
            String str2 = null;
            Double d14 = null;
            Boolean bool = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        continue;
                    case 0:
                        uVar = (u) cVarC.l(eVar2, 0, lVarArr[0].getValue(), uVar);
                        i15 |= 1;
                        break;
                    case 1:
                        strR = cVarC.r(eVar2, 1);
                        i15 |= 2;
                        break;
                    case 2:
                        strR2 = cVarC.r(eVar2, 2);
                        i15 |= 4;
                        break;
                    case 3:
                        str = (String) cVarC.v(eVar2, 3, y1.f117048a, str);
                        i15 |= 8;
                        break;
                    case 4:
                        str2 = (String) cVarC.v(eVar2, 4, y1.f117048a, str2);
                        i15 |= 16;
                        break;
                    case 5:
                        d14 = (Double) cVarC.v(eVar2, 5, x.f117036a, d14);
                        i15 |= 32;
                        break;
                    case 6:
                        bool = (Boolean) cVarC.v(eVar2, 6, g.f116948a, bool);
                        i15 |= 64;
                        break;
                    default:
                        hb.a.o(iE);
                        return obj;
                }
                obj = null;
            }
            cVarC.b(eVar2);
            return new b(i15, uVar, strR, strR2, str, str2, d14, bool, (u1) null);
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
            l63.d dVarC = fVar.c(eVar);
            i63.c<Object> value = b.f95986h[0].getValue();
            u uVar = bVar.f95987a;
            Boolean bool = bVar.f95993g;
            Double d14 = bVar.f95992f;
            String str = bVar.f95991e;
            String str2 = bVar.f95990d;
            dVarC.e(eVar, 0, value, uVar);
            dVarC.k(eVar, 1, bVar.f95988b);
            dVarC.k(eVar, 2, bVar.f95989c);
            if (dVarC.C(eVar) || str2 != null) {
                dVarC.d(eVar, 3, y1.f117048a, str2);
            }
            if (dVarC.C(eVar) || str != null) {
                dVarC.d(eVar, 4, y1.f117048a, str);
            }
            if (dVarC.C(eVar) || d14 != null) {
                dVarC.d(eVar, 5, x.f117036a, d14);
            }
            if (dVarC.C(eVar) || bool != null) {
                dVarC.d(eVar, 6, g.f116948a, bool);
            }
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ b(int i14, u uVar, String str, String str2, String str3, String str4, Double d14, Boolean bool, u1 u1Var) {
        if (7 != (i14 & 7)) {
            k1.h(i14, 7, a.f95994a.getF158591b());
            throw null;
        }
        this.f95987a = uVar;
        this.f95988b = str;
        this.f95989c = str2;
        if ((i14 & 8) == 0) {
            this.f95990d = null;
        } else {
            this.f95990d = str3;
        }
        if ((i14 & 16) == 0) {
            this.f95991e = null;
        } else {
            this.f95991e = str4;
        }
        if ((i14 & 32) == 0) {
            this.f95992f = null;
        } else {
            this.f95992f = d14;
        }
        if ((i14 & 64) == 0) {
            this.f95993g = null;
        } else {
            this.f95993g = bool;
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
        return this.f95987a == bVar.f95987a && s.g(this.f95988b, bVar.f95988b) && s.g(this.f95989c, bVar.f95989c) && s.g(this.f95990d, bVar.f95990d) && s.g(this.f95991e, bVar.f95991e) && s.g(this.f95992f, bVar.f95992f) && s.g(this.f95993g, bVar.f95993g);
    }

    public final int hashCode() {
        int iJ = wr.g.j(wr.g.j(this.f95987a.hashCode() * 31, 31, this.f95988b), 31, this.f95989c);
        String str = this.f95990d;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f95991e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d14 = this.f95992f;
        int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Boolean bool = this.f95993g;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("IngredientInputDTO(foodSource=");
        sb3.append(this.f95987a);
        sb3.append(", regionCode=");
        sb3.append(this.f95988b);
        sb3.append(", languageCode=");
        sn.a.t(sb3, this.f95989c, ", foodId=", this.f95990d, ", servingId=");
        i.x(sb3, this.f95991e, ", quantity=", this.f95992f, ", deleteIngredient=");
        return p6.b.f(sb3, this.f95993g, ")");
    }

    /* JADX INFO: renamed from: j01.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lj01/b$b;", "", "<init>", "()V", "Li63/c;", "Lj01/b;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final i63.c<b> serializer() {
            return a.f95994a;
        }

        private Companion() {
        }
    }

    public b(u uVar, String str, String str2, String str3, String str4, Double d14, Boolean bool) {
        uVar.getClass();
        str.getClass();
        str2.getClass();
        this.f95987a = uVar;
        this.f95988b = str;
        this.f95989c = str2;
        this.f95990d = str3;
        this.f95991e = str4;
        this.f95992f = d14;
        this.f95993g = bool;
    }

    public /* synthetic */ b(u uVar, String str, String str2, String str3, String str4, Double d14, Boolean bool, int i14, j jVar) {
        this(uVar, str, str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : str4, (i14 & 32) != 0 ? null : d14, (i14 & 64) != 0 ? null : bool);
    }
}
