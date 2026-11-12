package com.xiaomi.fitness.settingitem.db.entity;

import androidx.room.Entity;
import com.google.gson.Gson;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import java.lang.reflect.Type;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Entity(primaryKeys = {"did", "key", RnReportConst.ApiReport.PARAM_MODULE}, tableName = "settingitem")
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003J\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u00012\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030 J\b\u0010!\u001a\u00020\u0003H\u0016J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\t\u0010)\u001a\u00020\u000bHÆ\u0003J[\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001J\u0013\u0010+\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001a¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/settingitem/db/entity/SettingItemEntity;", "", "key", "", "value", "did", RnReportConst.ApiReport.PARAM_MODULE, "updateTime", "", "modifyTime", "isUpload", "", "isBig", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZZ)V", "getKey", "()Ljava/lang/String;", "getValue", "getDid", "getModule", "getUpdateTime", "()J", "setUpdateTime", "(J)V", "getModifyTime", "setModifyTime", "()Z", "setUpload", "(Z)V", "getJsonValue", "valueToObject", "clazz", "Ljava/lang/Class;", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "settingitem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SettingItemEntity {

    @NotNull
    private final String did;
    private final boolean isBig;
    private boolean isUpload;

    @NotNull
    private final String key;
    private long modifyTime;

    @NotNull
    private final String module;
    private long updateTime;

    @Nullable
    private final String value;

    public SettingItemEntity(@NotNull String key, @Nullable String str, @NotNull String did, @NotNull String module, long j, long j2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(module, "module");
        this.key = key;
        this.value = str;
        this.did = did;
        this.module = module;
        this.updateTime = j;
        this.modifyTime = j2;
        this.isUpload = z;
        this.isBig = z2;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDid() {
        return this.did;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getModule() {
        return this.module;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getModifyTime() {
        return this.modifyTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsUpload() {
        return this.isUpload;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsBig() {
        return this.isBig;
    }

    @NotNull
    public final SettingItemEntity copy(@NotNull String key, @Nullable String value, @NotNull String did, @NotNull String module, long updateTime, long modifyTime, boolean isUpload, boolean isBig) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(module, "module");
        return new SettingItemEntity(key, value, did, module, updateTime, modifyTime, isUpload, isBig);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SettingItemEntity)) {
            return false;
        }
        SettingItemEntity settingItemEntity = (SettingItemEntity) other;
        return Intrinsics.areEqual(this.key, settingItemEntity.key) && Intrinsics.areEqual(this.value, settingItemEntity.value) && Intrinsics.areEqual(this.did, settingItemEntity.did) && Intrinsics.areEqual(this.module, settingItemEntity.module) && this.updateTime == settingItemEntity.updateTime && this.modifyTime == settingItemEntity.modifyTime && this.isUpload == settingItemEntity.isUpload && this.isBig == settingItemEntity.isBig;
    }

    @NotNull
    public final String getDid() {
        return this.did;
    }

    @Nullable
    public final String getJsonValue() {
        String str = this.value;
        if (str == null) {
            return null;
        }
        String strQuoteReplacement = Matcher.quoteReplacement("$");
        Intrinsics.checkNotNullExpressionValue(strQuoteReplacement, "quoteReplacement(...)");
        String strReplace = new Regex(strQuoteReplacement).replace(str, "");
        if (!StringsKt__StringsJVMKt.startsWith$default(strReplace, "'", false, 2, null) && !StringsKt__StringsJVMKt.startsWith$default(strReplace, "\"", false, 2, null)) {
            return this.value;
        }
        String strSubstring = strReplace.substring(1, strReplace.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public final long getModifyTime() {
        return this.modifyTime;
    }

    @NotNull
    public final String getModule() {
        return this.module;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.key.hashCode() * 31;
        String str = this.value;
        return ((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.did.hashCode()) * 31) + this.module.hashCode()) * 31) + Long.hashCode(this.updateTime)) * 31) + Long.hashCode(this.modifyTime)) * 31) + Boolean.hashCode(this.isUpload)) * 31) + Boolean.hashCode(this.isBig);
    }

    public final boolean isBig() {
        return this.isBig;
    }

    public final boolean isUpload() {
        return this.isUpload;
    }

    public final void setModifyTime(long j) {
        this.modifyTime = j;
    }

    public final void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public final void setUpload(boolean z) {
        this.isUpload = z;
    }

    @NotNull
    public String toString() {
        return "SettingItemEntity(key='" + this.key + "', value=" + this.value + ", did='" + this.did + "', module='" + this.module + "', updateTime=" + this.updateTime + ", modifyTime=" + this.modifyTime + ", isUpload=" + this.isUpload + ", isBig=" + this.isBig + ")";
    }

    @Nullable
    public final Object valueToObject(@NotNull Class<?> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        String jsonValue = getJsonValue();
        if (jsonValue == null) {
            return null;
        }
        try {
            return new Gson().fromJson(jsonValue, (Type) clazz);
        } catch (Exception e) {
            Logger.w("SettingItemEntity", "valueToObject(" + clazz.getSimpleName() + ") error:" + jsonValue, e);
            return null;
        }
    }
}
