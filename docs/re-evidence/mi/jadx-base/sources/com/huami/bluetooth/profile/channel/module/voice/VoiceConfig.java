package com.huami.bluetooth.profile.channel.module.voice;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.api.c;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;", "Ljava/io/Serializable;", "", "options", c.f13755a, "getOptions", "()B", "recordCodec", "getRecordCodec", "", "version", "I", "getVersion", "()I", "ttsCodec", "Ljava/lang/Byte;", "getTtsCodec", "()Ljava/lang/Byte;", "setTtsCodec", "(Ljava/lang/Byte;)V", "", "configuration", "Ljava/lang/String;", "getConfiguration", "()Ljava/lang/String;", "setConfiguration", "(Ljava/lang/String;)V", "<init>", "(BBILjava/lang/Byte;Ljava/lang/String;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
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

    @Nullable
    private String configuration;
    private final byte options;
    private final byte recordCodec;

    @Nullable
    private Byte ttsCodec;
    private final int version;

    public VoiceConfig(byte b2, byte b3, int i, @Nullable Byte b4, @Nullable String str) {
        this.options = b2;
        this.recordCodec = b3;
        this.version = i;
        this.ttsCodec = b4;
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

    public final void setTtsCodec(@Nullable Byte b2) {
        this.ttsCodec = b2;
    }

    public /* synthetic */ VoiceConfig(byte b2, byte b3, int i, Byte b4, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(b2, b3, (i2 & 4) != 0 ? 1 : i, (i2 & 8) != 0 ? null : b4, (i2 & 16) != 0 ? null : str);
    }
}
