package em2;

import lm2.f;

/* JADX INFO: loaded from: classes11.dex */
public class b implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f.a f64635a;

    public b(d dVar, f.a aVar) {
        this.f64635a = aVar;
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
        f.a aVar = this.f64635a;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final /* bridge */ /* synthetic */ void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Void r14) {
    }
}
