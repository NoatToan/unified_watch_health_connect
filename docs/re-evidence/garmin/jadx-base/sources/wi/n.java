package wi;

import ch.qos.logback.core.CoreConstants;
import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class n implements ui.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f185424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f185425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f185426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Class<?> f185427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Class<?> f185428f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ui.e f185429g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map<Class<?>, ui.l<?>> f185430h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ui.h f185431i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f185432j;

    public n(Object obj, ui.e eVar, int i14, int i15, Map<Class<?>, ui.l<?>> map, Class<?> cls, Class<?> cls2, ui.h hVar) {
        qj.l.c(obj, "Argument must not be null");
        this.f185424b = obj;
        qj.l.c(eVar, "Signature must not be null");
        this.f185429g = eVar;
        this.f185425c = i14;
        this.f185426d = i15;
        qj.l.c(map, "Argument must not be null");
        this.f185430h = map;
        qj.l.c(cls, "Resource class must not be null");
        this.f185427e = cls;
        qj.l.c(cls2, "Transcode class must not be null");
        this.f185428f = cls2;
        qj.l.c(hVar, "Argument must not be null");
        this.f185431i = hVar;
    }

    @Override // ui.e
    public final void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // ui.e
    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f185424b.equals(nVar.f185424b) && this.f185429g.equals(nVar.f185429g) && this.f185426d == nVar.f185426d && this.f185425c == nVar.f185425c && this.f185430h.equals(nVar.f185430h) && this.f185427e.equals(nVar.f185427e) && this.f185428f.equals(nVar.f185428f) && this.f185431i.equals(nVar.f185431i)) {
                return true;
            }
        }
        return false;
    }

    @Override // ui.e
    public final int hashCode() {
        if (this.f185432j == 0) {
            int iHashCode = this.f185424b.hashCode();
            this.f185432j = iHashCode;
            int iHashCode2 = ((((this.f185429g.hashCode() + (iHashCode * 31)) * 31) + this.f185425c) * 31) + this.f185426d;
            this.f185432j = iHashCode2;
            int iHashCode3 = this.f185430h.hashCode() + (iHashCode2 * 31);
            this.f185432j = iHashCode3;
            int iHashCode4 = this.f185427e.hashCode() + (iHashCode3 * 31);
            this.f185432j = iHashCode4;
            int iHashCode5 = this.f185428f.hashCode() + (iHashCode4 * 31);
            this.f185432j = iHashCode5;
            this.f185432j = this.f185431i.f171173b.hashCode() + (iHashCode5 * 31);
        }
        return this.f185432j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f185424b + ", width=" + this.f185425c + ", height=" + this.f185426d + ", resourceClass=" + this.f185427e + ", transcodeClass=" + this.f185428f + ", signature=" + this.f185429g + ", hashCode=" + this.f185432j + ", transformations=" + this.f185430h + ", options=" + this.f185431i + CoreConstants.CURLY_RIGHT;
    }
}
