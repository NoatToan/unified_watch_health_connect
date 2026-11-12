package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.resource.bitmap.a;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@RequiresApi(21)
public final class dkh implements tqk<ParcelFileDescriptor, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f15623a;

    public dkh(a aVar) {
        this.f15623a = aVar;
    }

    @Override // defpackage.tqk
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public kqk<Bitmap> b(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, cch cchVar) throws IOException {
        return this.f15623a.d(parcelFileDescriptor, i, i2, cchVar);
    }

    @Override // defpackage.tqk
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(ParcelFileDescriptor parcelFileDescriptor, cch cchVar) {
        return e(parcelFileDescriptor) && this.f15623a.o(parcelFileDescriptor);
    }

    public final boolean e(ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        return !("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912;
    }
}
