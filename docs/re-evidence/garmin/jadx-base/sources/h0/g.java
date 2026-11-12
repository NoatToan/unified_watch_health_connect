package h0;

import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class g extends i0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0.f<i0.b> f80468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0.f<i0.b> f80469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f80470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Integer> f80471d;

    public g(r0.f<i0.b> fVar, r0.f<i0.b> fVar2, int i14, List<Integer> list) {
        if (fVar == null) {
            j20.x.l("Null edge");
            throw null;
        }
        this.f80468a = fVar;
        if (fVar2 == null) {
            j20.x.l("Null postviewEdge");
            throw null;
        }
        this.f80469b = fVar2;
        this.f80470c = i14;
        if (list != null) {
            this.f80471d = list;
        } else {
            j20.x.l("Null outputFormats");
            throw null;
        }
    }

    @Override // h0.i0.a
    public final r0.f<i0.b> a() {
        return this.f80468a;
    }

    @Override // h0.i0.a
    public final int b() {
        return this.f80470c;
    }

    @Override // h0.i0.a
    public final List<Integer> c() {
        return this.f80471d;
    }

    @Override // h0.i0.a
    public final r0.f<i0.b> d() {
        return this.f80469b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i0.a)) {
            return false;
        }
        i0.a aVar = (i0.a) obj;
        return this.f80468a.equals(aVar.a()) && this.f80469b.equals(aVar.d()) && this.f80470c == aVar.b() && this.f80471d.equals(aVar.c());
    }

    public final int hashCode() {
        return ((((((this.f80468a.hashCode() ^ 1000003) * 1000003) ^ this.f80469b.hashCode()) * 1000003) ^ this.f80470c) * 1000003) ^ this.f80471d.hashCode();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("In{edge=");
        sb3.append(this.f80468a);
        sb3.append(", postviewEdge=");
        sb3.append(this.f80469b);
        sb3.append(", inputFormat=");
        sb3.append(this.f80470c);
        sb3.append(", outputFormats=");
        return u62.z.c(sb3, this.f80471d, StringSubstitutor.DEFAULT_VAR_END);
    }
}
