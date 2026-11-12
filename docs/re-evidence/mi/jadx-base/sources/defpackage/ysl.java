package defpackage;

import androidx.work.WorkInfo;

/* JADX INFO: loaded from: classes4.dex */
public class ysl extends qhh {
    public static int f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f40495b = "SendKeyHeader";
    public byte c;
    public short d;
    public int e;

    public ysl(byte b2, short s) {
        this.c = (byte) 0;
        this.d = (short) 0;
        this.e = 0;
        voe.a("SendKeyHeader", "code:" + ((int) b2) + " length:" + ((int) s));
        this.c = b2;
        this.d = s;
        int i = f + 1;
        f = i;
        this.e = i;
        this.f31524a = new byte[]{b2, (byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255), (byte) ((s >> 8) & 255), (byte) (s & 255)};
        voe.a(this.f40495b, "add id[" + this.e + "] for code[" + ((int) b2) + "]");
        zsl.b(b2, this.e);
    }

    public byte b() {
        return this.c;
    }

    public int c() {
        return this.e;
    }

    public short d() {
        return this.d;
    }

    public ysl(byte[] bArr) {
        this.c = (byte) 0;
        this.d = (short) 0;
        this.e = 0;
        if (bArr.length != 7) {
            voe.b("SendKeyHeader", "Length is not correct");
            return;
        }
        byte[] bArr2 = (byte[]) bArr.clone();
        this.f31524a = bArr2;
        this.c = bArr2[0];
        this.e = (((((((((bArr2[1] & 255) << 8) & 65280) | (bArr2[2] & 255)) << 8) & 16776960) | (bArr2[3] & 255)) << 8) & WorkInfo.STOP_REASON_NOT_STOPPED) | (bArr2[4] & 255);
        this.d = (short) ((bArr2[6] & 255) | ((bArr2[5] << 8) & 65280));
        voe.a(this.f40495b, "code:" + ((int) this.c) + " length:" + ((int) this.d) + " id:" + this.e);
    }
}
