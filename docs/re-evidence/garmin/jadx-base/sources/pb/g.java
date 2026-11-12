package pb;

import android.os.Parcelable;
import androidx.media3.common.w;
import androidx.media3.common.x;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.UnsignedBytes;
import fa.q;
import fa.r;
import fa.z;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class g extends kb.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p6.b f136807b = new p6.b(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f136808a;

    public interface a {
        boolean evaluate(int i14, int i15, int i16, int i17, int i18);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f136809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f136810b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f136811c;

        public b(int i14, boolean z14, int i15) {
            this.f136809a = i14;
            this.f136810b = z14;
            this.f136811c = i15;
        }
    }

    public g(a aVar) {
        this.f136808a = aVar;
    }

    public static pb.a d(r rVar, int i14, int i15) {
        int iV;
        String strConcat;
        int iU = rVar.u();
        Charset charsetS = s(iU);
        int i16 = i14 - 1;
        byte[] bArr = new byte[i16];
        rVar.e(bArr, 0, i16);
        if (i15 == 2) {
            strConcat = "image/" + Ascii.toLowerCase(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(strConcat)) {
                strConcat = MimeTypes.IMAGE_JPEG;
            }
            iV = 2;
        } else {
            iV = v(bArr, 0);
            String lowerCase = Ascii.toLowerCase(new String(bArr, 0, iV, StandardCharsets.ISO_8859_1));
            strConcat = lowerCase.indexOf(47) == -1 ? "image/".concat(lowerCase) : lowerCase;
        }
        int i17 = bArr[iV + 1] & UnsignedBytes.MAX_VALUE;
        int i18 = iV + 2;
        int iU2 = u(i18, iU, bArr);
        String str = new String(bArr, i18, iU2 - i18, charsetS);
        int iR = r(iU) + iU2;
        return new pb.a(strConcat, str, i17, i16 <= iR ? z.f70076f : Arrays.copyOfRange(bArr, iR, i16));
    }

    public static c e(r rVar, int i14, int i15, boolean z14, int i16, a aVar) throws Throwable {
        int i17 = rVar.f70055b;
        int iV = v(rVar.f70054a, i17);
        String str = new String(rVar.f70054a, i17, iV - i17, StandardCharsets.ISO_8859_1);
        rVar.G(iV + 1);
        int iG = rVar.g();
        int iG2 = rVar.g();
        long jW = rVar.w();
        if (jW == 4294967295L) {
            jW = -1;
        }
        long jW2 = rVar.w();
        long j8 = jW2 == 4294967295L ? -1L : jW2;
        ArrayList arrayList = new ArrayList();
        int i18 = i17 + i14;
        while (rVar.f70055b < i18) {
            h hVarH = h(i15, rVar, z14, i16, aVar);
            if (hVarH != null) {
                arrayList.add(hVarH);
            }
        }
        return new c(str, iG, iG2, jW, j8, (h[]) arrayList.toArray(new h[0]));
    }

    public static d f(r rVar, int i14, int i15, boolean z14, int i16, a aVar) throws Throwable {
        int i17 = rVar.f70055b;
        int iV = v(rVar.f70054a, i17);
        String str = new String(rVar.f70054a, i17, iV - i17, StandardCharsets.ISO_8859_1);
        rVar.G(iV + 1);
        int iU = rVar.u();
        boolean z15 = (iU & 2) != 0;
        boolean z16 = (iU & 1) != 0;
        int iU2 = rVar.u();
        String[] strArr = new String[iU2];
        for (int i18 = 0; i18 < iU2; i18++) {
            int i19 = rVar.f70055b;
            int iV2 = v(rVar.f70054a, i19);
            strArr[i18] = new String(rVar.f70054a, i19, iV2 - i19, StandardCharsets.ISO_8859_1);
            rVar.G(iV2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i24 = i17 + i14;
        while (rVar.f70055b < i24) {
            h hVarH = h(i15, rVar, z14, i16, aVar);
            if (hVarH != null) {
                arrayList.add(hVarH);
            }
        }
        return new d(str, z15, z16, strArr, (h[]) arrayList.toArray(new h[0]));
    }

    public static e g(int i14, r rVar) {
        if (i14 < 4) {
            return null;
        }
        int iU = rVar.u();
        Charset charsetS = s(iU);
        byte[] bArr = new byte[3];
        rVar.e(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i15 = i14 - 4;
        byte[] bArr2 = new byte[i15];
        rVar.e(bArr2, 0, i15);
        int iU2 = u(0, iU, bArr2);
        String str2 = new String(bArr2, 0, iU2, charsetS);
        int iR = r(iU) + iU2;
        return new e(str, str2, l(bArr2, iR, u(iR, iU, bArr2), charsetS));
    }

    /* JADX WARN: Code duplicated, block: B:194:0x023b  */
    /* JADX WARN: Instruction removed from duplicated block: B:194:0x023b, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [pb.h] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10, types: [fa.r] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [fa.r] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9, types: [fa.r] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [int] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [int] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static h h(int i14, r rVar, boolean z14, int i15, a aVar) throws Throwable {
        int iY;
        ?? r14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        ?? r15;
        Throwable th3;
        ?? r16;
        int i16;
        ?? r17;
        ?? r18;
        ?? r19;
        ?? r24;
        Parcelable bVar;
        int i17 = i14;
        r rVar2 = rVar;
        int iU = rVar2.u();
        int iU2 = rVar2.u();
        int iU3 = rVar2.u();
        int iU4 = i17 >= 3 ? rVar2.u() : 0;
        if (i17 == 4) {
            iY = rVar2.y();
            if (!z14) {
                iY = (((iY >> 24) & 255) << 21) | (iY & 255) | (((iY >> 8) & 255) << 7) | (((iY >> 16) & 255) << 14);
            }
        } else {
            iY = i17 == 3 ? rVar2.y() : rVar2.x();
        }
        iU3 = iY;
        int iA = i17 >= 3 ? rVar2.A() : 0;
        if (iU == 0 && iU2 == 0 && iU3 == 0 && iU4 == 0 && iU3 == 0 && iA == 0) {
            rVar2.G(rVar2.f70056c);
            return null;
        }
        int i18 = rVar2.f70055b + iU3;
        if (i18 > rVar2.f70056c) {
            fa.k.g("Frame size exceeds remaining tag data");
            rVar2.G(rVar2.f70056c);
            return null;
        }
        if (aVar == null) {
            r14 = iU2;
        } else if (!aVar.evaluate(i17, iU, iU2, iU3, iU4)) {
            i17 = i17;
            r14 = iU2;
            rVar2.G(i18);
            return null;
        }
        i17 = i17;
        r14 = iU2;
        if (i17 == 3) {
            z15 = (iA & 128) != 0;
            z16 = (iA & 64) != 0;
            z19 = false;
            z18 = (iA & 32) != 0;
            z17 = z15;
        } else if (i17 == 4) {
            boolean z24 = (iA & 64) != 0;
            boolean z25 = (iA & 8) != 0;
            boolean z26 = (iA & 4) != 0;
            z19 = (iA & 2) != 0;
            z17 = (iA & 1) != 0;
            boolean z27 = z26;
            z18 = z24;
            z15 = z25;
            z16 = z27;
        } else {
            z15 = false;
            z16 = false;
            z17 = false;
            z18 = false;
            z19 = false;
        }
        if (z15 || z16) {
            fa.k.g("Skipping unsupported compressed or encrypted frame");
            rVar2.G(i18);
            return null;
        }
        if (z18) {
            iU3--;
            rVar2.H(1);
        }
        if (z17) {
            iU3 -= 4;
            rVar2.H(4);
        }
        if (z19) {
            iU3 = w(iU3, rVar2);
        }
        try {
            try {
                if (iU == 84 && r14 == 88 && iU3 == 88 && (i17 == 2 || iU4 == 88)) {
                    bVar = o(iU3, rVar2);
                } else if (iU == 84) {
                    bVar = m(iU3, rVar2, t(i17, iU, r14, iU3, iU4));
                } else if (iU == 87 && r14 == 88 && iU3 == 88 && (i17 == 2 || iU4 == 88)) {
                    bVar = q(iU3, rVar2);
                } else if (iU == 87) {
                    bVar = p(iU3, rVar2, t(i17, iU, r14, iU3, iU4));
                } else {
                    if (iU != 80 || r14 != 82 || iU3 != 73 || iU4 != 86) {
                        if (iU == 71 && r14 == 69 && iU3 == 79 && (iU4 == 66 || i17 == 2)) {
                            bVar = i(iU3, rVar2);
                        } else {
                            th3 = null;
                            try {
                                if (i17 != 2 ? iU == 65 && r14 == 80 && iU3 == 73 && iU4 == 67 : iU == 80 && r14 == 73 && iU3 == 67) {
                                    bVar = d(rVar2, iU3, i17);
                                } else {
                                    if (iU != 67 || r14 != 79 || iU3 != 77 || (iU4 != 77 && i17 != 2)) {
                                        if (iU == 67 && r14 == 72 && iU3 == 65 && iU4 == 80) {
                                            r14 = r14;
                                            iU3 = iU3;
                                            iU3 = iU3;
                                            i16 = iU4;
                                            try {
                                                bVar = e(rVar2, iU3, i17, z14, i15, aVar);
                                                i17 = i14;
                                                r14 = rVar;
                                            } catch (Exception e4) {
                                                e = e4;
                                                i17 = i14;
                                                r18 = rVar;
                                                r17 = r14;
                                                r18.G(i18);
                                                r19 = th3;
                                                r24 = r17;
                                            } catch (OutOfMemoryError e14) {
                                                e = e14;
                                                i17 = i14;
                                                r18 = rVar;
                                                r17 = r14;
                                                r18.G(i18);
                                                r19 = th3;
                                                r24 = r17;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                r16 = rVar;
                                                r16.G(i18);
                                                throw th;
                                            }
                                        } else {
                                            r14 = r14;
                                            iU3 = iU3;
                                            iU3 = iU3;
                                            i16 = iU4;
                                            try {
                                                if (iU == 67 && r14 == 84 && iU3 == 79 && i16 == 67) {
                                                    i17 = i14;
                                                    r rVar3 = rVar;
                                                    bVar = f(rVar3, iU3, i17, z14, i15, aVar);
                                                    r14 = rVar3;
                                                } else {
                                                    i17 = i14;
                                                    r rVar4 = rVar;
                                                    if (iU == 77 && r14 == 76 && iU3 == 76 && i16 == 84) {
                                                        bVar = j(iU3, rVar4);
                                                        r14 = rVar4;
                                                    } else {
                                                        String strT = t(i17, iU, r14, iU3, i16);
                                                        byte[] bArr = new byte[iU3];
                                                        rVar4.e(bArr, 0, iU3);
                                                        bVar = new pb.b(strT, bArr);
                                                        r14 = rVar4;
                                                    }
                                                }
                                            } catch (Exception e15) {
                                                e = e15;
                                                r18 = r14;
                                                r17 = r14;
                                                r18.G(i18);
                                                r19 = th3;
                                                r24 = r17;
                                            } catch (OutOfMemoryError e16) {
                                                e = e16;
                                                r18 = r14;
                                                r17 = r14;
                                                r18.G(i18);
                                                r19 = th3;
                                                r24 = r17;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                r16 = r14;
                                                r16.G(i18);
                                                throw th;
                                            }
                                        }
                                        if (r19 == 0) {
                                            fa.k.h("Failed to decode frame: id=" + t(i17, iU, r24, iU3, i16) + ", frameSize=" + iU3, e);
                                        }
                                        return r19;
                                    }
                                    bVar = g(iU3, rVar2);
                                }
                                r14 = rVar2;
                                iU3 = iU3;
                                r14 = r14;
                                i16 = iU4;
                            } catch (Exception e17) {
                                e = e17;
                                r15 = r14;
                                iU3 = iU3;
                                i16 = iU4;
                                r18 = rVar2;
                                r17 = r15;
                                r18.G(i18);
                                r19 = th3;
                                r24 = r17;
                                if (r19 == 0) {
                                    fa.k.h("Failed to decode frame: id=" + t(i17, iU, r24, iU3, i16) + ", frameSize=" + iU3, e);
                                }
                                return r19;
                            } catch (OutOfMemoryError e18) {
                                e = e18;
                                r15 = r14;
                                iU3 = iU3;
                                i16 = iU4;
                                r18 = rVar2;
                                r17 = r15;
                                r18.G(i18);
                                r19 = th3;
                                r24 = r17;
                                if (r19 == 0) {
                                    fa.k.h("Failed to decode frame: id=" + t(i17, iU, r24, iU3, i16) + ", frameSize=" + iU3, e);
                                }
                                return r19;
                            }
                        }
                        r14.G(i18);
                        r19 = bVar;
                        e = th3;
                        r24 = r14;
                        if (r19 == 0) {
                            fa.k.h("Failed to decode frame: id=" + t(i17, iU, r24, iU3, i16) + ", frameSize=" + iU3, e);
                        }
                        return r19;
                    }
                    bVar = k(iU3, rVar2);
                }
                r14 = rVar2;
                iU3 = iU3;
                th3 = null;
                r14 = r14;
                i16 = iU4;
                r14.G(i18);
                r19 = bVar;
                e = th3;
                r24 = r14;
            } catch (Throwable th6) {
                th = th6;
                r16 = rVar2;
            }
        } catch (Exception e19) {
            e = e19;
            r15 = r14;
            iU3 = iU3;
            th3 = null;
            i16 = iU4;
            r18 = rVar2;
            r17 = r15;
            r18.G(i18);
            r19 = th3;
            r24 = r17;
            if (r19 == 0) {
                fa.k.h("Failed to decode frame: id=" + t(i17, iU, r24, iU3, i16) + ", frameSize=" + iU3, e);
            }
            return r19;
        } catch (OutOfMemoryError e24) {
            e = e24;
            r15 = r14;
            iU3 = iU3;
            th3 = null;
            i16 = iU4;
            r18 = rVar2;
            r17 = r15;
            r18.G(i18);
            r19 = th3;
            r24 = r17;
            if (r19 == 0) {
                fa.k.h("Failed to decode frame: id=" + t(i17, iU, r24, iU3, i16) + ", frameSize=" + iU3, e);
            }
            return r19;
        }
        if (r19 == 0) {
            fa.k.h("Failed to decode frame: id=" + t(i17, iU, r24, iU3, i16) + ", frameSize=" + iU3, e);
        }
        return r19;
    }

    public static f i(int i14, r rVar) {
        int iU = rVar.u();
        Charset charsetS = s(iU);
        int i15 = i14 - 1;
        byte[] bArr = new byte[i15];
        rVar.e(bArr, 0, i15);
        int iV = v(bArr, 0);
        String strN = x.n(new String(bArr, 0, iV, StandardCharsets.ISO_8859_1));
        int i16 = iV + 1;
        int iU2 = u(i16, iU, bArr);
        String strL = l(bArr, i16, iU2, charsetS);
        int iR = r(iU) + iU2;
        int iU3 = u(iR, iU, bArr);
        String strL2 = l(bArr, iR, iU3, charsetS);
        int iR2 = r(iU) + iU3;
        return new f(strN, strL, strL2, i15 <= iR2 ? z.f70076f : Arrays.copyOfRange(bArr, iR2, i15));
    }

    public static k j(int i14, r rVar) {
        int iA = rVar.A();
        int iX = rVar.x();
        int iX2 = rVar.x();
        int iU = rVar.u();
        int iU2 = rVar.u();
        q qVar = new q();
        qVar.k(rVar);
        int i15 = ((i14 - 10) * 8) / (iU + iU2);
        int[] iArr = new int[i15];
        int[] iArr2 = new int[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            int iG = qVar.g(iU);
            int iG2 = qVar.g(iU2);
            iArr[i16] = iG;
            iArr2[i16] = iG2;
        }
        return new k(iA, iX, iX2, iArr, iArr2);
    }

    public static l k(int i14, r rVar) {
        byte[] bArr = new byte[i14];
        rVar.e(bArr, 0, i14);
        int iV = v(bArr, 0);
        String str = new String(bArr, 0, iV, StandardCharsets.ISO_8859_1);
        int i15 = iV + 1;
        return new l(str, i14 <= i15 ? z.f70076f : Arrays.copyOfRange(bArr, i15, i14));
    }

    public static String l(byte[] bArr, int i14, int i15, Charset charset) {
        return (i15 <= i14 || i15 > bArr.length) ? "" : new String(bArr, i14, i15 - i14, charset);
    }

    public static m m(int i14, r rVar, String str) {
        if (i14 < 1) {
            return null;
        }
        int iU = rVar.u();
        int i15 = i14 - 1;
        byte[] bArr = new byte[i15];
        rVar.e(bArr, 0, i15);
        return new m(str, (String) null, n(iU, 0, bArr));
    }

    public static ImmutableList n(int i14, int i15, byte[] bArr) {
        if (i15 >= bArr.length) {
            return ImmutableList.of("");
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        int iU = u(i15, i14, bArr);
        while (i15 < iU) {
            builder.add(new String(bArr, i15, iU - i15, s(i14)));
            i15 = r(i14) + iU;
            iU = u(i15, i14, bArr);
        }
        ImmutableList immutableListBuild = builder.build();
        return immutableListBuild.isEmpty() ? ImmutableList.of("") : immutableListBuild;
    }

    public static m o(int i14, r rVar) {
        if (i14 < 1) {
            return null;
        }
        int iU = rVar.u();
        int i15 = i14 - 1;
        byte[] bArr = new byte[i15];
        rVar.e(bArr, 0, i15);
        int iU2 = u(0, iU, bArr);
        return new m("TXXX", new String(bArr, 0, iU2, s(iU)), n(iU, r(iU) + iU2, bArr));
    }

    public static n p(int i14, r rVar, String str) {
        byte[] bArr = new byte[i14];
        rVar.e(bArr, 0, i14);
        return new n(str, null, new String(bArr, 0, v(bArr, 0), StandardCharsets.ISO_8859_1));
    }

    public static n q(int i14, r rVar) {
        if (i14 < 1) {
            return null;
        }
        int iU = rVar.u();
        int i15 = i14 - 1;
        byte[] bArr = new byte[i15];
        rVar.e(bArr, 0, i15);
        int iU2 = u(0, iU, bArr);
        String str = new String(bArr, 0, iU2, s(iU));
        int iR = r(iU) + iU2;
        return new n("WXXX", str, l(bArr, iR, v(bArr, iR), StandardCharsets.ISO_8859_1));
    }

    public static int r(int i14) {
        return (i14 == 0 || i14 == 3) ? 1 : 2;
    }

    public static Charset s(int i14) {
        if (i14 == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i14 != 2) {
            return i14 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8;
        }
        return StandardCharsets.UTF_16BE;
    }

    public static String t(int i14, int i15, int i16, int i17, int i18) {
        return i14 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i18));
    }

    public static int u(int i14, int i15, byte[] bArr) {
        int iV = v(bArr, i14);
        if (i15 == 0 || i15 == 3) {
            return iV;
        }
        while (iV < bArr.length - 1) {
            if ((iV - i14) % 2 == 0 && bArr[iV + 1] == 0) {
                return iV;
            }
            iV = v(bArr, iV + 1);
        }
        return bArr.length;
    }

    public static int v(byte[] bArr, int i14) {
        while (i14 < bArr.length) {
            if (bArr[i14] == 0) {
                return i14;
            }
            i14++;
        }
        return bArr.length;
    }

    public static int w(int i14, r rVar) {
        byte[] bArr = rVar.f70054a;
        int i15 = rVar.f70055b;
        int i16 = i15;
        while (true) {
            int i17 = i16 + 1;
            if (i17 >= i15 + i14) {
                return i14;
            }
            if ((bArr[i16] & UnsignedBytes.MAX_VALUE) == 255 && bArr[i17] == 0) {
                System.arraycopy(bArr, i16 + 2, bArr, i17, (i14 - (i16 - i15)) - 2);
                i14--;
            }
            i16 = i17;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007a A[PHI: r3
      0x007a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0087, B:33:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    public static boolean x(r rVar, int i14, int i15, boolean z14) {
        int iX;
        long jX;
        int iA;
        int i16;
        int i17 = rVar.f70055b;
        while (true) {
            try {
                boolean z15 = true;
                if (rVar.a() < i15) {
                    rVar.G(i17);
                    return true;
                }
                if (i14 >= 3) {
                    iX = rVar.g();
                    jX = rVar.w();
                    iA = rVar.A();
                } else {
                    iX = rVar.x();
                    jX = rVar.x();
                    iA = 0;
                }
                if (iX == 0 && jX == 0 && iA == 0) {
                    rVar.G(i17);
                    return true;
                }
                if (i14 == 4 && !z14) {
                    if ((8421504 & jX) != 0) {
                        rVar.G(i17);
                        return false;
                    }
                    jX = (((jX >> 24) & 255) << 21) | (jX & 255) | (((jX >> 8) & 255) << 7) | (((jX >> 16) & 255) << 14);
                }
                if (i14 == 4) {
                    i16 = (iA & 64) != 0 ? 1 : 0;
                    if ((iA & 1) == 0) {
                        z15 = false;
                    }
                } else if (i14 == 3) {
                    i16 = (iA & 32) != 0 ? 1 : 0;
                    if ((iA & 128) == 0) {
                        z15 = false;
                    }
                } else {
                    i16 = 0;
                    z15 = false;
                }
                if (z15) {
                    i16 += 4;
                }
                if (jX < i16) {
                    rVar.G(i17);
                    return false;
                }
                if (rVar.a() < jX) {
                    rVar.G(i17);
                    return false;
                }
                rVar.H((int) jX);
            } catch (Throwable th3) {
                rVar.G(i17);
                throw th3;
            }
        }
    }

    @Override // kb.b
    public final w b(kb.a aVar, ByteBuffer byteBuffer) {
        return c(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0099 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x009a  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c5 A[SYNTHETIC] */
    public final w c(int i14, byte[] bArr) throws Throwable {
        boolean z14;
        b bVar;
        int i15;
        int i16;
        int iW;
        h hVarH;
        ArrayList arrayList = new ArrayList();
        r rVar = new r(bArr, i14);
        boolean z15 = false;
        if (rVar.a() < 10) {
            fa.k.g("Data too short to be an ID3 tag");
        } else {
            int iX = rVar.x();
            if (iX == 4801587) {
                int iU = rVar.u();
                rVar.H(1);
                int iU2 = rVar.u();
                int iT = rVar.t();
                if (iU != 2) {
                    if (iU == 3) {
                        if ((iU2 & 64) != 0) {
                            int iG = rVar.g();
                            rVar.H(iG);
                            iT -= iG + 4;
                        }
                    } else if (iU == 4) {
                        if ((iU2 & 64) != 0) {
                            int iT2 = rVar.t();
                            rVar.H(iT2 - 4);
                            iT -= iT2;
                        }
                        if ((iU2 & 16) != 0) {
                            iT -= 10;
                        }
                    } else {
                        fb1.c.r(iU, "Skipped ID3 tag with unsupported majorVersion=");
                    }
                    if (iU < 4) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    bVar = new b(iU, z14, iT);
                } else if ((iU2 & 64) != 0) {
                    fa.k.g("Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iU < 4 || (iU2 & 128) == 0) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    bVar = new b(iU, z14, iT);
                }
                if (bVar == null) {
                    return null;
                }
                i15 = bVar.f136809a;
                int i17 = rVar.f70055b;
                i16 = i15 == 2 ? 6 : 10;
                iW = bVar.f136811c;
                if (bVar.f136810b) {
                    iW = w(iW, rVar);
                }
                rVar.F(i17 + iW);
                if (!x(rVar, i15, i16, false)) {
                    if (i15 == 4 || !x(rVar, 4, i16, true)) {
                        fb1.c.r(i15, "Failed to validate ID3 tag with majorVersion=");
                        return null;
                    }
                    z15 = true;
                }
                while (rVar.a() >= i16) {
                    hVarH = h(i15, rVar, z15, i16, this.f136808a);
                    if (hVarH != null) {
                        arrayList.add(hVarH);
                    }
                }
                return new w(arrayList);
            }
            fa.k.g("Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iX))));
        }
        bVar = null;
        if (bVar == null) {
            return null;
        }
        i15 = bVar.f136809a;
        int i18 = rVar.f70055b;
        if (i15 == 2) {
        }
        iW = bVar.f136811c;
        if (bVar.f136810b) {
            iW = w(iW, rVar);
        }
        rVar.F(i18 + iW);
        if (!x(rVar, i15, i16, false)) {
            if (i15 == 4) {
            }
            fb1.c.r(i15, "Failed to validate ID3 tag with majorVersion=");
            return null;
        }
        while (rVar.a() >= i16) {
            hVarH = h(i15, rVar, z15, i16, this.f136808a);
            if (hVarH != null) {
                arrayList.add(hVarH);
            }
        }
        return new w(arrayList);
    }

    public g() {
        this(null);
    }
}
