package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.model.layer.a;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class dak implements fi4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sb1<PointF, PointF> f15317b;
    public final sb1<PointF, PointF> c;
    public final eb1 d;
    public final boolean e;

    public dak(String str, sb1<PointF, PointF> sb1Var, sb1<PointF, PointF> sb1Var2, eb1 eb1Var, boolean z) {
        this.f15316a = str;
        this.f15317b = sb1Var;
        this.c = sb1Var2;
        this.d = eb1Var;
        this.e = z;
    }

    @Override // defpackage.fi4
    public hh4 a(jte jteVar, lse lseVar, a aVar) {
        return new cak(jteVar, aVar, this);
    }

    public eb1 b() {
        return this.d;
    }

    public String c() {
        return this.f15316a;
    }

    public sb1<PointF, PointF> d() {
        return this.f15317b;
    }

    public sb1<PointF, PointF> e() {
        return this.c;
    }

    public boolean f() {
        return this.e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f15317b + ", size=" + this.c + AbstractJsonLexerKt.END_OBJ;
    }
}
