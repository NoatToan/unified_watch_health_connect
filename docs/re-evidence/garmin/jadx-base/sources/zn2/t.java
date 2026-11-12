package zn2;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import com.garmin.feature.garminpay.providers.gpay.model.Links;
import com.garmin.feature.garminpay.providers.gpay.snowball.CurrencyValue;
import com.garmin.feature.garminpay.providers.gpay.sync.NewDeviceSyncQueue;
import com.garmin.garminpay.database.GarminPayCoreDatabase;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.Serializable;
import java.util.Map;
import java.util.UUID;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0011B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lzn2/t;", "Lms2/d;", "Lto2/b;", "Lis2/b;", "serviceProviderType", "Lhs2/d;", "device", "Lzn2/z0;", "userProvider", "Lhs2/a;", TtmlNode.TAG_METADATA, "Lzn2/l;", "deviceDataManager", "Lto2/a;", "userEventManager", "<init>", "(Lis2/b;Lhs2/d;Lzn2/z0;Lhs2/a;Lzn2/l;Lto2/a;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t implements ms2.d, to2.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Logger f205814n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final is2.b f205815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hs2.d f205816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z0 f205817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public hs2.a f205818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f205819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final to2.a f205820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public NewDeviceSyncQueue f205821g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u53.d f205822h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f205823i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map<qs2.a, no2.i> f205824j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f205825k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final z53.b f205826l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f205827m;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewFitPayDeviceServiceProvider$deleteCloudData$1", f = "NewFitPayDeviceServiceProvider.kt", l = {151}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f205828a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return t.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            ms2.d dVarG;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f205828a;
            t tVar = t.this;
            if (i14 == 0) {
                o13.r.b(obj);
                g1 g1Var = tVar.f205817c.f205979a;
                long unitId = tVar.f205816b.getF99647a();
                this.f205828a = 1;
                if (g1Var.i0(unitId, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            z0 z0Var = tVar.f205817c;
            long unitId2 = tVar.f205816b.getF99647a();
            z0.a aVar2 = z0.f205974g;
            ps2.w.f140538a.getClass();
            ps2.n nVarI = ps2.w.i(unitId2);
            if (nVarI != null && (dVarG = nVarI.g(is2.b.FITPAY)) != null) {
                dVarG.j(null);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewFitPayDeviceServiceProvider$destroy$1", f = "NewFitPayDeviceServiceProvider.kt", l = {359}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f205830a;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return t.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            t tVar = t.this;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f205830a;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    t.f205814n.debug("destroy");
                    tVar.g();
                    ge1.b.T(tVar.f205822h, null, null, new v(tVar, null), 3);
                    z0 z0Var = tVar.f205817c;
                    long unitId = tVar.f205816b.getF99647a();
                    this.f205830a = 1;
                    g1 g1Var = z0Var.f205979a;
                    g1Var.e(unitId);
                    Object objT = g1Var.t(true, this);
                    if (objT != aVar) {
                        objT = Unit.INSTANCE;
                    }
                    if (objT == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
            } catch (Exception e4) {
                t.f205814n.error("destroy: ", (Throwable) e4);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"zn2/t$d", "Landroid/net/ConnectivityManager$NetworkCallback;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends ConnectivityManager.NetworkCallback {
        public d() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            network.getClass();
            t tVar = t.this;
            if (tVar.f205823i) {
                tVar.f205823i = false;
            } else {
                tVar.m();
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewFitPayDeviceServiceProvider$onCreditCardEvent$1", f = "NewFitPayDeviceServiceProvider.kt", l = {221}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f205833a;

        public e(t13.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return t.this.new e(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f205833a;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    g1 g1Var = t.this.f205817c.f205979a;
                    this.f205833a = 1;
                    if (g1.g0(g1Var, null, this, 7) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
            } catch (Exception e4) {
                t.f205814n.error("onCreditCardEvent: failed to refresh credit card", (Throwable) e4);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewFitPayDeviceServiceProvider$onTransitCardEvent$1", f = "NewFitPayDeviceServiceProvider.kt", l = {PsExtractor.VIDEO_STREAM_MASK, 241, 247}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f205835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f205836b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ to2.h f205837c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ t f205838d;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f205839a;

            static {
                int[] iArr = new int[to2.c.values().length];
                try {
                    iArr[to2.c.CREDENTIAL_CREATED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[to2.c.CREDENTIAL_ACTIVATED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[to2.c.CREDENTIAL_UPDATE_FAILED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[to2.c.CREDENTIAL_UPDATE_SUCCESS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[to2.c.CREDENTIAL_DELETE_FAILED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[to2.c.CREDENTIAL_DELETED.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f205839a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(to2.h hVar, t tVar, t13.d<? super f> dVar) {
            super(2, dVar);
            this.f205837c = hVar;
            this.f205838d = tVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new f(this.f205837c, this.f205838d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:44:0x00e0  */
        /* JADX WARN: Code duplicated, block: B:45:0x00e1 A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:7:0x001a, B:13:0x0028, B:42:0x00c3, B:45:0x00e1, B:16:0x0030, B:20:0x0047, B:21:0x004a, B:22:0x005b, B:23:0x005c, B:25:0x0062, B:28:0x007b, B:31:0x0080, B:32:0x0091, B:33:0x0092, B:35:0x0098, B:37:0x00a4, B:39:0x00aa, B:48:0x00e6, B:49:0x00f7, B:19:0x003f), top: B:53:0x0012 }] */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00e3, code lost:
        
            if (r12 == r4) goto L47;
         */
        /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, java.util.Map] */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            fo2.p pVar;
            String link;
            Object objE0;
            to2.h hVar = this.f205837c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f205836b;
            t tVar = this.f205838d;
            try {
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        String strB = ((fo2.l0) obj).getCredentialId();
                        this.f205835a = obj;
                        this.f205836b = 2;
                        tVar.getClass();
                        x53.c cVar = o53.s0.f129406a;
                        objE0 = ge1.b.e0(x53.b.f189152a, new x(tVar, strB, true, null), this);
                        if (objE0 == aVar) {
                            objE0 = Unit.INSTANCE;
                        }
                    } else {
                        if (i14 != 2 && i14 != 3) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(obj);
                    }
                    return Unit.INSTANCE;
                }
                o13.r.b(obj);
                t.f205814n.debug("onTransitCardEvent");
                to2.c sseEventsTypes = hVar.getSseEventsTypes();
                switch (sseEventsTypes == null ? -1 : a.f205839a[sseEventsTypes.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        Links linksD = hVar.d();
                        if (linksD == null || (pVar = (fo2.p) linksD.f51142a.get("credential")) == null || (link = pVar.getLink()) == null) {
                            throw new ns2.d("null credential link in " + hVar);
                        }
                        g1 g1Var = tVar.f205817c.f205979a;
                        this.f205836b = 1;
                        g1Var.getClass();
                        x53.c cVar2 = o53.s0.f129406a;
                        obj = ge1.b.e0(x53.b.f189152a, new i2(g1Var, link, null), this);
                        if (obj != aVar) {
                            String strB2 = ((fo2.l0) obj).getCredentialId();
                            this.f205835a = obj;
                            this.f205836b = 2;
                            tVar.getClass();
                            x53.c cVar3 = o53.s0.f129406a;
                            objE0 = ge1.b.e0(x53.b.f189152a, new x(tVar, strB2, true, null), this);
                            if (objE0 == aVar) {
                                objE0 = Unit.INSTANCE;
                            }
                            break;
                        }
                        return aVar;
                    case 6:
                        String strA = hVar.a();
                        if (strA == null) {
                            throw new ns2.d("null credential id in " + hVar);
                        }
                        g1 g1Var2 = tVar.f205817c.f205979a;
                        this.f205836b = 3;
                        g1Var2.getClass();
                        x53.c cVar4 = o53.s0.f129406a;
                        Object objE1 = ge1.b.e0(x53.b.f189152a, new y1(g1Var2, strA, null), this);
                        if (objE1 != aVar) {
                            objE1 = Unit.INSTANCE;
                        }
                        if (objE1 == aVar) {
                            return aVar;
                        }
                        return Unit.INSTANCE;
                    default:
                        throw new ns2.d("Unhandled transit card event " + hVar);
                }
            } catch (Throwable th3) {
                t.f205814n.error("An error occurs during onTransitCardEvent", th3);
            }
        }
    }

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f205814n = gt2.b.f79005a.h("PAY#NEW_FITPAY#NewFitPayDeviceServiceProvider");
    }

    public t(is2.b bVar, hs2.d dVar, z0 z0Var, hs2.a aVar, l lVar, to2.a aVar2) {
        Map<qs2.a, no2.i> mapB;
        bVar.getClass();
        dVar.getClass();
        z0Var.getClass();
        aVar.getClass();
        lVar.getClass();
        aVar2.getClass();
        this.f205815a = bVar;
        this.f205816b = dVar;
        this.f205817c = z0Var;
        this.f205818d = aVar;
        this.f205819e = lVar;
        this.f205820f = aVar2;
        x53.c cVar = o53.s0.f129406a;
        this.f205822h = o53.c0.h(o53.c0.a(x53.b.f189152a), ge1.b.h());
        this.f205823i = true;
        if (this.f205818d.getNfcInfo().b().contains(pl2.c.f138569p)) {
            mapB = p13.t0.b(new o13.p(qs2.a.f147388q, new no2.a(dVar)));
        } else {
            mapB = p13.k0.f134949a;
            mapB.getClass();
        }
        this.f205824j = mapB;
        this.f205826l = z53.c.a();
        this.f205827m = new d();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Serializable f(t tVar, as2.g gVar, v13.c cVar) {
        w wVar;
        tVar.getClass();
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i14 = wVar.f205904c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                wVar.f205904c = i14 - Integer.MIN_VALUE;
            } else {
                wVar = new w(tVar, cVar);
            }
        } else {
            wVar = new w(tVar, cVar);
        }
        Object objE = wVar.f205902a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = wVar.f205904c;
        if (i15 == 0) {
            o13.r.b(objE);
            no2.i iVarO = tVar.o(aq2.k.b(((fo2.l0) gVar.e()).k().h()));
            wVar.f205904c = 1;
            objE = iVarO.e(wVar);
            if (objE == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE);
        }
        return new as2.b((CurrencyValue) objE, System.currentTimeMillis());
    }

    @Override // to2.b
    public final void P0() {
        f205814n.debug("onCreditCardEvent");
        ge1.b.T(this.f205822h, null, null, new e(null), 3);
    }

    @Override // to2.b
    public final void Y3(to2.h hVar) {
        hVar.getClass();
        x53.c cVar = o53.s0.f129406a;
        gl.b.I(this.f205822h, x53.b.f189152a, new f(hVar, this, null), 2);
    }

    @Override // ms2.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final is2.b getF165540a() {
        return this.f205815a;
    }

    @Override // ms2.d
    public final void c(js2.b bVar, cs2.a<Boolean> aVar) {
        t tVar;
        NewDeviceSyncQueue aVar2;
        l lVar = this.f205819e;
        fo2.s sVar = lVar.f205629a;
        bVar.getClass();
        hs2.d dVar = this.f205816b;
        long unitId = dVar.getF99647a();
        Logger logger = f205814n;
        wr.g.v("initialize: initializing FitPay Device Service provider for ", unitId, StringUtils.SPACE, logger);
        boolean zContains = this.f205818d.getNfcInfo().b().contains(pl2.c.f138569p);
        to2.a aVar3 = this.f205820f;
        if (zContains) {
            tVar = this;
            aVar2 = new wo2.a(lVar, dVar, tVar, this.f205818d, aVar3);
        } else {
            aVar2 = new NewDeviceSyncQueue(lVar, dVar, this, this.f205818d);
            tVar = this;
        }
        tVar.f205821g = aVar2;
        logger.debug("registerForStreamEvents");
        aVar3.i(sVar.f73101a, this);
        m();
        if (sVar.f73108h.getLink() != null) {
            wr2.p pVar = wr2.p.f186870a;
            String strValueOf = String.valueOf(dVar.getF99647a());
            String link = sVar.f73108h.getLink();
            pVar.getClass();
            wr2.p.f("dynamic_feature_app", strValueOf, link);
        }
        wr2.b.f186831a.getClass();
        wr2.b.a().registerNetworkCallback(new NetworkRequest.Builder().build(), tVar.f205827m);
        aVar.accept(Boolean.TRUE);
    }

    @Override // ms2.d
    public final void e() {
        f205814n.debug("deviceWalletReady");
        m();
    }

    @Override // ms2.d
    public final void g() {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorRemove;
        GarminPayCoreDatabase.b bVar = GarminPayCoreDatabase.f52316a;
        Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
        bVar.getClass();
        es2.a aVarE = GarminPayCoreDatabase.b.a(contextC).e();
        String strName = this.f205815a.name();
        hs2.d dVar = this.f205816b;
        aVarE.c(dVar.getF99647a(), strName);
        wr2.p pVar = wr2.p.f186870a;
        String strValueOf = String.valueOf(dVar.getF99647a());
        pVar.getClass();
        strValueOf.getClass();
        SharedPreferences sharedPreferencesA = wr2.p.a("dynamic_feature_app");
        if (sharedPreferencesA == null || (editorEdit = sharedPreferencesA.edit()) == null || (editorRemove = editorEdit.remove(strValueOf)) == null) {
            return;
        }
        editorRemove.apply();
    }

    @Override // ms2.d
    /* JADX INFO: renamed from: getDevice, reason: from getter */
    public final hs2.d getF165541b() {
        return this.f205816b;
    }

    @Override // ms2.d
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final hs2.a getF165542c() {
        return this.f205818d;
    }

    @Override // ms2.d
    public final void h(ps2.b bVar) {
        bVar.accept(Boolean.TRUE);
    }

    @Override // ms2.d
    public final void i(ps2.b bVar) {
        bVar.accept(Boolean.TRUE);
    }

    @Override // to2.b
    public final void i2(wo2.f fVar) {
        Logger logger = f205814n;
        logger.debug("onSyncEvent: " + fVar);
        NewDeviceSyncQueue newDeviceSyncQueue = this.f205821g;
        if (newDeviceSyncQueue == null) {
            ds.e0.v("onSyncEvent: device sync queue is not available for handling sync request ", ((wo2.g) fVar).f186515a, logger);
        } else {
            ge1.b.T(newDeviceSyncQueue.f51335i, null, null, new vo2.e(newDeviceSyncQueue, fVar, null), 3);
        }
    }

    @Override // ms2.d
    public final void j(ps2.w.a aVar) {
        ge1.b.T(this.f205822h, null, null, new c(null), 3);
    }

    @Override // ms2.d
    public final void k(hs2.a aVar) {
        aVar.getClass();
        this.f205818d = aVar;
    }

    @Override // ms2.d
    public final void l() {
        f205814n.debug("deleteCloudData");
        ge1.b.T(this.f205822h, null, null, new b(null), 3);
    }

    public final void m() {
        ge1.b.T(this.f205822h, null, null, new u(this, null), 3);
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final l getF205819e() {
        return this.f205819e;
    }

    public final no2.i o(qs2.a aVar) {
        aVar.getClass();
        aq2.j.f12491a.getClass();
        if (aq2.j.e()) {
            return new no2.h();
        }
        Map<qs2.a, no2.i> map = this.f205824j;
        no2.i iVar = map.get(aVar);
        if (iVar != null) {
            return iVar;
        }
        throw new ns2.d("Cannot get executor for " + aVar + " from " + map);
    }

    public final void p(vo2.z zVar) {
        zVar.getClass();
        f205814n.debug("processManualSync: syncSource " + zVar);
        aq2.j.f12491a.getClass();
        vo2.c cVar = new vo2.c(tn.k.g(UUID.randomUUID().toString(), "-Custom"), this.f205819e.f205629a.f73101a, zVar);
        NewDeviceSyncQueue newDeviceSyncQueue = this.f205821g;
        if (newDeviceSyncQueue != null) {
            ge1.b.T(newDeviceSyncQueue.f51335i, null, null, new vo2.e(newDeviceSyncQueue, cVar, null), 3);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzn2/t$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
