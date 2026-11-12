package hc0;

import android.widget.Toast;
import bd0.b0;
import bd0.s;

/* JADX INFO: loaded from: classes8.dex */
public class l implements s.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f83263a;

    public l(m mVar) {
        this.f83263a = mVar;
    }

    @Override // bd0.s.c
    public final void a() {
    }

    @Override // bd0.s.c
    public final void b(b0 b0Var) {
        k.X6("Firmware update failed with reason : " + b0Var);
    }

    @Override // bd0.s.c
    public final void c(lj0.e.a aVar) {
        m mVar = this.f83263a;
        Toast.makeText(mVar.f83266d.getActivity(), "Mimic values will be reset after successful update", 1).show();
        kg1.a.f104701a.getClass();
        kg1.a.C2003a.a().n();
        Toast.makeText(mVar.f83266d.getActivity(), "If software update success, please turn-off bluetooth and then turn-on bluetooth for device registration again", 1).show();
        sd2.f fVar = mVar.f83265c.f76845a;
        fVar.getClass();
        yr1.d.d(fVar, "DevicesDashboardFragment", null);
    }
}
