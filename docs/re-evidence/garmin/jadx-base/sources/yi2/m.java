package yi2;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.messaging.Constants;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lyi2/m;", "", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "Lyi2/a;", "calendars", "errorMsg", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "calendar-os_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f197422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<a> f197423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f197424c;

    public /* synthetic */ m(String str, List list, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : list, (i14 & 4) != 0 ? null : str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return s.g(this.f197422a, mVar.f197422a) && s.g(this.f197423b, mVar.f197423b) && s.g(this.f197424c, mVar.f197424c);
    }

    public final int hashCode() {
        String str = this.f197422a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<a> list = this.f197423b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f197424c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RequestResult:\nError='");
        sb3.append(this.f197422a);
        sb3.append("'\nErrorMsg='");
        sb3.append(this.f197424c);
        sb3.append("'\nCalendars='");
        return o2.c.d(CoreConstants.SINGLE_QUOTE_CHAR, this.f197423b, sb3);
    }

    public m(String str, List<a> list, String str2) {
        this.f197422a = str;
        this.f197423b = list;
        this.f197424c = str2;
    }

    public m() {
        this(null, null, null, 7, null);
    }
}
