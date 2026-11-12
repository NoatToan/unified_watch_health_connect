package ht2;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lo53/b0;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.garmin.inappupdate.InAppUpdateControlledRunner$cancelPreviousThenRun$2", f = "InAppUpdateControlledRunner.kt", l = {91, 93, 96}, m = "invokeSuspend")
public final class p extends v13.i implements e23.p<b0, t13.d<Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f85676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f85677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q<Object> f85678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l<t13.d<Object>, Object> f85679d;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lo53/b0;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "com.garmin.inappupdate.InAppUpdateControlledRunner$cancelPreviousThenRun$2$newTask$1", f = "InAppUpdateControlledRunner.kt", l = {72}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<b0, t13.d<Object>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f85680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l<t13.d<Object>, Object> f85681b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.l<? super t13.d<Object>, ? extends Object> lVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f85681b = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f85681b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<Object> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f85680a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f85680a = 1;
                Object objInvoke = this.f85681b.invoke(this);
                return objInvoke == aVar ? aVar : objInvoke;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(q<Object> qVar, e23.l<? super t13.d<Object>, ? extends Object> lVar, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f85678c = qVar;
        this.f85679d = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        p pVar = new p(this.f85678c, this.f85679d, dVar);
        pVar.f85677b = obj;
        return pVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<Object> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004c A[PHI: r1
      0x004c: PHI (r1v5 o53.i0<java.lang.Object>) = (r1v3 o53.i0<java.lang.Object>), (r1v4 o53.i0<java.lang.Object>), (r1v9 o53.i0<java.lang.Object>) binds: [B:13:0x002d, B:22:0x0071, B:11:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x0054  */
    /* JADX WARN: Code duplicated, block: B:18:0x005e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0069 A[PHI: r1
      0x0069: PHI (r1v4 o53.i0<java.lang.Object>) = (r1v5 o53.i0<java.lang.Object>), (r1v5 o53.i0<java.lang.Object>), (r1v7 o53.i0<java.lang.Object>) binds: [B:17:0x005c, B:19:0x0066, B:12:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x007f A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0071 -> B:14:0x004c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            u13.a r0 = u13.a.COROUTINE_SUSPENDED
            int r1 = r9.f85676a
            r2 = 3
            r3 = 2
            r4 = 1
            ht2.q<java.lang.Object> r5 = r9.f85678c
            r6 = 0
            if (r1 == 0) goto L2d
            if (r1 == r4) goto L25
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L16
            o13.r.b(r10)
            return r10
        L16:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r10)
            r10 = 0
            return r10
        L1d:
            java.lang.Object r1 = r9.f85677b
            o53.i0 r1 = (o53.i0) r1
            o13.r.b(r10)
            goto L4c
        L25:
            java.lang.Object r1 = r9.f85677b
            o53.i0 r1 = (o53.i0) r1
            o13.r.b(r10)
            goto L69
        L2d:
            o13.r.b(r10)
            java.lang.Object r10 = r9.f85677b
            o53.b0 r10 = (o53.b0) r10
            o53.d0 r1 = o53.d0.LAZY
            ht2.p$a r7 = new ht2.p$a
            e23.l<t13.d<java.lang.Object>, java.lang.Object> r8 = r9.f85679d
            r7.<init>(r8, r6)
            o53.j0 r10 = ge1.b.j(r10, r6, r1, r7, r4)
            g2.m1 r1 = new g2.m1
            r7 = 25
            r1.<init>(r7, r5, r10)
            r10.J(r1)
            r1 = r10
        L4c:
            h53.b<o53.i0<T>> r10 = r5.f85682a
            boolean r10 = r10.a(r6, r1)
            if (r10 != 0) goto L74
            h53.b<o53.i0<T>> r10 = r5.f85682a
            java.lang.Object r10 = r10.b()
            o53.i0 r10 = (o53.i0) r10
            if (r10 == 0) goto L69
            r9.f85677b = r1
            r9.f85676a = r4
            java.lang.Object r10 = g8.i.r(r10, r9)
            if (r10 != r0) goto L69
            goto L7e
        L69:
            r9.f85677b = r1
            r9.f85676a = r3
            java.lang.Object r10 = gg.b.U(r9)
            if (r10 != r0) goto L4c
            goto L7e
        L74:
            r9.f85677b = r6
            r9.f85676a = r2
            java.lang.Object r10 = r1.await(r9)
            if (r10 != r0) goto L7f
        L7e:
            return r0
        L7f:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ht2.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
