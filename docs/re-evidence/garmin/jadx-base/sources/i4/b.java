package i4;

import android.graphics.Rect;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import h5.e0;
import i3.e5;
import m4.i0;
import p005kotlin.Metadata;
import p1.j0;
import p1.t0;
import p5.b0;
import p5.d0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Li4/b;", "Li4/n;", "Lp5/t;", "Lm4/p;", "Li4/u;", "platformAutofillManager", "Lp5/b0;", "semanticsOwner", "Landroid/view/View;", "view", "Lq5/e;", "rectManager", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "<init>", "(Li4/u;Lp5/b0;Landroid/view/View;Lq5/e;Ljava/lang/String;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends n implements p5.t, m4.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f90824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f90825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f90826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q5.e f90827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f90828e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f90829f = new Rect();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AutofillId f90830g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j0 f90831h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f90832i;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f90833a;

        static {
            int[] iArr = new int[r5.a.values().length];
            try {
                iArr[r5.a.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r5.a.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f90833a = iArr;
        }
    }

    public b(u uVar, b0 b0Var, View view2, q5.e eVar, String str) {
        this.f90824a = uVar;
        this.f90825b = b0Var;
        this.f90826c = view2;
        this.f90827d = eVar;
        this.f90828e = str;
        int i14 = 1;
        view2.setImportantForAutofill(1);
        AutofillId autofillId = l5.a.a(view2.getAutofillId()).f110135a;
        if (autofillId == null) {
            throw e5.m("Required value was null.");
        }
        this.f90830g = autofillId;
        this.f90831h = new j0(0, i14, null);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0030  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Override // p5.t
    public final void a(e0 e0Var, p5.q qVar) {
        String str;
        String str2;
        r5.a aVar;
        r5.a aVar2;
        t tVar;
        Boolean bool;
        p5.q qVarY = e0Var.y();
        int i14 = e0Var.f81761b;
        t tVar2 = null;
        if (qVar != null) {
            d0.f135959a.getClass();
            s5.c cVar = (s5.c) p5.r.a(qVar, d0.G);
            if (cVar != null) {
                str = cVar.f157138b;
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        if (qVarY != null) {
            d0.f135959a.getClass();
            s5.c cVar2 = (s5.c) p5.r.a(qVarY, d0.G);
            if (cVar2 != null) {
                str2 = cVar2.f157138b;
            } else {
                str2 = null;
            }
        } else {
            str2 = null;
        }
        boolean z14 = false;
        u uVar = this.f90824a;
        View view2 = this.f90826c;
        if (str != str2) {
            if (str == null) {
                uVar.d(view2, i14, true);
            } else if (str2 == null) {
                uVar.d(view2, i14, false);
            } else {
                d0.f135959a.getClass();
                r rVar = (r) p5.r.a(qVarY, d0.f135978t);
                r.f90875a.getClass();
                if (p005kotlin.jvm.internal.s.g(rVar, r.a.f90877b)) {
                    j.f90842a.getClass();
                    uVar.a(view2, i14, j.a(str2));
                }
            }
        }
        if (qVar != null) {
            d0.f135959a.getClass();
            aVar = (r5.a) p5.r.a(qVar, d0.L);
        } else {
            aVar = null;
        }
        if (qVarY != null) {
            d0.f135959a.getClass();
            aVar2 = (r5.a) p5.r.a(qVarY, d0.L);
        } else {
            aVar2 = null;
        }
        if (aVar != aVar2) {
            if (aVar == null) {
                uVar.d(view2, i14, true);
            } else if (aVar2 == null) {
                uVar.d(view2, i14, false);
            } else {
                d0.f135959a.getClass();
                r rVar2 = (r) p5.r.a(qVarY, d0.f135978t);
                r.f90875a.getClass();
                if (p005kotlin.jvm.internal.s.g(rVar2, r.a.f90878c)) {
                    int i15 = a.f90833a[aVar2.ordinal()];
                    if (i15 != 1) {
                        bool = i15 != 2 ? null : Boolean.FALSE;
                    } else {
                        bool = Boolean.TRUE;
                    }
                    if (bool != null) {
                        j jVar = j.f90842a;
                        boolean zBooleanValue = bool.booleanValue();
                        jVar.getClass();
                        uVar.a(view2, i14, AutofillValue.forToggle(zBooleanValue));
                    }
                }
            }
        }
        if (qVar != null) {
            d0.f135959a.getClass();
            tVar = (t) p5.r.a(qVar, d0.f135979u);
        } else {
            tVar = null;
        }
        if (qVarY != null) {
            d0.f135959a.getClass();
            tVar2 = (t) p5.r.a(qVarY, d0.f135979u);
        }
        if (!p005kotlin.jvm.internal.s.g(tVar, tVar2)) {
            if (tVar == null) {
                uVar.d(view2, i14, true);
            } else if (tVar2 == null) {
                uVar.d(view2, i14, false);
            } else {
                uVar.a(view2, i14, ((h) tVar2).f90841b);
            }
        }
        boolean z15 = qVar != null && ge1.b.i(qVar);
        if (qVarY != null && ge1.b.i(qVarY)) {
            z14 = true;
        }
        if (z15 != z14) {
            j0 j0Var = this.f90831h;
            if (z14) {
                j0Var.b(i14);
            } else {
                j0Var.g(i14);
            }
        }
    }

    @Override // m4.p
    public final void v(i0 i0Var, m4.j0 j0Var) {
        e0 e0VarG;
        p5.q qVarY;
        e0 e0VarG2;
        p5.q qVarY2;
        if (i0Var != null && (e0VarG2 = h5.k.g(i0Var)) != null && (qVarY2 = e0VarG2.y()) != null) {
            t0<p5.j0<?>, Object> t0Var = qVarY2.f136085a;
            p5.p.f136057a.getClass();
            if (t0Var.a(p5.p.f136064h) || t0Var.a(p5.p.f136065i)) {
                this.f90824a.e(e0VarG2.f81761b, this.f90826c);
            }
        }
        if (j0Var == null || (e0VarG = h5.k.g(j0Var)) == null || (qVarY = e0VarG.y()) == null) {
            return;
        }
        t0<p5.j0<?>, Object> t0Var2 = qVarY.f136085a;
        p5.p.f136057a.getClass();
        if (t0Var2.a(p5.p.f136064h) || t0Var2.a(p5.p.f136065i)) {
            int i14 = e0VarG.f81761b;
            this.f90827d.f142832b.e(i14, new c(this, i14));
        }
    }
}
