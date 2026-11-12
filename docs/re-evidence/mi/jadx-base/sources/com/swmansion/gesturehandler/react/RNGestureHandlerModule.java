package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.miui.tsmclient.entity.ConfirmBizStatusInfo;
import com.xiaomi.fitness.share.report.holder.EditCustomTabLayoutHolder;
import defpackage.ase;
import defpackage.e4f;
import defpackage.e8j;
import defpackage.exh;
import defpackage.f8j;
import defpackage.gah;
import defpackage.h8j;
import defpackage.ixk;
import defpackage.mx9;
import defpackage.ndj;
import defpackage.oya;
import defpackage.p7q;
import defpackage.rwh;
import defpackage.s7j;
import defpackage.t7j;
import defpackage.u7j;
import defpackage.ujh;
import defpackage.yhg;
import defpackage.zhg;
import defpackage.zzo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@ndj(name = RNGestureHandlerModule.MODULE_NAME)
public class RNGestureHandlerModule extends ReactContextBaseJavaModule {
    private static final String KEY_DIRECTION = "direction";
    private static final String KEY_ENABLED = "enabled";
    private static final String KEY_HIT_SLOP = "hitSlop";
    private static final String KEY_HIT_SLOP_BOTTOM = "bottom";
    private static final String KEY_HIT_SLOP_HEIGHT = "height";
    private static final String KEY_HIT_SLOP_HORIZONTAL = "horizontal";
    private static final String KEY_HIT_SLOP_LEFT = "left";
    private static final String KEY_HIT_SLOP_RIGHT = "right";
    private static final String KEY_HIT_SLOP_TOP = "top";
    private static final String KEY_HIT_SLOP_VERTICAL = "vertical";
    private static final String KEY_HIT_SLOP_WIDTH = "width";
    private static final String KEY_LONG_PRESS_MAX_DIST = "maxDist";
    private static final String KEY_LONG_PRESS_MIN_DURATION_MS = "minDurationMs";
    private static final String KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION = "disallowInterruption";
    private static final String KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START = "shouldActivateOnStart";
    private static final String KEY_NUMBER_OF_POINTERS = "numberOfPointers";
    private static final String KEY_PAN_ACTIVE_OFFSET_X_END = "activeOffsetXEnd";
    private static final String KEY_PAN_ACTIVE_OFFSET_X_START = "activeOffsetXStart";
    private static final String KEY_PAN_ACTIVE_OFFSET_Y_END = "activeOffsetYEnd";
    private static final String KEY_PAN_ACTIVE_OFFSET_Y_START = "activeOffsetYStart";
    private static final String KEY_PAN_AVG_TOUCHES = "avgTouches";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_X_END = "failOffsetXEnd";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_X_START = "failOffsetXStart";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_Y_END = "failOffsetYEnd";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_Y_START = "failOffsetYStart";
    private static final String KEY_PAN_MAX_POINTERS = "maxPointers";
    private static final String KEY_PAN_MIN_DIST = "minDist";
    private static final String KEY_PAN_MIN_POINTERS = "minPointers";
    private static final String KEY_PAN_MIN_VELOCITY = "minVelocity";
    private static final String KEY_PAN_MIN_VELOCITY_X = "minVelocityX";
    private static final String KEY_PAN_MIN_VELOCITY_Y = "minVelocityY";
    private static final String KEY_SHOULD_CANCEL_WHEN_OUTSIDE = "shouldCancelWhenOutside";
    private static final String KEY_TAP_MAX_DELAY_MS = "maxDelayMs";
    private static final String KEY_TAP_MAX_DELTA_X = "maxDeltaX";
    private static final String KEY_TAP_MAX_DELTA_Y = "maxDeltaY";
    private static final String KEY_TAP_MAX_DIST = "maxDist";
    private static final String KEY_TAP_MAX_DURATION_MS = "maxDurationMs";
    private static final String KEY_TAP_MIN_POINTERS = "minPointers";
    private static final String KEY_TAP_NUMBER_OF_TAPS = "numberOfTaps";
    public static final String MODULE_NAME = "RNGestureHandlerModule";
    private List<Integer> mEnqueuedRootViewInit;
    private gah mEventListener;
    private d[] mHandlerFactories;
    private u7j mInteractionManager;
    private final e8j mRegistry;
    private List<f8j> mRoots;

