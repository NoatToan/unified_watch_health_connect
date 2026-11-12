package y10;

import android.os.CountDownTimer;
import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.io.IOException;
import java.util.List;
import okhttp3.Response;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ly10/b;", "Landroidx/lifecycle/u1;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends u1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f193776f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p10.a f193777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y0<l0> f193778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f193779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y10.a f193780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CountDownTimerC3616b f193781e;

    /* JADX INFO: renamed from: y10.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"y10/b$b", "Landroid/os/CountDownTimer;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CountDownTimerC3616b extends CountDownTimer {
        public CountDownTimerC3616b() {
            super(15000L, 1000L);
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            a2 a2Var = a2.GENERAL;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "ConnectIQAppDetailsViewModel", "Triggered Sync timeout...");
            y0<l0> y0Var = b.this.f193778b;
            if (y0Var != null) {
                y0Var.j(new l0(g0.APP_INSTALLED, null, 2, null));
            } else {
                p005kotlin.jvm.internal.s.m("connectIQLiveData");
                throw null;
            }
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j8) {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [y10.a] */
    public b() {
        p10.a.f134883c.getClass();
        this.f193777a = new p10.a();
        this.f193780d = new gb2.a.e() { // from class: y10.a
            @Override // gb2.a.e
            public final void b(gb2.a.d dVar) {
                int i14 = b.f193776f;
                if (dVar != null) {
                    long j8 = dVar.f76769a;
                    b bVar = this.f193769a;
                    Long l14 = bVar.f193779c;
                    if (l14 == null || j8 != l14.longValue()) {
                        a2 a2Var = a2.GENERAL;
                        String strF = androidx.room.a0.f(dVar.f76769a, "Ignoring other device syncing unitId[", "]");
                        i2.f36769a.getClass();
                        i2.a.b(a2Var, "ConnectIQAppDetailsViewModel", strF);
                        return;
                    }
                    int i15 = dVar.f76774f;
                    if (i15 == 1 || i15 == 2) {
                        a2 a2Var2 = a2.GENERAL;
                        String strH = am.j.h(i15, "Sync State changed ");
                        i2.f36769a.getClass();
                        i2.a.b(a2Var2, "ConnectIQAppDetailsViewModel", strH);
                        bVar.f193781e.cancel();
                        return;
                    }
                    if (i15 != 3 && i15 != 4) {
                        a2 a2Var3 = a2.GENERAL;
                        String strH2 = am.j.h(i15, "Sync State changed ");
                        i2.f36769a.getClass();
                        i2.a.b(a2Var3, "ConnectIQAppDetailsViewModel", strH2);
                        return;
                    }
                    a2 a2Var4 = a2.GENERAL;
                    String strG = com.airbnb.lottie.animation.keyframe.a.g("Sync Finished success[", "]", i15 == 3);
                    i2.f36769a.getClass();
                    i2.a.b(a2Var4, "ConnectIQAppDetailsViewModel", strG);
                    y0<l0> y0Var = bVar.f193778b;
                    if (y0Var != null) {
                        y0Var.j(new l0(g0.APP_INSTALLED, null, 2, null));
                    } else {
                        p005kotlin.jvm.internal.s.m("connectIQLiveData");
                        throw null;
                    }
                }
            }
        };
        this.f193781e = new CountDownTimerC3616b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object x4(b bVar, q10.a aVar, v13.c cVar) {
        d dVar;
        List list;
        bVar.getClass();
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f193807c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f193807c = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(bVar, cVar);
            }
        } else {
            dVar = new d(bVar, cVar);
        }
        Object objAwait = dVar.f193805a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f193807c;
        if (i15 == 0) {
            o13.r.b(objAwait);
            o53.i0<c83.a0<List<q10.b>>> i0VarD = bVar.f193777a.a().d(aVar);
            dVar.f193807c = 1;
            objAwait = i0VarD.await(dVar);
            if (objAwait == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objAwait);
        }
        c83.a0 a0Var = (c83.a0) objAwait;
        Response response = a0Var.f25745a;
        return (!response.isSuccessful() || (list = (List) a0Var.f25746b) == null) ? new v2.a(new IOException("Error occurred during posting apps install!"), new Integer(response.code()), null, 4, null) : new v2.b(list, response.code(), null, null, 12, null);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ly10/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "SYNC_TRIGGER_TIMEOUT", "J", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
