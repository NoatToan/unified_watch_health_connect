package v01;

import android.net.Uri;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Ld11/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.GetCreateMealUseCase$invoke$2", f = "GetCreateMealUseCase.kt", l = {50, 60}, m = "invokeSuspend", v = 2)
public final class z extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends d11.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o53.j0 f174617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s21.o f174618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f174619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f174620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0 f174621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f11.g.b f174622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b63.o f174623g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lg01/f;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.GetCreateMealUseCase$invoke$2$getMealTask$1", f = "GetCreateMealUseCase.kt", l = {34}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends g01.f>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f174624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f11.g.b f174625b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a0 f174626c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f11.g.b bVar, a0 a0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f174625b = bVar;
            this.f174626c = a0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f174625b, this.f174626c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends g01.f>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f174624a;
            if (i14 == 0) {
                o13.r.b(obj);
                f11.g.b bVar = this.f174625b;
                if (bVar instanceof f11.g.b.a) {
                    return new v2.a(new IllegalStateException("Add mode doesn't fetch meal"), null, null, 6, null);
                }
                if (!(bVar instanceof f11.g.b.C1412b)) {
                    lc.u0.r();
                    return null;
                }
                m01.g gVar = this.f174626c.f174207a;
                Long l14 = new Long(((f11.g.b.C1412b) bVar).f67942a);
                this.f174624a = 1;
                obj = m01.g.n(gVar, 0, 1, null, l14, this, 4);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return (v2) obj;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Ls21/o;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.GetCreateMealUseCase$invoke$2$settingsTask$1", f = "GetCreateMealUseCase.kt", l = {45}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends s21.o>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f174627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a0 f174628b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b63.o f174629c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a0 a0Var, b63.o oVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f174628b = a0Var;
            this.f174629c = oVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f174628b, this.f174629c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends s21.o>> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f174627a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            t0 t0Var = this.f174628b.f174208b;
            this.f174627a = 1;
            Object objA = t0Var.a(this.f174629c, this);
            return objA == aVar ? aVar : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, f11.g.b bVar, b63.o oVar, t13.d<? super z> dVar) {
        super(2, dVar);
        this.f174621e = a0Var;
        this.f174622f = bVar;
        this.f174623g = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        z zVar = new z(this.f174621e, this.f174622f, this.f174623g, dVar);
        zVar.f174620d = obj;
        return zVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends d11.b>> dVar) {
        return ((z) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0072  */
    /* JADX WARN: Code duplicated, block: B:26:0x0077  */
    /* JADX WARN: Code duplicated, block: B:28:0x008d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x012f  */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        if (r1 == r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009d, code lost:
    
        if (r1 == r2) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        o53.j0 j0VarJ;
        v2 v2Var;
        Object objC;
        s21.o oVar;
        Object objAwait;
        d11.b bVar;
        b11.a.b bVarA;
        o53.b0 b0Var = (o53.b0) this.f174620d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f174619c;
        f11.g.b bVar2 = this.f174622f;
        if (i14 == 0) {
            o13.r.b(obj);
            a0 a0Var = this.f174621e;
            j0VarJ = ge1.b.j(b0Var, null, null, new a(bVar2, a0Var, null), 3);
            o53.j0 j0VarJ2 = a0Var.f174209c.e() ? ge1.b.j(b0Var, null, null, new b(a0Var, this.f174623g, null), 3) : null;
            if (j0VarJ2 == null) {
                v2Var = null;
                if (v2Var instanceof v2.b) {
                    oVar = (s21.o) ((v2.b) v2Var).f47386a;
                } else {
                    oVar = null;
                }
                if (bVar2 instanceof f11.g.b.a) {
                    bVar = new d11.b(new d11.d(null, null, null, 7, null), null, null, oVar, 6, null);
                } else {
                    if (bVar2 instanceof f11.g.b.C1412b) {
                        lc.u0.r();
                        return null;
                    }
                    this.f174620d = null;
                    this.f174617a = null;
                    this.f174618b = oVar;
                    this.f174619c = 2;
                    objAwait = j0VarJ.await(this);
                }
                return new v2.b(bVar, 200, null, null, 12, null);
            }
            this.f174620d = null;
            this.f174617a = j0VarJ;
            this.f174619c = 1;
            objC = j0VarJ2.C(this);
            return aVar;
        }
        if (i14 == 1) {
            o53.j0 j0Var = this.f174617a;
            o13.r.b(obj);
            j0VarJ = j0Var;
            objC = obj;
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            s21.o oVar2 = this.f174618b;
            o13.r.b(obj);
            oVar = oVar2;
            objAwait = obj;
        }
        v2 v2Var2 = (v2) objAwait;
        if (!(v2Var2 instanceof v2.b)) {
            if (v2Var2 instanceof v2.a) {
                return new v2.a(((v2.a) v2Var2).f47383a, null, null, 6, null);
            }
            lc.u0.r();
            return null;
        }
        g01.e eVar = (g01.e) p13.h0.d0(((g01.f) ((v2.b) v2Var2).f47386a).f74176a);
        if (eVar == null || (bVarA = eVar.a()) == null) {
            return new v2.a(new IllegalStateException(androidx.room.a0.f(((f11.g.b.C1412b) bVar2).f67942a, "Meal for customMealId ", " not found")), null, null, 6, null);
        }
        d11.d dVar = new d11.d(new Long(bVarA.f14228d), bVarA.f14232h, bVarA.f14233i);
        String str = bVarA.f14230f.f14379b;
        bVar = new d11.b(dVar, str != null ? new y22.x(Uri.parse(str), bVarA.f14231g, false, 4, (p005kotlin.jvm.internal.j) null) : null, null, oVar, 4, null);
        return new v2.b(bVar, 200, null, null, 12, null);
        v2Var = (v2) objC;
        if (v2Var instanceof v2.b) {
            oVar = (s21.o) ((v2.b) v2Var).f47386a;
        } else {
            oVar = null;
        }
        if (bVar2 instanceof f11.g.b.a) {
            bVar = new d11.b(new d11.d(null, null, null, 7, null), null, null, oVar, 6, null);
        } else {
            if (bVar2 instanceof f11.g.b.C1412b) {
                lc.u0.r();
                return null;
            }
            this.f174620d = null;
            this.f174617a = null;
            this.f174618b = oVar;
            this.f174619c = 2;
            objAwait = j0VarJ.await(this);
        }
        return new v2.b(bVar, 200, null, null, 12, null);
    }
}
