package com.xiaomi.fitness.devicesettings.huami.vibratemode;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import defpackage.jni;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/DeviceImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "show", "", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceImageView.kt\ncom/xiaomi/fitness/devicesettings/huami/vibratemode/DeviceImageView\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,37:1\n54#2,3:38\n24#2:41\n59#2,6:42\n*S KotlinDebug\n*F\n+ 1 DeviceImageView.kt\ncom/xiaomi/fitness/devicesettings/huami/vibratemode/DeviceImageView\n*L\n33#1:38,3\n33#1:41\n33#1:42,6\n*E\n"})
public final class DeviceImageView extends AppCompatImageView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceImageView(@Nullable Context context) {
        super(context);
        Intrinsics.checkNotNull(context);
    }

    public final void show(@Nullable WearableDeviceModel deviceModel) {
        if (deviceModel == null) {
            return;
        }
        String previewIcon = DeviceModelExtKt.getPreviewIcon(deviceModel);
        int i = jni.h1;
        if (DeviceModelExtKt.isBandType(deviceModel)) {
            i = jni.g1;
        }
        ImageLoader imageLoader = Coil.imageLoader(getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(getContext()).data(previewIcon).target(this);
        builderTarget.placeholder(i);
        imageLoader.enqueue(builderTarget.build());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceImageView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNull(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceImageView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNull(context);
        setScaleType(ImageView.ScaleType.CENTER_CROP);
    }
}
