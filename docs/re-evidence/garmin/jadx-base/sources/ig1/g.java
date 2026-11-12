package ig1;

import android.content.DialogInterface;
import c22.l3;
import c22.m3;

/* JADX INFO: loaded from: classes10.dex */
public class g implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CharSequence[] f93319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f93320b;

    public g(h hVar, CharSequence[] charSequenceArr) {
        this.f93320b = hVar;
        this.f93319a = charSequenceArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        double d14;
        String str = (String) this.f93319a[i14];
        h hVar = this.f93320b;
        hVar.f93324g.setButtonRightLabel(str);
        double d15 = h.f93330j[i14];
        m3 m3VarR = h.r();
        l3.f23124b.getClass();
        double dH = l3.a.h(d15, m3VarR);
        com.garmin.android.apps.connectmobile.devices.model.f fVar = (com.garmin.android.apps.connectmobile.devices.model.f) hVar.f70344b;
        fVar.getClass();
        m3 m3VarP0 = com.garmin.android.apps.connectmobile.devices.model.f.p0();
        double dH2 = l3.a.h(1.0d, m3VarP0);
        m3 m3Var = m3.METER;
        double dG = l3.a.g(5.0d, m3VarP0, m3Var);
        double dG2 = l3.a.g(1.0d, m3VarP0, m3Var);
        if (dH >= dH2 && dH <= dG) {
            if (((int) dH) < ((int) dG)) {
                d14 = m3VarP0 == m3.MILE ? 1609.344d : 1000.0d;
            } else {
                d14 = m3VarP0 == m3.MILE ? 8046.75d : 5000.0d;
            }
            dG2 = d14;
        }
        fVar.y1("autoLapDistanceInMeters", Double.valueOf(dG2));
        dialogInterface.dismiss();
        hVar.p();
    }
}
