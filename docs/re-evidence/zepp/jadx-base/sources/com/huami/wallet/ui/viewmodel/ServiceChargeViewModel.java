package com.huami.wallet.ui.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import com.huami.wallet.lib.api.WalletDataSource;
import com.huami.wallet.lib.entity.InVoiceInfo;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.entity.XiaomiInVoiceInfo;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002J\u0010\u0010\t\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR%\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R%\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000f0\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R%\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u000f0\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014R%\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000f0\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0012\u001a\u0004\b\t\u0010\u0014¨\u0006#"}, d2 = {"Lcom/huami/wallet/ui/viewmodel/ServiceChargeViewModel;", "Lcom/huami/wallet/ui/viewmodel/BaseViewModel;", "", "appCode", "", "getInVoiceInfo", "getInVoiceAddress", "busCardId", "loadBusCardRechargeRecords", "getChargeInvoiceDescription", "Lcom/huami/wallet/lib/api/WalletDataSource;", "e", "Lcom/huami/wallet/lib/api/WalletDataSource;", ParamKey.dataSource, "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/wallet/lib/entity/Resource;", "Lcom/huami/wallet/lib/entity/InVoiceInfo;", "f", "Landroidx/lifecycle/MutableLiveData;", "getInVoiceInfoLiveData", "()Landroidx/lifecycle/MutableLiveData;", "inVoiceInfoLiveData", "Lcom/huami/wallet/lib/entity/XiaomiInVoiceInfo;", "g", "getInVoiceAddressLiveData", "inVoiceAddressLiveData", "", "h", "getInVoiceAmountLiveData", "inVoiceAmountLiveData", "i", "chargeInvoiceDescription", "<init>", "(Lcom/huami/wallet/lib/api/WalletDataSource;)V", "Companion", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class ServiceChargeViewModel extends BaseViewModel {

    @NotNull
    public static final String TAG = "Wallet-ServiceChargeViewModel";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private WalletDataSource dataSource;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<InVoiceInfo>> inVoiceInfoLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<XiaomiInVoiceInfo>> inVoiceAddressLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<Integer>> inVoiceAmountLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<String>> chargeInvoiceDescription = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/lib/entity/Resource;", "", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Resource<String>, Unit> {
        public a() {
            super(1);
        }

        public final void a(@NotNull Resource<String> resource) {
            ServiceChargeViewModel.this.getChargeInvoiceDescription().setValue(resource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<String> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/lib/entity/Resource;", "Lcom/huami/wallet/lib/entity/XiaomiInVoiceInfo;", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Resource<XiaomiInVoiceInfo>, Unit> {
        public b() {
            super(1);
        }

        public final void a(@NotNull Resource<XiaomiInVoiceInfo> resource) {
            ServiceChargeViewModel.this.getInVoiceAddressLiveData().setValue(resource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<XiaomiInVoiceInfo> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/lib/entity/Resource;", "Lcom/huami/wallet/lib/entity/InVoiceInfo;", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Resource<InVoiceInfo>, Unit> {
        public c() {
            super(1);
        }

        public final void a(@NotNull Resource<InVoiceInfo> resource) {
            ServiceChargeViewModel.this.getInVoiceInfoLiveData().setValue(resource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<InVoiceInfo> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/lib/entity/Resource;", "", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<Resource<Integer>, Unit> {
        public d() {
            super(1);
        }

        public final void a(@NotNull Resource<Integer> resource) {
            ServiceChargeViewModel.this.getInVoiceAmountLiveData().setValue(resource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<Integer> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    public ServiceChargeViewModel(@NotNull WalletDataSource walletDataSource) {
        this.dataSource = walletDataSource;
    }

    @NotNull
    public final MutableLiveData<Resource<String>> getChargeInvoiceDescription() {
        return this.chargeInvoiceDescription;
    }

    public final void getInVoiceAddress(@Nullable String appCode) throws Exception {
        publisherToResource("getInVoiceAddress", this.dataSource.getInvoiceAddress(appCode), new b());
    }

    @NotNull
    public final MutableLiveData<Resource<XiaomiInVoiceInfo>> getInVoiceAddressLiveData() {
        return this.inVoiceAddressLiveData;
    }

    @NotNull
    public final MutableLiveData<Resource<Integer>> getInVoiceAmountLiveData() {
        return this.inVoiceAmountLiveData;
    }

    public final void getInVoiceInfo(@Nullable String appCode) throws Exception {
        publisherToResource("getInVoiceInfo", this.dataSource.getFeeInvoice(appCode), new c());
    }

    @NotNull
    public final MutableLiveData<Resource<InVoiceInfo>> getInVoiceInfoLiveData() {
        return this.inVoiceInfoLiveData;
    }

    public final void loadBusCardRechargeRecords(@NotNull String busCardId) throws Exception {
        publisherToResource("loadBusCardRechargeRecords", this.dataSource.loadMiBusCardRechargeRecords(busCardId), new d());
    }

    public final void getChargeInvoiceDescription(@Nullable String busCardId) throws Exception {
        publisherToResource("getChargeInvoiceDescription", this.dataSource.getChargeInvoiceDescription(busCardId), new a());
    }
}
