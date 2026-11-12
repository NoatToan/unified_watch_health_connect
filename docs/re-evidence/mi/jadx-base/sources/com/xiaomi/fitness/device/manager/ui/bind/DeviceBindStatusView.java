package com.xiaomi.fitness.device.manager.ui.bind;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.widget.AppCompatTextView;
import com.xiaomi.fit.device.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.statistics.StatConstants;
import defpackage.bji;
import defpackage.eli;
import defpackage.h4j;
import defpackage.hni;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0007J\b\u0010\u0015\u001a\u00020\u0013H\u0002J\u0010\u0010\u0016\u001a\u00020\u00132\b\b\u0003\u0010\u0017\u001a\u00020\u0007J\u0006\u0010\u0018\u001a\u00020\u0013J\u0006\u0010\u0019\u001a\u00020\u0013R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/bind/DeviceBindStatusView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mLoadingIcon", "Landroid/graphics/drawable/Drawable;", "mLoadingAnimator", "Landroid/animation/Animator;", "mBindingText", "", "mSuccessText", "mFailText", "setStatus", "", "status", "initializer", StatConstants.PARAM_START, "textRes", "success", "fail", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceBindStatusView extends AppCompatTextView {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int OOB_DISMISS = 104;
    public static final int OOB_SHOW = 103;
    public static final int STATUS_FAIL = 102;
    public static final int STATUS_INIT = 0;
    public static final int STATUS_LOADING = 100;
    public static final int STATUS_SUCCESS = 101;

    @Nullable
    private String mBindingText;

    @Nullable
    private String mFailText;

    @Nullable
    private Animator mLoadingAnimator;

    @Nullable
    private Drawable mLoadingIcon;

    @Nullable
    private String mSuccessText;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/bind/DeviceBindStatusView$Companion;", "", "<init>", "()V", "STATUS_INIT", "", "STATUS_LOADING", "STATUS_SUCCESS", "STATUS_FAIL", "OOB_SHOW", "OOB_DISMISS", "setLoadingText", "", "deviceBindStatusView", "Lcom/xiaomi/fitness/device/manager/ui/bind/DeviceBindStatusView;", "text", "", "setSuccessText", "setFailText", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void setFailText(@NotNull DeviceBindStatusView deviceBindStatusView, @NotNull String text) {
            Intrinsics.checkNotNullParameter(deviceBindStatusView, "deviceBindStatusView");
            Intrinsics.checkNotNullParameter(text, "text");
            deviceBindStatusView.mFailText = text;
        }

        @JvmStatic
        public final void setLoadingText(@NotNull DeviceBindStatusView deviceBindStatusView, @NotNull String text) {
            Intrinsics.checkNotNullParameter(deviceBindStatusView, "deviceBindStatusView");
            Intrinsics.checkNotNullParameter(text, "text");
            deviceBindStatusView.mBindingText = text;
        }

        @JvmStatic
        public final void setSuccessText(@NotNull DeviceBindStatusView deviceBindStatusView, @NotNull String text) {
            Intrinsics.checkNotNullParameter(deviceBindStatusView, "deviceBindStatusView");
            Intrinsics.checkNotNullParameter(text, "text");
            deviceBindStatusView.mSuccessText = text;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DeviceBindStatusView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void initializer() {
        if (this.mLoadingIcon == null) {
            Drawable drawable = ViewExtKt.getDrawable(this, hni.f);
            this.mLoadingIcon = drawable;
            Intrinsics.checkNotNull(drawable);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, "level", 0, 10000);
            objectAnimatorOfInt.setRepeatCount(-1);
            objectAnimatorOfInt.setDuration(500L);
            objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
            this.mLoadingAnimator = objectAnimatorOfInt;
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, this.mLoadingIcon, (Drawable) null);
        setText(this.mBindingText);
    }

    @JvmStatic
    public static final void setFailText(@NotNull DeviceBindStatusView deviceBindStatusView, @NotNull String str) {
        INSTANCE.setFailText(deviceBindStatusView, str);
    }

    @JvmStatic
    public static final void setLoadingText(@NotNull DeviceBindStatusView deviceBindStatusView, @NotNull String str) {
        INSTANCE.setLoadingText(deviceBindStatusView, str);
    }

    @JvmStatic
    public static final void setSuccessText(@NotNull DeviceBindStatusView deviceBindStatusView, @NotNull String str) {
        INSTANCE.setSuccessText(deviceBindStatusView, str);
    }

    public static /* synthetic */ void start$default(DeviceBindStatusView deviceBindStatusView, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        deviceBindStatusView.start(i);
    }

    public final void fail() {
        Animator animator = this.mLoadingAnimator;
        if (animator != null) {
            animator.cancel();
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, hni.j, 0);
        setText(this.mFailText);
    }

    public final void setStatus(int status) {
        DeviceModelExtKt.logi(((Object) getText()) + ", status is " + status);
        if (status == 0) {
            initializer();
        }
        switch (status) {
            case 100:
                start$default(this, 0, 1, null);
                break;
            case 101:
                success();
                break;
            case 102:
                fail();
                break;
        }
    }

    public final void start(int textRes) {
        initializer();
        if (textRes != -1) {
            setText(textRes);
        }
        Animator animator = this.mLoadingAnimator;
        if (animator != null) {
            animator.start();
        }
    }

    public final void success() {
        Animator animator = this.mLoadingAnimator;
        if (animator != null) {
            animator.cancel();
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, hni.f20264k, 0);
        setText(this.mSuccessText);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DeviceBindStatusView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ DeviceBindStatusView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DeviceBindStatusView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h4j.H0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.mBindingText = typedArrayObtainStyledAttributes.getString(h4j.I0);
        this.mSuccessText = typedArrayObtainStyledAttributes.getString(h4j.K0);
        this.mFailText = typedArrayObtainStyledAttributes.getString(h4j.J0);
        typedArrayObtainStyledAttributes.recycle();
        setTextColor(ViewExtKt.getColor(this, bji.f));
        setTextSize(0, ViewExtKt.getDimen(this, eli.i));
        int dimen = (int) ViewExtKt.getDimen(this, eli.f);
        setPadding(0, dimen, 0, dimen);
        initializer();
    }
}
