package ki1;

import android.content.Context;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.findmydevice.presentation.FindMyDeviceScreenKt$FindMyDeviceScreen$11$1", f = "FindMyDeviceScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f104843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f104844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f104845c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, e23.a<Unit> aVar, p1<Boolean> p1Var, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f104843a = context;
        this.f104844b = aVar;
        this.f104845c = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f104843a, this.f104844b, this.f104845c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        p1<Boolean> p1Var = this.f104845c;
        if (p1Var.getF182175a().booleanValue()) {
            p1Var.setValue(Boolean.FALSE);
            Context context = this.f104843a;
            Toast.makeText(context, context.getString(R.string.txt_error_occurred), 0).show();
            this.f104844b.invoke();
        }
        return Unit.INSTANCE;
    }
}
