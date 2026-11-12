package defpackage;

import health.compact.a.util.LogUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class ehd {
    private byte[] e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32975b = 0;
    private int d = 0;
    private HashMap<Integer, byte[]> h = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f32976c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32974a = 0;

    public void d(int i) {
        this.d = i;
    }

    public void e(boolean z) {
        this.f32976c = z;
    }

    public int e() {
        return this.f32974a;
    }

    public void b(int i) {
        this.f32974a = i;
    }

    public HashMap<Integer, byte[]> d() {
        return this.h;
    }

    public byte[] b() {
        return this.e;
    }

    public void a(byte[] bArr) {
        this.e = bArr;
    }

    public boolean d(int i, byte[] bArr) {
        this.h.put(Integer.valueOf(i), bArr);
        return this.f32976c && this.h.size() == this.f32974a;
    }

    public void c() {
        HashMap<Integer, byte[]> mapD = d();
        int iE = e();
        byte[] bArrD = new byte[0];
        for (int i = 0; i < iE; i++) {
            byte[] bArr = mapD.get(Integer.valueOf(i));
            if (bArr == null) {
                return;
            }
            bArrD = d(bArrD, bArr);
        }
        a(bArrD);
    }

    private byte[] d(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    protected dsm b(byte[] bArr, int i) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        dsm dsmVar = new dsm();
        dsmVar.e(ehn.d(bArr, 18, i));
        dsmVar.b(ehn.d(bArr, 18, i + 2));
        dsmVar.a(ehn.d(bArr, 18, i + 4));
        dsmVar.d(ehn.d(bArr, 18, i + 6));
        LogUtil.e("PDROPE_DataPackets", "RopeDataCharacteristic", dsmVar.toString());
        return dsmVar;
    }

    public boolean d(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i < i2) {
            i3 += bArr[i];
            i++;
        }
        return bArr[i2] == ((byte) (i3 & 255));
    }
}
