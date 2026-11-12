package fb2;

import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public class l extends b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f70361b;

    public l(View view2) {
        super(null);
        f.a(view2, "View not found");
        this.f70361b = view2;
    }

    @Override // fb2.b0
    public final boolean b() {
        return b0.c(this.f70361b);
    }

    @Override // fb2.b0
    public final boolean d() {
        return b0.e(this.f70361b);
    }

    @Override // fb2.b0
    public final void h(boolean z14) {
        b0.g(this.f70361b, z14);
    }

    @Override // fb2.b0
    public final void j(boolean z14) {
        b0.i(this.f70361b, z14);
    }
}
