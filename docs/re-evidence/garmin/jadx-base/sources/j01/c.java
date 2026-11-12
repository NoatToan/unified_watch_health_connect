package j01;

import b71.i;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import g01.c0;
import g01.j;
import i63.h;
import java.util.List;
import l63.f;
import m63.e0;
import m63.g;
import m63.k1;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.x;
import m63.y1;
import o13.e;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001fB\u0091\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018B¥\u0001\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0017\u0010\u001c¨\u0006 "}, d2 = {"Lj01/c;", "", "", "recipeId", "", "foodId", "recipeName", "brandName", "", "yield", "notes", "regionCode", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "", "Lg01/a;", "ingredients", "Lg01/c0;", "nutritionContent", "Lg01/j;", "images", "", "isFavorite", "isInactive", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lg01/c0;Ljava/util/List;ZZ)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lg01/c0;Ljava/util/List;ZZLm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class c {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f95995n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f95996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f95997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f95998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f95999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f96000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f96001f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f96002g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f96003h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<g01.a> f96004i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c0 f96005j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<j> f96006k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f96007l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f96008m;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/data/model/recipe/RecipeDTO.$serializer", "Lm63/e0;", "Lj01/c;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @e
    public static final /* synthetic */ class a implements e0<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f96009a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f96009a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.data.model.recipe.RecipeDTO", aVar, 13);
            m1Var.j("recipeId", false);
            m1Var.j("foodId", false);
            m1Var.j("recipeName", false);
            m1Var.j("brandName", false);
            m1Var.j("yield", false);
            m1Var.j("notes", false);
            m1Var.j("regionCode", false);
            m1Var.j(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, false);
            m1Var.j("ingredients", false);
            m1Var.j("nutritionContent", false);
            m1Var.j("foodImages", false);
            m1Var.j("isFavorite", true);
            m1Var.j("isInactive", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            l<i63.c<Object>>[] lVarArr = c.f95995n;
            i63.c<?> cVarD = j63.a.d(m0.f116981a);
            y1 y1Var = y1.f117048a;
            i63.c<?> cVarD2 = j63.a.d(y1Var);
            i63.c<?> cVarD3 = j63.a.d(y1Var);
            i63.c<?> cVarD4 = j63.a.d(y1Var);
            i63.c<?> cVarD5 = j63.a.d(x.f117036a);
            i63.c<?> cVarD6 = j63.a.d(y1Var);
            i63.c<?> cVarD7 = j63.a.d(lVarArr[8].getValue());
            i63.c<?> cVarD8 = j63.a.d(c0.a.f74146a);
            i63.c<?> cVarD9 = j63.a.d(lVarArr[10].getValue());
            g gVar = g.f116948a;
            return new i63.c[]{cVarD, cVarD2, cVarD3, cVarD4, cVarD5, cVarD6, y1Var, y1Var, cVarD7, cVarD8, cVarD9, gVar, gVar};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            l<i63.c<Object>>[] lVarArr;
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            l<i63.c<Object>>[] lVarArr2 = c.f95995n;
            int i14 = l63.c.f110557a;
            List list = null;
            c0 c0Var = null;
            boolean z14 = true;
            List list2 = null;
            int i15 = 0;
            Integer num = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            Double d14 = null;
            String str4 = null;
            String strR = null;
            String strR2 = null;
            boolean zG = false;
            boolean zG2 = false;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        continue;
                    case 0:
                        lVarArr = lVarArr2;
                        num = (Integer) cVarC.v(eVar2, 0, m0.f116981a, num);
                        i15 |= 1;
                        break;
                    case 1:
                        lVarArr = lVarArr2;
                        str = (String) cVarC.v(eVar2, 1, y1.f117048a, str);
                        i15 |= 2;
                        break;
                    case 2:
                        lVarArr = lVarArr2;
                        str2 = (String) cVarC.v(eVar2, 2, y1.f117048a, str2);
                        i15 |= 4;
                        break;
                    case 3:
                        lVarArr = lVarArr2;
                        str3 = (String) cVarC.v(eVar2, 3, y1.f117048a, str3);
                        i15 |= 8;
                        break;
                    case 4:
                        lVarArr = lVarArr2;
                        d14 = (Double) cVarC.v(eVar2, 4, x.f117036a, d14);
                        i15 |= 16;
                        break;
                    case 5:
                        lVarArr = lVarArr2;
                        str4 = (String) cVarC.v(eVar2, 5, y1.f117048a, str4);
                        i15 |= 32;
                        break;
                    case 6:
                        lVarArr = lVarArr2;
                        strR = cVarC.r(eVar2, 6);
                        i15 |= 64;
                        break;
                    case 7:
                        lVarArr = lVarArr2;
                        strR2 = cVarC.r(eVar2, 7);
                        i15 |= 128;
                        break;
                    case 8:
                        lVarArr = lVarArr2;
                        list2 = (List) cVarC.v(eVar2, 8, lVarArr[8].getValue(), list2);
                        i15 |= 256;
                        break;
                    case 9:
                        lVarArr = lVarArr2;
                        c0Var = (c0) cVarC.v(eVar2, 9, c0.a.f74146a, c0Var);
                        i15 |= 512;
                        break;
                    case 10:
                        lVarArr = lVarArr2;
                        list = (List) cVarC.v(eVar2, 10, lVarArr2[10].getValue(), list);
                        i15 |= 1024;
                        break;
                    case 11:
                        zG = cVarC.g(eVar2, 11);
                        i15 |= 2048;
                        continue;
                    case 12:
                        zG2 = cVarC.g(eVar2, 12);
                        i15 |= 4096;
                        continue;
                    default:
                        hb.a.o(iE);
                        return null;
                }
                lVarArr2 = lVarArr;
            }
            cVarC.b(eVar2);
            return new c(i15, num, str, str2, str3, d14, str4, strR, strR2, list2, c0Var, list, zG, zG2, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(f fVar, Object obj) {
            c cVar = (c) obj;
            cVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            l<i63.c<Object>>[] lVarArr = c.f95995n;
            m0 m0Var = m0.f116981a;
            Integer num = cVar.f95996a;
            boolean z14 = cVar.f96008m;
            boolean z15 = cVar.f96007l;
            dVarC.d(eVar, 0, m0Var, num);
            y1 y1Var = y1.f117048a;
            dVarC.d(eVar, 1, y1Var, cVar.f95997b);
            dVarC.d(eVar, 2, y1Var, cVar.f95998c);
            dVarC.d(eVar, 3, y1Var, cVar.f95999d);
            dVarC.d(eVar, 4, x.f117036a, cVar.f96000e);
            dVarC.d(eVar, 5, y1Var, cVar.f96001f);
            dVarC.k(eVar, 6, cVar.f96002g);
            dVarC.k(eVar, 7, cVar.f96003h);
            dVarC.d(eVar, 8, lVarArr[8].getValue(), cVar.f96004i);
            dVarC.d(eVar, 9, c0.a.f74146a, cVar.f96005j);
            dVarC.d(eVar, 10, lVarArr[10].getValue(), cVar.f96006k);
            if (dVarC.C(eVar) || z15) {
                dVarC.n(eVar, 11, z15);
            }
            if (dVarC.C(eVar) || z14) {
                dVarC.n(eVar, 12, z14);
            }
            dVarC.b(eVar);
        }
    }

    static {
        n nVar = n.PUBLICATION;
        f95995n = new l[]{null, null, null, null, null, null, null, null, m.a(nVar, new ik2.b(20)), null, m.a(nVar, new ik2.b(21)), null, null};
    }

    public /* synthetic */ c(int i14, Integer num, String str, String str2, String str3, Double d14, String str4, String str5, String str6, List list, c0 c0Var, List list2, boolean z14, boolean z15, u1 u1Var) {
        if (2047 != (i14 & 2047)) {
            k1.h(i14, 2047, a.f96009a.getF158591b());
            throw null;
        }
        this.f95996a = num;
        this.f95997b = str;
        this.f95998c = str2;
        this.f95999d = str3;
        this.f96000e = d14;
        this.f96001f = str4;
        this.f96002g = str5;
        this.f96003h = str6;
        this.f96004i = list;
        this.f96005j = c0Var;
        this.f96006k = list2;
        if ((i14 & 2048) == 0) {
            this.f96007l = false;
        } else {
            this.f96007l = z14;
        }
        if ((i14 & 4096) == 0) {
            this.f96008m = false;
        } else {
            this.f96008m = z15;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f95996a, cVar.f95996a) && s.g(this.f95997b, cVar.f95997b) && s.g(this.f95998c, cVar.f95998c) && s.g(this.f95999d, cVar.f95999d) && s.g(this.f96000e, cVar.f96000e) && s.g(this.f96001f, cVar.f96001f) && s.g(this.f96002g, cVar.f96002g) && s.g(this.f96003h, cVar.f96003h) && s.g(this.f96004i, cVar.f96004i) && s.g(this.f96005j, cVar.f96005j) && s.g(this.f96006k, cVar.f96006k) && this.f96007l == cVar.f96007l && this.f96008m == cVar.f96008m;
    }

    public final int hashCode() {
        Integer num = this.f95996a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f95997b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f95998c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f95999d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d14 = this.f96000e;
        int iHashCode5 = (iHashCode4 + (d14 == null ? 0 : d14.hashCode())) * 31;
        String str4 = this.f96001f;
        int iJ = wr.g.j(wr.g.j((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f96002g), 31, this.f96003h);
        List<g01.a> list = this.f96004i;
        int iHashCode6 = (iJ + (list == null ? 0 : list.hashCode())) * 31;
        c0 c0Var = this.f96005j;
        int iHashCode7 = (iHashCode6 + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        List<j> list2 = this.f96006k;
        return Boolean.hashCode(this.f96008m) + q6.f.g((iHashCode7 + (list2 != null ? list2.hashCode() : 0)) * 31, 31, this.f96007l);
    }

    public final String toString() {
        StringBuilder sbF = l2.f("RecipeDTO(recipeId=", this.f95996a, ", foodId=", this.f95997b, ", recipeName=");
        sn.a.t(sbF, this.f95998c, ", brandName=", this.f95999d, ", yield=");
        i.u(sbF, this.f96000e, ", notes=", this.f96001f, ", regionCode=");
        sn.a.t(sbF, this.f96002g, ", languageCode=", this.f96003h, ", ingredients=");
        sbF.append(this.f96004i);
        sbF.append(", nutritionContent=");
        sbF.append(this.f96005j);
        sbF.append(", images=");
        sbF.append(this.f96006k);
        sbF.append(", isFavorite=");
        sbF.append(this.f96007l);
        sbF.append(", isInactive=");
        return hb.a.k(sbF, this.f96008m, ")");
    }

    /* JADX INFO: renamed from: j01.c$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lj01/c$b;", "", "<init>", "()V", "Li63/c;", "Lj01/c;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<c> serializer() {
            return a.f96009a;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(Integer num, String str, String str2, String str3, Double d14, String str4, String str5, String str6, List<? extends g01.a> list, c0 c0Var, List<j> list2, boolean z14, boolean z15) {
        str5.getClass();
        str6.getClass();
        this.f95996a = num;
        this.f95997b = str;
        this.f95998c = str2;
        this.f95999d = str3;
        this.f96000e = d14;
        this.f96001f = str4;
        this.f96002g = str5;
        this.f96003h = str6;
        this.f96004i = list;
        this.f96005j = c0Var;
        this.f96006k = list2;
        this.f96007l = z14;
        this.f96008m = z15;
    }

    public /* synthetic */ c(Integer num, String str, String str2, String str3, Double d14, String str4, String str5, String str6, List list, c0 c0Var, List list2, boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this(num, str, str2, str3, d14, str4, str5, str6, list, c0Var, list2, (i14 & 2048) != 0 ? false : z14, (i14 & 4096) != 0 ? false : z15);
    }
}
