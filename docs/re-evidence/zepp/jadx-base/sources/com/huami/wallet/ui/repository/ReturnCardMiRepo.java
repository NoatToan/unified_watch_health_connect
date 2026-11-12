package com.huami.wallet.ui.repository;

import com.huami.wallet.lib.api.WalletDataSource;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.ui.navigation.Args;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\fR\u0019\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/huami/wallet/ui/repository/ReturnCardMiRepo;", "", "", "appCode", "", "blance", "orderToken", "Lorg/reactivestreams/Publisher;", "Lcom/huami/wallet/lib/entity/Resource;", "returnCard", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lorg/reactivestreams/Publisher;", "applyRefund", "", "isForMi", "Lcom/huami/wallet/lib/api/WalletDataSource;", "a", "Lcom/huami/wallet/lib/api/WalletDataSource;", "getDataSource", "()Lcom/huami/wallet/lib/api/WalletDataSource;", ParamKey.dataSource, "<init>", "(Lcom/huami/wallet/lib/api/WalletDataSource;)V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public class ReturnCardMiRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final WalletDataSource dataSource;

    public ReturnCardMiRepo(@NotNull WalletDataSource walletDataSource) {
        this.dataSource = walletDataSource;
    }

    @NotNull
    public final Publisher<Resource<String>> applyRefund(@NotNull String appCode) {
        return this.dataSource.applyRefund(appCode);
    }

    @NotNull
    public final WalletDataSource getDataSource() {
        return this.dataSource;
    }

    public final boolean isForMi() {
        return this.dataSource.isForMi();
    }

    @NotNull
    public final Publisher<Resource<String>> returnCard(@NotNull String appCode, @Nullable Integer blance, @Nullable String orderToken) {
        WalletDataSource walletDataSource = this.dataSource;
        Args args = Args.INSTANCE;
        return walletDataSource.returnCardMi(appCode, blance, orderToken, args.getAuthCode(), String.valueOf(args.getRefundReasonCode()), "ALIPAY", args.getAlipay(), args.getName());
    }
}
