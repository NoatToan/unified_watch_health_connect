package com.xiaomi.fitness.device.manager.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import coil.Coil;
import coil.request.ImageRequest;
import defpackage.dui;
import defpackage.h4j;
import defpackage.xqi;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012H\u0002J\u0012\u0010\u0015\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/DeviceNormalGuideView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mIvDeviceIcon", "Landroid/widget/ImageView;", "mTvDeviceName", "Landroid/widget/TextView;", "mTvDes", "setIcon", "", "icon", "", "setDes", "des", "setName", "name", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceNormalGuideView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceNormalGuideView.kt\ncom/xiaomi/fitness/device/manager/ui/DeviceNormalGuideView\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,83:1\n54#2,3:84\n24#2:87\n57#2,6:88\n63#2,2:95\n57#3:94\n*S KotlinDebug\n*F\n+ 1 DeviceNormalGuideView.kt\ncom/xiaomi/fitness/device/manager/ui/DeviceNormalGuideView\n*L\n72#1:84,3\n72#1:87\n72#1:88,6\n72#1:95,2\n72#1:94\n*E\n"})
public final class DeviceNormalGuideView extends LinearLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final ImageView mIvDeviceIcon;

    @NotNull
    private final TextView mTvDes;

    @NotNull
    private final TextView mTvDeviceName;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\u001a\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0007J\u001a\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0007¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/DeviceNormalGuideView$Companion;", "", "<init>", "()V", "setName", "", "view", "Lcom/xiaomi/fitness/device/manager/ui/DeviceNormalGuideView;", "name", "", "setDes", "status", "setIcon", "icon", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void setDes(@NotNull DeviceNormalGuideView view, @Nullable String status) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setDes(status);
        }

        @JvmStatic
        public final void setIcon(@NotNull DeviceNormalGuideView view, @Nullable String icon) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setIcon(icon);
        }

        @JvmStatic
        public final void setName(@NotNull DeviceNormalGuideView view, @Nullable String name) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setName(name);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DeviceNormalGuideView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @JvmStatic
    public static final void setDes(@NotNull DeviceNormalGuideView deviceNormalGuideView, @Nullable String str) {
        INSTANCE.setDes(deviceNormalGuideView, str);
    }

    @JvmStatic
    public static final void setIcon(@NotNull DeviceNormalGuideView deviceNormalGuideView, @Nullable String str) {
        INSTANCE.setIcon(deviceNormalGuideView, str);
    }

    @JvmStatic
    public static final void setName(@NotNull DeviceNormalGuideView deviceNormalGuideView, @Nullable String str) {
        INSTANCE.setName(deviceNormalGuideView, str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DeviceNormalGuideView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDes(String des) {
        this.mTvDes.setText(des);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setIcon(String icon) {
        ImageView imageView = this.mIvDeviceIcon;
        Coil.imageLoader(imageView.getContext()).enqueue(new ImageRequest.Builder(imageView.getContext()).data(icon).target(imageView).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setName(String name) {
        this.mTvDeviceName.setText(name);
    }

    public /* synthetic */ DeviceNormalGuideView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DeviceNormalGuideView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(h4j.M0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = typedArrayObtainStyledAttributes.getString(h4j.P0);
        String string2 = typedArrayObtainStyledAttributes.getString(h4j.O0);
        String string3 = typedArrayObtainStyledAttributes.getString(h4j.N0);
        typedArrayObtainStyledAttributes.recycle();
        setOrientation(1);
        View viewInflate = View.inflate(context, dui.P, this);
        this.mIvDeviceIcon = (ImageView) viewInflate.findViewById(xqi.A);
        this.mTvDeviceName = (TextView) viewInflate.findViewById(xqi.Q);
        this.mTvDes = (TextView) viewInflate.findViewById(xqi.P);
        setName(string);
        setIcon(string2);
        setDes(string3);
    }
}
