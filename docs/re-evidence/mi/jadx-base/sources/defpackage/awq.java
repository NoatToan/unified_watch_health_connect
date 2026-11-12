package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes5.dex */
@RequiresApi(18)
public class awq implements cwq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewOverlay f3524a;

    public awq(View view) {
        this.f3524a = view.getOverlay();
    }

    @Override // defpackage.cwq
    public void a(Drawable drawable) {
        this.f3524a.remove(drawable);
    }

    @Override // defpackage.cwq
    public void b(Drawable drawable) {
        this.f3524a.add(drawable);
    }
}
