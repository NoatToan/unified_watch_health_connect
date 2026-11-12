package com.ingenic.iwds.datatransactor.elf;

import android.content.Context;
import com.ingenic.iwds.datatransactor.ProviderTransactionModel;

/* JADX INFO: loaded from: classes18.dex */
public class SmsTransactionModel extends ProviderTransactionModel<SmsInfo> {

    public interface SmsTransactionCallback extends ProviderTransactionModel.ProviderTransactionModelCallback<SmsInfo> {
    }

    public SmsTransactionModel(Context context, SmsTransactionCallback smsTransactionCallback, String str) {
        super(context, SmsInfo.CREATOR, smsTransactionCallback, str);
    }
}
