package po;

import com.garmin.android.apps.connectmobile.help.HelpActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f138826b;

    public /* synthetic */ c(h hVar, int i14) {
        this.f138825a = i14;
        this.f138826b = hVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f138825a;
        h hVar = this.f138826b;
        switch (i14) {
            case 0:
                int i15 = h.E1;
                hVar.w7();
                break;
            default:
                int i16 = h.E1;
                hVar.w7();
                xn.j.a aVar = xn.j.f191609g;
                String str = hVar.A1;
                aVar.getClass();
                HelpActivity.da(hVar.requireContext(), ro0.l.FIVE_HZ_DATA_RECORDING, null, xn.j.a.a(str));
                break;
        }
        return Unit.INSTANCE;
    }
}
