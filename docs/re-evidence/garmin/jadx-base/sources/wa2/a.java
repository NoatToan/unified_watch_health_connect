package wa2;

import d53.k;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lwa2/a;", "", "<init>", "()V", "a", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3407a f183799a = new C3407a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f183800b = new b("DateFormatUtil", null, 2, null);

    static {
        new k("[^a-zA-Z0-9]");
    }

    /* JADX INFO: renamed from: wa2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lwa2/a$a;", "", "<init>", "()V", "Lwa2/b;", "logger", "Lwa2/b;", "", "DATE_FORMAT_YYYY_MM_DD", "Ljava/lang/String;", "Ld53/k;", "alphaNumericRegex", "Ld53/k;", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3407a {
        public /* synthetic */ C3407a(j jVar) {
            this();
        }

        public static String a(C3407a c3407a, Date date, int i14) {
            String str = (i14 & 2) != 0 ? "MMddyyyy" : "MMddyyyy_hhmma";
            c3407a.getClass();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.getDefault());
            simpleDateFormat.setTimeZone(TimeZone.getDefault());
            String str2 = simpleDateFormat.format((java.util.Date) date);
            str2.getClass();
            return str2;
        }

        public static String b(Date date) {
            String str;
            a.f183800b.getClass();
            DateFormat dateInstance = DateFormat.getDateInstance(2, Locale.getDefault());
            dateInstance.setTimeZone(TimeZone.getTimeZone("UTC"));
            if (date != null && (str = dateInstance.format((java.util.Date) date)) != null) {
                return str;
            }
            String str2 = dateInstance.format((java.util.Date) new Date(System.currentTimeMillis()));
            str2.getClass();
            return str2;
        }

        public static String c(Date date) {
            date.getClass();
            a.f183800b.getClass();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            String str = simpleDateFormat.format(Long.valueOf(date.getTime()));
            str.getClass();
            return str;
        }

        public static String d() {
            a.f183800b.getClass();
            try {
                DateFormat dateInstance = DateFormat.getDateInstance(3, Locale.getDefault());
                dateInstance.getClass();
                SimpleDateFormat simpleDateFormat = (SimpleDateFormat) dateInstance;
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                String pattern = simpleDateFormat.toPattern();
                pattern.getClass();
                return pattern;
            } catch (IllegalArgumentException unused) {
                a.f183800b.a("Unable to get user locale date format");
                return "";
            }
        }

        private C3407a() {
        }
    }
}
