package wf;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lwf/p;", "Lwf/i;", "Lhf/h;", "image", "Lwf/f;", "request", "Llf/e;", "dataSource", "Lrf/b$b;", "memoryCacheKey", "", "diskCacheKey", "", "isSampled", "isPlaceholderCached", "<init>", "(Lhf/h;Lwf/f;Llf/e;Lrf/b$b;Ljava/lang/String;ZZ)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hf.h f185006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f185007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lf.e f185008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rf.b.C2864b f185009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f185010e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f185011f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f185012g;

    public /* synthetic */ p(hf.h hVar, f fVar, lf.e eVar, rf.b.C2864b c2864b, String str, boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this(hVar, fVar, (i14 & 4) != 0 ? lf.e.MEMORY : eVar, (i14 & 8) != 0 ? null : c2864b, (i14 & 16) != 0 ? null : str, (i14 & 32) != 0 ? false : z14, (i14 & 64) != 0 ? false : z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return p005kotlin.jvm.internal.s.g(this.f185006a, pVar.f185006a) && p005kotlin.jvm.internal.s.g(this.f185007b, pVar.f185007b) && this.f185008c == pVar.f185008c && p005kotlin.jvm.internal.s.g(this.f185009d, pVar.f185009d) && p005kotlin.jvm.internal.s.g(this.f185010e, pVar.f185010e) && this.f185011f == pVar.f185011f && this.f185012g == pVar.f185012g;
    }

    @Override // wf.i
    /* JADX INFO: renamed from: getImage, reason: from getter */
    public final hf.h getF184899a() {
        return this.f185006a;
    }

    @Override // wf.i
    /* JADX INFO: renamed from: getRequest, reason: from getter */
    public final f getF184900b() {
        return this.f185007b;
    }

    public final int hashCode() {
        int iHashCode = (this.f185008c.hashCode() + ((this.f185007b.hashCode() + (this.f185006a.hashCode() * 31)) * 31)) * 31;
        rf.b.C2864b c2864b = this.f185009d;
        int iHashCode2 = (iHashCode + (c2864b == null ? 0 : c2864b.hashCode())) * 31;
        String str = this.f185010e;
        return Boolean.hashCode(this.f185012g) + q6.f.g((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f185011f);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SuccessResult(image=");
        sb3.append(this.f185006a);
        sb3.append(", request=");
        sb3.append(this.f185007b);
        sb3.append(", dataSource=");
        sb3.append(this.f185008c);
        sb3.append(", memoryCacheKey=");
        sb3.append(this.f185009d);
        sb3.append(", diskCacheKey=");
        sb3.append(this.f185010e);
        sb3.append(", isSampled=");
        sb3.append(this.f185011f);
        sb3.append(", isPlaceholderCached=");
        return am.j.t(sb3, this.f185012g, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public p(hf.h hVar, f fVar, lf.e eVar, rf.b.C2864b c2864b, String str, boolean z14, boolean z15) {
        this.f185006a = hVar;
        this.f185007b = fVar;
        this.f185008c = eVar;
        this.f185009d = c2864b;
        this.f185010e = str;
        this.f185011f = z14;
        this.f185012g = z15;
    }
}
