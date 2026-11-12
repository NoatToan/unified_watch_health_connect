package bd0;

import android.content.DialogInterface;
import android.content.Intent;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class l implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.c f17589b;

    public /* synthetic */ l(com.garmin.android.apps.connectmobile.c cVar, int i14) {
        this.f17588a = i14;
        this.f17589b = cVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        switch (this.f17588a) {
            case 0:
                dialogInterface.dismiss();
                this.f17589b.finish();
                break;
            case 1:
                dialogInterface.dismiss();
                this.f17589b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                break;
            case 2:
                dialogInterface.dismiss();
                this.f17589b.finish();
                break;
            case 3:
                dialogInterface.dismiss();
                j22.b.f96736a.getClass();
                j22.b.r(this.f17589b);
                break;
            default:
                dialogInterface.dismiss();
                j22.b bVar = j22.b.f96736a;
                j22.g gVar = j22.g.f96765j;
                bVar.getClass();
                j22.b.u(this.f17589b, 3, gVar);
                break;
        }
    }
}
