package ps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\tB+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lps/u0;", "Landroid/os/Parcelable;", "", "scale", "", "sortOrder", "valueKey", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "c", "f", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class u0 implements Parcelable {
    public static final Parcelable.Creator<u0> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("scale")
    private final String scale;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sortOrder")
    private final Integer sortOrder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("valueKey")
    private final String valueKey;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<u0> {
        @Override // android.os.Parcelable.Creator
        public final u0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new u0(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final u0[] newArray(int i14) {
            return new u0[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public /* synthetic */ u0(String str, Integer num, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : str2);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getScale() {
        return this.scale;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getSortOrder() {
        return this.sortOrder;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return p005kotlin.jvm.internal.s.g(this.scale, u0Var.scale) && p005kotlin.jvm.internal.s.g(this.sortOrder, u0Var.sortOrder) && p005kotlin.jvm.internal.s.g(this.valueKey, u0Var.valueKey);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getValueKey() {
        return this.valueKey;
    }

    public final JSONObject g() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("scale", this.scale);
        jSONObject.put("sortOrder", this.sortOrder);
        jSONObject.put("valueKey", this.valueKey);
        return jSONObject;
    }

    public final int hashCode() {
        String str = this.scale;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.sortOrder;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.valueKey;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.scale;
        return am.j.o(this.valueKey, ")", lc.u0.n("GradeDTO(scale=", this.sortOrder, str, ", sortOrder=", ", valueKey="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.scale);
        Integer num = this.sortOrder;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.valueKey);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lps/u0$a;", "", "<init>", "()V", "", "KEY_SCALE", "Ljava/lang/String;", "KEY_SORT_ORDER", "KEY_VALUE_KEY", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public u0(String str, Integer num, String str2) {
        this.scale = str;
        this.sortOrder = num;
        this.valueKey = str2;
    }

    public u0() {
        this(null, null, null, 7, null);
    }
}
