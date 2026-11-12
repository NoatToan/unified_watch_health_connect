package com.huami.applet.jsengine.plugin;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b&\u0010'J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0003Jb\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u0004R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b\"\u0010!R\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b#\u0010!R\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b$\u0010!R\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001f\u001a\u0004\b%\u0010!¨\u0006("}, d2 = {"Lcom/huami/applet/jsengine/plugin/Params;", "", "", "component1", "()Ljava/lang/Integer;", "component2", "", "component3", "component4", "component5", "component6", "component7", "devId", "appId", "lId", "changeType", "key", "newValue", "oldValue", "copy", "(Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huami/applet/jsengine/plugin/Params;", "toString", "hashCode", "other", "", "equals", "Ljava/lang/Integer;", "getDevId", LogUtil.I, "getAppId", "()I", "Ljava/lang/String;", "getLId", "()Ljava/lang/String;", "getChangeType", "getKey", "getNewValue", "getOldValue", "<init>", "(Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "applet_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Params {
    private final int appId;

    @Nullable
    private final String changeType;

    @Nullable
    private final Integer devId;

    @Nullable
    private final String key;

    @Nullable
    private final String lId;

    @Nullable
    private final String newValue;

    @Nullable
    private final String oldValue;

    public Params(@Nullable Integer num, int i, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.devId = num;
        this.appId = i;
        this.lId = str;
        this.changeType = str2;
        this.key = str3;
        this.newValue = str4;
        this.oldValue = str5;
    }

    public static /* synthetic */ Params copy$default(Params params, Integer num, int i, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = params.devId;
        }
        if ((i2 & 2) != 0) {
            i = params.appId;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str = params.lId;
        }
        String str6 = str;
        if ((i2 & 8) != 0) {
            str2 = params.changeType;
        }
        String str7 = str2;
        if ((i2 & 16) != 0) {
            str3 = params.key;
        }
        String str8 = str3;
        if ((i2 & 32) != 0) {
            str4 = params.newValue;
        }
        String str9 = str4;
        if ((i2 & 64) != 0) {
            str5 = params.oldValue;
        }
        return params.copy(num, i3, str6, str7, str8, str9, str5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getDevId() {
        return this.devId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAppId() {
        return this.appId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLId() {
        return this.lId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getChangeType() {
        return this.changeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNewValue() {
        return this.newValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOldValue() {
        return this.oldValue;
    }

    @NotNull
    public final Params copy(@Nullable Integer devId, int appId, @Nullable String lId, @Nullable String changeType, @Nullable String key, @Nullable String newValue, @Nullable String oldValue) {
        return new Params(devId, appId, lId, changeType, key, newValue, oldValue);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Params)) {
            return false;
        }
        Params params = (Params) other;
        return Intrinsics.areEqual(this.devId, params.devId) && this.appId == params.appId && Intrinsics.areEqual(this.lId, params.lId) && Intrinsics.areEqual(this.changeType, params.changeType) && Intrinsics.areEqual(this.key, params.key) && Intrinsics.areEqual(this.newValue, params.newValue) && Intrinsics.areEqual(this.oldValue, params.oldValue);
    }

    public final int getAppId() {
        return this.appId;
    }

    @Nullable
    public final String getChangeType() {
        return this.changeType;
    }

    @Nullable
    public final Integer getDevId() {
        return this.devId;
    }

    @Nullable
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final String getLId() {
        return this.lId;
    }

    @Nullable
    public final String getNewValue() {
        return this.newValue;
    }

    @Nullable
    public final String getOldValue() {
        return this.oldValue;
    }

    public int hashCode() {
        Integer num = this.devId;
        int iHashCode = (((num == null ? 0 : num.hashCode()) * 31) + this.appId) * 31;
        String str = this.lId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.changeType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.key;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.newValue;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.oldValue;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Params(devId=" + this.devId + ", appId=" + this.appId + ", lId=" + ((Object) this.lId) + ", changeType=" + ((Object) this.changeType) + ", key=" + ((Object) this.key) + ", newValue=" + ((Object) this.newValue) + ", oldValue=" + ((Object) this.oldValue) + ')';
    }
}
