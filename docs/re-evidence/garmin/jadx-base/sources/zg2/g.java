package zg2;

import ch.qos.logback.core.spi.ComponentTracker;
import o53.c2;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lzg2/g;", "", "", "timerId", "<init>", "(Ljava/lang/String;)V", "a", "b", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f204701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h.a f204702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c2 f204703c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzg2/g$b;", "", "", "time", "<init>", "(Ljava/lang/String;IJ)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        TIME_ALERT_5S(5000),
        TIME_ALERT_30M(ComponentTracker.DEFAULT_TIMEOUT);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f204707a;

        b(long j8) {
            this.f204707a = j8;
        }
    }

    static {
        new a(null);
    }

    public g(String str) {
        str.getClass();
        this.f204701a = str;
    }

    public final void a() {
        c cVar = c.f204692a;
        String strConcat = this.f204701a.concat(" Timer cancelTimer");
        cVar.getClass();
        c.a("LiveActivityTimer", strConcat);
        h.a aVar = this.f204702b;
        if (aVar != null) {
            aVar.cancel();
        }
        b();
    }

    public final void b() {
        c cVar = c.f204692a;
        String strConcat = this.f204701a.concat(" Timer killTimer");
        cVar.getClass();
        c.a("LiveActivityTimer", strConcat);
        this.f204702b = null;
        c2 c2Var = this.f204703c;
        if (c2Var != null) {
            g8.i.q("LiveActivityTimer closed", c2Var);
        }
        this.f204703c = null;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lzg2/g$a;", "", "<init>", "()V", "", "TIMER_INTERVAL", "J", "", "TAG", "Ljava/lang/String;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
