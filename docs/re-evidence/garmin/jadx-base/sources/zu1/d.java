package zu1;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.v;
import androidx.lifecycle.i0;
import e23.p;
import jv1.n;
import o13.r;
import o53.b0;
import o53.s0;
import o53.t1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import u53.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.dashboard.fragments.FBTDashBoardFragment$checkAndShowAddToHomeDialog$1", f = "FBTDashBoardFragment.kt", l = {212, 213}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f207089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f207090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f207091c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.dashboard.fragments.FBTDashBoardFragment$checkAndShowAddToHomeDialog$1$1", f = "FBTDashBoardFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f207092a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f207092a = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f207092a, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            c cVar = this.f207092a;
            Context context = cVar.getContext();
            if (context != null) {
                v childFragmentManager = cVar.getChildFragmentManager();
                childFragmentManager.getClass();
                i0 i0VarB = g22.f.b(cVar);
                View viewRequireView = cVar.requireView();
                viewRequireView.getClass();
                tu1.a.q(context, childFragmentManager, i0VarB, viewRequireView, new b(cVar, 1));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n nVar, c cVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f207090b = nVar;
        this.f207091c = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f207090b, this.f207091c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if (ge1.b.e0(r6, r1, r5) == r0) goto L21;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        n nVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f207089a;
        if (i14 == 0) {
            r.b(obj);
            tu1.i.a aVar2 = tu1.i.f166483a;
            this.f207089a = 1;
            obj = aVar2.n(this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
        if (((Boolean) obj).booleanValue() && (nVar = this.f207090b) != null && !nVar.f101094p) {
            x53.c cVar = s0.f129406a;
            t1 t1Var = o.f168762a;
            a aVar3 = new a(this.f207091c, null);
            this.f207089a = 2;
        }
        return Unit.INSTANCE;
    }
}
