package defpackage;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1Exception;

/* JADX INFO: loaded from: classes3.dex */
public class ud extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f35640b;
    public final byte[][] c;

    public ud(InputStream inputStream) {
        this(inputStream, yio.c(inputStream));
    }

    public static re d(int i, ly5 ly5Var, byte[][] bArr) throws IOException {
        if (i == 10) {
            return md.o(m(ly5Var, bArr));
        }
        if (i == 12) {
            return new kh5(ly5Var.c());
        }
        if (i == 30) {
            return new vf5(l(ly5Var));
        }
        switch (i) {
            case 1:
                return cd.o(m(ly5Var, bArr));
            case 2:
                return new wd(ly5Var.c(), false);
            case 3:
                return yc.q(ly5Var.a(), ly5Var);
            case 4:
                return new qg5(ly5Var.c());
            case 5:
                return mg5.f26130a;
            case 6:
                return ee.r(m(ly5Var, bArr));
            default:
                switch (i) {
                    case 18:
                        return new og5(ly5Var.c());
                    case 19:
                        return new wg5(ly5Var.c());
                    case 20:
                        return new gh5(ly5Var.c());
                    case 21:
                        return new oh5(ly5Var.c());
                    case 22:
                        return new kg5(ly5Var.c());
                    case 23:
                        return new hf(ly5Var.c());
                    case 24:
                        return new pd(ly5Var.c());
                    case 25:
                        return new ig5(ly5Var.c());
                    case 26:
                        return new qh5(ly5Var.c());
                    case 27:
                        return new fg5(ly5Var.c());
                    case 28:
                        return new mh5(ly5Var.c());
                    default:
                        throw new IOException("unknown tag " + i + " encountered");
                }
        }
    }

    public static char[] l(ly5 ly5Var) throws IOException {
        int i;
        int iA = ly5Var.a() / 2;
        char[] cArr = new char[iA];
        for (int i2 = 0; i2 < iA; i2++) {
            int i3 = ly5Var.read();
            if (i3 < 0 || (i = ly5Var.read()) < 0) {
                break;
            }
            cArr[i2] = (char) ((i3 << 8) | (i & 255));
        }
        return cArr;
    }

    public static byte[] m(ly5 ly5Var, byte[][] bArr) throws IOException {
        int iA = ly5Var.a();
        if (ly5Var.a() >= bArr.length) {
            return ly5Var.c();
        }
        byte[] bArr2 = bArr[iA];
        if (bArr2 == null) {
            bArr2 = new byte[iA];
            bArr[iA] = bArr2;
        }
        hjo.c(ly5Var, bArr2);
        return bArr2;
    }

    public static int p(InputStream inputStream, int i) throws IOException {
        int i2 = inputStream.read();
        if (i2 < 0) {
            throw new EOFException("EOF found when length expected");
        }
        if (i2 == 128) {
            return -1;
        }
        if (i2 <= 127) {
            return i2;
        }
        int i3 = i2 & 127;
        if (i3 > 4) {
            throw new IOException("DER length more than 4 bytes: " + i3);
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = inputStream.read();
            if (i6 < 0) {
                throw new EOFException("EOF found reading length");
            }
            i4 = (i4 << 8) + i6;
        }
        if (i4 < 0) {
            throw new IOException("corrupted stream - negative length found");
        }
        if (i4 < i) {
            return i4;
        }
        throw new IOException("corrupted stream - out of bounds length found");
    }

    public static int y(InputStream inputStream, int i) throws IOException {
        int i2 = i & 31;
        if (i2 != 31) {
            return i2;
        }
        int i3 = inputStream.read();
        if ((i3 & 127) == 0) {
            throw new IOException("corrupted stream - invalid high tag number found");
        }
        int i4 = 0;
        while (i3 >= 0 && (i3 & 128) != 0) {
            i4 = ((i3 & 127) | i4) << 7;
            i3 = inputStream.read();
        }
        if (i3 >= 0) {
            return i4 | (i3 & 127);
        }
        throw new EOFException("EOF found inside tag value.");
    }

    public jd a(ly5 ly5Var) throws IOException {
        return new ud(ly5Var).b();
    }

    public jd b() throws IOException {
        jd jdVar = new jd();
        while (true) {
            re reVarS = s();
            if (reVarS == null) {
                return jdVar;
            }
            jdVar.a(reVarS);
        }
    }

    public re c(int i, int i2, int i3) throws IOException {
        boolean z = (i & 32) != 0;
        ly5 ly5Var = new ly5(this, i3);
        if ((i & 64) != 0) {
            return new tf5(z, i2, ly5Var.c());
        }
        if ((i & 128) != 0) {
            return new bf(ly5Var).c(z, i2);
        }
        if (!z) {
            return d(i2, ly5Var, this.c);
        }
        if (i2 == 4) {
            jd jdVarA = a(ly5Var);
            int iC = jdVarA.c();
            he[] heVarArr = new he[iC];
            for (int i4 = 0; i4 != iC; i4++) {
                heVarArr[i4] = (he) jdVarA.b(i4);
            }
            return new zt1(heVarArr);
        }
        if (i2 == 8) {
            return new zf5(a(ly5Var));
        }
        if (i2 == 16) {
            return this.f35640b ? new lee(ly5Var.c()) : dg5.a(a(ly5Var));
        }
        if (i2 == 17) {
            return dg5.b(a(ly5Var));
        }
        throw new IOException("unknown tag " + i2 + " encountered");
    }

    public int n() {
        return this.f35639a;
    }

    public int o() throws IOException {
        return p(this, this.f35639a);
    }

    public re s() throws IOException {
        int i = read();
        if (i <= 0) {
            if (i != 0) {
                return null;
            }
            throw new IOException("unexpected end-of-contents marker");
        }
        int iY = y(this, i);
        boolean z = (i & 32) != 0;
        int iO = o();
        if (iO >= 0) {
            try {
                return c(i, iY, iO);
            } catch (IllegalArgumentException e) {
                throw new ASN1Exception("corrupted stream detected", e);
            }
        }
        if (!z) {
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        bf bfVar = new bf(new m7d(this, this.f35639a), this.f35639a);
        if ((i & 64) != 0) {
            return new vt1(iY, bfVar).getLoadedObject();
        }
        if ((i & 128) != 0) {
            return new nu1(true, iY, bfVar).getLoadedObject();
        }
        if (iY == 4) {
            return new bu1(bfVar).getLoadedObject();
        }
        if (iY == 8) {
            return new bg5(bfVar).getLoadedObject();
        }
        if (iY == 16) {
            return new fu1(bfVar).getLoadedObject();
        }
        if (iY == 17) {
            return new ju1(bfVar).getLoadedObject();
        }
        throw new IOException("unknown BER object encountered");
    }

    public ud(InputStream inputStream, int i) {
        this(inputStream, i, false);
    }

    public ud(InputStream inputStream, int i, boolean z) {
        super(inputStream);
        this.f35639a = i;
        this.f35640b = z;
        this.c = new byte[11][];
    }

    public ud(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }

    public ud(byte[] bArr, boolean z) {
        this(new ByteArrayInputStream(bArr), bArr.length, z);
    }
}
