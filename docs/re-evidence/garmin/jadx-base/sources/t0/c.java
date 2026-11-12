package t0;

import am.j;
import android.opengl.EGLSurface;
import j20.x;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class c extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EGLSurface f161624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f161625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f161626c;

    public c(EGLSurface eGLSurface, int i14, int i15) {
        if (eGLSurface == null) {
            x.l("Null eglSurface");
            throw null;
        }
        this.f161624a = eGLSurface;
        this.f161625b = i14;
        this.f161626c = i15;
    }

    @Override // t0.g
    public final EGLSurface a() {
        return this.f161624a;
    }

    @Override // t0.g
    public final int b() {
        return this.f161626c;
    }

    @Override // t0.g
    public final int c() {
        return this.f161625b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f161624a.equals(gVar.a()) && this.f161625b == gVar.c() && this.f161626c == gVar.b();
    }

    public final int hashCode() {
        return ((((this.f161624a.hashCode() ^ 1000003) * 1000003) ^ this.f161625b) * 1000003) ^ this.f161626c;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OutputSurface{eglSurface=");
        sb3.append(this.f161624a);
        sb3.append(", width=");
        sb3.append(this.f161625b);
        sb3.append(", height=");
        return j.q(sb3, this.f161626c, StringSubstitutor.DEFAULT_VAR_END);
    }
}
