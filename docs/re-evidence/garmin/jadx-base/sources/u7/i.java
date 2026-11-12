package u7;

import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H\u008a@"}, d2 = {"<anonymous>", "T", "startingData"}, k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", l = {44, 46}, m = "invokeSuspend")
public final class i extends v13.i implements e23.p<Object, t13.d<Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f169150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f169151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f169152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f169153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f169154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<f<Object>> f169155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List<e23.l<t13.d<? super Unit>, Object>> f169156g;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @v13.e(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", l = {45}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f169157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f<Object> f169158b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f<Object> fVar, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f169158b = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f169158b, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super Unit> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f169157a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f169157a = 1;
                if (this.f169158b.cleanUp() == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(List<? extends f<Object>> list, List<e23.l<t13.d<? super Unit>, Object>> list2, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f169155f = list;
        this.f169156g = list2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f169155f, this.f169156g, dVar);
        iVar.f169154e = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, t13.d<Object> dVar) {
        return ((i) create(obj, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0041  */
    /* JADX WARN: Code duplicated, block: B:16:0x0058  */
    /* JADX WARN: Code duplicated, block: B:19:0x0065  */
    /* JADX WARN: Code duplicated, block: B:22:0x007f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0081  */
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
            int r1 = r9.f169153d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L16
            java.util.Iterator r1 = r9.f169150a
            java.lang.Object r4 = r9.f169154e
            java.util.List r4 = (java.util.List) r4
            o13.r.b(r10)
            goto L3b
        L16:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r10)
            r10 = 0
            return r10
        L1d:
            java.lang.Object r1 = r9.f169152c
            u7.f r4 = r9.f169151b
            java.util.Iterator r5 = r9.f169150a
            java.lang.Object r6 = r9.f169154e
            java.util.List r6 = (java.util.List) r6
            o13.r.b(r10)
            r8 = r6
            r6 = r4
            r4 = r8
            goto L5d
        L2e:
            o13.r.b(r10)
            java.lang.Object r10 = r9.f169154e
            java.util.List<u7.f<java.lang.Object>> r1 = r9.f169155f
            java.util.Iterator r1 = r1.iterator()
            java.util.List<e23.l<t13.d<? super kotlin.Unit>, java.lang.Object>> r4 = r9.f169156g
        L3b:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L83
            java.lang.Object r5 = r1.next()
            u7.f r5 = (u7.f) r5
            r9.f169154e = r4
            r9.f169150a = r1
            r9.f169151b = r5
            r9.f169152c = r10
            r9.f169153d = r3
            java.lang.Object r6 = r5.a(r10, r9)
            if (r6 != r0) goto L58
            goto L7e
        L58:
            r8 = r1
            r1 = r10
            r10 = r6
            r6 = r5
            r5 = r8
        L5d:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L81
            u7.i$a r10 = new u7.i$a
            r7 = 0
            r10.<init>(r6, r7)
            r4.add(r10)
            r9.f169154e = r4
            r9.f169150a = r5
            r9.f169151b = r7
            r9.f169152c = r7
            r9.f169153d = r2
            java.lang.Object r10 = r6.b(r1, r9)
            if (r10 != r0) goto L7f
        L7e:
            return r0
        L7f:
            r1 = r5
            goto L3b
        L81:
            r10 = r1
            goto L7f
        L83:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
