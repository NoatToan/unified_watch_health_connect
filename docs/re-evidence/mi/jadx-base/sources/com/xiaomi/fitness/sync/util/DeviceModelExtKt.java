package com.xiaomi.fitness.sync.util;

import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import defpackage.gyo;
import defpackage.s7r;
import defpackage.txo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "", HTTP.IDENTITY_CODING, "password", "Lgyo$a;", "basicInfo", "", "addWifiConfig", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Ljava/lang/String;Ljava/lang/String;Lgyo$a;)V", "sync_chinaProductRelease"}, k = 2, mv = {2, 0, 0})
public final class DeviceModelExtKt {
    public static final void addWifiConfig(@NotNull WearableDeviceModel wearableDeviceModel, @NotNull String identity, @NotNull String password, @NotNull gyo.a basicInfo) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(identity, "identity");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(basicInfo, "basicInfo");
        if (StringsKt__StringsKt.isBlank(identity) && StringsKt__StringsKt.isBlank(password)) {
            return;
        }
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 56;
        gyo gyoVar = new gyo();
        gyo.e eVar = new gyo.e();
        gyo.c cVar = new gyo.c();
        int i = basicInfo.d;
        if (i == 2) {
            eVar.c = password;
            gyoVar.r(eVar);
        } else if (i == 4) {
            cVar.c = identity;
            cVar.d = password;
            gyoVar.q(cVar);
        }
        gyoVar.e = basicInfo;
        txo txoVar = new txo();
        txoVar.x0(gyoVar);
        s7rVar.c0(txoVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, null, 0, 8, null);
    }
}
