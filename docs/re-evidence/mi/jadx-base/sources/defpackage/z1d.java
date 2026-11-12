package defpackage;

import coil.util.Utils;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.BinaryFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.id3.UrlLinkFrame;
import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class z1d extends adm {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f40775b = new a() { // from class: y1d
        @Override // z1d.a
        public final boolean a(int i, int i2, int i3, int i4, int i5) {
            return z1d.z(i, i2, i3, i4, i5);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f40776a;

    public interface a {
        boolean a(int i, int i2, int i3, int i4, int i5);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f40777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f40778b;
        public final int c;

        public b(int i, boolean z, int i2) {
            this.f40777a = i;
            this.f40778b = z;
            this.c = i2;
        }
    }

    public z1d() {
        this(null);
    }

    public static int A(okh okhVar, int i) {
        byte[] bArrD = okhVar.d();
        int iE = okhVar.e();
        int i2 = iE;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= iE + i) {
                return i;
            }
            if ((bArrD[i2] & 255) == 255 && bArrD[i3] == 0) {
                System.arraycopy(bArrD, i2 + 2, bArrD, i3, (i - (i2 - iE)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007c A[PHI: r3
      0x007c: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0089, B:33:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    public static boolean B(okh okhVar, int i, int i2, boolean z) {
        int iG;
        long jG;
        int iJ;
        int i3;
        int iE = okhVar.e();
        while (true) {
            try {
                boolean z2 = true;
                if (okhVar.a() < i2) {
                    okhVar.P(iE);
                    return true;
                }
                if (i >= 3) {
                    iG = okhVar.n();
                    jG = okhVar.F();
                    iJ = okhVar.J();
                } else {
                    iG = okhVar.G();
                    jG = okhVar.G();
                    iJ = 0;
                }
                if (iG == 0 && jG == 0 && iJ == 0) {
                    okhVar.P(iE);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & jG) != 0) {
                        okhVar.P(iE);
                        return false;
                    }
                    jG = (((jG >> 24) & 255) << 21) | (jG & 255) | (((jG >> 8) & 255) << 7) | (((jG >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i3 = (iJ & 64) != 0 ? 1 : 0;
                    if ((iJ & 1) == 0) {
                        z2 = false;
                    }
                } else if (i == 3) {
                    i3 = (iJ & 32) != 0 ? 1 : 0;
                    if ((iJ & 128) == 0) {
                        z2 = false;
                    }
                } else {
                    i3 = 0;
                    z2 = false;
                }
                if (z2) {
                    i3 += 4;
                }
                if (jG < i3) {
                    okhVar.P(iE);
                    return false;
                }
                if (okhVar.a() < jG) {
                    okhVar.P(iE);
                    return false;
                }
                okhVar.Q((int) jG);
            } catch (Throwable th) {
                okhVar.P(iE);
                throw th;
            }
        }
    }

    public static byte[] d(byte[] bArr, int i, int i2) {
        return i2 <= i ? wlq.f : Arrays.copyOfRange(bArr, i, i2);
    }

    public static ApicFrame f(okh okhVar, int i, int i2) throws UnsupportedEncodingException {
        int iY;
        String strE;
        int iD = okhVar.D();
        String strV = v(iD);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        okhVar.j(bArr, 0, i3);
        if (i2 == 2) {
            String strValueOf = String.valueOf(fk1.e(new String(bArr, 0, 3, "ISO-8859-1")));
            strE = strValueOf.length() != 0 ? "image/".concat(strValueOf) : new String("image/");
            if ("image/jpg".equals(strE)) {
                strE = Utils.MIME_TYPE_JPEG;
            }
            iY = 2;
        } else {
            iY = y(bArr, 0);
            strE = fk1.e(new String(bArr, 0, iY, "ISO-8859-1"));
            if (strE.indexOf(47) == -1) {
                strE = strE.length() != 0 ? "image/".concat(strE) : new String("image/");
            }
        }
        int i4 = bArr[iY + 1] & 255;
        int i5 = iY + 2;
        int iX = x(bArr, i5, iD);
        return new ApicFrame(strE, new String(bArr, i5, iX - i5, strV), i4, d(bArr, iX + u(iD), i3));
    }

    public static BinaryFrame g(okh okhVar, int i, String str) {
        byte[] bArr = new byte[i];
        okhVar.j(bArr, 0, i);
        return new BinaryFrame(str, bArr);
    }

    public static ChapterFrame h(okh okhVar, int i, int i2, boolean z, int i3, a aVar) throws UnsupportedEncodingException {
        int iE = okhVar.e();
        int iY = y(okhVar.d(), iE);
        String str = new String(okhVar.d(), iE, iY - iE, "ISO-8859-1");
        okhVar.P(iY + 1);
        int iN = okhVar.n();
        int iN2 = okhVar.n();
        long jF = okhVar.F();
        long j = jF == 4294967295L ? -1L : jF;
        long jF2 = okhVar.F();
        long j2 = jF2 == 4294967295L ? -1L : jF2;
        ArrayList arrayList = new ArrayList();
        int i4 = iE + i;
        while (okhVar.e() < i4) {
            Id3Frame id3FrameK = k(i2, okhVar, z, i3, aVar);
            if (id3FrameK != null) {
                arrayList.add(id3FrameK);
            }
        }
        return new ChapterFrame(str, iN, iN2, j, j2, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    public static ChapterTocFrame i(okh okhVar, int i, int i2, boolean z, int i3, a aVar) throws UnsupportedEncodingException {
        int iE = okhVar.e();
        int iY = y(okhVar.d(), iE);
        String str = new String(okhVar.d(), iE, iY - iE, "ISO-8859-1");
        okhVar.P(iY + 1);
        int iD = okhVar.D();
        boolean z2 = (iD & 2) != 0;
        boolean z3 = (iD & 1) != 0;
        int iD2 = okhVar.D();
        String[] strArr = new String[iD2];
        for (int i4 = 0; i4 < iD2; i4++) {
            int iE2 = okhVar.e();
            int iY2 = y(okhVar.d(), iE2);
            strArr[i4] = new String(okhVar.d(), iE2, iY2 - iE2, "ISO-8859-1");
            okhVar.P(iY2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = iE + i;
        while (okhVar.e() < i5) {
            Id3Frame id3FrameK = k(i2, okhVar, z, i3, aVar);
            if (id3FrameK != null) {
                arrayList.add(id3FrameK);
            }
        }
        return new ChapterTocFrame(str, z2, z3, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    public static CommentFrame j(okh okhVar, int i) throws UnsupportedEncodingException {
        if (i < 4) {
            return null;
        }
        int iD = okhVar.D();
        String strV = v(iD);
        byte[] bArr = new byte[3];
        okhVar.j(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        okhVar.j(bArr2, 0, i2);
        int iX = x(bArr2, 0, iD);
        String str2 = new String(bArr2, 0, iX, strV);
        int iU = iX + u(iD);
        return new CommentFrame(str, str2, p(bArr2, iU, x(bArr2, iU, iD), strV));
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0198  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:147:0x01c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:151:0x01db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:152:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:157:0x01ea A[Catch: all -> 0x0122, UnsupportedEncodingException -> 0x0222, Merged into TryCatch #1 {all -> 0x0122, UnsupportedEncodingException -> 0x0222, blocks: (B:91:0x011c, B:159:0x01f4, B:162:0x0222, B:95:0x0127, B:102:0x013d, B:104:0x0145, B:112:0x015f, B:121:0x0177, B:132:0x0192, B:139:0x01a4, B:145:0x01b3, B:150:0x01cb, B:156:0x01e5, B:157:0x01ea), top: B:169:0x0112 }] */
    public static Id3Frame k(int i, okh okhVar, boolean z, int i2, a aVar) {
        int iH;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Id3Frame id3FrameG;
        int iD = okhVar.D();
        int iD2 = okhVar.D();
        int iD3 = okhVar.D();
        int iD4 = i >= 3 ? okhVar.D() : 0;
        if (i == 4) {
            iH = okhVar.H();
            if (!z) {
                iH = (((iH >> 24) & 255) << 21) | (iH & 255) | (((iH >> 8) & 255) << 7) | (((iH >> 16) & 255) << 14);
            }
        } else {
            iH = i == 3 ? okhVar.H() : okhVar.G();
        }
        int iA = iH;
        int iJ = i >= 3 ? okhVar.J() : 0;
        if (iD == 0 && iD2 == 0 && iD3 == 0 && iD4 == 0 && iA == 0 && iJ == 0) {
            okhVar.P(okhVar.f());
            return null;
        }
        int iE = okhVar.e() + iA;
        if (iE > okhVar.f()) {
            toe.h("Id3Decoder", "Frame size exceeds remaining tag data");
            okhVar.P(okhVar.f());
            return null;
        }
        if (aVar != null) {
            i3 = iE;
            if (!aVar.a(i, iD, iD2, iD3, iD4)) {
                okhVar.P(i3);
                return null;
            }
        } else {
            i3 = iE;
        }
        if (i == 3) {
            int i4 = iJ;
            z3 = (i4 & 128) != 0;
            z4 = (i4 & 64) != 0;
            z2 = (i4 & 32) != 0;
            z6 = z3;
            z5 = false;
        } else {
            int i5 = iJ;
            if (i == 4) {
                boolean z7 = (i5 & 64) != 0;
                boolean z8 = (i5 & 8) != 0;
                boolean z9 = (i5 & 4) != 0;
                z5 = (i5 & 2) != 0;
                boolean z10 = (i5 & 1) != 0;
                z2 = z7;
                z3 = z10;
                z6 = z8;
                z4 = z9;
            } else {
                z2 = false;
                z3 = false;
                z4 = false;
                z5 = false;
                z6 = false;
            }
        }
        if (z6 || z4) {
            toe.h(r4, "Skipping unsupported compressed or encrypted frame");
            okhVar.P(i3);
            return null;
        }
        if (z2) {
            iA--;
            okhVar.Q(1);
        }
        if (z3) {
            iA -= 4;
            okhVar.Q(4);
        }
        if (z5) {
            iA = A(okhVar, iA);
        }
        try {
            if (iD == 84 && iD2 == 88 && iD3 == 88 && (i == 2 || iD4 == 88)) {
                id3FrameG = r(okhVar, iA);
            } else if (iD == 84) {
                id3FrameG = q(okhVar, iA, w(i, iD, iD2, iD3, iD4));
            } else if (iD == 87 && iD2 == 88 && iD3 == 88 && (i == 2 || iD4 == 88)) {
                id3FrameG = t(okhVar, iA);
            } else if (iD == 87) {
                id3FrameG = s(okhVar, iA, w(i, iD, iD2, iD3, iD4));
            } else if (iD == 80 && iD2 == 82 && iD3 == 73 && iD4 == 86) {
                id3FrameG = o(okhVar, iA);
            } else if (iD == 71 && iD2 == 69 && iD3 == 79 && (iD4 == 66 || i == 2)) {
                id3FrameG = l(okhVar, iA);
            } else if (i == 2) {
                if (iD == 80 && iD2 == 73 && iD3 == 67) {
                    id3FrameG = f(okhVar, iA, i);
                } else if (iD != 67 && iD2 == 79 && iD3 == 77 && (iD4 == 77 || i == 2)) {
                    id3FrameG = j(okhVar, iA);
                } else if (iD != 67 && iD2 == 72 && iD3 == 65 && iD4 == 80) {
                    id3FrameG = h(okhVar, iA, i, z, i2, aVar);
                } else if (iD != 67 && iD2 == 84 && iD3 == 79 && iD4 == 67) {
                    id3FrameG = i(okhVar, iA, i, z, i2, aVar);
                } else if (iD != 77 && iD2 == 76 && iD3 == 76 && iD4 == 84) {
                    id3FrameG = n(okhVar, iA);
                } else {
                    id3FrameG = g(okhVar, iA, w(i, iD, iD2, iD3, iD4));
                }
            } else if (iD == 65 && iD2 == 80 && iD3 == 73 && iD4 == 67) {
                id3FrameG = f(okhVar, iA, i);
            } else if (iD != 67) {
                if (iD != 67) {
                    if (iD != 67) {
                        if (iD != 77) {
                            id3FrameG = g(okhVar, iA, w(i, iD, iD2, iD3, iD4));
                        } else {
                            id3FrameG = g(okhVar, iA, w(i, iD, iD2, iD3, iD4));
                        }
                    } else if (iD != 77) {
                        id3FrameG = g(okhVar, iA, w(i, iD, iD2, iD3, iD4));
                    } else {
                        id3FrameG = g(okhVar, iA, w(i, iD, iD2, iD3, iD4));
                    }
                } else if (iD != 67) {
                    if (iD != 77) {
                        id3FrameG = g(okhVar, iA, w(i, iD, iD2, iD3, iD4));
                    } else {
                        id3FrameG = g(okhVar, iA, w(i, iD, iD2, iD3, iD4));
                    }
                } else if (iD != 77) {
                    id3FrameG = g(okhVar, iA, w(i, iD, iD2, iD3, iD4));
                } else {
                    id3FrameG = g(okhVar, iA, w(i, iD, iD2, iD3, iD4));
                }
            } else if (iD != 67) {
                if (iD != 67) {
                    if (iD != 77) {
                        id3FrameG = g(okhVar, iA, w(i, iD, iD2, iD3, iD4));
                    } else {
                        id3FrameG = g(okhVar, iA, w(i, iD, iD2, iD3, iD4));
                    }
                } else if (iD != 77) {
                    id3FrameG = g(okhVar, iA, w(i, iD, iD2, iD3, iD4));
                } else {
                    id3FrameG = g(okhVar, iA, w(i, iD, iD2, iD3, iD4));
                }
            } else if (iD != 67) {
                if (iD != 77) {
                    id3FrameG = g(okhVar, iA, w(i, iD, iD2, iD3, iD4));
                } else {
                    id3FrameG = g(okhVar, iA, w(i, iD, iD2, iD3, iD4));
                }
            } else if (iD != 77) {
                id3FrameG = g(okhVar, iA, w(i, iD, iD2, iD3, iD4));
            } else {
                id3FrameG = g(okhVar, iA, w(i, iD, iD2, iD3, iD4));
            }
            if (id3FrameG == null) {
                String strW = w(i, iD, iD2, iD3, iD4);
                StringBuilder sb = new StringBuilder(String.valueOf(strW).length() + 50);
                sb.append("Failed to decode frame: id=");
                sb.append(strW);
                sb.append(", frameSize=");
                sb.append(iA);
                toe.h("Id3Decoder", sb.toString());
            }
            okhVar.P(i3);
            return id3FrameG;
        } catch (UnsupportedEncodingException unused) {
            toe.h(r4, "Unsupported character encoding");
            return null;
        } finally {
            okhVar.P(i3);
        }
    }

    public static GeobFrame l(okh okhVar, int i) throws UnsupportedEncodingException {
        int iD = okhVar.D();
        String strV = v(iD);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        okhVar.j(bArr, 0, i2);
        int iY = y(bArr, 0);
        String str = new String(bArr, 0, iY, "ISO-8859-1");
        int i3 = iY + 1;
        int iX = x(bArr, i3, iD);
        String strP = p(bArr, i3, iX, strV);
        int iU = iX + u(iD);
        int iX2 = x(bArr, iU, iD);
        return new GeobFrame(str, strP, p(bArr, iU, iX2, strV), d(bArr, iX2 + u(iD), i2));
    }

    public static b m(okh okhVar) {
        if (okhVar.a() < 10) {
            toe.h("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int iG = okhVar.G();
        if (iG != 4801587) {
            String str = String.format("%06X", Integer.valueOf(iG));
            toe.h("Id3Decoder", str.length() != 0 ? "Unexpected first three bytes of ID3 tag header: 0x".concat(str) : new String("Unexpected first three bytes of ID3 tag header: 0x"));
            return null;
        }
        int iD = okhVar.D();
        okhVar.Q(1);
        int iD2 = okhVar.D();
        int iC = okhVar.C();
        if (iD == 2) {
            if ((iD2 & 64) != 0) {
                toe.h("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (iD == 3) {
            if ((iD2 & 64) != 0) {
                int iN = okhVar.n();
                okhVar.Q(iN);
                iC -= iN + 4;
            }
        } else {
            if (iD != 4) {
                StringBuilder sb = new StringBuilder(57);
                sb.append("Skipped ID3 tag with unsupported majorVersion=");
                sb.append(iD);
                toe.h("Id3Decoder", sb.toString());
                return null;
            }
            if ((iD2 & 64) != 0) {
                int iC2 = okhVar.C();
                okhVar.Q(iC2 - 4);
                iC -= iC2;
            }
            if ((iD2 & 16) != 0) {
                iC -= 10;
            }
        }
        return new b(iD, iD < 4 && (iD2 & 128) != 0, iC);
    }

    public static MlltFrame n(okh okhVar, int i) {
        int iJ = okhVar.J();
        int iG = okhVar.G();
        int iG2 = okhVar.G();
        int iD = okhVar.D();
        int iD2 = okhVar.D();
        nkh nkhVar = new nkh();
        nkhVar.m(okhVar);
        int i2 = ((i - 10) * 8) / (iD + iD2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iH = nkhVar.h(iD);
            int iH2 = nkhVar.h(iD2);
            iArr[i3] = iH;
            iArr2[i3] = iH2;
        }
        return new MlltFrame(iJ, iG, iG2, iArr, iArr2);
    }

    public static PrivFrame o(okh okhVar, int i) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        okhVar.j(bArr, 0, i);
        int iY = y(bArr, 0);
        return new PrivFrame(new String(bArr, 0, iY, "ISO-8859-1"), d(bArr, iY + 1, i));
    }

    public static String p(byte[] bArr, int i, int i2, String str) throws UnsupportedEncodingException {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }

    public static TextInformationFrame q(okh okhVar, int i, String str) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int iD = okhVar.D();
        String strV = v(iD);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        okhVar.j(bArr, 0, i2);
        return new TextInformationFrame(str, null, new String(bArr, 0, x(bArr, 0, iD), strV));
    }

    public static TextInformationFrame r(okh okhVar, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int iD = okhVar.D();
        String strV = v(iD);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        okhVar.j(bArr, 0, i2);
        int iX = x(bArr, 0, iD);
        String str = new String(bArr, 0, iX, strV);
        int iU = iX + u(iD);
        return new TextInformationFrame("TXXX", str, p(bArr, iU, x(bArr, iU, iD), strV));
    }

    public static UrlLinkFrame s(okh okhVar, int i, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        okhVar.j(bArr, 0, i);
        return new UrlLinkFrame(str, null, new String(bArr, 0, y(bArr, 0), "ISO-8859-1"));
    }

    public static UrlLinkFrame t(okh okhVar, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int iD = okhVar.D();
        String strV = v(iD);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        okhVar.j(bArr, 0, i2);
        int iX = x(bArr, 0, iD);
        String str = new String(bArr, 0, iX, strV);
        int iU = iX + u(iD);
        return new UrlLinkFrame("WXXX", str, p(bArr, iU, y(bArr, iU), "ISO-8859-1"));
    }

    public static int u(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static String v(int i) {
        if (i == 1) {
            return HTTP.UTF_16;
        }
        if (i != 2) {
            return i != 3 ? "ISO-8859-1" : "UTF-8";
        }
        return "UTF-16BE";
    }

    public static String w(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static int x(byte[] bArr, int i, int i2) {
        int iY = y(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return iY;
        }
        while (iY < bArr.length - 1) {
            if (iY % 2 == 0 && bArr[iY + 1] == 0) {
                return iY;
            }
            iY = y(bArr, iY + 1);
        }
        return bArr.length;
    }

    public static int y(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static /* synthetic */ boolean z(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    @Override // defpackage.adm
    public Metadata b(mtf mtfVar, ByteBuffer byteBuffer) {
        return e(byteBuffer.array(), byteBuffer.limit());
    }

    public Metadata e(byte[] bArr, int i) {
        ArrayList arrayList = new ArrayList();
        okh okhVar = new okh(bArr, i);
        b bVarM = m(okhVar);
        if (bVarM == null) {
            return null;
        }
        int iE = okhVar.e();
        int i2 = bVarM.f40777a == 2 ? 6 : 10;
        int iA = bVarM.c;
        if (bVarM.f40778b) {
            iA = A(okhVar, bVarM.c);
        }
        okhVar.O(iE + iA);
        boolean z = false;
        if (!B(okhVar, bVarM.f40777a, i2, false)) {
            if (bVarM.f40777a != 4 || !B(okhVar, 4, i2, true)) {
                int i3 = bVarM.f40777a;
                StringBuilder sb = new StringBuilder(56);
                sb.append("Failed to validate ID3 tag with majorVersion=");
                sb.append(i3);
                toe.h("Id3Decoder", sb.toString());
                return null;
            }
            z = true;
        }
        while (okhVar.a() >= i2) {
            Id3Frame id3FrameK = k(bVarM.f40777a, okhVar, z, i2, this.f40776a);
            if (id3FrameK != null) {
                arrayList.add(id3FrameK);
            }
        }
        return new Metadata(arrayList);
    }

    public z1d(a aVar) {
        this.f40776a = aVar;
    }
}
