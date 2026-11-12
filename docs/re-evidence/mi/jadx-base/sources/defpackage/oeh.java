package defpackage;

import android.util.Size;
import android.view.Surface;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public abstract class oeh {
    public static oeh a(Surface surface, Size size, int i) {
        return new at1(surface, size, i);
    }

    public abstract int b();

    public abstract Size c();

    public abstract Surface d();
}
