package z0;

import android.util.Size;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class i extends u.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f200646j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f200647k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f200648l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<Size> f200649m;

    public i(int i14, int i15, String str, List<Size> list) {
        this.f200646j = i14;
        this.f200647k = i15;
        if (str == null) {
            j20.x.l("Null name");
            throw null;
        }
        this.f200648l = str;
        if (list != null) {
            this.f200649m = list;
        } else {
            j20.x.l("Null typicalSizes");
            throw null;
        }
    }

    @Override // z0.u.b
    public final int a() {
        return this.f200647k;
    }

    @Override // z0.u.b
    public final String b() {
        return this.f200648l;
    }

    @Override // z0.u.b
    public final List<Size> c() {
        return this.f200649m;
    }

    @Override // z0.u.b
    public final int d() {
        return this.f200646j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u.b)) {
            return false;
        }
        u.b bVar = (u.b) obj;
        return this.f200646j == bVar.d() && this.f200647k == bVar.a() && this.f200648l.equals(bVar.b()) && this.f200649m.equals(bVar.c());
    }

    public final int hashCode() {
        return ((((((this.f200646j ^ 1000003) * 1000003) ^ this.f200647k) * 1000003) ^ this.f200648l.hashCode()) * 1000003) ^ this.f200649m.hashCode();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ConstantQuality{value=");
        sb3.append(this.f200646j);
        sb3.append(", highSpeedValue=");
        sb3.append(this.f200647k);
        sb3.append(", name=");
        sb3.append(this.f200648l);
        sb3.append(", typicalSizes=");
        return u62.z.c(sb3, this.f200649m, StringSubstitutor.DEFAULT_VAR_END);
    }
}
