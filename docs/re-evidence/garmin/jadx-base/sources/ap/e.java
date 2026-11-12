package ap;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.multisport.advancededit.viewmodel.MultisportEditLegsViewModel$deleteLeg$1", f = "MultisportEditLegsViewModel.kt", l = {389}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f11614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11615c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, int i14, t13.d<? super e> dVar2) {
        super(2, dVar2);
        this.f11614b = dVar;
        this.f11615c = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f11614b, this.f11615c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Integer num;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f11613a;
        int i15 = this.f11615c;
        d dVar = this.f11614b;
        if (i14 == 0) {
            r.b(obj);
            if (dVar.f11593e.f198239i.d() != null) {
                yo.e eVar = dVar.f11593e;
                this.f11613a = 1;
                if (eVar.d(i15, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        if (i15 > 0 && (num = (Integer) dVar.f11597i.d()) != null && num.intValue() != -1) {
            dVar.A4(num.intValue() - 1);
        }
        return Unit.INSTANCE;
    }
}
