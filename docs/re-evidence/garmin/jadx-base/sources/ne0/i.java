package ne0;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Li53/c;", "Lpe0/a;", "<anonymous>", "(Lo53/b0;)Li53/c;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.domain.GetActivityDetailsDogsUseCase$invoke$2", f = "GetActivityDetailsDogsUseCase.kt", l = {28, 30}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.p<o53.b0, t13.d<? super i53.c<? extends pe0.a>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f125474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<Long> f125475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f125476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f125477d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(List<Long> list, boolean z14, j jVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f125475b = list;
        this.f125476c = z14;
        this.f125477d = jVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f125475b, this.f125476c, this.f125477d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super i53.c<? extends pe0.a>> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        if (r6 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if (r6 == r0) goto L23;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f125474a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return (i53.c) obj;
            }
            if (i14 == 2) {
                o13.r.b(obj);
                return (i53.c) obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        List<Long> list = this.f125475b;
        if (list.isEmpty()) {
            return j53.l.b();
        }
        boolean z14 = this.f125476c;
        j jVar = this.f125477d;
        if (z14) {
            this.f125474a = 1;
            obj = j.b(jVar, list, this);
        } else {
            this.f125474a = 2;
            obj = j.a(jVar, list, this);
        }
        return aVar;
    }
}
