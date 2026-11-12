package defpackage;

import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;

/* JADX INFO: loaded from: classes8.dex */
public class egs extends HMProSyncDataBaseProfile {
    public static udt i(byte[] bArr) {
        int i;
        int i2;
        if (bArr == null || bArr.length == 0) {
            t5t.d(a6t.TAG, "empty pai data");
            return null;
        }
        udt udtVar = new udt();
        int i3 = bArr[0] & 255;
        long j = (bArr[1] & 255) | ((bArr[2] & 255) << 8) | ((bArr[3] & 255) << 16) | ((bArr[4] & 255) << 24);
        long j2 = ((bArr[6] & 255) << 8) | (bArr[5] & 255) | ((bArr[7] & 255) << 16) | ((bArr[8] & 255) << 24);
        float[] fArr = {Float.intBitsToFloat((bArr[9] & 255) | ((bArr[10] & 255) << 8) | ((bArr[11] & 255) << 16) | ((bArr[12] & 255) << 24)), Float.intBitsToFloat((bArr[13] & 255) | ((bArr[14] & 255) << 8) | ((bArr[15] & 255) << 16) | ((bArr[16] & 255) << 24)), Float.intBitsToFloat((bArr[17] & 255) | ((bArr[18] & 255) << 8) | ((bArr[19] & 255) << 16) | ((bArr[20] & 255) << 24)), Float.intBitsToFloat(((bArr[22] & 255) << 8) | (bArr[21] & 255) | ((bArr[23] & 255) << 16) | ((bArr[24] & 255) << 24)), Float.intBitsToFloat(((bArr[26] & 255) << 8) | (bArr[25] & 255) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 24)), Float.intBitsToFloat((bArr[29] & 255) | ((bArr[30] & 255) << 8) | ((bArr[31] & 255) << 16) | ((bArr[32] & 255) << 24)), Float.intBitsToFloat(((bArr[34] & 255) << 8) | (bArr[33] & 255) | ((bArr[35] & 255) << 16) | ((bArr[36] & 255) << 24))};
        float fIntBitsToFloat = Float.intBitsToFloat((bArr[37] & 255) | ((bArr[38] & 255) << 8) | ((bArr[39] & 255) << 16) | ((bArr[40] & 255) << 24));
        float fIntBitsToFloat2 = Float.intBitsToFloat((bArr[41] & 255) | ((bArr[42] & 255) << 8) | ((bArr[43] & 255) << 16) | ((bArr[44] & 255) << 24));
        float fIntBitsToFloat3 = Float.intBitsToFloat((bArr[45] & 255) | ((bArr[46] & 255) << 8) | ((bArr[47] & 255) << 16) | ((bArr[48] & 255) << 24));
        int i4 = (bArr[49] & 255) | ((bArr[50] & 255) << 8);
        int i5 = (bArr[51] & 255) | ((bArr[52] & 255) << 8);
        int i6 = (bArr[53] & 255) | ((bArr[54] & 255) << 8);
        float fIntBitsToFloat4 = Float.intBitsToFloat((bArr[55] & 255) | ((bArr[56] & 255) << 8) | ((bArr[57] & 255) << 16) | ((bArr[58] & 255) << 24));
        float fIntBitsToFloat5 = Float.intBitsToFloat((bArr[59] & 255) | ((bArr[60] & 255) << 8) | ((bArr[61] & 255) << 16) | ((bArr[62] & 255) << 24));
        int i7 = ((bArr[64] & 255) << 8) | (bArr[63] & 255);
        int i8 = ((bArr[66] & 255) << 8) | (bArr[65] & 255);
        int i9 = bArr[67] & 255;
        int i10 = bArr[68] & 255;
        udtVar.b(j * 1000);
        udtVar.i(j2);
        udtVar.c(fArr);
        udtVar.l(fIntBitsToFloat);
        udtVar.o(fIntBitsToFloat2);
        udtVar.g(fIntBitsToFloat3);
        udtVar.y(i4);
        udtVar.E(i5);
        udtVar.s(i6);
        udtVar.a(fIntBitsToFloat4);
        udtVar.r(fIntBitsToFloat5);
        udtVar.G(i7);
        udtVar.A(i8);
        udtVar.u(i9);
        udtVar.I(i10);
        udtVar.K(i3);
        int i11 = 69;
        if (i3 >= 2) {
            i = 4;
            udtVar.j(new float[]{Float.intBitsToFloat((bArr[69] & 255) | ((bArr[70] & 255) << 8) | ((bArr[71] & 255) << 16) | ((bArr[72] & 255) << 24)), Float.intBitsToFloat((bArr[73] & 255) | ((bArr[74] & 255) << 8) | ((bArr[75] & 255) << 16) | ((bArr[76] & 255) << 24)), Float.intBitsToFloat((bArr[77] & 255) | ((bArr[78] & 255) << 8) | ((bArr[79] & 255) << 16) | ((bArr[80] & 255) << 24)), Float.intBitsToFloat((bArr[81] & 255) | ((bArr[82] & 255) << 8) | ((bArr[83] & 255) << 16) | ((bArr[84] & 255) << 24)), Float.intBitsToFloat((bArr[85] & 255) | ((bArr[86] & 255) << 8) | ((bArr[87] & 255) << 16) | ((bArr[88] & 255) << 24)), Float.intBitsToFloat((bArr[89] & 255) | ((bArr[90] & 255) << 8) | ((bArr[91] & 255) << 16) | ((bArr[92] & 255) << 24)), Float.intBitsToFloat((bArr[93] & 255) | ((bArr[94] & 255) << 8) | ((bArr[95] & 255) << 16) | ((bArr[96] & 255) << 24))});
            i11 = 97;
        } else {
            i = 4;
        }
        if (i3 >= i) {
            int i12 = i11 + 1;
            udtVar.m(bArr[i11] & 255);
            i2 = 2;
            i11 += 2;
            udtVar.h(bArr[i12] & 255);
        } else {
            i2 = 2;
        }
        if (i3 >= 5) {
            udtVar.w(bArr[i11] & 255);
            udtVar.C(bArr[i11 + 1] & 255);
            udtVar.p(bArr[i11 + i2] & 255);
        }
        return udtVar;
    }
}
