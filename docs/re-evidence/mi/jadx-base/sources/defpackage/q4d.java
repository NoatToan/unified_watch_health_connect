package defpackage;

import android.graphics.Matrix;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.utils.ExifData;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface q4d {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    uzo a();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    void b(ExifData.b bVar);

    default Matrix c() {
        return new Matrix();
    }

    int d();

    long getTimestamp();
}
