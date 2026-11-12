package com.huami.bluetooth.profile.channel.module.voice;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&J\u0016\u0010\n\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\bH&J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&¨\u0006\u0010"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/ICtrlCallback;", "", "Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;", "config", "", "onStartSession", "onStopSession", "", "Lcom/huami/bluetooth/profile/channel/module/voice/AlertItem;", "alertList", "onAlertReceived", "alert", "onAlertChanged", "", "data", "onAudioData", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface ICtrlCallback {
    void onAlertChanged(@NotNull AlertItem alert);

    void onAlertReceived(@NotNull List<AlertItem> alertList);

    void onAudioData(@NotNull byte[] data);

    void onStartSession(@NotNull VoiceConfig config);

    void onStopSession();
}
