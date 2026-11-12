package com.xiaomi.hm.health.ui.smartplay.btphone.contact;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/contact/Contact;", "", "", "component1", "component2", "uName", "phone", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getUName", "()Ljava/lang/String;", "b", "getPhone", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Contact {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String uName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String phone;

    public Contact(@NotNull String str, @NotNull String str2) {
        this.uName = str;
        this.phone = str2;
    }

    public static /* synthetic */ Contact copy$default(Contact contact, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contact.uName;
        }
        if ((i & 2) != 0) {
            str2 = contact.phone;
        }
        return contact.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUName() {
        return this.uName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    @NotNull
    public final Contact copy(@NotNull String uName, @NotNull String phone) {
        return new Contact(uName, phone);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Contact)) {
            return false;
        }
        Contact contact = (Contact) other;
        return Intrinsics.areEqual(this.uName, contact.uName) && Intrinsics.areEqual(this.phone, contact.phone);
    }

    @NotNull
    public final String getPhone() {
        return this.phone;
    }

    @NotNull
    public final String getUName() {
        return this.uName;
    }

    public int hashCode() {
        return (this.uName.hashCode() * 31) + this.phone.hashCode();
    }

    @NotNull
    public String toString() {
        return "Contact(uName=" + this.uName + ", phone=" + this.phone + ")";
    }
}
