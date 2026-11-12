package c32;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f24104b;

    public /* synthetic */ b(e23.a aVar, int i14) {
        this.f24103a = i14;
        this.f24104b = aVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i14 = this.f24103a;
        e23.a aVar = this.f24104b;
        switch (i14) {
            case 0:
                if (aVar != null) {
                    aVar.invoke();
                }
                break;
            default:
                ey2.c cVar = ey2.c.f67454a;
                aVar.invoke();
                break;
        }
    }
}
