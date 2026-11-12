package com.xiaomi.fit.data.common.data.aireco;

import com.facebook.yrn.manager.YRNOptionsConfig;
import com.mibi.sdk.component.Constants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\u0013\u0010P\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010Q\u001a\u00020R2\b\u0010S\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010T\u001a\u00020\u000fHÖ\u0001J\t\u0010U\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0007\"\u0004\b&\u0010\u0005R&\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R \u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010!\"\u0004\b0\u0010#R\u001a\u00101\u001a\u000202X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u00107\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0011\"\u0004\b9\u0010\u0013R\u001a\u0010:\u001a\u000202X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u00104\"\u0004\b<\u00106R\u001a\u0010=\u001a\u00020>X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001a\u0010C\u001a\u00020DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001a\u0010I\u001a\u00020JX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010N¨\u0006V"}, d2 = {"Lcom/xiaomi/fit/data/common/data/aireco/IntentionDataDto;", "", YRNOptionsConfig.INSTANCE_ID, "", "<init>", "(Ljava/lang/String;)V", "getInstanceId", "()Ljava/lang/String;", "intentionProperty", "Lcom/xiaomi/fit/data/common/data/aireco/IntentionProperty;", "getIntentionProperty", "()Lcom/xiaomi/fit/data/common/data/aireco/IntentionProperty;", "setIntentionProperty", "(Lcom/xiaomi/fit/data/common/data/aireco/IntentionProperty;)V", "intentSource", "", "getIntentSource", "()I", "setIntentSource", "(I)V", "intentionType", "getIntentionType", "setIntentionType", "source", "Lcom/xiaomi/fit/data/common/data/aireco/IntentionSourceData;", "getSource", "()Lcom/xiaomi/fit/data/common/data/aireco/IntentionSourceData;", "setSource", "(Lcom/xiaomi/fit/data/common/data/aireco/IntentionSourceData;)V", "target", "", "Lcom/xiaomi/fit/data/common/data/aireco/IntentionTarget;", "getTarget", "()Ljava/util/List;", "setTarget", "(Ljava/util/List;)V", "intentId", "getIntentId", "setIntentId", "slots", "", "getSlots", "()Ljava/util/Map;", "setSlots", "(Ljava/util/Map;)V", "periodList", "Lcom/xiaomi/fit/data/common/data/aireco/IntentionPeriod;", "getPeriodList", "setPeriodList", "factTime", "", "getFactTime", "()J", "setFactTime", "(J)V", "eventType", "getEventType", "setEventType", "createTime", "getCreateTime", "setCreateTime", "ranking", "Lcom/xiaomi/fit/data/common/data/aireco/IntentionRanking;", "getRanking", "()Lcom/xiaomi/fit/data/common/data/aireco/IntentionRanking;", "setRanking", "(Lcom/xiaomi/fit/data/common/data/aireco/IntentionRanking;)V", Constants.KEY_EXTRA_INFO, "Lcom/xiaomi/fit/data/common/data/aireco/IntentionExtraInfo;", "getExtraInfo", "()Lcom/xiaomi/fit/data/common/data/aireco/IntentionExtraInfo;", "setExtraInfo", "(Lcom/xiaomi/fit/data/common/data/aireco/IntentionExtraInfo;)V", "intentExtra", "Lcom/xiaomi/fit/data/common/data/aireco/IntentionExtra;", "getIntentExtra", "()Lcom/xiaomi/fit/data/common/data/aireco/IntentionExtra;", "setIntentExtra", "(Lcom/xiaomi/fit/data/common/data/aireco/IntentionExtra;)V", "component1", "copy", "equals", "", "other", "hashCode", "toString", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class IntentionDataDto {
    private long createTime;
    private int eventType;

    @NotNull
    private IntentionExtraInfo extraInfo;
    private long factTime;

    @NotNull
    private final String instanceId;

    @NotNull
    private IntentionExtra intentExtra;

    @NotNull
    private String intentId;
    private int intentSource;

    @NotNull
    private IntentionProperty intentionProperty;
    private int intentionType;

    @NotNull
    private List<IntentionPeriod> periodList;

    @NotNull
    private IntentionRanking ranking;

    @NotNull
    private Map<String, String> slots;

    @NotNull
    private IntentionSourceData source;

    @NotNull
    private List<IntentionTarget> target;

    public IntentionDataDto(@NotNull String instanceId) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        this.instanceId = instanceId;
        this.intentionProperty = new IntentionProperty();
        this.source = new IntentionSourceData();
        this.target = new ArrayList();
        this.intentId = "";
        this.slots = new LinkedHashMap();
        this.periodList = new ArrayList();
        this.ranking = new IntentionRanking();
        this.extraInfo = new IntentionExtraInfo();
        this.intentExtra = new IntentionExtra();
    }

    public static /* synthetic */ IntentionDataDto copy$default(IntentionDataDto intentionDataDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = intentionDataDto.instanceId;
        }
        return intentionDataDto.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getInstanceId() {
        return this.instanceId;
    }

    @NotNull
    public final IntentionDataDto copy(@NotNull String instanceId) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        return new IntentionDataDto(instanceId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof IntentionDataDto) && Intrinsics.areEqual(this.instanceId, ((IntentionDataDto) other).instanceId);
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final int getEventType() {
        return this.eventType;
    }

    @NotNull
    public final IntentionExtraInfo getExtraInfo() {
        return this.extraInfo;
    }

    public final long getFactTime() {
        return this.factTime;
    }

    @NotNull
    public final String getInstanceId() {
        return this.instanceId;
    }

    @NotNull
    public final IntentionExtra getIntentExtra() {
        return this.intentExtra;
    }

    @NotNull
    public final String getIntentId() {
        return this.intentId;
    }

    public final int getIntentSource() {
        return this.intentSource;
    }

    @NotNull
    public final IntentionProperty getIntentionProperty() {
        return this.intentionProperty;
    }

    public final int getIntentionType() {
        return this.intentionType;
    }

    @NotNull
    public final List<IntentionPeriod> getPeriodList() {
        return this.periodList;
    }

    @NotNull
    public final IntentionRanking getRanking() {
        return this.ranking;
    }

    @NotNull
    public final Map<String, String> getSlots() {
        return this.slots;
    }

    @NotNull
    public final IntentionSourceData getSource() {
        return this.source;
    }

    @NotNull
    public final List<IntentionTarget> getTarget() {
        return this.target;
    }

    public int hashCode() {
        return this.instanceId.hashCode();
    }

    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    public final void setEventType(int i) {
        this.eventType = i;
    }

    public final void setExtraInfo(@NotNull IntentionExtraInfo intentionExtraInfo) {
        Intrinsics.checkNotNullParameter(intentionExtraInfo, "<set-?>");
        this.extraInfo = intentionExtraInfo;
    }

    public final void setFactTime(long j) {
        this.factTime = j;
    }

    public final void setIntentExtra(@NotNull IntentionExtra intentionExtra) {
        Intrinsics.checkNotNullParameter(intentionExtra, "<set-?>");
        this.intentExtra = intentionExtra;
    }

    public final void setIntentId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.intentId = str;
    }

    public final void setIntentSource(int i) {
        this.intentSource = i;
    }

    public final void setIntentionProperty(@NotNull IntentionProperty intentionProperty) {
        Intrinsics.checkNotNullParameter(intentionProperty, "<set-?>");
        this.intentionProperty = intentionProperty;
    }

    public final void setIntentionType(int i) {
        this.intentionType = i;
    }

    public final void setPeriodList(@NotNull List<IntentionPeriod> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.periodList = list;
    }

    public final void setRanking(@NotNull IntentionRanking intentionRanking) {
        Intrinsics.checkNotNullParameter(intentionRanking, "<set-?>");
        this.ranking = intentionRanking;
    }

    public final void setSlots(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.slots = map;
    }

    public final void setSource(@NotNull IntentionSourceData intentionSourceData) {
        Intrinsics.checkNotNullParameter(intentionSourceData, "<set-?>");
        this.source = intentionSourceData;
    }

    public final void setTarget(@NotNull List<IntentionTarget> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.target = list;
    }

    @NotNull
    public String toString() {
        return "IntentionDataDto(instanceId=" + this.instanceId + ")";
    }
}
