package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.a;

/* JADX INFO: loaded from: classes.dex */
public class j3b implements fi4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GradientType f22375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path.FillType f22376b;
    public final fb1 c;
    public final gb1 d;
    public final jb1 e;
    public final jb1 f;
    public final String g;
    public final eb1 h;
    public final eb1 i;
    public final boolean j;

    public j3b(String str, GradientType gradientType, Path.FillType fillType, fb1 fb1Var, gb1 gb1Var, jb1 jb1Var, jb1 jb1Var2, eb1 eb1Var, eb1 eb1Var2, boolean z) {
        this.f22375a = gradientType;
        this.f22376b = fillType;
        this.c = fb1Var;
        this.d = gb1Var;
        this.e = jb1Var;
        this.f = jb1Var2;
        this.g = str;
        this.h = eb1Var;
        this.i = eb1Var2;
        this.j = z;
    }

    @Override // defpackage.fi4
    public hh4 a(jte jteVar, lse lseVar, a aVar) {
        return new k3b(jteVar, lseVar, aVar, this);
    }

    public jb1 b() {
        return this.f;
    }

    public Path.FillType c() {
        return this.f22376b;
    }

    public fb1 d() {
        return this.c;
    }

    public GradientType e() {
        return this.f22375a;
    }

    public String f() {
        return this.g;
    }

    public gb1 g() {
        return this.d;
    }

    public jb1 h() {
        return this.e;
    }

    public boolean i() {
        return this.j;
    }
}
