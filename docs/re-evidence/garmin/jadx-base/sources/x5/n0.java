package x5;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import p006l2.s2;
import s5.w0;

/* JADX INFO: loaded from: classes.dex */
@o13.e
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000eB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\r¨\u0006\u000f"}, d2 = {"Lx5/n0;", "Lx5/g0;", "Landroid/view/View;", "view", "Lb5/l;", "rootPositionCalculator", "Lx5/s;", "inputMethodManager", "Ljava/util/concurrent/Executor;", "inputCommandProcessorExecutor", "<init>", "(Landroid/view/View;Lb5/l;Lx5/s;Ljava/util/concurrent/Executor;)V", "positionCalculator", "(Landroid/view/View;Lb5/l;)V", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f188888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f188889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f188890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f188891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e23.l<? super List<? extends k>, Unit> f188892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e23.l<? super p, Unit> f188893f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l0 f188894g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q f188895h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f188896i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f188897j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f188898k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x5.g f188899l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final q3.c<a> f188900m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public v.b0 f188901n;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx5/n0$a;", "", "<init>", "(Ljava/lang/String;I)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f188907a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.StartInput.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.StopInput.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.ShowKeyboard.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.HideKeyboard.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f188907a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/inputmethod/BaseInputConnection;", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c extends p005kotlin.jvm.internal.w implements e23.a<BaseInputConnection> {
        public c() {
            super(0);
        }

        @Override // e23.a
        public final BaseInputConnection invoke() {
            return new BaseInputConnection(n0.this.f188888a, false);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lx5/k;", "it", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.l<List<? extends k>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f188909a = new d();

        public d() {
            super(1);
        }

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Unit invoke(List<? extends k> list) {
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx5/p;", "it", "", "invoke-KlQnJC8", "(I)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.l<p, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f188910a = new e();

        public e() {
            super(1);
        }

        @Override // e23.l
        public final /* synthetic */ Unit invoke(p pVar) {
            int i14 = pVar.f188927a;
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lx5/k;", "it", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.l<List<? extends k>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f188911a = new f();

        public f() {
            super(1);
        }

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Unit invoke(List<? extends k> list) {
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx5/p;", "it", "", "invoke-KlQnJC8", "(I)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends p005kotlin.jvm.internal.w implements e23.l<p, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f188912a = new g();

        public g() {
            super(1);
        }

        @Override // e23.l
        public final /* synthetic */ Unit invoke(p pVar) {
            int i14 = pVar.f188927a;
            return Unit.INSTANCE;
        }
    }

    public n0(View view2, b5.l lVar, s sVar, Executor executor) {
        this.f188888a = view2;
        this.f188889b = sVar;
        this.f188890c = executor;
        this.f188892e = d.f188909a;
        this.f188893f = e.f188910a;
        w0.f157315b.getClass();
        this.f188894g = new l0("", w0.f157316c, (w0) null, 4, (p005kotlin.jvm.internal.j) null);
        q.f188930h.getClass();
        this.f188895h = q.f188931i;
        this.f188896i = new ArrayList();
        this.f188897j = o13.m.a(o13.n.NONE, new c());
        this.f188899l = new x5.g(lVar, sVar);
        this.f188900m = new q3.c<>(new a[16], 0);
    }

    @Override // x5.g0
    @o13.e
    public final void a(n4.d dVar) {
        Rect rect;
        this.f188898k = new Rect(MathKt.c(dVar.f123547a), MathKt.c(dVar.f123548b), MathKt.c(dVar.f123549c), MathKt.c(dVar.f123550d));
        if (!this.f188896i.isEmpty() || (rect = this.f188898k) == null) {
            return;
        }
        this.f188888a.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // x5.g0
    public final void b() {
        this.f188891d = false;
        this.f188892e = f.f188911a;
        this.f188893f = g.f188912a;
        this.f188898k = null;
        i(a.StopInput);
    }

    @Override // x5.g0
    public final void c(l0 l0Var, l0 l0Var2) {
        boolean z14 = (w0.d(this.f188894g.f188879b, l0Var2.f188879b) && p005kotlin.jvm.internal.s.g(this.f188894g.f188880c, l0Var2.f188880c)) ? false : true;
        this.f188894g = l0Var2;
        int size = this.f188896i.size();
        for (int i14 = 0; i14 < size; i14++) {
            h0 h0Var = (h0) ((WeakReference) this.f188896i.get(i14)).get();
            if (h0Var != null) {
                h0Var.f188859d = l0Var2;
            }
        }
        x5.g gVar = this.f188899l;
        synchronized (gVar.f188839c) {
            gVar.f188846j = null;
            gVar.f188848l = null;
            gVar.f188847k = null;
            gVar.f188849m = x5.f.f188835a;
            gVar.f188850n = null;
            gVar.f188851o = null;
            Unit unit = Unit.INSTANCE;
        }
        if (p005kotlin.jvm.internal.s.g(l0Var, l0Var2)) {
            if (z14) {
                s sVar = this.f188889b;
                int iH = w0.h(l0Var2.f188879b);
                int iG = w0.g(l0Var2.f188879b);
                w0 w0Var = this.f188894g.f188880c;
                int iH2 = w0Var != null ? w0.h(w0Var.f157317a) : -1;
                w0 w0Var2 = this.f188894g.f188880c;
                sVar.a(iH, iG, iH2, w0Var2 != null ? w0.g(w0Var2.f157317a) : -1);
                return;
            }
            return;
        }
        if (l0Var != null && (!p005kotlin.jvm.internal.s.g(l0Var.f188878a.f157138b, l0Var2.f188878a.f157138b) || (w0.d(l0Var.f188879b, l0Var2.f188879b) && !p005kotlin.jvm.internal.s.g(l0Var.f188880c, l0Var2.f188880c)))) {
            this.f188889b.b();
            return;
        }
        int size2 = this.f188896i.size();
        for (int i15 = 0; i15 < size2; i15++) {
            h0 h0Var2 = (h0) ((WeakReference) this.f188896i.get(i15)).get();
            if (h0Var2 != null) {
                l0 l0Var3 = this.f188894g;
                s sVar2 = this.f188889b;
                if (h0Var2.f188863h) {
                    h0Var2.f188859d = l0Var3;
                    if (h0Var2.f188861f) {
                        sVar2.updateExtractedText(h0Var2.f188860e, w13.b.n(l0Var3));
                    }
                    w0 w0Var3 = l0Var3.f188880c;
                    long j8 = l0Var3.f188879b;
                    int iH3 = w0Var3 != null ? w0.h(w0Var3.f157317a) : -1;
                    w0 w0Var4 = l0Var3.f188880c;
                    sVar2.a(w0.h(j8), w0.g(j8), iH3, w0Var4 != null ? w0.g(w0Var4.f157317a) : -1);
                }
            }
        }
    }

    @Override // x5.g0
    public final void d(l0 l0Var, c0 c0Var, s5.q0 q0Var, s2 s2Var, n4.d dVar, n4.d dVar2) {
        x5.g gVar = this.f188899l;
        synchronized (gVar.f188839c) {
            try {
                gVar.f188846j = l0Var;
                gVar.f188848l = c0Var;
                gVar.f188847k = q0Var;
                gVar.f188849m = s2Var;
                gVar.f188850n = dVar;
                gVar.f188851o = dVar2;
                if (gVar.f188841e || gVar.f188840d) {
                    gVar.a();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // x5.g0
    public final void e() {
        i(a.StartInput);
    }

    @Override // x5.g0
    public final void f() {
        i(a.HideKeyboard);
    }

    @Override // x5.g0
    public final void g(l0 l0Var, q qVar, k62.k kVar, e23.l lVar) {
        this.f188891d = true;
        this.f188894g = l0Var;
        this.f188895h = qVar;
        this.f188892e = kVar;
        this.f188893f = lVar;
        i(a.StartInput);
    }

    @Override // x5.g0
    public final void h() {
        i(a.ShowKeyboard);
    }

    public final void i(a aVar) {
        this.f188900m.b(aVar);
        if (this.f188901n == null) {
            v.b0 b0Var = new v.b0(this, 21);
            this.f188890c.execute(b0Var);
            this.f188901n = b0Var;
        }
    }

    public n0(View view2, b5.l lVar, s sVar, Executor executor, int i14, p005kotlin.jvm.internal.j jVar) {
        this(view2, lVar, sVar, (i14 & 8) != 0 ? new ka.l(Choreographer.getInstance(), 1) : executor);
    }

    public n0(View view2, b5.l lVar) {
        this(view2, lVar, new t(view2), null, 8, null);
    }
}
