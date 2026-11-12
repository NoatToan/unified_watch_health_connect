package mt0;

import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmt0/t;", "", "", "userId", "", "fullName", "displayName", "Lb12/b;", "userProfileImageData", "stackedUserProfileImageData", "", "isReadOnly", "isChecked", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lb12/b;Lb12/b;ZZ)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f120858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b12.b f120861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b12.b f120862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f120863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f120864g;

    static {
        Parcelable.Creator<b12.b> creator = b12.b.CREATOR;
    }

    public t(long j8, String str, String str2, b12.b bVar, b12.b bVar2, boolean z14, boolean z15) {
        str.getClass();
        str2.getClass();
        bVar.getClass();
        bVar2.getClass();
        this.f120858a = j8;
        this.f120859b = str;
        this.f120860c = str2;
        this.f120861d = bVar;
        this.f120862e = bVar2;
        this.f120863f = z14;
        this.f120864g = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f120858a == tVar.f120858a && this.f120859b.equals(tVar.f120859b) && this.f120860c.equals(tVar.f120860c) && this.f120861d.equals(tVar.f120861d) && this.f120862e.equals(tVar.f120862e) && this.f120863f == tVar.f120863f && this.f120864g == tVar.f120864g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f120864g) + q6.f.g((this.f120862e.hashCode() + ((this.f120861d.hashCode() + wr.g.j(wr.g.j(Long.hashCode(this.f120858a) * 31, 31, this.f120859b), 31, this.f120860c)) * 31)) * 31, 31, this.f120863f);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f120858a, "AdHocChallengeManagePlayerData(userId=", ", fullName=", this.f120859b);
        sbK.append(", displayName=");
        sbK.append(this.f120860c);
        sbK.append(", userProfileImageData=");
        sbK.append(this.f120861d);
        sbK.append(", stackedUserProfileImageData=");
        sbK.append(this.f120862e);
        sbK.append(", isReadOnly=");
        sbK.append(this.f120863f);
        return com.airbnb.lottie.animation.keyframe.a.i(sbK, ", isChecked=", this.f120864g, ")");
    }
}
