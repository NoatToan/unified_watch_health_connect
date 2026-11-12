package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class gpq extends qhh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f19220b = "VersionPacket";
    public dpq c = null;

    public dpq b() {
        return this.c;
    }

    public int c(dpq dpqVar) {
        int iD = d(dpqVar, (byte) 1);
        voe.a(this.f19220b, "make version packet success");
        return iD;
    }

    public final int d(dpq dpqVar, byte b2) {
        byte[] bArrA;
        short length;
        if (dpqVar != null) {
            bArrA = dpqVar.a();
            if (bArrA == null) {
                voe.b(this.f19220b, "data is null");
                return -1;
            }
            length = (short) bArrA.length;
        } else {
            bArrA = null;
            length = 0;
        }
        byte[] bArr = {b2};
        byte[] bArrA2 = new j6j((byte) 5, (short) (((short) 1) + length)).a();
        if (bArrA2 == null) {
            voe.b(this.f19220b, "rc header is null");
            return -1;
        }
        if (length == 0) {
            this.f31524a = l73.a(bArrA2, bArr);
        } else {
            this.f31524a = l73.b(bArrA2, bArr, bArrA);
        }
        voe.a(this.f19220b, "make version packet success");
        return 0;
    }

    public int e(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            voe.d(this.f19220b, "invalid packet");
            return -1;
        }
        byte[] bArr2 = new byte[1];
        System.arraycopy(bArr, 3, bArr2, 0, 1);
        byte b2 = bArr2[0];
        int length = bArr.length - 4;
        if (b2 == 1) {
            voe.a(this.f19220b, "to parse ver");
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, 4, bArr3, 0, length);
            dpq dpqVar = new dpq();
            this.c = dpqVar;
            if (dpqVar.i(bArr3) >= 0) {
                return 1;
            }
            voe.a(this.f19220b, "parse version data failed.");
            return -1;
        }
        if (b2 != 2) {
            voe.b(this.f19220b, "invalid code");
            return -1;
        }
        voe.a(this.f19220b, "to parse ver res");
        byte[] bArr4 = new byte[length];
        System.arraycopy(bArr, 4, bArr4, 0, length);
        dpq dpqVar2 = new dpq();
        this.c = dpqVar2;
        if (dpqVar2.h(bArr4) >= 0) {
            return 2;
        }
        voe.a(this.f19220b, "parse version res failed.");
        return -1;
    }
}
