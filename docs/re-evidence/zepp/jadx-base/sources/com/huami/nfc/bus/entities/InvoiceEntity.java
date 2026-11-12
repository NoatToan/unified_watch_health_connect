package com.huami.nfc.bus.entities;

import androidx.autofill.HintConstants;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u0000 .2\u00020\u0001:\u0001.B_\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b,\u0010-J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003Je\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u000b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\f\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001e\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001b\u001a\u0004\b'\u0010\u001dR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u001b\u001a\u0004\b)\u0010\u001dR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u001b\u001a\u0004\b+\u0010\u001d¨\u0006/"}, d2 = {"Lcom/huami/nfc/bus/entities/InvoiceEntity;", "", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "type", "content", "companyName", "identifier", "email", "name", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, IntegrityManager.INTEGRITY_TYPE_ADDRESS, "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "b", "getContent", "c", "getCompanyName", GoogleApiAvailabilityLight.a, "getIdentifier", "e", "getEmail", "f", "getName", "g", "getPhoneNumber", "h", "getAddress", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class InvoiceEntity {

    @NotNull
    public static final String TYPE_COMPANY = "COMPANY";

    @NotNull
    public static final String TYPE_PERSONAL = "PERSONAL";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("title")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("content")
    @NotNull
    private final String content;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("companyName")
    @Nullable
    private final String companyName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("identifier")
    @Nullable
    private final String identifier;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("email")
    @Nullable
    private final String email;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName("name")
    @Nullable
    private final String name;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @SerializedName(HintConstants.AUTOFILL_HINT_PHONE_NUMBER)
    @Nullable
    private final String phoneNumber;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @SerializedName(IntegrityManager.INTEGRITY_TYPE_ADDRESS)
    @Nullable
    private final String address;

    public InvoiceEntity(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        this.type = str;
        this.content = str2;
        this.companyName = str3;
        this.identifier = str4;
        this.email = str5;
        this.name = str6;
        this.phoneNumber = str7;
        this.address = str8;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCompanyName() {
        return this.companyName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    public final InvoiceEntity copy(@NotNull String type, @NotNull String content, @Nullable String companyName, @Nullable String identifier, @Nullable String email, @Nullable String name, @Nullable String phoneNumber, @Nullable String address) {
        return new InvoiceEntity(type, content, companyName, identifier, email, name, phoneNumber, address);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvoiceEntity)) {
            return false;
        }
        InvoiceEntity invoiceEntity = (InvoiceEntity) other;
        return Intrinsics.areEqual(this.type, invoiceEntity.type) && Intrinsics.areEqual(this.content, invoiceEntity.content) && Intrinsics.areEqual(this.companyName, invoiceEntity.companyName) && Intrinsics.areEqual(this.identifier, invoiceEntity.identifier) && Intrinsics.areEqual(this.email, invoiceEntity.email) && Intrinsics.areEqual(this.name, invoiceEntity.name) && Intrinsics.areEqual(this.phoneNumber, invoiceEntity.phoneNumber) && Intrinsics.areEqual(this.address, invoiceEntity.address);
    }

    @Nullable
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    public final String getCompanyName() {
        return this.companyName;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    public final String getIdentifier() {
        return this.identifier;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((this.type.hashCode() * 31) + this.content.hashCode()) * 31;
        String str = this.companyName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.identifier;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.email;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.name;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.phoneNumber;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.address;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "InvoiceEntity(type=" + this.type + ", content=" + this.content + ", companyName=" + ((Object) this.companyName) + ", identifier=" + ((Object) this.identifier) + ", email=" + ((Object) this.email) + ", name=" + ((Object) this.name) + ", phoneNumber=" + ((Object) this.phoneNumber) + ", address=" + ((Object) this.address) + ')';
    }

    public /* synthetic */ InvoiceEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8);
    }
}
