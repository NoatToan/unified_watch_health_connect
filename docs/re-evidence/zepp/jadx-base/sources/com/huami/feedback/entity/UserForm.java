package com.huami.feedback.entity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.feedback.sync.api.device.DeviceType;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.xiaomi.hm.health.ui.smartplay.appnotify.ContactSettingItemActivity;
import defpackage.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Parcelize
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\bE\u0010FJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\t\u0010\u0011\u001a\u00020\u0010HÆ\u0003Jg\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\b\b\u0002\u0010\u0019\u001a\u00020\u0010HÆ\u0001J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\u0013\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010!\u001a\u00020\u0006HÖ\u0001J\u0019\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0006HÖ\u0001R\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u0013\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0014\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0015\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b7\u0010,\u001a\u0004\b8\u0010.R\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R!\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006@\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0019\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D¨\u0006G"}, d2 = {"Lcom/huami/feedback/entity/UserForm;", "Landroid/os/Parcelable;", "Lcom/huami/feedback/sync/api/device/DeviceType;", "component1", "", "component2", "", "component3", "Lcom/huami/feedback/entity/IssueItem;", "component4", "component5", "Lcom/huami/feedback/entity/Contact;", "component6", "", "Landroid/net/Uri;", "component7", "", "component8", "deviceType", "issueTitle", "issueID", "issueItem", "description", ContactSettingItemActivity.KEY_CONTACT, "images", "timeStamp", "copy", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", DataCacher.j, "", "writeToParcel", "a", "Lcom/huami/feedback/sync/api/device/DeviceType;", "getDeviceType", "()Lcom/huami/feedback/sync/api/device/DeviceType;", "b", "Ljava/lang/String;", "getIssueTitle", "()Ljava/lang/String;", "c", LogUtil.I, "getIssueID", "()I", GoogleApiAvailabilityLight.a, "Lcom/huami/feedback/entity/IssueItem;", "getIssueItem", "()Lcom/huami/feedback/entity/IssueItem;", "e", "getDescription", "f", "Lcom/huami/feedback/entity/Contact;", "getContact", "()Lcom/huami/feedback/entity/Contact;", "g", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "h", "J", "getTimeStamp", "()J", "<init>", "(Lcom/huami/feedback/sync/api/device/DeviceType;Ljava/lang/String;ILcom/huami/feedback/entity/IssueItem;Ljava/lang/String;Lcom/huami/feedback/entity/Contact;Ljava/util/List;J)V", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class UserForm implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UserForm> CREATOR = new Creator();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final DeviceType deviceType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String issueTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int issueID;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final IssueItem issueItem;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final String description;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final Contact contact;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private final List<Uri> images;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private final long timeStamp;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class Creator implements Parcelable.Creator<UserForm> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final UserForm createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList = null;
            DeviceType deviceTypeValueOf = parcel.readInt() == 0 ? null : DeviceType.valueOf(parcel.readString());
            String string = parcel.readString();
            int i = parcel.readInt();
            IssueItem issueItemCreateFromParcel = IssueItem.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            Contact contactCreateFromParcel = parcel.readInt() == 0 ? null : Contact.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i2 = parcel.readInt();
                arrayList = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList.add(parcel.readParcelable(UserForm.class.getClassLoader()));
                }
            }
            return new UserForm(deviceTypeValueOf, string, i, issueItemCreateFromParcel, string2, contactCreateFromParcel, arrayList, parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final UserForm[] newArray(int i) {
            return new UserForm[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserForm(@Nullable DeviceType deviceType, @NotNull String str, int i, @NotNull IssueItem issueItem, @Nullable String str2, @Nullable Contact contact, @Nullable List<? extends Uri> list, long j) {
        this.deviceType = deviceType;
        this.issueTitle = str;
        this.issueID = i;
        this.issueItem = issueItem;
        this.description = str2;
        this.contact = contact;
        this.images = list;
        this.timeStamp = j;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DeviceType getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIssueTitle() {
        return this.issueTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getIssueID() {
        return this.issueID;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final IssueItem getIssueItem() {
        return this.issueItem;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Contact getContact() {
        return this.contact;
    }

    @Nullable
    public final List<Uri> component7() {
        return this.images;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    @NotNull
    public final UserForm copy(@Nullable DeviceType deviceType, @NotNull String issueTitle, int issueID, @NotNull IssueItem issueItem, @Nullable String description, @Nullable Contact contact, @Nullable List<? extends Uri> images, long timeStamp) {
        return new UserForm(deviceType, issueTitle, issueID, issueItem, description, contact, images, timeStamp);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserForm)) {
            return false;
        }
        UserForm userForm = (UserForm) other;
        return this.deviceType == userForm.deviceType && Intrinsics.areEqual(this.issueTitle, userForm.issueTitle) && this.issueID == userForm.issueID && Intrinsics.areEqual(this.issueItem, userForm.issueItem) && Intrinsics.areEqual(this.description, userForm.description) && Intrinsics.areEqual(this.contact, userForm.contact) && Intrinsics.areEqual(this.images, userForm.images) && this.timeStamp == userForm.timeStamp;
    }

    @Nullable
    public final Contact getContact() {
        return this.contact;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final DeviceType getDeviceType() {
        return this.deviceType;
    }

    @Nullable
    public final List<Uri> getImages() {
        return this.images;
    }

    public final int getIssueID() {
        return this.issueID;
    }

    @NotNull
    public final IssueItem getIssueItem() {
        return this.issueItem;
    }

    @NotNull
    public final String getIssueTitle() {
        return this.issueTitle;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        DeviceType deviceType = this.deviceType;
        int iHashCode = (((((((deviceType == null ? 0 : deviceType.hashCode()) * 31) + this.issueTitle.hashCode()) * 31) + this.issueID) * 31) + this.issueItem.hashCode()) * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Contact contact = this.contact;
        int iHashCode3 = (iHashCode2 + (contact == null ? 0 : contact.hashCode())) * 31;
        List<Uri> list = this.images;
        return ((iHashCode3 + (list != null ? list.hashCode() : 0)) * 31) + b.a(this.timeStamp);
    }

    @NotNull
    public String toString() {
        return "UserForm(deviceType=" + this.deviceType + ", issueTitle=" + this.issueTitle + ", issueID=" + this.issueID + ", issueItem=" + this.issueItem + ", description=" + ((Object) this.description) + ", contact=" + this.contact + ", images=" + this.images + ", timeStamp=" + this.timeStamp + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        DeviceType deviceType = this.deviceType;
        if (deviceType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(deviceType.name());
        }
        parcel.writeString(this.issueTitle);
        parcel.writeInt(this.issueID);
        this.issueItem.writeToParcel(parcel, flags);
        parcel.writeString(this.description);
        Contact contact = this.contact;
        if (contact == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            contact.writeToParcel(parcel, flags);
        }
        List<Uri> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Uri> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable(it2.next(), flags);
            }
        }
        parcel.writeLong(this.timeStamp);
    }

    public /* synthetic */ UserForm(DeviceType deviceType, String str, int i, IssueItem issueItem, String str2, Contact contact, List list, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(deviceType, str, i, issueItem, str2, contact, list, (i2 & 128) != 0 ? 0L : j);
    }
}
