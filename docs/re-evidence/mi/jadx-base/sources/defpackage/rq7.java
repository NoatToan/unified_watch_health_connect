package defpackage;

import com.xiaomi.fitness.common.log.Logger;
import kotlin.UShort;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes7.dex */
public class rq7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short f32791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public short f32792b;
    public short c;
    public short d;

    public rq7() {
    }

    public void a() {
        short s = this.f32792b;
        short s2 = (short) (s + 1);
        this.f32792b = s2;
        if ((s & UShort.MAX_VALUE) > 32767 && (s2 & UShort.MAX_VALUE) < 32768) {
            this.f32791a = (short) (this.f32791a + 1);
        }
        rd7.f32436a.a((s2 & UShort.MAX_VALUE) | (this.f32791a << 16));
        Logger.i("EcoCryptoCounter", "addAppCount: high = " + ((int) this.f32791a) + ", low = " + ((int) this.f32792b) + ", count = " + ((this.f32791a << 16) | (65535 & this.f32792b)));
    }

    public short b() {
        return this.f32792b;
    }

    public byte[] c() {
        short s = this.f32792b;
        short s2 = this.f32791a;
        return new byte[]{(byte) (s & 255), (byte) (s >> 8), (byte) (s2 & 255), (byte) (s2 >> 8)};
    }

    public byte[] d() {
        short s = this.d;
        short s2 = this.c;
        return new byte[]{(byte) (s & 255), (byte) (s >> 8), (byte) (s2 & 255), (byte) (s2 >> 8)};
    }

    public void e() {
        this.f32791a = (short) 0;
        this.f32792b = (short) 0;
        this.c = (short) 0;
        this.d = (short) 0;
    }

    public boolean f(short s) {
        short s2 = this.c;
        short s3 = this.d;
        long j = (s2 << 16) | (s3 & UShort.MAX_VALUE);
        if ((s3 & UShort.MAX_VALUE) > 32767 && (s & UShort.MAX_VALUE) < 32768) {
            s2 = (short) (s2 + 1);
        }
        long j2 = (s2 << 16) | (s & UShort.MAX_VALUE);
        if (j >= j2 && j2 != 0) {
            return false;
        }
        this.c = s2;
        this.d = s;
        rd7.f32436a.b(j2);
        Logger.i("EcoCryptoCounter", "updateDeviceCount: high = " + ((int) this.c) + ", low = " + ((int) this.d) + ", count = " + j2);
        return true;
    }

    public rq7(long j, long j2) {
        this.f32792b = (short) (WebSocketProtocol.PAYLOAD_SHORT_MAX & j);
        this.f32791a = (short) (j >> 16);
        this.d = (short) (j2 >> 16);
        StringBuilder sb = new StringBuilder();
        sb.append("CryptoCounter: al = ");
        sb.append((int) this.f32792b);
        sb.append(", ah = ");
        sb.append((int) this.f32791a);
        sb.append(", dl = ");
        sb.append((int) this.d);
        sb.append("dh = ");
        sb.append((int) this.c);
    }
}
