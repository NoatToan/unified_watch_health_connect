package com.huami.ai.speech.alexa;

import com.huami.bluetooth.profile.channel.module.voice.VoiceConfig;
import kotlin.Metadata;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Lcom/huami/ai/speech/alexa/AlexaWebApi;", "", "Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;", "voiceConfig", "Lokhttp3/Response;", "capabilities", "directives", "Lokhttp3/RequestBody;", "body", "events", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public interface AlexaWebApi {
    @NotNull
    Response capabilities(@NotNull VoiceConfig voiceConfig);

    @NotNull
    Response directives();

    @NotNull
    Response events(@NotNull RequestBody body);
}
