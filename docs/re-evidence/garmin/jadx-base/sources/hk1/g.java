package hk1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000f\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, d2 = {"Lhk1/g;", "Landroid/os/Parcelable;", "", "consumerKey", "", "Lhk1/e;", "capabilities", "userInapplicableCapabilities", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "a", "Ljava/lang/String;", "getConsumerKey", "()Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "d", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("consumerKey")
    private final String consumerKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("capabilities")
    private final List<e> capabilities;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userInapplicableCapabilities")
    private final List<String> userInapplicableCapabilities;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(e.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new g(string, arrayList, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    }

    public g(String str, List<e> list, List<String> list2) {
        this.consumerKey = str;
        this.capabilities = list;
        this.userInapplicableCapabilities = list2;
    }

    public final List<e> b() {
        return this.capabilities;
    }

    public final List<String> d() {
        return this.userInapplicableCapabilities;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return p005kotlin.jvm.internal.s.g(this.consumerKey, gVar.consumerKey) && p005kotlin.jvm.internal.s.g(this.capabilities, gVar.capabilities) && p005kotlin.jvm.internal.s.g(this.userInapplicableCapabilities, gVar.userInapplicableCapabilities);
    }

    public final boolean f(String str) {
        str.getClass();
        List<e> list = this.capabilities;
        Object obj = null;
        if (list != null) {
            for (Object obj2 : list) {
                if (p005kotlin.jvm.internal.s.g(((e) obj2).getConsumerCapability(), str)) {
                    obj = obj2;
                    break;
                }
            }
            obj = (e) obj;
        }
        return obj != null;
    }

    public final int hashCode() {
        String str = this.consumerKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<e> list = this.capabilities;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.userInapplicableCapabilities;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.consumerKey;
        List<e> list = this.capabilities;
        return u62.z.c(l2.g("ConsumerDTO(consumerKey=", str, ", capabilities=", list, ", userInapplicableCapabilities="), this.userInapplicableCapabilities, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.consumerKey);
        List<e> list = this.capabilities;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((e) itO.next()).writeToParcel(parcel, i14);
            }
        }
        parcel.writeStringList(this.userInapplicableCapabilities);
    }
}
