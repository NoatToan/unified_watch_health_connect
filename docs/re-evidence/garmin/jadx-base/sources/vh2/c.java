package vh2;

import android.widget.Filter;
import e23.p;
import o13.r;
import o53.b0;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
@e(c = "com.garmin.androiddynamicsettings.app.features.search.SearchPresenter$startSearchJob$1", f = "SearchPresenter.kt", l = {92}, m = "invokeSuspend")
public final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f178414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Filter f178415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f178416c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Filter filter, String str, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f178415b = filter;
        this.f178416c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f178415b, this.f178416c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f178414a;
        if (i14 == 0) {
            r.b(obj);
            this.f178414a = 1;
            if (m0.b(250L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        this.f178415b.filter(this.f178416c);
        return Unit.INSTANCE;
    }
}
