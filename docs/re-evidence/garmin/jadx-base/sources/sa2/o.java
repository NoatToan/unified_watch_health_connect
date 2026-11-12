package sa2;

import java.sql.Date;
import java.util.Calendar;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lsa2/o;", "", "Lqa2/e;", "reportsDataStore", "<init>", "(Lqa2/e;)V", "a", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final wa2.b f158384b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qa2.e f158385a;

    static {
        new a(null);
        f158384b = new wa2.b("ExportReportsPresenter", null, 2, null);
    }

    public o(qa2.e eVar) {
        eVar.getClass();
        this.f158385a = eVar;
    }

    public final Date a() {
        f158384b.getClass();
        Calendar calendar = Calendar.getInstance();
        calendar.add(6, -28);
        wa2.a.f183799a.getClass();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Date date = new Date(calendar.getTimeInMillis());
        this.f158385a.f143901a = date;
        return date;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsa2/o$a;", "", "<init>", "()V", "Lwa2/b;", "logger", "Lwa2/b;", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
