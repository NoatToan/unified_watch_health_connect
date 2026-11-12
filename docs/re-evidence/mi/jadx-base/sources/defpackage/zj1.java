package defpackage;

import android.annotation.TargetApi;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes4.dex */
@TargetApi(21)
public class zj1 extends f0i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bq2 f41331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x14 f41332b;

    public zj1(bq2 bq2Var, x14 x14Var) {
        this.f41331a = bq2Var;
        this.f41332b = x14Var;
    }

    @Override // defpackage.f0i
    public w14<Bitmap> d(int i, int i2, Bitmap.Config config) {
        Bitmap bitmap = this.f41331a.get(jq2.d(i, i2, config));
        b6i.b(bitmap.getAllocationByteCount() >= (i * i2) * jq2.c(config));
        bitmap.reconfigure(i, i2, config);
        return this.f41332b.b(bitmap, this.f41331a);
    }
}
