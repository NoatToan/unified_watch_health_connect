package defpackage;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.asn1.ASN1Exception;

/* JADX INFO: loaded from: classes3.dex */
public class rd extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f32429b;
    public final byte[][] c;

    public rd(InputStream inputStream, int i) {
        this(inputStream, i, false);
    }

    public static pe d(int i, ky5 ky5Var, byte[][] bArr) throws IOException {
        if (i == 10) {
            return ld.o(m(ky5Var, bArr));
        }
        if (i == 12) {
            return new jh5(ky5Var.c());
        }
        if (i == 30) {
            return new uf5(l(ky5Var));
        }
        switch (i) {
            case 1:
                return bd.o(m(ky5Var, bArr));
            case 2:
                return new vd(ky5Var.c(), false);
            case 3:
                return xc.q(ky5Var.a(), ky5Var);
            case 4:
                return new pg5(ky5Var.c());
            case 5:
                return lg5.f25030a;
            case 6:
                return fe.r(m(ky5Var, bArr));
            default:
                switch (i) {
                    case 18:
                        return new ng5(ky5Var.c());
                    case 19:
                        return new vg5(ky5Var.c());
                    case 20:
                        return new fh5(ky5Var.c());
                    case 21:
                        return new nh5(ky5Var.c());
                    case 22:
                        return new jg5(ky5Var.c());
                    case 23:
                        return new gf(ky5Var.c());
                    case 24:
                        return new od(ky5Var.c());
                    case 25:
                        return new hg5(ky5Var.c());
                    case 26:
                        return new ph5(ky5Var.c());
                    case 27:
                        return new eg5(ky5Var.c());
                    case 28:
                        return new lh5(ky5Var.c());
                    default:
                        throw new IOException("unknown tag " + i + " encountered");
                }
        }
    }

    public static char[] l(ky5 ky5Var) throws IOException {
        int i;
        int iA = ky5Var.a() / 2;
        char[] cArr = new char[iA];
        for (int i2 = 0; i2 < iA; i2++) {
            int i3 = ky5Var.read();
            if (i3 < 0 || (i = ky5Var.read()) < 0) {
                break;
            }
            cArr[i2] = (char) ((i3 << 8) | (i & 255));
        }
        return cArr;
    }

    public static byte[] m(ky5 ky5Var, byte[][] bArr) throws IOException {
        int iA = ky5Var.a();
        if (ky5Var.a() >= bArr.length) {
            return ky5Var.c();
        }
        byte[] bArr2 = bArr[iA];
        if (bArr2 == null) {
            bArr2 = new byte[iA];
            bArr[iA] = bArr2;
        }
        gjo.c(ky5Var, bArr2);
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

    public id a(ky5 ky5Var) throws IOException {
        return new rd(ky5Var).b();
    }

    public id b() throws IOException {
        id idVar = new id();
        while (true) {
            pe peVarS = s();
            if (peVarS == null) {
                return idVar;
            }
            idVar.a(peVarS);
        }
    }

    public pe c(int i, int i2, int i3) throws IOException {
        boolean z = (i & 32) != 0;
        ky5 ky5Var = new ky5(this, i3);
        if ((i & 64) != 0) {
            return new sf5(z, i2, ky5Var.c());
        }
        if ((i & 128) != 0) {
            return new af(ky5Var).c(z, i2);
        }
        if (!z) {
            return d(i2, ky5Var, this.c);
        }
        if (i2 == 4) {
            id idVarA = a(ky5Var);
            int iC = idVarA.c();
            ge[] geVarArr = new ge[iC];
            for (int i4 = 0; i4 != iC; i4++) {
                geVarArr[i4] = (ge) idVarA.b(i4);
            }
            return new yt1(geVarArr);
        }
        if (i2 == 8) {
            return new yf5(a(ky5Var));
        }
        if (i2 == 16) {
            return this.f32429b ? new kee(ky5Var.c()) : cg5.a(a(ky5Var));
        }
        if (i2 == 17) {
            return cg5.b(a(ky5Var));
        }
        throw new IOException("unknown tag " + i2 + " encountered");
    }

    public int n() {
        return this.f32428a;
    }

    public int o() throws IOException {
        return p(this, this.f32428a);
    }

    public pe s() throws IOException {
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
        af afVar = new af(new l7d(this, this.f32428a), this.f32428a);
        if ((i & 64) != 0) {
            return new ut1(iY, afVar).getLoadedObject();
        }
        if ((i & 128) != 0) {
            return new mu1(true, iY, afVar).getLoadedObject();
        }
        if (iY == 4) {
            return new au1(afVar).getLoadedObject();
        }
        if (iY == 8) {
            return new ag5(afVar).getLoadedObject();
        }
        if (iY == 16) {
            return new eu1(afVar).getLoadedObject();
        }
        if (iY == 17) {
            return new iu1(afVar).getLoadedObject();
        }
        throw new IOException("unknown BER object encountered");
    }

    public rd(InputStream inputStream) {
        this(inputStream, zio.c(inputStream));
    }

    public rd(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }

    public rd(byte[] bArr, boolean z) {
        this(new ByteArrayInputStream(bArr), bArr.length, z);
    }

    public rd(InputStream inputStream, int i, boolean z) {
        super(inputStream);
        this.f32428a = i;
        this.f32429b = z;
        this.c = new byte[11][];
    }
}
