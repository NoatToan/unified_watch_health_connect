package e73;

import h73.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final LinkedHashSet f63351p = new LinkedHashSet(Arrays.asList(h73.b.class, h73.i.class, h73.g.class, h73.j.class, x.class, h73.p.class, h73.m.class));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Map<Class<? extends h73.a>, j73.e> f63352q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f63353a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f63356d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f63360h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<j73.e> f63361i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i73.b f63362j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<k73.a> f63363k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g f63364l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f63366n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final LinkedHashSet f63367o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f63354b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f63355c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f63357e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f63358f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f63359g = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f63365m = new LinkedHashMap();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j73.d f63368a;

        public a(j73.d dVar) {
            this.f63368a = dVar;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put(h73.b.class, new c.a());
        map.put(h73.i.class, new j.a());
        map.put(h73.g.class, new i.a());
        map.put(h73.j.class, new k.b());
        map.put(x.class, new t.a());
        map.put(h73.p.class, new p.a());
        map.put(h73.m.class, new l.a());
        f63352q = Collections.unmodifiableMap(map);
    }

    public h(List<j73.e> list, i73.b bVar, List<k73.a> list2) {
        ArrayList arrayList = new ArrayList();
        this.f63366n = arrayList;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f63367o = linkedHashSet;
        this.f63361i = list;
        this.f63362j = bVar;
        this.f63363k = list2;
        g gVar = new g();
        this.f63364l = gVar;
        arrayList.add(gVar);
        linkedHashSet.add(gVar);
    }

    public final void a(j73.d dVar) {
        while (!h().e(dVar.c())) {
            e(h());
        }
        h().c().b(dVar.c());
        this.f63366n.add(dVar);
        this.f63367o.add(dVar);
    }

    public final void b(r rVar) {
        o oVar = rVar.f63434b;
        oVar.a();
        for (h73.o oVar2 : oVar.f63408c) {
            h73.t tVar = rVar.f63433a;
            tVar.getClass();
            oVar2.f();
            h73.r rVar2 = tVar.f82382d;
            oVar2.f82382d = rVar2;
            if (rVar2 != null) {
                rVar2.f82383e = oVar2;
            }
            oVar2.f82383e = tVar;
            tVar.f82382d = oVar2;
            h73.r rVar3 = tVar.f82379a;
            oVar2.f82379a = rVar3;
            if (oVar2.f82382d == null) {
                rVar3.f82380b = oVar2;
            }
            String str = oVar2.f82375f;
            LinkedHashMap linkedHashMap = this.f63365m;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, oVar2);
            }
        }
    }

    public final void c() {
        CharSequence charSequenceSubSequence;
        if (this.f63356d) {
            int i14 = this.f63354b + 1;
            CharSequence charSequence = this.f63353a;
            CharSequence charSequenceSubSequence2 = charSequence.subSequence(i14, charSequence.length());
            int i15 = 4 - (this.f63355c % 4);
            StringBuilder sb3 = new StringBuilder(charSequenceSubSequence2.length() + i15);
            for (int i16 = 0; i16 < i15; i16++) {
                sb3.append(' ');
            }
            sb3.append(charSequenceSubSequence2);
            charSequenceSubSequence = sb3.toString();
        } else {
            CharSequence charSequence2 = this.f63353a;
            charSequenceSubSequence = charSequence2.subSequence(this.f63354b, charSequence2.length());
        }
        h().d(charSequenceSubSequence);
    }

    public final void d() {
        char cCharAt = this.f63353a.charAt(this.f63354b);
        int i14 = this.f63354b;
        if (cCharAt != '\t') {
            this.f63354b = i14 + 1;
            this.f63355c++;
        } else {
            this.f63354b = i14 + 1;
            int i15 = this.f63355c;
            this.f63355c = (4 - (i15 % 4)) + i15;
        }
    }

    public final void e(j73.d dVar) {
        if (h() == dVar) {
            ArrayList arrayList = this.f63366n;
            arrayList.remove(arrayList.size() - 1);
        }
        if (dVar instanceof r) {
            b((r) dVar);
        }
        dVar.h();
    }

    public final void f(List<j73.d> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            e(list.get(size));
        }
    }

    public final void g() {
        int i14 = this.f63354b;
        int i15 = this.f63355c;
        this.f63360h = true;
        int length = this.f63353a.length();
        while (i14 < length) {
            char cCharAt = this.f63353a.charAt(i14);
            if (cCharAt == '\t') {
                i14++;
                i15 += 4 - (i15 % 4);
            } else if (cCharAt != ' ') {
                this.f63360h = false;
                break;
            } else {
                i14++;
                i15++;
            }
        }
        this.f63357e = i14;
        this.f63358f = i15;
        this.f63359g = i15 - this.f63355c;
    }

    public final j73.d h() {
        return (j73.d) am.j.f(1, this.f63366n);
    }

    public final void i(String str) {
        d dVarA;
        int length = str.length();
        StringBuilder sb3 = null;
        for (int i14 = 0; i14 < length; i14++) {
            char cCharAt = str.charAt(i14);
            if (cCharAt == 0) {
                if (sb3 == null) {
                    sb3 = new StringBuilder(length);
                    sb3.append((CharSequence) str, 0, i14);
                }
                sb3.append((char) 65533);
            } else if (sb3 != null) {
                sb3.append(cCharAt);
            }
        }
        if (sb3 != null) {
            str = sb3.toString();
        }
        this.f63353a = str;
        this.f63354b = 0;
        this.f63355c = 0;
        this.f63356d = false;
        ArrayList arrayList = this.f63366n;
        int i15 = 1;
        for (j73.d dVar : arrayList.subList(1, arrayList.size())) {
            g();
            j73.c cVarG = dVar.g(this);
            if (cVarG == null) {
                break;
            }
            b bVar = (b) cVarG;
            if (bVar.f63329c) {
                e(dVar);
                return;
            }
            int i16 = bVar.f63327a;
            if (i16 != -1) {
                k(i16);
            } else {
                int i17 = bVar.f63328b;
                if (i17 != -1) {
                    j(i17);
                }
            }
            i15++;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.subList(i15, arrayList.size()));
        dVar = (j73.d) arrayList.get(i15 - 1);
        boolean zIsEmpty = arrayList2.isEmpty();
        boolean zA = (dVar.c() instanceof h73.t) || dVar.a();
        while (zA) {
            g();
            if (this.f63360h || (this.f63359g < 4 && Character.isLetter(Character.codePointAt(this.f63353a, this.f63357e)))) {
                k(this.f63357e);
                break;
            }
            a aVar = new a(dVar);
            Iterator<j73.e> it = this.f63361i.iterator();
            do {
                if (!it.hasNext()) {
                    dVarA = null;
                    break;
                }
                dVarA = it.next().a(this, aVar);
            } while (dVarA == null);
            if (dVarA == null) {
                k(this.f63357e);
                break;
            }
            if (!zIsEmpty) {
                f(arrayList2);
                zIsEmpty = true;
            }
            int i18 = dVarA.f63332b;
            if (i18 != -1) {
                k(i18);
            } else {
                int i19 = dVarA.f63333c;
                if (i19 != -1) {
                    j(i19);
                }
            }
            if (dVarA.f63334d) {
                j73.d dVarH = h();
                arrayList.remove(arrayList.size() - 1);
                this.f63367o.remove(dVarH);
                if (dVarH instanceof r) {
                    b((r) dVarH);
                }
                dVarH.c().f();
            }
            j73.d[] dVarArr = dVarA.f63331a;
            for (j73.d dVar2 : dVarArr) {
                a(dVar2);
                zA = dVar2.a();
            }
        }
        if (!zIsEmpty && !this.f63360h && h().b()) {
            c();
            return;
        }
        if (!zIsEmpty) {
            f(arrayList2);
        }
        if (!dVar2.a()) {
            c();
        } else {
            if (this.f63360h) {
                return;
            }
            a(new r());
            c();
        }
    }

    public final void j(int i14) {
        int i15;
        int i16 = this.f63358f;
        if (i14 >= i16) {
            this.f63354b = this.f63357e;
            this.f63355c = i16;
        }
        int length = this.f63353a.length();
        while (true) {
            i15 = this.f63355c;
            if (i15 >= i14 || this.f63354b == length) {
                break;
            } else {
                d();
            }
        }
        if (i15 <= i14) {
            this.f63356d = false;
            return;
        }
        this.f63354b--;
        this.f63355c = i14;
        this.f63356d = true;
    }

    public final void k(int i14) {
        int i15 = this.f63357e;
        if (i14 >= i15) {
            this.f63354b = i15;
            this.f63355c = this.f63358f;
        }
        int length = this.f63353a.length();
        while (true) {
            int i16 = this.f63354b;
            if (i16 >= i14 || i16 == length) {
                break;
            } else {
                d();
            }
        }
        this.f63356d = false;
    }
}
