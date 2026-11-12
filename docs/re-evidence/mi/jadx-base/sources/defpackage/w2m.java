package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.model.layer.a;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class w2m implements fi4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path.FillType f37485b;
    public final String c;
    public final db1 d;
    public final gb1 e;
    public final boolean f;

    public w2m(String str, boolean z, Path.FillType fillType, db1 db1Var, gb1 gb1Var, boolean z2) {
        this.c = str;
        this.f37484a = z;
        this.f37485b = fillType;
        this.d = db1Var;
        this.e = gb1Var;
        this.f = z2;
    }

    @Override // defpackage.fi4
    public hh4 a(jte jteVar, lse lseVar, a aVar) {
        return new qm9(jteVar, aVar, this);
    }

    public db1 b() {
        return this.d;
    }

    public Path.FillType c() {
        return this.f37485b;
    }

    public String d() {
        return this.c;
    }

    public gb1 e() {
        return this.e;
    }

    public boolean f() {
        return this.f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f37484a + AbstractJsonLexerKt.END_OBJ;
    }
}
