package com.xiaomi.fitness.devicesettings.common.phonemute;

import com.xiaomi.fitness.devicesettings.export.phonemute.PhoneMuteHelper;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/phonemute/PhoneMuteHelperImpl;", "Lcom/xiaomi/fitness/devicesettings/export/phonemute/PhoneMuteHelper;", "<init>", "()V", "syncMuteMode", "", "isMute", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PhoneMuteHelperImpl implements PhoneMuteHelper {
    @Override // com.xiaomi.fitness.devicesettings.export.phonemute.PhoneMuteHelper
    public void syncMuteMode(boolean isMute) {
        PhoneMuteManager.INSTANCE.handleSyncBluetoothMuteMode(isMute, true);
    }
}
