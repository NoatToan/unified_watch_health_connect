package com.huami.bloodpressure_ui.analyse;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J3\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/huami/bloodpressure_ui/analyse/AnalyseItemEntity;", "", "", "component1", "component2", "component3", "", "component4", "value", "unit", "desc", "status", "copy", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "getUnit", "getDesc", LogUtil.I, "getStatus", "()I", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AnalyseItemEntity {

    @NotNull
    private final String desc;
    private final int status;

    @NotNull
    private final String unit;

    @Nullable
    private final String value;

    public AnalyseItemEntity(@Nullable String str, @NotNull String str2, @NotNull String str3, int i) {
        this.value = str;
        this.unit = str2;
        this.desc = str3;
        this.status = i;
    }

    public static /* synthetic */ AnalyseItemEntity copy$default(AnalyseItemEntity analyseItemEntity, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = analyseItemEntity.value;
        }
        if ((i2 & 2) != 0) {
            str2 = analyseItemEntity.unit;
        }
        if ((i2 & 4) != 0) {
            str3 = analyseItemEntity.desc;
        }
        if ((i2 & 8) != 0) {
            i = analyseItemEntity.status;
        }
        return analyseItemEntity.copy(str, str2, str3, i);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final AnalyseItemEntity copy(@Nullable String value, @NotNull String unit, @NotNull String desc, int status) {
        return new AnalyseItemEntity(value, unit, desc, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyseItemEntity)) {
            return false;
        }
        AnalyseItemEntity analyseItemEntity = (AnalyseItemEntity) other;
        return Intrinsics.areEqual(this.value, analyseItemEntity.value) && Intrinsics.areEqual(this.unit, analyseItemEntity.unit) && Intrinsics.areEqual(this.desc, analyseItemEntity.desc) && this.status == analyseItemEntity.status;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final String getUnit() {
        return this.unit;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.value;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + this.unit.hashCode()) * 31) + this.desc.hashCode()) * 31) + this.status;
    }

    @NotNull
    public String toString() {
        return "AnalyseItemEntity(value=" + this.value + ", unit=" + this.unit + ", desc=" + this.desc + ", status=" + this.status + ")";
    }

    public /* synthetic */ AnalyseItemEntity(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, str2, str3, (i2 & 8) != 0 ? 0 : i);
    }
}
