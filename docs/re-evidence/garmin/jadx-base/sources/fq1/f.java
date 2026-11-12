package fq1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.connectiq.z0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import ds.e0;
import java.util.Set;
import o53.s0;
import o53.z;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zb0.l1;
import zb0.s1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lfq1/f;", "Lfq1/s;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements s {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.startup.init.async.DeviceCommunicationInitializer", f = "DeviceCommunicationInitializer.kt", l = {27}, m = "execute", v = 2)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f73236a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public hk0.f f73237b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f73238c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f73240e;

        public b(t13.d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f73238c = obj;
            this.f73240e |= Integer.MIN_VALUE;
            return f.this.b(null, this);
        }
    }

    static {
        new a(null);
    }

    @Override // fq1.s
    public final z a() {
        x53.c cVar = s0.f129406a;
        return u53.o.f168762a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // fq1.s
    public final Object b(Context context, t13.d<? super Unit> dVar) throws Throwable {
        b bVar;
        hk0.f fVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f73240e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f73240e = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f73238c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f73240e;
        if (i15 == 0) {
            o13.r.b(obj);
            Set<SupportedCapability> setLoadAppCapabilities = SupportedCapability.loadAppCapabilities(context);
            setLoadAppCapabilities.getClass();
            fVar = new hk0.f(context, setLoadAppCapabilities);
            l1.f203565a.getClass();
            a2 a2Var = a2.DEVICES;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "SystemBondingLostEventHandler", "registerDeviceConnectionCallbacks");
            da2.d.b().f58886a.b(l1.f203566b);
            yr1.m.a aVar2 = yr1.m.f199104a;
            bVar.f73236a = context;
            bVar.f73237b = fVar;
            bVar.f73240e = 1;
            if (aVar2.a(context, bVar) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hk0.f fVar2 = bVar.f73237b;
            Context context2 = bVar.f73236a;
            o13.r.b(obj);
            fVar = fVar2;
            context = context2;
        }
        hk0.p.g(context);
        s1.f203658g.getClass();
        fVar.getClass();
        ma2.g.b(sk.b.f159489a, new s1.b(fVar));
        z0.f(context);
        ch2.h.e(context);
        lm2.h.b(false);
        com.garmin.android.apps.connectmobile.l.g().getClass();
        gh2.i iVar = gh2.i.f77458c;
        long jG = iVar.a().f77477b.g("read_device_xml_initial_delay_minutes");
        com.garmin.android.apps.connectmobile.l.g().getClass();
        long jG2 = iVar.a().f77477b.g("read_device_xml_interval_minutes");
        Logger logger = lm2.h.f113618a;
        vm2.d dVar2 = lm2.h.f113625h;
        if (dVar2 == null) {
            if (jG >= 0 && jG2 > 0) {
                StringBuilder sbK = e0.k(jG, "Start XmlReader with delay: ", ", interval: ");
                sbK.append(jG2);
                logger.debug(sbK.toString());
                vm2.d dVar3 = new vm2.d(jG, jG2);
                ((fm2.c) lm2.h.c()).a(dVar3);
                lm2.h.f113625h = dVar3;
            }
        } else if (dVar2.f178819a == jG && dVar2.f178820b == jG2) {
            StringBuilder sbK2 = e0.k(jG, "XmlReader already configured with delay: ", ", interval: ");
            sbK2.append(jG2);
            logger.warn(sbK2.toString());
        } else {
            logger.debug("Shutdown previous XmlReader");
            ((fm2.c) lm2.h.c()).m(dVar2);
            dVar2.f178821c.shutdownNow();
            if (jG >= 0) {
                StringBuilder sbK3 = e0.k(jG, "Start XmlReader with delay: ", ", interval: ");
                sbK3.append(jG2);
                logger.debug(sbK3.toString());
                vm2.d dVar4 = new vm2.d(jG, jG2);
                ((fm2.c) lm2.h.c()).a(dVar4);
                lm2.h.f113625h = dVar4;
            }
        }
        yr1.e.f199078a.getClass();
        yr1.c.a();
        gb2.a.b();
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfq1/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
