package o4;

import android.graphics.Path;
import android.graphics.PathMeasure;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo4/l;", "Lo4/i1;", "Landroid/graphics/PathMeasure;", "internalPathMeasure", "<init>", "(Landroid/graphics/PathMeasure;)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PathMeasure f128887a;

    public l(PathMeasure pathMeasure) {
        this.f128887a = pathMeasure;
    }

    @Override // o4.i1
    public final boolean a(float f14, float f15, f1 f1Var) {
        if (f1Var instanceof j) {
            return this.f128887a.getSegment(f14, f15, ((j) f1Var).f128869b, true);
        }
        org.apache.commons.lang3.e.w("Unable to obtain android.graphics.Path");
        return false;
    }

    @Override // o4.i1
    public final void b(f1 f1Var) {
        Path path;
        if (f1Var == null) {
            path = null;
        } else {
            if (!(f1Var instanceof j)) {
                org.apache.commons.lang3.e.w("Unable to obtain android.graphics.Path");
                return;
            }
            path = ((j) f1Var).f128869b;
        }
        this.f128887a.setPath(path, false);
    }

    @Override // o4.i1
    public final float getLength() {
        return this.f128887a.getLength();
    }
}
