package ey1;

import o53.b0;
import o53.i0;
import o53.j0;
import o53.s0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.o2;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.viewmodel.StrengthTrainingPlanDashboardViewModel$loadData$1", f = "StrengthTrainingPlanDashboardViewModel.kt", l = {177, 182, 192, 197, 198, 200}, m = "invokeSuspend", v = 2)
public final class t extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i0 f67420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i0 f67421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f67422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f67423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f67424e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.viewmodel.StrengthTrainingPlanDashboardViewModel$loadData$1$getActivePlansTask$1", f = "StrengthTrainingPlanDashboardViewModel.kt", l = {186}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f67425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j f67426b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f67426b = jVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f67426b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f67425a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f67425a = 1;
                st1.a aVar = this.f67426b.f67339f;
                aVar.getClass();
                x53.c cVar = s0.f129406a;
                Object objE0 = ge1.b.e0(x53.b.f189152a, new st1.b(aVar, null), this);
                if (objE0 != obj2) {
                    objE0 = Unit.INSTANCE;
                }
                if (objE0 != obj2) {
                    objE0 = Unit.INSTANCE;
                }
                if (objE0 == obj2) {
                    return obj2;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.viewmodel.StrengthTrainingPlanDashboardViewModel$loadData$1$getBenchmarksTask$1", f = "StrengthTrainingPlanDashboardViewModel.kt", l = {179, 179}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p2 f67427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f67428b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j f67429c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j jVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f67429c = jVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f67429c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
        
            if (r1.emit(r8, r7) == r0) goto L15;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            p2 p2Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f67428b;
            if (i14 != 0) {
                if (i14 == 1) {
                    p2Var = this.f67427a;
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            j jVar = this.f67429c;
            p2Var = jVar.f67351r;
            nx1.h hVar = jVar.f67337d;
            Long l14 = new Long(jVar.f67334a);
            this.f67427a = p2Var;
            this.f67428b = 1;
            obj = hVar.a(l14, this);
            if (obj != aVar) {
            }
            return aVar;
            Object value = ((o2) obj).getValue();
            this.f67427a = null;
            this.f67428b = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(j jVar, t13.d<? super t> dVar) {
        super(2, dVar);
        this.f67424e = jVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        t tVar = new t(this.f67424e, dVar);
        tVar.f67423d = obj;
        return tVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((t) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0067  */
    /* JADX WARN: Code duplicated, block: B:21:0x0074  */
    /* JADX WARN: Code duplicated, block: B:24:0x0084  */
    /* JADX WARN: Code duplicated, block: B:27:0x008d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00be  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cf A[DONT_INVERT, PHI: r0
      0x00cf: PHI (r0v11 o53.i0) = (r0v9 o53.i0), (r0v12 o53.i0) binds: [B:40:0x00cc, B:8:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e1  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f3, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r1) goto L48;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        j0 j0VarJ;
        i0 i0Var;
        tw1.m mVar;
        j0 j0VarJ2;
        tw1.m mVar2;
        DateTime dateTimeNow;
        tw1.m mVar3;
        DateTime dateTimeNow2;
        i0 i0Var2;
        b0 b0Var = (b0) this.f67423d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f67422c;
        j jVar = this.f67424e;
        switch (i14) {
            case 0:
                o13.r.b(obj);
                p2 p2Var = jVar.f67355x;
                Boolean bool = Boolean.TRUE;
                this.f67423d = b0Var;
                this.f67422c = 1;
                p2Var.k(null, bool);
                if (Unit.INSTANCE != aVar) {
                    j0VarJ = ge1.b.j(b0Var, null, null, new b(jVar, null), 3);
                    this.f67423d = b0Var;
                    this.f67420a = j0VarJ;
                    this.f67422c = 2;
                    if (j.y4(jVar, this) != aVar) {
                        i0Var = j0VarJ;
                        p2 p2Var2 = jVar.f67350q;
                        p2 p2Var3 = jVar.f67350q;
                        mVar = (tw1.m) p2Var2.getValue();
                        if (mVar == null && mVar.e0()) {
                            j0VarJ2 = ge1.b.j(b0Var, null, null, new a(jVar, null), 3);
                        } else {
                            j0VarJ2 = null;
                        }
                        mVar2 = (tw1.m) p2Var3.getValue();
                        if (mVar2 != null || (dateTimeNow = mVar2.getStartDate()) == null) {
                            dateTimeNow = DateTime.now();
                        }
                        dateTimeNow.getClass();
                        mVar3 = (tw1.m) p2Var3.getValue();
                        if (mVar3 != null || (dateTimeNow2 = mVar3.o()) == null) {
                            dateTimeNow2 = DateTime.now();
                        }
                        dateTimeNow2.getClass();
                        this.f67423d = null;
                        this.f67420a = i0Var;
                        this.f67421b = j0VarJ2;
                        this.f67422c = 3;
                        if (j.x4(jVar, dateTimeNow, dateTimeNow2, this) != aVar) {
                            i0Var2 = j0VarJ2;
                            this.f67423d = null;
                            this.f67420a = null;
                            this.f67421b = i0Var2;
                            this.f67422c = 4;
                            if (i0Var.await(this) != aVar) {
                                if (i0Var2 != null) {
                                    p2 p2Var4 = jVar.f67355x;
                                    Boolean bool2 = Boolean.FALSE;
                                    this.f67423d = null;
                                    this.f67420a = null;
                                    this.f67421b = null;
                                    this.f67422c = 6;
                                    p2Var4.k(null, bool2);
                                } else {
                                    this.f67423d = null;
                                    this.f67420a = null;
                                    this.f67421b = null;
                                    this.f67422c = 5;
                                    if (i0Var2.await(this) != aVar) {
                                        p2 p2Var5 = jVar.f67355x;
                                        Boolean bool3 = Boolean.FALSE;
                                        this.f67423d = null;
                                        this.f67420a = null;
                                        this.f67421b = null;
                                        this.f67422c = 6;
                                        p2Var5.k(null, bool3);
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 1:
                o13.r.b(obj);
                j0VarJ = ge1.b.j(b0Var, null, null, new b(jVar, null), 3);
                this.f67423d = b0Var;
                this.f67420a = j0VarJ;
                this.f67422c = 2;
                if (j.y4(jVar, this) != aVar) {
                    i0Var = j0VarJ;
                    p2 p2Var6 = jVar.f67350q;
                    p2 p2Var7 = jVar.f67350q;
                    mVar = (tw1.m) p2Var6.getValue();
                    if (mVar == null) {
                        j0VarJ2 = null;
                    } else {
                        j0VarJ2 = null;
                    }
                    mVar2 = (tw1.m) p2Var7.getValue();
                    if (mVar2 != null) {
                        dateTimeNow = DateTime.now();
                    } else {
                        dateTimeNow = DateTime.now();
                    }
                    dateTimeNow.getClass();
                    mVar3 = (tw1.m) p2Var7.getValue();
                    if (mVar3 != null) {
                        dateTimeNow2 = DateTime.now();
                    } else {
                        dateTimeNow2 = DateTime.now();
                    }
                    dateTimeNow2.getClass();
                    this.f67423d = null;
                    this.f67420a = i0Var;
                    this.f67421b = j0VarJ2;
                    this.f67422c = 3;
                    if (j.x4(jVar, dateTimeNow, dateTimeNow2, this) != aVar) {
                        i0Var2 = j0VarJ2;
                        this.f67423d = null;
                        this.f67420a = null;
                        this.f67421b = i0Var2;
                        this.f67422c = 4;
                        if (i0Var.await(this) != aVar) {
                            if (i0Var2 != null) {
                                p2 p2Var8 = jVar.f67355x;
                                Boolean bool4 = Boolean.FALSE;
                                this.f67423d = null;
                                this.f67420a = null;
                                this.f67421b = null;
                                this.f67422c = 6;
                                p2Var8.k(null, bool4);
                            } else {
                                this.f67423d = null;
                                this.f67420a = null;
                                this.f67421b = null;
                                this.f67422c = 5;
                                if (i0Var2.await(this) != aVar) {
                                    p2 p2Var9 = jVar.f67355x;
                                    Boolean bool5 = Boolean.FALSE;
                                    this.f67423d = null;
                                    this.f67420a = null;
                                    this.f67421b = null;
                                    this.f67422c = 6;
                                    p2Var9.k(null, bool5);
                                }
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 2:
                i0Var = this.f67420a;
                o13.r.b(obj);
                p2 p2Var10 = jVar.f67350q;
                p2 p2Var11 = jVar.f67350q;
                mVar = (tw1.m) p2Var10.getValue();
                if (mVar == null) {
                    j0VarJ2 = null;
                } else {
                    j0VarJ2 = null;
                }
                mVar2 = (tw1.m) p2Var11.getValue();
                if (mVar2 != null) {
                    dateTimeNow = DateTime.now();
                } else {
                    dateTimeNow = DateTime.now();
                }
                dateTimeNow.getClass();
                mVar3 = (tw1.m) p2Var11.getValue();
                if (mVar3 != null) {
                    dateTimeNow2 = DateTime.now();
                } else {
                    dateTimeNow2 = DateTime.now();
                }
                dateTimeNow2.getClass();
                this.f67423d = null;
                this.f67420a = i0Var;
                this.f67421b = j0VarJ2;
                this.f67422c = 3;
                if (j.x4(jVar, dateTimeNow, dateTimeNow2, this) != aVar) {
                    i0Var2 = j0VarJ2;
                    this.f67423d = null;
                    this.f67420a = null;
                    this.f67421b = i0Var2;
                    this.f67422c = 4;
                    if (i0Var.await(this) != aVar) {
                        if (i0Var2 != null) {
                            p2 p2Var12 = jVar.f67355x;
                            Boolean bool6 = Boolean.FALSE;
                            this.f67423d = null;
                            this.f67420a = null;
                            this.f67421b = null;
                            this.f67422c = 6;
                            p2Var12.k(null, bool6);
                        } else {
                            this.f67423d = null;
                            this.f67420a = null;
                            this.f67421b = null;
                            this.f67422c = 5;
                            if (i0Var2.await(this) != aVar) {
                                p2 p2Var13 = jVar.f67355x;
                                Boolean bool7 = Boolean.FALSE;
                                this.f67423d = null;
                                this.f67420a = null;
                                this.f67421b = null;
                                this.f67422c = 6;
                                p2Var13.k(null, bool7);
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 3:
                i0Var2 = this.f67421b;
                i0Var = this.f67420a;
                o13.r.b(obj);
                this.f67423d = null;
                this.f67420a = null;
                this.f67421b = i0Var2;
                this.f67422c = 4;
                if (i0Var.await(this) != aVar) {
                    if (i0Var2 != null) {
                        p2 p2Var14 = jVar.f67355x;
                        Boolean bool8 = Boolean.FALSE;
                        this.f67423d = null;
                        this.f67420a = null;
                        this.f67421b = null;
                        this.f67422c = 6;
                        p2Var14.k(null, bool8);
                    } else {
                        this.f67423d = null;
                        this.f67420a = null;
                        this.f67421b = null;
                        this.f67422c = 5;
                        if (i0Var2.await(this) != aVar) {
                            p2 p2Var15 = jVar.f67355x;
                            Boolean bool9 = Boolean.FALSE;
                            this.f67423d = null;
                            this.f67420a = null;
                            this.f67421b = null;
                            this.f67422c = 6;
                            p2Var15.k(null, bool9);
                        }
                    }
                    break;
                }
                return aVar;
            case 4:
                i0Var2 = this.f67421b;
                o13.r.b(obj);
                if (i0Var2 != null) {
                    this.f67423d = null;
                    this.f67420a = null;
                    this.f67421b = null;
                    this.f67422c = 5;
                    if (i0Var2.await(this) != aVar) {
                        p2 p2Var16 = jVar.f67355x;
                        Boolean bool10 = Boolean.FALSE;
                        this.f67423d = null;
                        this.f67420a = null;
                        this.f67421b = null;
                        this.f67422c = 6;
                        p2Var16.k(null, bool10);
                    }
                    break;
                } else {
                    p2 p2Var17 = jVar.f67355x;
                    Boolean bool11 = Boolean.FALSE;
                    this.f67423d = null;
                    this.f67420a = null;
                    this.f67421b = null;
                    this.f67422c = 6;
                    p2Var17.k(null, bool11);
                    break;
                }
                return aVar;
            case 5:
                o13.r.b(obj);
                p2 p2Var18 = jVar.f67355x;
                Boolean bool12 = Boolean.FALSE;
                this.f67423d = null;
                this.f67420a = null;
                this.f67421b = null;
                this.f67422c = 6;
                p2Var18.k(null, bool12);
                break;
            case 6:
                o13.r.b(obj);
                return Unit.INSTANCE;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
