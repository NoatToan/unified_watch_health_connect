package zo1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzo1/x0;", "", "", "framedProfileImageUrlMedium", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "gcm-social-group-ride_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f206489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f206490b;

    public x0(String str, String str2) {
        str2.getClass();
        this.f206489a = str;
        this.f206490b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return p005kotlin.jvm.internal.s.g(this.f206489a, x0Var.f206489a) && this.f206490b.equals(x0Var.f206490b);
    }

    public final int hashCode() {
        String str = this.f206489a;
        return this.f206490b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return v.e0.g("ParticipantAvatarModel(framedProfileImageUrlMedium=", this.f206489a, ", name=", this.f206490b, ")");
    }
}
