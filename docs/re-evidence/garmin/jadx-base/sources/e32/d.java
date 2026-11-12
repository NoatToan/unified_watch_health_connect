package e32;

import java.util.TreeMap;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Le32/d;", "", "", "dateStringFormat", "<init>", "(Ljava/lang/String;)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f62780a;

    static {
        new a(null);
    }

    public /* synthetic */ d(String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? "yyyy-MM-dd" : str);
    }

    public final void a(DateTime dateTime, DateTime dateTime2, TreeMap treeMap, int i14, e23.l lVar) {
        dateTime.getClass();
        dateTime2.getClass();
        LocalDate localDate = new LocalDate(dateTime);
        LocalDate localDate2 = new LocalDate(dateTime2);
        LocalDate localDateNow = LocalDate.now();
        if (localDateNow.isBefore(localDate2)) {
            localDate2 = localDateNow;
        }
        while (true) {
            if (!localDate.isBefore(localDate2) && !localDate.isEqual(localDate2)) {
                return;
            }
            String string = localDate.toString(this.f62780a);
            if (!treeMap.containsKey(string) && string != null) {
                treeMap.put(string, lVar.invoke(string));
            }
            localDate = localDate.plusDays(i14);
            localDate.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Le32/d$a;", "", "<init>", "()V", "", "DEFAULT_DATE_FORMAT", "Ljava/lang/String;", "", "DAYS_DELTA_DAILY", "I", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public d(String str) {
        str.getClass();
        this.f62780a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
