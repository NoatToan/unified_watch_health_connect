package to;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import j20.x;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010&\u001a\u0004\b+\u0010(\"\u0004\b,\u0010*R\"\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010&\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*¨\u0006/"}, d2 = {"Lto/o;", "Landroid/os/Parcelable;", "", "typeId", "", "typeKey", "parentTypeId", "sortOrder", "", "isHidden", "restricted", "trimmable", "<init>", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZZZ)V", "Lorg/json/JSONObject;", "json", "(Lorg/json/JSONObject;)V", "a", "I", IntegerTokenConverter.CONVERTER_KEY, "()I", "setTypeId", "(I)V", "b", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "setTypeKey", "(Ljava/lang/String;)V", "c", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "setParentTypeId", "(Ljava/lang/Integer;)V", "g", "setSortOrder", JWKParameterNames.RSA_EXPONENT, "Z", JWKParameterNames.OCT_KEY_VALUE, "()Z", "setHidden", "(Z)V", "f", "setRestricted", "h", "setTrimmable", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("typeId")
    private int typeId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("typeKey")
    private String typeKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("parentTypeId")
    private Integer parentTypeId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sortOrder")
    private Integer sortOrder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isHidden")
    private boolean isHidden;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("restricted")
    private boolean restricted;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trimmable")
    private boolean trimmable;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<o> {
        @Override // android.os.Parcelable.Creator
        public final o createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            String string = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            boolean z14 = false;
            boolean z15 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z14 = true;
            }
            return new o(i14, string, numValueOf, numValueOf2, z15, z14, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final o[] newArray(int i14) {
            return new o[i14];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o(JSONObject jSONObject) {
        jSONObject.getClass();
        int iOptInt = jSONObject.optInt("typeId", -1);
        String strOptString = jSONObject.optString("typeKey", "other");
        strOptString.getClass();
        this(iOptInt, strOptString, Integer.valueOf(jSONObject.optInt("parentTypeId")), Integer.valueOf(jSONObject.optInt("sortOrder")), jSONObject.optBoolean("isHidden"), jSONObject.optBoolean("restricted"), jSONObject.optBoolean("trimmable"));
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getTypeKey() {
        return this.typeKey;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getParentTypeId() {
        return this.parentTypeId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.typeId == oVar.typeId && s.g(this.typeKey, oVar.typeKey) && s.g(this.parentTypeId, oVar.parentTypeId) && s.g(this.sortOrder, oVar.sortOrder) && this.isHidden == oVar.isHidden && this.restricted == oVar.restricted && this.trimmable == oVar.trimmable;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getRestricted() {
        return this.restricted;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getSortOrder() {
        return this.sortOrder;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getTrimmable() {
        return this.trimmable;
    }

    public final int hashCode() {
        int iJ = wr.g.j(Integer.hashCode(this.typeId) * 31, 31, this.typeKey);
        Integer num = this.parentTypeId;
        int iHashCode = (iJ + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.sortOrder;
        return Boolean.hashCode(this.trimmable) + q6.f.g(q6.f.g((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.isHidden), 31, this.restricted);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getTypeId() {
        return this.typeId;
    }

    public final String j() {
        return this.typeKey;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsHidden() {
        return this.isHidden;
    }

    public final JSONObject m() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("typeId", this.typeId);
        jSONObject.put("typeKey", this.typeKey);
        jSONObject.put("parentTypeId", this.parentTypeId);
        jSONObject.put("sortOrder", this.sortOrder);
        jSONObject.put("isHidden", this.isHidden);
        jSONObject.put("restricted", this.restricted);
        jSONObject.put("trimmable", this.trimmable);
        return jSONObject;
    }

    public final String toString() {
        int i14 = this.typeId;
        String str = this.typeKey;
        Integer num = this.parentTypeId;
        Integer num2 = this.sortOrder;
        boolean z14 = this.isHidden;
        boolean z15 = this.restricted;
        boolean z16 = this.trimmable;
        StringBuilder sbR = wr.g.r(i14, "TypeDTO(typeId=", ", typeKey=", str, ", parentTypeId=");
        x.m(sbR, num, ", sortOrder=", num2, ", isHidden=");
        kg.f.q(", restricted=", ", trimmable=", sbR, z14, z15);
        return hb.a.k(sbR, z16, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.typeId);
        parcel.writeString(this.typeKey);
        Integer num = this.parentTypeId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.sortOrder;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        parcel.writeInt(this.isHidden ? 1 : 0);
        parcel.writeInt(this.restricted ? 1 : 0);
        parcel.writeInt(this.trimmable ? 1 : 0);
    }

    public /* synthetic */ o(int i14, String str, Integer num, Integer num2, boolean z14, boolean z15, boolean z16, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? -1 : i14, (i15 & 2) != 0 ? "other" : str, num, num2, (i15 & 16) != 0 ? false : z14, (i15 & 32) != 0 ? false : z15, (i15 & 64) != 0 ? false : z16);
    }

    public o(int i14, String str, Integer num, Integer num2, boolean z14, boolean z15, boolean z16) {
        str.getClass();
        this.typeId = i14;
        this.typeKey = str;
        this.parentTypeId = num;
        this.sortOrder = num2;
        this.isHidden = z14;
        this.restricted = z15;
        this.trimmable = z16;
    }
}
