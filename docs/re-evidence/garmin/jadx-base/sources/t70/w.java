package t70;

import android.content.Context;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.edit.EditInFocusScreenKt$EditInFocusSelection$2$1", f = "EditInFocusScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f163040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f163041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f163042c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Context context, l0 l0Var, e23.a<Unit> aVar, t13.d<? super w> dVar) {
        super(2, dVar);
        this.f163040a = context;
        this.f163041b = l0Var;
        this.f163042c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new w(this.f163040a, this.f163041b, this.f163042c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((w) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        Toast.makeText(this.f163040a, R.string.txt_error_occurred, 0).show();
        l0 l0Var = this.f163041b;
        l0.z4(l0Var, l0Var.f162918o);
        this.f163042c.invoke();
        return Unit.INSTANCE;
    }
}
