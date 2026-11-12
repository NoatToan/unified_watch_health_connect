package com.garmin.android.apps.connectmobile.activities.stats.exercises;

import e23.p;
import hq.h;
import hq.r0;
import hq.y0;
import java.util.List;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.exercises.SelectExerciseViewModel$updateExerciseList$1", f = "SelectExerciseViewModel.kt", l = {272}, m = "invokeSuspend", v = 2)
public final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f29910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CharSequence f29911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<com.garmin.android.apps.connectmobile.repcounting.model.d> f29912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<h> f29913e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lhq/r0;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.exercises.SelectExerciseViewModel$updateExerciseList$1$filteredExerciseList$1", f = "SelectExerciseViewModel.kt", l = {273}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super List<? extends r0>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f29914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List<com.garmin.android.apps.connectmobile.repcounting.model.d> f29915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ CharSequence f29916c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List<h> f29917d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ c f29918e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(List<com.garmin.android.apps.connectmobile.repcounting.model.d> list, CharSequence charSequence, List<? extends h> list2, c cVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f29915b = list;
            this.f29916c = charSequence;
            this.f29917d = list2;
            this.f29918e = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f29915b, this.f29916c, this.f29917d, this.f29918e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super List<? extends r0>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f29914a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            boolean z14 = this.f29918e.f29885b;
            this.f29914a = 1;
            Object objA = y0.a(this.f29915b, this.f29916c, this.f29917d, z14, this);
            return objA == aVar ? aVar : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(c cVar, CharSequence charSequence, List<com.garmin.android.apps.connectmobile.repcounting.model.d> list, List<? extends h> list2, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f29910b = cVar;
        this.f29911c = charSequence;
        this.f29912d = list;
        this.f29913e = list2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f29910b, this.f29911c, this.f29912d, this.f29913e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f29909a;
        if (i14 == 0) {
            r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(this.f29912d, this.f29911c, this.f29913e, this.f29910b, null);
            this.f29909a = 1;
            obj = ge1.b.e0(bVar, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        List list = (List) obj;
        boolean z14 = this.f29911c.length() == 0;
        int i15 = c.A;
        c cVar2 = this.f29910b;
        cVar2.f29892i.j(new e.a(cVar2.z4(list, null, z14, false), cVar2.f29889f, list.size()));
        return Unit.INSTANCE;
    }
}
