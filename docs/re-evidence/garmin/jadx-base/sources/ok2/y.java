package ok2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0004\u0017\u0018\u0019\u001aB[\b\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0018\u00010\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u0011\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014BS\b\u0017\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0018\u00010\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0015B\t\b\u0016¢\u0006\u0004\b\u0010\u0010\u0016¨\u0006\u001b"}, d2 = {"Lok2/y;", "", "", "", "Lcom/garmin/device/filetransfer/DataType;", "uploadDataTypes", "downloadDataTypes", "Lok2/y$d;", "checkDeviceFileList", "checkDownloadSources", "Lok2/g0;", "customTransferType", "", "flushDeviceFiles", "Lok2/y$b;", "preferCachedSources", "<init>", "(Ljava/util/Collection;Ljava/util/Collection;Lok2/y$d;Lok2/y$d;Lok2/g0;ZLok2/y$b;)V", "Lok2/y$a;", "builder", "(Lok2/y$a;)V", "(Ljava/util/Collection;Ljava/util/Collection;Lok2/y$d;Lok2/y$d;Z)V", "()V", "c", "d", "b", "a", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class y {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f132805h = new c(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final List<String> f132806i = p13.x.k("FIT_TYPE_2", "FIT_TYPE_11", "FIT_TYPE_41", "FIT_TYPE_57", "BACKUP_PRIMARY");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Collection<String> f132807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Collection<String> f132808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f132809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f132810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g0 f132811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f132812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f132813g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lok2/y$b;", "", "<init>", "(Ljava/lang/String;I)V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum b {
        DEFAULT,
        NO_CACHE_ALLOWED,
        DOWNLOAD_CACHE_PREFERRED
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lok2/y$d;", "", "<init>", "(Ljava/lang/String;I)V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum d {
        FORCED,
        DEFAULT,
        BLOCKED
    }

    public /* synthetic */ y(Collection collection, Collection collection2, d dVar, d dVar2, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : collection, (i14 & 2) != 0 ? null : collection2, (i14 & 4) != 0 ? d.DEFAULT : dVar, (i14 & 8) != 0 ? d.DEFAULT : dVar2, (i14 & 16) != 0 ? false : z14);
    }

    public static Collection a(ok2.d dVar, wk2.h hVar, Collection collection, rs2.c cVar) {
        if (collection == null || collection.isEmpty()) {
            return collection;
        }
        HashSet hashSet = new HashSet(collection);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            hashSet.addAll(dVar.l(cVar, new wk2.f((String) it.next(), hVar)));
        }
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return p005kotlin.jvm.internal.s.g(this.f132807a, yVar.f132807a) && p005kotlin.jvm.internal.s.g(this.f132808b, yVar.f132808b) && this.f132809c == yVar.f132809c && this.f132810d == yVar.f132810d && this.f132811e == yVar.f132811e && this.f132812f == yVar.f132812f && this.f132813g == yVar.f132813g;
    }

    public final int hashCode() {
        Collection<String> collection = this.f132807a;
        int iHashCode = (collection == null ? 0 : collection.hashCode()) * 31;
        Collection<String> collection2 = this.f132808b;
        int iHashCode2 = (this.f132810d.hashCode() + ((this.f132809c.hashCode() + ((iHashCode + (collection2 == null ? 0 : collection2.hashCode())) * 31)) * 31)) * 31;
        g0 g0Var = this.f132811e;
        return this.f132813g.hashCode() + q6.f.g((iHashCode2 + (g0Var != null ? g0Var.hashCode() : 0)) * 31, 31, this.f132812f);
    }

    public final String toString() {
        return "SyncOptions(uploadDataTypes=" + this.f132807a + ", downloadDataTypes=" + this.f132808b + ", checkDeviceFileList=" + this.f132809c + ", checkDownloadSources=" + this.f132810d + ", customTransferType=" + this.f132811e + ", flushDeviceFiles=" + this.f132812f + ", preferCachedSources=" + this.f132813g + ")";
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lok2/y$c;", "", "<init>", "()V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static y a(c cVar, Collection collection, List list, d dVar, d dVar2, int i14) {
            if ((i14 & 1) != 0) {
                collection = null;
            }
            if ((i14 & 2) != 0) {
                list = null;
            }
            if ((i14 & 8) != 0) {
                dVar2 = d.DEFAULT;
            }
            boolean z14 = (i14 & 16) == 0;
            cVar.getClass();
            dVar.getClass();
            dVar2.getClass();
            a aVar = new a(null, null, null, null, null, false, null, 127, null);
            aVar.f132814a = collection;
            aVar.f132815b = list;
            aVar.f132816c = dVar;
            aVar.f132817d = dVar2;
            aVar.f132819f = z14;
            return new y(aVar);
        }

        private c() {
        }
    }

    public y(Collection<String> collection, Collection<String> collection2, d dVar, d dVar2, g0 g0Var, boolean z14, b bVar) {
        dVar.getClass();
        dVar2.getClass();
        bVar.getClass();
        this.f132807a = collection;
        this.f132808b = collection2;
        this.f132809c = dVar;
        this.f132810d = dVar2;
        this.f132811e = g0Var;
        this.f132812f = z14;
        this.f132813g = bVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @o13.e
    public y(Collection<String> collection, Collection<String> collection2, d dVar, d dVar2, boolean z14) {
        this(collection, collection2, dVar, dVar2, (g0) null, z14, b.DEFAULT);
        dVar.getClass();
        dVar2.getClass();
    }

    public y() {
        this(new a(null, null, null, null, null, false, null, 127, null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(a aVar) {
        this(aVar.f132814a, aVar.f132815b, aVar.f132816c, aVar.f132817d, aVar.f132818e, aVar.f132819f, aVar.f132820g);
        aVar.getClass();
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001Bg\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0018\u00010\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014¨\u0006\u0015"}, d2 = {"Lok2/y$a;", "", "", "", "Lcom/garmin/device/filetransfer/DataType;", "uploadDataTypes", "downloadDataTypes", "Lok2/y$d;", "checkDeviceFileList", "checkDownloadSources", "Lok2/g0;", "customTransferType", "", "flushDeviceFiles", "Lok2/y$b;", "preferCachedSources", "<init>", "(Ljava/util/Collection;Ljava/util/Collection;Lok2/y$d;Lok2/y$d;Lok2/g0;ZLok2/y$b;)V", "Lok2/y;", "options", "(Lok2/y;)V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Collection<String> f132814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Collection<String> f132815b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public d f132816c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public d f132817d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public g0 f132818e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f132819f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final b f132820g;

        public /* synthetic */ a(Collection collection, Collection collection2, d dVar, d dVar2, g0 g0Var, boolean z14, b bVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : collection, (i14 & 2) != 0 ? null : collection2, (i14 & 4) != 0 ? d.DEFAULT : dVar, (i14 & 8) != 0 ? d.DEFAULT : dVar2, (i14 & 16) != 0 ? null : g0Var, (i14 & 32) != 0 ? false : z14, (i14 & 64) != 0 ? b.DEFAULT : bVar);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(y yVar) {
            this(yVar.f132807a, yVar.f132808b, yVar.f132809c, yVar.f132810d, yVar.f132811e, yVar.f132812f, yVar.f132813g);
            yVar.getClass();
        }

        public a(Collection<String> collection, Collection<String> collection2, d dVar, d dVar2, g0 g0Var, boolean z14, b bVar) {
            dVar.getClass();
            dVar2.getClass();
            bVar.getClass();
            this.f132814a = collection;
            this.f132815b = collection2;
            this.f132816c = dVar;
            this.f132817d = dVar2;
            this.f132818e = g0Var;
            this.f132819f = z14;
            this.f132820g = bVar;
        }

        public a() {
            this(null, null, null, null, null, false, null, 127, null);
        }
    }
}
