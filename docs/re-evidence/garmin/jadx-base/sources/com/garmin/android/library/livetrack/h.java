package com.garmin.android.library.livetrack;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import e23.p;
import o13.q;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import wd2.g1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lo13/p;", "Lcom/garmin/android/library/livetrack/LivetrackService;", "Landroid/content/ServiceConnection;", "<anonymous>", "(Lo53/b0;)Lo13/p;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.LivetrackServiceController$bindService$2", f = "LivetrackServiceController.kt", l = {295}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements p<b0, t13.d<? super o13.p<? extends LivetrackService, ? extends ServiceConnection>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f50222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f50223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Intent f50224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f50225d;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/library/livetrack/h$a", "Landroid/content/ServiceConnection;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g1 f50226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t13.d<o13.p<LivetrackService, ? extends ServiceConnection>> f50227b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(g1 g1Var, t13.d<? super o13.p<LivetrackService, ? extends ServiceConnection>> dVar) {
            this.f50226a = g1Var;
            this.f50227b = dVar;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.f50226a.f184471c.debug("onServiceConnected");
            LivetrackService.b bVar = iBinder instanceof LivetrackService.b ? (LivetrackService.b) iBinder : null;
            LivetrackService livetrackService = bVar != null ? LivetrackService.this : null;
            o13.p pVar = livetrackService != null ? new o13.p(livetrackService, this) : null;
            int i14 = q.f128596b;
            this.f50227b.resumeWith(pVar);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            this.f50226a.f184471c.error("onServiceDisconnected");
            int i14 = q.f128596b;
            this.f50227b.resumeWith(null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, Intent intent, g1 g1Var, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f50223b = context;
        this.f50224c = intent;
        this.f50225d = g1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f50223b, this.f50224c, this.f50225d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super o13.p<? extends LivetrackService, ? extends ServiceConnection>> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f50222a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        this.f50222a = 1;
        t13.i iVar = new t13.i(u13.f.b(this));
        this.f50223b.bindService(this.f50224c, new a(this.f50225d, iVar), 1);
        Object objA = iVar.a();
        return objA == aVar ? aVar : objA;
    }
}
