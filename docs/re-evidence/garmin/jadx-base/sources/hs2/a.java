package hs2;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u0015\u0010\u001eR\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u001eR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010$\u001a\u0004\b%\u0010&R \u0010-\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b(\u0010*¨\u0006."}, d2 = {"Lhs2/a;", "Landroid/os/Parcelable;", "", "unitId", "", "macAddress", "displayName", "", "firmwareVersion", "productNumber", "Lis2/a;", "nfcInfo", "", "Lis2/b;", "supportedProviderTypes", "<init>", "(JLjava/lang/String;Ljava/lang/String;IILis2/a;Ljava/util/Set;)V", "a", "J", "getUnitId", "()J", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "j", "(Ljava/lang/String;)V", "c", "getDisplayName", "I", "()I", JWKParameterNames.RSA_EXPONENT, "g", "f", "Lis2/a;", "()Lis2/a;", "Ljava/util/Set;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/util/Set;", "", "h", "Z", "()Z", "getRequiresPasscode$annotations", "()V", "requiresPasscode", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1698a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("unitId")
    private final long unitId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("macAddress")
    private String macAddress;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayName")
    private final String displayName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("firmwareVersion")
    private final int firmwareVersion;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("productNumber")
    private final int productNumber;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("nfcInfo")
    private final is2.a nfcInfo;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("supportedProviderTypes")
    private final Set<is2.b> supportedProviderTypes;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Expose(deserialize = false, serialize = false)
    private final boolean requiresPasscode;

    /* JADX INFO: renamed from: hs2.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1698a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            long j8 = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i14 = parcel.readInt();
            int i15 = parcel.readInt();
            is2.a aVarCreateFromParcel = is2.a.CREATOR.createFromParcel(parcel);
            int i16 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i16);
            for (int i17 = 0; i17 != i16; i17++) {
                linkedHashSet.add(is2.b.valueOf(parcel.readString()));
            }
            return new a(j8, string, string2, i14, i15, aVarCreateFromParcel, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(long j8, String str, String str2, int i14, int i15, is2.a aVar, Set<? extends is2.b> set) {
        boolean z14;
        str.getClass();
        str2.getClass();
        aVar.getClass();
        set.getClass();
        this.unitId = j8;
        this.macAddress = str;
        this.displayName = str2;
        this.firmwareVersion = i14;
        this.productNumber = i15;
        this.nfcInfo = aVar;
        this.supportedProviderTypes = set;
        if (aVar.b().contains(pl2.c.f138564k)) {
            Set<pl2.c> setB = aVar.b();
            if (!(setB instanceof Collection) || !setB.isEmpty()) {
                Iterator<T> it = setB.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (s.g(((pl2.c) it.next()).f138575b, Boolean.TRUE)) {
                            z14 = true;
                        }
                    }
                }
            }
            z14 = false;
        } else {
            z14 = true;
        }
        this.requiresPasscode = z14;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getFirmwareVersion() {
        return this.firmwareVersion;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getMacAddress() {
        return this.macAddress;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.unitId == aVar.unitId && s.g(this.macAddress, aVar.macAddress) && s.g(this.displayName, aVar.displayName) && this.firmwareVersion == aVar.firmwareVersion && this.productNumber == aVar.productNumber && s.g(this.nfcInfo, aVar.nfcInfo) && s.g(this.supportedProviderTypes, aVar.supportedProviderTypes);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final is2.a getNfcInfo() {
        return this.nfcInfo;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getProductNumber() {
        return this.productNumber;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final long getUnitId() {
        return this.unitId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getRequiresPasscode() {
        return this.requiresPasscode;
    }

    public final int hashCode() {
        return this.supportedProviderTypes.hashCode() + ((this.nfcInfo.hashCode() + q2.d(this.productNumber, q2.d(this.firmwareVersion, wr.g.j(wr.g.j(Long.hashCode(this.unitId) * 31, 31, this.macAddress), 31, this.displayName), 31), 31)) * 31);
    }

    public final Set<is2.b> i() {
        return this.supportedProviderTypes;
    }

    public final void j(String str) {
        str.getClass();
        this.macAddress = str;
    }

    public final String toString() {
        long j8 = this.unitId;
        String str = this.macAddress;
        String str2 = this.displayName;
        int i14 = this.firmwareVersion;
        int i15 = this.productNumber;
        boolean z14 = this.requiresPasscode;
        is2.a aVar = this.nfcInfo;
        StringBuilder sb3 = new StringBuilder();
        for (is2.b bVar : this.supportedProviderTypes) {
            sb3.append(StringUtils.SPACE);
            sb3.append(bVar.name());
        }
        String string = sb3.toString();
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j8, "DeviceWalletMetadata(unitId=", ", macAddress='", str);
        sbK.append("', displayName='");
        sbK.append(str2);
        sbK.append("', firmwareVersion=");
        sbK.append(i14);
        sbK.append(", productNumber=");
        sbK.append(i15);
        sbK.append(", requiresPasscode=");
        sbK.append(z14);
        sbK.append("), nfcInfo=");
        sbK.append(aVar);
        sbK.append(", supportedProviderTypes=");
        sbK.append(string);
        sbK.append(")");
        return sbK.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.unitId);
        parcel.writeString(this.macAddress);
        parcel.writeString(this.displayName);
        parcel.writeInt(this.firmwareVersion);
        parcel.writeInt(this.productNumber);
        this.nfcInfo.writeToParcel(parcel, i14);
        Set<is2.b> set = this.supportedProviderTypes;
        parcel.writeInt(set.size());
        Iterator<is2.b> it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next().name());
        }
    }
}
