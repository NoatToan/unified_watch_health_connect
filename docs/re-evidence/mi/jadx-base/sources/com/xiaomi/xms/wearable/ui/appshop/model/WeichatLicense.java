package com.xiaomi.xms.wearable.ui.appshop.model;

import com.miui.tsmclientsdk.MiTsmConstants;
import com.xiaomi.fitness.nfc.ui.IssuerActivity;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013¨\u0006 "}, d2 = {"Lcom/xiaomi/xms/wearable/ui/appshop/model/WeichatLicense;", "", "did", "", MiTsmConstants.KEY_SIGNATURE, IssuerActivity.KEY_PRODUCT_ID, "", BluetoothConstants.KEY_VERSION, "<init>", "(Ljava/lang/String;Ljava/lang/String;II)V", "getDid", "()Ljava/lang/String;", "setDid", "(Ljava/lang/String;)V", "getSignature", "setSignature", "getProduct_id", "()I", "setProduct_id", "(I)V", "getKey_version", "setKey_version", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WeichatLicense {

    @NotNull
    private String did;
    private int key_version;
    private int product_id;

    @NotNull
    private String signature;

    public WeichatLicense(@NotNull String did, @NotNull String signature, int i, int i2) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.did = did;
        this.signature = signature;
        this.product_id = i;
        this.key_version = i2;
    }

    public static /* synthetic */ WeichatLicense copy$default(WeichatLicense weichatLicense, String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = weichatLicense.did;
        }
        if ((i3 & 2) != 0) {
            str2 = weichatLicense.signature;
        }
        if ((i3 & 4) != 0) {
            i = weichatLicense.product_id;
        }
        if ((i3 & 8) != 0) {
            i2 = weichatLicense.key_version;
        }
        return weichatLicense.copy(str, str2, i, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDid() {
        return this.did;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getProduct_id() {
        return this.product_id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getKey_version() {
        return this.key_version;
    }

    @NotNull
    public final WeichatLicense copy(@NotNull String did, @NotNull String signature, int product_id, int key_version) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(signature, "signature");
        return new WeichatLicense(did, signature, product_id, key_version);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeichatLicense)) {
            return false;
        }
        WeichatLicense weichatLicense = (WeichatLicense) other;
        return Intrinsics.areEqual(this.did, weichatLicense.did) && Intrinsics.areEqual(this.signature, weichatLicense.signature) && this.product_id == weichatLicense.product_id && this.key_version == weichatLicense.key_version;
    }

    @NotNull
    public final String getDid() {
        return this.did;
    }

    public final int getKey_version() {
        return this.key_version;
    }

    public final int getProduct_id() {
        return this.product_id;
    }

    @NotNull
    public final String getSignature() {
        return this.signature;
    }

    public int hashCode() {
        return (((((this.did.hashCode() * 31) + this.signature.hashCode()) * 31) + Integer.hashCode(this.product_id)) * 31) + Integer.hashCode(this.key_version);
    }

    public final void setDid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.did = str;
    }

    public final void setKey_version(int i) {
        this.key_version = i;
    }

    public final void setProduct_id(int i) {
        this.product_id = i;
    }

    public final void setSignature(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.signature = str;
    }

    @NotNull
    public String toString() {
        return "WeichatLicense(did=" + this.did + ", signature=" + this.signature + ", product_id=" + this.product_id + ", key_version=" + this.key_version + ")";
    }
}
