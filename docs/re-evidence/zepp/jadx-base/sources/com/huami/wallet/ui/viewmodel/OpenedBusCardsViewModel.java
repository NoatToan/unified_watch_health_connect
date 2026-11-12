package com.huami.wallet.ui.viewmodel;

import androidx.p008lifecycle.ViewModel;
import com.huami.wallet.lib.api.WalletDataSource;
import com.huami.wallet.lib.entity.BusCardSimple2;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.ui.utils.LiveDataReactiveStreams;
import com.huami.wallet.ui.viewmodel.OpenedBusCardsViewModel;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R+\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/huami/wallet/ui/viewmodel/OpenedBusCardsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huami/wallet/lib/api/WalletDataSource;", "a", "Lcom/huami/wallet/lib/api/WalletDataSource;", ParamKey.dataSource, "Lcom/huami/wallet/ui/utils/LiveDataReactiveStreams$PublisherLiveData;", "Lcom/huami/wallet/lib/entity/Resource;", "", "Lcom/huami/wallet/lib/entity/BusCardSimple2;", "b", "Lcom/huami/wallet/ui/utils/LiveDataReactiveStreams$PublisherLiveData;", "getBusCardListLiveData", "()Lcom/huami/wallet/ui/utils/LiveDataReactiveStreams$PublisherLiveData;", "busCardListLiveData", "<init>", "(Lcom/huami/wallet/lib/api/WalletDataSource;)V", "Companion", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class OpenedBusCardsViewModel extends ViewModel {

    @NotNull
    public static final String TAG = "Wallet-OpenedBusCardsViewModel";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private WalletDataSource dataSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LiveDataReactiveStreams.PublisherLiveData<Resource<List<BusCardSimple2>>> busCardListLiveData;

    public OpenedBusCardsViewModel(@NotNull WalletDataSource walletDataSource) {
        this.dataSource = walletDataSource;
        this.busCardListLiveData = LiveDataReactiveStreams.fromPublisher(Flowable.fromPublisher(walletDataSource.isDeviceConnected()).subscribeOn(Schedulers.io()).flatMap(new Function() { // from class: cn5
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return OpenedBusCardsViewModel.b(this.a, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Publisher b(OpenedBusCardsViewModel openedBusCardsViewModel, Boolean bool) {
        return bool.booleanValue() ? Flowable.fromPublisher(openedBusCardsViewModel.dataSource.loadOpenedBusCards()) : Completable.complete().toFlowable();
    }

    @NotNull
    public final LiveDataReactiveStreams.PublisherLiveData<Resource<List<BusCardSimple2>>> getBusCardListLiveData() {
        return this.busCardListLiveData;
    }
}
