package dj;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes7.dex */
public final class x implements ui.j<ParcelFileDescriptor, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f59886a;

    public x(m mVar) {
        this.f59886a = mVar;
    }

    @Override // ui.j
    public final wi.u<Bitmap> a(ParcelFileDescriptor parcelFileDescriptor, int i14, int i15, ui.h hVar) {
        m mVar = this.f59886a;
        return mVar.a(new u.c(parcelFileDescriptor, mVar.f59858d, mVar.f59857c), i14, i15, hVar, m.f59852k);
    }

    @Override // ui.j
    public final boolean b(ParcelFileDescriptor parcelFileDescriptor, ui.h hVar) {
        ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptor;
        String str = Build.MANUFACTURER;
        if (("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) && parcelFileDescriptor2.getStatSize() > 536870912) {
            return false;
        }
        this.f59886a.getClass();
        return !"robolectric".equals(Build.FINGERPRINT);
    }
}
