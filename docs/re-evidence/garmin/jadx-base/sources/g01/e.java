package g01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import m63.k1;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.y1;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u001aBu\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013B}\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0012\u0010\u0017¨\u0006\u001b"}, d2 = {"Lg01/e;", "Lg01/a;", "", "customMealId", "", "name", "", "isFavorite", "", "status", "imageUuid", "", "foods", "Lg01/j;", "mealImages", "Lg01/c0;", "contentSummary", "isRecent", "<init>", "(Ljava/lang/Long;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lg01/c0;Z)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lg01/c0;ZLm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class e extends g01.a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f74154k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f74155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f74156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f74157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f74158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f74159f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<g01.a> f74160g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<j> f74161h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c0 f74162i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f74163j;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/data/model/consumable/CustomMealDTO.$serializer", "Lm63/e0;", "Lg01/e;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements m63.e0<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f74164a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f74164a = aVar;
            m1 m1Var = new m1("MEAL", aVar, 9);
            m1Var.j("customMealId", true);
            m1Var.j("name", false);
            m1Var.j("isFavorite", true);
            m1Var.j("status", true);
            m1Var.j("imageUuid", true);
            m1Var.j("foods", true);
            m1Var.j("mealImages", true);
            m1Var.j("contentSummary", true);
            m1Var.j("isRecent", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = e.f74154k;
            y1 y1Var = y1.f117048a;
            m63.g gVar = m63.g.f116948a;
            return new i63.c[]{j63.a.d(v0.f117027a), y1Var, gVar, j63.a.d(m0.f116981a), j63.a.d(y1Var), lVarArr[5].getValue(), j63.a.d(lVarArr[6].getValue()), j63.a.d(c0.a.f74146a), gVar};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = e.f74154k;
            int i14 = l63.c.f110557a;
            Object obj = null;
            boolean z14 = true;
            c0 c0Var = null;
            Long l14 = null;
            String strR = null;
            Integer num = null;
            String str = null;
            List list = null;
            List list2 = null;
            int i15 = 0;
            boolean zG = false;
            boolean zG2 = false;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        break;
                    case 0:
                        l14 = (Long) cVarC.v(eVar2, 0, v0.f117027a, l14);
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
                        num = (Integer) cVarC.v(eVar2, 3, m0.f116981a, num);
                        i15 |= 8;
                        break;
                    case 4:
                        str = (String) cVarC.v(eVar2, 4, y1.f117048a, str);
                        i15 |= 16;
                        break;
                    case 5:
                        list = (List) cVarC.l(eVar2, 5, lVarArr[5].getValue(), list);
                        i15 |= 32;
                        break;
                    case 6:
                        list2 = (List) cVarC.v(eVar2, 6, lVarArr[6].getValue(), list2);
                        i15 |= 64;
                        break;
                    case 7:
                        c0Var = (c0) cVarC.v(eVar2, 7, c0.a.f74146a, c0Var);
                        i15 |= 128;
                        break;
                    case 8:
                        zG2 = cVarC.g(eVar2, 8);
                        i15 |= 256;
                        break;
                    default:
                        hb.a.o(iE);
                        return obj;
                }
                obj = null;
            }
            cVarC.b(eVar2);
            return new e(i15, l14, strR, zG, num, str, list, list2, c0Var, zG2, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            e eVar = (e) obj;
            eVar.getClass();
            Long l14 = eVar.f74155b;
            k63.e eVar2 = descriptor;
            l63.d dVarC = fVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = e.f74154k;
            if (dVarC.C(eVar2) || l14 != null) {
                dVarC.d(eVar2, 0, v0.f117027a, l14);
            }
            String str = eVar.f74156c;
            boolean z14 = eVar.f74163j;
            c0 c0Var = eVar.f74162i;
            List<j> list = eVar.f74161h;
            List<g01.a> list2 = eVar.f74160g;
            String str2 = eVar.f74159f;
            Integer num = eVar.f74158e;
            boolean z15 = eVar.f74157d;
            dVarC.k(eVar2, 1, str);
            if (dVarC.C(eVar2) || z15) {
                dVarC.n(eVar2, 2, z15);
            }
            if (dVarC.C(eVar2) || num != null) {
                dVarC.d(eVar2, 3, m0.f116981a, num);
            }
            if (dVarC.C(eVar2) || str2 != null) {
                dVarC.d(eVar2, 4, y1.f117048a, str2);
            }
            if (dVarC.C(eVar2) || !p005kotlin.jvm.internal.s.g(list2, j0.f134944a)) {
                dVarC.e(eVar2, 5, lVarArr[5].getValue(), list2);
            }
            if (dVarC.C(eVar2) || list != null) {
                dVarC.d(eVar2, 6, lVarArr[6].getValue(), list);
            }
            if (dVarC.C(eVar2) || c0Var != null) {
                dVarC.d(eVar2, 7, c0.a.f74146a, c0Var);
            }
            if (dVarC.C(eVar2) || z14) {
                dVarC.n(eVar2, 8, z14);
            }
            dVarC.b(eVar2);
        }
    }

    static {
        o13.n nVar = o13.n.PUBLICATION;
        f74154k = new o13.l[]{null, null, null, null, null, o13.m.a(nVar, new fy1.h(15)), o13.m.a(nVar, new fy1.h(16)), null, null};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i14, Long l14, String str, boolean z14, Integer num, String str2, List list, List list2, c0 c0Var, boolean z15, u1 u1Var) {
        super(i14, u1Var);
        if (2 != (i14 & 2)) {
            k1.h(i14, 2, a.f74164a.getF158591b());
            throw null;
        }
        if ((i14 & 1) == 0) {
            this.f74155b = null;
        } else {
            this.f74155b = l14;
        }
        this.f74156c = str;
        if ((i14 & 4) == 0) {
            this.f74157d = false;
        } else {
            this.f74157d = z14;
        }
        if ((i14 & 8) == 0) {
            this.f74158e = null;
        } else {
            this.f74158e = num;
        }
        if ((i14 & 16) == 0) {
            this.f74159f = null;
        } else {
            this.f74159f = str2;
        }
        if ((i14 & 32) == 0) {
            this.f74160g = j0.f134944a;
        } else {
            this.f74160g = list;
        }
        if ((i14 & 64) == 0) {
            this.f74161h = null;
        } else {
            this.f74161h = list2;
        }
        if ((i14 & 128) == 0) {
            this.f74162i = null;
        } else {
            this.f74162i = c0Var;
        }
        if ((i14 & 256) == 0) {
            this.f74163j = false;
        } else {
            this.f74163j = z15;
        }
    }

    @Override // g01.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final b11.a.b a() {
        Long l14;
        c0 c0Var = this.f74162i;
        if (c0Var == null || (l14 = this.f74155b) == null) {
            return null;
        }
        long jLongValue = l14.longValue();
        b11.f fVarA = c0Var.a();
        b11.t.a aVar = b11.t.f14377d;
        Iterable iterable = this.f74161h;
        if (iterable == null) {
            iterable = j0.f134944a;
        }
        aVar.getClass();
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str = ((j) it.next()).f74200a;
            if (str != null) {
                arrayList.add(str);
            }
        }
        b11.t tVar = new b11.t((String) h0.d0(arrayList), (String) h0.d0(arrayList), (String) h0.d0(arrayList));
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it3 = this.f74160g.iterator();
        while (it3.hasNext()) {
            b11.v vVarB = ((g01.a) it3.next()).b();
            if (vVarB != null) {
                arrayList2.add(vVarB);
            }
        }
        return new b11.a.b(null, this.f74157d, null, jLongValue, fVarA, tVar, this.f74159f, this.f74156c, i53.a.j(arrayList2), 5, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return p005kotlin.jvm.internal.s.g(this.f74155b, eVar.f74155b) && p005kotlin.jvm.internal.s.g(this.f74156c, eVar.f74156c) && this.f74157d == eVar.f74157d && p005kotlin.jvm.internal.s.g(this.f74158e, eVar.f74158e) && p005kotlin.jvm.internal.s.g(this.f74159f, eVar.f74159f) && p005kotlin.jvm.internal.s.g(this.f74160g, eVar.f74160g) && p005kotlin.jvm.internal.s.g(this.f74161h, eVar.f74161h) && p005kotlin.jvm.internal.s.g(this.f74162i, eVar.f74162i) && this.f74163j == eVar.f74163j;
    }

    public final int hashCode() {
        Long l14 = this.f74155b;
        int iG = q6.f.g(wr.g.j((l14 == null ? 0 : l14.hashCode()) * 31, 31, this.f74156c), 31, this.f74157d);
        Integer num = this.f74158e;
        int iHashCode = (iG + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f74159f;
        int iB = u0.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f74160g);
        List<j> list = this.f74161h;
        int iHashCode2 = (iB + (list == null ? 0 : list.hashCode())) * 31;
        c0 c0Var = this.f74162i;
        return Boolean.hashCode(this.f74163j) + ((iHashCode2 + (c0Var != null ? c0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbJ = b71.i.j("CustomMealDTO(customMealId=", ", name=", this.f74156c, this.f74155b, ", isFavorite=");
        sbJ.append(this.f74157d);
        sbJ.append(", status=");
        sbJ.append(this.f74158e);
        sbJ.append(", imageUuid=");
        v.e0.o(this.f74159f, ", foods=", ", mealImages=", sbJ, this.f74160g);
        sbJ.append(this.f74161h);
        sbJ.append(", contentSummary=");
        sbJ.append(this.f74162i);
        sbJ.append(", isRecent=");
        return hb.a.k(sbJ, this.f74163j, ")");
    }

    /* JADX INFO: renamed from: g01.e$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg01/e$b;", "", "<init>", "()V", "Li63/c;", "Lg01/e;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<e> serializer() {
            return a.f74164a;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(Long l14, String str, boolean z14, Integer num, String str2, List<? extends g01.a> list, List<j> list2, c0 c0Var, boolean z15) {
        super(null);
        str.getClass();
        list.getClass();
        this.f74155b = l14;
        this.f74156c = str;
        this.f74157d = z14;
        this.f74158e = num;
        this.f74159f = str2;
        this.f74160g = list;
        this.f74161h = list2;
        this.f74162i = c0Var;
        this.f74163j = z15;
    }

    public e(Long l14, String str, boolean z14, Integer num, String str2, List list, List list2, c0 c0Var, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, str, (i14 & 4) != 0 ? false : z14, (i14 & 8) != 0 ? null : num, (i14 & 16) != 0 ? null : str2, (i14 & 32) != 0 ? j0.f134944a : list, (i14 & 64) != 0 ? null : list2, (i14 & 128) != 0 ? null : c0Var, (i14 & 256) != 0 ? false : z15);
    }
}
