package defpackage;

import com.huami.bluetooth.profile.channel.module.ScaleSettingModule;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lyk;", "", "Lcom/huami/bluetooth/profile/channel/module/ScaleSettingModule$a$a;", "cmd", "Lcom/huami/bluetooth/profile/channel/module/ScaleSettingModule$a$a;", PluginDeviceInfo.FDESC, "()Lcom/huami/bluetooth/profile/channel/module/ScaleSettingModule$a$a;", "<init>", "(Ljava/lang/String;ILcom/huami/bluetooth/profile/channel/module/ScaleSettingModule$a$a;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public enum yk {
    MODEL_SMALL_WEIGHT(ScaleSettingModule.Companion.EnumC0270a.y),
    MODEL_MERGE_WEIGHT(ScaleSettingModule.Companion.EnumC0270a.A),
    MODEL_PREGNANT(ScaleSettingModule.Companion.EnumC0270a.B),
    MODEL_PRESSURE(ScaleSettingModule.Companion.EnumC0270a.D),
    MODEL_BABY_WEIGHT(ScaleSettingModule.Companion.EnumC0270a.E);


    @NotNull
    public final ScaleSettingModule.Companion.EnumC0270a t;

    yk(ScaleSettingModule.Companion.EnumC0270a enumC0270a) {
        this.t = enumC0270a;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ScaleSettingModule.Companion.EnumC0270a getT() {
        return this.t;
    }
}
