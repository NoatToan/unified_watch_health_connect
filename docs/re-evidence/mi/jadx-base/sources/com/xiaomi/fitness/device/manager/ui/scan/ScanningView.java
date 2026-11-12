package com.xiaomi.fitness.device.manager.ui.scan;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.dui;
import defpackage.uzi;
import defpackage.xqi;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00122\b\b\u0001\u0010\u0016\u001a\u00020\u0007J\u0006\u0010\u0017\u001a\u00020\u0012J\u0006\u0010\u0018\u001a\u00020\u0012J\u0006\u0010\u0019\u001a\u00020\u0012R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/scan/ScanningView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mTvScanningTitle", "Landroid/widget/TextView;", "mTvScanningRetry", "mIvScanningIcon", "Landroid/widget/ImageView;", "mScanningAnimator", "Landroid/view/animation/Animation;", "setOnRetryListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/View$OnClickListener;", "setScanningStatusText", "resId", "startScan", "stopScan", "empty", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScanningView extends LinearLayout {

    @NotNull
    private final ImageView mIvScanningIcon;

    @NotNull
    private final Animation mScanningAnimator;

    @NotNull
    private final TextView mTvScanningRetry;

    @NotNull
    private final TextView mTvScanningTitle;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScanningView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void empty() {
        stopScan();
        setScanningStatusText(uzi.g1);
    }

    public final void setOnRetryListener(@NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mTvScanningRetry.setOnClickListener(listener);
    }

    public final void setScanningStatusText(int resId) {
        this.mTvScanningTitle.setText(resId);
    }

    public final void startScan() {
        ViewExtKt.visible(this);
        Logger.i("start scan with animation", new Object[0]);
        this.mIvScanningIcon.startAnimation(this.mScanningAnimator);
        ViewExtKt.invisible(this.mTvScanningRetry);
        setScanningStatusText(uzi.E1);
    }

    public final void stopScan() {
        Logger.i("stop scan, and clear animation", new Object[0]);
        this.mIvScanningIcon.clearAnimation();
        setScanningStatusText(uzi.B1);
        ViewExtKt.visible(this.mTvScanningRetry);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScanningView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ScanningView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScanningView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        View viewInflate = View.inflate(context, dui.U, this);
        this.mTvScanningTitle = (TextView) viewInflate.findViewById(xqi.U);
        this.mTvScanningRetry = (TextView) viewInflate.findViewById(xqi.T);
        ImageView imageView = (ImageView) viewInflate.findViewById(xqi.B);
        this.mIvScanningIcon = imageView;
        RotateAnimation rotateAnimation = new RotateAnimation(360.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        this.mScanningAnimator = rotateAnimation;
        imageView.setAnimation(rotateAnimation);
        rotateAnimation.setDuration(400L);
        rotateAnimation.setFillBefore(true);
        rotateAnimation.setRepeatMode(1);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        setGravity(16);
    }
}
