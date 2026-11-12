package gc0;

import com.garmin.android.apps.connectmobile.s2;
import zb0.g0;
import zb0.y0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f76864b;

    public /* synthetic */ g(i iVar, int i14) {
        this.f76863a = i14;
        this.f76864b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f76863a) {
            case 0:
                s2 s2Var = this.f76864b.f76872e;
                if (s2Var != null) {
                    s2Var.hideProgressOverlay();
                }
                break;
            default:
                y0 y0Var = ((g0) this.f76864b.f76868a).f203493d;
                if (y0Var != null) {
                    y0Var.t9();
                }
                break;
        }
    }
}
