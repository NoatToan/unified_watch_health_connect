package defpackage;

import com.huawei.hms.network.embedded.g4;
import java.io.Serializable;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes21.dex */
public class wq implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final wq f52339c = new wq(null, -1, -1, -1, -1);
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final transient Object f52340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final long f52341b;
    protected final int d;
    protected final int e;
    protected final long i;

    public wq(Object obj, long j, int i, int i2) {
        this(obj, -1L, j, i, i2);
    }

    public wq(Object obj, long j, long j2, int i, int i2) {
        this.f52340a = obj;
        this.f52341b = j;
        this.i = j2;
        this.d = i;
        this.e = i2;
    }

    public long e() {
        return this.f52341b;
    }

    public int hashCode() {
        Object obj = this.f52340a;
        return ((((obj == null ? 1 : obj.hashCode()) ^ this.d) + this.e) ^ ((int) this.i)) + ((int) this.f52341b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof wq)) {
            return false;
        }
        wq wqVar = (wq) obj;
        Object obj2 = this.f52340a;
        if (obj2 == null) {
            if (wqVar.f52340a != null) {
                return false;
            }
        } else if (!obj2.equals(wqVar.f52340a)) {
            return false;
        }
        return this.d == wqVar.d && this.e == wqVar.e && this.i == wqVar.i && e() == wqVar.e();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(80);
        sb.append("[Source: ");
        b(sb);
        sb.append("; line: ");
        sb.append(this.d);
        sb.append(", column: ");
        sb.append(this.e);
        sb.append(']');
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0098  */
    protected StringBuilder b(StringBuilder sb) {
        int length;
        int iE;
        Object obj = this.f52340a;
        if (obj == null) {
            sb.append("UNKNOWN");
            return sb;
        }
        Class<?> cls = obj instanceof Class ? (Class) obj : obj.getClass();
        String name = cls.getName();
        if (name.startsWith("java.")) {
            name = cls.getSimpleName();
        } else if (obj instanceof byte[]) {
            name = "byte[]";
        } else if (obj instanceof char[]) {
            name = "char[]";
        }
        sb.append(g4.k);
        sb.append(name);
        sb.append(g4.l);
        int length2 = 0;
        String str = " chars";
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            length = charSequence.length();
            iE = e(sb, charSequence.subSequence(0, Math.min(length, 500)).toString());
        } else {
            if (obj instanceof char[]) {
                char[] cArr = (char[]) obj;
                length = cArr.length;
                iE = e(sb, new String(cArr, 0, Math.min(length, 500)));
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int iMin = Math.min(bArr.length, 500);
                e(sb, new String(bArr, 0, iMin, Charset.forName("UTF-8")));
                length2 = bArr.length - iMin;
                str = " bytes";
            }
            if (length2 > 0) {
                sb.append("[truncated ");
                sb.append(length2);
                sb.append(str);
                sb.append(']');
            }
            return sb;
        }
        length2 = length - iE;
        if (length2 > 0) {
            sb.append("[truncated ");
            sb.append(length2);
            sb.append(str);
            sb.append(']');
        }
        return sb;
    }

    private int e(StringBuilder sb, String str) {
        sb.append('\"');
        sb.append(str);
        sb.append('\"');
        return str.length();
    }
}
