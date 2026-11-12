package mo1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import v.e0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lmo1/h;", "Lmo1/b;", "Landroid/os/Parcelable;", "", "avatarId", "<init>", "(I)V", JWKParameterNames.OCT_KEY_VALUE, "I", "getAvatarId", "()I", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h extends b implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avatarId")
    private final int avatarId;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new h(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i14) {
            return new h[i14];
        }
    }

    public h(int i14) {
        super(null, null, null, null, 0L, null, null, null, false, null, 1023, null);
        this.avatarId = i14;
    }

    @Override // mo1.b, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.avatarId == ((h) obj).avatarId;
    }

    public final boolean h() {
        return this.avatarId != -1;
    }

    public final int hashCode() {
        return Integer.hashCode(this.avatarId);
    }

    public final String toString() {
        return e0.f(this.avatarId, "VivoKidChallengeConversationCommentLikeDTO(avatarId=", ")");
    }

    @Override // mo1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.avatarId);
    }

    public h() {
        this(0, 1, null);
    }

    public /* synthetic */ h(int i14, int i15, j jVar) {
        this((i15 & 1) != 0 ? -1 : i14);
    }
}
