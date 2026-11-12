package defpackage;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public class g9n implements iwc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer[] f18760b;
    public int c;
    public int d;
    public float e;

    @Override // defpackage.iwc
    public float b() {
        return this.e;
    }

    public String toString() {
        return "SpoSegment{timeStamp=" + this.f18759a + ", valueArr=" + Arrays.toString(this.f18760b) + ", min=" + this.c + ", max=" + this.d + ", x=" + this.e + AbstractJsonLexerKt.END_OBJ;
    }
}
