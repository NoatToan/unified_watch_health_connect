package com.huami.bluetooth.profile.channel.module;

import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/MeasureMode;", "", "Lcom/huami/bluetooth/profile/channel/module/ScaleSettingModule$Companion$SettingCmd;", Constant.h, "Lcom/huami/bluetooth/profile/channel/module/ScaleSettingModule$Companion$SettingCmd;", "getCmd", "()Lcom/huami/bluetooth/profile/channel/module/ScaleSettingModule$Companion$SettingCmd;", "<init>", "(Ljava/lang/String;ILcom/huami/bluetooth/profile/channel/module/ScaleSettingModule$Companion$SettingCmd;)V", "MODEL_SMALL_WEIGHT", "MODEL_MERGE_WEIGHT", "MODEL_PREGNANT", "MODEL_PRESSURE", "MODEL_BABY_WEIGHT", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public enum MeasureMode {
    MODEL_SMALL_WEIGHT(ScaleSettingModule.Companion.SettingCmd.SET_SMALL_WEIGHT),
    MODEL_MERGE_WEIGHT(ScaleSettingModule.Companion.SettingCmd.SET_MERGE_WEIGHT),
    MODEL_PREGNANT(ScaleSettingModule.Companion.SettingCmd.SET_PREGNANT_MODE),
    MODEL_PRESSURE(ScaleSettingModule.Companion.SettingCmd.SET_PRESSURE),
    MODEL_BABY_WEIGHT(ScaleSettingModule.Companion.SettingCmd.SET_BABY_WEIGHT);


    @NotNull
    private final ScaleSettingModule.Companion.SettingCmd cmd;

    MeasureMode(ScaleSettingModule.Companion.SettingCmd settingCmd) {
        this.cmd = settingCmd;
    }

    @NotNull
    public final ScaleSettingModule.Companion.SettingCmd getCmd() {
        return this.cmd;
    }
}
