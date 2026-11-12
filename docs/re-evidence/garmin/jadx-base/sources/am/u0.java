package am;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/e;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.ActivityRepo$uploadActivityImages$1", f = "ActivityRepo.kt", l = {374}, m = "invokeSuspend", v = 2)
public final class u0 extends v13.i implements e23.p<r53.j<? super List<com.garmin.android.apps.connectmobile.activities.newmodel.e>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList<bq0.k> f4216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f4217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f4218e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.ActivityRepo$uploadActivityImages$1$1", f = "ActivityRepo.kt", l = {375, 376}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Collection f4219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public m f4220b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Iterator f4221c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Collection f4222d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f4223e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f4224f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f4225g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ ArrayList<bq0.k> f4226h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ r53.j<List<com.garmin.android.apps.connectmobile.activities.newmodel.e>> f4227i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ m f4228j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ long f4229k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ArrayList<bq0.k> arrayList, r53.j<? super List<com.garmin.android.apps.connectmobile.activities.newmodel.e>> jVar, m mVar, long j8, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f4226h = arrayList;
            this.f4227i = jVar;
            this.f4228j = mVar;
            this.f4229k = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f4226h, this.f4227i, this.f4228j, this.f4229k, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x004b  */
        /* JADX WARN: Code duplicated, block: B:16:0x0069  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0069 -> B:17:0x006a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                u13.a r0 = u13.a.COROUTINE_SUSPENDED
                int r1 = r12.f4225g
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L11
                o13.r.b(r13)
                goto L87
            L11:
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r13)
                r13 = 0
                return r13
            L18:
                int r1 = r12.f4224f
                long r4 = r12.f4223e
                java.util.Collection r6 = r12.f4222d
                java.util.Collection r6 = (java.util.Collection) r6
                java.util.Iterator r7 = r12.f4221c
                am.m r8 = r12.f4220b
                java.util.Collection r9 = r12.f4219a
                java.util.Collection r9 = (java.util.Collection) r9
                o13.r.b(r13)
                goto L6a
            L2c:
                o13.r.b(r13)
                java.util.ArrayList r13 = new java.util.ArrayList
                r13.<init>()
                java.util.ArrayList<bq0.k> r1 = r12.f4226h
                java.util.Iterator r1 = r1.iterator()
                r4 = 0
                am.m r5 = r12.f4228j
                long r6 = r12.f4229k
                r8 = r5
                r10 = r6
                r6 = r13
                r7 = r1
                r1 = r4
                r4 = r10
            L45:
                boolean r13 = r7.hasNext()
                if (r13 == 0) goto L71
                java.lang.Object r13 = r7.next()
                bq0.k r13 = (bq0.k) r13
                r9 = r6
                java.util.Collection r9 = (java.util.Collection) r9
                r12.f4219a = r9
                r12.f4220b = r8
                r12.f4221c = r7
                r12.f4222d = r9
                r12.f4223e = r4
                r12.f4224f = r1
                r12.f4225g = r3
                java.lang.Object r13 = am.m.a(r8, r4, r13, r12)
                if (r13 != r0) goto L69
                goto L86
            L69:
                r9 = r6
            L6a:
                com.garmin.android.apps.connectmobile.activities.newmodel.e r13 = (com.garmin.android.apps.connectmobile.activities.newmodel.e) r13
                r6.add(r13)
                r6 = r9
                goto L45
            L71:
                java.util.List r6 = (java.util.List) r6
                r13 = 0
                r12.f4219a = r13
                r12.f4220b = r13
                r12.f4221c = r13
                r12.f4222d = r13
                r12.f4225g = r2
                r53.j<java.util.List<com.garmin.android.apps.connectmobile.activities.newmodel.e>> r13 = r12.f4227i
                java.lang.Object r13 = r13.emit(r6, r12)
                if (r13 != r0) goto L87
            L86:
                return r0
            L87:
                kotlin.Unit r13 = p005kotlin.Unit.INSTANCE
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: am.u0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(ArrayList<bq0.k> arrayList, m mVar, long j8, t13.d<? super u0> dVar) {
        super(2, dVar);
        this.f4216c = arrayList;
        this.f4217d = mVar;
        this.f4218e = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        u0 u0Var = new u0(this.f4216c, this.f4217d, this.f4218e, dVar);
        u0Var.f4215b = obj;
        return u0Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super List<com.garmin.android.apps.connectmobile.activities.newmodel.e>> jVar, t13.d<? super Unit> dVar) {
        return ((u0) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f4215b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f4214a;
        if (i14 == 0) {
            o13.r.b(obj);
            a aVar2 = new a(this.f4216c, jVar, this.f4217d, this.f4218e, null);
            this.f4215b = null;
            this.f4214a = 1;
            if (o53.c0.e(aVar2, this) == aVar) {
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
