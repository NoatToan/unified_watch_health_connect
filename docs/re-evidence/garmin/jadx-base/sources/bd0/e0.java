package bd0;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.connectiq.requests.deeplinking.ScheduledRTSDeeplinkBroadcastReceiver;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.device.pairing.PairingException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import o53.e1;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import retrofit2.HttpException;
import zb0.u0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lbd0/e0;", "Lim2/c;", "Ldm2/e$a;", "Led0/l;", "instance", "<init>", "(Led0/l;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e0 extends im2.c implements dm2.e.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f17558i = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Logger f17559g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u53.d f17560h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.devices.setup.GCMPairingServerDelegate$registerDevice$job$1", f = "GCMPairingServerDelegate.kt", l = {76}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f17561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f17562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ byte[] f17563c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ lm2.i.b<vm2.g> f17564d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(byte[] bArr, lm2.i.b<vm2.g> bVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f17563c = bArr;
            this.f17564d = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = new b(this.f17563c, this.f17564d, dVar);
            bVar.f17562b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object objM;
            o53.b0 b0Var = (o53.b0) this.f17562b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f17561a;
            if (i14 == 0) {
                o13.r.b(obj);
                pc0.j jVarA = pc0.j.a.a(pc0.j.f137223i);
                this.f17562b = b0Var;
                this.f17561a = 1;
                objM = jVarA.m(this.f17563c, this);
                if (objM == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                objM = ((o13.q) obj).f128597a;
            }
            int i15 = o13.q.f128596b;
            boolean z14 = objM instanceof o13.q.b;
            lm2.i.b<vm2.g> bVar = this.f17564d;
            if (!z14) {
                boolean zBooleanValue = ((Boolean) objM).booleanValue();
                if (o53.c0.g(b0Var)) {
                    bVar.a(new vm2.g(false, zBooleanValue));
                }
            }
            Throwable thB = o13.q.b(objM);
            if (thB != null && o53.c0.g(b0Var)) {
                if ((thB instanceof HttpException ? (HttpException) thB : null) != null) {
                    bVar.onFailure(new PairingException(yl2.e.NETWORK));
                } else {
                    bVar.onFailure(thB);
                }
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public e0(ed0.l lVar) {
        super(lVar);
        int i14 = gt2.c.f79010a;
        this.f17559g = gt2.b.f79005a.h("GCMPairingServerDelegate");
        x53.c cVar = s0.f129406a;
        this.f17560h = zl.a.e("GCMPairingServerDelegate", x53.b.f189152a.plus(ge1.b.h()));
    }

    @Override // dm2.e.a
    public final void a() {
        com.garmin.android.apps.connectmobile.audioprompts.b.f30221d.getClass();
        com.garmin.android.apps.connectmobile.audioprompts.b.d(com.garmin.android.apps.connectmobile.audioprompts.b.a.a(), null, null, 0L, 15);
    }

    @Override // im2.c
    /* JADX INFO: renamed from: d, reason: from getter */
    public final u53.d getF94219c() {
        return this.f17560h;
    }

    @Override // im2.c
    public final String g() {
        return String.valueOf(!com.garmin.android.apps.connectmobile.l.g().c());
    }

    @Override // im2.c
    public final void j(long j8, Collection<String> collection) {
        collection.getClass();
        this.f17559g.info("onDeviceRemoved - " + j8 + " macAddresses: " + collection);
        lc0.i iVar = (lc0.i) KoinJavaComponent.get$default(lc0.i.class, null, null, 6, null);
        Context context = iVar.f111940a;
        f12.l lVar = iVar.f111941b;
        lVar.M0(j8, false);
        if (lVar.C3() == j8) {
            lVar.g2(-1L);
        }
        if (lVar.N4() == j8) {
            lVar.M();
        }
        ed0.a.k("RemoveDevicePostActionsUseCase");
        Collection<String> collection2 = collection;
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            wb2.y.a().f184213b.remove((String) it.next());
        }
        cu0.g gVar = cu0.g.f55579a;
        f12.l.f68084a.getClass();
        int i14 = 1;
        f12.l.a.a().c4(j8, new gg1.k(null, null, 1, null));
        GCMSettingManager.c(j8);
        e1 e1Var = e1.f129333a;
        x53.c cVar = s0.f129406a;
        ge1.b.T(e1Var, x53.b.f189152a, null, new cu0.f(j8, null), 2);
        fd0.d dVar = fd0.d.LIVE_EVENT_SHARING;
        if (j8 == GCMSettingManager.r(dVar, null)) {
            a2 a2Var = a2.SETTINGS;
            i2.f36769a.getClass();
            i2.a.p(a2Var, "LiveEventSharingUtil", "deviceRemoved() Device selected for live event sharing is being removed. Clearing live event sharing session.");
            f12.l.a.a().z1();
            GCMSettingManager.J(dVar, null, -1L);
        }
        com.garmin.android.apps.connectmobile.audioprompts.b.f30221d.getClass();
        com.garmin.android.apps.connectmobile.audioprompts.b bVarA = com.garmin.android.apps.connectmobile.audioprompts.b.a.a();
        bVarA.getClass();
        bVarA.b(new com.google.android.exoplayer2.audio.d(bVarA, j8, i14));
        com.garmin.android.apps.connectmobile.util.location.a.f47272a.getClass();
        com.garmin.android.apps.connectmobile.util.location.a.b(null, j8);
        Set<String> setS1 = f12.l.a.a().S1();
        if (setS1.contains(String.valueOf(j8))) {
            setS1.remove(String.valueOf(j8));
            f12.l.a.a().T(setS1);
        }
        if (GCMSettingManager.z(j8)) {
            GCMSettingManager.T(j8, false);
        }
        bo1.a.a().getClass();
        bo1.a.b();
        iVar.f111943d.d(j8);
        ScheduledRTSDeeplinkBroadcastReceiver.f31944b.getClass();
        ScheduledRTSDeeplinkBroadcastReceiver.a.b().info("Cancel both scheduled and shown notifications for " + j8);
        Object systemService = context.getApplicationContext().getSystemService("alarm");
        systemService.getClass();
        ((AlarmManager) systemService).cancel(PendingIntent.getBroadcast(context.getApplicationContext(), 0, ScheduledRTSDeeplinkBroadcastReceiver.a.a(context, j8), 67108864));
        sz0.f.f161394a.getClass();
        sz0.f.a.a((int) j8, context);
        Iterator<T> it3 = collection2.iterator();
        while (it3.hasNext()) {
            iVar.f111944e.i((String) it3.next());
        }
        ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new lc0.j(iVar, j8, null), 3);
        com.airbnb.lottie.animation.keyframe.a.o(ue.i0.f170088a, context).e("SubscriptionPollingWork_" + j8);
        iVar.f111942c.b(j8);
    }

    @Override // im2.c
    public final vm2.b k(lm2.i.a aVar, lm2.i.b<vm2.g> bVar) {
        aVar.getClass();
        if (u0.b(aVar.f()) != u0.L5) {
            return super.k(aVar, bVar);
        }
        byte[] f197838b = aVar.getF197838b();
        if (f197838b != null) {
            return new e(ge1.b.T(this.f17560h, null, null, new b(f197838b, bVar, null), 3), 1);
        }
        vb.h.s("Device XML must be supplied to register");
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lbd0/e0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
