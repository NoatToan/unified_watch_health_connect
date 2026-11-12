package zt0;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengeDTO;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import u62.z;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.leaderboard.viewmodel.CreateChallengeViewModel$createAdHocChallenge$2", f = "CreateChallengeViewModel.kt", l = {81}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f206947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0<g3<AdHocChallengeDTO>> f206948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zt0.a f206949c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.leaderboard.viewmodel.CreateChallengeViewModel$createAdHocChallenge$2$1", f = "CreateChallengeViewModel.kt", l = {82}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f206950a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ zt0.a f206951b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ y0<g3<AdHocChallengeDTO>> f206952c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zt0.a aVar, y0<g3<AdHocChallengeDTO>> y0Var, d<? super a> dVar) {
            super(2, dVar);
            this.f206951b = aVar;
            this.f206952c = y0Var;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new a(this.f206951b, this.f206952c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f206950a;
            zt0.a aVar2 = this.f206951b;
            if (i14 == 0) {
                r.b(obj);
                yt0.a aVar3 = aVar2.f206930a;
                AdHocChallengeDTO adHocChallengeDTO = aVar2.f206931b;
                this.f206950a = 1;
                aVar3.getClass();
                obj = f0.J(aVar3, new yt0.c(aVar3, adHocChallengeDTO, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            boolean z14 = v2Var instanceof v2.b;
            y0<g3<AdHocChallengeDTO>> y0Var = this.f206952c;
            if (z14) {
                aVar2.f206932c.l(aVar2.f206931b.f37989c);
                g3.a aVar4 = g3.f35298f;
                T t7 = ((v2.b) v2Var).f47386a;
                z.h(aVar4, t7, y0Var);
                aVar2.f206940k.j((AdHocChallengeDTO) t7);
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                y0Var.j(g3.a.a(g3.f35298f, ((v2.a) v2Var).f47383a.toString(), null, null, null, 14));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(y0<g3<AdHocChallengeDTO>> y0Var, zt0.a aVar, d<? super b> dVar) {
        super(2, dVar);
        this.f206948b = y0Var;
        this.f206949c = aVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new b(this.f206948b, this.f206949c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f206947a;
        if (i14 == 0) {
            r.b(obj);
            g3<AdHocChallengeDTO> g3VarC = g3.a.c(g3.f35298f);
            y0<g3<AdHocChallengeDTO>> y0Var = this.f206948b;
            y0Var.m(g3VarC);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(this.f206949c, y0Var, null);
            this.f206947a = 1;
            if (ge1.b.e0(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
