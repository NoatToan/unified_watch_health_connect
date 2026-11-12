package com.huami.bluetooth.profile.channel.module.voice.command;

import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0014R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/command/TTSTextCommand;", "Lcom/huami/bluetooth/profile/channel/module/voice/command/VoiceCommand;", "", "getBytes", "", "c", "Ljava/lang/String;", "text", "<init>", "(Ljava/lang/String;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class TTSTextCommand extends VoiceCommand {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String text;

    public TTSTextCommand(@NotNull String str) {
        super(9);
        this.text = str;
    }

    @Override // com.huami.bluetooth.profile.channel.module.voice.command.VoiceCommand
    @NotNull
    public byte[] getBytes() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String str = this.text;
        Charset charset = Charsets.UTF_8;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        byteArrayOutputStream.write(str.getBytes(charset));
        byteArrayOutputStream.write(0);
        return byteArrayOutputStream.toByteArray();
    }
}
