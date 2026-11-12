package yc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lyc/e2;", "", "Key", "Value", "Lyc/u2;", "config", "<init>", "(Lyc/u2;)V", "a", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e2<Key, Value> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u2 f195880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f195881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f195882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f195883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f195884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f195885f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f195886g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f195887h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q53.b f195888i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q53.b f195889j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f195890k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k1 f195891l;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lyc/e2$a;", "", "Key", "Value", "Lyc/u2;", "config", "<init>", "(Lyc/u2;)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a<Key, Value> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z53.b f195892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e2<Key, Value> f195893b;

        public a(u2 u2Var) {
            u2Var.getClass();
            this.f195892a = z53.c.a();
            this.f195893b = new e2<>(u2Var, null);
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f195894a;

        static {
            int[] iArr = new int[c1.values().length];
            try {
                iArr[c1.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c1.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c1.APPEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f195894a = iArr;
        }
    }

    private e2(u2 u2Var) {
        this.f195880a = u2Var;
        ArrayList arrayList = new ArrayList();
        this.f195881b = arrayList;
        this.f195882c = arrayList;
        this.f195888i = q53.l.a(-1, 6, null);
        this.f195889j = q53.l.a(-1, 6, null);
        this.f195890k = new LinkedHashMap();
        k1 k1Var = new k1();
        k1Var.c(c1.REFRESH, z0.b.f196664b);
        this.f195891l = k1Var;
    }

    public final i3<Key, Value> a(t4.a aVar) {
        Integer numValueOf;
        ArrayList arrayList = this.f195882c;
        List listB1 = p13.h0.b1(arrayList);
        u2 u2Var = this.f195880a;
        if (aVar != null) {
            int i14 = aVar.f196491e;
            int iD = d();
            int i15 = -this.f195883d;
            int size = (arrayList.size() - 1) - this.f195883d;
            int i16 = i15;
            while (i16 < i14) {
                iD += i16 > size ? u2Var.f196510a : ((h3.b.c) arrayList.get(this.f195883d + i16)).f196016a.size();
                i16++;
            }
            int i17 = iD + aVar.f196492f;
            if (i14 < i15) {
                i17 -= u2Var.f196510a;
            }
            numValueOf = Integer.valueOf(i17);
        } else {
            numValueOf = null;
        }
        return new i3<>(listB1, numValueOf, u2Var, d());
    }

    public final void b(m1.a<Value> aVar) {
        int i14 = aVar.f196158d;
        c1 c1Var = aVar.f196155a;
        int iC = aVar.c();
        ArrayList arrayList = this.f195882c;
        if (iC > arrayList.size()) {
            throw new IllegalStateException(("invalid drop count. have " + arrayList.size() + " but wanted to drop " + aVar.c()).toString());
        }
        this.f195890k.remove(c1Var);
        z0.c.f196665b.getClass();
        this.f195891l.c(c1Var, z0.c.f196667d);
        int i15 = b.f195894a[c1Var.ordinal()];
        ArrayList arrayList2 = this.f195881b;
        if (i15 == 2) {
            int iC2 = aVar.c();
            for (int i16 = 0; i16 < iC2; i16++) {
                arrayList2.remove(0);
            }
            this.f195883d -= aVar.c();
            if (i14 == Integer.MIN_VALUE) {
                i14 = 0;
            }
            this.f195884e = i14;
            int i17 = this.f195886g + 1;
            this.f195886g = i17;
            this.f195888i.i(Integer.valueOf(i17));
            return;
        }
        if (i15 != 3) {
            com.google.firebase.messaging.l.j(c1Var, "cannot drop ");
            return;
        }
        int iC3 = aVar.c();
        for (int i18 = 0; i18 < iC3; i18++) {
            arrayList2.remove(arrayList.size() - 1);
        }
        if (i14 == Integer.MIN_VALUE) {
            i14 = 0;
        }
        this.f195885f = i14;
        int i19 = this.f195887h + 1;
        this.f195887h = i19;
        this.f195889j.i(Integer.valueOf(i19));
    }

    public final m1.a<Value> c(c1 c1Var, t4 t4Var) {
        c1Var.getClass();
        u2 u2Var = this.f195880a;
        int i14 = u2Var.f196514e;
        int i15 = u2Var.f196514e;
        if (i14 == Integer.MAX_VALUE) {
            return null;
        }
        ArrayList arrayList = this.f195882c;
        if (arrayList.size() <= 2) {
            return null;
        }
        Iterator it = arrayList.iterator();
        int iD = 0;
        int size = 0;
        while (it.hasNext()) {
            size += ((h3.b.c) it.next()).f196016a.size();
        }
        if (size <= i15) {
            return null;
        }
        if (c1Var == c1.REFRESH) {
            vb.h.y(c1Var, "Drop LoadType must be PREPEND or APPEND, but got ");
            return null;
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < arrayList.size()) {
            Iterator it3 = arrayList.iterator();
            int size2 = 0;
            while (it3.hasNext()) {
                size2 += ((h3.b.c) it3.next()).f196016a.size();
            }
            if (size2 - i17 <= i15) {
                break;
            }
            int[] iArr = b.f195894a;
            int size3 = iArr[c1Var.ordinal()] == 2 ? ((h3.b.c) arrayList.get(i16)).f196016a.size() : ((h3.b.c) arrayList.get(p13.x.j(arrayList) - i16)).f196016a.size();
            if (((iArr[c1Var.ordinal()] == 2 ? t4Var.f196487a : t4Var.f196488b) - i17) - size3 < u2Var.f196511b) {
                break;
            }
            i17 += size3;
            i16++;
        }
        if (i16 == 0) {
            return null;
        }
        int[] iArr2 = b.f195894a;
        int iJ = iArr2[c1Var.ordinal()] == 2 ? -this.f195883d : (p13.x.j(arrayList) - this.f195883d) - (i16 - 1);
        int iJ2 = iArr2[c1Var.ordinal()] == 2 ? (i16 - 1) - this.f195883d : p13.x.j(arrayList) - this.f195883d;
        if (u2Var.f196512c) {
            if (c1Var == c1.PREPEND) {
                iD = d() + i17;
            } else {
                iD = (u2Var.f196512c ? this.f195885f : 0) + i17;
            }
        }
        return new m1.a<>(c1Var, iJ, iJ2, iD);
    }

    public final int d() {
        if (this.f195880a.f196512c) {
            return this.f195884e;
        }
        return 0;
    }

    public final boolean e(int i14, c1 c1Var, h3.b.c<Key, Value> cVar) {
        c1Var.getClass();
        cVar.getClass();
        int i15 = cVar.f196019d;
        List<Value> list = cVar.f196016a;
        int i16 = cVar.f196020e;
        int i17 = b.f195894a[c1Var.ordinal()];
        ArrayList arrayList = this.f195881b;
        ArrayList arrayList2 = this.f195882c;
        if (i17 == 1) {
            if (!arrayList2.isEmpty()) {
                vb.h.z("cannot receive multiple init calls");
                return false;
            }
            if (i14 != 0) {
                vb.h.z("init loadId must be the initial value, 0");
                return false;
            }
            arrayList.add(cVar);
            this.f195883d = 0;
            if (i16 == Integer.MIN_VALUE) {
                i16 = 0;
            }
            this.f195885f = i16;
            if (i15 == Integer.MIN_VALUE) {
                i15 = 0;
            }
            this.f195884e = i15;
            return true;
        }
        LinkedHashMap linkedHashMap = this.f195890k;
        if (i17 != 2) {
            if (i17 != 3) {
                return true;
            }
            if (arrayList2.isEmpty()) {
                vb.h.z("should've received an init before append");
                return false;
            }
            if (i14 == this.f195887h) {
                arrayList.add(cVar);
                if (i16 == Integer.MIN_VALUE) {
                    int size = (this.f195880a.f196512c ? this.f195885f : 0) - list.size();
                    i16 = size < 0 ? 0 : size;
                }
                this.f195885f = i16 != Integer.MIN_VALUE ? i16 : 0;
                linkedHashMap.remove(c1.APPEND);
                return true;
            }
        } else {
            if (arrayList2.isEmpty()) {
                vb.h.z("should've received an init before prepend");
                return false;
            }
            if (i14 == this.f195886g) {
                arrayList.add(0, cVar);
                this.f195883d++;
                if (i15 == Integer.MIN_VALUE) {
                    int iD = d() - list.size();
                    i15 = iD < 0 ? 0 : iD;
                }
                this.f195884e = i15 != Integer.MIN_VALUE ? i15 : 0;
                linkedHashMap.remove(c1.PREPEND);
                return true;
            }
        }
        return false;
    }

    public final m1.b f(c1 c1Var, h3.b.c cVar) {
        int size;
        int i14;
        cVar.getClass();
        c1Var.getClass();
        int[] iArr = b.f195894a;
        int i15 = iArr[c1Var.ordinal()];
        if (i15 == 1) {
            size = 0;
        } else if (i15 == 2) {
            size = 0 - this.f195883d;
        } else {
            if (i15 != 3) {
                lc.u0.r();
                return null;
            }
            size = (this.f195882c.size() - this.f195883d) - 1;
        }
        List listC = p13.w.c(new p4(size, cVar.f196016a));
        int i16 = iArr[c1Var.ordinal()];
        u2 u2Var = this.f195880a;
        k1 k1Var = this.f195891l;
        if (i16 == 1) {
            m1.b.a aVar = m1.b.f196160g;
            int iD = d();
            i14 = u2Var.f196512c ? this.f195885f : 0;
            b1 b1VarD = k1Var.d();
            aVar.getClass();
            return m1.b.a.a(listC, iD, i14, b1VarD, null);
        }
        if (i16 == 2) {
            m1.b.a aVar2 = m1.b.f196160g;
            int iD2 = d();
            b1 b1VarD2 = k1Var.d();
            aVar2.getClass();
            return new m1.b(c1.PREPEND, listC, iD2, -1, b1VarD2, null, null);
        }
        if (i16 != 3) {
            lc.u0.r();
            return null;
        }
        m1.b.a aVar3 = m1.b.f196160g;
        i14 = u2Var.f196512c ? this.f195885f : 0;
        b1 b1VarD3 = k1Var.d();
        aVar3.getClass();
        return new m1.b(c1.APPEND, listC, -1, i14, b1VarD3, null, null);
    }

    public /* synthetic */ e2(u2 u2Var, p005kotlin.jvm.internal.j jVar) {
        this(u2Var);
    }
}
