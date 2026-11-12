package tt1;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity$initChildView$1", f = "ActiveTrainingPlansActivity.kt", l = {175}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f166434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f166435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActiveTrainingPlansActivity f166436c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ActiveTrainingPlansActivity f166437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b0 f166438b;

        public a(ActiveTrainingPlansActivity activeTrainingPlansActivity, b0 b0Var) {
            this.f166437a = activeTrainingPlansActivity;
            this.f166438b = b0Var;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            Boolean bool = (Boolean) obj;
            boolean zG = s.g(bool, Boolean.TRUE);
            b0 b0Var = this.f166438b;
            ActiveTrainingPlansActivity activeTrainingPlansActivity = this.f166437a;
            if (zG) {
                ActiveTrainingPlansActivity.a aVar = ActiveTrainingPlansActivity.f45098w;
                activeTrainingPlansActivity.ra();
                g8.i.G(b0Var.getF195311f()).c(null);
            } else if (s.g(bool, Boolean.FALSE)) {
                ActiveTrainingPlansActivity.a aVar2 = ActiveTrainingPlansActivity.f45098w;
                activeTrainingPlansActivity.setTitle(R.string.atp_lbl_plans_section_title);
                ComposeView composeView = (ComposeView) activeTrainingPlansActivity.findViewById(R.id.compose_view);
                activeTrainingPlansActivity.hideProgressOverlay();
                composeView.getClass();
                composeView.setVisibility(0);
                l.f166459a.getClass();
                composeView.setContent(l.f166460b);
                g8.i.G(b0Var.getF195311f()).c(null);
            } else {
                View view2 = activeTrainingPlansActivity.f45099e;
                if (view2 == null) {
                    s.m("trainingPlansContainer");
                    throw null;
                }
                view2.setVisibility(8);
                activeTrainingPlansActivity.showProgressOverlay();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ActiveTrainingPlansActivity activeTrainingPlansActivity, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f166436c = activeTrainingPlansActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g gVar = new g(this.f166436c, dVar);
        gVar.f166435b = obj;
        return gVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f166435b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f166434a;
        if (i14 == 0) {
            r.b(obj);
            ActiveTrainingPlansActivity activeTrainingPlansActivity = this.f166436c;
            ut1.e eVar = activeTrainingPlansActivity.f45108n;
            if (eVar == null) {
                s.m("viewModel");
                throw null;
            }
            r53.c cVarG = r53.s.g(eVar.f172590i);
            a aVar2 = new a(activeTrainingPlansActivity, b0Var);
            this.f166435b = null;
            this.f166434a = 1;
            if (cVarG.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
