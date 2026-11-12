package com.xiaomi.wearable.yrn.export.data;

import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b!\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0086\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020\u000e2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\tHÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0015\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001c\u0010\u0018R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\r\u0010\u001d¨\u0006/"}, d2 = {"Lcom/xiaomi/wearable/yrn/export/data/YRNBundleData;", "", "version", "", RnReportConst.ApiReport.PARAM_MODULE, "maketime", "md5", "bundlePath", "maxNativeApiLevel", "", "maxCommonJSApiLevel", "moduleIdMapVersion", "updateStrategy", "isResidentMemory", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getVersion", "()Ljava/lang/String;", "getModule", "getMaketime", "getMd5", "getBundlePath", "getMaxNativeApiLevel", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaxCommonJSApiLevel", "getModuleIdMapVersion", "getUpdateStrategy", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/xiaomi/wearable/yrn/export/data/YRNBundleData;", "equals", "other", "hashCode", "toString", "yrn-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class YRNBundleData {

    @Nullable
    private final String bundlePath;

    @Nullable
    private final Boolean isResidentMemory;

    @Nullable
    private final String maketime;

    @Nullable
    private final Integer maxCommonJSApiLevel;

    @Nullable
    private final Integer maxNativeApiLevel;

    @Nullable
    private final String md5;

    @Nullable
    private final String module;

    @Nullable
    private final String moduleIdMapVersion;

    @Nullable
    private final Integer updateStrategy;

    @Nullable
    private final String version;

    public YRNBundleData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Integer num, @Nullable Integer num2, @Nullable String str6, @Nullable Integer num3, @Nullable Boolean bool) {
        this.version = str;
        this.module = str2;
        this.maketime = str3;
        this.md5 = str4;
        this.bundlePath = str5;
        this.maxNativeApiLevel = num;
        this.maxCommonJSApiLevel = num2;
        this.moduleIdMapVersion = str6;
        this.updateStrategy = num3;
        this.isResidentMemory = bool;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getIsResidentMemory() {
        return this.isResidentMemory;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getModule() {
        return this.module;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMaketime() {
        return this.maketime;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMd5() {
        return this.md5;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBundlePath() {
        return this.bundlePath;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getMaxNativeApiLevel() {
        return this.maxNativeApiLevel;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getMaxCommonJSApiLevel() {
        return this.maxCommonJSApiLevel;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getModuleIdMapVersion() {
        return this.moduleIdMapVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getUpdateStrategy() {
        return this.updateStrategy;
    }

    @NotNull
    public final YRNBundleData copy(@Nullable String version, @Nullable String module, @Nullable String maketime, @Nullable String md5, @Nullable String bundlePath, @Nullable Integer maxNativeApiLevel, @Nullable Integer maxCommonJSApiLevel, @Nullable String moduleIdMapVersion, @Nullable Integer updateStrategy, @Nullable Boolean isResidentMemory) {
        return new YRNBundleData(version, module, maketime, md5, bundlePath, maxNativeApiLevel, maxCommonJSApiLevel, moduleIdMapVersion, updateStrategy, isResidentMemory);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YRNBundleData)) {
            return false;
        }
        YRNBundleData yRNBundleData = (YRNBundleData) other;
        return Intrinsics.areEqual(this.version, yRNBundleData.version) && Intrinsics.areEqual(this.module, yRNBundleData.module) && Intrinsics.areEqual(this.maketime, yRNBundleData.maketime) && Intrinsics.areEqual(this.md5, yRNBundleData.md5) && Intrinsics.areEqual(this.bundlePath, yRNBundleData.bundlePath) && Intrinsics.areEqual(this.maxNativeApiLevel, yRNBundleData.maxNativeApiLevel) && Intrinsics.areEqual(this.maxCommonJSApiLevel, yRNBundleData.maxCommonJSApiLevel) && Intrinsics.areEqual(this.moduleIdMapVersion, yRNBundleData.moduleIdMapVersion) && Intrinsics.areEqual(this.updateStrategy, yRNBundleData.updateStrategy) && Intrinsics.areEqual(this.isResidentMemory, yRNBundleData.isResidentMemory);
    }

    @Nullable
    public final String getBundlePath() {
        return this.bundlePath;
    }

    @Nullable
    public final String getMaketime() {
        return this.maketime;
    }

    @Nullable
    public final Integer getMaxCommonJSApiLevel() {
        return this.maxCommonJSApiLevel;
    }

    @Nullable
    public final Integer getMaxNativeApiLevel() {
        return this.maxNativeApiLevel;
    }

    @Nullable
    public final String getMd5() {
        return this.md5;
    }

    @Nullable
    public final String getModule() {
        return this.module;
    }

    @Nullable
    public final String getModuleIdMapVersion() {
        return this.moduleIdMapVersion;
    }

    @Nullable
    public final Integer getUpdateStrategy() {
        return this.updateStrategy;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.version;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.module;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.maketime;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.md5;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.bundlePath;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.maxNativeApiLevel;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxCommonJSApiLevel;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str6 = this.moduleIdMapVersion;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num3 = this.updateStrategy;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.isResidentMemory;
        return iHashCode9 + (bool != null ? bool.hashCode() : 0);
    }

    @Nullable
    public final Boolean isResidentMemory() {
        return this.isResidentMemory;
    }

    @NotNull
    public String toString() {
        return "YRNBundleData(version=" + this.version + ", module=" + this.module + ", maketime=" + this.maketime + ", md5=" + this.md5 + ", bundlePath=" + this.bundlePath + ", maxNativeApiLevel=" + this.maxNativeApiLevel + ", maxCommonJSApiLevel=" + this.maxCommonJSApiLevel + ", moduleIdMapVersion=" + this.moduleIdMapVersion + ", updateStrategy=" + this.updateStrategy + ", isResidentMemory=" + this.isResidentMemory + ")";
    }
}
