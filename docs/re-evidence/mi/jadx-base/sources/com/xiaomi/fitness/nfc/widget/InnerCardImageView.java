package com.xiaomi.fitness.nfc.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.miui.tsmclient.common.util.DisplayUtils;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import defpackage.wni;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0018\u0010\u0010\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0011\u001a\u00020\u0012¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/nfc/widget/InnerCardImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "show", "", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "cardWrapper", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "showUrl", "cardFace", "", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInnerCardImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InnerCardImageView.kt\ncom/xiaomi/fitness/nfc/widget/InnerCardImageView\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,64:1\n54#2,3:65\n24#2:68\n59#2,6:69\n54#2,3:75\n24#2:78\n59#2,6:79\n*S KotlinDebug\n*F\n+ 1 InnerCardImageView.kt\ncom/xiaomi/fitness/nfc/widget/InnerCardImageView\n*L\n36#1:65,3\n36#1:68\n36#1:69,6\n59#1:75,3\n59#1:78\n59#1:79,6\n*E\n"})
public final class InnerCardImageView extends AppCompatImageView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public InnerCardImageView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void show(@Nullable WearableDeviceModel deviceModel, @Nullable CardWrapper cardWrapper) {
        if (deviceModel == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (DeviceModelExtKt.isHuaMi(deviceModel) || com.xiaomi.fitness.device.manager.export.DeviceModelExtKt.isRunwayScreen(deviceModel.getProduct())) {
            layoutParams2.topMargin = (int) DisplayUtils.dpToPx(AppUtil.getApp(), 60.0f);
            layoutParams2.gravity = 1;
            setScaleX(0.45f);
            setScaleY(0.45f);
        } else {
            layoutParams2.gravity = 17;
        }
        if (cardWrapper == null || cardWrapper.getCardFace() == null) {
            return;
        }
        String cardFace = cardWrapper.getCardFace();
        ImageLoader imageLoader = Coil.imageLoader(getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(getContext()).data(cardFace).target(this);
        builderTarget.error(wni.j);
        imageLoader.enqueue(builderTarget.build());
    }

    public final void showUrl(@Nullable WearableDeviceModel deviceModel, @NotNull String cardFace) {
        Intrinsics.checkNotNullParameter(cardFace, "cardFace");
        if (deviceModel == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (DeviceModelExtKt.isHuaMi(deviceModel) || com.xiaomi.fitness.device.manager.export.DeviceModelExtKt.isRunwayScreen(deviceModel.getProduct())) {
            layoutParams2.topMargin = (int) DisplayUtils.dpToPx(AppUtil.getApp(), 60.0f);
            layoutParams2.gravity = 1;
            setScaleX(0.45f);
            setScaleY(0.45f);
        } else {
            layoutParams2.gravity = 17;
        }
        ImageLoader imageLoader = Coil.imageLoader(getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(getContext()).data(cardFace).target(this);
        builderTarget.error(wni.j);
        imageLoader.enqueue(builderTarget.build());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public InnerCardImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public InnerCardImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ InnerCardImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
