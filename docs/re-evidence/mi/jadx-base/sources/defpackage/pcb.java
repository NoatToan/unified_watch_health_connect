package defpackage;

import com.google.android.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public final class pcb implements u68 {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ifq f30234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final okh f30235b;
    public final boolean[] c = new boolean[4];
    public final a d = new a(128);
    public final jgg e;
    public b f;
    public long g;
    public String h;
    public snp i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f30236k;

    public static final class a {
        public static final byte[] f = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f30237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f30238b;
        public int c;
        public int d;
        public byte[] e;

        public a(int i) {
            this.e = new byte[i];
        }

        public void a(byte[] bArr, int i, int i2) {
            if (this.f30237a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.e;
                int length = bArr2.length;
                int i4 = this.c;
                if (length < i4 + i3) {
                    this.e = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.e, this.c, i3);
                this.c += i3;
            }
        }

        public boolean b(int i, int i2) {
            int i3 = this.f30238b;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i == 179 || i == 181) {
                                this.c -= i2;
                                this.f30237a = false;
                                return true;
                            }
                        } else if ((i & 240) != 32) {
                            toe.h("H263Reader", "Unexpected start code value");
                            c();
                        } else {
                            this.d = this.c;
                            this.f30238b = 4;
                        }
                    } else if (i > 31) {
                        toe.h("H263Reader", "Unexpected start code value");
                        c();
                    } else {
                        this.f30238b = 3;
                    }
                } else if (i != 181) {
                    toe.h("H263Reader", "Unexpected start code value");
                    c();
                } else {
                    this.f30238b = 2;
                }
            } else if (i == 176) {
                this.f30238b = 1;
                this.f30237a = true;
            }
            byte[] bArr = f;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f30237a = false;
            this.c = 0;
            this.f30238b = 0;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final snp f30239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f30240b;
        public boolean c;
        public boolean d;
        public int e;
        public int f;
        public long g;
        public long h;

        public b(snp snpVar) {
            this.f30239a = snpVar;
        }

        public void a(byte[] bArr, int i, int i2) {
            if (this.c) {
                int i3 = this.f;
                int i4 = (i + 1) - i3;
                if (i4 >= i2) {
                    this.f = i3 + (i2 - i);
                } else {
                    this.d = ((bArr[i4] & 192) >> 6) == 0;
                    this.c = false;
                }
            }
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
        public void b(long j, int i, boolean z) {
            if (this.e == 182 && z && this.f30240b) {
                this.f30239a.e(this.h, this.d ? 1 : 0, (int) (j - this.g), i, null);
            }
            if (this.e != 179) {
                this.g = j;
            }
        }

        public void c(int i, long j) {
            this.e = i;
            this.d = false;
            this.f30240b = i == 182 || i == 179;
            this.c = i == 182;
            this.f = 0;
            this.h = j;
        }

        public void d() {
            this.f30240b = false;
            this.c = false;
            this.d = false;
            this.e = -1;
        }
    }

    public pcb(ifq ifqVar) {
        this.f30234a = ifqVar;
        if (ifqVar != null) {
            this.e = new jgg(178, 128);
            this.f30235b = new okh();
        } else {
            this.e = null;
            this.f30235b = null;
        }
    }

    public static Format b(a aVar, int i, String str) {
        byte[] bArrCopyOf = Arrays.copyOf(aVar.e, aVar.c);
        nkh nkhVar = new nkh(bArrCopyOf);
        nkhVar.s(i);
        nkhVar.s(4);
        nkhVar.q();
        nkhVar.r(8);
        if (nkhVar.g()) {
            nkhVar.r(4);
            nkhVar.r(3);
        }
        int iH = nkhVar.h(4);
        float f = 1.0f;
        if (iH == 15) {
            int iH2 = nkhVar.h(8);
            int iH3 = nkhVar.h(8);
            if (iH3 == 0) {
                toe.h("H263Reader", "Invalid aspect ratio");
            } else {
                f = iH2 / iH3;
            }
        } else {
            float[] fArr = l;
            if (iH < fArr.length) {
                f = fArr[iH];
            } else {
                toe.h("H263Reader", "Invalid aspect ratio");
            }
        }
        if (nkhVar.g()) {
            nkhVar.r(2);
            nkhVar.r(1);
            if (nkhVar.g()) {
                nkhVar.r(15);
                nkhVar.q();
                nkhVar.r(15);
                nkhVar.q();
                nkhVar.r(15);
                nkhVar.q();
                nkhVar.r(3);
                nkhVar.r(11);
                nkhVar.q();
                nkhVar.r(15);
                nkhVar.q();
            }
        }
        if (nkhVar.h(2) != 0) {
            toe.h("H263Reader", "Unhandled video object layer shape");
        }
        nkhVar.q();
        int iH4 = nkhVar.h(16);
        nkhVar.q();
        if (nkhVar.g()) {
            if (iH4 == 0) {
                toe.h("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i2 = 0;
                for (int i3 = iH4 - 1; i3 > 0; i3 >>= 1) {
                    i2++;
                }
                nkhVar.r(i2);
            }
        }
        nkhVar.q();
        int iH5 = nkhVar.h(13);
        nkhVar.q();
        int iH6 = nkhVar.h(13);
        nkhVar.q();
        nkhVar.q();
        return new Format.b().S(str).e0("video/mp4v-es").j0(iH5).Q(iH6).a0(f).T(Collections.singletonList(bArrCopyOf)).E();
    }

    @Override // defpackage.u68
    public void a(okh okhVar) {
        rk1.i(this.f);
        rk1.i(this.i);
        int iE = okhVar.e();
        int iF = okhVar.f();
        byte[] bArrD = okhVar.d();
        this.g += (long) okhVar.a();
        this.i.d(okhVar, okhVar.a());
        while (true) {
            int iC = kgg.c(bArrD, iE, iF, this.c);
            if (iC == iF) {
                break;
            }
            int i = iC + 3;
            int i2 = okhVar.d()[i] & 255;
            int i3 = iC - iE;
            int i4 = 0;
            if (!this.j) {
                if (i3 > 0) {
                    this.d.a(bArrD, iE, iC);
                }
                if (this.d.b(i2, i3 < 0 ? -i3 : 0)) {
                    snp snpVar = this.i;
                    a aVar = this.d;
                    snpVar.b(b(aVar, aVar.d, (String) rk1.e(this.h)));
                    this.j = true;
                }
            }
            this.f.a(bArrD, iE, iC);
            jgg jggVar = this.e;
            if (jggVar != null) {
                if (i3 > 0) {
                    jggVar.a(bArrD, iE, iC);
                } else {
                    i4 = -i3;
                }
                if (this.e.b(i4)) {
                    jgg jggVar2 = this.e;
                    ((okh) wlq.j(this.f30235b)).N(this.e.d, kgg.k(jggVar2.d, jggVar2.e));
                    ((ifq) wlq.j(this.f30234a)).a(this.f30236k, this.f30235b);
                }
                if (i2 == 178 && okhVar.d()[iC + 2] == 1) {
                    this.e.e(i2);
                }
            }
            int i5 = iF - iC;
            this.f.b(this.g - ((long) i5), i5, this.j);
            this.f.c(i2, this.f30236k);
            iE = i;
        }
        if (!this.j) {
            this.d.a(bArrD, iE, iF);
        }
        this.f.a(bArrD, iE, iF);
        jgg jggVar3 = this.e;
        if (jggVar3 != null) {
            jggVar3.a(bArrD, iE, iF);
        }
    }

    @Override // defpackage.u68
    public void c() {
        kgg.a(this.c);
        this.d.c();
        b bVar = this.f;
        if (bVar != null) {
            bVar.d();
        }
        jgg jggVar = this.e;
        if (jggVar != null) {
            jggVar.d();
        }
        this.g = 0L;
    }

    @Override // defpackage.u68
    public void d() {
    }

    @Override // defpackage.u68
    public void e(long j, int i) {
        this.f30236k = j;
    }

    @Override // defpackage.u68
    public void f(kl8 kl8Var, i2q.d dVar) {
        dVar.a();
        this.h = dVar.b();
        snp snpVarD = kl8Var.d(dVar.c(), 2);
        this.i = snpVarD;
        this.f = new b(snpVarD);
        ifq ifqVar = this.f30234a;
        if (ifqVar != null) {
            ifqVar.b(kl8Var, dVar);
        }
    }
}
