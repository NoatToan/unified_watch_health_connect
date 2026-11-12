package b50;

import i3.fe;
import l72.d3;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsActivity$showSnackbar$1", f = "CourseDetailsActivity.kt", l = {757}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fe f16010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CharSequence f16011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f16012d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(fe feVar, CharSequence charSequence, String str, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f16010b = feVar;
        this.f16011c = charSequence;
        this.f16012d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n(this.f16010b, this.f16011c, this.f16012d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f16009a;
        if (i14 == 0) {
            o13.r.b(obj);
            String string = this.f16011c.toString();
            this.f16009a = 1;
            if (d3.c(this.f16010b, string, this.f16012d, this) == aVar) {
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
