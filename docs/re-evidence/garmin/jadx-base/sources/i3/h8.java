package i3;

import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.perf.util.Constants;
import java.util.UUID;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001aBa\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Li3/h8;", "Lb/i;", "", "Lkotlin/Function0;", "", "onDismissRequest", "Li3/f9;", "properties", "Lo4/d0;", "contentColor", "Landroid/view/View;", "composeView", "Lg6/o;", "layoutDirection", "Lg6/c;", "density", "Ljava/util/UUID;", "dialogId", "Ls1/b;", "", "Ls1/n;", "predictiveBackProgress", "Lo53/b0;", Action.SCOPE_ATTRIBUTE, "<init>", "(Le23/a;Li3/f9;JLandroid/view/View;Lg6/o;Lg6/c;Ljava/util/UUID;Ls1/b;Lo53/b0;Lkotlin/jvm/internal/j;)V", "b", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h8 extends b.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e23.a<Unit> f88296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f9 f88297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f88298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f88299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g8 f88300e;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"i3/h8$a", "Landroid/view/ViewOutlineProvider;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view2, Outline outline) {
            outline.setRect(0, 0, view2.getWidth(), view2.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Li3/h8$b;", "Lb/s;", "", Constants.ENABLE_DISABLE, "Lo53/b0;", Action.SCOPE_ATTRIBUTE, "Ls1/b;", "", "Ls1/n;", "predictiveBackProgress", "Lkotlin/Function0;", "", "onDismissRequest", "<init>", "(ZLo53/b0;Ls1/b;Le23/a;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends b.s {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final o53.b0 f88301d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final s1.b<Float, s1.n> f88302e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final e23.a<Unit> f88303f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
        @v13.e(c = "androidx.compose.material3.ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback$handleOnBackCancelled$1", f = "ModalBottomSheet.android.kt", l = {638}, m = "invokeSuspend")
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f88304a;

            public a(t13.d<? super a> dVar) {
                super(2, dVar);
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return b.this.new a(dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f88304a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    s1.b<Float, s1.n> bVar = b.this.f88302e;
                    Float f14 = new Float(0.0f);
                    this.f88304a = 1;
                    if (s1.b.c(bVar, f14, null, null, this, 14) == aVar) {
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

        /* JADX INFO: renamed from: i3.h8$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
        @v13.e(c = "androidx.compose.material3.ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback$handleOnBackProgressed$1", f = "ModalBottomSheet.android.kt", l = {627}, m = "invokeSuspend")
        public static final class C1737b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f88306a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b.c f88308c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1737b(b.c cVar, t13.d<? super C1737b> dVar) {
                super(2, dVar);
                this.f88308c = cVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return b.this.new C1737b(this.f88308c, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C1737b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f88306a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    s1.b<Float, s1.n> bVar = b.this.f88302e;
                    l3.l1 l1Var = l3.l1.f109314a;
                    float f14 = this.f88308c.f13789c;
                    l1Var.getClass();
                    Float f15 = new Float(l3.q.f109385a.a(f14));
                    this.f88306a = 1;
                    if (bVar.g(f15, this) == aVar) {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
        @v13.e(c = "androidx.compose.material3.ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback$handleOnBackStarted$1", f = "ModalBottomSheet.android.kt", l = {620}, m = "invokeSuspend")
        public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f88309a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b.c f88311c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b.c cVar, t13.d<? super c> dVar) {
                super(2, dVar);
                this.f88311c = cVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return b.this.new c(this.f88311c, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f88309a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    s1.b<Float, s1.n> bVar = b.this.f88302e;
                    l3.l1 l1Var = l3.l1.f109314a;
                    float f14 = this.f88311c.f13789c;
                    l1Var.getClass();
                    Float f15 = new Float(l3.q.f109385a.a(f14));
                    this.f88309a = 1;
                    if (bVar.g(f15, this) == aVar) {
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

        public b(boolean z14, o53.b0 b0Var, s1.b<Float, s1.n> bVar, e23.a<Unit> aVar) {
            super(z14);
            this.f88301d = b0Var;
            this.f88302e = bVar;
            this.f88303f = aVar;
        }

        @Override // b.s
        public final void a() {
            ge1.b.T(this.f88301d, null, null, new a(null), 3);
        }

        @Override // b.s
        public final void b() {
            this.f88303f.invoke();
        }

        @Override // b.s
        public final void c(b.c cVar) {
            ge1.b.T(this.f88301d, null, null, new C1737b(cVar, null), 3);
        }

        @Override // b.s
        public final void d(b.c cVar) {
            ge1.b.T(this.f88301d, null, null, new c(cVar, null), 3);
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f88312a;

        static {
            int[] iArr = new int[g6.o.values().length];
            try {
                iArr[g6.o.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g6.o.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f88312a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private h8(e23.a<Unit> aVar, f9 f9Var, long j8, View view2, g6.o oVar, g6.c cVar, UUID uuid, s1.b<Float, s1.n> bVar, o53.b0 b0Var) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        super(new ContextThemeWrapper(view2.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme), 0, 2, null);
        boolean z14 = false;
        this.f88296a = aVar;
        this.f88297b = f9Var;
        this.f88298c = j8;
        this.f88299d = view2;
        float f14 = 8;
        g6.f.a aVar2 = g6.f.f75994b;
        Window window = getWindow();
        if (window == null) {
            vb.h.z("Dialog has no window");
            throw null;
        }
        int i14 = 1;
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        androidx.core.view.k1.a(window, false);
        g8 g8Var = new g8(getContext(), window);
        g8Var.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        g8Var.setClipChildren(false);
        g8Var.setElevation(cVar.s0(f14));
        g8Var.setOutlineProvider(new a());
        this.f88300e = g8Var;
        setContentView(g8Var);
        g8Var.setTag(R.id.view_tree_lifecycle_owner, xy2.b.r(view2));
        g8Var.setTag(R.id.view_tree_view_model_store_owner, zf.b.s(view2));
        g8Var.setTag(R.id.view_tree_saved_state_registry_owner, gl1.y.p(view2));
        e(this.f88296a, this.f88297b, this.f88298c, oVar);
        androidx.core.view.o1 o1Var = new androidx.core.view.o1(window, window.getDecorView());
        Boolean bool = this.f88297b.f88095d;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            long j14 = this.f88298c;
            o4.d0.f128823b.getClass();
            zBooleanValue = !o4.d0.d(j14, o4.d0.f128831j) && ((double) o4.f0.i(j14)) <= 0.5d;
        }
        o1Var.b(zBooleanValue);
        Boolean bool2 = this.f88297b.f88096e;
        if (bool2 != null) {
            zBooleanValue2 = bool2.booleanValue();
        } else {
            long j15 = this.f88298c;
            o4.d0.f128823b.getClass();
            if (!o4.d0.d(j15, o4.d0.f128831j) && o4.f0.i(j15) <= 0.5d) {
                z14 = true;
            }
            zBooleanValue2 = z14;
        }
        o1Var.a(zBooleanValue2);
        getOnBackPressedDispatcher().b(new b(this.f88297b.f88093b, b0Var, bVar, new f2(this, i14)), this);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    public final void e(e23.a<Unit> aVar, f9 f9Var, long j8, g6.o oVar) {
        this.f88296a = aVar;
        this.f88297b = f9Var;
        this.f88298c = j8;
        p004k6.e0 e0Var = f9Var.f88092a;
        ViewGroup.LayoutParams layoutParams = this.f88299d.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i14 = 1;
        boolean z14 = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int i15 = l3.r.f109409a[e0Var.ordinal()];
        if (i15 == 1) {
            z14 = false;
        } else if (i15 == 2) {
            z14 = true;
        } else if (i15 != 3) {
            lc.u0.r();
            return;
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(z14 ? 8192 : -8193, 8192);
        int i16 = c.f88312a[oVar.ordinal()];
        if (i16 == 1) {
            i14 = 0;
        } else if (i16 != 2) {
            lc.u0.r();
            return;
        }
        this.f88300e.setLayoutDirection(i14);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            this.f88296a.invoke();
        }
        return zOnTouchEvent;
    }

    public /* synthetic */ h8(e23.a aVar, f9 f9Var, long j8, View view2, g6.o oVar, g6.c cVar, UUID uuid, s1.b bVar, o53.b0 b0Var, p005kotlin.jvm.internal.j jVar) {
        this(aVar, f9Var, j8, view2, oVar, cVar, uuid, bVar, b0Var);
    }
}
