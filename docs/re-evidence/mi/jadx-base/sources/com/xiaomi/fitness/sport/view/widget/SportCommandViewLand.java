package com.xiaomi.fitness.sport.view.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.miui.circulate.api.protocol.audio.support.MediaMetaData;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.share.report.holder.EditCustomTabLayoutHolder;
import com.xiaomi.fitness.sport.interfaces.ISportStateOnViewCallback;
import com.xiaomi.fitness.sport.view.widget.CircularProgressLayout;
import com.xiaomi.fitness.sport.view.widget.SportCommandViewLand;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import defpackage.aki;
import defpackage.dvi;
import defpackage.eoi;
import defpackage.n0d;
import defpackage.ni4;
import defpackage.q8p;
import defpackage.sk5;
import defpackage.xce;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001cB\u001d\b\u0007\u0012\b\u0010^\u001a\u0004\u0018\u00010]\u0012\b\u0010`\u001a\u0004\u0018\u00010_¢\u0006\u0004\ba\u0010bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0004J\u0015\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010 R\"\u0010#\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u001b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b)\u0010\u001dR\u0014\u0010*\u001a\u00020\u001b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b*\u0010\u001dR\u0014\u0010+\u001a\u00020\u001b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b+\u0010\u001dR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010,R\u0016\u0010\u0015\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010-R$\u0010/\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u00105\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010 \u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010;\u001a\u0004\u0018\u00010:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010B\u001a\u0004\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010-R\u0018\u0010I\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010CR\u0016\u0010J\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010\u001dR\u0014\u0010K\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\bK\u0010-R\u0016\u0010L\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010-R\u0016\u0010M\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010-R\u0016\u0010N\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010-R\u0016\u0010O\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010-R\u0016\u0010P\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010-R\u0016\u0010Q\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010T\u001a\u00020S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\"\u0010W\u001a\u00020V8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\¨\u0006d"}, d2 = {"Lcom/xiaomi/fitness/sport/view/widget/SportCommandViewLand;", "Landroid/widget/LinearLayout;", "", "setListener", "()V", "initView", "animator2Lock", "animator2Sporting", "finishStartAnimator", "finishStopAnimator", "", "isRTLDirection", "()Z", "", "getSportState", "()I", "Lcom/xiaomi/fitness/sport/interfaces/ISportStateOnViewCallback;", "iSportStateOnViewListener", "setOnSportStateOnViewListener", "(Lcom/xiaomi/fitness/sport/interfaces/ISportStateOnViewCallback;)V", LifecycleConstantKt.ON_DESTROY, "sportState", "setSportState", "(I)V", "", "TAG", "Ljava/lang/String;", "", "FINISH_PRESSED_TOTAL_TIME", "J", "Landroid/widget/ImageView;", "mOngoingActionImgView", "Landroid/widget/ImageView;", "mFinishSportImgView", "", "currentValue", "F", "getCurrentValue", "()F", "setCurrentValue", "(F)V", "mFinishSportAnimatorTime", "mLockAnimatorTime", "mScaleAnimatorTime", "Lcom/xiaomi/fitness/sport/interfaces/ISportStateOnViewCallback;", "I", "Lcom/xiaomi/fitness/sport/view/widget/CircularProgressLayout;", "mFinishCircleView", "Lcom/xiaomi/fitness/sport/view/widget/CircularProgressLayout;", "getMFinishCircleView", "()Lcom/xiaomi/fitness/sport/view/widget/CircularProgressLayout;", "setMFinishCircleView", "(Lcom/xiaomi/fitness/sport/view/widget/CircularProgressLayout;)V", "mFinishRingBgView", "getMFinishRingBgView", "()Landroid/widget/ImageView;", "setMFinishRingBgView", "(Landroid/widget/ImageView;)V", "Landroid/widget/FrameLayout;", "mStartOrPause", "Landroid/widget/FrameLayout;", "getMStartOrPause", "()Landroid/widget/FrameLayout;", "setMStartOrPause", "(Landroid/widget/FrameLayout;)V", "Landroid/animation/AnimatorSet;", "finishStartAnimatorSet", "Landroid/animation/AnimatorSet;", "getFinishStartAnimatorSet", "()Landroid/animation/AnimatorSet;", "setFinishStartAnimatorSet", "(Landroid/animation/AnimatorSet;)V", "curSportState", "sportStatusAnimatorSet", "lastStartTime", "startDelayTime", "finishIcResId", "lockIcResId", "pauseIcResId", "restartIcResId", "finishBgColorResId", MediaMetaData.IS_LOCAL, "Z", "Lxce;", "binding", "Lxce;", "Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteState;", "sportStateCaller", "Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteState;", "getSportStateCaller", "()Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteState;", "setSportStateCaller", "(Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteState;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "SportStatus", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportCommandViewLand extends LinearLayout {
    private final long FINISH_PRESSED_TOTAL_TIME;

    @NotNull
    private final String TAG;

    @NotNull
    private xce binding;
    private int curSportState;
    private float currentValue;
    private int finishBgColorResId;
    private int finishIcResId;

    @Nullable
    private AnimatorSet finishStartAnimatorSet;

    @Nullable
    private ISportStateOnViewCallback iSportStateOnViewListener;
    private boolean isLocal;
    private long lastStartTime;
    private int lockIcResId;

    @Nullable
    private CircularProgressLayout mFinishCircleView;

    @Nullable
    private ImageView mFinishRingBgView;
    private final long mFinishSportAnimatorTime;

    @Nullable
    private ImageView mFinishSportImgView;
    private final long mLockAnimatorTime;

    @Nullable
    private ImageView mOngoingActionImgView;
    private final long mScaleAnimatorTime;

    @Nullable
    private FrameLayout mStartOrPause;
    private int pauseIcResId;
    private int restartIcResId;
    private int sportState;

    @NotNull
    private ISportRemoteState sportStateCaller;

    @Nullable
    private AnimatorSet sportStatusAnimatorSet;
    private final int startDelayTime;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/fitness/sport/view/widget/SportCommandViewLand$SportStatus;", "", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.LOCAL_VARIABLE})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface SportStatus {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int lock = 2;
        public static final int pause = 0;
        public static final int sporting = 1;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/sport/view/widget/SportCommandViewLand$SportStatus$Companion;", "", "<init>", "()V", "pause", "", "sporting", "lock", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int lock = 2;
            public static final int pause = 0;
            public static final int sporting = 1;

            private Companion() {
            }
        }
    }

    public SportCommandViewLand(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TAG = "SportCommandView";
        this.FINISH_PRESSED_TOTAL_TIME = TimeUnit.SECONDS.toMillis(1L);
        this.currentValue = 1.1f;
        this.mFinishSportAnimatorTime = 800L;
        this.mLockAnimatorTime = 400L;
        this.mScaleAnimatorTime = 200L;
        this.sportState = 1;
        this.curSportState = 1;
        this.startDelayTime = 1000;
        this.finishIcResId = eoi.z;
        this.lockIcResId = eoi.f16884k;
        this.pauseIcResId = eoi.B;
        this.restartIcResId = eoi.C;
        this.finishBgColorResId = aki.G;
        ViewDataBinding viewDataBindingJ = sk5.j(LayoutInflater.from(context), dvi.C, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingJ, "inflate(...)");
        this.binding = (xce) viewDataBindingJ;
        this.sportStateCaller = SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE);
        initView();
        setListener();
    }

    private final void animator2Lock() {
        int i;
        int i2;
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        AnimatorSet.Builder builderPlay;
        if (isRTLDirection()) {
            ViewGroup.LayoutParams layoutParams = this.binding.F.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            i = ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams)).rightMargin;
            ViewGroup.LayoutParams layoutParams2 = this.binding.G.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            i2 = ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams2)).leftMargin;
        } else {
            ViewGroup.LayoutParams layoutParams3 = this.binding.F.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            i = ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams3)).leftMargin;
            ViewGroup.LayoutParams layoutParams4 = this.binding.G.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams4, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            i2 = ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams4)).rightMargin;
        }
        int measuredWidth = (((getMeasuredWidth() / 2) - i) - this.binding.F.getWidth()) + (this.binding.F.getWidth() / 2);
        int measuredWidth2 = (((getMeasuredWidth() / 2) - i2) - this.binding.G.getWidth()) + (this.binding.G.getWidth() / 2);
        if (isRTLDirection()) {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.binding.G, EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_X, 0.0f, measuredWidth);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.binding.F, EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_X, 0.0f, -measuredWidth2);
        } else if (getResources().getConfiguration().orientation == 2) {
            ViewGroup.LayoutParams layoutParams5 = this.binding.F.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams5, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            int i3 = ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams5)).bottomMargin;
            ViewGroup.LayoutParams layoutParams6 = this.binding.G.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams6, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            int i4 = ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams6)).topMargin;
            int measuredHeight = (((getMeasuredHeight() / 2) - i3) - this.binding.F.getWidth()) + (this.binding.F.getWidth() / 2);
            int measuredHeight2 = (((getMeasuredHeight() / 2) - i4) - this.binding.G.getWidth()) + (this.binding.G.getWidth() / 2);
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.binding.F, EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_Y, 0.0f, -measuredHeight);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.binding.G, EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_Y, 0.0f, measuredHeight2);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.binding.F, EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_X, 0.0f, measuredWidth);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.binding.G, EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_X, 0.0f, -measuredWidth2);
        }
        AnimatorSet animatorSet = this.sportStatusAnimatorSet;
        if (animatorSet != null) {
            animatorSet.setDuration(this.mLockAnimatorTime);
        }
        AnimatorSet animatorSet2 = this.sportStatusAnimatorSet;
        if (animatorSet2 != null) {
            animatorSet2.setInterpolator(new DecelerateInterpolator());
        }
        AnimatorSet animatorSet3 = this.sportStatusAnimatorSet;
        if (animatorSet3 != null && (builderPlay = animatorSet3.play(objectAnimatorOfFloat)) != null) {
            builderPlay.with(objectAnimatorOfFloat2);
        }
        AnimatorSet animatorSet4 = this.sportStatusAnimatorSet;
        if (animatorSet4 != null) {
            animatorSet4.start();
        }
        this.curSportState = 2;
    }

    private final void animator2Sporting() {
        int i;
        int i2;
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        AnimatorSet.Builder builderPlay;
        if (isRTLDirection()) {
            ViewGroup.LayoutParams layoutParams = this.binding.F.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            i = ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams)).rightMargin;
            ViewGroup.LayoutParams layoutParams2 = this.binding.G.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            i2 = ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams2)).leftMargin;
        } else {
            ViewGroup.LayoutParams layoutParams3 = this.binding.F.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            i = ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams3)).leftMargin;
            ViewGroup.LayoutParams layoutParams4 = this.binding.G.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams4, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            i2 = ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams4)).rightMargin;
        }
        int measuredWidth = (((getMeasuredWidth() / 2) - i) - this.binding.F.getWidth()) + (this.binding.F.getWidth() / 2);
        int measuredWidth2 = (((getMeasuredWidth() / 2) - i2) - this.binding.G.getWidth()) + (this.binding.G.getWidth() / 2);
        if (isRTLDirection()) {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.binding.G, EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_X, measuredWidth, 0.0f);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.binding.F, EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_X, -measuredWidth2, 0.0f);
        } else if (getResources().getConfiguration().orientation == 2) {
            ViewGroup.LayoutParams layoutParams5 = this.binding.F.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams5, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            int i3 = ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams5)).bottomMargin;
            ViewGroup.LayoutParams layoutParams6 = this.binding.G.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams6, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            int i4 = ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams6)).topMargin;
            int measuredHeight = (((getMeasuredHeight() / 2) - i3) - this.binding.F.getWidth()) + (this.binding.F.getWidth() / 2);
            int measuredHeight2 = (((getMeasuredHeight() / 2) - i4) - this.binding.G.getWidth()) + (this.binding.G.getWidth() / 2);
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.binding.F, EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_Y, -measuredHeight, 0.0f);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.binding.G, EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_Y, measuredHeight2, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.binding.F, EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_X, measuredWidth, 0.0f);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.binding.G, EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_X, -measuredWidth2, 0.0f);
        }
        AnimatorSet animatorSet = this.sportStatusAnimatorSet;
        if (animatorSet != null) {
            animatorSet.setDuration(this.mLockAnimatorTime);
        }
        AnimatorSet animatorSet2 = this.sportStatusAnimatorSet;
        if (animatorSet2 != null) {
            animatorSet2.setInterpolator(new DecelerateInterpolator());
        }
        AnimatorSet animatorSet3 = this.sportStatusAnimatorSet;
        if (animatorSet3 != null && (builderPlay = animatorSet3.play(objectAnimatorOfFloat)) != null) {
            builderPlay.with(objectAnimatorOfFloat2);
        }
        AnimatorSet animatorSet4 = this.sportStatusAnimatorSet;
        if (animatorSet4 != null) {
            animatorSet4.start();
        }
        this.curSportState = 1;
    }

    @SuppressLint({"ObjectAnimatorBinding"})
    private final void finishStartAnimator() {
        AnimatorSet.Builder builderPlay;
        ImageView imageView = this.mFinishRingBgView;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        this.finishStartAnimatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.mFinishSportImgView, "scaleX", 1.0f, 0.8f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.mFinishSportImgView, "scaleY", 1.0f, 0.8f);
        AnimatorSet animatorSet = this.finishStartAnimatorSet;
        if (animatorSet != null) {
            animatorSet.setDuration(this.mScaleAnimatorTime);
        }
        AnimatorSet animatorSet2 = this.finishStartAnimatorSet;
        if (animatorSet2 != null) {
            animatorSet2.setInterpolator(new DecelerateInterpolator());
        }
        AnimatorSet animatorSet3 = this.finishStartAnimatorSet;
        if (animatorSet3 != null && (builderPlay = animatorSet3.play(objectAnimatorOfFloat)) != null) {
            builderPlay.with(objectAnimatorOfFloat2);
        }
        AnimatorSet animatorSet4 = this.finishStartAnimatorSet;
        if (animatorSet4 != null) {
            animatorSet4.start();
        }
        if (objectAnimatorOfFloat != null) {
            objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ubn
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SportCommandViewLand.finishStartAnimator$lambda$7(this.f35603a, valueAnimator);
                }
            });
        }
        CircularProgressLayout circularProgressLayout = this.mFinishCircleView;
        if (circularProgressLayout != null) {
            circularProgressLayout.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void finishStartAnimator$lambda$7(SportCommandViewLand this$0, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.currentValue = ((Float) animatedValue).floatValue();
    }

    @SuppressLint({"ObjectAnimatorBinding"})
    private final void finishStopAnimator() {
        AnimatorSet animatorSet = this.finishStartAnimatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.mFinishSportImgView, "scaleX", this.currentValue, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.mFinishSportImgView, "scaleY", this.currentValue, 1.0f);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setInterpolator(new DecelerateInterpolator());
        animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet2.setDuration(this.mScaleAnimatorTime);
        animatorSet2.start();
    }

    private final int getSportState() {
        return this.isLocal ? this.sportStateCaller.getSportState() : SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).getSportState();
    }

    private final void initView() {
        xce xceVar = this.binding;
        this.mOngoingActionImgView = xceVar.I;
        this.mFinishSportImgView = xceVar.E;
        CircularProgressLayout circularProgressLayout = xceVar.C;
        this.mFinishCircleView = circularProgressLayout;
        this.mFinishRingBgView = xceVar.D;
        this.mStartOrPause = xceVar.F;
        if (circularProgressLayout != null) {
            circularProgressLayout.setTotalTime(this.FINISH_PRESSED_TOTAL_TIME);
        }
        this.sportStatusAnimatorSet = new AnimatorSet();
        this.isLocal = this.isLocal;
        CircularProgressLayout circularProgressLayout2 = this.mFinishCircleView;
        if (circularProgressLayout2 != null) {
            circularProgressLayout2.setBackgroundColor(ni4.c(getContext(), this.finishBgColorResId));
        }
        ImageView imageView = this.mFinishSportImgView;
        if (imageView != null) {
            imageView.setImageDrawable(ni4.e(getContext(), this.lockIcResId));
        }
        ImageView imageView2 = this.mOngoingActionImgView;
        if (imageView2 != null) {
            imageView2.setBackgroundResource(this.pauseIcResId);
        }
    }

    private final boolean isRTLDirection() {
        return q8p.a(Locale.getDefault()) == 1;
    }

    @SuppressLint({"ClickableViewAccessibility", "ObjectAnimatorBinding", "WrongConstant"})
    private final void setListener() {
        FrameLayout frameLayout = this.mStartOrPause;
        if (frameLayout != null) {
            frameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: wbn
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return SportCommandViewLand.setListener$lambda$2(this.f37815a, view, motionEvent);
                }
            });
        }
        ImageView imageView = this.mFinishSportImgView;
        Intrinsics.checkNotNull(imageView);
        imageView.setOnTouchListener(new View.OnTouchListener() { // from class: ybn
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return SportCommandViewLand.setListener$lambda$3(this.f40020a, view, motionEvent);
            }
        });
        ImageView imageView2 = this.mFinishSportImgView;
        Intrinsics.checkNotNull(imageView2);
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: acn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportCommandViewLand.setListener$lambda$4(this.f882a, view);
            }
        });
        CircularProgressLayout circularProgressLayout = this.mFinishCircleView;
        if (circularProgressLayout != null) {
            circularProgressLayout.setOnTimerFinishedListener(new CircularProgressLayout.b() { // from class: ccn
                @Override // com.xiaomi.fitness.sport.view.widget.CircularProgressLayout.b
                public final void a(CircularProgressLayout circularProgressLayout2) {
                    SportCommandViewLand.setListener$lambda$6(this.f5190a, circularProgressLayout2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setListener$lambda$2(final SportCommandViewLand this$0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.curSportState == 2 || System.currentTimeMillis() - this$0.lastStartTime < this$0.startDelayTime) {
            return false;
        }
        this$0.lastStartTime = System.currentTimeMillis();
        if (motionEvent.getActionMasked() != 0) {
            return true;
        }
        if (this$0.getSportState() == 2) {
            ISportStateOnViewCallback iSportStateOnViewCallback = this$0.iSportStateOnViewListener;
            if (iSportStateOnViewCallback == null) {
                return true;
            }
            iSportStateOnViewCallback.onViewRestart(new n0d() { // from class: ecn
                @Override // defpackage.n0d
                public final void a() {
                    SportCommandViewLand.setListener$lambda$2$lambda$0(this.f16504a);
                }
            });
            return true;
        }
        ISportStateOnViewCallback iSportStateOnViewCallback2 = this$0.iSportStateOnViewListener;
        if (iSportStateOnViewCallback2 == null) {
            return true;
        }
        iSportStateOnViewCallback2.onViewPaused(new n0d() { // from class: gcn
            @Override // defpackage.n0d
            public final void a() {
                SportCommandViewLand.setListener$lambda$2$lambda$1(this.f18839a);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$2$lambda$0(SportCommandViewLand this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ImageView imageView = this$0.mOngoingActionImgView;
        if (imageView != null) {
            imageView.setBackgroundResource(this$0.pauseIcResId);
        }
        ImageView imageView2 = this$0.mFinishSportImgView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(ni4.e(this$0.getContext(), this$0.lockIcResId));
        }
        this$0.curSportState = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$2$lambda$1(SportCommandViewLand this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ImageView imageView = this$0.mOngoingActionImgView;
        if (imageView != null) {
            imageView.setBackgroundResource(this$0.restartIcResId);
        }
        ImageView imageView2 = this$0.mFinishSportImgView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(ni4.e(this$0.getContext(), this$0.finishIcResId));
        }
        this$0.curSportState = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setListener$lambda$3(SportCommandViewLand this$0, View view, MotionEvent event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(event, "event");
        if (this$0.curSportState == 1) {
            return false;
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this$0.finishStartAnimator();
        } else if (actionMasked == 1 || actionMasked == 3) {
            AnimatorSet animatorSet = this$0.finishStartAnimatorSet;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            ImageView imageView = this$0.mFinishRingBgView;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            CircularProgressLayout circularProgressLayout = this$0.mFinishCircleView;
            Intrinsics.checkNotNull(circularProgressLayout);
            if (circularProgressLayout.a()) {
                CircularProgressLayout circularProgressLayout2 = this$0.mFinishCircleView;
                if (circularProgressLayout2 != null) {
                    circularProgressLayout2.c();
                }
                this$0.finishStopAnimator();
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$4(SportCommandViewLand this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = this$0.curSportState;
        if (i == 1) {
            this$0.animator2Lock();
        } else {
            if (i != 2) {
                return;
            }
            this$0.animator2Sporting();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$6(SportCommandViewLand this$0, CircularProgressLayout circularProgressLayout) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AnimatorSet animatorSet = this$0.finishStartAnimatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ImageView imageView = this$0.mFinishRingBgView;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        CircularProgressLayout circularProgressLayout2 = this$0.mFinishCircleView;
        Intrinsics.checkNotNull(circularProgressLayout2);
        if (circularProgressLayout2.a()) {
            CircularProgressLayout circularProgressLayout3 = this$0.mFinishCircleView;
            if (circularProgressLayout3 != null) {
                circularProgressLayout3.c();
            }
            this$0.finishStopAnimator();
        }
        Object systemService = this$0.getContext().getSystemService("vibrator");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        ((Vibrator) systemService).vibrate(100L);
        if (this$0.curSportState != 0) {
            this$0.animator2Sporting();
            return;
        }
        ISportStateOnViewCallback iSportStateOnViewCallback = this$0.iSportStateOnViewListener;
        if (iSportStateOnViewCallback != null) {
            iSportStateOnViewCallback.onViewFinish(new n0d() { // from class: sbn
                @Override // defpackage.n0d
                public final void a() {
                    SportCommandViewLand.setListener$lambda$6$lambda$5();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$6$lambda$5() {
    }

    public final float getCurrentValue() {
        return this.currentValue;
    }

    @Nullable
    public final AnimatorSet getFinishStartAnimatorSet() {
        return this.finishStartAnimatorSet;
    }

    @Nullable
    public final CircularProgressLayout getMFinishCircleView() {
        return this.mFinishCircleView;
    }

    @Nullable
    public final ImageView getMFinishRingBgView() {
        return this.mFinishRingBgView;
    }

    @Nullable
    public final FrameLayout getMStartOrPause() {
        return this.mStartOrPause;
    }

    @NotNull
    public final ISportRemoteState getSportStateCaller() {
        return this.sportStateCaller;
    }

    public final void onDestroy() {
        AnimatorSet animatorSet = this.finishStartAnimatorSet;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
    }

    public final void setCurrentValue(float f) {
        this.currentValue = f;
    }

    public final void setFinishStartAnimatorSet(@Nullable AnimatorSet animatorSet) {
        this.finishStartAnimatorSet = animatorSet;
    }

    public final void setMFinishCircleView(@Nullable CircularProgressLayout circularProgressLayout) {
        this.mFinishCircleView = circularProgressLayout;
    }

    public final void setMFinishRingBgView(@Nullable ImageView imageView) {
        this.mFinishRingBgView = imageView;
    }

    public final void setMStartOrPause(@Nullable FrameLayout frameLayout) {
        this.mStartOrPause = frameLayout;
    }

    public final void setOnSportStateOnViewListener(@NotNull ISportStateOnViewCallback iSportStateOnViewListener) {
        Intrinsics.checkNotNullParameter(iSportStateOnViewListener, "iSportStateOnViewListener");
        this.iSportStateOnViewListener = iSportStateOnViewListener;
    }

    public final void setSportState(int sportState) {
        int i;
        ImageView imageView;
        this.sportState = sportState;
        if (sportState == 1) {
            i = this.pauseIcResId;
        } else if (sportState == 2) {
            i = this.restartIcResId;
            ImageView imageView2 = this.mFinishSportImgView;
            if (imageView2 != null) {
                imageView2.setImageDrawable(ni4.e(getContext(), this.finishIcResId));
            }
            this.curSportState = 0;
        } else if (sportState != 3) {
            i = -1;
        } else {
            i = this.pauseIcResId;
            ImageView imageView3 = this.mFinishSportImgView;
            if (imageView3 != null) {
                imageView3.setImageDrawable(ni4.e(getContext(), this.lockIcResId));
            }
            this.curSportState = 1;
        }
        if (i == -1 || (imageView = this.mOngoingActionImgView) == null) {
            return;
        }
        imageView.setBackgroundResource(i);
    }

    public final void setSportStateCaller(@NotNull ISportRemoteState iSportRemoteState) {
        Intrinsics.checkNotNullParameter(iSportRemoteState, "<set-?>");
        this.sportStateCaller = iSportRemoteState;
    }
}
