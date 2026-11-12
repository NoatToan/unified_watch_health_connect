package com.huami.privacy.moneyformat;

import android.os.Build;
import com.huami.watchfacesstore.util.MoneyFormatter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/privacy/moneyformat/MoneyFormatterFactory;", "", "", "countryCode", "Lcom/huami/privacy/moneyformat/IMoneyFormatter;", "getFormatter", "<init>", "()V", "hmutil_release"}, k = 1, mv = {1, 5, 1})
public final class MoneyFormatterFactory {

    @NotNull
    public static final MoneyFormatterFactory INSTANCE = new MoneyFormatterFactory();

    private MoneyFormatterFactory() {
    }

    @NotNull
    public final IMoneyFormatter getFormatter(@NotNull String countryCode) {
        return Build.VERSION.SDK_INT >= 24 ? MoneyFormatterN.INSTANCE.newInstance(countryCode) : MoneyFormatter.INSTANCE.newInstance(countryCode);
    }
}
