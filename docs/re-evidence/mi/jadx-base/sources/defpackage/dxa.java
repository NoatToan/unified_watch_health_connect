package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public class dxa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16026b;
    public int c;
    public final int d;
    public final int e;
    public int f;
    public final int g;
    public float h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f16027k;
    public int l;
    public int m;
    public int n;
    public int o;

    public dxa(int i, int i2, int i3, int i4) {
        this.f16026b = i;
        this.d = i2;
        this.e = i3;
        this.g = i4;
    }

    public String toString() {
        return "GYMSportData{duration=" + this.f16025a + ", calories=" + this.f16026b + ", heartRate=" + this.c + ", distance=" + this.d + ", steps=" + this.e + ", stepFrequency=" + this.f + ", currentPace=" + this.g + ", speed=" + this.h + ", currentRpm=" + this.i + ", revolutionCount=" + this.j + ", currentPower=" + this.f16027k + ", currentResistanceLevel=" + this.l + ", jumpCount=" + this.m + ", jumpHeight=" + this.n + ", stumbleCount=" + this.o + AbstractJsonLexerKt.END_OBJ;
    }
}
