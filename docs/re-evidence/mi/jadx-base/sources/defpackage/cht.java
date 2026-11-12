package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class cht extends xdt {
    public int d;
    public int e;
    public int f;
    public long g = -1;

    public cht(int i, int i2, int i3) {
        this.d = i;
        this.e = i2;
        this.f = i3;
    }

    @Override // defpackage.xdt
    public vr a() {
        return vr.SPO2;
    }

    public void b(long j) {
        this.g = j;
    }

    public String toString() {
        return "SPO2Data{redLight=" + this.d + ", infraredLight=" + this.e + ", bgLight=" + this.f + AbstractJsonLexerKt.END_OBJ;
    }
}
