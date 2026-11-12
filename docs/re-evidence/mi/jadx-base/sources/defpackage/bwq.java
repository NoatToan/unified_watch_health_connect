package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(18)
public class bwq implements dwq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewOverlay f4679a;

    public bwq(View view) {
        this.f4679a = view.getOverlay();
    }

    @Override // defpackage.dwq
    public void a(Drawable drawable) {
        this.f4679a.remove(drawable);
    }

    @Override // defpackage.dwq
    public void b(Drawable drawable) {
        this.f4679a.add(drawable);
    }
}
