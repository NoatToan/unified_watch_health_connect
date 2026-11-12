package com.huami.sleep.model;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.bloodoxygen.ui.view.BloodOxygenStatisticsView;
import com.huami.sleep.R;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/huami/sleep/model/BreathQualityRiskLevel;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "NORMAL", "LOW", "MEDIUM", "HIGH", "DATA_DEFICIENT", "sleep_release"}, k = 1, mv = {1, 5, 1})
public enum BreathQualityRiskLevel {
    NORMAL,
    LOW,
    MEDIUM,
    HIGH,
    DATA_DEFICIENT;


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0004J1\u0010\r\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004¨\u0006\u0013"}, d2 = {"Lcom/huami/sleep/model/BreathQualityRiskLevel$Companion;", "", "", "wearHintCode", "Lcom/huami/sleep/model/BreathQualityRiskLevel;", "getByCodeValue", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "riskLevel", "", "getTitleDesc", "getTitleColor", "score", "getHintDesc", "(Landroid/content/Context;Lcom/huami/sleep/model/BreathQualityRiskLevel;ILjava/lang/Integer;)Ljava/lang/String;", FirebaseAnalytics.Param.LEVEL, "getColor", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[BreathQualityRiskLevel.values().length];
                iArr[BreathQualityRiskLevel.NORMAL.ordinal()] = 1;
                iArr[BreathQualityRiskLevel.LOW.ordinal()] = 2;
                iArr[BreathQualityRiskLevel.MEDIUM.ordinal()] = 3;
                iArr[BreathQualityRiskLevel.HIGH.ordinal()] = 4;
                iArr[BreathQualityRiskLevel.DATA_DEFICIENT.ordinal()] = 5;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final BreathQualityRiskLevel getByCodeValue(int wearHintCode) {
            switch (wearHintCode) {
                case 1:
                case 5:
                    return BreathQualityRiskLevel.NORMAL;
                case 2:
                    return BreathQualityRiskLevel.LOW;
                case 3:
                    return BreathQualityRiskLevel.MEDIUM;
                case 4:
                    return BreathQualityRiskLevel.HIGH;
                case 6:
                    return BreathQualityRiskLevel.DATA_DEFICIENT;
                default:
                    return null;
            }
        }

        public final int getColor(@NotNull Context context, @Nullable BreathQualityRiskLevel level) {
            int i = level == null ? -1 : WhenMappings.$EnumSwitchMapping$0[level.ordinal()];
            if (i == 1) {
                return ContextCompat.getColor(context, R.color.s20);
            }
            if (i == 2) {
                return ContextCompat.getColor(context, R.color.s33);
            }
            if (i != 3) {
                return i != 4 ? ContextCompat.getColor(context, R.color.transparent) : ContextCompat.getColor(context, R.color.s51);
            }
            return ContextCompat.getColor(context, R.color.s31);
        }

        @NotNull
        public final String getHintDesc(@NotNull Context context, @Nullable BreathQualityRiskLevel riskLevel, int score, @Nullable Integer wearHintCode) {
            String string;
            int i = riskLevel == null ? -1 : WhenMappings.$EnumSwitchMapping$0[riskLevel.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return context.getResources().getQuantityString(R.plurals.risk_level_low_more_hour_tip_short, score, Integer.valueOf(score));
                }
                if (i == 3) {
                    return context.getResources().getQuantityString(R.plurals.risk_level_medium_more_hour_tip_short, score, Integer.valueOf(score));
                }
                if (i != 4) {
                    return i != 5 ? "" : context.getResources().getString(R.string.less_score_less_hour_tip);
                }
                return context.getString(R.string.risk_level_high_more_hour_tip_short);
            }
            if (wearHintCode != null && wearHintCode.intValue() == 1) {
                string = context.getResources().getQuantityString(R.plurals.risk_level_normal_more_hour_tip_short, score, Integer.valueOf(score));
            } else {
                if (wearHintCode == null || wearHintCode.intValue() != 5) {
                    return "";
                }
                string = context.getResources().getString(R.string.more_score_less_hour_tip);
            }
            return string;
        }

        public final int getTitleColor(@NotNull Context context, @Nullable BreathQualityRiskLevel riskLevel) {
            int i = riskLevel == null ? -1 : WhenMappings.$EnumSwitchMapping$0[riskLevel.ordinal()];
            if (i == 2) {
                return ContextCompat.getColor(context, R.color.s33);
            }
            if (i != 3) {
                return i != 4 ? ContextCompat.getColor(context, R.color.s1) : ContextCompat.getColor(context, R.color.s51);
            }
            return ContextCompat.getColor(context, R.color.s31);
        }

        @NotNull
        public final String getTitleDesc(@NotNull Context context, @Nullable BreathQualityRiskLevel riskLevel) {
            int i = riskLevel == null ? -1 : WhenMappings.$EnumSwitchMapping$0[riskLevel.ordinal()];
            if (i == 1) {
                return context.getResources().getString(R.string.risk_level_normal);
            }
            if (i == 2) {
                return context.getResources().getString(R.string.risk_level_low);
            }
            if (i == 3) {
                return context.getResources().getString(R.string.risk_level_medium);
            }
            if (i != 4) {
                return i != 5 ? BloodOxygenStatisticsView.INVALID : context.getResources().getString(R.string.data_deficiencies);
            }
            return context.getResources().getString(R.string.risk_level_high);
        }
    }
}
