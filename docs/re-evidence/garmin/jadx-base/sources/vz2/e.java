package vz2;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public class e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f180934a;

    public e(f fVar) {
        this.f180934a = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        f fVar = this.f180934a;
        fVar.f180938c.b(null);
        fVar.dismiss();
    }
}
