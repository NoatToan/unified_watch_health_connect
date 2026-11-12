package com.huami.sync.dialog;

import android.animation.Animator;
import android.view.View;
import android.view.animation.Interpolator;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.passport.Configs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\b&\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0007¢\u0006\u0004\b\"\u0010#J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0004J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0007J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\b\u001a\u00020\u00078\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\t\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0010R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006&"}, d2 = {"Lcom/huami/sync/dialog/AnimatorSet;", "", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "setAnimation", "start", "", "duration", "delay", "Landroid/view/animation/Interpolator;", "interpolator", "Lcom/huami/sync/dialog/AnimatorSet$AnimatorListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "playOn", "a", "J", "getDuration", "()J", "setDuration", "(J)V", "Landroid/animation/AnimatorSet;", "b", "Landroid/animation/AnimatorSet;", "getAnimatorSet", "()Landroid/animation/AnimatorSet;", "setAnimatorSet", "(Landroid/animation/AnimatorSet;)V", "animatorSet", "c", "Landroid/view/animation/Interpolator;", GoogleApiAvailabilityLight.a, "e", "Lcom/huami/sync/dialog/AnimatorSet$AnimatorListener;", "<init>", "()V", "Companion", "AnimatorListener", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
public abstract class AnimatorSet {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private long duration = 500;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Interpolator interpolator;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private long delay;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private AnimatorListener listener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¨\u0006\t"}, d2 = {"Lcom/huami/sync/dialog/AnimatorSet$AnimatorListener;", "", "Landroid/animation/Animator;", "animator", "", "onAnimationStart", "onAnimationRepeat", "onAnimationEnd", "onAnimationCancel", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
    public interface AnimatorListener {
        void onAnimationCancel(@Nullable Animator animator);

        void onAnimationEnd(@Nullable Animator animator);

        void onAnimationRepeat(@Nullable Animator animator);

        void onAnimationStart(@Nullable Animator animator);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/sync/dialog/AnimatorSet$Companion;", "", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", Configs.Params.RESET, "<init>", "()V", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void reset(@NotNull View view) {
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            view.setRotation(0.0f);
            view.setRotationY(0.0f);
            view.setRotationX(0.0f);
        }
    }

    @NotNull
    public final AnimatorSet delay(long delay) {
        this.delay = delay;
        return this;
    }

    @NotNull
    public final AnimatorSet duration(long duration) {
        this.duration = duration;
        return this;
    }

    @NotNull
    public final android.animation.AnimatorSet getAnimatorSet() {
        return this.animatorSet;
    }

    public final long getDuration() {
        return this.duration;
    }

    @NotNull
    public final AnimatorSet interpolator(@Nullable Interpolator interpolator) {
        this.interpolator = interpolator;
        return this;
    }

    @NotNull
    public final AnimatorSet listener(@Nullable AnimatorListener listener) {
        this.listener = listener;
        return this;
    }

    public final void playOn(@NotNull View view) {
        start(view);
    }

    public abstract void setAnimation(@Nullable View view);

    public final void setAnimatorSet(@NotNull android.animation.AnimatorSet animatorSet) {
        this.animatorSet = animatorSet;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void start(@NotNull View view) {
        INSTANCE.reset(view);
        setAnimation(view);
        this.animatorSet.setDuration(this.duration);
        Interpolator interpolator = this.interpolator;
        if (interpolator != null) {
            this.animatorSet.setInterpolator(interpolator);
        }
        long j = this.delay;
        if (j > 0) {
            this.animatorSet.setStartDelay(j);
        }
        if (this.listener != null) {
            this.animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.huami.sync.dialog.AnimatorSet.start.1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(@NotNull Animator animator) {
                    AnimatorSet.this.listener.onAnimationCancel(animator);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(@NotNull Animator animator) {
                    AnimatorSet.this.listener.onAnimationEnd(animator);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(@NotNull Animator animator) {
                    AnimatorSet.this.listener.onAnimationRepeat(animator);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(@NotNull Animator animator) {
                    AnimatorSet.this.listener.onAnimationStart(animator);
                }
            });
        }
        this.animatorSet.start();
    }
}
