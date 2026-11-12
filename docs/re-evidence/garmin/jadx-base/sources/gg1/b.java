package gg1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.Calendar;
import java.util.Date;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB\u001b\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\f"}, d2 = {"Lgg1/b;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lgg1/b$a;", "callback", "<init>", "(Landroid/content/Context;Lgg1/b$a;)V", "Lorg/joda/time/LocalDate;", "dateOfBirthToShow", "(Landroid/content/Context;Lgg1/b$a;Lorg/joda/time/LocalDate;)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f77192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f77193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LocalDate f77194c;

    public interface a {
        void a(Calendar calendar);
    }

    public b(Context context, a aVar, LocalDate localDate) {
        aVar.getClass();
        this.f77192a = context;
        this.f77193b = aVar;
        this.f77194c = localDate;
        a();
    }

    public final void a() {
        long millis = DateTime.now().minusYears(100).withTimeAtStartOfDay().getMillis();
        Object obj = KoinJavaComponent.get$default(pu.h.class, null, null, 6, null);
        obj.getClass();
        long millis2 = r22.c0.a(DateTime.now().minusYears(((pu.h) obj).b())).getMillis();
        if (this.f77194c == null) {
            f12.l.f68084a.getClass();
            this.f77194c = f12.l.a.a().l1();
        }
        Calendar calendar = Calendar.getInstance();
        LocalDate localDate = this.f77194c;
        if (localDate != null) {
            Date date = localDate.toDate();
            calendar.setTimeInMillis(date != null ? date.getTime() : 0L);
        } else {
            calendar.setTimeInMillis(millis2);
        }
        new r22.c0(this.f77192a, millis, millis2, calendar, new com.google.android.exoplayer2.analytics.q(23, calendar, this)).show();
    }

    public b(Context context, a aVar) {
        aVar.getClass();
        this.f77192a = context;
        this.f77193b = aVar;
        a();
    }
}
