package l10;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import o2.c;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ll10/a;", "", "", "res", "", TtmlNode.ATTR_ID, "<init>", "(ILjava/lang/String;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f108050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f108051b;

    public a(int i14, String str) {
        str.getClass();
        this.f108050a = i14;
        this.f108051b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f108050a == aVar.f108050a && this.f108051b.equals(aVar.f108051b);
    }

    public final int hashCode() {
        return this.f108051b.hashCode() + (Integer.hashCode(this.f108050a) * 31);
    }

    public final String toString() {
        return c.e(this.f108050a, "GroupDefaultImageItem(res=", ", id=", this.f108051b, ")");
    }
}
