package com.ingenic.iwds.datatransactor.elf;

import android.content.Context;
import com.ingenic.iwds.datatransactor.ProviderTransactionModel;

/* JADX INFO: loaded from: classes18.dex */
public class TimeAdditionalTransactionModel extends ProviderTransactionModel<TimeAdditionalInfo> {

    public interface TimeAdditionalInfoTransactionModelCallback extends ProviderTransactionModel.ProviderTransactionModelCallback<TimeAdditionalInfo> {
    }

    public TimeAdditionalTransactionModel(Context context, TimeAdditionalInfoTransactionModelCallback timeAdditionalInfoTransactionModelCallback, String str) {
        super(context, TimeAdditionalInfo.CREATOR, timeAdditionalInfoTransactionModelCallback, str);
    }
}
