package po2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.TransitCardOperationFlowBuilder$launchTimer$1", f = "TransitCardOperationFlowBuilder.kt", l = {259, 265}, m = "invokeSuspend", v = 2)
public final class t0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f139384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f139385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k0<Object> f139386c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(long j8, k0<Object> k0Var, t13.d<? super t0> dVar) {
        super(2, dVar);
        this.f139385b = j8;
        this.f139386c = k0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new t0(this.f139385b, this.f139386c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((t0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004f  */
    /* JADX WARN: Code duplicated, block: B:19:0x005b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004d -> B:17:0x0050). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            u13.a r0 = u13.a.COROUTINE_SUSPENDED
            int r1 = r11.f139384a
            r2 = 2
            r3 = 1
            long r4 = r11.f139385b
            po2.k0<java.lang.Object> r6 = r11.f139386c
            if (r1 == 0) goto L21
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L14
            o13.r.b(r12)
            goto L74
        L14:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r12)
            r12 = 0
            return r12
        L1b:
            o13.r.b(r12)     // Catch: java.lang.Exception -> L1f
            goto L50
        L1f:
            r12 = move-exception
            goto L64
        L21:
            o13.r.b(r12)
            org.slf4j.Logger r12 = po2.k0.f139257k
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r7 = "Transit card operation timer start "
            r1.<init>(r7)
            r1.append(r4)
            java.lang.String r7 = " millisec"
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r12.info(r1)
            r6.r()
        L3f:
            long r7 = r6.f139262e     // Catch: java.lang.Exception -> L1f
            long r7 = r7 + r4
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L1f
            long r7 = r7 - r9
            r11.f139384a = r3     // Catch: java.lang.Exception -> L1f
            java.lang.Object r12 = o53.m0.b(r7, r11)     // Catch: java.lang.Exception -> L1f
            if (r12 != r0) goto L50
            goto L73
        L50:
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L1f
            long r9 = r6.f139262e     // Catch: java.lang.Exception -> L1f
            long r7 = r7 - r9
            int r12 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r12 >= 0) goto L5c
            goto L3f
        L5c:
            java.util.concurrent.TimeoutException r12 = new java.util.concurrent.TimeoutException     // Catch: java.lang.Exception -> L1f
            java.lang.String r1 = "Operation timeout"
            r12.<init>(r1)     // Catch: java.lang.Exception -> L1f
            throw r12     // Catch: java.lang.Exception -> L1f
        L64:
            org.slf4j.Logger r1 = po2.k0.f139257k
            java.lang.String r3 = "Something wrong when operate Snowball card, stop operation"
            r1.error(r3, r12)
            r11.f139384a = r2
            java.lang.Object r12 = r6.b(r11, r12)
            if (r12 != r0) goto L74
        L73:
            return r0
        L74:
            kotlin.Unit r12 = p005kotlin.Unit.INSTANCE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: po2.t0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
