package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(18)
public class qtq implements rtq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroupOverlay f31840a;

    public qtq(ViewGroup viewGroup) {
        this.f31840a = viewGroup.getOverlay();
    }

    @Override // defpackage.dwq
    public void a(Drawable drawable) {
        this.f31840a.remove(drawable);
    }

    @Override // defpackage.dwq
    public void b(Drawable drawable) {
        this.f31840a.add(drawable);
    }

    @Override // defpackage.rtq
    public void c(View view) {
        this.f31840a.add(view);
    }

    @Override // defpackage.rtq
    public void d(View view) {
        this.f31840a.remove(view);
    }
}
