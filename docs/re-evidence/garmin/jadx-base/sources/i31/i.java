package i31;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements r53.i<List<? extends k31.a>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f90695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f90696b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f90697a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f90698b;

        /* JADX INFO: renamed from: i31.i$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.domain.GetDeviceOnboardingHomeItemsUseCase$invoke$lambda$0$$inlined$map$1$2", f = "GetDeviceOnboardingHomeItemsUseCase.kt", l = {119, 50}, m = "emit", v = 2)
        public static final class C1740a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f90699a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f90700b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public r53.j f90702d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public Collection f90703e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public Iterator f90704f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public List f90705g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public String f90706h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public String f90707i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public String f90708j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public d31.a f90709k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public int f90710l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public int f90711m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public int f90712n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public int f90713o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public int f90714p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public long f90715q;

            public C1740a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f90699a = obj;
                this.f90700b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar, f fVar) {
            this.f90697a = jVar;
            this.f90698b = fVar;
        }

        /* JADX WARN: Code duplicated, block: B:165:0x01d6 A[EDGE_INSN: B:165:0x01d6->B:86:0x01d6 BREAK  A[LOOP:3: B:79:0x01b2->B:84:0x01cb], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Code duplicated, block: B:81:0x01b8  */
        /* JADX WARN: Code duplicated, block: B:84:0x01cb A[LOOP:3: B:79:0x01b2->B:84:0x01cb, LOOP_END] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x015e -> B:55:0x016a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x0213 -> B:90:0x0222). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // r53.j
        public final java.lang.Object emit(java.lang.Object r29, t13.d r30) {
            /*
                Method dump skipped, instruction units count: 874
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: i31.i.a.emit(java.lang.Object, t13.d):java.lang.Object");
        }
    }

    public i(r53.i iVar, f fVar) {
        this.f90695a = iVar;
        this.f90696b = fVar;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super List<? extends k31.a>> jVar, t13.d dVar) {
        Object objCollect = this.f90695a.collect(new a(jVar, this.f90696b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
