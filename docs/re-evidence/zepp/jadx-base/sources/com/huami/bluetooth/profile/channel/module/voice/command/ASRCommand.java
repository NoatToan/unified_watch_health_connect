package com.huami.bluetooth.profile.channel.module.voice.command;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0014R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/command/ASRCommand;", "Lcom/huami/bluetooth/profile/channel/module/voice/command/VoiceCommand;", "", "getBytes", "", "c", "Ljava/lang/String;", "text", "", GoogleApiAvailabilityLight.a, "Z", "isFinal", "<init>", "(Ljava/lang/String;Z)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ASRCommand extends VoiceCommand {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String text;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isFinal;

    public ASRCommand(@NotNull String str, boolean z) {
        super(7);
        this.text = str;
        this.isFinal = z;
    }

    @Override // com.huami.bluetooth.profile.channel.module.voice.command.VoiceCommand
    @NotNull
    public byte[] getBytes() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(this.isFinal ? 1 : 0);
        String str = this.text;
        Charset charset = Charsets.UTF_8;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        byteArrayOutputStream.write(str.getBytes(charset));
        byteArrayOutputStream.write(0);
        return byteArrayOutputStream.toByteArray();
    }

    public /* synthetic */ ASRCommand(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z);
    }
}
