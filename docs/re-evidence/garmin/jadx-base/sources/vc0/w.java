package vc0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.devices.settings.dynamic.DSLSettingsException;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lvc0/w;", "Lgi2/b;", "Lyr1/r;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lsd2/f;", "deviceDatabaseRecord", "<init>", "(Landroid/content/Context;Lsd2/f;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w extends gi2.b implements yr1.r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f177025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static lh2.u f177026h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sd2.f f177027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x f177028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o13.t f177029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f177030f;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f177031a;

        static {
            int[] iArr = new int[al2.b.values().length];
            try {
                iArr[al2.b.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[al2.b.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[al2.b.NO_ITEMS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f177031a = iArr;
        }
    }

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f177025g = gt2.b.f79005a.h("DSL-SyncDeviceTransform");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Context context, sd2.f fVar) throws DSLSettingsException {
        super(context);
        context.getClass();
        fVar.getClass();
        this.f177027c = fVar;
        this.f177029e = o13.m.b(new v(this, 0));
        long unitID = fVar.getUnitID();
        this.f177030f = unitID;
        if (unitID >= 0) {
            return;
        }
        f177025g.error("init: invalid device unitId.");
        throw new DSLSettingsException("init: invalid device unitId");
    }

    @Override // yr1.r
    public final void B1(al2.c cVar) {
        f177025g.debug("onSyncStarted: handling sync response status: " + cVar + ".");
        lh2.u uVar = f177026h;
        if (uVar != null) {
            uVar.d();
        } else {
            p005kotlin.jvm.internal.s.m("syncListener");
            throw null;
        }
    }

    @Override // yr1.r
    public final void F1(al2.a aVar, boolean z14) {
    }

    @Override // yr1.r
    public final void g5(al2.c cVar, boolean z14) {
        f177025g.debug("onSyncFinished: handling sync response status: " + cVar + ".");
        lh2.u uVar = f177026h;
        if (uVar != null) {
            uVar.c();
        } else {
            p005kotlin.jvm.internal.s.m("syncListener");
            throw null;
        }
    }

    @Override // gi2.b
    public final boolean s() {
        return hk0.p.j(this.f177030f);
    }

    @Override // gi2.b
    public final boolean t() {
        return hk0.p.k(this.f177030f);
    }

    @Override // gi2.b
    public final void u(lh2.u uVar) {
        f177026h = uVar;
        this.f177028d = new x(this);
        la2.e eVar = da2.d.b().f58886a;
        x xVar = this.f177028d;
        if (xVar == null) {
            p005kotlin.jvm.internal.s.m("connectionCallback");
            throw null;
        }
        eVar.b(xVar);
        ((yr1.q) this.f177029e.getValue()).b();
    }

    @Override // gi2.b
    public final void v() {
        Logger logger = f177025g;
        logger.debug("startSync");
        long j8 = this.f177030f;
        boolean zK = hk0.p.k(j8);
        if (!zK) {
            logger.error(com.airbnb.lottie.animation.keyframe.a.e("startSync: could not start sync, is device connected = ", ". is sync in progress = ", ".", zK, hk0.p.j(j8)));
            return;
        }
        if (hk0.p.j(j8)) {
            logger.debug("startSync: Sync is already in progress");
            lh2.u uVar = f177026h;
            if (uVar != null) {
                uVar.d();
                return;
            } else {
                p005kotlin.jvm.internal.s.m("syncListener");
                throw null;
            }
        }
        sd2.f fVar = this.f177027c;
        com.airbnb.lottie.animation.keyframe.a.u("startSync: initiating sync for ", fVar.getDisplayName(), ".", logger);
        lh2.u uVar2 = f177026h;
        if (uVar2 == null) {
            p005kotlin.jvm.internal.s.m("syncListener");
            throw null;
        }
        uVar2.d();
        String name = logger.getName();
        name.getClass();
        yr1.d.d(fVar, name, new vb1.d(this));
    }

    @Override // gi2.b
    public final void w() {
        if (this.f177028d != null) {
            la2.e eVar = da2.d.b().f58886a;
            x xVar = this.f177028d;
            if (xVar == null) {
                p005kotlin.jvm.internal.s.m("connectionCallback");
                throw null;
            }
            eVar.i(xVar);
        }
        ((yr1.q) this.f177029e.getValue()).e();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lvc0/w$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "Glog", "Lorg/slf4j/Logger;", "Llh2/u;", "syncListener", "Llh2/u;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
