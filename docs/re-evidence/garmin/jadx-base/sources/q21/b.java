package q21;

import androidx.lifecycle.u1;
import g01.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.u;
import p005kotlin.Metadata;
import p13.j0;
import p13.x;
import p13.y;
import r53.b2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lq21/b;", "Landroidx/lifecycle/u1;", "", "dailyCaloriesGoal", "", "initialPercentages", "Lg01/z;", "initialMeals", "Lm01/g;", "nutritionRepository", "Ld01/c;", "nutritionStore", "Ls01/f;", "nutritionSettingsConfigProvider", "<init>", "(Ljava/lang/Integer;Ljava/util/List;Lg01/z;Lm01/g;Ld01/c;Ls01/f;)V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Integer> f142210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f142211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m01.g f142212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d01.c f142213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s01.f f142214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f142215f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b2 f142216g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final double f142217h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final double f142218i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final double f142219j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b11.j f142220k;

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(Integer num, List<Integer> list, z zVar, m01.g gVar, d01.c cVar, s01.f fVar) {
        list.getClass();
        gVar.getClass();
        cVar.getClass();
        fVar.getClass();
        this.f142210a = list;
        this.f142211b = zVar;
        this.f142212c = gVar;
        this.f142213d = cVar;
        this.f142214e = fVar;
        Iterable iterable = (zVar == null || (iterable = zVar.f74294a) == null) ? j0.f134944a : iterable;
        ArrayList arrayList = new ArrayList();
        int i14 = 0;
        for (Object obj : iterable) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            o21.d dVarR = gg.b.R((g01.x) obj, list.get(i14).intValue());
            if (dVarR != null) {
                arrayList.add(dVarR);
            }
            i14 = i15;
        }
        p2 p2VarA = q2.a(new q21.a(num, arrayList, false, false, false, false, 60, null));
        this.f142215f = p2VarA;
        this.f142216g = r53.s.d(p2VarA);
        this.f142220k = new b11.j(0, 0, 0, 7, null);
        v21.f fVar2 = v21.f.f175333a;
        List<o21.d> list2 = ((q21.a) p2VarA.getValue()).f142203b;
        fVar2.getClass();
        list2.getClass();
        Iterator<T> it = list2.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            Double d14 = ((o21.d) it.next()).f128662e;
            dDoubleValue += d14 != null ? d14.doubleValue() : 0.0d;
        }
        Iterator<T> it3 = list2.iterator();
        double dDoubleValue2 = 0.0d;
        while (it3.hasNext()) {
            Double d15 = ((o21.d) it3.next()).f128663f;
            dDoubleValue2 += d15 != null ? d15.doubleValue() : 0.0d;
        }
        Iterator<T> it4 = list2.iterator();
        double dDoubleValue3 = 0.0d;
        while (it4.hasNext()) {
            Double d16 = ((o21.d) it4.next()).f128664g;
            dDoubleValue3 += d16 != null ? d16.doubleValue() : 0.0d;
        }
        u uVar = new u(Double.valueOf(dDoubleValue), Double.valueOf(dDoubleValue2), Double.valueOf(dDoubleValue3));
        double dDoubleValue4 = ((Number) uVar.f128605a).doubleValue();
        double dDoubleValue5 = ((Number) uVar.f128606b).doubleValue();
        double dDoubleValue6 = ((Number) uVar.f128607c).doubleValue();
        this.f142217h = dDoubleValue4;
        this.f142218i = dDoubleValue5;
        this.f142219j = dDoubleValue6;
        Double dValueOf = Double.valueOf(4.0d);
        v21.f fVar3 = v21.f.f175333a;
        double d17 = this.f142217h;
        double d18 = this.f142218i;
        double d19 = this.f142219j;
        fVar3.getClass();
        double d24 = (d19 * 4.0d) + (d18 * 9.0d) + (d17 * 4.0d);
        if (d24 == 0.0d) {
            return;
        }
        List<o13.p> listK = x.k(new o13.p(Double.valueOf(this.f142217h), dValueOf), new o13.p(Double.valueOf(this.f142218i), Double.valueOf(9.0d)), new o13.p(Double.valueOf(this.f142219j), dValueOf));
        ArrayList arrayList2 = new ArrayList(y.r(listK, 10));
        for (o13.p pVar : listK) {
            arrayList2.add(Double.valueOf(((((Number) pVar.f128595b).doubleValue() * ((Number) pVar.f128594a).doubleValue()) / d24) * 100.0d));
        }
        v21.f.f175333a.getClass();
        ArrayList arrayListG = v21.f.g(arrayList2);
        this.f142220k = new b11.j(((Number) arrayListG.get(2)).intValue(), ((Number) arrayListG.get(0)).intValue(), ((Number) arrayListG.get(1)).intValue());
    }

    public final ArrayList x4(int i14, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Double.valueOf((((double) ((o21.d) it.next()).f128660c) / 100.0d) * ((double) i14)));
        }
        v21.f.f175333a.getClass();
        ArrayList arrayListH = v21.f.h(i14, arrayList2);
        ArrayList arrayList3 = new ArrayList(y.r(arrayList, 10));
        int i15 = 0;
        int i16 = 0;
        for (Object obj : arrayList) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                x.q();
                throw null;
            }
            arrayList3.add(o21.d.a((o21.d) obj, 0, (Integer) arrayListH.get(i16), null, null, null, 119));
            i16 = i17;
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            Integer num = ((o21.d) it3.next()).f128661d;
            double dIntValue = num != null ? num.intValue() : 0.0d;
            b11.j jVar = this.f142220k;
            arrayList4.add(Double.valueOf(((((double) jVar.f14323b) / 100.0d) * dIntValue) / 4.0d));
            arrayList5.add(Double.valueOf(((((double) jVar.f14324c) / 100.0d) * dIntValue) / 9.0d));
            arrayList6.add(Double.valueOf(((((double) jVar.f14322a) / 100.0d) * dIntValue) / 4.0d));
        }
        u uVar = new u(arrayList4, arrayList5, arrayList6);
        List list = (List) uVar.f128605a;
        List list2 = (List) uVar.f128606b;
        List list3 = (List) uVar.f128607c;
        v21.f fVar = v21.f.f175333a;
        int i18 = (int) this.f142217h;
        fVar.getClass();
        ArrayList arrayListH2 = v21.f.h(i18, list);
        ArrayList arrayListH3 = v21.f.h((int) this.f142218i, list2);
        ArrayList arrayListH4 = v21.f.h((int) this.f142219j, list3);
        ArrayList arrayList7 = new ArrayList(y.r(arrayList3, 10));
        for (Object obj2 : arrayList3) {
            int i19 = i15 + 1;
            if (i15 < 0) {
                x.q();
                throw null;
            }
            arrayList7.add(o21.d.a((o21.d) obj2, 0, null, Double.valueOf(((Number) arrayListH2.get(i15)).intValue()), Double.valueOf(((Number) arrayListH3.get(i15)).intValue()), Double.valueOf(((Number) arrayListH4.get(i15)).intValue()), 15));
            i15 = i19;
        }
        return arrayList7;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lq21/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
