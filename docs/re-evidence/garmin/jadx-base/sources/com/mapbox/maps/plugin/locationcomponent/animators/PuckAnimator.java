package com.mapbox.maps.plugin.locationcomponent.animators;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.animation.LinearInterpolator;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.motion.a;
import com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer;
import com.mapbox.maps.threading.AnimationThreadController;
import e23.l;
import java.util.Arrays;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\b\b!\u0018\u0000 @*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001@B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0010\u001a\u00020\n2\u0016\u0010\u000f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000e0\r\"\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0006J\u0017\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u00020\n2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J9\u0010#\u001a\u00020\n2\u0012\u0010!\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\r\"\u00028\u00002\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\u0019¢\u0006\u0004\b#\u0010$J!\u0010&\u001a\u00020\n2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u0019¢\u0006\u0004\b&\u0010\u001cJ\r\u0010'\u001a\u00020\n¢\u0006\u0004\b'\u0010(R6\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n\u0018\u00010\u00198\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001a\u0010)\u0012\u0004\b-\u0010(\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\u001cR(\u0010.\u001a\u00020\u00028\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b.\u0010/\u0012\u0004\b3\u0010(\u001a\u0004\b0\u0010\u0018\"\u0004\b1\u00102R$\u00104\u001a\u0004\u0018\u00010\u001d8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u0010 R\"\u0010:\u001a\u0002098\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/animators/PuckAnimator;", "T", "Landroid/animation/ValueAnimator;", "Landroid/animation/TypeEvaluator;", "evaluator", "<init>", "(Landroid/animation/TypeEvaluator;)V", "", "fraction", "value", "", "updateLayer", "(FLjava/lang/Object;)V", "", "", "values", "setObjectValues", "([Ljava/lang/Object;)V", "setEvaluator", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addUpdateListener", "(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V", "clone", "()Landroid/animation/ValueAnimator;", "Lkotlin/Function1;", "updateListener", "setUpdateListener", "(Le23/l;)V", "Lcom/mapbox/maps/plugin/locationcomponent/LocationLayerRenderer;", "renderer", "setLocationLayerRenderer", "(Lcom/mapbox/maps/plugin/locationcomponent/LocationLayerRenderer;)V", "targets", "options", "animate", "([Ljava/lang/Object;Le23/l;)V", "block", "updateOptions", "cancelRunning", "()V", "Le23/l;", "getUpdateListener$plugin_locationcomponent_release", "()Le23/l;", "setUpdateListener$plugin_locationcomponent_release", "getUpdateListener$plugin_locationcomponent_release$annotations", "userConfiguredAnimator", "Landroid/animation/ValueAnimator;", "getUserConfiguredAnimator$plugin_locationcomponent_release", "setUserConfiguredAnimator$plugin_locationcomponent_release", "(Landroid/animation/ValueAnimator;)V", "getUserConfiguredAnimator$plugin_locationcomponent_release$annotations", "locationRenderer", "Lcom/mapbox/maps/plugin/locationcomponent/LocationLayerRenderer;", "getLocationRenderer", "()Lcom/mapbox/maps/plugin/locationcomponent/LocationLayerRenderer;", "setLocationRenderer", "", "enabled", "Z", "getEnabled$plugin_locationcomponent_release", "()Z", "setEnabled$plugin_locationcomponent_release", "(Z)V", "Companion", "plugin-locationcomponent_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@SuppressLint({"Recycle"})
public abstract class PuckAnimator<T> extends ValueAnimator {
    private static final LinearInterpolator DEFAULT_INTERPOLATOR = new LinearInterpolator();
    private boolean enabled;
    private LocationLayerRenderer locationRenderer;
    private l<? super T, Unit> updateListener;
    private ValueAnimator userConfiguredAnimator;

    public PuckAnimator(TypeEvaluator<T> typeEvaluator) {
        typeEvaluator.getClass();
        setObjectValues(new Object[0]);
        setEvaluator(typeEvaluator);
        addUpdateListener(new a(this, 3));
        setDuration(1000L);
        setInterpolator(DEFAULT_INTERPOLATOR);
        ValueAnimator valueAnimatorClone = clone();
        this.userConfiguredAnimator = valueAnimatorClone;
        valueAnimatorClone.setDuration(getDuration());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(PuckAnimator puckAnimator, ValueAnimator valueAnimator) {
        puckAnimator.getClass();
        valueAnimator.getClass();
        AnimationThreadController.INSTANCE.postOnMainThread(new PuckAnimator$1$1(valueAnimator, puckAnimator));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void animate$default(PuckAnimator puckAnimator, Object[] objArr, l lVar, int i14, Object obj) {
        if (obj != null) {
            e.w("Super calls with default arguments not supported in this target, function: animate");
            return;
        }
        if ((i14 & 2) != 0) {
            lVar = null;
        }
        puckAnimator.animate(objArr, lVar);
    }

    public static /* synthetic */ void getUpdateListener$plugin_locationcomponent_release$annotations() {
    }

    public static /* synthetic */ void getUserConfiguredAnimator$plugin_locationcomponent_release$annotations() {
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener listener) {
        super.addUpdateListener(listener);
    }

    public final void animate(T[] targets, l<? super ValueAnimator, Unit> options) {
        targets.getClass();
        cancelRunning();
        if (options == null) {
            setObjectValues(Arrays.copyOf(targets, targets.length));
            AnimationThreadController.INSTANCE.postOnAnimatorThread(new AnonymousClass1(this));
        } else {
            options.invoke(this.userConfiguredAnimator);
            this.userConfiguredAnimator.setObjectValues(Arrays.copyOf(targets, targets.length));
            AnimationThreadController.INSTANCE.postOnAnimatorThread(new AnonymousClass2(this));
        }
    }

    public final void cancelRunning() {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new C42451(this));
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final ValueAnimator clone() {
        ValueAnimator valueAnimatorClone = super.clone();
        valueAnimatorClone.getClass();
        return valueAnimatorClone;
    }

    /* JADX INFO: renamed from: getEnabled$plugin_locationcomponent_release, reason: from getter */
    public boolean getEnabled() {
        return this.enabled;
    }

    public final LocationLayerRenderer getLocationRenderer() {
        return this.locationRenderer;
    }

    public final l<T, Unit> getUpdateListener$plugin_locationcomponent_release() {
        return this.updateListener;
    }

    /* JADX INFO: renamed from: getUserConfiguredAnimator$plugin_locationcomponent_release, reason: from getter */
    public final ValueAnimator getUserConfiguredAnimator() {
        return this.userConfiguredAnimator;
    }

    public void setEnabled$plugin_locationcomponent_release(boolean z14) {
        this.enabled = z14;
    }

    @Override // android.animation.ValueAnimator
    public final void setEvaluator(TypeEvaluator<?> value) {
        super.setEvaluator(value);
    }

    public final void setLocationLayerRenderer(LocationLayerRenderer renderer) {
        renderer.getClass();
        this.locationRenderer = renderer;
    }

    public final void setLocationRenderer(LocationLayerRenderer locationLayerRenderer) {
        this.locationRenderer = locationLayerRenderer;
    }

    @Override // android.animation.ValueAnimator
    public final void setObjectValues(Object... values) {
        values.getClass();
        super.setObjectValues(Arrays.copyOf(values, values.length));
    }

    public final void setUpdateListener(l<? super T, Unit> updateListener) {
        updateListener.getClass();
        if (s.g(this.updateListener, updateListener)) {
            return;
        }
        this.updateListener = updateListener;
    }

    public final void setUpdateListener$plugin_locationcomponent_release(l<? super T, Unit> lVar) {
        this.updateListener = lVar;
    }

    public final void setUserConfiguredAnimator$plugin_locationcomponent_release(ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        this.userConfiguredAnimator = valueAnimator;
    }

    public abstract void updateLayer(float fraction, T value);

    public final void updateOptions(final l<? super ValueAnimator, Unit> block) {
        block.getClass();
        if (isRunning()) {
            addListener(new AnimatorListenerAdapter() { // from class: com.mapbox.maps.plugin.locationcomponent.animators.PuckAnimator.updateOptions.1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation, boolean isReverse) {
                    animation.getClass();
                    super.onAnimationEnd(animation, isReverse);
                    block.invoke(this);
                    this.removeListener(this);
                }
            });
        } else {
            block.invoke(this);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.locationcomponent.animators.PuckAnimator$animate$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements e23.a<Unit> {
        final /* synthetic */ PuckAnimator<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PuckAnimator<T> puckAnimator) {
            super(0);
            this.this$0 = puckAnimator;
        }

        @Override // e23.a
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.this$0.start();
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.locationcomponent.animators.PuckAnimator$animate$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends w implements e23.a<Unit> {
        final /* synthetic */ PuckAnimator<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PuckAnimator<T> puckAnimator) {
            super(0);
            this.this$0 = puckAnimator;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.this$0.getUserConfiguredAnimator().start();
        }

        @Override // e23.a
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.locationcomponent.animators.PuckAnimator$cancelRunning$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42451 extends w implements e23.a<Unit> {
        final /* synthetic */ PuckAnimator<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42451(PuckAnimator<T> puckAnimator) {
            super(0);
            this.this$0 = puckAnimator;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (this.this$0.isRunning()) {
                this.this$0.cancel();
            }
            if (this.this$0.getUserConfiguredAnimator().isRunning()) {
                this.this$0.getUserConfiguredAnimator().cancel();
            }
        }

        @Override // e23.a
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }
}
