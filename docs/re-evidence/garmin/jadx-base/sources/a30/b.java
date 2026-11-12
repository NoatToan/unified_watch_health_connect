package a30;

import am.x0;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import q6.f;
import v.e0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"La30/b;", "", "Lam/x0;", "activityType", "", "isPublic", "", "courseDistance", "", "La30/b$b;", "featureElementUsed", "", "timestamp", "<init>", "(Lam/x0;ZDLjava/util/List;Ljava/lang/String;)V", "b", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<EnumC0008b> f901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f902e;

    /* JADX INFO: renamed from: a30.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La30/b$b;", "", "", "elementName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum EnumC0008b {
        NOTES("notes"),
        REST_DURATION("restDuration"),
        CUTOFF_DURATION("cutoffDuration");

        EnumC0008b(String str) {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(x0 x0Var, boolean z14, double d14, List<? extends EnumC0008b> list, String str) {
        x0Var.getClass();
        list.getClass();
        str.getClass();
        this.f898a = x0Var;
        this.f899b = z14;
        this.f900c = d14;
        this.f901d = list;
        this.f902e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f898a == bVar.f898a && this.f899b == bVar.f899b && Double.compare(this.f900c, bVar.f900c) == 0 && this.f901d.equals(bVar.f901d) && this.f902e.equals(bVar.f902e);
    }

    public final int hashCode() {
        return this.f902e.hashCode() + u0.b(org.apache.commons.lang3.e.b(f.g(this.f898a.hashCode() * 31, 31, this.f899b), 31, this.f900c), 31, this.f901d);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CoursePlannerAnalyticsData(activityType=");
        sb3.append(this.f898a);
        sb3.append(", isPublic=");
        sb3.append(this.f899b);
        sb3.append(", courseDistance=");
        sb3.append(this.f900c);
        sb3.append(", featureElementUsed=");
        sb3.append(this.f901d);
        return e0.h(sb3, ", timestamp=", this.f902e, ")");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"La30/b$a;", "", "<init>", "()V", "", "PUBLIC", "Ljava/lang/String;", "PRIVATE", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
