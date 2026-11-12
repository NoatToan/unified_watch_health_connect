package com.ingenic.iwds.datatransactor.elf;

import android.content.Context;
import com.ingenic.iwds.datatransactor.ProviderTransactionModel;

/* JADX INFO: loaded from: classes18.dex */
public class WeatherTransactionModel extends ProviderTransactionModel<WeatherInfoArray> {

    public interface WeatherInfoTransactionModelCallback extends ProviderTransactionModel.ProviderTransactionModelCallback<WeatherInfoArray> {
    }

    public WeatherTransactionModel(Context context, WeatherInfoTransactionModelCallback weatherInfoTransactionModelCallback, String str) {
        super(context, WeatherInfoArray.CREATOR, weatherInfoTransactionModelCallback, str);
    }
}
