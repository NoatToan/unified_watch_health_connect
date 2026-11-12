package wg0;

import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lwg0/o;", "", "Lb12/b;", "activityOwnerProfileImageData", "highlightedCommentProfileImageData", "<init>", "(Lb12/b;Lb12/b;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b12.b f185119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b12.b f185120b;

    static {
        Parcelable.Creator<b12.b> creator = b12.b.CREATOR;
    }

    public o(b12.b bVar, b12.b bVar2) {
        bVar.getClass();
        bVar2.getClass();
        this.f185119a = bVar;
        this.f185120b = bVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f185119a.equals(oVar.f185119a) && this.f185120b.equals(oVar.f185120b);
    }

    public final int hashCode() {
        return this.f185120b.hashCode() + (this.f185119a.hashCode() * 31);
    }

    public final String toString() {
        return "NewsFeedCurrentUserProfileImageChangedPayload(activityOwnerProfileImageData=" + this.f185119a + ", highlightedCommentProfileImageData=" + this.f185120b + ")";
    }
}
