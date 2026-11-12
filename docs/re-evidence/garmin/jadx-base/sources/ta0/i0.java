package ta0;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.z1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.discovery.DeviceScanChecksViewModel$checkDeviceScanUnavailableReason$1", f = "DeviceScanChecksViewModel.kt", l = {24}, m = "invokeSuspend", v = 2)
public final class i0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z1 f163364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k0 f163365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l90.b f163366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f163367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f163368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f163369f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k0 f163370g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l90.b f163371h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(k0 k0Var, l90.b bVar, t13.d<? super i0> dVar) {
        super(2, dVar);
        this.f163370g = k0Var;
        this.f163371h = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i0(this.f163370g, this.f163371h, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0053  */
    /* JADX WARN: Code duplicated, block: B:15:0x0059  */
    /* JADX WARN: Code duplicated, block: B:18:0x0065  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x004c -> B:12:0x004f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:18:0x0065
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            u13.a r0 = u13.a.COROUTINE_SUSPENDED
            int r1 = r10.f163369f
            r2 = 1
            if (r1 == 0) goto L1e
            if (r1 != r2) goto L17
            int r1 = r10.f163368e
            java.lang.Object r3 = r10.f163367d
            l90.b r4 = r10.f163366c
            ta0.k0 r5 = r10.f163365b
            r53.z1 r6 = r10.f163364a
            o13.r.b(r11)
            goto L4f
        L17:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r11)
            r11 = 0
            return r11
        L1e:
            o13.r.b(r11)
            ta0.k0 r11 = r10.f163370g
            r53.p2 r1 = r11.f163381c
            r3 = 0
            l90.b r4 = r10.f163371h
            r5 = r11
            r6 = r1
            r1 = r3
        L2b:
            java.lang.Object r3 = r6.getValue()
            r11 = r3
            va0.b r11 = (va0.b) r11
            k90.l0 r11 = r5.f163379a
            r10.f163364a = r6
            r10.f163365b = r5
            r10.f163366c = r4
            r10.f163367d = r3
            r10.f163368e = r1
            r10.f163369f = r2
            o53.z r7 = r11.f103580d
            k90.j0 r8 = new k90.j0
            r9 = 0
            r8.<init>(r11, r4, r9)
            java.lang.Object r11 = ge1.b.e0(r7, r8, r10)
            if (r11 != r0) goto L4f
            return r0
        L4f:
            l90.f r11 = (l90.f) r11
            if (r11 != 0) goto L59
            va0.b$a r11 = new va0.b$a
            r11.<init>(r4)
            goto L5f
        L59:
            va0.b$b r7 = new va0.b$b
            r7.<init>(r11, r4)
            r11 = r7
        L5f:
            boolean r11 = r6.b(r3, r11)
            if (r11 == 0) goto L2b
            kotlin.Unit r11 = p005kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ta0.i0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
