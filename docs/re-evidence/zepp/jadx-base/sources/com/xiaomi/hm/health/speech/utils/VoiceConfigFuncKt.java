package com.xiaomi.hm.health.speech.utils;

import com.huami.bluetooth.profile.channel.module.voice.VoiceConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;", "", "needGuide", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class VoiceConfigFuncKt {
    public static final boolean needGuide(@NotNull VoiceConfig voiceConfig) {
        return ((byte) (voiceConfig.getOptions() & 16)) == 16;
    }
}
