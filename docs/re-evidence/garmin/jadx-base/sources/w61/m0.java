package w61;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lw61/m0;", "Lcu1/n;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m0 extends cu1.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t13.d<com.garmin.android.library.backgroundtaskmanagement.b.c> f183223a;

    /* JADX WARN: Multi-variable type inference failed */
    public m0(t13.d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) {
        this.f183223a = dVar;
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
        cVar.getClass();
        int i14 = o13.q.f128596b;
        this.f183223a.resumeWith(cVar);
    }
}
