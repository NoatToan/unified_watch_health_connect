package yr1;

import android.content.Context;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import java.util.List;
import java.util.Map;
import ok2.y;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.w;
import z10.d1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lyr1/n;", "Ldl2/b;", "Landroid/content/Context;", "appContext", "<init>", "(Landroid/content/Context;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends dl2.b {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.a<Boolean> {
        public a(Object obj) {
            super(0, obj, GarminConnectMobileApp.class, "isForeground", "isForeground()Z", 0);
        }

        @Override // e23.a
        public final Boolean invoke() {
            return Boolean.valueOf(!((GarminConnectMobileApp) this.receiver).f28689a);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.sync.GCMTransferConfiguration", f = "GCMTransferConfiguration.kt", l = {55}, m = "refreshShouldUploadFiles", v = 2)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Logger f199106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f199107b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f199109d;

        public b(t13.d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f199107b = obj;
            this.f199109d |= Integer.MIN_VALUE;
            return n.this.r(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(Context context) {
        context.getClass();
        h hVar = new h(context);
        gl2.a aVar = new gl2.a(null, null, null, false, 15, null);
        g gVar = new g(context);
        synchronized (aVar.f77894p) {
            aVar.f77894p.add(gVar);
            aVar.F();
            Unit unit = Unit.INSTANCE;
        }
        fl2.a aVar2 = new fl2.a((Map) null, (e23.p) (0 == true ? 1 : 0), 3, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
        GarminConnectMobileApp.f28685g.getClass();
        super(hVar, aVar, aVar2, context, new a(GarminConnectMobileApp.a.b()), (List) null, w.c(new qk2.a()), (dl2.c) null, SyslogConstants.LOG_LOCAL4, (p005kotlin.jvm.internal.j) null);
    }

    @Override // dl2.b, el2.e
    public final boolean d() {
        Logger loggerB = gt2.c.b(a2.CONSENT.f28756a);
        boolean zK = d1.k();
        wr.g.y("shouldUploadFiles() -> shouldRestrictFilesUpload = ", zK, loggerB);
        return !zK;
    }

    @Override // ok2.d
    /* JADX INFO: renamed from: o */
    public final y.d getF132628h() {
        if (dv.a.a().f61318a) {
            return y.d.BLOCKED;
        }
        String string = GCMSettingManager.f41536b.getString(lg1.d.DEVICE_SOFTWARE_UPDATE_MODE.f112244a, "Normal");
        if (string != null) {
            int iHashCode = string.hashCode();
            if (iHashCode != -1955878649) {
                if (iHashCode != 64279661) {
                    if (iHashCode == 68065995 && string.equals("Force")) {
                        return y.d.FORCED;
                    }
                } else if (string.equals("Block")) {
                    return y.d.BLOCKED;
                }
            } else if (string.equals("Normal")) {
                return y.d.DEFAULT;
            }
        }
        return y.d.DEFAULT;
    }

    @Override // dl2.b
    public final String q() {
        return "ConnectMobile";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // dl2.b
    public final Object r(t13.d<? super Unit> dVar) throws Throwable {
        b bVar;
        Logger logger;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f199109d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f199109d = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f199107b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f199109d;
        if (i15 == 0) {
            o13.r.b(obj);
            Logger loggerB = gt2.c.b(a2.CONSENT.f28756a);
            loggerB.debug(" - refreshShouldUploadFiles()");
            p92.o oVar = p92.o.f136619a;
            bVar.f199106a = loggerB;
            bVar.f199109d = 1;
            Object objH = oVar.h(bVar);
            if (objH == aVar) {
                return aVar;
            }
            logger = loggerB;
            obj = objH;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            logger = bVar.f199106a;
            o13.r.b(obj);
        }
        logger.debug(" - refreshShouldUploadFiles() -> COMPLETE isSyncDeviceDataEnabled = " + ((Boolean) obj));
        return Unit.INSTANCE;
    }
}
