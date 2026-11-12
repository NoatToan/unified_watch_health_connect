package t3;

import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p3.n;
import p3.o0;
import p3.u0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lt3/b;", "", "Lp3/o0;", "composer", "Lt3/a;", "changeList", "<init>", "(Lp3/o0;Lt3/a;)V", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f162079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t3.a f162080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f162081c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f162084f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f162085g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f162090l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u0 f162082d = new u0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f162083e = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList<Object> f162086h = new ArrayList<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f162087i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f162088j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f162089k = -1;

    static {
        new a(null);
    }

    public b(o0 o0Var, t3.a aVar) {
        this.f162079a = o0Var;
        this.f162080b = aVar;
    }

    public final void a() {
        c();
        ArrayList<Object> arrayList = this.f162086h;
        if (arrayList.isEmpty()) {
            this.f162085g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i14 = this.f162085g;
        if (i14 > 0) {
            g gVar = this.f162080b.f162078a;
            gVar.d(d.i0.f162112c);
            gVar.f162135c[gVar.f162136d - gVar.f162133a[gVar.f162134b - 1].f162093a] = i14;
            this.f162085g = 0;
        }
        ArrayList<Object> arrayList = this.f162086h;
        if (arrayList.isEmpty()) {
            return;
        }
        t3.a aVar = this.f162080b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i15 = 0; i15 < size; i15++) {
            objArr[i15] = arrayList.get(i15);
        }
        aVar.getClass();
        if (size != 0) {
            g gVar2 = aVar.f162078a;
            gVar2.d(d.h.f162109c);
            g.b.a(gVar2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i14 = this.f162090l;
        if (i14 > 0) {
            int i15 = this.f162087i;
            if (i15 >= 0) {
                b();
                g gVar = this.f162080b.f162078a;
                gVar.d(d.y.f162129c);
                int i16 = gVar.f162136d - gVar.f162133a[gVar.f162134b - 1].f162093a;
                int[] iArr = gVar.f162135c;
                iArr[i16] = i15;
                iArr[i16 + 1] = i14;
                this.f162087i = -1;
            } else {
                int i17 = this.f162089k;
                int i18 = this.f162088j;
                b();
                g gVar2 = this.f162080b.f162078a;
                gVar2.d(d.s.f162123c);
                int i19 = gVar2.f162136d - gVar2.f162133a[gVar2.f162134b - 1].f162093a;
                int[] iArr2 = gVar2.f162135c;
                iArr2[i19 + 1] = i17;
                iArr2[i19] = i18;
                iArr2[i19 + 2] = i14;
                this.f162088j = -1;
                this.f162089k = -1;
            }
            this.f162090l = 0;
        }
    }

    public final void d(boolean z14) {
        o0 o0Var = this.f162079a;
        int i14 = z14 ? o0Var.H.f156342i : o0Var.H.f156340g;
        int i15 = i14 - this.f162084f;
        if (i15 < 0) {
            n.a("Tried to seek backward");
        }
        if (i15 > 0) {
            g gVar = this.f162080b.f162078a;
            gVar.d(d.a.f162095c);
            gVar.f162135c[gVar.f162136d - gVar.f162133a[gVar.f162134b - 1].f162093a] = i15;
            this.f162084f = i14;
        }
    }

    public final void e() {
        s3.h hVar = this.f162079a.H;
        if (hVar.f156336c > 0) {
            int i14 = hVar.f156342i;
            u0 u0Var = this.f162082d;
            if (u0Var.a(-2) != i14) {
                if (!this.f162081c && this.f162083e) {
                    d(false);
                    this.f162080b.f162078a.d(d.n.f162118c);
                    this.f162081c = true;
                }
                if (i14 > 0) {
                    s3.b bVarA = hVar.a(i14);
                    u0Var.c(i14);
                    d(false);
                    g gVar = this.f162080b.f162078a;
                    gVar.d(d.m.f162117c);
                    g.b.a(gVar, 0, bVarA);
                    this.f162081c = true;
                }
            }
        }
    }

    public final void f(int i14, int i15) {
        if (i15 > 0) {
            if (!(i14 >= 0)) {
                n.a("Invalid remove index " + i14);
            }
            if (this.f162087i == i14) {
                this.f162090l += i15;
                return;
            }
            c();
            this.f162087i = i14;
            this.f162090l = i15;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lt3/b$a;", "", "<init>", "()V", "", "invalidGroupLocation", "I", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
