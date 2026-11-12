package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes42.dex */
public class pro {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f45872b;
    private final String d;

    public String toString() {
        return "[Library name = " + d() + ", Package name = [ " + c() + " ]";
    }

    public int hashCode() {
        return (Objects.hashCode(this.f45872b) * 37) + Objects.hashCode(this.d);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pro)) {
            return false;
        }
        pro proVar = (pro) obj;
        return Objects.equals(this.f45872b, proVar.f45872b) && Objects.equals(this.d, proVar.d);
    }

    public String c() {
        return this.f45872b;
    }

    public String d() {
        return this.d;
    }

    public pro(String str, String str2) {
        this.f45872b = str;
        this.d = str2;
    }
}
