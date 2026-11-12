package androidx.recyclerview.widget;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a implements a0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k7.f f10400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<b> f10401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<b> f10402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0144a f10403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f10404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a0 f10405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10406g;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    public interface InterfaceC0144a {
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10408b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f10409c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f10410d;

        public b(int i14, int i15, int i16, Object obj) {
            this.f10407a = i14;
            this.f10408b = i15;
            this.f10410d = i16;
            this.f10409c = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i14 = this.f10407a;
            if (i14 != bVar.f10407a) {
                return false;
            }
            if (i14 == 8 && Math.abs(this.f10410d - this.f10408b) == 1 && this.f10410d == bVar.f10408b && this.f10408b == bVar.f10410d) {
                return true;
            }
            if (this.f10410d != bVar.f10410d || this.f10408b != bVar.f10408b) {
                return false;
            }
            Object obj2 = this.f10409c;
            Object obj3 = bVar.f10409c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (((this.f10407a * 31) + this.f10408b) * 31) + this.f10410d;
        }

        public final String toString() {
            String str;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Integer.toHexString(System.identityHashCode(this)));
            sb3.append("[");
            int i14 = this.f10407a;
            if (i14 == 1) {
                str = "add";
            } else if (i14 == 2) {
                str = "rm";
            } else if (i14 != 4) {
                str = i14 != 8 ? "??" : "mv";
            } else {
                str = "up";
            }
            sb3.append(str);
            sb3.append(",s:");
            sb3.append(this.f10408b);
            sb3.append("c:");
            sb3.append(this.f10410d);
            sb3.append(",p:");
            return am.j.k(this.f10409c, "]", sb3);
        }
    }

    public a(InterfaceC0144a interfaceC0144a, boolean z14) {
        this.f10400a = new k7.f(30);
        this.f10401b = new ArrayList<>();
        this.f10402c = new ArrayList<>();
        this.f10406g = 0;
        this.f10403d = interfaceC0144a;
        this.f10404e = z14;
        this.f10405f = new a0(this);
    }

    public final boolean a(int i14) {
        ArrayList<b> arrayList = this.f10402c;
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            b bVar = arrayList.get(i15);
            int i16 = bVar.f10407a;
            if (i16 == 8) {
                if (f(bVar.f10410d, i15 + 1) == i14) {
                    return true;
                }
            } else if (i16 == 1) {
                int i17 = bVar.f10408b;
                int i18 = bVar.f10410d + i17;
                while (i17 < i18) {
                    if (f(i17, i15 + 1) == i14) {
                        return true;
                    }
                    i17++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public final void b() {
        ArrayList<b> arrayList = this.f10402c;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            ((RecyclerView.f) this.f10403d).a(arrayList.get(i14));
        }
        l(arrayList);
        this.f10406g = 0;
    }

    public final void c() {
        b();
        ArrayList<b> arrayList = this.f10401b;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            b bVar = arrayList.get(i14);
            int i15 = bVar.f10407a;
            InterfaceC0144a interfaceC0144a = this.f10403d;
            if (i15 == 1) {
                RecyclerView.f fVar = (RecyclerView.f) interfaceC0144a;
                fVar.a(bVar);
                int i16 = bVar.f10408b;
                int i17 = bVar.f10410d;
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.offsetPositionRecordsForInsert(i16, i17);
                recyclerView.mItemsAddedOrRemoved = true;
            } else if (i15 == 2) {
                RecyclerView.f fVar2 = (RecyclerView.f) interfaceC0144a;
                fVar2.a(bVar);
                int i18 = bVar.f10408b;
                int i19 = bVar.f10410d;
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.offsetPositionRecordsForRemove(i18, i19, true);
                recyclerView2.mItemsAddedOrRemoved = true;
                recyclerView2.mState.f10287c += i19;
            } else if (i15 == 4) {
                RecyclerView.f fVar3 = (RecyclerView.f) interfaceC0144a;
                fVar3.a(bVar);
                int i24 = bVar.f10408b;
                int i25 = bVar.f10410d;
                Object obj = bVar.f10409c;
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.viewRangeUpdate(i24, i25, obj);
                recyclerView3.mItemsChanged = true;
            } else if (i15 == 8) {
                RecyclerView.f fVar4 = (RecyclerView.f) interfaceC0144a;
                fVar4.a(bVar);
                int i26 = bVar.f10408b;
                int i27 = bVar.f10410d;
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.offsetPositionRecordsForMove(i26, i27);
                recyclerView4.mItemsAddedOrRemoved = true;
            }
        }
        l(arrayList);
        this.f10406g = 0;
    }

    public final void d(b bVar) {
        int i14;
        int i15 = bVar.f10407a;
        if (i15 == 1 || i15 == 8) {
            vb.h.s("should not dispatch add or move for pre layout");
            return;
        }
        int iM = m(bVar.f10408b, i15);
        int i16 = bVar.f10408b;
        int i17 = bVar.f10407a;
        if (i17 == 2) {
            i14 = 0;
        } else {
            if (i17 != 4) {
                com.google.firebase.messaging.l.j(bVar, "op should be remove or update.");
                return;
            }
            i14 = 1;
        }
        int i18 = 1;
        for (int i19 = 1; i19 < bVar.f10410d; i19++) {
            int iM2 = m((i14 * i19) + bVar.f10408b, bVar.f10407a);
            int i24 = bVar.f10407a;
            if (i24 == 2 ? iM2 != iM : !(i24 == 4 && iM2 == iM + 1)) {
                b bVarH = h(i24, iM, i18, bVar.f10409c);
                e(bVarH, i16);
                k(bVarH);
                if (bVar.f10407a == 4) {
                    i16 += i18;
                }
                i18 = 1;
                iM = iM2;
            } else {
                i18++;
            }
        }
        Object obj = bVar.f10409c;
        k(bVar);
        if (i18 > 0) {
            b bVarH2 = h(bVar.f10407a, iM, i18, obj);
            e(bVarH2, i16);
            k(bVarH2);
        }
    }

    public final void e(b bVar, int i14) {
        RecyclerView.f fVar = (RecyclerView.f) this.f10403d;
        fVar.a(bVar);
        int i15 = bVar.f10407a;
        if (i15 == 2) {
            int i16 = bVar.f10410d;
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.offsetPositionRecordsForRemove(i14, i16, true);
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.f10287c += i16;
            return;
        }
        if (i15 != 4) {
            vb.h.s("only remove and update ops can be dispatched in first pass");
            return;
        }
        int i17 = bVar.f10410d;
        Object obj = bVar.f10409c;
        RecyclerView recyclerView2 = RecyclerView.this;
        recyclerView2.viewRangeUpdate(i14, i17, obj);
        recyclerView2.mItemsChanged = true;
    }

    public final int f(int i14, int i15) {
        ArrayList<b> arrayList = this.f10402c;
        int size = arrayList.size();
        while (i15 < size) {
            b bVar = arrayList.get(i15);
            int i16 = bVar.f10407a;
            int i17 = bVar.f10408b;
            if (i16 == 8) {
                if (i17 == i14) {
                    i14 = bVar.f10410d;
                } else {
                    if (i17 < i14) {
                        i14--;
                    }
                    if (bVar.f10410d <= i14) {
                        i14++;
                    }
                }
            } else if (i17 > i14) {
                continue;
            } else if (i16 == 2) {
                int i18 = bVar.f10410d;
                if (i14 < i17 + i18) {
                    return -1;
                }
                i14 -= i18;
            } else if (i16 == 1) {
                i14 += bVar.f10410d;
            }
            i15++;
        }
        return i14;
    }

    public final boolean g() {
        return this.f10401b.size() > 0;
    }

    public final b h(int i14, int i15, int i16, Object obj) {
        b bVar = (b) this.f10400a.acquire();
        if (bVar == null) {
            return new b(i14, i15, i16, obj);
        }
        bVar.f10407a = i14;
        bVar.f10408b = i15;
        bVar.f10410d = i16;
        bVar.f10409c = obj;
        return bVar;
    }

    public final void i(b bVar) {
        this.f10402c.add(bVar);
        int i14 = bVar.f10407a;
        InterfaceC0144a interfaceC0144a = this.f10403d;
        if (i14 == 1) {
            int i15 = bVar.f10408b;
            int i16 = bVar.f10410d;
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.offsetPositionRecordsForInsert(i15, i16);
            recyclerView.mItemsAddedOrRemoved = true;
            return;
        }
        if (i14 == 2) {
            int i17 = bVar.f10408b;
            int i18 = bVar.f10410d;
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.offsetPositionRecordsForRemove(i17, i18, false);
            recyclerView2.mItemsAddedOrRemoved = true;
            return;
        }
        if (i14 == 4) {
            int i19 = bVar.f10408b;
            int i24 = bVar.f10410d;
            Object obj = bVar.f10409c;
            RecyclerView recyclerView3 = RecyclerView.this;
            recyclerView3.viewRangeUpdate(i19, i24, obj);
            recyclerView3.mItemsChanged = true;
            return;
        }
        if (i14 != 8) {
            com.google.firebase.messaging.l.j(bVar, "Unknown update op type for ");
            return;
        }
        int i25 = bVar.f10408b;
        int i26 = bVar.f10410d;
        RecyclerView recyclerView4 = RecyclerView.this;
        recyclerView4.offsetPositionRecordsForMove(i25, i26);
        recyclerView4.mItemsAddedOrRemoved = true;
    }

    /* JADX WARN: Code duplicated, block: B:192:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0071  */
    /* JADX WARN: Code duplicated, block: B:32:0x0076  */
    /* JADX WARN: Code duplicated, block: B:35:0x008e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0092  */
    /* JADX WARN: Code duplicated, block: B:38:0x009c  */
    public final void j() {
        ArrayList<b> arrayList;
        int i14;
        byte b14;
        b bVarH;
        int i15;
        b bVar;
        int i16;
        boolean z14;
        byte b15;
        b bVarH2;
        int i17;
        int i18;
        int i19;
        boolean z15;
        boolean z16;
        a0 a0Var = this.f10405f;
        a0Var.getClass();
        while (true) {
            arrayList = this.f10401b;
            int size = arrayList.size() - 1;
            boolean z17 = false;
            while (true) {
                i14 = 8;
                b14 = -1;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (arrayList.get(size).f10407a != 8) {
                    z17 = true;
                } else if (z17) {
                    break;
                }
                size--;
            }
            bVarH = null;
            i15 = 2;
            if (size == -1) {
                break;
            }
            int i24 = size + 1;
            a0.a aVar = a0Var.f10411a;
            b bVar2 = arrayList.get(size);
            b bVar3 = arrayList.get(i24);
            int i25 = bVar3.f10407a;
            if (i25 == 1) {
                int i26 = bVar2.f10410d;
                int i27 = bVar3.f10408b;
                int i28 = i26 < i27 ? -1 : 0;
                int i29 = bVar2.f10408b;
                if (i29 < i27) {
                    i28++;
                }
                if (i27 <= i29) {
                    bVar2.f10408b = i29 + bVar3.f10410d;
                }
                int i30 = bVar3.f10408b;
                if (i30 <= i26) {
                    bVar2.f10410d = i26 + bVar3.f10410d;
                }
                bVar3.f10408b = i30 + i28;
                arrayList.set(size, bVar3);
                arrayList.set(i24, bVar2);
            } else if (i25 == 2) {
                int i34 = bVar2.f10408b;
                int i35 = bVar2.f10410d;
                int i36 = bVar3.f10408b;
                if (i34 < i35) {
                    z16 = i36 == i34 && bVar3.f10410d == i35 - i34;
                    z15 = false;
                } else if (i36 == i35 + 1 && bVar3.f10410d == i34 - i35) {
                    z16 = true;
                    z15 = true;
                } else {
                    z15 = true;
                    z16 = false;
                }
                if (i35 < i36) {
                    bVar3.f10408b = i36 - 1;
                } else {
                    int i37 = bVar3.f10410d;
                    if (i35 < i36 + i37) {
                        bVar3.f10410d = i37 - 1;
                        bVar2.f10407a = 2;
                        bVar2.f10410d = 1;
                        if (bVar3.f10410d == 0) {
                            arrayList.remove(i24);
                            ((a) aVar).k(bVar3);
                        }
                    }
                }
                int i38 = bVar2.f10408b;
                int i39 = bVar3.f10408b;
                if (i38 <= i39) {
                    bVar3.f10408b = i39 + 1;
                } else {
                    int i44 = i39 + bVar3.f10410d;
                    if (i38 < i44) {
                        bVarH = ((a) aVar).h(2, i38 + 1, i44 - i38, null);
                        bVar3.f10410d = bVar2.f10408b - bVar3.f10408b;
                    }
                }
                if (z16) {
                    arrayList.set(size, bVar3);
                    arrayList.remove(i24);
                    ((a) aVar).k(bVar2);
                } else {
                    if (z15) {
                        if (bVarH != null) {
                            int i45 = bVar2.f10408b;
                            if (i45 > bVarH.f10408b) {
                                bVar2.f10408b = i45 - bVarH.f10410d;
                            }
                            int i46 = bVar2.f10410d;
                            if (i46 > bVarH.f10408b) {
                                bVar2.f10410d = i46 - bVarH.f10410d;
                            }
                        }
                        int i47 = bVar2.f10408b;
                        if (i47 > bVar3.f10408b) {
                            bVar2.f10408b = i47 - bVar3.f10410d;
                        }
                        int i48 = bVar2.f10410d;
                        if (i48 > bVar3.f10408b) {
                            bVar2.f10410d = i48 - bVar3.f10410d;
                        }
                    } else {
                        if (bVarH != null) {
                            int i49 = bVar2.f10408b;
                            if (i49 >= bVarH.f10408b) {
                                bVar2.f10408b = i49 - bVarH.f10410d;
                            }
                            int i54 = bVar2.f10410d;
                            if (i54 >= bVarH.f10408b) {
                                bVar2.f10410d = i54 - bVarH.f10410d;
                            }
                        }
                        int i55 = bVar2.f10408b;
                        if (i55 >= bVar3.f10408b) {
                            bVar2.f10408b = i55 - bVar3.f10410d;
                        }
                        int i56 = bVar2.f10410d;
                        if (i56 >= bVar3.f10408b) {
                            bVar2.f10410d = i56 - bVar3.f10410d;
                        }
                    }
                    arrayList.set(size, bVar3);
                    if (bVar2.f10408b != bVar2.f10410d) {
                        arrayList.set(i24, bVar2);
                    } else {
                        arrayList.remove(i24);
                    }
                    if (bVarH != null) {
                        arrayList.add(size, bVarH);
                    }
                }
            } else if (i25 == 4) {
                int i57 = bVar2.f10410d;
                int i58 = bVar3.f10408b;
                if (i57 < i58) {
                    bVar3.f10408b = i58 - 1;
                } else {
                    int i59 = bVar3.f10410d;
                    if (i57 < i58 + i59) {
                        bVar3.f10410d = i59 - 1;
                        bVarH2 = ((a) aVar).h(4, bVar2.f10408b, 1, bVar3.f10409c);
                    }
                    i17 = bVar2.f10408b;
                    i18 = bVar3.f10408b;
                    if (i17 <= i18) {
                        bVar3.f10408b = i18 + 1;
                    } else {
                        i19 = i18 + bVar3.f10410d;
                        if (i17 < i19) {
                            int i64 = i19 - i17;
                            bVarH = ((a) aVar).h(4, i17 + 1, i64, bVar3.f10409c);
                            bVar3.f10410d -= i64;
                        }
                    }
                    arrayList.set(i24, bVar2);
                    if (bVar3.f10410d > 0) {
                        arrayList.set(size, bVar3);
                    } else {
                        arrayList.remove(size);
                        ((a) aVar).k(bVar3);
                    }
                    if (bVarH2 != null) {
                        arrayList.add(size, bVarH2);
                    }
                    if (bVarH != null) {
                        arrayList.add(size, bVarH);
                    }
                }
                bVarH2 = null;
                i17 = bVar2.f10408b;
                i18 = bVar3.f10408b;
                if (i17 <= i18) {
                    bVar3.f10408b = i18 + 1;
                } else {
                    i19 = i18 + bVar3.f10410d;
                    if (i17 < i19) {
                        int i65 = i19 - i17;
                        bVarH = ((a) aVar).h(4, i17 + 1, i65, bVar3.f10409c);
                        bVar3.f10410d -= i65;
                    }
                }
                arrayList.set(i24, bVar2);
                if (bVar3.f10410d > 0) {
                    arrayList.set(size, bVar3);
                } else {
                    arrayList.remove(size);
                    ((a) aVar).k(bVar3);
                }
                if (bVarH2 != null) {
                    arrayList.add(size, bVarH2);
                }
                if (bVarH != null) {
                    arrayList.add(size, bVarH);
                }
            }
        }
        int size2 = arrayList.size();
        int i66 = 0;
        while (i66 < size2) {
            b bVarH3 = arrayList.get(i66);
            int i67 = bVarH3.f10407a;
            if (i67 != 1) {
                InterfaceC0144a interfaceC0144a = this.f10403d;
                if (i67 == i15) {
                    int i68 = bVarH3.f10408b;
                    int i69 = bVarH3.f10410d + i68;
                    int i74 = i68;
                    int i75 = 0;
                    byte b16 = -1;
                    while (i74 < i69) {
                        RecyclerView recyclerView = RecyclerView.this;
                        RecyclerView.f0 f0VarFindViewHolderForPosition = recyclerView.findViewHolderForPosition(i74, true);
                        if (f0VarFindViewHolderForPosition == null) {
                            f0VarFindViewHolderForPosition = null;
                        } else {
                            if (recyclerView.mChildHelper.f10450c.contains(f0VarFindViewHolderForPosition.itemView)) {
                                int i76 = RecyclerView.HORIZONTAL;
                                f0VarFindViewHolderForPosition = null;
                            }
                        }
                        if (f0VarFindViewHolderForPosition != null || a(i74)) {
                            if (b16 == 0) {
                                d(h(2, i68, i75, null));
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            b15 = 1;
                        } else {
                            if (b16 == 1) {
                                i(h(2, i68, i75, null));
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            b15 = 0;
                        }
                        if (z14) {
                            i74 -= i75;
                            i69 -= i75;
                            i75 = 1;
                        } else {
                            i75++;
                        }
                        i74++;
                        b16 = b15;
                    }
                    if (i75 != bVarH3.f10410d) {
                        k(bVarH3);
                        bVar = null;
                        i16 = 2;
                        bVarH3 = h(2, i68, i75, null);
                    } else {
                        bVar = null;
                        i16 = 2;
                    }
                    if (b16 == 0) {
                        d(bVarH3);
                    } else {
                        i(bVarH3);
                    }
                } else if (i67 != 4) {
                    if (i67 == i14) {
                        i(bVarH3);
                    }
                    bVar = bVarH;
                    i16 = i15;
                } else {
                    int i77 = bVarH3.f10408b;
                    int i78 = bVarH3.f10410d + i77;
                    byte b17 = b14;
                    int i79 = i77;
                    int i84 = 0;
                    while (i77 < i78) {
                        RecyclerView recyclerView2 = RecyclerView.this;
                        RecyclerView.f0 f0VarFindViewHolderForPosition2 = recyclerView2.findViewHolderForPosition(i77, true);
                        if (f0VarFindViewHolderForPosition2 == null) {
                            f0VarFindViewHolderForPosition2 = null;
                        } else {
                            if (recyclerView2.mChildHelper.f10450c.contains(f0VarFindViewHolderForPosition2.itemView)) {
                                int i85 = RecyclerView.HORIZONTAL;
                                f0VarFindViewHolderForPosition2 = null;
                            }
                        }
                        if (f0VarFindViewHolderForPosition2 != null || a(i77)) {
                            if (b17 == 0) {
                                d(h(4, i79, i84, bVarH3.f10409c));
                                i79 = i77;
                                i84 = 0;
                            }
                            b17 = 1;
                        } else {
                            if (b17 == 1) {
                                i(h(4, i79, i84, bVarH3.f10409c));
                                i79 = i77;
                                i84 = 0;
                            }
                            b17 = 0;
                        }
                        i84++;
                        i77++;
                    }
                    if (i84 != bVarH3.f10410d) {
                        Object obj = bVarH3.f10409c;
                        k(bVarH3);
                        bVarH3 = h(4, i79, i84, obj);
                    }
                    if (b17 == 0) {
                        d(bVarH3);
                    } else {
                        i(bVarH3);
                    }
                    bVar = null;
                    i16 = 2;
                }
            } else {
                bVar = bVarH;
                i16 = i15;
                i(bVarH3);
            }
            i66++;
            bVarH = bVar;
            i15 = i16;
            i14 = 8;
            b14 = -1;
        }
        arrayList.clear();
    }

    public final void k(b bVar) {
        if (this.f10404e) {
            return;
        }
        bVar.f10409c = null;
        this.f10400a.a(bVar);
    }

    public final void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            k((b) arrayList.get(i14));
        }
        arrayList.clear();
    }

    public final int m(int i14, int i15) {
        int i16;
        int i17;
        ArrayList<b> arrayList = this.f10402c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b bVar = arrayList.get(size);
            int i18 = bVar.f10407a;
            int i19 = bVar.f10408b;
            if (i18 == 8) {
                int i24 = bVar.f10410d;
                if (i19 < i24) {
                    i17 = i24;
                    i16 = i19;
                } else {
                    i16 = i24;
                    i17 = i19;
                }
                if (i14 < i16 || i14 > i17) {
                    if (i14 < i19) {
                        if (i15 == 1) {
                            bVar.f10408b = i19 + 1;
                            bVar.f10410d = i24 + 1;
                        } else if (i15 == 2) {
                            bVar.f10408b = i19 - 1;
                            bVar.f10410d = i24 - 1;
                        }
                    }
                } else if (i16 == i19) {
                    if (i15 == 1) {
                        bVar.f10410d = i24 + 1;
                    } else if (i15 == 2) {
                        bVar.f10410d = i24 - 1;
                    }
                    i14++;
                } else {
                    if (i15 == 1) {
                        bVar.f10408b = i19 + 1;
                    } else if (i15 == 2) {
                        bVar.f10408b = i19 - 1;
                    }
                    i14--;
                }
            } else if (i19 <= i14) {
                if (i18 == 1) {
                    i14 -= bVar.f10410d;
                } else if (i18 == 2) {
                    i14 += bVar.f10410d;
                }
            } else if (i15 == 1) {
                bVar.f10408b = i19 + 1;
            } else if (i15 == 2) {
                bVar.f10408b = i19 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            b bVar2 = arrayList.get(size2);
            int i25 = bVar2.f10407a;
            int i26 = bVar2.f10410d;
            if (i25 == 8) {
                if (i26 == bVar2.f10408b || i26 < 0) {
                    arrayList.remove(size2);
                    k(bVar2);
                }
            } else if (i26 <= 0) {
                arrayList.remove(size2);
                k(bVar2);
            }
        }
        return i14;
    }

    public a(InterfaceC0144a interfaceC0144a) {
        this(interfaceC0144a, false);
    }
}
