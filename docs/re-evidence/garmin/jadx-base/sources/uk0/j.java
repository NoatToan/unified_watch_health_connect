package uk0;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.k2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp3/k2;", "Lb63/o;", "", "<anonymous>", "(Lp3/k2;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.shared.GearDisplayUtil$provideCurrentDate$1$1", f = "GearDisplayUtil.kt", l = {37}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<k2<b63.o>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f171832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f171833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f171834c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(long j8, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f171834c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j jVar = new j(this.f171834c, dVar);
        jVar.f171833b = obj;
        return jVar;
    }

    @Override // e23.p
    public final Object invoke(k2<b63.o> k2Var, t13.d<? super Unit> dVar) {
        return ((j) create(k2Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    /* JADX WARN: Code duplicated, block: B:13:0x002d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002b -> B:14:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f171833b
            p3.k2 r0 = (p3.k2) r0
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r6.f171832a
            r3 = 1
            if (r2 == 0) goto L18
            if (r2 != r3) goto L11
            o13.r.b(r7)
            goto L2e
        L11:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r7)
            r7 = 0
            return r7
        L18:
            o13.r.b(r7)
        L1b:
            boolean r7 = o53.c0.g(r0)
            if (r7 == 0) goto L38
            r6.f171833b = r0
            r6.f171832a = r3
            long r4 = r6.f171834c
            java.lang.Object r7 = o53.m0.c(r4, r6)
            if (r7 != r1) goto L2e
            return r1
        L2e:
            b63.o$a r7 = b63.o.INSTANCE
            b63.o r7 = g22.l.d(r7)
            r0.setValue(r7)
            goto L1b
        L38:
            kotlin.Unit r7 = p005kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: uk0.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
