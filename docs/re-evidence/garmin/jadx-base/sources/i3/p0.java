package i3;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class p0 implements f5.e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mc f89254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a<Float> f89255b;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f89256a;

        static {
            int[] iArr = new int[pc.values().length];
            try {
                iArr[pc.PartiallyExpanded.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pc.Expanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pc.Hidden.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f89256a = iArr;
        }
    }

    public p0(mc mcVar, e23.a<Float> aVar) {
        this.f89254a = mcVar;
        this.f89255b = aVar;
    }

    @Override // f5.e1
    public final f5.a1 f(f5.b1 b1Var, List<? extends List<? extends f5.y0>> list, long j8) {
        Integer numValueOf;
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        int i14 = 1;
        List list3 = (List) arrayList.get(1);
        List list4 = (List) arrayList.get(2);
        List list5 = (List) arrayList.get(3);
        final int iJ = g6.a.j(j8);
        final int i15 = g6.a.i(j8);
        long jC = g6.a.c(0, 0, 0, 0, 10, j8);
        final ArrayList arrayList2 = new ArrayList(list4.size());
        int size = list4.size();
        for (int i16 = 0; i16 < size; i16++) {
            arrayList2.add(((f5.y0) list4.get(i16)).Q(jC));
        }
        final ArrayList arrayList3 = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i17 = 0; i17 < size2; i17++) {
            arrayList3.add(((f5.y0) list2.get(i17)).Q(jC));
        }
        if (!arrayList3.isEmpty()) {
            numValueOf = Integer.valueOf(((f5.v1) arrayList3.get(0)).f69145b);
            int size3 = arrayList3.size() - 1;
            if (1 <= size3) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((f5.v1) arrayList3.get(i14)).f69145b);
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i14 == size3) {
                        break;
                    }
                    i14++;
                }
            }
        } else {
            numValueOf = null;
        }
        final int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        long jC2 = g6.a.c(0, 0, 0, i15 - iIntValue, 7, jC);
        final ArrayList arrayList4 = new ArrayList(list3.size());
        int size4 = list3.size();
        for (int i18 = 0; i18 < size4; i18++) {
            arrayList4.add(((f5.y0) list3.get(i18)).Q(jC2));
        }
        final ArrayList arrayList5 = new ArrayList(list5.size());
        int size5 = list5.size();
        for (int i19 = 0; i19 < size5; i19++) {
            arrayList5.add(((f5.y0) list5.get(i19)).Q(jC));
        }
        final mc mcVar = this.f89254a;
        final e23.a<Float> aVar = this.f89255b;
        return f5.b1.h0(b1Var, iJ, i15, new e23.l() { // from class: i3.o0
            @Override // e23.l
            public final Object invoke(Object obj) {
                Integer numValueOf3;
                Integer numValueOf4;
                int iC;
                f5.v1.a aVar2 = (f5.v1.a) obj;
                ArrayList arrayList6 = arrayList2;
                Integer numValueOf5 = null;
                if (!arrayList6.isEmpty()) {
                    numValueOf3 = Integer.valueOf(((f5.v1) arrayList6.get(0)).f69144a);
                    int size6 = arrayList6.size() - 1;
                    if (1 <= size6) {
                        int i24 = 1;
                        while (true) {
                            Integer numValueOf6 = Integer.valueOf(((f5.v1) arrayList6.get(i24)).f69144a);
                            if (numValueOf6.compareTo(numValueOf3) > 0) {
                                numValueOf3 = numValueOf6;
                            }
                            if (i24 == size6) {
                                break;
                            }
                            i24++;
                        }
                    }
                } else {
                    numValueOf3 = null;
                }
                int iIntValue2 = numValueOf3 != null ? numValueOf3.intValue() : 0;
                int i25 = iJ;
                int iMax = Math.max(0, (i25 - iIntValue2) / 2);
                ArrayList arrayList7 = arrayList5;
                if (!arrayList7.isEmpty()) {
                    numValueOf4 = Integer.valueOf(((f5.v1) arrayList7.get(0)).f69144a);
                    int size7 = arrayList7.size() - 1;
                    if (1 <= size7) {
                        int i26 = 1;
                        while (true) {
                            Integer numValueOf7 = Integer.valueOf(((f5.v1) arrayList7.get(i26)).f69144a);
                            if (numValueOf7.compareTo(numValueOf4) > 0) {
                                numValueOf4 = numValueOf7;
                            }
                            if (i26 == size7) {
                                break;
                            }
                            i26++;
                        }
                    }
                } else {
                    numValueOf4 = null;
                }
                int iIntValue3 = numValueOf4 != null ? numValueOf4.intValue() : 0;
                if (!arrayList7.isEmpty()) {
                    numValueOf5 = Integer.valueOf(((f5.v1) arrayList7.get(0)).f69145b);
                    int size8 = arrayList7.size() - 1;
                    if (1 <= size8) {
                        int i27 = 1;
                        while (true) {
                            Integer numValueOf8 = Integer.valueOf(((f5.v1) arrayList7.get(i27)).f69145b);
                            if (numValueOf8.compareTo(numValueOf5) > 0) {
                                numValueOf5 = numValueOf8;
                            }
                            if (i27 == size8) {
                                break;
                            }
                            i27++;
                        }
                    }
                }
                int iIntValue4 = numValueOf5 != null ? numValueOf5.intValue() : 0;
                int i28 = (i25 - iIntValue3) / 2;
                int i29 = p0.a.f89256a[mcVar.c().ordinal()];
                if (i29 == 1) {
                    iC = MathKt.c(((Number) aVar.invoke()).floatValue());
                } else {
                    if (i29 != 2 && i29 != 3) {
                        lc.u0.r();
                        return null;
                    }
                    iC = i15;
                }
                int i30 = iC - iIntValue4;
                ArrayList arrayList8 = arrayList4;
                int size9 = arrayList8.size();
                for (int i34 = 0; i34 < size9; i34++) {
                    f5.v1.a.B(aVar2, (f5.v1) arrayList8.get(i34), 0, iIntValue);
                }
                ArrayList arrayList9 = arrayList3;
                int size10 = arrayList9.size();
                for (int i35 = 0; i35 < size10; i35++) {
                    f5.v1.a.B(aVar2, (f5.v1) arrayList9.get(i35), 0, 0);
                }
                int size11 = arrayList6.size();
                for (int i36 = 0; i36 < size11; i36++) {
                    f5.v1.a.B(aVar2, (f5.v1) arrayList6.get(i36), iMax, 0);
                }
                int size12 = arrayList7.size();
                for (int i37 = 0; i37 < size12; i37++) {
                    f5.v1.a.B(aVar2, (f5.v1) arrayList7.get(i37), i28, i30);
                }
                return Unit.INSTANCE;
            }
        });
    }
}
