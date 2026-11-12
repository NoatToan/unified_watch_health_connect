package n70;

import com.garmin.android.gfdi.configuration.SupportedCapability;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v2 implements r53.i<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f124681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w2 f124682b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f124683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ w2 f124684b;

        /* JADX INFO: renamed from: n70.v2$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetLiveTrackContactsStateUseCase$invoke$$inlined$map$1$2", f = "GetLiveTrackContactsStateUseCase.kt", l = {51, 50}, m = "emit", v = 2)
        public static final class C2390a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f124685a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f124686b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public r53.j f124688d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public List f124689e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public int f124690f;

            public C2390a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f124685a = obj;
                this.f124686b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar, w2 w2Var) {
            this.f124683a = jVar;
            this.f124684b = w2Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00ad, code lost:
        
            if (r7.emit(r13, r0) == r1) goto L29;
         */
        @Override // r53.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, t13.d dVar) {
            C2390a c2390a;
            List list;
            r53.j jVar;
            int i14;
            if (dVar instanceof C2390a) {
                c2390a = (C2390a) dVar;
                int i15 = c2390a.f124686b;
                if ((i15 & Integer.MIN_VALUE) != 0) {
                    c2390a.f124686b = i15 - Integer.MIN_VALUE;
                } else {
                    c2390a = new C2390a(dVar);
                }
            } else {
                c2390a = new C2390a(dVar);
            }
            Object objJ = c2390a.f124685a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i16 = c2390a.f124686b;
            w2 w2Var = this.f124684b;
            boolean z14 = false;
            if (i16 != 0) {
                if (i16 == 1) {
                    i14 = c2390a.f124690f;
                    list = c2390a.f124689e;
                    jVar = c2390a.f124688d;
                    o13.r.b(objJ);
                } else {
                    if (i16 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(objJ);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(objJ);
            list = (List) obj;
            zd0.j1 j1Var = w2Var.f124709c;
            c80.q qVar = c80.q.LIVE_TRACK_PLUS;
            jVar = this.f124683a;
            c2390a.f124688d = jVar;
            c2390a.f124689e = list;
            c2390a.f124690f = 0;
            c2390a.f124686b = 1;
            objJ = j1Var.j(qVar, c2390a);
            if (objJ != aVar) {
                i14 = 0;
            }
            return aVar;
            boolean z15 = objJ instanceof c80.p.c;
            boolean zX0 = w2Var.f124708b.c().X0();
            boolean zH = km2.a.h(p13.u.m0(new Integer[]{new Integer(SupportedCapability.LIVETRACK.ordinal()), new Integer(SupportedCapability.DEVICE_DRIVEN_LIVETRACK_SUPPORT.ordinal())}));
            if (!z15 && zX0 && zH && !list.contains(o70.f.LIVE_TRACK_CONTACTS.f129989a)) {
                z14 = true;
            }
            Boolean boolValueOf = Boolean.valueOf(z14);
            c2390a.f124688d = null;
            c2390a.f124689e = null;
            c2390a.f124690f = i14;
            c2390a.f124686b = 2;
        }
    }

    public v2(r53.i iVar, w2 w2Var) {
        this.f124681a = iVar;
        this.f124682b = w2Var;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super Boolean> jVar, t13.d dVar) {
        Object objCollect = this.f124681a.collect(new a(jVar, this.f124682b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
