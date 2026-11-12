package com.huami.sleep.sleepintrodetail.vo;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b-\u0010.J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\t\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003JP\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\r\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\bR\u0019\u0010\u000f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010!R\u0019\u0010\u0011\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010\u001f\u001a\u0004\b,\u0010!¨\u0006/"}, d2 = {"Lcom/huami/sleep/sleepintrodetail/vo/SleepIntroDetailVo;", "Ljava/io/Serializable;", "Lcom/huami/sleep/sleepintrodetail/vo/SleepIntroDetailType;", "component1", "", "component2", "", "component3", "()Ljava/lang/Integer;", "component4", "component5", "component6", "type", "title", "value", "valueImageRes", "valueTrendInfo", "refs", "copy", "(Lcom/huami/sleep/sleepintrodetail/vo/SleepIntroDetailType;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;)Lcom/huami/sleep/sleepintrodetail/vo/SleepIntroDetailVo;", "toString", "hashCode", "", "other", "", "equals", "a", "Lcom/huami/sleep/sleepintrodetail/vo/SleepIntroDetailType;", "getType", "()Lcom/huami/sleep/sleepintrodetail/vo/SleepIntroDetailType;", "b", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "c", "Ljava/lang/Integer;", "getValue", GoogleApiAvailabilityLight.a, LogUtil.I, "getValueImageRes", "()I", "e", "getValueTrendInfo", "f", "getRefs", "<init>", "(Lcom/huami/sleep/sleepintrodetail/vo/SleepIntroDetailType;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SleepIntroDetailVo implements Serializable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final SleepIntroDetailType type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer value;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int valueImageRes;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final String valueTrendInfo;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private final String refs;

    public SleepIntroDetailVo(@NotNull SleepIntroDetailType sleepIntroDetailType, @NotNull String str, @Nullable Integer num, int i, @Nullable String str2, @NotNull String str3) {
        this.type = sleepIntroDetailType;
        this.title = str;
        this.value = num;
        this.valueImageRes = i;
        this.valueTrendInfo = str2;
        this.refs = str3;
    }

    public static /* synthetic */ SleepIntroDetailVo copy$default(SleepIntroDetailVo sleepIntroDetailVo, SleepIntroDetailType sleepIntroDetailType, String str, Integer num, int i, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            sleepIntroDetailType = sleepIntroDetailVo.type;
        }
        if ((i2 & 2) != 0) {
            str = sleepIntroDetailVo.title;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            num = sleepIntroDetailVo.value;
        }
        Integer num2 = num;
        if ((i2 & 8) != 0) {
            i = sleepIntroDetailVo.valueImageRes;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str2 = sleepIntroDetailVo.valueTrendInfo;
        }
        String str5 = str2;
        if ((i2 & 32) != 0) {
            str3 = sleepIntroDetailVo.refs;
        }
        return sleepIntroDetailVo.copy(sleepIntroDetailType, str4, num2, i3, str5, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SleepIntroDetailType getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getValueImageRes() {
        return this.valueImageRes;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getValueTrendInfo() {
        return this.valueTrendInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRefs() {
        return this.refs;
    }

    @NotNull
    public final SleepIntroDetailVo copy(@NotNull SleepIntroDetailType type, @NotNull String title, @Nullable Integer value, int valueImageRes, @Nullable String valueTrendInfo, @NotNull String refs) {
        return new SleepIntroDetailVo(type, title, value, valueImageRes, valueTrendInfo, refs);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepIntroDetailVo)) {
            return false;
        }
        SleepIntroDetailVo sleepIntroDetailVo = (SleepIntroDetailVo) other;
        return this.type == sleepIntroDetailVo.type && Intrinsics.areEqual(this.title, sleepIntroDetailVo.title) && Intrinsics.areEqual(this.value, sleepIntroDetailVo.value) && this.valueImageRes == sleepIntroDetailVo.valueImageRes && Intrinsics.areEqual(this.valueTrendInfo, sleepIntroDetailVo.valueTrendInfo) && Intrinsics.areEqual(this.refs, sleepIntroDetailVo.refs);
    }

    @NotNull
    public final String getRefs() {
        return this.refs;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final SleepIntroDetailType getType() {
        return this.type;
    }

    @Nullable
    public final Integer getValue() {
        return this.value;
    }

    public final int getValueImageRes() {
        return this.valueImageRes;
    }

    @Nullable
    public final String getValueTrendInfo() {
        return this.valueTrendInfo;
    }

    public int hashCode() {
        int iHashCode = ((this.type.hashCode() * 31) + this.title.hashCode()) * 31;
        Integer num = this.value;
        int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.valueImageRes) * 31;
        String str = this.valueTrendInfo;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.refs.hashCode();
    }

    @NotNull
    public String toString() {
        return "SleepIntroDetailVo(type=" + this.type + ", title=" + this.title + ", value=" + this.value + ", valueImageRes=" + this.valueImageRes + ", valueTrendInfo=" + this.valueTrendInfo + ", refs=" + this.refs + ")";
    }

    public /* synthetic */ SleepIntroDetailVo(SleepIntroDetailType sleepIntroDetailType, String str, Integer num, int i, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(sleepIntroDetailType, str, num, i, (i2 & 16) != 0 ? null : str2, str3);
    }
}
