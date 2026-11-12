package com.huami.wallet.datasource.cloud;

import com.huami.nfc.base.PayResponse;
import com.huami.nfc.bus.CityInfoEntity;
import com.huami.nfc.bus.NoticesEntity;
import com.huami.nfc.bus.api.IHuamiWebApi;
import com.huami.tools.log.HMLog;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
class b extends FilterHuamiWebApi {
    private static final String d = "Wallet-CachedHuamiWebApi";
    private static final long e = 10000;
    private long b;
    private final m c;

    public b(IHuamiWebApi iHuamiWebApi, m mVar) {
        super(iHuamiWebApi);
        this.b = 0L;
        this.c = mVar;
    }

    @Override // com.huami.wallet.datasource.cloud.FilterHuamiWebApi, com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<List<CityInfoEntity>> getInstalledBusCards(String str, String str2) {
        if (this.c.e()) {
            HMLog.i(d, "getInstalledBusCards() from cache", new Object[0]);
            return PayResponse.success("getInstalledBusCards() from cache", this.c.c());
        }
        HMLog.i(d, "getInstalledBusCards() from api", new Object[0]);
        PayResponse<List<CityInfoEntity>> installedBusCards = super.getInstalledBusCards(str, str2);
        if (installedBusCards.isSuccessful() && installedBusCards.getData() != null && !installedBusCards.getData().isEmpty()) {
            this.c.h(installedBusCards.getData());
        }
        return installedBusCards;
    }

    @Override // com.huami.wallet.datasource.cloud.FilterHuamiWebApi, com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<List<NoticesEntity>> getNotices() {
        HMLog.i(d, "------CachedHuamiWebApi getNotices() " + this.c.d(), new Object[0]);
        if (this.c.f()) {
            HMLog.i(d, "getNotices() from cache", new Object[0]);
            return PayResponse.success("getNotices() from cache", this.c.d());
        }
        HMLog.i(d, "getNotices() from web", new Object[0]);
        PayResponse<List<NoticesEntity>> notices = super.getNotices();
        if (notices.isSuccessful() && notices.getData() != null && !notices.getData().isEmpty()) {
            this.c.i(notices.getData());
        }
        return notices;
    }
}
