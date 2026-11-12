package com.huami.contacts.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010 B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010!J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\tHÆ\u0003J\t\u0010\r\u001a\u00020\tHÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\tHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003R\u0019\u0010\u000e\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u000f\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\u0010\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a¨\u0006#"}, d2 = {"Lcom/huami/contacts/bean/PhoneContact;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", DataCacher.j, "", "writeToParcel", "describeContents", "", "toString", "component1", "component2", "component3", "disPlayName", "phoneNum", "disPlayNamePinyin", "copy", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getDisPlayName", "()Ljava/lang/String;", "b", "getPhoneNum", "c", "getDisPlayNamePinyin", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Landroid/os/Parcel;)V", "CREATOR", "contacts_release"}, k = 1, mv = {1, 4, 1})
public final /* data */ class PhoneContact implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String disPlayName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String phoneNum;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String disPlayNamePinyin;

    /* JADX INFO: renamed from: com.huami.contacts.bean.PhoneContact$CREATOR, reason: from kotlin metadata */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/huami/contacts/bean/PhoneContact$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/huami/contacts/bean/PhoneContact;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/huami/contacts/bean/PhoneContact;", "<init>", "()V", "contacts_release"}, k = 1, mv = {1, 4, 1})
    public static final class Companion implements Parcelable.Creator<PhoneContact> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public PhoneContact createFromParcel(@NotNull Parcel parcel) {
            return new PhoneContact(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public PhoneContact[] newArray(int size) {
            return new PhoneContact[size];
        }
    }

    public PhoneContact(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.disPlayName = str;
        this.phoneNum = str2;
        this.disPlayNamePinyin = str3;
    }

    public static /* synthetic */ PhoneContact copy$default(PhoneContact phoneContact, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = phoneContact.disPlayName;
        }
        if ((i & 2) != 0) {
            str2 = phoneContact.phoneNum;
        }
        if ((i & 4) != 0) {
            str3 = phoneContact.disPlayNamePinyin;
        }
        return phoneContact.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDisPlayName() {
        return this.disPlayName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPhoneNum() {
        return this.phoneNum;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDisPlayNamePinyin() {
        return this.disPlayNamePinyin;
    }

    @NotNull
    public final PhoneContact copy(@NotNull String disPlayName, @NotNull String phoneNum, @NotNull String disPlayNamePinyin) {
        return new PhoneContact(disPlayName, phoneNum, disPlayNamePinyin);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhoneContact)) {
            return false;
        }
        PhoneContact phoneContact = (PhoneContact) other;
        return Intrinsics.areEqual(this.disPlayName, phoneContact.disPlayName) && Intrinsics.areEqual(this.phoneNum, phoneContact.phoneNum) && Intrinsics.areEqual(this.disPlayNamePinyin, phoneContact.disPlayNamePinyin);
    }

    @NotNull
    public final String getDisPlayName() {
        return this.disPlayName;
    }

    @NotNull
    public final String getDisPlayNamePinyin() {
        return this.disPlayNamePinyin;
    }

    @NotNull
    public final String getPhoneNum() {
        return this.phoneNum;
    }

    public int hashCode() {
        String str = this.disPlayName;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.phoneNum;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.disPlayNamePinyin;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PhoneContact(disPlayName='" + this.disPlayName + "', phoneNum='" + this.phoneNum + "', disPlayNamePinyin='" + this.disPlayNamePinyin + "')";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.writeString(this.disPlayName);
        parcel.writeString(this.phoneNum);
        parcel.writeString(this.disPlayNamePinyin);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PhoneContact(@NotNull Parcel parcel) {
        String string = parcel.readString();
        string = string == null ? "" : string;
        String string2 = parcel.readString();
        string2 = string2 == null ? "" : string2;
        String string3 = parcel.readString();
        this(string, string2, string3 != null ? string3 : "");
    }
}
