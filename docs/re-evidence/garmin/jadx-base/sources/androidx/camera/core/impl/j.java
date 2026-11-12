package androidx.camera.core.impl;

import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class j extends f1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<f1.a> f5578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<f1.c> f5579d;

    public j(int i14, int i15, List<f1.a> list, List<f1.c> list2) {
        this.f5576a = i14;
        this.f5577b = i15;
        if (list == null) {
            j20.x.l("Null audioProfiles");
            throw null;
        }
        this.f5578c = list;
        if (list2 != null) {
            this.f5579d = list2;
        } else {
            j20.x.l("Null videoProfiles");
            throw null;
        }
    }

    @Override // androidx.camera.core.impl.f1
    public final int a() {
        return this.f5577b;
    }

    @Override // androidx.camera.core.impl.f1
    public final List<f1.a> b() {
        return this.f5578c;
    }

    @Override // androidx.camera.core.impl.f1
    public final int c() {
        return this.f5576a;
    }

    @Override // androidx.camera.core.impl.f1
    public final List<f1.c> d() {
        return this.f5579d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1.b) {
            j jVar = (j) ((f1.b) obj);
            if (this.f5576a == jVar.f5576a && this.f5577b == jVar.f5577b && this.f5578c.equals(jVar.f5578c) && this.f5579d.equals(jVar.f5579d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f5576a ^ 1000003) * 1000003) ^ this.f5577b) * 1000003) ^ this.f5578c.hashCode()) * 1000003) ^ this.f5579d.hashCode();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImmutableEncoderProfilesProxy{defaultDurationSeconds=");
        sb3.append(this.f5576a);
        sb3.append(", recommendedFileFormat=");
        sb3.append(this.f5577b);
        sb3.append(", audioProfiles=");
        sb3.append(this.f5578c);
        sb3.append(", videoProfiles=");
        return u62.z.c(sb3, this.f5579d, StringSubstitutor.DEFAULT_VAR_END);
    }
}
