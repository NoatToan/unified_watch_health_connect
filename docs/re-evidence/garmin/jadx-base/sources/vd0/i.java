package vd0;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class i implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f177289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f177290b;

    public /* synthetic */ i(p3.p1 p1Var, int i14) {
        this.f177289a = i14;
        this.f177290b = p1Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f177289a) {
            case 0:
                this.f177290b.setValue(Boolean.FALSE);
                break;
            case 1:
                this.f177290b.setValue(Boolean.FALSE);
                break;
            case 2:
                this.f177290b.setValue(Boolean.FALSE);
                break;
            default:
                this.f177290b.setValue(Boolean.FALSE);
                break;
        }
    }
}
