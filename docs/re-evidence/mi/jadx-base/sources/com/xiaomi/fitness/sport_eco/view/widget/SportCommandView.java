package com.xiaomi.fitness.sport_eco.view.widget;

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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.miui.circulate.api.protocol.audio.support.MediaMetaData;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.SystemProperties;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.common.utils.ViewUtil;
import com.xiaomi.fitness.share.report.holder.EditCustomTabLayoutHolder;
import com.xiaomi.fitness.sport_eco.interfaces.ISportStateOnViewCallback;
import com.xiaomi.fitness.sport_eco.view.widget.CircularProgressLayout;
import com.xiaomi.fitness.sport_eco.view.widget.SportCommandView;
import com.xiaomi.fitness.sport_eco.viewmodel.BaseSportVM;
import com.xiaomi.fitness.sport_eco_manager_export.di.SportEcoManagerExtKt;
import com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState;
import com.xiaomi.onetrack.b.e;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import defpackage.cki;
import defpackage.clb;
import defpackage.e1j;
import defpackage.foi;
import defpackage.fvi;
import defpackage.m0d;
import defpackage.ni4;
import defpackage.nuf;
import defpackage.q8p;
import defpackage.zri;
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
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001:\u0001lB\u001d\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020E2\u0006\u0010V\u001a\u00020\u00192\u0006\u0010W\u001a\u00020\u00192\u0006\u0010X\u001a\u00020\u00192\u0006\u0010Y\u001a\u00020\u0019H\u0014J\u000e\u0010Z\u001a\u00020T2\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010[\u001a\u00020TH\u0003J\u0012\u0010\\\u001a\u00020T2\b\u0010]\u001a\u0004\u0018\u00010^H\u0002J\b\u0010_\u001a\u00020TH\u0002J\b\u0010`\u001a\u00020TH\u0002J\b\u0010a\u001a\u00020TH\u0002J\u0006\u0010b\u001a\u00020TJ\u000e\u0010c\u001a\u00020T2\u0006\u0010\u001c\u001a\u00020\u0019J\b\u0010d\u001a\u00020TH\u0002J\b\u0010e\u001a\u00020TH\u0002J\u001a\u0010f\u001a\u00020T2\u0006\u0010g\u001a\u00020^2\b\u0010h\u001a\u0004\u0018\u00010\u001eH\u0003J\u0012\u0010i\u001a\u00020T2\b\u0010g\u001a\u0004\u0018\u00010^H\u0003J\b\u0010j\u001a\u00020EH\u0002J\b\u0010k\u001a\u00020\u0019H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010.\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R\u001c\u00101\u001a\u0004\u0018\u000102X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u000e\u00107\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u0010\u00108\u001a\u0004\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0019X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010A\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010B\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010C\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020EX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020EX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010H\u001a\u00020\u00192\u0006\u0010G\u001a\u00020\u00198B@BX\u0082\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001a\u0010M\u001a\u00020NX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010R¨\u0006m"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/widget/SportCommandView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "TAG", "", "FINISH_PRESSED_TOTAL_TIME", "", "mOngoingActionImgView", "Landroid/widget/ImageView;", "mFinishSportImgView", "currentValue", "", "getCurrentValue", "()F", "setCurrentValue", "(F)V", "mFinishSportAnimatorTime", "mLockAnimatorTime", "mScaleAnimatorTime", "expandMargin", "", "iSportStateOnViewListener", "Lcom/xiaomi/fitness/sport_eco/interfaces/ISportStateOnViewCallback;", "sportState", "mFinishCircleView", "Lcom/xiaomi/fitness/sport_eco/view/widget/CircularProgressLayout;", "getMFinishCircleView", "()Lcom/xiaomi/fitness/sport_eco/view/widget/CircularProgressLayout;", "setMFinishCircleView", "(Lcom/xiaomi/fitness/sport_eco/view/widget/CircularProgressLayout;)V", "mFinishRingBgView", "getMFinishRingBgView", "()Landroid/widget/ImageView;", "setMFinishRingBgView", "(Landroid/widget/ImageView;)V", "mStartOrPause", "Landroid/widget/FrameLayout;", "getMStartOrPause", "()Landroid/widget/FrameLayout;", "setMStartOrPause", "(Landroid/widget/FrameLayout;)V", "frameLayoutRight", "getFrameLayoutRight", "setFrameLayoutRight", "finishStartAnimatorSet", "Landroid/animation/AnimatorSet;", "getFinishStartAnimatorSet", "()Landroid/animation/AnimatorSet;", "setFinishStartAnimatorSet", "(Landroid/animation/AnimatorSet;)V", "ARG_PARAM1", "sportStatusAnimatorSet", "lastStartTime", "startDelayTime", "sportLockView", "finishIcResId", "lockIcResId", "pauseIcResId", "restartIcResId", "finishBgColorResId", "lockCircleView", "centerLock", "centerLockImg", MediaMetaData.IS_LOCAL, "", "isSwitchScreen", "value", "curSportState", "getCurSportState", "()I", "setCurSportState", "(I)V", "sportStateCaller", "Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteState;", "getSportStateCaller", "()Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteState;", "setSportStateCaller", "(Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteState;)V", "onLayout", "", "changed", e.f13808a, DeviceTagInterface.CUSTOM_TAG_TYPE, "r", PluginDeviceInfo.FDESC, "setOnSportStateOnViewListener", "setListener", "clickLock", "it", "Landroid/view/View;", "changeState", "pauseDown", "initView", LifecycleConstantKt.ON_DESTROY, "setSportState", "animator2Lock", "animator2Sporting", "finishStartAnimator", "view", "circularProgressLayout", "finishStopAnimator", "isRTLDirection", "getSportState", "SportStatus", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportCommandView extends Hilt_SportCommandView {

    @NotNull
    private final String ARG_PARAM1;
    private final long FINISH_PRESSED_TOTAL_TIME;

    @NotNull
    private final String TAG;

    @Nullable
    private FrameLayout centerLock;

    @Nullable
    private ImageView centerLockImg;
    private int curSportState;
    private float currentValue;
    private final int expandMargin;
    private int finishBgColorResId;
    private int finishIcResId;

    @Nullable
    private AnimatorSet finishStartAnimatorSet;

    @Nullable
    private FrameLayout frameLayoutRight;

    @Nullable
    private ISportStateOnViewCallback iSportStateOnViewListener;
    private boolean isLocal;
    private boolean isSwitchScreen;
    private long lastStartTime;

    @Nullable
    private CircularProgressLayout lockCircleView;
    private int lockIcResId;

    @Nullable
    private CircularProgressLayout mFinishCircleView;

    @Nullable
    private ImageView mFinishRingBgView;
    private final long mFinishSportAnimatorTime;

    @Nullable
    private ImageView mFinishSportImgView;
    private long mLockAnimatorTime;

    @Nullable
    private ImageView mOngoingActionImgView;
    private final long mScaleAnimatorTime;

    @Nullable
    private FrameLayout mStartOrPause;
    private int pauseIcResId;
    private int restartIcResId;

    @Nullable
    private ImageView sportLockView;
    private int sportState;

    @NotNull
    private IEcoSportRemoteState sportStateCaller;

    @Nullable
    private AnimatorSet sportStatusAnimatorSet;
    private final int startDelayTime;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/widget/SportCommandView$SportStatus;", "", "Companion", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/widget/SportCommandView$SportStatus$Companion;", "", "<init>", "()V", "pause", "", "sporting", "lock", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int lock = 2;
            public static final int pause = 0;
            public static final int sporting = 1;

            private Companion() {
            }
        }
    }

    public SportCommandView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TAG = "SportCommandView_Eco";
        this.FINISH_PRESSED_TOTAL_TIME = TimeUnit.SECONDS.toMillis(1L);
        this.currentValue = 1.1f;
        this.mFinishSportAnimatorTime = 800L;
        this.mLockAnimatorTime = 400L;
        this.mScaleAnimatorTime = 200L;
        this.expandMargin = ExtUtilsKt.getDp(200);
        this.sportState = 1;
        this.ARG_PARAM1 = "param1";
        this.startDelayTime = 1000;
        int i = foi.v;
        this.finishIcResId = i;
        this.lockIcResId = i;
        this.pauseIcResId = foi.w;
        this.restartIcResId = foi.x;
        this.finishBgColorResId = cki.f5432r;
        this.curSportState = BaseSportVM.INSTANCE.getCurState();
        this.sportStateCaller = SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE);
        if (getResources().getConfiguration().orientation == 1 || SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndExpand()) {
            LayoutInflater.from(context).inflate(fvi.Z, this);
        } else if (getResources().getConfiguration().orientation == 2) {
            LayoutInflater.from(context).inflate(fvi.a0, this);
        }
        initView();
        setListener();
        this.isSwitchScreen = true;
    }

    private final void animator2Lock() {
        int i;
        int i2;
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        AnimatorSet.Builder builderPlay;
        ImageView imageView = this.sportLockView;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        FitnessLogUtils.i(this.TAG, "animator2Lock");
        if (isRTLDirection()) {
            FrameLayout frameLayout = this.mStartOrPause;
            ViewGroup.LayoutParams layoutParams = frameLayout != null ? frameLayout.getLayoutParams() : null;
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            i = ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams)).rightMargin;
            FrameLayout frameLayout2 = this.frameLayoutRight;
            ViewGroup.LayoutParams layoutParams2 = frameLayout2 != null ? frameLayout2.getLayoutParams() : null;
            Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            i2 = ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams2)).leftMargin;
        } else {
            FrameLayout frameLayout3 = this.mStartOrPause;
            ViewGroup.LayoutParams layoutParams3 = frameLayout3 != null ? frameLayout3.getLayoutParams() : null;
            Intrinsics.checkNotNull(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            i = ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams3)).leftMargin;
            FrameLayout frameLayout4 = this.frameLayoutRight;
            ViewGroup.LayoutParams layoutParams4 = frameLayout4 != null ? frameLayout4.getLayoutParams() : null;
            Intrinsics.checkNotNull(layoutParams4, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            i2 = ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams4)).rightMargin;
        }
        if (SystemProperties.INSTANCE.isFoldDisplay() && !SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndFolded()) {
            int i3 = this.expandMargin;
            i += i3;
            i2 += i3;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - i;
        FrameLayout frameLayout5 = this.mStartOrPause;
        Integer numValueOf = frameLayout5 != null ? Integer.valueOf(frameLayout5.getWidth()) : null;
        Intrinsics.checkNotNull(numValueOf);
        int iIntValue = measuredWidth - numValueOf.intValue();
        FrameLayout frameLayout6 = this.mStartOrPause;
        Integer numValueOf2 = frameLayout6 != null ? Integer.valueOf(frameLayout6.getWidth()) : null;
        Intrinsics.checkNotNull(numValueOf2);
        int iIntValue2 = iIntValue + (numValueOf2.intValue() / 2);
        int measuredWidth2 = (getMeasuredWidth() / 2) - i2;
        FrameLayout frameLayout7 = this.frameLayoutRight;
        Integer numValueOf3 = frameLayout7 != null ? Integer.valueOf(frameLayout7.getWidth()) : null;
        Intrinsics.checkNotNull(numValueOf3);
        int iIntValue3 = measuredWidth2 - numValueOf3.intValue();
        FrameLayout frameLayout8 = this.frameLayoutRight;
        Integer numValueOf4 = frameLayout8 != null ? Integer.valueOf(frameLayout8.getWidth()) : null;
        Intrinsics.checkNotNull(numValueOf4);
        int iIntValue4 = iIntValue3 + (numValueOf4.intValue() / 2);
        if (isRTLDirection()) {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.frameLayoutRight, EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_X, 0.0f, iIntValue2);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.mStartOrPause, EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_X, 0.0f, -iIntValue4);
        } else if (SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndExpand() || getResources().getConfiguration().orientation == 1) {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.mStartOrPause, EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_X, 0.0f, -iIntValue2);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.frameLayoutRight, EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_X, 0.0f, iIntValue4);
        } else {
            FrameLayout frameLayout9 = this.mStartOrPause;
            ViewGroup.LayoutParams layoutParams5 = frameLayout9 != null ? frameLayout9.getLayoutParams() : null;
            Intrinsics.checkNotNull(layoutParams5, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            int i4 = ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams5)).bottomMargin;
            FrameLayout frameLayout10 = this.frameLayoutRight;
            ViewGroup.LayoutParams layoutParams6 = frameLayout10 != null ? frameLayout10.getLayoutParams() : null;
            Intrinsics.checkNotNull(layoutParams6, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            int i5 = ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams6)).topMargin;
            int measuredHeight = (getMeasuredHeight() / 2) - i4;
            FrameLayout frameLayout11 = this.mStartOrPause;
            Integer numValueOf5 = frameLayout11 != null ? Integer.valueOf(frameLayout11.getWidth()) : null;
            Intrinsics.checkNotNull(numValueOf5);
            int iIntValue5 = measuredHeight - numValueOf5.intValue();
            FrameLayout frameLayout12 = this.mStartOrPause;
            Integer numValueOf6 = frameLayout12 != null ? Integer.valueOf(frameLayout12.getWidth()) : null;
            Intrinsics.checkNotNull(numValueOf6);
            int iIntValue6 = iIntValue5 + (numValueOf6.intValue() / 2);
            int measuredHeight2 = (getMeasuredHeight() / 2) - i5;
            FrameLayout frameLayout13 = this.frameLayoutRight;
            Integer numValueOf7 = frameLayout13 != null ? Integer.valueOf(frameLayout13.getWidth()) : null;
            Intrinsics.checkNotNull(numValueOf7);
            int iIntValue7 = measuredHeight2 - numValueOf7.intValue();
            FrameLayout frameLayout14 = this.frameLayoutRight;
            Integer numValueOf8 = frameLayout14 != null ? Integer.valueOf(frameLayout14.getWidth()) : null;
            Intrinsics.checkNotNull(numValueOf8);
            int iIntValue8 = iIntValue7 + (numValueOf8.intValue() / 2);
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.frameLayoutRight, EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_Y, 0.0f, -iIntValue6);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.mStartOrPause, EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_Y, 0.0f, iIntValue8);
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
        setCurSportState(0);
    }

    private final void animator2Sporting() {
        int i;
        int i2;
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        AnimatorSet.Builder builderPlay;
        ImageView imageView = this.sportLockView;
        if (imageView != null) {
            imageView.postDelayed(new Runnable() { // from class: zan
                @Override // java.lang.Runnable
                public final void run() {
                    SportCommandView.animator2Sporting$lambda$12(this.f41082a);
                }
            }, this.mLockAnimatorTime);
        }
        FitnessLogUtils.i(this.TAG, "animator2Sporting");
        if (isRTLDirection()) {
            FrameLayout frameLayout = this.mStartOrPause;
            ViewGroup.LayoutParams layoutParams = frameLayout != null ? frameLayout.getLayoutParams() : null;
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            i = ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams)).rightMargin;
            FrameLayout frameLayout2 = this.frameLayoutRight;
            ViewGroup.LayoutParams layoutParams2 = frameLayout2 != null ? frameLayout2.getLayoutParams() : null;
            Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            i2 = ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams2)).leftMargin;
        } else {
            FrameLayout frameLayout3 = this.mStartOrPause;
            ViewGroup.LayoutParams layoutParams3 = frameLayout3 != null ? frameLayout3.getLayoutParams() : null;
            Intrinsics.checkNotNull(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            i = ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams3)).leftMargin;
            FrameLayout frameLayout4 = this.frameLayoutRight;
            ViewGroup.LayoutParams layoutParams4 = frameLayout4 != null ? frameLayout4.getLayoutParams() : null;
            Intrinsics.checkNotNull(layoutParams4, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            i2 = ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams4)).rightMargin;
        }
        SettingsPropertiesUtil settingsPropertiesUtil = SettingsPropertiesUtil.INSTANCE;
        if (!settingsPropertiesUtil.isFoldDisplayAndFolded()) {
            int i3 = this.expandMargin;
            i += i3;
            i2 += i3;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - i;
        FrameLayout frameLayout5 = this.mStartOrPause;
        Integer numValueOf = frameLayout5 != null ? Integer.valueOf(frameLayout5.getWidth()) : null;
        Intrinsics.checkNotNull(numValueOf);
        int iIntValue = measuredWidth - numValueOf.intValue();
        FrameLayout frameLayout6 = this.mStartOrPause;
        Integer numValueOf2 = frameLayout6 != null ? Integer.valueOf(frameLayout6.getWidth()) : null;
        Intrinsics.checkNotNull(numValueOf2);
        int iIntValue2 = iIntValue + (numValueOf2.intValue() / 2);
        int measuredWidth2 = (getMeasuredWidth() / 2) - i2;
        FrameLayout frameLayout7 = this.frameLayoutRight;
        Integer numValueOf3 = frameLayout7 != null ? Integer.valueOf(frameLayout7.getWidth()) : null;
        Intrinsics.checkNotNull(numValueOf3);
        int iIntValue3 = measuredWidth2 - numValueOf3.intValue();
        FrameLayout frameLayout8 = this.frameLayoutRight;
        Integer numValueOf4 = frameLayout8 != null ? Integer.valueOf(frameLayout8.getWidth()) : null;
        Intrinsics.checkNotNull(numValueOf4);
        int iIntValue4 = iIntValue3 + (numValueOf4.intValue() / 2);
        if (isRTLDirection() || settingsPropertiesUtil.isFoldDisplayAndExpand() || getResources().getConfiguration().orientation == 1) {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.frameLayoutRight, EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_X, iIntValue2, 0.0f);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.mStartOrPause, EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_X, -iIntValue4, 0.0f);
        } else {
            FrameLayout frameLayout9 = this.mStartOrPause;
            ViewGroup.LayoutParams layoutParams5 = frameLayout9 != null ? frameLayout9.getLayoutParams() : null;
            Intrinsics.checkNotNull(layoutParams5, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            int i4 = ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams5)).bottomMargin;
            FrameLayout frameLayout10 = this.frameLayoutRight;
            ViewGroup.LayoutParams layoutParams6 = frameLayout10 != null ? frameLayout10.getLayoutParams() : null;
            Intrinsics.checkNotNull(layoutParams6, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            int i5 = ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams6)).topMargin;
            int measuredHeight = (getMeasuredHeight() / 2) - i4;
            FrameLayout frameLayout11 = this.mStartOrPause;
            Integer numValueOf5 = frameLayout11 != null ? Integer.valueOf(frameLayout11.getWidth()) : null;
            Intrinsics.checkNotNull(numValueOf5);
            int iIntValue5 = measuredHeight - numValueOf5.intValue();
            FrameLayout frameLayout12 = this.mStartOrPause;
            Integer numValueOf6 = frameLayout12 != null ? Integer.valueOf(frameLayout12.getWidth()) : null;
            Intrinsics.checkNotNull(numValueOf6);
            int iIntValue6 = iIntValue5 + (numValueOf6.intValue() / 2);
            int measuredHeight2 = (getMeasuredHeight() / 2) - i5;
            FrameLayout frameLayout13 = this.frameLayoutRight;
            Integer numValueOf7 = frameLayout13 != null ? Integer.valueOf(frameLayout13.getWidth()) : null;
            Intrinsics.checkNotNull(numValueOf7);
            int iIntValue7 = measuredHeight2 - numValueOf7.intValue();
            FrameLayout frameLayout14 = this.frameLayoutRight;
            Integer numValueOf8 = frameLayout14 != null ? Integer.valueOf(frameLayout14.getWidth()) : null;
            Intrinsics.checkNotNull(numValueOf8);
            int iIntValue8 = iIntValue7 + (numValueOf8.intValue() / 2);
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.frameLayoutRight, EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_Y, -iIntValue6, 0.0f);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.mStartOrPause, EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_Y, iIntValue8, 0.0f);
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
        if (getCurSportState() != 2) {
            setCurSportState(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animator2Sporting$lambda$12(SportCommandView this$0) {
        ImageView imageView;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getCurSportState() == 2 || this$0.getCurSportState() == 0 || (imageView = this$0.sportLockView) == null) {
            return;
        }
        imageView.setVisibility(0);
    }

    private final void changeState() {
        clb.a(getContext());
        FitnessLogUtils.i(this.TAG, "changeState");
        int curSportState = getCurSportState();
        if (curSportState == 0) {
            animator2Lock();
        } else {
            if (curSportState != 1) {
                return;
            }
            animator2Sporting();
        }
    }

    private final void clickLock(View it) {
        if (it != null) {
            it.setVisibility(8);
        }
        setCurSportState(2);
        ImageView imageView = this.mOngoingActionImgView;
        if (imageView != null) {
            imageView.setContentDescription(ResourceExtKt.getString(e1j.J4));
        }
        FrameLayout frameLayout = this.centerLock;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }

    @SuppressLint({"ObjectAnimatorBinding"})
    private final void finishStartAnimator(View view, CircularProgressLayout circularProgressLayout) {
        AnimatorSet.Builder builderPlay;
        ImageView imageView = this.mFinishRingBgView;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        this.finishStartAnimatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 0.8f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 0.8f);
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
            objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xan
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SportCommandView.finishStartAnimator$lambda$13(this.f38919a, valueAnimator);
                }
            });
        }
        if (circularProgressLayout != null) {
            circularProgressLayout.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void finishStartAnimator$lambda$13(SportCommandView this$0, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.currentValue = ((Float) animatedValue).floatValue();
    }

    @SuppressLint({"ObjectAnimatorBinding"})
    private final void finishStopAnimator(View view) {
        AnimatorSet animatorSet = this.finishStartAnimatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", this.currentValue, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleY", this.currentValue, 1.0f);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setInterpolator(new DecelerateInterpolator());
        animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet2.setDuration(this.mScaleAnimatorTime);
        animatorSet2.start();
    }

    private final int getCurSportState() {
        int curState = BaseSportVM.INSTANCE.getCurState();
        this.curSportState = curState;
        return curState;
    }

    private final int getSportState() {
        int sportState = this.sportStateCaller.getSportState();
        if (sportState == 0 || sportState == 4) {
            return 1;
        }
        return sportState;
    }

    private final void initView() {
        this.mOngoingActionImgView = (ImageView) findViewById(zri.i2);
        this.mFinishSportImgView = (ImageView) findViewById(zri.X);
        this.mFinishCircleView = (CircularProgressLayout) findViewById(zri.V);
        this.mFinishRingBgView = (ImageView) findViewById(zri.W);
        this.mStartOrPause = (FrameLayout) findViewById(zri.c0);
        this.frameLayoutRight = (FrameLayout) findViewById(zri.d0);
        this.sportLockView = (ImageView) findViewById(zri.v2);
        this.lockCircleView = (CircularProgressLayout) findViewById(zri.c1);
        this.centerLock = (FrameLayout) findViewById(zri.u);
        this.centerLockImg = (ImageView) findViewById(zri.v);
        CircularProgressLayout circularProgressLayout = this.mFinishCircleView;
        if (circularProgressLayout != null) {
            circularProgressLayout.setTotalTime(this.FINISH_PRESSED_TOTAL_TIME);
        }
        CircularProgressLayout circularProgressLayout2 = this.lockCircleView;
        if (circularProgressLayout2 != null) {
            circularProgressLayout2.setTotalTime(this.FINISH_PRESSED_TOTAL_TIME);
        }
        this.sportStatusAnimatorSet = new AnimatorSet();
        final int sportState = getSportState();
        FitnessLogUtils.i(this.TAG, "sportState = " + sportState);
        post(new Runnable() { // from class: van
            @Override // java.lang.Runnable
            public final void run() {
                SportCommandView.initView$lambda$11(this.f36672a, sportState);
            }
        });
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.finishBgColorResId = UIUtils.isNightMode(context) ? cki.f5429a : cki.f5432r;
        CircularProgressLayout circularProgressLayout3 = this.mFinishCircleView;
        if (circularProgressLayout3 != null) {
            circularProgressLayout3.setBackgroundColor(ni4.c(getContext(), this.finishBgColorResId));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x0057  */
    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0068  */
    /* JADX WARN: Code duplicated, block: B:29:0x0070  */
    /* JADX WARN: Code duplicated, block: B:32:0x007d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    /* JADX WARN: Code duplicated, block: B:37:0x0099  */
    public static final void initView$lambda$11(SportCommandView this$0, int i) {
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        ImageView imageView5;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.mLockAnimatorTime = 0L;
        if (i == 1) {
            imageView = this$0.sportLockView;
            if (imageView != null) {
                imageView.setContentDescription(ResourceExtKt.getString(e1j.q2));
            }
            imageView2 = this$0.sportLockView;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            imageView3 = this$0.mOngoingActionImgView;
            if (imageView3 != null) {
                imageView3.setContentDescription(ResourceExtKt.getString(e1j.z2));
            }
            imageView4 = this$0.mOngoingActionImgView;
            if (imageView4 != null) {
                imageView4.setImageDrawable(ni4.e(this$0.getContext(), this$0.pauseIcResId));
            }
            this$0.animator2Sporting();
            if (BaseSportVM.INSTANCE.getCurState() == 2) {
                imageView5 = this$0.sportLockView;
                if (imageView5 != null) {
                    imageView5.setVisibility(8);
                }
                this$0.clickLock(this$0.sportLockView);
            }
        } else if (i == 2) {
            FrameLayout frameLayout = this$0.centerLock;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            ImageView imageView6 = this$0.mOngoingActionImgView;
            if (imageView6 != null) {
                imageView6.setContentDescription(ResourceExtKt.getString(e1j.S2));
            }
            ImageView imageView7 = this$0.mOngoingActionImgView;
            if (imageView7 != null) {
                imageView7.setImageDrawable(ni4.e(this$0.getContext(), this$0.restartIcResId));
            }
            ImageView imageView8 = this$0.mFinishSportImgView;
            if (imageView8 != null) {
                imageView8.setImageDrawable(ni4.e(this$0.getContext(), this$0.finishIcResId));
            }
            FitnessLogUtils.i(this$0.TAG, "initView");
            this$0.animator2Lock();
        } else if (i == 3) {
            imageView = this$0.sportLockView;
            if (imageView != null) {
                imageView.setContentDescription(ResourceExtKt.getString(e1j.q2));
            }
            imageView2 = this$0.sportLockView;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            imageView3 = this$0.mOngoingActionImgView;
            if (imageView3 != null) {
                imageView3.setContentDescription(ResourceExtKt.getString(e1j.z2));
            }
            imageView4 = this$0.mOngoingActionImgView;
            if (imageView4 != null) {
                imageView4.setImageDrawable(ni4.e(this$0.getContext(), this$0.pauseIcResId));
            }
            this$0.animator2Sporting();
            if (BaseSportVM.INSTANCE.getCurState() == 2) {
                imageView5 = this$0.sportLockView;
                if (imageView5 != null) {
                    imageView5.setVisibility(8);
                }
                this$0.clickLock(this$0.sportLockView);
            }
        }
        this$0.mLockAnimatorTime = 400L;
    }

    private final boolean isRTLDirection() {
        return q8p.a(Locale.getDefault()) == 1;
    }

    private final void pauseDown() {
        if (ViewUtil.INSTANCE.isFastClick()) {
            return;
        }
        clb.a(getContext());
        FitnessLogUtils.i(this.TAG, "pauseDown");
        if (getSportState() == 2) {
            ISportStateOnViewCallback iSportStateOnViewCallback = this.iSportStateOnViewListener;
            if (iSportStateOnViewCallback != null) {
                iSportStateOnViewCallback.onViewRestart(new m0d() { // from class: bbn
                    @Override // defpackage.m0d
                    public final void a() {
                        SportCommandView.pauseDown$lambda$9(this.f4028a);
                    }
                });
                return;
            }
            return;
        }
        ImageView imageView = this.sportLockView;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ISportStateOnViewCallback iSportStateOnViewCallback2 = this.iSportStateOnViewListener;
        if (iSportStateOnViewCallback2 != null) {
            iSportStateOnViewCallback2.onViewPaused(new m0d() { // from class: dbn
                @Override // defpackage.m0d
                public final void a() {
                    SportCommandView.pauseDown$lambda$10(this.f15347a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pauseDown$lambda$10(SportCommandView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ImageView imageView = this$0.mOngoingActionImgView;
        if (imageView != null) {
            imageView.setContentDescription(ResourceExtKt.getString(e1j.q2));
        }
        ImageView imageView2 = this$0.mOngoingActionImgView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(ni4.e(this$0.getContext(), this$0.restartIcResId));
        }
        ImageView imageView3 = this$0.mFinishSportImgView;
        if (imageView3 != null) {
            imageView3.setContentDescription(ResourceExtKt.getString(e1j.v4));
        }
        ImageView imageView4 = this$0.mFinishSportImgView;
        if (imageView4 != null) {
            imageView4.setImageDrawable(ni4.e(this$0.getContext(), this$0.finishIcResId));
        }
        this$0.setCurSportState(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pauseDown$lambda$9(SportCommandView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ImageView imageView = this$0.mOngoingActionImgView;
        if (imageView != null) {
            imageView.setContentDescription(ResourceExtKt.getString(e1j.z2));
        }
        ImageView imageView2 = this$0.mOngoingActionImgView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(ni4.e(this$0.getContext(), this$0.pauseIcResId));
        }
        ImageView imageView3 = this$0.mFinishSportImgView;
        if (imageView3 != null) {
            imageView3.setContentDescription(ResourceExtKt.getString(e1j.J4));
        }
        ImageView imageView4 = this$0.mFinishSportImgView;
        if (imageView4 != null) {
            imageView4.setImageDrawable(ni4.e(this$0.getContext(), this$0.lockIcResId));
        }
        this$0.setCurSportState(1);
    }

    private final void setCurSportState(int i) {
        BaseSportVM.INSTANCE.setCurState(i);
        this.curSportState = i;
    }

    @SuppressLint({"ClickableViewAccessibility", "ObjectAnimatorBinding", "WrongConstant"})
    private final void setListener() {
        FrameLayout frameLayout = this.mStartOrPause;
        Intrinsics.checkNotNull(frameLayout);
        nuf.f(frameLayout);
        FrameLayout frameLayout2 = this.mStartOrPause;
        if (frameLayout2 != null) {
            frameLayout2.setOnTouchListener(new View.OnTouchListener() { // from class: fbn
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return SportCommandView.setListener$lambda$0(this.f17631a, view, motionEvent);
                }
            });
        }
        ImageView imageView = this.sportLockView;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: hbn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SportCommandView.setListener$lambda$1(this.f19914a, view);
                }
            });
        }
        ImageView imageView2 = this.mFinishSportImgView;
        Intrinsics.checkNotNull(imageView2);
        imageView2.setOnTouchListener(new View.OnTouchListener() { // from class: jbn
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return SportCommandView.setListener$lambda$3(this.f22627a, view, motionEvent);
            }
        });
        FrameLayout frameLayout3 = this.centerLock;
        if (frameLayout3 != null) {
            frameLayout3.setOnTouchListener(new View.OnTouchListener() { // from class: lbn
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return SportCommandView.setListener$lambda$5(this.f24873a, view, motionEvent);
                }
            });
        }
        CircularProgressLayout circularProgressLayout = this.mFinishCircleView;
        if (circularProgressLayout != null) {
            circularProgressLayout.setOnTimerFinishedListener(new CircularProgressLayout.b() { // from class: nbn
                @Override // com.xiaomi.fitness.sport_eco.view.widget.CircularProgressLayout.b
                public final void a(CircularProgressLayout circularProgressLayout2) {
                    SportCommandView.setListener$lambda$7(this.f27757a, circularProgressLayout2);
                }
            });
        }
        CircularProgressLayout circularProgressLayout2 = this.lockCircleView;
        if (circularProgressLayout2 != null) {
            circularProgressLayout2.setOnTimerFinishedListener(new CircularProgressLayout.b() { // from class: tan
                @Override // com.xiaomi.fitness.sport_eco.view.widget.CircularProgressLayout.b
                public final void a(CircularProgressLayout circularProgressLayout3) {
                    SportCommandView.setListener$lambda$8(this.f34519a, circularProgressLayout3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setListener$lambda$0(SportCommandView this$0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.lastStartTime = System.currentTimeMillis();
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        this$0.pauseDown();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$1(SportCommandView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.clickLock(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setListener$lambda$3(SportCommandView this$0, View view, MotionEvent event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(event, "event");
        if (this$0.getCurSportState() == 1) {
            return false;
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            clb.a(this$0.getContext());
            ImageView imageView = this$0.mFinishSportImgView;
            if (imageView != null) {
                this$0.finishStartAnimator(imageView, this$0.mFinishCircleView);
            }
        } else if (actionMasked == 1 || actionMasked == 3) {
            AnimatorSet animatorSet = this$0.finishStartAnimatorSet;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            ImageView imageView2 = this$0.mFinishRingBgView;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            CircularProgressLayout circularProgressLayout = this$0.mFinishCircleView;
            Intrinsics.checkNotNull(circularProgressLayout);
            if (circularProgressLayout.a()) {
                CircularProgressLayout circularProgressLayout2 = this$0.mFinishCircleView;
                if (circularProgressLayout2 != null) {
                    circularProgressLayout2.c();
                }
                this$0.finishStopAnimator(this$0.mFinishSportImgView);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setListener$lambda$5(SportCommandView this$0, View view, MotionEvent motionEvent) {
        CircularProgressLayout circularProgressLayout;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getCurSportState() != 2) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            clb.a(this$0.getContext());
            ImageView imageView = this$0.centerLockImg;
            if (imageView != null) {
                this$0.finishStartAnimator(imageView, this$0.lockCircleView);
            }
        } else if (actionMasked == 1 || actionMasked == 3) {
            CircularProgressLayout circularProgressLayout2 = this$0.lockCircleView;
            Boolean boolValueOf = circularProgressLayout2 != null ? Boolean.valueOf(circularProgressLayout2.a()) : null;
            Intrinsics.checkNotNull(boolValueOf);
            if (boolValueOf.booleanValue() && (circularProgressLayout = this$0.lockCircleView) != null) {
                circularProgressLayout.c();
            }
            this$0.finishStopAnimator(this$0.centerLockImg);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$7(SportCommandView this$0, CircularProgressLayout circularProgressLayout) {
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
            this$0.finishStopAnimator(this$0.mFinishSportImgView);
        }
        Object systemService = this$0.getContext().getSystemService("vibrator");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        ((Vibrator) systemService).vibrate(100L);
        ISportStateOnViewCallback iSportStateOnViewCallback = this$0.iSportStateOnViewListener;
        if (iSportStateOnViewCallback != null) {
            iSportStateOnViewCallback.onViewFinish(new m0d() { // from class: ran
                @Override // defpackage.m0d
                public final void a() {
                    SportCommandView.setListener$lambda$7$lambda$6();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$7$lambda$6() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$8(SportCommandView this$0, CircularProgressLayout circularProgressLayout) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AnimatorSet animatorSet = this$0.finishStartAnimatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        CircularProgressLayout circularProgressLayout2 = this$0.lockCircleView;
        Intrinsics.checkNotNull(circularProgressLayout2);
        if (circularProgressLayout2.a()) {
            CircularProgressLayout circularProgressLayout3 = this$0.lockCircleView;
            if (circularProgressLayout3 != null) {
                circularProgressLayout3.c();
            }
            this$0.finishStopAnimator(this$0.centerLockImg);
        }
        FrameLayout frameLayout = this$0.centerLock;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        ImageView imageView = this$0.sportLockView;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = this$0.mOngoingActionImgView;
        if (imageView2 != null) {
            imageView2.setContentDescription(ResourceExtKt.getString(e1j.z2));
        }
    }

    public final float getCurrentValue() {
        return this.currentValue;
    }

    @Nullable
    public final AnimatorSet getFinishStartAnimatorSet() {
        return this.finishStartAnimatorSet;
    }

    @Nullable
    public final FrameLayout getFrameLayoutRight() {
        return this.frameLayoutRight;
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
    public final IEcoSportRemoteState getSportStateCaller() {
        return this.sportStateCaller;
    }

    public final void onDestroy() {
        AnimatorSet animatorSet = this.finishStartAnimatorSet;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l, int t, int r2, int b2) {
        super.onLayout(changed, l, t, r2, b2);
        FitnessLogUtils.i(this.TAG, "onLayout");
        if (getSportState() == 2) {
            AnimatorSet animatorSet = this.finishStartAnimatorSet;
            if (animatorSet != null) {
                Intrinsics.checkNotNull(animatorSet);
                if (animatorSet.isStarted()) {
                    return;
                }
            }
            if (this.isSwitchScreen) {
                animator2Lock();
                this.isSwitchScreen = false;
            }
        }
    }

    public final void setCurrentValue(float f) {
        this.currentValue = f;
    }

    public final void setFinishStartAnimatorSet(@Nullable AnimatorSet animatorSet) {
        this.finishStartAnimatorSet = animatorSet;
    }

    public final void setFrameLayoutRight(@Nullable FrameLayout frameLayout) {
        this.frameLayoutRight = frameLayout;
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
        ImageView imageView2;
        FitnessLogUtils.i(this.TAG, "setSportState , sportState : " + sportState);
        this.sportState = sportState;
        if (sportState == 1) {
            ImageView imageView3 = this.mOngoingActionImgView;
            if (imageView3 != null) {
                imageView3.setContentDescription(ResourceExtKt.getString(e1j.z2));
            }
            i = this.pauseIcResId;
        } else if (sportState == 2) {
            ImageView imageView4 = this.mOngoingActionImgView;
            if (imageView4 != null) {
                imageView4.setContentDescription(ResourceExtKt.getString(e1j.S2));
            }
            ImageView imageView5 = this.mFinishSportImgView;
            if (imageView5 != null) {
                imageView5.setContentDescription(ResourceExtKt.getString(e1j.v4));
            }
            FrameLayout frameLayout = this.centerLock;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            i = this.restartIcResId;
            ImageView imageView6 = this.mFinishSportImgView;
            if (imageView6 != null) {
                imageView6.setImageDrawable(ni4.e(getContext(), this.finishIcResId));
            }
            setCurSportState(0);
            changeState();
        } else if (sportState != 3) {
            i = -1;
        } else {
            ImageView imageView7 = this.mOngoingActionImgView;
            if (imageView7 != null) {
                imageView7.setContentDescription(ResourceExtKt.getString(e1j.z2));
            }
            ImageView imageView8 = this.mFinishSportImgView;
            if (imageView8 != null) {
                imageView8.setContentDescription(ResourceExtKt.getString(e1j.J4));
            }
            i = this.pauseIcResId;
            ImageView imageView9 = this.mFinishSportImgView;
            if (imageView9 != null) {
                imageView9.setImageDrawable(ni4.e(getContext(), this.lockIcResId));
            }
            setCurSportState(1);
            changeState();
            if (getCurSportState() == 2 && (imageView2 = this.sportLockView) != null) {
                imageView2.setVisibility(8);
            }
        }
        if (i == -1 || (imageView = this.mOngoingActionImgView) == null) {
            return;
        }
        imageView.setImageDrawable(ni4.e(getContext(), i));
    }

    public final void setSportStateCaller(@NotNull IEcoSportRemoteState iEcoSportRemoteState) {
        Intrinsics.checkNotNullParameter(iEcoSportRemoteState, "<set-?>");
        this.sportStateCaller = iEcoSportRemoteState;
    }
}
