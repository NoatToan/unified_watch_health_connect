package com.xiaomi.fitness.watch.face.di;

import android.content.Context;
import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.MutableLiveData;
import com.miui.circulate.device.api.Column;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.StringExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.TabContentItem;
import com.xiaomi.fitness.watch.face.ext.FaceExtKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007Jm\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012H\u0002¢\u0006\u0002\u0010\u0015Jn\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00132\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00192\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00192\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00192\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00192\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00192\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0019J\u0012\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\u0017\u001a\u00020\u0013H\u0002¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/watch/face/di/FaceSingleModel;", "", "<init>", "()V", "provideFaceItem", "Lcom/xiaomi/fitness/device/manager/export/bean/TabContentItem;", "createFeatureItem", "type", "", "icon", "title", Column.SUBTITLE, "more", "", "remind", "remindText", "", "onClickListener", "Lkotlin/Function1;", "Landroid/content/Context;", "", "(IIILjava/lang/Integer;ZZLjava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/xiaomi/fitness/device/manager/export/bean/TabContentItem;", "gotoPage", "context", "targetClass", "Ljava/lang/Class;", "huamiTargetClass", "panguTargetClass", "kongmingTargetClass", "bleTargetClass", "wearosTargetClass", "getCurrentDeviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceSingleModel {

    @NotNull
    public static final FaceSingleModel INSTANCE = new FaceSingleModel();

    private FaceSingleModel() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final TabContentItem createFeatureItem(int type, int icon, int title, Integer subtitle, boolean more, boolean remind, String remindText, Function1<? super Context, Unit> onClickListener) {
        MutableLiveData<String> liveData;
        if (subtitle != null) {
            String string = ApplicationExtKt.getApplication().getString(subtitle.intValue());
            if (string != null) {
                liveData = StringExtKt.toLiveData(string);
            } else {
                liveData = null;
            }
        } else {
            liveData = null;
        }
        String string2 = ApplicationExtKt.getApplication().getString(title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new TabContentItem(11, type, icon, StringExtKt.toLiveData(string2), liveData, more, new ObservableBoolean(remind), remindText != null ? StringExtKt.toLiveData(remindText) : null, null, onClickListener, null, null, null, 7424, null);
    }

    private final WearableDeviceModel getCurrentDeviceModel(Context context) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            ToastExtKt.toastShort(context, "device is null");
        }
        return wearableDeviceModel;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0031  */
    public final void gotoPage(@NotNull Context context, @Nullable Class<?> targetClass, @Nullable Class<?> huamiTargetClass, @Nullable Class<?> panguTargetClass, @Nullable Class<?> kongmingTargetClass, @Nullable Class<?> bleTargetClass, @Nullable Class<?> wearosTargetClass) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (targetClass == null) {
            WearableDeviceModel currentDeviceModel = getCurrentDeviceModel(context);
            if (currentDeviceModel == null) {
                targetClass = null;
            } else if (DeviceModelExtKt.isHuaMi(currentDeviceModel)) {
                if (huamiTargetClass == null) {
                    if (DeviceModelExtKt.isKongMing(currentDeviceModel)) {
                        panguTargetClass = kongmingTargetClass;
                    }
                    targetClass = panguTargetClass;
                } else {
                    targetClass = huamiTargetClass;
                }
            } else if (DeviceModelExtKt.isBluetooth(currentDeviceModel)) {
                targetClass = bleTargetClass;
            } else if (DeviceModelExtKt.isWearOS(currentDeviceModel)) {
                targetClass = wearosTargetClass;
            } else {
                targetClass = null;
            }
        }
        if (targetClass != null) {
            FaceExtKt.gotoPage$default(context, targetClass, null, 2, null);
        } else {
            ToastExtKt.toastShort(context, "unsupported device");
        }
    }

    @NotNull
    public final TabContentItem provideFaceItem() {
        return FaceSingleModuleKt.getFaceTabContentItem();
    }
}
