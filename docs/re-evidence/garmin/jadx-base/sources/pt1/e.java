package pt1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpt1/e;", "", "", "picturesUploaded", "totalPictures", "<init>", "(II)V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f140839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f140840b;

    public e(int i14, int i15) {
        this.f140839a = i14;
        this.f140840b = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f140839a == eVar.f140839a && this.f140840b == eVar.f140840b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f140840b) + (Integer.hashCode(this.f140839a) * 31);
    }

    public final String toString() {
        return am.j.g(this.f140839a, this.f140840b, "PhotoUploadProgress(picturesUploaded=", ", totalPictures=", ")");
    }
}
