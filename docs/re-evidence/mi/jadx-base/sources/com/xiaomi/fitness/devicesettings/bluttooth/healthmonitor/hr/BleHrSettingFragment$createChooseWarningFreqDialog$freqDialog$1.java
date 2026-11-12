package com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.hr;

import com.xiaomi.fitness.baseui.dialog.PickerDialog;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/hr/BleHrSettingFragment$createChooseWarningFreqDialog$freqDialog$1", "Lcom/xiaomi/fitness/baseui/dialog/PickerDialog$a;", "", "getCount", "()I", "index", "getValue", "(I)I", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BleHrSettingFragment$createChooseWarningFreqDialog$freqDialog$1 implements PickerDialog.a {
    final /* synthetic */ List<Integer> $warningRange;

    public BleHrSettingFragment$createChooseWarningFreqDialog$freqDialog$1(List<Integer> list) {
        this.$warningRange = list;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.PickerDialog.a
    public int getCount() {
        return this.$warningRange.size();
    }

    @Override // com.xiaomi.fitness.baseui.dialog.PickerDialog.a
    public int getValue(int index) {
        return this.$warningRange.get(index).intValue();
    }
}
