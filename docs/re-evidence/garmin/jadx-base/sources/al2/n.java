package al2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import ok2.g0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lal2/n;", "", "Lrs2/c;", "device", "Lok2/g0;", "transferType", "Lwk2/f;", TtmlNode.TAG_METADATA, "", "bytesTransferred", "bytesTotal", "<init>", "(Lrs2/c;Lok2/g0;Lwk2/f;JJ)V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rs2.c f3829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f3830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wk2.f f3831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f3833e;

    public n(rs2.c cVar, g0 g0Var, wk2.f fVar, long j8, long j14) {
        cVar.getClass();
        g0Var.getClass();
        fVar.getClass();
        this.f3829a = cVar;
        this.f3830b = g0Var;
        this.f3831c = fVar;
        this.f3832d = j8;
        this.f3833e = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return s.g(this.f3829a, nVar.f3829a) && this.f3830b == nVar.f3830b && s.g(this.f3831c, nVar.f3831c) && this.f3832d == nVar.f3832d && this.f3833e == nVar.f3833e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3833e) + q6.f.e((this.f3831c.hashCode() + ((this.f3830b.hashCode() + (this.f3829a.hashCode() * 31)) * 31)) * 31, 31, this.f3832d);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FileTransferProgress(device=");
        sb3.append(this.f3829a);
        sb3.append(", transferType=");
        sb3.append(this.f3830b);
        sb3.append(", metadata=");
        sb3.append(this.f3831c);
        sb3.append(", bytesTransferred=");
        sb3.append(this.f3832d);
        return com.nimbusds.jose.shaded.gson.internal.a.g(this.f3833e, ", bytesTotal=", ")", sb3);
    }

    public n(rs2.c cVar, g0 g0Var, wk2.f fVar, long j8, long j14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(cVar, g0Var, fVar, j8, (i14 & 16) != 0 ? fVar.f185845d : j14);
    }
}
