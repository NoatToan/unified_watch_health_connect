package nd2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.k0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lnd2/b;", "", "", "responseCode", "", "", "", "headers", "", TtmlNode.TAG_BODY, "<init>", "(ILjava/util/Map;[B)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f125409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, List<String>> f125410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f125411c;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(int i14, Map map, byte[] bArr, int i15, j jVar) {
        if ((i15 & 2) != 0) {
            map = k0.f134949a;
            map.getClass();
        }
        this(i14, map, (i15 & 4) != 0 ? null : bArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        b bVar = (b) obj;
        if (this.f125409a != bVar.f125409a || !s.g(this.f125410b, bVar.f125410b)) {
            return false;
        }
        byte[] bArr = bVar.f125411c;
        byte[] bArr2 = this.f125411c;
        if (bArr2 != null) {
            if (bArr == null || !Arrays.equals(bArr2, bArr)) {
                return false;
            }
        } else if (bArr != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iB = am.j.b(this.f125410b, this.f125409a * 31, 31);
        byte[] bArr = this.f125411c;
        return iB + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    public final String toString() {
        String string = Arrays.toString(this.f125411c);
        StringBuilder sb3 = new StringBuilder("HttpResponse(responseCode=");
        sb3.append(this.f125409a);
        sb3.append(", headers=");
        sb3.append(this.f125410b);
        sb3.append(", body=");
        return am.j.o(string, ")", sb3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(int i14, Map<String, ? extends List<String>> map, byte[] bArr) {
        map.getClass();
        this.f125409a = i14;
        this.f125410b = map;
        this.f125411c = bArr;
    }
}