    public class a implements gah {
        public a() {
        }

        @Override // defpackage.gah
        public void a(oya oyaVar, MotionEvent motionEvent) {
            RNGestureHandlerModule.this.onTouchEvent(oyaVar, motionEvent);
        }

        @Override // defpackage.gah
        public void b(oya oyaVar, int i, int i2) {
            RNGestureHandlerModule.this.onStateChange(oyaVar, i, i2);
        }
    }

    public class b implements p7q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f10626a;

        public b(int i) {
            this.f10626a = i;
        }

        @Override // defpackage.p7q
        public void execute(zhg zhgVar) {
            View viewX = zhgVar.x(this.f10626a);
            if (viewX instanceof RNGestureHandlerEnabledRootView) {
                ((RNGestureHandlerEnabledRootView) viewX).s();
            }
            synchronized (RNGestureHandlerModule.this.mEnqueuedRootViewInit) {
                RNGestureHandlerModule.this.mEnqueuedRootViewInit.remove(new Integer(this.f10626a));
            }
        }
    }

    public static class c extends d<mx9> {
        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public String d() {
            return "FlingGestureHandler";
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public Class<mx9> e() {
            return mx9.class;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void b(mx9 mx9Var, ReadableMap readableMap) {
            super.b(mx9Var, readableMap);
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS)) {
                mx9Var.W(readableMap.getInt(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_DIRECTION)) {
                mx9Var.V(readableMap.getInt(RNGestureHandlerModule.KEY_DIRECTION));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public mx9 c(Context context) {
            return new mx9();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d, defpackage.t7j
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void a(mx9 mx9Var, WritableMap writableMap) {
            super.a(mx9Var, writableMap);
            writableMap.putDouble("x", exh.a(mx9Var.m()));
            writableMap.putDouble("y", exh.a(mx9Var.n()));
            writableMap.putDouble("absoluteX", exh.a(mx9Var.k()));
            writableMap.putDouble("absoluteY", exh.a(mx9Var.l()));
        }

        public c() {
            super();
        }
    }

    public static abstract class d<T extends oya> implements t7j<T> {
        public d() {
        }

        @Override // defpackage.t7j
        public void a(T t, WritableMap writableMap) {
            writableMap.putDouble(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS, t.o());
        }

        public void b(T t, ReadableMap readableMap) {
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_SHOULD_CANCEL_WHEN_OUTSIDE)) {
                t.L(readableMap.getBoolean(RNGestureHandlerModule.KEY_SHOULD_CANCEL_WHEN_OUTSIDE));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_ENABLED)) {
                t.H(readableMap.getBoolean(RNGestureHandlerModule.KEY_ENABLED));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP)) {
                RNGestureHandlerModule.handleHitSlopProperty(t, readableMap);
            }
        }

        public abstract T c(Context context);

        public abstract String d();

        public abstract Class<T> e();
    }

    public static class e extends d<ase> {
        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public String d() {
            return "LongPressGestureHandler";
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public Class<ase> e() {
            return ase.class;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void b(ase aseVar, ReadableMap readableMap) {
            super.b(aseVar, readableMap);
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_LONG_PRESS_MIN_DURATION_MS)) {
                aseVar.V(readableMap.getInt(RNGestureHandlerModule.KEY_LONG_PRESS_MIN_DURATION_MS));
            }
            if (readableMap.hasKey("maxDist")) {
                aseVar.U(exh.b(readableMap.getDouble("maxDist")));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public ase c(Context context) {
            return new ase(context);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d, defpackage.t7j
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void a(ase aseVar, WritableMap writableMap) {
            super.a(aseVar, writableMap);
            writableMap.putDouble("x", exh.a(aseVar.m()));
            writableMap.putDouble("y", exh.a(aseVar.n()));
            writableMap.putDouble("absoluteX", exh.a(aseVar.k()));
            writableMap.putDouble("absoluteY", exh.a(aseVar.l()));
        }

        public e() {
            super();
        }
    }

    public static class f extends d<yhg> {
        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public String d() {
            return "NativeViewGestureHandler";
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public Class<yhg> e() {
            return yhg.class;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void b(yhg yhgVar, ReadableMap readableMap) {
            super.b(yhgVar, readableMap);
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START)) {
                yhgVar.V(readableMap.getBoolean(RNGestureHandlerModule.KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION)) {
                yhgVar.U(readableMap.getBoolean(RNGestureHandlerModule.KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public yhg c(Context context) {
            return new yhg();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d, defpackage.t7j
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void a(yhg yhgVar, WritableMap writableMap) {
            super.a(yhgVar, writableMap);
            writableMap.putBoolean("pointerInside", yhgVar.x());
        }

        public f() {
            super();
        }
    }

    public static class g extends d<ujh> {
        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public String d() {
            return "PanGestureHandler";
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public Class<ujh> e() {
            return ujh.class;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void b(ujh ujhVar, ReadableMap readableMap) {
            boolean z;
            super.b(ujhVar, readableMap);
            boolean z2 = true;
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_START)) {
                ujhVar.a0(exh.b(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_START)));
                z = true;
            } else {
                z = false;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_END)) {
                ujhVar.Z(exh.b(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_END)));
                z = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_START)) {
                ujhVar.f0(exh.b(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_START)));
                z = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_END)) {
                ujhVar.e0(exh.b(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_END)));
                z = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_START)) {
                ujhVar.c0(exh.b(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_START)));
                z = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_END)) {
                ujhVar.b0(exh.b(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_END)));
                z = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_START)) {
                ujhVar.h0(exh.b(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_START)));
                z = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_END)) {
                ujhVar.g0(exh.b(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_END)));
                z = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY)) {
                ujhVar.l0(exh.b(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY)));
                z = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_X)) {
                ujhVar.m0(exh.b(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_X)));
                z = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_Y)) {
                ujhVar.n0(exh.b(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_Y)));
            } else {
                z2 = z;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_DIST)) {
                ujhVar.j0(exh.b(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_DIST)));
            } else if (z2) {
                ujhVar.j0(Float.MAX_VALUE);
            }
            if (readableMap.hasKey("minPointers")) {
                ujhVar.k0(readableMap.getInt("minPointers"));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_MAX_POINTERS)) {
                ujhVar.i0(readableMap.getInt(RNGestureHandlerModule.KEY_PAN_MAX_POINTERS));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_AVG_TOUCHES)) {
                ujhVar.d0(readableMap.getBoolean(RNGestureHandlerModule.KEY_PAN_AVG_TOUCHES));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public ujh c(Context context) {
            return new ujh(context);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d, defpackage.t7j
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void a(ujh ujhVar, WritableMap writableMap) {
            super.a(ujhVar, writableMap);
            writableMap.putDouble("x", exh.a(ujhVar.m()));
            writableMap.putDouble("y", exh.a(ujhVar.n()));
            writableMap.putDouble("absoluteX", exh.a(ujhVar.k()));
            writableMap.putDouble("absoluteY", exh.a(ujhVar.l()));
            writableMap.putDouble(EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_X, exh.a(ujhVar.V()));
            writableMap.putDouble(EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_Y, exh.a(ujhVar.W()));
            writableMap.putDouble("velocityX", exh.a(ujhVar.X()));
            writableMap.putDouble("velocityY", exh.a(ujhVar.Y()));
        }

        public g() {
            super();
        }
    }

    public static class h extends d<rwh> {
        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public String d() {
            return "PinchGestureHandler";
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public Class<rwh> e() {
            return rwh.class;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public rwh c(Context context) {
            return new rwh();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d, defpackage.t7j
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void a(rwh rwhVar, WritableMap writableMap) {
            super.a(rwhVar, writableMap);
            writableMap.putDouble("scale", rwhVar.c0());
            writableMap.putDouble("focalX", exh.a(rwhVar.a0()));
            writableMap.putDouble("focalY", exh.a(rwhVar.b0()));
            writableMap.putDouble("velocity", rwhVar.d0());
        }

        public h() {
            super();
        }
    }

    public static class i extends d<ixk> {
        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public String d() {
            return "RotationGestureHandler";
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public Class<ixk> e() {
            return ixk.class;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public ixk c(Context context) {
            return new ixk();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d, defpackage.t7j
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void a(ixk ixkVar, WritableMap writableMap) {
            super.a(ixkVar, writableMap);
            writableMap.putDouble("rotation", ixkVar.Z());
            writableMap.putDouble("anchorX", exh.a(ixkVar.X()));
            writableMap.putDouble("anchorY", exh.a(ixkVar.Y()));
            writableMap.putDouble("velocity", ixkVar.a0());
        }

        public i() {
            super();
        }
    }

    public static class j extends d<zzo> {
        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public String d() {
            return "TapGestureHandler";
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public Class<zzo> e() {
            return zzo.class;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void b(zzo zzoVar, ReadableMap readableMap) {
            super.b(zzoVar, readableMap);
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_TAP_NUMBER_OF_TAPS)) {
                zzoVar.b0(readableMap.getInt(RNGestureHandlerModule.KEY_TAP_NUMBER_OF_TAPS));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DURATION_MS)) {
                zzoVar.X(readableMap.getInt(RNGestureHandlerModule.KEY_TAP_MAX_DURATION_MS));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DELAY_MS)) {
                zzoVar.V(readableMap.getInt(RNGestureHandlerModule.KEY_TAP_MAX_DELAY_MS));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_X)) {
                zzoVar.Y(exh.b(readableMap.getDouble(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_X)));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_Y)) {
                zzoVar.Z(exh.b(readableMap.getDouble(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_Y)));
            }
            if (readableMap.hasKey("maxDist")) {
                zzoVar.W(exh.b(readableMap.getDouble("maxDist")));
            }
            if (readableMap.hasKey("minPointers")) {
                zzoVar.a0(readableMap.getInt("minPointers"));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public zzo c(Context context) {
            return new zzo();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d, defpackage.t7j
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void a(zzo zzoVar, WritableMap writableMap) {
            super.a(zzoVar, writableMap);
            writableMap.putDouble("x", exh.a(zzoVar.m()));
            writableMap.putDouble("y", exh.a(zzoVar.n()));
            writableMap.putDouble("absoluteX", exh.a(zzoVar.k()));
            writableMap.putDouble("absoluteY", exh.a(zzoVar.l()));
        }

        public j() {
            super();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RNGestureHandlerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mEventListener = new a();
        this.mHandlerFactories = new d[]{new f(), new j(), new e(), new g(), new h(), new i(), new c()};
        this.mRegistry = new e8j();
        this.mInteractionManager = new u7j();
        this.mRoots = new ArrayList();
        this.mEnqueuedRootViewInit = new ArrayList();
    }

    private d findFactoryForHandler(oya oyaVar) {
        int i2 = 0;
        while (true) {
            d[] dVarArr = this.mHandlerFactories;
            if (i2 >= dVarArr.length) {
                return null;
            }
            d dVar = dVarArr[i2];
            if (dVar.e().equals(oyaVar.getClass())) {
                return dVar;
            }
            i2++;
        }
    }

    private f8j findRootHelperForViewAncestor(int i2) {
        int iResolveRootTagFromReactTag = ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).resolveRootTagFromReactTag(i2);
        if (iResolveRootTagFromReactTag < 1) {
            return null;
        }
        synchronized (this.mRoots) {
            for (int i3 = 0; i3 < this.mRoots.size(); i3++) {
                try {
                    f8j f8jVar = this.mRoots.get(i3);
                    ViewGroup viewGroupF = f8jVar.f();
                    if ((viewGroupF instanceof ReactRootView) && ((ReactRootView) viewGroupF).getRootViewTag() == iResolveRootTagFromReactTag) {
                        return f8jVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleHitSlopProperty(oya oyaVar, ReadableMap readableMap) {
        if (readableMap.getType(KEY_HIT_SLOP) == ReadableType.Number) {
            float fB = exh.b(readableMap.getDouble(KEY_HIT_SLOP));
            oyaVar.I(fB, fB, fB, fB, Float.NaN, Float.NaN);
            return;
        }
        ReadableMap map = readableMap.getMap(KEY_HIT_SLOP);
        float fB2 = map.hasKey(KEY_HIT_SLOP_HORIZONTAL) ? exh.b(map.getDouble(KEY_HIT_SLOP_HORIZONTAL)) : Float.NaN;
        float fB3 = fB2;
        float fB4 = map.hasKey(KEY_HIT_SLOP_VERTICAL) ? exh.b(map.getDouble(KEY_HIT_SLOP_VERTICAL)) : Float.NaN;
        float fB5 = fB4;
        if (map.hasKey(KEY_HIT_SLOP_LEFT)) {
            fB2 = exh.b(map.getDouble(KEY_HIT_SLOP_LEFT));
        }
        float f2 = fB2;
        if (map.hasKey(KEY_HIT_SLOP_TOP)) {
            fB4 = exh.b(map.getDouble(KEY_HIT_SLOP_TOP));
        }
        float f3 = fB4;
        if (map.hasKey("right")) {
            fB3 = exh.b(map.getDouble("right"));
        }
        float f4 = fB3;
        if (map.hasKey(KEY_HIT_SLOP_BOTTOM)) {
            fB5 = exh.b(map.getDouble(KEY_HIT_SLOP_BOTTOM));
        }
        oyaVar.I(f2, f3, f4, fB5, map.hasKey(KEY_HIT_SLOP_WIDTH) ? exh.b(map.getDouble(KEY_HIT_SLOP_WIDTH)) : Float.NaN, map.hasKey(KEY_HIT_SLOP_HEIGHT) ? exh.b(map.getDouble(KEY_HIT_SLOP_HEIGHT)) : Float.NaN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onStateChange(oya oyaVar, int i2, int i3) {
        if (oyaVar.q() < 0) {
            return;
        }
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(h8j.b(oyaVar, i2, i3, findFactoryForHandler(oyaVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onTouchEvent(oya oyaVar, MotionEvent motionEvent) {
        if (oyaVar.q() >= 0 && oyaVar.p() == 4) {
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(s7j.b(oyaVar, findFactoryForHandler(oyaVar)));
        }
    }

    private void tryInitializeHandlerForReactRootView(int i2) {
        UIManagerModule uIManagerModule = (UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class);
        int iResolveRootTagFromReactTag = uIManagerModule.resolveRootTagFromReactTag(i2);
        if (iResolveRootTagFromReactTag < 1) {
            throw new JSApplicationIllegalArgumentException("Could find root view for a given ancestor with tag " + i2);
        }
        synchronized (this.mRoots) {
            for (int i3 = 0; i3 < this.mRoots.size(); i3++) {
                try {
                    ViewGroup viewGroupF = this.mRoots.get(i3).f();
                    if ((viewGroupF instanceof ReactRootView) && ((ReactRootView) viewGroupF).getRootViewTag() == iResolveRootTagFromReactTag) {
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            synchronized (this.mEnqueuedRootViewInit) {
                try {
                    if (this.mEnqueuedRootViewInit.contains(Integer.valueOf(iResolveRootTagFromReactTag))) {
                        return;
                    }
                    this.mEnqueuedRootViewInit.add(Integer.valueOf(iResolveRootTagFromReactTag));
                    uIManagerModule.addUIBlock(new b(iResolveRootTagFromReactTag));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @ReactMethod
    public void attachGestureHandler(int i2, int i3) {
        tryInitializeHandlerForReactRootView(i3);
        if (this.mRegistry.b(i2, i3)) {
            return;
        }
        throw new JSApplicationIllegalArgumentException("Handler with tag " + i2 + " does not exists");
    }

    @ReactMethod
    public void createGestureHandler(String str, int i2, ReadableMap readableMap) {
        int i3 = 0;
        while (true) {
            d[] dVarArr = this.mHandlerFactories;
            if (i3 >= dVarArr.length) {
                throw new JSApplicationIllegalArgumentException("Invalid handler name " + str);
            }
            d dVar = dVarArr[i3];
            if (dVar.d().equals(str)) {
                oya oyaVarC = dVar.c(getReactApplicationContext());
                oyaVarC.M(i2);
                oyaVarC.K(this.mEventListener);
                this.mRegistry.h(oyaVarC);
                this.mInteractionManager.e(oyaVarC, readableMap);
                dVar.b(oyaVarC, readableMap);
                return;
            }
            i3++;
        }
    }

    @ReactMethod
    public void dropGestureHandler(int i2) {
        this.mInteractionManager.g(i2);
        this.mRegistry.e(i2);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map getConstants() {
        return e4f.e("State", e4f.i("UNDETERMINED", 0, "BEGAN", 2, "ACTIVE", 4, "CANCELLED", 3, ConfirmBizStatusInfo.STATUS_FAILED, 1, "END", 5), "Direction", e4f.g("RIGHT", 1, "LEFT", 2, "UP", 4, "DOWN", 8));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    public e8j getRegistry() {
        return this.mRegistry;
    }

    @ReactMethod
    public void handleClearJSResponder() {
    }

    @ReactMethod
    public void handleSetJSResponder(int i2, boolean z) {
        f8j f8jVarFindRootHelperForViewAncestor;
        if (this.mRegistry == null || (f8jVarFindRootHelperForViewAncestor = findRootHelperForViewAncestor(i2)) == null) {
            return;
        }
        f8jVarFindRootHelperForViewAncestor.g(i2, z);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.mRegistry.d();
        this.mInteractionManager.h();
        synchronized (this.mRoots) {
            while (!this.mRoots.isEmpty()) {
                try {
                    int size = this.mRoots.size();
                    f8j f8jVar = this.mRoots.get(0);
                    ViewGroup viewGroupF = f8jVar.f();
                    if (viewGroupF instanceof RNGestureHandlerEnabledRootView) {
                        ((RNGestureHandlerEnabledRootView) viewGroupF).t();
                    } else {
                        f8jVar.i();
                    }
                    if (this.mRoots.size() >= size) {
                        throw new IllegalStateException("Expected root helper to get unregistered while tearing down");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        super.onCatalystInstanceDestroy();
    }

    public void registerRootHelper(f8j f8jVar) {
        synchronized (this.mRoots) {
            try {
                if (this.mRoots.contains(f8jVar)) {
                    throw new IllegalStateException("Root helper" + f8jVar + " already registered");
                }
                this.mRoots.add(f8jVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void unregisterRootHelper(f8j f8jVar) {
        synchronized (this.mRoots) {
            this.mRoots.remove(f8jVar);
        }
    }

    @ReactMethod
    public void updateGestureHandler(int i2, ReadableMap readableMap) {
        d dVarFindFactoryForHandler;
        oya oyaVarF = this.mRegistry.f(i2);
        if (oyaVarF == null || (dVarFindFactoryForHandler = findFactoryForHandler(oyaVarF)) == null) {
            return;
        }
        this.mInteractionManager.g(i2);
        this.mInteractionManager.e(oyaVarF, readableMap);
        dVarFindFactoryForHandler.b(oyaVarF, readableMap);
    }
}
