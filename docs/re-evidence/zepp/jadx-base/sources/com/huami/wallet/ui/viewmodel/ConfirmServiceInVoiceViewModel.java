package com.huami.wallet.ui.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import com.huami.wallet.lib.api.WalletDataSource;
import com.huami.wallet.lib.entity.InVoiceInfo;
import com.huami.wallet.lib.entity.Resource;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR%\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/huami/wallet/ui/viewmodel/ConfirmServiceInVoiceViewModel;", "Lcom/huami/wallet/ui/viewmodel/BaseViewModel;", "", "appCode", "Lcom/huami/wallet/lib/entity/InVoiceInfo;", "info", "", "postInInvoiceData", "Lcom/huami/wallet/lib/api/WalletDataSource;", "e", "Lcom/huami/wallet/lib/api/WalletDataSource;", ParamKey.dataSource, "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/wallet/lib/entity/Resource;", "", "f", "Landroidx/lifecycle/MutableLiveData;", "getInVoiceInfoConfirmLiveData", "()Landroidx/lifecycle/MutableLiveData;", "inVoiceInfoConfirmLiveData", "<init>", "(Lcom/huami/wallet/lib/api/WalletDataSource;)V", "Companion", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class ConfirmServiceInVoiceViewModel extends BaseViewModel {

    @NotNull
    public static final String TAG = "Wallet-ConfirmServiceInVoiceViewModel";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private WalletDataSource dataSource;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<Boolean>> inVoiceInfoConfirmLiveData = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/lib/entity/Resource;", "", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Resource<Boolean>, Unit> {
        public a() {
            super(1);
        }

        public final void a(@NotNull Resource<Boolean> resource) {
            ConfirmServiceInVoiceViewModel.this.getInVoiceInfoConfirmLiveData().setValue(resource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<Boolean> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    public ConfirmServiceInVoiceViewModel(@NotNull WalletDataSource walletDataSource) {
        this.dataSource = walletDataSource;
    }

    @NotNull
    public final MutableLiveData<Resource<Boolean>> getInVoiceInfoConfirmLiveData() {
        return this.inVoiceInfoConfirmLiveData;
    }

    public final void postInInvoiceData(@Nullable String appCode, @NotNull InVoiceInfo info) throws Exception {
        publisherToResource("postInInvoiceData", this.dataSource.postFeeInvoice(appCode, info), new a());
    }
}
