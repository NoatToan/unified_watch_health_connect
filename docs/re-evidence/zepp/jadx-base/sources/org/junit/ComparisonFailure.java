package org.junit;

/* JADX INFO: loaded from: classes23.dex */
public class ComparisonFailure extends AssertionError {
    private static final int c = 20;
    private static final long serialVersionUID = 1;
    private String a;
    private String b;

    public static class b {
        private static final String d = "...";
        private static final String e = "]";
        private static final String f = "[";
        private final int a;
        private final String b;
        private final String c;

        public class a {
            private final String a;
            private final String b;

            private String e(String str) {
                return b.f + str.substring(this.a.length(), str.length() - this.b.length()) + b.e;
            }

            public String a() {
                return e(b.this.c);
            }

            public String b() {
                if (this.a.length() <= b.this.a) {
                    return this.a;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(b.d);
                String str = this.a;
                sb.append(str.substring(str.length() - b.this.a));
                return sb.toString();
            }

            public String c() {
                if (this.b.length() <= b.this.a) {
                    return this.b;
                }
                return this.b.substring(0, b.this.a) + b.d;
            }

            public String d() {
                return e(b.this.b);
            }

            private a() {
                String strG = b.this.g();
                this.a = strG;
                this.b = b.this.h(strG);
            }
        }

        public b(int i, String str, String str2) {
            this.a = i;
            this.b = str;
            this.c = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String g() {
            int iMin = Math.min(this.b.length(), this.c.length());
            for (int i = 0; i < iMin; i++) {
                if (this.b.charAt(i) != this.c.charAt(i)) {
                    return this.b.substring(0, i);
                }
            }
            return this.b.substring(0, iMin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String h(String str) {
            int iMin = Math.min(this.b.length() - str.length(), this.c.length() - str.length()) - 1;
            int i = 0;
            while (i <= iMin) {
                String str2 = this.b;
                char cCharAt = str2.charAt((str2.length() - 1) - i);
                String str3 = this.c;
                if (cCharAt != str3.charAt((str3.length() - 1) - i)) {
                    break;
                }
                i++;
            }
            String str4 = this.b;
            return str4.substring(str4.length() - i);
        }

        public String f(String str) {
            String str2;
            String str3 = this.b;
            if (str3 == null || (str2 = this.c) == null || str3.equals(str2)) {
                return Assert.i(str, this.b, this.c);
            }
            a aVar = new a();
            String strB = aVar.b();
            String strC = aVar.c();
            return Assert.i(str, strB + aVar.d() + strC, strB + aVar.a() + strC);
        }
    }

    public ComparisonFailure(String str, String str2, String str3) {
        super(str);
        this.a = str2;
        this.b = str3;
    }

    public String getActual() {
        return this.b;
    }

    public String getExpected() {
        return this.a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return new b(20, this.a, this.b).f(super.getMessage());
    }
}
