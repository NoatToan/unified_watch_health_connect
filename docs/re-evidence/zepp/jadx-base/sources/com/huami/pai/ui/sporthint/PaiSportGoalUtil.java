package com.huami.pai.ui.sporthint;

import android.content.Context;
import com.huami.pai.lib.R;
import com.huami.pai.vo.PAIDataVo;
import com.huami.pai_service.PaiStatuInfo;
import com.huami.pai_service.PaiStatusProgress;
import com.huami.pai_service.PaiStatusSuccess;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u001e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002J\u001e\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002J \u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u0002¨\u0006\u0019"}, d2 = {"Lcom/huami/pai/ui/sporthint/PaiSportGoalUtil;", "", "", Constant.PAI_KEY_DAILY_PAI, "tp", "Lcom/huami/pai/ui/sporthint/PaiSportGoalResult;", "getV1", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/pai_service/PaiStatuInfo;", "getPaiStatusInfo", "Lcom/huami/pai/ui/sporthint/PaiSportType;", "sportType", Constant.PAI_KEY_MAX_HR, "rhr", "getV2", "Lcom/huami/pai/vo/PAIDataVo;", "pai", "targetPai", "v2", "getV3ByPaiVo", "time", "getV4ByPaiVo", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class PaiSportGoalUtil {

    @NotNull
    public static final PaiSportGoalUtil INSTANCE = new PaiSportGoalUtil();

    private PaiSportGoalUtil() {
    }

    public static /* synthetic */ int getV4ByPaiVo$default(PaiSportGoalUtil paiSportGoalUtil, PAIDataVo pAIDataVo, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 120;
        }
        return paiSportGoalUtil.getV4ByPaiVo(pAIDataVo, i, i2);
    }

    @NotNull
    public final PaiStatuInfo getPaiStatusInfo(@NotNull Context context, int dp, int tp) {
        if (dp >= 75) {
            return new PaiStatusSuccess(context.getString(R.string.pai_already_get_all_pai_short), 75, context.getString(R.string.pai_value_today, "75"));
        }
        int i = 30 - tp;
        if (i <= 0 && (i = 50 - tp) <= 0) {
            i = 100 - tp;
            if (i <= 0) {
                return new PaiStatusSuccess(context.getString(R.string.pai_already_get_100_short), dp, context.getString(R.string.pai_value_today, String.valueOf(dp)));
            }
            int i2 = 75 - dp;
            if (i > i2) {
                return new PaiStatusProgress(context.getString(R.string.pai_distance_data_day_short, Integer.valueOf(i2)), dp, i2, context.getString(R.string.pai_value_today, String.valueOf(dp)));
            }
        }
        return new PaiStatusProgress(context.getString(R.string.pai_distance_data_short, Integer.valueOf(i)), dp, i, context.getString(R.string.pai_value_today, String.valueOf(dp)));
    }

    @NotNull
    public final PaiSportGoalResult getV1(int dp, int tp) {
        int i;
        if (dp >= 75) {
            return new PaiSportGoalResult.PaiReachGoal(R.string.pai_already_get_all_pai);
        }
        int i2 = 30 - tp;
        if (i2 > 0) {
            i = 30;
        } else {
            i2 = 50 - tp;
            if (i2 > 0) {
                i = 50;
            } else {
                i2 = 100 - tp;
                if (i2 <= 0) {
                    return new PaiSportGoalResult.PaiReachGoal(R.string.pai_already_get_100);
                }
                int i3 = 75 - dp;
                if (i2 > i3) {
                    return new PaiSportGoalResult.PaiRestGoal(i3, tp + i3);
                }
                i = 100;
            }
        }
        return new PaiSportGoalResult.PaiProgressGoal(i2, i);
    }

    public final int getV2(@NotNull PaiSportType sportType, int maxHr, int rhr) {
        return (int) (((((((double) sportType.getMet()) * 7.67d) - 5.46d) * ((double) (maxHr - rhr))) / 100.0d) + ((double) rhr));
    }

    public final int getV3ByPaiVo(@NotNull PAIDataVo pai, int targetPai, int v2) {
        double d = pai.getGd() == 0 ? 9.8556E-5d : 1.01817E-4d;
        double d2 = pai.getGd() == 0 ? 5.0167d : 5.7808d;
        double d3 = pai.getGd() == 0 ? 34.2325d : 41.9374d;
        double d4 = pai.getGd() == 0 ? 9.7581d : 9.8382d;
        double d5 = pai.getGd() == 0 ? 36.0d : 45.0d;
        double maxHr = (((double) (pai.getMaxHr() - pai.getRestHr())) * 0.2d) + ((double) pai.getRestHr());
        double d6 = 1;
        double d7 = d5 - d3;
        double d8 = ((double) 100) * d4;
        return Math.abs((int) Math.ceil(((-Math.log(d6 - ((((double) targetPai) * d7) / d8))) - (-Math.log(d6 - ((((double) ((int) pai.getTp())) * d7) / d8)))) / (d * (Math.exp(d2 * ((((double) v2) - maxHr) / (((double) pai.getMaxHr()) - maxHr))) - d6))));
    }

    public final int getV4ByPaiVo(@NotNull PAIDataVo pai, int v2, int time) {
        int tp = (int) pai.getTp();
        double d = pai.getGd() == 0 ? 9.8556E-5d : 1.01817E-4d;
        double d2 = pai.getGd() == 0 ? 5.0167d : 5.7808d;
        double d3 = pai.getGd() == 0 ? 34.2325d : 41.9374d;
        double d4 = pai.getGd() == 0 ? 9.7581d : 9.8382d;
        double d5 = 1;
        double d6 = tp;
        double d7 = (pai.getGd() == 0 ? 36.0d : 45.0d) - d3;
        double d8 = d6 * d7;
        double d9 = ((double) 100) * d4;
        double d10 = -Math.log(d5 - (d8 / d9));
        double maxHr = (((double) (pai.getMaxHr() - pai.getRestHr())) * 0.2d) + ((double) pai.getRestHr());
        return (int) Math.abs(((d9 * (d5 - Math.exp(-((((double) time) * (d * (Math.exp(d2 * ((((double) v2) - maxHr) / (((double) pai.getMaxHr()) - maxHr))) - d5))) + d10)))) / d7) - d6);
    }
}
