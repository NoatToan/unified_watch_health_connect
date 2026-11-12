package com.huami.wallet.ui.repository;

import com.huami.nfc.bus.OrderEntity;
import com.huami.nfc.bus.PayType;
import com.huami.wallet.lib.api.WalletDataSource;
import com.huami.wallet.lib.entity.Protocol;
import com.huami.wallet.lib.entity.Resource;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ,\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002J$\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002J.\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002J\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0002J+\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010\u0016\u001a\u00020\fR\u0019\u0010\u001c\u001a\u00020\u00178\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/huami/wallet/ui/repository/ShiftCardRepo;", "", "", "appCode", "Lcom/huami/nfc/bus/PayType;", "payType", "shiftOrderNo", "Lorg/reactivestreams/Publisher;", "Lcom/huami/wallet/lib/entity/Resource;", "Lcom/huami/nfc/bus/OrderEntity;", "generateShiftOrder", "orderID", "", "shiftIn", "orderToken", "shiftOut", "Lcom/huami/wallet/lib/entity/Protocol;", "getShiftProtocol", "", "agreementID", "agreeShiftProtocol", "(Ljava/lang/String;Ljava/lang/Long;)Lorg/reactivestreams/Publisher;", "isForMi", "Lcom/huami/wallet/lib/api/WalletDataSource;", "a", "Lcom/huami/wallet/lib/api/WalletDataSource;", "getDataSource", "()Lcom/huami/wallet/lib/api/WalletDataSource;", ParamKey.dataSource, "<init>", "(Lcom/huami/wallet/lib/api/WalletDataSource;)V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public class ShiftCardRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final WalletDataSource dataSource;

    public ShiftCardRepo(@NotNull WalletDataSource walletDataSource) {
        this.dataSource = walletDataSource;
    }

    @NotNull
    public final Publisher<Resource<String>> agreeShiftProtocol(@NotNull String appCode, @Nullable Long agreementID) {
        return this.dataSource.agreeShiftProtocol(appCode, agreementID);
    }

    @NotNull
    public final Publisher<Resource<OrderEntity>> generateShiftOrder(@NotNull String appCode, @NotNull PayType payType, @Nullable String shiftOrderNo) {
        return this.dataSource.generateShiftOrder(appCode, payType, shiftOrderNo);
    }

    @NotNull
    public final WalletDataSource getDataSource() {
        return this.dataSource;
    }

    @NotNull
    public final Publisher<Resource<Protocol>> getShiftProtocol(@NotNull String appCode) {
        return this.dataSource.getShiftProtocol(appCode, "ISSUE");
    }

    public final boolean isForMi() {
        return this.dataSource.isForMi();
    }

    @NotNull
    public final Publisher<Resource<Boolean>> shiftIn(@NotNull String appCode, @Nullable String orderID) {
        return this.dataSource.shiftIn(appCode, orderID);
    }

    @NotNull
    public final Publisher<Resource<Boolean>> shiftOut(@NotNull String appCode, @Nullable String orderID, @Nullable String orderToken) {
        return this.dataSource.shiftOut(appCode, orderID);
    }
}
