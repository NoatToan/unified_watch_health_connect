package dr0;

import android.os.Handler;
import android.os.Looper;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDISmartProto;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldr0/d;", "Lwm2/b;", "instant-input_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements wm2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f60831a;

    public d(f fVar) {
        this.f60831a = fVar;
    }

    @Override // wm2.b
    public final void onResponseFailed(int i14) {
        i2.a.c(i2.f36769a, "InstantInputBizManager", "cancelInstantInput()onResponseFailed()");
        new Handler(Looper.getMainLooper()).post(new c(this.f60831a, 0));
    }

    @Override // wm2.b
    public final void onResponseReceived(int i14, GDISmartProto.Smart smart) {
        smart.getClass();
        new Handler(Looper.getMainLooper()).post(new b(smart, this.f60831a, 0));
    }
}
