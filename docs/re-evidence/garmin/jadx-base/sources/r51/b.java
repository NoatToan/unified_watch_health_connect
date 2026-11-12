package r51;

import android.view.View;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150476a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d.a f150477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.pacepro.data.dto.b f150478c;

    public /* synthetic */ b(com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar, d.a aVar) {
        this.f150478c = bVar;
        this.f150477b = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14 = this.f150476a;
        com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar = this.f150478c;
        d.a aVar = this.f150477b;
        switch (i14) {
            case 0:
                int i15 = c.f150479f;
                Long l14 = bVar.f39764a;
                if (l14 != null && aVar != null) {
                    aVar.O1(l14.longValue());
                    break;
                }
                break;
            default:
                int i16 = c.f150479f;
                if (aVar != null) {
                    aVar.d0(bVar);
                }
                break;
        }
    }

    public /* synthetic */ b(d.a aVar, com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar) {
        this.f150477b = aVar;
        this.f150478c = bVar;
    }
}
