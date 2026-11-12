package com.xiaomi.xms.wearable.di;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.StringExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.device.manager.export.bean.TabContentItem;
import com.xiaomi.xms.wearable.di.FeatureItemModule;
import com.xiaomi.xms.wearable.ui.appshop.ThirdAppShopFragment;
import defpackage.dih;
import defpackage.uoi;
import defpackage.x1j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/xms/wearable/di/FeatureItemModule;", "", "<init>", "()V", "provideAppShopItem", "Lcom/xiaomi/fitness/device/manager/export/bean/TabContentItem;", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FeatureItemModule {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideAppShopItem$lambda$2(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            Logger.e("error to app shop page:curDeviceModel is null", new Object[0]);
        } else if (DeviceModelExtKt.isWearOS(wearableDeviceModel)) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/category/ANDROID_WEAR")));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("key_did", wearableDeviceModel.getDid());
            dih.a().e(context, new FragmentParams.b().e(ThirdAppShopFragment.class).c(bundle).b());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideAppShopItem$lambda$3(WearableDeviceModel TabContentItem) {
        Intrinsics.checkNotNullParameter(TabContentItem, "$this$TabContentItem");
        return DeviceModelExtKt.isSupportFeature(TabContentItem, Feature.THIRD_PARTY_APP);
    }

    @NotNull
    public final TabContentItem provideAppShopItem() {
        int i = uoi.f35971b;
        String string = ApplicationExtKt.getApplication().getString(x1j.q);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new TabContentItem(11, 154, i, StringExtKt.toLiveData(string), null, false, null, null, null, new Function1() { // from class: la9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeatureItemModule.provideAppShopItem$lambda$2((Context) obj);
            }
        }, new Function1() { // from class: fb9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FeatureItemModule.provideAppShopItem$lambda$3((WearableDeviceModel) obj));
            }
        }, null, null, 6640, null);
    }
}
