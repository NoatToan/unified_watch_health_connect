package fa0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import ca0.o1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import f12.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import o13.r;
import o53.s0;
import o53.z;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;
import q92.x;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.s;
import r53.v;
import y80.w;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lfa0/h;", "Landroidx/lifecycle/u1;", "", "startDestination", "Lca0/o1;", "deviceSetupFlow", "Lq90/c;", "pairedDevice", "isChildAccount", "Lf12/l;", "userSettings", "Le20/a;", "consentRepository", "Lf90/f;", "fetchStartupConsentsDataUseCase", "Lf90/d;", "fetchRequiredConsentsDataUseCase", "Ly80/w;", "deviceSettingsRepository", "Lo53/z;", "ioDispatcher", "<init>", "(ZLca0/o1;Lq90/c;ZLf12/l;Le20/a;Lf90/f;Lf90/d;Ly80/w;Lo53/z;)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f70119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o1 f70120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q90.c f70121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f70122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f70123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e20.a f70124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f90.f f70125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f90.d f70126h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w f70127i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z f70128j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f70129k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p2 f70130l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b2 f70131m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p2 f70132n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p2 f70133o;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "", "Lca0/j$c;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.consent.DeviceSetupConsentViewModel$requiredConsents$1", f = "DeviceSetupConsentViewModel.kt", l = {52, 54}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<r53.j<? super List<? extends ca0.j.c>>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70134a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f70135b;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = h.this.new b(dVar);
            bVar.f70135b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super List<? extends ca0.j.c>> jVar, t13.d<? super Unit> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        
            if (r8 == r1) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
        
            if (r8 == r1) goto L18;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            List<o13.p> list;
            Object value;
            ArrayList arrayList;
            r53.j jVar = (r53.j) this.f70135b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f70134a;
            h hVar = h.this;
            if (i14 == 0) {
                r.b(obj);
                if (hVar.f70119a) {
                    f90.f fVar = hVar.f70125g;
                    o1 o1Var = hVar.f70120b;
                    this.f70135b = jVar;
                    this.f70134a = 1;
                    obj = fVar.c(o1Var, this);
                } else {
                    f90.d dVar = hVar.f70126h;
                    q90.c cVar = hVar.f70121c;
                    this.f70135b = jVar;
                    this.f70134a = 2;
                    obj = dVar.a(cVar, this);
                }
                return aVar;
            }
            if (i14 == 1) {
                r.b(obj);
                list = (List) obj;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                list = (List) obj;
            }
            for (o13.p pVar : list) {
                hVar.f70129k.put(x.valueOf(((ca0.j.c) pVar.f128594a).f26293a), pVar.f128595b);
            }
            a2 a2Var = a2.DEVICE_SETUP;
            o1 o1Var2 = hVar.f70120b;
            ArrayList arrayList2 = new ArrayList(y.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(x.valueOf(((ca0.j.c) ((o13.p) it.next()).f128594a).f26293a).f143819a);
            }
            i2.f36769a.getClass();
            i2.a.b(a2Var, "ConsentViewModel", "Startup consents required for flow " + o1Var2 + ": " + arrayList2);
            p2 p2Var = hVar.f70130l;
            do {
                value = p2Var.getValue();
                arrayList = new ArrayList(y.r(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList.add((ca0.j.c) ((o13.p) it3.next()).f128594a);
                }
            } while (!p2Var.b(value, arrayList));
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public h(boolean z14, o1 o1Var, q90.c cVar, boolean z15, l lVar, e20.a aVar, f90.f fVar, f90.d dVar, w wVar, z zVar) {
        o1Var.getClass();
        cVar.getClass();
        lVar.getClass();
        aVar.getClass();
        fVar.getClass();
        dVar.getClass();
        wVar.getClass();
        zVar.getClass();
        this.f70119a = z14;
        this.f70120b = o1Var;
        this.f70121c = cVar;
        this.f70122d = z15;
        this.f70123e = lVar;
        this.f70124f = aVar;
        this.f70125g = fVar;
        this.f70126h = dVar;
        this.f70127i = wVar;
        this.f70128j = zVar;
        this.f70129k = new LinkedHashMap();
        p2 p2VarA = q2.a(null);
        this.f70130l = p2VarA;
        this.f70131m = s.K(new v(new b(null), p2VarA), v1.a(this), k2.a.a(k2.f150703a, 2), null);
        p2 p2VarA2 = q2.a(new c(false, null, null, null, null, 31, null));
        this.f70132n = p2VarA2;
        this.f70133o = p2VarA2;
    }

    public final void x4() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f70132n;
            value = p2Var.getValue();
        } while (!p2Var.b(value, new c(false, null, null, null, null, 15, null)));
    }

    public final void y4() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f70132n;
            value = p2Var.getValue();
        } while (!p2Var.b(value, new c(false, null, null, null, null, 27, null)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfa0/h$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(boolean z14, o1 o1Var, q90.c cVar, boolean z15, l lVar, e20.a aVar, f90.f fVar, f90.d dVar, w wVar, z zVar, int i14, p005kotlin.jvm.internal.j jVar) {
        z zVar2;
        if ((i14 & 512) != 0) {
            x53.c cVar2 = s0.f129406a;
            zVar2 = x53.b.f189152a;
        } else {
            zVar2 = zVar;
        }
        this(z14, o1Var, cVar, z15, lVar, aVar, fVar, dVar, wVar, zVar2);
    }
}
