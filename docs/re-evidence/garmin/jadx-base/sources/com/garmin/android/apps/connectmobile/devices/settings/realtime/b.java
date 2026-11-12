package com.garmin.android.apps.connectmobile.devices.settings.realtime;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import d53.w;
import e23.p;
import java.util.concurrent.ConcurrentHashMap;
import o13.r;
import o53.b0;
import o53.j2;
import o53.l1;
import o53.m0;
import o53.s0;
import org.apache.commons.io.IOUtils;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import sd2.f;
import t13.d;
import u53.o;
import v13.e;
import v13.i;
import vb.h;
import w3.x;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\b\tB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/settings/realtime/b;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lsd2/f;", "deviceDatabaseRecord", "<init>", "(Landroid/content/Context;Lsd2/f;)V", "a", "b", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f34358d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f34359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f34360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xw2.b f34361c;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.devices.settings.realtime.b$b, reason: collision with other inner class name */
    public interface InterfaceC0579b {
        void a();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.devices.settings.realtime.RTSSettingsInitializer$launch$1$1", f = "RTSSettingsInitializer.kt", l = {90}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f34362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l1 f34363b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f34364c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f34365d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.devices.settings.realtime.c f34366e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ xw2.d f34367f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f34368g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @e(c = "com.garmin.android.apps.connectmobile.devices.settings.realtime.RTSSettingsInitializer$launch$1$1$1$1", f = "RTSSettingsInitializer.kt", l = {90}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<b0, d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f34369a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l1 f34370b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l1 l1Var, d<? super a> dVar) {
                super(2, dVar);
                this.f34370b = l1Var;
            }

            @Override // v13.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new a(this.f34370b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f34369a;
                if (i14 == 0) {
                    r.b(obj);
                    this.f34369a = 1;
                    if (this.f34370b.P(this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(l1 l1Var, b bVar, int i14, com.garmin.android.apps.connectmobile.devices.settings.realtime.c cVar, xw2.d dVar, boolean z14, d<? super c> dVar2) {
            super(2, dVar2);
            this.f34363b = l1Var;
            this.f34364c = bVar;
            this.f34365d = i14;
            this.f34366e = cVar;
            this.f34367f = dVar;
            this.f34368g = z14;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new c(this.f34363b, this.f34364c, this.f34365d, this.f34366e, this.f34367f, this.f34368g, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f34362a;
            if (i14 == 0) {
                r.b(obj);
                l1 l1Var = this.f34363b;
                if (l1Var != null) {
                    e53.c.a aVar2 = e53.c.f63094b;
                    long jF = e53.e.f(AbstractComponentTracker.LINGERING_TIMEOUT, e53.f.MILLISECONDS);
                    a aVar3 = new a(l1Var, null);
                    this.f34362a = 1;
                    obj = j2.c(m0.e(jF), aVar3, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                com.garmin.realtimesettings.app.initialization.b bVar = com.garmin.realtimesettings.app.initialization.b.f52589a;
                b bVar2 = this.f34364c;
                Context context = bVar2.f34359a;
                m80.a.C2223a c2223a = m80.a.f117132a;
                String productNumber = bVar2.f34360b.getProductNumber();
                c2223a.getClass();
                boolean zA = m80.a.C2223a.a(productNumber);
                xw2.a aVar4 = xw2.a.NONE;
                bVar.getClass();
                com.garmin.android.apps.connectmobile.devices.settings.realtime.c cVar = this.f34366e;
                cVar.getClass();
                xw2.d dVar = this.f34367f;
                dVar.getClass();
                aVar4.getClass();
                ge1.b.T(com.garmin.realtimesettings.app.initialization.b.f52593e, null, null, new vw2.f(dVar, cVar, context, aVar4, zA, false, this.f34365d, this.f34368g, null), 3);
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            com.garmin.realtimesettings.app.initialization.b bVar3 = com.garmin.realtimesettings.app.initialization.b.f52589a;
            b bVar4 = this.f34364c;
            Context context2 = bVar4.f34359a;
            m80.a.C2223a c2223a2 = m80.a.f117132a;
            String productNumber2 = bVar4.f34360b.getProductNumber();
            c2223a2.getClass();
            boolean zA2 = m80.a.C2223a.a(productNumber2);
            xw2.a aVar5 = xw2.a.NONE;
            bVar3.getClass();
            com.garmin.android.apps.connectmobile.devices.settings.realtime.c cVar2 = this.f34366e;
            cVar2.getClass();
            xw2.d dVar2 = this.f34367f;
            dVar2.getClass();
            aVar5.getClass();
            ge1.b.T(com.garmin.realtimesettings.app.initialization.b.f52593e, null, null, new vw2.f(dVar2, cVar2, context2, aVar5, zA2, false, this.f34365d, this.f34368g, null), 3);
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f34358d = gt2.b.f79005a.h("RTS-RealTimeSettingsInitializer");
    }

    public b(Context context, f fVar) {
        context.getClass();
        this.f34359a = context;
        this.f34360b = fVar;
        this.f34361c = fVar != null ? x.v(fVar) : null;
    }

    public final void a(int i14, boolean z14, gj1.c cVar, InterfaceC0579b interfaceC0579b) {
        l1 l1VarT;
        xw2.d dVar;
        Logger logger = f34358d;
        logger.debug("launch: initializing real settings lib...");
        f fVar = this.f34360b;
        if (fVar == null) {
            return;
        }
        com.garmin.android.apps.connectmobile.devices.settings.realtime.c cVar2 = new com.garmin.android.apps.connectmobile.devices.settings.realtime.c(this.f34359a, fVar, cVar, interfaceC0579b);
        pc0.f fVar2 = pc0.f.f137206a;
        String sku = fVar.getSku();
        com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
        u53.d dVar2 = com.garmin.realtimesettings.app.initialization.b.f52593e;
        fVar2.getClass();
        dVar2.getClass();
        if (sku == null || w.J(sku) || pc0.f.f137207b.containsKey(sku)) {
            l1VarT = null;
        } else {
            ConcurrentHashMap<String, l1> concurrentHashMap = pc0.f.f137208c;
            l1VarT = concurrentHashMap.get(sku);
            if (l1VarT == null) {
                x53.c cVar3 = s0.f129406a;
                l1VarT = ge1.b.T(dVar2, x53.b.f189152a, null, new pc0.e(sku, null), 2);
                concurrentHashMap.put(sku, l1VarT);
            }
        }
        logger.debug("frameDeviceSettingsConfiguration");
        xw2.b bVar = this.f34361c;
        if (bVar != null) {
            dVar = new xw2.d(bVar, new xw2.e(R.layout.settings_loading_view, null, null, 0, null, null, 62, null), new fx2.a(bVar.f192449a, GCMSettingManager.k().b(), w.l0(GCMSettingManager.k().e(), IOUtils.DIR_SEPARATOR_UNIX)), c22.b0.b(null), !((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f());
        } else {
            logger.error("frameDeviceSettingsConfiguration: No GCM credentials.");
            dVar = null;
        }
        zu2.a.f207132a.getClass();
        zu2.a.f207133b = this;
        if (dVar != null) {
            x53.c cVar4 = s0.f129406a;
            ge1.b.T(dVar2, o.f168762a.H(), null, new c(l1VarT, this, i14, cVar2, dVar, z14, null), 2);
        } else {
            logger.error("Unable to frame settings data object");
            Unit unit = Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/settings/realtime/b$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "Glog", "Lorg/slf4j/Logger;", "", "CROSS_SELL_PREFETCH_TIMEOUT_MS", "J", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
