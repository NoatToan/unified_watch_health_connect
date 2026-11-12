package v;

import android.util.Size;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Size> f173755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Size> f173756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f173757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f173758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f173759e;

    public d(List<Size> list, List<Size> list2, int i14, int i15, int i16) {
        this.f173755a = list;
        this.f173756b = list2;
        this.f173757c = i14;
        this.f173758d = i15;
        this.f173759e = i16;
    }

    @Override // v.b2.a
    public final List<Size> a() {
        return this.f173755a;
    }

    @Override // v.b2.a
    public final List<Size> b() {
        return this.f173756b;
    }

    @Override // v.b2.a
    public final int c() {
        return this.f173759e;
    }

    @Override // v.b2.a
    public final int d() {
        return this.f173757c;
    }

    @Override // v.b2.a
    public final int e() {
        return this.f173758d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b2.a)) {
            return false;
        }
        b2.a aVar = (b2.a) obj;
        List<Size> list = this.f173755a;
        if (list == null) {
            if (aVar.a() != null) {
                return false;
            }
        } else if (!list.equals(aVar.a())) {
            return false;
        }
        List<Size> list2 = this.f173756b;
        if (list2 == null) {
            if (aVar.b() != null) {
                return false;
            }
        } else if (!list2.equals(aVar.b())) {
            return false;
        }
        return this.f173757c == aVar.d() && this.f173758d == aVar.e() && this.f173759e == aVar.c();
    }

    public final int hashCode() {
        List<Size> list = this.f173755a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        List<Size> list2 = this.f173756b;
        return (((((((list2 != null ? list2.hashCode() : 0) ^ iHashCode) * 1000003) ^ this.f173757c) * 1000003) ^ this.f173758d) * 1000003) ^ this.f173759e;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BestSizesAndMaxFpsForConfigs{bestSizes=");
        sb3.append(this.f173755a);
        sb3.append(", bestSizesForStreamUseCase=");
        sb3.append(this.f173756b);
        sb3.append(", maxFpsForBestSizes=");
        sb3.append(this.f173757c);
        sb3.append(", maxFpsForStreamUseCase=");
        sb3.append(this.f173758d);
        sb3.append(", maxFpsForAllSizes=");
        return am.j.q(sb3, this.f173759e, StringSubstitutor.DEFAULT_VAR_END);
    }
}
