package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;
import com.google.common.collect.ImmutableList;
import com.tsmclient.smartcard.terminal.APDUConstants;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTAudioModuleCore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes4.dex */
public final class am1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f1193a = wlq.i0("OpusHead");

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1195b;
        public int c;
        public long d;
        public final boolean e;
        public final okh f;
        public final okh g;
        public int h;
        public int i;

        public a(okh okhVar, okh okhVar2, boolean z) {
            this.g = okhVar;
            this.f = okhVar2;
            this.e = z;
            okhVar2.P(12);
            this.f1194a = okhVar2.H();
            okhVar.P(12);
            this.i = okhVar.H();
            rk1.h(okhVar.n() == 1, "first_chunk must be 1");
            this.f1195b = -1;
        }

        public boolean a() {
            int i = this.f1195b + 1;
            this.f1195b = i;
            if (i == this.f1194a) {
                return false;
            }
            this.d = this.e ? this.f.I() : this.f.F();
            if (this.f1195b == this.h) {
                this.c = this.g.H();
                this.g.Q(4);
                int i2 = this.i - 1;
                this.i = i2;
                this.h = i2 > 0 ? this.g.H() - 1 : -1;
            }
            return true;
        }
    }

    public interface b {
        int a();

        int b();

        int c();
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final smp[] f1196a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Format f1197b;
        public int c;
        public int d = 0;

        public c(int i) {
            this.f1196a = new smp[i];
        }
    }

    public static final class d implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f1199b;
        public final okh c;

        public d(zl1.b bVar, Format format) {
            okh okhVar = bVar.f41416b;
            this.c = okhVar;
            okhVar.P(12);
            int iH = okhVar.H();
            if ("audio/raw".equals(format.l)) {
                int iZ = wlq.Z(format.A, format.y);
                if (iH == 0 || iH % iZ != 0) {
                    StringBuilder sb = new StringBuilder(88);
                    sb.append("Audio sample size mismatch. stsd sample size: ");
                    sb.append(iZ);
                    sb.append(", stsz sample size: ");
                    sb.append(iH);
                    toe.h("AtomParsers", sb.toString());
                    iH = iZ;
                }
            }
            this.f1198a = iH == 0 ? -1 : iH;
            this.f1199b = okhVar.H();
        }

        @Override // am1.b
        public int a() {
            int i = this.f1198a;
            return i == -1 ? this.c.H() : i;
        }

        @Override // am1.b
        public int b() {
            return this.f1199b;
        }

        @Override // am1.b
        public int c() {
            return this.f1198a;
        }
    }

    public static final class e implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final okh f1200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f1201b;
        public final int c;
        public int d;
        public int e;

        public e(zl1.b bVar) {
            okh okhVar = bVar.f41416b;
            this.f1200a = okhVar;
            okhVar.P(12);
            this.c = okhVar.H() & 255;
            this.f1201b = okhVar.H();
        }

        @Override // am1.b
        public int a() {
            int i = this.c;
            if (i == 8) {
                return this.f1200a.D();
            }
            if (i == 16) {
                return this.f1200a.J();
            }
            int i2 = this.d;
            this.d = i2 + 1;
            if (i2 % 2 != 0) {
                return this.e & 15;
            }
            int iD = this.f1200a.D();
            this.e = iD;
            return (iD & 240) >> 4;
        }

        @Override // am1.b
        public int b() {
            return this.f1201b;
        }

        @Override // am1.b
        public int c() {
            return -1;
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f1203b;
        public final int c;

        public f(int i, long j, int i2) {
            this.f1202a = i;
            this.f1203b = j;
            this.c = i2;
        }
    }

    public static Pair<Metadata, Metadata> A(zl1.b bVar) {
        okh okhVar = bVar.f41416b;
        okhVar.P(8);
        Metadata metadataB = null;
        Metadata metadataT = null;
        while (okhVar.a() >= 8) {
            int iE = okhVar.e();
            int iN = okhVar.n();
            int iN2 = okhVar.n();
            if (iN2 == 1835365473) {
                okhVar.P(iE);
                metadataB = B(okhVar, iE + iN);
            } else if (iN2 == 1936553057) {
                okhVar.P(iE);
                metadataT = t(okhVar, iE + iN);
            }
            okhVar.P(iE + iN);
        }
        return Pair.create(metadataB, metadataT);
    }

    public static Metadata B(okh okhVar, int i) {
        okhVar.Q(8);
        d(okhVar);
        while (okhVar.e() < i) {
            int iE = okhVar.e();
            int iN = okhVar.n();
            if (okhVar.n() == 1768715124) {
                okhVar.P(iE);
                return k(okhVar, iE + iN);
            }
            okhVar.P(iE + iN);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:98:0x0185 A[PHI: r13
      0x0185: PHI (r13v18 int) = (r13v17 int), (r13v19 int) binds: [B:92:0x0179, B:94:0x017c] A[DONT_GENERATE, DONT_INLINE]] */
    public static void C(okh okhVar, int i, int i2, int i3, int i4, int i5, DrmInitData drmInitData, c cVar, int i6) throws ParserException {
        DrmInitData drmInitData2;
        List<byte[]> list;
        String str;
        List<byte[]> list2;
        String str2;
        String str3;
        int i7 = i2;
        DrmInitData drmInitDataD = drmInitData;
        okhVar.P(i7 + 16);
        okhVar.Q(16);
        int iJ = okhVar.J();
        int iJ2 = okhVar.J();
        okhVar.Q(50);
        int iE = okhVar.e();
        String str4 = null;
        int iIntValue = i;
        if (iIntValue == 1701733238) {
            Pair<Integer, smp> pairR = r(okhVar, i7, i3);
            if (pairR != null) {
                iIntValue = ((Integer) pairR.first).intValue();
                drmInitDataD = drmInitDataD == null ? null : drmInitDataD.d(((smp) pairR.second).f33795b);
                cVar.f1196a[i6] = (smp) pairR.second;
            }
            okhVar.P(iE);
        }
        String str5 = iIntValue == 1831958048 ? "video/mpeg" : null;
        float fP = 1.0f;
        int i8 = -1;
        boolean z = false;
        byte[] bArrQ = null;
        List<byte[]> listOf = null;
        while (true) {
            if (iE - i7 >= i3) {
                drmInitData2 = drmInitDataD;
                list = listOf;
                break;
            }
            okhVar.P(iE);
            int iE2 = okhVar.e();
            drmInitData2 = drmInitDataD;
            int iN = okhVar.n();
            if (iN == 0) {
                list = listOf;
                if (okhVar.e() - i7 == i3) {
                    break;
                }
            } else {
                list = listOf;
            }
            rk1.h(iN > 0, "childAtomSize should be positive");
            int iN2 = okhVar.n();
            if (iN2 == 1635148611) {
                rk1.g(str5 == null);
                okhVar.P(iE2 + 8);
                et1 et1VarB = et1.b(okhVar);
                list2 = et1VarB.f17036a;
                cVar.c = et1VarB.f17037b;
                if (!z) {
                    fP = et1VarB.e;
                }
                str2 = et1VarB.f;
                str3 = "video/avc";
            } else {
                if (iN2 == 1752589123) {
                    rk1.g(str5 == null);
                    okhVar.P(iE2 + 8);
                    g7c g7cVarA = g7c.a(okhVar);
                    list2 = g7cVarA.f18675a;
                    cVar.c = g7cVarA.f18676b;
                    str2 = g7cVarA.c;
                    str3 = "video/hevc";
                } else {
                    if (iN2 == 1685480259 || iN2 == 1685485123) {
                        b17 b17VarA = b17.a(okhVar);
                        if (b17VarA != null) {
                            str4 = b17VarA.c;
                            str5 = "video/dolby-vision";
                        }
                    } else {
                        if (iN2 == 1987076931) {
                            rk1.g(str5 == null);
                            str = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                        } else if (iN2 == 1635135811) {
                            rk1.g(str5 == null);
                            str = "video/av01";
                        } else if (iN2 == 1681012275) {
                            rk1.g(str5 == null);
                            str = "video/3gpp";
                        } else if (iN2 == 1702061171) {
                            rk1.g(str5 == null);
                            Pair<String, byte[]> pairH = h(okhVar, iE2);
                            str5 = (String) pairH.first;
                            byte[] bArr = (byte[]) pairH.second;
                            if (bArr != null) {
                                listOf = ImmutableList.of(bArr);
                            }
                        } else if (iN2 == 1885434736) {
                            listOf = list;
                            fP = p(okhVar, iE2);
                            z = true;
                        } else if (iN2 == 1937126244) {
                            listOf = list;
                            bArrQ = q(okhVar, iE2, iN);
                        } else if (iN2 == 1936995172) {
                            int iD = okhVar.D();
                            okhVar.Q(3);
                            if (iD == 0) {
                                int iD2 = okhVar.D();
                                if (iD2 != 0) {
                                    int i9 = 1;
                                    if (iD2 != 1) {
                                        i9 = 2;
                                        if (iD2 == 2) {
                                            i8 = i9;
                                        } else if (iD2 == 3) {
                                            listOf = list;
                                            i8 = 3;
                                        }
                                    } else {
                                        i8 = i9;
                                    }
                                } else {
                                    listOf = list;
                                    i8 = 0;
                                }
                            }
                        }
                        listOf = list;
                        str5 = str;
                    }
                    listOf = list;
                }
                iE += iN;
                i7 = i2;
                drmInitDataD = drmInitData2;
            }
            listOf = list2;
            str5 = str3;
            str4 = str2;
            iE += iN;
            i7 = i2;
            drmInitDataD = drmInitData2;
        }
        if (str5 == null) {
            return;
        }
        cVar.f1197b = new Format.b().R(i4).e0(str5).I(str4).j0(iJ).Q(iJ2).a0(fP).d0(i5).b0(bArrQ).h0(i8).T(list).L(drmInitData2).E();
    }

    public static boolean a(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        return jArr[0] <= j2 && j2 < jArr[wlq.r(4, 0, length)] && jArr[wlq.r(jArr.length - 4, 0, length)] < j3 && j3 <= j;
    }

    public static int b(okh okhVar, int i, int i2) {
        int iE = okhVar.e();
        while (iE - i < i2) {
            okhVar.P(iE);
            int iN = okhVar.n();
            rk1.h(iN > 0, "childAtomSize should be positive");
            if (okhVar.n() == 1702061171) {
                return iE;
            }
            iE += iN;
        }
        return -1;
    }

    public static int c(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    public static void d(okh okhVar) {
        int iE = okhVar.e();
        okhVar.Q(4);
        if (okhVar.n() != 1751411826) {
            iE += 4;
        }
        okhVar.P(iE);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0164  */
    /* JADX WARN: Code duplicated, block: B:104:0x017c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0181  */
    /* JADX WARN: Code duplicated, block: B:107:0x0191  */
    /* JADX WARN: Code duplicated, block: B:109:0x0196  */
    /* JADX WARN: Code duplicated, block: B:110:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:112:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:113:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:115:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:118:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:120:0x0225  */
    /* JADX WARN: Code duplicated, block: B:122:0x022d  */
    /* JADX WARN: Code duplicated, block: B:123:0x0258  */
    /* JADX WARN: Code duplicated, block: B:124:0x025a  */
    /* JADX WARN: Code duplicated, block: B:126:0x0263  */
    /* JADX WARN: Code duplicated, block: B:128:0x0266  */
    /* JADX WARN: Code duplicated, block: B:130:0x026d  */
    /* JADX WARN: Code duplicated, block: B:132:0x027b  */
    /* JADX WARN: Code duplicated, block: B:134:0x0283  */
    /* JADX WARN: Code duplicated, block: B:147:0x0291 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x0291 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0136  */
    /* JADX WARN: Code duplicated, block: B:93:0x0140  */
    /* JADX WARN: Code duplicated, block: B:96:0x014f  */
    public static void e(okh okhVar, int i, int i2, int i3, int i4, String str, boolean z, DrmInitData drmInitData, c cVar, int i5) throws ParserException {
        int iJ;
        int iE;
        int iH;
        DrmInitData drmInitDataD;
        String str2;
        String str3;
        int i6;
        String str4;
        String str5;
        List<byte[]> listOf;
        int iN;
        int iN2;
        int i7;
        int iB;
        byte[] bArr;
        int i8 = i2;
        int i9 = i3;
        okhVar.P(i8 + 16);
        if (z) {
            iJ = okhVar.J();
            okhVar.Q(6);
        } else {
            okhVar.Q(8);
            iJ = 0;
        }
        boolean z2 = true;
        if (iJ == 0 || iJ == 1) {
            int iJ2 = okhVar.J();
            okhVar.Q(6);
            iE = okhVar.E();
            if (iJ == 1) {
                okhVar.Q(16);
            }
            iH = iJ2;
        } else {
            if (iJ != 2) {
                return;
            }
            okhVar.Q(16);
            iE = (int) Math.round(okhVar.l());
            iH = okhVar.H();
            okhVar.Q(20);
        }
        int iE2 = okhVar.e();
        int iIntValue = i;
        if (iIntValue == 1701733217) {
            Pair<Integer, smp> pairR = r(okhVar, i8, i9);
            if (pairR != null) {
                iIntValue = ((Integer) pairR.first).intValue();
                drmInitDataD = drmInitData == null ? null : drmInitData.d(((smp) pairR.second).f33795b);
                cVar.f1196a[i5] = (smp) pairR.second;
            } else {
                drmInitDataD = drmInitData;
            }
            okhVar.P(iE2);
        } else {
            drmInitDataD = drmInitData;
        }
        if (iIntValue == 1633889587) {
            str2 = "audio/ac3";
        } else if (iIntValue == 1700998451) {
            str2 = "audio/eac3";
        } else if (iIntValue == 1633889588) {
            str2 = "audio/ac4";
        } else if (iIntValue == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (iIntValue == 1685353320 || iIntValue == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (iIntValue == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (iIntValue == 1935764850) {
            str2 = "audio/3gpp";
        } else {
            if (iIntValue != 1935767394) {
                str3 = "audio/raw";
                if (iIntValue == 1819304813 || iIntValue == 1936684916) {
                    i6 = 2;
                } else if (iIntValue == 1953984371) {
                    i6 = 268435456;
                } else if (iIntValue == 778924082 || iIntValue == 778924083) {
                    str2 = "audio/mpeg";
                } else if (iIntValue == 1634492771) {
                    str2 = "audio/alac";
                } else if (iIntValue == 1634492791) {
                    str2 = "audio/g711-alaw";
                } else if (iIntValue == 1970037111) {
                    str2 = "audio/g711-mlaw";
                } else if (iIntValue == 1332770163) {
                    str2 = "audio/opus";
                } else if (iIntValue == 1716281667) {
                    str2 = "audio/flac";
                } else {
                    i6 = -1;
                    str3 = null;
                }
                str4 = str3;
                str5 = null;
                listOf = null;
                while (iE2 - i8 < i9) {
                    okhVar.P(iE2);
                    iN = okhVar.n();
                    if (iN <= 0) {
                        z2 = false;
                    }
                    rk1.h(z2, "childAtomSize should be positive");
                    iN2 = okhVar.n();
                    if (iN2 != 1702061171) {
                        if (z || iN2 != 2002876005) {
                            if (iN2 == 1684103987) {
                                okhVar.P(iE2 + 8);
                                cVar.f1197b = e20.c(okhVar, Integer.toString(i4), str, drmInitDataD);
                            } else if (iN2 == 1684366131) {
                                okhVar.P(iE2 + 8);
                                cVar.f1197b = e20.g(okhVar, Integer.toString(i4), str, drmInitDataD);
                            } else if (iN2 == 1684103988) {
                                okhVar.P(iE2 + 8);
                                cVar.f1197b = i20.b(okhVar, Integer.toString(i4), str, drmInitDataD);
                            } else if (iN2 == 1684305011) {
                                cVar.f1197b = new Format.b().R(i4).e0(str4).H(iH).f0(iE).L(drmInitDataD).V(str).E();
                            } else if (iN2 == 1682927731) {
                                int i10 = iN - 8;
                                byte[] bArr2 = f1193a;
                                byte[] bArrCopyOf = Arrays.copyOf(bArr2, bArr2.length + i10);
                                okhVar.P(iE2 + 8);
                                okhVar.j(bArrCopyOf, bArr2.length, i10);
                                listOf = gch.a(bArrCopyOf);
                                z2 = true;
                            } else if (iN2 == 1684425825) {
                                byte[] bArr3 = new byte[iN - 8];
                                bArr3[0] = 102;
                                z2 = true;
                                bArr3[1] = 76;
                                bArr3[2] = APDUConstants.TAG_MORE_DATA;
                                bArr3[3] = 67;
                                okhVar.P(iE2 + 12);
                                okhVar.j(bArr3, 4, iN - 12);
                                listOf = ImmutableList.of(bArr3);
                            } else {
                                z2 = true;
                                if (iN2 == 1634492771) {
                                    int i11 = iN - 12;
                                    byte[] bArr4 = new byte[i11];
                                    okhVar.P(iE2 + 12);
                                    okhVar.j(bArr4, 0, i11);
                                    Pair<Integer, Integer> pairG = m34.g(bArr4);
                                    int iIntValue2 = ((Integer) pairG.first).intValue();
                                    int iIntValue3 = ((Integer) pairG.second).intValue();
                                    listOf = ImmutableList.of(bArr4);
                                    iE = iIntValue2;
                                    iH = iIntValue3;
                                }
                            }
                            z2 = true;
                        } else {
                            i7 = 1702061171;
                            z2 = true;
                        }
                        iE2 += iN;
                        i8 = i2;
                        i9 = i3;
                    } else {
                        z2 = true;
                        i7 = 1702061171;
                    }
                    if (iN2 == i7) {
                        iB = iE2;
                    } else {
                        iB = b(okhVar, iE2, iN);
                    }
                    if (iB != -1) {
                        Pair<String, byte[]> pairH = h(okhVar, iB);
                        str4 = (String) pairH.first;
                        bArr = (byte[]) pairH.second;
                        if (bArr == null) {
                            if (MIOTAudioModuleCore.COMPRESSED_AUDIO_FILE_MIME_TYPE.equals(str4)) {
                                C3515if.b bVarG = C3515if.g(bArr);
                                iE = bVarG.f21072a;
                                iH = bVarG.f21073b;
                                str5 = bVarG.c;
                            }
                            listOf = ImmutableList.of(bArr);
                        }
                    }
                    iE2 += iN;
                    i8 = i2;
                    i9 = i3;
                }
                if (cVar.f1197b == null || str4 == null) {
                }
                cVar.f1197b = new Format.b().R(i4).e0(str4).I(str5).H(iH).f0(iE).Y(i6).T(listOf).L(drmInitDataD).V(str).E();
                return;
            }
            str2 = "audio/amr-wb";
        }
        str3 = str2;
        i6 = -1;
        str4 = str3;
        str5 = null;
        listOf = null;
        while (iE2 - i8 < i9) {
            okhVar.P(iE2);
            iN = okhVar.n();
            if (iN <= 0) {
                z2 = false;
            }
            rk1.h(z2, "childAtomSize should be positive");
            iN2 = okhVar.n();
            if (iN2 != 1702061171) {
                if (z) {
                }
                if (iN2 == 1684103987) {
                    okhVar.P(iE2 + 8);
                    cVar.f1197b = e20.c(okhVar, Integer.toString(i4), str, drmInitDataD);
                } else if (iN2 == 1684366131) {
                    okhVar.P(iE2 + 8);
                    cVar.f1197b = e20.g(okhVar, Integer.toString(i4), str, drmInitDataD);
                } else if (iN2 == 1684103988) {
                    okhVar.P(iE2 + 8);
                    cVar.f1197b = i20.b(okhVar, Integer.toString(i4), str, drmInitDataD);
                } else {
                    if (iN2 == 1684305011) {
                        cVar.f1197b = new Format.b().R(i4).e0(str4).H(iH).f0(iE).L(drmInitDataD).V(str).E();
                    } else if (iN2 == 1682927731) {
                        int i12 = iN - 8;
                        byte[] bArr5 = f1193a;
                        byte[] bArrCopyOf2 = Arrays.copyOf(bArr5, bArr5.length + i12);
                        okhVar.P(iE2 + 8);
                        okhVar.j(bArrCopyOf2, bArr5.length, i12);
                        listOf = gch.a(bArrCopyOf2);
                        z2 = true;
                    } else if (iN2 == 1684425825) {
                        byte[] bArr6 = new byte[iN - 8];
                        bArr6[0] = 102;
                        z2 = true;
                        bArr6[1] = 76;
                        bArr6[2] = APDUConstants.TAG_MORE_DATA;
                        bArr6[3] = 67;
                        okhVar.P(iE2 + 12);
                        okhVar.j(bArr6, 4, iN - 12);
                        listOf = ImmutableList.of(bArr6);
                    } else {
                        z2 = true;
                        if (iN2 == 1634492771) {
                            int i13 = iN - 12;
                            byte[] bArr7 = new byte[i13];
                            okhVar.P(iE2 + 12);
                            okhVar.j(bArr7, 0, i13);
                            Pair<Integer, Integer> pairG2 = m34.g(bArr7);
                            int iIntValue4 = ((Integer) pairG2.first).intValue();
                            int iIntValue5 = ((Integer) pairG2.second).intValue();
                            listOf = ImmutableList.of(bArr7);
                            iE = iIntValue4;
                            iH = iIntValue5;
                        }
                    }
                    iE2 += iN;
                    i8 = i2;
                    i9 = i3;
                }
                z2 = true;
                iE2 += iN;
                i8 = i2;
                i9 = i3;
            } else {
                z2 = true;
                i7 = 1702061171;
            }
            if (iN2 == i7) {
                iB = iE2;
            } else {
                iB = b(okhVar, iE2, iN);
            }
            if (iB != -1) {
                Pair<String, byte[]> pairH2 = h(okhVar, iB);
                str4 = (String) pairH2.first;
                bArr = (byte[]) pairH2.second;
                if (bArr == null) {
                    if (MIOTAudioModuleCore.COMPRESSED_AUDIO_FILE_MIME_TYPE.equals(str4)) {
                        C3515if.b bVarG2 = C3515if.g(bArr);
                        iE = bVarG2.f21072a;
                        iH = bVarG2.f21073b;
                        str5 = bVarG2.c;
                    }
                    listOf = ImmutableList.of(bArr);
                }
            }
            iE2 += iN;
            i8 = i2;
            i9 = i3;
        }
        if (cVar.f1197b == null) {
        }
    }

    public static Pair<Integer, smp> f(okh okhVar, int i, int i2) {
        int i3 = i + 8;
        int i4 = -1;
        int i5 = 0;
        String strA = null;
        Integer numValueOf = null;
        while (i3 - i < i2) {
            okhVar.P(i3);
            int iN = okhVar.n();
            int iN2 = okhVar.n();
            if (iN2 == 1718775137) {
                numValueOf = Integer.valueOf(okhVar.n());
            } else if (iN2 == 1935894637) {
                okhVar.Q(4);
                strA = okhVar.A(4);
            } else if (iN2 == 1935894633) {
                i4 = i3;
                i5 = iN;
            }
            i3 += iN;
        }
        if (!"cenc".equals(strA) && !"cbc1".equals(strA) && !"cens".equals(strA) && !"cbcs".equals(strA)) {
            return null;
        }
        rk1.j(numValueOf, "frma atom is mandatory");
        rk1.h(i4 != -1, "schi atom is mandatory");
        return Pair.create(numValueOf, (smp) rk1.j(s(okhVar, i4, i5, strA), "tenc atom is mandatory"));
    }

    public static Pair<long[], long[]> g(zl1.a aVar) {
        zl1.b bVarG = aVar.g(1701606260);
        if (bVarG == null) {
            return null;
        }
        okh okhVar = bVarG.f41416b;
        okhVar.P(8);
        int iC = zl1.c(okhVar.n());
        int iH = okhVar.H();
        long[] jArr = new long[iH];
        long[] jArr2 = new long[iH];
        for (int i = 0; i < iH; i++) {
            jArr[i] = iC == 1 ? okhVar.I() : okhVar.F();
            jArr2[i] = iC == 1 ? okhVar.w() : okhVar.n();
            if (okhVar.z() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            okhVar.Q(2);
        }
        return Pair.create(jArr, jArr2);
    }

    public static Pair<String, byte[]> h(okh okhVar, int i) {
        okhVar.P(i + 12);
        okhVar.Q(1);
        i(okhVar);
        okhVar.Q(2);
        int iD = okhVar.D();
        if ((iD & 128) != 0) {
            okhVar.Q(2);
        }
        if ((iD & 64) != 0) {
            okhVar.Q(okhVar.J());
        }
        if ((iD & 32) != 0) {
            okhVar.Q(2);
        }
        okhVar.Q(1);
        i(okhVar);
        String strH = ayf.h(okhVar.D());
        if ("audio/mpeg".equals(strH) || "audio/vnd.dts".equals(strH) || "audio/vnd.dts.hd".equals(strH)) {
            return Pair.create(strH, null);
        }
        okhVar.Q(12);
        okhVar.Q(1);
        int i2 = i(okhVar);
        byte[] bArr = new byte[i2];
        okhVar.j(bArr, 0, i2);
        return Pair.create(strH, bArr);
    }

    public static int i(okh okhVar) {
        int iD = okhVar.D();
        int i = iD & 127;
        while ((iD & 128) == 128) {
            iD = okhVar.D();
            i = (i << 7) | (iD & 127);
        }
        return i;
    }

    public static int j(okh okhVar) {
        okhVar.P(16);
        return okhVar.n();
    }

    public static Metadata k(okh okhVar, int i) {
        okhVar.Q(8);
        ArrayList arrayList = new ArrayList();
        while (okhVar.e() < i) {
            Metadata.Entry entryC = utf.c(okhVar);
            if (entryC != null) {
                arrayList.add(entryC);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static Pair<Long, String> l(okh okhVar) {
        okhVar.P(8);
        int iC = zl1.c(okhVar.n());
        okhVar.Q(iC == 0 ? 8 : 16);
        long jF = okhVar.F();
        okhVar.Q(iC == 0 ? 4 : 8);
        int iJ = okhVar.J();
        StringBuilder sb = new StringBuilder(3);
        sb.append((char) (((iJ >> 10) & 31) + 96));
        sb.append((char) (((iJ >> 5) & 31) + 96));
        sb.append((char) ((iJ & 31) + 96));
        return Pair.create(Long.valueOf(jF), sb.toString());
    }

    public static Metadata m(zl1.a aVar) {
        zl1.b bVarG = aVar.g(1751411826);
        zl1.b bVarG2 = aVar.g(1801812339);
        zl1.b bVarG3 = aVar.g(1768715124);
        if (bVarG == null || bVarG2 == null || bVarG3 == null || j(bVarG.f41416b) != 1835299937) {
            return null;
        }
        okh okhVar = bVarG2.f41416b;
        okhVar.P(12);
        int iN = okhVar.n();
        String[] strArr = new String[iN];
        for (int i = 0; i < iN; i++) {
            int iN2 = okhVar.n();
            okhVar.Q(4);
            strArr[i] = okhVar.A(iN2 - 8);
        }
        okh okhVar2 = bVarG3.f41416b;
        okhVar2.P(8);
        ArrayList arrayList = new ArrayList();
        while (okhVar2.a() > 8) {
            int iE = okhVar2.e();
            int iN3 = okhVar2.n();
            int iN4 = okhVar2.n() - 1;
            if (iN4 < 0 || iN4 >= iN) {
                StringBuilder sb = new StringBuilder(52);
                sb.append("Skipped metadata with unknown key index: ");
                sb.append(iN4);
                toe.h("AtomParsers", sb.toString());
            } else {
                MdtaMetadataEntry mdtaMetadataEntryF = utf.f(okhVar2, iE + iN3, strArr[iN4]);
                if (mdtaMetadataEntryF != null) {
                    arrayList.add(mdtaMetadataEntryF);
                }
            }
            okhVar2.P(iE + iN3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static void n(okh okhVar, int i, int i2, int i3, c cVar) {
        okhVar.P(i2 + 16);
        if (i == 1835365492) {
            okhVar.x();
            String strX = okhVar.x();
            if (strX != null) {
                cVar.f1197b = new Format.b().R(i3).e0(strX).E();
            }
        }
    }

    public static long o(okh okhVar) {
        okhVar.P(8);
        okhVar.Q(zl1.c(okhVar.n()) != 0 ? 16 : 8);
        return okhVar.F();
    }

    public static float p(okh okhVar, int i) {
        okhVar.P(i + 8);
        return okhVar.H() / okhVar.H();
    }

    public static byte[] q(okh okhVar, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            okhVar.P(i3);
            int iN = okhVar.n();
            if (okhVar.n() == 1886547818) {
                return Arrays.copyOfRange(okhVar.d(), i3, iN + i3);
            }
            i3 += iN;
        }
        return null;
    }

    public static Pair<Integer, smp> r(okh okhVar, int i, int i2) {
        Pair<Integer, smp> pairF;
        int iE = okhVar.e();
        while (iE - i < i2) {
            okhVar.P(iE);
            int iN = okhVar.n();
            rk1.h(iN > 0, "childAtomSize should be positive");
            if (okhVar.n() == 1936289382 && (pairF = f(okhVar, iE, iN)) != null) {
                return pairF;
            }
            iE += iN;
        }
        return null;
    }

    public static smp s(okh okhVar, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            okhVar.P(i5);
            int iN = okhVar.n();
            if (okhVar.n() == 1952804451) {
                int iC = zl1.c(okhVar.n());
                okhVar.Q(1);
                if (iC == 0) {
                    okhVar.Q(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int iD = okhVar.D();
                    i3 = iD & 15;
                    i4 = (iD & 240) >> 4;
                }
                boolean z = okhVar.D() == 1;
                int iD2 = okhVar.D();
                byte[] bArr2 = new byte[16];
                okhVar.j(bArr2, 0, 16);
                if (z && iD2 == 0) {
                    int iD3 = okhVar.D();
                    bArr = new byte[iD3];
                    okhVar.j(bArr, 0, iD3);
                }
                return new smp(z, str, iD2, bArr2, i4, i3, bArr);
            }
            i5 += iN;
        }
    }

    public static Metadata t(okh okhVar, int i) {
        okhVar.Q(12);
        while (okhVar.e() < i) {
            int iE = okhVar.e();
            int iN = okhVar.n();
            if (okhVar.n() == 1935766900) {
                if (iN < 14) {
                    return null;
                }
                okhVar.Q(5);
                int iD = okhVar.D();
                if (iD != 12 && iD != 13) {
                    return null;
                }
                float f2 = iD == 12 ? 240.0f : 120.0f;
                okhVar.Q(1);
                return new Metadata(new SmtaMetadataEntry(f2, okhVar.D()));
            }
            okhVar.P(iE + iN);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:150:0x03be  */
    /* JADX WARN: Code duplicated, block: B:151:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:155:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:157:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:165:0x0419  */
    /* JADX WARN: Code duplicated, block: B:166:0x041b  */
    /* JADX WARN: Code duplicated, block: B:168:0x0420  */
    /* JADX WARN: Code duplicated, block: B:172:0x043e  */
    /* JADX WARN: Code duplicated, block: B:173:0x0440  */
    /* JADX WARN: Code duplicated, block: B:176:0x0445  */
    /* JADX WARN: Code duplicated, block: B:177:0x0448  */
    /* JADX WARN: Code duplicated, block: B:179:0x044c  */
    /* JADX WARN: Code duplicated, block: B:180:0x044f  */
    /* JADX WARN: Code duplicated, block: B:182:0x0453  */
    /* JADX WARN: Code duplicated, block: B:184:0x0456  */
    /* JADX WARN: Code duplicated, block: B:185:0x0459  */
    /* JADX WARN: Code duplicated, block: B:189:0x0465  */
    /* JADX WARN: Code duplicated, block: B:191:0x0471  */
    /* JADX WARN: Code duplicated, block: B:192:0x0487  */
    /* JADX WARN: Code duplicated, block: B:195:0x0493  */
    /* JADX WARN: Code duplicated, block: B:208:0x0433 A[EDGE_INSN: B:208:0x0433->B:170:0x0433 BREAK  A[LOOP:2: B:153:0x03d3->B:169:0x0429], SYNTHETIC] */
    public static wnp u(rkp rkpVar, zl1.a aVar, hxa hxaVar) throws ParserException {
        b eVar;
        boolean z;
        int iH;
        int iH2;
        int iH3;
        int i;
        int i2;
        boolean z2;
        int i3;
        rkp rkpVar2;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int i4;
        int i5;
        long j;
        int[] iArr2;
        int iN;
        int i6;
        int i7;
        int[] iArr3;
        long j2;
        long[] jArr3;
        boolean z3;
        int[] iArr4;
        int[] iArr5;
        long[] jArr4;
        int i8;
        boolean z4;
        int i9;
        int i10;
        long[] jArr5;
        long[] jArr6;
        int[] iArr6;
        int i11;
        int i12;
        boolean z5;
        boolean z6;
        long[] jArr7;
        int[] iArr7;
        int[] iArr8;
        long[] jArr8;
        int i13;
        long j3;
        long j4;
        int i14;
        int i15;
        int[] iArr9;
        int[] iArr10;
        long j5;
        int i16;
        int i17;
        boolean z7;
        zl1.b bVarG = aVar.g(1937011578);
        if (bVarG != null) {
            eVar = new d(bVarG, rkpVar.f);
        } else {
            zl1.b bVarG2 = aVar.g(1937013298);
            if (bVarG2 == null) {
                throw new ParserException("Track has no sample table size information");
            }
            eVar = new e(bVarG2);
        }
        int iB = eVar.b();
        if (iB == 0) {
            return new wnp(rkpVar, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        zl1.b bVarG3 = aVar.g(1937007471);
        if (bVarG3 == null) {
            bVarG3 = (zl1.b) rk1.e(aVar.g(1668232756));
            z = true;
        } else {
            z = false;
        }
        okh okhVar = bVarG3.f41416b;
        okh okhVar2 = ((zl1.b) rk1.e(aVar.g(1937011555))).f41416b;
        okh okhVar3 = ((zl1.b) rk1.e(aVar.g(1937011827))).f41416b;
        zl1.b bVarG4 = aVar.g(1937011571);
        okh okhVar4 = bVarG4 != null ? bVarG4.f41416b : null;
        zl1.b bVarG5 = aVar.g(1668576371);
        okh okhVar5 = bVarG5 != null ? bVarG5.f41416b : null;
        a aVar2 = new a(okhVar2, okhVar, z);
        okhVar3.P(12);
        int iH4 = okhVar3.H() - 1;
        int iH5 = okhVar3.H();
        int iH6 = okhVar3.H();
        if (okhVar5 != null) {
            okhVar5.P(12);
            iH = okhVar5.H();
        } else {
            iH = 0;
        }
        if (okhVar4 != null) {
            okhVar4.P(12);
            iH2 = okhVar4.H();
            if (iH2 > 0) {
                iH3 = okhVar4.H() - 1;
            } else {
                iH3 = -1;
                okhVar4 = null;
            }
        } else {
            iH2 = 0;
            iH3 = -1;
        }
        int iC = eVar.c();
        String str = rkpVar.f.l;
        if (iC != -1 && ("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && iH4 == 0 && iH == 0 && iH2 == 0) {
            int i18 = aVar2.f1194a;
            long[] jArr9 = new long[i18];
            int[] iArr11 = new int[i18];
            while (aVar2.a()) {
                int i19 = aVar2.f1195b;
                jArr9[i19] = aVar2.d;
                iArr11[i19] = aVar2.c;
            }
            uw9.b bVarA = uw9.a(iC, jArr9, iArr11, iH6);
            long[] jArr10 = bVarA.f36209a;
            int[] iArr12 = bVarA.f36210b;
            i4 = bVarA.c;
            long[] jArr11 = bVarA.d;
            int[] iArr13 = bVarA.e;
            long j6 = bVarA.f;
            i5 = iB;
            jArr = jArr10;
            iArr = iArr12;
            jArr2 = jArr11;
            iArr2 = iArr13;
            j = j6;
            rkpVar2 = rkpVar;
        } else {
            long[] jArrCopyOf = new long[iB];
            int[] iArrCopyOf = new int[iB];
            long[] jArrCopyOf2 = new long[iB];
            int[] iArrCopyOf2 = new int[iB];
            int iH7 = iH3;
            int i20 = 0;
            int i21 = 0;
            int iN2 = 0;
            int i22 = 0;
            int iH8 = 0;
            long j7 = 0;
            long j8 = 0;
            int i23 = iH;
            int i24 = iH6;
            int i25 = iH5;
            while (true) {
                if (i20 >= iB) {
                    i = i25;
                    i2 = i22;
                    break;
                }
                long j9 = j8;
                int i26 = i22;
                boolean zA = true;
                while (i26 == 0) {
                    zA = aVar2.a();
                    if (!zA) {
                        break;
                    }
                    int i27 = i25;
                    long j10 = aVar2.d;
                    i26 = aVar2.c;
                    j9 = j10;
                    i25 = i27;
                    i24 = i24;
                    iB = iB;
                }
                int i28 = iB;
                i = i25;
                int i29 = i24;
                if (!zA) {
                    toe.h("AtomParsers", "Unexpected end of chunk data");
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i20);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i20);
                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i20);
                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i20);
                    iB = i20;
                    i2 = i26;
                    break;
                }
                if (okhVar5 != null) {
                    while (iH8 == 0 && i23 > 0) {
                        iH8 = okhVar5.H();
                        iN2 = okhVar5.n();
                        i23--;
                    }
                    iH8--;
                }
                int i30 = iN2;
                jArrCopyOf[i20] = j9;
                int iA = eVar.a();
                iArrCopyOf[i20] = iA;
                if (iA > i21) {
                    i21 = iA;
                }
                jArrCopyOf2[i20] = j7 + ((long) i30);
                iArrCopyOf2[i20] = okhVar4 == null ? 1 : 0;
                if (i20 == iH7) {
                    iArrCopyOf2[i20] = 1;
                    iH2--;
                    if (iH2 > 0) {
                        iH7 = ((okh) rk1.e(okhVar4)).H() - 1;
                    }
                }
                int i31 = iH7;
                j7 += (long) i29;
                int iH9 = i - 1;
                if (iH9 != 0 || iH4 <= 0) {
                    iN = i29;
                    i6 = iH4;
                } else {
                    iH9 = okhVar3.H();
                    iN = okhVar3.n();
                    i6 = iH4 - 1;
                }
                int i32 = iH9;
                long j11 = j9 + ((long) iArrCopyOf[i20]);
                i22 = i26 - 1;
                i20++;
                j8 = j11;
                iH7 = i31;
                i24 = iN;
                iB = i28;
                iN2 = i30;
                int i33 = i6;
                i25 = i32;
                iH4 = i33;
            }
            long j12 = j7 + ((long) iN2);
            if (okhVar5 == null) {
                z2 = true;
                break;
            }
            while (true) {
                if (i23 <= 0) {
                    z2 = true;
                    break;
                }
                if (okhVar5.H() != 0) {
                    z2 = false;
                    break;
                }
                okhVar5.n();
                i23--;
            }
            if (iH2 == 0 && i == 0 && i2 == 0 && iH4 == 0) {
                i3 = iH8;
                if (i3 == 0 && z2) {
                    rkpVar2 = rkpVar;
                }
                jArr = jArrCopyOf;
                iArr = iArrCopyOf;
                jArr2 = jArrCopyOf2;
                i4 = i21;
                i5 = iB;
                j = j12;
                iArr2 = iArrCopyOf2;
            } else {
                i3 = iH8;
            }
            rkpVar2 = rkpVar;
            int i34 = rkpVar2.f32645a;
            String str2 = !z2 ? ", ctts invalid" : "";
            StringBuilder sb = new StringBuilder(str2.length() + 262);
            sb.append("Inconsistent stbl box for track ");
            sb.append(i34);
            sb.append(": remainingSynchronizationSamples ");
            sb.append(iH2);
            sb.append(", remainingSamplesAtTimestampDelta ");
            sb.append(i);
            sb.append(", remainingSamplesInChunk ");
            sb.append(i2);
            sb.append(", remainingTimestampDeltaChanges ");
            sb.append(iH4);
            sb.append(", remainingSamplesAtTimestampOffset ");
            sb.append(i3);
            sb.append(str2);
            toe.h("AtomParsers", sb.toString());
            jArr = jArrCopyOf;
            iArr = iArrCopyOf;
            jArr2 = jArrCopyOf2;
            i4 = i21;
            i5 = iB;
            j = j12;
            iArr2 = iArrCopyOf2;
        }
        long jH0 = wlq.H0(j, FolmeCore.NANOS_TO_MS, rkpVar2.c);
        long[] jArr12 = rkpVar2.h;
        if (jArr12 == null) {
            wlq.J0(jArr2, FolmeCore.NANOS_TO_MS, rkpVar2.c);
            return new wnp(rkpVar, jArr, iArr, i4, jArr2, iArr2, jH0);
        }
        if (jArr12.length == 1 && rkpVar2.f32646b == 1 && jArr2.length >= 2) {
            long j13 = ((long[]) rk1.e(rkpVar2.i))[0];
            long jH1 = j13 + wlq.H0(rkpVar2.h[0], rkpVar2.c, rkpVar2.d);
            i7 = i5;
            if (a(jArr2, j, j13, jH1)) {
                long jH2 = wlq.H0(j13 - jArr2[0], rkpVar2.f.z, rkpVar2.c);
                iArr3 = iArr2;
                j2 = j;
                long jH3 = wlq.H0(j - jH1, rkpVar2.f.z, rkpVar2.c);
                if ((jH2 != 0 || jH3 != 0) && jH2 <= 2147483647L && jH3 <= 2147483647L) {
                    hxaVar.f20561a = (int) jH2;
                    hxaVar.f20562b = (int) jH3;
                    wlq.J0(jArr2, FolmeCore.NANOS_TO_MS, rkpVar2.c);
                    return new wnp(rkpVar, jArr, iArr, i4, jArr2, iArr3, wlq.H0(rkpVar2.h[0], FolmeCore.NANOS_TO_MS, rkpVar2.d));
                }
            }
            jArr3 = rkpVar2.h;
            if (jArr3.length != 1 && jArr3[0] == 0) {
                long j14 = ((long[]) rk1.e(rkpVar2.i))[0];
                for (int i35 = 0; i35 < jArr2.length; i35++) {
                    jArr2[i35] = wlq.H0(jArr2[i35] - j14, FolmeCore.NANOS_TO_MS, rkpVar2.c);
                }
                return new wnp(rkpVar, jArr, iArr, i4, jArr2, iArr3, wlq.H0(j2 - j14, FolmeCore.NANOS_TO_MS, rkpVar2.c));
            }
            if (rkpVar2.f32646b == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            iArr4 = new int[jArr3.length];
            iArr5 = new int[jArr3.length];
            jArr4 = (long[]) rk1.e(rkpVar2.i);
            i8 = 0;
            z4 = false;
            i9 = 0;
            i10 = 0;
            while (true) {
                jArr5 = rkpVar2.h;
                if (i8 < jArr5.length) {
                    break;
                }
                j5 = jArr4[i8];
                if (j5 != -1) {
                    long jH4 = wlq.H0(jArr5[i8], rkpVar2.c, rkpVar2.d);
                    iArr4[i8] = wlq.i(jArr2, j5, true, true);
                    iArr5[i8] = wlq.e(jArr2, j5 + jH4, z3, false);
                    while (true) {
                        i16 = iArr4[i8];
                        i17 = iArr5[i8];
                        if (i16 >= i17 || (iArr3[i16] & 1) != 0) {
                            break;
                        }
                        iArr4[i8] = i16 + 1;
                    }
                    i9 += i17 - i16;
                    if (i10 != i16) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z4 = z7 | z4;
                    i10 = i17;
                }
                i8++;
                jArr4 = jArr4;
                i4 = i4;
                jArr = jArr;
                iArr = iArr;
            }
            jArr6 = jArr;
            iArr6 = iArr;
            i11 = i4;
            i12 = 0;
            if (i9 != i7) {
                z5 = true;
            } else {
                z5 = false;
            }
            z6 = z4 | z5;
            if (z6) {
                jArr7 = new long[i9];
            } else {
                jArr7 = jArr6;
            }
            if (z6) {
                iArr7 = new int[i9];
            } else {
                iArr7 = iArr6;
            }
            if (z6) {
                i11 = 0;
            }
            if (z6) {
                iArr8 = new int[i9];
            } else {
                iArr8 = iArr3;
            }
            jArr8 = new long[i9];
            i13 = 0;
            j3 = 0;
            while (i12 < rkpVar2.h.length) {
                j4 = rkpVar2.i[i12];
                i14 = iArr4[i12];
                i15 = iArr5[i12];
                int[] iArr14 = iArr5;
                if (z6) {
                    int i36 = i15 - i14;
                    System.arraycopy(jArr6, i14, jArr7, i13, i36);
                    iArr9 = iArr6;
                    System.arraycopy(iArr9, i14, iArr7, i13, i36);
                    iArr10 = iArr3;
                    System.arraycopy(iArr10, i14, iArr8, i13, i36);
                } else {
                    iArr9 = iArr6;
                    iArr10 = iArr3;
                }
                int i37 = i11;
                while (i14 < i15) {
                    int[] iArr15 = iArr9;
                    int i38 = i12;
                    long[] jArr13 = jArr2;
                    long[] jArr14 = jArr7;
                    long j15 = j3;
                    jArr8[i13] = wlq.H0(j3, FolmeCore.NANOS_TO_MS, rkpVar2.d) + wlq.H0(Math.max(0L, jArr2[i14] - j4), FolmeCore.NANOS_TO_MS, rkpVar2.c);
                    if (!z6 && iArr7[i13] > i37) {
                        i37 = iArr15[i14];
                    }
                    i13++;
                    i14++;
                    i12 = i38;
                    j3 = j15;
                    jArr2 = jArr13;
                    iArr9 = iArr15;
                    jArr7 = jArr14;
                }
                int[] iArr16 = iArr9;
                int i39 = i12;
                j3 += rkpVar2.h[i39];
                i12 = i39 + 1;
                iArr3 = iArr10;
                jArr2 = jArr2;
                iArr4 = iArr4;
                iArr6 = iArr16;
                jArr7 = jArr7;
                i11 = i37;
                iArr5 = iArr14;
            }
            return new wnp(rkpVar, jArr7, iArr7, i11, jArr8, iArr8, wlq.H0(j3, FolmeCore.NANOS_TO_MS, rkpVar2.d));
        }
        i7 = i5;
        iArr3 = iArr2;
        j2 = j;
        jArr3 = rkpVar2.h;
        if (jArr3.length != 1) {
        }
        if (rkpVar2.f32646b == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        iArr4 = new int[jArr3.length];
        iArr5 = new int[jArr3.length];
        jArr4 = (long[]) rk1.e(rkpVar2.i);
        i8 = 0;
        z4 = false;
        i9 = 0;
        i10 = 0;
        while (true) {
            jArr5 = rkpVar2.h;
            if (i8 < jArr5.length) {
                break;
                break;
            }
            j5 = jArr4[i8];
            if (j5 != -1) {
                long jH5 = wlq.H0(jArr5[i8], rkpVar2.c, rkpVar2.d);
                iArr4[i8] = wlq.i(jArr2, j5, true, true);
                iArr5[i8] = wlq.e(jArr2, j5 + jH5, z3, false);
                while (true) {
                    i16 = iArr4[i8];
                    i17 = iArr5[i8];
                    if (i16 >= i17) {
                        break;
                    }
                    break;
                    break;
                    iArr4[i8] = i16 + 1;
                }
                i9 += i17 - i16;
                if (i10 != i16) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z4 = z7 | z4;
                i10 = i17;
            }
            i8++;
            jArr4 = jArr4;
            i4 = i4;
            jArr = jArr;
            iArr = iArr;
        }
        jArr6 = jArr;
        iArr6 = iArr;
        i11 = i4;
        i12 = 0;
        if (i9 != i7) {
            z5 = true;
        } else {
            z5 = false;
        }
        z6 = z4 | z5;
        if (z6) {
            jArr7 = new long[i9];
        } else {
            jArr7 = jArr6;
        }
        if (z6) {
            iArr7 = new int[i9];
        } else {
            iArr7 = iArr6;
        }
        if (z6) {
            i11 = 0;
        }
        if (z6) {
            iArr8 = new int[i9];
        } else {
            iArr8 = iArr3;
        }
        jArr8 = new long[i9];
        i13 = 0;
        j3 = 0;
        while (i12 < rkpVar2.h.length) {
            j4 = rkpVar2.i[i12];
            i14 = iArr4[i12];
            i15 = iArr5[i12];
            int[] iArr17 = iArr5;
            if (z6) {
                int i310 = i15 - i14;
                System.arraycopy(jArr6, i14, jArr7, i13, i310);
                iArr9 = iArr6;
                System.arraycopy(iArr9, i14, iArr7, i13, i310);
                iArr10 = iArr3;
                System.arraycopy(iArr10, i14, iArr8, i13, i310);
            } else {
                iArr9 = iArr6;
                iArr10 = iArr3;
            }
            int i311 = i11;
            while (i14 < i15) {
                int[] iArr18 = iArr9;
                int i312 = i12;
                long[] jArr15 = jArr2;
                long[] jArr16 = jArr7;
                long j16 = j3;
                jArr8[i13] = wlq.H0(j3, FolmeCore.NANOS_TO_MS, rkpVar2.d) + wlq.H0(Math.max(0L, jArr2[i14] - j4), FolmeCore.NANOS_TO_MS, rkpVar2.c);
                if (!z6) {
                }
                i13++;
                i14++;
                i12 = i312;
                j3 = j16;
                jArr2 = jArr15;
                iArr9 = iArr18;
                jArr7 = jArr16;
            }
            int[] iArr19 = iArr9;
            int i313 = i12;
            j3 += rkpVar2.h[i313];
            i12 = i313 + 1;
            iArr3 = iArr10;
            jArr2 = jArr2;
            iArr4 = iArr4;
            iArr6 = iArr19;
            jArr7 = jArr7;
            i11 = i311;
            iArr5 = iArr17;
        }
        return new wnp(rkpVar, jArr7, iArr7, i11, jArr8, iArr8, wlq.H0(j3, FolmeCore.NANOS_TO_MS, rkpVar2.d));
    }

    public static c v(okh okhVar, int i, int i2, String str, DrmInitData drmInitData, boolean z) throws ParserException {
        int i3;
        okhVar.P(12);
        int iN = okhVar.n();
        c cVar = new c(iN);
        for (int i4 = 0; i4 < iN; i4++) {
            int iE = okhVar.e();
            int iN2 = okhVar.n();
            rk1.h(iN2 > 0, "childAtomSize should be positive");
            int iN3 = okhVar.n();
            if (iN3 == 1635148593 || iN3 == 1635148595 || iN3 == 1701733238 || iN3 == 1831958048 || iN3 == 1836070006 || iN3 == 1752589105 || iN3 == 1751479857 || iN3 == 1932670515 || iN3 == 1987063864 || iN3 == 1987063865 || iN3 == 1635135537 || iN3 == 1685479798 || iN3 == 1685479729 || iN3 == 1685481573 || iN3 == 1685481521) {
                i3 = iE;
                C(okhVar, iN3, i3, iN2, i, i2, drmInitData, cVar, i4);
            } else if (iN3 == 1836069985 || iN3 == 1701733217 || iN3 == 1633889587 || iN3 == 1700998451 || iN3 == 1633889588 || iN3 == 1685353315 || iN3 == 1685353317 || iN3 == 1685353320 || iN3 == 1685353324 || iN3 == 1935764850 || iN3 == 1935767394 || iN3 == 1819304813 || iN3 == 1936684916 || iN3 == 1953984371 || iN3 == 778924082 || iN3 == 778924083 || iN3 == 1634492771 || iN3 == 1634492791 || iN3 == 1970037111 || iN3 == 1332770163 || iN3 == 1716281667) {
                i3 = iE;
                e(okhVar, iN3, iE, iN2, i, str, z, drmInitData, cVar, i4);
            } else {
                if (iN3 == 1414810956 || iN3 == 1954034535 || iN3 == 2004251764 || iN3 == 1937010800 || iN3 == 1664495672) {
                    w(okhVar, iN3, iE, iN2, i, str, cVar);
                } else if (iN3 == 1835365492) {
                    n(okhVar, iN3, iE, i, cVar);
                } else if (iN3 == 1667329389) {
                    cVar.f1197b = new Format.b().R(i).e0("application/x-camera-motion").E();
                }
                i3 = iE;
            }
            okhVar.P(i3 + iN2);
        }
        return cVar;
    }

    public static void w(okh okhVar, int i, int i2, int i3, int i4, String str, c cVar) {
        okhVar.P(i2 + 16);
        String str2 = "application/ttml+xml";
        ImmutableList immutableListOf = null;
        long j = Long.MAX_VALUE;
        if (i != 1414810956) {
            if (i == 1954034535) {
                int i5 = i3 - 16;
                byte[] bArr = new byte[i5];
                okhVar.j(bArr, 0, i5);
                immutableListOf = ImmutableList.of(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i == 1937010800) {
                j = 0;
            } else {
                if (i != 1664495672) {
                    throw new IllegalStateException();
                }
                cVar.d = 1;
                str2 = "application/x-mp4-cea-608";
            }
        }
        cVar.f1197b = new Format.b().R(i4).e0(str2).V(str).i0(j).T(immutableListOf).E();
    }

    public static f x(okh okhVar) {
        long j;
        okhVar.P(8);
        int iC = zl1.c(okhVar.n());
        okhVar.Q(iC == 0 ? 8 : 16);
        int iN = okhVar.n();
        okhVar.Q(4);
        int iE = okhVar.e();
        int i = iC == 0 ? 4 : 8;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            j = -9223372036854775807L;
            if (i3 >= i) {
                okhVar.Q(i);
                break;
            }
            if (okhVar.d()[iE + i3] != -1) {
                long jF = iC == 0 ? okhVar.F() : okhVar.I();
                if (jF == 0) {
                    break;
                }
                j = jF;
                break;
            }
            i3++;
        }
        okhVar.Q(16);
        int iN2 = okhVar.n();
        int iN3 = okhVar.n();
        okhVar.Q(4);
        int iN4 = okhVar.n();
        int iN5 = okhVar.n();
        if (iN2 == 0 && iN3 == 65536 && iN4 == -65536 && iN5 == 0) {
            i2 = 90;
        } else if (iN2 == 0 && iN3 == -65536 && iN4 == 65536 && iN5 == 0) {
            i2 = 270;
        } else if (iN2 == -65536 && iN3 == 0 && iN4 == 0 && iN5 == -65536) {
            i2 = 180;
        }
        return new f(iN, j, i2);
    }

    public static rkp y(zl1.a aVar, zl1.b bVar, long j, DrmInitData drmInitData, boolean z, boolean z2) throws ParserException {
        long[] jArr;
        long[] jArr2;
        zl1.a aVarF;
        Pair<long[], long[]> pairG;
        zl1.a aVar2 = (zl1.a) rk1.e(aVar.f(1835297121));
        int iC = c(j(((zl1.b) rk1.e(aVar2.g(1751411826))).f41416b));
        if (iC == -1) {
            return null;
        }
        f fVarX = x(((zl1.b) rk1.e(aVar.g(1953196132))).f41416b);
        long j2 = j == -9223372036854775807L ? fVarX.f1203b : j;
        long jO = o(bVar.f41416b);
        long jH0 = j2 != -9223372036854775807L ? wlq.H0(j2, FolmeCore.NANOS_TO_MS, jO) : -9223372036854775807L;
        zl1.a aVar3 = (zl1.a) rk1.e(((zl1.a) rk1.e(aVar2.f(1835626086))).f(1937007212));
        Pair<Long, String> pairL = l(((zl1.b) rk1.e(aVar2.g(1835296868))).f41416b);
        c cVarV = v(((zl1.b) rk1.e(aVar3.g(1937011556))).f41416b, fVarX.f1202a, fVarX.c, (String) pairL.second, drmInitData, z2);
        if (z || (aVarF = aVar.f(1701082227)) == null || (pairG = g(aVarF)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) pairG.first;
            jArr2 = (long[]) pairG.second;
            jArr = jArr3;
        }
        if (cVarV.f1197b == null) {
            return null;
        }
        return new rkp(fVarX.f1202a, iC, ((Long) pairL.first).longValue(), jO, jH0, cVarV.f1197b, cVarV.d, cVarV.f1196a, cVarV.c, jArr, jArr2);
    }

    public static List<wnp> z(zl1.a aVar, hxa hxaVar, long j, DrmInitData drmInitData, boolean z, boolean z2, dua<rkp, rkp> duaVar) throws ParserException {
        rkp rkpVarApply;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < aVar.d.size(); i++) {
            zl1.a aVar2 = aVar.d.get(i);
            if (aVar2.f41414a == 1953653099 && (rkpVarApply = duaVar.apply(y(aVar2, (zl1.b) rk1.e(aVar.g(1836476516)), j, drmInitData, z, z2))) != null) {
                arrayList.add(u(rkpVarApply, (zl1.a) rk1.e(((zl1.a) rk1.e(((zl1.a) rk1.e(aVar2.f(1835297121))).f(1835626086))).f(1937007212)), hxaVar));
            }
        }
        return arrayList;
    }
}
