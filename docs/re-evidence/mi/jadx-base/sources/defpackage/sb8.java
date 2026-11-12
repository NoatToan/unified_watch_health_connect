package defpackage;

import java.security.MessageDigest;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class sb8 implements pzd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f33479b;
    public final int c;
    public final int d;
    public final Class<?> e;
    public final Class<?> f;
    public final pzd g;
    public final Map<Class<?>, lyp<?>> h;
    public final cch i;
    public int j;

    public sb8(Object obj, pzd pzdVar, int i, int i2, Map<Class<?>, lyp<?>> map, Class<?> cls, Class<?> cls2, cch cchVar) {
        this.f33479b = a6i.d(obj);
        this.g = (pzd) a6i.e(pzdVar, "Signature must not be null");
        this.c = i;
        this.d = i2;
        this.h = (Map) a6i.d(map);
        this.e = (Class) a6i.e(cls, "Resource class must not be null");
        this.f = (Class) a6i.e(cls2, "Transcode class must not be null");
        this.i = (cch) a6i.d(cchVar);
    }

    @Override // defpackage.pzd
    public void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.pzd
    public boolean equals(Object obj) {
        if (!(obj instanceof sb8)) {
            return false;
        }
        sb8 sb8Var = (sb8) obj;
        return this.f33479b.equals(sb8Var.f33479b) && this.g.equals(sb8Var.g) && this.d == sb8Var.d && this.c == sb8Var.c && this.h.equals(sb8Var.h) && this.e.equals(sb8Var.e) && this.f.equals(sb8Var.f) && this.i.equals(sb8Var.i);
    }

    @Override // defpackage.pzd
    public int hashCode() {
        if (this.j == 0) {
            int iHashCode = this.f33479b.hashCode();
            this.j = iHashCode;
            int iHashCode2 = (((((iHashCode * 31) + this.g.hashCode()) * 31) + this.c) * 31) + this.d;
            this.j = iHashCode2;
            int iHashCode3 = (iHashCode2 * 31) + this.h.hashCode();
            this.j = iHashCode3;
            int iHashCode4 = (iHashCode3 * 31) + this.e.hashCode();
            this.j = iHashCode4;
            int iHashCode5 = (iHashCode4 * 31) + this.f.hashCode();
            this.j = iHashCode5;
            this.j = (iHashCode5 * 31) + this.i.hashCode();
        }
        return this.j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f33479b + ", width=" + this.c + ", height=" + this.d + ", resourceClass=" + this.e + ", transcodeClass=" + this.f + ", signature=" + this.g + ", hashCode=" + this.j + ", transformations=" + this.h + ", options=" + this.i + AbstractJsonLexerKt.END_OBJ;
    }
}
