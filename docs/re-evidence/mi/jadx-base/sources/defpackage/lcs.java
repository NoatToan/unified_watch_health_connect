package defpackage;

import com.google.android.play.core.assetpacks.AssetPackState;

/* JADX INFO: loaded from: classes5.dex */
public final class lcs extends AssetPackState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24916b;
    public final int c;
    public final long d;
    public final long e;
    public final int f;
    public final int g;
    public final String h;
    public final String i;

    public lcs(String str, int i, int i2, long j, long j2, int i3, int i4, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f24915a = str;
        this.f24916b = i;
        this.c = i2;
        this.d = j;
        this.e = j2;
        this.f = i3;
        this.g = i4;
        if (str2 == null) {
            throw new NullPointerException("Null availableVersionTag");
        }
        this.h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null installedVersionTag");
        }
        this.i = str3;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final String b() {
        return this.h;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final long d() {
        return this.d;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackState) {
            AssetPackState assetPackState = (AssetPackState) obj;
            if (this.f24915a.equals(assetPackState.g()) && this.f24916b == assetPackState.h() && this.c == assetPackState.e() && this.d == assetPackState.d() && this.e == assetPackState.i() && this.f == assetPackState.j() && this.g == assetPackState.k() && this.h.equals(assetPackState.b()) && this.i.equals(assetPackState.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final String f() {
        return this.i;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final String g() {
        return this.f24915a;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int h() {
        return this.f24916b;
    }

    public final int hashCode() {
        int iHashCode = this.f24915a.hashCode() ^ 1000003;
        long j = this.e;
        String str = this.h;
        long j2 = this.d;
        return (((((((((((((((iHashCode * 1000003) ^ this.f24916b) * 1000003) ^ this.c) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ str.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final long i() {
        return this.e;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int j() {
        return this.f;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int k() {
        return this.g;
    }

    public final String toString() {
        return "AssetPackState{name=" + this.f24915a + ", status=" + this.f24916b + ", errorCode=" + this.c + ", bytesDownloaded=" + this.d + ", totalBytesToDownload=" + this.e + ", transferProgressPercentage=" + this.f + ", updateAvailability=" + this.g + ", availableVersionTag=" + this.h + ", installedVersionTag=" + this.i + "}";
    }
}
