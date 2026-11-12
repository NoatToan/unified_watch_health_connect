package defpackage;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;

/* JADX INFO: loaded from: classes4.dex */
public class dpd extends y92 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15790b;
    public final int c;
    public c93 d;

    public dpd(int i) {
        this(3, i);
    }

    @Override // defpackage.y92, defpackage.b5i
    public c93 b() {
        if (this.d == null) {
            this.d = new icm(String.format(null, "i%dr%d", Integer.valueOf(this.f15790b), Integer.valueOf(this.c)));
        }
        return this.d;
    }

    @Override // defpackage.y92
    public void e(Bitmap bitmap) {
        NativeBlurFilter.a(bitmap, this.f15790b, this.c);
    }

    public dpd(int i, int i2) {
        b6i.b(i > 0);
        b6i.b(i2 > 0);
        this.f15790b = i;
        this.c = i2;
    }
}
