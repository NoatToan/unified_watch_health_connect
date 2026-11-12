package com.xiaomi.fitness.device.manager.ui.manager;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Keep;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.Lifecycle;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.ui.DeviceDetail;
import com.xiaomi.onetrack.b.e;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import defpackage.m26;
import defpackage.nuf;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 <2\u00020\u0001:\u0001<B%\u0012\u0006\u00104\u001a\u000203\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000105\u0012\b\b\u0002\u00107\u001a\u00020\r¢\u0006\u0004\b8\u00109B\u0011\b\u0016\u0012\u0006\u00104\u001a\u000203¢\u0006\u0004\b8\u0010:B\u0019\b\u0016\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u00106\u001a\u000205¢\u0006\u0004\b8\u0010;J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\bJ\u001f\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0016\u0010\u0017J7\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\rH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\rH\u0007¢\u0006\u0004\b \u0010!J\u0019\u0010$\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0017¢\u0006\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R$\u0010,\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00102\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\f¨\u0006="}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/manager/DeviceSwipeView;", "Landroid/widget/HorizontalScrollView;", "Lcom/xiaomi/fitness/device/manager/ui/DeviceDetail;", "device", "", "setDeviceDetail", "(Lcom/xiaomi/fitness/device/manager/ui/DeviceDetail;)V", "smoothScrollToContent", "()V", "smoothScrollToStart", "", "checkContentStartNotSet", "()Z", "", "startX", "endX", "Landroid/animation/ObjectAnimator;", "createAnimator", "(II)Landroid/animation/ObjectAnimator;", "notifyDisplayModeChanged", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", e.f13808a, DeviceTagInterface.CUSTOM_TAG_TYPE, "r", PluginDeviceInfo.FDESC, "onLayout", "(ZIIII)V", "x", "setContentScrollX", "(I)V", "Landroid/view/MotionEvent;", "ev", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lm26;", "mBinding", "Lm26;", "mContentStart", "I", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "setLifecycle", "(Landroidx/lifecycle/Lifecycle;)V", "isRtl", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nDeviceSwipeView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceSwipeView.kt\ncom/xiaomi/fitness/device/manager/ui/manager/DeviceSwipeView\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,174:1\n54#2,3:175\n24#2:178\n59#2,6:179\n*S KotlinDebug\n*F\n+ 1 DeviceSwipeView.kt\ncom/xiaomi/fitness/device/manager/ui/manager/DeviceSwipeView\n*L\n57#1:175,3\n57#1:178\n57#1:179,6\n*E\n"})
public final class DeviceSwipeView extends HorizontalScrollView {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long DEFAULT_DURATION = 250;
    private static final int NOT_SET = -1;

    @NotNull
    public static final String TAG = "DeviceSwipeView";

    @Nullable
    private Lifecycle lifecycle;

