package gc0;

import androidx.lifecycle.v1;
import com.garmin.android.lib.networking.exceptions.NoNetworkException;
import o53.c2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lgc0/n;", "Llm2/i$b;", "Ljava/lang/Void;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n implements lm2.i.b<Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f76900a;

    public n(l lVar) {
        this.f76900a = lVar;
    }

    @Override // lm2.i.b
    public final void a(Void r14) {
        this.f76900a.C4();
    }

    @Override // lm2.i.b
    public final void onFailure(Throwable th3) {
        th3.getClass();
        boolean z14 = th3 instanceof NoNetworkException;
        l lVar = this.f76900a;
        if (!z14) {
            lVar.f76882f.error("DevicesDashboardViewModel - ERROR in DeviceSharingUtil.reconcilePairedDevices");
            return;
        }
        lVar.f76882f.warn("DevicesDashboardViewModel - device reconcile failed due to no internet connection, retrieving devices from the local DB...");
        c2 c2Var = lVar.f76881e;
        if (c2Var != null) {
            c2Var.c(null);
        }
        lVar.f76881e = ge1.b.T(v1.a(lVar), null, null, new p(lVar, null), 3);
    }
}
