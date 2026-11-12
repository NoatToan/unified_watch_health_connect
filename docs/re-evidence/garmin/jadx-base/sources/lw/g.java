package lw;

import c83.a0;
import e23.l;
import java.util.List;
import o13.r;
import o53.i0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lpw/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.blood_pressure.data.repository.BloodPressureRepositoryImpl$getLastMeasurementForIntervalAsync$2", f = "BloodPressureRepositoryImpl.kt", l = {52}, m = "invokeSuspend", v = 2)
public final class g extends i implements l<t13.d<? super a0<List<? extends pw.a>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f115067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f115068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DateTime f115069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DateTime f115070d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c cVar, DateTime dateTime, DateTime dateTime2, t13.d<? super g> dVar) {
        super(1, dVar);
        this.f115068b = cVar;
        this.f115069c = dateTime;
        this.f115070d = dateTime2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new g(this.f115068b, this.f115069c, this.f115070d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends pw.a>>> dVar) {
        return ((g) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f115067a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<List<pw.a>>> i0VarH = this.f115068b.f115055a.h(fz0.d.b(this.f115069c), fz0.d.b(this.f115070d));
        this.f115067a = 1;
        Object objAwait = i0VarH.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
