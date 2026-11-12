package com.huami.nfc.eid.entities;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b(\u0010)J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003JO\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010\u001bR\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010\u001bR\u0019\u0010\u0010\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010\u0019\u001a\u0004\b'\u0010\u001b¨\u0006*"}, d2 = {"Lcom/huami/nfc/eid/entities/EidInfoEntity;", "", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "idCarrier", "eidType", "publicKey", "eidSign", "carrierPubKey", "version", "eidInfoCarrierType", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getIdCarrier", "()Ljava/lang/String;", "b", "getEidType", "c", "getPublicKey", GoogleApiAvailabilityLight.a, "getEidSign", "e", "getCarrierPubKey", "f", "getVersion", "g", "getEidInfoCarrierType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "nfc-eid_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class EidInfoEntity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String idCarrier;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String eidType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String publicKey;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String eidSign;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final String carrierPubKey;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private final String version;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    private final String eidInfoCarrierType;

    public EidInfoEntity(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        this.idCarrier = str;
        this.eidType = str2;
        this.publicKey = str3;
        this.eidSign = str4;
        this.carrierPubKey = str5;
        this.version = str6;
        this.eidInfoCarrierType = str7;
    }

    public static /* synthetic */ EidInfoEntity copy$default(EidInfoEntity eidInfoEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eidInfoEntity.idCarrier;
        }
        if ((i & 2) != 0) {
            str2 = eidInfoEntity.eidType;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = eidInfoEntity.publicKey;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = eidInfoEntity.eidSign;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = eidInfoEntity.carrierPubKey;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = eidInfoEntity.version;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = eidInfoEntity.eidInfoCarrierType;
        }
        return eidInfoEntity.copy(str, str8, str9, str10, str11, str12, str7);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIdCarrier() {
        return this.idCarrier;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEidType() {
        return this.eidType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPublicKey() {
        return this.publicKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEidSign() {
        return this.eidSign;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCarrierPubKey() {
        return this.carrierPubKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getEidInfoCarrierType() {
        return this.eidInfoCarrierType;
    }

    @NotNull
    public final EidInfoEntity copy(@NotNull String idCarrier, @NotNull String eidType, @NotNull String publicKey, @NotNull String eidSign, @NotNull String carrierPubKey, @NotNull String version, @NotNull String eidInfoCarrierType) {
        return new EidInfoEntity(idCarrier, eidType, publicKey, eidSign, carrierPubKey, version, eidInfoCarrierType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EidInfoEntity)) {
            return false;
        }
        EidInfoEntity eidInfoEntity = (EidInfoEntity) other;
        return Intrinsics.areEqual(this.idCarrier, eidInfoEntity.idCarrier) && Intrinsics.areEqual(this.eidType, eidInfoEntity.eidType) && Intrinsics.areEqual(this.publicKey, eidInfoEntity.publicKey) && Intrinsics.areEqual(this.eidSign, eidInfoEntity.eidSign) && Intrinsics.areEqual(this.carrierPubKey, eidInfoEntity.carrierPubKey) && Intrinsics.areEqual(this.version, eidInfoEntity.version) && Intrinsics.areEqual(this.eidInfoCarrierType, eidInfoEntity.eidInfoCarrierType);
    }

    @NotNull
    public final String getCarrierPubKey() {
        return this.carrierPubKey;
    }

    @NotNull
    public final String getEidInfoCarrierType() {
        return this.eidInfoCarrierType;
    }

    @NotNull
    public final String getEidSign() {
        return this.eidSign;
    }

    @NotNull
    public final String getEidType() {
        return this.eidType;
    }

    @NotNull
    public final String getIdCarrier() {
        return this.idCarrier;
    }

    @NotNull
    public final String getPublicKey() {
        return this.publicKey;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((((((((this.idCarrier.hashCode() * 31) + this.eidType.hashCode()) * 31) + this.publicKey.hashCode()) * 31) + this.eidSign.hashCode()) * 31) + this.carrierPubKey.hashCode()) * 31) + this.version.hashCode()) * 31) + this.eidInfoCarrierType.hashCode();
    }

    @NotNull
    public String toString() {
        return "EidInfoEntity(idCarrier=" + this.idCarrier + ", eidType=" + this.eidType + ", publicKey=" + this.publicKey + ", eidSign=" + this.eidSign + ", carrierPubKey=" + this.carrierPubKey + ", version=" + this.version + ", eidInfoCarrierType=" + this.eidInfoCarrierType + ')';
    }
}
