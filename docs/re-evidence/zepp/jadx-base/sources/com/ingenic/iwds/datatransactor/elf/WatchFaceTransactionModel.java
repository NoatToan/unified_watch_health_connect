package com.ingenic.iwds.datatransactor.elf;

import android.content.Context;
import com.ingenic.iwds.datatransactor.ProviderTransactionModel;

/* JADX INFO: loaded from: classes18.dex */
public class WatchFaceTransactionModel extends ProviderTransactionModel<WatchFaceInfo> {

    public interface WatchFaceTransactionModelCallback extends ProviderTransactionModel.ProviderTransactionModelCallback<WatchFaceInfo> {
    }

    public WatchFaceTransactionModel(Context context, WatchFaceTransactionModelCallback watchFaceTransactionModelCallback, String str) {
        super(context, WatchFaceInfo.CREATOR, watchFaceTransactionModelCallback, str);
    }
}
