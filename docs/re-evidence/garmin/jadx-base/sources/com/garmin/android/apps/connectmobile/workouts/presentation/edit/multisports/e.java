package com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports;

import am.x0;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.h0;
import com.google.android.gms.wallet.WalletConstants;
import e23.p;
import java.util.Iterator;
import java.util.List;
import m52.k;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.MultiSportViewModel$updateStepLimitPostValue$1", f = "MultiSportViewModel.kt", l = {WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f49163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WorkoutDetailsDTO f49164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f49165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f49166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f49167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f49168f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f49169g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f49170h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.MultiSportViewModel$updateStepLimitPostValue$1$1", f = "MultiSportViewModel.kt", l = {WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Iterator f49171a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public h0 f49172b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f49173c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ WorkoutDetailsDTO f49174d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ c f49175e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(WorkoutDetailsDTO workoutDetailsDTO, c cVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f49174d = workoutDetailsDTO;
            this.f49175e = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f49174d, this.f49175e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0033  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0069 -> B:22:0x006c). Please report as a decompilation issue!!! */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Iterator<h0> it;
            h0 next;
            k kVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f49173c;
            WorkoutDetailsDTO workoutDetailsDTO = this.f49174d;
            c cVar = this.f49175e;
            if (i14 == 0) {
                r.b(obj);
                List<h0> list = workoutDetailsDTO != null ? workoutDetailsDTO.Q0 : null;
                list.getClass();
                it = list.iterator();
                while (it.hasNext()) {
                    next = it.next();
                    kVar = next.f48193h;
                    if (!k52.g.f(kVar) && !cVar.f49144z.containsKey(new Integer(next.f48193h.f116766b))) {
                        x0 x0VarC = k52.g.c(kVar);
                        boolean zG = s.g(workoutDetailsDTO.I0, Boolean.TRUE);
                        this.f49171a = it;
                        this.f49172b = next;
                        this.f49173c = 1;
                        obj = c.W4(cVar, x0VarC, zG, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            next = this.f49172b;
            it = this.f49171a;
            r.b(obj);
            com.garmin.android.apps.connectmobile.repcounting.model.c cVar2 = (com.garmin.android.apps.connectmobile.repcounting.model.c) obj;
            if (cVar2 != null) {
                cVar.f49144z.put(new Integer(next.f48193h.f116766b), cVar2);
            }
            while (it.hasNext()) {
                next = it.next();
                kVar = next.f48193h;
                if (!k52.g.f(kVar)) {
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(WorkoutDetailsDTO workoutDetailsDTO, c cVar, boolean z14, int i14, int i15, boolean z15, boolean z16, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f49164b = workoutDetailsDTO;
        this.f49165c = cVar;
        this.f49166d = z14;
        this.f49167e = i14;
        this.f49168f = i15;
        this.f49169g = z15;
        this.f49170h = z16;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f49164b, this.f49165c, this.f49166d, this.f49167e, this.f49168f, this.f49169g, this.f49170h, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        int i14;
        boolean z14;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f49163a;
        WorkoutDetailsDTO workoutDetailsDTO = this.f49164b;
        c cVar = this.f49165c;
        if (i15 == 0) {
            r.b(obj);
            x53.c cVar2 = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(workoutDetailsDTO, cVar, null);
            this.f49163a = 1;
            if (ge1.b.e0(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        Iterator<T> it = workoutDetailsDTO.Q0.iterator();
        do {
            boolean zHasNext = it.hasNext();
            i14 = this.f49167e;
            z14 = this.f49166d;
            if (!zHasNext) {
                cVar.f49142x.j(new g.a(this.f49170h, z14 && i14 < 25, false, this.f49168f, this.f49169g, cVar.f49144z, 4, null));
            }
            return Unit.INSTANCE;
        } while (((h0) it.next()).d());
        cVar.f49142x.j(new g.a(false, z14 && i14 < 25, false, this.f49168f, this.f49169g, cVar.f49144z, 1, null));
        return Unit.INSTANCE;
    }
}
