package eq2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import dq2.c;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Leq2/b;", "Landroid/os/Parcelable;", "Lcom/google/gson/JsonObject;", "outbound", "Ldq2/c;", "inbound", "<init>", "(Lcom/google/gson/JsonObject;Ldq2/c;)V", "a", "Lcom/google/gson/JsonObject;", "b", "()Lcom/google/gson/JsonObject;", "Ldq2/c;", "getInbound", "()Ldq2/c;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("outbound")
    private final JsonObject outbound;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("inbound")
    private final c inbound;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b((JsonObject) parcel.readValue(b.class.getClassLoader()), c.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(JsonObject jsonObject, c cVar) {
        jsonObject.getClass();
        cVar.getClass();
        this.outbound = jsonObject;
        this.inbound = cVar;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final JsonObject getOutbound() {
        return this.outbound;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.outbound, bVar.outbound) && s.g(this.inbound, bVar.inbound);
    }

    public final int hashCode() {
        return this.inbound.hashCode() + (this.outbound.hashCode() * 31);
    }

    public final String toString() {
        return "A2WData(outbound=" + this.outbound + ", inbound=" + this.inbound + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeValue(this.outbound);
        this.inbound.writeToParcel(parcel, i14);
    }
}
