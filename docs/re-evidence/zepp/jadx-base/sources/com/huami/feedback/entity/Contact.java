package com.huami.feedback.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.huami.feedback.ContactType;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Parcelize
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\u0010\u001a\u00020\nHÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nHÖ\u0001R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/huami/feedback/entity/Contact;", "Landroid/os/Parcelable;", "Lcom/huami/feedback/ContactType;", "component1", "", "component2", "contactType", "contactInfo", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", DataCacher.j, "", "writeToParcel", "a", "Lcom/huami/feedback/ContactType;", "getContactType", "()Lcom/huami/feedback/ContactType;", "b", "Ljava/lang/String;", "getContactInfo", "()Ljava/lang/String;", "<init>", "(Lcom/huami/feedback/ContactType;Ljava/lang/String;)V", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Contact implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Contact> CREATOR = new Creator();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final ContactType contactType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String contactInfo;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class Creator implements Parcelable.Creator<Contact> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Contact createFromParcel(@NotNull Parcel parcel) {
            return new Contact(ContactType.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Contact[] newArray(int i) {
            return new Contact[i];
        }
    }

    public Contact(@NotNull ContactType contactType, @NotNull String str) {
        this.contactType = contactType;
        this.contactInfo = str;
    }

    public static /* synthetic */ Contact copy$default(Contact contact, ContactType contactType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            contactType = contact.contactType;
        }
        if ((i & 2) != 0) {
            str = contact.contactInfo;
        }
        return contact.copy(contactType, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ContactType getContactType() {
        return this.contactType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContactInfo() {
        return this.contactInfo;
    }

    @NotNull
    public final Contact copy(@NotNull ContactType contactType, @NotNull String contactInfo) {
        return new Contact(contactType, contactInfo);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Contact)) {
            return false;
        }
        Contact contact = (Contact) other;
        return this.contactType == contact.contactType && Intrinsics.areEqual(this.contactInfo, contact.contactInfo);
    }

    @NotNull
    public final String getContactInfo() {
        return this.contactInfo;
    }

    @NotNull
    public final ContactType getContactType() {
        return this.contactType;
    }

    public int hashCode() {
        return (this.contactType.hashCode() * 31) + this.contactInfo.hashCode();
    }

    @NotNull
    public String toString() {
        return "Contact(contactType=" + this.contactType + ", contactInfo=" + this.contactInfo + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.writeString(this.contactType.name());
        parcel.writeString(this.contactInfo);
    }
}
