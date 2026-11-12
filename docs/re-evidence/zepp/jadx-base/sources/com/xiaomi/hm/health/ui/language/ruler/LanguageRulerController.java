package com.xiaomi.hm.health.ui.language.ruler;

import androidx.annotation.WorkerThread;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\n\u001a\u00020\u0006H'¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/ui/language/ruler/LanguageRulerController;", "", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "hmBaseDevice", "Lcom/xiaomi/hm/health/ui/language/ruler/BaseLangRuler;", "getFitDeviceLanguageRuler", "", "isBind", "", "applyUnilateralLangRuler", "entranceVisible", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface LanguageRulerController {
    void applyUnilateralLangRuler(boolean isBind, @Nullable HMBaseDevice hmBaseDevice);

    @WorkerThread
    boolean entranceVisible();

    @Nullable
    BaseLangRuler getFitDeviceLanguageRuler(@Nullable HMBaseDevice hmBaseDevice);
}
