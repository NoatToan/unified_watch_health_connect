package m12;

import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.b0;
import o53.i0;
import o53.j0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lm12/q;", "<anonymous>", "(Lo53/b0;)Lm12/q;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.domain.FetchProfileDataUseCase$invoke$2", f = "FetchProfileDataUseCase.kt", l = {35, 36, 37, 38}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements e23.p<b0, t13.d<? super q>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j0 f115793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i0 f115794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i0 f115795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v2 f115796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v2 f115797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v2 f115798f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f115799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f115800h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m12.d f115801i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f115802j;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.domain.FetchProfileDataUseCase$invoke$2$deviceBackUpResultAsync$1", f = "FetchProfileDataUseCase.kt", l = {30}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super v2<? extends Boolean>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f115803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m12.d f115804b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m12.d dVar, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f115804b = dVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f115804b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends Boolean>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f115803a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            r rVar = this.f115804b.f115812a;
            this.f115803a = 1;
            Object objB = rVar.b(this);
            return objB == aVar ? aVar : objB;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.domain.FetchProfileDataUseCase$invoke$2$requireReviewFollowerRequestsAsync$1", f = "FetchProfileDataUseCase.kt", l = {33}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super v2<? extends Boolean>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f115805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m12.d f115806b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(m12.d dVar, t13.d<? super b> dVar2) {
            super(2, dVar2);
            this.f115806b = dVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f115806b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends Boolean>> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f115805a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            ei0.d dVar = this.f115806b.f115814c;
            this.f115805a = 1;
            Object objZ1 = dVar.Z1(this);
            return objZ1 == aVar ? aVar : objZ1;
        }
    }

    /* JADX INFO: renamed from: m12.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lnj1/e;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.domain.FetchProfileDataUseCase$invoke$2$userPrivacyResultAsync$1", f = "FetchProfileDataUseCase.kt", l = {32}, m = "invokeSuspend", v = 2)
    public static final class C2202c extends v13.i implements e23.p<b0, t13.d<? super v2<? extends nj1.e>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f115807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m12.d f115808b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2202c(m12.d dVar, t13.d<? super C2202c> dVar2) {
            super(2, dVar2);
            this.f115808b = dVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C2202c(this.f115808b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends nj1.e>> dVar) {
            return ((C2202c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f115807a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            r rVar = this.f115808b.f115812a;
            this.f115807a = 1;
            Object objJ = rVar.j(this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/userprofile/model/r;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.domain.FetchProfileDataUseCase$invoke$2$userProfilePrivacyResultAsync$1", f = "FetchProfileDataUseCase.kt", l = {31}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<b0, t13.d<? super v2<? extends com.garmin.android.apps.connectmobile.userprofile.model.r>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f115809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m12.d f115810b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f115811c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(m12.d dVar, String str, t13.d<? super d> dVar2) {
            super(2, dVar2);
            this.f115810b = dVar;
            this.f115811c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f115810b, this.f115811c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends com.garmin.android.apps.connectmobile.userprofile.model.r>> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f115809a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            k12.a aVar2 = this.f115810b.f115813b;
            this.f115809a = 1;
            Object objF = aVar2.f(this.f115811c, com.garmin.android.apps.connectmobile.userprofile.model.k.f46891k, this);
            return objF == aVar ? aVar : objF;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(m12.d dVar, String str, t13.d<? super c> dVar2) {
        super(2, dVar2);
        this.f115801i = dVar;
        this.f115802j = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c cVar = new c(this.f115801i, this.f115802j, dVar);
        cVar.f115800h = obj;
        return cVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super q> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:45:0x0100  */
    /* JADX WARN: Code duplicated, block: B:46:0x0108  */
    /* JADX WARN: Code duplicated, block: B:50:0x0110  */
    /* JADX WARN: Code duplicated, block: B:51:0x011b  */
    /* JADX WARN: Code duplicated, block: B:53:0x011f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0124  */
    /* JADX WARN: Code duplicated, block: B:57:0x0129  */
    /* JADX WARN: Code duplicated, block: B:58:0x012e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0133  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        i0 i0VarJ;
        j0 j0Var;
        i0 i0Var;
        v2 v2Var;
        i0 i0Var2;
        i0 i0Var3;
        v2 v2Var2;
        Object objAwait;
        v2 v2Var3;
        i0 i0Var4;
        v2 v2Var4;
        v2 v2Var5;
        Object objAwait2;
        v2 v2Var6;
        v2 v2Var7;
        v2 v2Var8;
        Boolean bool;
        com.garmin.android.apps.connectmobile.userprofile.model.r rVar;
        boolean zBooleanValue;
        b0 b0Var = (b0) this.f115800h;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f115799g;
        nj1.e eVar = null;
        if (i14 == 0) {
            o13.r.b(obj);
            m12.d dVar = this.f115801i;
            j0 j0VarJ = ge1.b.j(b0Var, null, null, new a(dVar, null), 3);
            j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new d(dVar, this.f115802j, null), 3);
            j0 j0VarJ3 = ge1.b.j(b0Var, null, null, new C2202c(dVar, null), 3);
            i0VarJ = ge1.b.j(b0Var, null, null, new b(dVar, null), 3);
            this.f115800h = null;
            this.f115793a = j0VarJ2;
            this.f115794b = j0VarJ3;
            this.f115795c = i0VarJ;
            this.f115799g = 1;
            obj = j0VarJ.C(this);
            if (obj != aVar) {
                j0Var = j0VarJ2;
                i0Var = j0VarJ3;
            }
            return aVar;
        }
        if (i14 == 1) {
            i0VarJ = this.f115795c;
            i0Var = this.f115794b;
            j0Var = this.f115793a;
            o13.r.b(obj);
        } else {
            if (i14 == 2) {
                v2Var = this.f115796d;
                i0Var3 = this.f115795c;
                i0Var2 = this.f115794b;
                o13.r.b(obj);
                v2Var2 = (v2) obj;
                this.f115800h = null;
                this.f115793a = null;
                this.f115794b = null;
                this.f115795c = i0Var3;
                this.f115796d = v2Var;
                this.f115797e = v2Var2;
                this.f115799g = 3;
                objAwait = i0Var2.await(this);
                if (objAwait != aVar) {
                    v2 v2Var9 = v2Var;
                    v2Var3 = v2Var2;
                    obj = objAwait;
                    i0Var4 = i0Var3;
                    v2Var4 = v2Var9;
                    v2Var5 = (v2) obj;
                    this.f115800h = null;
                    this.f115793a = null;
                    this.f115794b = null;
                    this.f115795c = null;
                    this.f115796d = v2Var4;
                    this.f115797e = v2Var3;
                    this.f115798f = v2Var5;
                    this.f115799g = 4;
                    objAwait2 = i0Var4.await(this);
                    if (objAwait2 != aVar) {
                        v2Var6 = v2Var3;
                        v2Var7 = v2Var5;
                        obj = objAwait2;
                    }
                }
                return aVar;
            }
            if (i14 == 3) {
                v2Var3 = this.f115797e;
                v2Var4 = this.f115796d;
                i0Var4 = this.f115795c;
                o13.r.b(obj);
                v2Var5 = (v2) obj;
                this.f115800h = null;
                this.f115793a = null;
                this.f115794b = null;
                this.f115795c = null;
                this.f115796d = v2Var4;
                this.f115797e = v2Var3;
                this.f115798f = v2Var5;
                this.f115799g = 4;
                objAwait2 = i0Var4.await(this);
                if (objAwait2 != aVar) {
                    v2Var6 = v2Var3;
                    v2Var7 = v2Var5;
                    obj = objAwait2;
                }
                return aVar;
            }
            if (i14 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2Var7 = this.f115798f;
            v2Var6 = this.f115797e;
            v2Var4 = this.f115796d;
            o13.r.b(obj);
        }
        v2Var8 = (v2) obj;
        if (v2Var4 instanceof v2.b) {
            bool = (Boolean) ((v2.b) v2Var4).f47386a;
        } else {
            if (v2Var4 instanceof v2.a) {
                u0.r();
                return null;
            }
            bool = null;
        }
        if (v2Var6 instanceof v2.b) {
            rVar = (com.garmin.android.apps.connectmobile.userprofile.model.r) ((v2.b) v2Var6).f47386a;
        } else {
            if (v2Var6 instanceof v2.a) {
                u0.r();
                return null;
            }
            rVar = null;
        }
        if (v2Var7 instanceof v2.b) {
            eVar = (nj1.e) ((v2.b) v2Var7).f47386a;
        } else if (!(v2Var7 instanceof v2.a)) {
            u0.r();
            return null;
        }
        if (v2Var8 instanceof v2.b) {
            zBooleanValue = ((Boolean) ((v2.b) v2Var8).f47386a).booleanValue();
        } else {
            if (v2Var8 instanceof v2.a) {
                u0.r();
                return null;
            }
            zBooleanValue = false;
        }
        return new q(bool, rVar, eVar, zBooleanValue);
        v2 v2Var10 = (v2) obj;
        this.f115800h = null;
        this.f115793a = null;
        this.f115794b = i0Var;
        this.f115795c = i0VarJ;
        this.f115796d = v2Var10;
        this.f115799g = 2;
        Object objAwait3 = j0Var.await(this);
        if (objAwait3 != aVar) {
            i0 i0Var5 = i0VarJ;
            v2Var = v2Var10;
            obj = objAwait3;
            i0Var2 = i0Var;
            i0Var3 = i0Var5;
            v2Var2 = (v2) obj;
            this.f115800h = null;
            this.f115793a = null;
            this.f115794b = null;
            this.f115795c = i0Var3;
            this.f115796d = v2Var;
            this.f115797e = v2Var2;
            this.f115799g = 3;
            objAwait = i0Var2.await(this);
            if (objAwait != aVar) {
                v2 v2Var11 = v2Var;
                v2Var3 = v2Var2;
                obj = objAwait;
                i0Var4 = i0Var3;
                v2Var4 = v2Var11;
                v2Var5 = (v2) obj;
                this.f115800h = null;
                this.f115793a = null;
                this.f115794b = null;
                this.f115795c = null;
                this.f115796d = v2Var4;
                this.f115797e = v2Var3;
                this.f115798f = v2Var5;
                this.f115799g = 4;
                objAwait2 = i0Var4.await(this);
                if (objAwait2 != aVar) {
                    v2Var6 = v2Var3;
                    v2Var7 = v2Var5;
                    obj = objAwait2;
                    v2Var8 = (v2) obj;
                    if (v2Var4 instanceof v2.b) {
                        bool = (Boolean) ((v2.b) v2Var4).f47386a;
                    } else {
                        if (v2Var4 instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        bool = null;
                    }
                    if (v2Var6 instanceof v2.b) {
                        rVar = (com.garmin.android.apps.connectmobile.userprofile.model.r) ((v2.b) v2Var6).f47386a;
                    } else {
                        if (v2Var6 instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        rVar = null;
                    }
                    if (v2Var7 instanceof v2.b) {
                        eVar = (nj1.e) ((v2.b) v2Var7).f47386a;
                    } else if (!(v2Var7 instanceof v2.a)) {
                        u0.r();
                        return null;
                    }
                    if (v2Var8 instanceof v2.b) {
                        zBooleanValue = ((Boolean) ((v2.b) v2Var8).f47386a).booleanValue();
                    } else {
                        if (v2Var8 instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        zBooleanValue = false;
                    }
                    return new q(bool, rVar, eVar, zBooleanValue);
                }
            }
        }
        return aVar;
    }
}
