package com.xiaomi.hm.health.device.setting.find;

import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bb\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/find/IFindDeviceHandler;", "", "", PointCategory.INIT, "Lcom/xiaomi/hm/health/bt/device/HMMiLiDevice;", "deviceRef", "a", "b", "deInit", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
interface IFindDeviceHandler {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static void deInit(@NotNull IFindDeviceHandler iFindDeviceHandler) {
        }

        public static void init(@NotNull IFindDeviceHandler iFindDeviceHandler) {
        }
    }

    void a(@NotNull HMMiLiDevice deviceRef);

    void b(@NotNull HMMiLiDevice deviceRef);

    void deInit();

    void init();
}
