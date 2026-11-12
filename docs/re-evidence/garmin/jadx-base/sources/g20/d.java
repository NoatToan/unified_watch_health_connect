package g20;

import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.contacts.details.a f75329b;

    public /* synthetic */ d(com.garmin.android.apps.connectmobile.contacts.details.a aVar, int i14) {
        this.f75328a = i14;
        this.f75329b = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14 = this.f75328a;
        com.garmin.android.apps.connectmobile.contacts.details.a aVar = this.f75329b;
        switch (i14) {
            case 0:
                int i15 = com.garmin.android.apps.connectmobile.contacts.details.a.b.f32448e;
                com.garmin.android.apps.connectmobile.contacts.details.a.i iVar = aVar.f32442a;
                if (iVar != null) {
                    iVar.Y();
                }
                break;
            case 1:
                int i16 = com.garmin.android.apps.connectmobile.contacts.details.a.c.f32453q;
                aVar.f32444c.Z1();
                break;
            default:
                int i17 = com.garmin.android.apps.connectmobile.contacts.details.a.d.f32470a;
                com.garmin.android.apps.connectmobile.contacts.details.a.e eVar = aVar.f32446e;
                if (eVar != null) {
                    eVar.C0();
                }
                break;
        }
    }
}
