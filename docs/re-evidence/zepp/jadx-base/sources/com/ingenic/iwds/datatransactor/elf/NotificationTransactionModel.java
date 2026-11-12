package com.ingenic.iwds.datatransactor.elf;

import android.content.Context;
import com.ingenic.iwds.datatransactor.ProviderTransactionModel;

/* JADX INFO: loaded from: classes18.dex */
public class NotificationTransactionModel extends ProviderTransactionModel<NotificationInfo> {

    public interface NotificationTransactionModelCallback extends ProviderTransactionModel.ProviderTransactionModelCallback<NotificationInfo> {
    }

    public NotificationTransactionModel(Context context, NotificationTransactionModelCallback notificationTransactionModelCallback, String str) {
        super(context, NotificationInfo.CREATOR, notificationTransactionModelCallback, str);
    }
}
