package oe0;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.z1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.presentation.DogsListViewModel$loadAllDogsTimelineStats$1", f = "DogsListViewModel.kt", l = {140}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z1 f131380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f131381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f131382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f131383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f131384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f131385f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l lVar, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f131385f = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f131385f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0052 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x005b  */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0050 -> B:12:0x0053). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0052
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            u13.a r0 = u13.a.COROUTINE_SUSPENDED
            int r1 = r9.f131384e
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 != r3) goto L16
            int r1 = r9.f131383d
            java.lang.Object r4 = r9.f131382c
            oe0.l r5 = r9.f131381b
            r53.z1 r6 = r9.f131380a
            o13.r.b(r10)
            goto L53
        L16:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r10)
            return r2
        L1c:
            o13.r.b(r10)
            oe0.l r10 = r9.f131385f
            r53.p2 r1 = r10.f131359q
            r4 = 0
            r5 = r10
            r6 = r1
            r1 = r4
        L27:
            java.lang.Object r4 = r6.getValue()
            r10 = r4
            pe0.i r10 = (pe0.i) r10
            java.lang.Object r10 = r5.f131344b
            java.lang.Object r10 = r10.getValue()
            ne0.p r10 = (ne0.p) r10
            r9.f131380a = r6
            r9.f131381b = r5
            r9.f131382c = r4
            r9.f131383d = r1
            r9.f131384e = r3
            r10.getClass()
            x53.c r7 = o53.s0.f129406a
            x53.b r7 = x53.b.f189152a
            ne0.o r8 = new ne0.o
            r8.<init>(r10, r2)
            java.lang.Object r10 = ge1.b.e0(r7, r8, r9)
            if (r10 != r0) goto L53
            return r0
        L53:
            pe0.i r10 = (pe0.i) r10
            boolean r10 = r6.b(r4, r10)
            if (r10 == 0) goto L27
            kotlin.Unit r10 = p005kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: oe0.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
