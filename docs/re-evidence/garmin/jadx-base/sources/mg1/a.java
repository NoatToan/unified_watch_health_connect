package mg1;

import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.perf.util.Constants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;
import v.h;
import wr.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lmg1/a;", "", "", Action.KEY_ATTRIBUTE, "title", "summary", "", Constants.ENABLE_DISABLE, "isChecked", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "gcm-developer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f118371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f118372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f118373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f118374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f118375e;

    public a(String str, String str2, String str3, boolean z14, boolean z15) {
        str.getClass();
        str2.getClass();
        this.f118371a = str;
        this.f118372b = str2;
        this.f118373c = str3;
        this.f118374d = z14;
        this.f118375e = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f118371a, aVar.f118371a) && s.g(this.f118372b, aVar.f118372b) && s.g(this.f118373c, aVar.f118373c) && this.f118374d == aVar.f118374d && this.f118375e == aVar.f118375e;
    }

    public final int hashCode() {
        int iJ = g.j(this.f118371a.hashCode() * 31, 31, this.f118372b);
        String str = this.f118373c;
        return Boolean.hashCode(this.f118375e) + f.g((iJ + (str == null ? 0 : str.hashCode())) * 31, 31, this.f118374d);
    }

    public final String toString() {
        String str = this.f118373c;
        boolean z14 = this.f118375e;
        StringBuilder sbI = p6.b.i("DeveloperItem(key=", this.f118371a, ", title=", this.f118372b, ", summary=");
        h.C(str, ", isEnabled=", ", isChecked=", sbI, this.f118374d);
        return hb.a.k(sbI, z14, ")");
    }

    public /* synthetic */ a(String str, String str2, String str3, boolean z14, boolean z15, int i14, j jVar) {
        this(str, str2, str3, (i14 & 8) != 0 ? true : z14, (i14 & 16) != 0 ? false : z15);
    }
}
