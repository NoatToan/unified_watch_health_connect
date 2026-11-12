package defpackage;

import java.io.Serializable;
import org.apache.commons.io.FilenameUtils;

/* JADX INFO: loaded from: classes21.dex */
public class wu implements Comparable<wu>, Serializable {
    private static final wu i = new wu(0, 0, 0, null, null, null);
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final int f52488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f52489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final String f52490c;
    protected final String d;
    protected final int e;
    protected final String f;

    public wu(int i2, int i3, int i4, String str, String str2, String str3) {
        this.e = i2;
        this.f52489b = i3;
        this.f52488a = i4;
        this.f = str;
        this.d = str2 == null ? "" : str2;
        this.f52490c = str3 == null ? "" : str3;
    }

    public static wu d() {
        return i;
    }

    public boolean c() {
        String str = this.f;
        return str != null && str.length() > 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.e);
        sb.append(FilenameUtils.EXTENSION_SEPARATOR);
        sb.append(this.f52489b);
        sb.append(FilenameUtils.EXTENSION_SEPARATOR);
        sb.append(this.f52488a);
        if (c()) {
            sb.append('-');
            sb.append(this.f);
        }
        return sb.toString();
    }

    public int hashCode() {
        return this.f52490c.hashCode() ^ (((this.d.hashCode() + this.e) - this.f52489b) + this.f52488a);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        wu wuVar = (wu) obj;
        return wuVar.e == this.e && wuVar.f52489b == this.f52489b && wuVar.f52488a == this.f52488a && wuVar.f52490c.equals(this.f52490c) && wuVar.d.equals(this.d);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(wu wuVar) {
        if (wuVar == this) {
            return 0;
        }
        int iCompareTo = this.d.compareTo(wuVar.d);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = this.f52490c.compareTo(wuVar.f52490c);
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        int i2 = this.e - wuVar.e;
        if (i2 != 0) {
            return i2;
        }
        int i3 = this.f52489b - wuVar.f52489b;
        return i3 == 0 ? this.f52488a - wuVar.f52488a : i3;
    }
}
