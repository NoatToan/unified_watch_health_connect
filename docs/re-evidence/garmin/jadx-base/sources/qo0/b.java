package qo0;

import b63.o;
import com.garmin.android.apps.connectmobile.f0;
import do0.f;
import e23.p;
import g22.k;
import o13.r;
import o53.b0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.heartrate.presentation.viewmodel.HeartRateViewModel$deleteAbnormalHR$1", f = "HeartRateViewModel.kt", l = {201}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f145944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DateTime f145945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f145946c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DateTime dateTime, a aVar, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f145945b = dateTime;
        this.f145946c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f145945b, this.f145946c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f145944a;
        a aVar2 = this.f145946c;
        DateTime dateTime = this.f145945b;
        try {
            if (i14 == 0) {
                r.b(obj);
                String string = dateTime.toString("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
                f fVar = aVar2.f145917b;
                string.getClass();
                this.f145944a = 1;
                fVar.getClass();
                if (f0.J(fVar, new do0.c(fVar, string, null), this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            LocalDate localDate = dateTime.toLocalDate();
            localDate.getClass();
            o oVarT = k.t(localDate);
            LocalDate localDate2 = dateTime.toLocalDate();
            localDate2.getClass();
            aVar2.f145928m.i(new o82.a(oVarT, k.t(localDate2)), true);
            aVar2.f145929n.e();
            aVar2.f145930o.e();
        } catch (Throwable unused) {
        }
        return Unit.INSTANCE;
    }
}
