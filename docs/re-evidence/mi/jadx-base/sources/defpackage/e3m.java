package defpackage;

import com.airbnb.lottie.model.layer.a;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class e3m implements fi4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16228b;
    public final lb1 c;
    public final boolean d;

    public e3m(String str, int i, lb1 lb1Var, boolean z) {
        this.f16227a = str;
        this.f16228b = i;
        this.c = lb1Var;
        this.d = z;
    }

    @Override // defpackage.fi4
    public hh4 a(jte jteVar, lse lseVar, a aVar) {
        return new t2m(jteVar, aVar, this);
    }

    public String b() {
        return this.f16227a;
    }

    public lb1 c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }

    public String toString() {
        return "ShapePath{name=" + this.f16227a + ", index=" + this.f16228b + AbstractJsonLexerKt.END_OBJ;
    }
}
