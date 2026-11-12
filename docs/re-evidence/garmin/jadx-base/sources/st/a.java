package st;

import android.graphics.Bitmap;
import o13.q;
import p005kotlin.Metadata;
import t13.d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class a implements zp0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d<Bitmap> f160842a;

    /* JADX WARN: Multi-variable type inference failed */
    public a(d<? super Bitmap> dVar) {
        this.f160842a = dVar;
    }

    @Override // zp0.a
    public final void a(Bitmap bitmap) {
        int i14 = q.f128596b;
        this.f160842a.resumeWith(bitmap);
    }
}
