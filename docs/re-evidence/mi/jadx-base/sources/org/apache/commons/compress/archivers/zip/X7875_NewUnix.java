package org.apache.commons.compress.archivers.zip;

import defpackage.d1s;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.zip.ZipException;

/* JADX INFO: loaded from: classes3.dex */
public class X7875_NewUnix implements d1s, Cloneable, Serializable {
    private static final long serialVersionUID = 1;
    private BigInteger gid;
    private BigInteger uid;
    private int version = 1;
    private static final ZipShort HEADER_ID = new ZipShort(30837);
    private static final ZipShort ZERO = new ZipShort(0);
    private static final BigInteger ONE_THOUSAND = BigInteger.valueOf(1000);

    public X7875_NewUnix() {
        reset();
    }

    private void reset() {
        BigInteger bigInteger = ONE_THOUSAND;
        this.uid = bigInteger;
        this.gid = bigInteger;
    }

    public static byte[] trimLeadingZeroesForceMinLength(byte[] bArr) {
        if (bArr == null) {
            return bArr;
        }
        int length = bArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length && bArr[i2] == 0; i2++) {
            i++;
        }
        int iMax = Math.max(1, bArr.length - i);
        byte[] bArr2 = new byte[iMax];
        int length2 = iMax - (bArr.length - i);
        System.arraycopy(bArr, i, bArr2, length2, iMax - length2);
        return bArr2;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof X7875_NewUnix)) {
            return false;
        }
        X7875_NewUnix x7875_NewUnix = (X7875_NewUnix) obj;
        return this.version == x7875_NewUnix.version && this.uid.equals(x7875_NewUnix.uid) && this.gid.equals(x7875_NewUnix.gid);
    }

    public byte[] getCentralDirectoryData() {
        return new byte[0];
    }

    public ZipShort getCentralDirectoryLength() {
        return ZERO;
    }

    public long getGID() {
        return e.b(this.gid);
    }

    @Override // defpackage.d1s
    public ZipShort getHeaderId() {
        return HEADER_ID;
    }

    public byte[] getLocalFileDataData() {
        byte[] byteArray = this.uid.toByteArray();
        byte[] byteArray2 = this.gid.toByteArray();
        byte[] bArrTrimLeadingZeroesForceMinLength = trimLeadingZeroesForceMinLength(byteArray);
        int length = bArrTrimLeadingZeroesForceMinLength != null ? bArrTrimLeadingZeroesForceMinLength.length : 0;
        byte[] bArrTrimLeadingZeroesForceMinLength2 = trimLeadingZeroesForceMinLength(byteArray2);
        int length2 = bArrTrimLeadingZeroesForceMinLength2 != null ? bArrTrimLeadingZeroesForceMinLength2.length : 0;
        byte[] bArr = new byte[length + 3 + length2];
        if (bArrTrimLeadingZeroesForceMinLength != null) {
            e.e(bArrTrimLeadingZeroesForceMinLength);
        }
        if (bArrTrimLeadingZeroesForceMinLength2 != null) {
            e.e(bArrTrimLeadingZeroesForceMinLength2);
        }
        bArr[0] = e.g(this.version);
        bArr[1] = e.g(length);
        if (bArrTrimLeadingZeroesForceMinLength != null) {
            System.arraycopy(bArrTrimLeadingZeroesForceMinLength, 0, bArr, 2, length);
        }
        int i = 2 + length;
        int i2 = length + 3;
        bArr[i] = e.g(length2);
        if (bArrTrimLeadingZeroesForceMinLength2 != null) {
            System.arraycopy(bArrTrimLeadingZeroesForceMinLength2, 0, bArr, i2, length2);
        }
        return bArr;
    }

    public ZipShort getLocalFileDataLength() {
        byte[] bArrTrimLeadingZeroesForceMinLength = trimLeadingZeroesForceMinLength(this.uid.toByteArray());
        int length = bArrTrimLeadingZeroesForceMinLength == null ? 0 : bArrTrimLeadingZeroesForceMinLength.length;
        byte[] bArrTrimLeadingZeroesForceMinLength2 = trimLeadingZeroesForceMinLength(this.gid.toByteArray());
        return new ZipShort(length + 3 + (bArrTrimLeadingZeroesForceMinLength2 != null ? bArrTrimLeadingZeroesForceMinLength2.length : 0));
    }

    public long getUID() {
        return e.b(this.uid);
    }

    public int hashCode() {
        return (Integer.rotateLeft(this.uid.hashCode(), 16) ^ (this.version * (-1234567))) ^ this.gid.hashCode();
    }

    @Override // defpackage.d1s
    public void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) throws ZipException {
    }

    @Override // defpackage.d1s
    public void parseFromLocalFileData(byte[] bArr, int i, int i2) throws ZipException {
        reset();
        if (i2 < 3) {
            throw new ZipException("X7875_NewUnix length is too short, only " + i2 + " bytes");
        }
        int i3 = i + 1;
        this.version = e.f(bArr[i]);
        int i4 = i + 2;
        int iF = e.f(bArr[i3]);
        int i5 = iF + 3;
        if (i5 > i2) {
            throw new ZipException("X7875_NewUnix invalid: uidSize " + iF + " doesn't fit into " + i2 + " bytes");
        }
        int i6 = iF + i4;
        this.uid = new BigInteger(1, e.e(Arrays.copyOfRange(bArr, i4, i6)));
        int i7 = i6 + 1;
        int iF2 = e.f(bArr[i6]);
        if (i5 + iF2 <= i2) {
            this.gid = new BigInteger(1, e.e(Arrays.copyOfRange(bArr, i7, iF2 + i7)));
            return;
        }
        throw new ZipException("X7875_NewUnix invalid: gidSize " + iF2 + " doesn't fit into " + i2 + " bytes");
    }

    public void setGID(long j) {
        this.gid = e.d(j);
    }

    public void setUID(long j) {
        this.uid = e.d(j);
    }

    public String toString() {
        return "0x7875 Zip Extra Field: UID=" + this.uid + " GID=" + this.gid;
    }
}
