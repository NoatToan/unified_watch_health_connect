package com.ingenic.iwds.datatransactor.elf;

import android.content.Context;
import com.ingenic.iwds.datatransactor.ProviderTransactionModel;

/* JADX INFO: loaded from: classes18.dex */
public class MusicControlTransactionModel extends ProviderTransactionModel<MusicControlInfo> {

    public interface MusicControlTransactionModelCallback extends ProviderTransactionModel.ProviderTransactionModelCallback<MusicControlInfo> {
    }

    public MusicControlTransactionModel(Context context, MusicControlTransactionModelCallback musicControlTransactionModelCallback, String str) {
        super(context, MusicControlInfo.CREATOR, musicControlTransactionModelCallback, str);
    }
}
