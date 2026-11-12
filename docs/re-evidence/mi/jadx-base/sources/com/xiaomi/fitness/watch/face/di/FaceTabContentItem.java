package com.xiaomi.fitness.watch.face.di;

import android.content.Context;
import com.xiaomi.fitness.common.extensions.StringExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.IItemChangesWithDevice;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.TabContentItem;
import com.xiaomi.fitness.watch.face.di.FaceTabContentItem;
import com.xiaomi.fitness.watch.face.export.FaceHelper;
import com.xiaomi.fitness.watch.face.export.FaceHelperExtKt;
import com.xiaomi.fitness.watch.face.helper.FaceUtils;
import defpackage.noi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/watch/face/di/FaceTabContentItem;", "Lcom/xiaomi/fitness/device/manager/export/bean/TabContentItem;", "Lcom/xiaomi/fitness/device/manager/export/IItemChangesWithDevice;", "<init>", "()V", "onDeviceChanged", "", "did", "", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceTabContentItem extends TabContentItem implements IItemChangesWithDevice {
    public FaceTabContentItem() {
        super(11, 180, noi.f28204b, StringExtKt.toLiveData(FaceUtils.INSTANCE.getTabName()), null, false, null, null, new Function1() { // from class: u59
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FaceTabContentItem._init_$lambda$0((WearableDeviceModel) obj));
            }
        }, new Function1() { // from class: v59
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceTabContentItem._init_$lambda$1((Context) obj);
            }
        }, new Function1() { // from class: w59
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FaceTabContentItem._init_$lambda$2((WearableDeviceModel) obj));
            }
        }, null, null, 6384, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        return !DeviceModelExtKt.isWearOS(wearableDeviceModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        FaceHelper.DefaultImpls.gotoFacePage$default(FaceHelperExtKt.getInstance(FaceHelper.INSTANCE), context, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$2(WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        return DeviceModelExtKt.isWearOS(wearableDeviceModel);
    }

    @Override // com.xiaomi.fitness.device.manager.export.IItemChangesWithDevice
    public void onDeviceChanged(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        String tabName = FaceUtils.INSTANCE.getTabName();
        Logger.i("FaceTabContentItem onDeviceChanged did: " + did + ", name: " + tabName, new Object[0]);
        getTitle().postValue(tabName);
    }
}
