package sv2;

import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import wr.g;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lsv2/a;", "", "", FirebaseAnalytics.Param.INDEX, "", "imageName", "", "isSelected", "<init>", "(ILjava/lang/String;Z)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f161030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f161031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f161032c;

    public a(int i14, String str, boolean z14) {
        str.getClass();
        this.f161030a = i14;
        this.f161031b = str;
        this.f161032c = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f161030a == aVar.f161030a && s.g(this.f161031b, aVar.f161031b) && this.f161032c == aVar.f161032c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f161032c) + g.j(Integer.hashCode(this.f161030a) * 31, 31, this.f161031b);
    }

    public final String toString() {
        return hb.a.k(g.r(this.f161030a, "WatchFaceGridItem(index=", ", imageName=", this.f161031b, ", isSelected="), this.f161032c, ")");
    }

    public /* synthetic */ a(int i14, String str, boolean z14, int i15, j jVar) {
        this(i14, str, (i15 & 4) != 0 ? false : z14);
    }
}
