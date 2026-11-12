package com.ingenic.iwds.datatransactor.elf;

import android.content.Context;
import com.ingenic.iwds.datatransactor.ProviderTransactionModel;
import java.util.Locale;

/* JADX INFO: loaded from: classes18.dex */
public class LocaleTransactionModel extends ProviderTransactionModel<Locale> {

    public interface LocaleTransactionModelCallback extends ProviderTransactionModel.ProviderTransactionModelCallback<Locale> {
    }

    public LocaleTransactionModel(Context context, LocaleTransactionModelCallback localeTransactionModelCallback, String str) {
        super(context, null, localeTransactionModelCallback, str);
    }
}
