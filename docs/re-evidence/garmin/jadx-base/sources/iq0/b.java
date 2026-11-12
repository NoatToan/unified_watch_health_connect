package iq0;

import l20.r;
import o13.q;
import o53.j;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Liq0/b;", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "Ll20/r;", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j<r> f94735a;

    /* JADX WARN: Multi-variable type inference failed */
    public b(j<? super r> jVar) {
        this.f94735a = jVar;
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
        cVar.getClass();
        j<r> jVar = this.f94735a;
        if (jVar.isActive() && cVar != com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
            int i14 = q.f128596b;
            jVar.resumeWith(null);
        }
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, r rVar) {
        r rVar2 = rVar;
        eVar.getClass();
        rVar2.getClass();
        int i14 = q.f128596b;
        this.f94735a.resumeWith(rVar2);
    }
}
