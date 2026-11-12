package lk2;

import java.util.Set;
import java.util.UUID;
import p005kotlin.Metadata;
import p13.l0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00050\u0004\u0012\u0012\b\u0002\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00050\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Llk2/w;", "", "Ljava/util/UUID;", "fileId", "", "Lcom/garmin/device/filetransfer/ArchiveFlag;", "updatedFlags", "removedFlags", "<init>", "(Ljava/util/UUID;Ljava/util/Set;Ljava/util/Set;)V", "file-transfer-device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f113306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<UUID> f113307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<UUID> f113308c;

    public w(UUID uuid, Set<UUID> set, Set<UUID> set2) {
        uuid.getClass();
        set.getClass();
        set2.getClass();
        this.f113306a = uuid;
        this.f113307b = set;
        this.f113308c = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return p005kotlin.jvm.internal.s.g(this.f113306a, wVar.f113306a) && p005kotlin.jvm.internal.s.g(this.f113307b, wVar.f113307b) && p005kotlin.jvm.internal.s.g(this.f113308c, wVar.f113308c);
    }

    public final int hashCode() {
        return this.f113308c.hashCode() + ((this.f113307b.hashCode() + (this.f113306a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "FlagsUpdateEvent(fileId=" + this.f113306a + ", updatedFlags=" + this.f113307b + ", removedFlags=" + this.f113308c + ")";
    }

    public w(UUID uuid, Set set, Set set2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(uuid, set, (i14 & 4) != 0 ? l0.f134950a : set2);
    }
}
