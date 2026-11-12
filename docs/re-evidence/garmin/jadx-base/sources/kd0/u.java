package kd0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.sleep.presentation.SleepReportsActivity;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/u;", "Lfx/a;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u implements fx.a {
    @Override // fx.a
    public final void a(Context context, long j8, String str) {
        context.getClass();
        str.getClass();
        aq.b bVar = new aq.b();
        bVar.f11823b = j8;
        bVar.f11827f = str;
        am.h hVar = am.h.VIEW_EDIT;
        if (hVar != null) {
            bVar.f11824c = hVar;
        }
        bVar.f11825d = false;
        context.startActivity(bVar.a(context));
    }

    @Override // fx.a
    public final void b(Context context, LocalDate localDate) {
        context.getClass();
        context.startActivity(SleepReportsActivity.a.b(SleepReportsActivity.f44239b, context, localDate != null ? localDate.toDateTimeAtStartOfDay() : null, en1.c.SCORE, false, rl1.i.BODY_BATTERY, null, 32));
    }

    @Override // fx.a
    public final Object c(ix.k.a aVar) {
        t13.i iVar = new t13.i(u13.f.b(aVar));
        ed0.a.d(new t(iVar));
        Object objA = iVar.a();
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        return objA;
    }

    @Override // fx.a
    public final void d(Context context, LocalDate localDate) {
        context.getClass();
        context.startActivity(SleepReportsActivity.a.b(SleepReportsActivity.f44239b, context, localDate != null ? localDate.toDateTimeAtStartOfDay() : null, en1.c.COACH, false, rl1.i.BODY_BATTERY, null, 32));
    }
}
