package com.amap.api.mapcore.util;

/* JADX INFO: loaded from: classes2.dex */
public class fb {
    public b a = new b(new c(0, 0, 512, 1024));

    /* JADX INFO: renamed from: com.amap.api.mapcore.util.fb$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.a().length];
            a = iArr;
            try {
                iArr[a.a - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[a.b - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[a.c - 1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class a {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        private static final /* synthetic */ int[] d = {1, 2, 3};

        public static int[] a() {
            return (int[]) d.clone();
        }
    }

    public static class c {
        public int a;
        public int b;
        public int c;
        public int d;

        public c(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public final String toString() {
            return "[ x: " + this.a + ", y: " + this.b + ", w: " + this.c + ", h: " + this.d + " ]";
        }
    }

    public final c a(int i, int i2, String str) {
        b bVarA = this.a.a(i, i2, str);
        if (bVarA == null) {
            return null;
        }
        c cVar = bVarA.b;
        return new c(cVar.a, cVar.b, cVar.c, cVar.d);
    }

    public final int b() {
        return this.a.b.d;
    }

    public final boolean a(String str) {
        return this.a.a(str);
    }

    public final int a() {
        return this.a.b.c;
    }

    public class b {
        public static final /* synthetic */ boolean e = true;
        public String a;
        public c b;
        public b c = null;
        public b d = null;

        public b(c cVar) {
            this.b = cVar;
        }

        private boolean b() {
            return (this.a == null && a()) ? false : true;
        }

        public final b a(int i, int i2, String str) {
            int i3;
            c cVar;
            c cVar2;
            int i4;
            b bVar = this;
            while (bVar.a()) {
                if (bVar.a != null) {
                    return null;
                }
                c cVar3 = bVar.b;
                int i5 = cVar3.c;
                if (i > i5 || i2 > (i4 = cVar3.d)) {
                    i3 = a.a;
                } else {
                    i3 = (i == i5 && i2 == i4) ? a.b : a.c;
                }
                int i6 = AnonymousClass1.a[i3 - 1];
                if (i6 == 1) {
                    return null;
                }
                if (i6 == 2) {
                    bVar.a = str;
                    return bVar;
                }
                if (i6 == 3) {
                    int i7 = i5 - i;
                    int i8 = cVar3.d;
                    int i9 = i8 - i2;
                    boolean z = e;
                    if (!z && i7 < 0) {
                        throw new AssertionError();
                    }
                    if (!z && i9 < 0) {
                        throw new AssertionError();
                    }
                    if (i7 > i9) {
                        cVar = new c(cVar3.a, cVar3.b, i, i8);
                        int i10 = cVar.a + i;
                        c cVar4 = bVar.b;
                        cVar2 = new c(i10, cVar4.b, cVar4.c - i, cVar4.d);
                    } else {
                        cVar = new c(cVar3.a, cVar3.b, i5, i2);
                        c cVar5 = bVar.b;
                        cVar2 = new c(cVar5.a, cVar.b + i2, cVar5.c, cVar5.d - i2);
                    }
                    bVar.c = fb.this.new b(cVar);
                    bVar.d = fb.this.new b(cVar2);
                }
                bVar = bVar.c;
            }
            b bVarA = bVar.c.a(i, i2, str);
            return bVarA == null ? bVar.d.a(i, i2, str) : bVarA;
        }

        private boolean a() {
            return this.c == null;
        }

        public final boolean a(String str) {
            if (a()) {
                if (!str.equals(this.a)) {
                    return false;
                }
                this.a = null;
                return true;
            }
            boolean zA = this.c.a(str);
            if (!zA) {
                zA = this.d.a(str);
            }
            if (zA && !this.c.b() && !this.d.b()) {
                this.c = null;
                this.d = null;
            }
            return zA;
        }
    }
}
