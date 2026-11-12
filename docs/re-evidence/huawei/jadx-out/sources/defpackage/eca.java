package defpackage;

import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class eca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static byte[] f32727a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static byte[] f32728c;
    private static byte[] d;
    private static byte[] e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32729b;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private String l;
    private String m;
    private String n;
    private String o;

    static {
        byte[] bArr = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        e = bArr;
        byte[] bArr2 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90};
        f32728c = bArr2;
        byte[] bArr3 = {97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};
        d = bArr3;
        f32727a = b(bArr2, bArr3, bArr);
    }

    public eca(String str) {
        int iC = !TextUtils.isEmpty(str) ? c(str.charAt(0)) : -1;
        int i = iC & 3;
        this.f = i;
        this.i = (iC >>> 2) & 3;
        this.h = (iC >>> 4) & 1;
        this.j = (iC >>> 5) & 1;
        this.l = a(i);
        this.m = a(this.i);
        this.n = String.valueOf(this.h);
        this.o = String.valueOf(this.j);
        e(this.l, this.m);
    }

    private void e(String str, String str2) {
        if ("00".equals(str)) {
            this.f32729b = 0;
            return;
        }
        if (HiAnalyticsConstant.KeyAndValue.NUMBER_01.equals(str)) {
            this.f32729b = 1;
            if ("00".equals(str2)) {
                this.g = 100;
                return;
            }
            if (HiAnalyticsConstant.KeyAndValue.NUMBER_01.equals(str2)) {
                this.g = 101;
                return;
            } else if ("10".equals(str2)) {
                this.g = 110;
                return;
            } else {
                this.g = 2000;
                return;
            }
        }
        if ("10".equals(str)) {
            this.f32729b = 10;
            if ("00".equals(str2)) {
                this.g = 1000;
                return;
            } else if (HiAnalyticsConstant.KeyAndValue.NUMBER_01.equals(str2)) {
                this.g = 1001;
                return;
            } else {
                this.g = 2000;
                return;
            }
        }
        if ("11".equals(str)) {
            this.f32729b = 11;
            if ("00".equals(str2)) {
                this.g = 1100;
                return;
            } else {
                this.g = 2000;
                return;
            }
        }
        LogUtil.j("EncryptProtal", "EncryptProtal confirmEncryptInformation invalid");
    }

    private String a(int i) {
        String binaryString = Integer.toBinaryString(i);
        if (binaryString.length() != 1) {
            return binaryString;
        }
        return "0" + binaryString;
    }

    private int c(char c2) {
        int i = 0;
        while (true) {
            byte[] bArr = f32727a;
            if (i >= bArr.length) {
                return -1;
            }
            if (c2 == bArr[i]) {
                return i;
            }
            i++;
        }
    }

    private static byte[] b(byte[]... bArr) {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    public int c() {
        return this.g;
    }

    public String toString() {
        return "EncryptProtal [mEncryptAlgorithm =" + this.f32729b + ", mEncryptMethod =" + this.g + System.lineSeparator() + ", mIntBit01 =" + this.f + ", mIntBit23 =" + this.i + ", mIntBit4 =" + this.h + ", mIntBit5 =" + this.j + System.lineSeparator() + ", mStrBit01 =" + this.l + ", mStrBit23 =" + this.m + ", mStrBit4 =" + this.n + ", mStrBit5 =" + this.o + "]";
    }
}
