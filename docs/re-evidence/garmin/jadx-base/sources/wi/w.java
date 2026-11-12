package wi;

import ch.qos.logback.core.CoreConstants;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes7.dex */
public final class w implements ui.e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final qj.i<Class<?>, byte[]> f185459j = new qj.i<>(50);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi.b f185460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ui.e f185461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ui.e f185462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f185463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f185464f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Class<?> f185465g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ui.h f185466h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ui.l<?> f185467i;

    public w(xi.b bVar, ui.e eVar, ui.e eVar2, int i14, int i15, ui.l<?> lVar, Class<?> cls, ui.h hVar) {
        this.f185460b = bVar;
        this.f185461c = eVar;
        this.f185462d = eVar2;
        this.f185463e = i14;
        this.f185464f = i15;
        this.f185467i = lVar;
        this.f185465g = cls;
        this.f185466h = hVar;
    }

    @Override // ui.e
    public final void b(MessageDigest messageDigest) {
        xi.b bVar = this.f185460b;
        byte[] bArr = (byte[]) bVar.d();
        ByteBuffer.wrap(bArr).putInt(this.f185463e).putInt(this.f185464f).array();
        this.f185462d.b(messageDigest);
        this.f185461c.b(messageDigest);
        messageDigest.update(bArr);
        ui.l<?> lVar = this.f185467i;
        if (lVar != null) {
            lVar.b(messageDigest);
        }
        this.f185466h.b(messageDigest);
        qj.i<Class<?>, byte[]> iVar = f185459j;
        Class<?> cls = this.f185465g;
        byte[] bArrA = iVar.a(cls);
        if (bArrA == null) {
            bArrA = cls.getName().getBytes(ui.e.f171166a);
            iVar.d(cls, bArrA);
        }
        messageDigest.update(bArrA);
        bVar.put(bArr);
    }

    @Override // ui.e
    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (this.f185464f == wVar.f185464f && this.f185463e == wVar.f185463e && qj.m.b(this.f185467i, wVar.f185467i) && this.f185465g.equals(wVar.f185465g) && this.f185461c.equals(wVar.f185461c) && this.f185462d.equals(wVar.f185462d) && this.f185466h.equals(wVar.f185466h)) {
                return true;
            }
        }
        return false;
    }

    @Override // ui.e
    public final int hashCode() {
        int iHashCode = ((((this.f185462d.hashCode() + (this.f185461c.hashCode() * 31)) * 31) + this.f185463e) * 31) + this.f185464f;
        ui.l<?> lVar = this.f185467i;
        if (lVar != null) {
            iHashCode = (iHashCode * 31) + lVar.hashCode();
        }
        return this.f185466h.f171173b.hashCode() + ((this.f185465g.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f185461c + ", signature=" + this.f185462d + ", width=" + this.f185463e + ", height=" + this.f185464f + ", decodedResourceClass=" + this.f185465g + ", transformation='" + this.f185467i + "', options=" + this.f185466h + CoreConstants.CURLY_RIGHT;
    }
}
