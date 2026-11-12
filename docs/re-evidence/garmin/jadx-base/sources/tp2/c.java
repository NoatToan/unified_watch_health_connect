package tp2;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.garmin.feature.garminpay.providers.gpay.ui.managecard.FitPayCardDetailsActivity;
import e23.p;
import o13.r;
import o53.b0;
import o53.f0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.managecard.FitPayCardDetailsActivity$removeCard$1", f = "FitPayCardDetailsActivity.kt", l = {498}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f165944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FitPayCardDetailsActivity f165945b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.managecard.FitPayCardDetailsActivity$removeCard$1$isSuccessful$1", f = "FitPayCardDetailsActivity.kt", l = {499}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f165946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FitPayCardDetailsActivity f165947b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FitPayCardDetailsActivity fitPayCardDetailsActivity, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f165947b = fitPayCardDetailsActivity;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f165947b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Boolean> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f165946a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            g gVar = this.f165947b.f51680n;
            if (gVar == null) {
                s.m("viewModel");
                throw null;
            }
            this.f165946a = 1;
            Object objC4 = gVar.C4(this);
            return objC4 == aVar ? aVar : objC4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(FitPayCardDetailsActivity fitPayCardDetailsActivity, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f165945b = fitPayCardDetailsActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f165945b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f165944a;
        FitPayCardDetailsActivity fitPayCardDetailsActivity = this.f165945b;
        if (i14 == 0) {
            r.b(obj);
            FitPayCardDetailsActivity.a aVar2 = FitPayCardDetailsActivity.F;
            fitPayCardDetailsActivity.ea().error("removeCard");
            SwipeRefreshLayout swipeRefreshLayout = fitPayCardDetailsActivity.f51678l;
            if (swipeRefreshLayout == null) {
                s.m("swipeRefreshLayout");
                throw null;
            }
            swipeRefreshLayout.setRefreshing(true);
            t13.g gVarPlus = f0.w(fitPayCardDetailsActivity).f7937b.plus(s0.f129406a);
            a aVar3 = new a(fitPayCardDetailsActivity, null);
            this.f165944a = 1;
            obj = ge1.b.e0(gVarPlus, aVar3, this);
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
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        SwipeRefreshLayout swipeRefreshLayout2 = fitPayCardDetailsActivity.f51678l;
        if (swipeRefreshLayout2 == null) {
            s.m("swipeRefreshLayout");
            throw null;
        }
        swipeRefreshLayout2.setRefreshing(false);
        if (zBooleanValue) {
            fitPayCardDetailsActivity.ia(true);
        } else {
            fitPayCardDetailsActivity.ea().error("removeCard: failed to remove card");
            FitPayCardDetailsActivity.ca(fitPayCardDetailsActivity);
        }
        return Unit.INSTANCE;
    }
}
