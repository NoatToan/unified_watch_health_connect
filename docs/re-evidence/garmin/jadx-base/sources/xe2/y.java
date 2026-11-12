package xe2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.garmin.android.apps.connectmobile.R;
import java.io.InputStream;
import java.net.URL;
import java.util.Set;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxe2/y;", "Lxe2/k0;", "<init>", "()V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y extends k0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f190581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f190582f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f190583g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ProgressBar f190584h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f190585i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Button f190586j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final s f190587k = new s(this, 0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final s f190588l = new s(this, 2);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o13.t f190589m = o13.m.b(new xa1.j(24));

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"xe2/y$a", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f190590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y f190591b;

        public a(View view2, y yVar) {
            this.f190590a = view2;
            this.f190591b = yVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            View view2 = this.f190590a;
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
            Set<Integer> setC1 = this.f190591b.u6().c1();
            if (setC1.size() >= 2) {
                NestedScrollView nestedScrollView = (NestedScrollView) view2.findViewById(R.id.scrollable_content);
                ViewGroup.LayoutParams layoutParams = nestedScrollView.getLayoutParams();
                layoutParams.getClass();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = ((Number) p13.h0.W(setC1, 1)).intValue();
                nestedScrollView.setLayoutParams(marginLayoutParams);
            }
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.ui.ContinueAsFrag$onViewCreated$4", f = "ContinueAsFrag.kt", l = {117, 118, 119}, m = "invokeSuspend")
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o53.i0 f190592a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public o53.j0 f190593b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f190594c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f190595d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
        @v13.e(c = "com.garmin.android.library.mobileauth.ui.ContinueAsFrag$onViewCreated$4$deferred1$1", f = "ContinueAsFrag.kt", l = {113}, m = "invokeSuspend")
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f190597a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y f190598b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(y yVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f190598b = yVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f190598b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f190597a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    this.f190597a = 1;
                    if (y.w6(this.f190598b, "onViewCreated", this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: xe2.y$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
        @v13.e(c = "com.garmin.android.library.mobileauth.ui.ContinueAsFrag$onViewCreated$4$deferred2$1", f = "ContinueAsFrag.kt", l = {}, m = "invokeSuspend")
        public static final class C3546b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ y f190599a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3546b(y yVar, t13.d<? super C3546b> dVar) {
                super(2, dVar);
                this.f190599a = yVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C3546b(this.f190599a, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C3546b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                y yVar = this.f190599a;
                ve2.s f50349r = yVar.u6().getF50349r();
                if (f50349r != null && !d53.w.J(f50349r.f177849a) && f50349r.f177851c) {
                    re2.g0.c(new wz1.c(17, yVar, f50349r), yVar);
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
        @v13.e(c = "com.garmin.android.library.mobileauth.ui.ContinueAsFrag$onViewCreated$4$deferred3$1", f = "ContinueAsFrag.kt", l = {115}, m = "invokeSuspend")
        public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f190600a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y f190601b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(y yVar, t13.d<? super c> dVar) {
                super(2, dVar);
                this.f190601b = yVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new c(this.f190601b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f190600a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    this.f190600a = 1;
                    if (y.v6(this.f190601b, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = y.this.new b(dVar);
            bVar.f190595d = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0098  */
        /* JADX WARN: Code duplicated, block: B:28:0x009f  */
        /* JADX WARN: Code duplicated, block: B:30:0x00a3  */
        /* JADX WARN: Code duplicated, block: B:31:0x00a9  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            o53.b0 b0Var;
            o53.i0 i0Var;
            o53.i0 i0Var2;
            o53.b0 b0Var2;
            o53.b0 b0Var3;
            ProgressBar progressBar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f190594c;
            y yVar = y.this;
            if (i14 == 0) {
                o13.r.b(obj);
                b0Var = (o53.b0) this.f190595d;
                ProgressBar progressBar2 = yVar.f190584h;
                if (progressBar2 == null) {
                    p005kotlin.jvm.internal.s.m("progressBar");
                    throw null;
                }
                progressBar2.setVisibility(0);
                x53.c cVar = o53.s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                o53.j0 j0VarJ = ge1.b.j(b0Var, bVar, null, new a(yVar, null), 2);
                o53.j0 j0VarJ2 = ge1.b.j(b0Var, o53.s0.f129406a, null, new C3546b(yVar, null), 2);
                o53.j0 j0VarJ3 = ge1.b.j(b0Var, bVar, null, new c(yVar, null), 2);
                this.f190595d = b0Var;
                this.f190592a = j0VarJ2;
                this.f190593b = j0VarJ3;
                this.f190594c = 1;
                if (j0VarJ.C(this) != aVar) {
                    i0Var = j0VarJ3;
                    i0Var2 = j0VarJ2;
                }
                return aVar;
            }
            if (i14 == 1) {
                i0Var = this.f190593b;
                i0Var2 = this.f190592a;
                b0Var = (o53.b0) this.f190595d;
                o13.r.b(obj);
            } else {
                if (i14 == 2) {
                    i0Var = this.f190592a;
                    b0Var2 = (o53.b0) this.f190595d;
                    o13.r.b(obj);
                    this.f190595d = b0Var2;
                    this.f190592a = null;
                    this.f190594c = 3;
                    if (i0Var.await(this) != aVar) {
                        b0Var3 = b0Var2;
                    }
                    return aVar;
                }
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b0Var3 = (o53.b0) this.f190595d;
                o13.r.b(obj);
            }
            if (o53.c0.g(b0Var3)) {
                progressBar = yVar.f190584h;
                if (progressBar != null) {
                    p005kotlin.jvm.internal.s.m("progressBar");
                    throw null;
                }
                progressBar.setVisibility(8);
            }
            return Unit.INSTANCE;
            this.f190595d = b0Var;
            this.f190592a = i0Var;
            this.f190593b = null;
            this.f190594c = 2;
            if (i0Var2.await(this) != aVar) {
                b0Var2 = b0Var;
                this.f190595d = b0Var2;
                this.f190592a = null;
                this.f190594c = 3;
                if (i0Var.await(this) != aVar) {
                    b0Var3 = b0Var2;
                    if (o53.c0.g(b0Var3)) {
                        progressBar = yVar.f190584h;
                        if (progressBar != null) {
                            p005kotlin.jvm.internal.s.m("progressBar");
                            throw null;
                        }
                        progressBar.setVisibility(8);
                    }
                    return Unit.INSTANCE;
                }
            }
            return aVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009e  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ee A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:59:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:62:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x0108  */
    /* JADX WARN: Code duplicated, block: B:65:0x0112  */
    /* JADX WARN: Code duplicated, block: B:68:0x012a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
    
        if (r12 == r1) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object v6(y yVar, v13.c cVar) throws Throwable {
        v vVar;
        te2.k0 k0Var;
        boolean z14;
        Object objL7;
        boolean z15;
        ve2.d dVar;
        boolean z16;
        ve2.e eVar;
        re2.b bVar;
        we2.g gVar;
        boolean zContains;
        Set<ve2.e> set;
        yVar.getClass();
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i14 = vVar.f190568e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                vVar.f190568e = i14 - Integer.MIN_VALUE;
            } else {
                vVar = new v(yVar, cVar);
            }
        } else {
            vVar = new v(yVar, cVar);
        }
        Object objE0 = vVar.f190566c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = vVar.f190568e;
        boolean z17 = false;
        int i16 = 1;
        if (i15 == 0) {
            o13.r.b(objE0);
            k0Var = new te2.k0();
            vVar.f190564a = k0Var;
            vVar.f190568e = 1;
            x53.c cVar2 = o53.s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new te2.o0(k0Var, null), vVar);
            if (objE0 != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            k0Var = vVar.f190564a;
            o13.r.b(objE0);
        } else {
            if (i15 == 2) {
                o13.r.b(objE0);
                tc2.a digitalAgeOfConsent = ((tc2.c) objE0).getDigitalAgeOfConsent();
                if ((digitalAgeOfConsent != null ? digitalAgeOfConsent.getStatus() : null) == tc2.b.UNDER) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                com.garmin.android.library.mobileauth.ui.b bVarU6 = yVar.u6();
                vVar.f190564a = null;
                vVar.f190565b = z14;
                vVar.f190568e = 3;
                objL7 = bVarU6.L7(vVar);
                if (objL7 != aVar) {
                    z15 = z14;
                    objE0 = objL7;
                    dVar = (ve2.d) objE0;
                    if (dVar != null) {
                    }
                    re2.b bVar2 = re2.b.f152215a;
                    vVar.f190565b = z15;
                    vVar.f190568e = 4;
                    bVar2.getClass();
                    objE0 = re2.b.q(vVar);
                    if (objE0 != aVar) {
                        z16 = z15;
                    }
                }
                return aVar;
            }
            if (i15 == 3) {
                z15 = vVar.f190565b;
                o13.r.b(objE0);
                dVar = (ve2.d) objE0;
                if (dVar != null || (eVar = dVar.f177690a) == null) {
                    re2.b bVar3 = re2.b.f152215a;
                    vVar.f190565b = z15;
                    vVar.f190568e = 4;
                    bVar3.getClass();
                    objE0 = re2.b.q(vVar);
                    if (objE0 != aVar) {
                        z16 = z15;
                    }
                    return aVar;
                }
                bVar = re2.b.f152215a;
                bVar.getClass();
                ve2.l lVarM = re2.b.m();
                lVarM.getClass();
                eVar.getClass();
                gVar = lVarM.f177763d;
                if (gVar != null || (set = gVar.f184856a) == null) {
                    zContains = false;
                } else {
                    zContains = set.contains(eVar);
                }
                if (!zContains && z15) {
                    z17 = true;
                }
                if (z17) {
                    if (g8.i.P(vVar.getF157466b())) {
                        re2.g0.c(new u(yVar, 2), yVar);
                    }
                } else {
                    if (z17) {
                        lc.u0.r();
                        return null;
                    }
                    if (g8.i.P(vVar.getF157466b())) {
                        re2.l0 l0Var = re2.l0.f152316a;
                        Context contextB = bVar.b();
                        l0Var.getClass();
                        re2.g0.c(new t(yVar, re2.l0.e(contextB), i16), yVar);
                    }
                }
                return Unit.INSTANCE;
            }
            if (i15 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z16 = vVar.f190565b;
            o13.r.b(objE0);
        }
        eVar = (ve2.e) objE0;
        z15 = z16;
        bVar = re2.b.f152215a;
        bVar.getClass();
        ve2.l lVarM2 = re2.b.m();
        lVarM2.getClass();
        eVar.getClass();
        gVar = lVarM2.f177763d;
        if (gVar != null) {
            zContains = false;
        } else {
            zContains = false;
        }
        if (!zContains) {
            z17 = true;
        }
        if (z17) {
            if (g8.i.P(vVar.getF157466b())) {
                re2.g0.c(new u(yVar, 2), yVar);
            }
        } else {
            if (z17) {
                lc.u0.r();
                return null;
            }
            if (g8.i.P(vVar.getF157466b())) {
                re2.l0 l0Var2 = re2.l0.f152316a;
                Context contextB2 = bVar.b();
                l0Var2.getClass();
                re2.g0.c(new t(yVar, re2.l0.e(contextB2), i16), yVar);
            }
        }
        return Unit.INSTANCE;
        if (((Boolean) objE0).booleanValue()) {
            vVar.f190564a = null;
            vVar.f190568e = 2;
            k0Var.getClass();
            x53.c cVar3 = o53.s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new te2.n0(k0Var, null), vVar);
        } else {
            z14 = false;
            com.garmin.android.library.mobileauth.ui.b bVarU7 = yVar.u6();
            vVar.f190564a = null;
            vVar.f190565b = z14;
            vVar.f190568e = 3;
            objL7 = bVarU7.L7(vVar);
            if (objL7 != aVar) {
                z15 = z14;
                objE0 = objL7;
                dVar = (ve2.d) objE0;
                if (dVar != null) {
                }
                re2.b bVar4 = re2.b.f152215a;
                vVar.f190565b = z15;
                vVar.f190568e = 4;
                bVar4.getClass();
                objE0 = re2.b.q(vVar);
                if (objE0 != aVar) {
                    z16 = z15;
                    eVar = (ve2.e) objE0;
                    z15 = z16;
                    bVar = re2.b.f152215a;
                    bVar.getClass();
                    ve2.l lVarM3 = re2.b.m();
                    lVarM3.getClass();
                    eVar.getClass();
                    gVar = lVarM3.f177763d;
                    if (gVar != null) {
                        zContains = false;
                    } else {
                        zContains = false;
                    }
                    if (!zContains) {
                        z17 = true;
                    }
                    if (z17) {
                        if (g8.i.P(vVar.getF157466b())) {
                            re2.g0.c(new u(yVar, 2), yVar);
                        }
                    } else {
                        if (z17) {
                            lc.u0.r();
                            return null;
                        }
                        if (g8.i.P(vVar.getF157466b())) {
                            re2.l0 l0Var3 = re2.l0.f152316a;
                            Context contextB3 = bVar.b();
                            l0Var3.getClass();
                            re2.g0.c(new t(yVar, re2.l0.e(contextB3), i16), yVar);
                        }
                    }
                    return Unit.INSTANCE;
                }
            }
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00dd, code lost:
    
        if (r10 == r2) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object w6(y yVar, String str, v13.c cVar) {
        w wVar;
        InputStream inputStreamOpenStream;
        yVar.getClass();
        o13.t tVar = yVar.f190589m;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i14 = wVar.f190574d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                wVar.f190574d = i14 - Integer.MIN_VALUE;
            } else {
                wVar = new w(yVar, cVar);
            }
        } else {
            wVar = new w(yVar, cVar);
        }
        Object objL7 = wVar.f190572b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = wVar.f190574d;
        try {
            try {
                if (i15 == 0) {
                    o13.r.b(objL7);
                    ((Logger) tVar.getValue()).debug("displayCustomerNameAndImage: calledFrom " + ((String) str));
                    com.garmin.android.library.mobileauth.ui.b bVarU6 = yVar.u6();
                    wVar.f190574d = 1;
                    objL7 = bVarU6.L7(wVar);
                    if (objL7 != aVar) {
                    }
                    return aVar;
                }
                if (i15 == 1) {
                    o13.r.b(objL7);
                } else {
                    if (i15 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    inputStreamOpenStream = wVar.f190571a;
                    o13.r.b(objL7);
                }
                re2.g0.c(new wz1.c(19, yVar, (Bitmap) objL7), yVar);
                str = inputStreamOpenStream;
                Unit unit = Unit.INSTANCE;
                jg.b.l(str, null);
                return Unit.INSTANCE;
                ve2.d dVar = (ve2.d) objL7;
                if (dVar != null && g8.i.P(wVar.getF157466b())) {
                    re2.g0.c(new wz1.c(18, yVar, dVar), yVar);
                    String str2 = dVar.f177693d;
                    if (str2 == null || d53.w.J(str2)) {
                        re2.g0.c(new u(yVar, 0), yVar);
                    } else {
                        re2.l0 l0Var = re2.l0.f152316a;
                        Context contextB = re2.b.f152215a.b();
                        l0Var.getClass();
                        if (re2.l0.e(contextB)) {
                            String str3 = dVar.f177693d;
                            str3.getClass();
                            inputStreamOpenStream = new URL(str3).openStream();
                            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenStream);
                            str = inputStreamOpenStream;
                            if (g8.i.P(wVar.getF157466b())) {
                                if (bitmapDecodeStream != null) {
                                    Context contextRequireContext = yVar.requireContext();
                                    contextRequireContext.getClass();
                                    wVar.f190571a = inputStreamOpenStream;
                                    wVar.f190574d = 2;
                                    objL7 = bitmapDecodeStream.isRecycled() ? null : ge1.b.e0(o53.s0.f129406a, new re2.h0(2.0f, contextRequireContext, bitmapDecodeStream, null), wVar);
                                } else {
                                    re2.g0.c(new u(yVar, 1), yVar);
                                    str = inputStreamOpenStream;
                                }
                            }
                            Unit unit2 = Unit.INSTANCE;
                            jg.b.l(str, null);
                        }
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    jg.b.l(str, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            ((Logger) tVar.getValue()).warn("displayCustomerNameAndImage", th5);
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.mobileauth_continue_as, viewGroup, false);
    }

    @Override // xe2.k0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        view2.getViewTreeObserver().addOnPreDrawListener(new a(view2, this));
        this.f190582f = (TextView) view2.findViewById(R.id.customer_name);
        ImageView imageView = (ImageView) view2.findViewById(R.id.customer_image);
        imageView.setBackgroundResource(R.drawable.mobileauth_avatar_default);
        imageView.setTag("evaluate");
        imageView.setOnClickListener(this.f190587k);
        this.f190581e = imageView;
        this.f190585i = (TextView) view2.findViewById(R.id.child_exchanges_blocked_text);
        this.f190586j = (Button) view2.findViewById(R.id.continue_button);
        this.f190583g = (TextView) view2.findViewById(R.id.skip_text);
        ((Button) view2.findViewById(R.id.switch_account_button)).setOnClickListener(this.f190588l);
        this.f190584h = (ProgressBar) view2.findViewById(R.id.progress_bar);
        androidx.lifecycle.n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        ge1.b.T(o53.f0.w(viewLifecycleOwner), null, null, new b(null), 3);
    }
}
