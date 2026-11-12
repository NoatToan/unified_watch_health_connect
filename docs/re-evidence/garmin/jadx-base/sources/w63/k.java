package w63;

import java.util.ArrayList;
import java.util.Map;
import p005kotlin.Metadata;
import p13.k0;
import p13.u0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lw63/k;", "", "", "isRegularFile", "isDirectory", "Lw63/y;", "symlinkTarget", "", "size", "createdAtMillis", "lastModifiedAtMillis", "lastAccessedAtMillis", "", "Lk23/d;", "extras", "<init>", "(ZZLw63/y;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Map;)V", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f183379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f183380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f183381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f183382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f183383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f183384f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f183385g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map<k23.d<?>, Object> f183386h;

    /* JADX WARN: Illegal instructions before constructor call */
    public k(boolean z14, boolean z15, y yVar, Long l14, Long l15, Long l16, Long l17, Map map, int i14, p005kotlin.jvm.internal.j jVar) {
        z14 = (i14 & 1) != 0 ? false : z14;
        z15 = (i14 & 2) != 0 ? false : z15;
        yVar = (i14 & 4) != 0 ? null : yVar;
        l14 = (i14 & 8) != 0 ? null : l14;
        l15 = (i14 & 16) != 0 ? null : l15;
        l16 = (i14 & 32) != 0 ? null : l16;
        l17 = (i14 & 64) != 0 ? null : l17;
        if ((i14 & 128) != 0) {
            map = k0.f134949a;
            map.getClass();
        }
        this(z14, z15, yVar, l14, l15, l16, l17, map);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f183379a) {
            arrayList.add("isRegularFile");
        }
        if (this.f183380b) {
            arrayList.add("isDirectory");
        }
        Long l14 = this.f183382d;
        if (l14 != null) {
            arrayList.add("byteCount=" + l14);
        }
        Long l15 = this.f183383e;
        if (l15 != null) {
            arrayList.add("createdAt=" + l15);
        }
        Long l16 = this.f183384f;
        if (l16 != null) {
            arrayList.add("lastModifiedAt=" + l16);
        }
        Long l17 = this.f183385g;
        if (l17 != null) {
            arrayList.add("lastAccessedAt=" + l17);
        }
        Map<k23.d<?>, Object> map = this.f183386h;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return p13.h0.k0(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }

    public k() {
        this(false, false, null, null, null, null, null, null, 255, null);
    }

    public k(boolean z14, boolean z15, y yVar, Long l14, Long l15, Long l16, Long l17, Map<k23.d<?>, ? extends Object> map) {
        map.getClass();
        this.f183379a = z14;
        this.f183380b = z15;
        this.f183381c = yVar;
        this.f183382d = l14;
        this.f183383e = l15;
        this.f183384f = l16;
        this.f183385g = l17;
        this.f183386h = u0.m(map);
    }
}
