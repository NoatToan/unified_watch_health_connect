package com.ingenic.iwds.datatransactor.elf;

import android.content.Context;
import com.ingenic.iwds.datatransactor.ProviderTransactionModel;

/* JADX INFO: loaded from: classes18.dex */
public class SyncTimeTransactionModel extends ProviderTransactionModel<SyncTimeInfo> {

    public interface SyncTimeTransactionModelCallback extends ProviderTransactionModel.ProviderTransactionModelCallback<SyncTimeInfo> {
    }

    public SyncTimeTransactionModel(Context context, SyncTimeTransactionModelCallback syncTimeTransactionModelCallback, String str) {
        super(context, SyncTimeInfo.CREATOR, syncTimeTransactionModelCallback, str);
    }
}
