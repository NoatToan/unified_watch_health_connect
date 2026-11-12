package com.garmin.android.library.mobileauth.ui;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.n0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.library.mobileauth.ui.g.c;
import d53.w;
import e23.p;
import java.util.Iterator;
import java.util.Set;
import o13.r;
import o53.b0;
import o53.f0;
import o53.s0;
import o53.t1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.x;
import re2.i0;
import re2.l0;
import u53.o;
import v13.i;
import vb.h;
import ve2.l;
import xe2.k0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/library/mobileauth/ui/g;", "Lxe2/k0;", "<init>", "()V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g extends k0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l f50454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Button f50455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Button f50456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f50457h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f50458i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AlertDialog f50459j;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.ui.WelcomeFrag$onResume$1", f = "WelcomeFrag.kt", l = {192, 196, 209}, m = "invokeSuspend")
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ve2.e f50460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f50461b;

        /* JADX INFO: renamed from: com.garmin.android.library.mobileauth.ui.g$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 1, 0})
        @v13.e(c = "com.garmin.android.library.mobileauth.ui.WelcomeFrag$onResume$1$isNetworkAvailable$1", f = "WelcomeFrag.kt", l = {}, m = "invokeSuspend")
        public static final class C1006a extends i implements p<b0, t13.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g f50463a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1006a(g gVar, t13.d<? super C1006a> dVar) {
                super(2, dVar);
                this.f50463a = gVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C1006a(this.f50463a, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Boolean> dVar) {
                return ((C1006a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                l0 l0Var = l0.f152316a;
                Context contextRequireContext = this.f50463a.requireContext();
                contextRequireContext.getClass();
                l0Var.getClass();
                return Boolean.valueOf(l0.e(contextRequireContext));
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
        @v13.e(c = "com.garmin.android.library.mobileauth.ui.WelcomeFrag$onResume$1$regionAwareText$1", f = "WelcomeFrag.kt", l = {197}, m = "invokeSuspend")
        public static final class b extends i implements p<b0, t13.d<? super String>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f50464a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f50465b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ve2.e f50466c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(g gVar, ve2.e eVar, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f50465b = gVar;
                this.f50466c = eVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f50465b, this.f50466c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super String> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f50464a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                l0 l0Var = l0.f152316a;
                g gVar = this.f50465b;
                Resources resources = gVar.getResources();
                resources.getClass();
                String string = gVar.getString(R.string.ssoAdvancedSettingsButtonText);
                string.getClass();
                this.f50464a = 1;
                l0Var.getClass();
                x53.c cVar = s0.f129406a;
                Object objE0 = ge1.b.e0(x53.b.f189152a, new i0(this.f50466c, resources, string, null), this);
                return objE0 == aVar ? aVar : objE0;
            }
        }

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return g.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:38:0x008f  */
        /* JADX WARN: Code duplicated, block: B:40:0x0093  */
        /* JADX WARN: Code duplicated, block: B:42:0x009e  */
        /* JADX WARN: Code duplicated, block: B:48:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:50:0x00c6  */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
        
            if (r9 == r0) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00b3, code lost:
        
            if (r9 == r0) goto L45;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            ve2.e eVar;
            TextView textView;
            TextView textView2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f50461b;
            g gVar = g.this;
            if (i14 == 0) {
                r.b(obj);
                this.f50461b = 1;
                gVar.getClass();
                re2.b.f152215a.getClass();
                obj = re2.b.q(this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                r.b(obj);
            } else if (i14 == 2) {
                eVar = this.f50460a;
                r.b(obj);
                String str = (String) obj;
                TextView textView3 = gVar.f50458i;
                if (textView3 == null) {
                    s.m("countrySelector");
                    throw null;
                }
                textView3.setText(str);
                if (gVar.u6().d7() && (eVar == ve2.e.f177704d || eVar == ve2.e.f177705e)) {
                    TextView textView4 = gVar.f50457h;
                    if (textView4 == null) {
                        s.m("environmentTextView");
                        throw null;
                    }
                    textView4.setVisibility(8);
                } else {
                    textView = gVar.f50457h;
                    if (textView == null) {
                        s.m("environmentTextView");
                        throw null;
                    }
                    textView.setText(eVar.name());
                    textView2 = gVar.f50457h;
                    if (textView2 == null) {
                        s.m("environmentTextView");
                        throw null;
                    }
                    textView2.setVisibility(0);
                }
                x53.c cVar = s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                C1006a c1006a = new C1006a(gVar, null);
                this.f50460a = null;
                this.f50461b = 3;
                obj = ge1.b.e0(bVar, c1006a, this);
            } else {
                if (i14 != 3) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            gVar.w6(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
            eVar = (ve2.e) obj;
            TextView textView5 = gVar.f50458i;
            if (textView5 == null) {
                s.m("countrySelector");
                throw null;
            }
            if (textView5.getVisibility() == 0) {
                x53.c cVar2 = s0.f129406a;
                x53.b bVar2 = x53.b.f189152a;
                b bVar3 = new b(gVar, eVar, null);
                this.f50460a = eVar;
                this.f50461b = 2;
                obj = ge1.b.e0(bVar2, bVar3, this);
            } else {
                if (gVar.u6().d7()) {
                    textView = gVar.f50457h;
                    if (textView == null) {
                        s.m("environmentTextView");
                        throw null;
                    }
                    textView.setText(eVar.name());
                    textView2 = gVar.f50457h;
                    if (textView2 == null) {
                        s.m("environmentTextView");
                        throw null;
                    }
                    textView2.setVisibility(0);
                } else {
                    textView = gVar.f50457h;
                    if (textView == null) {
                        s.m("environmentTextView");
                        throw null;
                    }
                    textView.setText(eVar.name());
                    textView2 = gVar.f50457h;
                    if (textView2 == null) {
                        s.m("environmentTextView");
                        throw null;
                    }
                    textView2.setVisibility(0);
                }
                x53.c cVar3 = s0.f129406a;
                x53.b bVar4 = x53.b.f189152a;
                C1006a c1006a2 = new C1006a(gVar, null);
                this.f50460a = null;
                this.f50461b = 3;
                obj = ge1.b.e0(bVar4, c1006a2, this);
            }
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/library/mobileauth/ui/g$b", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f50467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f50468b;

        public b(View view2, g gVar) {
            this.f50467a = view2;
            this.f50468b = gVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            View view2 = this.f50467a;
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
            Set<Integer> setC1 = this.f50468b.u6().c1();
            if (setC1.size() >= 2) {
                NestedScrollView nestedScrollView = (NestedScrollView) view2.findViewById(R.id.scrollable_content);
                ViewGroup.LayoutParams layoutParams = nestedScrollView.getLayoutParams();
                layoutParams.getClass();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = ((Number) h0.W(setC1, 1)).intValue();
                nestedScrollView.setLayoutParams(marginLayoutParams);
            }
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/library/mobileauth/ui/g$c", "Lcom/garmin/android/library/mobileauth/ui/c$a$a;", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements com.garmin.android.library.mobileauth.ui.c.a.InterfaceC1004a {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
        @v13.e(c = "com.garmin.android.library.mobileauth.ui.WelcomeFrag$onViewCreated$5$1$onNewEnvironmentSelected$1", f = "WelcomeFrag.kt", l = {130}, m = "invokeSuspend")
        public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f50470a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ve2.e f50471b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ g f50472c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ve2.e eVar, g gVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f50471b = eVar;
                this.f50472c = gVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f50471b, this.f50472c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f50470a;
                ve2.e eVar = this.f50471b;
                g gVar = this.f50472c;
                try {
                    if (i14 == 0) {
                        r.b(obj);
                        re2.b bVar = re2.b.f152215a;
                        this.f50470a = 1;
                        bVar.getClass();
                        if (re2.b.F(eVar, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i14 != 1) {
                            h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj);
                    }
                    TextView textView = gVar.f50457h;
                    if (textView == null) {
                        s.m("environmentTextView");
                        throw null;
                    }
                    textView.setText(eVar.name());
                    AlertDialog alertDialog = gVar.f50459j;
                    if (alertDialog != null) {
                        alertDialog.dismiss();
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th3) {
                    AlertDialog alertDialog2 = gVar.f50459j;
                    if (alertDialog2 != null) {
                        alertDialog2.dismiss();
                    }
                    throw th3;
                }
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
        @v13.e(c = "com.garmin.android.library.mobileauth.ui.WelcomeFrag$onViewCreated$5$1$onUserCancelled$1", f = "WelcomeFrag.kt", l = {}, m = "invokeSuspend")
        public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g f50473a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(g gVar, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f50473a = gVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f50473a, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                AlertDialog alertDialog = this.f50473a.f50459j;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
                return Unit.INSTANCE;
            }
        }

        public c() {
        }

        @Override // com.garmin.android.library.mobileauth.ui.c.a.InterfaceC1004a
        public final void d(ve2.e eVar) {
            eVar.getClass();
            g gVar = g.this;
            n0 viewLifecycleOwner = gVar.getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            androidx.lifecycle.i0 i0VarW = f0.w(viewLifecycleOwner);
            x53.c cVar = s0.f129406a;
            ge1.b.T(i0VarW, o.f168762a, null, new a(eVar, gVar, null), 2);
        }

        @Override // com.garmin.android.library.mobileauth.ui.c.a.InterfaceC1004a
        public final void g() {
            g gVar = g.this;
            n0 viewLifecycleOwner = gVar.getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            androidx.lifecycle.i0 i0VarW = f0.w(viewLifecycleOwner);
            x53.c cVar = s0.f129406a;
            ge1.b.T(i0VarW, o.f168762a, null, new b(gVar, null), 2);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.ui.WelcomeFrag$onViewCreated$7$1", f = "WelcomeFrag.kt", l = {159, 161}, m = "invokeSuspend")
    public static final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f50474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g f50475b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Iterator f50476c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f50477d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f50478e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ bf2.a f50480g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ View f50481h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
        @v13.e(c = "com.garmin.android.library.mobileauth.ui.WelcomeFrag$onViewCreated$7$1$1$1", f = "WelcomeFrag.kt", l = {}, m = "invokeSuspend")
        public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f50482a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f50483b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ g f50484c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ bf2.b f50485d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i14, View view2, g gVar, bf2.b bVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f50482a = i14;
                this.f50483b = view2;
                this.f50484c = gVar;
                this.f50485d = bVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f50482a, this.f50483b, this.f50484c, this.f50485d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                bf2.b bVar = this.f50485d;
                g gVar = this.f50484c;
                View view2 = this.f50483b;
                int i14 = this.f50482a;
                if (i14 == 0) {
                    view2.findViewById(R.id.social_login_divider).setVisibility(0);
                    View viewFindViewById = view2.findViewById(R.id.social_login_icon_slot0);
                    viewFindViewById.getClass();
                    g.v6(gVar, (ImageView) viewFindViewById, bVar);
                } else {
                    if (i14 != 1) {
                        return Unit.INSTANCE;
                    }
                    View viewFindViewById2 = view2.findViewById(R.id.social_login_icon_slot1);
                    viewFindViewById2.getClass();
                    g.v6(gVar, (ImageView) viewFindViewById2, bVar);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(bf2.a aVar, View view2, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f50480g = aVar;
            this.f50481h = view2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return g.this.new d(this.f50480g, this.f50481h, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0056  */
        /* JADX WARN: Code duplicated, block: B:19:0x005e  */
        /* JADX WARN: Code duplicated, block: B:22:0x007c  */
        /* JADX WARN: Code duplicated, block: B:24:0x0080  */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
        
            if (r13 == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
        
            if (ge1.b.e0(r13, r6, r12) == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
        
            return r0;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0079 -> B:7:0x001c). Please report as a decompilation issue!!! */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            View view2;
            g gVar;
            int i14;
            Iterator it;
            Object next;
            int i15;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i16 = this.f50478e;
            g gVar2 = g.this;
            if (i16 != 0) {
                if (i16 == 1) {
                    r.b(obj);
                } else {
                    if (i16 != 2) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i15 = this.f50477d;
                    it = this.f50476c;
                    g gVar3 = this.f50475b;
                    View view3 = this.f50474a;
                    r.b(obj);
                    gVar = gVar3;
                    view2 = view3;
                }
                i14 = i15;
                if (it.hasNext()) {
                    return Unit.INSTANCE;
                }
                next = it.next();
                i15 = i14 + 1;
                if (i14 >= 0) {
                    x.q();
                    throw null;
                }
                bf2.b bVar = (bf2.b) next;
                x53.c cVar = s0.f129406a;
                t1 t1Var = o.f168762a;
                a aVar2 = new a(i14, view2, gVar, bVar, null);
                this.f50474a = view2;
                this.f50475b = gVar;
                this.f50476c = it;
                this.f50477d = i15;
                this.f50478e = 2;
            } else {
                r.b(obj);
                this.f50478e = 1;
                gVar2.getClass();
                re2.b.f152215a.getClass();
                obj = re2.b.q(this);
            }
            this.f50480g.a((ve2.e) obj).getClass();
            p13.i0 i0Var = p13.i0.f134941a;
            view2 = this.f50481h;
            gVar = gVar2;
            i14 = 0;
            it = i0Var;
            if (it.hasNext()) {
                return Unit.INSTANCE;
            }
            next = it.next();
            i15 = i14 + 1;
            if (i14 >= 0) {
                x.q();
                throw null;
            }
            bf2.b bVar2 = (bf2.b) next;
            x53.c cVar2 = s0.f129406a;
            t1 t1Var2 = o.f168762a;
            a aVar3 = new a(i14, view2, gVar, bVar2, null);
            this.f50474a = view2;
            this.f50475b = gVar;
            this.f50476c = it;
            this.f50477d = i15;
            this.f50478e = 2;
        }
    }

    public static final void v6(g gVar, ImageView imageView, bf2.b bVar) {
        imageView.setBackground(a7.b.getDrawable(gVar.requireContext(), bVar.f17826b));
        imageView.setTag(bVar.f17825a);
        imageView.setOnClickListener(new wv2.h(5, gVar, bVar));
        imageView.setVisibility(0);
    }

    @Override // xe2.k0, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        re2.b.f152215a.getClass();
        this.f50454e = re2.b.m();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.mobileauth_welcome, viewGroup, false);
    }

    @Override // xe2.k0, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        androidx.lifecycle.i0 i0VarW = f0.w(viewLifecycleOwner);
        x53.c cVar = s0.f129406a;
        ge1.b.T(i0VarW, o.f168762a, null, new a(null), 2);
    }

    @Override // xe2.k0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        view2.getViewTreeObserver().addOnPreDrawListener(new b(view2, this));
        View viewFindViewById = view2.findViewById(R.id.welcome_text);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        CharSequence text = textView.getText();
        final int i14 = 0;
        textView.setVisibility((text == null || w.J(text)) ? 8 : 0);
        View viewFindViewById2 = view2.findViewById(R.id.create_account_button);
        viewFindViewById2.getClass();
        Button button = (Button) viewFindViewById2;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: xe2.y0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.library.mobileauth.ui.g f190603b;

            {
                this.f190603b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i14) {
                    case 0:
                        this.f190603b.u6().b4();
                        break;
                    case 1:
                        this.f190603b.u6().t2();
                        break;
                    case 2:
                        com.garmin.android.library.mobileauth.ui.c.a aVar = com.garmin.android.library.mobileauth.ui.c.f50424a;
                        com.garmin.android.library.mobileauth.ui.g gVar = this.f190603b;
                        Context contextRequireContext = gVar.requireContext();
                        contextRequireContext.getClass();
                        com.garmin.android.library.mobileauth.ui.g.c cVar = gVar.new c();
                        aVar.getClass();
                        AlertDialog alertDialogA = com.garmin.android.library.mobileauth.ui.c.a.a(contextRequireContext, cVar);
                        alertDialogA.show();
                        gVar.f50459j = alertDialogA;
                        break;
                    case 3:
                        this.f190603b.u6().B0();
                        break;
                    default:
                        this.f190603b.u6().y0();
                        break;
                }
            }
        });
        this.f50456g = button;
        View viewFindViewById3 = view2.findViewById(R.id.sign_in_button);
        viewFindViewById3.getClass();
        Button button2 = (Button) viewFindViewById3;
        final int i15 = 1;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: xe2.y0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.library.mobileauth.ui.g f190603b;

            {
                this.f190603b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i15) {
                    case 0:
                        this.f190603b.u6().b4();
                        break;
                    case 1:
                        this.f190603b.u6().t2();
                        break;
                    case 2:
                        com.garmin.android.library.mobileauth.ui.c.a aVar = com.garmin.android.library.mobileauth.ui.c.f50424a;
                        com.garmin.android.library.mobileauth.ui.g gVar = this.f190603b;
                        Context contextRequireContext = gVar.requireContext();
                        contextRequireContext.getClass();
                        com.garmin.android.library.mobileauth.ui.g.c cVar = gVar.new c();
                        aVar.getClass();
                        AlertDialog alertDialogA = com.garmin.android.library.mobileauth.ui.c.a.a(contextRequireContext, cVar);
                        alertDialogA.show();
                        gVar.f50459j = alertDialogA;
                        break;
                    case 3:
                        this.f190603b.u6().B0();
                        break;
                    default:
                        this.f190603b.u6().y0();
                        break;
                }
            }
        });
        this.f50455f = button2;
        View viewFindViewById4 = view2.findViewById(R.id.server_environment);
        viewFindViewById4.getClass();
        TextView textView2 = (TextView) viewFindViewById4;
        this.f50457h = textView2;
        textView2.setText("");
        TextView textView3 = this.f50457h;
        if (textView3 == null) {
            s.m("environmentTextView");
            throw null;
        }
        final int i16 = 2;
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: xe2.y0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.library.mobileauth.ui.g f190603b;

            {
                this.f190603b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i16) {
                    case 0:
                        this.f190603b.u6().b4();
                        break;
                    case 1:
                        this.f190603b.u6().t2();
                        break;
                    case 2:
                        com.garmin.android.library.mobileauth.ui.c.a aVar = com.garmin.android.library.mobileauth.ui.c.f50424a;
                        com.garmin.android.library.mobileauth.ui.g gVar = this.f190603b;
                        Context contextRequireContext = gVar.requireContext();
                        contextRequireContext.getClass();
                        com.garmin.android.library.mobileauth.ui.g.c cVar = gVar.new c();
                        aVar.getClass();
                        AlertDialog alertDialogA = com.garmin.android.library.mobileauth.ui.c.a.a(contextRequireContext, cVar);
                        alertDialogA.show();
                        gVar.f50459j = alertDialogA;
                        break;
                    case 3:
                        this.f190603b.u6().B0();
                        break;
                    default:
                        this.f190603b.u6().y0();
                        break;
                }
            }
        });
        View viewFindViewById5 = view2.findViewById(R.id.country_selector);
        viewFindViewById5.getClass();
        TextView textView4 = (TextView) viewFindViewById5;
        this.f50458i = textView4;
        l lVar = this.f50454e;
        if (lVar == null) {
            s.m("mobileAuthConfig");
            throw null;
        }
        if (lVar.f177773n) {
            textView4.setText("");
            textView4.setVisibility(0);
            final int i17 = 3;
            textView4.setOnClickListener(new View.OnClickListener(this) { // from class: xe2.y0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.library.mobileauth.ui.g f190603b;

                {
                    this.f190603b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i17) {
                        case 0:
                            this.f190603b.u6().b4();
                            break;
                        case 1:
                            this.f190603b.u6().t2();
                            break;
                        case 2:
                            com.garmin.android.library.mobileauth.ui.c.a aVar = com.garmin.android.library.mobileauth.ui.c.f50424a;
                            com.garmin.android.library.mobileauth.ui.g gVar = this.f190603b;
                            Context contextRequireContext = gVar.requireContext();
                            contextRequireContext.getClass();
                            com.garmin.android.library.mobileauth.ui.g.c cVar = gVar.new c();
                            aVar.getClass();
                            AlertDialog alertDialogA = com.garmin.android.library.mobileauth.ui.c.a.a(contextRequireContext, cVar);
                            alertDialogA.show();
                            gVar.f50459j = alertDialogA;
                            break;
                        case 3:
                            this.f190603b.u6().B0();
                            break;
                        default:
                            this.f190603b.u6().y0();
                            break;
                    }
                }
            });
        } else {
            textView4.setVisibility(8);
        }
        re2.b.f152215a.getClass();
        bf2.a aVar = re2.b.f152227m;
        if (aVar != null) {
            n0 viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            androidx.lifecycle.i0 i0VarW = f0.w(viewLifecycleOwner);
            x53.c cVar = s0.f129406a;
            ge1.b.T(i0VarW, x53.b.f189152a, null, new d(aVar, view2, null), 2);
        }
        ve2.s f50349r = u6().getF50349r();
        if (f50349r != null) {
            String str = f50349r.f177849a;
            if (w.J(str) || !f50349r.f177850b) {
                return;
            }
            View viewFindViewById6 = view2.findViewById(R.id.skip_text);
            viewFindViewById6.getClass();
            TextView textView5 = (TextView) viewFindViewById6;
            textView5.setText(w.i0(str).toString());
            final int i18 = 4;
            textView5.setOnClickListener(new View.OnClickListener(this) { // from class: xe2.y0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.library.mobileauth.ui.g f190603b;

                {
                    this.f190603b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i18) {
                        case 0:
                            this.f190603b.u6().b4();
                            break;
                        case 1:
                            this.f190603b.u6().t2();
                            break;
                        case 2:
                            com.garmin.android.library.mobileauth.ui.c.a aVar2 = com.garmin.android.library.mobileauth.ui.c.f50424a;
                            com.garmin.android.library.mobileauth.ui.g gVar = this.f190603b;
                            Context contextRequireContext = gVar.requireContext();
                            contextRequireContext.getClass();
                            com.garmin.android.library.mobileauth.ui.g.c cVar2 = gVar.new c();
                            aVar2.getClass();
                            AlertDialog alertDialogA = com.garmin.android.library.mobileauth.ui.c.a.a(contextRequireContext, cVar2);
                            alertDialogA.show();
                            gVar.f50459j = alertDialogA;
                            break;
                        case 3:
                            this.f190603b.u6().B0();
                            break;
                        default:
                            this.f190603b.u6().y0();
                            break;
                    }
                }
            });
            textView5.setVisibility(0);
        }
    }

    public final void w6(boolean z14) {
        Button button = this.f50456g;
        if (button == null) {
            s.m("createAccountBtn");
            throw null;
        }
        button.setEnabled(z14);
        Button button2 = this.f50455f;
        if (button2 == null) {
            s.m("signInBtn");
            throw null;
        }
        button2.setEnabled(z14);
        TextView textView = this.f50458i;
        if (textView != null) {
            textView.setEnabled(z14);
        } else {
            s.m("countrySelector");
            throw null;
        }
    }
}
