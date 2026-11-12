package com.huami.wallet.ui.repository;

import com.huami.wallet.lib.api.WalletDataSource;
import com.huami.wallet.lib.entity.Resource;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J.\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002J.\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u000b\u001a\u00020\nR\u0019\u0010\u0011\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/huami/wallet/ui/repository/ShiftCardMiRepo;", "", "", "appCode", "orderID", "orderToken", "Lorg/reactivestreams/Publisher;", "Lcom/huami/wallet/lib/entity/Resource;", "shiftOutCard", "shiftInCard", "", "isForMi", "Lcom/huami/wallet/lib/api/WalletDataSource;", "a", "Lcom/huami/wallet/lib/api/WalletDataSource;", "getDataSource", "()Lcom/huami/wallet/lib/api/WalletDataSource;", ParamKey.dataSource, "<init>", "(Lcom/huami/wallet/lib/api/WalletDataSource;)V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public class ShiftCardMiRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final WalletDataSource dataSource;

    public ShiftCardMiRepo(@NotNull WalletDataSource walletDataSource) {
        this.dataSource = walletDataSource;
    }

    @NotNull
    public final WalletDataSource getDataSource() {
        return this.dataSource;
    }

    public final boolean isForMi() {
        return this.dataSource.isForMi();
    }

    @NotNull
    public final Publisher<Resource<String>> shiftInCard(@NotNull String appCode, @Nullable String orderID, @Nullable String orderToken) {
        return this.dataSource.shiftInMi(appCode, orderID, orderToken);
    }

    @NotNull
    public final Publisher<Resource<String>> shiftOutCard(@NotNull String appCode, @Nullable String orderID, @Nullable String orderToken) {
        return this.dataSource.shiftOutMi(appCode, orderID, orderToken);
    }
}
