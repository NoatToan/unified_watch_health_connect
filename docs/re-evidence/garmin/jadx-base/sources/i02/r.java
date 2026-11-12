package i02;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lr53/j;", "it", "", "<anonymous>"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.draggable.grid.ReorderableState$visibleItemsChanged$$inlined$flatMapLatest$1", f = "ReorderableState.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.q<r53.j<? super List<Object>>, Boolean, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f86916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ r53.j f86917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f86918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f86919d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t13.d dVar, p pVar) {
        super(3, dVar);
        this.f86919d = pVar;
    }

    @Override // e23.q
    public final Object invoke(r53.j<? super List<Object>> jVar, Boolean bool, t13.d<? super Unit> dVar) {
        r rVar = new r(dVar, this.f86919d);
        rVar.f86917b = jVar;
        rVar.f86918c = bool;
        return rVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f86916a;
        if (i14 == 0) {
            o13.r.b(obj);
            r53.j jVar = this.f86917b;
            r53.i iVarS = ((Boolean) this.f86918c).booleanValue() ? p0.s(new s(this.f86919d)) : new r53.m(null);
            this.f86917b = null;
            this.f86918c = null;
            this.f86916a = 1;
            if (r53.s.v(jVar, iVarS, this) == aVar) {
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
