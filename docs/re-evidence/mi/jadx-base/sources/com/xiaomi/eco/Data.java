package com.xiaomi.eco;

import com.google.gson.annotations.SerializedName;
import com.mibi.sdk.component.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b.\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\"\u001a\u00020\u0005J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0091\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00101\u001a\u00020\u00052\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014¨\u00066"}, d2 = {"Lcom/xiaomi/eco/Data;", "", Constants.KEY_PAY_RESULT_RET, "", "success", "", "deviceKey", "oobCode", "bindKey", "pubS", "signS", "randomS", "bindIndex", "bindDid", "signShareData", "encShareData", "shaTokenKey", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRet", "()Ljava/lang/String;", "getSuccess", "()Z", "getDeviceKey", "getOobCode", "getBindKey", "getPubS", "getSignS", "getRandomS", "getBindIndex", "getBindDid", "getSignShareData", "getEncShareData", "getShaTokenKey", "isSuccess", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "hashCode", "", "toString", "eco-common-connect_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Data {

    @SerializedName("bindDid")
    @NotNull
    private final String bindDid;

    @SerializedName("bindIndex")
    @NotNull
    private final String bindIndex;

    @SerializedName("bindKey")
    @NotNull
    private final String bindKey;

    @SerializedName("deviceKey")
    @NotNull
    private final String deviceKey;

    @Nullable
    private final String encShareData;

    @SerializedName("oobCode")
    @NotNull
    private final String oobCode;

    @SerializedName("pubS")
    @NotNull
    private final String pubS;

    @SerializedName("randomS")
    @NotNull
    private final String randomS;

    @SerializedName(Constants.KEY_PAY_RESULT_RET)
    @NotNull
    private final String ret;

    @Nullable
    private final String shaTokenKey;

    @SerializedName("signS")
    @NotNull
    private final String signS;

    @Nullable
    private final String signShareData;

    @SerializedName("success")
    private final boolean success;

    public Data(@NotNull String ret, boolean z, @NotNull String deviceKey, @NotNull String oobCode, @NotNull String bindKey, @NotNull String pubS, @NotNull String signS, @NotNull String randomS, @NotNull String bindIndex, @NotNull String bindDid, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(ret, "ret");
        Intrinsics.checkNotNullParameter(deviceKey, "deviceKey");
        Intrinsics.checkNotNullParameter(oobCode, "oobCode");
        Intrinsics.checkNotNullParameter(bindKey, "bindKey");
        Intrinsics.checkNotNullParameter(pubS, "pubS");
        Intrinsics.checkNotNullParameter(signS, "signS");
        Intrinsics.checkNotNullParameter(randomS, "randomS");
        Intrinsics.checkNotNullParameter(bindIndex, "bindIndex");
        Intrinsics.checkNotNullParameter(bindDid, "bindDid");
        this.ret = ret;
        this.success = z;
        this.deviceKey = deviceKey;
        this.oobCode = oobCode;
        this.bindKey = bindKey;
        this.pubS = pubS;
        this.signS = signS;
        this.randomS = randomS;
        this.bindIndex = bindIndex;
        this.bindDid = bindDid;
        this.signShareData = str;
        this.encShareData = str2;
        this.shaTokenKey = str3;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRet() {
        return this.ret;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getBindDid() {
        return this.bindDid;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getSignShareData() {
        return this.signShareData;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getEncShareData() {
        return this.encShareData;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getShaTokenKey() {
        return this.shaTokenKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDeviceKey() {
        return this.deviceKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOobCode() {
        return this.oobCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBindKey() {
        return this.bindKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPubS() {
        return this.pubS;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSignS() {
        return this.signS;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getRandomS() {
        return this.randomS;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getBindIndex() {
        return this.bindIndex;
    }

    @NotNull
    public final Data copy(@NotNull String ret, boolean success, @NotNull String deviceKey, @NotNull String oobCode, @NotNull String bindKey, @NotNull String pubS, @NotNull String signS, @NotNull String randomS, @NotNull String bindIndex, @NotNull String bindDid, @Nullable String signShareData, @Nullable String encShareData, @Nullable String shaTokenKey) {
        Intrinsics.checkNotNullParameter(ret, "ret");
        Intrinsics.checkNotNullParameter(deviceKey, "deviceKey");
        Intrinsics.checkNotNullParameter(oobCode, "oobCode");
        Intrinsics.checkNotNullParameter(bindKey, "bindKey");
        Intrinsics.checkNotNullParameter(pubS, "pubS");
        Intrinsics.checkNotNullParameter(signS, "signS");
        Intrinsics.checkNotNullParameter(randomS, "randomS");
        Intrinsics.checkNotNullParameter(bindIndex, "bindIndex");
        Intrinsics.checkNotNullParameter(bindDid, "bindDid");
        return new Data(ret, success, deviceKey, oobCode, bindKey, pubS, signS, randomS, bindIndex, bindDid, signShareData, encShareData, shaTokenKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Data)) {
            return false;
        }
        Data data = (Data) other;
        return Intrinsics.areEqual(this.ret, data.ret) && this.success == data.success && Intrinsics.areEqual(this.deviceKey, data.deviceKey) && Intrinsics.areEqual(this.oobCode, data.oobCode) && Intrinsics.areEqual(this.bindKey, data.bindKey) && Intrinsics.areEqual(this.pubS, data.pubS) && Intrinsics.areEqual(this.signS, data.signS) && Intrinsics.areEqual(this.randomS, data.randomS) && Intrinsics.areEqual(this.bindIndex, data.bindIndex) && Intrinsics.areEqual(this.bindDid, data.bindDid) && Intrinsics.areEqual(this.signShareData, data.signShareData) && Intrinsics.areEqual(this.encShareData, data.encShareData) && Intrinsics.areEqual(this.shaTokenKey, data.shaTokenKey);
    }

    @NotNull
    public final String getBindDid() {
        return this.bindDid;
    }

    @NotNull
    public final String getBindIndex() {
        return this.bindIndex;
    }

    @NotNull
    public final String getBindKey() {
        return this.bindKey;
    }

    @NotNull
    public final String getDeviceKey() {
        return this.deviceKey;
    }

    @Nullable
    public final String getEncShareData() {
        return this.encShareData;
    }

    @NotNull
    public final String getOobCode() {
        return this.oobCode;
    }

    @NotNull
    public final String getPubS() {
        return this.pubS;
    }

    @NotNull
    public final String getRandomS() {
        return this.randomS;
    }

    @NotNull
    public final String getRet() {
        return this.ret;
    }

    @Nullable
    public final String getShaTokenKey() {
        return this.shaTokenKey;
    }

    @NotNull
    public final String getSignS() {
        return this.signS;
    }

    @Nullable
    public final String getSignShareData() {
        return this.signShareData;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((this.ret.hashCode() * 31) + Boolean.hashCode(this.success)) * 31) + this.deviceKey.hashCode()) * 31) + this.oobCode.hashCode()) * 31) + this.bindKey.hashCode()) * 31) + this.pubS.hashCode()) * 31) + this.signS.hashCode()) * 31) + this.randomS.hashCode()) * 31) + this.bindIndex.hashCode()) * 31) + this.bindDid.hashCode()) * 31;
        String str = this.signShareData;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.encShareData;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.shaTokenKey;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean isSuccess() {
        return Integer.parseInt(this.ret) == 1;
    }

    @NotNull
    public String toString() {
        return "Data(ret=" + this.ret + ", success=" + this.success + ", deviceKey=" + this.deviceKey + ", oobCode=" + this.oobCode + ", bindKey=" + this.bindKey + ", pubS=" + this.pubS + ", signS=" + this.signS + ", randomS=" + this.randomS + ", bindIndex=" + this.bindIndex + ", bindDid=" + this.bindDid + ", signShareData=" + this.signShareData + ", encShareData=" + this.encShareData + ", shaTokenKey=" + this.shaTokenKey + ")";
    }

    public /* synthetic */ Data(String str, boolean z, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, str2, str3, str4, str5, str6, str7, str8, str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12);
    }
}
