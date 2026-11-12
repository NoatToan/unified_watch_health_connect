package defpackage;

import com.huawei.operation.utils.Constants;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes21.dex */
public final class acz {
    static final Class<?>[] e = new Class[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Class<?>[] f284b;
    final String d;

    public acz(Method method) {
        this(method.getName(), method.getParameterTypes());
    }

    public acz(Constructor<?> constructor) {
        this("", constructor.getParameterTypes());
    }

    public acz(String str, Class<?>[] clsArr) {
        this.d = str;
        this.f284b = clsArr == null ? e : clsArr;
    }

    public String a() {
        return this.d;
    }

    public int b() {
        return this.f284b.length;
    }

    public String toString() {
        return this.d + Constants.LEFT_BRACKET_ONLY + this.f284b.length + "-args)";
    }

    public int hashCode() {
        return this.d.hashCode() + this.f284b.length;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        acz aczVar = (acz) obj;
        if (!this.d.equals(aczVar.d)) {
            return false;
        }
        Class<?>[] clsArr = aczVar.f284b;
        int length = this.f284b.length;
        if (clsArr.length != length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (clsArr[i] != this.f284b[i]) {
                return false;
            }
        }
        return true;
    }
}
