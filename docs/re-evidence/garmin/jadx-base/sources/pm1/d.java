package pm1;

import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import o13.r;
import o53.b0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lmm1/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.sleep.domain.GetCachedSleepDataUseCase$getAndSaveLastDateWithSleepData$dailySleep$1", f = "GetCachedSleepDataUseCase.kt", l = {94}, m = "invokeSuspend", v = 2)
public final class d extends i implements p<b0, t13.d<? super v2<? extends mm1.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f138632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f138633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalDate f138634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LocalDate f138635d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, LocalDate localDate, LocalDate localDate2, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f138633b = aVar;
        this.f138634c = localDate;
        this.f138635d = localDate2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f138633b, this.f138634c, this.f138635d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super v2<? extends mm1.b>> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f138632a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        nm1.a aVar2 = this.f138633b.f138627a;
        DateTime dateTimeAtStartOfDay = this.f138634c.toDateTimeAtStartOfDay();
        dateTimeAtStartOfDay.getClass();
        DateTime dateTimeAtStartOfDay2 = this.f138635d.toDateTimeAtStartOfDay();
        dateTimeAtStartOfDay2.getClass();
        this.f138632a = 1;
        Object objG = aVar2.g(dateTimeAtStartOfDay, dateTimeAtStartOfDay2, this);
        return objG == aVar ? aVar : objG;
    }
}
