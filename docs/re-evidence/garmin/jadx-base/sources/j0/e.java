package j0;

import android.util.Size;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Comparator<Size> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f95912a;

    public e(boolean z14) {
        this.f95912a = z14;
    }

    @Override // java.util.Comparator
    public final int compare(Size size, Size size2) {
        Size size3 = size;
        Size size4 = size2;
        int iSignum = Long.signum((((long) size3.getWidth()) * ((long) size3.getHeight())) - (((long) size4.getWidth()) * ((long) size4.getHeight())));
        return this.f95912a ? iSignum * (-1) : iSignum;
    }

    public e() {
        this(false);
    }
}
