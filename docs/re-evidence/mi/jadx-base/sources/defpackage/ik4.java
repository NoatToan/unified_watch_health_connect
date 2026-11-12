package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class ik4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ck4[] f21244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a[] f21245b = new a[16];

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<?> f21246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ck4 f21247b;

        public a(Class<?> cls, ck4 ck4Var) {
            this.f21246a = cls;
            this.f21247b = ck4Var;
        }
    }

    public ik4(ck4[] ck4VarArr) {
        this.f21244a = ck4VarArr;
    }

    public static ck4 c(ik4 ik4Var, Class<?> cls) {
        ck4[] ck4VarArr = ik4Var.f21244a;
        int length = ck4VarArr.length;
        int length2 = length;
        while (true) {
            length--;
            if (length < 0) {
                if (cls == null || length2 == 0) {
                    return null;
                }
                if (length2 == 1) {
                    return ck4VarArr[0];
                }
                int i = length2;
                while (true) {
                    length2--;
                    if (length2 < 0) {
                        break;
                    }
                    Class<?> clsE = ck4VarArr[length2].e();
                    int length3 = i;
                    while (true) {
                        i--;
                        if (i >= 0) {
                            if (i != length2 && ck4VarArr[i].e().isAssignableFrom(clsE)) {
                                ik4Var = ik4Var.a(i, null);
                                ck4VarArr = ik4Var.f21244a;
                                length3 = ck4VarArr.length;
                                length2 = length3 - 1;
                            }
                        }
                    }
                    i = length3;
                }
                if (i == 1) {
                    return ck4VarArr[0];
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to find best converter for type \"");
                sb.append(cls.getName());
                sb.append("\" from remaining set: ");
                for (int i2 = 0; i2 < i; i2++) {
                    ck4 ck4Var = ck4VarArr[i2];
                    Class<?> clsE2 = ck4Var.e();
                    sb.append(ck4Var.getClass().getName());
                    sb.append(AbstractJsonLexerKt.BEGIN_LIST);
                    sb.append(clsE2 == null ? null : clsE2.getName());
                    sb.append("], ");
                }
                throw new IllegalStateException(sb.toString());
            }
            ck4 ck4Var2 = ck4VarArr[length];
            Class<?> clsE3 = ck4Var2.e();
            if (clsE3 == cls) {
                return ck4Var2;
            }
            if (clsE3 == null || (cls != null && !clsE3.isAssignableFrom(cls))) {
                ik4Var = ik4Var.a(length, null);
                ck4VarArr = ik4Var.f21244a;
                length2 = ck4VarArr.length;
            }
        }
    }

    public ik4 a(int i, ck4[] ck4VarArr) {
        ck4[] ck4VarArr2 = this.f21244a;
        int length = ck4VarArr2.length;
        if (i >= length) {
            throw new IndexOutOfBoundsException();
        }
        if (ck4VarArr != null) {
            ck4VarArr[0] = ck4VarArr2[i];
        }
        ck4[] ck4VarArr3 = new ck4[length - 1];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (i3 != i) {
                ck4VarArr3[i2] = ck4VarArr2[i3];
                i2++;
            }
        }
        return new ik4(ck4VarArr3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x000e, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0052, code lost:
    
        r7 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.ck4 b(java.lang.Class<?> r10) throws java.lang.IllegalStateException {
        /*
            r9 = this;
            ik4$a[] r0 = r9.f21245b
            int r1 = r0.length
            r2 = 0
            if (r10 != 0) goto L7
            goto L1d
        L7:
            int r3 = r10.hashCode()
            int r4 = r1 + (-1)
            r3 = r3 & r4
        Le:
            r4 = r0[r3]
            if (r4 == 0) goto L1f
            java.lang.Class<?> r5 = r4.f21246a
            if (r5 != r10) goto L19
            ck4 r10 = r4.f21247b
            return r10
        L19:
            int r3 = r3 + 1
            if (r3 < r1) goto Le
        L1d:
            r3 = r2
            goto Le
        L1f:
            ck4 r4 = c(r9, r10)
            ik4$a r5 = new ik4$a
            r5.<init>(r10, r4)
            java.lang.Object r10 = r0.clone()
            ik4$a[] r10 = (ik4.a[]) r10
            r10[r3] = r5
            r0 = r2
        L31:
            if (r0 >= r1) goto L3d
            r3 = r10[r0]
            if (r3 != 0) goto L3a
            r9.f21245b = r10
            return r4
        L3a:
            int r0 = r0 + 1
            goto L31
        L3d:
            int r0 = r1 << 1
            ik4$a[] r3 = new ik4.a[r0]
            r5 = r2
        L42:
            if (r5 >= r1) goto L61
            r6 = r10[r5]
            java.lang.Class<?> r7 = r6.f21246a
            if (r7 != 0) goto L4b
            goto L5a
        L4b:
            int r7 = r7.hashCode()
            int r8 = r0 + (-1)
            r7 = r7 & r8
        L52:
            r8 = r3[r7]
            if (r8 == 0) goto L5c
            int r7 = r7 + 1
            if (r7 < r0) goto L52
        L5a:
            r7 = r2
            goto L52
        L5c:
            r3[r7] = r6
            int r5 = r5 + 1
            goto L42
        L61:
            r9.f21245b = r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ik4.b(java.lang.Class):ck4");
    }

    public int d() {
        return this.f21244a.length;
    }
}
