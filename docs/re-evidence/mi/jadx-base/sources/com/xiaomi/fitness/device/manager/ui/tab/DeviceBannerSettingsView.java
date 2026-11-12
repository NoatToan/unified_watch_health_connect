package com.xiaomi.fitness.device.manager.ui.tab;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.dui;
import defpackage.h4j;
import defpackage.uzi;
import defpackage.xqi;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007H\u0002J\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceBannerSettingsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mRootView", "Landroid/view/View;", "mRemindView", "mRemindTitle", "Landroid/widget/TextView;", "mRemindDesTV", "mOpenIcon", "mCloseIcon", "Landroid/widget/ImageView;", "setRemindType", "", "remindType", "setCloseOnClickListener", "onClickListener", "Landroid/view/View$OnClickListener;", "setOpenOnClickListener", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceBannerSettingsView extends ConstraintLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final ImageView mCloseIcon;

    @NotNull
    private final TextView mOpenIcon;

    @NotNull
    private final TextView mRemindDesTV;

    @NotNull
    private final TextView mRemindTitle;

    @NotNull
    private final ConstraintLayout mRemindView;

    @NotNull
    private View mRootView;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceBannerSettingsView$Companion;", "", "<init>", "()V", "setRemindType", "", "view", "Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceBannerSettingsView;", "remindType", "", "setCloseOnClickListener", "onClickListener", "Landroid/view/View$OnClickListener;", "setOpenOnClickListener", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void setCloseOnClickListener(@NotNull DeviceBannerSettingsView view, @NotNull View.OnClickListener onClickListener) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
            view.setCloseOnClickListener(onClickListener);
        }

        @JvmStatic
        public final void setOpenOnClickListener(@NotNull DeviceBannerSettingsView view, @NotNull View.OnClickListener onClickListener) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
            view.setOpenOnClickListener(onClickListener);
        }

        @JvmStatic
        public final void setRemindType(@NotNull DeviceBannerSettingsView view, int remindType) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setRemindType(remindType);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DeviceBannerSettingsView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @JvmStatic
    public static final void setCloseOnClickListener(@NotNull DeviceBannerSettingsView deviceBannerSettingsView, @NotNull View.OnClickListener onClickListener) {
        INSTANCE.setCloseOnClickListener(deviceBannerSettingsView, onClickListener);
    }

    @JvmStatic
    public static final void setOpenOnClickListener(@NotNull DeviceBannerSettingsView deviceBannerSettingsView, @NotNull View.OnClickListener onClickListener) {
        INSTANCE.setOpenOnClickListener(deviceBannerSettingsView, onClickListener);
    }

    @JvmStatic
    public static final void setRemindType(@NotNull DeviceBannerSettingsView deviceBannerSettingsView, int i) {
        INSTANCE.setRemindType(deviceBannerSettingsView, i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DeviceBannerSettingsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRemindType(int remindType) {
        Logger.i("setRemindType(" + remindType + ")", new Object[0]);
        if (remindType == -1) {
            ViewExtKt.setVisible(this.mRemindView, false);
            return;
        }
        if (remindType == 1) {
            ViewExtKt.setVisible(this.mRemindView, true);
            this.mRemindTitle.setText(ApplicationExtKt.getApplication().getString(uzi.M0));
            this.mRemindDesTV.setText(ApplicationExtKt.getApplication().getString(uzi.L0));
            this.mOpenIcon.setText(getContext().getString(uzi.X0));
            return;
        }
        if (remindType == 2) {
            ViewExtKt.setVisible(this.mRemindView, true);
            this.mRemindTitle.setText(ApplicationExtKt.getApplication().getString(uzi.K0));
            this.mRemindDesTV.setText(getContext().getString(uzi.J0));
            this.mOpenIcon.setText(getContext().getString(uzi.X0));
            return;
        }
        if (remindType == 3) {
            ViewExtKt.setVisible(this.mRemindView, true);
            this.mRemindTitle.setText(ApplicationExtKt.getApplication().getString(uzi.U0));
            this.mRemindDesTV.setText(getContext().getString(uzi.T0));
            this.mOpenIcon.setText(getContext().getString(uzi.S0));
            return;
        }
        if (remindType != 4) {
            return;
        }
        ViewExtKt.setVisible(this.mRemindView, true);
        this.mRemindTitle.setText(ApplicationExtKt.getApplication().getString(uzi.W0));
        this.mRemindDesTV.setText(getContext().getString(uzi.V0));
        this.mOpenIcon.setText(getContext().getString(uzi.X0));
    }

    public final void setCloseOnClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        this.mCloseIcon.setOnClickListener(onClickListener);
    }

    public final void setOpenOnClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        this.mOpenIcon.setOnClickListener(onClickListener);
    }

    public /* synthetic */ DeviceBannerSettingsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DeviceBannerSettingsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(h4j.F0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int integer = typedArrayObtainStyledAttributes.getInteger(h4j.G0, -1);
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = View.inflate(context, dui.O, this);
        this.mRootView = viewInflate;
        this.mRemindTitle = (TextView) viewInflate.findViewById(xqi.r0);
        this.mRemindView = (ConstraintLayout) this.mRootView.findViewById(xqi.q0);
        this.mRemindDesTV = (TextView) this.mRootView.findViewById(xqi.p0);
        this.mOpenIcon = (TextView) this.mRootView.findViewById(xqi.m0);
        this.mCloseIcon = (ImageView) this.mRootView.findViewById(xqi.q);
        setRemindType(integer);
    }
}
