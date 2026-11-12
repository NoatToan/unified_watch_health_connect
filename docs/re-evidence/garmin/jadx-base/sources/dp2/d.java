package dp2;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.gncs.NotificationConstants;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import ep2.l;
import fo2.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg.f;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u0011¨\u0006\u001e"}, d2 = {"Ldp2/d;", "Landroid/os/Parcelable;", "", "clientId", "Lep2/l;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "Lfo2/y;", "usages", "Lep2/a;", "capabilities", "encryptedData", "<init>", "(Ljava/lang/String;Lep2/l;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getClientId", "()Ljava/lang/String;", "b", "Lep2/l;", "getType", "()Lep2/l;", "c", "Ljava/util/List;", "getUsages", "()Ljava/util/List;", "d", "getCapabilities", JWKParameterNames.RSA_EXPONENT, "getEncryptedData", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("clientId")
    private final String clientId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName(NotificationConstants.KEY_DATA_MIME_TYPE)
    private final l type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("usages")
    private final List<y> usages;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("capabilities")
    private final List<ep2.a> capabilities;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("encryptedData")
    private final String encryptedData;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            l lVarValueOf = l.valueOf(parcel.readString());
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                arrayList.add(y.valueOf(parcel.readString()));
            }
            int i16 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i16);
            for (int i17 = 0; i17 != i16; i17++) {
                arrayList2.add(ep2.a.valueOf(parcel.readString()));
            }
            return new d(string, lVarValueOf, arrayList, arrayList2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(String str, l lVar, List<? extends y> list, List<? extends ep2.a> list2, String str2) {
        str.getClass();
        lVar.getClass();
        list.getClass();
        list2.getClass();
        str2.getClass();
        this.clientId = str;
        this.type = lVar;
        this.usages = list;
        this.capabilities = list2;
        this.encryptedData = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.clientId);
        parcel.writeString(this.type.name());
        Iterator itE = f.e(this.usages, parcel);
        while (itE.hasNext()) {
            parcel.writeString(((y) itE.next()).name());
        }
        Iterator itE2 = f.e(this.capabilities, parcel);
        while (itE2.hasNext()) {
            parcel.writeString(((ep2.a) itE2.next()).name());
        }
        parcel.writeString(this.encryptedData);
    }
}
