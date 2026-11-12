package com.huami.wallet.ui.repository;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.wallet.lib.api.WalletDataSource;
import com.huami.wallet.lib.entity.ConsumeRecord;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.util.Function;
import com.huami.wallet.ui.repository.TradeRecordRepo;
import com.huami.wallet.ui.utils.KtUtilsKt;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import io.reactivex.Flowable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0015J(\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0002J(\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007J<\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0007R\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/huami/wallet/ui/repository/TradeRecordRepo;", "", "Lcom/huami/wallet/lib/entity/Resource;", "", "Lcom/huami/wallet/lib/entity/ConsumeRecord;", "data", GoogleApiAvailabilityLight.a, "", "cardId", "cardNumber", "Lio/reactivex/Flowable;", "getTradeRecordsFormWeb", "bleData", "webData", "zipBleDataAndWebData", "Lcom/huami/wallet/lib/api/WalletDataSource;", "a", "Lcom/huami/wallet/lib/api/WalletDataSource;", "getDataSource", "()Lcom/huami/wallet/lib/api/WalletDataSource;", "setDataSource", "(Lcom/huami/wallet/lib/api/WalletDataSource;)V", ParamKey.dataSource, "<init>", "Companion", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public class TradeRecordRepo {

    @NotNull
    public static final String TAG = "Wallet-BusCardListRepo";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private WalletDataSource dataSource;

    public TradeRecordRepo(@NotNull WalletDataSource walletDataSource) {
        this.dataSource = walletDataSource;
    }

    private final Resource<List<ConsumeRecord>> d(Resource<List<ConsumeRecord>> data) {
        final ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (KtUtilsKt.isNullOrEmpty(data.data)) {
            return data;
        }
        for (ConsumeRecord consumeRecord : data.data) {
            if (consumeRecord.amount > 0 && !arrayList2.contains(Long.valueOf(consumeRecord.timestamp))) {
                arrayList2.add(Long.valueOf(consumeRecord.timestamp));
                arrayList.add(consumeRecord);
            }
        }
        g.sortWith(arrayList, new Comparator() { // from class: os7
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return TradeRecordRepo.e((ConsumeRecord) obj, (ConsumeRecord) obj2);
            }
        });
        return data.map(new Function() { // from class: ms7
            @Override // com.huami.wallet.lib.util.Function
            public final Object apply(Object obj) {
                return TradeRecordRepo.f(arrayList, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(ConsumeRecord consumeRecord, ConsumeRecord consumeRecord2) {
        return consumeRecord2.timestamp > consumeRecord.timestamp ? 1 : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List f(ArrayList arrayList, List list) {
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Resource g(TradeRecordRepo tradeRecordRepo, Resource resource) {
        return resource.isSuccessful() ? tradeRecordRepo.d(resource) : resource;
    }

    @NotNull
    public final WalletDataSource getDataSource() {
        return this.dataSource;
    }

    @NotNull
    public final Flowable<Resource<List<ConsumeRecord>>> getTradeRecordsFormWeb(@NotNull String cardId, @NotNull String cardNumber) {
        return Flowable.fromPublisher(this.dataSource.loadBusCardConsumeRecordsWeb(cardId, cardNumber)).map(new io.reactivex.functions.Function() { // from class: ns7
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return TradeRecordRepo.g(this.a, (Resource) obj);
            }
        });
    }

    public final void setDataSource(@NotNull WalletDataSource walletDataSource) {
        this.dataSource = walletDataSource;
    }

    @VisibleForTesting
    @NotNull
    public final Resource<List<ConsumeRecord>> zipBleDataAndWebData(@NotNull Resource<List<ConsumeRecord>> bleData, @NotNull Resource<List<ConsumeRecord>> webData) {
        if (!bleData.isSuccessful() && !webData.isSuccessful()) {
            return d(webData);
        }
        if (!bleData.isSuccessful() || !webData.isSuccessful()) {
            if (bleData.isSuccessful() || webData.isSuccessful()) {
                return bleData.isSuccessful() ? d(bleData) : d(webData);
            }
            return d(webData);
        }
        ArrayList arrayList = new ArrayList();
        if (!KtUtilsKt.isNullOrEmpty(bleData.data)) {
            arrayList.addAll(bleData.data);
        }
        if (!KtUtilsKt.isNullOrEmpty(webData.data)) {
            arrayList.addAll(webData.data);
        }
        return d(Resource.success(arrayList));
    }
}
