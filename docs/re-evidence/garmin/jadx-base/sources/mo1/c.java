package mo1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import u62.z;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015¨\u0006\u0016"}, d2 = {"Lmo1/c;", "Landroid/os/Parcelable;", "", "uuid", "", "numberOfLikes", "", "Lmo1/b;", "commentLikeList", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)V", "a", "Ljava/lang/String;", "getUuid", "()Ljava/lang/String;", "b", "Ljava/lang/Integer;", "getNumberOfLikes", "()Ljava/lang/Integer;", "c", "Ljava/util/List;", "()Ljava/util/List;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("conversationCommentUuid")
    private final String uuid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("numberOfLikes")
    private final Integer numberOfLikes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("commentLikeList")
    private final List<b> commentLikeList;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            ArrayList arrayList = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iD = 0;
                while (iD != i14) {
                    iD = u0.d(c.class, parcel, arrayList2, iD, 1);
                }
                arrayList = arrayList2;
            }
            return new c(string, numValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(String str, Integer num, List list, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : list);
    }

    public final List<b> b() {
        return this.commentLikeList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.uuid, cVar.uuid) && s.g(this.numberOfLikes, cVar.numberOfLikes) && s.g(this.commentLikeList, cVar.commentLikeList);
    }

    public final int hashCode() {
        String str = this.uuid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.numberOfLikes;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<b> list = this.commentLikeList;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String str = this.uuid;
        Integer num = this.numberOfLikes;
        return z.c(u0.n("ConversationCommentLikesDTO(uuid=", num, str, ", numberOfLikes=", ", commentLikeList="), this.commentLikeList, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.uuid);
        Integer num = this.numberOfLikes;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        List<b> list = this.commentLikeList;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            parcel.writeParcelable((Parcelable) itO.next(), i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(String str, Integer num, List<? extends b> list) {
        this.uuid = str;
        this.numberOfLikes = num;
        this.commentLikeList = list;
    }

    public c() {
        this(null, null, null, 7, null);
    }
}
