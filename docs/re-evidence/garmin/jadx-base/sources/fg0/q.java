package fg0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR$\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0010\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014R$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0016\u001a\u0004\b(\u0010\u0018\"\u0004\b)\u0010\u001aR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00060"}, d2 = {"Lfg0/q;", "Landroid/os/Parcelable;", "", "deviceId", "", "messageType", "fileType", "messageName", "groupName", "metaDataId", "messageUrl", "", "priority", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;)V", "a", "Ljava/lang/Long;", "getDeviceId", "()Ljava/lang/Long;", "setDeviceId", "(Ljava/lang/Long;)V", "b", "Ljava/lang/String;", "getMessageType", "()Ljava/lang/String;", "setMessageType", "(Ljava/lang/String;)V", "c", "getFileType", "setFileType", "d", "getMessageName", "setMessageName", JWKParameterNames.RSA_EXPONENT, "getGroupName", "setGroupName", "f", "getMetaDataId", "setMetaDataId", "g", "getMessageUrl", "setMessageUrl", "h", "Ljava/lang/Integer;", "getPriority", "()Ljava/lang/Integer;", "setPriority", "(Ljava/lang/Integer;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q implements Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceId")
    private Long deviceId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("messageType")
    private String messageType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fileType")
    private String fileType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("messageName")
    private String messageName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("groupName")
    private String groupName;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("metaDataId")
    private Long metaDataId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("messageUrl")
    private String messageUrl;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("priority")
    private Integer priority;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<q> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final q createFromParcel(Parcel parcel) {
            Long lValueOf;
            Long l14;
            String str;
            Integer numValueOf;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                lValueOf = null;
                l14 = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
                l14 = null;
            }
            String string = parcel.readString();
            Long l15 = l14;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Long lValueOf2 = parcel.readInt() == 0 ? l15 : Long.valueOf(parcel.readLong());
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = l15;
                str = string5;
            } else {
                str = string5;
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new q(lValueOf, string, string2, string3, string4, lValueOf2, str, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final q[] newArray(int i14) {
            return new q[i14];
        }
    }

    public /* synthetic */ q(Long l14, String str, String str2, String str3, String str4, Long l15, String str5, Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : str4, (i14 & 32) != 0 ? null : l15, (i14 & 64) != 0 ? null : str5, (i14 & 128) != 0 ? null : num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return p005kotlin.jvm.internal.s.g(this.deviceId, qVar.deviceId) && p005kotlin.jvm.internal.s.g(this.messageType, qVar.messageType) && p005kotlin.jvm.internal.s.g(this.fileType, qVar.fileType) && p005kotlin.jvm.internal.s.g(this.messageName, qVar.messageName) && p005kotlin.jvm.internal.s.g(this.groupName, qVar.groupName) && p005kotlin.jvm.internal.s.g(this.metaDataId, qVar.metaDataId) && p005kotlin.jvm.internal.s.g(this.messageUrl, qVar.messageUrl) && p005kotlin.jvm.internal.s.g(this.priority, qVar.priority);
    }

    public final int hashCode() {
        Long l14 = this.deviceId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.messageType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fileType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.messageName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.groupName;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l15 = this.metaDataId;
        int iHashCode6 = (iHashCode5 + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str5 = this.messageUrl;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.priority;
        return iHashCode7 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        Long l14 = this.deviceId;
        String str = this.messageType;
        String str2 = this.fileType;
        String str3 = this.messageName;
        String str4 = this.groupName;
        Long l15 = this.metaDataId;
        String str5 = this.messageUrl;
        Integer num = this.priority;
        StringBuilder sbJ = b71.i.j("EventSendToDeviceDTO(deviceId=", ", messageType=", str, l14, ", fileType=");
        sn.a.t(sbJ, str2, ", messageName=", str3, ", groupName=");
        n23.j.q(l15, str4, ", metaDataId=", ", messageUrl=", sbJ);
        sbJ.append(str5);
        sbJ.append(", priority=");
        sbJ.append(num);
        sbJ.append(")");
        return sbJ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.deviceId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.messageType);
        parcel.writeString(this.fileType);
        parcel.writeString(this.messageName);
        parcel.writeString(this.groupName);
        Long l15 = this.metaDataId;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        parcel.writeString(this.messageUrl);
        Integer num = this.priority;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
    }

    public q(Long l14, String str, String str2, String str3, String str4, Long l15, String str5, Integer num) {
        this.deviceId = l14;
        this.messageType = str;
        this.fileType = str2;
        this.messageName = str3;
        this.groupName = str4;
        this.metaDataId = l15;
        this.messageUrl = str5;
        this.priority = num;
    }

    public q() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
