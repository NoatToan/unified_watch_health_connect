package defpackage;

import java.io.Serializable;
import okio.Utf8;

/* JADX INFO: loaded from: classes7.dex */
public class ejp implements Serializable {
    private static final long serialVersionUID = -204623211515444595L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ejq f33069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f33070b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33071c;
    private int d;
    private int e;
    private int f;

    public ejp(byte[] bArr) {
        c(bArr);
    }

    private void c(byte[] bArr) {
        byte b2;
        Boolean boolD;
        Boolean boolD2;
        if (bArr == null || bArr.length <= 9 || (boolD = ejr.d((b2 = bArr[2]), 7)) == null || (boolD2 = ejr.d(b2, 6)) == null) {
            return;
        }
        if (boolD.booleanValue()) {
            this.e = ((bArr[3] & 255) << 8) + (bArr[4] & 255);
            return;
        }
        byte b3 = (byte) (b2 & Utf8.REPLACEMENT_BYTE);
        byte b4 = bArr[5];
        byte b5 = bArr[6];
        byte b6 = bArr[7];
        byte b7 = bArr[8];
        byte b8 = bArr[9];
        byte b9 = bArr[10];
        if (b3 != 0) {
            this.f33069a = new ejq(b3);
            return;
        }
        if (boolD2.booleanValue()) {
            this.f = ((b4 & 255) << 8) + (b5 & 255);
            this.d = ((b6 & 255) << 8) + (b7 & 255);
            this.f33071c = ((b8 & 255) << 8) + (b9 & 255);
            this.f33070b = false;
            return;
        }
        this.e = ((bArr[3] & 255) << 8) + (bArr[4] & 255);
    }

    public int a() {
        return this.f;
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.f33071c;
    }

    public int e() {
        return this.e;
    }

    public boolean i() {
        return this.f33070b;
    }

    public ejq d() {
        return this.f33069a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("pressure:" + this.e).append(System.lineSeparator());
        stringBuffer.append("dbpValue:" + this.d).append(System.lineSeparator());
        stringBuffer.append("hhValue:" + this.f33071c).append(System.lineSeparator());
        stringBuffer.append("sbpValue:" + this.f).append(System.lineSeparator());
        return stringBuffer.toString();
    }
}
