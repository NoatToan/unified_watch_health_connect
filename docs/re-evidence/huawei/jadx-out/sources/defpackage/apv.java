package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.primitives.ElementTypesAreNonnullByDefault;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
@Immutable
public final class apv implements Serializable {
    private static final apv d = new apv(new int[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f670a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient int f671c;
    private final int e;

    public static apv e() {
        return d;
    }

    public static apv c(int[] iArr) {
        return iArr.length == 0 ? d : new apv(Arrays.copyOf(iArr, iArr.length));
    }

    private apv(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    private apv(int[] iArr, int i, int i2) {
        this.f670a = iArr;
        this.f671c = i;
        this.e = i2;
    }

    public int c() {
        return this.e - this.f671c;
    }

    public boolean d() {
        return this.e == this.f671c;
    }

    public int e(int i) {
        Preconditions.checkElementIndex(i, c());
        return this.f670a[this.f671c + i];
    }

    public int[] a() {
        return Arrays.copyOfRange(this.f670a, this.f671c, this.e);
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof apv)) {
            return false;
        }
        apv apvVar = (apv) obj;
        if (c() != apvVar.c()) {
            return false;
        }
        for (int i = 0; i < c(); i++) {
            if (e(i) != apvVar.e(i)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int iE = 1;
        for (int i = this.f671c; i < this.e; i++) {
            iE = (iE * 31) + Ints.e(this.f670a[i]);
        }
        return iE;
    }

    public String toString() {
        if (d()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(c() * 5);
        sb.append('[');
        sb.append(this.f670a[this.f671c]);
        int i = this.f671c;
        while (true) {
            i++;
            if (i < this.e) {
                sb.append(", ");
                sb.append(this.f670a[i]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }

    public apv b() {
        return f() ? new apv(a()) : this;
    }

    private boolean f() {
        return this.f671c > 0 || this.e < this.f670a.length;
    }

    Object writeReplace() {
        return b();
    }

    Object readResolve() {
        return d() ? d : this;
    }
}
