package com.huami.bluetooth.profile.channel;

import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import kotlin.Metadata;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/ChannelDataCallback;", "", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "progress", "", "onProgress", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "error", "onError", "", HTTP.CONTENT_RANGE_BYTES, "onSuccess", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface ChannelDataCallback {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static void onError(@NotNull ChannelDataCallback channelDataCallback, @NotNull ChannelResponse channelResponse) {
        }

        public static void onProgress(@NotNull ChannelDataCallback channelDataCallback, @NotNull Progress progress) {
        }

        public static void onSuccess(@NotNull ChannelDataCallback channelDataCallback, @NotNull byte[] bArr) {
        }
    }

    void onError(@NotNull ChannelResponse error);

    void onProgress(@NotNull Progress progress);

    void onSuccess(@NotNull byte[] bytes);
}
