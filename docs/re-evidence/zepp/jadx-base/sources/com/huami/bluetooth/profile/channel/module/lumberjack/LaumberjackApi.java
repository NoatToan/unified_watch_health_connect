package com.huami.bluetooth.profile.channel.module.lumberjack;

import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.xiaomi.ai.core.AivsConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\u0006\u0010\t\u001a\u00020\u0007H&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u0002H&J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH&J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH&¨\u0006\u0012"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/lumberjack/LaumberjackApi;", "", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "Lcom/huami/bluetooth/profile/channel/module/lumberjack/Version;", "queryVersion", "", "domain", "", "openStream", AivsConfig.Tts.AUDIO_TYPE_STREAM, "", "closeStream", "closeAll", "Lcom/huami/bluetooth/profile/channel/module/lumberjack/LogCallback;", "callback", "", "registerLogCallback", "unregisterLogCallback", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface LaumberjackApi {
    @NotNull
    Response<Boolean> closeAll();

    @NotNull
    Response<Boolean> closeStream(int stream);

    @NotNull
    Response<Integer> openStream(@NotNull String domain);

    @NotNull
    Response<Version> queryVersion();

    void registerLogCallback(@NotNull LogCallback callback);

    void unregisterLogCallback(@NotNull LogCallback callback);
}
