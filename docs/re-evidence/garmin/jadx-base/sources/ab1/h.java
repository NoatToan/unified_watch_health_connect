package ab1;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import lc.u0;
import o53.b0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import sa1.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.powerguide.model.PowerGuideViewModel$fetchScheduledEventsForPowerGuide$1", f = "PowerGuideViewModel.kt", l = {37}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0<g3<List<fg0.k>>> f2589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f2590c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            DateTime dateTimeAtCurrentTime;
            DateTime dateTimeAtCurrentTime2;
            LocalDate date = ((fg0.k) t7).getDate();
            long millis = 0;
            Long lValueOf = Long.valueOf((date == null || (dateTimeAtCurrentTime2 = date.toDateTimeAtCurrentTime()) == null) ? 0L : dateTimeAtCurrentTime2.getMillis());
            LocalDate date2 = ((fg0.k) t14).getDate();
            if (date2 != null && (dateTimeAtCurrentTime = date2.toDateTimeAtCurrentTime()) != null) {
                millis = dateTimeAtCurrentTime.getMillis();
            }
            return r13.a.b(lValueOf, Long.valueOf(millis));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(y0<g3<List<fg0.k>>> y0Var, k kVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f2589b = y0Var;
        this.f2590c = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f2589b, this.f2590c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f2588a;
        y0<g3<List<fg0.k>>> y0Var = this.f2589b;
        if (i14 == 0) {
            o13.r.b(obj);
            y0Var.j(g3.a.c(g3.f35298f));
            zf0.d dVar = this.f2590c.f2598b;
            this.f2588a = 1;
            obj = dVar.b(100, null, this);
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
        if (v2Var instanceof v2.b) {
            Iterable iterable = (Iterable) ((v2.b) v2Var).f47386a;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : iterable) {
                fg0.k kVar = (fg0.k) obj2;
                gg0.f eventType = kVar.getEventType();
                boolean z14 = false;
                boolean z15 = eventType != null && eventType.e();
                Long courseId = kVar.getCourseId();
                boolean z16 = (courseId != null ? courseId.longValue() : 0L) > 0;
                fg0.d completionTarget = kVar.getCompletionTarget();
                if ((completionTarget != null ? completionTarget.getUnitType() : null) == gg0.h.DISTANCE && !sa1.h.e(y.a(kVar.getCompletionTarget()))) {
                    z14 = true;
                }
                if (z15 && z16 && z14) {
                    arrayList.add(obj2);
                }
            }
            List listN0 = h0.N0(arrayList, new a());
            g3.f35298f.getClass();
            y0Var.j(g3.a.d(listN0));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            y0Var.j(g3.a.a(g3.f35298f, ((v2.a) v2Var).f47383a.toString(), null, null, null, 14));
        }
        return Unit.INSTANCE;
    }
}
