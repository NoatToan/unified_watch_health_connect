package com.huami.contacts.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0007\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/contacts/bean/ContactDecorator;", "", "Lcom/huami/contacts/bean/PhoneContact;", "component1", "", "component2", "phoneContact", "isSelect", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Lcom/huami/contacts/bean/PhoneContact;", "getPhoneContact", "()Lcom/huami/contacts/bean/PhoneContact;", "b", "Z", "()Z", "setSelect", "(Z)V", "<init>", "(Lcom/huami/contacts/bean/PhoneContact;Z)V", "contacts_release"}, k = 1, mv = {1, 4, 1})
public final /* data */ class ContactDecorator {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final PhoneContact phoneContact;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private boolean isSelect;

    public ContactDecorator(@NotNull PhoneContact phoneContact, boolean z) {
        this.phoneContact = phoneContact;
        this.isSelect = z;
    }

    public static /* synthetic */ ContactDecorator copy$default(ContactDecorator contactDecorator, PhoneContact phoneContact, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            phoneContact = contactDecorator.phoneContact;
        }
        if ((i & 2) != 0) {
            z = contactDecorator.isSelect;
        }
        return contactDecorator.copy(phoneContact, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PhoneContact getPhoneContact() {
        return this.phoneContact;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsSelect() {
        return this.isSelect;
    }

    @NotNull
    public final ContactDecorator copy(@NotNull PhoneContact phoneContact, boolean isSelect) {
        return new ContactDecorator(phoneContact, isSelect);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactDecorator)) {
            return false;
        }
        ContactDecorator contactDecorator = (ContactDecorator) other;
        return Intrinsics.areEqual(this.phoneContact, contactDecorator.phoneContact) && this.isSelect == contactDecorator.isSelect;
    }

    @NotNull
    public final PhoneContact getPhoneContact() {
        return this.phoneContact;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        PhoneContact phoneContact = this.phoneContact;
        int iHashCode = (phoneContact != null ? phoneContact.hashCode() : 0) * 31;
        boolean z = this.isSelect;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final boolean isSelect() {
        return this.isSelect;
    }

    public final void setSelect(boolean z) {
        this.isSelect = z;
    }

    @NotNull
    public String toString() {
        return "ContactDecorator(phoneContact=" + this.phoneContact + ", isSelect=" + this.isSelect + ")";
    }

    public /* synthetic */ ContactDecorator(PhoneContact phoneContact, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(phoneContact, (i & 2) != 0 ? false : z);
    }
}
