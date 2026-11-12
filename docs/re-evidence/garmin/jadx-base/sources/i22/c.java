package i22;

import android.app.NotificationManager;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.util.location.ConnectedGPSService;
import e23.p;
import java.util.List;
import java.util.Set;
import o13.r;
import o13.t;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import v13.i;
import vb.h;
import z6.o;
import z6.q;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.util.location.ConnectedGPSService$updateForegroundNotification$1", f = "ConnectedGPSService.kt", l = {197}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f87387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConnectedGPSService f87388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set<Long> f87389c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ConnectedGPSService connectedGPSService, Set<Long> set, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f87388b = connectedGPSService;
        this.f87389c = set;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f87388b, this.f87389c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f87387a;
        ConnectedGPSService connectedGPSService = this.f87388b;
        if (i14 == 0) {
            r.b(obj);
            rd2.f fVarA = rd2.f.a();
            fVarA.getClass();
            this.f87387a = 1;
            obj = ConnectedGPSService.a(connectedGPSService, this.f87389c, fVarA, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        String string = connectedGPSService.getString(R.string.msg_start_activity_gps, h0.k0((List) obj, ", ", null, null, null, 62));
        t tVar = connectedGPSService.f47261d;
        string.getClass();
        q qVar = (q) tVar.getValue();
        qVar.getClass();
        qVar.f202684f = q.e(string);
        o oVar = new o();
        oVar.f202664e = q.e(string);
        qVar.l(oVar);
        Object systemService = connectedGPSService.getSystemService("notification");
        NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
        if (notificationManager != null) {
            notificationManager.notify(27, ((q) tVar.getValue()).c());
        }
        return Unit.INSTANCE;
    }
}
