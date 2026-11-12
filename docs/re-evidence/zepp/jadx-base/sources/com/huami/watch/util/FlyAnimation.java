package com.huami.watch.util;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import aurelienribon.tweenengine.BaseTween;
import aurelienribon.tweenengine.Timeline;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.TweenAccessor;
import aurelienribon.tweenengine.TweenCallback;
import aurelienribon.tweenengine.TweenManager;
import aurelienribon.tweenengine.TweenPaths;
import aurelienribon.tweenengine.equations.Back;
import aurelienribon.tweenengine.equations.Linear;
import aurelienribon.tweenengine.equations.Quad;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watch.wififtp.R;
import com.loc.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000}\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\b*\u0001<\u0018\u0000 B2\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b@\u0010AJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0002J \u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J0\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J2\u0010\u001a\u001a\u00020\u00042\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00162\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018J\u0006\u0010\u001b\u001a\u00020\u0004J\u0006\u0010\u001c\u001a\u00020\u0004R\u0016\u0010\u001e\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001dR\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010#R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020(8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b,\u0010*R\u0016\u0010/\u001a\u00020(8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b.\u0010*R\u0016\u00101\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010\u001dR\u0016\u00103\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010\u001dR\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006C"}, d2 = {"Lcom/huami/watch/util/FlyAnimation;", "", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "b", "Laurelienribon/tweenengine/Timeline;", "timeLine", "redPoint", "transBtn", GoogleApiAvailabilityLight.a, "", "position", "Landroid/view/ViewGroup;", "decorView", "Landroid/app/Activity;", "activity", "a", "", "index", "location", "c", "", "fromViews", "Laurelienribon/tweenengine/TweenCallback;", "onEnd", "startAnimation", "stopAnim", "release", LogUtil.I, "size", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "activityRef", "", "Ljava/util/List;", "addedViews", "Laurelienribon/tweenengine/TweenManager;", "Laurelienribon/tweenengine/TweenManager;", "tweenManager", "", "e", "F", "duration0", "f", "duration1", "g", "delayEach", "h", "targetX", "i", "targetY", "Landroid/os/Handler;", z.j, "Landroid/os/Handler;", "uiHandler", "Ljava/util/TimerTask;", hl.k, "Ljava/util/TimerTask;", "updateTask", "com/huami/watch/util/FlyAnimation$tweenAccessor$1", "l", "Lcom/huami/watch/util/FlyAnimation$tweenAccessor$1;", "tweenAccessor", "<init>", "(Landroid/app/Activity;)V", "t", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public final class FlyAnimation {
    private static final int m = 1;
    private static final int n = 2;
    private static final int o = 3;
    private static final int p = 4;
    private static final int q = 5;
    private static final long r = 16;
    private static final int s = 0;

    @NotNull
    private static final a t = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int size;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private WeakReference<Activity> activityRef;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private TimerTask updateTask;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<View> addedViews = new ArrayList();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TweenManager tweenManager = new TweenManager();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float duration0 = 0.12f;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float duration1 = 0.72f;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final float delayEach = 0.01f;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int targetX = 927;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int targetY = 8;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final Handler uiHandler = new Handler(Looper.getMainLooper(), new d());

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private FlyAnimation$tweenAccessor$1 tweenAccessor = new TweenAccessor<View>() { // from class: com.huami.watch.util.FlyAnimation$tweenAccessor$1
        @Override // aurelienribon.tweenengine.TweenAccessor
        public int getValues(@NotNull View view, int tweenType, @NotNull float[] returnValues) {
            if (tweenType == 1) {
                returnValues[0] = view.getX();
                returnValues[1] = view.getY();
                return 2;
            }
            if (tweenType == 2) {
                returnValues[0] = view.getX() + (view.getWidth() / 2);
                returnValues[1] = view.getY() + (view.getHeight() / 2);
                return 2;
            }
            if (tweenType == 3) {
                returnValues[0] = view.getScaleX();
                returnValues[1] = view.getScaleY();
                return 2;
            }
            if (tweenType == 4) {
                returnValues[0] = view.getAlpha();
            } else {
                if (tweenType != 5) {
                    return -1;
                }
                returnValues[0] = view.getRotation();
            }
            return 1;
        }

        @Override // aurelienribon.tweenengine.TweenAccessor
        public void setValues(@NotNull View view, int tweenType, @NotNull float[] newValues) {
            if (tweenType == 1) {
                view.setX(newValues[0]);
                view.setY(newValues[1]);
                return;
            }
            if (tweenType == 2) {
                view.setX(newValues[0] - (view.getWidth() / 2));
                view.setY(newValues[1] - (view.getHeight() / 2));
            } else if (tweenType == 3) {
                view.setScaleX(newValues[0]);
                view.setScaleY(newValues[1]);
            } else if (tweenType == 4) {
                view.setAlpha(newValues[0]);
            } else {
                if (tweenType != 5) {
                    return;
                }
                view.setRotation(newValues[0]);
            }
        }
    };

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"com/huami/watch/util/FlyAnimation$a", "", "", "ALPHA", LogUtil.I, "CPOS_XY", "MSG", "POS_XY", "ROTATE", "SCALE_XY", "", "UPDATE_DELTA", "J", "<init>", "()V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0016\u0010\u0004\u001a\u0012\u0012\u0002\b\u0003 \u0003*\b\u0012\u0002\b\u0003\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "i", "Laurelienribon/tweenengine/BaseTween;", "kotlin.jvm.PlatformType", "baseTween", "", "onEvent", "(ILaurelienribon/tweenengine/BaseTween;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class b implements TweenCallback {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ View b;

        public b(ViewGroup viewGroup, View view) {
            this.a = viewGroup;
            this.b = view;
        }

        @Override // aurelienribon.tweenengine.TweenCallback
        public final void onEvent(int i, BaseTween<?> baseTween) {
            this.a.removeView(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0016\u0010\u0004\u001a\u0012\u0012\u0002\b\u0003 \u0003*\b\u0012\u0002\b\u0003\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "i", "Laurelienribon/tweenengine/BaseTween;", "kotlin.jvm.PlatformType", "baseTween", "", "onEvent", "(ILaurelienribon/tweenengine/BaseTween;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class c implements TweenCallback {
        public final /* synthetic */ TweenCallback b;

        public c(TweenCallback tweenCallback) {
            this.b = tweenCallback;
        }

        @Override // aurelienribon.tweenengine.TweenCallback
        public final void onEvent(int i, BaseTween<?> baseTween) {
            FlyAnimation.this.stopAnim();
            TweenCallback tweenCallback = this.b;
            if (tweenCallback != null) {
                tweenCallback.onEvent(i, baseTween);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/os/Message;", "message", "", "handleMessage", "(Landroid/os/Message;)Z", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class d implements Handler.Callback {
        public d() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(@NotNull Message message) {
            if (message.what != 0) {
                return true;
            }
            FlyAnimation.this.tweenManager.update(0.016f);
            return true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [com.huami.watch.util.FlyAnimation$tweenAccessor$1] */
    public FlyAnimation(@NotNull Activity activity) {
        this.size = (int) DensityUtil.dpToPx(activity, 30.0f);
        this.activityRef = new WeakReference<>(activity);
        Tween.setWaypointsLimit(10);
        Tween.registerAccessor(View.class, this.tweenAccessor);
    }

    private final View a(int[] position, ViewGroup decorView, Activity activity) {
        ImageView imageView = new ImageView(activity);
        int i = this.size;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.setMargins(position[0], position[1], 0, 0);
        decorView.addView(imageView, layoutParams);
        imageView.setImageResource(R.drawable.ftp_icon_music);
        return imageView;
    }

    private final void b(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.targetX = iArr[0];
        this.targetY = iArr[1];
    }

    private final void c(Timeline timeLine, int index, View view, int[] location, ViewGroup decorView) {
        PathEquation pathEquation = new PathEquation(0.42f, 0.81f, 0.84f, 1.0f);
        int i = location[0];
        int i2 = location[1];
        float f = this.delayEach * index;
        Tween tweenTarget = Tween.to(view, 3, this.duration0).delay(f).target(0.5f, 0.5f);
        Linear linear = Linear.INOUT;
        Timeline timelinePush = timeLine.push(tweenTarget.ease(linear)).push(Tween.to(view, 4, this.duration0).delay(f).target(1.0f).ease(linear)).push(Tween.to(view, 4, this.duration1).delay(this.duration0 + f).target(0.0f).ease(pathEquation)).push(Tween.to(view, 5, this.duration1).delay(this.duration0 + f).target(60.0f).ease(pathEquation));
        Tween tweenEase = Tween.to(view, 1, this.duration1).delay(this.duration0 + f).target(this.targetX, this.targetY).ease(pathEquation);
        float f2 = i;
        float f3 = i2;
        timelinePush.push(tweenEase.waypoint(((this.targetX - i) * 0.25f) + f2, ((this.targetY - i2) * 0.5f) + f3).waypoint(f2 + ((this.targetX - i) * 0.75f), f3 + ((this.targetY - i2) * 0.9f)).path(TweenPaths.catmullRom).setCallbackTriggers(4).setCallback(new b(decorView, view)));
    }

    private final void d(Timeline timeLine, View redPoint, View transBtn) {
        float f = (this.duration0 + this.duration1) - 0.16f;
        Back back = Back.OUT;
        back.s(3.5f);
        Tween tweenTarget = Tween.to(transBtn, 3, 0.16f).delay(f).target(1.35f, 1.35f);
        Quad quad = Quad.INOUT;
        float f2 = f + 0.16f;
        timeLine.push(tweenTarget.ease(quad)).push(Tween.to(transBtn, 3, 0.28f).delay(f2).target(1.0f, 1.0f).ease(back));
        if (redPoint.getVisibility() == 4) {
            redPoint.setScaleX(0.0f);
            redPoint.setScaleY(0.0f);
            redPoint.setVisibility(0);
            timeLine.push(Tween.to(redPoint, 3, 0.16f).delay(f).target(1.35f, 1.35f).ease(quad)).push(Tween.to(redPoint, 3, 0.28f).delay(f2).target(1.0f, 1.0f).ease(back));
        }
    }

    public static /* synthetic */ void startAnimation$default(FlyAnimation flyAnimation, List list, View view, View view2, TweenCallback tweenCallback, int i, Object obj) {
        if ((i & 8) != 0) {
            tweenCallback = null;
        }
        flyAnimation.startAnimation(list, view, view2, tweenCallback);
    }

    public final void release() {
        stopAnim();
        this.tweenManager.killAll();
        Tween.registerAccessor(View.class, null);
    }

    public final void startAnimation(@Nullable List<? extends View> fromViews, @NotNull View redPoint, @NotNull View transBtn, @Nullable TweenCallback onEnd) {
        Window window;
        stopAnim();
        if (fromViews == null || fromViews.isEmpty()) {
            return;
        }
        WeakReference<Activity> weakReference = this.activityRef;
        Activity activity = weakReference != null ? weakReference.get() : null;
        View decorView = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
        ViewGroup viewGroup = (ViewGroup) (decorView instanceof ViewGroup ? decorView : null);
        if (viewGroup != null) {
            b(transBtn);
            Timeline timelineCreateParallel = Timeline.createParallel();
            int size = fromViews.size();
            for (int i = 0; i < size; i++) {
                int[] iArr = new int[2];
                fromViews.get(i).getLocationOnScreen(iArr);
                View viewA = a(iArr, viewGroup, activity);
                this.addedViews.add(viewA);
                c(timelineCreateParallel, i, viewA, iArr, viewGroup);
            }
            d(timelineCreateParallel, redPoint, transBtn);
            timelineCreateParallel.setCallbackTriggers(4).setCallback(new c(onEnd)).start(this.tweenManager);
            this.updateTask = new TimerTask() { // from class: com.huami.watch.util.FlyAnimation$startAnimation$$inlined$timerTask$1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    Handler handler = this.a.uiHandler;
                    FlyAnimation.a unused = FlyAnimation.t;
                    handler.sendEmptyMessage(0);
                }
            };
            new Timer().schedule(this.updateTask, 0L, 16L);
        }
    }

    public final void stopAnim() {
        for (View view : this.addedViews) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
        this.addedViews.clear();
        TimerTask timerTask = this.updateTask;
        if (timerTask != null) {
            timerTask.cancel();
        }
        this.uiHandler.removeMessages(0);
    }
}
