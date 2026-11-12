package defpackage;

import android.content.Context;
import com.huawei.health.health.utils.functionsetcard.CardFlowInteractors;
import com.huawei.ui.homehealth.functionsetcard.manager.strategy.CardUpgradeStrategy;
import health.compact.a.SharedPreferenceManager;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class sje extends CardUpgradeStrategy {
    public sje(Context context) {
        super(context);
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.strategy.CardUpgradeStrategy
    public void setCardPosition() {
        this.mCardPosition = SharedPreferenceManager.e(this.mContext, String.valueOf(10000), CardFlowInteractors.CardNameConstants.WEIGHT_CARD.getName());
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.strategy.CardUpgradeStrategy
    public void setCardShowOptions() {
        this.mShowCard = SharedPreferenceManager.e(this.mContext, String.valueOf(10000), "show_weight_card");
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.strategy.CardUpgradeStrategy
    public String getCardId() {
        return CardFlowInteractors.CardNameConstants.WEIGHT_CARD.getName();
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.strategy.CardUpgradeStrategy
    public boolean isEditedPosition(List<Boolean> list) {
        boolean zBooleanValue = list.get(0).booleanValue();
        boolean zBooleanValue2 = list.get(2).booleanValue();
        if (list.get(5).booleanValue()) {
            if (!zBooleanValue || zBooleanValue2) {
                this.mDefaultCardPosition = "3";
            } else {
                this.mDefaultCardPosition = "2";
            }
        } else if (list.get(6).booleanValue() || list.get(7).booleanValue()) {
            this.mDefaultCardPosition = "1";
        } else if (list.get(8).booleanValue()) {
            this.mDefaultCardPosition = "2";
        }
        return judgeDefaultPosition();
    }
}
