package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import defpackage.d0q;
import defpackage.e6d;
import defpackage.x8f;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ChangeImageTransform extends Transition {
    public static final String[] J = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};
    public static final TypeEvaluator<Matrix> K = new a();
    public static final Property<ImageView, Matrix> L = new b(Matrix.class, "animatedTransform");

    public class a implements TypeEvaluator<Matrix> {
        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    public class b extends Property<ImageView, Matrix> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix get(ImageView imageView) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(ImageView imageView, Matrix matrix) {
            e6d.a(imageView, matrix);
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3037a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f3037a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3037a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ChangeImageTransform() {
    }

    private void k0(d0q d0qVar) {
        View view = d0qVar.f14938b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            Map<String, Object> map = d0qVar.f14937a;
            map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            map.put("android:changeImageTransform:matrix", m0(imageView));
        }
    }

    public static Matrix l0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float width = imageView.getWidth();
        float f = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float height = imageView.getHeight();
        float f2 = intrinsicHeight;
        float fMax = Math.max(width / f, height / f2);
        int iRound = Math.round((width - (f * fMax)) / 2.0f);
        int iRound2 = Math.round((height - (f2 * fMax)) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.postScale(fMax, fMax);
        matrix.postTranslate(iRound, iRound2);
        return matrix;
    }

    public static Matrix m0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            return new Matrix(imageView.getImageMatrix());
        }
        int i = c.f3037a[imageView.getScaleType().ordinal()];
        if (i != 1) {
            return i != 2 ? new Matrix(imageView.getImageMatrix()) : l0(imageView);
        }
        return q0(imageView);
    }

    public static Matrix q0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(imageView.getWidth() / drawable.getIntrinsicWidth(), imageView.getHeight() / drawable.getIntrinsicHeight());
        return matrix;
    }

    @Override // androidx.transition.Transition
    public String[] H() {
        return J;
    }

    @Override // androidx.transition.Transition
    public void g(d0q d0qVar) {
        k0(d0qVar);
    }

    @Override // androidx.transition.Transition
    public void j(d0q d0qVar) {
        k0(d0qVar);
    }

    public final ObjectAnimator n0(ImageView imageView, Matrix matrix, Matrix matrix2) {
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) L, (TypeEvaluator) new d.a(), (Object[]) new Matrix[]{matrix, matrix2});
    }

    @Override // androidx.transition.Transition
    public Animator p(ViewGroup viewGroup, d0q d0qVar, d0q d0qVar2) {
        if (d0qVar == null || d0qVar2 == null) {
            return null;
        }
        Rect rect = (Rect) d0qVar.f14937a.get("android:changeImageTransform:bounds");
        Rect rect2 = (Rect) d0qVar2.f14937a.get("android:changeImageTransform:bounds");
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) d0qVar.f14937a.get("android:changeImageTransform:matrix");
        Matrix matrix2 = (Matrix) d0qVar2.f14937a.get("android:changeImageTransform:matrix");
        boolean z = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
        if (rect.equals(rect2) && z) {
            return null;
        }
        ImageView imageView = (ImageView) d0qVar2.f14938b;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return p0(imageView);
        }
        if (matrix == null) {
            matrix = x8f.f38848a;
        }
        if (matrix2 == null) {
            matrix2 = x8f.f38848a;
        }
        L.set(imageView, matrix);
        return n0(imageView, matrix, matrix2);
    }

    public final ObjectAnimator p0(ImageView imageView) {
        Property<ImageView, Matrix> property = L;
        TypeEvaluator<Matrix> typeEvaluator = K;
        Matrix matrix = x8f.f38848a;
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, (TypeEvaluator) typeEvaluator, (Object[]) new Matrix[]{matrix, matrix});
    }

    public ChangeImageTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
