package h0;

import android.graphics.Bitmap;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
public class k {

    public static class a {
        private a() {
        }

        public static boolean a(Bitmap bitmap) {
            return bitmap.hasGainmap();
        }
    }

    @AutoValue
    public static abstract class b {
        public abstract int a();

        public abstract r0.k<Bitmap> b();
    }
}
