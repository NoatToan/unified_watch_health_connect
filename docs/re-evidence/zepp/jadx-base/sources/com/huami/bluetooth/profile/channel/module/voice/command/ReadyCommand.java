package com.huami.bluetooth.profile.channel.module.voice.command;

import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Charsets;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/command/ReadyCommand;", "Lcom/huami/bluetooth/profile/channel/module/voice/command/VoiceCommand;", "", "getBytes", "", "", "c", "Ljava/util/List;", "tips", "<init>", "(Ljava/util/List;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ReadyCommand extends VoiceCommand {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final List<String> tips;

    /* JADX WARN: Multi-variable type inference failed */
    public ReadyCommand() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ReadyCommand(@Nullable List<String> list) {
        super(3);
        this.tips = list;
    }

    @Override // com.huami.bluetooth.profile.channel.module.voice.command.VoiceCommand
    @Nullable
    public byte[] getBytes() {
        if (this.tips == null) {
            return new byte[]{0};
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(this.tips.size());
        for (String str : this.tips) {
            Charset charset = Charsets.UTF_8;
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            byteArrayOutputStream.write(str.getBytes(charset));
            byteArrayOutputStream.write(0);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public /* synthetic */ ReadyCommand(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
