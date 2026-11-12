package jy0;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class w implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f101835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f101836b;

    public /* synthetic */ w(e23.a aVar, int i14) {
        this.f101835a = i14;
        this.f101836b = aVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i14 = this.f101835a;
        e23.a aVar = this.f101836b;
        switch (i14) {
            case 0:
                aVar.invoke();
                break;
            case 1:
                aVar.invoke();
                break;
            default:
                int i15 = com.garmin.android.library.mobileauth.ui.a.f50411l;
                aVar.invoke();
                break;
        }
    }
}
