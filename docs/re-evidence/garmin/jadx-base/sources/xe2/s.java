package xe2;

import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class s implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f190547b;

    public /* synthetic */ s(y yVar, int i14) {
        this.f190546a = i14;
        this.f190547b = yVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        switch (this.f190546a) {
            case 0:
                this.f190547b.u6().w2();
                break;
            case 1:
                this.f190547b.u6().y0();
                break;
            default:
                this.f190547b.u6().D3();
                break;
        }
    }
}
