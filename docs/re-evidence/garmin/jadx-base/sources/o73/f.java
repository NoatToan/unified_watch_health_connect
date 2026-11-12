package o73;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo73/f;", "Lo73/e;", "", TtmlNode.TAG_REGION, "<init>", "(Ljava/lang/String;)V", "library_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f130755a;

    public f(String str) {
        str.getClass();
        this.f130755a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        return this.f130755a.equals(((f) obj).f130755a);
    }

    public final int hashCode() {
        return this.f130755a.hashCode();
    }

    public final String toString() {
        return am.j.m("RegionQualifier(region='", this.f130755a, "')");
    }
}
