package hi0;

import android.os.Parcel;
import android.os.Parcelable;
import c22.t;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lhi0/j;", "Landroid/os/Parcelable;", "", "", "enableGroupTrackUserIdList", "disableGroupTrackUserIdList", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "a", "Ljava/util/List;", "getEnableGroupTrackUserIdList", "()Ljava/util/List;", "b", "getDisableGroupTrackUserIdList", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("enableGroupTrackUserIdList")
    private final List<String> enableGroupTrackUserIdList;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("disableGroupTrackUserIdList")
    private final List<String> disableGroupTrackUserIdList;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new j(parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i14) {
            return new j[i14];
        }
    }

    public j(List<String> list, List<String> list2) {
        list.getClass();
        list2.getClass();
        this.enableGroupTrackUserIdList = list;
        this.disableGroupTrackUserIdList = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return s.g(this.enableGroupTrackUserIdList, jVar.enableGroupTrackUserIdList) && s.g(this.disableGroupTrackUserIdList, jVar.disableGroupTrackUserIdList);
    }

    public final int hashCode() {
        return this.disableGroupTrackUserIdList.hashCode() + (this.enableGroupTrackUserIdList.hashCode() * 31);
    }

    public final String toString() {
        return t.f("GroupTrackFriendDTO(enableGroupTrackUserIdList=", ", disableGroupTrackUserIdList=", ")", this.enableGroupTrackUserIdList, this.disableGroupTrackUserIdList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeStringList(this.enableGroupTrackUserIdList);
        parcel.writeStringList(this.disableGroupTrackUserIdList);
    }
}
