package com.ingenic.iwds.datatransactor.elf;

import android.content.Context;
import com.ingenic.iwds.datatransactor.ProviderTransactionModel;

/* JADX INFO: loaded from: classes18.dex */
public class CalllogTransactionModel extends ProviderTransactionModel<CalllogInfo> {

    public interface CalllogTransactionCallback extends ProviderTransactionModel.ProviderTransactionModelCallback<CalllogInfo> {
    }

    public CalllogTransactionModel(Context context, CalllogTransactionCallback calllogTransactionCallback, String str) {
        super(context, CalllogInfo.CREATOR, calllogTransactionCallback, str);
    }
}
