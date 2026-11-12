package com.service.mi.common.apdu;

import defpackage.al5;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class CommonApdus {
    private CommonApdus() {
    }

    private static byte[] commandHeader(byte b2, byte b3, byte b4, byte b5) {
        return new byte[]{b2, b3, b4, b5};
    }

    public static final byte[] generateAPDU(byte b2, byte b3, byte b4, byte b5) throws GenerateAPDUException {
        try {
            return commandHeader(b2, b3, b4, b5);
        } catch (Exception e) {
            throw new GenerateAPDUException("case 1: error!", e);
        }
    }

    public static final byte[] generateData(byte b2, byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length + 2];
        bArr2[0] = b2;
        bArr2[1] = (byte) bArr.length;
        System.arraycopy(bArr, 0, bArr2, 2, bArr.length);
        return bArr2;
    }

    public static List<Capdu> getActivateCommonds(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Capdu("0", "00A4040009A00000015143525300", "9000"));
        try {
            arrayList.add(new Capdu("1", al5.a(generateAPDU((byte) -128, (byte) -16, (byte) 1, (byte) 1, generateData((byte) 79, al5.c(str)))), "9000"));
        } catch (GenerateAPDUException e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    public static List<Capdu> getCplcCommands() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Capdu("0", "00A4040008A000000151000000", "9000"));
        arrayList.add(new Capdu("1", "80CA9F7F00", "9000"));
        return arrayList;
    }

    public static List<Capdu> getDeactivateCommonds(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Capdu("0", "00A4040009A00000015143525300", "9000"));
        try {
            arrayList.add(new Capdu("1", al5.a(generateAPDU((byte) -128, (byte) -16, (byte) 1, (byte) 0, generateData((byte) 79, al5.c(str)))), "9000"));
        } catch (GenerateAPDUException e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    public static final byte[] generateAPDU(byte b2, byte b3, byte b4, byte b5, byte b6) throws GenerateAPDUException {
        try {
            byte[] bArr = new byte[5];
            System.arraycopy(commandHeader(b2, b3, b4, b5), 0, bArr, 0, 4);
            bArr[4] = b6;
            return bArr;
        } catch (Exception e) {
            throw new GenerateAPDUException("case 2: error!", e);
        }
    }

    public static final byte[] generateAPDU(byte b2, byte b3, byte b4, byte b5, byte[] bArr) throws GenerateAPDUException {
        try {
            byte[] bArrCommandHeader = commandHeader(b2, b3, b4, b5);
            if (bArr == null || bArr.length == 0) {
                return bArrCommandHeader;
            }
            byte[] bArr2 = new byte[bArr.length + 5];
            bArr2[4] = (byte) bArr.length;
            System.arraycopy(bArrCommandHeader, 0, bArr2, 0, 4);
            System.arraycopy(bArr, 0, bArr2, 5, bArr.length);
            return bArr2;
        } catch (Exception e) {
            throw new GenerateAPDUException("case 3: error!", e);
        }
    }

    public static final byte[] generateAPDU(byte b2, byte b3, byte b4, byte b5, byte[] bArr, int i, int i2) throws GenerateAPDUException {
        try {
            byte[] bArrCommandHeader = commandHeader(b2, b3, b4, b5);
            if (bArr == null || bArr.length == 0) {
                return bArrCommandHeader;
            }
            byte[] bArr2 = new byte[i2 + 5];
            bArr2[4] = (byte) i2;
            System.arraycopy(bArrCommandHeader, 0, bArr2, 0, 4);
            System.arraycopy(bArr, i, bArr2, 5, i2);
            return bArr2;
        } catch (Exception e) {
            throw new GenerateAPDUException("case 3: error!", e);
        }
    }

    public static final byte[] generateAPDU(byte b2, byte b3, byte b4, byte b5, byte[] bArr, byte b6) throws GenerateAPDUException {
        try {
            byte[] bArrCommandHeader = commandHeader(b2, b3, b4, b5);
            byte[] bArr2 = new byte[bArr.length + 6];
            bArr2[4] = (byte) bArr.length;
            System.arraycopy(bArrCommandHeader, 0, bArr2, 0, 4);
            System.arraycopy(bArr, 0, bArr2, 5, bArr.length);
            bArr2[bArr.length + 5] = b6;
            return bArr2;
        } catch (Exception e) {
            throw new GenerateAPDUException("case 4: error!", e);
        }
    }

    public static final byte[] generateAPDU(byte b2, byte b3, byte b4, byte b5, byte[] bArr, int i, int i2, byte b6) throws GenerateAPDUException {
        try {
            byte[] bArrCommandHeader = commandHeader(b2, b3, b4, b5);
            byte[] bArr2 = new byte[i2 + 6];
            bArr2[4] = (byte) i2;
            System.arraycopy(bArrCommandHeader, 0, bArr2, 0, 4);
            System.arraycopy(bArr, i, bArr2, 5, i2);
            bArr2[i2 + 5] = b6;
            return bArr2;
        } catch (Exception e) {
            throw new GenerateAPDUException("case 4: error!", e);
        }
    }
}
