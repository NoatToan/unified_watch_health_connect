package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class i0t extends xdt {
    public int e;
    public long d = -1;
    public int f = -1;
    public int g = -1;

    public i0t(int i) {
        this.e = i;
    }

    @Override // defpackage.xdt
    public vr a() {
        return vr.PRESSURE;
    }

    public void b(long j) {
        this.d = j;
    }

    public String toString() {
        return "PressureData{timestamp=" + this.d + ", pressure=" + this.e + ", pressureAdj=" + this.f + ", pressureAlg=" + this.g + AbstractJsonLexerKt.END_OBJ;
    }
}
