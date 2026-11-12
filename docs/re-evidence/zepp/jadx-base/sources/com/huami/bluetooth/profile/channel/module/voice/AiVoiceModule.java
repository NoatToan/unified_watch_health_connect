package com.huami.bluetooth.profile.channel.module.voice;

import com.huami.bluetooth.profile.channel.ChannelApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/AiVoiceModule;", "Lcom/huami/bluetooth/profile/channel/module/voice/VoiceModule;", "", "getModule", "()I", "module", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelController", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class AiVoiceModule extends VoiceModule {
    public static final int VOICE_MODULE_AI = 16;

    public AiVoiceModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
    }

    @Override // com.huami.bluetooth.profile.channel.module.voice.VoiceModule, com.huami.bluetooth.profile.channel.module.BaseModule
    /* JADX INFO: renamed from: getModule */
    public int getChannelModule() {
        return 16;
    }
}
