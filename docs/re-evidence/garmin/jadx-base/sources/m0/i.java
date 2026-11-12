package m0;

import androidx.camera.core.impl.q2;
import b0.i1;
import ch.qos.logback.core.CoreConstants;
import ds.e0;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.k0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lm0/i;", "", "", "Lb0/i1;", "Landroidx/camera/core/impl/q2;", "streamSpecs", "", "maxSupportedFrameRate", "<init>", "(Ljava/util/Map;I)V", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<i1, q2> f115502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f115503b;

    /* JADX WARN: Illegal instructions before constructor call */
    public i(Map map, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        if ((i15 & 1) != 0) {
            map = k0.f134949a;
            map.getClass();
        }
        this(map, (i15 & 2) != 0 ? Integer.MAX_VALUE : i14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return s.g(this.f115502a, iVar.f115502a) && this.f115503b == iVar.f115503b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f115503b) + (this.f115502a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StreamSpecQueryResult(streamSpecs=");
        sb3.append(this.f115502a);
        sb3.append(", maxSupportedFrameRate=");
        return e0.j(sb3, this.f115503b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(Map<i1, ? extends q2> map, int i14) {
        map.getClass();
        this.f115502a = map;
        this.f115503b = i14;
    }

    public i() {
        this(null, 0, 3, null);
    }
}
