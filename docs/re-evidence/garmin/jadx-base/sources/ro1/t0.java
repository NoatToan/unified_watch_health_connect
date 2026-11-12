package ro1;

import android.graphics.Bitmap;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.social.share.UCropImageActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class t0 implements zp0.a, p005kotlin.jvm.internal.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UCropImageActivity f154010a;

    public t0(UCropImageActivity uCropImageActivity) {
        this.f154010a = uCropImageActivity;
    }

    @Override // zp0.a
    public final void a(Bitmap bitmap) {
        UCropImageActivity.a aVar = UCropImageActivity.f44623o;
        UCropImageActivity uCropImageActivity = this.f154010a;
        uCropImageActivity.getClass();
        if (bitmap != null) {
            androidx.lifecycle.i0 i0VarW = o53.f0.w(uCropImageActivity);
            x53.c cVar = o53.s0.f129406a;
            ge1.b.T(i0VarW, u53.o.f168762a, null, new u0(uCropImageActivity, bitmap, null), 2);
        } else {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "UCropImageActivity", "loaded bitmap is null!!");
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof zp0.a) && (obj instanceof p005kotlin.jvm.internal.n)) {
            return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p005kotlin.jvm.internal.n
    public final o13.h<?> getFunctionDelegate() {
        return new p005kotlin.jvm.internal.q(1, this.f154010a, UCropImageActivity.class, "onImageLoaded", "onImageLoaded(Landroid/graphics/Bitmap;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
