package ez2;

import android.widget.ImageView;

/* JADX INFO: loaded from: classes13.dex */
public class k {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67583a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f67583a = iArr;
            try {
                iArr[ImageView.ScaleType.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static void a(float f14, float f15, float f16) {
        if (f14 >= f15) {
            vb.h.s("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
        } else {
            if (f15 < f16) {
                return;
            }
            vb.h.s("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
    }
}
