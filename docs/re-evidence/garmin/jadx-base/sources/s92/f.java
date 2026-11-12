package s92;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.gncs.NotificationConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ls92/f;", "Landroid/os/Parcelable;", "Ls92/j;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "Ls92/b;", "textBlocks", "<init>", "(Ls92/j;Ljava/util/List;)V", "a", "Ls92/j;", "d", "()Ls92/j;", "setType", "(Ls92/j;)V", "b", "Ljava/util/List;", "()Ljava/util/List;", "setTextBlocks", "(Ljava/util/List;)V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("textType")
    @Expose
    private j type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("textBlocks")
    @Expose
    private List<b> textBlocks;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            j jVarValueOf = j.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(b.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new f(jVarValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public f(j jVar, List<b> list) {
        jVar.getClass();
        this.type = jVar;
        this.textBlocks = list;
    }

    public final List<b> b() {
        return this.textBlocks;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final j getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.type == fVar.type && s.g(this.textBlocks, fVar.textBlocks);
    }

    public final int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        List<b> list = this.textBlocks;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "ConsentText(type=" + this.type + ", textBlocks=" + this.textBlocks + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.type.name());
        List<b> list = this.textBlocks;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            ((b) itO.next()).writeToParcel(parcel, i14);
        }
    }

    public /* synthetic */ f(j jVar, List list, int i14, p005kotlin.jvm.internal.j jVar2) {
        this((i14 & 1) != 0 ? j.INDIVIDUAL : jVar, list);
    }
}
