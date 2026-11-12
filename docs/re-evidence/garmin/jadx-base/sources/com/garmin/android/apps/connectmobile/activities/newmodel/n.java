package com.garmin.android.apps.connectmobile.activities.newmodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010\u0016R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0010\u001a\u0004\b$\u0010\u0012¨\u0006%"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/newmodel/n;", "Landroid/os/Parcelable;", "", "deviceId", "", "messageUrl", "messageType", "messageName", "groupName", "", "priority", "fileType", "metaDataId", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;J)V", "a", "J", "getDeviceId", "()J", "b", "Ljava/lang/String;", "getMessageUrl", "()Ljava/lang/String;", "c", "getMessageType", "d", "getMessageName", JWKParameterNames.RSA_EXPONENT, "getGroupName", "f", "I", "getPriority", "()I", "g", "getFileType", "h", "getMetaDataId", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceId")
    private final long deviceId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("messageUrl")
    private final String messageUrl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("messageType")
    private final String messageType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("messageName")
    private final String messageName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("groupName")
    private final String groupName;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("priority")
    private final int priority;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fileType")
    private final String fileType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("metaDataId")
    private final long metaDataId;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<n> {
        @Override // android.os.Parcelable.Creator
        public final n createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new n(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final n[] newArray(int i14) {
            return new n[i14];
        }
    }

    public /* synthetic */ n(long j8, String str, String str2, String str3, String str4, int i14, String str5, long j14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(j8, str, (i15 & 4) != 0 ? "courses" : str2, str3, (i15 & 16) != 0 ? null : str4, (i15 & 32) != 0 ? 0 : i14, (i15 & 64) != 0 ? "FIT" : str5, j14);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.deviceId == nVar.deviceId && p005kotlin.jvm.internal.s.g(this.messageUrl, nVar.messageUrl) && p005kotlin.jvm.internal.s.g(this.messageType, nVar.messageType) && p005kotlin.jvm.internal.s.g(this.messageName, nVar.messageName) && p005kotlin.jvm.internal.s.g(this.groupName, nVar.groupName) && this.priority == nVar.priority && p005kotlin.jvm.internal.s.g(this.fileType, nVar.fileType) && this.metaDataId == nVar.metaDataId;
    }

    public final int hashCode() {
        int iJ = wr.g.j(wr.g.j(Long.hashCode(this.deviceId) * 31, 31, this.messageUrl), 31, this.messageType);
        String str = this.messageName;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.groupName;
        return Long.hashCode(this.metaDataId) + wr.g.j(q2.d(this.priority, (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31, this.fileType);
    }

    public final String toString() {
        long j8 = this.deviceId;
        String str = this.messageUrl;
        String str2 = this.messageType;
        String str3 = this.messageName;
        String str4 = this.groupName;
        int i14 = this.priority;
        String str5 = this.fileType;
        long j14 = this.metaDataId;
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j8, "CourseMessageDTO(deviceId=", ", messageUrl=", str);
        sn.a.t(sbK, ", messageType=", str2, ", messageName=", str3);
        sbK.append(", groupName=");
        sbK.append(str4);
        sbK.append(", priority=");
        sbK.append(i14);
        am.j.y(sbK, ", fileType=", str5, ", metaDataId=");
        return am.j.i(j14, ")", sbK);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.deviceId);
        parcel.writeString(this.messageUrl);
        parcel.writeString(this.messageType);
        parcel.writeString(this.messageName);
        parcel.writeString(this.groupName);
        parcel.writeInt(this.priority);
        parcel.writeString(this.fileType);
        parcel.writeLong(this.metaDataId);
    }

    public n(long j8, String str, String str2, String str3, String str4, int i14, String str5, long j14) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str5);
        this.deviceId = j8;
        this.messageUrl = str;
        this.messageType = str2;
        this.messageName = str3;
        this.groupName = str4;
        this.priority = i14;
        this.fileType = str5;
        this.metaDataId = j14;
    }
}
