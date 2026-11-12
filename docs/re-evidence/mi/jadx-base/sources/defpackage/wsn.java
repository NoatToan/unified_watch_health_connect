package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public class wsn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38322b;

    public wsn(int i, int i2) {
        this.f38321a = i;
        this.f38322b = i2;
    }

    public String toString() {
        return "SportPreRequestData{sportType=" + this.f38321a + ", supportVersions=" + this.f38322b + AbstractJsonLexerKt.END_OBJ;
    }
}
