package ed1;

import android.content.Context;
import c22.j0;
import ch.qos.logback.core.CoreConstants;
import g22.l;
import n82.d;
import o82.g;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import pi0.e;
import pi0.f;
import q82.c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Led1/a;", "Lq82/c;", "Ln82/d;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-race-predictor_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements c<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f63872a;

    /* JADX INFO: renamed from: ed1.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1353a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f63873a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.f130853f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f63873a = iArr;
        }
    }

    public a(Context context) {
        context.getClass();
        this.f63872a = new e(context);
    }

    @Override // q82.c
    public final String a(d dVar) {
        DateTime dateTimeQ;
        d dVar2 = dVar;
        o82.a aVar = dVar2.f124956a;
        LocalDate localDateH = l.h(aVar.f130843a);
        LocalDate localDateH2 = l.h(aVar.f130844b);
        int i14 = C1353a.f63873a[dVar2.f124957b.ordinal()];
        e eVar = this.f63872a;
        if (i14 == 1) {
            return eVar.m(localDateH, localDateH2, f.SHORT_MONTH_NO_WEEKDAY);
        }
        j0 j0Var = j0.f23099a;
        DateTime dateTimeAtStartOfDay = localDateH.toDateTimeAtStartOfDay();
        dateTimeAtStartOfDay.getClass();
        j0Var.getClass();
        DateTime dateTimeQ2 = j0.Q(dateTimeAtStartOfDay);
        DateTime dateTimeAtStartOfDay2 = localDateH2.toDateTimeAtStartOfDay();
        dateTimeAtStartOfDay2.getClass();
        if (j0.Q(dateTimeAtStartOfDay2).isAfterNow()) {
            dateTimeQ = DateTime.now();
        } else {
            DateTime dateTimeAtStartOfDay3 = localDateH2.toDateTimeAtStartOfDay();
            dateTimeAtStartOfDay3.getClass();
            dateTimeQ = j0.Q(dateTimeAtStartOfDay3);
        }
        dateTimeQ.getClass();
        return eVar.l(dateTimeQ2, dateTimeQ, f.SHORT_MONTH_NO_WEEKDAY);
    }
}
