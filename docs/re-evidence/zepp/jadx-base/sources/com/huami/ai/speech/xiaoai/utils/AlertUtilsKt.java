package com.huami.ai.speech.xiaoai.utils;

import com.huami.ai.entity.alert.AlertStatus;
import com.xiaomi.ai.api.Alerts;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lcom/huami/ai/entity/alert/AlertStatus;", "Lcom/xiaomi/ai/api/Alerts$AlertStatus;", "convertToXiaoAiStatus", "speech-xiaoai_release"}, k = 2, mv = {1, 5, 1})
public final class AlertUtilsKt {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AlertStatus.values().length];
            iArr[AlertStatus.ON.ordinal()] = 1;
            iArr[AlertStatus.OFF.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final Alerts.AlertStatus convertToXiaoAiStatus(@NotNull AlertStatus alertStatus) {
        int i = WhenMappings.$EnumSwitchMapping$0[alertStatus.ordinal()];
        if (i == 1) {
            return Alerts.AlertStatus.ON;
        }
        if (i == 2) {
            return Alerts.AlertStatus.OFF;
        }
        throw new NoWhenBranchMatchedException();
    }
}
