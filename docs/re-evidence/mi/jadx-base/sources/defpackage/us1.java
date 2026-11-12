package defpackage;

import android.util.Size;
import androidx.camera.core.impl.SessionConfig;

/* JADX INFO: loaded from: classes.dex */
public final class us1 extends qd3.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<?> f36072b;
    public final SessionConfig c;
    public final Size d;

    public us1(String str, Class<?> cls, SessionConfig sessionConfig, Size size) {
        if (str == null) {
            throw new NullPointerException("Null useCaseId");
        }
        this.f36071a = str;
        if (cls == null) {
            throw new NullPointerException("Null useCaseType");
        }
        this.f36072b = cls;
        if (sessionConfig == null) {
            throw new NullPointerException("Null sessionConfig");
        }
        this.c = sessionConfig;
        this.d = size;
    }

    @Override // qd3.h
    public SessionConfig c() {
        return this.c;
    }

    @Override // qd3.h
    public Size d() {
        return this.d;
    }

    @Override // qd3.h
    public String e() {
        return this.f36071a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qd3.h)) {
            return false;
        }
        qd3.h hVar = (qd3.h) obj;
        if (this.f36071a.equals(hVar.e()) && this.f36072b.equals(hVar.f()) && this.c.equals(hVar.c())) {
            Size size = this.d;
            if (size == null) {
                if (hVar.d() == null) {
                    return true;
                }
            } else if (size.equals(hVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // qd3.h
    public Class<?> f() {
        return this.f36072b;
    }

    public int hashCode() {
        int iHashCode = (((((this.f36071a.hashCode() ^ 1000003) * 1000003) ^ this.f36072b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        Size size = this.d;
        return iHashCode ^ (size == null ? 0 : size.hashCode());
    }

    public String toString() {
        return "UseCaseInfo{useCaseId=" + this.f36071a + ", useCaseType=" + this.f36072b + ", sessionConfig=" + this.c + ", surfaceResolution=" + this.d + "}";
    }
}
