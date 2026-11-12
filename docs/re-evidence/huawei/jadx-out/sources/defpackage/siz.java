package defpackage;

import android.content.Context;
import com.huawei.health.health.utils.functionsetcard.CardFlowInteractors;
import com.huawei.ui.homehealth.functionsetcard.manager.strategy.CardUpgradeStrategy;
import health.compact.a.SharedPreferenceManager;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class siz extends CardUpgradeStrategy {
    public siz(Context context) {
        super(context);
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.strategy.CardUpgradeStrategy
    public void setCardPosition() {
        this.mCardPosition = SharedPreferenceManager.e(this.mContext, String.valueOf(10000), CardFlowInteractors.CardNameConstants.HEARTRATE_CARD.getName());
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.strategy.CardUpgradeStrategy
    public void setCardShowOptions() {
        this.mShowCard = SharedPreferenceManager.e(this.mContext, String.valueOf(10000), "show_heart_rate_card");
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.strategy.CardUpgradeStrategy
    public String getCardId() {
        return CardFlowInteractors.CardNameConstants.HEARTRATE_CARD.getName();
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.strategy.CardUpgradeStrategy
    public boolean isEditedPosition(List<Boolean> list) {
        boolean zBooleanValue = list.get(0).booleanValue();
        boolean zBooleanValue2 = list.get(1).booleanValue();
        boolean zBooleanValue3 = list.get(2).booleanValue();
        if (list.get(5).booleanValue()) {
            if (!zBooleanValue || zBooleanValue3) {
                this.mDefaultCardPosition = "1";
            } else {
                this.mDefaultCardPosition = "0";
            }
        } else if (list.get(6).booleanValue() || list.get(7).booleanValue()) {
            if (!zBooleanValue || zBooleanValue2) {
                this.mDefaultCardPosition = "3";
            } else {
                this.mDefaultCardPosition = "2";
            }
        } else if (list.get(8).booleanValue()) {
            if (!zBooleanValue || zBooleanValue2) {
                this.mDefaultCardPosition = "4";
            } else {
                this.mDefaultCardPosition = "3";
            }
        }
        return judgeDefaultPosition();
    }
}
