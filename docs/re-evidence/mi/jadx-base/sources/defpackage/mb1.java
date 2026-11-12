package defpackage;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class mb1 implements sb1<PointF, PointF> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eb1 f25960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eb1 f25961b;

    public mb1(eb1 eb1Var, eb1 eb1Var2) {
        this.f25960a = eb1Var;
        this.f25961b = eb1Var2;
    }

    @Override // defpackage.sb1
    public o82<PointF, PointF> a() {
        return new g7n(this.f25960a.a(), this.f25961b.a());
    }

    @Override // defpackage.sb1
    public List<e1e<PointF>> b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // defpackage.sb1
    public boolean isStatic() {
        return this.f25960a.isStatic() && this.f25961b.isStatic();
    }
}
