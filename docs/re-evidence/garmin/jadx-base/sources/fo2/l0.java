package fo2;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.feature.garminpay.providers.gpay.model.Links;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import lc.u0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u001e\u0010\u001a\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u0017j\u0004\u0018\u0001`\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010$R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010$R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010-\u001a\u0004\b.\u0010/R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010-\u001a\u0004\b0\u0010/R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u0015\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u00106\u001a\u0004\b=\u00108R\u001a\u0010\u0016\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u00109\u001a\u0004\b?\u0010;R2\u0010\u001a\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u0017j\u0004\u0018\u0001`\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b1\u0010BR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010#\u001a\u0004\b5\u0010$¨\u0006D"}, d2 = {"Lfo2/l0;", "Landroid/os/Parcelable;", "Lcom/garmin/feature/garminpay/providers/gpay/model/Links;", "links", "", "credentialId", "userId", "deviceId", "Lfo2/e;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "Lfo2/y;", "usages", "Lep2/a;", "capabilities", "Lcom/google/gson/JsonElement;", "encryptedData", "Lorg/joda/time/DateTime;", "createdTs", "", "createdTsEpoch", "lastModifiedTs", "lastModifiedTsEpoch", "Lfo2/i0;", "Lfo2/d;", "Lcom/garmin/feature/garminpay/providers/gpay/model/RawTransitCard;", "rawTransitCard", "reason", "<init>", "(Lcom/garmin/feature/garminpay/providers/gpay/model/Links;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfo2/e;Ljava/util/List;Ljava/util/List;Lcom/google/gson/JsonElement;Lorg/joda/time/DateTime;JLorg/joda/time/DateTime;JLfo2/i0;Ljava/lang/String;)V", "a", "Lcom/garmin/feature/garminpay/providers/gpay/model/Links;", "g", "()Lcom/garmin/feature/garminpay/providers/gpay/model/Links;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "getUserId", "d", "f", JWKParameterNames.RSA_EXPONENT, "Lfo2/e;", "j", "()Lfo2/e;", "Ljava/util/List;", "getUsages", "()Ljava/util/List;", "getCapabilities", "h", "Lcom/google/gson/JsonElement;", "getEncryptedData", "()Lcom/google/gson/JsonElement;", IntegerTokenConverter.CONVERTER_KEY, "Lorg/joda/time/DateTime;", "getCreatedTs", "()Lorg/joda/time/DateTime;", "J", "getCreatedTsEpoch", "()J", JWKParameterNames.OCT_KEY_VALUE, "getLastModifiedTs", "l", "getLastModifiedTsEpoch", "m", "Lfo2/i0;", "()Lfo2/i0;", JWKParameterNames.RSA_MODULUS, "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l0 implements Parcelable {
    public static final Parcelable.Creator<l0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("_links")
    private final Links links;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("credentialId")
    private final String credentialId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userId")
    private final String userId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceId")
    private final String deviceId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName(RemoteConfigConstants.ResponseFieldKey.STATE)
    private final e state;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("usages")
    private final List<y> usages;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("capabilities")
    private final List<ep2.a> capabilities;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("encryptedData")
    private final JsonElement encryptedData;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("createdTs")
    private final DateTime createdTs;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("createdTsEpoch")
    private final long createdTsEpoch;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastModifiedTs")
    private final DateTime lastModifiedTs;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastModifiedTsEpoch")
    private final long lastModifiedTsEpoch;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("transitCard")
    private final i0<String, d> rawTransitCard;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("reason")
    private final String reason;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<l0> {
        @Override // android.os.Parcelable.Creator
        public final l0 createFromParcel(Parcel parcel) {
            Parcel parcel2;
            i0<?, ?> i0VarCreateFromParcel;
            parcel.getClass();
            Links links = (Links) parcel.readSerializable();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            e eVarValueOf = e.valueOf(parcel.readString());
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
            wr2.l.f186865a.getClass();
            JsonElement jsonTree = ((Gson) wr2.l.f186866b.getValue()).toJsonTree(parcel.readString());
            jsonTree.getClass();
            DateTime dateTime = (DateTime) parcel.readSerializable();
            long j8 = parcel.readLong();
            DateTime dateTime2 = (DateTime) parcel.readSerializable();
            long j14 = parcel.readLong();
            if (parcel.readInt() == 0) {
                i0VarCreateFromParcel = null;
                parcel2 = parcel;
            } else {
                parcel2 = parcel;
                i0VarCreateFromParcel = i0.CREATOR.createFromParcel(parcel2);
            }
            return new l0(links, string, string2, string3, eVarValueOf, arrayList, arrayList2, jsonTree, dateTime, j8, dateTime2, j14, i0VarCreateFromParcel, parcel2.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final l0[] newArray(int i14) {
            return new l0[i14];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l0(Links links, String str, String str2, String str3, e eVar, List<? extends y> list, List<? extends ep2.a> list2, JsonElement jsonElement, DateTime dateTime, long j8, DateTime dateTime2, long j14, i0<String, d> i0Var, String str4) {
        links.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        eVar.getClass();
        list.getClass();
        list2.getClass();
        jsonElement.getClass();
        dateTime.getClass();
        dateTime2.getClass();
        this.links = links;
        this.credentialId = str;
        this.userId = str2;
        this.deviceId = str3;
        this.state = eVar;
        this.usages = list;
        this.capabilities = list2;
        this.encryptedData = jsonElement;
        this.createdTs = dateTime;
        this.createdTsEpoch = j8;
        this.lastModifiedTs = dateTime2;
        this.lastModifiedTsEpoch = j14;
        this.rawTransitCard = i0Var;
        this.reason = str4;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCredentialId() {
        return this.credentialId;
    }

    public final byte[] d() {
        UUID uuidFromString = UUID.fromString(this.credentialId);
        uuidFromString.getClass();
        return w02.b0.A(uuidFromString);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return p005kotlin.jvm.internal.s.g(this.links, l0Var.links) && p005kotlin.jvm.internal.s.g(this.credentialId, l0Var.credentialId) && p005kotlin.jvm.internal.s.g(this.userId, l0Var.userId) && p005kotlin.jvm.internal.s.g(this.deviceId, l0Var.deviceId) && this.state == l0Var.state && p005kotlin.jvm.internal.s.g(this.usages, l0Var.usages) && p005kotlin.jvm.internal.s.g(this.capabilities, l0Var.capabilities) && p005kotlin.jvm.internal.s.g(this.encryptedData, l0Var.encryptedData) && p005kotlin.jvm.internal.s.g(this.createdTs, l0Var.createdTs) && this.createdTsEpoch == l0Var.createdTsEpoch && p005kotlin.jvm.internal.s.g(this.lastModifiedTs, l0Var.lastModifiedTs) && this.lastModifiedTsEpoch == l0Var.lastModifiedTsEpoch && p005kotlin.jvm.internal.s.g(this.rawTransitCard, l0Var.rawTransitCard) && p005kotlin.jvm.internal.s.g(this.reason, l0Var.reason);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Links getLinks() {
        return this.links;
    }

    public final i0<String, d> h() {
        return this.rawTransitCard;
    }

    public final int hashCode() {
        int iE = q6.f.e(ds.e0.a(q6.f.e(ds.e0.a((this.encryptedData.hashCode() + u0.b(u0.b((this.state.hashCode() + wr.g.j(wr.g.j(wr.g.j(this.links.f51142a.hashCode() * 31, 31, this.credentialId), 31, this.userId), 31, this.deviceId)) * 31, 31, this.usages), 31, this.capabilities)) * 31, this.createdTs, 31), 31, this.createdTsEpoch), this.lastModifiedTs, 31), 31, this.lastModifiedTsEpoch);
        i0<String, d> i0Var = this.rawTransitCard;
        int iHashCode = (iE + (i0Var == null ? 0 : i0Var.hashCode())) * 31;
        String str = this.reason;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final e getState() {
        return this.state;
    }

    public final i0<String, d> k() {
        i0<String, d> i0Var = this.rawTransitCard;
        if (i0Var == null) {
            o2.c.m("Transit card is required");
            return null;
        }
        String strH = i0Var.h();
        if (strH == null) {
            o2.c.m("Transit cards require card type");
            return null;
        }
        d dVarG = i0Var.g();
        if (dVarG != null) {
            return new i0<>(i0Var.getLinks(), i0Var.getTransitCardId(), i0Var.getProductId(), strH, i0Var.getProductName(), i0Var.getCom.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.STATE java.lang.String(), i0Var.getProviderName(), i0Var.getCredentialId(), i0Var.getUserId(), i0Var.getExtCardReference(), i0Var.getCreatedTsEpoch(), i0Var.getCreatedTs(), i0Var.getLastModifiedTsEpoch(), i0Var.getLastModifiedTs(), i0Var.getBalance(), i0Var.getAgeBeforeDeletableDays(), i0Var.getAbleToDelete(), dVarG);
        }
        o2.c.m("Transit cards require card metadata");
        return null;
    }

    public final String toString() {
        Links links = this.links;
        String str = this.credentialId;
        String str2 = this.userId;
        String str3 = this.deviceId;
        e eVar = this.state;
        List<y> list = this.usages;
        List<ep2.a> list2 = this.capabilities;
        JsonElement jsonElement = this.encryptedData;
        DateTime dateTime = this.createdTs;
        long j8 = this.createdTsEpoch;
        DateTime dateTime2 = this.lastModifiedTs;
        long j14 = this.lastModifiedTsEpoch;
        i0<String, d> i0Var = this.rawTransitCard;
        String str4 = this.reason;
        StringBuilder sb3 = new StringBuilder("UserCredential(links=");
        sb3.append(links);
        sb3.append(", credentialId=");
        sb3.append(str);
        sb3.append(", userId=");
        sn.a.t(sb3, str2, ", deviceId=", str3, ", state=");
        sb3.append(eVar);
        sb3.append(", usages=");
        sb3.append(list);
        sb3.append(", capabilities=");
        sb3.append(list2);
        sb3.append(", encryptedData=");
        sb3.append(jsonElement);
        sb3.append(", createdTs=");
        sb3.append(dateTime);
        sb3.append(", createdTsEpoch=");
        sb3.append(j8);
        sb3.append(", lastModifiedTs=");
        sb3.append(dateTime2);
        sb3.append(", lastModifiedTsEpoch=");
        sb3.append(j14);
        sb3.append(", rawTransitCard=");
        sb3.append(i0Var);
        return v.e0.h(sb3, ", reason=", str4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeSerializable(this.links);
        parcel.writeString(this.credentialId);
        parcel.writeString(this.userId);
        parcel.writeString(this.deviceId);
        parcel.writeString(this.state.name());
        Iterator itE = kg.f.e(this.usages, parcel);
        while (itE.hasNext()) {
            parcel.writeString(((y) itE.next()).name());
        }
        Iterator itE2 = kg.f.e(this.capabilities, parcel);
        while (itE2.hasNext()) {
            parcel.writeString(((ep2.a) itE2.next()).name());
        }
        wr2.l lVar = wr2.l.f186865a;
        JsonElement jsonElement = this.encryptedData;
        lVar.getClass();
        jsonElement.getClass();
        parcel.writeString(((Gson) wr2.l.f186866b.getValue()).toJson(jsonElement));
        parcel.writeSerializable(this.createdTs);
        parcel.writeLong(this.createdTsEpoch);
        parcel.writeSerializable(this.lastModifiedTs);
        parcel.writeLong(this.lastModifiedTsEpoch);
        i0<String, d> i0Var = this.rawTransitCard;
        if (i0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            i0Var.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.reason);
    }
}
