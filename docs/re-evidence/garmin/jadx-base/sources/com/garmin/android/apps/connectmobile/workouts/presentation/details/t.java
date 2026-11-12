package com.garmin.android.apps.connectmobile.workouts.presentation.details;

import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$sendScheduleToDevice$1", f = "WorkoutDetailsViewModel.kt", l = {1051}, m = "invokeSuspend", v = 2)
public final class t extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f48809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f48810b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$sendScheduleToDevice$1$1", f = "WorkoutDetailsViewModel.kt", l = {1052, 1053, 1055, 1059}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f48812b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f48812b = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f48812b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0049  */
        /* JADX WARN: Code duplicated, block: B:26:0x0056  */
        /* JADX WARN: Code duplicated, block: B:28:0x005a  */
        /* JADX WARN: Code duplicated, block: B:33:0x006a  */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
        
            if (v52.d.d(r8, r1, r7) == r0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
        
            if (v52.d.d(r8, r1, r7) == r0) goto L30;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            v2 v2Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f48811a;
            f fVar = this.f48812b;
            if (i14 == 0) {
                o13.r.b(obj);
                q53.w<v52.c<? extends d>> wVar = fVar.f48598k0;
                v52.c.b bVar = v52.c.b.f175759a;
                this.f48811a = 1;
                if (wVar.h(bVar, this) != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else if (i14 == 2) {
                o13.r.b(obj);
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    q53.w<v52.c<? extends d>> wVar2 = fVar.f48598k0;
                    d.p pVar = d.p.f48537a;
                    this.f48811a = 3;
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    q53.w<v52.c<? extends d>> wVar3 = fVar.f48598k0;
                    d.h hVar = d.h.f48527a;
                    this.f48811a = 4;
                }
            } else {
                if (i14 != 3 && i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
            l52.y yVar = fVar.f48588b;
            this.f48811a = 2;
            obj = yVar.c();
            if (obj != aVar) {
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    q53.w<v52.c<? extends d>> wVar4 = fVar.f48598k0;
                    d.p pVar2 = d.p.f48537a;
                    this.f48811a = 3;
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    q53.w<v52.c<? extends d>> wVar5 = fVar.f48598k0;
                    d.h hVar2 = d.h.f48527a;
                    this.f48811a = 4;
                }
            }
            return aVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(f fVar, t13.d<? super t> dVar) {
        super(2, dVar);
        this.f48810b = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new t(this.f48810b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((t) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f48809a;
        if (i14 == 0) {
            o13.r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(this.f48810b, null);
            this.f48809a = 1;
            if (ge1.b.e0(bVar, aVar2, this) == aVar) {
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
