package vo2;

import com.garmin.feature.garminpay.providers.gpay.sync.NewDeviceSyncQueue;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class s<T> implements cs2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o53.j<Unit> f179205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewDeviceSyncQueue f179206b;

    /* JADX WARN: Multi-variable type inference failed */
    public s(o53.j<? super Unit> jVar, NewDeviceSyncQueue newDeviceSyncQueue) {
        this.f179205a = jVar;
        this.f179206b = newDeviceSyncQueue;
    }

    @Override // cs2.a
    public final void accept(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        o53.j<Unit> jVar = this.f179205a;
        if (zBooleanValue) {
            int i14 = o13.q.f128596b;
            jVar.resumeWith(Unit.INSTANCE);
        } else {
            this.f179206b.f51331e.debug("unReserveNFC: failed to unReserve the nfc");
            int i15 = o13.q.f128596b;
            jVar.resumeWith(Unit.INSTANCE);
        }
    }
}
