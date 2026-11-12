package com.huami.wallet.ui.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import com.huami.wallet.lib.api.WalletDataSource;
import com.huami.wallet.lib.entity.Resource;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR.\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000b0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/huami/wallet/ui/viewmodel/RemindOpenBusCardViewModel;", "Lcom/huami/wallet/ui/viewmodel/BaseViewModel;", "", "key", "", "getBusImageUrl", "Lcom/huami/wallet/lib/api/WalletDataSource;", "e", "Lcom/huami/wallet/lib/api/WalletDataSource;", ParamKey.dataSource, "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/wallet/lib/entity/Resource;", "f", "Landroidx/lifecycle/MutableLiveData;", "getBusImageUrlLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setBusImageUrlLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "busImageUrlLiveData", "<init>", "(Lcom/huami/wallet/lib/api/WalletDataSource;)V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class RemindOpenBusCardViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final WalletDataSource dataSource;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Resource<String>> busImageUrlLiveData = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/lib/entity/Resource;", "", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Resource<String>, Unit> {
        public a() {
            super(1);
        }

        public final void a(@NotNull Resource<String> resource) {
            RemindOpenBusCardViewModel.this.getBusImageUrlLiveData().setValue(resource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<String> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    public RemindOpenBusCardViewModel(@NotNull WalletDataSource walletDataSource) {
        this.dataSource = walletDataSource;
    }

    public final void getBusImageUrl(@NotNull String key) throws Exception {
        publisherToResource("getRemindBusImageUrl", this.dataSource.getBusImageUrl(key), new a());
    }

    @NotNull
    public final MutableLiveData<Resource<String>> getBusImageUrlLiveData() {
        return this.busImageUrlLiveData;
    }

    public final void setBusImageUrlLiveData(@NotNull MutableLiveData<Resource<String>> mutableLiveData) {
        this.busImageUrlLiveData = mutableLiveData;
    }
}
