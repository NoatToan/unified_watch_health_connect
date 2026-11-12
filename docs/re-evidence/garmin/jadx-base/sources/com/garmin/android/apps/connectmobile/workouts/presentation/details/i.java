package com.garmin.android.apps.connectmobile.workouts.presentation.details;

import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$deleteWorkout$1", f = "WorkoutDetailsViewModel.kt", l = {860, 863, 864, 867, 871}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f48694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f48695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f48696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f48697d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Long l14, String str, f fVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f48695b = l14;
        this.f48696c = str;
        this.f48697d = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f48695b, this.f48696c, this.f48697d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0059 A[PHI: r14
      0x0059: PHI (r14v8 java.lang.Object) = (r14v7 java.lang.Object), (r14v0 java.lang.Object) binds: [B:25:0x0056, B:14:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0078  */
    /* JADX WARN: Code duplicated, block: B:34:0x007c  */
    /* JADX WARN: Code duplicated, block: B:39:0x008f  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        if (v52.d.d(r14, r1, r13) == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0089, code lost:
    
        if (r14.h(r1, r13) == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a0, code lost:
    
        if (r14.h(r1, r13) == r0) goto L42;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v2 v2Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f48694a;
        String str = this.f48696c;
        Long l14 = this.f48695b;
        f fVar = this.f48697d;
        if (i14 == 0) {
            o13.r.b(obj);
            if (l14 == null || str == null) {
                q53.w<v52.c<? extends d>> wVar = fVar.f48598k0;
                v52.c.a aVar2 = new v52.c.a(null, 1, null);
                this.f48694a = 1;
            } else {
                q53.w<v52.c<? extends d>> wVar2 = fVar.f48598k0;
                v52.c.b bVar = v52.c.b.f175759a;
                this.f48694a = 2;
                if (wVar2.h(bVar, this) != aVar) {
                    l52.y yVar = fVar.f48588b;
                    long jLongValue = l14.longValue();
                    this.f48694a = 3;
                    obj = yVar.o(jLongValue, this);
                    if (obj != aVar) {
                        v2Var = (v2) obj;
                        if (v2Var instanceof v2.b) {
                            i62.p pVar = i62.p.f91878a;
                            long jLongValue2 = l14.longValue();
                            pVar.getClass();
                            i62.p.b(jLongValue2, str);
                            q53.w<v52.c<? extends d>> wVar3 = fVar.f48598k0;
                            d.C0946d c0946d = d.C0946d.f48521a;
                            this.f48694a = 4;
                        } else {
                            if (!(v2Var instanceof v2.a)) {
                                u0.r();
                                return null;
                            }
                            q53.w<v52.c<? extends d>> wVar4 = fVar.f48598k0;
                            v52.c.a aVar3 = new v52.c.a(null, 1, null);
                            this.f48694a = 5;
                        }
                    }
                }
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            return Unit.INSTANCE;
        }
        if (i14 == 2) {
            o13.r.b(obj);
            l52.y yVar2 = fVar.f48588b;
            long jLongValue3 = l14.longValue();
            this.f48694a = 3;
            obj = yVar2.o(jLongValue3, this);
            if (obj != aVar) {
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    i62.p pVar2 = i62.p.f91878a;
                    long jLongValue4 = l14.longValue();
                    pVar2.getClass();
                    i62.p.b(jLongValue4, str);
                    q53.w<v52.c<? extends d>> wVar5 = fVar.f48598k0;
                    d.C0946d c0946d2 = d.C0946d.f48521a;
                    this.f48694a = 4;
                } else {
                    if (!(v2Var instanceof v2.a)) {
                        u0.r();
                        return null;
                    }
                    q53.w<v52.c<? extends d>> wVar6 = fVar.f48598k0;
                    v52.c.a aVar4 = new v52.c.a(null, 1, null);
                    this.f48694a = 5;
                }
            }
            return aVar;
        }
        if (i14 == 3) {
            o13.r.b(obj);
            v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                i62.p pVar3 = i62.p.f91878a;
                long jLongValue5 = l14.longValue();
                pVar3.getClass();
                i62.p.b(jLongValue5, str);
                q53.w<v52.c<? extends d>> wVar7 = fVar.f48598k0;
                d.C0946d c0946d3 = d.C0946d.f48521a;
                this.f48694a = 4;
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                q53.w<v52.c<? extends d>> wVar8 = fVar.f48598k0;
                v52.c.a aVar5 = new v52.c.a(null, 1, null);
                this.f48694a = 5;
            }
        } else {
            if (i14 != 4 && i14 != 5) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
