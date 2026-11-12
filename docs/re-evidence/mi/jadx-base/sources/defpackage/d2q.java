package defpackage;

import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class d2q implements hh4, o82.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15014b;
    public final List<o82.b> c = new ArrayList();
    public final ShapeTrimPath.Type d;
    public final o82<?, Float> e;
    public final o82<?, Float> f;
    public final o82<?, Float> g;

    public d2q(a aVar, ShapeTrimPath shapeTrimPath) {
        this.f15013a = shapeTrimPath.c();
        this.f15014b = shapeTrimPath.g();
        this.d = shapeTrimPath.f();
        o82<Float, Float> o82VarA = shapeTrimPath.e().a();
        this.e = o82VarA;
        o82<Float, Float> o82VarA2 = shapeTrimPath.b().a();
        this.f = o82VarA2;
        o82<Float, Float> o82VarA3 = shapeTrimPath.d().a();
        this.g = o82VarA3;
        aVar.i(o82VarA);
        aVar.i(o82VarA2);
        aVar.i(o82VarA3);
        o82VarA.a(this);
        o82VarA2.a(this);
        o82VarA3.a(this);
    }

    public void b(o82.b bVar) {
        this.c.add(bVar);
    }

    public o82<?, Float> c() {
        return this.f;
    }

    @Override // o82.b
    public void e() {
        for (int i = 0; i < this.c.size(); i++) {
            this.c.get(i).e();
        }
    }

    @Override // defpackage.hh4
    public void f(List<hh4> list, List<hh4> list2) {
    }

    public o82<?, Float> h() {
        return this.g;
    }

    public o82<?, Float> i() {
        return this.e;
    }

    public ShapeTrimPath.Type j() {
        return this.d;
    }

    public boolean k() {
        return this.f15014b;
    }
}
