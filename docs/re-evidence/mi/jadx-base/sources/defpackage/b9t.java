package defpackage;

import com.xiaomi.hm.health.bt.profile.feature.Feature;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class b9t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f3965a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f3966b = null;
    public String c = null;
    public String d = null;
    public hws e = null;
    public byte[] f = null;
    public int g = -1;
    public Feature h = null;
    public String i = null;
    public String j = null;

    public Feature a() {
        return this.h;
    }

    public void b(Feature feature) {
        this.h = feature;
    }

    public String toString() {
        return "GeneralDeviceInfo{deviceID='" + this.f3965a + "', serialNumber='" + this.f3966b + "', firmwareRevision='" + this.c + "', hardwareRevision='" + this.d + "', pnp=" + this.e + ", bytesOfDeviceID=" + tet.x(this.f) + ", version=" + this.g + ", deviceFeature=" + this.h + ", manufacturerName=" + this.i + ", modelNumberString=" + this.j + AbstractJsonLexerKt.END_OBJ;
    }
}
