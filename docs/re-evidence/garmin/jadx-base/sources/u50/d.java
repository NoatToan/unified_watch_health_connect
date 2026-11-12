package u50;

import android.widget.EditText;
import com.garmin.android.apps.connectmobile.courses.presentation.search.CourseSearchActivity;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.search.CourseSearchActivity$setupComposeContent$1$1$2$1", f = "CourseSearchActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CourseSearchActivity f168646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x3<x50.f> f168647b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CourseSearchActivity courseSearchActivity, x3<x50.f> x3Var, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f168646a = courseSearchActivity;
        this.f168647b = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f168646a, this.f168647b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        EditText editText = this.f168646a.f33095d;
        if (editText != null) {
            editText.setHint(this.f168647b.getF182175a().f189011f);
        }
        return Unit.INSTANCE;
    }
}
