package qc1;

import b63.o;
import c83.a0;
import e23.l;
import fz0.f;
import java.util.List;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Ltc1/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.race_time_prediction.data.repository.RaceTimePredictionRepositoryImpl$getRaceTimePredictionMetrics$2", f = "RaceTimePredictionRepositoryImpl.kt", l = {26}, m = "invokeSuspend", v = 2)
public final class b extends i implements l<d<? super a0<List<? extends tc1.b>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f144376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f144377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f144378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f144379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f144380e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, String str, o oVar, o oVar2, d<? super b> dVar) {
        super(1, dVar);
        this.f144377b = cVar;
        this.f144378c = str;
        this.f144379d = oVar;
        this.f144380e = oVar2;
    }

    @Override // v13.a
    public final d<Unit> create(d<?> dVar) {
        return new b(this.f144377b, this.f144378c, this.f144379d, this.f144380e, dVar);
    }

    @Override // e23.l
    public final Object invoke(d<? super a0<List<? extends tc1.b>>> dVar) {
        return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f144376a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<List<tc1.b>>> i0VarA = this.f144377b.f144381a.a(this.f144378c, new f(this.f144379d), new f(this.f144380e));
        this.f144376a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
