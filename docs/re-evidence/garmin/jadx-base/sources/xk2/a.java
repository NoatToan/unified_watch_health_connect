package xk2;

import am.j;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.UUID;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import wr.g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0011\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\r¨\u0006\u000e"}, d2 = {"Lxk2/a;", "", "Ljava/util/UUID;", TtmlNode.ATTR_ID, "", "Lcom/garmin/device/filetransfer/DataType;", "dataType", "", "size", "<init>", "(Ljava/util/UUID;Ljava/lang/String;J)V", "Llk2/a;", "fileInfo", "(Llk2/a;)V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f191295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f191296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f191297c;

    public a(UUID uuid, String str, long j8) {
        uuid.getClass();
        str.getClass();
        this.f191295a = uuid;
        this.f191296b = str;
        this.f191297c = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f191295a, aVar.f191295a) && s.g(this.f191296b, aVar.f191296b) && this.f191297c == aVar.f191297c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f191297c) + g.j(this.f191295a.hashCode() * 31, 31, this.f191296b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DirectReadFileInfo(id=");
        sb3.append(this.f191295a);
        sb3.append(", dataType=");
        sb3.append(this.f191296b);
        sb3.append(", size=");
        return j.i(this.f191297c, ")", sb3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(lk2.a aVar) {
        this(aVar.f113152a, aVar.f113153b, aVar.f113154c);
        aVar.getClass();
    }
}
