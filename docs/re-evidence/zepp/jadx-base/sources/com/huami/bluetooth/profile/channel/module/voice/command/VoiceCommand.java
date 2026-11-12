package com.huami.bluetooth.profile.channel.module.voice.command;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.tekartik.sqflite.Constant;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\r\b&\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0004H$R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0007R\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0007\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/command/VoiceCommand;", "", "", "a", "", "toByteArray", "getBytes", LogUtil.I, Constant.h, "b", "getVersion", "()I", "setVersion", "(I)V", "version", "<init>", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class VoiceCommand {
    public static final int CMD_ASR = 7;
    public static final int CMD_CONTINUE = 11;
    public static final int CMD_ERROR = 15;
    public static final int CMD_NLP = 8;
    public static final int CMD_SESSION_READY = 3;
    public static final int CMD_TTS_AUDIO = 10;
    public static final int CMD_TTS_TEXT = 9;
    public static final int CMD_VAD = 6;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int cmd;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int version = 1;

    public VoiceCommand(int i) {
        this.cmd = i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    private final int getCmd() {
        return this.cmd;
    }

    @Nullable
    public abstract byte[] getBytes();

    public final int getVersion() {
        return this.version;
    }

    public final void setVersion(int i) {
        this.version = i;
    }

    @NotNull
    public final byte[] toByteArray() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(getCmd());
        byte[] bytes = getBytes();
        if (bytes != null) {
            byteArrayOutputStream.write(bytes);
        }
        return byteArrayOutputStream.toByteArray();
    }
}
