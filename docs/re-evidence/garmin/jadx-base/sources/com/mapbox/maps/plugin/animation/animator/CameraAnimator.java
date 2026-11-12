package com.mapbox.maps.plugin.animation.animator;

import android.animation.Animator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.plugin.animation.CameraAnimatorOptions;
import com.mapbox.maps.plugin.animation.CameraAnimatorType;
import com.mapbox.maps.threading.AnimationThreadController;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import lc.u0;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;
import p13.h0;
import p13.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0016\b'\u0018\u0000 Y*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001YB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\u0015\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u0013H\u0000¢\u0006\u0002\b:J\u0015\u0010;\u001a\u0002082\u0006\u00109\u001a\u00020\u0015H\u0000¢\u0006\u0002\b<J\u0010\u0010=\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0013J\u0010\u0010>\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0015J\u0006\u0010?\u001a\u000208J\b\u0010@\u001a\u00020AH\u0016J#\u0010B\u001a\u00028\u00002\u0006\u0010C\u001a\u00020D2\n\b\u0002\u0010E\u001a\u0004\u0018\u000105H\u0000¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000)H\u0000¢\u0006\u0004\bI\u0010+J\b\u0010J\u001a\u000208H\u0002J\u0006\u0010K\u001a\u000208J\u0006\u0010L\u001a\u000208J\r\u0010M\u001a\u000208H\u0000¢\u0006\u0002\bNJ\r\u0010O\u001a\u000208H\u0000¢\u0006\u0002\bPJ\u0010\u0010Q\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0013J\u0010\u0010R\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0015J\u0014\u0010S\u001a\u0002082\f\u0010T\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004J#\u0010U\u001a\u0002082\u0016\u0010V\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010A0)\"\u0004\u0018\u00010A¢\u0006\u0002\u0010WJ\u0006\u0010X\u001a\u000208R\u001a\u0010\b\u001a\u00020\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0088\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000b\"\u0004\b\u0018\u0010\rR(\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u00020\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000b\"\u0004\b#\u0010\rR\u0015\u0010$\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u001b\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000)¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0012\u0010-\u001a\u00020.X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0016\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001302X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001502X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010$\u001a\u000204*\u0002058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u00106¨\u0006Z"}, d2 = {"Lcom/mapbox/maps/plugin/animation/animator/CameraAnimator;", "T", "Landroid/animation/ValueAnimator;", "evaluator", "Landroid/animation/TypeEvaluator;", "cameraAnimatorOptions", "Lcom/mapbox/maps/plugin/animation/CameraAnimatorOptions;", "(Landroid/animation/TypeEvaluator;Lcom/mapbox/maps/plugin/animation/CameraAnimatorOptions;)V", "canceled", "", "getCanceled$plugin_animation_release", "()Z", "setCanceled$plugin_animation_release", "(Z)V", "hasUserListeners", "getHasUserListeners$plugin_animation_release", "immediate", "getImmediate", "internalListener", "Landroid/animation/Animator$AnimatorListener;", "internalUpdateListener", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "isInternal", "isInternal$plugin_animation_release", "setInternal$plugin_animation_release", "<set-?>", "", "owner", "getOwner", "()Ljava/lang/String;", "setOwner$plugin_animation_release", "(Ljava/lang/String;)V", "registered", "skipped", "getSkipped$plugin_animation_release", "setSkipped$plugin_animation_release", "startValue", "getStartValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "targets", "", "getTargets", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", NotificationConstants.KEY_DATA_MIME_TYPE, "Lcom/mapbox/maps/plugin/animation/CameraAnimatorType;", "getType", "()Lcom/mapbox/maps/plugin/animation/CameraAnimatorType;", "userListeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "userUpdateListeners", "Ljava/io/Serializable;", "Lcom/mapbox/maps/CameraState;", "(Lcom/mapbox/maps/CameraState;)Ljava/io/Serializable;", "addInternalListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addInternalListener$plugin_animation_release", "addInternalUpdateListener", "addInternalUpdateListener$plugin_animation_release", "addListener", "addUpdateListener", "cancel", "getAnimatedValue", "", "getAnimatedValueAt", "fraction", "", "startCameraState", "getAnimatedValueAt$plugin_animation_release", "(FLcom/mapbox/maps/CameraState;)Ljava/lang/Object;", "getTargetValues", "getTargetValues$plugin_animation_release", "handleImmediateAnimation", "removeAllListeners", "removeAllUpdateListeners", "removeInternalListener", "removeInternalListener$plugin_animation_release", "removeInternalUpdateListener", "removeInternalUpdateListener$plugin_animation_release", "removeListener", "removeUpdateListener", "setEvaluator", "value", "setObjectValues", "values", "([Ljava/lang/Object;)V", TtmlNode.START, "Companion", "plugin-animation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@SuppressLint({"Recycle"})
public abstract class CameraAnimator<T> extends ValueAnimator {
    private static final String TAG = "Mbgl-CameraAnimator";
    private boolean canceled;
    private final TypeEvaluator<T> evaluator;
    private Animator.AnimatorListener internalListener;
    private ValueAnimator.AnimatorUpdateListener internalUpdateListener;
    private boolean isInternal;
    private String owner;
    private boolean registered;
    private boolean skipped;
    private final T startValue;
    private final T[] targets;
    private final CopyOnWriteArraySet<Animator.AnimatorListener> userListeners;
    private final CopyOnWriteArraySet<ValueAnimator.AnimatorUpdateListener> userUpdateListeners;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CameraAnimatorType.values().length];
            try {
                iArr[CameraAnimatorType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CameraAnimatorType.ZOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CameraAnimatorType.ANCHOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CameraAnimatorType.PADDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CameraAnimatorType.BEARING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CameraAnimatorType.PITCH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CameraAnimator(TypeEvaluator<T> typeEvaluator, CameraAnimatorOptions<? extends T> cameraAnimatorOptions) {
        typeEvaluator.getClass();
        cameraAnimatorOptions.getClass();
        this.evaluator = typeEvaluator;
        this.owner = cameraAnimatorOptions.getOwner();
        this.startValue = cameraAnimatorOptions.getStartValue();
        Object[] targets = cameraAnimatorOptions.getTargets();
        this.targets = targets;
        this.userUpdateListeners = new CopyOnWriteArraySet<>();
        this.userListeners = new CopyOnWriteArraySet<>();
        T t7 = targets[0];
        setObjectValues(t7, t7);
        setEvaluator(typeEvaluator);
    }

    public static /* synthetic */ Object getAnimatedValueAt$plugin_animation_release$default(CameraAnimator cameraAnimator, float f14, CameraState cameraState, int i14, Object obj) {
        if (obj != null) {
            e.w("Super calls with default arguments not supported in this target, function: getAnimatedValueAt");
            return null;
        }
        if ((i14 & 2) != 0) {
            cameraState = null;
        }
        return cameraAnimator.getAnimatedValueAt$plugin_animation_release(f14, cameraState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getImmediate() {
        return getDuration() == 0 && getStartDelay() == 0;
    }

    private final Serializable getStartValue(CameraState cameraState) {
        switch (WhenMappings.$EnumSwitchMapping$0[getType().ordinal()]) {
            case 1:
                Point center = cameraState.getCenter();
                center.getClass();
                return center;
            case 2:
                return Double.valueOf(cameraState.getZoom());
            case 3:
                return new ScreenCoordinate(0.0d, 0.0d);
            case 4:
                EdgeInsets padding = cameraState.getPadding();
                padding.getClass();
                return padding;
            case 5:
                return Double.valueOf(cameraState.getBearing());
            case 6:
                return Double.valueOf(cameraState.getPitch());
            default:
                u0.r();
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleImmediateAnimation() {
        ArrayList<Animator.AnimatorListener> listeners = getListeners();
        listeners.getClass();
        List listB1 = h0.b1(listeners);
        Iterator<T> it = listB1.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationStart(this);
        }
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.internalUpdateListener;
        if (animatorUpdateListener != null) {
            animatorUpdateListener.onAnimationUpdate(this);
        }
        for (ValueAnimator.AnimatorUpdateListener animatorUpdateListener2 : this.userUpdateListeners) {
            if (animatorUpdateListener2 != null) {
                animatorUpdateListener2.onAnimationUpdate(this);
            }
        }
        Iterator<T> it3 = listB1.iterator();
        while (it3.hasNext()) {
            ((Animator.AnimatorListener) it3.next()).onAnimationEnd(this);
        }
    }

    public final void addInternalListener$plugin_animation_release(Animator.AnimatorListener listener) {
        listener.getClass();
        super.removeAllListeners();
        this.registered = true;
        this.internalListener = listener;
        super.addListener(listener);
        Iterator<T> it = this.userListeners.iterator();
        while (it.hasNext()) {
            super.addListener((Animator.AnimatorListener) it.next());
        }
    }

    public final void addInternalUpdateListener$plugin_animation_release(ValueAnimator.AnimatorUpdateListener listener) {
        listener.getClass();
        super.removeAllUpdateListeners();
        this.internalUpdateListener = listener;
        super.addUpdateListener(listener);
        Iterator<T> it = this.userUpdateListeners.iterator();
        while (it.hasNext()) {
            super.addUpdateListener((ValueAnimator.AnimatorUpdateListener) it.next());
        }
    }

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener listener) {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new AnonymousClass1(this, listener));
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener listener) {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new C42161(this, listener));
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new C42171(this));
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        if (getImmediate()) {
            Object objQ = u.Q(this.targets);
            objQ.getClass();
            return objQ;
        }
        Object animatedValue = super.getAnimatedValue();
        animatedValue.getClass();
        return animatedValue;
    }

    public final T getAnimatedValueAt$plugin_animation_release(float fraction, CameraState startCameraState) {
        if (this.targets.length != 1) {
            e.w("getAnimatedValueAt() is only supported for single target animations.");
            return null;
        }
        Object startValue = this.startValue;
        if (startValue == null && startCameraState == null) {
            e.w("getAnimatedValueAt() is only supported for animators with a startValue or a non-null current camera state must be provided.");
            return null;
        }
        if (startValue == null) {
            startCameraState.getClass();
            startValue = getStartValue(startCameraState);
            if (startValue == null) {
                startValue = null;
            }
        }
        if (startValue != null) {
            return this.evaluator.evaluate(getInterpolator().getInterpolation(fraction), (T) startValue, (T) u.Q(this.targets));
        }
        e.w("Could not resolve start value for animator");
        return null;
    }

    /* JADX INFO: renamed from: getCanceled$plugin_animation_release, reason: from getter */
    public final boolean getCanceled() {
        return this.canceled;
    }

    public final boolean getHasUserListeners$plugin_animation_release() {
        return !this.userUpdateListeners.isEmpty();
    }

    public final String getOwner() {
        return this.owner;
    }

    /* JADX INFO: renamed from: getSkipped$plugin_animation_release, reason: from getter */
    public final boolean getSkipped() {
        return this.skipped;
    }

    public final T[] getTargetValues$plugin_animation_release() {
        return this.targets;
    }

    public final T[] getTargets() {
        return this.targets;
    }

    public abstract CameraAnimatorType getType();

    /* JADX INFO: renamed from: isInternal$plugin_animation_release, reason: from getter */
    public final boolean getIsInternal() {
        return this.isInternal;
    }

    @Override // android.animation.Animator
    public final void removeAllListeners() {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new C42181(this));
    }

    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new C42191(this));
    }

    public final void removeInternalListener$plugin_animation_release() {
        super.removeListener(this.internalListener);
        this.internalListener = null;
        this.registered = false;
    }

    public final void removeInternalUpdateListener$plugin_animation_release() {
        super.removeUpdateListener(this.internalUpdateListener);
        this.internalUpdateListener = null;
    }

    @Override // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener listener) {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new C42201(listener, this));
    }

    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener listener) {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new C42211(listener, this));
    }

    public final void setCanceled$plugin_animation_release(boolean z14) {
        this.canceled = z14;
    }

    @Override // android.animation.ValueAnimator
    public final void setEvaluator(TypeEvaluator<?> value) {
        super.setEvaluator(value);
    }

    public final void setInternal$plugin_animation_release(boolean z14) {
        this.isInternal = z14;
    }

    @Override // android.animation.ValueAnimator
    public final void setObjectValues(Object... values) {
        values.getClass();
        super.setObjectValues(Arrays.copyOf(values, values.length));
    }

    public final void setOwner$plugin_animation_release(String str) {
        this.owner = str;
    }

    public final void setSkipped$plugin_animation_release(boolean z14) {
        this.skipped = z14;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void start() {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new C42221(this));
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.animation.animator.CameraAnimator$cancel$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42171 extends w implements e23.a<Unit> {
        final /* synthetic */ CameraAnimator<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C42171(CameraAnimator<? extends T> cameraAnimator) {
            super(0);
            this.this$0 = cameraAnimator;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.this$0.setCanceled$plugin_animation_release(true);
            CameraAnimator.super.cancel();
        }

        @Override // e23.a
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.animation.animator.CameraAnimator$addListener$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements e23.a<Unit> {
        final /* synthetic */ Animator.AnimatorListener $listener;
        final /* synthetic */ CameraAnimator<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(CameraAnimator<? extends T> cameraAnimator, Animator.AnimatorListener animatorListener) {
            super(0);
            this.this$0 = cameraAnimator;
            this.$listener = animatorListener;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (((CameraAnimator) this.this$0).internalListener != null) {
                CameraAnimator.super.addListener(this.$listener);
            }
            ((CameraAnimator) this.this$0).userListeners.add(this.$listener);
        }

        @Override // e23.a
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.animation.animator.CameraAnimator$addUpdateListener$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42161 extends w implements e23.a<Unit> {
        final /* synthetic */ ValueAnimator.AnimatorUpdateListener $listener;
        final /* synthetic */ CameraAnimator<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C42161(CameraAnimator<? extends T> cameraAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            super(0);
            this.this$0 = cameraAnimator;
            this.$listener = animatorUpdateListener;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (((CameraAnimator) this.this$0).internalUpdateListener != null) {
                CameraAnimator.super.addUpdateListener(this.$listener);
            }
            ((CameraAnimator) this.this$0).userUpdateListeners.add(this.$listener);
        }

        @Override // e23.a
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.animation.animator.CameraAnimator$removeAllListeners$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42181 extends w implements e23.a<Unit> {
        final /* synthetic */ CameraAnimator<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C42181(CameraAnimator<? extends T> cameraAnimator) {
            super(0);
            this.this$0 = cameraAnimator;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            CameraAnimator.super.removeAllListeners();
            if (((CameraAnimator) this.this$0).internalListener != null) {
                CameraAnimator<T> cameraAnimator = this.this$0;
                CameraAnimator.super.addListener(((CameraAnimator) cameraAnimator).internalListener);
            }
            ((CameraAnimator) this.this$0).userListeners.clear();
        }

        @Override // e23.a
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.animation.animator.CameraAnimator$removeAllUpdateListeners$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42191 extends w implements e23.a<Unit> {
        final /* synthetic */ CameraAnimator<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C42191(CameraAnimator<? extends T> cameraAnimator) {
            super(0);
            this.this$0 = cameraAnimator;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            CameraAnimator.super.removeAllUpdateListeners();
            if (((CameraAnimator) this.this$0).internalUpdateListener != null) {
                CameraAnimator<T> cameraAnimator = this.this$0;
                CameraAnimator.super.addUpdateListener(((CameraAnimator) cameraAnimator).internalUpdateListener);
            }
            ((CameraAnimator) this.this$0).userUpdateListeners.clear();
        }

        @Override // e23.a
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.animation.animator.CameraAnimator$removeListener$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42201 extends w implements e23.a<Unit> {
        final /* synthetic */ Animator.AnimatorListener $listener;
        final /* synthetic */ CameraAnimator<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C42201(Animator.AnimatorListener animatorListener, CameraAnimator<? extends T> cameraAnimator) {
            super(0);
            this.$listener = animatorListener;
            this.this$0 = cameraAnimator;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (!s.g(this.$listener, ((CameraAnimator) this.this$0).internalListener)) {
                CameraAnimator.super.removeListener(this.$listener);
            }
            if (((CameraAnimator) this.this$0).userListeners.contains(this.$listener)) {
                ((CameraAnimator) this.this$0).userListeners.remove(this.$listener);
            }
        }

        @Override // e23.a
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.animation.animator.CameraAnimator$removeUpdateListener$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42211 extends w implements e23.a<Unit> {
        final /* synthetic */ ValueAnimator.AnimatorUpdateListener $listener;
        final /* synthetic */ CameraAnimator<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C42211(ValueAnimator.AnimatorUpdateListener animatorUpdateListener, CameraAnimator<? extends T> cameraAnimator) {
            super(0);
            this.$listener = animatorUpdateListener;
            this.this$0 = cameraAnimator;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (!s.g(this.$listener, ((CameraAnimator) this.this$0).internalUpdateListener)) {
                CameraAnimator.super.removeUpdateListener(this.$listener);
            }
            if (((CameraAnimator) this.this$0).userUpdateListeners.contains(this.$listener)) {
                ((CameraAnimator) this.this$0).userUpdateListeners.remove(this.$listener);
            }
        }

        @Override // e23.a
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.animation.animator.CameraAnimator$start$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42221 extends w implements e23.a<Unit> {
        final /* synthetic */ CameraAnimator<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C42221(CameraAnimator<? extends T> cameraAnimator) {
            super(0);
            this.this$0 = cameraAnimator;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            boolean z14 = ((CameraAnimator) this.this$0).registered;
            CameraAnimator<T> cameraAnimator = this.this$0;
            if (!z14) {
                MapboxLogger.logW(CameraAnimator.TAG, "Animation " + cameraAnimator.getType() + " was not registered and will not run. Register it with registerAnimation() method.");
                return;
            }
            cameraAnimator.setCanceled$plugin_animation_release(false);
            boolean immediate = this.this$0.getImmediate();
            CameraAnimator<T> cameraAnimator2 = this.this$0;
            if (immediate) {
                cameraAnimator2.handleImmediateAnimation();
            } else {
                CameraAnimator.super.start();
            }
        }

        @Override // e23.a
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    public final T getStartValue() {
        return this.startValue;
    }
}
