package dx;

import bx.f;
import c83.a0;
import e23.l;
import java.util.List;
import o13.r;
import o53.i0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lbx/f;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.bodybattery.data.repository.BodyBatteryRepositoryImpl$getBodyBatteryDailySummary$2", f = "BodyBatteryRepositoryImpl.kt", l = {24}, m = "invokeSuspend", v = 2)
public final class b extends i implements l<t13.d<? super a0<List<? extends f>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f61450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f61451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalDate f61452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LocalDate f61453d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, LocalDate localDate, LocalDate localDate2, t13.d<? super b> dVar) {
        super(1, dVar);
        this.f61451b = eVar;
        this.f61452c = localDate;
        this.f61453d = localDate2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new b(this.f61451b, this.f61452c, this.f61453d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends f>>> dVar) {
        return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f61450a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<List<f>>> i0VarC = this.f61451b.f61459a.c(fz0.d.c(this.f61452c), fz0.d.c(this.f61453d));
        this.f61450a = 1;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
