package u82;

import e23.p;
import java.util.Objects;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.o2;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.ui.patterns.reports.page.ReportsPageCachedRepositoryState$getPageData$1", f = "ReportsPageCachedRepositoryState.kt", l = {87}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f169488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a<Object, Object> f169489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f169490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o2<f<Object>> f169491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f169492e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(a<Object, Object> aVar, Object obj, o2<? extends f<Object>> o2Var, boolean z14, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f169489b = aVar;
        this.f169490c = obj;
        this.f169491d = o2Var;
        this.f169492e = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f169489b, this.f169490c, this.f169491d, this.f169492e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f169488a;
        Object obj2 = this.f169490c;
        a<Object, Object> aVar2 = this.f169489b;
        try {
            if (i14 == 0) {
                r.b(obj);
                o2<f<Object>> o2Var = this.f169491d;
                boolean z14 = this.f169492e;
                this.f169488a = 1;
                if (a.d(aVar2, obj2, o2Var, z14, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            Objects.toString(obj2);
            int i15 = a.f169478e;
            aVar2.getClass();
            aVar2.f169481c.remove(obj2);
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            aVar2.f169481c.remove(obj2);
            throw th3;
        }
    }
}
