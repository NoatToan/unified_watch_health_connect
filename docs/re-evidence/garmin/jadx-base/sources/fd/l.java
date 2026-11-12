package fd;

import android.net.Uri;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lfd/l;", "", "", "Lfd/k;", "webTriggerParams", "Landroid/net/Uri;", FirebaseAnalytics.Param.DESTINATION, "<init>", "(Ljava/util/List;Landroid/net/Uri;)V", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<k> f70444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f70445b;

    public l(List<k> list, Uri uri) {
        list.getClass();
        uri.getClass();
        this.f70444a = list;
        this.f70445b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f70444a.equals(lVar.f70444a) && this.f70445b.equals(lVar.f70445b);
    }

    public final int hashCode() {
        return this.f70445b.hashCode() + (this.f70444a.hashCode() * 31);
    }

    public final String toString() {
        return "WebTriggerRegistrationRequest { WebTriggerParams=" + this.f70444a + ", Destination=" + this.f70445b;
    }
}
