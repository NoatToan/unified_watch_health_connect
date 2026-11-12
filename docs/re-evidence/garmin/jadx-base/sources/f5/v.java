package f5;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.List;
import java.util.WeakHashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lf5/v;", "Landroidx/core/view/l1$b;", "Ljava/lang/Runnable;", "Landroidx/core/view/z;", "Landroid/view/View$OnAttachStateChangeListener;", "Li5/m;", "composeView", "<init>", "(Li5/m;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v extends androidx.core.view.l1.b implements Runnable, androidx.core.view.z, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f69135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f69136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.core.view.m1 f69137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p1.t0 f69138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p3.a2 f69139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p1.q0<p3.p1<Rect>> f69140f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f4.s<x1> f69141g;

    public v(kotlin.m mVar) {
        super(1);
        p1.t0 t0Var = new p1.t0(9);
        r2.f69091a.getClass();
        t0Var.m(r2.a.f69093b, new u2("caption bar"));
        t0Var.m(r2.a.f69094c, new u2("display cutout"));
        t0Var.m(r2.a.f69095d, new u2("ime"));
        t0Var.m(r2.a.f69096e, new u2("mandatory system gestures"));
        t0Var.m(r2.a.f69097f, new u2("navigation bars"));
        t0Var.m(r2.a.f69098g, new u2("status bars"));
        t0Var.m(r2.a.f69099h, new u2("system gestures"));
        t0Var.m(r2.a.f69100i, new u2("tappable element"));
        t0Var.m(r2.a.f69101j, new u2("waterfall"));
        this.f69138d = t0Var;
        this.f69139e = new p3.a2(0);
        this.f69140f = new p1.q0<>(4);
        this.f69141g = new f4.s<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(androidx.core.view.m1 m1Var) {
        char c14;
        char c15;
        boolean z14;
        char c16;
        boolean z15;
        boolean z16;
        long j8;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        int i14;
        p1.i0 i0Var = t2.f69114a;
        int[] iArr2 = i0Var.f134773b;
        Object[] objArr2 = i0Var.f134774c;
        long[] jArr2 = i0Var.f134772a;
        int length = jArr2.length - 2;
        p1.t0 t0Var = this.f69138d;
        if (length >= 0) {
            int i15 = 0;
            z15 = false;
            z16 = false;
            c14 = 16;
            c15 = ' ';
            while (true) {
                long j14 = jArr2[i15];
                z14 = true;
                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8;
                    int i17 = 8 - ((~(i15 - length)) >>> 31);
                    int i18 = 0;
                    c16 = '0';
                    while (i18 < i17) {
                        if ((j14 & 255) < 128) {
                            int i19 = (i15 << 3) + i18;
                            int i24 = iArr2[i19];
                            r2 r2Var = (r2) objArr2[i19];
                            androidx.core.view.m1.r rVar = m1Var.f6508a;
                            c7.e eVarI = rVar.i(i24);
                            long j15 = (((long) eVarI.f25190a) << 48) | (((long) eVarI.f25191b) << 32) | (((long) eVarI.f25192c) << 16) | ((long) eVarI.f25193d);
                            V vD = t0Var.d(r2Var);
                            vD.getClass();
                            u2 u2Var = (u2) vD;
                            if (!m2.a(j15, u2Var.f69131h)) {
                                u2Var.f69131h = j15;
                                z15 = true;
                                if (!m2.a(j15, 0L)) {
                                    z16 = true;
                                }
                            }
                            if (i24 != 8) {
                                c7.e eVarJ = rVar.j(i24);
                                long j16 = ((long) eVarJ.f25193d) | (((long) eVarJ.f25190a) << 48) | (((long) eVarJ.f25191b) << 32) | (((long) eVarJ.f25192c) << 16);
                                if (!m2.a(u2Var.f69132i, j16)) {
                                    u2Var.f69132i = j16;
                                    z15 = true;
                                    if (!m2.a(j16, 0L)) {
                                        z16 = true;
                                    }
                                }
                            }
                            u2Var.f69124a.setValue(Boolean.valueOf(rVar.u(i24)));
                            i14 = 8;
                        } else {
                            i14 = i16;
                        }
                        j14 >>= i14;
                        i18++;
                        i16 = i14;
                        jArr2 = jArr2;
                        iArr2 = iArr2;
                        objArr2 = objArr2;
                    }
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr2;
                    if (i17 != i16) {
                        break;
                    }
                } else {
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr2;
                    c16 = '0';
                }
                if (i15 == length) {
                    break;
                }
                i15++;
                jArr2 = jArr;
                iArr2 = iArr;
                objArr2 = objArr;
            }
        } else {
            c14 = 16;
            c15 = ' ';
            z14 = true;
            c16 = '0';
            z15 = false;
            z16 = false;
        }
        androidx.core.view.i iVarH = m1Var.f6508a.h();
        if (iVarH == null) {
            j8 = 0;
        } else {
            c7.e eVarB = iVarH.b();
            j8 = ((long) eVarB.f25193d) | (((long) eVarB.f25190a) << c16) | (((long) eVarB.f25191b) << c15) | (((long) eVarB.f25192c) << c14);
        }
        r2.f69091a.getClass();
        V vD2 = t0Var.d(r2.a.f69101j);
        vD2.getClass();
        u2 u2Var2 = (u2) vD2;
        u2Var2.f69124a.setValue(Boolean.valueOf(!m2.a(j8, 0L)));
        if (!m2.a(u2Var2.f69131h, j8)) {
            u2Var2.f69131h = j8;
            u2Var2.f69132i = j8;
            z15 = z14;
            if (!m2.a(j8, 0L)) {
                z16 = z15;
            }
        }
        f4.s<x1> sVar = this.f69141g;
        p1.q0<p3.p1<Rect>> q0Var = this.f69140f;
        if (iVarH != null) {
            List<Rect> boundingRects = iVarH.f6455a.getBoundingRects();
            if (boundingRects.size() < q0Var.f134668b) {
                q0Var.m(boundingRects.size(), q0Var.f134668b);
                sVar.b(boundingRects.size(), sVar.size());
                z15 = z14;
            } else {
                int size = boundingRects.size() - q0Var.f134668b;
                int i25 = 0;
                while (i25 < size) {
                    q0Var.g(p3.p0.n(boundingRects.get(q0Var.f134668b)));
                    sVar.add(new y1("display cutout rect " + q0Var.f134668b));
                    i25++;
                    z15 = z14;
                }
            }
            int size2 = boundingRects.size();
            for (int i26 = 0; i26 < size2; i26++) {
                Rect rect = boundingRects.get(i26);
                p3.p1<Rect> p1VarB = q0Var.b(i26);
                if (!p005kotlin.jvm.internal.s.g(p1VarB.getF182175a(), rect)) {
                    p1VarB.setValue(rect);
                    z15 = z14;
                }
            }
            if (!boundingRects.isEmpty()) {
                z16 = z14;
            }
        } else if (q0Var.f134668b > 0) {
            q0Var.j();
            sVar.clear();
            z15 = z14;
        }
        p3.a2 a2Var = this.f69139e;
        if ((z16 || a2Var.getIntValue() != 0) && z15) {
            a2Var.t(a2Var.getIntValue() + 1);
            f4.f.f68735e.getClass();
            f4.f.a.f();
        }
    }

    @Override // androidx.core.view.z
    public final androidx.core.view.m1 onApplyWindowInsets(View view2, androidx.core.view.m1 m1Var) {
        if (this.f69135a) {
            this.f69137c = m1Var;
            if (Build.VERSION.SDK_INT == 30) {
                view2.post(this);
                return m1Var;
            }
        } else if (this.f69136b == 0) {
            a(m1Var);
        }
        return m1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.core.view.l1.b
    public final void onEnd(androidx.core.view.l1 l1Var) {
        this.f69135a = false;
        int iD = l1Var.f6472a.d();
        this.f69136b &= ~iD;
        this.f69137c = null;
        r2 r2Var = (r2) t2.f69114a.b(iD);
        if (r2Var != null) {
            V vD = this.f69138d.d(r2Var);
            vD.getClass();
            u2 u2Var = (u2) vD;
            p3.z1 z1Var = u2Var.f69126c;
            z1Var.i(0.0f);
            u2Var.f69128e.i(1.0f);
            u2Var.f69127d.k(0L);
            z1Var.i(0.0f);
            u2Var.f69125b.setValue(Boolean.FALSE);
            u2Var.f69133j = -1L;
            u2Var.f69134k = -1L;
            p3.a2 a2Var = this.f69139e;
            a2Var.t(a2Var.getIntValue() + 1);
            f4.f.f68735e.getClass();
            f4.f.a.f();
        }
        super.onEnd(l1Var);
    }

    @Override // androidx.core.view.l1.b
    public final void onPrepare(androidx.core.view.l1 l1Var) {
        this.f69135a = true;
        super.onPrepare(l1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.core.view.l1.b
    public final androidx.core.view.m1 onProgress(androidx.core.view.m1 m1Var, List<androidx.core.view.l1> list) {
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            androidx.core.view.l1 l1Var = list.get(i14);
            r2 r2Var = (r2) t2.f69114a.b(l1Var.f6472a.d());
            if (r2Var != null) {
                V vD = this.f69138d.d(r2Var);
                vD.getClass();
                u2 u2Var = (u2) vD;
                if (((Boolean) u2Var.f69125b.getF182175a()).booleanValue()) {
                    androidx.core.view.l1.e eVar = l1Var.f6472a;
                    u2Var.f69126c.i(eVar.c());
                    u2Var.f69128e.i(eVar.a());
                    u2Var.f69127d.k(eVar.b());
                }
            }
        }
        a(m1Var);
        return m1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.core.view.l1.b
    public final androidx.core.view.l1.a onStart(androidx.core.view.l1 l1Var, androidx.core.view.l1.a aVar) {
        androidx.core.view.m1 m1Var = this.f69137c;
        this.f69135a = false;
        this.f69137c = null;
        androidx.core.view.l1.e eVar = l1Var.f6472a;
        androidx.core.view.l1.e eVar2 = l1Var.f6472a;
        if (eVar.b() > 0 && m1Var != null) {
            int iD = eVar2.d();
            this.f69136b |= iD;
            r2 r2Var = (r2) t2.f69114a.b(iD);
            if (r2Var != null) {
                V vD = this.f69138d.d(r2Var);
                vD.getClass();
                u2 u2Var = (u2) vD;
                c7.e eVarI = m1Var.f6508a.i(iD);
                long j8 = ((long) eVarI.f25193d) | (((long) eVarI.f25190a) << 48) | (((long) eVarI.f25191b) << 32) | (((long) eVarI.f25192c) << 16);
                long j14 = u2Var.f69131h;
                if (!m2.a(j8, j14)) {
                    u2Var.f69133j = j14;
                    u2Var.f69134k = j8;
                    u2Var.f69125b.setValue(Boolean.TRUE);
                    u2Var.f69126c.i(eVar2.c());
                    u2Var.f69128e.i(eVar2.a());
                    u2Var.f69127d.k(eVar2.b());
                    p3.a2 a2Var = this.f69139e;
                    a2Var.t(a2Var.getIntValue() + 1);
                    f4.f.f68735e.getClass();
                    f4.f.a.f();
                }
            }
        }
        return super.onStart(l1Var, aVar);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view2) {
        Object parent = view2.getParent();
        View view3 = parent instanceof View ? (View) parent : null;
        if (view3 != null) {
            view2 = view3;
        }
        WeakHashMap<View, androidx.core.view.g1> weakHashMap = androidx.core.view.s0.f6563a;
        androidx.core.view.s0.d.c(view2, this);
        androidx.core.view.s0.t(view2, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view2) {
        Object parent = view2.getParent();
        View view3 = parent instanceof View ? (View) parent : null;
        if (view3 != null) {
            view2 = view3;
        }
        WeakHashMap<View, androidx.core.view.g1> weakHashMap = androidx.core.view.s0.f6563a;
        androidx.core.view.s0.d.c(view2, null);
        androidx.core.view.s0.t(view2, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f69135a) {
            this.f69136b = 0;
            this.f69135a = false;
            androidx.core.view.m1 m1Var = this.f69137c;
            if (m1Var != null) {
                a(m1Var);
                this.f69137c = null;
            }
        }
    }
}
