package com.ingenic.iwds.datatransactor.elf;

import android.content.Context;
import com.ingenic.iwds.datatransactor.ProviderTransactionModel;

/* JADX INFO: loaded from: classes18.dex */
public class ScheduleTransactionModel extends ProviderTransactionModel<ScheduleInfo> {

    public interface ScheduleTransactionModelCallback extends ProviderTransactionModel.ProviderTransactionModelCallback<ScheduleInfo> {
    }

    public ScheduleTransactionModel(Context context, ScheduleTransactionModelCallback scheduleTransactionModelCallback, String str) {
        super(context, ScheduleInfo.CREATOR, scheduleTransactionModelCallback, str);
    }
}
