package ci2;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class h implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f27699b;

    public /* synthetic */ h(l lVar, int i14) {
        this.f27698a = i14;
        this.f27699b = lVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        switch (this.f27698a) {
            case 0:
                this.f27699b.e(false, null);
                break;
            case 1:
                l lVar = this.f27699b;
                lVar.getClass();
                lVar.e(false, null);
                break;
            default:
                l lVar2 = this.f27699b;
                lVar2.getClass();
                dialogInterface.dismiss();
                lVar2.d(false, null);
                break;
        }
    }
}
