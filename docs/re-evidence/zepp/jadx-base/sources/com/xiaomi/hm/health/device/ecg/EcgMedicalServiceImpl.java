package com.xiaomi.hm.health.device.ecg;

import android.content.Context;
import com.huami.discovery.bridge.model.WebItem;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.ecg.util.EcgMedicalService;
import com.huami.web.container.WebActivity;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.medical.MedicalResource;
import com.xiaomi.hm.health.device.medical.MedicalUtilKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0006H\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/device/ecg/EcgMedicalServiceImpl;", "Lcom/huami/watch/companion/ecg/util/EcgMedicalService;", "", "source", "", "isMedicalSource", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "isMedicalCollectSource", "atrialText", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "url", "", "openWeb", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class EcgMedicalServiceImpl implements EcgMedicalService {
    @Override // com.huami.watch.companion.ecg.util.EcgMedicalService
    public int atrialText(int source) {
        return MedicalResource.INSTANCE.get(source).getAtrial_fib_text();
    }

    @Override // com.huami.watch.companion.ecg.util.EcgMedicalService
    public boolean isMedicalCollectSource(int source) {
        return MedicalUtilKt.isMedicalCollectDevice(source);
    }

    @Override // com.huami.watch.companion.ecg.util.EcgMedicalService
    public boolean isMedicalSource(int source) {
        return MedicalUtilKt.isMedicalDevice(source);
    }

    @Override // com.huami.watch.companion.ecg.util.EcgMedicalService
    public void openWeb(@NotNull Context context, @NotNull String url) {
        WebActivity.launch(context, new WebItem(url));
    }

    @Override // com.huami.watch.companion.ecg.util.EcgMedicalService
    public int atrialText(@NotNull HMDeviceSource source) {
        return MedicalResource.INSTANCE.get(source).getAtrial_fib_text();
    }

    @Override // com.huami.watch.companion.ecg.util.EcgMedicalService
    public boolean isMedicalCollectSource(@NotNull HMDeviceSource source) {
        return MedicalUtilKt.isMedicalCollectDevice(source);
    }

    @Override // com.huami.watch.companion.ecg.util.EcgMedicalService
    public boolean isMedicalSource(@NotNull HMDeviceSource source) {
        return MedicalUtilKt.isMedicalDevice(source);
    }
}
