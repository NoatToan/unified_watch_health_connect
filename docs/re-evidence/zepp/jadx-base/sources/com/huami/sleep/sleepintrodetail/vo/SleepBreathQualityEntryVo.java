package com.huami.sleep.sleepintrodetail.vo;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\b¨\u0006 "}, d2 = {"Lcom/huami/sleep/sleepintrodetail/vo/SleepBreathQualityEntryVo;", "", "Lcom/huami/sleep/sleepintrodetail/vo/OdiEntryShowType;", "component1", "", "component2", "", "component3", "()Ljava/lang/Integer;", "showType", "text", "odiScore", "copy", "(Lcom/huami/sleep/sleepintrodetail/vo/OdiEntryShowType;Ljava/lang/String;Ljava/lang/Integer;)Lcom/huami/sleep/sleepintrodetail/vo/SleepBreathQualityEntryVo;", "toString", "hashCode", "other", "", "equals", "a", "Lcom/huami/sleep/sleepintrodetail/vo/OdiEntryShowType;", "getShowType", "()Lcom/huami/sleep/sleepintrodetail/vo/OdiEntryShowType;", "b", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "c", "Ljava/lang/Integer;", "getOdiScore", "<init>", "(Lcom/huami/sleep/sleepintrodetail/vo/OdiEntryShowType;Ljava/lang/String;Ljava/lang/Integer;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SleepBreathQualityEntryVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final OdiEntryShowType showType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String text;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer odiScore;

    public SleepBreathQualityEntryVo(@NotNull OdiEntryShowType odiEntryShowType, @NotNull String str, @Nullable Integer num) {
        this.showType = odiEntryShowType;
        this.text = str;
        this.odiScore = num;
    }

    public static /* synthetic */ SleepBreathQualityEntryVo copy$default(SleepBreathQualityEntryVo sleepBreathQualityEntryVo, OdiEntryShowType odiEntryShowType, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            odiEntryShowType = sleepBreathQualityEntryVo.showType;
        }
        if ((i & 2) != 0) {
            str = sleepBreathQualityEntryVo.text;
        }
        if ((i & 4) != 0) {
            num = sleepBreathQualityEntryVo.odiScore;
        }
        return sleepBreathQualityEntryVo.copy(odiEntryShowType, str, num);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OdiEntryShowType getShowType() {
        return this.showType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getOdiScore() {
        return this.odiScore;
    }

    @NotNull
    public final SleepBreathQualityEntryVo copy(@NotNull OdiEntryShowType showType, @NotNull String text, @Nullable Integer odiScore) {
        return new SleepBreathQualityEntryVo(showType, text, odiScore);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepBreathQualityEntryVo)) {
            return false;
        }
        SleepBreathQualityEntryVo sleepBreathQualityEntryVo = (SleepBreathQualityEntryVo) other;
        return this.showType == sleepBreathQualityEntryVo.showType && Intrinsics.areEqual(this.text, sleepBreathQualityEntryVo.text) && Intrinsics.areEqual(this.odiScore, sleepBreathQualityEntryVo.odiScore);
    }

    @Nullable
    public final Integer getOdiScore() {
        return this.odiScore;
    }

    @NotNull
    public final OdiEntryShowType getShowType() {
        return this.showType;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iHashCode = ((this.showType.hashCode() * 31) + this.text.hashCode()) * 31;
        Integer num = this.odiScore;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        return "SleepBreathQualityEntryVo(showType=" + this.showType + ", text=" + this.text + ", odiScore=" + this.odiScore + ")";
    }
}
