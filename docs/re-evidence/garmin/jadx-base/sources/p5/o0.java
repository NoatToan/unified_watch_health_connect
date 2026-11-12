package p5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Comparator<y>[] f136051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f136052b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp5/y;", "a", "b", "", "invoke", "(Lp5/y;Lp5/y;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a extends p005kotlin.jvm.internal.w implements e23.p<y, y, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f136053a = new a();

        public a() {
            super(2);
        }

        @Override // e23.p
        public final Integer invoke(y yVar, y yVar2) {
            q qVar = yVar.f136098d;
            d0.f135959a.getClass();
            j0<Float> j0Var = d0.f135980v;
            return Integer.valueOf(Float.compare(((Number) qVar.d(j0Var, m0.f136045a)).floatValue(), ((Number) yVar2.f136098d.d(j0Var, n0.f136049a)).floatValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f136054a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Comparator f136055b;

        public b(Comparator comparator, Comparator comparator2) {
            this.f136054a = comparator;
            this.f136055b = comparator2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            int iCompare = this.f136054a.compare(t7, t14);
            if (iCompare != 0) {
                return iCompare;
            }
            return this.f136055b.compare(((y) t7).f136097c, ((y) t14).f136097c);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f136056a;

        public c(Comparator comparator) {
            this.f136056a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            int iCompare = this.f136056a.compare(t7, t14);
            return iCompare != 0 ? iCompare : r13.a.b(Integer.valueOf(((y) t7).f136100f), Integer.valueOf(((y) t14).f136100f));
        }
    }

    static {
        Comparator<y>[] comparatorArr = new Comparator[2];
        int i14 = 0;
        while (i14 < 2) {
            Comparator comparator = i14 == 0 ? m.f136044a : j.f136021a;
            h5.e0.N0.getClass();
            comparatorArr[i14] = new c(new b(comparator, h5.e0.R0));
            i14++;
        }
        f136051a = comparatorArr;
        f136052b = a.f136053a;
    }

    public static final void a(y yVar, ArrayList arrayList, kotlin.z zVar, kotlin.a0 a0Var, p1.i0 i0Var) {
        q qVar = yVar.f136098d;
        d0.f135959a.getClass();
        boolean zBooleanValue = ((Boolean) qVar.d(d0.f135973o, p0.f136084a)).booleanValue();
        if ((zBooleanValue || ((Boolean) a0Var.invoke(yVar)).booleanValue()) && ((Boolean) zVar.invoke(yVar)).booleanValue()) {
            arrayList.add(yVar);
        }
        if (zBooleanValue) {
            i0Var.i(yVar.f136100f, b(yVar, zVar, a0Var, y.j(7, yVar)));
            return;
        }
        List listJ = y.j(7, yVar);
        int size = listJ.size();
        for (int i14 = 0; i14 < size; i14++) {
            a((y) listJ.get(i14), arrayList, zVar, a0Var, i0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d2  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList b(y yVar, kotlin.z zVar, kotlin.a0 a0Var, List list) {
        int i14;
        p1.i0 i0VarA = p1.o.a();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            a((y) list.get(i15), arrayList, zVar, a0Var, i0VarA);
        }
        int i16 = 1;
        char c14 = yVar.f136097c.B == g6.o.Rtl ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int i17 = 0;
            while (true) {
                y yVar2 = (y) arrayList.get(i17);
                if (i17 == 0) {
                    i14 = i16;
                    arrayList2.add(new o13.p(yVar2.h(), p13.x.m(yVar2)));
                    break;
                }
                float f14 = yVar2.h().f123548b;
                float f15 = yVar2.h().f123550d;
                int i18 = f14 >= f15 ? i16 : 0;
                int size3 = arrayList2.size() - i16;
                if (size3 >= 0) {
                    int i19 = 0;
                    while (true) {
                        n4.d dVar = (n4.d) ((o13.p) arrayList2.get(i19)).f128594a;
                        float f16 = dVar.f123548b;
                        i14 = i16;
                        float f17 = dVar.f123550d;
                        int i24 = f16 >= f17 ? i14 : 0;
                        if (i18 == 0 && i24 == 0 && Math.max(f14, f16) < Math.min(f15, f17)) {
                            arrayList2.set(i19, new o13.p(new n4.d(Math.max(dVar.f123547a, 0.0f), Math.max(dVar.f123548b, f14), Math.min(dVar.f123549c, Float.POSITIVE_INFINITY), Math.min(f17, f15)), ((o13.p) arrayList2.get(i19)).f128595b));
                            ((List) ((o13.p) arrayList2.get(i19)).f128595b).add(yVar2);
                            break;
                        }
                        if (i19 != size3) {
                            i19++;
                            i16 = i14;
                        }
                    }
                } else {
                    i14 = i16;
                }
                arrayList2.add(new o13.p(yVar2.h(), p13.x.m(yVar2)));
                break;
                if (i17 == size2) {
                    break;
                }
                i17++;
                i16 = i14;
            }
        }
        p13.c0.u(arrayList2, q0.f136090a);
        ArrayList arrayList3 = new ArrayList();
        Comparator<y> comparator = f136051a[c14 ^ 1];
        int size4 = arrayList2.size();
        for (int i25 = 0; i25 < size4; i25++) {
            o13.p pVar = (o13.p) arrayList2.get(i25);
            p13.c0.u((List) pVar.f128595b, comparator);
            arrayList3.addAll((Collection) pVar.f128595b);
        }
        p13.c0.u(arrayList3, new l0(f136052b, 0));
        int size5 = 0;
        while (size5 <= arrayList3.size() - 1) {
            List list2 = (List) i0VarA.b(((y) arrayList3.get(size5)).f136100f);
            if (list2 != null) {
                if (((Boolean) a0Var.invoke(arrayList3.get(size5))).booleanValue()) {
                    size5++;
                } else {
                    arrayList3.remove(size5);
                }
                arrayList3.addAll(size5, list2);
                size5 += list2.size();
            } else {
                size5++;
            }
        }
        return arrayList3;
    }
}
