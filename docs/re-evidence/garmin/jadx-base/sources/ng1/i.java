package ng1;

import android.view.View;

/* JADX INFO: loaded from: classes10.dex */
public class i implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zb0.d0 f125941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f125942b;

    public i(j jVar, zb0.d0 d0Var) {
        this.f125942b = jVar;
        this.f125941a = d0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        j jVar = this.f125942b;
        jVar.startActivity(this.f125941a.V(jVar, jVar.f125976b, jVar.f125978d));
    }
}
