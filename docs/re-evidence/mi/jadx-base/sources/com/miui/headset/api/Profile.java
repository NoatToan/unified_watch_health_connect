package com.miui.headset.api;

import androidx.annotation.IntRange;
import com.xiaomi.smarthome.homeroom.model.Home;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H'J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H'J \u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H'J(\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0003H'J*\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\r\u001a\u00020\u0003H'¨\u0006\u000e"}, d2 = {"Lcom/miui/headset/api/Profile;", "", "connect", "", "hostId", "", Home.JSON_KEY_ADDRESS, "deviceId", "disconnect", "getHeadsetProperty", "updateHeadsetMode", "opAncMode", "updateHeadsetVolume", "volume", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Profile {
    int connect(@NotNull String hostId, @NotNull String address, @NotNull String deviceId);

    int disconnect(@NotNull String hostId, @NotNull String address, @NotNull String deviceId);

    int getHeadsetProperty(@NotNull String hostId, @NotNull String address, @NotNull String deviceId);

    int updateHeadsetMode(@NotNull String hostId, @NotNull String address, @NotNull String deviceId, int opAncMode);

    int updateHeadsetVolume(@NotNull String hostId, @NotNull String address, @NotNull String deviceId, @IntRange(from = 0, to = 100) int volume);
}
