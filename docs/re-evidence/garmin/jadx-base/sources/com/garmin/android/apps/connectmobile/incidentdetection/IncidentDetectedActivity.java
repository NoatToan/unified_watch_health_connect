package com.garmin.android.apps.connectmobile.incidentdetection;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.h1;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y1;
import b.g;
import c32.k;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.incidentdetection.service.WellnessIncidentDetectionService;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import cq0.l;
import cq0.x;
import cq0.y;
import e23.p;
import java.util.Iterator;
import o13.m;
import o13.r;
import o13.t;
import o53.b0;
import o53.f0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import r53.j;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/IncidentDetectedActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "b", "a", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class IncidentDetectedActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f36821g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Messenger f36822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f36823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f36824c = m.b(new com.google.accompanist.drawablepainter.a(10));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w1 f36825d = new w1(s0.f105811a.b(y.class), new e(this), new k(this, 29), new f(null, this));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Messenger f36826e = new Messenger(new b());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f36827f = new c();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/IncidentDetectedActivity$b;", "Landroid/os/Handler;", "<init>", "(Lcom/garmin/android/apps/connectmobile/incidentdetection/IncidentDetectedActivity;)V", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends Handler {

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f36829a;

            static {
                int[] iArr = new int[l.values().length];
                try {
                    iArr[l.TICKING_TIMER_INCIDENT_DETECTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[l.NOTIFYING_EMERGENCY_CONTACTS_INCIDENT_DETECTED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[l.TICKING_TIMER_I_AM_OKAY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[l.USER_CAN_CANCEL_LIVE_TRACK.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[l.NOTIFYING_EMERGENCY_CONTACTS_I_AM_OKAY.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[l.FINISHED.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f36829a = iArr;
            }
        }

        public b() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            boolean z14;
            message.getClass();
            if (message.what != 3) {
                return;
            }
            Bundle data = message.getData();
            long j8 = data.getLong("extra.device.id", -1L);
            boolean z15 = data.getBoolean("extra.is.fall.detection", false);
            IncidentDetectedActivity incidentDetectedActivity = IncidentDetectedActivity.this;
            y yVar = (y) incidentDetectedActivity.f36825d.getValue();
            yVar.f55177b = j8;
            yVar.f55178c = z15;
            l lVar = (l) l.f55158j.get(message.arg1);
            IncidentDetectedActivity.ea("IncidentDetectionService.State [" + lVar.name() + "]");
            v supportFragmentManager = incidentDetectedActivity.getSupportFragmentManager();
            supportFragmentManager.getClass();
            switch (a.f36829a[lVar.ordinal()]) {
                case 1:
                    Bundle data2 = message.getData();
                    z14 = data2 != null ? data2.getBoolean("extra.is.fall.detection", false) : false;
                    String name = com.garmin.android.apps.connectmobile.incidentdetection.d.class.getName();
                    Fragment fragmentG = supportFragmentManager.G(name);
                    if (fragmentG != null) {
                        if (fragmentG.isVisible()) {
                            ((cq0.c) fragmentG).v6(message.arg2);
                            return;
                        }
                        return;
                    }
                    com.garmin.android.apps.connectmobile.incidentdetection.d.a aVar = com.garmin.android.apps.connectmobile.incidentdetection.d.f36855d;
                    int i14 = message.arg2;
                    aVar.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putInt("NUMBER_OF_SEC_EXTRA", i14);
                    bundle.putBoolean("IS_FALL_DETECTION_EXTRA", z14);
                    com.garmin.android.apps.connectmobile.incidentdetection.d dVar = new com.garmin.android.apps.connectmobile.incidentdetection.d();
                    dVar.setArguments(bundle);
                    androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
                    aVar2.l(R.id.fragment_container, dVar, name);
                    aVar2.i();
                    aVar2.s(true, true);
                    return;
                case 2:
                    String name2 = com.garmin.android.apps.connectmobile.incidentdetection.d.class.getName();
                    Fragment fragmentG2 = supportFragmentManager.G(name2);
                    if (fragmentG2 != null) {
                        if (fragmentG2.isVisible()) {
                            ((cq0.c) fragmentG2).u6();
                            return;
                        }
                        return;
                    } else {
                        Fragment fragmentInstantiate = supportFragmentManager.P().instantiate(incidentDetectedActivity.getClassLoader(), com.garmin.android.apps.connectmobile.incidentdetection.d.class.getName());
                        androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager);
                        aVar3.l(R.id.fragment_container, fragmentInstantiate, name2);
                        aVar3.i();
                        aVar3.s(true, true);
                        return;
                    }
                case 3:
                    String name3 = com.garmin.android.apps.connectmobile.incidentdetection.e.class.getName();
                    Fragment fragmentG3 = supportFragmentManager.G(name3);
                    if (fragmentG3 != null) {
                        if (fragmentG3.isVisible()) {
                            ((cq0.c) fragmentG3).v6(message.arg2);
                            return;
                        }
                        return;
                    } else {
                        Fragment fragmentInstantiate2 = supportFragmentManager.P().instantiate(incidentDetectedActivity.getClassLoader(), com.garmin.android.apps.connectmobile.incidentdetection.e.class.getName());
                        androidx.fragment.app.a aVar4 = new androidx.fragment.app.a(supportFragmentManager);
                        aVar4.l(R.id.fragment_container, fragmentInstantiate2, name3);
                        aVar4.i();
                        aVar4.s(true, true);
                        return;
                    }
                case 4:
                    Bundle data3 = message.getData();
                    z14 = data3 != null ? data3.getBoolean("extra.is.fall.detection", false) : false;
                    String name4 = com.garmin.android.apps.connectmobile.incidentdetection.e.class.getName();
                    Fragment fragmentG4 = supportFragmentManager.G(name4);
                    if (fragmentG4 != null) {
                        if (fragmentG4.isVisible()) {
                            ((cq0.c) fragmentG4).w6();
                            return;
                        }
                        return;
                    }
                    com.garmin.android.apps.connectmobile.incidentdetection.e.f36857e.getClass();
                    com.garmin.android.apps.connectmobile.incidentdetection.e eVar = new com.garmin.android.apps.connectmobile.incidentdetection.e();
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("USER_CAN_CANCEL", true);
                    bundle2.putBoolean("IS_FALL_DETECTION_EXTRA", z14);
                    eVar.setArguments(bundle2);
                    androidx.fragment.app.a aVar5 = new androidx.fragment.app.a(supportFragmentManager);
                    aVar5.l(R.id.fragment_container, eVar, name4);
                    aVar5.i();
                    aVar5.s(true, true);
                    return;
                case 5:
                    String name5 = com.garmin.android.apps.connectmobile.incidentdetection.e.class.getName();
                    Fragment fragmentG5 = supportFragmentManager.G(name5);
                    if (fragmentG5 != null) {
                        if (fragmentG5.isVisible()) {
                            ((cq0.c) fragmentG5).u6();
                            return;
                        }
                        return;
                    } else {
                        Fragment fragmentInstantiate3 = supportFragmentManager.P().instantiate(incidentDetectedActivity.getClassLoader(), com.garmin.android.apps.connectmobile.incidentdetection.e.class.getName());
                        androidx.fragment.app.a aVar6 = new androidx.fragment.app.a(supportFragmentManager);
                        aVar6.l(R.id.fragment_container, fragmentInstantiate3, name5);
                        aVar6.i();
                        aVar6.s(true, true);
                        return;
                    }
                case 6:
                    try {
                        Bundle data4 = message.getData();
                        z14 = data4 != null ? data4.getBoolean("extra.is.fall.detection", false) : false;
                        com.garmin.android.apps.connectmobile.incidentdetection.c.a aVar7 = com.garmin.android.apps.connectmobile.incidentdetection.c.f36851e;
                        int i15 = message.arg2;
                        aVar7.getClass();
                        com.garmin.android.apps.connectmobile.incidentdetection.c cVar = new com.garmin.android.apps.connectmobile.incidentdetection.c();
                        Bundle bundle3 = new Bundle(2);
                        bundle3.putInt("arg1", i15);
                        bundle3.putBoolean("IS_FALL_DETECTION_EXTRA", z14);
                        cVar.setArguments(bundle3);
                        androidx.fragment.app.a aVar8 = new androidx.fragment.app.a(supportFragmentManager);
                        aVar8.l(R.id.fragment_container, cVar, null);
                        aVar8.i();
                        aVar8.s(true, true);
                        return;
                    } finally {
                        incidentDetectedActivity.ca();
                    }
                default:
                    super.handleMessage(message);
                    return;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/incidentdetection/IncidentDetectedActivity$c", "Landroid/content/ServiceConnection;", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements ServiceConnection {
        public c() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            componentName.getClass();
            iBinder.getClass();
            Messenger messenger = new Messenger(iBinder);
            IncidentDetectedActivity incidentDetectedActivity = IncidentDetectedActivity.this;
            incidentDetectedActivity.f36822a = messenger;
            try {
                Message messageObtain = Message.obtain((Handler) null, 1);
                messageObtain.replyTo = incidentDetectedActivity.f36826e;
                Messenger messenger2 = incidentDetectedActivity.f36822a;
                messenger2.getClass();
                messenger2.send(messageObtain);
            } catch (RemoteException unused) {
            }
            IncidentDetectedActivity.ea("onServiceConnected");
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            componentName.getClass();
            IncidentDetectedActivity.this.f36822a = null;
            IncidentDetectedActivity.ea("onServiceDisconnected");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.incidentdetection.IncidentDetectedActivity$onCreate$1", f = "IncidentDetectedActivity.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 2)
    public static final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f36831a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.incidentdetection.IncidentDetectedActivity$onCreate$1$1", f = "IncidentDetectedActivity.kt", l = {190}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f36833a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IncidentDetectedActivity f36834b;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.incidentdetection.IncidentDetectedActivity$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C0656a<T> implements j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ IncidentDetectedActivity f36835a;

                public C0656a(IncidentDetectedActivity incidentDetectedActivity) {
                    this.f36835a = incidentDetectedActivity;
                }

                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    long jLongValue = ((Number) obj).longValue();
                    int i14 = IncidentDetectedActivity.f36821g;
                    IncidentDetectedActivity incidentDetectedActivity = this.f36835a;
                    incidentDetectedActivity.getClass();
                    if (((cq0.j) KoinJavaComponent.get$default(cq0.j.class, null, null, 6, null)).t(incidentDetectedActivity, jLongValue)) {
                        incidentDetectedActivity.finish();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(IncidentDetectedActivity incidentDetectedActivity, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f36834b = incidentDetectedActivity;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f36834b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to com.garmin.android.apps.connectmobile.incidentdetection.IncidentDetectedActivity$d$a for r4v1 'this'  t13.d
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // v13.a
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    u13.a r0 = u13.a.COROUTINE_SUSPENDED
                    int r1 = r4.f36833a
                    r2 = 1
                    if (r1 == 0) goto L14
                    if (r1 == r2) goto L10
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    vb.h.z(r5)
                Le:
                    r5 = 0
                    return r5
                L10:
                    o13.r.b(r5)
                    goto L33
                L14:
                    o13.r.b(r5)
                    com.garmin.android.apps.connectmobile.incidentdetection.IncidentDetectedActivity r5 = r4.f36834b
                    androidx.lifecycle.w1 r1 = r5.f36825d
                    java.lang.Object r1 = r1.getValue()
                    cq0.y r1 = (cq0.y) r1
                    r53.a2 r1 = r1.f55182g
                    com.garmin.android.apps.connectmobile.incidentdetection.IncidentDetectedActivity$d$a$a r3 = new com.garmin.android.apps.connectmobile.incidentdetection.IncidentDetectedActivity$d$a$a
                    r3.<init>(r5)
                    r4.f36833a = r2
                    r53.d2<T> r5 = r1.f150526a
                    java.lang.Object r5 = r5.collect(r3, r4)
                    if (r5 != r0) goto L33
                    return r0
                L33:
                    o2.c.f()
                    goto Le
                */
                throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.incidentdetection.IncidentDetectedActivity.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return IncidentDetectedActivity.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f36831a;
            if (i14 == 0) {
                r.b(obj);
                IncidentDetectedActivity incidentDetectedActivity = IncidentDetectedActivity.this;
                androidx.lifecycle.b0 f158016a = incidentDetectedActivity.getF158016a();
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
                a aVar2 = new a(incidentDetectedActivity, null);
                this.f36831a = 1;
                if (h1.a(f158016a, bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f36836a;

        public e(g gVar) {
            this.f36836a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f36836a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f36837a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f36838b;

        public f(e23.a aVar, g gVar) {
            this.f36837a = aVar;
            this.f36838b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f36837a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f36838b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    static {
        new a(null);
    }

    public static void ea(String str) {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "IncidentDetectedActivity", str);
    }

    public final void ca() {
        if (this.f36823b) {
            if (this.f36822a != null) {
                try {
                    Message messageObtain = Message.obtain((Handler) null, 2);
                    messageObtain.replyTo = this.f36826e;
                    Messenger messenger = this.f36822a;
                    messenger.getClass();
                    messenger.send(messageObtain);
                } catch (RemoteException unused) {
                }
            }
            unbindService(this.f36827f);
            this.f36823b = false;
            ea("doUnbindService");
        }
    }

    public final boolean da(Class<?> cls) {
        Object systemService = getSystemService("activity");
        systemService.getClass();
        Iterator<ActivityManager.RunningServiceInfo> it = ((ActivityManager) systemService).getRunningServices(Integer.MAX_VALUE).iterator();
        while (it.hasNext()) {
            if (cls.getName().equals(it.next().service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    public final void fa() {
        boolean zDa = da(EdgeIncidentDetectionService.class);
        da(WellnessIncidentDetectionService.class);
        Intent intent = new Intent(this, zDa ? EdgeIncidentDetectionService.class : WellnessIncidentDetectionService.class);
        intent.setAction("action.cancel.incident.from.gcm");
        startService(intent);
        y yVar = (y) this.f36825d.getValue();
        if (yVar.f55178c) {
            ge1.b.T(v1.a(yVar), null, null, new x(yVar, null), 3);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.incident_detected);
        ge1.b.T(f0.w(this), null, null, new d(null), 3);
    }

    @Override // com.garmin.android.apps.connectmobile.c, androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        ca();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        boolean zDa = da(EdgeIncidentDetectionService.class);
        da(WellnessIncidentDetectionService.class);
        bindService(new Intent(this, zDa ? EdgeIncidentDetectionService.class : WellnessIncidentDetectionService.class), this.f36827f, 1);
        this.f36823b = true;
        ea("doBindService");
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/IncidentDetectedActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "DEBUG", "Z", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
