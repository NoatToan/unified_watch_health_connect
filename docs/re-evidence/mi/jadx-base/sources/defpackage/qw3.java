package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.model.layer.a;

/* JADX INFO: loaded from: classes.dex */
public class qw3 implements fi4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sb1<PointF, PointF> f31901b;
    public final jb1 c;
    public final boolean d;
    public final boolean e;

    public qw3(String str, sb1<PointF, PointF> sb1Var, jb1 jb1Var, boolean z, boolean z2) {
        this.f31900a = str;
        this.f31901b = sb1Var;
        this.c = jb1Var;
        this.d = z;
        this.e = z2;
    }

    @Override // defpackage.fi4
    public hh4 a(jte jteVar, lse lseVar, a aVar) {
        return new z68(jteVar, aVar, this);
    }

    public String b() {
        return this.f31900a;
    }

    public sb1<PointF, PointF> c() {
        return this.f31901b;
    }

    public jb1 d() {
        return this.c;
    }

    public boolean e() {
        return this.e;
    }

    public boolean f() {
        return this.d;
    }
}
