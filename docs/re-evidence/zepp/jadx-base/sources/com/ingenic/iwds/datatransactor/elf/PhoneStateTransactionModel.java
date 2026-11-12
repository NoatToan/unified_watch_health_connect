package com.ingenic.iwds.datatransactor.elf;

import android.content.Context;
import com.ingenic.iwds.datatransactor.ProviderTransactionModel;

/* JADX INFO: loaded from: classes18.dex */
public class PhoneStateTransactionModel extends ProviderTransactionModel<PhoneState> {

    public interface PhoneStateCallback extends ProviderTransactionModel.ProviderTransactionModelCallback<PhoneState> {
    }

    public PhoneStateTransactionModel(Context context, PhoneStateCallback phoneStateCallback, String str) {
        super(context, PhoneState.CREATOR, phoneStateCallback, str);
    }
}
