package o52;

import e23.p;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import m52.k;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lsd2/f;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.domain.GetStartWorkoutTypeUseCase$invoke$screenlessDevices$1", f = "GetStartWorkoutTypeUseCase.kt", l = {28}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, t13.d<? super List<? extends sd2.f>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f129284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f129285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Collection f129286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f129287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f129288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f129289f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f129290g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f129291h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List<sd2.f> f129292i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f129293j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k f129294k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(List<? extends sd2.f> list, c cVar, k kVar, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f129292i = list;
        this.f129293j = cVar;
        this.f129294k = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f129292i, this.f129293j, this.f129294k, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super List<? extends sd2.f>> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0043  */
    /* JADX WARN: Code duplicated, block: B:14:0x006d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x0074  */
    /* JADX WARN: Code duplicated, block: B:18:0x0081  */
    /* JADX WARN: Code duplicated, block: B:20:0x0085  */
    /* JADX WARN: Code duplicated, block: B:22:0x0088  */
    /* JADX WARN: Code duplicated, block: B:23:0x008c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x006b -> B:15:0x006e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:14:0x006d
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            u13.a r0 = u13.a.COROUTINE_SUSPENDED
            int r1 = r13.f129291h
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L25
            if (r1 != r2) goto L1e
            int r1 = r13.f129290g
            int r4 = r13.f129289f
            java.lang.Object r5 = r13.f129288e
            java.util.Iterator r6 = r13.f129287d
            java.util.Collection r7 = r13.f129286c
            java.util.Collection r7 = (java.util.Collection) r7
            m52.k r8 = r13.f129285b
            o52.c r9 = r13.f129284a
            o13.r.b(r14)
            goto L6e
        L1e:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r14)
        L23:
            r14 = 0
            return r14
        L25:
            o13.r.b(r14)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.List<sd2.f> r1 = r13.f129292i
            java.util.Iterator r1 = r1.iterator()
            o52.c r4 = r13.f129293j
            m52.k r5 = r13.f129294k
            r7 = r14
            r6 = r1
            r1 = r3
            r9 = r4
            r8 = r5
            r4 = r1
        L3d:
            boolean r14 = r6.hasNext()
            if (r14 == 0) goto L90
            java.lang.Object r5 = r6.next()
            r14 = r5
            sd2.f r14 = (sd2.f) r14
            pc0.j r10 = r9.f129296a
            long r11 = r14.getUnitID()
            java.lang.String r14 = java.lang.String.valueOf(r11)
            r13.f129284a = r9
            r13.f129285b = r8
            r11 = r7
            java.util.Collection r11 = (java.util.Collection) r11
            r13.f129286c = r11
            r13.f129287d = r6
            r13.f129288e = r5
            r13.f129289f = r4
            r13.f129290g = r1
            r13.f129291h = r2
            java.lang.Object r14 = r10.g(r14, r13)
            if (r14 != r0) goto L6e
            return r0
        L6e:
            com.garmin.android.apps.connectmobile.v2 r14 = (com.garmin.android.apps.connectmobile.v2) r14
            boolean r10 = r14 instanceof com.garmin.android.apps.connectmobile.v2.b
            if (r10 == 0) goto L81
            o52.d r10 = r9.f129299d
            com.garmin.android.apps.connectmobile.v2$b r14 = (com.garmin.android.apps.connectmobile.v2.b) r14
            T r14 = r14.f47386a
            com.garmin.android.apps.connectmobile.devices.model.m r14 = (com.garmin.android.apps.connectmobile.devices.model.m) r14
            boolean r14 = o52.d.a(r14, r8)
            goto L86
        L81:
            boolean r14 = r14 instanceof com.garmin.android.apps.connectmobile.v2.a
            if (r14 == 0) goto L8c
            r14 = r3
        L86:
            if (r14 == 0) goto L3d
            r7.add(r5)
            goto L3d
        L8c:
            lc.u0.r()
            goto L23
        L90:
            java.util.List r7 = (java.util.List) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o52.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
