package defpackage;

import android.media.ImageReader;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class r5d {
    public static p5d a(int i, int i2, int i3, int i4) {
        return new ha1(ImageReader.newInstance(i, i2, i3, i4));
    }
}
