package we1;

import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import o13.r;
import o53.b0;
import org.apache.commons.lang3.BooleanUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.running_economy.presentation.RunningEconomyViewModel$updatePreferences$1", f = "RunningEconomyViewModel.kt", l = {248}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f184821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f184822b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(d dVar, t13.d<? super i> dVar2) {
        super(2, dVar2);
        this.f184822b = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f184822b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f184821a;
        d dVar = this.f184822b;
        if (i14 == 0) {
            r.b(obj);
            te1.a aVar2 = new te1.a("runningeconomy.gc5.banner.dismissed", BooleanUtils.TRUE);
            re1.a aVar3 = dVar.f184776a;
            this.f184821a = 1;
            obj = aVar3.g(aVar2, this);
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
        if (((v2) obj) instanceof v2.b) {
            dVar.f184781f.setValue(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }
}
