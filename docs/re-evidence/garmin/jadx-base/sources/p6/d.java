package p6;

import am.j;
import java.util.Arrays;
import java.util.Objects;
import v.e0;

/* JADX INFO: loaded from: classes.dex */
public class d implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char[] f136193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f136194b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f136195c = Long.MAX_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f136196d;

    public d(char[] cArr) {
        this.f136193a = cArr;
    }

    @Override // 
    public d clone() {
        try {
            return (d) super.clone();
        } catch (CloneNotSupportedException unused) {
            e0.l();
            return null;
        }
    }

    public final String b() {
        String str = new String(this.f136193a);
        if (str.length() < 1) {
            return "";
        }
        long j8 = this.f136195c;
        if (j8 != Long.MAX_VALUE) {
            long j14 = this.f136194b;
            if (j8 >= j14) {
                return str.substring((int) j14, ((int) j8) + 1);
            }
        }
        long j15 = this.f136194b;
        return str.substring((int) j15, ((int) j15) + 1);
    }

    public float c() {
        if (this instanceof f) {
            return ((f) this).c();
        }
        return Float.NaN;
    }

    public int d() {
        if (this instanceof f) {
            return ((f) this).d();
        }
        return 0;
    }

    public final String e() {
        String string = getClass().toString();
        return string.substring(string.lastIndexOf(46) + 1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f136194b == dVar.f136194b && this.f136195c == dVar.f136195c && Arrays.equals(this.f136193a, dVar.f136193a)) {
            return Objects.equals(this.f136196d, dVar.f136196d);
        }
        return false;
    }

    public final void f(long j8) {
        if (this.f136195c != Long.MAX_VALUE) {
            return;
        }
        this.f136195c = j8;
        c cVar = this.f136196d;
        if (cVar != null) {
            cVar.g(this);
        }
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.f136193a) * 31;
        long j8 = this.f136194b;
        int i14 = (iHashCode + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j14 = this.f136195c;
        int i15 = (i14 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        c cVar = this.f136196d;
        return (i15 + (cVar != null ? cVar.hashCode() : 0)) * 31;
    }

    public String toString() {
        long j8 = this.f136194b;
        long j14 = this.f136195c;
        if (j8 > j14 || j14 == Long.MAX_VALUE) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(getClass());
            sb3.append(" (INVALID, ");
            sb3.append(this.f136194b);
            sb3.append("-");
            return j.i(this.f136195c, ")", sb3);
        }
        String strSubstring = new String(this.f136193a).substring((int) this.f136194b, ((int) this.f136195c) + 1);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(e());
        sb4.append(" (");
        sb4.append(this.f136194b);
        sb4.append(" : ");
        b.k(this.f136195c, ") <<", strSubstring, sb4);
        sb4.append(">>");
        return sb4.toString();
    }
}
