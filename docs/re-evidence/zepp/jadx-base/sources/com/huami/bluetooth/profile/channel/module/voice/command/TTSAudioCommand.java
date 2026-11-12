package com.huami.bluetooth.profile.channel.module.voice.command;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0014R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/command/TTSAudioCommand;", "Lcom/huami/bluetooth/profile/channel/module/voice/command/VoiceCommand;", "", "getBytes", "", "c", "Z", "isEOF", GoogleApiAvailabilityLight.a, "[B", "data", "<init>", "(Z[B)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class TTSAudioCommand extends VoiceCommand {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isEOF;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final byte[] data;

    public TTSAudioCommand(boolean z, @NotNull byte[] bArr) {
        super(10);
        this.isEOF = z;
        this.data = bArr;
    }

    @Override // com.huami.bluetooth.profile.channel.module.voice.command.VoiceCommand
    @NotNull
    public byte[] getBytes() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(this.isEOF ? 1 : 0);
        byteArrayOutputStream.write(GattUtils.intToBytes(this.data.length));
        byteArrayOutputStream.write(this.data);
        return byteArrayOutputStream.toByteArray();
    }
}
