package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class kd1 extends jd1 {
    public final iso c;
    public final boolean d;
    public final z73 e;
    public final int f;
    public int g;
    public final kd1 h;
    public kd1 i;

    public kd1(iso isoVar, boolean z, z73 z73Var, kd1 kd1Var) {
        super(589824);
        this.c = isoVar;
        this.d = z;
        this.e = z73Var;
        int i = z73Var.f40971b;
        this.f = i == 0 ? -1 : i - 2;
        this.h = kd1Var;
        if (kd1Var != null) {
            kd1Var.i = this;
        }
    }

    public static int f(kd1 kd1Var, kd1 kd1Var2, kd1 kd1Var3, kd1 kd1Var4) {
        int iG = kd1Var != null ? kd1Var.g("RuntimeVisibleAnnotations") : 0;
        if (kd1Var2 != null) {
            iG += kd1Var2.g("RuntimeInvisibleAnnotations");
        }
        if (kd1Var3 != null) {
            iG += kd1Var3.g("RuntimeVisibleTypeAnnotations");
        }
        return kd1Var4 != null ? iG + kd1Var4.g("RuntimeInvisibleTypeAnnotations") : iG;
    }

    public static int h(String str, kd1[] kd1VarArr, int i) {
        int iG = (i * 2) + 7;
        for (int i2 = 0; i2 < i; i2++) {
            kd1 kd1Var = kd1VarArr[i2];
            iG += kd1Var == null ? 0 : kd1Var.g(str) - 8;
        }
        return iG;
    }

    public static kd1 i(iso isoVar, int i, x4q x4qVar, String str, kd1 kd1Var) {
        z73 z73Var = new z73();
        a5q.a(i, z73Var);
        x4q.d(x4qVar, z73Var);
        z73Var.k(isoVar.D(str)).k(0);
        return new kd1(isoVar, true, z73Var, kd1Var);
    }

    public static kd1 j(iso isoVar, String str, kd1 kd1Var) {
        z73 z73Var = new z73();
        z73Var.k(isoVar.D(str)).k(0);
        return new kd1(isoVar, true, z73Var, kd1Var);
    }

    public static void l(iso isoVar, kd1 kd1Var, kd1 kd1Var2, kd1 kd1Var3, kd1 kd1Var4, z73 z73Var) {
        if (kd1Var != null) {
            kd1Var.k(isoVar.D("RuntimeVisibleAnnotations"), z73Var);
        }
        if (kd1Var2 != null) {
            kd1Var2.k(isoVar.D("RuntimeInvisibleAnnotations"), z73Var);
        }
        if (kd1Var3 != null) {
            kd1Var3.k(isoVar.D("RuntimeVisibleTypeAnnotations"), z73Var);
        }
        if (kd1Var4 != null) {
            kd1Var4.k(isoVar.D("RuntimeInvisibleTypeAnnotations"), z73Var);
        }
    }

    public static void m(int i, kd1[] kd1VarArr, int i2, z73 z73Var) {
        int iG = (i2 * 2) + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            kd1 kd1Var = kd1VarArr[i3];
            iG += kd1Var == null ? 0 : kd1Var.g(null) - 8;
        }
        z73Var.k(i);
        z73Var.i(iG);
        z73Var.g(i2);
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = 0;
            kd1 kd1Var2 = null;
            for (kd1 kd1Var3 = kd1VarArr[i4]; kd1Var3 != null; kd1Var3 = kd1Var3.h) {
                kd1Var3.d();
                i5++;
                kd1Var2 = kd1Var3;
            }
            z73Var.k(i5);
            while (kd1Var2 != null) {
                z73 z73Var2 = kd1Var2.e;
                z73Var.h(z73Var2.f40970a, 0, z73Var2.f40971b);
                kd1Var2 = kd1Var2.i;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.jd1
    public void a(String str, Object obj) {
        this.g++;
        if (this.d) {
            this.e.k(this.c.D(str));
        }
        if (obj instanceof String) {
            this.e.e(115, this.c.D((String) obj));
            return;
        }
        if (obj instanceof Byte) {
            this.e.e(66, this.c.l(((Byte) obj).byteValue()).f18165a);
            return;
        }
        if (obj instanceof Boolean) {
            this.e.e(90, this.c.l(((Boolean) obj).booleanValue() ? 1 : 0).f18165a);
            return;
        }
        if (obj instanceof Character) {
            this.e.e(67, this.c.l(((Character) obj).charValue()).f18165a);
            return;
        }
        if (obj instanceof Short) {
            this.e.e(83, this.c.l(((Short) obj).shortValue()).f18165a);
            return;
        }
        if (obj instanceof n4q) {
            this.e.e(99, this.c.D(((n4q) obj).d()));
            return;
        }
        int i = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            this.e.e(91, bArr.length);
            int length = bArr.length;
            while (i < length) {
                this.e.e(66, this.c.l(bArr[i]).f18165a);
                i++;
            }
            return;
        }
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            this.e.e(91, zArr.length);
            int length2 = zArr.length;
            while (i < length2) {
                this.e.e(90, this.c.l(zArr[i] ? 1 : 0).f18165a);
                i++;
            }
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            this.e.e(91, sArr.length);
            int length3 = sArr.length;
            while (i < length3) {
                this.e.e(83, this.c.l(sArr[i]).f18165a);
                i++;
            }
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            this.e.e(91, cArr.length);
            int length4 = cArr.length;
            while (i < length4) {
                this.e.e(67, this.c.l(cArr[i]).f18165a);
                i++;
            }
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            this.e.e(91, iArr.length);
            int length5 = iArr.length;
            while (i < length5) {
                this.e.e(73, this.c.l(iArr[i]).f18165a);
                i++;
            }
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            this.e.e(91, jArr.length);
            int length6 = jArr.length;
            while (i < length6) {
                this.e.e(74, this.c.p(jArr[i]).f18165a);
                i++;
            }
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            this.e.e(91, fArr.length);
            int length7 = fArr.length;
            while (i < length7) {
                this.e.e(70, this.c.k(fArr[i]).f18165a);
                i++;
            }
            return;
        }
        if (!(obj instanceof double[])) {
            fso fsoVarD = this.c.d(obj);
            this.e.e(".s.IFJDCS".charAt(fsoVarD.f18166b), fsoVarD.f18165a);
            return;
        }
        double[] dArr = (double[]) obj;
        this.e.e(91, dArr.length);
        int length8 = dArr.length;
        while (i < length8) {
            this.e.e(68, this.c.f(dArr[i]).f18165a);
            i++;
        }
    }

    @Override // defpackage.jd1
    public jd1 b(String str, String str2) {
        this.g++;
        if (this.d) {
            this.e.k(this.c.D(str));
        }
        this.e.e(64, this.c.D(str2)).k(0);
        return new kd1(this.c, true, this.e, null);
    }

    @Override // defpackage.jd1
    public jd1 c(String str) {
        this.g++;
        if (this.d) {
            this.e.k(this.c.D(str));
        }
        this.e.e(91, 0);
        return new kd1(this.c, false, this.e, null);
    }

    @Override // defpackage.jd1
    public void d() {
        int i = this.f;
        if (i != -1) {
            byte[] bArr = this.e.f40970a;
            int i2 = this.g;
            bArr[i] = (byte) (i2 >>> 8);
            bArr[i + 1] = (byte) i2;
        }
    }

    @Override // defpackage.jd1
    public void e(String str, String str2, String str3) {
        this.g++;
        if (this.d) {
            this.e.k(this.c.D(str));
        }
        this.e.e(101, this.c.D(str2)).k(this.c.D(str3));
    }

    public int g(String str) {
        if (str != null) {
            this.c.D(str);
        }
        int i = 8;
        for (kd1 kd1Var = this; kd1Var != null; kd1Var = kd1Var.h) {
            i += kd1Var.e.f40971b;
        }
        return i;
    }

    public void k(int i, z73 z73Var) {
        int i2 = 2;
        int i3 = 0;
        kd1 kd1Var = null;
        for (kd1 kd1Var2 = this; kd1Var2 != null; kd1Var2 = kd1Var2.h) {
            kd1Var2.d();
            i2 += kd1Var2.e.f40971b;
            i3++;
            kd1Var = kd1Var2;
        }
        z73Var.k(i);
        z73Var.i(i2);
        z73Var.k(i3);
        while (kd1Var != null) {
            z73 z73Var2 = kd1Var.e;
            z73Var.h(z73Var2.f40970a, 0, z73Var2.f40971b);
            kd1Var = kd1Var.i;
        }
    }
}
