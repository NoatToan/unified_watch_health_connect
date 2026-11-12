package com.xiaomi.fitness.device.manager.ui.tab;

import android.content.Intent;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.export.DeviceTabManager;
import com.xiaomi.fitness.device.manager.utils.ChooseCommonAppUtil;
import defpackage.dbm;
import defpackage.hni;
import defpackage.uzi;
import defpackage.wam;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceTabManagerImpl;", "Lcom/xiaomi/fitness/device/manager/export/DeviceTabManager;", "<init>", "()V", "isShowRecoveryCommonAppDialog", "", "addMyDeviceShortcut", "", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceTabManagerImpl implements DeviceTabManager {
    @Override // com.xiaomi.fitness.device.manager.export.DeviceTabManager
    public void addMyDeviceShortcut() {
        if (AppUtil.INSTANCE.isPlayChannel()) {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("mihealth://intent?pageType=devicetab"));
        intent.setFlags(268468224);
        wam wamVarA = new wam.b(ApplicationExtKt.getApplication(), "checkDevice").f(ResourceExtKt.getString(uzi.f1)).b(IconCompat.j(ApplicationExtKt.getApplication(), hni.m)).c(intent).e(3).a();
        Intrinsics.checkNotNullExpressionValue(wamVarA, "build(...)");
        dbm.f(ApplicationExtKt.getApplication(), wamVarA);
    }

    @Override // com.xiaomi.fitness.device.manager.export.DeviceTabManager
    public boolean isShowRecoveryCommonAppDialog() {
        return ChooseCommonAppUtil.INSTANCE.isRecoveryAppCommonStatus();
    }
}
