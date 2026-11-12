package s61;

import c83.a0;
import com.garmin.android.apps.connectmobile.performance.model.CurrentTrainingStatusDTO;
import e23.l;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/performance/model/CurrentTrainingStatusDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.performance.repo.PerformanceRepo$getCurrentTrainingStatus$2", f = "PerformanceRepo.kt", l = {29}, m = "invokeSuspend", v = 2)
public final class b extends i implements l<t13.d<? super a0<CurrentTrainingStatusDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f157624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f157625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f157626c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, String str, t13.d<? super b> dVar) {
        super(1, dVar);
        this.f157625b = aVar;
        this.f157626c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new b(this.f157625b, this.f157626c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<CurrentTrainingStatusDTO>> dVar) {
        return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f157624a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<CurrentTrainingStatusDTO>> i0VarE = this.f157625b.f157623a.e(this.f157626c);
        this.f157624a = 1;
        Object objAwait = i0VarE.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
