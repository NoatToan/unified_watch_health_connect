package com.xiaomi.fitness.eco.device.manager.api.model;

import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003J]\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR,\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/api/model/BindSignInfo;", "", "bindKey", "", "did", "model", "mac", "sign", "token", "extraValues", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getBindKey", "()Ljava/lang/String;", "getDid", "getModel", "getMac", "getSign", "getToken", "getExtraValues", "()Ljava/util/Map;", "setExtraValues", "(Ljava/util/Map;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BindSignInfo {

    @SerializedName("bind_key")
    @NotNull
    private final String bindKey;

    @NotNull
    private final String did;

    @SerializedName("extra_values")
    @Nullable
    private Map<String, String> extraValues;

    @NotNull
    private final String mac;

    @NotNull
    private final String model;

    @NotNull
    private final String sign;

    @NotNull
    private final String token;

    public BindSignInfo(@NotNull String bindKey, @NotNull String did, @NotNull String model, @NotNull String mac, @NotNull String sign, @NotNull String token, @Nullable Map<String, String> map) {
        Intrinsics.checkNotNullParameter(bindKey, "bindKey");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(sign, "sign");
        Intrinsics.checkNotNullParameter(token, "token");
        this.bindKey = bindKey;
        this.did = did;
        this.model = model;
        this.mac = mac;
        this.sign = sign;
        this.token = token;
        this.extraValues = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BindSignInfo copy$default(BindSignInfo bindSignInfo, String str, String str2, String str3, String str4, String str5, String str6, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bindSignInfo.bindKey;
        }
        if ((i & 2) != 0) {
            str2 = bindSignInfo.did;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = bindSignInfo.model;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = bindSignInfo.mac;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = bindSignInfo.sign;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = bindSignInfo.token;
        }
        String str11 = str6;
        if ((i & 64) != 0) {
            map = bindSignInfo.extraValues;
        }
        return bindSignInfo.copy(str, str7, str8, str9, str10, str11, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBindKey() {
        return this.bindKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDid() {
        return this.did;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMac() {
        return this.mac;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSign() {
        return this.sign;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @Nullable
    public final Map<String, String> component7() {
        return this.extraValues;
    }

    @NotNull
    public final BindSignInfo copy(@NotNull String bindKey, @NotNull String did, @NotNull String model, @NotNull String mac, @NotNull String sign, @NotNull String token, @Nullable Map<String, String> extraValues) {
        Intrinsics.checkNotNullParameter(bindKey, "bindKey");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(sign, "sign");
        Intrinsics.checkNotNullParameter(token, "token");
        return new BindSignInfo(bindKey, did, model, mac, sign, token, extraValues);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BindSignInfo)) {
            return false;
        }
        BindSignInfo bindSignInfo = (BindSignInfo) other;
        return Intrinsics.areEqual(this.bindKey, bindSignInfo.bindKey) && Intrinsics.areEqual(this.did, bindSignInfo.did) && Intrinsics.areEqual(this.model, bindSignInfo.model) && Intrinsics.areEqual(this.mac, bindSignInfo.mac) && Intrinsics.areEqual(this.sign, bindSignInfo.sign) && Intrinsics.areEqual(this.token, bindSignInfo.token) && Intrinsics.areEqual(this.extraValues, bindSignInfo.extraValues);
    }

    @NotNull
    public final String getBindKey() {
        return this.bindKey;
    }

    @NotNull
    public final String getDid() {
        return this.did;
    }

    @Nullable
    public final Map<String, String> getExtraValues() {
        return this.extraValues;
    }

    @NotNull
    public final String getMac() {
        return this.mac;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final String getSign() {
        return this.sign;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.bindKey.hashCode() * 31) + this.did.hashCode()) * 31) + this.model.hashCode()) * 31) + this.mac.hashCode()) * 31) + this.sign.hashCode()) * 31) + this.token.hashCode()) * 31;
        Map<String, String> map = this.extraValues;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final void setExtraValues(@Nullable Map<String, String> map) {
        this.extraValues = map;
    }

    @NotNull
    public String toString() {
        return "BindSignInfo(bindKey=" + this.bindKey + ", did=" + this.did + ", model=" + this.model + ", mac=" + this.mac + ", sign=" + this.sign + ", token=" + this.token + ", extraValues=" + this.extraValues + ")";
    }

    public /* synthetic */ BindSignInfo(String str, String str2, String str3, String str4, String str5, String str6, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, (i & 64) != 0 ? null : map);
    }
}
