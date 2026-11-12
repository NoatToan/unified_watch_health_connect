package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class hbs extends xdt {
    public long d = -1;
    public int e;
    public int f;
    public int g;

    public hbs(int i, int i2, int i3) {
        this.e = i;
        this.f = i2;
        this.g = i3;
    }

    @Override // defpackage.xdt
    public vr a() {
        return vr.GYRO;
    }

    public void b(long j) {
        this.d = j;
    }

    public String toString() {
        return "GyroData{timestamp=" + this.d + ", x=" + this.e + ", y=" + this.f + ", z=" + this.g + AbstractJsonLexerKt.END_OBJ;
    }
}
