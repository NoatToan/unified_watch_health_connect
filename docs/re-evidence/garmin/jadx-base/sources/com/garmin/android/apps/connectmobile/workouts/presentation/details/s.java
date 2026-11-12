package com.garmin.android.apps.connectmobile.workouts.presentation.details;

import com.garmin.android.apps.connectmobile.v2;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$sendAddWorkoutToCalendar$1", f = "WorkoutDetailsViewModel.kt", l = {995}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f48801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f48802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f48803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f48804d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$sendAddWorkoutToCalendar$1$1", f = "WorkoutDetailsViewModel.kt", l = {996, 997, 999, 1003}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f48806b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f48807c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f48808d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, String str, long j8, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f48806b = fVar;
            this.f48807c = str;
            this.f48808d = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f48806b, this.f48807c, this.f48808d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0052  */
        /* JADX WARN: Code duplicated, block: B:29:0x005f  */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
        
            if (r11 == r0) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
        
            if (v52.d.d(r11, r1, r10) == r0) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
        
            if (r11.h(r1, r10) == r0) goto L31;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            v2 v2Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f48805a;
            f fVar = this.f48806b;
            if (i14 == 0) {
                o13.r.b(obj);
                q53.w<v52.c<? extends d>> wVar = fVar.f48598k0;
                v52.c.b bVar = v52.c.b.f175759a;
                this.f48805a = 1;
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
                    d.o oVar = d.o.f48536a;
                    this.f48805a = 3;
                } else {
                    q53.w<v52.c<? extends d>> wVar3 = fVar.f48598k0;
                    v52.c.a aVar2 = new v52.c.a(null, 1, null);
                    this.f48805a = 4;
                }
            } else {
                if (i14 != 3 && i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
            String str = this.f48807c;
            if (str != null) {
                l52.y yVar = fVar.f48588b;
                this.f48805a = 2;
                obj = yVar.j(this.f48808d, str, this);
            } else {
                v2Var = null;
                if (v2Var instanceof v2.b) {
                    q53.w<v52.c<? extends d>> wVar4 = fVar.f48598k0;
                    d.o oVar2 = d.o.f48536a;
                    this.f48805a = 3;
                } else {
                    q53.w<v52.c<? extends d>> wVar5 = fVar.f48598k0;
                    v52.c.a aVar3 = new v52.c.a(null, 1, null);
                    this.f48805a = 4;
                }
            }
            return aVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(f fVar, String str, long j8, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f48802b = fVar;
        this.f48803c = str;
        this.f48804d = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new s(this.f48802b, this.f48803c, this.f48804d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f48801a;
        if (i14 == 0) {
            o13.r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(this.f48802b, this.f48803c, this.f48804d, null);
            this.f48801a = 1;
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
