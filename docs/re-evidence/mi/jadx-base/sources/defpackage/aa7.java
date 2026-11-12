package defpackage;

import com.google.typography.font.sfntly.Font;
import com.google.typography.font.sfntly.a;
import com.google.typography.font.sfntly.data.FontData;
import com.google.typography.font.sfntly.table.core.FontHeaderTable;
import com.google.typography.font.sfntly.table.core.NameTable;
import com.google.typography.font.sfntly.table.core.OS2Table;
import com.xiaomi.fitness.heartrate.finger.CustomizedFingerprintAcquiredInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class aa7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f824b = a.b();

    public aa7(boolean z) {
        this.f823a = z;
    }

    public final long a(int i, int i2, int i3, int i4, int i5) {
        FontData.DataSize dataSize = FontData.DataSize.ULONG;
        int size = dataSize.size() * 16;
        FontData.DataSize dataSize2 = FontData.DataSize.BYTE;
        return size + (dataSize2.size() * 12) + (FontData.DataSize.USHORT.size() * 12) + (i * dataSize2.size()) + (i2 * dataSize2.size()) + (i3 * dataSize2.size()) + (i4 * dataSize2.size()) + (i5 * dataSize2.size()) + (dataSize.size() * 5);
    }

    public apr b(Font font) throws IOException {
        byte[] bArrA;
        long j;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f824b.j(font, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        NameTable nameTable = (NameTable) font.h(tzo.g);
        byte[] bArrC = c(nameTable.r(3, 1, CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_LOW_BRIGHTNESS, 1));
        byte[] bArrC2 = c(nameTable.r(3, 1, CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_LOW_BRIGHTNESS, 2));
        byte[] bArrC3 = c(nameTable.r(3, 1, CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_LOW_BRIGHTNESS, 5));
        byte[] bArrC4 = c(nameTable.r(3, 1, CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_LOW_BRIGHTNESS, 4));
        if (this.f823a) {
            bArrA = new r9g().a(font);
            j = 4;
        } else {
            bArrA = byteArray;
            j = 0;
        }
        long jA = a(bArrC.length, bArrC2.length, bArrC3.length, bArrC4.length, bArrA.length);
        apr aprVarD = d((int) jA);
        OS2Table oS2Table = (OS2Table) font.h(tzo.h);
        int iP = aprVarD.P(0, jA);
        int iP2 = iP + aprVarD.P(iP, bArrA.length);
        int iP3 = iP2 + aprVarD.P(iP2, 131074L);
        int iP4 = iP3 + aprVarD.P(iP3, j);
        int iF = iP4 + f(iP4, oS2Table, aprVarD);
        int iG = iF + aprVarD.G(iF, (byte) 1);
        int iG2 = iG + aprVarD.G(iG, (byte) (1 & oS2Table.l()));
        int iP5 = iG2 + aprVarD.P(iG2, oS2Table.z());
        int iR = iP5 + aprVarD.R(iP5, (short) oS2Table.m());
        int iR2 = iR + aprVarD.R(iR, 20556);
        int iJ = iR2 + j(iR2, oS2Table, aprVarD);
        int iE = iJ + e(iJ, oS2Table, aprVarD);
        int iP6 = iE + aprVarD.P(iE, ((FontHeaderTable) font.h(tzo.c)).m());
        int iH = iP6 + h(iP6, aprVarD);
        int iG3 = iH + g(iH, aprVarD);
        int i = iG3 + i(iG3, bArrC, aprVarD);
        int iG4 = i + g(i, aprVarD);
        int i2 = iG4 + i(iG4, bArrC2, aprVarD);
        int iG5 = i2 + g(i2, aprVarD);
        int i3 = iG5 + i(iG5, bArrC3, aprVarD);
        int iG6 = i3 + g(i3, aprVarD);
        int i4 = iG6 + i(iG6, bArrC4, aprVarD);
        int iG7 = i4 + g(i4, aprVarD);
        int iG8 = iG7 + g(iG7, aprVarD);
        int iP7 = iG8 + aprVarD.P(iG8, 1346851650L);
        int iP8 = iP7 + aprVarD.P(iP7, 0L);
        int iG9 = iP8 + g(iP8, aprVarD);
        int iG10 = iG9 + g(iG9, aprVarD);
        int iP9 = iG10 + aprVarD.P(iG10, 0L);
        aprVarD.I(iP9 + aprVarD.P(iP9, 0L), bArrA, 0, bArrA.length);
        return aprVarD;
    }

    public final byte[] c(byte[] bArr) {
        if (bArr == null) {
            return new byte[0];
        }
        for (int i = 0; i < bArr.length; i += 2) {
            byte b2 = bArr[i];
            int i2 = i + 1;
            bArr[i] = bArr[i2];
            bArr[i2] = b2;
        }
        return bArr;
    }

    public final apr d(int i) {
        return apr.C(i);
    }

    public final int e(int i, OS2Table oS2Table, apr aprVar) {
        int iP;
        if (oS2Table.q() >= 1) {
            int iP2 = aprVar.P(i, oS2Table.r()) + i;
            iP = iP2 + aprVar.P(iP2, oS2Table.t());
        } else {
            int iP3 = aprVar.P(i, 1L) + i;
            iP = iP3 + aprVar.P(iP3, 0L);
        }
        return iP - i;
    }

    public final int f(int i, OS2Table oS2Table, apr aprVar) {
        byte[] bArrO = oS2Table.o();
        return aprVar.I(i, bArrO, 0, bArrO.length);
    }

    public final int g(int i, apr aprVar) {
        return aprVar.R(i, 0);
    }

    public final int h(int i, apr aprVar) {
        int iP = i;
        for (int i2 = 0; i2 < 4; i2++) {
            iP += aprVar.P(iP, 0L);
        }
        return iP - i;
    }

    public final int i(int i, byte[] bArr, apr aprVar) {
        int iR = aprVar.R(i, (short) bArr.length) + i;
        return (iR + aprVar.I(iR, bArr, 0, bArr.length)) - i;
    }

    public final int j(int i, OS2Table oS2Table, apr aprVar) {
        int iP = aprVar.P(i, oS2Table.u()) + i;
        int iP2 = iP + aprVar.P(iP, oS2Table.v());
        int iP3 = iP2 + aprVar.P(iP2, oS2Table.w());
        return (iP3 + aprVar.P(iP3, oS2Table.x())) - i;
    }
}
