package com.xiaomi.ai.android.codec;

import com.xiaomi.ai.android.core.Engine;
import com.xiaomi.ai.android.core.d;
import com.xiaomi.ai.core.AivsConfig;
import com.xiaomi.ai.log.Logger;

/* JADX INFO: loaded from: classes18.dex */
public class AudioEncoder {
    private d a;
    private String b;
    private long c;
    private byte[] d;

    public AudioEncoder(Engine engine) {
        this.a = (d) engine;
    }

    private native void native_delete(long j);

    private native int native_encode(long j, byte[] bArr, byte[] bArr2, boolean z);

    private native int native_init(long j);

    private native long native_new();

    private native int native_setEncoderMode(long j, int i);

    private native int native_setOpusBitrate(long j, int i);

    public int a(byte[] bArr, boolean z) {
        if (this.b.equals(AivsConfig.Asr.CODEC_BV32_FLOAT)) {
            this.d = new byte[(((bArr.length - 1) / 160) + 1) * 20];
        }
        return native_encode(this.c, bArr, this.d, z);
    }

    public boolean a() {
        long j;
        c();
        AivsConfig aivsConfigB = this.a.b();
        String string = aivsConfigB.getString(AivsConfig.Asr.CODEC, AivsConfig.Asr.CODEC_PCM);
        this.b = string;
        if (AivsConfig.Asr.CODEC_PCM.equals(string)) {
            Logger.d("AudioEncoder", "init: no need encode pcm");
            return false;
        }
        long jNative_new = native_new();
        this.c = jNative_new;
        if (jNative_new == 0) {
            Logger.d("AudioEncoder", "init: failed to new native instance");
            return false;
        }
        if (this.b.equals(AivsConfig.Asr.CODEC_BV32_FLOAT)) {
            native_setEncoderMode(this.c, 1);
        } else if (this.b.equals(AivsConfig.Asr.CODEC_OPUS)) {
            native_setEncoderMode(this.c, 2);
            int i = 32000;
            if (32000 == aivsConfigB.getInt(AivsConfig.Asr.OPUS_BITRATE, 32000)) {
                j = this.c;
            } else {
                j = this.c;
                i = 64000;
            }
            native_setOpusBitrate(j, i);
            this.d = new byte[4096];
        }
        native_init(this.c);
        return true;
    }

    public byte[] b() {
        return this.d;
    }

    public void c() {
        long j = this.c;
        if (j != 0) {
            native_delete(j);
            this.c = 0L;
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        long j = this.c;
        if (j != 0) {
            native_delete(j);
            this.c = 0L;
        }
    }
}
