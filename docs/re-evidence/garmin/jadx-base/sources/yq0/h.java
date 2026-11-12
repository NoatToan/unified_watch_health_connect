package yq0;

import e23.p;
import java.util.LinkedHashMap;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.z1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.insights.presentation.home.InsightsHistogramViewModel$onHistogramSearchFiltersChanged$2", f = "InsightsHistogramViewModel.kt", l = {103}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z1 f198772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public tq0.l f198773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f198774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f198775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinkedHashMap f198776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f198777f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinkedHashMap f198778g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f198779h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f198780i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f198781j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ tq0.l f198782k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, tq0.l lVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f198781j = fVar;
        this.f198782k = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f198781j, this.f198782k, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x006f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0070  */
    /* JADX WARN: Code duplicated, block: B:15:0x007a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0070 -> B:13:0x0071). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:12:0x0070
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            u13.a r0 = u13.a.COROUTINE_SUSPENDED
            int r1 = r13.f198780i
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 != r3) goto L1e
            int r1 = r13.f198779h
            java.util.LinkedHashMap r4 = r13.f198778g
            java.lang.String r5 = r13.f198777f
            java.util.LinkedHashMap r6 = r13.f198776e
            java.lang.Object r7 = r13.f198775d
            yq0.f r8 = r13.f198774c
            tq0.l r9 = r13.f198773b
            r53.z1 r10 = r13.f198772a
            o13.r.b(r14)
            goto L71
        L1e:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r14)
            return r2
        L24:
            o13.r.b(r14)
            yq0.f r14 = r13.f198781j
            r53.p2 r1 = r14.f198749c
            r4 = 0
            tq0.l r5 = r13.f198782k
            r8 = r14
            r10 = r1
            r1 = r4
            r9 = r5
        L32:
            java.lang.Object r7 = r10.getValue()
            r14 = r7
            java.util.Map r14 = (java.util.Map) r14
            java.util.LinkedHashMap r4 = p13.u0.n(r14)
            tq0.a r14 = r9.f166099a
            java.lang.String r5 = r14.f166036a
            rq0.e r14 = r8.f198747a
            r53.p2 r6 = r8.f198748b
            java.lang.Object r6 = r6.getValue()
            yq0.b r6 = (yq0.b) r6
            r13.f198772a = r10
            r13.f198773b = r9
            r13.f198774c = r8
            r13.f198775d = r7
            r13.f198776e = r4
            r13.f198777f = r5
            r13.f198778g = r4
            r13.f198779h = r1
            r13.f198780i = r3
            r14.getClass()
            x53.c r11 = o53.s0.f129406a
            x53.b r11 = x53.b.f189152a
            rq0.f r12 = new rq0.f
            r12.<init>(r14, r6, r9, r2)
            java.lang.Object r14 = ge1.b.e0(r11, r12, r13)
            if (r14 != r0) goto L70
            return r0
        L70:
            r6 = r4
        L71:
            r4.put(r5, r14)
            boolean r14 = r10.b(r7, r6)
            if (r14 == 0) goto L32
            kotlin.Unit r14 = p005kotlin.Unit.INSTANCE
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: yq0.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
