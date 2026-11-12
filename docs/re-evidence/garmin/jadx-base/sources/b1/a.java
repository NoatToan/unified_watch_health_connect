package b1;

import androidx.camera.core.impl.f1;
import j20.x;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class a extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<f1.a> f14184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<f1.c> f14185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f1.a f14186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f1.c f14187f;

    public a(int i14, int i15, List<f1.a> list, List<f1.c> list2, f1.a aVar, f1.c cVar) {
        this.f14182a = i14;
        this.f14183b = i15;
        if (list == null) {
            x.l("Null audioProfiles");
            throw null;
        }
        this.f14184c = list;
        if (list2 == null) {
            x.l("Null videoProfiles");
            throw null;
        }
        this.f14185d = list2;
        this.f14186e = aVar;
        if (cVar != null) {
            this.f14187f = cVar;
        } else {
            x.l("Null defaultVideoProfile");
            throw null;
        }
    }

    @Override // androidx.camera.core.impl.f1
    public final int a() {
        return this.f14183b;
    }

    @Override // androidx.camera.core.impl.f1
    public final List<f1.a> b() {
        return this.f14184c;
    }

    @Override // androidx.camera.core.impl.f1
    public final int c() {
        return this.f14182a;
    }

    @Override // androidx.camera.core.impl.f1
    public final List<f1.c> d() {
        return this.f14185d;
    }

    @Override // b1.i
    public final f1.a e() {
        return this.f14186e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        a aVar = (a) iVar;
        if (this.f14182a != aVar.f14182a || this.f14183b != aVar.f14183b || !this.f14184c.equals(aVar.f14184c) || !this.f14185d.equals(aVar.f14185d)) {
            return false;
        }
        f1.a aVar2 = this.f14186e;
        if (aVar2 == null) {
            if (iVar.e() != null) {
                return false;
            }
        } else if (!aVar2.equals(iVar.e())) {
            return false;
        }
        return this.f14187f.equals(iVar.f());
    }

    @Override // b1.i
    public final f1.c f() {
        return this.f14187f;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f14182a ^ 1000003) * 1000003) ^ this.f14183b) * 1000003) ^ this.f14184c.hashCode()) * 1000003) ^ this.f14185d.hashCode()) * 1000003;
        f1.a aVar = this.f14186e;
        return ((iHashCode ^ (aVar == null ? 0 : aVar.hashCode())) * 1000003) ^ this.f14187f.hashCode();
    }

    public final String toString() {
        return "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=" + this.f14182a + ", recommendedFileFormat=" + this.f14183b + ", audioProfiles=" + this.f14184c + ", videoProfiles=" + this.f14185d + ", defaultAudioProfile=" + this.f14186e + ", defaultVideoProfile=" + this.f14187f + StringSubstitutor.DEFAULT_VAR_END;
    }
}
