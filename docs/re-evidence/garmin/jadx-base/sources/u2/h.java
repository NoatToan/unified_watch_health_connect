package u2;

import d4.n;
import d53.u;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.x;
import p3.c2;
import p3.p0;
import s5.w0;
import v2.g1;
import v2.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000b\fB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\n¨\u0006\r"}, d2 = {"Lu2/h;", "", "", "initialText", "Ls5/w0;", "initialSelection", "Lu2/k;", "initialTextUndoManager", "<init>", "(Ljava/lang/String;JLu2/k;Lkotlin/jvm/internal/j;)V", "(Ljava/lang/String;JLkotlin/jvm/internal/j;)V", "a", "b", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f167846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f167847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c2 f167848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c2 f167849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f167850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q3.c<a> f167851f;

    public interface a {
        void a(e eVar, e eVar2, boolean z14);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lu2/h$b;", "Ld4/k;", "Lu2/h;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements d4.k<h, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f167852a = new b();

        private b() {
        }

        @Override // d4.k
        public final h a(Object obj) {
            obj.getClass();
            List list = (List) obj;
            Object obj2 = list.get(0);
            Object obj3 = list.get(1);
            Object obj4 = list.get(2);
            Object obj5 = list.get(3);
            obj2.getClass();
            String str = (String) obj2;
            obj3.getClass();
            int iIntValue = ((Integer) obj3).intValue();
            obj4.getClass();
            long jL = og.a.l(iIntValue, ((Integer) obj4).intValue());
            k.a.C3151a c3151a = k.a.C3151a.f167860a;
            obj5.getClass();
            c3151a.getClass();
            return new h(str, jL, k.a.C3151a.c(obj5), (p005kotlin.jvm.internal.j) null);
        }

        @Override // d4.k
        public final Object b(n nVar, h hVar) {
            h hVar2 = hVar;
            String string = hVar2.b().f167839c.toString();
            long j8 = hVar2.b().f167840d;
            w0.a aVar = w0.f157315b;
            Integer numValueOf = Integer.valueOf((int) (j8 >> 32));
            Integer numValueOf2 = Integer.valueOf((int) (hVar2.b().f167840d & 4294967295L));
            k.a.C3151a c3151a = k.a.C3151a.f167860a;
            k kVar = hVar2.f167846a;
            c3151a.getClass();
            return x.k(string, numValueOf, numValueOf2, k.a.C3151a.d(nVar, kVar));
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f167853a;

        static {
            int[] iArr = new int[x2.c.values().length];
            try {
                iArr[x2.c.ClearHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x2.c.MergeIfPossible.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x2.c.NeverMerge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f167853a = iArr;
        }
    }

    private h(String str, long j8, k kVar) {
        this.f167846a = kVar;
        o oVar = null;
        e eVar = null;
        g1 g1Var = null;
        this.f167847b = new d(new e(str, og.a.x(0, str.length(), j8), null, null, null, null, 60, null), oVar, eVar, g1Var, 14, null);
        this.f167848c = p0.n(Boolean.FALSE);
        this.f167849d = p0.n(new e(str, j8, null, null, null, null, 60, null));
        this.f167850e = new l(this);
        this.f167851f = new q3.c<>(new a[16], 0);
    }

    public static final void a(h hVar, boolean z14, x2.c cVar) {
        e eVarB = hVar.b();
        if (hVar.f167847b.a().f175101a.f142358c == 0 && w0.d(eVarB.f167840d, hVar.f167847b.f167833d)) {
            if (s.g(eVarB.f167841e, hVar.f167847b.f167834e) && s.g(eVarB.f167842f, hVar.f167847b.f167836g) && s.g(eVarB.f167837a, hVar.f167847b.f167835f)) {
                return;
            }
            e eVarB2 = hVar.b();
            String string = hVar.f167847b.f167831b.toString();
            d dVar = hVar.f167847b;
            long j8 = dVar.f167833d;
            w0 w0Var = dVar.f167834e;
            hVar.f(eVarB2, new e(string, j8, w0Var, dVar.f167836g, i.a(w0Var, dVar.f167835f), null, 32, null), z14);
            return;
        }
        boolean z15 = false;
        boolean z16 = hVar.f167847b.a().f175101a.f142358c != 0;
        String string2 = hVar.f167847b.f167831b.toString();
        d dVar2 = hVar.f167847b;
        long j14 = dVar2.f167833d;
        w0 w0Var2 = dVar2.f167834e;
        e eVar = new e(string2, j14, w0Var2, dVar2.f167836g, i.a(w0Var2, dVar2.f167835f), null, 32, null);
        if (z16 && z14) {
            z15 = true;
        }
        hVar.f(eVarB, eVar, z15);
        hVar.c(eVarB, eVar, hVar.f167847b.a(), cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e b() {
        return (e) this.f167849d.getF182175a();
    }

    public final void c(e eVar, e eVar2, o oVar, x2.c cVar) {
        int i14 = c.f167853a[cVar.ordinal()];
        k kVar = this.f167846a;
        if (i14 == 1) {
            kVar.f167859b.setValue(null);
            x2.e<x2.d> eVar3 = kVar.f167858a;
            eVar3.f188478b.clear();
            eVar3.f188479c.clear();
            return;
        }
        if (i14 == 2) {
            oi0.c.S(kVar, eVar, eVar2, oVar, true);
        } else if (i14 == 3) {
            oi0.c.S(kVar, eVar, eVar2, oVar, false);
        } else {
            u0.r();
        }
    }

    public final void d(boolean z14) {
        this.f167848c.setValue(Boolean.valueOf(z14));
    }

    public final void e(d dVar, boolean z14, boolean z15) {
        e eVarG = d.g(this.f167847b, 0L, null, 15);
        if (z14) {
            o oVar = null;
            e eVar = null;
            g1 g1Var = null;
            this.f167847b = new d(new e(dVar.f167831b.toString(), dVar.f167833d, null, null, null, null, 60, null), oVar, eVar, g1Var, 14, null);
        } else if (z15) {
            d dVar2 = this.f167847b;
            long j8 = dVar.f167833d;
            w0.a aVar = w0.f157315b;
            dVar2.f(og.a.l((int) (j8 >> 32), (int) (j8 & 4294967295L)));
        }
        if (z14 || z15 || !s.g(eVarG.f167841e, dVar.f167834e)) {
            this.f167847b.e(null);
        }
        f(eVarG, d.g(this.f167847b, 0L, null, 15), true);
    }

    public final void f(e eVar, e eVar2, boolean z14) {
        this.f167849d.setValue(eVar2);
        d(false);
        q3.c<a> cVar = this.f167851f;
        a[] aVarArr = cVar.f142356a;
        int i14 = cVar.f142358c;
        for (int i15 = 0; i15 < i14; i15++) {
            aVarArr[i15].a(eVar, eVar2, (!z14 || u.m(eVar.f167839c, eVar2) || eVar.f167841e == null) ? false : true);
        }
    }

    public final String toString() {
        f4.f.f68735e.getClass();
        f4.f fVarA = f4.f.a.a();
        e23.l<Object, Unit> f68793s = fVarA != null ? fVarA.getF68793s() : null;
        f4.f fVarB = f4.f.a.b(fVarA);
        try {
            return "TextFieldState(selection=" + ((Object) w0.j(b().f167840d)) + ", text=\"" + ((Object) b().f167839c) + "\")";
        } finally {
            f4.f.a.e(fVarA, fVarB, f68793s);
        }
    }

    public /* synthetic */ h(String str, long j8, k kVar, p005kotlin.jvm.internal.j jVar) {
        this(str, j8, kVar);
    }

    public /* synthetic */ h(String str, long j8, p005kotlin.jvm.internal.j jVar) {
        this(str, j8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(String str, long j8, int i14, p005kotlin.jvm.internal.j jVar) {
        str = (i14 & 1) != 0 ? "" : str;
        if ((i14 & 2) != 0) {
            int length = str.length();
            j8 = og.a.l(length, length);
        }
        this(str, j8, (p005kotlin.jvm.internal.j) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private h(String str, long j8) {
        this(str, j8, new k(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), (p005kotlin.jvm.internal.j) null);
    }
}
