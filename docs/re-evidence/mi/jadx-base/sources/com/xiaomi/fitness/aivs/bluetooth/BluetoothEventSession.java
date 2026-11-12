package com.xiaomi.fitness.aivs.bluetooth;

import com.autonavi.amap.mapcore.tools.GlMapUtil;
import com.banya.opus.OpusDecoder;
import com.xiaomi.fitness.aivs.base.BaseAivsService;
import com.xiaomi.fitness.aivs.base.BaseEventSession;
import com.xiaomi.fitness.common.log.Logger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/aivs/bluetooth/BluetoothEventSession;", "Lcom/xiaomi/fitness/aivs/base/BaseEventSession;", "mDid", "", "mSessionId", "", "mAivsService", "Lcom/xiaomi/fitness/aivs/bluetooth/BluetoothAivsService;", "<init>", "(Ljava/lang/String;BLcom/xiaomi/fitness/aivs/bluetooth/BluetoothAivsService;)V", "decoder", "Lcom/banya/opus/OpusDecoder;", "getDecoder", "()Lcom/banya/opus/OpusDecoder;", "setDecoder", "(Lcom/banya/opus/OpusDecoder;)V", "decoderIndex", "", "getDecoderIndex", "()I", "setDecoderIndex", "(I)V", "createDecoder", "", "destroyDecoder", "decodePcmData", "", "data", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBluetoothEventSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BluetoothEventSession.kt\ncom/xiaomi/fitness/aivs/bluetooth/BluetoothEventSession\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n1#2:66\n*E\n"})
public final class BluetoothEventSession extends BaseEventSession {

    @NotNull
    private OpusDecoder decoder;
    private int decoderIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BluetoothEventSession(@NotNull String mDid, byte b2, @NotNull BluetoothAivsService mAivsService) {
        super(mDid, b2, mAivsService);
        Intrinsics.checkNotNullParameter(mDid, "mDid");
        Intrinsics.checkNotNullParameter(mAivsService, "mAivsService");
        this.decoder = new OpusDecoder(16000, 1, GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH, 80);
        this.decoderIndex = -1;
        createDecoder();
    }

    @Override // com.xiaomi.fitness.aivs.base.BaseEventSession
    public void createDecoder() {
        try {
            this.decoderIndex = this.decoder.a();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.xiaomi.fitness.aivs.base.BaseEventSession
    @Nullable
    public byte[] decodePcmData(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        byte[] bArrB = null;
        if (getAudioInputStopped()) {
            Logger.d(BaseAivsService.TAG, "audioInputStopped");
            return null;
        }
        try {
            if (this.decoderIndex >= 0) {
                synchronized (getMLock()) {
                    bArrB = this.decoder.b(this.decoderIndex, data, data.length);
                    Unit unit = Unit.INSTANCE;
                }
            } else {
                createDecoder();
                if (this.decoderIndex >= 0) {
                    synchronized (getMLock()) {
                        bArrB = this.decoder.b(this.decoderIndex, data, data.length);
                        Unit unit2 = Unit.INSTANCE;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bArrB;
    }

    @Override // com.xiaomi.fitness.aivs.base.BaseEventSession
    public void destroyDecoder() {
        if (this.decoderIndex >= 0) {
            synchronized (getMLock()) {
                this.decoder.c(this.decoderIndex);
                Logger.d(BaseAivsService.TAG, "decoder.destroy");
                this.decoderIndex = -1;
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @NotNull
    public final OpusDecoder getDecoder() {
        return this.decoder;
    }

    public final int getDecoderIndex() {
        return this.decoderIndex;
    }

    public final void setDecoder(@NotNull OpusDecoder opusDecoder) {
        Intrinsics.checkNotNullParameter(opusDecoder, "<set-?>");
        this.decoder = opusDecoder;
    }

    public final void setDecoderIndex(int i) {
        this.decoderIndex = i;
    }
}
