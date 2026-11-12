package com.xiaomi.hm.health.ui.language.ruler;

import com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/ui/language/ruler/BilateralLangRuler;", "Lcom/xiaomi/hm/health/ui/language/ruler/BaseLangRuler;", "Lcom/xiaomi/hm/health/device/setting/life/DeviceLifeCycle;", "", "entranceVisible", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public abstract class BilateralLangRuler implements BaseLangRuler, DeviceLifeCycle {
    @Override // com.xiaomi.hm.health.ui.language.ruler.BaseLangRuler
    public boolean entranceVisible() {
        return true;
    }
}
