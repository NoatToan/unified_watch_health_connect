package bt1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.c2;
import p3.p0;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B\u0093\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lbt1/u;", "", "Lj23/f;", "", "valuesRange", "Li53/c;", "Lbt1/j;", "pickerValues", "", "steps", "Lkotlin/Function1;", "", "valueFormatter", "valueFormatterWithSuffix", "valueWithSuffixContentDescriptionFormatter", "formattedValueToValue", "initialRange", "<init>", "(Lj23/f;Li53/c;ILe23/l;Le23/l;Le23/l;Le23/l;Lj23/f;)V", "a", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f21147q = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j23.f<Float> f21148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.c<j> f21149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.l<Float, String> f21151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e23.l<Float, String> f21152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e23.l<String, String> f21153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e23.l<String, Float> f21154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c2 f21155h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c2 f21156i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c2 f21157j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f4.s<j> f21158k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f4.s<j> f21159l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c2 f21160m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c2 f21161n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c2 f21162o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c2 f21163p;

    /* JADX WARN: Multi-variable type inference failed */
    public u(j23.f<Float> fVar, i53.c<j> cVar, int i14, e23.l<? super Float, String> lVar, e23.l<? super Float, String> lVar2, e23.l<? super String, String> lVar3, e23.l<? super String, Float> lVar4, j23.f<Float> fVar2) {
        fVar.getClass();
        cVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        lVar4.getClass();
        this.f21148a = fVar;
        this.f21149b = cVar;
        this.f21150c = i14;
        this.f21151d = lVar;
        this.f21152e = lVar2;
        this.f21153f = lVar3;
        this.f21154g = lVar4;
        this.f21155h = p0.n(fVar);
        this.f21156i = p0.n("");
        this.f21157j = p0.n("");
        this.f21158k = new f4.s<>();
        this.f21159l = new f4.s<>();
        this.f21160m = p0.n(null);
        this.f21161n = p0.n(null);
        Boolean bool = Boolean.FALSE;
        this.f21162o = p0.n(bool);
        this.f21163p = p0.n(bool);
        if (fVar2 != null) {
            h(this, fVar2, null, 4);
        } else {
            h(this, fVar, null, 4);
        }
    }

    public static j a(float f14, List list) {
        Float fValueOf;
        Iterator it = list.iterator();
        Object obj = null;
        if (it.hasNext()) {
            float fAbs = Math.abs(((j) it.next()).f21112a - f14);
            while (it.hasNext()) {
                fAbs = Math.min(fAbs, Math.abs(((j) it.next()).f21112a - f14));
            }
            fValueOf = Float.valueOf(fAbs);
        } else {
            fValueOf = null;
        }
        for (Object obj2 : list) {
            if (p005kotlin.jvm.internal.s.e(fValueOf, Math.abs(((j) obj2).f21112a - f14))) {
                obj = obj2;
                break;
            }
        }
        return (j) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void h(u uVar, j23.f fVar, e23.a aVar, int i14) {
        boolean z14 = (i14 & 2) == 0;
        if ((i14 & 4) != 0) {
            aVar = null;
        }
        uVar.g(fVar, z14, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b() {
        return ((Boolean) this.f21163p.getF182175a()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c() {
        return ((Boolean) this.f21162o.getF182175a()).booleanValue();
    }

    public final j23.f<Float> d() {
        return (j23.f) this.f21155h.getF182175a();
    }

    public final j23.l e() {
        Float start = d().getStart();
        e23.l<Float, String> lVar = this.f21151d;
        String strInvoke = lVar.invoke(start);
        e23.l<String, Float> lVar2 = this.f21154g;
        return new j23.l((int) lVar2.invoke(strInvoke).floatValue(), (int) lVar2.invoke(lVar.invoke(d().b())).floatValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!u.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        u uVar = (u) obj;
        return p005kotlin.jvm.internal.s.g(this.f21148a, uVar.f21148a) && p005kotlin.jvm.internal.s.g(this.f21149b, uVar.f21149b) && p005kotlin.jvm.internal.s.g(this.f21151d, uVar.f21151d) && p005kotlin.jvm.internal.s.g(this.f21152e, uVar.f21152e) && p005kotlin.jvm.internal.s.g(this.f21154g, uVar.f21154g) && p005kotlin.jvm.internal.s.g(d(), uVar.d()) && e().equals(uVar.e()) && p005kotlin.jvm.internal.s.g((String) this.f21156i.getF182175a(), (String) uVar.f21156i.getF182175a()) && p005kotlin.jvm.internal.s.g((String) this.f21157j.getF182175a(), (String) uVar.f21157j.getF182175a()) && p005kotlin.jvm.internal.s.g(this.f21158k, uVar.f21158k) && p005kotlin.jvm.internal.s.g(this.f21159l, uVar.f21159l) && p005kotlin.jvm.internal.s.g((j) this.f21160m.getF182175a(), (j) uVar.f21160m.getF182175a()) && p005kotlin.jvm.internal.s.g((j) this.f21161n.getF182175a(), (j) uVar.f21161n.getF182175a()) && c() == uVar.c() && b() == uVar.b();
    }

    public final void f() {
        f4.s<j> sVar = this.f21158k;
        sVar.clear();
        f4.s<j> sVar2 = this.f21159l;
        sVar2.clear();
        ArrayList arrayList = new ArrayList();
        i53.c<j> cVar = this.f21149b;
        for (j jVar : cVar) {
            if (jVar.f21112a <= e().f96797b) {
                arrayList.add(jVar);
            }
        }
        sVar.addAll(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (j jVar2 : cVar) {
            if (jVar2.f21112a >= e().f96796a) {
                arrayList2.add(jVar2);
            }
        }
        sVar2.addAll(arrayList2);
        this.f21160m.setValue(a(e().f96796a, sVar));
        this.f21161n.setValue(a(e().f96797b, sVar2));
    }

    public final void g(j23.f<Float> fVar, boolean z14, e23.a<Unit> aVar) {
        fVar.getClass();
        double d14 = z14 ? 0.0d : 1.0E-5d;
        double dAbs = Math.abs(fVar.getStart().floatValue() - d().getStart().floatValue());
        e23.l<Float, String> lVar = this.f21152e;
        if (dAbs >= d14) {
            this.f21156i.setValue(lVar.invoke(fVar.getStart()));
        }
        if (Math.abs(fVar.b().floatValue() - d().b().floatValue()) >= d14) {
            this.f21157j.setValue(lVar.invoke(fVar.b()));
        }
        this.f21155h.setValue(fVar);
        f();
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = (this.f21159l.hashCode() + ((this.f21158k.hashCode() + wr.g.j(wr.g.j((e().hashCode() + ((d().hashCode() + q6.f.h(q6.f.h(q6.f.h(l2.a(this.f21149b, this.f21148a.hashCode() * 31, 31), this.f21151d, 31), this.f21152e, 31), this.f21154g, 31)) * 31)) * 31, 31, (String) this.f21156i.getF182175a()), 31, (String) this.f21157j.getF182175a())) * 31)) * 31;
        j jVar = (j) this.f21160m.getF182175a();
        int iHashCode2 = (iHashCode + (jVar != null ? jVar.hashCode() : 0)) * 31;
        j jVar2 = (j) this.f21161n.getF182175a();
        return Boolean.hashCode(b()) + ((Boolean.hashCode(c()) + ((iHashCode2 + (jVar2 != null ? jVar2.hashCode() : 0)) * 31)) * 31);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbt1/u$a;", "", "<init>", "()V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static d4.l a(a aVar, j23.e eVar, i53.c cVar, int i14, e23.l lVar, e23.l lVar2, e23.l lVar3) {
            s sVar = new s(1);
            aVar.getClass();
            cVar.getClass();
            lVar.getClass();
            lVar2.getClass();
            lVar3.getClass();
            return d4.a.b(new bb1.a((byte) 0, 15), new t(eVar, cVar, i14, lVar, lVar2, sVar, lVar3));
        }

        private a() {
        }
    }

    public /* synthetic */ u(j23.f fVar, i53.c cVar, int i14, e23.l lVar, e23.l lVar2, e23.l lVar3, e23.l lVar4, j23.f fVar2, int i15, p005kotlin.jvm.internal.j jVar) {
        this(fVar, cVar, (i15 & 4) != 0 ? 0 : i14, lVar, (i15 & 16) != 0 ? lVar : lVar2, (i15 & 32) != 0 ? new s(0) : lVar3, lVar4, (i15 & 128) != 0 ? null : fVar2);
    }
}
