package r53;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lr53/z;", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z implements i<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f150951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.r f150952b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", f = "Errors.kt", l = {113, 115}, m = "collect")
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f150953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f150954b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public z f150956d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public j f150957e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Throwable f150958f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f150959g;

        public a(t13.d dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f150953a = obj;
            this.f150954b |= Integer.MIN_VALUE;
            return z.this.collect(null, this);
        }
    }

    public z(i iVar, e23.r rVar) {
        this.f150951a = iVar;
        this.f150952b = rVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0067  */
    /* JADX WARN: Code duplicated, block: B:32:0x008e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:36:0x0095  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007c -> B:27:0x007f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x008e -> B:30:0x008b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // r53.i
    public final java.lang.Object collect(r53.j<? super java.lang.Object> r10, t13.d<? super p005kotlin.Unit> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof r53.z.a
            if (r0 == 0) goto L13
            r0 = r11
            r53.z$a r0 = (r53.z.a) r0
            int r1 = r0.f150954b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f150954b = r1
            goto L18
        L13:
            r53.z$a r0 = new r53.z$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f150953a
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r0.f150954b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L39
            if (r2 != r3) goto L32
            long r5 = r0.f150959g
            java.lang.Throwable r10 = r0.f150958f
            r53.j r2 = r0.f150957e
            r53.z r7 = r0.f150956d
            o13.r.b(r11)
            goto L7f
        L32:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r10)
            r10 = 0
            return r10
        L39:
            long r5 = r0.f150959g
            r53.j r10 = r0.f150957e
            r53.z r2 = r0.f150956d
            o13.r.b(r11)
            r7 = r2
        L43:
            r2 = r10
            goto L62
        L45:
            o13.r.b(r11)
            r5 = 0
            r11 = r9
        L4b:
            r53.i r2 = r11.f150951a
            r0.f150956d = r11
            r0.f150957e = r10
            r7 = 0
            r0.f150958f = r7
            r0.f150959g = r5
            r0.f150954b = r4
            java.io.Serializable r2 = r53.s.h(r2, r10, r0)
            if (r2 != r1) goto L5f
            goto L7e
        L5f:
            r7 = r11
            r11 = r2
            goto L43
        L62:
            r10 = r11
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            if (r10 == 0) goto L8e
            e23.r r11 = r7.f150952b
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r5)
            r0.f150956d = r7
            r0.f150957e = r2
            r0.f150958f = r10
            r0.f150959g = r5
            r0.f150954b = r3
            java.lang.Object r11 = r11.invoke(r2, r10, r8, r0)
            if (r11 != r1) goto L7f
        L7e:
            return r1
        L7f:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L8d
            r10 = 1
            long r5 = r5 + r10
            r10 = r4
        L8b:
            r11 = r7
            goto L90
        L8d:
            throw r10
        L8e:
            r10 = 0
            goto L8b
        L90:
            if (r10 != 0) goto L95
            kotlin.Unit r10 = p005kotlin.Unit.INSTANCE
            return r10
        L95:
            r10 = r2
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: r53.z.collect(r53.j, t13.d):java.lang.Object");
    }
}
