package com.huami.bluetooth.profile.channel.module.notification.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.xiaomi.hm.health.ui.smartplay.appnotify.ContactSettingItemActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u0000 (2\u00020\u0001:\u0001(B\u001f\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b%\u0010&B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b%\u0010'J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0011\u001a\u00020\tHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003R\u0019\u0010\r\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u000e\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a\"\u0004\b\u001d\u0010\u001eR\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006)"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/entity/ContactSettingItem;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", DataCacher.j, "", "writeToParcel", "describeContents", "", "component1", "component2", "component3", "pkg", ContactSettingItemActivity.KEY_CONTACT, ContactSettingItemActivity.KEY_VIBRATION, "copy", "toString", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getPkg", "()Ljava/lang/String;", "b", "getContact", "setContact", "(Ljava/lang/String;)V", "c", LogUtil.I, "getVibration", "()I", "setVibration", "(I)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "(Landroid/os/Parcel;)V", "CREATOR", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ContactSettingItem implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String pkg;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private String contact;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private int vibration;

    /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.notification.entity.ContactSettingItem$CREATOR, reason: from kotlin metadata */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/entity/ContactSettingItem$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/huami/bluetooth/profile/channel/module/notification/entity/ContactSettingItem;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/huami/bluetooth/profile/channel/module/notification/entity/ContactSettingItem;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion implements Parcelable.Creator<ContactSettingItem> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ContactSettingItem createFromParcel(@NotNull Parcel parcel) {
            return new ContactSettingItem(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ContactSettingItem[] newArray(int size) {
            return new ContactSettingItem[size];
        }
    }

    public ContactSettingItem(@NotNull String str, @NotNull String str2, int i) {
        this.pkg = str;
        this.contact = str2;
        this.vibration = i;
    }

    public static /* synthetic */ ContactSettingItem copy$default(ContactSettingItem contactSettingItem, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = contactSettingItem.pkg;
        }
        if ((i2 & 2) != 0) {
            str2 = contactSettingItem.contact;
        }
        if ((i2 & 4) != 0) {
            i = contactSettingItem.vibration;
        }
        return contactSettingItem.copy(str, str2, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPkg() {
        return this.pkg;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContact() {
        return this.contact;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getVibration() {
        return this.vibration;
    }

    @NotNull
    public final ContactSettingItem copy(@NotNull String pkg, @NotNull String contact, int vibration) {
        return new ContactSettingItem(pkg, contact, vibration);
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

    @NotNull
    public final String getContact() {
        return this.contact;
    }

    @NotNull
    public final String getPkg() {
        return this.pkg;
    }

    public final int getVibration() {
        return this.vibration;
    }

    public int hashCode() {
        return (((this.pkg.hashCode() * 31) + this.contact.hashCode()) * 31) + this.vibration;
    }

    public final void setContact(@NotNull String str) {
        this.contact = str;
    }

    public final void setVibration(int i) {
        this.vibration = i;
    }

    @NotNull
    public String toString() {
        return "ContactSettingItem(pkg=" + this.pkg + ", contact=" + this.contact + ", vibration=" + this.vibration + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.writeString(this.pkg);
        parcel.writeString(this.contact);
        parcel.writeInt(this.vibration);
    }

    public ContactSettingItem(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readInt());
    }
}
