package defpackage;

import android.util.Size;
import androidx.annotation.RequiresApi;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class r94 implements Comparator<Size> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f32328a;

    public r94() {
        this(false);
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Size size, Size size2) {
        int iSignum = Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
        return this.f32328a ? iSignum * (-1) : iSignum;
    }

    public r94(boolean z) {
        this.f32328a = z;
    }
}
