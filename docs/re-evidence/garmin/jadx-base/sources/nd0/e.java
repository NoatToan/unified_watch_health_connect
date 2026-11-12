package nd0;

import android.content.Context;
import c22.o;
import com.garmin.android.apps.connectmobile.smartscale.operations.SetDeviceShortNameRequest;
import java.util.LinkedHashMap;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import ue.i0;
import ue.l;
import ue.x;
import ve.t0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnd0/e;", "Lw90/a;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements w90.a {
    @Override // w90.a
    public final void a(long j8, String str) {
        str.getClass();
        x.a aVar = new x.a((Class<? extends androidx.work.d>) SetDeviceShortNameRequest.class);
        androidx.work.c.a aVar2 = new androidx.work.c.a();
        LinkedHashMap linkedHashMap = aVar2.f11467a;
        linkedHashMap.put("extra_scale_name", str);
        linkedHashMap.put("extra_device_id", Long.valueOf(j8));
        aVar.f(aVar2.a());
        SetDeviceShortNameRequest.a aVar3 = SetDeviceShortNameRequest.f44475g;
        x xVarA = aVar.a();
        aVar3.getClass();
        SetDeviceShortNameRequest.f44476h.debug("enqueueWork: ");
        Context contextC = ((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).c();
        i0.a aVar4 = i0.f170088a;
        Context applicationContext = contextC.getApplicationContext();
        applicationContext.getClass();
        aVar4.getClass();
        t0 t0VarG = t0.g(applicationContext);
        t0VarG.getClass();
        t0VarG.a("SetDeviceShortNameWorker", l.REPLACE, xVarA).a();
    }
}
