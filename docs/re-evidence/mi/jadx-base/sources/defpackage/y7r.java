package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public class y7r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39907b;
    public final int c;
    public int d;
    public int e;
    public int f;

    public y7r(int i, int i2, int i3, int i4, int i5) {
        this.f39906a = i;
        this.f39907b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public String toString() {
        return "WearSportData{calories=" + this.f39906a + ", steps=" + this.f39907b + ", hr=" + this.c + ", maxHr=" + this.d + ", minHr=" + this.e + AbstractJsonLexerKt.END_OBJ;
    }
}
