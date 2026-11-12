package p4;

import aq.s1;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Arrays;
import o4.f0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0001$B]\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014BE\b\u0016\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0013\u0010\u0018B]\b\u0016\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0019B%\b\u0016\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u001bB-\b\u0016\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u001cB1\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u001dB%\b\u0016\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u0017¢\u0006\u0004\b\u0013\u0010\u001fB-\b\u0016\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u0017¢\u0006\u0004\b\u0013\u0010 BA\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010!B!\b\u0010\u0012\u0006\u0010\"\u001a\u00020\u0000\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010#¨\u0006%"}, d2 = {"Lp4/q;", "Lp4/c;", "", "name", "", "primaries", "Lp4/s;", "whitePoint", "transform", "Lp4/i;", "oetf", "eotf", "", "min", "max", "Lp4/r;", "transferParameters", "", TtmlNode.ATTR_ID, "<init>", "(Ljava/lang/String;[FLp4/s;[FLp4/i;Lp4/i;FFLp4/r;I)V", "toXYZ", "Lkotlin/Function1;", "", "(Ljava/lang/String;[FLe23/l;Le23/l;)V", "(Ljava/lang/String;[FLp4/s;Le23/l;Le23/l;FF)V", "function", "(Ljava/lang/String;[FLp4/r;)V", "(Ljava/lang/String;[FLp4/s;Lp4/r;)V", "(Ljava/lang/String;[FLp4/s;Lp4/r;I)V", "gamma", "(Ljava/lang/String;[FD)V", "(Ljava/lang/String;[FLp4/s;D)V", "(Ljava/lang/String;[FLp4/s;DFFI)V", "colorSpace", "(Lp4/q;[FLp4/s;)V", "a", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q extends p4.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f135600r = new a(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final org.apache.commons.lang3.e f135601s = new org.apache.commons.lang3.e(27);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f135602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f135603e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f135604f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r f135605g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f135606h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f135607i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f135608j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i f135609k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f135610l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n f135611m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i f135612n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f135613o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f135614p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f135615q;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "x", "invoke", "(D)Ljava/lang/Double;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b extends w implements e23.l<Double, Double> {
        public b() {
            super(1);
        }

        @Override // e23.l
        public final Double invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            q qVar = q.this;
            return Double.valueOf(qVar.f135612n.a(j23.t.c(dDoubleValue, qVar.f135603e, qVar.f135604f)));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "x", "invoke", "(D)Ljava/lang/Double;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c extends w implements e23.l<Double, Double> {
        public c() {
            super(1);
        }

        @Override // e23.l
        public final Double invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            q qVar = q.this;
            return Double.valueOf(j23.t.c(qVar.f135609k.a(dDoubleValue), qVar.f135603e, qVar.f135604f));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:42:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:45:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:47:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:53:0x021b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0229  */
    /* JADX WARN: Code duplicated, block: B:63:0x0240  */
    /* JADX WARN: Code duplicated, block: B:65:0x0258  */
    /* JADX WARN: Code duplicated, block: B:68:0x0272  */
    /* JADX WARN: Code duplicated, block: B:77:0x021b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0275 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public q(String str, float[] fArr, s sVar, float[] fArr2, i iVar, i iVar2, float f14, float f15, r rVar, int i14) {
        int i15;
        char c14;
        float f16;
        float f17;
        boolean z14;
        float[] fArr3;
        q qVar;
        double d14;
        int i16;
        super(str, p4.b.f135536c, i14, null);
        p4.b.f135535b.getClass();
        this.f135602d = sVar;
        this.f135603e = f14;
        this.f135604f = f15;
        this.f135605g = rVar;
        this.f135609k = iVar;
        this.f135610l = new c();
        this.f135611m = new n(this, 0);
        this.f135612n = iVar2;
        this.f135613o = new b();
        this.f135614p = new n(this, 1);
        if (fArr.length != 6 && fArr.length != 9) {
            vb.h.s("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
            throw null;
        }
        if (f14 >= f15) {
            vb.h.s(am.j.l("Invalid range: min=", f14, ", max=", f15, "; min must be strictly < max"));
            throw null;
        }
        f135600r.getClass();
        float[] fArr4 = new float[6];
        if (fArr.length == 9) {
            float f18 = fArr[0];
            float f19 = fArr[1];
            float f22 = f18 + f19 + fArr[2];
            fArr4[0] = f18 / f22;
            fArr4[1] = f19 / f22;
            float f24 = fArr[3];
            float f25 = fArr[4];
            float f26 = f24 + f25 + fArr[5];
            fArr4[2] = f24 / f26;
            fArr4[3] = f25 / f26;
            float f27 = fArr[6];
            float f28 = fArr[7];
            float f29 = f27 + f28 + fArr[8];
            fArr4[4] = f27 / f29;
            fArr4[5] = f28 / f29;
        } else {
            System.arraycopy(fArr, 0, fArr4, 0, 6);
        }
        this.f135606h = fArr4;
        if (fArr2 == null) {
            float f34 = fArr4[0];
            float f35 = fArr4[1];
            float f36 = fArr4[2];
            float f37 = fArr4[3];
            float f38 = fArr4[4];
            float f39 = fArr4[5];
            i15 = 0;
            float f44 = sVar.f135625a;
            f16 = 1.0f;
            float f45 = sVar.f135626b;
            float f46 = 1;
            float f47 = (f46 - f34) / f35;
            float f48 = (f46 - f36) / f37;
            float f49 = (f46 - f38) / f39;
            float f50 = (f46 - f44) / f45;
            float f54 = f34 / f35;
            float f55 = f44 / f45;
            float f56 = (f36 / f37) - f54;
            float f57 = f55 - f54;
            float f58 = f48 - f47;
            float f59 = ((f50 - f47) * f56) - (f57 * f58);
            float f64 = (f49 - f47) * f56;
            c14 = 1;
            float f65 = (f38 / f39) - f54;
            float f66 = f59 / (f64 - (f58 * f65));
            float fC = hb.a.c(f66, f65, f57, f56);
            float f67 = (1.0f - fC) - f66;
            float f68 = f67 / f35;
            float f69 = fC / f37;
            float f74 = f66 / f39;
            this.f135607i = new float[]{f68 * f34, f67, ((1.0f - f34) - f35) * f68, f69 * f36, fC, ((1.0f - f36) - f37) * f69, f74 * f38, f66, ((1.0f - f38) - f39) * f74};
        } else {
            i15 = 0;
            c14 = 1;
            f16 = 1.0f;
            if (fArr2.length != 9) {
                sn.a.z(fArr2.length, "Transform must have 9 entries! Has ");
                throw null;
            }
            this.f135607i = fArr2;
        }
        this.f135608j = d.e(this.f135607i);
        float fB = a.b(fArr4);
        e.f135544a.getClass();
        if (fB / a.b(e.f135546c) > 0.9f) {
            float[] fArr5 = e.f135545b;
            float f75 = fArr4[i15];
            float f76 = fArr5[i15];
            float f77 = fArr4[c14];
            float f78 = fArr5[c14];
            float f79 = fArr4[2];
            float f84 = fArr5[2];
            float f85 = fArr4[3];
            float f86 = fArr5[3];
            float f87 = fArr4[4];
            float f88 = fArr5[4];
            float f89 = fArr4[5];
            float f93 = fArr5[5];
            f17 = 0.0f;
            float[] fArr6 = new float[6];
            fArr6[i15] = f75 - f76;
            fArr6[c14] = f77 - f78;
            fArr6[2] = f79 - f84;
            fArr6[3] = f85 - f86;
            fArr6[4] = f87 - f88;
            fArr6[5] = f89 - f93;
            float f94 = fArr6[i15];
            float f95 = fArr6[c14];
            if (((f78 - f93) * f94) - ((f76 - f88) * f95) >= 0.0f && ((f76 - f84) * f95) - ((f78 - f86) * f94) >= 0.0f) {
                float f96 = fArr6[2];
                float f97 = fArr6[3];
                if (((f86 - f78) * f96) - ((f84 - f76) * f97) >= 0.0f && ((f84 - f88) * f97) - ((f86 - f93) * f96) >= 0.0f) {
                    float f98 = fArr6[4];
                    float f99 = fArr6[5];
                    if (((f93 - f86) * f98) - ((f88 - f84) * f99) < 0.0f || ((f88 - f76) * f99) - ((f93 - f78) * f98) < 0.0f) {
                    }
                }
            }
            if (i14 != 0) {
                fArr3 = e.f135545b;
                if (fArr4 == fArr3) {
                    j.f135579a.getClass();
                    if (d.c(sVar, j.f135583e) && f14 == f17 && f15 == f16) {
                        e.f135544a.getClass();
                        qVar = e.f135549f;
                        d14 = 0.0d;
                        while (true) {
                            if (d14 <= 1.0d) {
                                z14 = c14;
                            } else if (Math.abs(iVar.a(d14) - qVar.f135609k.a(d14)) > 0.001d && Math.abs(iVar2.a(d14) - qVar.f135612n.a(d14)) <= 0.001d) {
                                d14 += 0.00392156862745098d;
                            }
                        }
                    }
                } else {
                    i16 = i15;
                    while (true) {
                        if (i16 >= 6) {
                            j.f135579a.getClass();
                            if (d.c(sVar, j.f135583e)) {
                                e.f135544a.getClass();
                                qVar = e.f135549f;
                                d14 = 0.0d;
                                while (true) {
                                    if (d14 <= 1.0d) {
                                        z14 = c14;
                                    } else if (Math.abs(iVar.a(d14) - qVar.f135609k.a(d14)) > 0.001d) {
                                    }
                                    d14 += 0.00392156862745098d;
                                }
                            }
                        } else if (Float.compare(fArr4[i16], fArr3[i16]) != 0 || Math.abs(fArr4[i16] - fArr3[i16]) <= 0.001f) {
                            i16++;
                        }
                    }
                }
                z14 = i15;
            } else {
                z14 = c14;
            }
            this.f135615q = z14;
        }
        f17 = 0.0f;
        int i17 = (f14 > f17 ? 1 : (f14 == f17 ? 0 : -1));
        if (i14 != 0) {
            fArr3 = e.f135545b;
            if (fArr4 == fArr3) {
                j.f135579a.getClass();
                if (d.c(sVar, j.f135583e)) {
                    e.f135544a.getClass();
                    qVar = e.f135549f;
                    d14 = 0.0d;
                    while (true) {
                        if (d14 <= 1.0d) {
                            z14 = c14;
                        } else if (Math.abs(iVar.a(d14) - qVar.f135609k.a(d14)) > 0.001d) {
                        }
                        d14 += 0.00392156862745098d;
                    }
                }
            } else {
                i16 = i15;
                while (true) {
                    if (i16 >= 6) {
                        if (Float.compare(fArr4[i16], fArr3[i16]) != 0) {
                        }
                        i16++;
                    } else {
                        j.f135579a.getClass();
                        if (d.c(sVar, j.f135583e)) {
                            e.f135544a.getClass();
                            qVar = e.f135549f;
                            d14 = 0.0d;
                            while (true) {
                                if (d14 <= 1.0d) {
                                    z14 = c14;
                                } else if (Math.abs(iVar.a(d14) - qVar.f135609k.a(d14)) > 0.001d) {
                                }
                                d14 += 0.00392156862745098d;
                            }
                        }
                    }
                }
            }
            z14 = i15;
        } else {
            z14 = c14;
        }
        this.f135615q = z14;
    }

    @Override // p4.c
    public final float[] a(float[] fArr) {
        d.h(this.f135608j, fArr);
        if (fArr.length < 3) {
            return fArr;
        }
        double d14 = fArr[0];
        n nVar = this.f135611m;
        fArr[0] = (float) nVar.a(d14);
        fArr[1] = (float) nVar.a(fArr[1]);
        fArr[2] = (float) nVar.a(fArr[2]);
        return fArr;
    }

    @Override // p4.c
    public final float b(int i14) {
        return this.f135604f;
    }

    @Override // p4.c
    public final float c(int i14) {
        return this.f135603e;
    }

    @Override // p4.c
    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getF135615q() {
        return this.f135615q;
    }

    @Override // p4.c
    public final long e(float f14, float f15, float f16) {
        double d14 = f14;
        n nVar = this.f135614p;
        float fA = (float) nVar.a(d14);
        float fA2 = (float) nVar.a(f15);
        float fA3 = (float) nVar.a(f16);
        float[] fArr = this.f135607i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f17 = (fArr[6] * fA3) + (fArr[3] * fA2) + (fArr[0] * fA);
        return (((long) Float.floatToRawIntBits((fArr[7] * fA3) + (fArr[4] * fA2) + (fArr[1] * fA))) & 4294967295L) | (Float.floatToRawIntBits(f17) << 32);
    }

    @Override // p4.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        q qVar = (q) obj;
        if (Float.compare(qVar.f135603e, this.f135603e) != 0 || Float.compare(qVar.f135604f, this.f135604f) != 0 || !p005kotlin.jvm.internal.s.g(this.f135602d, qVar.f135602d) || !Arrays.equals(this.f135606h, qVar.f135606h)) {
            return false;
        }
        r rVar = qVar.f135605g;
        r rVar2 = this.f135605g;
        if (rVar2 != null) {
            return p005kotlin.jvm.internal.s.g(rVar2, rVar);
        }
        if (rVar == null) {
            return true;
        }
        if (p005kotlin.jvm.internal.s.g(this.f135609k, qVar.f135609k)) {
            return p005kotlin.jvm.internal.s.g(this.f135612n, qVar.f135612n);
        }
        return false;
    }

    @Override // p4.c
    public final float[] f(float[] fArr) {
        if (fArr.length < 3) {
            return fArr;
        }
        double d14 = fArr[0];
        n nVar = this.f135614p;
        fArr[0] = (float) nVar.a(d14);
        fArr[1] = (float) nVar.a(fArr[1]);
        fArr[2] = (float) nVar.a(fArr[2]);
        d.h(this.f135607i, fArr);
        return fArr;
    }

    @Override // p4.c
    public final float g(float f14, float f15, float f16) {
        double d14 = f14;
        n nVar = this.f135614p;
        float fA = (float) nVar.a(d14);
        float fA2 = (float) nVar.a(f15);
        float fA3 = (float) nVar.a(f16);
        float[] fArr = this.f135607i;
        return (fArr[8] * fA3) + (fArr[5] * fA2) + (fArr[2] * fA);
    }

    @Override // p4.c
    public final long h(float f14, float f15, float f16, float f17, p4.c cVar) {
        float[] fArr = this.f135608j;
        float f18 = (fArr[6] * f16) + (fArr[3] * f15) + (fArr[0] * f14);
        float f19 = (fArr[7] * f16) + (fArr[4] * f15) + (fArr[1] * f14);
        float f22 = (fArr[8] * f16) + (fArr[5] * f15) + (fArr[2] * f14);
        n nVar = this.f135611m;
        return f0.a((float) nVar.a(f18), (float) nVar.a(f19), (float) nVar.a(f22), f17, cVar);
    }

    @Override // p4.c
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f135606h) + ((this.f135602d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f14 = this.f135603e;
        int iFloatToIntBits = (iHashCode + (f14 == 0.0f ? 0 : Float.floatToIntBits(f14))) * 31;
        float f15 = this.f135604f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f15 == 0.0f ? 0 : Float.floatToIntBits(f15))) * 31;
        r rVar = this.f135605g;
        int iHashCode2 = iFloatToIntBits2 + (rVar != null ? rVar.hashCode() : 0);
        if (rVar == null) {
            return this.f135612n.hashCode() + ((this.f135609k.hashCode() + (iHashCode2 * 31)) * 31);
        }
        return iHashCode2;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp4/q$a;", "", "<init>", "()V", "Lp4/i;", "DoubleIdentity", "Lp4/i;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static final s a(a aVar, float[] fArr) {
            aVar.getClass();
            float[] fArr2 = {1.0f, 1.0f, 1.0f};
            d.h(fArr, fArr2);
            float f14 = fArr2[0];
            float f15 = fArr2[1];
            float f16 = f14 + f15 + fArr2[2];
            return new s(f14 / f16, f15 / f16);
        }

        public static float b(float[] fArr) {
            if (fArr.length < 6) {
                return 0.0f;
            }
            float f14 = fArr[0];
            float f15 = fArr[1];
            float f16 = fArr[2];
            float f17 = fArr[3];
            float f18 = fArr[4];
            float f19 = fArr[5];
            float f22 = (((((f16 * f19) + ((f15 * f18) + (f14 * f17))) - (f17 * f18)) - (f15 * f16)) - (f14 * f19)) * 0.5f;
            return f22 < 0.0f ? -f22 : f22;
        }

        public static float[] c(float[] fArr) {
            float[] fArr2 = {1.0f, 0.0f, 0.0f};
            d.h(fArr, fArr2);
            float[] fArr3 = {0.0f, 1.0f, 0.0f};
            d.h(fArr, fArr3);
            float[] fArr4 = {0.0f, 0.0f, 1.0f};
            d.h(fArr, fArr4);
            float f14 = fArr2[0];
            float f15 = fArr2[1];
            float f16 = f14 + f15 + fArr2[2];
            float f17 = fArr3[0];
            float f18 = fArr3[1];
            float f19 = f17 + f18 + fArr3[2];
            float f22 = fArr4[0];
            float f24 = fArr4[1];
            float f25 = f22 + f24 + fArr4[2];
            return new float[]{f14 / f16, f15 / f16, f17 / f19, f18 / f19, f22 / f25, f24 / f25};
        }

        private a() {
        }
    }

    public q(q qVar, float[] fArr, s sVar) {
        this(qVar.f135541a, qVar.f135606h, sVar, fArr, qVar.f135609k, qVar.f135612n, qVar.f135603e, qVar.f135604f, qVar.f135605g, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q(String str, float[] fArr, e23.l<? super Double, Double> lVar, e23.l<? super Double, Double> lVar2) {
        a aVar = f135600r;
        aVar.getClass();
        this(str, a.c(fArr), a.a(aVar, fArr), null, new s1(lVar, 8), new s1(lVar2, 9), 0.0f, 1.0f, null, -1);
    }

    public q(String str, float[] fArr, s sVar, e23.l<? super Double, Double> lVar, e23.l<? super Double, Double> lVar2, float f14, float f15) {
        this(str, fArr, sVar, null, new s1(lVar, 10), new s1(lVar2, 11), f14, f15, null, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q(String str, float[] fArr, r rVar) {
        a aVar = f135600r;
        aVar.getClass();
        this(str, a.c(fArr), a.a(aVar, fArr), rVar, -1);
    }

    public q(String str, float[] fArr, s sVar, r rVar) {
        this(str, fArr, sVar, rVar, -1);
    }

    public q(String str, float[] fArr, s sVar, final r rVar, int i14) {
        i iVar;
        i iVar2;
        f135600r.getClass();
        double d14 = rVar.f135618a;
        boolean z14 = d14 == -3.0d;
        double d15 = rVar.f135624g;
        double d16 = rVar.f135623f;
        if (z14) {
            final int i15 = 4;
            iVar = new i() { // from class: p4.p
                @Override // p4.i
                public final double a(double d17) {
                    switch (i15) {
                        case 0:
                            e.f135544a.getClass();
                            return e.a(rVar, d17);
                        case 1:
                            e.f135544a.getClass();
                            return e.c(rVar, d17);
                        case 2:
                            r rVar2 = rVar;
                            double d18 = rVar2.f135619b;
                            return d17 >= rVar2.f135622e ? Math.pow((d18 * d17) + rVar2.f135620c, rVar2.f135618a) : d17 * rVar2.f135621d;
                        case 3:
                            r rVar3 = rVar;
                            double d19 = rVar3.f135619b;
                            double d24 = rVar3.f135620c;
                            double d25 = rVar3.f135621d;
                            return d17 >= rVar3.f135622e ? Math.pow((d17 * d19) + d24, rVar3.f135618a) + rVar3.f135623f : (d25 * d17) + rVar3.f135624g;
                        case 4:
                            e.f135544a.getClass();
                            return e.b(rVar, d17);
                        case 5:
                            e.f135544a.getClass();
                            return e.d(rVar, d17);
                        case 6:
                            r rVar4 = rVar;
                            double d26 = rVar4.f135619b;
                            double d27 = rVar4.f135620c;
                            double d28 = rVar4.f135621d;
                            return d17 >= rVar4.f135622e * d28 ? (Math.pow(d17, 1.0d / rVar4.f135618a) - d27) / d26 : d17 / d28;
                        default:
                            r rVar5 = rVar;
                            double d29 = rVar5.f135619b;
                            double d34 = rVar5.f135620c;
                            double d35 = rVar5.f135621d;
                            return d17 >= rVar5.f135622e * d35 ? (Math.pow(d17 - rVar5.f135623f, 1.0d / rVar5.f135618a) - d34) / d29 : (d17 - rVar5.f135624g) / d35;
                    }
                }
            };
        } else if (d14 == -2.0d) {
            final int i16 = 5;
            iVar = new i() { // from class: p4.p
                @Override // p4.i
                public final double a(double d17) {
                    switch (i16) {
                        case 0:
                            e.f135544a.getClass();
                            return e.a(rVar, d17);
                        case 1:
                            e.f135544a.getClass();
                            return e.c(rVar, d17);
                        case 2:
                            r rVar2 = rVar;
                            double d18 = rVar2.f135619b;
                            return d17 >= rVar2.f135622e ? Math.pow((d18 * d17) + rVar2.f135620c, rVar2.f135618a) : d17 * rVar2.f135621d;
                        case 3:
                            r rVar3 = rVar;
                            double d19 = rVar3.f135619b;
                            double d24 = rVar3.f135620c;
                            double d25 = rVar3.f135621d;
                            return d17 >= rVar3.f135622e ? Math.pow((d17 * d19) + d24, rVar3.f135618a) + rVar3.f135623f : (d25 * d17) + rVar3.f135624g;
                        case 4:
                            e.f135544a.getClass();
                            return e.b(rVar, d17);
                        case 5:
                            e.f135544a.getClass();
                            return e.d(rVar, d17);
                        case 6:
                            r rVar4 = rVar;
                            double d26 = rVar4.f135619b;
                            double d27 = rVar4.f135620c;
                            double d28 = rVar4.f135621d;
                            return d17 >= rVar4.f135622e * d28 ? (Math.pow(d17, 1.0d / rVar4.f135618a) - d27) / d26 : d17 / d28;
                        default:
                            r rVar5 = rVar;
                            double d29 = rVar5.f135619b;
                            double d34 = rVar5.f135620c;
                            double d35 = rVar5.f135621d;
                            return d17 >= rVar5.f135622e * d35 ? (Math.pow(d17 - rVar5.f135623f, 1.0d / rVar5.f135618a) - d34) / d29 : (d17 - rVar5.f135624g) / d35;
                    }
                }
            };
        } else if (d16 == 0.0d && d15 == 0.0d) {
            final int i17 = 6;
            iVar = new i() { // from class: p4.p
                @Override // p4.i
                public final double a(double d17) {
                    switch (i17) {
                        case 0:
                            e.f135544a.getClass();
                            return e.a(rVar, d17);
                        case 1:
                            e.f135544a.getClass();
                            return e.c(rVar, d17);
                        case 2:
                            r rVar2 = rVar;
                            double d18 = rVar2.f135619b;
                            return d17 >= rVar2.f135622e ? Math.pow((d18 * d17) + rVar2.f135620c, rVar2.f135618a) : d17 * rVar2.f135621d;
                        case 3:
                            r rVar3 = rVar;
                            double d19 = rVar3.f135619b;
                            double d24 = rVar3.f135620c;
                            double d25 = rVar3.f135621d;
                            return d17 >= rVar3.f135622e ? Math.pow((d17 * d19) + d24, rVar3.f135618a) + rVar3.f135623f : (d25 * d17) + rVar3.f135624g;
                        case 4:
                            e.f135544a.getClass();
                            return e.b(rVar, d17);
                        case 5:
                            e.f135544a.getClass();
                            return e.d(rVar, d17);
                        case 6:
                            r rVar4 = rVar;
                            double d26 = rVar4.f135619b;
                            double d27 = rVar4.f135620c;
                            double d28 = rVar4.f135621d;
                            return d17 >= rVar4.f135622e * d28 ? (Math.pow(d17, 1.0d / rVar4.f135618a) - d27) / d26 : d17 / d28;
                        default:
                            r rVar5 = rVar;
                            double d29 = rVar5.f135619b;
                            double d34 = rVar5.f135620c;
                            double d35 = rVar5.f135621d;
                            return d17 >= rVar5.f135622e * d35 ? (Math.pow(d17 - rVar5.f135623f, 1.0d / rVar5.f135618a) - d34) / d29 : (d17 - rVar5.f135624g) / d35;
                    }
                }
            };
        } else {
            final int i18 = 7;
            iVar = new i() { // from class: p4.p
                @Override // p4.i
                public final double a(double d17) {
                    switch (i18) {
                        case 0:
                            e.f135544a.getClass();
                            return e.a(rVar, d17);
                        case 1:
                            e.f135544a.getClass();
                            return e.c(rVar, d17);
                        case 2:
                            r rVar2 = rVar;
                            double d18 = rVar2.f135619b;
                            return d17 >= rVar2.f135622e ? Math.pow((d18 * d17) + rVar2.f135620c, rVar2.f135618a) : d17 * rVar2.f135621d;
                        case 3:
                            r rVar3 = rVar;
                            double d19 = rVar3.f135619b;
                            double d24 = rVar3.f135620c;
                            double d25 = rVar3.f135621d;
                            return d17 >= rVar3.f135622e ? Math.pow((d17 * d19) + d24, rVar3.f135618a) + rVar3.f135623f : (d25 * d17) + rVar3.f135624g;
                        case 4:
                            e.f135544a.getClass();
                            return e.b(rVar, d17);
                        case 5:
                            e.f135544a.getClass();
                            return e.d(rVar, d17);
                        case 6:
                            r rVar4 = rVar;
                            double d26 = rVar4.f135619b;
                            double d27 = rVar4.f135620c;
                            double d28 = rVar4.f135621d;
                            return d17 >= rVar4.f135622e * d28 ? (Math.pow(d17, 1.0d / rVar4.f135618a) - d27) / d26 : d17 / d28;
                        default:
                            r rVar5 = rVar;
                            double d29 = rVar5.f135619b;
                            double d34 = rVar5.f135620c;
                            double d35 = rVar5.f135621d;
                            return d17 >= rVar5.f135622e * d35 ? (Math.pow(d17 - rVar5.f135623f, 1.0d / rVar5.f135618a) - d34) / d29 : (d17 - rVar5.f135624g) / d35;
                    }
                }
            };
        }
        if (d14 == -3.0d) {
            final int i19 = 0;
            iVar2 = new i() { // from class: p4.p
                @Override // p4.i
                public final double a(double d17) {
                    switch (i19) {
                        case 0:
                            e.f135544a.getClass();
                            return e.a(rVar, d17);
                        case 1:
                            e.f135544a.getClass();
                            return e.c(rVar, d17);
                        case 2:
                            r rVar2 = rVar;
                            double d18 = rVar2.f135619b;
                            return d17 >= rVar2.f135622e ? Math.pow((d18 * d17) + rVar2.f135620c, rVar2.f135618a) : d17 * rVar2.f135621d;
                        case 3:
                            r rVar3 = rVar;
                            double d19 = rVar3.f135619b;
                            double d24 = rVar3.f135620c;
                            double d25 = rVar3.f135621d;
                            return d17 >= rVar3.f135622e ? Math.pow((d17 * d19) + d24, rVar3.f135618a) + rVar3.f135623f : (d25 * d17) + rVar3.f135624g;
                        case 4:
                            e.f135544a.getClass();
                            return e.b(rVar, d17);
                        case 5:
                            e.f135544a.getClass();
                            return e.d(rVar, d17);
                        case 6:
                            r rVar4 = rVar;
                            double d26 = rVar4.f135619b;
                            double d27 = rVar4.f135620c;
                            double d28 = rVar4.f135621d;
                            return d17 >= rVar4.f135622e * d28 ? (Math.pow(d17, 1.0d / rVar4.f135618a) - d27) / d26 : d17 / d28;
                        default:
                            r rVar5 = rVar;
                            double d29 = rVar5.f135619b;
                            double d34 = rVar5.f135620c;
                            double d35 = rVar5.f135621d;
                            return d17 >= rVar5.f135622e * d35 ? (Math.pow(d17 - rVar5.f135623f, 1.0d / rVar5.f135618a) - d34) / d29 : (d17 - rVar5.f135624g) / d35;
                    }
                }
            };
        } else if (d14 == -2.0d) {
            final int i24 = 1;
            iVar2 = new i() { // from class: p4.p
                @Override // p4.i
                public final double a(double d17) {
                    switch (i24) {
                        case 0:
                            e.f135544a.getClass();
                            return e.a(rVar, d17);
                        case 1:
                            e.f135544a.getClass();
                            return e.c(rVar, d17);
                        case 2:
                            r rVar2 = rVar;
                            double d18 = rVar2.f135619b;
                            return d17 >= rVar2.f135622e ? Math.pow((d18 * d17) + rVar2.f135620c, rVar2.f135618a) : d17 * rVar2.f135621d;
                        case 3:
                            r rVar3 = rVar;
                            double d19 = rVar3.f135619b;
                            double d24 = rVar3.f135620c;
                            double d25 = rVar3.f135621d;
                            return d17 >= rVar3.f135622e ? Math.pow((d17 * d19) + d24, rVar3.f135618a) + rVar3.f135623f : (d25 * d17) + rVar3.f135624g;
                        case 4:
                            e.f135544a.getClass();
                            return e.b(rVar, d17);
                        case 5:
                            e.f135544a.getClass();
                            return e.d(rVar, d17);
                        case 6:
                            r rVar4 = rVar;
                            double d26 = rVar4.f135619b;
                            double d27 = rVar4.f135620c;
                            double d28 = rVar4.f135621d;
                            return d17 >= rVar4.f135622e * d28 ? (Math.pow(d17, 1.0d / rVar4.f135618a) - d27) / d26 : d17 / d28;
                        default:
                            r rVar5 = rVar;
                            double d29 = rVar5.f135619b;
                            double d34 = rVar5.f135620c;
                            double d35 = rVar5.f135621d;
                            return d17 >= rVar5.f135622e * d35 ? (Math.pow(d17 - rVar5.f135623f, 1.0d / rVar5.f135618a) - d34) / d29 : (d17 - rVar5.f135624g) / d35;
                    }
                }
            };
        } else if (d16 == 0.0d && d15 == 0.0d) {
            final int i25 = 2;
            iVar2 = new i() { // from class: p4.p
                @Override // p4.i
                public final double a(double d17) {
                    switch (i25) {
                        case 0:
                            e.f135544a.getClass();
                            return e.a(rVar, d17);
                        case 1:
                            e.f135544a.getClass();
                            return e.c(rVar, d17);
                        case 2:
                            r rVar2 = rVar;
                            double d18 = rVar2.f135619b;
                            return d17 >= rVar2.f135622e ? Math.pow((d18 * d17) + rVar2.f135620c, rVar2.f135618a) : d17 * rVar2.f135621d;
                        case 3:
                            r rVar3 = rVar;
                            double d19 = rVar3.f135619b;
                            double d24 = rVar3.f135620c;
                            double d25 = rVar3.f135621d;
                            return d17 >= rVar3.f135622e ? Math.pow((d17 * d19) + d24, rVar3.f135618a) + rVar3.f135623f : (d25 * d17) + rVar3.f135624g;
                        case 4:
                            e.f135544a.getClass();
                            return e.b(rVar, d17);
                        case 5:
                            e.f135544a.getClass();
                            return e.d(rVar, d17);
                        case 6:
                            r rVar4 = rVar;
                            double d26 = rVar4.f135619b;
                            double d27 = rVar4.f135620c;
                            double d28 = rVar4.f135621d;
                            return d17 >= rVar4.f135622e * d28 ? (Math.pow(d17, 1.0d / rVar4.f135618a) - d27) / d26 : d17 / d28;
                        default:
                            r rVar5 = rVar;
                            double d29 = rVar5.f135619b;
                            double d34 = rVar5.f135620c;
                            double d35 = rVar5.f135621d;
                            return d17 >= rVar5.f135622e * d35 ? (Math.pow(d17 - rVar5.f135623f, 1.0d / rVar5.f135618a) - d34) / d29 : (d17 - rVar5.f135624g) / d35;
                    }
                }
            };
        } else {
            final int i26 = 3;
            iVar2 = new i() { // from class: p4.p
                @Override // p4.i
                public final double a(double d17) {
                    switch (i26) {
                        case 0:
                            e.f135544a.getClass();
                            return e.a(rVar, d17);
                        case 1:
                            e.f135544a.getClass();
                            return e.c(rVar, d17);
                        case 2:
                            r rVar2 = rVar;
                            double d18 = rVar2.f135619b;
                            return d17 >= rVar2.f135622e ? Math.pow((d18 * d17) + rVar2.f135620c, rVar2.f135618a) : d17 * rVar2.f135621d;
                        case 3:
                            r rVar3 = rVar;
                            double d19 = rVar3.f135619b;
                            double d24 = rVar3.f135620c;
                            double d25 = rVar3.f135621d;
                            return d17 >= rVar3.f135622e ? Math.pow((d17 * d19) + d24, rVar3.f135618a) + rVar3.f135623f : (d25 * d17) + rVar3.f135624g;
                        case 4:
                            e.f135544a.getClass();
                            return e.b(rVar, d17);
                        case 5:
                            e.f135544a.getClass();
                            return e.d(rVar, d17);
                        case 6:
                            r rVar4 = rVar;
                            double d26 = rVar4.f135619b;
                            double d27 = rVar4.f135620c;
                            double d28 = rVar4.f135621d;
                            return d17 >= rVar4.f135622e * d28 ? (Math.pow(d17, 1.0d / rVar4.f135618a) - d27) / d26 : d17 / d28;
                        default:
                            r rVar5 = rVar;
                            double d29 = rVar5.f135619b;
                            double d34 = rVar5.f135620c;
                            double d35 = rVar5.f135621d;
                            return d17 >= rVar5.f135622e * d35 ? (Math.pow(d17 - rVar5.f135623f, 1.0d / rVar5.f135618a) - d34) / d29 : (d17 - rVar5.f135624g) / d35;
                    }
                }
            };
        }
        this(str, fArr, sVar, null, iVar, iVar2, 0.0f, 1.0f, rVar, i14);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q(String str, float[] fArr, double d14) {
        a aVar = f135600r;
        aVar.getClass();
        this(str, a.c(fArr), a.a(aVar, fArr), d14, 0.0f, 1.0f, -1);
    }

    public q(String str, float[] fArr, s sVar, double d14) {
        this(str, fArr, sVar, d14, 0.0f, 1.0f, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q(String str, float[] fArr, s sVar, final double d14, float f14, float f15, int i14) {
        i iVar;
        i iVar2 = f135601s;
        if (d14 == 1.0d) {
            iVar = iVar2;
        } else {
            final int i15 = 0;
            iVar = new i() { // from class: p4.o
                @Override // p4.i
                public final double a(double d15) {
                    int i16 = i15;
                    double d16 = d14;
                    switch (i16) {
                        case 0:
                            q.a aVar = q.f135600r;
                            if (d15 < 0.0d) {
                                d15 = 0.0d;
                            }
                            return Math.pow(d15, 1.0d / d16);
                        default:
                            q.a aVar2 = q.f135600r;
                            if (d15 < 0.0d) {
                                d15 = 0.0d;
                            }
                            return Math.pow(d15, d16);
                    }
                }
            };
        }
        if (d14 != 1.0d) {
            final int i16 = 1;
            iVar2 = new i() { // from class: p4.o
                @Override // p4.i
                public final double a(double d15) {
                    int i17 = i16;
                    double d16 = d14;
                    switch (i17) {
                        case 0:
                            q.a aVar = q.f135600r;
                            if (d15 < 0.0d) {
                                d15 = 0.0d;
                            }
                            return Math.pow(d15, 1.0d / d16);
                        default:
                            q.a aVar2 = q.f135600r;
                            if (d15 < 0.0d) {
                                d15 = 0.0d;
                            }
                            return Math.pow(d15, d16);
                    }
                }
            };
        }
        i iVar3 = iVar2;
        this(str, fArr, sVar, null, iVar, iVar3, f14, f15, new r(d14, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 96, null), i14);
    }
}
