package i2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li2/c;", "Li2/a;", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c implements i2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q3.c<e> f87117a = new q3.c<>(new e[16], 0);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @v13.e(c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", f = "BringIntoViewRequester.kt", l = {102}, m = "bringIntoView", v = 1)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public n4.d f87118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object[] f87119b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f87120c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f87121d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f87122e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f87124g;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f87122e = obj;
            this.f87124g |= Integer.MIN_VALUE;
            return c.this.a(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    /* JADX WARN: Code duplicated, block: B:18:0x0064 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0062 -> B:19:0x0065). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // i2.a
    public final java.lang.Object a(n4.d r10, t13.d<? super p005kotlin.Unit> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof i2.c.a
            if (r0 == 0) goto L13
            r0 = r11
            i2.c$a r0 = (i2.c.a) r0
            int r1 = r0.f87124g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f87124g = r1
            goto L18
        L13:
            i2.c$a r0 = new i2.c$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f87122e
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r0.f87124g
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L30
            int r10 = r0.f87121d
            int r2 = r0.f87120c
            java.lang.Object[] r4 = r0.f87119b
            n4.d r5 = r0.f87118a
            o13.r.b(r11)
            r11 = r5
            goto L65
        L30:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r10)
            r10 = 0
            return r10
        L37:
            o13.r.b(r11)
            q3.c<i2.e> r11 = r9.f87117a
            T[] r2 = r11.f142356a
            int r11 = r11.f142358c
            r4 = 0
            r8 = r11
            r11 = r10
            r10 = r8
            r8 = r4
            r4 = r2
            r2 = r8
        L47:
            if (r2 >= r10) goto L67
            r5 = r4[r2]
            i2.e r5 = (i2.e) r5
            h62.j r6 = new h62.j
            r7 = 24
            r6.<init>(r11, r7)
            r0.f87118a = r11
            r0.f87119b = r4
            r0.f87120c = r2
            r0.f87121d = r10
            r0.f87124g = r3
            java.lang.Object r5 = m5.c.a(r5, r6, r0)
            if (r5 != r1) goto L65
            return r1
        L65:
            int r2 = r2 + r3
            goto L47
        L67:
            kotlin.Unit r10 = p005kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.c.a(n4.d, t13.d):java.lang.Object");
    }
}
