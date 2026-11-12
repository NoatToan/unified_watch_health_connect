package yy1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.ui.compose.TILocationScreenKt$TILocationScreen$4$1", f = "TILocationScreen.kt", l = {200}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f200172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f200173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AddTIEventViewModel f200174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c.q<String, Boolean> f200175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f200176e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, AddTIEventViewModel addTIEventViewModel, c.q<String, Boolean> qVar, p1<Boolean> p1Var, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f200173b = context;
        this.f200174c = addTIEventViewModel;
        this.f200175d = qVar;
        this.f200176e = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f200173b, this.f200174c, this.f200175d, this.f200176e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f200172a;
        if (i14 == 0) {
            o13.r.b(obj);
            if (this.f200176e.getF182175a().booleanValue()) {
                this.f200172a = 1;
                if (v.h(this.f200173b, this.f200174c, this) == aVar) {
                    return aVar;
                }
            } else {
                this.f200175d.a("android.permission.ACCESS_FINE_LOCATION", null);
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
