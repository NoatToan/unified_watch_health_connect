package gw2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgw2/a;", "", "", TtmlNode.ATTR_ID, "", "text", "<init>", "(ILjava/lang/String;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f79869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f79870b;

    public a(int i14, String str) {
        str.getClass();
        this.f79869a = i14;
        this.f79870b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f79869a == aVar.f79869a && this.f79870b.equals(aVar.f79870b);
    }

    public final int hashCode() {
        return this.f79870b.hashCode() + (Integer.hashCode(this.f79869a) * 31);
    }

    public final String toString() {
        return o2.c.e(this.f79869a, "ActionBarLeftMenuOptions(id=", ", text=", this.f79870b, ")");
    }
}
