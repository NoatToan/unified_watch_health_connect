package yr;

import i3.mc;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.overview.components.EditNameAndNotesBottomSheetKt$EditNameAndNotesBottomSheet$1$1$1$1$1", f = "EditNameAndNotesBottomSheet.kt", l = {97}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f198905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p<String, String, Unit> f198906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mc f198907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1<String> f198908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1<String> f198909e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u(e23.p<? super String, ? super String, Unit> pVar, mc mcVar, p1<String> p1Var, p1<String> p1Var2, t13.d<? super u> dVar) {
        super(2, dVar);
        this.f198906b = pVar;
        this.f198907c = mcVar;
        this.f198908d = p1Var;
        this.f198909e = p1Var2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new u(this.f198906b, this.f198907c, this.f198908d, this.f198909e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f198905a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f198906b.invoke(this.f198908d.getF182175a(), this.f198909e.getF182175a());
            this.f198905a = 1;
            if (this.f198907c.d(this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
