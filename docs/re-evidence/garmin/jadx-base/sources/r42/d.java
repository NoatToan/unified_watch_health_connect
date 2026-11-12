package r42;

import androidx.lifecycle.u1;
import f12.l;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import p005kotlin.Metadata;
import r53.b2;
import r53.p2;
import r53.q2;
import r53.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lr42/d;", "Landroidx/lifecycle/u1;", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m42.b f150323a = m42.b.a.b(m42.b.f116608a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f150324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b2 f150325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f150326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b2 f150327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f150328f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f150329g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b2 f150330h;

    public d() {
        p2 p2VarA = q2.a(LocalDate.now());
        this.f150324b = p2VarA;
        this.f150325c = s.d(p2VarA);
        p2 p2VarA2 = q2.a(LocalTime.now());
        this.f150326d = p2VarA2;
        this.f150327e = s.d(p2VarA2);
        k42.b.f102880a.getClass();
        this.f150328f = k42.b.l();
        l.f68084a.getClass();
        p2 p2VarA3 = q2.a(Double.valueOf(l.a.a().v3()));
        this.f150329g = p2VarA3;
        this.f150330h = s.d(p2VarA3);
    }

    public final void x4() {
        Object value;
        Object value2;
        DateTime dateTimeNow = DateTime.now();
        DateTime dateTimeAtStartOfDay = ((LocalDate) this.f150324b.getValue()).toDateTimeAtStartOfDay();
        p2 p2Var = this.f150326d;
        DateTime dateTimeWithTime = dateTimeAtStartOfDay.withTime(((LocalTime) p2Var.getValue()).getHourOfDay(), ((LocalTime) p2Var.getValue()).getMinuteOfHour(), 0, 0);
        if (dateTimeWithTime.isAfter(dateTimeNow)) {
            if (dateTimeWithTime.getHourOfDay() > dateTimeNow.getHourOfDay()) {
                do {
                    value2 = p2Var.getValue();
                } while (!p2Var.b(value2, ((LocalTime) value2).withHourOfDay(dateTimeNow.getHourOfDay()).withMinuteOfHour(dateTimeNow.getMinuteOfHour())));
            } else {
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, ((LocalTime) value).withMinuteOfHour(dateTimeNow.getMinuteOfHour())));
            }
        }
    }
}
