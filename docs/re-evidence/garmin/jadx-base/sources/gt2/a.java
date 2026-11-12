package gt2;

import d53.u;
import d53.w;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import tn.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgt2/a;", "", "", "name", "filePath", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "glogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f79003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f79004c;

    public a(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f79002a = str;
        this.f79003b = str2;
        b.f79005a.getClass();
        this.f79004c = b.a.f(str).concat(".log");
        if ((!(this.f79003b.length() == 0)) & (true ^ u.p(this.f79003b, "/", false))) {
            this.f79003b = k.g(this.f79003b, "/");
        }
        if (u.p(str, "#", false)) {
            this.f79002a = str.substring(0, w.K('#', 0, 6, str));
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (s.g(this.f79002a, aVar.f79002a) && s.g(this.f79003b, aVar.f79003b)) {
                return true;
            }
        }
        return false;
    }
}
