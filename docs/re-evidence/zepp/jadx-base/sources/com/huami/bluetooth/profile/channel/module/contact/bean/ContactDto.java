package com.huami.bluetooth.profile.channel.module.contact.bean;

import com.huami.bluetooth.profile.channel.module.binary.Layout;
import com.huami.bluetooth.profile.channel.module.binary.annotation.Order;
import com.xiaomi.hm.health.ui.smartplay.appnotify.ContactSettingItemActivity;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001f\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0003J!\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/contact/bean/ContactDto;", "Lcom/huami/bluetooth/profile/channel/module/binary/Layout;", "Lcom/huami/bluetooth/profile/channel/module/contact/bean/Contact;", "toContact", "", "component1", "component2", "name", "number", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ContactDto implements Layout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @Nullable
    public String name;

    @JvmField
    @Nullable
    public String number;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/contact/bean/ContactDto$Companion;", "", "Lcom/huami/bluetooth/profile/channel/module/contact/bean/Contact;", ContactSettingItemActivity.KEY_CONTACT, "Lcom/huami/bluetooth/profile/channel/module/contact/bean/ContactDto;", "fromContact", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ContactDto fromContact(@NotNull Contact contact) {
            return new ContactDto(contact.getName(), contact.getNumber());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContactDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public ContactDto(@Order(1) @Nullable String str, @Order(2) @Nullable String str2) {
        this.name = str;
        this.number = str2;
    }

    public static /* synthetic */ ContactDto copy$default(ContactDto contactDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contactDto.name;
        }
        if ((i & 2) != 0) {
            str2 = contactDto.number;
        }
        return contactDto.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    @NotNull
    public final ContactDto copy(@Order(1) @Nullable String name, @Order(2) @Nullable String number) {
        return new ContactDto(name, number);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactDto)) {
            return false;
        }
        ContactDto contactDto = (ContactDto) other;
        return Intrinsics.areEqual(this.name, contactDto.name) && Intrinsics.areEqual(this.number, contactDto.number);
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.number;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Nullable
    public final Contact toContact() {
        String str;
        String str2 = this.name;
        if (str2 == null || (str = this.number) == null) {
            return null;
        }
        return new Contact(str2, str);
    }

    @NotNull
    public String toString() {
        return "ContactDto(name=" + ((Object) this.name) + ", number=" + ((Object) this.number) + ')';
    }

    public /* synthetic */ ContactDto(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
