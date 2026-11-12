package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.model.layer.a;
import com.airbnb.lottie.model.layer.b;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b3m extends a {
    public final kh4 D;
    public final b E;

    public b3m(jte jteVar, Layer layer, b bVar, lse lseVar) {
        super(jteVar, layer);
        this.E = bVar;
        kh4 kh4Var = new kh4(jteVar, this, new y2m("__container", layer.n(), false), lseVar);
        this.D = kh4Var;
        kh4Var.f(Collections.emptyList(), Collections.emptyList());
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void H(f0e f0eVar, int i, List<f0e> list, f0e f0eVar2) {
        this.D.c(f0eVar, i, list, f0eVar2);
    }

    @Override // com.airbnb.lottie.model.layer.a, defpackage.p57
    public void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        this.D.a(rectF, this.o, z);
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void t(Canvas canvas, Matrix matrix, int i) {
        this.D.d(canvas, matrix, i);
    }

    @Override // com.airbnb.lottie.model.layer.a
    public v33 v() {
        v33 v33VarV = super.v();
        return v33VarV != null ? v33VarV : this.E.v();
    }

    @Override // com.airbnb.lottie.model.layer.a
    public f67 x() {
        f67 f67VarX = super.x();
        return f67VarX != null ? f67VarX : this.E.x();
    }
}
