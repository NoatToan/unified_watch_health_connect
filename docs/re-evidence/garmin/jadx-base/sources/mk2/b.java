package mk2;

import java.util.UUID;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\fB-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lmk2/b;", "", "Ljava/util/UUID;", "fileId", "", "xferId", "Lmk2/a;", "latency", "", "sourceFeature", "<init>", "(Ljava/util/UUID;Ljava/lang/Long;Lmk2/a;Ljava/lang/String;)V", "a", "file-transfer-device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f119189e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f119190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f119191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mk2.a f119192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f119193d;

    public b(UUID uuid, Long l14, mk2.a aVar, String str) {
        uuid.getClass();
        aVar.getClass();
        str.getClass();
        this.f119190a = uuid;
        this.f119191b = l14;
        this.f119192c = aVar;
        this.f119193d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f119190a, bVar.f119190a) && s.g(this.f119191b, bVar.f119191b) && this.f119192c == bVar.f119192c && s.g(this.f119193d, bVar.f119193d);
    }

    public final int hashCode() {
        int iHashCode = this.f119190a.hashCode() * 31;
        Long l14 = this.f119191b;
        return this.f119193d.hashCode() + ((this.f119192c.hashCode() + ((iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "AdHocOptions(fileId=" + this.f119190a + ", xferId=" + this.f119191b + ", latency=" + this.f119192c + ", sourceFeature=" + this.f119193d + ")";
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmk2/b$a;", "", "<init>", "()V", "", "NO_XFER_ID", "J", "file-transfer-device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ b(UUID uuid, Long l14, mk2.a aVar, String str, int i14, j jVar) {
        this(uuid, l14, (i14 & 4) != 0 ? mk2.a.STANDARD : aVar, (i14 & 8) != 0 ? "" : str);
    }
}
