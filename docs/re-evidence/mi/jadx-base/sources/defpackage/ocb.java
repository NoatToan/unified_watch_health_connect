package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public final class ocb implements u68 {
    public static final double[] q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f28992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public snp f28993b;
    public final ifq c;
    public final okh d;
    public final jgg e;
    public final boolean[] f;
    public final a g;
    public long h;
    public boolean i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f28994k;
    public long l;
    public long m;
    public long n;
    public boolean o;
    public boolean p;

    public static final class a {
        public static final byte[] e = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f28995a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f28996b;
        public int c;
        public byte[] d;

        public a(int i) {
            this.d = new byte[i];
        }

        public void a(byte[] bArr, int i, int i2) {
            if (this.f28995a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.d;
                int length = bArr2.length;
                int i4 = this.f28996b;
                if (length < i4 + i3) {
                    this.d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.d, this.f28996b, i3);
                this.f28996b += i3;
            }
        }

        public boolean b(int i, int i2) {
            if (this.f28995a) {
                int i3 = this.f28996b - i2;
                this.f28996b = i3;
                if (this.c != 0 || i != 181) {
                    this.f28995a = false;
                    return true;
                }
                this.c = i3;
            } else if (i == 179) {
                this.f28995a = true;
            }
            byte[] bArr = e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f28995a = false;
            this.f28996b = 0;
            this.c = 0;
        }
    }

    public ocb() {
        this(null);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0073  */
    /* JADX WARN: Code duplicated, block: B:16:0x0078  */
    /* JADX WARN: Code duplicated, block: B:18:0x0087  */
    /* JADX WARN: Code duplicated, block: B:20:0x0098  */
    public static Pair<Format, Long> b(a aVar, String str) {
        float f;
        int i;
        float f2;
        int i2;
        long j;
        double[] dArr;
        double d;
        int i3;
        int i4;
        byte[] bArrCopyOf = Arrays.copyOf(aVar.d, aVar.f28996b);
        int i5 = bArrCopyOf[4] & 255;
        byte b2 = bArrCopyOf[5];
        int i6 = (i5 << 4) | ((b2 & 255) >> 4);
        int i7 = ((b2 & 15) << 8) | (bArrCopyOf[6] & 255);
        int i8 = (bArrCopyOf[7] & 240) >> 4;
        if (i8 == 2) {
            f = i7 * 4;
            i = i6 * 3;
        } else {
            if (i8 != 3) {
                if (i8 != 4) {
                    f2 = 1.0f;
                } else {
                    f = i7 * 121;
                    i = i6 * 100;
                }
                Format formatE = new Format.b().S(str).e0("video/mpeg2").j0(i6).Q(i7).a0(f2).T(Collections.singletonList(bArrCopyOf)).E();
                i2 = (bArrCopyOf[7] & 15) - 1;
                if (i2 >= 0) {
                    dArr = q;
                    if (i2 < dArr.length) {
                        d = dArr[i2];
                        byte b3 = bArrCopyOf[aVar.c + 9];
                        i3 = (b3 & 96) >> 5;
                        i4 = b3 & 31;
                        if (i3 != i4) {
                            d *= (((double) i3) + 1.0d) / ((double) (i4 + 1));
                        }
                        j = (long) (1000000.0d / d);
                    } else {
                        j = 0;
                    }
                } else {
                    j = 0;
                }
                return Pair.create(formatE, Long.valueOf(j));
            }
            f = i7 * 16;
            i = i6 * 9;
        }
        f2 = f / i;
        Format formatE2 = new Format.b().S(str).e0("video/mpeg2").j0(i6).Q(i7).a0(f2).T(Collections.singletonList(bArrCopyOf)).E();
        i2 = (bArrCopyOf[7] & 15) - 1;
        if (i2 >= 0) {
            dArr = q;
            if (i2 < dArr.length) {
                d = dArr[i2];
                byte b4 = bArrCopyOf[aVar.c + 9];
                i3 = (b4 & 96) >> 5;
                i4 = b4 & 31;
                if (i3 != i4) {
                    d *= (((double) i3) + 1.0d) / ((double) (i4 + 1));
                }
                j = (long) (1000000.0d / d);
            } else {
                j = 0;
            }
        } else {
            j = 0;
        }
        return Pair.create(formatE2, Long.valueOf(j));
    }

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
    @Override // defpackage.u68
    public void a(okh okhVar) {
        int i;
        rk1.i(this.f28993b);
        int iE = okhVar.e();
        int iF = okhVar.f();
        byte[] bArrD = okhVar.d();
        this.h += (long) okhVar.a();
        this.f28993b.d(okhVar, okhVar.a());
        while (true) {
            int iC = kgg.c(bArrD, iE, iF, this.f);
            if (iC == iF) {
                break;
            }
            int i2 = iC + 3;
            int i3 = okhVar.d()[i2] & 255;
            int i4 = iC - iE;
            if (!this.j) {
                if (i4 > 0) {
                    this.g.a(bArrD, iE, iC);
                }
                if (this.g.b(i3, i4 < 0 ? -i4 : 0)) {
                    Pair<Format, Long> pairB = b(this.g, (String) rk1.e(this.f28992a));
                    this.f28993b.b((Format) pairB.first);
                    this.f28994k = ((Long) pairB.second).longValue();
                    this.j = true;
                }
            }
            jgg jggVar = this.e;
            if (jggVar != null) {
                if (i4 > 0) {
                    jggVar.a(bArrD, iE, iC);
                    i = 0;
                } else {
                    i = -i4;
                }
                if (this.e.b(i)) {
                    jgg jggVar2 = this.e;
                    ((okh) wlq.j(this.d)).N(this.e.d, kgg.k(jggVar2.d, jggVar2.e));
                    ((ifq) wlq.j(this.c)).a(this.n, this.d);
                }
                if (i3 == 178 && okhVar.d()[iC + 2] == 1) {
                    this.e.e(i3);
                }
            }
            if (i3 == 0 || i3 == 179) {
                int i5 = iF - iC;
                if (this.i && this.p && this.j) {
                    this.f28993b.e(this.n, this.o ? 1 : 0, ((int) (this.h - this.m)) - i5, i5, null);
                }
                boolean z = this.i;
                if (!z || this.p) {
                    this.m = this.h - ((long) i5);
                    long j = this.l;
                    if (j == -9223372036854775807L) {
                        j = z ? this.n + this.f28994k : 0L;
                    }
                    this.n = j;
                    this.o = false;
                    this.l = -9223372036854775807L;
                    this.i = true;
                }
                this.p = i3 == 0;
            } else if (i3 == 184) {
                this.o = true;
            }
            iE = i2;
        }
        if (!this.j) {
            this.g.a(bArrD, iE, iF);
        }
        jgg jggVar3 = this.e;
        if (jggVar3 != null) {
            jggVar3.a(bArrD, iE, iF);
        }
    }

    @Override // defpackage.u68
    public void c() {
        kgg.a(this.f);
        this.g.c();
        jgg jggVar = this.e;
        if (jggVar != null) {
            jggVar.d();
        }
        this.h = 0L;
        this.i = false;
    }

    @Override // defpackage.u68
    public void d() {
    }

    @Override // defpackage.u68
    public void e(long j, int i) {
        this.l = j;
    }

    @Override // defpackage.u68
    public void f(kl8 kl8Var, i2q.d dVar) {
        dVar.a();
        this.f28992a = dVar.b();
        this.f28993b = kl8Var.d(dVar.c(), 2);
        ifq ifqVar = this.c;
        if (ifqVar != null) {
            ifqVar.b(kl8Var, dVar);
        }
    }

    public ocb(ifq ifqVar) {
        this.c = ifqVar;
        this.f = new boolean[4];
        this.g = new a(128);
        if (ifqVar != null) {
            this.e = new jgg(178, 128);
            this.d = new okh();
        } else {
            this.e = null;
            this.d = null;
        }
    }
}
