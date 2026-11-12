package eu1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import fu1.w;
import gu1.f;
import java.util.List;
import o13.r;
import o53.b0;
import o53.i0;
import o53.j0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lfu1/w;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.training.atp.domain.GetATPStatusUseCase$invoke$2", f = "GetATPStatusUseCase.kt", l = {19, 20, 21}, m = "invokeSuspend", v = 2)
public final class a extends i implements p<b0, t13.d<? super v2<? extends w>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w f66094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j0 f66095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i0 f66096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v2 f66097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v2 f66098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f66099f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f66100g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ eu1.b f66101h;

    /* JADX INFO: renamed from: eu1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lxw1/d;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.training.atp.domain.GetATPStatusUseCase$invoke$2$activeDeferred$1", f = "GetATPStatusUseCase.kt", l = {15}, m = "invokeSuspend", v = 2)
    public static final class C1390a extends i implements p<b0, t13.d<? super v2<? extends xw1.d>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f66102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eu1.b f66103b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1390a(eu1.b bVar, t13.d<? super C1390a> dVar) {
            super(2, dVar);
            this.f66103b = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C1390a(this.f66103b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends xw1.d>> dVar) {
            return ((C1390a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f66102a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            gu1.b bVar = this.f66103b.f66109a;
            this.f66102a = 1;
            Object objA = bVar.a(this);
            return objA == aVar ? aVar : objA;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lxw1/d;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.training.atp.domain.GetATPStatusUseCase$invoke$2$completedDeferred$1", f = "GetATPStatusUseCase.kt", l = {16}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super v2<? extends List<? extends xw1.d>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f66104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eu1.b f66105b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(eu1.b bVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f66105b = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f66105b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends xw1.d>>> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f66104a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            gu1.b bVar = this.f66105b.f66109a;
            this.f66104a = 1;
            Object objJ = f0.J(bVar, new f(bVar, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lxw1/p;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.training.atp.domain.GetATPStatusUseCase$invoke$2$typesDeferred$1", f = "GetATPStatusUseCase.kt", l = {17}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, t13.d<? super v2<? extends List<? extends xw1.p>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f66106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eu1.b f66107b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f66108c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(eu1.b bVar, String str, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f66107b = bVar;
            this.f66108c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f66107b, this.f66108c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends xw1.p>>> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f66106a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            gu1.b bVar = this.f66107b.f66109a;
            this.f66106a = 1;
            Object objJ = f0.J(bVar, new gu1.h(bVar, this.f66108c, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(eu1.b bVar, t13.d<? super a> dVar) {
        super(2, dVar);
        this.f66101h = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        a aVar = new a(this.f66101h, dVar);
        aVar.f66100g = obj;
        return aVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super v2<? extends w>> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x010d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0116  */
    /* JADX WARN: Code duplicated, block: B:37:0x011a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0126  */
    /* JADX WARN: Code duplicated, block: B:40:0x0133  */
    /* JADX WARN: Code duplicated, block: B:42:0x0137  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        j0 j0VarJ;
        i0 i0VarJ;
        Object objC;
        w wVar;
        Object objAwait;
        i0 i0Var;
        v2 v2Var;
        v2 v2Var2;
        Object objAwait2;
        v2 v2Var3;
        v2 v2Var4;
        w wVar2;
        v2 v2Var5;
        List list;
        b0 b0Var = (b0) this.f66100g;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f66099f;
        if (i14 == 0) {
            r.b(obj);
            fy1.i.f73924a.getClass();
            String strF = fy1.i.a.f();
            w wVar3 = new w(0, 0L, null, null, 15, null);
            eu1.b bVar = this.f66101h;
            j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new C1390a(bVar, null), 3);
            j0VarJ = ge1.b.j(b0Var, null, null, new b(bVar, null), 3);
            i0VarJ = ge1.b.j(b0Var, null, null, new c(bVar, strF, null), 3);
            this.f66100g = null;
            this.f66094a = wVar3;
            this.f66095b = j0VarJ;
            this.f66096c = i0VarJ;
            this.f66099f = 1;
            objC = j0VarJ2.C(this);
            if (objC != aVar) {
                wVar = wVar3;
            }
            return aVar;
        }
        if (i14 == 1) {
            i0VarJ = this.f66096c;
            j0 j0Var = this.f66095b;
            wVar = this.f66094a;
            r.b(obj);
            j0VarJ = j0Var;
            objC = obj;
        } else {
            if (i14 == 2) {
                v2Var = this.f66097d;
                i0Var = this.f66096c;
                w wVar4 = this.f66094a;
                r.b(obj);
                wVar = wVar4;
                objAwait = obj;
                v2Var2 = (v2) objAwait;
                this.f66100g = null;
                this.f66094a = wVar;
                this.f66095b = null;
                this.f66096c = null;
                this.f66097d = v2Var;
                this.f66098e = v2Var2;
                this.f66099f = 3;
                objAwait2 = i0Var.await(this);
                if (objAwait2 != aVar) {
                    v2Var3 = v2Var;
                    v2Var4 = v2Var2;
                    wVar2 = wVar;
                }
                return aVar;
            }
            if (i14 != 3) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2Var4 = this.f66098e;
            v2Var3 = this.f66097d;
            w wVar5 = this.f66094a;
            r.b(obj);
            wVar2 = wVar5;
            objAwait2 = obj;
        }
        v2Var5 = (v2) objAwait2;
        if ((v2Var3 instanceof v2.a) || !(v2Var4 instanceof v2.a) || !(v2Var5 instanceof v2.a)) {
            if (v2Var3 instanceof v2.b) {
                wVar2.f73566c = (xw1.d) ((v2.b) v2Var3).f47386a;
            } else if (v2Var4 instanceof v2.b) {
                list = (List) ((v2.b) v2Var4).f47386a;
                if (!list.isEmpty()) {
                    wVar2.f73565b = ((xw1.d) h0.b0(list)).getAthletePlanId();
                }
            } else if (v2Var5 instanceof v2.b) {
                wVar2.f73567d = (List) ((v2.b) v2Var5).f47386a;
            }
            return new v2.b(wVar2, 200, null, null, 12, null);
        }
        return new v2.a(new Exception("Failed to fetch ATP status active = " + ((v2.a) v2Var3).f47383a + ", completed = " + ((v2.a) v2Var4).f47383a + ", types = " + ((v2.a) v2Var5).f47383a), null, null, 6, null);
        v2 v2Var6 = (v2) objC;
        this.f66100g = null;
        this.f66094a = wVar;
        this.f66095b = null;
        this.f66096c = i0VarJ;
        this.f66097d = v2Var6;
        this.f66099f = 2;
        objAwait = j0VarJ.await(this);
        if (objAwait != aVar) {
            i0Var = i0VarJ;
            v2Var = v2Var6;
            v2Var2 = (v2) objAwait;
            this.f66100g = null;
            this.f66094a = wVar;
            this.f66095b = null;
            this.f66096c = null;
            this.f66097d = v2Var;
            this.f66098e = v2Var2;
            this.f66099f = 3;
            objAwait2 = i0Var.await(this);
            if (objAwait2 != aVar) {
                v2Var3 = v2Var;
                v2Var4 = v2Var2;
                wVar2 = wVar;
                v2Var5 = (v2) objAwait2;
                if (v2Var3 instanceof v2.a) {
                }
                if (v2Var3 instanceof v2.b) {
                    wVar2.f73566c = (xw1.d) ((v2.b) v2Var3).f47386a;
                } else if (v2Var4 instanceof v2.b) {
                    list = (List) ((v2.b) v2Var4).f47386a;
                    if (!list.isEmpty()) {
                        wVar2.f73565b = ((xw1.d) h0.b0(list)).getAthletePlanId();
                    }
                } else if (v2Var5 instanceof v2.b) {
                    wVar2.f73567d = (List) ((v2.b) v2Var5).f47386a;
                }
                return new v2.b(wVar2, 200, null, null, 12, null);
            }
        }
        return aVar;
    }
}
