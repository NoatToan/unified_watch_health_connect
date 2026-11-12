package com.huami.wallet.ui.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.nfc.bus.entities.PayAuthorizationInfo;
import com.huami.nfc.bus.entities.RefundTicket;
import com.huami.nfc.bus.entities.RefundTicketPostBody;
import com.huami.nfc.bus.entities.ReturnCardReason;
import com.huami.tools.log.HMLog;
import com.huami.wallet.lib.api.WalletDataSource;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.ui.repository.BusCardRepo;
import com.huami.wallet.ui.viewmodel.ReturnViewModel;
import com.huami.watchfacesstore.analytic.WFStateEvent;
import com.loc.z;
import com.xiaomi.infra.galaxy.fds.Common;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 @2\u00020\u0001:\u0001@B\u000f\u0012\u0006\u0010=\u001a\u00020<¢\u0006\u0004\b>\u0010?J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J&\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005R\"\u0010\b\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR+\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001f0\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R%\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u001f0\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R%\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u001f0\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b-\u0010%R%\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001f0\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b/\u0010#\u001a\u0004\b0\u0010%R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00107\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00104R\u0018\u00109\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00104R\u0018\u0010;\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00104¨\u0006A"}, d2 = {"Lcom/huami/wallet/ui/viewmodel/ReturnViewModel;", "Lcom/huami/wallet/ui/viewmodel/BaseViewModel;", "", "onCleared", "returnCardReason", "", "appCode", Common.AUTHORIZATION, "refundReasonCode", "cardNo", "Lcom/huami/nfc/bus/entities/RefundTicketPostBody;", "refundTicketPostBody", "refundTicket", "snbTicket", "refundCard", "", "e", LogUtil.I, "getRefundReasonCode", "()I", "setRefundReasonCode", "(I)V", "Lcom/huami/wallet/lib/api/WalletDataSource;", "f", "Lcom/huami/wallet/lib/api/WalletDataSource;", "getWalletDataSource", "()Lcom/huami/wallet/lib/api/WalletDataSource;", "setWalletDataSource", "(Lcom/huami/wallet/lib/api/WalletDataSource;)V", "walletDataSource", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/wallet/lib/entity/Resource;", "", "Lcom/huami/nfc/bus/entities/ReturnCardReason;", "g", "Landroidx/lifecycle/MutableLiveData;", "getReturnCardReasonLiveData", "()Landroidx/lifecycle/MutableLiveData;", "returnCardReasonLiveData", "Lcom/huami/nfc/bus/entities/PayAuthorizationInfo;", "h", "getAuthorizationLiveData", "authorizationLiveData", "Lcom/huami/nfc/bus/entities/RefundTicket;", "i", "getRefundTicketLiveData", "refundTicketLiveData", z.j, "getRefundCardLiveData", "refundCardLiveData", "Lio/reactivex/disposables/Disposable;", hl.k, "Lio/reactivex/disposables/Disposable;", "returnCardReasonDisposable", "l", "authorizationDisposable", "m", "refundTicketDisposable", GoogleApiAvailabilityLight.b, "refundCardDisposable", "Lcom/huami/wallet/ui/repository/BusCardRepo;", "b", "<init>", "(Lcom/huami/wallet/ui/repository/BusCardRepo;)V", "Companion", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class ReturnViewModel extends BaseViewModel {

    @NotNull
    public static final String TAG = "ReturnViewModel";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private WalletDataSource walletDataSource;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private Disposable returnCardReasonDisposable;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private Disposable authorizationDisposable;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private Disposable refundTicketDisposable;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    private Disposable refundCardDisposable;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int refundReasonCode = -1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<List<ReturnCardReason>>> returnCardReasonLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<PayAuthorizationInfo>> authorizationLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<RefundTicket>> refundTicketLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<Unit>> refundCardLiveData = new MutableLiveData<>();

    public ReturnViewModel(@NotNull BusCardRepo busCardRepo) {
        this.walletDataSource = busCardRepo.getDataSource();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(ReturnViewModel returnViewModel, Resource resource) {
        returnViewModel.getAuthorizationLiveData().setValue(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(Throwable th) {
        HMLog.w(TAG, th, "returnCardReason时发生了意外的错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(ReturnViewModel returnViewModel, Resource resource) {
        returnViewModel.getRefundCardLiveData().setValue(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(Throwable th) {
        HMLog.w(TAG, th, "refundTicket时发生了意外的错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(ReturnViewModel returnViewModel, Resource resource) {
        returnViewModel.getRefundTicketLiveData().setValue(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(Throwable th) {
        HMLog.w(TAG, th, "refundTicket时发生了意外的错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(ReturnViewModel returnViewModel, Resource resource) {
        returnViewModel.getReturnCardReasonLiveData().setValue(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(Throwable th) {
        HMLog.w(TAG, th, "returnCardReason时发生了意外的错误", new Object[0]);
    }

    public final void authorization(@NotNull String appCode) {
        this.authorizationDisposable = Flowable.fromPublisher(this.walletDataSource.authorization(appCode, WFStateEvent.WF_PAYTYPE_ALI)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: if6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ReturnViewModel.o(this.a, (Resource) obj);
            }
        }, new Consumer() { // from class: of6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ReturnViewModel.p((Throwable) obj);
            }
        });
    }

    @NotNull
    public final MutableLiveData<Resource<PayAuthorizationInfo>> getAuthorizationLiveData() {
        return this.authorizationLiveData;
    }

    @NotNull
    public final MutableLiveData<Resource<Unit>> getRefundCardLiveData() {
        return this.refundCardLiveData;
    }

    public final int getRefundReasonCode() {
        return this.refundReasonCode;
    }

    @NotNull
    public final MutableLiveData<Resource<RefundTicket>> getRefundTicketLiveData() {
        return this.refundTicketLiveData;
    }

    @NotNull
    public final MutableLiveData<Resource<List<ReturnCardReason>>> getReturnCardReasonLiveData() {
        return this.returnCardReasonLiveData;
    }

    @NotNull
    public final WalletDataSource getWalletDataSource() {
        return this.walletDataSource;
    }

    @Override // com.huami.wallet.ui.viewmodel.BaseViewModel, androidx.p008lifecycle.ViewModel
    public void onCleared() {
        Disposable disposable;
        Disposable disposable2;
        super.onCleared();
        Disposable disposable3 = this.returnCardReasonDisposable;
        if (disposable3 != null) {
            if (!(disposable3 == null ? null : Boolean.valueOf(disposable3.isDisposed())).booleanValue() && (disposable2 = this.returnCardReasonDisposable) != null) {
                disposable2.dispose();
            }
        }
        Disposable disposable4 = this.authorizationDisposable;
        if (disposable4 != null) {
            if ((disposable4 != null ? Boolean.valueOf(disposable4.isDisposed()) : null).booleanValue() || (disposable = this.authorizationDisposable) == null) {
                return;
            }
            disposable.dispose();
        }
    }

    public final void refundCard(@NotNull String appCode, @NotNull String snbTicket) {
        this.refundCardDisposable = Flowable.fromPublisher(this.walletDataSource.returnCard(appCode, snbTicket)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: kf6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ReturnViewModel.q(this.a, (Resource) obj);
            }
        }, new Consumer() { // from class: mf6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ReturnViewModel.r((Throwable) obj);
            }
        });
    }

    public final void refundTicket(@NotNull String appCode, @NotNull String refundReasonCode, @NotNull String cardNo, @NotNull RefundTicketPostBody refundTicketPostBody) {
        this.refundTicketDisposable = Flowable.fromPublisher(this.walletDataSource.refundTicket(appCode, refundReasonCode, cardNo, refundTicketPostBody)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: hf6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ReturnViewModel.s(this.a, (Resource) obj);
            }
        }, new Consumer() { // from class: lf6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ReturnViewModel.t((Throwable) obj);
            }
        });
    }

    public final void returnCardReason() {
        this.returnCardReasonDisposable = Flowable.fromPublisher(this.walletDataSource.returnCardReason()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: jf6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ReturnViewModel.u(this.a, (Resource) obj);
            }
        }, new Consumer() { // from class: nf6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ReturnViewModel.v((Throwable) obj);
            }
        });
    }

    public final void setRefundReasonCode(int i) {
        this.refundReasonCode = i;
    }

    public final void setWalletDataSource(@NotNull WalletDataSource walletDataSource) {
        this.walletDataSource = walletDataSource;
    }
}
