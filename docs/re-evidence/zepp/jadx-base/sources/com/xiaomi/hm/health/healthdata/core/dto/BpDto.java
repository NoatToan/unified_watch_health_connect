package com.xiaomi.hm.health.healthdata.core.dto;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.healthdata.dto.HealthDataType;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b-\u0010.J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u0015\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003JU\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00052\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\t\u0010\u0013\u001a\u00020\bHÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u000e\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR%\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R%\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/dto/BpDto;", "", "", "toString", "component1", "Lcom/xiaomi/hm/health/healthdata/dto/HealthDataType;", "component2", "Lkotlin/Pair;", "", "component3", "component4", "Ljava/util/Date;", "component5", "id", "subType", "lowValue", "heightValue", "uploadTime", "copy", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "Lcom/xiaomi/hm/health/healthdata/dto/HealthDataType;", "getSubType", "()Lcom/xiaomi/hm/health/healthdata/dto/HealthDataType;", "c", "Lkotlin/Pair;", "getLowValue", "()Lkotlin/Pair;", GoogleApiAvailabilityLight.a, "getHeightValue", "e", "Ljava/util/Date;", "getUploadTime", "()Ljava/util/Date;", "Ljava/text/SimpleDateFormat;", "f", "Ljava/text/SimpleDateFormat;", "dsf", "<init>", "(Ljava/lang/String;Lcom/xiaomi/hm/health/healthdata/dto/HealthDataType;Lkotlin/Pair;Lkotlin/Pair;Ljava/util/Date;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BpDto {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final HealthDataType subType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final Pair<Integer, Integer> lowValue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final Pair<Integer, Integer> heightValue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private final Date uploadTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final SimpleDateFormat dsf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINESE);

    public BpDto(@NotNull String str, @NotNull HealthDataType healthDataType, @NotNull Pair<Integer, Integer> pair, @NotNull Pair<Integer, Integer> pair2, @Nullable Date date) {
        this.id = str;
        this.subType = healthDataType;
        this.lowValue = pair;
        this.heightValue = pair2;
        this.uploadTime = date;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BpDto copy$default(BpDto bpDto, String str, HealthDataType healthDataType, Pair pair, Pair pair2, Date date, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bpDto.id;
        }
        if ((i & 2) != 0) {
            healthDataType = bpDto.subType;
        }
        HealthDataType healthDataType2 = healthDataType;
        if ((i & 4) != 0) {
            pair = bpDto.lowValue;
        }
        Pair pair3 = pair;
        if ((i & 8) != 0) {
            pair2 = bpDto.heightValue;
        }
        Pair pair4 = pair2;
        if ((i & 16) != 0) {
            date = bpDto.uploadTime;
        }
        return bpDto.copy(str, healthDataType2, pair3, pair4, date);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HealthDataType getSubType() {
        return this.subType;
    }

    @NotNull
    public final Pair<Integer, Integer> component3() {
        return this.lowValue;
    }

    @NotNull
    public final Pair<Integer, Integer> component4() {
        return this.heightValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Date getUploadTime() {
        return this.uploadTime;
    }

    @NotNull
    public final BpDto copy(@NotNull String id, @NotNull HealthDataType subType, @NotNull Pair<Integer, Integer> lowValue, @NotNull Pair<Integer, Integer> heightValue, @Nullable Date uploadTime) {
        return new BpDto(id, subType, lowValue, heightValue, uploadTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BpDto)) {
            return false;
        }
        BpDto bpDto = (BpDto) other;
        return Intrinsics.areEqual(this.id, bpDto.id) && this.subType == bpDto.subType && Intrinsics.areEqual(this.lowValue, bpDto.lowValue) && Intrinsics.areEqual(this.heightValue, bpDto.heightValue) && Intrinsics.areEqual(this.uploadTime, bpDto.uploadTime);
    }

    @NotNull
    public final Pair<Integer, Integer> getHeightValue() {
        return this.heightValue;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final Pair<Integer, Integer> getLowValue() {
        return this.lowValue;
    }

    @NotNull
    public final HealthDataType getSubType() {
        return this.subType;
    }

    @Nullable
    public final Date getUploadTime() {
        return this.uploadTime;
    }

    public int hashCode() {
        int iHashCode = ((((((this.id.hashCode() * 31) + this.subType.hashCode()) * 31) + this.lowValue.hashCode()) * 31) + this.heightValue.hashCode()) * 31;
        Date date = this.uploadTime;
        return iHashCode + (date == null ? 0 : date.hashCode());
    }

    @NotNull
    public String toString() {
        return "BpDto(id='" + this.id + "', subType=" + this.subType + ", lowValue=" + this.lowValue + ", heightValue=" + this.heightValue + ", uploadTime=" + this.dsf.format(this.uploadTime) + ")";
    }
}
