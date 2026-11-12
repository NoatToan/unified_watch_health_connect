package zb0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lzb0/f1;", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "Lcom/garmin/android/apps/connectmobile/smartscale/model/a;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f1 implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<com.garmin.android.apps.connectmobile.smartscale.model.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c1 f203482a;

    public f1(c1 c1Var) {
        this.f203482a = c1Var;
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
        cVar.getClass();
        int i14 = c1.f203441z;
        c1 c1Var = this.f203482a;
        c1Var.u6();
        if (cVar != com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
            c1Var.O4(cVar.name());
        }
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, com.garmin.android.apps.connectmobile.smartscale.model.a aVar) {
        com.garmin.android.apps.connectmobile.smartscale.model.a aVar2 = aVar;
        eVar.getClass();
        aVar2.getClass();
        boolean zF = aVar2.f();
        c1 c1Var = this.f203482a;
        if (zF) {
            c1Var.x5();
        } else if (aVar2.d()) {
            c1Var.z1();
        } else {
            c1Var.O4(aVar2.b().name());
        }
    }
}
