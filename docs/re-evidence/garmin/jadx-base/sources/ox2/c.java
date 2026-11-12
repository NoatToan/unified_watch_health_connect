package ox2;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.u0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lox2/c;", "", "Lox2/e;", "statusCheck", "Lox2/d;", "uploadStatus", "<init>", "(Lox2/e;Lox2/d;)V", "a", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f134340c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f134341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f134342b;

    public c(e eVar, d dVar) {
        eVar.getClass();
        dVar.getClass();
        this.f134341a = eVar;
        this.f134342b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f134341a.equals(cVar.f134341a) && this.f134342b.equals(cVar.f134342b);
    }

    public final int hashCode() {
        return this.f134342b.hashCode() + (this.f134341a.hashCode() * 31);
    }

    public final String toString() {
        return "UploadResponse(statusCheck=" + this.f134341a + ", uploadStatus=" + this.f134342b + ")";
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lox2/c$a;", "", "<init>", "()V", "", "LOG_TAG", "Ljava/lang/String;", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static c a(ox2.a aVar) {
            aVar.getClass();
            Map<String, List<String>> map = aVar.f134337b;
            try {
                e eVar = new e((String) ((List) u0.c(FirebaseAnalytics.Param.LOCATION, map)).get(0), Long.parseLong((String) ((List) u0.c("location-in-milliseconds", map)).get(0)));
                d.a aVar2 = d.f134343e;
                b bVar = aVar.f134336a;
                aVar2.getClass();
                return new c(eVar, d.a.a(bVar));
            } catch (Throwable th3) {
                ge1.b.L("UploadResponse").error("fromGHSResponse", th3);
                throw th3;
            }
        }

        private a() {
        }
    }
}
