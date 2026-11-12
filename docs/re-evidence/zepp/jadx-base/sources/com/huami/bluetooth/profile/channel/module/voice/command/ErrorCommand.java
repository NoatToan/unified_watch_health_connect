package com.huami.bluetooth.profile.channel.module.voice.command;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.text.Charsets;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0014R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/command/ErrorCommand;", "Lcom/huami/bluetooth/profile/channel/module/voice/command/VoiceCommand;", "", "getBytes", "", "c", LogUtil.I, "errorCode", "", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", SOAP.ERROR_DESCRIPTION, "<init>", "(ILjava/lang/String;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ErrorCommand extends VoiceCommand {
    public static final int ASR_TIME_OUT = 8;
    public static final int INVALID_PARAMETER = 5;
    public static final int NETWORK_ERROR = 3;
    public static final int NETWORK_TIMEOUT = 4;
    public static final int NOT_SUPPORT = 10;
    public static final int NO_NETWORK = 2;
    public static final int RESPONSE_INVALID = 7;
    public static final int TTS_TIME_OUT = 9;
    public static final int UNAUTHORIZED = 6;
    public static final int UNKNOWN_ERROR = 1;
    public static final int UN_SUPPORT_FUNCTION = 11;
    public static final int UN_SUPPORT_LANGUAGE = 12;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int errorCode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String errorDescription;

    public ErrorCommand(int i, @NotNull String str) {
        super(15);
        this.errorCode = i;
        this.errorDescription = str;
    }

    @Override // com.huami.bluetooth.profile.channel.module.voice.command.VoiceCommand
    @NotNull
    public byte[] getBytes() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(this.errorCode);
        String str = this.errorDescription;
        Charset charset = Charsets.UTF_8;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        byteArrayOutputStream.write(str.getBytes(charset));
        byteArrayOutputStream.write(0);
        return byteArrayOutputStream.toByteArray();
    }
}
