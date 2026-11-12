package com.xiaomi.ai.android.codec;

import com.xiaomi.ai.android.core.Engine;
import com.xiaomi.ai.android.core.e;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTAudioModuleCore;
import defpackage.e01;
import defpackage.wpe;

/* JADX INFO: loaded from: classes6.dex */
public class AudioEncoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f10872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10873b;
    private long c;
    private byte[] d;

    public AudioEncoder(Engine engine) {
        this.f10872a = (e) engine;
    }

    private native void native_delete(long j);

    private native int native_encode(long j, byte[] bArr, byte[] bArr2, boolean z);

    private native int native_init(long j);

    private native long native_new();

    private native int native_setEncoderMode(long j, int i);

    private native int native_setOpusBitrate(long j, int i);

    public int a(byte[] bArr, boolean z) {
        if (this.f10873b.equals("BV32_FLOAT")) {
            this.d = new byte[(((bArr.length - 1) / 160) + 1) * 20];
        }
        return native_encode(this.c, bArr, this.d, z);
    }

    public boolean b() {
        long j;
        c();
        e01 e01VarI = this.f10872a.i();
        String strJ = e01VarI.j("asr.codec", "PCM");
        this.f10873b = strJ;
        if ("PCM".equals(strJ)) {
            wpe.e("AudioEncoder", "init: no need encode pcm");
            return false;
        }
        long jNative_new = native_new();
        this.c = jNative_new;
        if (jNative_new == 0) {
            wpe.e("AudioEncoder", "init: failed to new native instance");
            return false;
        }
        if (this.f10873b.equals("BV32_FLOAT")) {
            native_setEncoderMode(this.c, 1);
        } else if (this.f10873b.equals("OPUS")) {
            native_setEncoderMode(this.c, 2);
            int i = 32000;
            if (32000 == e01VarI.f("asr.opus.bitrate", 32000)) {
                j = this.c;
            } else {
                j = this.c;
                i = MIOTAudioModuleCore.COMPRESSED_AUDIO_FILE_BIT_RATE;
            }
            native_setOpusBitrate(j, i);
            this.d = new byte[4096];
        }
        native_init(this.c);
        return true;
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

    public byte[] a() {
        return this.d;
    }
}
