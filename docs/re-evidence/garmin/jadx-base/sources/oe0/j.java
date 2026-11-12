package oe0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.room.a0;
import c22.j0;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import ne0.f0;
import ne0.x;
import ne0.z;
import o53.b0;
import org.joda.time.DateTime;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import r53.a2;
import r53.b2;
import r53.l1;
import r53.p2;
import r53.q2;
import r53.z1;
import yc.h3;
import yc.i0;
import yc.t2;
import yc.u2;
import yc.v2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Loe0/j;", "Landroidx/lifecycle/u1;", "Lorg/koin/core/component/KoinComponent;", "<init>", "()V", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends u1 implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f131284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f131285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f131286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f131287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f131288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b2 f131289f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f131290g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b2 f131291h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f131292i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b2 f131293j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2 f131294k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b2 f131295l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a2 f131296m;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.a<h3<Integer, ActivityListItemDTO>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f131297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f131298b;

        public a(long j8, String str) {
            this.f131297a = j8;
            this.f131298b = str;
        }

        @Override // e23.a
        public final h3<Integer, ActivityListItemDTO> invoke() {
            return new le0.e(this.f131297a, this.f131298b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;", "it", "Lpe0/e$a;", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;)Lpe0/e$a;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.presentation.DogProfileViewModel$dogActivities$3$1", f = "DogProfileViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<ActivityListItemDTO, t13.d<? super pe0.e.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f131299a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f131299a = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(ActivityListItemDTO activityListItemDTO, t13.d<? super pe0.e.a> dVar) {
            return ((b) create(activityListItemDTO, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) this.f131299a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            return new pe0.e.a(activityListItemDTO);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lpe0/e$a;", TtmlNode.ANNOTATION_POSITION_BEFORE, TtmlNode.ANNOTATION_POSITION_AFTER, "Lpe0/e;", "<anonymous>", "(Lpe0/e$a;Lpe0/e$a;)Lpe0/e;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.presentation.DogProfileViewModel$dogActivities$3$2", f = "DogProfileViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.q<pe0.e.a, pe0.e.a, t13.d<? super pe0.e>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ pe0.e.a f131300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ pe0.e.a f131301b;

        public c(t13.d<? super c> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(pe0.e.a aVar, pe0.e.a aVar2, t13.d<? super pe0.e> dVar) {
            c cVar = j.this.new c(dVar);
            cVar.f131300a = aVar;
            cVar.f131301b = aVar2;
            return cVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:18:0x003e  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            String strN;
            String strN2;
            ActivityListItemDTO activityListItemDTO;
            ActivityListItemDTO activityListItemDTO2;
            pe0.e.a aVar = this.f131300a;
            pe0.e.a aVar2 = this.f131301b;
            u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            j jVar = j.this;
            if (aVar == null || (activityListItemDTO2 = aVar.f137418a) == null) {
                strN = null;
            } else {
                jVar.getClass();
                DateTime dateTimeN = j0.N(activityListItemDTO2.f29259e, false);
                if (dateTimeN == null) {
                    strN = null;
                } else {
                    strN = j0.n(dateTimeN, 'M');
                }
            }
            if (aVar2 == null || (activityListItemDTO = aVar2.f137418a) == null) {
                strN2 = null;
            } else {
                jVar.getClass();
                DateTime dateTimeN2 = j0.N(activityListItemDTO.f29259e, false);
                if (dateTimeN2 == null) {
                    strN2 = null;
                } else {
                    strN2 = j0.n(dateTimeN2, 'M');
                }
            }
            if (strN2 == null || strN2.equals(strN)) {
                return null;
            }
            return new pe0.e.b(strN2);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.presentation.DogProfileViewModel$loadDog$2", f = "DogProfileViewModel.kt", l = {91, 95}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z1 f131303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public j f131304b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f131305c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public pe0.f f131306d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f131307e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f131308f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f131309g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ long f131311i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j8, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f131311i = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return j.this.new d(this.f131311i, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x006e  */
        /* JADX WARN: Code duplicated, block: B:17:0x006f A[Catch: Exception -> 0x007a, PHI: r2 r6 r10 r12 r13 r14
          0x006f: PHI (r2v12 int) = (r2v11 int), (r2v13 int) binds: [B:15:0x006c, B:11:0x003a] A[DONT_GENERATE, DONT_INLINE]
          0x006f: PHI (r6v10 java.lang.Object) = (r6v9 java.lang.Object), (r6v14 java.lang.Object) binds: [B:15:0x006c, B:11:0x003a] A[DONT_GENERATE, DONT_INLINE]
          0x006f: PHI (r10v6 long) = (r10v5 long), (r10v7 long) binds: [B:15:0x006c, B:11:0x003a] A[DONT_GENERATE, DONT_INLINE]
          0x006f: PHI (r12v7 java.lang.Object) = (r12v6 java.lang.Object), (r12v8 java.lang.Object) binds: [B:15:0x006c, B:11:0x003a] A[DONT_GENERATE, DONT_INLINE]
          0x006f: PHI (r13v4 oe0.j) = (r13v3 oe0.j), (r13v5 oe0.j) binds: [B:15:0x006c, B:11:0x003a] A[DONT_GENERATE, DONT_INLINE]
          0x006f: PHI (r14v3 r53.z1) = (r14v2 r53.z1), (r14v4 r53.z1) binds: [B:15:0x006c, B:11:0x003a] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {Exception -> 0x007a, blocks: (B:10:0x0037, B:17:0x006f, B:14:0x0046, B:13:0x0040), top: B:38:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:20:0x0078  */
        /* JADX WARN: Code duplicated, block: B:21:0x007a  */
        /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, o13.l] */
        /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object, o13.l] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x006c -> B:17:0x006f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ac -> B:28:0x00b1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00bf -> B:30:0x00c0). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 221
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: oe0.j.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lr53/j;", "it", "", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.presentation.DogProfileViewModel$special$$inlined$flatMapLatest$1", f = "DogProfileViewModel.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.q<r53.j<? super v2<ActivityListItemDTO>>, o13.p<? extends Long, ? extends String>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f131312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ r53.j f131313b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f131314c;

        public e(t13.d dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super v2<ActivityListItemDTO>> jVar, o13.p<? extends Long, ? extends String> pVar, t13.d<? super Unit> dVar) {
            e eVar = new e(dVar);
            eVar.f131313b = jVar;
            eVar.f131314c = pVar;
            return eVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f131312a;
            if (i14 == 0) {
                o13.r.b(obj);
                r53.j jVar = this.f131313b;
                o13.p pVar = (o13.p) this.f131314c;
                int i15 = 10;
                int i16 = 0;
                boolean z14 = false;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                Object obj2 = null;
                t2 t2Var = new t2(new u2(i15, i16, z14, i17, i18, i19, 62, null), obj2, new a(((Number) pVar.f128594a).longValue(), (String) pVar.f128595b), 2, null);
                this.f131313b = null;
                this.f131314c = null;
                this.f131312a = 1;
                if (r53.s.v(jVar, t2Var.f196485a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f131315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f131316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f131317c;

        public f(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f131315a = koinComponent;
            this.f131316b = qualifier;
            this.f131317c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ne0.z] */
        @Override // e23.a
        public final z invoke() {
            KoinComponent koinComponent = this.f131315a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : a0.n(koinComponent)).get((k23.d<?>) s0.f105811a.b(z.class), this.f131316b, this.f131317c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<ne0.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f131318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f131319b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f131320c;

        public g(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f131318a = koinComponent;
            this.f131319b = qualifier;
            this.f131320c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ne0.e] */
        @Override // e23.a
        public final ne0.e invoke() {
            KoinComponent koinComponent = this.f131318a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : a0.n(koinComponent)).get((k23.d<?>) s0.f105811a.b(ne0.e.class), this.f131319b, this.f131320c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.a<f0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f131321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f131322b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f131323c;

        public h(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f131321a = koinComponent;
            this.f131322b = qualifier;
            this.f131323c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ne0.f0] */
        @Override // e23.a
        public final f0 invoke() {
            KoinComponent koinComponent = this.f131321a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : a0.n(koinComponent)).get((k23.d<?>) s0.f105811a.b(f0.class), this.f131322b, this.f131323c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements e23.a<x> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f131324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f131325b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f131326c;

        public i(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f131324a = koinComponent;
            this.f131325b = qualifier;
            this.f131326c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ne0.x] */
        @Override // e23.a
        public final x invoke() {
            KoinComponent koinComponent = this.f131324a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : a0.n(koinComponent)).get((k23.d<?>) s0.f105811a.b(x.class), this.f131325b, this.f131326c);
        }
    }

    /* JADX INFO: renamed from: oe0.j$j, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2495j implements r53.i<o13.p<? extends Long, ? extends String>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f131327a;

        /* JADX INFO: renamed from: oe0.j$j$a */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f131328a;

            /* JADX INFO: renamed from: oe0.j$j$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.presentation.DogProfileViewModel$special$$inlined$map$1$2", f = "DogProfileViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C2496a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f131329a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f131330b;

                public C2496a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f131329a = obj;
                    this.f131330b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f131328a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2496a c2496a;
                if (dVar instanceof C2496a) {
                    c2496a = (C2496a) dVar;
                    int i14 = c2496a.f131330b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2496a.f131330b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2496a = new C2496a(dVar);
                    }
                } else {
                    c2496a = new C2496a(dVar);
                }
                Object obj2 = c2496a.f131329a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2496a.f131330b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    pe0.f fVar = (pe0.f) obj;
                    o13.p pVar = new o13.p(new Long(fVar.f137420a), fVar.f137433n);
                    c2496a.f131330b = 1;
                    if (this.f131328a.emit(pVar, c2496a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public C2495j(r53.i iVar) {
            this.f131327a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super o13.p<? extends Long, ? extends String>> jVar, t13.d dVar) {
            Object objCollect = this.f131327a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class k implements r53.i<v2<pe0.e>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f131332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j f131333b;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f131334a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f131335b;

            /* JADX INFO: renamed from: oe0.j$k$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.presentation.DogProfileViewModel$special$$inlined$map$2$2", f = "DogProfileViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C2497a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f131336a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f131337b;

                public C2497a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f131336a = obj;
                    this.f131337b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar, j jVar2) {
                this.f131334a = jVar;
                this.f131335b = jVar2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2497a c2497a;
                if (dVar instanceof C2497a) {
                    c2497a = (C2497a) dVar;
                    int i14 = c2497a.f131337b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2497a.f131337b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2497a = new C2497a(dVar);
                    }
                } else {
                    c2497a = new C2497a(dVar);
                }
                Object obj2 = c2497a.f131336a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2497a.f131337b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    v2 v2VarD = i0.d(i0.e((v2) obj, new b(null)), this.f131335b.new c(null));
                    c2497a.f131337b = 1;
                    if (this.f131334a.emit(v2VarD, c2497a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public k(r53.i iVar, j jVar) {
            this.f131332a = iVar;
            this.f131333b = jVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super v2<pe0.e>> jVar, t13.d dVar) {
            Object objCollect = this.f131332a.collect(new a(jVar, this.f131333b), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    public j() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        this.f131284a = o13.m.a(koinPlatformTools.defaultLazyMode(), new f(this, null, null));
        this.f131285b = o13.m.a(koinPlatformTools.defaultLazyMode(), new g(this, null, null));
        this.f131286c = o13.m.a(koinPlatformTools.defaultLazyMode(), new h(this, null, null));
        this.f131287d = o13.m.a(koinPlatformTools.defaultLazyMode(), new i(this, null, null));
        p2 p2VarA = q2.a(null);
        this.f131288e = p2VarA;
        this.f131289f = r53.s.d(p2VarA);
        p2 p2VarA2 = q2.a(Boolean.TRUE);
        this.f131290g = p2VarA2;
        this.f131291h = r53.s.d(p2VarA2);
        Boolean bool = Boolean.FALSE;
        p2 p2VarA3 = q2.a(bool);
        this.f131292i = p2VarA3;
        this.f131293j = r53.s.d(p2VarA3);
        p2 p2VarA4 = q2.a(bool);
        this.f131294k = p2VarA4;
        this.f131295l = r53.s.d(p2VarA4);
        this.f131296m = yc.o.a(new k(r53.s.N(r53.s.s(new C2495j(new l1(p2VarA))), new e(null)), this), v1.a(this));
    }

    @Override // org.koin.core.component.KoinComponent
    public final /* bridge */ Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final void x4(long j8) {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f131290g;
            value = p2Var.getValue();
            ((Boolean) value).getClass();
        } while (!p2Var.b(value, Boolean.TRUE));
        ge1.b.T(v1.a(this), null, null, new d(j8, null), 3);
    }
}
