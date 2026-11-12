package d7;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Drawable> T a(Drawable drawable) {
        return drawable instanceof c ? (T) ((c) drawable).b() : drawable;
    }
}
