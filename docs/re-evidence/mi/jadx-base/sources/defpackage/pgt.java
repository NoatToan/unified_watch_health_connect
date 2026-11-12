package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class pgt extends xdt {
    public long d = -1;
    public int e;
    public int f;
    public int g;

    public pgt(int i, int i2, int i3) {
        this.e = i;
        this.f = i2;
        this.g = i3;
    }

    @Override // defpackage.xdt
    public vr a() {
        return vr.GEO;
    }

    public void b(long j) {
        this.d = j;
    }

    public String toString() {
        return "GeoData{timestamp=" + this.d + ", x=" + this.e + ", y=" + this.f + ", z=" + this.g + AbstractJsonLexerKt.END_OBJ;
    }
}
