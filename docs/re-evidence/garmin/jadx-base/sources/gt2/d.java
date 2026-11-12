package gt2;

import ch.qos.logback.classic.Level;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u000b\fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lgt2/d;", "", "Lgt2/d$b;", "logType", "Lch/qos/logback/classic/Level;", "logLevel", "Ljava/util/ArrayList;", "Lgt2/a;", "fileLoggers", "<init>", "(Lgt2/d$b;Lch/qos/logback/classic/Level;Ljava/util/ArrayList;)V", "a", "b", "glogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f79011k = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f79012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Level f79013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<gt2.a> f79014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f79015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f79016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f79017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f79018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f79019h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f79020i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f79021j;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgt2/d$b;", "", "<init>", "(Ljava/lang/String;I)V", "glogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum b {
        LOG_TYPE_LOGCAT,
        LOG_TYPE_FILE,
        LOG_TYPE_LOGCAT_AND_FILE
    }

    public d(b bVar, Level level, ArrayList<gt2.a> arrayList) {
        bVar.getClass();
        level.getClass();
        arrayList.getClass();
        this.f79012a = bVar;
        this.f79013b = level;
        this.f79014c = arrayList;
        this.f79015d = 5;
        this.f79016e = 2;
        this.f79017f = "5MB";
        this.f79020i = "%d{MMM-dd;h:mm:ss.SSSaa} [%thread] %.-1level/%logger{50} - %msg%n";
        this.f79021j = "%d{MMM-dd;h:mm:ss.SSSaa} [%thread] %.-1level/%logger{50} - %msg%n";
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgt2/d$a;", "", "<init>", "()V", "glogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ d(b bVar, Level level, ArrayList arrayList, int i14, j jVar) {
        this(bVar, level, (i14 & 4) != 0 ? new ArrayList() : arrayList);
    }
}
