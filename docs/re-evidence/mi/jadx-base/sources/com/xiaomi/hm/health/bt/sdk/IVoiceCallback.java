package com.xiaomi.hm.health.bt.sdk;

import com.huami.bluetooth.profile.channel.module.voice.VoiceConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public interface IVoiceCallback {
    void onAudioData(@NotNull byte[] bArr);

    void onStartSession(@NotNull VoiceConfig voiceConfig);

    void onStopSession();
}
