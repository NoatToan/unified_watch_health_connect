package androidx.recyclerview.widget;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f10558a = new a();

    public class a implements Comparator<d> {
        @Override // java.util.Comparator
        public final int compare(d dVar, d dVar2) {
            return dVar.f10561a - dVar2.f10561a;
        }
    }

    public static abstract class b {
        public abstract boolean a(int i14, int i15);

        public abstract boolean b(int i14, int i15);

        public Object c(int i14, int i15) {
            return null;
        }

        public abstract int d();

        public abstract int e();
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f10559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10560b;

        public c(int i14) {
            int[] iArr = new int[i14];
            this.f10559a = iArr;
            this.f10560b = iArr.length / 2;
        }

        public final int a(int i14) {
            return this.f10559a[i14 + this.f10560b];
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f10563c;

        public d(int i14, int i15, int i16) {
            this.f10561a = i14;
            this.f10562b = i15;
            this.f10563c = i16;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<d> f10564a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f10565b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f10566c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f10567d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f10568e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f10569f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f10570g;

        public e(b bVar, List<d> list, int[] iArr, int[] iArr2, boolean z14) {
            int i14;
            int i15;
            this.f10564a = list;
            this.f10565b = iArr;
            this.f10566c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f10567d = bVar;
            int iE = bVar.e();
            this.f10568e = iE;
            int iD = bVar.d();
            this.f10569f = iD;
            this.f10570g = z14;
            d dVar = list.isEmpty() ? null : list.get(0);
            if (dVar == null || dVar.f10561a != 0 || dVar.f10562b != 0) {
                list.add(0, new d(0, 0, 0));
            }
            list.add(new d(iE, iD, 0));
            for (d dVar2 : list) {
                for (int i16 = 0; i16 < dVar2.f10563c; i16++) {
                    int i17 = dVar2.f10561a + i16;
                    int i18 = dVar2.f10562b + i16;
                    int i19 = bVar.a(i17, i18) ? 1 : 2;
                    iArr[i17] = (i18 << 4) | i19;
                    iArr2[i18] = (i17 << 4) | i19;
                }
            }
            if (this.f10570g) {
                int i24 = 0;
                for (d dVar3 : list) {
                    while (true) {
                        i14 = dVar3.f10561a;
                        if (i24 < i14) {
                            if (iArr[i24] == 0) {
                                int size = list.size();
                                int i25 = 0;
                                for (int i26 = 0; i26 < size; i26++) {
                                    d dVar4 = list.get(i26);
                                    while (true) {
                                        i15 = dVar4.f10562b;
                                        if (i25 < i15) {
                                            if (iArr2[i25] == 0 && bVar.b(i24, i25)) {
                                                int i27 = bVar.a(i24, i25) ? 8 : 4;
                                                iArr[i24] = (i25 << 4) | i27;
                                                iArr2[i25] = i27 | (i24 << 4);
                                                break;
                                            }
                                            i25++;
                                        }
                                    }
                                    i25 = dVar4.f10563c + i15;
                                }
                            }
                            i24++;
                        }
                    }
                    i24 = dVar3.f10563c + i14;
                }
            }
        }

        public static g c(ArrayDeque arrayDeque, int i14, boolean z14) {
            g gVar;
            Iterator it = arrayDeque.iterator();
            while (true) {
                if (!it.hasNext()) {
                    gVar = null;
                    break;
                }
                gVar = (g) it.next();
                if (gVar.f10571a == i14 && gVar.f10573c == z14) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                g gVar2 = (g) it.next();
                if (z14) {
                    gVar2.f10572b--;
                } else {
                    gVar2.f10572b++;
                }
            }
            return gVar;
        }

        public final int a(int i14) {
            int i15 = this.f10568e;
            if (i14 < 0 || i14 >= i15) {
                org.apache.commons.lang3.e.v(tn.k.e(i14, i15, "Index out of bounds - passed position = ", ", old list size = "));
                return 0;
            }
            int i16 = this.f10565b[i14];
            if ((i16 & 15) == 0) {
                return -1;
            }
            return i16 >> 4;
        }

        public final void b(y yVar) {
            int[] iArr;
            b bVar;
            int i14;
            int i15;
            List<d> list;
            e eVar = this;
            androidx.recyclerview.widget.e eVar2 = yVar instanceof androidx.recyclerview.widget.e ? (androidx.recyclerview.widget.e) yVar : new androidx.recyclerview.widget.e(yVar);
            ArrayDeque arrayDeque = new ArrayDeque();
            List<d> list2 = eVar.f10564a;
            boolean z14 = true;
            int size = list2.size() - 1;
            int i16 = eVar.f10568e;
            int i17 = eVar.f10569f;
            int i18 = i16;
            while (size >= 0) {
                d dVar = list2.get(size);
                int i19 = dVar.f10561a;
                int i24 = dVar.f10563c;
                int i25 = i19 + i24;
                int i26 = dVar.f10562b;
                int i27 = i26 + i24;
                while (true) {
                    iArr = eVar.f10565b;
                    bVar = eVar.f10567d;
                    boolean z15 = z14;
                    i14 = 0;
                    if (i18 <= i25) {
                        break;
                    }
                    i18--;
                    int i28 = iArr[i18];
                    if ((i28 & 12) != 0) {
                        list = list2;
                        int i29 = i28 >> 4;
                        g gVarC = c(arrayDeque, i29, false);
                        if (gVarC != null) {
                            int i30 = (i16 - gVarC.f10572b) - 1;
                            eVar2.d(i18, i30);
                            if ((i28 & 4) != 0) {
                                eVar2.b(i30, z15 ? 1 : 0, bVar.c(i18, i29));
                            }
                        } else {
                            arrayDeque.add(new g(i18, (i16 - i18) - (z15 ? 1 : 0), z15));
                        }
                    } else {
                        list = list2;
                        eVar2.a(i18, z15 ? 1 : 0);
                        i16--;
                    }
                    list2 = list;
                    z14 = true;
                }
                List<d> list3 = list2;
                while (i17 > i27) {
                    i17--;
                    int i34 = eVar.f10566c[i17];
                    if ((i34 & 12) != 0) {
                        int i35 = i34 >> 4;
                        g gVarC2 = c(arrayDeque, i35, true);
                        if (gVarC2 == null) {
                            arrayDeque.add(new g(i17, i16 - i18, false));
                            i15 = 0;
                        } else {
                            i15 = 0;
                            eVar2.d((i16 - gVarC2.f10572b) - 1, i18);
                            if ((i34 & 4) != 0) {
                                eVar2.b(i18, 1, bVar.c(i35, i17));
                            }
                        }
                    } else {
                        i15 = i14;
                        eVar2.c(i18, 1);
                        i16++;
                    }
                    eVar = this;
                    i14 = i15;
                }
                int i36 = i26;
                int i37 = i19;
                while (i14 < i24) {
                    if ((iArr[i37] & 15) == 2) {
                        eVar2.b(i37, 1, bVar.c(i37, i36));
                    }
                    i37++;
                    i36++;
                    i14++;
                }
                size--;
                eVar = this;
                z14 = true;
                i17 = i26;
                i18 = i19;
                list2 = list3;
            }
            eVar2.e();
        }
    }

    public static abstract class f<T> {
        public abstract boolean a(T t7, T t14);

        public abstract boolean b(T t7, T t14);

        public Object c(T t7, T t14) {
            return null;
        }
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10572b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f10573c;

        public g(int i14, int i15, boolean z14) {
            this.f10571a = i14;
            this.f10572b = i15;
            this.f10573c = z14;
        }
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10579b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f10580c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f10581d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f10582e;

        public final int a() {
            return Math.min(this.f10580c - this.f10578a, this.f10581d - this.f10579b);
        }
    }

    private o() {
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:33:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:44:0x010a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0112  */
    /* JADX WARN: Code duplicated, block: B:52:0x012f  */
    public static e a(b bVar) {
        c cVar;
        i iVar;
        int i14;
        h hVar;
        d dVar;
        int[] iArr;
        int[] iArr2;
        int i15;
        int i16;
        boolean z14;
        i iVar2;
        i iVar3;
        int iA;
        int i17;
        int i18;
        int i19;
        int i24;
        int iA2;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i34;
        int iE = bVar.e();
        int iD = bVar.d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i35 = 0;
        arrayList2.add(new h(0, iE, 0, iD));
        int i36 = iE + iD;
        int i37 = 1;
        int i38 = (((i36 + 1) / 2) * 2) + 1;
        c cVar2 = new c(i38);
        c cVar3 = new c(i38);
        ArrayList arrayList3 = new ArrayList();
        while (true) {
            boolean zIsEmpty = arrayList2.isEmpty();
            int[] iArr3 = cVar2.f10559a;
            int[] iArr4 = cVar3.f10559a;
            if (zIsEmpty) {
                Collections.sort(arrayList, f10558a);
                return new e(bVar, arrayList, iArr3, iArr4, true);
            }
            h hVar2 = (h) arrayList2.remove(arrayList2.size() - i37);
            if (hVar2.b() >= i37 && hVar2.a() >= i37) {
                int iA3 = ((hVar2.a() + hVar2.b()) + i37) / 2;
                int i39 = hVar2.f10574a;
                int i44 = cVar2.f10560b;
                iArr3[i37 + i44] = i39;
                int i45 = hVar2.f10575b;
                int i46 = cVar3.f10560b;
                iArr4[i37 + i46] = i45;
                int i47 = i35;
                while (true) {
                    if (i47 >= iA3) {
                        cVar = cVar3;
                        iVar = null;
                        break;
                    }
                    int i48 = Math.abs(hVar2.b() - hVar2.a()) % 2 == i37 ? i37 : i35;
                    int iB = hVar2.b() - hVar2.a();
                    int i49 = -i47;
                    int i54 = i49;
                    while (true) {
                        if (i54 > i47) {
                            iArr = iArr3;
                            iArr2 = iArr4;
                            i15 = iA3;
                            i16 = i44;
                            z14 = false;
                            iVar2 = null;
                            break;
                        }
                        if (i54 != i49) {
                            if (i54 != i47) {
                                i24 = i54;
                                iArr = iArr3;
                                if (cVar2.a(i24 + 1) > cVar2.a(i24 - 1)) {
                                }
                                iArr2 = iArr4;
                                i26 = ((i25 - hVar2.f10574a) + hVar2.f10576c) - i24;
                                if (i47 == 0 && i25 == iA2) {
                                    i27 = i26 - 1;
                                } else {
                                    i27 = i26;
                                }
                                i28 = i48;
                                i29 = i26;
                                i30 = i25;
                                i15 = iA3;
                                while (i30 < hVar2.f10575b && i29 < hVar2.f10577d && bVar.b(i30, i29)) {
                                    i30++;
                                    i29++;
                                }
                                iArr[i24 + i44] = i30;
                                if (i28 != 0) {
                                    i34 = iB - i24;
                                    i16 = i44;
                                    if (i34 >= i49 + 1 && i34 <= i47 - 1 && cVar3.a(i34) <= i30) {
                                        iVar2 = new i();
                                        iVar2.f10578a = iA2;
                                        iVar2.f10579b = i27;
                                        iVar2.f10580c = i30;
                                        iVar2.f10581d = i29;
                                        z14 = false;
                                        iVar2.f10582e = false;
                                        break;
                                    }
                                } else {
                                    i16 = i44;
                                }
                                i54 = i24 + 2;
                                iArr3 = iArr;
                                iArr4 = iArr2;
                                i48 = i28;
                                iA3 = i15;
                                i44 = i16;
                            } else {
                                i24 = i54;
                                iArr = iArr3;
                            }
                            iA2 = cVar2.a(i24 - 1);
                            i25 = iA2 + 1;
                            iArr2 = iArr4;
                            i26 = ((i25 - hVar2.f10574a) + hVar2.f10576c) - i24;
                            if (i47 == 0) {
                                i27 = i26;
                            } else {
                                i27 = i26;
                            }
                            i28 = i48;
                            i29 = i26;
                            i30 = i25;
                            i15 = iA3;
                            while (i30 < hVar2.f10575b) {
                                i30++;
                                i29++;
                            }
                            iArr[i24 + i44] = i30;
                            if (i28 != 0) {
                                i34 = iB - i24;
                                i16 = i44;
                                if (i34 >= i49 + 1) {
                                    iVar2 = new i();
                                    iVar2.f10578a = iA2;
                                    iVar2.f10579b = i27;
                                    iVar2.f10580c = i30;
                                    iVar2.f10581d = i29;
                                    z14 = false;
                                    iVar2.f10582e = false;
                                    break;
                                }
                            } else {
                                i16 = i44;
                            }
                            i54 = i24 + 2;
                            iArr3 = iArr;
                            iArr4 = iArr2;
                            i48 = i28;
                            iA3 = i15;
                            i44 = i16;
                        } else {
                            i24 = i54;
                            iArr = iArr3;
                        }
                        iA2 = cVar2.a(i24 + 1);
                        i25 = iA2;
                        iArr2 = iArr4;
                        i26 = ((i25 - hVar2.f10574a) + hVar2.f10576c) - i24;
                        if (i47 == 0) {
                            i27 = i26;
                        } else {
                            i27 = i26;
                        }
                        i28 = i48;
                        i29 = i26;
                        i30 = i25;
                        i15 = iA3;
                        while (i30 < hVar2.f10575b) {
                            i30++;
                            i29++;
                        }
                        iArr[i24 + i44] = i30;
                        if (i28 != 0) {
                            i34 = iB - i24;
                            i16 = i44;
                            if (i34 >= i49 + 1) {
                                iVar2 = new i();
                                iVar2.f10578a = iA2;
                                iVar2.f10579b = i27;
                                iVar2.f10580c = i30;
                                iVar2.f10581d = i29;
                                z14 = false;
                                iVar2.f10582e = false;
                                break;
                            }
                        } else {
                            i16 = i44;
                        }
                        i54 = i24 + 2;
                        iArr3 = iArr;
                        iArr4 = iArr2;
                        i48 = i28;
                        iA3 = i15;
                        i44 = i16;
                    }
                    if (iVar2 != null) {
                        cVar = cVar3;
                        iVar = iVar2;
                        break;
                    }
                    boolean z15 = (hVar2.b() - hVar2.a()) % 2 == 0 ? true : z14;
                    int iB2 = hVar2.b() - hVar2.a();
                    int i55 = i49;
                    while (true) {
                        if (i55 > i47) {
                            cVar = cVar3;
                            iVar3 = null;
                            break;
                        }
                        if (i55 == i49 || (i55 != i47 && cVar3.a(i55 + 1) < cVar3.a(i55 - 1))) {
                            iA = cVar3.a(i55 + 1);
                            i17 = iA;
                        } else {
                            iA = cVar3.a(i55 - 1);
                            i17 = iA - 1;
                        }
                        int i56 = hVar2.f10577d - ((hVar2.f10575b - i17) - i55);
                        if (i47 != 0 && i17 == iA) {
                            i56++;
                        }
                        cVar = cVar3;
                        int i57 = i17;
                        int i58 = i56;
                        boolean z16 = z15;
                        while (true) {
                            if (i57 > hVar2.f10574a && i58 > hVar2.f10576c) {
                                i18 = iB2;
                                if (!bVar.b(i57 - 1, i58 - 1)) {
                                    break;
                                }
                                i57--;
                                i58--;
                                iB2 = i18;
                            } else {
                                i18 = iB2;
                                break;
                            }
                        }
                        iArr2[i55 + i46] = i57;
                        if (z16 && (i19 = i18 - i55) >= i49 && i19 <= i47 && cVar2.a(i19) >= i57) {
                            iVar3 = new i();
                            iVar3.f10578a = i57;
                            iVar3.f10579b = i58;
                            iVar3.f10580c = iA;
                            iVar3.f10581d = i56;
                            iVar3.f10582e = true;
                            break;
                        }
                        i55 += 2;
                        cVar3 = cVar;
                        z15 = z16;
                        iB2 = i18;
                    }
                    if (iVar3 != null) {
                        iVar = iVar3;
                        break;
                    }
                    i47++;
                    cVar3 = cVar;
                    iArr3 = iArr;
                    iArr4 = iArr2;
                    iA3 = i15;
                    i44 = i16;
                    i37 = 1;
                    i35 = 0;
                }
            } else {
                cVar = cVar3;
                iVar = null;
                break;
            }
            if (iVar != null) {
                if (iVar.a() > 0) {
                    int i59 = iVar.f10581d;
                    int i64 = iVar.f10579b;
                    int i65 = i59 - i64;
                    int i66 = iVar.f10580c;
                    int i67 = iVar.f10578a;
                    int i68 = i66 - i67;
                    if (i65 == i68) {
                        dVar = new d(i67, i64, i68);
                    } else if (iVar.f10582e) {
                        dVar = new d(i67, i64, iVar.a());
                    } else {
                        dVar = i65 > i68 ? new d(i67, i64 + 1, iVar.a()) : new d(i67 + 1, i64, iVar.a());
                    }
                    arrayList.add(dVar);
                }
                if (arrayList3.isEmpty()) {
                    hVar = new h();
                    i14 = 1;
                } else {
                    i14 = 1;
                    hVar = (h) arrayList3.remove(arrayList3.size() - 1);
                }
                hVar.f10574a = hVar2.f10574a;
                hVar.f10576c = hVar2.f10576c;
                hVar.f10575b = iVar.f10578a;
                hVar.f10577d = iVar.f10579b;
                arrayList2.add(hVar);
                hVar2.f10575b = hVar2.f10575b;
                hVar2.f10577d = hVar2.f10577d;
                hVar2.f10574a = iVar.f10580c;
                hVar2.f10576c = iVar.f10581d;
                arrayList2.add(hVar2);
            } else {
                i14 = 1;
                arrayList3.add(hVar2);
            }
            cVar3 = cVar;
            i37 = i14;
            i35 = 0;
        }
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10575b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f10576c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f10577d;

        public h(int i14, int i15, int i16, int i17) {
            this.f10574a = i14;
            this.f10575b = i15;
            this.f10576c = i16;
            this.f10577d = i17;
        }

        public final int a() {
            return this.f10577d - this.f10576c;
        }

        public final int b() {
            return this.f10575b - this.f10574a;
        }

        public h() {
        }
    }
}
