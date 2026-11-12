package ky0;

import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailViewModel$saveImages$1", f = "MultiDayActivitiesDetailViewModel.kt", l = {840, 845}, m = "invokeSuspend", v = 2)
public final class q1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w0 f107463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f107464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f107465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f107466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f107467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w0 f107468f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List<bq0.k> f107469g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(w0 w0Var, List<bq0.k> list, t13.d<? super q1> dVar) {
        super(2, dVar);
        this.f107468f = w0Var;
        this.f107469g = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        q1 q1Var = new q1(this.f107468f, this.f107469g, dVar);
        q1Var.f107467e = obj;
        return q1Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0081  */
    /* JADX WARN: Code duplicated, block: B:22:0x0095  */
    /* JADX WARN: Code duplicated, block: B:24:0x009d  */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0092 -> B:30:0x00b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x009b -> B:30:0x00b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00a3 -> B:30:0x00b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ab -> B:30:0x00b3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:24:0x009d
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f107467e
            o53.b0 r0 = (o53.b0) r0
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r12.f107466d
            r3 = 1
            ky0.w0 r4 = r12.f107468f
            r5 = 2
            if (r2 == 0) goto L28
            if (r2 == r3) goto L24
            if (r2 != r5) goto L1d
            int r2 = r12.f107465c
            java.util.Iterator r3 = r12.f107464b
            ky0.w0 r4 = r12.f107463a
            o13.r.b(r13)
            goto Lb3
        L1d:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r13)
        L22:
            r13 = 0
            return r13
        L24:
            o13.r.b(r13)
            goto L51
        L28:
            o13.r.b(r13)
            java.lang.Object r13 = r4.X
            java.lang.Object r13 = r13.getValue()
            r9 = r13
            gy0.a2 r9 = (gy0.a2) r9
            java.lang.String r10 = r4.f107579b
            r12.f107467e = r0
            r12.f107466d = r3
            r9.getClass()
            r13 = 3
            z53.g r8 = z53.h.a(r13)
            gy0.v1 r6 = new gy0.v1
            r11 = 0
            java.util.List<bq0.k> r7 = r12.f107469g
            r6.<init>(r7, r8, r9, r10, r11)
            java.lang.Object r13 = o53.c0.e(r6, r12)
            if (r13 != r1) goto L51
            goto L94
        L51:
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.Iterator r13 = r13.iterator()
            r2 = 0
            r3 = r13
        L59:
            boolean r13 = r3.hasNext()
            if (r13 == 0) goto Lb7
            java.lang.Object r13 = r3.next()
            gy0.m r13 = (gy0.m) r13
            com.garmin.android.apps.connectmobile.a2 r6 = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Upload Photos - saveImages - result:"
            r7.<init>(r8)
            r7.append(r13)
            java.lang.String r7 = r7.toString()
            com.garmin.android.apps.connectmobile.i2$a r8 = com.garmin.android.apps.connectmobile.i2.f36769a
            r8.getClass()
            com.garmin.android.apps.connectmobile.i2.a.a(r6, r7)
            boolean r6 = r13 instanceof gy0.m.d
            if (r6 == 0) goto L95
            r4.Q4()
            r12.f107467e = r0
            r12.f107463a = r4
            r12.f107464b = r3
            r12.f107465c = r2
            r12.f107466d = r5
            java.lang.Object r13 = r4.M4(r12)
            if (r13 != r1) goto Lb3
        L94:
            return r1
        L95:
            gy0.m$b r6 = gy0.m.b.f80193a
            boolean r6 = p005kotlin.jvm.internal.s.g(r13, r6)
            if (r6 != 0) goto Lb3
            gy0.m$c r6 = gy0.m.c.f80194a
            boolean r6 = p005kotlin.jvm.internal.s.g(r13, r6)
            if (r6 != 0) goto Lb3
            gy0.m$a r6 = gy0.m.a.f80192a
            boolean r13 = p005kotlin.jvm.internal.s.g(r13, r6)
            if (r13 == 0) goto Lae
            goto Lb3
        Lae:
            lc.u0.r()
            goto L22
        Lb3:
            r4.B4()
            goto L59
        Lb7:
            kotlin.Unit r13 = p005kotlin.Unit.INSTANCE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ky0.q1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
