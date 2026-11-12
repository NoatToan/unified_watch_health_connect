package p004k6;

import android.annotation.SuppressLint;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import androidx.appcompat.widget.y0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.nimbusds.jose.jwk.JWKParameterNames;
import e23.p;
import f4.v;
import f5.c0;
import g6.k;
import g6.l;
import g6.o;
import gl1.y;
import java.util.UUID;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.q0;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;
import p3.c2;
import p3.d0;
import p3.j0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001fBY\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R \u0010,\u001a\u00020%8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)R\"\u00103\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R/\u0010D\u001a\u0004\u0018\u00010<2\b\u0010=\u001a\u0004\u0018\u00010<8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR/\u0010K\u001a\u0004\u0018\u00010E2\b\u0010=\u001a\u0004\u0018\u00010E8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bF\u0010?\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001b\u0010P\u001a\u00020\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR7\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bQ\u0010?\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR$\u0010[\u001a\u00020\u00122\u0006\u0010W\u001a\u00020\u00128\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010OR\u0014\u0010^\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]¨\u0006_"}, d2 = {"Lk6/x;", "Li5/a;", "", "Lkotlin/Function0;", "", "onDismissRequest", "Lk6/d0;", "properties", "", "testTag", "Landroid/view/View;", "composeView", "Lg6/c;", "density", "Lk6/c0;", "initialPositionProvider", "Ljava/util/UUID;", "popupId", "", "isNested", "Lk6/y;", "popupLayoutHelper", "<init>", "(Le23/a;Lk6/d0;Ljava/lang/String;Landroid/view/View;Lg6/c;Lk6/c0;Ljava/util/UUID;ZLk6/y;)V", "", "layoutDirection", "setLayoutDirection", "(I)V", "Lg6/l;", "getDisplayBounds", "()Lg6/l;", "c", "Ljava/lang/String;", "getTestTag", "()Ljava/lang/String;", "setTestTag", "(Ljava/lang/String;)V", "Landroid/view/WindowManager$LayoutParams;", "h", "Landroid/view/WindowManager$LayoutParams;", "getParams$ui", "()Landroid/view/WindowManager$LayoutParams;", "getParams$ui$annotations", "()V", "params", IntegerTokenConverter.CONVERTER_KEY, "Lk6/c0;", "getPositionProvider", "()Lk6/c0;", "setPositionProvider", "(Lk6/c0;)V", "positionProvider", "Lg6/o;", "j", "Lg6/o;", "getParentLayoutDirection", "()Lg6/o;", "setParentLayoutDirection", "(Lg6/o;)V", "parentLayoutDirection", "Lg6/m;", "<set-?>", JWKParameterNames.OCT_KEY_VALUE, "Lp3/p1;", "getPopupContentSize-bOM6tXw", "()Lg6/m;", "setPopupContentSize-fhxjrPA", "(Lg6/m;)V", "popupContentSize", "Lf5/c0;", "l", "getParentLayoutCoordinates", "()Lf5/c0;", "setParentLayoutCoordinates", "(Lf5/c0;)V", "parentLayoutCoordinates", JWKParameterNames.RSA_MODULUS, "Lp3/x3;", "getCanCalculatePosition", "()Z", "canCalculatePosition", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "getContent", "()Le23/p;", "setContent", "(Le23/p;)V", FirebaseAnalytics.Param.CONTENT, "value", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "Z", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "getSubCompositionView", "()Li5/a;", "subCompositionView", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class x extends kotlin.a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final b f103122w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e23.a<Unit> f103123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d0 f103124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public String testTag;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f103126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f103127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y f103128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final WindowManager f103129g;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final WindowManager.LayoutParams params;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public c0 positionProvider;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public o parentLayoutDirection;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c2 f103133k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c2 f103134l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public l f103135m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d0 f103136n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Rect f103137o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final v f103138p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public y0 f103139q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c2 f103140r;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public boolean shouldCreateCompositionOnAttachedToWindow;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int[] f103142v;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"k6/x$a", "Landroid/view/ViewOutlineProvider;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view2, Outline outline) {
            outline.setRect(0, 0, view2.getWidth(), view2.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk6/x;", "popupLayout", "", "invoke", "(Lk6/x;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class b extends w implements e23.l<x, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f103143a = new b();

        public b() {
            super(1);
        }

        @Override // e23.l
        public final Unit invoke(x xVar) {
            x xVar2 = xVar;
            if (xVar2.isAttachedToWindow()) {
                xVar2.g();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class d extends w implements p<m, Integer, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f103145b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i14) {
            super(2);
            this.f103145b = i14;
        }

        @Override // e23.p
        public final Unit invoke(m mVar, Integer num) {
            num.intValue();
            int iT = p0.t(this.f103145b | 1);
            x.this.Content(mVar, iT);
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f103146a;

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
            f103146a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class f extends w implements e23.a<Boolean> {
        public f() {
            super(0);
        }

        @Override // e23.a
        public final Boolean invoke() {
            x xVar = x.this;
            c0 parentLayoutCoordinates = xVar.getParentLayoutCoordinates();
            if (parentLayoutCoordinates == null || !parentLayoutCoordinates.isAttached()) {
                parentLayoutCoordinates = null;
            }
            return Boolean.valueOf((parentLayoutCoordinates == null || xVar.m331getPopupContentSizebOM6tXw() == null) ? false : true);
        }
    }

    /* JADX INFO: renamed from: k6.x$g, reason: from Kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "", "command", "invoke", "(Le23/a;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class Function0 extends w implements e23.l<e23.a<? extends Unit>, Unit> {
        public Function0() {
            super(1);
        }

        @Override // e23.l
        public final Unit invoke(e23.a<? extends Unit> aVar) {
            e23.a<? extends Unit> aVar2 = aVar;
            x xVar = x.this;
            Handler handler = xVar.getHandler();
            if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                aVar2.invoke();
            } else {
                Handler handler2 = xVar.getHandler();
                if (handler2 != null) {
                    handler2.post(new com.garmin.android.music.c(aVar2, 6));
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class h extends w implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q0 f103149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x f103150b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l f103151c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f103152d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f103153e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(q0 q0Var, x xVar, l lVar, long j8, long j14) {
            super(0);
            this.f103149a = q0Var;
            this.f103150b = xVar;
            this.f103151c = lVar;
            this.f103152d = j8;
            this.f103153e = j14;
        }

        @Override // e23.a
        public final Unit invoke() {
            x xVar = this.f103150b;
            this.f103149a.f105808a = xVar.getPositionProvider().a(this.f103151c, this.f103152d, xVar.getParentLayoutDirection(), this.f103153e);
            return Unit.INSTANCE;
        }
    }

    static {
        new c(null);
        f103122w = b.f103143a;
    }

    public x(e23.a<Unit> aVar, d0 d0Var, String str, View view2, g6.c cVar, c0 c0Var, UUID uuid, boolean z14, y yVar) {
        super(view2.getContext(), null, 0, 6, null);
        this.f103123a = aVar;
        this.f103124b = d0Var;
        this.testTag = str;
        this.f103126d = view2;
        this.f103127e = z14;
        this.f103128f = yVar;
        Object systemService = view2.getContext().getSystemService("window");
        systemService.getClass();
        this.f103129g = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        d0 d0Var2 = this.f103124b;
        boolean zC = g.c(view2);
        boolean z15 = d0Var2.f103021b;
        int i14 = d0Var2.f103020a;
        if (z15 && zC) {
            i14 |= 8192;
        } else if (z15 && !zC) {
            i14 &= -8193;
        }
        layoutParams.flags = i14;
        d0 d0Var3 = this.f103124b;
        layoutParams.type = d0Var3.f103026g;
        IBinder iBinder = d0Var3.f103027h;
        layoutParams.token = iBinder == null ? view2.getApplicationWindowToken() : iBinder;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view2.getContext().getResources().getString(R.string.default_popup_window_title));
        this.params = layoutParams;
        this.positionProvider = c0Var;
        this.parentLayoutDirection = o.Ltr;
        this.f103133k = p0.n(null);
        this.f103134l = p0.n(null);
        this.f103136n = p0.f(new f());
        g6.f.a aVar2 = g6.f.f75994b;
        this.f103137o = new Rect();
        this.f103138p = new v(new Function0());
        setId(android.R.id.content);
        setTag(R.id.view_tree_lifecycle_owner, xy2.b.r(view2));
        setTag(R.id.view_tree_view_model_store_owner, zf.b.s(view2));
        setTag(R.id.view_tree_saved_state_registry_owner, y.p(view2));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(cVar.s0((float) 8));
        setOutlineProvider(new a());
        s.f103095a.getClass();
        this.f103140r = p0.n(s.f103096b);
        this.f103142v = new int[2];
    }

    private final p<m, Integer, Unit> getContent() {
        return (p) this.f103140r.getF182175a();
    }

    private final l getDisplayBounds() {
        int i14 = this.f103124b.f103020a & 512;
        View view2 = this.f103126d;
        Rect rect = this.f103137o;
        y yVar = this.f103128f;
        if (i14 == 0) {
            yVar.b(rect, view2);
        } else {
            yVar.a(rect, view2);
        }
        j0 j0Var = g.f103039a;
        return new l(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c0 getParentLayoutCoordinates() {
        return (c0) this.f103134l.getF182175a();
    }

    private final void setContent(p<? super m, ? super Integer, Unit> pVar) {
        this.f103140r.setValue(pVar);
    }

    private final void setParentLayoutCoordinates(c0 c0Var) {
        this.f103134l.setValue(c0Var);
    }

    @Override // kotlin.a
    public final void Content(m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-857613600);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            getContent().invoke(o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(i14);
        }
    }

    public final void c(p3.p pVar, p<? super m, ? super Integer, Unit> pVar2) {
        setParentCompositionContext(pVar);
        setContent(pVar2);
        this.shouldCreateCompositionOnAttachedToWindow = true;
    }

    public final void d(e23.a<Unit> aVar, d0 d0Var, String str, o oVar) {
        this.f103123a = aVar;
        this.testTag = str;
        if (!s.g(this.f103124b, d0Var)) {
            boolean z14 = d0Var.f103025f;
            WindowManager.LayoutParams layoutParams = this.params;
            if (z14 && !this.f103124b.f103025f) {
                layoutParams.width = -2;
                layoutParams.height = -2;
            }
            this.f103124b = d0Var;
            boolean zC = g.c(this.f103126d);
            boolean z15 = d0Var.f103021b;
            int i14 = d0Var.f103020a;
            if (z15 && zC) {
                i14 |= 8192;
            } else if (z15 && !zC) {
                i14 &= -8193;
            }
            layoutParams.flags = i14;
            this.f103128f.c(this.f103129g, this, layoutParams);
        }
        int i15 = e.f103146a[oVar.ordinal()];
        int i16 = 1;
        if (i15 == 1) {
            i16 = 0;
        } else if (i15 != 2) {
            u0.r();
            return;
        }
        super.setLayoutDirection(i16);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f103124b.f103022c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                e23.a<Unit> aVar = this.f103123a;
                if (aVar != null) {
                    aVar.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e() {
        long jW;
        c0 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.isAttached()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jA = parentLayoutCoordinates.a();
            if (this.f103127e) {
                jW = f5.d0.f(parentLayoutCoordinates);
            } else {
                n4.c.f123541b.getClass();
                jW = parentLayoutCoordinates.W(0L);
            }
            long jRound = (((long) Math.round(Float.intBitsToFloat((int) (jW >> 32)))) << 32) | (4294967295L & ((long) Math.round(Float.intBitsToFloat((int) (jW & 4294967295L)))));
            k.a aVar = k.f76003b;
            l lVarE = lg.d.e(jRound, jA);
            if (lVarE.equals(this.f103135m)) {
                return;
            }
            this.f103135m = lVarE;
            g();
        }
    }

    public final void f(c0 c0Var) {
        setParentLayoutCoordinates(c0Var);
        e();
    }

    public final void g() {
        g6.m mVarM331getPopupContentSizebOM6tXw;
        l lVar = this.f103135m;
        if (lVar == null || (mVarM331getPopupContentSizebOM6tXw = m331getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j8 = mVarM331getPopupContentSizebOM6tXw.f76013a;
        l displayBounds = getDisplayBounds();
        long jB = (((long) displayBounds.b()) & 4294967295L) | (((long) displayBounds.d()) << 32);
        q0 q0Var = new q0();
        k.f76003b.getClass();
        q0Var.f105808a = 0L;
        this.f103138p.d(this, f103122w, new h(q0Var, this, lVar, jB, j8));
        long j14 = q0Var.f105808a;
        WindowManager.LayoutParams layoutParams = this.params;
        layoutParams.x = (int) (j14 >> 32);
        layoutParams.y = (int) (j14 & 4294967295L);
        boolean z14 = this.f103124b.f103024e;
        y yVar = this.f103128f;
        if (z14) {
            yVar.d(this, (int) (jB >> 32), (int) (jB & 4294967295L));
        }
        yVar.c(this.f103129g, this, layoutParams);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f103136n.getF182175a()).booleanValue();
    }

    /* JADX INFO: renamed from: getParams$ui, reason: from getter */
    public final WindowManager.LayoutParams getParams() {
        return this.params;
    }

    public final o getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final g6.m m331getPopupContentSizebOM6tXw() {
        return (g6.m) this.f103133k.getF182175a();
    }

    public final c0 getPositionProvider() {
        return this.positionProvider;
    }

    @Override // kotlin.a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public kotlin.a getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.testTag;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // kotlin.a
    public final void internalOnLayout$ui(boolean z14, int i14, int i15, int i16, int i17) {
        View childAt;
        super.internalOnLayout$ui(z14, i14, i15, i16, i17);
        if (this.f103124b.f103025f || (childAt = getChildAt(0)) == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.params;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.f103128f.c(this.f103129g, this, layoutParams);
    }

    @Override // kotlin.a
    public final void internalOnMeasure$ui(int i14, int i15) {
        if (this.f103124b.f103025f) {
            super.internalOnMeasure$ui(i14, i15);
        } else {
            l displayBounds = getDisplayBounds();
            super.internalOnMeasure$ui(View.MeasureSpec.makeMeasureSpec(displayBounds.d(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayBounds.b(), Integer.MIN_VALUE));
        }
    }

    @Override // kotlin.a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v vVar = this.f103138p;
        vVar.getClass();
        f4.f.a aVar = f4.f.f68735e;
        dh1.a aVar2 = vVar.f68816d;
        aVar.getClass();
        vVar.f68820h = f4.f.a.d(aVar2);
        if (!this.f103124b.f103022c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.f103139q == null) {
            e23.a<Unit> aVar3 = this.f103123a;
            int i14 = q.f103091a;
            this.f103139q = new y0(aVar3, 3);
        }
        q.a(this, this.f103139q);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v vVar = this.f103138p;
        en0.n nVar = vVar.f68820h;
        if (nVar != null) {
            nVar.c();
        }
        vVar.a();
        if (Build.VERSION.SDK_INT >= 33) {
            q.b(this, this.f103139q);
        }
        this.f103139q = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f103124b.f103023d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            e23.a<Unit> aVar = this.f103123a;
            if (aVar != null) {
                aVar.invoke();
            }
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        e23.a<Unit> aVar2 = this.f103123a;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        return true;
    }

    @Override // android.view.View
    public void setLayoutDirection(int layoutDirection) {
    }

    public final void setParentLayoutDirection(o oVar) {
        this.parentLayoutDirection = oVar;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m332setPopupContentSizefhxjrPA(g6.m mVar) {
        this.f103133k.setValue(mVar);
    }

    public final void setPositionProvider(c0 c0Var) {
        this.positionProvider = c0Var;
    }

    public final void setTestTag(String str) {
        this.testTag = str;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lk6/x$c;", "", "<init>", "()V", "Lkotlin/Function1;", "Lk6/x;", "", "onCommitAffectingPopupPosition", "Le23/l;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(j jVar) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ x(e23.a aVar, d0 d0Var, String str, View view2, g6.c cVar, c0 c0Var, UUID uuid, boolean z14, y yVar, int i14, j jVar) {
        y yVar2;
        y b0Var;
        if ((i14 & 256) != 0) {
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 30) {
                b0Var = new a0();
            } else if (i15 >= 29) {
                b0Var = new z();
            } else {
                b0Var = new b0();
            }
            yVar2 = b0Var;
        } else {
            yVar2 = yVar;
        }
        this(aVar, d0Var, str, view2, cVar, c0Var, uuid, z14, yVar2);
    }
}
