package hc;

import bb.l0;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.material.internal.ViewUtils;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class f implements j {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final byte[] f82899w = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f82900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fa.q f82901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fa.r f82902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f82903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f82904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f82905f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l0 f82906g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l0 f82907h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f82908i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f82909j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f82910k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f82911l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f82912m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f82913n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f82914o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f82915p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f82916q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f82917r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f82918s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f82919t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public l0 f82920u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f82921v;

    public f(boolean z14, String str, int i14) {
        this.f82901b = new fa.q(new byte[7]);
        this.f82902c = new fa.r(Arrays.copyOf(f82899w, 10));
        this.f82908i = 0;
        this.f82909j = 0;
        this.f82910k = 256;
        this.f82913n = -1;
        this.f82914o = -1;
        this.f82917r = C.TIME_UNSET;
        this.f82919t = C.TIME_UNSET;
        this.f82900a = z14;
        this.f82903d = str;
        this.f82904e = i14;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x01fa  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // hc.j
    public final void b(fa.r rVar) {
        byte b14;
        int i14;
        int i15;
        char c14;
        int i16;
        char c15;
        int i17;
        int i18;
        int i19;
        this.f82906g.getClass();
        int i24 = fa.z.f70071a;
        while (rVar.a() > 0) {
            int i25 = this.f82908i;
            byte b15 = -1;
            fa.r rVar2 = this.f82902c;
            int i26 = 3;
            fa.q qVar = this.f82901b;
            int i27 = 0;
            int i28 = 4;
            int i29 = 1;
            if (i25 == 0) {
                byte[] bArr = rVar.f70054a;
                int i30 = rVar.f70055b;
                int i34 = rVar.f70056c;
                while (true) {
                    if (i30 < i34) {
                        int i35 = i30 + 1;
                        int i36 = i26;
                        byte b16 = bArr[i30];
                        int i37 = b16 & UnsignedBytes.MAX_VALUE;
                        if (this.f82910k == 512 && ((65280 | (((byte) i37) & UnsignedBytes.MAX_VALUE ? 1 : 0) ? 1 : 0) & 65526) == 65520) {
                            if (!this.f82912m) {
                                int i38 = i30 - 1;
                                rVar.G(i30);
                                byte[] bArr2 = qVar.f70047a;
                                if (rVar.a() < i29) {
                                    b14 = -1;
                                } else {
                                    rVar.e(bArr2, i27, i29);
                                    qVar.m(i28);
                                    int iG = qVar.g(i29);
                                    int i39 = this.f82913n;
                                    if (i39 == -1 || iG == i39) {
                                        if (this.f82914o != -1) {
                                            byte[] bArr3 = qVar.f70047a;
                                            if (rVar.a() >= i29) {
                                                rVar.e(bArr3, i27, i29);
                                                qVar.m(2);
                                                i17 = 4;
                                                if (qVar.g(4) != this.f82914o) {
                                                    b14 = -1;
                                                } else {
                                                    rVar.G(i35);
                                                }
                                            }
                                        } else {
                                            i17 = 4;
                                        }
                                        byte[] bArr4 = qVar.f70047a;
                                        if (rVar.a() >= i17) {
                                            rVar.e(bArr4, i27, i17);
                                            qVar.m(14);
                                            int iG2 = qVar.g(13);
                                            if (iG2 < 7) {
                                                b14 = -1;
                                            } else {
                                                byte[] bArr5 = rVar.f70054a;
                                                int i44 = rVar.f70056c;
                                                int i45 = i38 + iG2;
                                                if (i45 < i44) {
                                                    byte b17 = bArr5[i45];
                                                    b14 = -1;
                                                    if (b17 == -1) {
                                                        int i46 = i45 + 1;
                                                        if (i46 != i44) {
                                                            byte b18 = bArr5[i46];
                                                            if (((65280 | (b18 & UnsignedBytes.MAX_VALUE ? 1 : 0) ? 1 : 0) & 65526) == 65520 && ((b18 & 8) >> 3) == iG) {
                                                            }
                                                        }
                                                    } else if (b17 == 73 && ((i18 = i45 + 1) == i44 || (bArr5[i18] == 68 && ((i19 = i45 + 2) == i44 || bArr5[i19] == 51)))) {
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        b14 = -1;
                                    }
                                }
                                i14 = 1;
                            }
                            this.f82915p = (b16 & 8) >> 3;
                            this.f82911l = (b16 & 1) == 0;
                            if (this.f82912m) {
                                this.f82908i = i36;
                                this.f82909j = 0;
                            } else {
                                this.f82908i = 1;
                                this.f82909j = 0;
                            }
                            rVar.G(i35);
                        } else {
                            b14 = b15;
                            i14 = i29;
                        }
                        int i47 = this.f82910k;
                        int i48 = i37 | i47;
                        if (i48 == 329) {
                            i15 = 3;
                            c14 = 256;
                            i16 = 0;
                            c15 = 2;
                            this.f82910k = ViewUtils.EDGE_TO_EDGE_FLAGS;
                        } else if (i48 == 511) {
                            i15 = 3;
                            c14 = 256;
                            i16 = 0;
                            c15 = 2;
                            this.f82910k = 512;
                        } else if (i48 == 836) {
                            i15 = 3;
                            c14 = 256;
                            i16 = 0;
                            c15 = 2;
                            this.f82910k = 1024;
                        } else if (i48 != 1075) {
                            c14 = 256;
                            if (i47 != 256) {
                                this.f82910k = 256;
                                i15 = 3;
                                i16 = 0;
                                c15 = 2;
                            } else {
                                i15 = 3;
                                i16 = 0;
                                c15 = 2;
                            }
                            i29 = i14;
                            b15 = b14;
                            i28 = 4;
                            i27 = i16;
                            i26 = i15;
                        } else {
                            this.f82908i = 2;
                            this.f82909j = 3;
                            this.f82918s = 0;
                            rVar2.G(0);
                            rVar.G(i35);
                        }
                        i30 = i35;
                        i29 = i14;
                        b15 = b14;
                        i28 = 4;
                        i27 = i16;
                        i26 = i15;
                    } else {
                        rVar.G(i30);
                    }
                }
            } else if (i25 != 1) {
                if (i25 == 2) {
                    byte[] bArr6 = rVar2.f70054a;
                    int iMin = Math.min(rVar.a(), 10 - this.f82909j);
                    rVar.e(bArr6, this.f82909j, iMin);
                    int i49 = this.f82909j + iMin;
                    this.f82909j = i49;
                    if (i49 == 10) {
                        this.f82907h.f(10, rVar2);
                        rVar2.G(6);
                        l0 l0Var = this.f82907h;
                        int iT = rVar2.t() + 10;
                        this.f82908i = 4;
                        this.f82909j = 10;
                        this.f82920u = l0Var;
                        this.f82921v = 0L;
                        this.f82918s = iT;
                    }
                } else if (i25 == 3) {
                    int i54 = this.f82911l ? 7 : 5;
                    byte[] bArr7 = qVar.f70047a;
                    int iMin2 = Math.min(rVar.a(), i54 - this.f82909j);
                    rVar.e(bArr7, this.f82909j, iMin2);
                    int i55 = this.f82909j + iMin2;
                    this.f82909j = i55;
                    if (i55 == i54) {
                        qVar.m(0);
                        if (this.f82916q) {
                            qVar.o(10);
                        } else {
                            int iG3 = qVar.g(2) + 1;
                            if (iG3 != 2) {
                                fa.k.g("Detected audio object type: " + iG3 + ", but assuming AAC LC.");
                                iG3 = 2;
                            }
                            qVar.o(5);
                            int iG4 = qVar.g(3);
                            int i56 = this.f82914o;
                            byte[] bArr8 = {(byte) (((iG3 << 3) & 248) | ((i56 >> 1) & 7)), (byte) (((iG4 << 3) & 120) | ((i56 << 7) & 128))};
                            bb.a.b bVarB = bb.a.b(new fa.q(bArr8), false);
                            androidx.media3.common.q.b bVar = new androidx.media3.common.q.b();
                            bVar.f8399a = this.f82905f;
                            bVar.f8411m = androidx.media3.common.x.n(MimeTypes.AUDIO_AAC);
                            bVar.f8408j = bVarB.f17090c;
                            bVar.B = bVarB.f17089b;
                            bVar.C = bVarB.f17088a;
                            bVar.f8414p = Collections.singletonList(bArr8);
                            bVar.f8402d = this.f82903d;
                            bVar.f8404f = this.f82904e;
                            androidx.media3.common.q qVarA = bVar.a();
                            this.f82917r = 1024000000 / ((long) qVarA.D);
                            this.f82906g.d(qVarA);
                            this.f82916q = true;
                        }
                        qVar.o(4);
                        int iG5 = qVar.g(13);
                        int i57 = iG5 - 7;
                        if (this.f82911l) {
                            i57 = iG5 - 9;
                        }
                        l0 l0Var2 = this.f82906g;
                        long j8 = this.f82917r;
                        this.f82908i = 4;
                        this.f82909j = 0;
                        this.f82920u = l0Var2;
                        this.f82921v = j8;
                        this.f82918s = i57;
                    }
                } else {
                    if (i25 != 4) {
                        j20.x.h();
                        return;
                    }
                    int iMin3 = Math.min(rVar.a(), this.f82918s - this.f82909j);
                    this.f82920u.f(iMin3, rVar);
                    int i58 = this.f82909j + iMin3;
                    this.f82909j = i58;
                    if (i58 == this.f82918s) {
                        fa.a.d(this.f82919t != C.TIME_UNSET);
                        this.f82920u.c(this.f82919t, 1, this.f82918s, 0, null);
                        this.f82919t += this.f82921v;
                        this.f82908i = 0;
                        this.f82909j = 0;
                        this.f82910k = 256;
                    }
                }
            } else if (rVar.a() != 0) {
                qVar.f70047a[0] = rVar.f70054a[rVar.f70055b];
                qVar.m(2);
                int iG6 = qVar.g(4);
                int i59 = this.f82914o;
                if (i59 == -1 || iG6 == i59) {
                    if (!this.f82912m) {
                        this.f82912m = true;
                        this.f82913n = this.f82915p;
                        this.f82914o = iG6;
                    }
                    this.f82908i = 3;
                    this.f82909j = 0;
                } else {
                    this.f82912m = false;
                    this.f82908i = 0;
                    this.f82909j = 0;
                    this.f82910k = 256;
                }
            }
        }
    }

    @Override // hc.j
    public final void c(bb.p pVar, f0.d dVar) {
        dVar.a();
        dVar.b();
        this.f82905f = dVar.f82933e;
        dVar.b();
        l0 l0VarTrack = pVar.track(dVar.f82932d, 1);
        this.f82906g = l0VarTrack;
        this.f82920u = l0VarTrack;
        if (!this.f82900a) {
            this.f82907h = new bb.k();
            return;
        }
        dVar.a();
        dVar.b();
        l0 l0VarTrack2 = pVar.track(dVar.f82932d, 5);
        this.f82907h = l0VarTrack2;
        androidx.media3.common.q.b bVar = new androidx.media3.common.q.b();
        dVar.b();
        bVar.f8399a = dVar.f82933e;
        bVar.f8411m = androidx.media3.common.x.n(MimeTypes.APPLICATION_ID3);
        l0VarTrack2.d(bVar.a());
    }

    @Override // hc.j
    public final void d(boolean z14) {
    }

    @Override // hc.j
    public final void packetStarted(long j8, int i14) {
        this.f82919t = j8;
    }

    @Override // hc.j
    public final void seek() {
        this.f82919t = C.TIME_UNSET;
        this.f82912m = false;
        this.f82908i = 0;
        this.f82909j = 0;
        this.f82910k = 256;
    }

    public f(boolean z14) {
        this(z14, null, 0);
    }
}
