package s1;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ls1/n0;", "", "", Constants.ScionAnalytics.PARAM_LABEL, "<init>", "(Ljava/lang/String;)V", "a", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q3.c<a<?, ?>> f155644a = new q3.c<>(new a[16], 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p3.c2 f155645b = p3.p0.n(Boolean.FALSE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f155646c = Long.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p3.c2 f155647d = p3.p0.n(Boolean.TRUE);

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0004\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004BC\b\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ls1/n0$a;", "T", "Ls1/r;", "V", "Lp3/x3;", "initialValue", "targetValue", "Ls1/c2;", "typeConverter", "Ls1/k;", "animationSpec", "", Constants.ScionAnalytics.PARAM_LABEL, "<init>", "(Ls1/n0;Ljava/lang/Object;Ljava/lang/Object;Ls1/c2;Ls1/k;Ljava/lang/String;)V", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class a<T, V extends r> implements x3<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public T f155648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public T f155649b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c2<T, V> f155650c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final p3.c2 f155651d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public k<T> f155652e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public r1<T, V> f155653f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f155654g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f155655h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f155656i;

        public a(T t7, T t14, c2<T, V> c2Var, k<T> kVar, String str) {
            this.f155648a = t7;
            this.f155649b = t14;
            this.f155650c = c2Var;
            this.f155651d = p3.p0.n(t7);
            this.f155652e = kVar;
            this.f155653f = new r1<>(kVar, c2Var, this.f155648a, this.f155649b, (r) null, 16, (p005kotlin.jvm.internal.j) null);
        }

        @Override // p3.x3
        /* JADX INFO: renamed from: getValue */
        public final T getF182175a() {
            return this.f155651d.getF182175a();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1", f = "InfiniteTransition.kt", l = {TsExtractor.TS_STREAM_TYPE_AC4, 193}, m = "invokeSuspend", v = 1)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p005kotlin.jvm.internal.o0 f155658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f155659b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f155660c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p3.p1<x3<Long>> f155661d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ n0 f155662e;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
        @v13.e(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1$3", f = "InfiniteTransition.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends v13.i implements e23.p<Float, t13.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ float f155663a;

            public a(t13.d<? super a> dVar) {
                super(2, dVar);
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(dVar);
                aVar.f155663a = ((Number) obj).floatValue();
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(Float f14, t13.d<? super Boolean> dVar) {
                return ((a) create(Float.valueOf(f14.floatValue()), dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                return Boolean.valueOf(this.f155663a > 0.0f);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p3.p1<x3<Long>> p1Var, n0 n0Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f155661d = p1Var;
            this.f155662e = n0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = new b(this.f155661d, this.f155662e, dVar);
            bVar.f155660c = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x003d A[PHI: r8 r9
          0x003d: PHI (r8v2 kotlin.jvm.internal.o0) = 
          (r8v0 kotlin.jvm.internal.o0)
          (r8v1 kotlin.jvm.internal.o0)
          (r8v1 kotlin.jvm.internal.o0)
          (r8v4 kotlin.jvm.internal.o0)
         binds: [B:10:0x002b, B:15:0x005a, B:17:0x0076, B:6:0x000c] A[DONT_GENERATE, DONT_INLINE]
          0x003d: PHI (r9v2 o53.b0) = (r9v0 o53.b0), (r9v1 o53.b0), (r9v1 o53.b0), (r9v4 o53.b0) binds: [B:10:0x002b, B:15:0x005a, B:17:0x0076, B:6:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:14:0x0055 A[PHI: r8 r9
          0x0055: PHI (r8v1 kotlin.jvm.internal.o0) = (r8v2 kotlin.jvm.internal.o0), (r8v3 kotlin.jvm.internal.o0) binds: [B:12:0x0052, B:9:0x001f] A[DONT_GENERATE, DONT_INLINE]
          0x0055: PHI (r9v1 o53.b0) = (r9v2 o53.b0), (r9v3 o53.b0) binds: [B:12:0x0052, B:9:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:16:0x005c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005a -> B:11:0x003d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0076 -> B:11:0x003d). Please report as a decompilation issue!!! */
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
                int r1 = r11.f155659b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L18
                kotlin.jvm.internal.o0 r1 = r11.f155658a
                java.lang.Object r4 = r11.f155660c
                o53.b0 r4 = (o53.b0) r4
                o13.r.b(r12)
                r8 = r1
                r9 = r4
                goto L3d
            L18:
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r12)
                r12 = 0
                return r12
            L1f:
                kotlin.jvm.internal.o0 r1 = r11.f155658a
                java.lang.Object r4 = r11.f155660c
                o53.b0 r4 = (o53.b0) r4
                o13.r.b(r12)
                r8 = r1
                r9 = r4
                goto L55
            L2b:
                o13.r.b(r12)
                java.lang.Object r12 = r11.f155660c
                o53.b0 r12 = (o53.b0) r12
                kotlin.jvm.internal.o0 r1 = new kotlin.jvm.internal.o0
                r1.<init>()
                r4 = 1065353216(0x3f800000, float:1.0)
                r1.f105806a = r4
                r9 = r12
                r8 = r1
            L3d:
                mt0.e0 r5 = new mt0.e0
                r10 = 24
                p3.p1<p3.x3<java.lang.Long>> r6 = r11.f155661d
                s1.n0 r7 = r11.f155662e
                r5.<init>(r6, r7, r8, r9, r10)
                r11.f155660c = r9
                r11.f155658a = r8
                r11.f155659b = r3
                java.lang.Object r12 = s1.l0.a(r5, r11)
                if (r12 != r0) goto L55
                goto L78
            L55:
                float r12 = r8.f105806a
                r1 = 0
                int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
                if (r12 != 0) goto L3d
                ki1.o r12 = new ki1.o
                r1 = 2
                r12.<init>(r9, r1)
                r53.c2 r12 = p3.p0.s(r12)
                s1.n0$b$a r1 = new s1.n0$b$a
                r4 = 0
                r1.<init>(r4)
                r11.f155660c = r9
                r11.f155658a = r8
                r11.f155659b = r2
                java.lang.Object r12 = r53.s.w(r12, r1, r11)
                if (r12 != r0) goto L3d
            L78:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: s1.n0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public n0(String str) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-318043801);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(null);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var = (p3.p1) objQ;
            if (((Boolean) this.f155647d.getF182175a()).booleanValue() || ((Boolean) this.f155645b.getF182175a()).booleanValue()) {
                o0VarE.C(-144841960);
                boolean zR = o0VarE.r(this);
                Object objQ2 = o0VarE.q();
                if (zR || objQ2 == c2565a) {
                    objQ2 = new b(p1Var, this, null);
                    o0VarE.K(objQ2);
                }
                p3.l0.e((e23.p) objQ2, this, o0VarE);
            } else {
                o0VarE.C(-151918981);
            }
            o0VarE.g0(false);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r12.a(this, i14, 29);
        }
    }
}
