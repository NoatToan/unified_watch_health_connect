package wj0;

import android.view.View;
import androidx.fragment.app.Fragment;
import c80.q;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import g22.k;
import lc.u0;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r22.q0;
import v13.e;
import v13.i;
import vb.h;
import zd0.j1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.gcplus.domain.PremiumBadgeChallengeExtensionsKt$checkPremiumFeatureStatusBeforeJoin$3", f = "PremiumBadgeChallengeExtensions.kt", l = {65}, m = "invokeSuspend", v = 2)
public final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f185772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f185773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f185774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Fragment f185775d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e23.a<Unit> aVar, e23.a<Unit> aVar2, Fragment fragment, t13.d<? super a> dVar) {
        super(2, dVar);
        this.f185773b = aVar;
        this.f185774c = aVar2;
        this.f185775d = fragment;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a(this.f185773b, this.f185774c, this.f185775d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f185772a;
        if (i14 == 0) {
            r.b(obj);
            j1 j1Var = (j1) KoinJavaComponent.get$default(j1.class, null, null, 6, null);
            q qVar = q.SOCIAL;
            this.f185772a = 1;
            obj = j1Var.j(qVar, this);
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
        c80.p pVar = (c80.p) obj;
        boolean z14 = pVar instanceof c80.p.a;
        e23.a<Unit> aVar2 = this.f185773b;
        if (z14) {
            c80.p.a aVar3 = (c80.p.a) pVar;
            if (!k.A(aVar3.f25519a).isBeforeNow() || aVar3.f25520b) {
                this.f185774c.invoke();
            } else {
                aVar2.invoke();
            }
        } else if (pVar instanceof c80.p.b) {
            aVar2.invoke();
        } else {
            if (!(pVar instanceof c80.p.c)) {
                u0.r();
                return null;
            }
            q0.b bVar = q0.f149800b;
            Fragment fragment = this.f185775d;
            View viewRequireView = fragment.requireView();
            viewRequireView.getClass();
            String string = fragment.getString(R.string.msg_something_went_wrong_please_try_again_later);
            string.getClass();
            q0.b.c(bVar, viewRequireView, string, null, 12).show();
        }
        return Unit.INSTANCE;
    }
}
