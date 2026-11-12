package xz0;

import com.garmin.android.apps.connectmobile.notifications.model.InboxRequestItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lxz0/c;", "", "", "Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem;", "requestItems", "", "nextCursor", "", "shouldRefresh", "", "totalAuthorizedViewerInvites", "<init>", "(Ljava/util/List;Ljava/lang/String;ZI)V", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<InboxRequestItem<?>> f192758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f192759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f192760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f192761d;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ c(List list, String str, boolean z14, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        if ((i15 & 1) != 0) {
            list = Collections.synchronizedList(new ArrayList());
            list.getClass();
        }
        this(list, (i15 & 2) != 0 ? null : str, (i15 & 4) != 0 ? true : z14, (i15 & 8) != 0 ? 0 : i14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return p005kotlin.jvm.internal.s.g(this.f192758a, cVar.f192758a) && p005kotlin.jvm.internal.s.g(this.f192759b, cVar.f192759b) && this.f192760c == cVar.f192760c && this.f192761d == cVar.f192761d;
    }

    public final int hashCode() {
        int iHashCode = this.f192758a.hashCode() * 31;
        String str = this.f192759b;
        return Integer.hashCode(this.f192761d) + q6.f.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f192760c);
    }

    public final String toString() {
        return "InboxRequestCache(requestItems=" + this.f192758a + ", nextCursor=" + this.f192759b + ", shouldRefresh=" + this.f192760c + ", totalAuthorizedViewerInvites=" + this.f192761d + ")";
    }

    public c(List<InboxRequestItem<?>> list, String str, boolean z14, int i14) {
        list.getClass();
        this.f192758a = list;
        this.f192759b = str;
        this.f192760c = z14;
        this.f192761d = i14;
    }

    public c() {
        this(null, null, false, 0, 15, null);
    }
}
