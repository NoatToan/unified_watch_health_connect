package defpackage;

import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public class ys implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected SerializableString f53794a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final String f53795c;
    protected final String d;
    public static final ys e = new ys("", null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ys f53793b = new ys(new String(""), null);

    public ys(String str) {
        this(str, null);
    }

    public ys(String str, String str2) {
        this.f53795c = ahw.d(str);
        this.d = str2;
    }

    protected Object readResolve() {
        String str;
        return (this.d == null && ((str = this.f53795c) == null || "".equals(str))) ? e : this;
    }

    public static ys c(String str) {
        if (str == null || str.isEmpty()) {
            return e;
        }
        return new ys(xv.e.c(str), null);
    }

    public static ys a(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null && str.isEmpty()) {
            return e;
        }
        return new ys(xv.e.c(str), str2);
    }

    public ys d() {
        String strC;
        return (this.f53795c.isEmpty() || (strC = xv.e.c(this.f53795c)) == this.f53795c) ? this : new ys(strC, this.d);
    }

    public ys b(String str) {
        if (str == null) {
            str = "";
        }
        return str.equals(this.f53795c) ? this : new ys(str, this.d);
    }

    public String b() {
        return this.f53795c;
    }

    public SerializableString b(MapperConfig<?> mapperConfig) {
        SerializableString serializableStringCompileString;
        SerializableString serializableString = this.f53794a;
        if (serializableString != null) {
            return serializableString;
        }
        if (mapperConfig == null) {
            serializableStringCompileString = new xb(this.f53795c);
        } else {
            serializableStringCompileString = mapperConfig.compileString(this.f53795c);
        }
        this.f53794a = serializableStringCompileString;
        return serializableStringCompileString;
    }

    public boolean c() {
        return !this.f53795c.isEmpty();
    }

    public boolean e(String str) {
        return this.f53795c.equals(str);
    }

    public boolean e() {
        return this.d != null;
    }

    public boolean a() {
        return this.d == null && this.f53795c.isEmpty();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        ys ysVar = (ys) obj;
        String str = this.f53795c;
        if (str == null) {
            if (ysVar.f53795c != null) {
                return false;
            }
        } else if (!str.equals(ysVar.f53795c)) {
            return false;
        }
        String str2 = this.d;
        if (str2 == null) {
            return ysVar.d == null;
        }
        return str2.equals(ysVar.d);
    }

    public int hashCode() {
        String str = this.d;
        if (str == null) {
            return this.f53795c.hashCode();
        }
        return str.hashCode() ^ this.f53795c.hashCode();
    }

    public String toString() {
        if (this.d == null) {
            return this.f53795c;
        }
        return "{" + this.d + "}" + this.f53795c;
    }
}
