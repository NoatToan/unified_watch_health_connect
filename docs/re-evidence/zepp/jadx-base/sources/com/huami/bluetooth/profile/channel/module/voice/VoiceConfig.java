package com.huami.bluetooth.profile.channel.module.voice;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \"2\u00020\u0001:\u0001\"B9\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b \u0010!R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;", "Ljava/io/Serializable;", "", "a", "B", "getOptions", "()B", "options", "b", "getRecordCodec", "recordCodec", "", "c", LogUtil.I, "getVersion", "()I", "version", GoogleApiAvailabilityLight.a, "Ljava/lang/Byte;", "getTtsCodec", "()Ljava/lang/Byte;", "setTtsCodec", "(Ljava/lang/Byte;)V", "ttsCodec", "", "e", "Ljava/lang/String;", "getConfiguration", "()Ljava/lang/String;", "setConfiguration", "(Ljava/lang/String;)V", "configuration", "<init>", "(BBILjava/lang/Byte;Ljava/lang/String;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class VoiceConfig implements Serializable {
    public static final int OPUS_16000_MONO_16BIT = 2;
    public static final int OPUS_8000_MONO_16BIT = 1;
    public static final int REQUIRE_ASR = 1;
    public static final int REQUIRE_NLP = 2;
    public static final int REQUIRE_TIPS = 16;
    public static final int REQUIRE_TTS_AUDIO = 8;
    public static final int REQUIRE_TTS_TEXT = 4;
    public static final int VERSION_1 = 1;
    public static final int VERSION_2 = 2;
    public static final int VERSION_3 = 3;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final byte options;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final byte recordCodec;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int version;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private Byte ttsCodec;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private String configuration;

    public VoiceConfig(byte b, byte b2, int i, @Nullable Byte b3, @Nullable String str) {
        this.options = b;
        this.recordCodec = b2;
        this.version = i;
        this.ttsCodec = b3;
        this.configuration = str;
    }

    @Nullable
    public final String getConfiguration() {
        return this.configuration;
    }

    public final byte getOptions() {
        return this.options;
    }

    public final byte getRecordCodec() {
        return this.recordCodec;
    }

    @Nullable
    public final Byte getTtsCodec() {
        return this.ttsCodec;
    }

    public final int getVersion() {
        return this.version;
    }

    public final void setConfiguration(@Nullable String str) {
        this.configuration = str;
    }

    public final void setTtsCodec(@Nullable Byte b) {
        this.ttsCodec = b;
    }

    public /* synthetic */ VoiceConfig(byte b, byte b2, int i, Byte b3, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(b, b2, (i2 & 4) != 0 ? 1 : i, (i2 & 8) != 0 ? null : b3, (i2 & 16) != 0 ? null : str);
    }
}
