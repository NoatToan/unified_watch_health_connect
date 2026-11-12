package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zd0.j1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.EarnedBadgeChallengesFragment$fetchChallenges$1", f = "EarnedBadgeChallengesFragment.kt", l = {116}, m = "invokeSuspend", v = 2)
public final class b0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a0 f37358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f37360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f37361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f37362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f37363f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.EarnedBadgeChallengesFragment$fetchChallenges$1$1", f = "EarnedBadgeChallengesFragment.kt", l = {116}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f37364a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Boolean> dVar) {
            return new a(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f37364a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            j1 j1Var = (j1) KoinJavaComponent.get$default(j1.class, null, null, 6, null);
            c80.q qVar = c80.q.SOCIAL;
            this.f37364a = 1;
            Object objL = j1Var.l(qVar, this);
            return objL == aVar ? aVar : objL;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(boolean z14, a0 a0Var, int i14, int i15, t13.d<? super b0> dVar) {
        super(2, dVar);
        this.f37360c = z14;
        this.f37361d = a0Var;
        this.f37362e = i14;
        this.f37363f = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b0(this.f37360c, this.f37361d, this.f37362e, this.f37363f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, o13.l] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        a0 a0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f37359b;
        final int i15 = 0;
        final int i16 = 1;
        final a0 a0Var2 = this.f37361d;
        if (i14 == 0) {
            o13.r.b(obj);
            if (this.f37360c) {
                a0Var2.T6(false);
            } else {
                a0Var2.c7();
            }
            x53.c cVar = o53.s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(null);
            this.f37358a = a0Var2;
            this.f37359b = 1;
            obj = ge1.b.e0(bVar, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
            a0Var = a0Var2;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a0Var = this.f37358a;
            o13.r.b(obj);
        }
        a0Var.f37305v = ((Boolean) obj).booleanValue();
        int i17 = a0Var2.f37298m;
        ?? r14 = a0Var2.f37304t;
        if (i17 == -1) {
            pt0.e0 e0Var = (pt0.e0) r14.getValue();
            e0Var.getClass();
            androidx.lifecycle.m.a(null, new pt0.c0(e0Var, this.f37362e, this.f37363f, null), 3).f(a0Var2.getViewLifecycleOwner(), new a0.d(new e23.l() { // from class: mt0.k2
                @Override // e23.l
                public final Object invoke(Object obj2) {
                    List list = (List) obj2;
                    switch (i15) {
                        case 0:
                            list.getClass();
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.a0.d7(a0Var2, list);
                            break;
                        default:
                            list.getClass();
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.a0.d7(a0Var2, list);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }));
        } else {
            pt0.e0 e0Var2 = (pt0.e0) r14.getValue();
            int i18 = a0Var2.f37298m;
            com.garmin.android.apps.connectmobile.badges.service.model.a aVar3 = a0Var2.f37300o;
            aVar3.getClass();
            e0Var2.getClass();
            androidx.lifecycle.m.a(null, new pt0.b0(aVar3, e0Var2, i18, this.f37362e, this.f37363f, null), 3).f(a0Var2.getViewLifecycleOwner(), new a0.d(new e23.l() { // from class: mt0.k2
                @Override // e23.l
                public final Object invoke(Object obj2) {
                    List list = (List) obj2;
                    switch (i16) {
                        case 0:
                            list.getClass();
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.a0.d7(a0Var2, list);
                            break;
                        default:
                            list.getClass();
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.a0.d7(a0Var2, list);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }));
        }
        return Unit.INSTANCE;
    }
}
