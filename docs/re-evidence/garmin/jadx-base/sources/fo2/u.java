package fo2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lfo2/u;", "Landroid/os/Parcelable;", "Lfo2/m0;", "links", "", TtmlNode.ATTR_ID, "<init>", "(Lfo2/m0;Ljava/lang/String;)V", "a", "Lfo2/m0;", "b", "()Lfo2/m0;", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class u implements Parcelable {
    public static final Parcelable.Creator<u> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("_links")
    private final m0 links;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName(TtmlNode.ATTR_ID)
    private final String id;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<u> {
        @Override // android.os.Parcelable.Creator
        public final u createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new u(m0.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final u[] newArray(int i14) {
            return new u[i14];
        }
    }

    public u(m0 m0Var, String str) {
        m0Var.getClass();
        this.links = m0Var;
        this.id = str;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final m0 getLinks() {
        return this.links;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return p005kotlin.jvm.internal.s.g(this.links, uVar.links) && p005kotlin.jvm.internal.s.g(this.id, uVar.id);
    }

    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        int iHashCode = this.links.hashCode() * 31;
        String str = this.id;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "NewFitPayUser(links=" + this.links + ", id=" + this.id + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        this.links.writeToParcel(parcel, i14);
        parcel.writeString(this.id);
    }

    public /* synthetic */ u(m0 m0Var, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this(m0Var, (i14 & 2) != 0 ? null : str);
    }
}
