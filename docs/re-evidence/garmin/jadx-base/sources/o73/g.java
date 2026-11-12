package o73;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\u001f\b\u0005\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0001\t¨\u0006\n"}, d2 = {"Lo73/g;", "", "", TtmlNode.ATTR_ID, "", "Lo73/n;", FirebaseAnalytics.Param.ITEMS, "<init>", "(Ljava/lang/String;Ljava/util/Set;)V", "Lo73/u;", "library_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f130756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<n> f130757b;

    private g(String str, Set<n> set) {
        this.f130756a = str;
        this.f130757b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return p005kotlin.jvm.internal.s.g(this.f130756a, ((g) obj).f130756a);
    }

    public final int hashCode() {
        return this.f130756a.hashCode();
    }

    public /* synthetic */ g(String str, Set set, p005kotlin.jvm.internal.j jVar) {
        this(str, set);
    }
}
