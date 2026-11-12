package s1;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", l = {418}, m = "invokeSuspend", v = 1)
public final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q53.k f155548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f155549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f155550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q53.i<Object> f155551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b<Object, Object> f155552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x3<k<Object>> f155553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x3<e23.l<Object, Unit>> f155554g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1", f = "AnimateAsState.kt", l = {427}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f155555a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f155556b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b<Object, Object> f155557c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x3<k<Object>> f155558d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x3<e23.l<Object, Unit>> f155559e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, b<Object, Object> bVar, x3<? extends k<Object>> x3Var, x3<? extends e23.l<Object, Unit>> x3Var2, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f155556b = obj;
            this.f155557c = bVar;
            this.f155558d = x3Var;
            this.f155559e = x3Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f155556b, this.f155557c, this.f155558d, this.f155559e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            a aVar;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f155555a;
            b<Object, Object> bVar = this.f155557c;
            if (i14 == 0) {
                o13.r.b(obj);
                if (!p005kotlin.jvm.internal.s.g(this.f155556b, bVar.f155491e.getF182175a())) {
                    j1<Float> j1Var = f.f155577a;
                    k<Object> f182175a = this.f155558d.getF182175a();
                    this.f155555a = 1;
                    aVar = this;
                    if (b.c(this.f155557c, this.f155556b, f182175a, null, aVar, 12) == aVar2) {
                        return aVar2;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            aVar = this;
            j1<Float> j1Var2 = f.f155577a;
            e23.l<Object, Unit> f182175a2 = aVar.f155559e.getF182175a();
            if (f182175a2 != null) {
                f182175a2.invoke(bVar.e());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(q53.i<Object> iVar, b<Object, Object> bVar, x3<? extends k<Object>> x3Var, x3<? extends e23.l<Object, Unit>> x3Var2, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f155551d = iVar;
        this.f155552e = bVar;
        this.f155553f = x3Var;
        this.f155554g = x3Var2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f155551d, this.f155552e, this.f155553f, this.f155554g, dVar);
        eVar.f155550c = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0034 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x004d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0032 -> B:12:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0034
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            u13.a r0 = u13.a.COROUTINE_SUSPENDED
            int r1 = r12.f155549b
            q53.i<java.lang.Object> r2 = r12.f155551d
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 != r3) goto L15
            q53.k r1 = r12.f155548a
            java.lang.Object r4 = r12.f155550c
            o53.b0 r4 = (o53.b0) r4
            o13.r.b(r13)
            goto L35
        L15:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r13)
            r13 = 0
            return r13
        L1c:
            o13.r.b(r13)
            java.lang.Object r13 = r12.f155550c
            o53.b0 r13 = (o53.b0) r13
            q53.k r1 = r2.iterator()
            r4 = r13
        L28:
            r12.f155550c = r4
            r12.f155548a = r1
            r12.f155549b = r3
            java.lang.Object r13 = r1.a(r12)
            if (r13 != r0) goto L35
            return r0
        L35:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L60
            java.lang.Object r13 = r1.next()
            java.lang.Object r5 = r2.k()
            java.lang.Object r5 = q53.m.b(r5)
            if (r5 != 0) goto L4d
            r7 = r13
            goto L4e
        L4d:
            r7 = r5
        L4e:
            s1.e$a r6 = new s1.e$a
            p3.x3<e23.l<java.lang.Object, kotlin.Unit>> r10 = r12.f155554g
            r11 = 0
            s1.b<java.lang.Object, java.lang.Object> r8 = r12.f155552e
            p3.x3<s1.k<java.lang.Object>> r9 = r12.f155553f
            r6.<init>(r7, r8, r9, r10, r11)
            r13 = 3
            r5 = 0
            ge1.b.T(r4, r5, r5, r6, r13)
            goto L28
        L60:
            kotlin.Unit r13 = p005kotlin.Unit.INSTANCE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
