package a61;

import android.view.View;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class y implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.b f1695b;

    public /* synthetic */ y(com.garmin.android.apps.connectmobile.performance.b bVar, int i14) {
        this.f1694a = i14;
        this.f1695b = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14 = this.f1694a;
        com.garmin.android.apps.connectmobile.performance.b bVar = this.f1695b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.performance.b.a aVar = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                view2.setSelected(!view2.isSelected());
                bVar.f39859f.f130242d.j(Boolean.valueOf(view2.isSelected()));
                break;
            default:
                bVar.f39855b.I8(com.garmin.android.apps.connectmobile.performance.a.c.f39832a);
                break;
        }
    }
}
