package y0;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.media.Image;
import android.util.Size;
import at0.c;
import b0.a1;
import b0.g0;
import b0.m0;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.interfaces.Detector;
import j0.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import k7.h;

/* JADX INFO: loaded from: classes.dex */
public class b implements g0.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Size f192976f = new Size(480, 360);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f192977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f192978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k7.b<a> f192979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f192980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Matrix f192981e;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<Detector<?>, Object> f192982a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<Detector<?>, Throwable> f192983b;

        public a(Map<Detector<?>, Object> map, long j8, Map<Detector<?>, Throwable> map2) {
            this.f192982a = map;
            this.f192983b = map2;
        }
    }

    public b(List<Detector<?>> list, int i14, Executor executor, k7.b<a> bVar) {
        if (i14 != 0) {
            Iterator<Detector<?>> it = list.iterator();
            while (it.hasNext()) {
                Preconditions.checkArgument(it.next().getDetectorType() != 7, "Segmentation only works with COORDINATE_SYSTEM_ORIGINAL");
            }
        }
        this.f192977a = new ArrayList(list);
        this.f192978b = i14;
        this.f192979c = bVar;
        this.f192980d = executor;
        new n1.a();
    }

    public final void a(final a1 a1Var, final int i14, final Matrix matrix, final HashMap map, final HashMap map2) throws Exception {
        Image image = a1Var.f5432b.getImage();
        if (image == null) {
            a1Var.close();
            return;
        }
        ArrayList arrayList = this.f192977a;
        int size = arrayList.size() - 1;
        Executor executor = this.f192980d;
        if (i14 > size) {
            a1Var.close();
            executor.execute(new c(this, map, a1Var, map2, 24));
            return;
        }
        final Detector detector = (Detector) arrayList.get(i14);
        try {
            detector.process(image, a1Var.f13847e.e(), matrix).addOnCompleteListener(executor, new OnCompleteListener() { // from class: y0.a
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) throws Exception {
                    Size size2 = b.f192976f;
                    boolean zIsCanceled = task.isCanceled();
                    HashMap map3 = map2;
                    Detector detector2 = detector;
                    HashMap map4 = map;
                    if (zIsCanceled) {
                        map3.put(detector2, new CancellationException("The task is canceled."));
                    } else if (task.isSuccessful()) {
                        map4.put(detector2, task.getResult());
                    } else {
                        map3.put(detector2, task.getException());
                    }
                    this.f192969a.a(a1Var, i14 + 1, matrix, map4, map3);
                }
            });
        } catch (Exception e4) {
            map2.put(detector, new RuntimeException("Failed to process the image.", e4));
            a(a1Var, i14 + 1, matrix, map, map2);
        }
    }

    @Override // b0.g0.a
    public final Size c() {
        Iterator it = this.f192977a.iterator();
        Size size = f192976f;
        Size size2 = size;
        while (it.hasNext()) {
            int detectorType = ((Detector) it.next()).getDetectorType();
            Size size3 = (detectorType == 1 || detectorType == 4) ? new Size(1280, 720) : size;
            if (size3.getWidth() * size3.getHeight() > size2.getHeight() * size2.getWidth()) {
                size2 = size3;
            }
        }
        return size2;
    }

    @Override // b0.g0.a
    public final void e(a1 a1Var) throws Exception {
        m0 m0Var = a1Var.f13847e;
        Matrix matrix = new Matrix();
        int i14 = this.f192978b;
        if (i14 != 0) {
            Matrix matrix2 = this.f192981e;
            if (i14 != 2 && matrix2 == null) {
                a1Var.close();
                return;
            }
            Matrix matrix3 = new Matrix(m0Var.d());
            RectF rectF = new RectF(0.0f, 0.0f, a1Var.f13848f, a1Var.f13849g);
            int iE = m0Var.e();
            RectF rectF2 = v.f95963a;
            h.b(iE % 90 == 0, "Invalid rotation degrees: " + iE);
            matrix3.postConcat(v.a(m0Var.e(), false, rectF, v.d(v.l(iE)) ? new RectF(0.0f, 0.0f, rectF.height(), rectF.width()) : rectF));
            matrix3.invert(matrix);
            if (i14 != 2) {
                matrix.postConcat(matrix2);
            }
        }
        a(a1Var, 0, matrix, new HashMap(), new HashMap());
    }
}
