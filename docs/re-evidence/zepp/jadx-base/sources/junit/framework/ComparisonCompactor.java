package junit.framework;

/* JADX INFO: loaded from: classes23.dex */
public class ComparisonCompactor {
    private static final String f = "...";
    private static final String g = "]";
    private static final String h = "[";
    private int a;
    private String b;
    private String c;
    private int d;
    private int e;

    public ComparisonCompactor(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    private boolean a() {
        return this.b.equals(this.c);
    }

    private String b(String str) {
        String str2 = h + str.substring(this.d, (str.length() - this.e) + 1) + g;
        if (this.d > 0) {
            str2 = c() + str2;
        }
        if (this.e <= 0) {
            return str2;
        }
        return str2 + d();
    }

    private String c() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d > this.a ? f : "");
        sb.append(this.b.substring(Math.max(0, this.d - this.a), this.d));
        return sb.toString();
    }

    private String d() {
        int iMin = Math.min((this.b.length() - this.e) + 1 + this.a, this.b.length());
        StringBuilder sb = new StringBuilder();
        String str = this.b;
        sb.append(str.substring((str.length() - this.e) + 1, iMin));
        sb.append((this.b.length() - this.e) + 1 < this.b.length() - this.a ? f : "");
        return sb.toString();
    }

    private void e() {
        this.d = 0;
        int iMin = Math.min(this.b.length(), this.c.length());
        while (true) {
            int i = this.d;
            if (i >= iMin || this.b.charAt(i) != this.c.charAt(this.d)) {
                return;
            } else {
                this.d++;
            }
        }
    }

    private void f() {
        int length = this.b.length() - 1;
        int length2 = this.c.length() - 1;
        while (true) {
            int i = this.d;
            if (length2 < i || length < i || this.b.charAt(length) != this.c.charAt(length2)) {
                break;
            }
            length2--;
            length--;
        }
        this.e = this.b.length() - length;
    }

    public String compact(String str) {
        if (this.b == null || this.c == null || a()) {
            return Assert.format(str, this.b, this.c);
        }
        e();
        f();
        return Assert.format(str, b(this.b), b(this.c));
    }
}
