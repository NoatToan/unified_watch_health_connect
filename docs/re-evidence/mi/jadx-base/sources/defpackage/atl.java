package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class atl extends qhh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f3440b = "SendKeyPacket";
    public ysl c = null;
    public xsl d = null;

    public xsl b() {
        return this.d;
    }

    public ysl c() {
        return this.c;
    }

    public int d(xsl xslVar) {
        int iE = e(xslVar, (byte) 1);
        voe.a(this.f3440b, "make send packet success");
        return iE;
    }

    public final int e(xsl xslVar, byte b2) {
        byte[] bArrA;
        short length;
        if (xslVar != null) {
            bArrA = xslVar.a();
            if (bArrA == null) {
                voe.b(this.f3440b, "data is null");
                return -1;
            }
            length = (short) bArrA.length;
        } else {
            bArrA = null;
            length = 0;
        }
        ysl yslVar = new ysl(b2, length);
        this.c = yslVar;
        byte[] bArrA2 = yslVar.a();
        if (bArrA2 == null) {
            voe.b(this.f3440b, "send key header is null");
            return -1;
        }
        byte[] bArrA3 = new j6j((byte) 4, (short) (((short) bArrA2.length) + length)).a();
        if (bArrA3 == null) {
            voe.b(this.f3440b, "rc header is null");
            return -1;
        }
        if (length == 0) {
            this.f31524a = l73.a(bArrA3, bArrA2);
        } else {
            this.f31524a = l73.b(bArrA3, bArrA2, bArrA);
        }
        voe.a(this.f3440b, "make send key packet success");
        return 0;
    }

    public int f(byte[] bArr) {
        byte[] bArr2 = new byte[7];
        System.arraycopy(bArr, 3, bArr2, 0, 7);
        this.c = new ysl(bArr2);
        voe.a(this.f3440b, "send key header parsed");
        int iD = this.c.d();
        voe.a(this.f3440b, "data length:" + iD);
        if (iD + 10 > bArr.length) {
            voe.a(this.f3440b, "send key data length is not correct");
            return -1;
        }
        byte b2 = this.c.b();
        if (b2 == 1) {
            voe.a(this.f3440b, "to parse send");
            byte[] bArr3 = new byte[iD];
            System.arraycopy(bArr, 10, bArr3, 0, iD);
            xsl xslVar = new xsl();
            this.d = xslVar;
            if (xslVar.i(bArr3) >= 0) {
                return 1;
            }
            voe.a(this.f3440b, "parse send key data control data failed.");
            return -1;
        }
        if (b2 != 2) {
            voe.a(this.f3440b, "invalid code");
            return -1;
        }
        voe.a(this.f3440b, "to parse send key response");
        byte[] bArr4 = new byte[iD];
        System.arraycopy(bArr, 10, bArr4, 0, iD);
        xsl xslVar2 = new xsl();
        this.d = xslVar2;
        if (xslVar2.h(bArr4) >= 0) {
            return 2;
        }
        voe.a(this.f3440b, "parse send key response data control data failed.");
        return -1;
    }
}
