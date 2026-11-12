package qp2;

import com.garmin.feature.garminpay.providers.gpay.ui.garminpaytermsconditions.NewFitPayTermsAndConditionActivity;
import e23.p;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.garminpaytermsconditions.NewFitPayTermsAndConditionActivity$createUserOrAcceptTermsAndConditions$1", f = "NewFitPayTermsAndConditionActivity.kt", l = {166}, m = "invokeSuspend", v = 2)
public final class e extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f146036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewFitPayTermsAndConditionActivity f146037b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(NewFitPayTermsAndConditionActivity newFitPayTermsAndConditionActivity, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f146037b = newFitPayTermsAndConditionActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f146037b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f146036a;
        NewFitPayTermsAndConditionActivity newFitPayTermsAndConditionActivity = this.f146037b;
        try {
            if (i14 == 0) {
                r.b(obj);
                if (newFitPayTermsAndConditionActivity.f51590h == null) {
                    s.m("viewModel");
                    throw null;
                }
                this.f146036a = 1;
                Object objE0 = ge1.b.e0(s0.f129406a, new c(null), this);
                if (objE0 != obj2) {
                    objE0 = Unit.INSTANCE;
                }
                if (objE0 == obj2) {
                    return obj2;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            newFitPayTermsAndConditionActivity.setResult(-1);
            newFitPayTermsAndConditionActivity.finish();
        } catch (Exception e4) {
            NewFitPayTermsAndConditionActivity.f51588k.error("createUserAndNavigateToAddCardFlow", (Throwable) e4);
            newFitPayTermsAndConditionActivity.getClass();
            br2.c.h(br2.c.f19585a, newFitPayTermsAndConditionActivity, new q42.d(newFitPayTermsAndConditionActivity, 14), null, 4);
        }
        return Unit.INSTANCE;
    }
}
