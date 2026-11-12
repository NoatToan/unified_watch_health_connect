package xc0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import o13.t;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lxc0/r;", "Lbx2/b;", "Lyr1/r;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lxw2/b;", "rtsDeviceRecord", "<init>", "(Landroid/content/Context;Lxw2/b;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r extends bx2.b implements yr1.r {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f189956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static bv2.p f189957g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xw2.b f189958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s f189959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f189960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f189961e;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f189962a;

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
            f189962a = iArr;
        }
    }

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f189956f = gt2.b.f79005a.h("RTS-SyncDeviceTransform");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, xw2.b bVar) {
        super(context);
        context.getClass();
        bVar.getClass();
        this.f189958b = bVar;
        this.f189960d = o13.m.b(new wd.c(this, 25));
        long j8 = bVar.f192449a;
        this.f189961e = j8;
        if (j8 < 0) {
            f189956f.error("init: invalid device unitId.");
        }
    }

    @Override // yr1.r
    public final void B1(al2.c cVar) {
        f189956f.debug("onSyncStarted: handling sync response status: " + cVar + ".");
        bv2.p pVar = f189957g;
        if (pVar != null) {
            pVar.d();
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
        f189956f.debug("onSyncFinished: handling sync response status: " + cVar + ".");
        bv2.p pVar = f189957g;
        if (pVar != null) {
            pVar.c();
        } else {
            p005kotlin.jvm.internal.s.m("syncListener");
            throw null;
        }
    }

    @Override // bx2.b
    public final boolean l() {
        return hk0.p.j(this.f189961e);
    }

    @Override // bx2.b
    public final boolean m() {
        return hk0.p.k(this.f189961e);
    }

    @Override // bx2.b
    public final void n(bv2.p pVar) {
        f189957g = pVar;
        this.f189959c = new s(this);
        la2.e eVar = da2.d.b().f58886a;
        s sVar = this.f189959c;
        if (sVar == null) {
            p005kotlin.jvm.internal.s.m("connectionCallback");
            throw null;
        }
        eVar.b(sVar);
        ((yr1.q) this.f189960d.getValue()).b();
    }

    @Override // bx2.b
    public final void o() {
        Logger logger = f189956f;
        logger.debug("startSync");
        long j8 = this.f189961e;
        boolean zK = hk0.p.k(j8);
        if (!zK) {
            logger.error(com.airbnb.lottie.animation.keyframe.a.e("startSync: could not start sync, is device connected = ", ". is sync in progress = ", ".", zK, hk0.p.j(j8)));
            return;
        }
        if (hk0.p.j(j8)) {
            logger.debug("startSync: Sync is already in progress");
            bv2.p pVar = f189957g;
            if (pVar != null) {
                pVar.d();
                return;
            } else {
                p005kotlin.jvm.internal.s.m("syncListener");
                throw null;
            }
        }
        xw2.b bVar = this.f189958b;
        com.airbnb.lottie.animation.keyframe.a.u("startSync: initiating sync for ", bVar.f192451c, ".", logger);
        bv2.p pVar2 = f189957g;
        if (pVar2 == null) {
            p005kotlin.jvm.internal.s.m("syncListener");
            throw null;
        }
        pVar2.d();
        long j14 = bVar.f192449a;
        String name = logger.getName();
        name.getClass();
        yr1.e.e(new x91.j(this), j14, name);
    }

    @Override // bx2.b
    public final void p() {
        if (this.f189959c != null) {
            la2.e eVar = da2.d.b().f58886a;
            s sVar = this.f189959c;
            if (sVar == null) {
                p005kotlin.jvm.internal.s.m("connectionCallback");
                throw null;
            }
            eVar.i(sVar);
        }
        ((yr1.q) this.f189960d.getValue()).e();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lxc0/r$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "Glog", "Lorg/slf4j/Logger;", "Lbv2/p;", "syncListener", "Lbv2/p;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
