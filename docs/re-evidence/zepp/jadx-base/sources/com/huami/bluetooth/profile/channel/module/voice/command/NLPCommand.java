package com.huami.bluetooth.profile.channel.module.voice.command;

import com.huami.bluetooth.profile.channel.module.voice.content.NLPContent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/command/NLPCommand;", "Lcom/huami/bluetooth/profile/channel/module/voice/command/VoiceCommand;", "", "getBytes", "Lcom/huami/bluetooth/profile/channel/module/voice/content/NLPContent;", "c", "Lcom/huami/bluetooth/profile/channel/module/voice/content/NLPContent;", "content", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/voice/content/NLPContent;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class NLPCommand extends VoiceCommand {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final NLPContent content;

    public NLPCommand(@NotNull NLPContent nLPContent) {
        super(8);
        this.content = nLPContent;
    }

    @Override // com.huami.bluetooth.profile.channel.module.voice.command.VoiceCommand
    @Nullable
    public byte[] getBytes() {
        return this.content.toByteArray(getVersion());
    }
}
