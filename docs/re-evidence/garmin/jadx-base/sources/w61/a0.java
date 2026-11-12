package w61;

import androidx.lifecycle.w0;
import com.garmin.android.apps.connectmobile.b3;
import com.garmin.android.apps.connectmobile.performance.trainingload.model.ExerciseLoadRecordDto;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.connectmobile.z2;
import java.util.List;
import lc.u0;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.performance.stats.improvement.TrainingStatusViewModel$getExerciseLoadSummary$2", f = "TrainingStatusViewModel.kt", l = {913}, m = "invokeSuspend", v = 2)
public final class a0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f183142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DateTime f183143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DateTimeFormatter f183144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DateTime f183145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<String> f183146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f183147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w0<fw.m<List<ExerciseLoadRecordDto>>> f183148g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(DateTime dateTime, DateTimeFormatter dateTimeFormatter, DateTime dateTime2, List<String> list, boolean z14, w0<fw.m<List<ExerciseLoadRecordDto>>> w0Var, t13.d<? super a0> dVar) {
        super(2, dVar);
        this.f183143b = dateTime;
        this.f183144c = dateTimeFormatter;
        this.f183145d = dateTime2;
        this.f183146e = list;
        this.f183147f = z14;
        this.f183148g = w0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a0(this.f183143b, this.f183144c, this.f183145d, this.f183146e, this.f183147f, this.f183148g, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f183142a;
        if (i14 == 0) {
            o13.r.b(obj);
            z2.f49779b.getClass();
            z2 z2VarA = z2.a.a();
            DateTime dateTime = this.f183143b;
            DateTimeFormatter dateTimeFormatter = this.f183144c;
            String strH = c22.j0.h(dateTime, dateTimeFormatter);
            String strH2 = c22.j0.h(this.f183145d, dateTimeFormatter);
            this.f183142a = 1;
            obj = com.garmin.android.apps.connectmobile.f0.J(z2VarA, new b3(z2VarA, strH, strH2, this.f183146e, this.f183147f, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        boolean z14 = v2Var instanceof v2.b;
        w0<fw.m<List<ExerciseLoadRecordDto>>> w0Var = this.f183148g;
        if (z14) {
            w0Var.m(fw.m.a.g(fw.m.f73767e, ((v2.b) v2Var).f47386a, 1));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            w0Var.m(fw.m.a.b(fw.m.f73767e, new fw.r(), null, 5));
        }
        return Unit.INSTANCE;
    }
}
