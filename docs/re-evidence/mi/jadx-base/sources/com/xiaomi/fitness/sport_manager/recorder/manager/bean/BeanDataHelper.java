package com.xiaomi.fitness.sport_manager.recorder.manager.bean;

import com.xiaomi.fitness.sport_manager_export.data.FinishSportData;
import com.xiaomi.fitness.sport_manager_export.data.SportResponseExtraData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u001a\u0010\n\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u001a\u0010\u000b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u001a\u0010\f\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u001a\u0010\r\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u001a\u0010\u000e\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0018\u0010\u0014\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0014\u001a\u00020\u0005¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/recorder/manager/bean/BeanDataHelper;", "", "<init>", "()V", "minOnOffRatio", "", "finishSportData", "Lcom/xiaomi/fitness/sport_manager_export/data/FinishSportData;", "beanDataProcesser", "Lcom/xiaomi/fitness/sport_manager/recorder/manager/bean/BeanDataProcesser;", "avgOnOffRatio", "maxOffGround", "avgOffGround", "minOnGround", "avgOnGround", "maxImpact", "avgImpact", "heelRatio", "forefootRatio", "mainRunStyle", "maxFrequency", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BeanDataHelper {

    @NotNull
    public static final BeanDataHelper INSTANCE = new BeanDataHelper();

    private BeanDataHelper() {
    }

    public final int avgImpact(@Nullable FinishSportData finishSportData, @Nullable BeanDataProcesser beanDataProcesser) {
        SportResponseExtraData extraData;
        if (finishSportData != null && (extraData = finishSportData.getExtraData()) != null) {
            return extraData.getAvgImpact();
        }
        if (beanDataProcesser != null) {
            return beanDataProcesser.getAvgImpact();
        }
        return 0;
    }

    public final int avgOffGround(@Nullable FinishSportData finishSportData, @Nullable BeanDataProcesser beanDataProcesser) {
        SportResponseExtraData extraData;
        if (finishSportData != null && (extraData = finishSportData.getExtraData()) != null) {
            return extraData.getAvgOffGround();
        }
        if (beanDataProcesser != null) {
            return beanDataProcesser.getAvgOffGround();
        }
        return 0;
    }

    public final int avgOnGround(@Nullable FinishSportData finishSportData, @Nullable BeanDataProcesser beanDataProcesser) {
        SportResponseExtraData extraData;
        if (finishSportData != null && (extraData = finishSportData.getExtraData()) != null) {
            return extraData.getAvgOnGround();
        }
        if (beanDataProcesser != null) {
            return beanDataProcesser.getAvgOnGround();
        }
        return 0;
    }

    public final int avgOnOffRatio(@Nullable FinishSportData finishSportData, @Nullable BeanDataProcesser beanDataProcesser) {
        SportResponseExtraData extraData;
        if (finishSportData != null && (extraData = finishSportData.getExtraData()) != null) {
            return extraData.getAvgOnOffRatio();
        }
        if (beanDataProcesser != null) {
            return beanDataProcesser.getAvgOnOffRatio();
        }
        return 0;
    }

    public final int forefootRatio(@Nullable FinishSportData finishSportData, @Nullable BeanDataProcesser beanDataProcesser) {
        SportResponseExtraData extraData;
        if (finishSportData != null && (extraData = finishSportData.getExtraData()) != null) {
            return extraData.getForefootRatio();
        }
        if (beanDataProcesser != null) {
            return beanDataProcesser.getForefootRatio();
        }
        return 0;
    }

    public final int heelRatio(@Nullable FinishSportData finishSportData, @Nullable BeanDataProcesser beanDataProcesser) {
        SportResponseExtraData extraData;
        if (finishSportData != null && (extraData = finishSportData.getExtraData()) != null) {
            return extraData.getHeelRatio();
        }
        if (beanDataProcesser != null) {
            return beanDataProcesser.getHeelRatio();
        }
        return 0;
    }

    public final int mainRunStyle(@Nullable FinishSportData finishSportData, @Nullable BeanDataProcesser beanDataProcesser) {
        SportResponseExtraData extraData;
        if (finishSportData != null && (extraData = finishSportData.getExtraData()) != null) {
            return extraData.getMainRunStyle();
        }
        if (beanDataProcesser != null) {
            return beanDataProcesser.getMainRunStyle();
        }
        return 0;
    }

    public final int maxFrequency(@Nullable FinishSportData finishSportData, int maxFrequency) {
        SportResponseExtraData extraData;
        return (finishSportData == null || (extraData = finishSportData.getExtraData()) == null) ? maxFrequency : extraData.getMaxFrequency();
    }

    public final int maxImpact(@Nullable FinishSportData finishSportData, @Nullable BeanDataProcesser beanDataProcesser) {
        SportResponseExtraData extraData;
        if (finishSportData != null && (extraData = finishSportData.getExtraData()) != null) {
            return extraData.getMaxImpact();
        }
        if (beanDataProcesser != null) {
            return beanDataProcesser.getMaxImpact();
        }
        return 0;
    }

    public final int maxOffGround(@Nullable FinishSportData finishSportData, @Nullable BeanDataProcesser beanDataProcesser) {
        SportResponseExtraData extraData;
        if (finishSportData != null && (extraData = finishSportData.getExtraData()) != null) {
            return extraData.getMaxOffGround();
        }
        if (beanDataProcesser != null) {
            return beanDataProcesser.getMaxOffGround();
        }
        return 0;
    }

    public final int minOnGround(@Nullable FinishSportData finishSportData, @Nullable BeanDataProcesser beanDataProcesser) {
        SportResponseExtraData extraData;
        if (finishSportData != null && (extraData = finishSportData.getExtraData()) != null) {
            return extraData.getMinOnGround();
        }
        if ((beanDataProcesser == null || beanDataProcesser.getMinOnGround() != Integer.MAX_VALUE) && beanDataProcesser != null) {
            return beanDataProcesser.getMinOnGround();
        }
        return 0;
    }

    public final int minOnOffRatio(@Nullable FinishSportData finishSportData, @Nullable BeanDataProcesser beanDataProcesser) {
        Integer numValueOf;
        SportResponseExtraData extraData;
        if (finishSportData != null && (extraData = finishSportData.getExtraData()) != null) {
            return extraData.getMinOnOffRatio();
        }
        if (beanDataProcesser == null || beanDataProcesser.getMinOnOffRatio() != Integer.MAX_VALUE) {
            numValueOf = beanDataProcesser != null ? Integer.valueOf(beanDataProcesser.getMinOnOffRatio()) : null;
        } else {
            numValueOf = 0;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
