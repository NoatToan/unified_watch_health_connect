package com.xiaomi.fitness.sport_manager.recorder.manager.bean;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.sport_manager.utils.BeanSportUtils;
import com.xiaomi.fitness.sport_manager_export.data.FinishSportData;
import com.xiaomi.fitness.sport_manager_export.data.SportData;
import com.xiaomi.fitness.sport_manager_export.data.SportResponseExtraData;
import com.xiaomi.onetrack.api.c;
import defpackage.wyc;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\bH\n\u0002\u0010\u0005\n\u0002\b\t\u0018\u0000 h2\u00020\u0001:\u0001hB\u0007¢\u0006\u0004\bg\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0004J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0011J\u0017\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u00020\u000e8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\u0011R\"\u0010 \u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010\u0011R\"\u0010#\u001a\u00020\u000e8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001e\"\u0004\b%\u0010\u0011R\"\u0010&\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010\u0011R\"\u0010)\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001c\u001a\u0004\b*\u0010\u001e\"\u0004\b+\u0010\u0011R\"\u0010,\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u001c\u001a\u0004\b-\u0010\u001e\"\u0004\b.\u0010\u0011R\"\u0010/\u001a\u00020\u000e8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u001c\u001a\u0004\b0\u0010\u001e\"\u0004\b1\u0010\u0011R\"\u00102\u001a\u00020\u000e8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\u001c\u001a\u0004\b3\u0010\u001e\"\u0004\b4\u0010\u0011R\"\u00105\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010\u001c\u001a\u0004\b6\u0010\u001e\"\u0004\b7\u0010\u0011R\"\u00108\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010\u001c\u001a\u0004\b9\u0010\u001e\"\u0004\b:\u0010\u0011R\u0016\u0010;\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010\u001cR\"\u0010<\u001a\u00020\u000e8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010\u001c\u001a\u0004\b=\u0010\u001e\"\u0004\b>\u0010\u0011R\"\u0010?\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010\u001c\u001a\u0004\b@\u0010\u001e\"\u0004\bA\u0010\u0011R\"\u0010B\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010\u001c\u001a\u0004\bC\u0010\u001e\"\u0004\bD\u0010\u0011R\"\u0010E\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010\u001c\u001a\u0004\bF\u0010\u001e\"\u0004\bG\u0010\u0011R\"\u0010H\u001a\u00020\u000e8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010\u001c\u001a\u0004\bI\u0010\u001e\"\u0004\bJ\u0010\u0011R\"\u0010K\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010\u001c\u001a\u0004\bL\u0010\u001e\"\u0004\bM\u0010\u0011R\"\u0010N\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010\u001c\u001a\u0004\bO\u0010\u001e\"\u0004\bP\u0010\u0011R\"\u0010Q\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010\u001c\u001a\u0004\bR\u0010\u001e\"\u0004\bS\u0010\u0011R\"\u0010T\u001a\u00020\u000e8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010\u001c\u001a\u0004\bU\u0010\u001e\"\u0004\bV\u0010\u0011R\"\u0010W\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010\u001c\u001a\u0004\bX\u0010\u001e\"\u0004\bY\u0010\u0011R\"\u0010Z\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010\u001c\u001a\u0004\b[\u0010\u001e\"\u0004\b\\\u0010\u0011R\"\u0010]\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010\u001c\u001a\u0004\b^\u0010\u001e\"\u0004\b_\u0010\u0011R\"\u0010a\u001a\u00020`8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010f¨\u0006i"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/recorder/manager/bean/BeanDataProcesser;", "Lwyc;", "", CervicalMucusRecord.Appearance.CLEAR, "()V", "Lcom/xiaomi/fitness/sport_manager_export/data/SportData;", "sportRecordData", "onSportRecordData", "(Lcom/xiaomi/fitness/sport_manager_export/data/SportData;)V", "", "validSport", "sportReportData", "onSportReportData", "(ZLcom/xiaomi/fitness/sport_manager_export/data/SportData;)V", "", "pauseTimeStamp", "onSportPaused", "(I)V", "restartTimeStamp", "onSportRestart", "onSportStart", "adjustmentDis", "onAdjustmentDis", "Lcom/xiaomi/fitness/sport_manager_export/data/FinishSportData;", "value", "setDegrees", "(Lcom/xiaomi/fitness/sport_manager_export/data/FinishSportData;)V", "forefootRatio", "I", "getForefootRatio", "()I", "setForefootRatio", "forefootCount", "getForefootCount", "setForefootCount", "heelRatio", "getHeelRatio", "setHeelRatio", "heelCount", "getHeelCount", "setHeelCount", "footCount", "getFootCount", "setFootCount", "mainRunStyleCount", "getMainRunStyleCount", "setMainRunStyleCount", "mainRunStyle", "getMainRunStyle", "setMainRunStyle", "avgImpact", "getAvgImpact", "setAvgImpact", "maxImpact", "getMaxImpact", "setMaxImpact", "totalImpact", "getTotalImpact", "setTotalImpact", "impactCount", "avgOnGround", "getAvgOnGround", "setAvgOnGround", "minOnGround", "getMinOnGround", "setMinOnGround", "totalOnGround", "getTotalOnGround", "setTotalOnGround", "onGroundCount", "getOnGroundCount", "setOnGroundCount", "avgOffGround", "getAvgOffGround", "setAvgOffGround", "maxOffGround", "getMaxOffGround", "setMaxOffGround", "totalOffGround", "getTotalOffGround", "setTotalOffGround", "offGroundCount", "getOffGroundCount", "setOffGroundCount", "avgOnOffRatio", "getAvgOnOffRatio", "setAvgOnOffRatio", "totalOnOffRatio", "getTotalOnOffRatio", "setTotalOnOffRatio", "minOnOffRatio", "getMinOnOffRatio", "setMinOnOffRatio", "onOffRatioCount", "getOnOffRatioCount", "setOnOffRatioCount", "", "degree", c.f13755a, "getDegree", "()B", "setDegree", "(B)V", "<init>", "Companion", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BeanDataProcesser implements wyc {

    @NotNull
    public static final String TAG = "BeanDataProcesserTAG";
    private int avgImpact;
    private int avgOffGround;
    private int avgOnGround;
    private int avgOnOffRatio;
    private byte degree;
    private int footCount;
    private int forefootCount;
    private int forefootRatio;
    private int heelCount;
    private int heelRatio;
    private int impactCount;
    private int mainRunStyle;
    private int mainRunStyleCount;
    private int maxImpact;
    private int maxOffGround;
    private int minOnGround = Integer.MAX_VALUE;
    private int minOnOffRatio = Integer.MAX_VALUE;
    private int offGroundCount;
    private int onGroundCount;
    private int onOffRatioCount;
    private int totalImpact;
    private int totalOffGround;
    private int totalOnGround;
    private int totalOnOffRatio;

    private final void clear() {
        this.forefootRatio = 0;
        this.forefootCount = 0;
        this.heelRatio = 0;
        this.heelCount = 0;
        this.footCount = 0;
        this.mainRunStyleCount = 0;
        this.avgImpact = 0;
        this.maxImpact = 0;
        this.totalImpact = 0;
        this.impactCount = 0;
        this.avgOnGround = 0;
        this.totalOnGround = 0;
        this.onGroundCount = 0;
        this.avgOffGround = 0;
        this.maxOffGround = 0;
        this.totalOffGround = 0;
        this.offGroundCount = 0;
        this.avgOnOffRatio = 0;
        this.totalOnOffRatio = 0;
        this.minOnOffRatio = Integer.MAX_VALUE;
        this.onOffRatioCount = 0;
        this.minOnGround = Integer.MAX_VALUE;
        this.degree = (byte) 0;
    }

    public final int getAvgImpact() {
        int i = this.impactCount;
        if (i != 0) {
            return this.totalImpact / i;
        }
        return 0;
    }

    public final int getAvgOffGround() {
        int i = this.offGroundCount;
        if (i != 0) {
            return this.totalOffGround / i;
        }
        return 0;
    }

    public final int getAvgOnGround() {
        int i = this.onGroundCount;
        if (i != 0) {
            return this.totalOnGround / i;
        }
        return 0;
    }

    public final int getAvgOnOffRatio() {
        int i = this.onOffRatioCount;
        if (i != 0) {
            return this.totalOnOffRatio / i;
        }
        return 0;
    }

    public final byte getDegree() {
        return this.degree;
    }

    public final int getFootCount() {
        return this.footCount;
    }

    public final int getForefootCount() {
        return this.forefootCount;
    }

    public final int getForefootRatio() {
        int i = this.mainRunStyleCount;
        if (i != 0) {
            return (int) ((this.forefootCount / i) * 100);
        }
        return 0;
    }

    public final int getHeelCount() {
        return this.heelCount;
    }

    public final int getHeelRatio() {
        int i = this.mainRunStyleCount;
        if (i != 0) {
            return (int) ((this.heelCount / i) * 100);
        }
        return 0;
    }

    public final int getMainRunStyle() {
        int i = this.footCount;
        if (i == 0 && this.forefootCount == 0 && this.heelCount == 0) {
            return 0;
        }
        int iMax = Math.max(i, Math.max(this.forefootCount, this.heelCount));
        if (iMax == this.footCount) {
            return 1;
        }
        if (iMax == this.forefootCount) {
            return 2;
        }
        return iMax == this.heelCount ? 3 : 0;
    }

    public final int getMainRunStyleCount() {
        return this.mainRunStyleCount;
    }

    public final int getMaxImpact() {
        return this.maxImpact;
    }

    public final int getMaxOffGround() {
        return this.maxOffGround;
    }

    public final int getMinOnGround() {
        return this.minOnGround;
    }

    public final int getMinOnOffRatio() {
        return this.minOnOffRatio;
    }

    public final int getOffGroundCount() {
        return this.offGroundCount;
    }

    public final int getOnGroundCount() {
        return this.onGroundCount;
    }

    public final int getOnOffRatioCount() {
        return this.onOffRatioCount;
    }

    public final int getTotalImpact() {
        return this.totalImpact;
    }

    public final int getTotalOffGround() {
        return this.totalOffGround;
    }

    public final int getTotalOnGround() {
        return this.totalOnGround;
    }

    public final int getTotalOnOffRatio() {
        return this.totalOnOffRatio;
    }

    @Override // defpackage.wyc
    public void onAdjustmentDis(int adjustmentDis) {
    }

    @Override // defpackage.wyc
    public void onSportPaused(int pauseTimeStamp) {
    }

    @Override // defpackage.wyc
    public void onSportRecordData(@Nullable SportData sportRecordData) {
        if (BeanSportUtils.INSTANCE.isBeanSport() && sportRecordData != null) {
            if (sportRecordData.onOffRatio != 0) {
                FitnessLogUtils.d(TAG, "minOnOffRatio:" + this.minOnOffRatio);
                this.minOnOffRatio = Math.min(sportRecordData.onOffRatio, this.minOnOffRatio);
                this.totalOnOffRatio = this.totalOnOffRatio + sportRecordData.onOffRatio;
                this.onOffRatioCount = this.onOffRatioCount + 1;
            }
            int i = sportRecordData.offGround;
            if (i != 0) {
                this.maxOffGround = Math.max(i, this.maxOffGround);
                this.totalOffGround += sportRecordData.offGround;
                this.offGroundCount++;
            }
            int i2 = sportRecordData.onGround;
            if (i2 != 0) {
                this.minOnGround = Math.min(i2, this.minOnGround);
                this.totalOnGround += sportRecordData.onGround;
                this.onGroundCount++;
            }
            int i3 = sportRecordData.impact;
            if (i3 != 0) {
                this.maxImpact = Math.max(i3, this.maxImpact);
                this.totalImpact += sportRecordData.impact;
                this.impactCount++;
            }
            int i4 = sportRecordData.mainRunStyle;
            if (i4 == 1) {
                this.footCount++;
                this.mainRunStyleCount++;
            } else if (i4 == 2) {
                this.forefootCount++;
                this.mainRunStyleCount++;
            } else if (i4 == 3) {
                this.heelCount++;
                this.mainRunStyleCount++;
            }
            FitnessLogUtils.d(TAG, "onOffRatio:" + sportRecordData.onOffRatio + " , offGround:" + sportRecordData.offGround + " , onGround:" + sportRecordData.onGround + " , impact:" + sportRecordData.impact + " , mainRunStyle:" + i4);
        }
    }

    @Override // defpackage.wyc
    public void onSportReportData(boolean validSport, @Nullable SportData sportReportData) {
    }

    @Override // defpackage.wyc
    public void onSportRestart(int restartTimeStamp) {
    }

    @Override // defpackage.wyc
    public /* bridge */ /* synthetic */ void onSportSegment(int i, int i2) {
        super.onSportSegment(i, i2);
    }

    @Override // defpackage.wyc
    public void onSportStart() {
        clear();
    }

    public final void setAvgImpact(int i) {
        this.avgImpact = i;
    }

    public final void setAvgOffGround(int i) {
        this.avgOffGround = i;
    }

    public final void setAvgOnGround(int i) {
        this.avgOnGround = i;
    }

    public final void setAvgOnOffRatio(int i) {
        this.avgOnOffRatio = i;
    }

    public final void setDegree(byte b2) {
        this.degree = b2;
    }

    public final void setDegrees(@Nullable FinishSportData value) {
        SportResponseExtraData extraData;
        this.degree = (byte) ((value == null || (extraData = value.getExtraData()) == null) ? 0 : extraData.getDegree());
    }

    public final void setFootCount(int i) {
        this.footCount = i;
    }

    public final void setForefootCount(int i) {
        this.forefootCount = i;
    }

    public final void setForefootRatio(int i) {
        this.forefootRatio = i;
    }

    public final void setHeelCount(int i) {
        this.heelCount = i;
    }

    public final void setHeelRatio(int i) {
        this.heelRatio = i;
    }

    public final void setMainRunStyle(int i) {
        this.mainRunStyle = i;
    }

    public final void setMainRunStyleCount(int i) {
        this.mainRunStyleCount = i;
    }

    public final void setMaxImpact(int i) {
        this.maxImpact = i;
    }

    public final void setMaxOffGround(int i) {
        this.maxOffGround = i;
    }

    public final void setMinOnGround(int i) {
        this.minOnGround = i;
    }

    public final void setMinOnOffRatio(int i) {
        this.minOnOffRatio = i;
    }

    public final void setOffGroundCount(int i) {
        this.offGroundCount = i;
    }

    public final void setOnGroundCount(int i) {
        this.onGroundCount = i;
    }

    public final void setOnOffRatioCount(int i) {
        this.onOffRatioCount = i;
    }

    public final void setTotalImpact(int i) {
        this.totalImpact = i;
    }

    public final void setTotalOffGround(int i) {
        this.totalOffGround = i;
    }

    public final void setTotalOnGround(int i) {
        this.totalOnGround = i;
    }

    public final void setTotalOnOffRatio(int i) {
        this.totalOnOffRatio = i;
    }
}
