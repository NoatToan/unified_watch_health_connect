package s5;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB=\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012¨\u0006\u0013"}, d2 = {"Ls5/q;", "Ls5/u;", "Ls5/c;", "annotatedString", "Ls5/x0;", TtmlNode.TAG_STYLE, "", "Ls5/c$d;", "Ls5/y;", "placeholders", "Lg6/c;", "density", "Lw5/q$b;", "fontFamilyResolver", "<init>", "(Ls5/c;Ls5/x0;Ljava/util/List;Lg6/c;Lw5/q$b;)V", "Lw5/p$b;", "resourceLoader", "(Ls5/c;Ls5/x0;Ljava/util/List;Lg6/c;Lw5/p$b;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f157275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<c.d<y>> f157276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f157277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f157278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f157279e;

    /* JADX WARN: Multi-variable type inference failed */
    public q(c cVar, x0 x0Var, List<c.d<y>> list, g6.c cVar2, w5.q.b bVar) {
        c cVar3 = cVar;
        x0 x0Var2 = x0Var;
        this.f157275a = cVar3;
        this.f157276b = list;
        o13.n nVar = o13.n.NONE;
        final int i14 = 0;
        this.f157277c = o13.m.a(nVar, new e23.a(this) { // from class: s5.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f157264b;

            {
                this.f157264b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                Object obj;
                u uVar;
                Object obj2;
                u uVar2;
                switch (i14) {
                    case 0:
                        ArrayList arrayList = this.f157264b.f157279e;
                        if (arrayList.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList.get(0);
                            float fC = ((t) obj3).f157302a.c();
                            int i15 = 1;
                            int size = arrayList.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj4 = arrayList.get(i15);
                                    float fC2 = ((t) obj4).f157302a.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj3 = obj4;
                                        fC = fC2;
                                    }
                                    if (i15 != size) {
                                        i15++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        t tVar = (t) obj;
                        return Float.valueOf((tVar == null || (uVar = tVar.f157302a) == null) ? 0.0f : uVar.c());
                    default:
                        ArrayList arrayList2 = this.f157264b.f157279e;
                        if (arrayList2.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList2.get(0);
                            float fA = ((t) obj5).f157302a.a();
                            int i16 = 1;
                            int size2 = arrayList2.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj6 = arrayList2.get(i16);
                                    float fA2 = ((t) obj6).f157302a.a();
                                    if (Float.compare(fA, fA2) < 0) {
                                        obj5 = obj6;
                                        fA = fA2;
                                    }
                                    if (i16 != size2) {
                                        i16++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        t tVar2 = (t) obj2;
                        return Float.valueOf((tVar2 == null || (uVar2 = tVar2.f157302a) == null) ? 0.0f : uVar2.a());
                }
            }
        });
        final int i15 = 1;
        this.f157278d = o13.m.a(nVar, new e23.a(this) { // from class: s5.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f157264b;

            {
                this.f157264b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                Object obj;
                u uVar;
                Object obj2;
                u uVar2;
                switch (i15) {
                    case 0:
                        ArrayList arrayList = this.f157264b.f157279e;
                        if (arrayList.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList.get(0);
                            float fC = ((t) obj3).f157302a.c();
                            int i16 = 1;
                            int size = arrayList.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj4 = arrayList.get(i16);
                                    float fC2 = ((t) obj4).f157302a.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj3 = obj4;
                                        fC = fC2;
                                    }
                                    if (i16 != size) {
                                        i16++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        t tVar = (t) obj;
                        return Float.valueOf((tVar == null || (uVar = tVar.f157302a) == null) ? 0.0f : uVar.c());
                    default:
                        ArrayList arrayList2 = this.f157264b.f157279e;
                        if (arrayList2.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList2.get(0);
                            float fA = ((t) obj5).f157302a.a();
                            int i17 = 1;
                            int size2 = arrayList2.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj6 = arrayList2.get(i17);
                                    float fA2 = ((t) obj6).f157302a.a();
                                    if (Float.compare(fA, fA2) < 0) {
                                        obj5 = obj6;
                                        fA = fA2;
                                    }
                                    if (i17 != size2) {
                                        i17++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        t tVar2 = (t) obj2;
                        return Float.valueOf((tVar2 == null || (uVar2 = tVar2.f157302a) == null) ? 0.0f : uVar2.a());
                }
            }
        });
        w wVar = x0Var2.f157323b;
        c cVar4 = f.f157158a;
        ArrayList arrayList = cVar3.f157140d;
        String str = cVar3.f157138b;
        List listN0 = (arrayList == null || (listN0 = p13.h0.N0(arrayList, new e())) == null) ? p13.j0.f134944a : listN0;
        ArrayList arrayList2 = new ArrayList();
        p13.k kVar = new p13.k();
        int size = listN0.size();
        int i16 = 0;
        int i17 = 0;
        while (i16 < size) {
            c.d dVar = (c.d) listN0.get(i16);
            c.d dVarA = c.d.a(dVar, wVar.a((w) dVar.f157149a), i14, i14, 14);
            T t7 = dVarA.f157149a;
            int i18 = dVarA.f157151c;
            int i19 = dVarA.f157150b;
            while (i17 < i19 && !kVar.isEmpty()) {
                c.d dVar2 = (c.d) kVar.last();
                int i24 = dVar2.f157151c;
                listN0 = listN0;
                T t14 = dVar2.f157149a;
                if (i19 < i24) {
                    arrayList2.add(new c.d(t14, i17, i19));
                    i17 = i19;
                } else {
                    int i25 = size;
                    arrayList2.add(new c.d(t14, i17, i24));
                    i17 = dVar2.f157151c;
                    while (!kVar.isEmpty() && i17 == ((c.d) kVar.last()).f157151c) {
                        kVar.removeLast();
                    }
                    size = i25;
                }
            }
            List list2 = listN0;
            int i26 = size;
            if (i17 < i19) {
                arrayList2.add(new c.d(wVar, i17, i19));
                i17 = i19;
            }
            c.d dVar3 = (c.d) kVar.h();
            if (dVar3 != null) {
                int i27 = dVar3.f157151c;
                T t15 = dVar3.f157149a;
                int i28 = dVar3.f157150b;
                if (i28 == i19 && i27 == i18) {
                    kVar.removeLast();
                    kVar.addLast(new c.d(((w) t15).a((w) t7), i19, i18));
                } else if (i28 == i27) {
                    arrayList2.add(new c.d(t15, i28, i27));
                    kVar.removeLast();
                    kVar.addLast(new c.d(t7, i19, i18));
                } else {
                    if (i27 < i18) {
                        vb.h.w();
                        throw null;
                    }
                    kVar.addLast(new c.d(((w) t15).a((w) t7), i19, i18));
                }
            } else {
                kVar.addLast(new c.d(t7, i19, i18));
            }
            i16++;
            listN0 = list2;
            size = i26;
            i14 = 0;
        }
        while (i17 <= str.length() && !kVar.isEmpty()) {
            c.d dVar4 = (c.d) kVar.last();
            T t16 = dVar4.f157149a;
            int i29 = dVar4.f157151c;
            arrayList2.add(new c.d(t16, i17, i29));
            while (!kVar.isEmpty() && i29 == ((c.d) kVar.last()).f157151c) {
                kVar.removeLast();
            }
            i17 = i29;
        }
        if (i17 < str.length()) {
            arrayList2.add(new c.d(wVar, i17, str.length()));
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new c.d(wVar, 0, 0));
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int i30 = 0;
        for (int size2 = arrayList2.size(); i30 < size2; size2 = size2) {
            c.d dVar5 = (c.d) arrayList2.get(i30);
            int i34 = dVar5.f157150b;
            int i35 = dVar5.f157151c;
            String strSubstring = i34 != i35 ? str.substring(i34, i35) : "";
            List listA = f.a(cVar3, i34, i35, new d(0));
            c cVar5 = new c(strSubstring, (List<? extends c.d<? extends c.a>>) (listA == null ? p13.j0.f134944a : listA));
            w wVar2 = (w) dVar5.f157149a;
            int i36 = wVar2.f157307b;
            d6.j.f57765b.getClass();
            if (i36 == 0) {
                wVar2 = new w(wVar2.f157306a, wVar.f157307b, wVar2.f157308c, wVar2.f157309d, wVar2.f157310e, wVar2.f157311f, wVar2.f157312g, wVar2.f157313h, wVar2.f157314i, (p005kotlin.jvm.internal.j) null);
            }
            x0 x0Var3 = new x0(x0Var2.f157322a, x0Var2.f157323b.a(wVar2));
            List list3 = cVar5.f157137a;
            List list4 = list3 == null ? p13.j0.f134944a : list3;
            List<c.d<y>> list5 = this.f157276b;
            ArrayList arrayList4 = new ArrayList(list5.size());
            int size3 = list5.size();
            int i37 = 0;
            while (i37 < size3) {
                c.d<y> dVar6 = list5.get(i37);
                int i38 = dVar6.f157150b;
                w wVar3 = wVar;
                int i39 = dVar6.f157151c;
                if (f.b(i34, i35, i38, i39)) {
                    if (i34 > i38 || i39 > i35) {
                        y5.a.a("placeholder can not overlap with paragraph.");
                    }
                    arrayList4.add(new c.d(dVar6.f157149a, i38 - i34, i39 - i34));
                }
                i37++;
                list5 = list5;
                wVar = wVar3;
            }
            arrayList3.add(new t(new a6.d(cVar5.f157138b, x0Var3, list4, arrayList4, bVar, cVar2), i34, i35));
            i30++;
            cVar3 = cVar;
            x0Var2 = x0Var;
            str = str;
        }
        this.f157279e = arrayList3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // s5.u
    public final float a() {
        return ((Number) this.f157278d.getValue()).floatValue();
    }

    @Override // s5.u
    public final boolean b() {
        ArrayList arrayList = this.f157279e;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            if (((t) arrayList.get(i14)).f157302a.b()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // s5.u
    public final float c() {
        return ((Number) this.f157277c.getValue()).floatValue();
    }

    @o13.e
    public q(c cVar, x0 x0Var, List<c.d<y>> list, g6.c cVar2, w5.p.b bVar) {
        this(cVar, x0Var, list, cVar2, w5.n.a(bVar));
    }
}
