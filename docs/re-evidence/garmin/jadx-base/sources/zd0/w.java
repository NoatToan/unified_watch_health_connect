package zd0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lr53/j;", "Lo13/q;", "result", "", "<anonymous>", "(Lr53/j;Lo13/q;)Z"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domain.InterruptOnDeviceDisconnectedUseCase$invoke$2", f = "InterruptOnDeviceDisconnectedUseCase.kt", l = {18}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.q<r53.j<? super o13.q<Object>>, o13.q<Object>, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f204189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ r53.j f204190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f204191c;

    public w(t13.d<? super w> dVar) {
        super(3, dVar);
    }

    @Override // e23.q
    public final Object invoke(r53.j<? super o13.q<Object>> jVar, o13.q<Object> qVar, t13.d<? super Boolean> dVar) {
        Object obj = qVar.f128597a;
        w wVar = new w(dVar);
        wVar.f204190b = jVar;
        wVar.f204191c = obj;
        return wVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = this.f204190b;
        Object obj2 = this.f204191c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f204189a;
        if (i14 == 0) {
            o13.r.b(obj);
            o13.q qVarA = o13.q.a(obj2);
            this.f204190b = null;
            this.f204191c = obj2;
            this.f204189a = 1;
            if (jVar.emit(qVarA, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        int i15 = o13.q.f128596b;
        return Boolean.valueOf(!(obj2 instanceof o13.q.b));
    }
}
