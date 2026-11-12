package gl2;

import android.os.SystemClock;
import com.garmin.android.lib.networking.exceptions.NoNetworkException;
import com.garmin.device.filetransfer.core.util.CoreTransferException;
import com.garmin.device.filetransfer.core.util.UploadDestinationException;
import com.garmin.proto.generated.GDIGarminConnect;
import com.garmin.sync.UploadConfigurationLoader;
import com.google.android.gms.wallet.WalletConstants;
import com.google.common.net.HttpHeaders;
import fe2.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import lk2.v;
import o13.r;
import o53.b0;
import o53.c2;
import o53.l1;
import o53.m0;
import o53.s0;
import ok2.g0;
import ok2.w;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w0;
import p13.d0;
import p13.h0;
import p13.j0;
import p13.l0;
import p13.u;
import p13.u0;
import p13.y;
import pk2.a0;
import pk2.e0;
import pk2.f0;
import pk2.x;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\u0016\u0017\u0018By\b\u0000\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0018\b\u0002\u0010\t\u001a\u0012\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\b\u0012\u00060\u0007j\u0002`\b\u0018\u00010\n\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\b\u0012\u00060\u0007j\u0002`\b\u0018\u00010\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014BY\b\u0016\u0012\u0018\b\u0002\u0010\t\u001a\u0012\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\b\u0012\u00060\u0007j\u0002`\b\u0018\u00010\n\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\b\u0012\u00060\u0007j\u0002`\b\u0018\u00010\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0015¨\u0006\u0019"}, d2 = {"Lgl2/a;", "Lpk2/f0;", "Lgl2/m;", "Lpk2/a0;", "Lpk2/e0;", "defaultPriority", "", "", "Lcom/garmin/device/filetransfer/DataType;", "perDataTypePriority", "", "allowedDataTypes", "blockedDataTypes", "", "awaitWellnessProcessing", "Lcz2/a;", "clock", "Lgl2/n;", "uploadManager", "<init>", "(Lpk2/e0;Ljava/util/Map;Ljava/util/Collection;Ljava/util/Collection;ZLcz2/a;Lgl2/n;)V", "(Ljava/util/Map;Ljava/util/Collection;Ljava/util/Collection;Z)V", "b", "c", "a", "file-transfer-gc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class a implements f0, m, a0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f77873r = new b(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final List<String> f77874s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Object f77875t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Set<String> f77876u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Set<String> f77877v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final UUID f77878w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Logger f77879x;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f77880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, e0> f77881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Collection<String> f77882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Collection<String> f77883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f77884f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ok2.a0 f77885g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u53.d f77886h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Set<String> f77887i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f77888j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f77889k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n f77890l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f77891m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final HashMap<String, C1569a> f77892n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArraySet<UUID> f77893o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArraySet<l> f77894p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Set<String> f77895q;

    /* JADX INFO: renamed from: gl2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgl2/a$a;", "", "<init>", "()V", "file-transfer-gc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C1569a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList<o13.p<String, l1>> f77896a = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CoreTransferException f77897b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f77898c;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgl2/a$c;", "Lcom/garmin/sync/UploadConfigurationLoader$a;", "<init>", "(Lgl2/a;)V", "file-transfer-gc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class c implements UploadConfigurationLoader.a {
        public c() {
        }

        @Override // com.garmin.sync.UploadConfigurationLoader.a
        public final String d() {
            my2.a.c cVar;
            b bVar = a.f77873r;
            hy2.d dVar = a.this.s().f60322o;
            my2.a aVar = dVar instanceof my2.a ? (my2.a) dVar : null;
            if (aVar == null || (cVar = aVar.f121526a) == null) {
                return null;
            }
            return cVar.d();
        }

        @Override // com.garmin.sync.UploadConfigurationLoader.a
        public final boolean e() {
            ok2.a0 a0Var = a.this.f77885g;
            if (a0Var != null) {
                return a0Var.getConfiguration().p();
            }
            s.m("helper");
            throw null;
        }

        @Override // com.garmin.sync.UploadConfigurationLoader.a
        public final String f() {
            b bVar = a.f77873r;
            return a.this.s().q();
        }

        @Override // com.garmin.sync.UploadConfigurationLoader.a
        public final zi2.a g() {
            b bVar = a.f77873r;
            zi2.a aVarA = a.this.s().f60322o.a();
            if (aVarA != null) {
                return aVarA;
            }
            vb.h.z("Environment not available. Not signed in");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.filetransfer.gc.upload.ConnectUploadAgent$captureLoadResults$1", f = "ConnectUploadAgent.kt", l = {453}, m = "invokeSuspend")
    public static final class d extends v13.i implements e23.p<b0, t13.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f77900a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ rs2.c f77902c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(rs2.c cVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f77902c = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new d(this.f77902c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super String> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f77900a;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    n nVar = a.this.f77890l;
                    rs2.c cVar = this.f77902c;
                    this.f77900a = 1;
                    obj = nVar.e(cVar, this, false);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return "Uploadable=[" + h0.k0((Collection) obj, null, null, null, null, 63) + "]";
            } catch (Exception e4) {
                return am.j.m("Uploadable=Unknown[", e4.getMessage(), "]");
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.filetransfer.gc.upload.ConnectUploadAgent$notifyResult$job$1", f = "ConnectUploadAgent.kt", l = {721}, m = "invokeSuspend")
    public static final class e extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f77903a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ rs2.c f77905c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ wk2.f f77906d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ hy2.c f77907e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ x f77908f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(rs2.c cVar, wk2.f fVar, hy2.c cVar2, x xVar, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f77905c = cVar;
            this.f77906d = fVar;
            this.f77907e = cVar2;
            this.f77908f = xVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new e(this.f77905c, this.f77906d, this.f77907e, this.f77908f, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Set<String> set;
            a aVar = a.this;
            x xVar = this.f77908f;
            hy2.c cVar = this.f77907e;
            wk2.f fVar = this.f77906d;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f77903a;
            if (i14 == 0) {
                r.b(obj);
                a.this.a(this.f77905c, fVar.f185842a, fVar.f185843b, String.valueOf(cVar.getF121601a()), cVar.getHttpResponseCode(), xVar.f138496a.f138508a);
                if (xVar.f138496a.f138508a) {
                    synchronized (aVar.f77894p) {
                        set = aVar.f77895q;
                    }
                    if (set.contains(fVar.f185843b)) {
                        String f172493a = this.f77905c.getF92741e();
                        UUID uuid = fVar.f185842a;
                        this.f77903a = 1;
                        if (aVar.G(f172493a, uuid, this) == aVar2) {
                            return aVar2;
                        }
                    }
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        List<String> listK = p13.x.k("FIT_TYPE_4", "ACTIVITY_GCPD", "FIT_TYPE_88");
        f77874s = listK;
        w0 w0Var = new w0(8);
        ArrayList arrayList = new ArrayList(y.r(listK, 10));
        Iterator<T> it = listK.iterator();
        while (it.hasNext()) {
            arrayList.add(new o13.p((String) it.next(), e0.PREFERRED));
        }
        w0Var.b(arrayList.toArray(new o13.p[0]));
        w0Var.a(new o13.p("FIT_TYPE_41", e0.PREFERRED));
        e0 e0Var = e0.SILENT;
        w0Var.a(new o13.p("ErrorShutdownReports", e0Var));
        w0Var.a(new o13.p("IQErrorReports", e0Var));
        w0Var.a(new o13.p("FIT_TYPE_52", e0Var));
        w0Var.a(new o13.p("ULFLogs", e0Var));
        w0Var.a(new o13.p("KPI", e0Var));
        w0Var.a(new o13.p("BLELogs", e0Var));
        ArrayList<Object> arrayList2 = w0Var.f105816a;
        f77875t = u0.e((o13.p[]) arrayList2.toArray(new o13.p[arrayList2.size()]));
        Set<String> setM0 = u.m0(new String[]{"FIT_TYPE_32", "FIT_TYPE_49"});
        f77876u = setM0;
        w0 w0Var2 = new w0(3);
        w0Var2.b(setM0.toArray(new String[0]));
        w0Var2.b(f77874s.toArray(new String[0]));
        w0Var2.a("FIT_TYPE_35");
        ArrayList<Object> arrayList3 = w0Var2.f105816a;
        Object[] array = arrayList3.toArray(new String[arrayList3.size()]);
        array.getClass();
        f77877v = u.m0(array);
        com.garmin.device.filetransfer.a.f50723m.getClass();
        f77878w = com.garmin.device.filetransfer.a.f50725o;
        Logger logger = LoggerFactory.getLogger("GCFT#UploadAgent");
        logger.getClass();
        f77879x = logger;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(e0 e0Var, Map<String, ? extends e0> map, Collection<String> collection, Collection<String> collection2, boolean z14, cz2.a aVar, n nVar) {
        e0Var.getClass();
        map.getClass();
        aVar.getClass();
        this.f77880b = e0Var;
        this.f77881c = map;
        this.f77882d = collection;
        this.f77883e = collection2;
        this.f77884f = z14;
        x53.c cVar = s0.f129406a;
        this.f77886h = zl.a.e("ConnectUploadAgent", x53.b.f189152a.plus(ge1.b.h()));
        this.f77887i = h0.g1(f77874s);
        this.f77889k = true;
        this.f77890l = nVar == null ? new p(new c(), new z(this, 20)) : nVar;
        this.f77891m = new Object();
        this.f77892n = new HashMap<>();
        this.f77893o = new CopyOnWriteArraySet<>();
        this.f77894p = new CopyOnWriteArraySet<>();
        this.f77895q = l0.f134950a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object C(a aVar, rs2.c cVar, v13.c cVar2) {
        gl2.e eVar;
        if (cVar2 instanceof gl2.e) {
            eVar = (gl2.e) cVar2;
            int i14 = eVar.f77934e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f77934e = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new gl2.e(aVar, cVar2);
            }
        } else {
            eVar = new gl2.e(aVar, cVar2);
        }
        Object obj = eVar.f77932c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f77934e;
        boolean z14 = true;
        if (i15 == 0) {
            r.b(obj);
            eVar.f77930a = aVar;
            eVar.f77931b = cVar;
            eVar.f77934e = 1;
            if (aVar.g(cVar, eVar) == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cVar = eVar.f77931b;
            aVar = eVar.f77930a;
            r.b(obj);
        }
        synchronized (aVar.f77891m) {
            C1569a c1569a = aVar.f77892n.get(cVar.getF92741e());
            if (c1569a == null || !c1569a.f77898c) {
                z14 = false;
            } else {
                C1569a c1569a2 = aVar.f77892n.get(cVar.getF92741e());
                if (c1569a2 != null) {
                    c1569a2.f77898c = false;
                }
            }
        }
        if (z14) {
            f77879x.info("Uploads for " + cVar.getF92746j() + " may have queued downloads. Request sync for new download items");
            ok2.a0 a0Var = aVar.f77885g;
            if (a0Var == null) {
                s.m("helper");
                throw null;
            }
            w wVarA = a0Var.a(cVar.getF92741e());
            if (wVarA != null) {
                wVarA.p();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0098, code lost:
    
        if (r5.d(r6, r0) == r1) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object H(a aVar, rs2.c cVar, g0 g0Var, v13.c cVar2) {
        h hVar;
        if (cVar2 instanceof h) {
            hVar = (h) cVar2;
            int i14 = hVar.f77956f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f77956f = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(aVar, cVar2);
            }
        } else {
            hVar = new h(aVar, cVar2);
        }
        Object obj = hVar.f77954d;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f77956f;
        try {
            if (i15 == 0) {
                r.b(obj);
                dl2.b bVarS = aVar.s();
                hVar.f77951a = aVar;
                hVar.f77952b = cVar;
                hVar.f77953c = g0Var;
                hVar.f77956f = 1;
                if (hl2.b.c(bVarS, hVar, 3) != aVar2) {
                }
                return aVar2;
            }
            if (i15 == 1) {
                g0Var = hVar.f77953c;
                cVar = hVar.f77952b;
                aVar = hVar.f77951a;
                r.b(obj);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
            if (!(aVar.s() instanceof yr1.n) || !aVar.s().d()) {
                return Unit.INSTANCE;
            }
            el2.a aVar3 = (el2.a) da2.d.b().getCapability(cVar.getF92741e(), el2.a.class);
            if (aVar3 != null) {
                GDIGarminConnect.Priority priority = (-g0Var.ordinal()) >= (-g0.USER_INITIATED_GENERAL.ordinal()) ? GDIGarminConnect.Priority.USER_INITIATED : GDIGarminConnect.Priority.STANDARD;
                hVar.f77951a = null;
                hVar.f77952b = null;
                hVar.f77953c = null;
                hVar.f77956f = 2;
            }
            return Unit.INSTANCE;
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:130:0x0389  */
    /* JADX WARN: Code duplicated, block: B:132:0x03a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0368, code lost:
    
        if (o53.j2.b(2000, r2, r11) == r12) goto L132;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [T, o53.c2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object I(a aVar, rs2.c cVar, wk2.n nVar, dz2.b bVar, v13.c cVar2) {
        i iVar;
        a aVar2;
        String str;
        rs2.c cVar3;
        wk2.n nVar2;
        x xVarB;
        r0 r0Var;
        rs2.c cVar4;
        String str2;
        wk2.n nVar3;
        hy2.c cVar5;
        wk2.n nVar4;
        a aVar3;
        rs2.c cVar6;
        String str3;
        hy2.c cVar7;
        r0 r0Var2;
        ArrayList<o13.p<String, l1>> arrayList;
        Set<String> set;
        Object objE;
        if (cVar2 instanceof i) {
            iVar = (i) cVar2;
            int i14 = iVar.f77965i;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f77965i = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(aVar, cVar2);
            }
        } else {
            iVar = new i(aVar, cVar2);
        }
        i iVar2 = iVar;
        Object objF = iVar2.f77963g;
        u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar2.f77965i;
        if (i15 != 0) {
            if (i15 == 1) {
                str = iVar2.f77960d;
                wk2.n nVar5 = iVar2.f77959c;
                rs2.c cVar8 = iVar2.f77958b;
                a aVar5 = iVar2.f77957a;
                r.b(objF);
                nVar2 = nVar5;
                cVar3 = cVar8;
                aVar2 = aVar5;
            } else {
                if (i15 == 2) {
                    r.b(objF);
                    return objF;
                }
                if (i15 != 3) {
                    if (i15 == 4) {
                        r.b(objF);
                        return objF;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r0Var2 = iVar2.f77962f;
                cVar7 = iVar2.f77961e;
                str3 = iVar2.f77960d;
                nVar4 = iVar2.f77959c;
                cVar6 = iVar2.f77958b;
                aVar3 = iVar2.f77957a;
                try {
                    r.b(objF);
                } catch (Exception unused) {
                }
            }
            a aVar6 = aVar3;
            cVar4 = cVar6;
            aVar2 = aVar6;
            r0Var = r0Var2;
            cVar5 = cVar7;
            str2 = str3;
            nVar3 = nVar4;
            objE = (x) r0Var.f105810a;
            if (objE == null) {
                wk2.f f205152b = nVar3.getF205152b();
                iVar2.f77957a = null;
                iVar2.f77958b = null;
                iVar2.f77959c = null;
                iVar2.f77960d = null;
                iVar2.f77961e = null;
                iVar2.f77962f = null;
                iVar2.f77965i = 4;
                objE = aVar2.E(cVar4, f205152b, cVar5, str2, true, iVar2);
                if (objE == aVar4) {
                    return aVar4;
                }
            }
            return objE;
        }
        r.b(objF);
        String strD = aVar.f77890l.d(cVar, nVar.getF205152b());
        if (strD == null) {
            androidx.room.a0.s(nVar.getF205152b().f185842a, "No endpoint for ");
            return null;
        }
        if (!aVar.s().d()) {
            b bVar2 = f77873r;
            wk2.f f205152b2 = nVar.getF205152b();
            bVar2.getClass();
            pk2.y yVar = (pk2.y) b.a(f205152b2, WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION, strD).f128594a;
            x.a aVar7 = x.f138495e;
            CoreTransferException coreTransferException = new CoreTransferException(ok2.e.C, "App specifically disabled uploads", null, 4, null);
            aVar7.getClass();
            return x.a.a(yVar, coreTransferException);
        }
        synchronized (aVar.f77891m) {
            try {
                C1569a c1569a = aVar.f77892n.get(cVar.getF92741e());
                CoreTransferException coreTransferException2 = c1569a != null ? c1569a.f77897b : null;
                if (coreTransferException2 != null && (!aVar.f77890l.a() || !aVar.f77890l.c())) {
                    f77879x.warn("Previous network/GC unavailable failure, skip uploadFile(" + cVar.getF92746j() + ", " + nVar.getF205152b().f185842a + ") to " + strD);
                    return x.a.b(x.f138495e, new CoreTransferException(coreTransferException2.getFailure(), "Previous network/GC unavailable failure", coreTransferException2));
                }
                Unit unit = Unit.INSTANCE;
                f77879x.info("uploadFile(" + cVar.getF92746j() + ", " + nVar.getF205152b().f185842a + ") to " + strD);
                ArrayList arrayListD = hy2.b.d(aVar.s().p() ^ true, nVar.getF205164n());
                n nVar6 = aVar.f77890l;
                iVar2.f77957a = aVar;
                iVar2.f77958b = cVar;
                iVar2.f77959c = nVar;
                iVar2.f77960d = strD;
                iVar2.f77965i = 1;
                objF = nVar6.f(cVar, nVar, bVar, strD, arrayListD, iVar2);
                if (objF != aVar4) {
                    aVar2 = aVar;
                    str = strD;
                    cVar3 = cVar;
                    nVar2 = nVar;
                }
                return aVar4;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        hy2.c cVar9 = (hy2.c) objF;
        if (cVar9.a()) {
            f77879x.warn("No internet, unable to uploadFile(" + cVar3.getF92746j() + ", " + nVar2.getF205152b().f185842a + ") to " + str);
            xVarB = x.a.b(x.f138495e, new CoreTransferException(ok2.e.f132643k, cVar9.b()));
        } else if (!cVar9.c() && !aVar2.f77890l.a()) {
            f77879x.warn("No network availability, unable to uploadFile(" + cVar3.getF92746j() + ", " + nVar2.getF205152b().f185842a + ") to " + str);
            xVarB = x.a.b(x.f138495e, new CoreTransferException(ok2.e.f132643k, cVar9.b()));
        } else if (cVar9.c() || aVar2.f77890l.c()) {
            xVarB = null;
        } else {
            f77879x.warn("GC unavailable, unable to uploadFile(" + cVar3.getF92746j() + ", " + nVar2.getF205152b().f185842a + ") to " + str);
            xVarB = x.a.b(x.f138495e, new CoreTransferException(ok2.e.f132642j, cVar9.b()));
        }
        if (xVarB != null) {
            synchronized (aVar2.f77891m) {
                C1569a c1569a2 = aVar2.f77892n.get(cVar3.getF92741e());
                if (c1569a2 != null) {
                    c1569a2.f77897b = xVarB.f138497b;
                }
            }
            return xVarB;
        }
        r0Var = new r0();
        if (cVar9.getHttpResponseCode() == 202) {
            if (nVar2.getF205164n() && aVar2.f77884f) {
                wk2.f f205152b3 = nVar2.getF205152b();
                iVar2.f77957a = null;
                iVar2.f77958b = null;
                iVar2.f77959c = null;
                iVar2.f77960d = null;
                iVar2.f77965i = 2;
                Object objY = aVar2.y(cVar3, cVar9, str, f205152b3, iVar2);
                if (objY != aVar4) {
                    return objY;
                }
            } else {
                cVar4 = cVar3;
                if (!aVar2.t(cVar4, nVar2.getF205152b()).isEmpty() && !nVar2.getF205164n()) {
                    synchronized (aVar2.f77894p) {
                        set = aVar2.f77895q;
                    }
                    if (!set.contains(nVar2.getF205152b().f185843b)) {
                        if (!nVar2.getF205164n()) {
                            f77879x.debug("Skip status check non-last file " + nVar2.getF205152b().f185842a + " to " + str);
                        }
                    }
                }
                r0 r0Var3 = new r0();
                synchronized (aVar2.f77891m) {
                    nVar4 = nVar2;
                    r0Var3.f105810a = ge1.b.T(aVar2.f77886h, null, null, new j(r0Var, aVar2, cVar4, cVar9, str, nVar2, null), 3);
                    C1569a c1569a3 = aVar2.f77892n.get(cVar4.getF92741e());
                    if (c1569a3 != null && (arrayList = c1569a3.f77896a) != null) {
                        arrayList.add(new o13.p<>(nVar4.getF205152b().f185843b, r0Var3.f105810a));
                    }
                }
                try {
                    k kVar = new k(r0Var3, null);
                    iVar2.f77957a = aVar2;
                    iVar2.f77958b = cVar4;
                    iVar2.f77959c = nVar4;
                    iVar2.f77960d = str;
                    iVar2.f77961e = cVar9;
                    iVar2.f77962f = r0Var;
                    iVar2.f77965i = 3;
                } catch (Exception unused2) {
                }
            }
            return aVar4;
        }
        cVar4 = cVar3;
        str2 = str;
        nVar3 = nVar2;
        cVar5 = cVar9;
        objE = (x) r0Var.f105810a;
        if (objE == null) {
            wk2.f f205152b4 = nVar3.getF205152b();
            iVar2.f77957a = null;
            iVar2.f77958b = null;
            iVar2.f77959c = null;
            iVar2.f77960d = null;
            iVar2.f77961e = null;
            iVar2.f77962f = null;
            iVar2.f77965i = 4;
            objE = aVar2.E(cVar4, f205152b4, cVar5, str2, true, iVar2);
            if (objE == aVar4) {
                return aVar4;
            }
        }
        return objE;
        aVar3 = aVar2;
        cVar6 = cVar4;
        str3 = str;
        cVar7 = cVar9;
        r0Var2 = r0Var;
        a aVar8 = aVar3;
        cVar4 = cVar6;
        aVar2 = aVar8;
        r0Var = r0Var2;
        cVar5 = cVar7;
        str2 = str3;
        nVar3 = nVar4;
        objE = (x) r0Var.f105810a;
        if (objE == null) {
            wk2.f f205152b5 = nVar3.getF205152b();
            iVar2.f77957a = null;
            iVar2.f77958b = null;
            iVar2.f77959c = null;
            iVar2.f77960d = null;
            iVar2.f77961e = null;
            iVar2.f77962f = null;
            iVar2.f77965i = 4;
            objE = aVar2.E(cVar4, f205152b5, cVar5, str2, true, iVar2);
            if (objE == aVar4) {
                return aVar4;
            }
        }
        return objE;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:58:0x0143  */
    /* JADX WARN: Code duplicated, block: B:61:0x015f  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:83:0x017a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:? A[LOOP:0: B:59:0x0159->B:85:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static Object u(a aVar, rs2.c cVar, v13.c cVar2) throws Exception {
        gl2.c cVar3;
        ?? r14;
        a aVar2;
        rs2.c cVar4;
        a aVar3;
        rs2.c cVar5;
        Iterator<UUID> it;
        UUID next;
        String f172493a;
        a aVar4 = aVar;
        rs2.c cVar6 = cVar;
        if (cVar2 instanceof gl2.c) {
            cVar3 = (gl2.c) cVar2;
            int i14 = cVar3.f77919g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar3.f77919g = i14 - Integer.MIN_VALUE;
            } else {
                cVar3 = new gl2.c(aVar4, cVar2);
            }
        } else {
            cVar3 = new gl2.c(aVar4, cVar2);
        }
        Object objE = cVar3.f77917e;
        u13.a aVar5 = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar3.f77919g;
        try {
            if (i15 != 0) {
                if (i15 == 1) {
                    int i16 = cVar3.f77916d;
                    cVar6 = cVar3.f77914b;
                    a aVar6 = cVar3.f77913a;
                    r.b(objE);
                    r14 = i16;
                    aVar4 = aVar6;
                } else {
                    if (i15 == 2) {
                        cVar4 = cVar3.f77914b;
                        aVar2 = cVar3.f77913a;
                        r.b(objE);
                        ((Boolean) objE).getClass();
                        if (!aVar2.f77893o.isEmpty()) {
                            u62.z.i("Remove flags from failed async uploads: ", aVar2.f77893o.size(), f77879x);
                            Iterator<UUID> it3 = aVar2.f77893o.iterator();
                            aVar3 = aVar2;
                            cVar5 = cVar4;
                            it = it3;
                        }
                        return Unit.INSTANCE;
                    }
                    if (i15 != 3) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = cVar3.f77915c;
                    cVar5 = cVar3.f77914b;
                    aVar3 = cVar3.f77913a;
                    r.b(objE);
                }
                while (it.hasNext()) {
                    next = it.next();
                    f172493a = cVar5.getF92741e();
                    next.getClass();
                    cVar3.f77913a = aVar3;
                    cVar3.f77914b = cVar5;
                    cVar3.f77915c = it;
                    cVar3.f77919g = 3;
                    if (aVar3.G(f172493a, next, cVar3) == aVar5) {
                        return aVar5;
                    }
                }
                return Unit.INSTANCE;
            }
            r.b(objE);
            synchronized (aVar4.f77891m) {
                try {
                    if (aVar4.f77892n.get(cVar6.getF92741e()) == null) {
                        aVar4.f77892n.put(cVar6.getF92741e(), new C1569a());
                        aVar4.F();
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            com.garmin.device.filetransfer.core.background.a.C1027a c1027a = com.garmin.device.filetransfer.core.background.a.f50783c;
            ok2.a0.f132585h.getClass();
            zy2.f fVar = ok2.a0.f132587j;
            long jA = fVar.a();
            c1027a.getClass();
            boolean zA = com.garmin.device.filetransfer.core.background.a.C1027a.a(jA);
            boolean z14 = false;
            z14 = false;
            boolean z15 = zA && aVar4.f77889k;
            if (z15) {
                f77879x.info("Midnight server check override will be applied");
            }
            long j8 = aVar4.f77888j;
            if (j8 != 0) {
                long j14 = j8 + ((long) 21600000);
                fVar.getClass();
                if (j14 <= SystemClock.elapsedRealtime()) {
                    if (!z15) {
                        z14 = true;
                    }
                }
            } else if (!z15) {
                z14 = true;
            }
            n nVar = aVar4.f77890l;
            cVar3.f77913a = aVar4;
            cVar3.f77914b = cVar6;
            cVar3.f77916d = z14 ? 1 : 0;
            cVar3.f77919g = 1;
            objE = nVar.e(cVar6, cVar3, z14);
            r14 = z14;
            if (objE == aVar5) {
            }
            return aVar5;
            Collection collection = (Collection) objE;
            if (r14 != 0) {
                ok2.a0.f132585h.getClass();
                ok2.a0.f132587j.getClass();
                aVar4.f77888j = SystemClock.elapsedRealtime();
                f77879x.debug("OMT Defined DataTypes for device " + cVar6.getF92746j() + ": [" + h0.k0(collection, null, null, null, new g11.e(17), 31) + "]");
            }
            dl2.b bVarS = aVar4.s();
            cVar3.f77913a = aVar4;
            cVar3.f77914b = cVar6;
            cVar3.f77919g = 2;
            objE = hl2.b.c(bVarS, cVar3, 3);
            if (objE != aVar5) {
                rs2.c cVar7 = cVar6;
                aVar2 = aVar4;
                cVar4 = cVar7;
                ((Boolean) objE).getClass();
                if (!aVar2.f77893o.isEmpty()) {
                    u62.z.i("Remove flags from failed async uploads: ", aVar2.f77893o.size(), f77879x);
                    Iterator<UUID> it4 = aVar2.f77893o.iterator();
                    aVar3 = aVar2;
                    cVar5 = cVar4;
                    it = it4;
                    while (it.hasNext()) {
                        next = it.next();
                        f172493a = cVar5.getF92741e();
                        next.getClass();
                        cVar3.f77913a = aVar3;
                        cVar3.f77914b = cVar5;
                        cVar3.f77915c = it;
                        cVar3.f77919g = 3;
                        if (aVar3.G(f172493a, next, cVar3) == aVar5) {
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            return aVar5;
        } catch (Exception e4) {
            f77879x.warn("Failed to load OMT DataTypes", (Throwable) e4);
            if (e4 instanceof NoNetworkException) {
                throw new CoreTransferException(ok2.e.f132643k, e4);
            }
            if (e4 instanceof CoreTransferException) {
                throw e4;
            }
            throw new CoreTransferException(ok2.e.f132656z, e4);
        }
    }

    @Override // pk2.z
    public final String A() {
        return "GCUploadAgent";
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    /* JADX WARN: Code duplicated, block: B:52:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void B(rs2.c cVar, wk2.f fVar, x xVar, hy2.c cVar2) {
        a aVar;
        rs2.c cVar3;
        wk2.f fVar2;
        x xVar2;
        Set<String> set;
        c2 c2VarT;
        C1569a c1569a;
        ArrayList<o13.p<String, l1>> arrayList;
        pk2.y yVar = xVar.f138496a;
        pk2.y yVar2 = pk2.y.SUCCESS;
        if (yVar != yVar2 || cVar2.getHttpResponseCode() == 202) {
            if (xVar.f138496a != yVar2) {
                synchronized (this.f77894p) {
                    set = this.f77895q;
                }
                if (set.contains(fVar.f185843b)) {
                    aVar = this;
                    cVar3 = cVar;
                    fVar2 = fVar;
                    xVar2 = xVar;
                    c2VarT = ge1.b.T(this.f77886h, null, null, aVar.new e(cVar3, fVar2, cVar2, xVar2, null), 3);
                    synchronized (aVar.f77891m) {
                        c1569a = aVar.f77892n.get(cVar3.getF92741e());
                        if (c1569a != null && (arrayList = c1569a.f77896a) != null) {
                            arrayList.add(new o13.p<>(fVar2.f185843b, c2VarT));
                        }
                    }
                }
            }
            aVar = this;
            cVar3 = cVar;
            fVar2 = fVar;
            xVar2 = xVar;
        } else {
            aVar = this;
            cVar3 = cVar;
            fVar2 = fVar;
            xVar2 = xVar;
            c2VarT = ge1.b.T(this.f77886h, null, null, aVar.new e(cVar3, fVar2, cVar2, xVar2, null), 3);
            synchronized (aVar.f77891m) {
                c1569a = aVar.f77892n.get(cVar3.getF92741e());
                if (c1569a != null) {
                    arrayList.add(new o13.p<>(fVar2.f185843b, c2VarT));
                }
            }
        }
        pk2.y yVar3 = xVar2.f138496a;
        if (yVar3 == yVar2 || yVar3 == pk2.y.TREAT_AS_SUCCESS) {
            s().f60321n.getClass();
            f77873r.getClass();
            if (f77877v.contains(fVar2.f185843b)) {
                synchronized (aVar.f77891m) {
                    try {
                        C1569a c1569a2 = aVar.f77892n.get(cVar3.getF92741e());
                        if (c1569a2 != null) {
                            c1569a2.f77898c = true;
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }
    }

    @Override // pk2.z
    public final Map<String, e0> D() {
        return this.f77881c;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x01da  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object E(rs2.c cVar, wk2.f fVar, hy2.c cVar2, String str, boolean z14, v13.c cVar3) {
        f fVar2;
        hy2.c cVar4;
        boolean z15;
        a aVar;
        rs2.c cVar5;
        x xVar;
        wk2.f fVar3;
        String str2;
        pk2.y yVar;
        boolean z16;
        int httpResponseCode;
        wk2.f fVar4 = fVar;
        String str3 = str;
        if (cVar3 instanceof f) {
            fVar2 = (f) cVar3;
            int i14 = fVar2.f77945k;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar2.f77945k = i14 - Integer.MIN_VALUE;
            } else {
                fVar2 = new f(this, cVar3);
            }
        } else {
            fVar2 = new f(this, cVar3);
        }
        Object obj = fVar2.f77943i;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar2.f77945k;
        Logger logger = f77879x;
        if (i15 == 0) {
            r.b(obj);
            int httpResponseCode2 = cVar2.getHttpResponseCode();
            f77873r.getClass();
            o13.p pVarA = b.a(fVar4, httpResponseCode2, str3);
            pk2.y yVar2 = (pk2.y) pVarA.f128594a;
            String str4 = (String) pVarA.f128595b;
            boolean z17 = yVar2.f138508a && ((httpResponseCode = cVar2.getHttpResponseCode()) == 400 || httpResponseCode == 415);
            if (cVar2.getHttpResponseCode() != 200) {
                if (cVar2.getHttpResponseCode() == 201) {
                    Object data = cVar2.getF121601a();
                    String string = data != null ? data.toString() : null;
                    logger.trace("201 response body=" + string);
                    String strB = string != null ? hy2.b.b(string) : null;
                    if (strB != null) {
                        String str5 = "File " + fVar4.f185842a + " was uploaded and awaiting processing. Code=408 (" + strB + ")";
                        logger.warn(str5);
                        x.a aVar3 = x.f138495e;
                        UploadDestinationException uploadDestinationException = new UploadDestinationException(cVar2.b(), str5, null, str3, ok2.e.B, false, 36, null);
                        pk2.y yVar3 = pk2.y.NO_RETRY_FAILURE;
                        aVar3.getClass();
                        xVar = x.a.a(yVar3, uploadDestinationException);
                    } else {
                        logger.debug(str4);
                        x.f138495e.getClass();
                        xVar = x.a.e();
                    }
                } else if (cVar2.getHttpResponseCode() == 412) {
                    logger.debug(str4);
                    dl2.b bVarS = s();
                    fVar2.f77935a = this;
                    fVar2.f77936b = cVar;
                    fVar2.f77937c = fVar4;
                    cVar4 = cVar2;
                    fVar2.f77938d = cVar4;
                    fVar2.f77939e = str3;
                    fVar2.f77940f = yVar2;
                    fVar2.f77941g = str4;
                    fVar2.f77942h = z14;
                    fVar2.f77945k = 1;
                    Object objC = hl2.b.c(bVarS, fVar2, 2);
                    if (objC == aVar2) {
                        return aVar2;
                    }
                    fVar3 = fVar4;
                    str2 = str4;
                    obj = objC;
                    yVar = yVar2;
                    cVar5 = cVar;
                    z16 = z14;
                    aVar = this;
                } else {
                    cVar4 = cVar2;
                    z15 = z14;
                    my2.a.f121522d.getClass();
                    if (u.x(my2.a.f121525g, cVar4.getHttpResponseCode())) {
                        logger.debug(str4);
                    } else {
                        logger.warn(str4);
                    }
                    aVar = this;
                    cVar5 = cVar;
                    xVar = new x(yVar2, new UploadDestinationException(cVar4.b(), str4, new Integer(cVar4.getHttpResponseCode()), str3, null, z17, 16, null));
                }
                if (z15) {
                    aVar.B(cVar5, fVar4, xVar, cVar4);
                }
                return xVar;
            }
            logger.debug(str4);
            x.f138495e.getClass();
            xVar = x.a.e();
            cVar5 = cVar;
            cVar4 = cVar2;
            z15 = z14;
            aVar = this;
            if (z15) {
                aVar.B(cVar5, fVar4, xVar, cVar4);
            }
            return xVar;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z16 = fVar2.f77942h;
        String str6 = fVar2.f77941g;
        yVar = fVar2.f77940f;
        str3 = fVar2.f77939e;
        hy2.c cVar6 = fVar2.f77938d;
        fVar3 = fVar2.f77937c;
        cVar5 = fVar2.f77936b;
        aVar = fVar2.f77935a;
        r.b(obj);
        str2 = str6;
        cVar4 = cVar6;
        String str7 = str3;
        if (!((Boolean) obj).booleanValue() || aVar.s().d()) {
            logger.warn("Unexpected " + cVar4.getHttpResponseCode() + " when shouldUpload did not change");
            yVar = pk2.y.NON_BLOCKING_FAILURE;
        }
        xVar = new x(yVar, new UploadDestinationException(cVar4.b(), str2, new Integer(cVar4.getHttpResponseCode()), str7, ok2.e.C, false, 32, null));
        z15 = z16;
        fVar4 = fVar3;
        if (z15) {
            aVar.B(cVar5, fVar4, xVar, cVar4);
        }
        return xVar;
    }

    public final void F() {
        synchronized (this.f77894p) {
            try {
                CopyOnWriteArraySet<l> copyOnWriteArraySet = this.f77894p;
                ArrayList arrayList = new ArrayList();
                Iterator<l> it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    d0.v(arrayList, it.next().e());
                }
                Set<String> setF1 = h0.f1(arrayList);
                setF1.addAll(this.f77887i);
                synchronized (this.f77894p) {
                    this.f77895q = setF1;
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object G(String str, UUID uuid, v13.c cVar) {
        g gVar;
        Exception e4;
        a aVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f77950e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f77950e = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object obj = gVar.f77948c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f77950e;
        if (i15 == 0) {
            r.b(obj);
            try {
                ok2.a0 a0Var = this.f77885g;
                if (a0Var == null) {
                    s.m("helper");
                    throw null;
                }
                try {
                    w wVarA = a0Var.a(str);
                    if (wVarA != null) {
                        List<UUID> list = getF159941g().f113303b;
                        gVar.f77946a = this;
                        gVar.f77947b = uuid;
                        gVar.f77950e = 1;
                        if (wVarA.s(uuid, list, gVar) == aVar2) {
                            return aVar2;
                        }
                    }
                    aVar = this;
                } catch (Exception e14) {
                    e4 = e14;
                    aVar = this;
                    f77879x.error("Failed to remove flags " + uuid, (Throwable) e4);
                    aVar.f77893o.add(uuid);
                }
            } catch (Exception e15) {
                e4 = e15;
            }
            aVar = this;
            f77879x.error("Failed to remove flags " + uuid, (Throwable) e4);
            aVar.f77893o.add(uuid);
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uuid = gVar.f77947b;
        aVar = gVar.f77946a;
        try {
            r.b(obj);
        } catch (Exception e16) {
            e4 = e16;
            f77879x.error("Failed to remove flags " + uuid, (Throwable) e4);
            aVar.f77893o.add(uuid);
        }
        aVar.f77893o.remove(uuid);
        return Unit.INSTANCE;
    }

    @Override // gl2.m
    public final void a(rs2.c cVar, UUID uuid, String str, String str2, int i14, boolean z14) {
        cVar.getClass();
        uuid.getClass();
        str.getClass();
        ArrayList arrayList = new ArrayList();
        for (l lVar : this.f77894p) {
            if (lVar.e().contains(str)) {
                arrayList.add(lVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            rs2.c cVar2 = cVar;
            UUID uuid2 = uuid;
            String str3 = str;
            String str4 = str2;
            boolean z15 = z14;
            try {
                ((l) it.next()).b(cVar2, uuid2, str3, str4, z15);
            } catch (Exception e4) {
                f77879x.error("Callback onUpload(" + uuid2 + ", " + str3 + ", " + i14 + ") failed", (Throwable) e4);
            }
            cVar = cVar2;
            uuid = uuid2;
            str = str3;
            str2 = str4;
            z14 = z15;
        }
    }

    @Override // pk2.f0
    public final wk2.a b(rs2.c cVar, wk2.f fVar) {
        cVar.getClass();
        wk2.d.f185837a.getClass();
        return new wk2.a(cVar, fVar, null, 4, null);
    }

    @Override // pk2.z
    public final void c(ok2.a0 a0Var) {
        this.f77885g = a0Var;
    }

    @Override // pk2.z
    public final Object e(rs2.c cVar, ok2.j jVar) {
        return C(this, cVar, jVar);
    }

    @Override // pk2.a0
    public final void f(rs2.c cVar) {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:55:0x00b1
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final java.lang.Object g(rs2.c r10, v13.c r11) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gl2.a.g(rs2.c, v13.c):java.lang.Object");
    }

    @Override // pk2.a0
    public final void i(rs2.c cVar) {
    }

    @Override // pk2.f0
    public final Object j(rs2.c cVar, g0 g0Var, pk2.g gVar) {
        return H(this, cVar, g0Var, gVar);
    }

    @Override // pk2.z
    /* JADX INFO: renamed from: k, reason: from getter */
    public final e0 getF72031b() {
        return this.f77880b;
    }

    @Override // pk2.f0
    public final boolean m(rs2.c cVar, wk2.f fVar) {
        cVar.getClass();
        fVar.getClass();
        UUID uuid = fVar.f185842a;
        String str = fVar.f185843b;
        if (this.f77890l.d(cVar, fVar) != null) {
            boolean zD = s().d();
            Logger logger = f77879x;
            if (!zD) {
                logger.warn("Skip upload of " + uuid + ", APP disabled uploads");
                return false;
            }
            Collection<String> collection = this.f77882d;
            if (collection != null && !collection.contains(str)) {
                logger.warn("Skip upload of " + uuid + ", APP specified types do not include " + cl2.c.o(str));
                return false;
            }
            Collection<String> collection2 = this.f77883e;
            if (collection2 == null || collection2.contains(str)) {
                logger.warn("Skip upload of " + uuid + ", APP blocked types include " + cl2.c.o(str));
                return false;
            }
            Set<UUID> set = fVar.f185846e;
            if (set == null || !set.contains(f77878w)) {
                return true;
            }
        }
        return false;
    }

    @Override // pk2.f0
    public final Object n(rs2.c cVar, wk2.n nVar, dz2.b bVar, bl2.y yVar) {
        return I(this, cVar, nVar, bVar, yVar);
    }

    @Override // pk2.a0
    public final void p(rs2.c cVar) {
        synchronized (this.f77891m) {
            this.f77892n.remove(cVar.getF92741e());
            this.f77890l.g(cVar.getF92746j());
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // pk2.z
    public final x q(rs2.c cVar, wk2.f fVar, x xVar) {
        pk2.y yVar;
        cVar.getClass();
        fVar.getClass();
        xVar.getClass();
        CoreTransferException coreTransferException = xVar.f138497b;
        if (coreTransferException == null) {
            return null;
        }
        pk2.y yVar2 = xVar.f138496a;
        if (!yVar2.f138508a || yVar2 == (yVar = pk2.y.FILE_TYPE_BLOCKING_FAILURE) || t(cVar, fVar).isEmpty()) {
            return null;
        }
        return new x(yVar, coreTransferException);
    }

    @Override // pk2.f0
    public final String r(rs2.c cVar) {
        cVar.getClass();
        x53.c cVar2 = s0.f129406a;
        return (String) ge1.b.W(x53.b.f189152a, new d(cVar, null));
    }

    public final dl2.b s() {
        ok2.a0 a0Var = this.f77885g;
        if (a0Var != null) {
            return hl2.b.a(a0Var);
        }
        s.m("helper");
        throw null;
    }

    @Override // pk2.z
    public final Set t(rs2.c cVar, wk2.f fVar) {
        fVar.getClass();
        cVar.getClass();
        s().f60321n.getClass();
        b bVar = f77873r;
        bVar.getClass();
        String str = fVar.f185843b;
        Set<String> set = f77876u;
        if (!set.contains(str)) {
            return pk2.z.a.a(cVar, fVar);
        }
        s().f60321n.getClass();
        bVar.getClass();
        return set;
    }

    @Override // pk2.f0
    public final List<UUID> v(x xVar) {
        CoreTransferException coreTransferException;
        Integer numY;
        xVar.getClass();
        return (xVar.f138498c == ok2.e.C || !((coreTransferException = xVar.f138497b) == null || (numY = lg.d.y(coreTransferException)) == null || numY.intValue() != 412)) ? j0.f134944a : getF159941g().f113303b;
    }

    @Override // pk2.f0
    public final Object w(rs2.c cVar, v13.i iVar) {
        return u(this, cVar, iVar);
    }

    @Override // pk2.a0
    public final void x(rs2.c cVar) {
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:26:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:46:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:51:0x0202  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x01cf -> B:47:0x01d6). Please report as a decompilation issue!!! */
    public final Object y(rs2.c cVar, hy2.c cVar2, String str, wk2.f fVar, v13.c cVar3) {
        gl2.d dVar;
        a aVar;
        UUID uuid;
        long jElapsedRealtime;
        rs2.c cVar4;
        String str2;
        a aVar2;
        wk2.f fVar2;
        hy2.c cVar5;
        a aVar3;
        String strD;
        String str3;
        boolean z14;
        UUID uuid2;
        char c14;
        Object objB;
        wk2.f fVar3;
        rs2.c cVar6;
        String str4;
        wk2.f fVar4;
        a aVar4;
        String str5;
        String str6;
        hy2.c cVar7;
        wk2.f fVar5;
        a aVar5;
        rs2.c cVar8;
        wk2.f fVar6;
        hy2.c cVar9;
        String str7;
        if (cVar3 instanceof gl2.d) {
            dVar = (gl2.d) cVar3;
            int i14 = dVar.f77929j;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f77929j = i14 - Integer.MIN_VALUE;
                aVar = this;
            } else {
                aVar = this;
                dVar = new gl2.d(aVar, cVar3);
            }
        } else {
            aVar = this;
            dVar = new gl2.d(aVar, cVar3);
        }
        Object objE = dVar.f77927h;
        u13.a aVar6 = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f77929j;
        int i16 = 202;
        Logger logger = f77879x;
        if (i15 == 0) {
            r.b(objE);
            logger.debug("monitorProcessingUrl: Response code " + cVar2.getHttpResponseCode() + " for " + fVar.f185842a + " to " + str);
            uuid = fVar.f185842a;
            ok2.a0.f132585h.getClass();
            ok2.a0.f132587j.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
            if (cVar2.getHttpResponseCode() != 202) {
                vb.h.z("Should not monitor status of non-202 response");
                return null;
            }
            cVar4 = cVar;
            str2 = str;
            aVar2 = aVar;
            fVar2 = fVar;
            cVar5 = cVar2;
            if (cVar5.getHttpResponseCode() == i16) {
                str6 = str2;
                dVar.f77920a = aVar2;
                dVar.f77921b = cVar4;
                dVar.f77922c = str6;
                dVar.f77923d = fVar2;
                dVar.f77924e = cVar5;
                dVar.f77929j = 3;
                cVar7 = cVar5;
                fVar5 = fVar2;
                objE = aVar2.E(cVar4, fVar5, cVar7, str6, false, dVar);
                if (objE != aVar6) {
                    aVar5 = aVar2;
                    cVar8 = cVar4;
                    fVar6 = fVar5;
                    cVar9 = cVar7;
                    str7 = str6;
                }
            } else {
                str6 = str2;
                dVar.f77920a = aVar2;
                dVar.f77921b = cVar4;
                dVar.f77922c = str6;
                dVar.f77923d = fVar2;
                dVar.f77924e = cVar5;
                dVar.f77929j = 3;
                cVar7 = cVar5;
                fVar5 = fVar2;
                objE = aVar2.E(cVar4, fVar5, cVar7, str6, false, dVar);
                if (objE != aVar6) {
                    aVar5 = aVar2;
                    cVar8 = cVar4;
                    fVar6 = fVar5;
                    cVar9 = cVar7;
                    str7 = str6;
                }
            }
            return aVar6;
        }
        if (i15 == 1) {
            jElapsedRealtime = dVar.f77926g;
            str5 = dVar.f77925f;
            uuid = (UUID) dVar.f77924e;
            fVar4 = dVar.f77923d;
            str4 = dVar.f77922c;
            cVar6 = dVar.f77921b;
            aVar4 = dVar.f77920a;
            r.b(objE);
            z14 = true;
            fVar2 = fVar4;
            str3 = str4;
            cVar4 = cVar6;
            aVar3 = aVar4;
            strD = str5;
            uuid2 = uuid;
            n nVar = aVar3.f77890l;
            long f172494b = cVar4.getF92746j();
            dVar.f77920a = aVar3;
            dVar.f77921b = cVar4;
            dVar.f77922c = str3;
            dVar.f77923d = fVar2;
            dVar.f77924e = uuid2;
            dVar.f77925f = null;
            dVar.f77926g = jElapsedRealtime;
            c14 = 2;
            dVar.f77929j = 2;
            objB = nVar.b(f172494b, strD, dVar);
            if (objB != aVar6) {
                fVar3 = fVar2;
                objE = objB;
                str2 = str3;
                wk2.f fVar7 = fVar3;
                uuid = uuid2;
                cVar5 = (hy2.c) objE;
                fVar2 = fVar7;
                aVar2 = aVar3;
                i16 = 202;
                if (cVar5.getHttpResponseCode() == i16) {
                    str6 = str2;
                    dVar.f77920a = aVar2;
                    dVar.f77921b = cVar4;
                    dVar.f77922c = str6;
                    dVar.f77923d = fVar2;
                    dVar.f77924e = cVar5;
                    dVar.f77929j = 3;
                    cVar7 = cVar5;
                    fVar5 = fVar2;
                    objE = aVar2.E(cVar4, fVar5, cVar7, str6, false, dVar);
                    if (objE != aVar6) {
                        aVar5 = aVar2;
                        cVar8 = cVar4;
                        fVar6 = fVar5;
                        cVar9 = cVar7;
                        str7 = str6;
                    }
                } else {
                    str6 = str2;
                    dVar.f77920a = aVar2;
                    dVar.f77921b = cVar4;
                    dVar.f77922c = str6;
                    dVar.f77923d = fVar2;
                    dVar.f77924e = cVar5;
                    dVar.f77929j = 3;
                    cVar7 = cVar5;
                    fVar5 = fVar2;
                    objE = aVar2.E(cVar4, fVar5, cVar7, str6, false, dVar);
                    if (objE != aVar6) {
                        aVar5 = aVar2;
                        cVar8 = cVar4;
                        fVar6 = fVar5;
                        cVar9 = cVar7;
                        str7 = str6;
                    }
                }
            }
            return aVar6;
        }
        if (i15 == 2) {
            jElapsedRealtime = dVar.f77926g;
            uuid2 = (UUID) dVar.f77924e;
            fVar3 = dVar.f77923d;
            String str8 = dVar.f77922c;
            cVar4 = dVar.f77921b;
            aVar3 = dVar.f77920a;
            r.b(objE);
            z14 = true;
            str2 = str8;
            c14 = 2;
            wk2.f fVar8 = fVar3;
            uuid = uuid2;
            cVar5 = (hy2.c) objE;
            fVar2 = fVar8;
            aVar2 = aVar3;
            i16 = 202;
            if (cVar5.getHttpResponseCode() == i16 || (strD = cVar5.d(HttpHeaders.LOCATION)) == null) {
                str6 = str2;
                dVar.f77920a = aVar2;
                dVar.f77921b = cVar4;
                dVar.f77922c = str6;
                dVar.f77923d = fVar2;
                dVar.f77924e = cVar5;
                dVar.f77929j = 3;
                cVar7 = cVar5;
                fVar5 = fVar2;
                objE = aVar2.E(cVar4, fVar5, cVar7, str6, false, dVar);
                if (objE != aVar6) {
                    aVar5 = aVar2;
                    cVar8 = cVar4;
                    fVar6 = fVar5;
                    cVar9 = cVar7;
                    str7 = str6;
                }
            } else {
                ok2.a0.f132585h.getClass();
                ok2.a0.f132587j.getClass();
                if (SystemClock.elapsedRealtime() >= ((long) 45000) + jElapsedRealtime) {
                    String str9 = "Timeout waiting for " + uuid + " server processing";
                    logger.warn(str9);
                    x.a aVar7 = x.f138495e;
                    UploadDestinationException uploadDestinationException = new UploadDestinationException(cVar5.b(), str9, null, str2, ok2.e.B, false, 36, null);
                    aVar7.getClass();
                    x xVarD = x.a.d(uploadDestinationException);
                    aVar2.B(cVar4, fVar2, xVarD, cVar5);
                    return xVarD;
                }
                str3 = str2;
                long jC = hy2.b.c(cVar5);
                if (jC > 45000) {
                    logger.warn(cVar4.getF92746j() + " Server provided delay exceeding the max allowed.");
                    jC = 1000;
                }
                int httpResponseCode = cVar5.getHttpResponseCode();
                f77873r.getClass();
                String str10 = (String) b.a(fVar2, httpResponseCode, str3).f128595b;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str10);
                sb3.append(" Will check status for ");
                sb3.append(uuid);
                sb3.append(" at ");
                sb3.append(strD);
                logger.debug(com.nimbusds.jose.shaded.gson.internal.a.g(jC, " in ", " milliseconds.", sb3));
                if (jC > 0) {
                    dVar.f77920a = aVar2;
                    dVar.f77921b = cVar4;
                    dVar.f77922c = str3;
                    dVar.f77923d = fVar2;
                    dVar.f77924e = uuid;
                    dVar.f77925f = strD;
                    dVar.f77926g = jElapsedRealtime;
                    z14 = true;
                    dVar.f77929j = 1;
                    if (m0.b(jC, dVar) != aVar6) {
                        str5 = strD;
                        aVar4 = aVar2;
                        cVar6 = cVar4;
                        fVar4 = fVar2;
                        str4 = str3;
                        fVar2 = fVar4;
                        str3 = str4;
                        cVar4 = cVar6;
                        aVar3 = aVar4;
                        strD = str5;
                        uuid2 = uuid;
                        n nVar2 = aVar3.f77890l;
                        long f172494b2 = cVar4.getF92746j();
                        dVar.f77920a = aVar3;
                        dVar.f77921b = cVar4;
                        dVar.f77922c = str3;
                        dVar.f77923d = fVar2;
                        dVar.f77924e = uuid2;
                        dVar.f77925f = null;
                        dVar.f77926g = jElapsedRealtime;
                        c14 = 2;
                        dVar.f77929j = 2;
                        objB = nVar2.b(f172494b2, strD, dVar);
                        if (objB != aVar6) {
                            fVar3 = fVar2;
                            objE = objB;
                            str2 = str3;
                            wk2.f fVar9 = fVar3;
                            uuid = uuid2;
                            cVar5 = (hy2.c) objE;
                            fVar2 = fVar9;
                            aVar2 = aVar3;
                            i16 = 202;
                            if (cVar5.getHttpResponseCode() == i16) {
                                str6 = str2;
                                dVar.f77920a = aVar2;
                                dVar.f77921b = cVar4;
                                dVar.f77922c = str6;
                                dVar.f77923d = fVar2;
                                dVar.f77924e = cVar5;
                                dVar.f77929j = 3;
                                cVar7 = cVar5;
                                fVar5 = fVar2;
                                objE = aVar2.E(cVar4, fVar5, cVar7, str6, false, dVar);
                                if (objE != aVar6) {
                                    aVar5 = aVar2;
                                    cVar8 = cVar4;
                                    fVar6 = fVar5;
                                    cVar9 = cVar7;
                                    str7 = str6;
                                }
                            } else {
                                str6 = str2;
                                dVar.f77920a = aVar2;
                                dVar.f77921b = cVar4;
                                dVar.f77922c = str6;
                                dVar.f77923d = fVar2;
                                dVar.f77924e = cVar5;
                                dVar.f77929j = 3;
                                cVar7 = cVar5;
                                fVar5 = fVar2;
                                objE = aVar2.E(cVar4, fVar5, cVar7, str6, false, dVar);
                                if (objE != aVar6) {
                                    aVar5 = aVar2;
                                    cVar8 = cVar4;
                                    fVar6 = fVar5;
                                    cVar9 = cVar7;
                                    str7 = str6;
                                }
                            }
                        }
                    }
                } else {
                    z14 = true;
                    aVar3 = aVar2;
                    uuid2 = uuid;
                    n nVar3 = aVar3.f77890l;
                    long f172494b3 = cVar4.getF92746j();
                    dVar.f77920a = aVar3;
                    dVar.f77921b = cVar4;
                    dVar.f77922c = str3;
                    dVar.f77923d = fVar2;
                    dVar.f77924e = uuid2;
                    dVar.f77925f = null;
                    dVar.f77926g = jElapsedRealtime;
                    c14 = 2;
                    dVar.f77929j = 2;
                    objB = nVar3.b(f172494b3, strD, dVar);
                    if (objB != aVar6) {
                        fVar3 = fVar2;
                        objE = objB;
                        str2 = str3;
                        wk2.f fVar10 = fVar3;
                        uuid = uuid2;
                        cVar5 = (hy2.c) objE;
                        fVar2 = fVar10;
                        aVar2 = aVar3;
                        i16 = 202;
                        if (cVar5.getHttpResponseCode() == i16) {
                            str6 = str2;
                            dVar.f77920a = aVar2;
                            dVar.f77921b = cVar4;
                            dVar.f77922c = str6;
                            dVar.f77923d = fVar2;
                            dVar.f77924e = cVar5;
                            dVar.f77929j = 3;
                            cVar7 = cVar5;
                            fVar5 = fVar2;
                            objE = aVar2.E(cVar4, fVar5, cVar7, str6, false, dVar);
                            if (objE != aVar6) {
                                aVar5 = aVar2;
                                cVar8 = cVar4;
                                fVar6 = fVar5;
                                cVar9 = cVar7;
                                str7 = str6;
                            }
                        } else {
                            str6 = str2;
                            dVar.f77920a = aVar2;
                            dVar.f77921b = cVar4;
                            dVar.f77922c = str6;
                            dVar.f77923d = fVar2;
                            dVar.f77924e = cVar5;
                            dVar.f77929j = 3;
                            cVar7 = cVar5;
                            fVar5 = fVar2;
                            objE = aVar2.E(cVar4, fVar5, cVar7, str6, false, dVar);
                            if (objE != aVar6) {
                                aVar5 = aVar2;
                                cVar8 = cVar4;
                                fVar6 = fVar5;
                                cVar9 = cVar7;
                                str7 = str6;
                            }
                        }
                    }
                }
            }
            return aVar6;
        }
        if (i15 != 3) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        cVar9 = (hy2.c) dVar.f77924e;
        fVar6 = dVar.f77923d;
        str7 = dVar.f77922c;
        cVar8 = dVar.f77921b;
        aVar5 = dVar.f77920a;
        r.b(objE);
        x xVarD2 = (x) objE;
        pk2.y yVar = xVarD2.f138496a;
        Exception excB = xVarD2.f138497b;
        if (yVar.f138508a) {
            if (!aVar5.f77890l.a()) {
                logger.warn("No network availability, failed monitorProcessingUrl(" + cVar8.getF92746j() + ", " + fVar6.f185842a + ") to " + str7);
                x.a aVar8 = x.f138495e;
                ok2.e eVar = ok2.e.f132643k;
                if (excB == null) {
                    excB = cVar9.b();
                }
                CoreTransferException coreTransferException = new CoreTransferException(eVar, excB);
                aVar8.getClass();
                xVarD2 = x.a.d(coreTransferException);
            } else if (!aVar5.f77890l.c()) {
                logger.warn("GC unavailable, failed monitorProcessingUrl(" + cVar8.getF92746j() + ", " + fVar6.f185842a + ") to " + str7);
                x.a aVar9 = x.f138495e;
                ok2.e eVar2 = ok2.e.f132642j;
                if (excB == null) {
                    excB = cVar9.b();
                }
                CoreTransferException coreTransferException2 = new CoreTransferException(eVar2, excB);
                aVar9.getClass();
                xVarD2 = x.a.d(coreTransferException2);
            }
        }
        aVar5.B(cVar8, fVar6, xVarD2, cVar9);
        return xVarD2;
    }

    @Override // pk2.f0
    /* JADX INFO: renamed from: z */
    public final v getF159941g() {
        return new v(p13.w.c(f77878w), this.f77882d, null, 4, null);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000e¨\u0006\u0014"}, d2 = {"Lgl2/a$b;", "", "<init>", "()V", "", "ACTIVITY_DATA_TYPE", "Ljava/lang/String;", "GPS_ACTIVITY_DATA_TYPE", "EPIC_ACTIVITY_DATA_TYPE", "SETTINGS_CHANGE_DATA_TYPE", "GOLF_SCORECARD", "GOLF_SCORECARD_XML", "", "UPLOAD_CONFIG_REFRESH_INTERVAL", "I", "", "MIN_SERVER_PROCESSING_TIME", "J", "MAX_SERVER_PROCESSING_TIME", "ERROR_CODE_UPLOAD_CONSENT_NOT_GRANTED", "file-transfer-gc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static o13.p a(wk2.f fVar, int i14, String str) {
            fVar.getClass();
            String str2 = fVar.f185843b;
            str.getClass();
            UUID uuid = fVar.f185842a;
            if ((i14 == 400 || i14 == 415) && (s.g(str2, "FIT_TYPE_38") || s.g(str2, "GOLF_SCORECARD"))) {
                return new o13.p(pk2.y.NO_RETRY_FAILURE, "Scorecard " + uuid + " was not accepted and will be ignored " + i14 + " to " + str);
            }
            if (i14 == -1) {
                return new o13.p(pk2.y.NON_BLOCKING_FAILURE, "Response unavailable for ".concat(str));
            }
            if (i14 == 204) {
                pk2.y yVar = pk2.y.TREAT_AS_SUCCESS;
                StringBuilder sb3 = new StringBuilder("File ");
                sb3.append(uuid);
                sb3.append(" is skipped. Code=");
                sb3.append(i14);
                sb3.append(" (Empty content) sent to ");
                return new o13.p(yVar, am.j.o(str, ".", sb3));
            }
            if (i14 == 400) {
                return new o13.p(pk2.y.NON_BLOCKING_FAILURE, "Server is not able to process the uploaded file " + uuid + ". Code=" + i14 + ".");
            }
            if (i14 == 406) {
                return new o13.p(pk2.y.NO_RETRY_FAILURE, "File " + uuid + " was not accepted as a valid fit file " + i14 + " to " + str);
            }
            if (i14 == 409) {
                return new o13.p(pk2.y.TREAT_AS_SUCCESS, "File " + uuid + " was accepted but previously uploaded " + i14 + " to " + str);
            }
            if (i14 == 415) {
                return new o13.p(pk2.y.NON_BLOCKING_FAILURE, "File " + uuid + " was not accepted because of invalid file content/type " + i14 + " to " + str);
            }
            if (i14 == 419) {
                return new o13.p(pk2.y.TREAT_AS_SUCCESS, "File " + uuid + " was not accepted because device is not associated with current user " + i14 + " to " + str);
            }
            if (i14 == 429) {
                return new o13.p(pk2.y.FILE_TYPE_BLOCKING_FAILURE, sn.a.e(i14, "Too many requests ", " for ", str));
            }
            if (i14 == 412) {
                return new o13.p(pk2.y.TREAT_AS_SUCCESS, sn.a.e(i14, "GC does not have consent granted for file ", " for ", str));
            }
            if (i14 == 413) {
                return new o13.p(pk2.y.NO_RETRY_FAILURE, "File " + uuid + " was not accepted because it is too large " + i14 + " to " + str);
            }
            switch (i14) {
                case 200:
                case 201:
                    return new o13.p(pk2.y.SUCCESS, "File " + uuid + " was uploaded successfully " + i14 + "!");
                case 202:
                    return new o13.p(pk2.y.SUCCESS, "File " + uuid + " was uploaded but not yet processed.");
                default:
                    return new o13.p(pk2.y.NON_BLOCKING_FAILURE, sn.a.e(i14, "Unexpected response code ", " for ", str));
            }
        }

        private b() {
        }
    }

    public a() {
        this(null, null, null, null, false, null, null, 127, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(e0 e0Var, Map map, Collection collection, Collection collection2, boolean z14, cz2.a aVar, n nVar, int i14, p005kotlin.jvm.internal.j jVar) {
        e0Var = (i14 & 1) != 0 ? e0.STANDARD : e0Var;
        Object obj = (i14 & 2) != 0 ? f77875t : map;
        if ((i14 & 4) != 0) {
            v.f113300e.getClass();
            collection = null;
        }
        if ((i14 & 8) != 0) {
            v.f113300e.getClass();
            collection2 = v.f113301f;
        }
        z14 = (i14 & 16) != 0 ? true : z14;
        if ((i14 & 32) != 0) {
            cz2.a.f56879a.getClass();
            aVar = cz2.a.C1219a.f56881b;
        }
        this(e0Var, obj, collection, collection2, z14, aVar, (i14 & 64) != 0 ? null : nVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public a(Map map, Collection collection, Collection collection2, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        ?? r14 = (i14 & 1) != 0 ? f77875t : map;
        if ((i14 & 2) != 0) {
            v.f113300e.getClass();
            collection = null;
        }
        if ((i14 & 4) != 0) {
            v.f113300e.getClass();
            collection2 = v.f113301f;
        }
        this(r14, collection, collection2, (i14 & 8) != 0 ? true : z14);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Map<String, ? extends e0> map, Collection<String> collection, Collection<String> collection2, boolean z14) {
        map.getClass();
        e0 e0Var = e0.STANDARD;
        cz2.a.f56879a.getClass();
        this(e0Var, map, collection, collection2, z14, cz2.a.C1219a.f56881b, null, 64, null);
    }
}
