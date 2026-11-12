package sv2;

import java.util.List;
import p005kotlin.Metadata;
import wr.g;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lsv2/c;", "", "", "rowId", "", "iconSet", "frameImageName", "", "Lsv2/a;", "watchFaceGridItems", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f161035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f161036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f161037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<a> f161038d;

    public c(int i14, String str, String str2, List<a> list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.f161035a = i14;
        this.f161036b = str;
        this.f161037c = str2;
        this.f161038d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f161035a == cVar.f161035a && this.f161036b.equals(cVar.f161036b) && this.f161037c.equals(cVar.f161037c) && this.f161038d.equals(cVar.f161038d);
    }

    public final int hashCode() {
        return this.f161038d.hashCode() + g.j(g.j(Integer.hashCode(this.f161035a) * 31, 31, this.f161036b), 31, this.f161037c);
    }

    public final String toString() {
        StringBuilder sbR = g.r(this.f161035a, "WatchFaceGridOptions(rowId=", ", iconSet=", this.f161036b, ", frameImageName=");
        sbR.append(this.f161037c);
        sbR.append(", watchFaceGridItems=");
        sbR.append(this.f161038d);
        sbR.append(")");
        return sbR.toString();
    }
}
