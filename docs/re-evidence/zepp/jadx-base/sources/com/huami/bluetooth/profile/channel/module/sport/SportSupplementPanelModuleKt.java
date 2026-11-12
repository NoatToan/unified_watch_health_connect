package com.huami.bluetooth.profile.channel.module.sport;

import com.xiaomi.hm.health.bt.profile.sport.SportCommand;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\b\b\u001a \u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\"%\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"", "Lcom/xiaomi/hm/health/bt/profile/sport/SportCommand;", "", "value", "findKeyByValue", "a", "Ljava/util/Map;", "getControlCommandMap", "()Ljava/util/Map;", "controlCommandMap", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class SportSupplementPanelModuleKt {

    @NotNull
    private static final Map<SportCommand, Byte> a = r.mapOf(TuplesKt.to(SportCommand.START, (byte) 1), TuplesKt.to(SportCommand.PAUSE, (byte) 2), TuplesKt.to(SportCommand.RESUME, (byte) 3), TuplesKt.to(SportCommand.STOP, (byte) 4));

    @Nullable
    public static final SportCommand findKeyByValue(@NotNull Map<SportCommand, Byte> map, byte b) {
        SportCommand key = null;
        for (Map.Entry<SportCommand, Byte> entry : map.entrySet()) {
            if (entry.getValue().byteValue() == b) {
                key = entry.getKey();
            }
        }
        return key;
    }

    @NotNull
    public static final Map<SportCommand, Byte> getControlCommandMap() {
        return a;
    }
}
