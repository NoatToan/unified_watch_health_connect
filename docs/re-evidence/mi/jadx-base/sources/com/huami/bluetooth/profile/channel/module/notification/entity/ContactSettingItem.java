package com.huami.bluetooth.profile.channel.module.notification.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u0000 $2\u00020\u0001:\u0001%B\u001f\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0019\u001a\u00020\t\u0012\u0006\u0010 \u001a\u00020\u0004¢\u0006\u0004\b!\u0010\"B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b!\u0010#J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0019\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0018R\"\u0010 \u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006&"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/entity/ContactSettingItem;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "", "writeToParcel", "describeContents", "", "toString", "hashCode", "", "other", "", "equals", DeviceTagInterface.CUSTOM_TAG_TYPE, "Ljava/lang/String;", "getPkg", "()Ljava/lang/String;", OneTrack.Param.PKG, "u", "getContact", "setContact", "(Ljava/lang/String;)V", "contact", "v", "I", "getVibration", "()I", "setVibration", "(I)V", "vibration", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "(Landroid/os/Parcel;)V", "CREATOR", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class ContactSettingItem implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: from kotlin metadata and from toString */
    @NotNull
    public final String pkg;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata and from toString */
    @NotNull
    public String contact;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata and from toString */
    public int vibration;

    /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.notification.entity.ContactSettingItem$a, reason: from kotlin metadata */
    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0005\u0010\t¨\u0006\f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/entity/ContactSettingItem$a;", "Landroid/os/Parcelable$Creator;", "Lcom/huami/bluetooth/profile/channel/module/notification/entity/ContactSettingItem;", "Landroid/os/Parcel;", "parcel", PluginDeviceInfo.FMODEL, "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/huami/bluetooth/profile/channel/module/notification/entity/ContactSettingItem;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion implements Parcelable.Creator<ContactSettingItem> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ContactSettingItem createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ContactSettingItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ContactSettingItem[] newArray(int size) {
            return new ContactSettingItem[size];
        }
    }

    public ContactSettingItem(@NotNull String pkg, @NotNull String contact, int i) {
        Intrinsics.checkNotNullParameter(pkg, "pkg");
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.pkg = pkg;
        this.contact = contact;
        this.vibration = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactSettingItem)) {
            return false;
        }
        ContactSettingItem contactSettingItem = (ContactSettingItem) other;
        return Intrinsics.areEqual(this.pkg, contactSettingItem.pkg) && Intrinsics.areEqual(this.contact, contactSettingItem.contact) && this.vibration == contactSettingItem.vibration;
    }

    public int hashCode() {
        return (((this.pkg.hashCode() * 31) + this.contact.hashCode()) * 31) + Integer.hashCode(this.vibration);
    }

    @NotNull
    public String toString() {
        return "ContactSettingItem(pkg=" + this.pkg + ", contact=" + this.contact + ", vibration=" + this.vibration + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.pkg);
        parcel.writeString(this.contact);
        parcel.writeInt(this.vibration);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ContactSettingItem(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string = parcel.readString();
        Intrinsics.checkNotNull(string);
        String string2 = parcel.readString();
        Intrinsics.checkNotNull(string2);
        this(string, string2, parcel.readInt());
    }
}
