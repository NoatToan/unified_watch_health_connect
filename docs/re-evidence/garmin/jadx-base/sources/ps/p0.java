package ps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000fB+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\u000eR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lps/p0;", "Landroid/os/Parcelable;", "", "sortOrder", "typeId", "", "typeKey", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "Lorg/json/JSONObject;", "json", "(Lorg/json/JSONObject;)V", "Lqs/g;", "event", "(Lqs/g;)V", "a", "Ljava/lang/Integer;", "getSortOrder", "()Ljava/lang/Integer;", "setSortOrder", "(Ljava/lang/Integer;)V", "b", "setTypeId", "c", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "setTypeKey", "(Ljava/lang/String;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p0 implements Parcelable {
    public static final Parcelable.Creator<p0> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sortOrder")
    private Integer sortOrder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("typeId")
    private Integer typeId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("typeKey")
    private String typeKey;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<p0> {
        @Override // android.os.Parcelable.Creator
        public final p0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new p0(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final p0[] newArray(int i14) {
            return new p0[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p0(JSONObject jSONObject) {
        this(Integer.valueOf(jSONObject.optInt("sortOrder")), Integer.valueOf(jSONObject.optInt("typeId")), jSONObject.optString("typeKey"));
        jSONObject.getClass();
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getTypeId() {
        return this.typeId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTypeKey() {
        return this.typeKey;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return p005kotlin.jvm.internal.s.g(this.sortOrder, p0Var.sortOrder) && p005kotlin.jvm.internal.s.g(this.typeId, p0Var.typeId) && p005kotlin.jvm.internal.s.g(this.typeKey, p0Var.typeKey);
    }

    public final JSONObject f() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sortOrder", this.sortOrder);
        jSONObject.put("typeId", this.typeId);
        jSONObject.put("typeKey", this.typeKey);
        return jSONObject;
    }

    public final int hashCode() {
        Integer num = this.sortOrder;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.typeId;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.typeKey;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return am.j.o(this.typeKey, ")", com.airbnb.lottie.animation.keyframe.a.l(this.sortOrder, "EventItemDTO(sortOrder=", ", typeId=", ", typeKey=", this.typeId));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.sortOrder;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.typeId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        parcel.writeString(this.typeKey);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lps/p0$a;", "", "<init>", "()V", "", "SORT_ORDER_KEY", "Ljava/lang/String;", "TYPE_ID_KEY", "TYPE_KEY", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public p0(Integer num, Integer num2, String str) {
        this.sortOrder = num;
        this.typeId = num2;
        this.typeKey = str;
    }

    public /* synthetic */ p0(Integer num, Integer num2, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : num2, (i14 & 4) != 0 ? null : str);
    }

    public p0() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p0(qs.g gVar) {
        this(null, null, null, 7, null);
        gVar.getClass();
        this.typeId = Integer.valueOf(gVar.f147084a);
        this.typeKey = gVar.f147086c;
        this.sortOrder = Integer.valueOf(gVar.f147085b);
    }
}
