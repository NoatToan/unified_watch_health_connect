package we1;

import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import o13.r;
import o53.b0;
import org.apache.commons.lang3.BooleanUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.running_economy.presentation.RunningEconomyViewModel$shouldShowBanner$1", f = "RunningEconomyViewModel.kt", l = {234, 235}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2 f184818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f184819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f184820c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d dVar, t13.d<? super h> dVar2) {
        super(2, dVar2);
        this.f184820c = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f184820c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        v2 v2Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f184819b;
        d dVar = this.f184820c;
        if (i14 == 0) {
            r.b(obj);
            re1.a aVar2 = dVar.f184776a;
            this.f184819b = 1;
            obj = aVar2.a(this);
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
            v2Var = this.f184818a;
            r.b(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if ((v2Var instanceof v2.b) && !zBooleanValue && !s.g(((te1.a) ((v2.b) v2Var).f47386a).getValue(), BooleanUtils.TRUE) && ((Boolean) dVar.f184780e.getF182175a()).booleanValue()) {
            dVar.f184781f.setValue(Boolean.TRUE);
        }
        return Unit.INSTANCE;
        v2 v2Var2 = (v2) obj;
        this.f184818a = v2Var2;
        this.f184819b = 2;
        Object objX4 = d.x4(dVar, this);
        if (objX4 != aVar) {
            v2Var = v2Var2;
            obj = objX4;
            boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
            if (v2Var instanceof v2.b) {
                dVar.f184781f.setValue(Boolean.TRUE);
            }
            return Unit.INSTANCE;
        }
        return aVar;
    }
}