    @NotNull
    private m26 mBinding;
    private int mContentStart;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/manager/DeviceSwipeView$Companion;", "", "<init>", "()V", "TAG", "", "NOT_SET", "", "DEFAULT_DURATION", "", "setDeviceDetail", "", "view", "Lcom/xiaomi/fitness/device/manager/ui/manager/DeviceSwipeView;", "device", "Lcom/xiaomi/fitness/device/manager/ui/DeviceDetail;", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void setDeviceDetail(@NotNull DeviceSwipeView view, @Nullable DeviceDetail device) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setDeviceDetail(device);
        }
    }

    public /* synthetic */ DeviceSwipeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final boolean checkContentStartNotSet() {
        if (this.mContentStart == -1) {
            Logger.w(TAG, "mContentStart not set");
        }
        return this.mContentStart == -1;
    }

    private final ObjectAnimator createAnimator(int startX, int endX) {
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "contentScrollX", startX, endX);
        objectAnimatorOfInt.setDuration(DEFAULT_DURATION);
        objectAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfInt, "apply(...)");
        return objectAnimatorOfInt;
    }

    private final boolean isRtl() {
        return getLayoutDirection() == 1;
    }

    @JvmStatic
    public static final void setDeviceDetail(@NotNull DeviceSwipeView deviceSwipeView, @Nullable DeviceDetail deviceDetail) {
        INSTANCE.setDeviceDetail(deviceSwipeView, deviceDetail);
    }

    private final void smoothScrollToContent() {
        (isRtl() ? createAnimator(this.mContentStart, 0) : createAnimator(0, this.mContentStart)).start();
    }

    private final void smoothScrollToStart() {
        (isRtl() ? createAnimator(0, this.mContentStart) : createAnimator(this.mContentStart, 0)).start();
    }

    @Nullable
    public final Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    public final void notifyDisplayModeChanged() {
        if (checkContentStartNotSet()) {
            return;
        }
        if (DeviceDetail.INSTANCE.checkIsEditMode()) {
            smoothScrollToStart();
        } else {
            smoothScrollToContent();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l, int t, int r2, int b2) {
        super.onLayout(changed, l, t, r2, b2);
        boolean zCheckIsEditMode = DeviceDetail.INSTANCE.checkIsEditMode();
        Logger.i(TAG, "onLayout " + changed + " " + zCheckIsEditMode + " rtl:" + isRtl());
        if (changed) {
            try {
                AppCompatImageView deleteImg = this.mBinding.A;
                Intrinsics.checkNotNullExpressionValue(deleteImg, "deleteImg");
                ViewGroup.LayoutParams layoutParams = deleteImg.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                this.mContentStart = deleteImg.getMeasuredWidth() + layoutParams2.getMarginStart() + layoutParams2.getMarginEnd();
                int i = 0;
                if (zCheckIsEditMode) {
                    if (isRtl()) {
                        i = this.mContentStart;
                    }
                } else if (!isRtl()) {
                    i = this.mContentStart;
                }
                setContentScrollX(i);
            } catch (Exception e) {
                Logger.e(TAG, "onLayout error", e);
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int paddingTop;
        int paddingBottom;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        try {
            View childAt = getChildAt(0);
            ViewGroup.LayoutParams layoutParams = this.mBinding.A.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            int measuredWidth = ((getMeasuredWidth() - getPaddingStart()) - getPaddingEnd()) + layoutParams2.getMarginStart() + layoutParams2.getMarginEnd() + this.mBinding.A.getMeasuredWidth();
            if (getContext().getApplicationInfo().targetSdkVersion >= 23) {
                paddingTop = getPaddingTop() + getPaddingBottom() + layoutParams2.topMargin;
                paddingBottom = layoutParams2.bottomMargin;
            } else {
                paddingTop = getPaddingTop();
                paddingBottom = getPaddingBottom();
            }
            int i = paddingTop + paddingBottom;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(heightMeasureSpec, i, layoutParams2.height);
            Logger.d(TAG, "onMeasure contentWidth:" + measuredWidth);
            childAt.measure(iMakeMeasureSpec, childMeasureSpec);
        } catch (Exception e) {
            Logger.e(TAG, "getContentItem error:", e);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@Nullable MotionEvent ev) {
        return true;
    }

    @Keep
    public final void setContentScrollX(int x) {
        Logger.i(TAG, "setContentScrollX " + x);
        scrollTo(x, 0);
    }

    public final void setLifecycle(@Nullable Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSwipeView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        m26 m26VarA0 = m26.A0(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(m26VarA0, "inflate(...)");
        this.mBinding = m26VarA0;
        this.mContentStart = -1;
        nuf.f(m26VarA0.B);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDeviceDetail(DeviceDetail device) {
        this.mBinding.C0(device);
        if (TextUtils.isEmpty(device != null ? device.getIcon() : null)) {
            return;
        }
        ImageView deviceIvItemBoundDeviceIcon = this.mBinding.C;
        Intrinsics.checkNotNullExpressionValue(deviceIvItemBoundDeviceIcon, "deviceIvItemBoundDeviceIcon");
        Intrinsics.checkNotNull(device);
        String icon = device.getIcon();
        ImageLoader imageLoader = Coil.imageLoader(deviceIvItemBoundDeviceIcon.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(deviceIvItemBoundDeviceIcon.getContext()).data(icon).target(deviceIvItemBoundDeviceIcon);
        int defaultIcon = device.getDefaultIcon();
        builderTarget.error(defaultIcon);
        builderTarget.placeholder(defaultIcon);
        builderTarget.lifecycle(this.lifecycle);
        imageLoader.enqueue(builderTarget.build());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeviceSwipeView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeviceSwipeView(@NotNull Context context, @NotNull AttributeSet attrs) {
        this(context, attrs, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }
}
