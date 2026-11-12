package zf0;

import com.google.mlkit.common.MlKitException;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lfg0/k;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.events.EventRepo$getTrainableEventsForDateRange$2", f = "EventRepo.kt", l = {MlKitException.CODE_SCANNER_TASK_IN_PROGRESS}, m = "invokeSuspend", v = 2)
public final class t extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends fg0.k>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f204497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f204498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f204499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f204500d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(d dVar, String str, String str2, t13.d<? super t> dVar2) {
        super(1, dVar2);
        this.f204498b = dVar;
        this.f204499c = str;
        this.f204500d = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new t(this.f204498b, this.f204499c, this.f204500d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends fg0.k>>> dVar) {
        return ((t) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f204497a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<List<fg0.k>>> i0VarN = this.f204498b.f204344a.n(this.f204499c, this.f204500d, true);
        this.f204497a = 1;
        Object objAwait = i0VarN.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
