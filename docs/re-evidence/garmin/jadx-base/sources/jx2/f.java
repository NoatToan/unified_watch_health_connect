package jx2;

import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lkx2/a;", "<anonymous>", "(Lo53/b0;)Lkotlin/Array;"}, k = 3, mv = {1, 9, 0})
@v13.e(c = "com.garmin.samd.manager.SaMDAccountManager$getAllEnabledDeviceHealthFeatures$2", f = "SaMDAccountManager.kt", l = {287}, m = "invokeSuspend")
public final class f extends v13.i implements e23.p<b0, t13.d<? super kx2.a[]>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f101530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public kx2.a[] f101531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f101532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public kx2.a f101533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f101534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f101535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f101536g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f101537h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b f101538i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f101539j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b bVar, long j8, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f101538i = bVar;
        this.f101539j = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f101538i, this.f101539j, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super kx2.a[]> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0075 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x0076  */
    /* JADX WARN: Code duplicated, block: B:21:0x0084 A[Catch: Exception -> 0x001d, TRY_LEAVE, TryCatch #0 {Exception -> 0x001d, blocks: (B:6:0x0018, B:19:0x007c, B:21:0x0084), top: B:30:0x0018 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0076 -> B:19:0x007c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r0 = r14.f101537h
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L27
            if (r0 != r3) goto L20
            int r4 = r14.f101536g
            int r5 = r14.f101535f
            long r6 = r14.f101534e
            kx2.a r8 = r14.f101533d
            jx2.b r9 = r14.f101532c
            kx2.a[] r10 = r14.f101531b
            java.util.List r11 = r14.f101530a
            o13.r.b(r15)     // Catch: java.lang.Exception -> L1d
            r0 = r15
            goto L7c
        L1d:
            r0 = move-exception
            goto L94
        L20:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r0)
            r0 = 0
            return r0
        L27:
            o13.r.b(r15)
            java.lang.String r0 = "getAllEnabledDeviceHealthFeatures"
            jx2.b r4 = r14.f101538i
            org.slf4j.Logger r5 = r4.d()
            r5.debug(r0)
            p13.j0 r0 = p13.j0.f134944a
            java.util.ArrayList r0 = p13.h0.d1(r0)
            kx2.a[] r5 = kx2.a.values()
            int r6 = r5.length
            long r7 = r14.f101539j
            r11 = r7
            r8 = r4
            r4 = r6
            r6 = r11
            r13 = r0
            r11 = r2
            r12 = r5
        L49:
            if (r11 >= r4) goto Lb2
            r9 = r12[r11]
            r14.f101530a = r13     // Catch: java.lang.Exception -> L92
            r14.f101531b = r12     // Catch: java.lang.Exception -> L92
            r14.f101532c = r8     // Catch: java.lang.Exception -> L92
            r14.f101533d = r9     // Catch: java.lang.Exception -> L92
            r14.f101534e = r6     // Catch: java.lang.Exception -> L92
            r14.f101535f = r11     // Catch: java.lang.Exception -> L92
            r14.f101536g = r4     // Catch: java.lang.Exception -> L92
            r14.f101537h = r3     // Catch: java.lang.Exception -> L92
            r8.getClass()     // Catch: java.lang.Exception -> L92
            gx2.b$d r0 = gx2.b.f80060a     // Catch: java.lang.Exception -> L92
            r0.getClass()     // Catch: java.lang.Exception -> L92
            o53.z r0 = gx2.b.d.a()     // Catch: java.lang.Exception -> L92
            jx2.g r5 = new jx2.g     // Catch: java.lang.Exception -> L92
            r10 = 0
            r5.<init>(r6, r8, r9, r10)     // Catch: java.lang.Exception -> L92
            java.lang.Object r0 = ge1.b.e0(r0, r5, r14)     // Catch: java.lang.Exception -> L92
            if (r0 != r1) goto L76
            return r1
        L76:
            r5 = r9
            r9 = r8
            r8 = r5
            r5 = r11
            r10 = r12
            r11 = r13
        L7c:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L1d
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L1d
            if (r0 == 0) goto L87
            r11.add(r8)     // Catch: java.lang.Exception -> L1d
        L87:
            r8 = r9
            r12 = r10
            r13 = r11
            goto Laf
        L8b:
            r5 = r9
            r9 = r8
            r8 = r5
            r5 = r11
            r10 = r12
            r11 = r13
            goto L94
        L92:
            r0 = move-exception
            goto L8b
        L94:
            java.lang.String r8 = r8.name()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "getAllEnabledDeviceHealthFeatures: ["
            r12.<init>(r13)
            r12.append(r8)
            java.lang.String r8 = "]"
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            r9.f(r0, r8)
            goto L87
        Laf:
            int r11 = r5 + 1
            goto L49
        Lb2:
            kx2.a[] r0 = new kx2.a[r2]
            java.lang.Object[] r0 = r13.toArray(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jx2.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
