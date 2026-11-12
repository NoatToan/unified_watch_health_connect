package com.huami.sleep.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lcom/huami/sleep/model/BreathQualityScoreInfo;", "", "isScoreValid", "sleep_release"}, k = 2, mv = {1, 5, 1})
public final class BreathQualityScoreInfoKt {
    public static final boolean isScoreValid(@NotNull BreathQualityScoreInfo breathQualityScoreInfo) {
        int wearHintCode = breathQualityScoreInfo.getWearHintCode();
        return 1 <= wearHintCode && wearHintCode <= 5;
    }
}
