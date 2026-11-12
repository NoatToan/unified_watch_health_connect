package defpackage;

import com.miui.tsmclient.util.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public class g2s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f18518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18519b;
    public byte[] c;
    public final String d = "DigitalKey-TLVPaser:";

    public g2s(byte[] bArr, int i, byte[] bArr2) {
        this.f18518a = bArr;
        this.f18519b = i;
        this.c = bArr2;
        LogUtils.i("DigitalKey-TLVPaser:", "new tlv tag: " + f2s.f(bArr) + " len: " + i + " data: \n" + f2s.f(bArr2) + "\n ");
    }

    public byte[] a() {
        return this.f18518a;
    }

    public byte[] b() {
        return this.c;
    }
}
