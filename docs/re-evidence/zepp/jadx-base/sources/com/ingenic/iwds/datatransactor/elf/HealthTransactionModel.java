package com.ingenic.iwds.datatransactor.elf;

import android.content.Context;
import com.ingenic.iwds.datatransactor.ProviderTransactionModel;

/* JADX INFO: loaded from: classes18.dex */
public class HealthTransactionModel extends ProviderTransactionModel<HealthInfo> {

    public interface HealthTransactionModelCallback extends ProviderTransactionModel.ProviderTransactionModelCallback<HealthInfo> {
    }

    public HealthTransactionModel(Context context, HealthTransactionModelCallback healthTransactionModelCallback, String str) {
        super(context, HealthInfo.CREATOR, healthTransactionModelCallback, str);
    }
}
