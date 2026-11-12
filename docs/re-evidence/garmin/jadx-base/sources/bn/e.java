package bn;

import c83.a0;
import e23.l;
import java.util.List;
import java.util.Map;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lc83/a0;", "", "", "", "Ldn/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.data.HistoricalActivityTypesRepositoryImpl$getHistoricalActivityTypes$3", f = "HistoricalActivityTypesRepositoryImpl.kt", l = {24}, m = "invokeSuspend", v = 2)
public final class e extends i implements l<t13.d<? super a0<Map<String, ? extends List<? extends dn.b>>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f18971b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, t13.d<? super e> dVar) {
        super(1, dVar);
        this.f18971b = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new e(this.f18971b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<Map<String, ? extends List<? extends dn.b>>>> dVar) {
        return ((e) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f18970a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<Map<String, List<dn.b>>>> i0VarW = this.f18971b.f18964a.w();
        this.f18970a = 1;
        Object objAwait = i0VarW.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
