package p004k6;

import android.graphics.Outline;
import android.os.Build;
import android.os.IBinder;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.view.k1;
import b.i;
import b.s;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import g6.f;
import g6.o;
import gl1.y;
import java.util.UUID;
import lc.u0;
import o53.f0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lk6/w;", "Lb/i;", "", "Lkotlin/Function0;", "", "onDismissRequest", "Lk6/u;", "properties", "Landroid/view/View;", "composeView", "Lg6/o;", "layoutDirection", "Lg6/c;", "density", "Ljava/util/UUID;", "dialogId", "<init>", "(Le23/a;Lk6/u;Landroid/view/View;Lg6/o;Lg6/c;Ljava/util/UUID;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e23.a<Unit> f103115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u f103116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f103117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f103118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f103119e;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"k6/w$a", "Landroid/view/ViewOutlineProvider;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view2, Outline outline) {
            outline.setRect(0, 0, view2.getWidth(), view2.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb/s;", "", "invoke", "(Lb/s;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class b extends p005kotlin.jvm.internal.w implements l<s, Unit> {
        public b() {
            super(1);
        }

        @Override // e23.l
        public final Unit invoke(s sVar) {
            w wVar = w.this;
            if (wVar.f103116b.f103107a) {
                wVar.f103115a.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f103121a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f103121a = iArr;
        }
    }

    public w(e23.a<Unit> aVar, u uVar, View view2, o oVar, g6.c cVar, UUID uuid) {
        super(new ContextThemeWrapper(view2.getContext(), uVar.f103111e ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0, 2, null);
        this.f103115a = aVar;
        this.f103116b = uVar;
        this.f103117c = view2;
        float f14 = 8;
        f.a aVar2 = f.f75994b;
        Window window = getWindow();
        if (window == null) {
            h.z("Dialog has no window");
            throw null;
        }
        u uVar2 = this.f103116b;
        Window window2 = getWindow();
        if (window2 != null) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.type = uVar2.f103113g;
            IBinder iBinder = uVar2.f103114h;
            if (iBinder != null) {
                attributes.token = iBinder;
            }
            window2.setAttributes(attributes);
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        k1.a(window, this.f103116b.f103111e);
        window.setGravity(17);
        if (!this.f103116b.f103111e) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes2 = window.getAttributes();
            o.f103089a.a(attributes2);
            if (Build.VERSION.SDK_INT >= 30) {
                p pVar = p.f103090a;
                pVar.b(attributes2, 0);
                pVar.c(attributes2, 0);
            }
            window.setAttributes(attributes2);
        }
        t tVar = new t(getContext(), window);
        setTitle(this.f103116b.f103112f);
        tVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        tVar.setClipChildren(false);
        tVar.setElevation(cVar.s0(f14));
        tVar.setOutlineProvider(new a());
        this.f103118d = tVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            e(viewGroup);
        }
        setContentView(tVar);
        tVar.setTag(R.id.view_tree_lifecycle_owner, xy2.b.r(view2));
        tVar.setTag(R.id.view_tree_view_model_store_owner, zf.b.s(view2));
        tVar.setTag(R.id.view_tree_saved_state_registry_owner, y.p(view2));
        f(this.f103115a, this.f103116b, oVar);
        f0.k(getOnBackPressedDispatcher(), this, new b(), 2);
    }

    public static final void e(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof t) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = viewGroup.getChildAt(i14);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                e(viewGroup2);
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    public final void f(e23.a<Unit> aVar, u uVar, o oVar) {
        int i14;
        this.f103115a = aVar;
        this.f103116b = uVar;
        e0 e0Var = uVar.f103109c;
        boolean zC = g.c(this.f103117c);
        int i15 = f0.f103038a[e0Var.ordinal()];
        int i16 = 0;
        if (i15 == 1) {
            zC = false;
        } else if (i15 == 2) {
            zC = true;
        } else if (i15 != 3) {
            u0.r();
            return;
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(zC ? 8192 : -8193, 8192);
        int i17 = c.f103121a[oVar.ordinal()];
        if (i17 == 1) {
            i14 = 0;
        } else {
            if (i17 != 2) {
                u0.r();
                return;
            }
            i14 = 1;
        }
        t tVar = this.f103118d;
        tVar.setLayoutDirection(i14);
        boolean z14 = uVar.f103111e;
        boolean z15 = uVar.f103110d;
        Window window2 = tVar.f103098a;
        boolean z16 = (tVar.f103102e && z15 == tVar.f103100c && z14 == tVar.f103101d) ? false : true;
        tVar.f103100c = z15;
        tVar.f103101d = z14;
        if (z16) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i18 = z15 ? -2 : -1;
            if (i18 != attributes.width || !tVar.f103102e) {
                window2.setLayout(i18, -2);
                tVar.f103102e = true;
            }
        }
        setCanceledOnTouchOutside(uVar.f103108b);
        Window window3 = getWindow();
        if (window3 != null) {
            if (!z14) {
                i16 = Build.VERSION.SDK_INT < 31 ? 16 : 48;
            }
            window3.setSoftInputMode(i16);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i14, KeyEvent keyEvent) {
        if (!this.f103116b.f103107a || !keyEvent.isTracking() || keyEvent.isCanceled() || i14 != 111) {
            return super.onKeyUp(i14, keyEvent);
        }
        this.f103115a.invoke();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked;
        View childAt;
        int iC;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (!this.f103116b.f103108b) {
            actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
            }
            this.f103119e = false;
            return zOnTouchEvent;
        }
        t tVar = this.f103118d;
        tVar.getClass();
        if (Math.abs(motionEvent.getX()) <= Float.MAX_VALUE && Math.abs(motionEvent.getY()) <= Float.MAX_VALUE && (childAt = tVar.getChildAt(0)) != null) {
            int left = childAt.getLeft() + tVar.getLeft();
            int width = childAt.getWidth() + left;
            int top = childAt.getTop() + tVar.getTop();
            int height = childAt.getHeight() + top;
            int iC2 = MathKt.c(motionEvent.getX());
            if (left <= iC2 && iC2 <= width && top <= (iC = MathKt.c(motionEvent.getY())) && iC <= height) {
                actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0 || actionMasked == 1 || actionMasked == 3) {
                    this.f103119e = false;
                    return zOnTouchEvent;
                }
            }
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0) {
            this.f103119e = true;
            return true;
        }
        if (actionMasked2 != 1) {
            if (actionMasked2 == 3) {
                this.f103119e = false;
                return zOnTouchEvent;
            }
        } else if (this.f103119e) {
            this.f103115a.invoke();
            this.f103119e = false;
            return true;
        }
        return zOnTouchEvent;
    }
}
