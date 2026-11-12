package com.xiaomi.fitness.nfc.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import defpackage.wni;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/nfc/widget/DeviceImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "show", "", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceImageView.kt\ncom/xiaomi/fitness/nfc/widget/DeviceImageView\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,31:1\n54#2,3:32\n24#2:35\n59#2,6:36\n*S KotlinDebug\n*F\n+ 1 DeviceImageView.kt\ncom/xiaomi/fitness/nfc/widget/DeviceImageView\n*L\n26#1:32,3\n26#1:35\n26#1:36,6\n*E\n"})
public final class DeviceImageView extends AppCompatImageView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DeviceImageView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void show(@Nullable WearableDeviceModel deviceModel) {
        if (deviceModel == null) {
            return;
        }
        String bigIcon = DeviceModelExtKt.getBigIcon(deviceModel);
        int i = wni.d;
        if (DeviceModelExtKt.isBandType(deviceModel)) {
            i = wni.c;
        }
        ImageLoader imageLoader = Coil.imageLoader(getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(getContext()).data(bigIcon).target(this);
        builderTarget.placeholder(i);
        imageLoader.enqueue(builderTarget.build());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DeviceImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DeviceImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    public /* synthetic */ DeviceImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
