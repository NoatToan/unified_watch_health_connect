package lk2;

import com.garmin.proto.generated.GDIFileAccess;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Set;
import java.util.UUID;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0010\u0010\u000b\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\n0\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Llk2/a;", "", "Ljava/util/UUID;", TtmlNode.ATTR_ID, "", "Lcom/garmin/device/filetransfer/DataType;", "dataType", "", "size", "", "Lcom/garmin/device/filetransfer/ArchiveFlag;", "flags", "", "creationId", "Lcom/garmin/proto/generated/GDIFileAccess$ItemReference$Urgency;", "urgency", "<init>", "(Ljava/util/UUID;Ljava/lang/String;JLjava/util/Set;Ljava/lang/Integer;Lcom/garmin/proto/generated/GDIFileAccess$ItemReference$Urgency;)V", "file-transfer-device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f113152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f113154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<UUID> f113155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f113156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final GDIFileAccess.ItemReference.Urgency f113157f;

    public a(UUID uuid, String str, long j8, Set<UUID> set, Integer num, GDIFileAccess.ItemReference.Urgency urgency) {
        uuid.getClass();
        str.getClass();
        set.getClass();
        this.f113152a = uuid;
        this.f113153b = str;
        this.f113154c = j8;
        this.f113155d = set;
        this.f113156e = num;
        this.f113157f = urgency;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p005kotlin.jvm.internal.s.g(this.f113152a, aVar.f113152a) && p005kotlin.jvm.internal.s.g(this.f113153b, aVar.f113153b) && this.f113154c == aVar.f113154c && p005kotlin.jvm.internal.s.g(this.f113155d, aVar.f113155d) && p005kotlin.jvm.internal.s.g(this.f113156e, aVar.f113156e) && this.f113157f == aVar.f113157f;
    }

    public final int hashCode() {
        int iHashCode = (this.f113155d.hashCode() + q6.f.e(wr.g.j(this.f113152a.hashCode() * 31, 31, this.f113153b), 31, this.f113154c)) * 31;
        Integer num = this.f113156e;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        GDIFileAccess.ItemReference.Urgency urgency = this.f113157f;
        return iHashCode2 + (urgency != null ? urgency.hashCode() : 0);
    }

    public final String toString() {
        return "FileInfo(id=" + this.f113152a + ", dataType=" + this.f113153b + ", size=" + this.f113154c + ", flags=" + this.f113155d + ", creationId=" + this.f113156e + ", urgency=" + this.f113157f + ")";
    }

    public /* synthetic */ a(UUID uuid, String str, long j8, Set set, Integer num, GDIFileAccess.ItemReference.Urgency urgency, int i14, p005kotlin.jvm.internal.j jVar) {
        this(uuid, str, j8, set, (i14 & 16) != 0 ? null : num, (i14 & 32) != 0 ? null : urgency);
    }
}
