package com.xiaomi.fitness.aivs.huami;

import com.hm.opuslib.OpusTool;
import com.huami.bluetooth.profile.channel.module.voice.VoiceConfig;
import com.xiaomi.fitness.aivs.base.BaseEventSession;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.ShortCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0018\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0011H\u0002J\u0018\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u0011H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/aivs/huami/HuamiEventSession;", "Lcom/xiaomi/fitness/aivs/base/BaseEventSession;", "did", "", "sessionId", "", "mAivsService", "Lcom/xiaomi/fitness/aivs/huami/HuamiAivsService;", "<init>", "(Ljava/lang/String;BLcom/xiaomi/fitness/aivs/huami/HuamiAivsService;)V", "mOpusTool", "Lcom/hm/opuslib/OpusTool;", "getMOpusTool", "()Lcom/hm/opuslib/OpusTool;", "setMOpusTool", "(Lcom/hm/opuslib/OpusTool;)V", "decoderIndex", "", "getDecoderIndex", "()I", "setDecoderIndex", "(I)V", "createDecoder", "", "destroyDecoder", "decodePcmData", "", "data", "noiseReduction", "buffer", "", "length", "toByteArray", "src", "len", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HuamiEventSession extends BaseEventSession {
    private int decoderIndex;

    @NotNull
    private final HuamiAivsService mAivsService;

    @NotNull
    private OpusTool mOpusTool;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HuamiEventSession(@NotNull String did, byte b2, @NotNull HuamiAivsService mAivsService) {
        super(did, b2, mAivsService);
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(mAivsService, "mAivsService");
        this.mAivsService = mAivsService;
        this.mOpusTool = new OpusTool();
        this.decoderIndex = -1;
        createDecoder();
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0009 A[PHI: r2
      0x0009: PHI (r2v2 short) = (r2v0 short), (r2v1 short) binds: [B:5:0x0007, B:8:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    private final void noiseReduction(short[] buffer, int length) {
        for (int i = 0; i < length; i++) {
            short s = buffer[i];
            short s2 = ShortCompanionObject.MAX_VALUE;
            if (s > Short.MAX_VALUE) {
                s = s2;
            } else {
                s2 = -32767;
                if (s < -32767) {
                    s = s2;
                }
            }
            buffer[i] = s;
        }
    }

    private final byte[] toByteArray(short[] src, int len) {
        byte[] bArr = new byte[len << 1];
        for (int i = 0; i < len; i++) {
            int i2 = i * 2;
            short s = src[i];
            bArr[i2] = (byte) s;
            bArr[i2 + 1] = (byte) (s >> 8);
        }
        return bArr;
    }

    @Override // com.xiaomi.fitness.aivs.base.BaseEventSession
    public void createDecoder() {
        try {
            this.decoderIndex = this.mOpusTool.init();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.xiaomi.fitness.aivs.base.BaseEventSession
    @Nullable
    public byte[] decodePcmData(@NotNull byte[] data) {
        int iDecodeBytes;
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.decoderIndex < 0) {
            return null;
        }
        short[] sArr = new short[1024];
        VoiceConfig voiceConfig = this.mAivsService.getVoiceConfig();
        byte recordCodec = voiceConfig != null ? voiceConfig.getRecordCodec() : (byte) 1;
        synchronized (getMLock()) {
            iDecodeBytes = this.mOpusTool.decodeBytes(data, sArr, recordCodec);
            Unit unit = Unit.INSTANCE;
        }
        noiseReduction(sArr, iDecodeBytes);
        return toByteArray(sArr, iDecodeBytes);
    }

    @Override // com.xiaomi.fitness.aivs.base.BaseEventSession
    public void destroyDecoder() {
        try {
            synchronized (getMLock()) {
                this.mOpusTool.deinit();
                this.decoderIndex = -1;
                Unit unit = Unit.INSTANCE;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final int getDecoderIndex() {
        return this.decoderIndex;
    }

    @NotNull
    public final OpusTool getMOpusTool() {
        return this.mOpusTool;
    }

    public final void setDecoderIndex(int i) {
        this.decoderIndex = i;
    }

    public final void setMOpusTool(@NotNull OpusTool opusTool) {
        Intrinsics.checkNotNullParameter(opusTool, "<set-?>");
        this.mOpusTool = opusTool;
    }

    public /* synthetic */ HuamiEventSession(String str, byte b2, HuamiAivsService huamiAivsService, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? (byte) 0 : b2, huamiAivsService);
    }
}
