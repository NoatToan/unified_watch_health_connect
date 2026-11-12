package defpackage;

import com.huawei.operation.utils.Constants;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
public final class adg implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Class<?> f297b;
    protected final int e;

    public adg(Class<?> cls) {
        this(cls, null);
    }

    public adg(Class<?> cls, String str) {
        this.f297b = cls;
        this.e = cls.getName().hashCode() + (str == null ? 0 : str.hashCode());
        c(str);
    }

    public Class<?> a() {
        return this.f297b;
    }

    public String b() {
        return this.f296a;
    }

    public void c(String str) {
        if (str == null || str.isEmpty()) {
            str = null;
        }
        this.f296a = str;
    }

    public boolean c() {
        return this.f296a != null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        adg adgVar = (adg) obj;
        return this.f297b == adgVar.f297b && Objects.equals(this.f296a, adgVar.f296a);
    }

    public int hashCode() {
        return this.e;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[NamedType, class ");
        sb.append(this.f297b.getName());
        sb.append(", name: ");
        if (this.f296a == null) {
            str = Constants.NULL;
        } else {
            str = "'" + this.f296a + "'";
        }
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }
}
