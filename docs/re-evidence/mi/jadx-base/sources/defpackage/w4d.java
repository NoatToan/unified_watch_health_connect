package defpackage;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes5.dex */
public class w4d extends Property<ImageView, Matrix> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f37607a;

    public w4d() {
        super(Matrix.class, "imageMatrixProperty");
        this.f37607a = new Matrix();
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Matrix get(ImageView imageView) {
        this.f37607a.set(imageView.getImageMatrix());
        return this.f37607a;
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
