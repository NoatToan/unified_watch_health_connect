package defpackage;

import com.airbnb.lottie.model.layer.a;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class y2m implements fi4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<fi4> f39721b;
    public final boolean c;

    public y2m(String str, List<fi4> list, boolean z) {
        this.f39720a = str;
        this.f39721b = list;
        this.c = z;
    }

    @Override // defpackage.fi4
    public hh4 a(jte jteVar, lse lseVar, a aVar) {
        return new kh4(jteVar, aVar, this, lseVar);
    }

    public List<fi4> b() {
        return this.f39721b;
    }

    public String c() {
        return this.f39720a;
    }

    public boolean d() {
        return this.c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f39720a + "' Shapes: " + Arrays.toString(this.f39721b.toArray()) + AbstractJsonLexerKt.END_OBJ;
    }
}
