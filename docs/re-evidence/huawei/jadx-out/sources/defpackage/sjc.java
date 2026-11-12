package defpackage;

import android.content.Context;
import com.huawei.health.health.utils.functionsetcard.CardFlowInteractors;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.functionsetcard.manager.strategy.CardUpgradeStrategy;
import health.compact.a.SharedPreferenceManager;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class sjc extends CardUpgradeStrategy {
    public sjc(Context context) {
        super(context);
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.strategy.CardUpgradeStrategy
    public void setCardPosition() {
        this.mCardPosition = SharedPreferenceManager.e(this.mContext, String.valueOf(10000), CardFlowInteractors.CardNameConstants.BLOODPRESSURE_CARD.getName());
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.strategy.CardUpgradeStrategy
    public void setCardShowOptions() {
        this.mShowCard = SharedPreferenceManager.e(this.mContext, String.valueOf(10000), "show_blood_pressure_card");
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.strategy.CardUpgradeStrategy
    public String getCardId() {
        return CardFlowInteractors.CardNameConstants.BLOODPRESSURE_CARD.getName();
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.strategy.CardUpgradeStrategy
    public boolean isEditedPosition(List<Boolean> list) {
        boolean zBooleanValue = list.get(0).booleanValue();
        if (list.get(5).booleanValue()) {
            if (zBooleanValue) {
                return false;
            }
            this.mDefaultCardPosition = "7";
        } else if (list.get(6).booleanValue()) {
            if (zBooleanValue) {
                return false;
            }
            this.mDefaultCardPosition = "5";
        } else if (list.get(7).booleanValue()) {
            if (zBooleanValue) {
                return false;
            }
            this.mDefaultCardPosition = "4";
        } else if (list.get(8).booleanValue()) {
            if (zBooleanValue) {
                return false;
            }
            this.mDefaultCardPosition = "5";
        }
        try {
            if (isEmptyPosition() || Integer.parseInt(this.mCardPosition) < 1000) {
                return judgeDefaultPosition();
            }
            return false;
        } catch (NumberFormatException unused) {
            LogUtil.e("BloodPressureCardStrategy", "isEditedPosition error");
            return false;
        }
    }
}
