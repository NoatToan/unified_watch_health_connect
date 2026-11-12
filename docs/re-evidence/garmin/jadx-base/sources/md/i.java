package md;

import androidx.room.b0;
import androidx.room.t0;
import androidx.room.u0;
import jd.w;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"R", "Landroidx/room/u0;", "transactor", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1", f = "DBUtil.android.kt", l = {56, 57, 59, 60}, m = "invokeSuspend")
public final class i extends v13.i implements e23.p<u0, t13.d<Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u0.a f117852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f117853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f117854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f117855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f117856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0 f117857f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.l f117858g;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n"}, d2 = {"R", "Landroidx/room/t0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", l = {}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<t0<Object>, t13.d<Object>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f117859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l f117860b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t13.d dVar, e23.l lVar) {
            super(2, dVar);
            this.f117860b = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(dVar, this.f117860b);
            aVar.f117859a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(t0<Object> t0Var, t13.d<Object> dVar) {
            return ((a) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            t0 t0Var = (t0) this.f117859a;
            t0Var.getClass();
            return this.f117860b.invoke(((w) t0Var).getF98235b());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(boolean z14, boolean z15, b0 b0Var, t13.d dVar, e23.l lVar) {
        super(2, dVar);
        this.f117855d = z14;
        this.f117856e = z15;
        this.f117857f = b0Var;
        this.f117858g = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f117855d, this.f117856e, this.f117857f, dVar, this.f117858g);
        iVar.f117854c = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(u0 u0Var, t13.d<Object> dVar) {
        return ((i) create(u0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009d A[DONT_INVERT, PHI: r1 r11
      0x009d: PHI (r1v11 androidx.room.u0) = (r1v8 androidx.room.u0), (r1v17 androidx.room.u0) binds: [B:34:0x009a, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x009d: PHI (r11v17 java.lang.Object) = (r11v15 java.lang.Object), (r11v0 java.lang.Object) binds: [B:34:0x009a, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x009f  */
    /* JADX WARN: Code duplicated, block: B:40:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c2 A[RETURN] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u0.a aVar;
        u0 u0Var;
        u0.a aVar2;
        u0 u0Var2;
        u0 u0Var3;
        Boolean boolD;
        Object obj2;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f117853b;
        e23.l lVar = this.f117858g;
        b0 b0Var = this.f117857f;
        boolean z14 = this.f117856e;
        if (i14 == 0) {
            r.b(obj);
            u0 u0Var4 = (u0) this.f117854c;
            if (!this.f117855d) {
                u0Var4.getClass();
                return lVar.invoke(((w) u0Var4).getF98235b());
            }
            aVar = z14 ? u0.a.DEFERRED : u0.a.IMMEDIATE;
            if (z14) {
                u0.a aVar4 = aVar;
                u0Var = u0Var4;
                aVar2 = aVar4;
                a aVar5 = new a(null, lVar);
                this.f117854c = u0Var;
                this.f117852a = null;
                this.f117853b = 3;
                obj = u0Var.b(aVar2, aVar5, this);
                if (obj != aVar3) {
                    if (z14) {
                        return obj;
                    }
                    this.f117854c = obj;
                    this.f117853b = 4;
                    boolD = u0Var.d(this);
                    if (boolD != aVar3) {
                        obj2 = obj;
                        obj = boolD;
                        if (!((Boolean) obj).booleanValue()) {
                            androidx.room.m invalidationTracker = b0Var.getInvalidationTracker();
                            invalidationTracker.f10883e.e(invalidationTracker.f10887i, invalidationTracker.f10888j);
                        }
                        return obj2;
                    }
                }
            } else {
                this.f117854c = u0Var4;
                this.f117852a = aVar;
                this.f117853b = 1;
                Boolean boolD2 = u0Var4.d(this);
                if (boolD2 != aVar3) {
                    u0Var2 = u0Var4;
                    obj = boolD2;
                }
            }
            return aVar3;
        }
        if (i14 == 1) {
            aVar = this.f117852a;
            u0Var2 = (u0) this.f117854c;
            r.b(obj);
        } else {
            if (i14 == 2) {
                aVar = this.f117852a;
                u0Var3 = (u0) this.f117854c;
                r.b(obj);
                aVar2 = aVar;
                u0Var = u0Var3;
                a aVar6 = new a(null, lVar);
                this.f117854c = u0Var;
                this.f117852a = null;
                this.f117853b = 3;
                obj = u0Var.b(aVar2, aVar6, this);
                if (obj != aVar3) {
                    if (z14) {
                        return obj;
                    }
                    this.f117854c = obj;
                    this.f117853b = 4;
                    boolD = u0Var.d(this);
                    if (boolD != aVar3) {
                        obj2 = obj;
                        obj = boolD;
                    }
                }
                return aVar3;
            }
            if (i14 == 3) {
                u0Var = (u0) this.f117854c;
                r.b(obj);
                if (z14) {
                    return obj;
                }
                this.f117854c = obj;
                this.f117853b = 4;
                boolD = u0Var.d(this);
                if (boolD != aVar3) {
                    obj2 = obj;
                    obj = boolD;
                }
                return aVar3;
            }
            if (i14 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = this.f117854c;
            r.b(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            androidx.room.m invalidationTracker2 = b0Var.getInvalidationTracker();
            invalidationTracker2.f10883e.e(invalidationTracker2.f10887i, invalidationTracker2.f10888j);
        }
        return obj2;
        if (((Boolean) obj).booleanValue()) {
            aVar2 = aVar;
            u0Var = u0Var2;
            a aVar7 = new a(null, lVar);
            this.f117854c = u0Var;
            this.f117852a = null;
            this.f117853b = 3;
            obj = u0Var.b(aVar2, aVar7, this);
            if (obj != aVar3) {
                if (z14) {
                    return obj;
                }
                this.f117854c = obj;
                this.f117853b = 4;
                boolD = u0Var.d(this);
                if (boolD != aVar3) {
                    obj2 = obj;
                    obj = boolD;
                    if (!((Boolean) obj).booleanValue()) {
                        androidx.room.m invalidationTracker3 = b0Var.getInvalidationTracker();
                        invalidationTracker3.f10883e.e(invalidationTracker3.f10887i, invalidationTracker3.f10888j);
                    }
                    return obj2;
                }
            }
        } else {
            androidx.room.m invalidationTracker4 = b0Var.getInvalidationTracker();
            this.f117854c = u0Var2;
            this.f117852a = aVar;
            this.f117853b = 2;
            if (invalidationTracker4.d(this) != aVar3) {
                u0Var3 = u0Var2;
                aVar2 = aVar;
                u0Var = u0Var3;
                a aVar8 = new a(null, lVar);
                this.f117854c = u0Var;
                this.f117852a = null;
                this.f117853b = 3;
                obj = u0Var.b(aVar2, aVar8, this);
                if (obj != aVar3) {
                    if (z14) {
                        return obj;
                    }
                    this.f117854c = obj;
                    this.f117853b = 4;
                    boolD = u0Var.d(this);
                    if (boolD != aVar3) {
                        obj2 = obj;
                        obj = boolD;
                        if (!((Boolean) obj).booleanValue()) {
                            androidx.room.m invalidationTracker5 = b0Var.getInvalidationTracker();
                            invalidationTracker5.f10883e.e(invalidationTracker5.f10887i, invalidationTracker5.f10888j);
                        }
                        return obj2;
                    }
                }
            }
        }
        return aVar3;
    }
}
