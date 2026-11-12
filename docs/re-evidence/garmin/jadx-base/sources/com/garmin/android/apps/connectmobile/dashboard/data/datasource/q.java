package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import java.util.Iterator;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.datasource.ActivityTrendsPreferencesDataSourceImpl$fetchServerData$1", f = "ActivityTrendsPreferencesDataSourceImpl.kt", l = {32}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f33317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f33318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o70.c f33319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f33320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f33321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Set<o70.c> f33322f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f33323g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(Set<? extends o70.c> set, p pVar, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f33322f = set;
        this.f33323g = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f33322f, this.f33323g, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    /* JADX WARN: Code duplicated, block: B:13:0x0049 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x004f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0060  */
    /* JADX WARN: Code duplicated, block: B:20:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0047 -> B:14:0x004a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0032
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            u13.a r0 = u13.a.COROUTINE_SUSPENDED
            int r1 = r9.f33321e
            r2 = 1
            if (r1 == 0) goto L1c
            if (r1 != r2) goto L15
            int r1 = r9.f33320d
            o70.c r3 = r9.f33319c
            java.util.Iterator r4 = r9.f33318b
            com.garmin.android.apps.connectmobile.dashboard.data.datasource.p r5 = r9.f33317a
            o13.r.b(r10)
            goto L4a
        L15:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r10)
            r10 = 0
            return r10
        L1c:
            o13.r.b(r10)
            java.util.Set<o70.c> r10 = r9.f33322f
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
            r1 = 0
            com.garmin.android.apps.connectmobile.dashboard.data.datasource.p r3 = r9.f33323g
            r4 = r10
            r5 = r3
        L2c:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L6c
            java.lang.Object r10 = r4.next()
            r3 = r10
            o70.c r3 = (o70.c) r3
            r9.f33317a = r5
            r9.f33318b = r4
            r9.f33319c = r3
            r9.f33320d = r1
            r9.f33321e = r2
            java.lang.Object r10 = com.garmin.android.apps.connectmobile.dashboard.data.datasource.p.c(r5, r3, r9)
            if (r10 != r0) goto L4a
            return r0
        L4a:
            com.garmin.android.apps.connectmobile.dashboard.data.datasource.b2 r10 = (com.garmin.android.apps.connectmobile.dashboard.data.datasource.b2) r10
            r6 = 0
            if (r10 == 0) goto L5e
            r53.p2 r7 = r5.f33309d
            java.lang.Object r8 = r7.getValue()
            java.util.Set r8 = (java.util.Set) r8
            java.util.LinkedHashSet r8 = p13.c1.i(r8, r3)
            r7.k(r6, r8)
        L5e:
            if (r10 == 0) goto L64
            java.lang.Boolean r6 = r10.getValue()
        L64:
            if (r6 == 0) goto L2c
            com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0 r10 = r5.f33307b
            r10.j(r3)
            goto L2c
        L6c:
            kotlin.Unit r10 = p005kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.dashboard.data.datasource.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
