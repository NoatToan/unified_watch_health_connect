package fo;

import android.content.Context;
import android.widget.Toast;
import java.util.Arrays;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.history.presentation.ActivitiesListScreenKt$ActivitiesListScreen$1$2$3$1", f = "ActivitiesListScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f72393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f72394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f72395c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(q qVar, Context context, e23.a<Unit> aVar, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f72393a = qVar;
        this.f72394b = context;
        this.f72395c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f72393a, this.f72394b, this.f72395c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        d0 d0Var = this.f72393a.f72410i;
        if (d0Var != null) {
            int i14 = d0Var.f72300a;
            String[] strArr = (String[]) d0Var.f72301b.toArray(new String[0]);
            Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
            Context context = this.f72394b;
            Toast.makeText(context, context.getString(i14, objArrCopyOf), 0).show();
            this.f72395c.invoke();
        }
        return Unit.INSTANCE;
    }
}
