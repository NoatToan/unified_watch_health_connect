package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class t2m implements slh, o82.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f34242b;
    public final boolean c;
    public final jte d;
    public final a3m e;
    public boolean f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f34241a = new Path();
    public final va4 g = new va4();

    public t2m(jte jteVar, a aVar, e3m e3mVar) {
        this.f34242b = e3mVar.b();
        this.c = e3mVar.d();
        this.d = jteVar;
        a3m a3mVarA = e3mVar.c().a();
        this.e = a3mVarA;
        aVar.i(a3mVarA);
        a3mVarA.a(this);
    }

    private void b() {
        this.f = false;
        this.d.invalidateSelf();
    }

    @Override // o82.b
    public void e() {
        b();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:12:0x002a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0036 A[SYNTHETIC] */
    @Override // defpackage.hh4
    public void f(List<hh4> list, List<hh4> list2) {
        ArrayList arrayList = null;
        for (int i = 0; i < list.size(); i++) {
            hh4 hh4Var = list.get(i);
            if (hh4Var instanceof d2q) {
                d2q d2qVar = (d2q) hh4Var;
                if (d2qVar.j() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.g.a(d2qVar);
                    d2qVar.b(this);
                } else if (!(hh4Var instanceof c3m)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((c3m) hh4Var);
                }
            } else if (!(hh4Var instanceof c3m)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((c3m) hh4Var);
            }
        }
        this.e.q(arrayList);
    }

    @Override // defpackage.slh
    public Path getPath() {
        if (this.f) {
            return this.f34241a;
        }
        this.f34241a.reset();
        if (this.c) {
            this.f = true;
            return this.f34241a;
        }
        Path pathH = this.e.h();
        if (pathH == null) {
            return this.f34241a;
        }
        this.f34241a.set(pathH);
        this.f34241a.setFillType(Path.FillType.EVEN_ODD);
        this.g.b(this.f34241a);
        this.f = true;
        return this.f34241a;
    }
}
