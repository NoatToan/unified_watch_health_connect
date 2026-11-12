package hi2;

import java.text.SimpleDateFormat;
import java.util.Locale;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lhi2/b;", "", "<init>", "()V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f83885a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f83886b = new d("DateUtil", null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SimpleDateFormat f83887c = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final SimpleDateFormat f83888d = new SimpleDateFormat("MMM dd, yyyy", Locale.getDefault());

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lhi2/b$a;", "", "<init>", "()V", "", "DATE_FORMAT_DISPLAY", "Ljava/lang/String;", "DATE_FORMAT_DTO", "", "SECOND_IN_MILLIS", "J", "TIME_FORMAT_H_M_A", "Ljava/text/SimpleDateFormat;", "displayDateFormat", "Ljava/text/SimpleDateFormat;", "dtoDateFormat", "Lhi2/d;", "logger", "Lhi2/d;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static String a(DateTime dateTime, DateTimeZone dateTimeZone) {
            if (dateTime == null) {
                return null;
            }
            try {
                return DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS").withZone(dateTimeZone).print(dateTime);
            } catch (IllegalArgumentException e4) {
                b.f83886b.b("Illegal Input [" + dateTime + "] " + e4.getLocalizedMessage());
                return null;
            }
        }

        private a() {
        }
    }
}
