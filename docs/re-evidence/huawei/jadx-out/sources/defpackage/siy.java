package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.health.health.utils.functionsetcard.CardFlowInteractors;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.functionsetcard.manager.strategy.CardUpgradeStrategy;
import health.compact.a.SharedPreferenceManager;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class siy extends CardUpgradeStrategy {
    public siy(Context context) {
        super(context);
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.strategy.CardUpgradeStrategy
    public void setCardPosition() {
        this.mCardPosition = SharedPreferenceManager.e(this.mContext, String.valueOf(10000), CardFlowInteractors.CardNameConstants.PHYSIOLOGICAL_CYCLE_CARD.getName());
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.strategy.CardUpgradeStrategy
    public void setCardShowOptions() {
        this.mShowCard = SharedPreferenceManager.e(this.mContext, String.valueOf(10000), "show_physiological_cycle_card");
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.strategy.CardUpgradeStrategy
    public int getShowFlag(List<Boolean> list) {
        if (list == null || list.size() < 9) {
            return 0;
        }
        String strE = SharedPreferenceManager.e(this.mContext, String.valueOf(10000), "show_physiological_cycle_card");
        if (TextUtils.isEmpty(strE)) {
            strE = SharedPreferenceManager.e(this.mContext, String.valueOf(10000), "show_physiological_cycle_card_for_personal_SWITCH");
            if (TextUtils.isEmpty(strE)) {
                strE = SharedPreferenceManager.e(this.mContext, String.valueOf(10000), "show_physiological_cycle_card_for_personal_information");
            }
        }
        if (list.get(5).booleanValue()) {
            return (!"".equals(strE) && TRUE.equals(strE)) ? 1 : 2;
        }
        return (list.get(6).booleanValue() || list.get(7).booleanValue() || list.get(8).booleanValue()) ? 2 : 0;
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.strategy.CardUpgradeStrategy
    public String getCardId() {
        return CardFlowInteractors.CardNameConstants.PHYSIOLOGICAL_CYCLE_CARD.getName();
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.strategy.CardUpgradeStrategy
    public boolean isEditedPosition(List<Boolean> list) {
        boolean zBooleanValue = list.get(0).booleanValue();
        boolean zBooleanValue2 = list.get(2).booleanValue();
        boolean zBooleanValue3 = list.get(1).booleanValue();
        boolean zBooleanValue4 = list.get(3).booleanValue();
        boolean zBooleanValue5 = list.get(4).booleanValue();
        if (list.get(5).booleanValue()) {
            if (isEmptyPosition()) {
                return false;
            }
            a(zBooleanValue, zBooleanValue3, zBooleanValue2, zBooleanValue4, zBooleanValue5);
        } else {
            if (!list.get(6).booleanValue() && !list.get(7).booleanValue() && !list.get(8).booleanValue()) {
            }
            return false;
        }
        try {
            if (isEmptyPosition() || Integer.parseInt(this.mCardPosition) < 1000) {
                return judgeDefaultPosition();
            }
            return false;
        } catch (NumberFormatException unused) {
            LogUtil.e("PhysiologicalCycleCardStrategy", "isEditedPosition error");
        }
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.strategy.CardUpgradeStrategy
    public boolean isEditedShowStatus() {
        return !"".equals(this.mShowCard);
    }

    private void a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        if (!z) {
            if (z4 && z5) {
                this.mDefaultCardPosition = "6";
                return;
            } else if (z4 || z5) {
                this.mDefaultCardPosition = "7";
                return;
            } else {
                this.mDefaultCardPosition = "8";
                return;
            }
        }
        if (z2 && z3) {
            this.mDefaultCardPosition = "6";
            return;
        }
        if (z2) {
            this.mDefaultCardPosition = "5";
        } else if (z3) {
            this.mDefaultCardPosition = "4";
        } else {
            this.mDefaultCardPosition = "3";
        }
    }
}
