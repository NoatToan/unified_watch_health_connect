package r53;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lr53/l;", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l implements i<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object[] f150707a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1", f = "Builders.kt", l = {110}, m = "collect")
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f150708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f150709b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public l f150711d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public j f150712e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f150713f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f150714g;

        public a(t13.d dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f150708a = obj;
            this.f150709b |= Integer.MIN_VALUE;
            return l.this.collect(null, this);
        }
    }

    public l(Object[] objArr) {
        this.f150707a = objArr;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    /* JADX WARN: Code duplicated, block: B:18:0x0058 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0056 -> B:19:0x0059). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // r53.i
    public final java.lang.Object collect(r53.j<? super java.lang.Object> r7, t13.d<? super p005kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof r53.l.a
            if (r0 == 0) goto L13
            r0 = r8
            r53.l$a r0 = (r53.l.a) r0
            int r1 = r0.f150709b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f150709b = r1
            goto L18
        L13:
            r53.l$a r0 = new r53.l$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f150708a
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r0.f150709b
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L30
            int r7 = r0.f150714g
            int r2 = r0.f150713f
            r53.j r4 = r0.f150712e
            r53.l r5 = r0.f150711d
            o13.r.b(r8)
            r8 = r4
            goto L59
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r7)
            r7 = 0
            return r7
        L37:
            o13.r.b(r8)
            java.lang.Object[] r8 = r6.f150707a
            int r8 = r8.length
            r2 = 0
            r5 = r8
            r8 = r7
            r7 = r5
            r5 = r6
        L42:
            if (r2 >= r7) goto L5b
            java.lang.Object[] r4 = r5.f150707a
            r4 = r4[r2]
            r0.f150711d = r5
            r0.f150712e = r8
            r0.f150713f = r2
            r0.f150714g = r7
            r0.f150709b = r3
            java.lang.Object r4 = r8.emit(r4, r0)
            if (r4 != r1) goto L59
            return r1
        L59:
            int r2 = r2 + r3
            goto L42
        L5b:
            kotlin.Unit r7 = p005kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r53.l.collect(r53.j, t13.d):java.lang.Object");
    }
}
