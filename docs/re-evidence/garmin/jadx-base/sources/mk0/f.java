package mk0;

import c80.u;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.List;
import o13.r;
import o53.b0;
import o53.j0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lmk0/a;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gear.domain.GetDefaultGearConflictsUseCase$invoke$2", f = "GetDefaultGearConflictsUseCase.kt", l = {22, 23}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements p<b0, t13.d<? super v2<? extends List<? extends mk0.a>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j0 f119107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v2 f119108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f119109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f119110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<u> f119111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f119112f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Ljk0/a;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.domain.GetDefaultGearConflictsUseCase$invoke$2$collectionChoicesTask$1", f = "GetDefaultGearConflictsUseCase.kt", l = {21}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super v2<? extends List<? extends jk0.a>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f119113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f119114b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<u> f119115c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(g gVar, List<? extends u> list, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f119114b = gVar;
            this.f119115c = list;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f119114b, this.f119115c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends jk0.a>>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f119113a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            kk0.b bVar = this.f119114b.f119119a;
            this.f119113a = 1;
            Object objR = bVar.r(this.f119115c, this);
            return objR == aVar ? aVar : objR;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Ljk0/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.domain.GetDefaultGearConflictsUseCase$invoke$2$gearChoicesTask$1", f = "GetDefaultGearConflictsUseCase.kt", l = {20}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super v2<? extends List<? extends jk0.b>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f119116a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f119117b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<u> f119118c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(g gVar, List<? extends u> list, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f119117b = gVar;
            this.f119118c = list;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f119117b, this.f119118c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends jk0.b>>> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f119116a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            kk0.b bVar = this.f119117b.f119119a;
            this.f119116a = 1;
            Object objL = bVar.L(this.f119118c, this);
            return objL == aVar ? aVar : objL;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(List<? extends u> list, g gVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f119111e = list;
        this.f119112f = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f fVar = new f(this.f119111e, this.f119112f, dVar);
        fVar.f119110d = obj;
        return fVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends mk0.a>>> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0086  */
    /* JADX WARN: Code duplicated, block: B:26:0x0089  */
    /* JADX WARN: Code duplicated, block: B:28:0x008c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0093  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ca A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00cb  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        j0 j0VarJ;
        v2 v2Var;
        v2 v2Var2;
        v2.b bVar;
        List list;
        b0 b0Var = (b0) this.f119110d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f119109c;
        if (i14 == 0) {
            r.b(obj);
            List<u> list2 = this.f119111e;
            if (list2.isEmpty()) {
                return new v2.b(p13.j0.f134944a, 200, null, null, 12, null);
            }
            g gVar = this.f119112f;
            j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new b(gVar, list2, null), 3);
            j0VarJ = ge1.b.j(b0Var, null, null, new a(gVar, list2, null), 3);
            this.f119110d = null;
            this.f119107a = j0VarJ;
            this.f119109c = 1;
            obj = j0VarJ2.C(this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            j0VarJ = this.f119107a;
            r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2Var = this.f119108b;
            r.b(obj);
        }
        v2Var2 = (v2) obj;
        if (v2Var instanceof v2.b) {
            if (v2Var2 instanceof v2.b) {
                v2.b bVar2 = (v2.b) v2Var2;
                return new v2.b(gl1.d.L(p13.j0.f134944a, (List) bVar2.f47386a), bVar2.f47387b, null, null, 12, null);
            }
            if (v2Var instanceof v2.a) {
                return v2Var;
            }
            if (v2Var2 instanceof v2.a) {
                return v2Var2;
            }
            return new v2.a(new IllegalStateException("Unexpected default gear choices response"), null, null, 6, null);
        }
        v2.b bVar3 = (v2.b) v2Var;
        List list3 = (List) bVar3.f47386a;
        if (v2Var2 instanceof v2.b) {
            bVar = (v2.b) v2Var2;
        } else {
            bVar = null;
        }
        list = bVar != null ? (List) bVar.f47386a : null;
        if (list == null) {
            list = p13.j0.f134944a;
        }
        return new v2.b(gl1.d.L(list3, list), bVar3.f47387b, null, null, 12, null);
        v2 v2Var3 = (v2) obj;
        this.f119110d = null;
        this.f119107a = null;
        this.f119108b = v2Var3;
        this.f119109c = 2;
        Object objAwait = j0VarJ.await(this);
        if (objAwait != aVar) {
            v2Var = v2Var3;
            obj = objAwait;
            v2Var2 = (v2) obj;
            if (v2Var instanceof v2.b) {
                if (v2Var2 instanceof v2.b) {
                    v2.b bVar4 = (v2.b) v2Var2;
                    return new v2.b(gl1.d.L(p13.j0.f134944a, (List) bVar4.f47386a), bVar4.f47387b, null, null, 12, null);
                }
                if (v2Var instanceof v2.a) {
                    return v2Var;
                }
                if (v2Var2 instanceof v2.a) {
                    return v2Var2;
                }
                return new v2.a(new IllegalStateException("Unexpected default gear choices response"), null, null, 6, null);
            }
            v2.b bVar5 = (v2.b) v2Var;
            List list4 = (List) bVar5.f47386a;
            if (v2Var2 instanceof v2.b) {
                bVar = (v2.b) v2Var2;
            } else {
                bVar = null;
            }
            if (bVar != null) {
            }
            if (list == null) {
                list = p13.j0.f134944a;
            }
            return new v2.b(gl1.d.L(list4, list), bVar5.f47387b, null, null, 12, null);
        }
        return aVar;
    }
}
