package kotlin;

import android.graphics.Matrix;
import e23.p;
import o4.a1;
import o4.l1;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Li5/o2;", "T", "", "Lkotlin/Function2;", "Landroid/graphics/Matrix;", "", "getMatrix", "<init>", "(Le23/p;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p<T, Matrix, p005kotlin.Unit> f91365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Matrix f91366b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f91369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f91370f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f91367c = a1.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f91368d = a1.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f91371g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f91372h = true;

    /* JADX WARN: Multi-variable type inference failed */
    public o2(p<? super T, ? super Matrix, p005kotlin.Unit> pVar) {
        this.f91365a = pVar;
    }

    public final float[] a(b4 b4Var) {
        boolean z14 = this.f91370f;
        float[] fArr = this.f91368d;
        if (z14) {
            this.f91371g = o3.a(b(b4Var), fArr);
            this.f91370f = false;
        }
        if (this.f91371g) {
            return fArr;
        }
        return null;
    }

    public final float[] b(b4 b4Var) {
        boolean z14 = this.f91369e;
        float[] fArr = this.f91367c;
        if (!z14) {
            return fArr;
        }
        Matrix matrix = this.f91366b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f91366b = matrix;
        }
        this.f91365a.invoke(b4Var, matrix);
        l1.f(fArr, matrix);
        this.f91369e = false;
        this.f91372h = l1.c(fArr);
        return fArr;
    }
}
