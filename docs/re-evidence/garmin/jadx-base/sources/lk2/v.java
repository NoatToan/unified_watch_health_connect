package lk2;

import java.util.Collection;
import java.util.List;
import java.util.UUID;
import lc.u0;
import org.apache.commons.codec.language.bm.Rule;
import p005kotlin.Metadata;
import p13.l0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u000fBM\u0012\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002\u0012\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\b\u0012\u00060\u0007j\u0002`\b\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB=\b\u0016\u0012\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\b\u0012\u00060\u0007j\u0002`\b\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\u000e¨\u0006\u0010"}, d2 = {"Llk2/v;", "", "", "Ljava/util/UUID;", "Lcom/garmin/device/filetransfer/ArchiveFlag;", "excludedFlags", "requestedFlags", "", "Lcom/garmin/device/filetransfer/DataType;", "includedDataTypes", "", "transactionId", "<init>", "(Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Ljava/lang/Integer;)V", "(Ljava/util/Collection;Ljava/util/Collection;Ljava/lang/Integer;)V", "a", "file-transfer-device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f113300e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l0 f113301f = l0.f134950a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f113302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<UUID> f113303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<UUID> f113304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<String> f113305d;

    public v(Collection<UUID> collection, Collection<UUID> collection2, Collection<String> collection3, Integer num) {
        collection.getClass();
        collection2.getClass();
        this.f113302a = num;
        this.f113303b = p13.h0.T(collection);
        this.f113304c = p13.h0.T(collection2);
        this.f113305d = collection3 != null ? p13.h0.T(collection3) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!v.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        v vVar = (v) obj;
        return p005kotlin.jvm.internal.s.g(this.f113302a, vVar.f113302a) && p005kotlin.jvm.internal.s.g(this.f113303b, vVar.f113303b) && p005kotlin.jvm.internal.s.g(this.f113304c, vVar.f113304c) && p005kotlin.jvm.internal.s.g(this.f113305d, vVar.f113305d);
    }

    public final int hashCode() {
        Integer num = this.f113302a;
        int iB = u0.b(u0.b((num != null ? num.intValue() : 0) * 31, 31, this.f113303b), 31, this.f113304c);
        List<String> list = this.f113305d;
        return iB + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String strK0;
        List<String> list = this.f113305d;
        if (list == null) {
            strK0 = Rule.ALL;
        } else {
            strK0 = list.isEmpty() ? "NONE" : p13.h0.k0(this.f113305d, null, null, null, null, 63);
        }
        return "Filter(transactionId=" + this.f113302a + ", excludedFlags=" + this.f113303b.size() + ", requestedFlags=" + this.f113304c.size() + ", dataTypes=" + strK0 + ")";
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llk2/v$a;", "", "<init>", "()V", "file-transfer-device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ v(Collection collection, Collection collection2, Collection collection3, Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
        this(collection, collection2, (i14 & 4) != 0 ? null : collection3, (i14 & 8) != 0 ? null : num);
    }

    public /* synthetic */ v(Collection collection, Collection collection2, Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
        this(collection, (i14 & 2) != 0 ? null : collection2, (i14 & 4) != 0 ? null : num);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(Collection<UUID> collection, Collection<String> collection2, Integer num) {
        this(collection, collection, collection2, num);
        collection.getClass();
    }
}
