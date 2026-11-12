package com.xiaomi.hm.health.healthtag.core.dto;

import android.content.Context;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.BraceletApp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/healthtag/core/dto/StressDataTagType;", "Lcom/xiaomi/hm/health/healthtag/core/dto/HealthDataTagType;", "", "type", "", "getDesc", "STRESS_NIGHTMARE", LogUtil.I, "STRESS_ANGER", "STRESS_NERVOUS", "STRESS_HIGH_INTENSITY_WORK", "STRESS_FIGHTENED", "STRESS_PAIN", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class StressDataTagType extends HealthDataTagType {

    @NotNull
    public static final StressDataTagType INSTANCE = new StressDataTagType();
    public static final int STRESS_ANGER = 2;
    public static final int STRESS_FIGHTENED = 5;
    public static final int STRESS_HIGH_INTENSITY_WORK = 4;
    public static final int STRESS_NERVOUS = 3;
    public static final int STRESS_NIGHTMARE = 1;
    public static final int STRESS_PAIN = 6;

    private StressDataTagType() {
    }

    @Override // com.xiaomi.hm.health.healthtag.core.dto.HealthDataTagType
    @NotNull
    public String getDesc(int type) {
        Context context = BraceletApp.getContext();
        if (type == HealthDataTagType.INSTANCE.getADD()) {
            return context.getResources().getString(R.string.add);
        }
        if (type == 1) {
            return context.getResources().getString(R.string.stress_nightmare);
        }
        if (type == 2) {
            return context.getResources().getString(R.string.stress_anger);
        }
        if (type == 3) {
            return context.getResources().getString(R.string.stress_nervous);
        }
        if (type == 4) {
            return context.getResources().getString(R.string.stress_high_intensity_work);
        }
        if (type == 5) {
            return context.getResources().getString(R.string.stress_fightened);
        }
        return type == 6 ? context.getResources().getString(R.string.stress_pain) : "";
    }
}
