package em2;

import com.garmin.device.pairing.PairingException;
import lm2.f;

/* JADX INFO: loaded from: classes11.dex */
public class c implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f.a f64636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f64637b;

    public c(d dVar, f.a aVar) {
        this.f64637b = dVar;
        this.f64636a = aVar;
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
        this.f64637b.f64638a.debug("Save to db onComplete:" + cVar);
        com.garmin.android.library.backgroundtaskmanagement.b.c cVar2 = com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
        f.a aVar = this.f64636a;
        if (cVar2 == cVar) {
            aVar.a();
        } else {
            aVar.onFailure(new PairingException(yl2.e.NETWORK));
        }
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
    }
}
