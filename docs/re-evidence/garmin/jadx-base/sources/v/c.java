package v;

import android.util.Size;
import androidx.camera.core.impl.b3;
import androidx.camera.core.impl.c3;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class c extends s.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<?> f173712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.camera.core.impl.l2 f173713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b3<?> f173714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Size f173715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.camera.core.impl.q2 f173716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<c3.b> f173717g;

    public c(String str, Class<?> cls, androidx.camera.core.impl.l2 l2Var, b3<?> b3Var, Size size, androidx.camera.core.impl.q2 q2Var, List<c3.b> list) {
        if (str == null) {
            j20.x.l("Null useCaseId");
            throw null;
        }
        this.f173711a = str;
        if (cls == null) {
            j20.x.l("Null useCaseType");
            throw null;
        }
        this.f173712b = cls;
        if (l2Var == null) {
            j20.x.l("Null sessionConfig");
            throw null;
        }
        this.f173713c = l2Var;
        if (b3Var == null) {
            j20.x.l("Null useCaseConfig");
            throw null;
        }
        this.f173714d = b3Var;
        this.f173715e = size;
        this.f173716f = q2Var;
        this.f173717g = list;
    }

    @Override // v.s.i
    public final List<c3.b> a() {
        return this.f173717g;
    }

    @Override // v.s.i
    public final androidx.camera.core.impl.l2 b() {
        return this.f173713c;
    }

    @Override // v.s.i
    public final androidx.camera.core.impl.q2 c() {
        return this.f173716f;
    }

    @Override // v.s.i
    public final Size d() {
        return this.f173715e;
    }

    @Override // v.s.i
    public final b3<?> e() {
        return this.f173714d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s.i)) {
            return false;
        }
        s.i iVar = (s.i) obj;
        if (!this.f173711a.equals(iVar.f()) || !this.f173712b.equals(iVar.g()) || !this.f173713c.equals(iVar.b()) || !this.f173714d.equals(iVar.e())) {
            return false;
        }
        Size size = this.f173715e;
        if (size == null) {
            if (iVar.d() != null) {
                return false;
            }
        } else if (!size.equals(iVar.d())) {
            return false;
        }
        androidx.camera.core.impl.q2 q2Var = this.f173716f;
        if (q2Var == null) {
            if (iVar.c() != null) {
                return false;
            }
        } else if (!q2Var.equals(iVar.c())) {
            return false;
        }
        List<c3.b> list = this.f173717g;
        if (list == null) {
            return iVar.a() == null;
        }
        return list.equals(iVar.a());
    }

    @Override // v.s.i
    public final String f() {
        return this.f173711a;
    }

    @Override // v.s.i
    public final Class<?> g() {
        return this.f173712b;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f173711a.hashCode() ^ 1000003) * 1000003) ^ this.f173712b.hashCode()) * 1000003) ^ this.f173713c.hashCode()) * 1000003) ^ this.f173714d.hashCode()) * 1000003;
        Size size = this.f173715e;
        int iHashCode2 = (iHashCode ^ (size == null ? 0 : size.hashCode())) * 1000003;
        androidx.camera.core.impl.q2 q2Var = this.f173716f;
        int iHashCode3 = (iHashCode2 ^ (q2Var == null ? 0 : q2Var.hashCode())) * 1000003;
        List<c3.b> list = this.f173717g;
        return iHashCode3 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UseCaseInfo{useCaseId=");
        sb3.append(this.f173711a);
        sb3.append(", useCaseType=");
        sb3.append(this.f173712b);
        sb3.append(", sessionConfig=");
        sb3.append(this.f173713c);
        sb3.append(", useCaseConfig=");
        sb3.append(this.f173714d);
        sb3.append(", surfaceResolution=");
        sb3.append(this.f173715e);
        sb3.append(", streamSpec=");
        sb3.append(this.f173716f);
        sb3.append(", captureTypes=");
        return u62.z.c(sb3, this.f173717g, StringSubstitutor.DEFAULT_VAR_END);
    }
}
