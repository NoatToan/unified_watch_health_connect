package lk2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Llk2/x;", "", "", "Llk2/a;", "files", "", "token", "<init>", "(Ljava/util/List;I)V", "file-transfer-device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a> f113309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f113310b;

    public x(List<a> list, int i14) {
        list.getClass();
        this.f113309a = list;
        this.f113310b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f113309a.equals(xVar.f113309a) && this.f113310b == xVar.f113310b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f113310b) + (this.f113309a.hashCode() * 31);
    }

    public final String toString() {
        return "ListFilesResult(files=" + this.f113309a + ", token=" + this.f113310b + ")";
    }
}
