package dv0;

import android.app.Dialog;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.h1;
import androidx.lifecycle.n0;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import o53.b0;
import o53.f0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import r22.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ldv0/j;", "Lcom/garmin/android/apps/connectmobile/f;", "<init>", "()V", "a", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends com.garmin.android.apps.connectmobile.f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f61394i = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f61395h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.profile.LiveTrackProfileBottomSheetFragment$bindContent$3", f = "LiveTrackProfileBottomSheetFragment.kt", l = {63}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f61396a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.profile.LiveTrackProfileBottomSheetFragment$bindContent$3$1", f = "LiveTrackProfileBottomSheetFragment.kt", l = {64}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f61398a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f61399b;

            /* JADX INFO: renamed from: dv0.j$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C1303a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ j f61400a;

                public C1303a(j jVar) {
                    this.f61400a = jVar;
                }

                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    ((Boolean) obj).booleanValue();
                    this.f61400a.w6();
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(j jVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f61399b = jVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f61399b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to dv0.j$b$a for r5v1 'this'  t13.d
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // v13.a
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    u13.a r0 = u13.a.COROUTINE_SUSPENDED
                    int r1 = r5.f61398a
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L14
                    if (r1 == r3) goto L10
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    vb.h.z(r6)
                    return r2
                L10:
                    o13.r.b(r6)
                    goto L31
                L14:
                    o13.r.b(r6)
                    dv0.j$a r6 = dv0.j.f61394i
                    dv0.j r6 = r5.f61399b
                    yu0.f r1 = r6.F6()
                    r53.b2 r1 = r1.f199724x
                    dv0.j$b$a$a r4 = new dv0.j$b$a$a
                    r4.<init>(r6)
                    r5.f61398a = r3
                    r53.o2<T> r6 = r1.f150540a
                    java.lang.Object r6 = r6.collect(r4, r5)
                    if (r6 != r0) goto L31
                    return r0
                L31:
                    o2.c.f()
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: dv0.j.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return j.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f61396a;
            if (i14 == 0) {
                o13.r.b(obj);
                j jVar = j.this;
                n0 viewLifecycleOwner = jVar.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
                a aVar2 = new a(jVar, null);
                this.f61396a = 1;
                if (h1.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
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

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f61401a;

        public c(Fragment fragment) {
            this.f61401a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f61401a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<yu0.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f61402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f61403b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f61404c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f61405d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f61406e;

        public d(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f61402a = fragment;
            this.f61403b = qualifier;
            this.f61404c = aVar;
            this.f61405d = aVar2;
            this.f61406e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, yu0.f] */
        @Override // e23.a
        public final yu0.f invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f61404c.invoke();
            y1 viewModelStore = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f61402a;
            e23.a aVar = this.f61405d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(yu0.f.class), viewModelStore, null, defaultViewModelCreationExtras, this.f61403b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f61406e, 4, null);
        }
    }

    public j() {
        super(R.layout.composable_container, true, true, false, 8, null);
        this.f61395h = o13.m.a(o13.n.NONE, new d(this, null, new c(this), null, null));
    }

    @Override // com.garmin.android.apps.connectmobile.f
    public final boolean A6() {
        return ((Boolean) F6().f199724x.f150540a.getValue()).booleanValue();
    }

    @Override // com.garmin.android.apps.connectmobile.f
    public final void C6() {
        yu0.f fVarF6 = F6();
        if (((Boolean) fVarF6.f199722v.getValue()).booleanValue()) {
            String str = (String) fVarF6.f199720r.getValue();
            str.getClass();
            if (!fVarF6.f199704b.i(str)) {
                return;
            }
        }
        ge1.b.T(v1.a(fVarF6), null, null, new yu0.i(fVarF6, null), 3);
        View viewRequireView = requireView();
        viewRequireView.getClass();
        v22.e.b(viewRequireView);
        dismiss();
    }

    @Override // com.garmin.android.apps.connectmobile.f
    public final void E6() {
        yu0.f fVarF6 = F6();
        if (!fVarF6.B4() && !fVarF6.y4() && !fVarF6.z4()) {
            View viewRequireView = requireView();
            viewRequireView.getClass();
            v22.e.b(viewRequireView);
            dismiss();
            return;
        }
        y.a aVar = y.f149923b;
        h hVar = new h(this, 0);
        aVar.getClass();
        y yVar = new y();
        yVar.f149924a = hVar;
        yVar.show(getParentFragmentManager(), (String) null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final yu0.f F6() {
        return (yu0.f) this.f61395h.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.b0
    public final void u6(View view2) {
        Dialog dialogRequireDialog = requireDialog();
        dialogRequireDialog.getClass();
        f0.k(((BottomSheetDialog) dialogRequireDialog).getOnBackPressedDispatcher(), null, new h(this, 1), 3);
        ((ComposeView) view2).setContent(new z3.e(-190357873, true, new i(this, 0)));
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        ge1.b.T(f0.w(viewLifecycleOwner), null, null, new b(null), 3);
    }

    @Override // com.garmin.android.apps.connectmobile.f
    public final String z6() {
        String string = getString(R.string.lbl_livetrack_profile);
        string.getClass();
        return string;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldv0/j$a;", "", "<init>", "()V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
