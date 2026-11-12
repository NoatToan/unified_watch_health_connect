package ps;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, d2 = {"Lps/l1;", "Landroid/os/Parcelable;", "", TtmlNode.ATTR_ID, "", Action.KEY_ATTRIBUTE, "sectionTypeKey", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/Integer;", "getId", "()Ljava/lang/Integer;", "b", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "c", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l1 implements Parcelable {
    public static final Parcelable.Creator<l1> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(TtmlNode.ATTR_ID)
    private final Integer id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName(Action.KEY_ATTRIBUTE)
    private final String key;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sectionTypeKey")
    private final String sectionTypeKey;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<l1> {
        @Override // android.os.Parcelable.Creator
        public final l1 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new l1(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final l1[] newArray(int i14) {
            return new l1[i14];
        }
    }

    public /* synthetic */ l1(Integer num, String str, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2);
    }

    public final qs.s b() {
        for (qs.s sVar : qs.s.values()) {
            if (p005kotlin.jvm.internal.s.g(sVar.name(), this.sectionTypeKey)) {
                return sVar;
            }
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return p005kotlin.jvm.internal.s.g(this.id, l1Var.id) && p005kotlin.jvm.internal.s.g(this.key, l1Var.key) && p005kotlin.jvm.internal.s.g(this.sectionTypeKey, l1Var.sectionTypeKey);
    }

    public final int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.key;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sectionTypeKey;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return am.j.o(this.sectionTypeKey, ")", l2.f("SectionTypeDTO(id=", this.id, ", key=", this.key, ", sectionTypeKey="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.key);
        parcel.writeString(this.sectionTypeKey);
    }

    public l1(Integer num, String str, String str2) {
        this.id = num;
        this.key = str;
        this.sectionTypeKey = str2;
    }

    public l1() {
        this(null, null, null, 7, null);
    }
}
