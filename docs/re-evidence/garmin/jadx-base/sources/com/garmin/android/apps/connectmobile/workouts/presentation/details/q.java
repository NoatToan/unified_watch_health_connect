package com.garmin.android.apps.connectmobile.workouts.presentation.details;

import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$removeScheduleWorkoutFromTrainingPlan$1", f = "WorkoutDetailsViewModel.kt", l = {961}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f48786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f48787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f48788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f48789d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$removeScheduleWorkoutFromTrainingPlan$1$1", f = "WorkoutDetailsViewModel.kt", l = {962, 963, 965, 969}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f48791b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f48792c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f48793d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, long j8, long j14, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f48791b = fVar;
            this.f48792c = j8;
            this.f48793d = j14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f48791b, this.f48792c, this.f48793d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0051  */
        /* JADX WARN: Code duplicated, block: B:26:0x005e  */
        /* JADX WARN: Code duplicated, block: B:28:0x0062  */
        /* JADX WARN: Code duplicated, block: B:33:0x0072  */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
        
            if (v52.d.d(r14, r1, r13) == r0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
        
            if (v52.d.d(r14, r1, r13) == r0) goto L30;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            a aVar;
            v2 v2Var;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f48790a;
            f fVar = this.f48791b;
            if (i14 == 0) {
                o13.r.b(obj);
                q53.w<v52.c<? extends d>> wVar = fVar.f48598k0;
                v52.c.b bVar = v52.c.b.f175759a;
                this.f48790a = 1;
                if (wVar.h(bVar, this) == aVar2) {
                }
                return aVar2;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else if (i14 == 2) {
                o13.r.b(obj);
                aVar = this;
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    q53.w<v52.c<? extends d>> wVar2 = fVar.f48598k0;
                    d.l lVar = d.l.f48531a;
                    aVar.f48790a = 3;
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    q53.w<v52.c<? extends d>> wVar3 = fVar.f48598k0;
                    d.h hVar = d.h.f48527a;
                    aVar.f48790a = 4;
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
            this.f48790a = 2;
            aVar = this;
            obj = yVar.R(this.f48792c, this.f48793d, aVar);
            if (obj != aVar2) {
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    q53.w<v52.c<? extends d>> wVar4 = fVar.f48598k0;
                    d.l lVar2 = d.l.f48531a;
                    aVar.f48790a = 3;
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    q53.w<v52.c<? extends d>> wVar5 = fVar.f48598k0;
                    d.h hVar2 = d.h.f48527a;
                    aVar.f48790a = 4;
                }
            }
            return aVar2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(f fVar, long j8, long j14, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f48787b = fVar;
        this.f48788c = j8;
        this.f48789d = j14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f48787b, this.f48788c, this.f48789d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f48786a;
        if (i14 == 0) {
            o13.r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(this.f48787b, this.f48788c, this.f48789d, null);
            this.f48786a = 1;
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
