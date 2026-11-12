package w63;

import i3.e5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.RandomAccess;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u000bB!\b\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lw63/w;", "Lp13/c;", "Lw63/h;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "byteStrings", "", "trie", "<init>", "([Lw63/h;[I)V", "a", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w extends p13.c<h> implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f183403d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h[] f183404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f183405c;

    private w(h[] hVarArr, int[] iArr) {
        this.f183404b = hVarArr;
        this.f183405c = iArr;
    }

    @Override // p13.a
    /* JADX INFO: renamed from: a */
    public final int getF134973e() {
        return this.f183404b.length;
    }

    @Override // p13.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof h) {
            return super.contains((h) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i14) {
        return this.f183404b[i14];
    }

    @Override // p13.c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof h) {
            return super.indexOf((h) obj);
        }
        return -1;
    }

    @Override // p13.c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof h) {
            return super.lastIndexOf((h) obj);
        }
        return -1;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw63/w$a;", "", "<init>", "()V", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(long j8, e eVar, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
            int i17;
            int i18;
            ArrayList arrayList3;
            long j14;
            int i19;
            int i24 = i14;
            ArrayList arrayList4 = arrayList;
            ArrayList arrayList5 = arrayList2;
            if (i15 >= i16) {
                vb.h.s("Failed requirement.");
                return;
            }
            for (int i25 = i15; i25 < i16; i25++) {
                if (((h) arrayList4.get(i25)).d() < i24) {
                    vb.h.s("Failed requirement.");
                    return;
                }
            }
            h hVar = (h) arrayList.get(i15);
            h hVar2 = (h) arrayList4.get(i16 - 1);
            if (i24 == hVar.d()) {
                int iIntValue = ((Number) arrayList5.get(i15)).intValue();
                int i26 = i15 + 1;
                h hVar3 = (h) arrayList4.get(i26);
                i17 = i26;
                i18 = iIntValue;
                hVar = hVar3;
            } else {
                i17 = i15;
                i18 = -1;
            }
            if (hVar.i(i24) == hVar2.i(i24)) {
                int iMin = Math.min(hVar.d(), hVar2.d());
                int i27 = 0;
                for (int i28 = i24; i28 < iMin && hVar.i(i28) == hVar2.i(i28); i28++) {
                    i27++;
                }
                long j15 = 4;
                long j16 = (eVar.f183349b / j15) + j8 + ((long) 2) + ((long) i27) + 1;
                eVar.L(-i27);
                eVar.L(i18);
                int i29 = i24 + i27;
                while (i24 < i29) {
                    eVar.L(hVar.i(i24) & 255);
                    i24++;
                }
                if (i17 + 1 == i16) {
                    if (i29 == ((h) arrayList4.get(i17)).d()) {
                        eVar.L(((Number) arrayList5.get(i17)).intValue());
                        return;
                    } else {
                        vb.h.z("Check failed.");
                        return;
                    }
                }
                e eVar2 = new e();
                eVar.L(((int) ((eVar2.f183349b / j15) + j16)) * (-1));
                a(j16, eVar2, i29, arrayList4, i17, i16, arrayList5);
                eVar.G3(eVar2);
                return;
            }
            int i30 = 1;
            for (int i34 = i17 + 1; i34 < i16; i34++) {
                if (((h) arrayList4.get(i34 - 1)).i(i24) != ((h) arrayList4.get(i34)).i(i24)) {
                    i30++;
                }
            }
            long j17 = 4;
            long j18 = (eVar.f183349b / j17) + j8 + ((long) 2) + ((long) (i30 * 2));
            eVar.L(i30);
            eVar.L(i18);
            for (int i35 = i17; i35 < i16; i35++) {
                int i36 = ((h) arrayList4.get(i35)).i(i24);
                if (i35 == i17 || i36 != ((h) arrayList4.get(i35 - 1)).i(i24)) {
                    eVar.L(i36 & 255);
                }
            }
            e eVar3 = new e();
            int i37 = i17;
            while (i37 < i16) {
                byte bI = ((h) arrayList4.get(i37)).i(i24);
                int i38 = i37 + 1;
                int i39 = i38;
                while (true) {
                    if (i39 >= i16) {
                        i39 = i16;
                        break;
                    } else if (bI != ((h) arrayList4.get(i39)).i(i24)) {
                        break;
                    } else {
                        i39++;
                    }
                }
                if (i38 == i39 && i24 + 1 == ((h) arrayList4.get(i37)).d()) {
                    eVar.L(((Number) arrayList5.get(i37)).intValue());
                    arrayList3 = arrayList5;
                    j14 = j18;
                    i19 = i39;
                } else {
                    eVar.L(((int) ((eVar3.f183349b / j17) + j18)) * (-1));
                    arrayList3 = arrayList5;
                    j14 = j18;
                    i19 = i39;
                    a(j14, eVar3, i24 + 1, arrayList, i37, i19, arrayList3);
                    arrayList4 = arrayList;
                }
                j18 = j14;
                i37 = i19;
                arrayList5 = arrayList3;
            }
            eVar.G3(eVar3);
        }

        public static w b(h... hVarArr) {
            p005kotlin.jvm.internal.j jVar = null;
            if (hVarArr.length == 0) {
                return new w(new h[0], new int[]{0, -1}, jVar);
            }
            ArrayList arrayListL0 = p13.u.l0(hVarArr);
            p13.c0.t(arrayListL0);
            int size = arrayListL0.size();
            ArrayList arrayList = new ArrayList(size);
            for (int iD = 0; iD < size; iD = e5.d(-1, iD, arrayList, 1)) {
            }
            int length = hVarArr.length;
            int i14 = 0;
            int i15 = 0;
            while (i14 < length) {
                arrayList.set(p13.x.g(arrayListL0, hVarArr[i14]), Integer.valueOf(i15));
                i14++;
                i15++;
            }
            if (((h) arrayListL0.get(0)).d() <= 0) {
                vb.h.s("the empty byte string is not a supported option");
                return null;
            }
            int i16 = 0;
            while (i16 < arrayListL0.size()) {
                h hVar = (h) arrayListL0.get(i16);
                int i17 = i16 + 1;
                int i18 = i17;
                while (i18 < arrayListL0.size()) {
                    h hVar2 = (h) arrayListL0.get(i18);
                    hVar2.getClass();
                    hVar.getClass();
                    if (!hVar2.n(0, hVar, hVar.d())) {
                        break;
                    }
                    if (hVar2.d() == hVar.d()) {
                        vb.h.y(hVar2, "duplicate option: ");
                        return null;
                    }
                    if (((Number) arrayList.get(i18)).intValue() > ((Number) arrayList.get(i16)).intValue()) {
                        arrayListL0.remove(i18);
                        ((Number) arrayList.remove(i18)).intValue();
                    } else {
                        i18++;
                    }
                }
                i16 = i17;
            }
            e eVar = new e();
            a(0L, eVar, 0, arrayListL0, 0, arrayListL0.size(), arrayList);
            int i19 = (int) (eVar.f183349b / ((long) 4));
            int[] iArr = new int[i19];
            for (int i24 = 0; i24 < i19; i24++) {
                iArr[i24] = eVar.readInt();
            }
            return new w((h[]) Arrays.copyOf(hVarArr, hVarArr.length), iArr, jVar);
        }

        private a() {
        }
    }

    public /* synthetic */ w(h[] hVarArr, int[] iArr, p005kotlin.jvm.internal.j jVar) {
        this(hVarArr, iArr);
    }
}
