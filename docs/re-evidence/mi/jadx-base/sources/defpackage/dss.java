package defpackage;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class dss {
    public byte[] A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15901b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15902k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15903r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public ArrayList<gjs> z;

    public dss(byte[] bArr) {
        int iB = afs.b(bArr, 0, 1);
        StringBuilder sb = new StringBuilder();
        sb.append("getNewCustomClockDialData pos = ");
        sb.append(0);
        sb.append(" version = ");
        sb.append(iB);
        W(iB);
        int iB2 = afs.b(bArr, 1, 4);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("getNewCustomClockDialData pos = ");
        sb2.append(1);
        sb2.append(" targetFileSize = ");
        sb2.append(iB2);
        L(iB2);
        boolean z = g(bArr[5])[0] == 1;
        boolean z2 = g(bArr[5])[1] == 1;
        boolean z3 = g(bArr[5])[2] == 1;
        boolean z4 = g(bArr[5])[3] == 1;
        m(z);
        j(z2);
        e(z3);
        p(z4);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("getNewCustomClockDialData is_index = ");
        sb3.append(z);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("getNewCustomClockDialData is_data = ");
        sb4.append(z2);
        StringBuilder sb5 = new StringBuilder();
        sb5.append("getNewCustomClockDialData is_bg_img = ");
        sb5.append(z3);
        StringBuilder sb6 = new StringBuilder();
        sb6.append("getNewCustomClockDialData is_thumbnail_img = ");
        sb6.append(z4);
        D(afs.b(bArr, 9, 4));
        int iB3 = afs.b(bArr, 13, 4);
        StringBuilder sb7 = new StringBuilder();
        sb7.append("getNewCustomClockDialData pos = ");
        sb7.append(13);
        sb7.append(" indexesReadSize = ");
        sb7.append(iB3);
        F(iB3);
        int iB4 = afs.b(bArr, 17, 4);
        StringBuilder sb8 = new StringBuilder();
        sb8.append("getNewCustomClockDialData pos = ");
        sb8.append(17);
        sb8.append(" indexesWriteAddress = ");
        sb8.append(iB4);
        H(iB4);
        int iB5 = afs.b(bArr, 21, 4);
        StringBuilder sb9 = new StringBuilder();
        sb9.append("getNewCustomClockDialData pos = ");
        sb9.append(21);
        sb9.append(" indexesWriteSize = ");
        sb9.append(iB5);
        J(iB5);
        int iB6 = afs.b(bArr, 25, 4);
        StringBuilder sb10 = new StringBuilder();
        sb10.append("getNewCustomClockDialData pos = ");
        sb10.append(25);
        sb10.append(" dataReadAddress = ");
        sb10.append(iB6);
        t(iB6);
        int iB7 = afs.b(bArr, 29, 4);
        StringBuilder sb11 = new StringBuilder();
        sb11.append("getNewCustomClockDialData pos = ");
        sb11.append(29);
        sb11.append(" dataReadSize = ");
        sb11.append(iB7);
        x(iB7);
        int iB8 = afs.b(bArr, 33, 4);
        StringBuilder sb12 = new StringBuilder();
        sb12.append("getNewCustomClockDialData pos = ");
        sb12.append(33);
        sb12.append(" dataReadCount = ");
        sb12.append(iB8);
        v(iB8);
        int iB9 = afs.b(bArr, 37, 4);
        StringBuilder sb13 = new StringBuilder();
        sb13.append("getNewCustomClockDialData pos = ");
        sb13.append(37);
        sb13.append(" dataWriteAddress = ");
        sb13.append(iB9);
        z(iB9);
        int iB10 = afs.b(bArr, 41, 4);
        StringBuilder sb14 = new StringBuilder();
        sb14.append("getNewCustomClockDialData pos = ");
        sb14.append(41);
        sb14.append(" dataWriteSize = ");
        sb14.append(iB10);
        B(iB10);
        int iB11 = afs.b(bArr, 45, 1);
        StringBuilder sb15 = new StringBuilder();
        sb15.append("getNewCustomClockDialData pos = ");
        sb15.append(45);
        sb15.append(" thumbnailFormat = ");
        sb15.append(iB11);
        P(iB11);
        int iB12 = afs.b(bArr, 46, 2);
        StringBuilder sb16 = new StringBuilder();
        sb16.append("getNewCustomClockDialData pos = ");
        sb16.append(46);
        sb16.append(" thumbnailWidth = ");
        sb16.append(iB12);
        Q(iB12);
        int iB13 = afs.b(bArr, 48, 2);
        StringBuilder sb17 = new StringBuilder();
        sb17.append("getNewCustomClockDialData pos = ");
        sb17.append(48);
        sb17.append(" thumbnailHeight = ");
        sb17.append(iB13);
        N(iB13);
        int iB14 = afs.b(bArr, 50, 4);
        StringBuilder sb18 = new StringBuilder();
        sb18.append("getNewCustomClockDialData pos = ");
        sb18.append(50);
        sb18.append(" thumbnailWriteAddress = ");
        sb18.append(iB14);
        S(iB14);
        int iB15 = afs.b(bArr, 54, 4);
        StringBuilder sb19 = new StringBuilder();
        sb19.append("getNewCustomClockDialData pos = ");
        sb19.append(54);
        sb19.append(" thumbnailWriteSize = ");
        sb19.append(iB15);
        U(iB15);
        int iB16 = afs.b(bArr, 58, 1);
        StringBuilder sb20 = new StringBuilder();
        sb20.append("getNewCustomClockDialData pos = ");
        sb20.append(58);
        sb20.append(" bgFormat = ");
        sb20.append(iB16);
        i(iB16);
        int iB17 = afs.b(bArr, 59, 2);
        StringBuilder sb21 = new StringBuilder();
        sb21.append("getNewCustomClockDialData pos = ");
        sb21.append(59);
        sb21.append(" bgWidth = ");
        sb21.append(iB17);
        l(iB17);
        int iB18 = afs.b(bArr, 61, 2);
        StringBuilder sb22 = new StringBuilder();
        sb22.append("getNewCustomClockDialData pos = ");
        sb22.append(61);
        sb22.append(" bgHeight = ");
        sb22.append(iB18);
        c(iB18);
        int iB19 = afs.b(bArr, 63, 4);
        StringBuilder sb23 = new StringBuilder();
        sb23.append("getNewCustomClockDialData pos = ");
        sb23.append(63);
        sb23.append(" bgWriteAddress = ");
        sb23.append(iB19);
        o(iB19);
        int iB20 = afs.b(bArr, 67, 4);
        StringBuilder sb24 = new StringBuilder();
        sb24.append("getNewCustomClockDialData pos = ");
        sb24.append(67);
        sb24.append(" bgWriteSize = ");
        sb24.append(iB20);
        r(iB20);
        StringBuilder sb25 = new StringBuilder();
        sb25.append("getNewCustomClockDialData 数据读取-地址 = ");
        sb25.append(iB6);
        StringBuilder sb26 = new StringBuilder();
        sb26.append("getNewCustomClockDialData 数据读取-大小 = ");
        sb26.append(iB7);
        byte[] bArrJ = afs.j(bArr, iB6, iB7);
        f(bArrJ);
        StringBuilder sb27 = new StringBuilder();
        sb27.append("getNewCustomClockDialData 数据格式 = ");
        sb27.append(iB8);
        ArrayList<gjs> arrayList = new ArrayList<>();
        int i = 0;
        for (int i2 = 0; i2 < iB8; i2++) {
            gjs gjsVar = new gjs();
            int iB21 = afs.b(bArrJ, i, 1);
            int iB22 = afs.b(bArrJ, i + 1, 1);
            int i3 = i + 2;
            gjsVar.a(iB21);
            gjsVar.e(iB22);
            if (iB21 == 0) {
                i += 22;
                gjsVar.b(afs.j(bArrJ, i3, 20));
            } else {
                i = i3;
            }
            arrayList.add(gjsVar);
        }
        d(arrayList);
    }

    public static String b(byte[] bArr, int i) {
        return new BigInteger(1, bArr).toString(i);
    }

    public static int[] g(byte b2) {
        int[] iArr = new int[8];
        String strB = b(new byte[]{b2}, 2);
        for (int length = strB.length() - 1; length >= 0; length--) {
            iArr[(length + 8) - strB.length()] = Integer.valueOf(strB.substring(length, length + 1)).intValue();
        }
        return iArr;
    }

    public int A() {
        return this.i;
    }

    public void B(int i) {
        this.o = i;
    }

    public int C() {
        return this.j;
    }

    public void D(int i) {
        this.g = i;
    }

    public int E() {
        return this.f15901b;
    }

    public void F(int i) {
        this.h = i;
    }

    public int G() {
        return this.w;
    }

    public void H(int i) {
        this.i = i;
    }

    public int I() {
        return this.u;
    }

    public void J(int i) {
        this.j = i;
    }

    public int K() {
        return this.v;
    }

    public void L(int i) {
        this.f15901b = i;
    }

    public int M() {
        return this.x;
    }

    public void N(int i) {
        this.w = i;
    }

    public int O() {
        return this.y;
    }

    public void P(int i) {
        this.u = i;
    }

    public void Q(int i) {
        this.v = i;
    }

    public boolean R() {
        return this.e;
    }

    public void S(int i) {
        this.x = i;
    }

    public boolean T() {
        return this.d;
    }

    public void U(int i) {
        this.y = i;
    }

    public boolean V() {
        return this.c;
    }

    public void W(int i) {
        this.f15900a = i;
    }

    public boolean X() {
        return this.f;
    }

    public int a() {
        return this.f15903r;
    }

    public void c(int i) {
        this.f15903r = i;
    }

    public void d(ArrayList<gjs> arrayList) {
        this.z = arrayList;
    }

    public void e(boolean z) {
        this.e = z;
    }

    public void f(byte[] bArr) {
        this.A = bArr;
    }

    public int h() {
        return this.p;
    }

    public void i(int i) {
        this.p = i;
    }

    public void j(boolean z) {
        this.d = z;
    }

    public int k() {
        return this.q;
    }

    public void l(int i) {
        this.q = i;
    }

    public void m(boolean z) {
        this.c = z;
    }

    public int n() {
        return this.s;
    }

    public void o(int i) {
        this.s = i;
    }

    public void p(boolean z) {
        this.f = z;
    }

    public int q() {
        return this.t;
    }

    public void r(int i) {
        this.t = i;
    }

    public ArrayList<gjs> s() {
        return this.z;
    }

    public void t(int i) {
        this.f15902k = i;
    }

    public String toString() {
        return "HandleCustomClockDialModle{Version=" + this.f15900a + ", targetFileSize=" + this.f15901b + ", isIndexes=" + this.c + ", isData=" + this.d + ", isBgImg=" + this.e + ", isThumbnailImg=" + this.f + ", indexReadAddress=" + this.g + ", indexReadSize=" + this.h + ", indexWriteAddress=" + this.i + ", indexWriteSize=" + this.j + ", dataReadAddress=" + this.f15902k + ", dataReadSize=" + this.l + ", dataReadCount=" + this.m + ", dataWriteAddress=" + this.n + ", dataWriteSize=" + this.o + ", bgImgType=" + this.p + ", bgImgWidth=" + this.q + ", bgImgHeight=" + this.f15903r + ", bgImgWriteAddress=" + this.s + ", bgImgWriteSize=" + this.t + ", thumbnailImgType=" + this.u + ", thumbnailImgWidth=" + this.v + ", thumbnailImgHeight=" + this.w + ", thumbnailImgWriteAddress=" + this.x + ", thumbnailImgWriteSize=" + this.y + ", dataList=" + this.z + ", imgData=" + Arrays.toString(this.A) + AbstractJsonLexerKt.END_OBJ;
    }

    public int u() {
        return this.n;
    }

    public void v(int i) {
        this.m = i;
    }

    public int w() {
        return this.o;
    }

    public void x(int i) {
        this.l = i;
    }

    public int y() {
        return this.g;
    }

    public void z(int i) {
        this.n = i;
    }
}
