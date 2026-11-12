package com.huami.wallet.ui.viewmodel;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.nfc.bus.MiRefundStatus;
import com.huami.nfc.bus.entities.XiaomiBulletin;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.wallet.lib.api.WalletDataSource;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.util.BusKeeper;
import com.huami.wallet.ui.repository.ReturnCardMiRepo;
import com.huami.wallet.ui.viewmodel.XiaomiRefundViewModel;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000 72\u00020\u0001:\u00017B\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b5\u00106J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J)\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u0016\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fJ\b\u0010\u0012\u001a\u00020\u0004H\u0017R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R.\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R.\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001c0\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R.\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001c0\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010!\"\u0004\b+\u0010#R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00102\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010/R\u0018\u00104\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010/¨\u00068"}, d2 = {"Lcom/huami/wallet/ui/viewmodel/XiaomiRefundViewModel;", "Landroidx/lifecycle/ViewModel;", "", "xmCardName", "", "getXiaomiRefundStatus", "appCode", "", "blance", "orderToken", "returnCard", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "applyRefund", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/nfc/bus/entities/XiaomiBulletin;", "bulletin", "keep", "onCleared", "Lcom/huami/wallet/lib/api/WalletDataSource;", "a", "Lcom/huami/wallet/lib/api/WalletDataSource;", ParamKey.dataSource, "Lcom/huami/wallet/ui/repository/ReturnCardMiRepo;", "b", "Lcom/huami/wallet/ui/repository/ReturnCardMiRepo;", "returnCardMiRepo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/wallet/lib/entity/Resource;", "Lcom/huami/nfc/bus/MiRefundStatus;", "c", "Landroidx/lifecycle/MutableLiveData;", "getXiaomiRefundStatusLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setXiaomiRefundStatusLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "xiaomiRefundStatusLiveData", GoogleApiAvailabilityLight.a, "getXiaomiReturnCardLiveData", "setXiaomiReturnCardLiveData", "xiaomiReturnCardLiveData", "e", "getXiaomiApplyRefundLiveData", "setXiaomiApplyRefundLiveData", "xiaomiApplyRefundLiveData", "Lio/reactivex/disposables/Disposable;", "f", "Lio/reactivex/disposables/Disposable;", "xiaomiRefundStatusDisposable", "g", "xiaomiReturnCardDisposable", "h", "xiaomiApplyRefundDisposable", "<init>", "(Lcom/huami/wallet/lib/api/WalletDataSource;Lcom/huami/wallet/ui/repository/ReturnCardMiRepo;)V", "Companion", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public class XiaomiRefundViewModel extends ViewModel {

    @NotNull
    public static final String TAG = "XiaomiRefundViewModel";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final WalletDataSource dataSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ReturnCardMiRepo returnCardMiRepo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Resource<MiRefundStatus>> xiaomiRefundStatusLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Resource<String>> xiaomiReturnCardLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Resource<String>> xiaomiApplyRefundLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private Disposable xiaomiRefundStatusDisposable;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private Disposable xiaomiReturnCardDisposable;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private Disposable xiaomiApplyRefundDisposable;

    public XiaomiRefundViewModel(@NotNull WalletDataSource walletDataSource, @NotNull ReturnCardMiRepo returnCardMiRepo) {
        this.dataSource = walletDataSource;
        this.returnCardMiRepo = returnCardMiRepo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(XiaomiRefundViewModel xiaomiRefundViewModel, Resource resource) {
        xiaomiRefundViewModel.getXiaomiApplyRefundLiveData().setValue(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(Throwable th) {
        HMLog.w(TAG, th, "applyRefund时发生了意外的错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(XiaomiRefundViewModel xiaomiRefundViewModel, Resource resource) {
        xiaomiRefundViewModel.getXiaomiRefundStatusLiveData().setValue(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(Throwable th) {
        HMLog.w(TAG, th, "getXiaomiRefundStatus时发生了意外的错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(XiaomiRefundViewModel xiaomiRefundViewModel, Resource resource) {
        xiaomiRefundViewModel.getXiaomiReturnCardLiveData().setValue(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(Throwable th) {
        HMLog.w(TAG, th, "returnCard时发生了意外的错误", new Object[0]);
    }

    public final void applyRefund(@NotNull String appCode) {
        this.xiaomiApplyRefundDisposable = Flowable.fromPublisher(this.returnCardMiRepo.applyRefund(appCode)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: rz8
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                XiaomiRefundViewModel.h(this.a, (Resource) obj);
            }
        }, new Consumer() { // from class: sz8
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                XiaomiRefundViewModel.i((Throwable) obj);
            }
        });
    }

    @NotNull
    public final MutableLiveData<Resource<String>> getXiaomiApplyRefundLiveData() {
        return this.xiaomiApplyRefundLiveData;
    }

    public final void getXiaomiRefundStatus(@NotNull String xmCardName) {
        this.xiaomiRefundStatusDisposable = Flowable.fromPublisher(this.dataSource.queryRefundStatus(xmCardName)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: pz8
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                XiaomiRefundViewModel.j(this.a, (Resource) obj);
            }
        }, new Consumer() { // from class: uz8
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                XiaomiRefundViewModel.k((Throwable) obj);
            }
        });
    }

    @NotNull
    public final MutableLiveData<Resource<MiRefundStatus>> getXiaomiRefundStatusLiveData() {
        return this.xiaomiRefundStatusLiveData;
    }

    @NotNull
    public final MutableLiveData<Resource<String>> getXiaomiReturnCardLiveData() {
        return this.xiaomiReturnCardLiveData;
    }

    public final void keep(@NotNull Context context, @NotNull XiaomiBulletin bulletin) {
        BusKeeper.keepBulletin(context, this.dataSource.getUserId(), bulletin.getId());
    }

    @Override // androidx.p008lifecycle.ViewModel
    @VisibleForTesting
    public void onCleared() {
        super.onCleared();
        Disposable disposable = this.xiaomiRefundStatusDisposable;
        if (disposable != null && !disposable.isDisposed()) {
            this.xiaomiRefundStatusDisposable.dispose();
            this.xiaomiRefundStatusDisposable = null;
        }
        Disposable disposable2 = this.xiaomiReturnCardDisposable;
        if (disposable2 == null || disposable2.isDisposed()) {
            return;
        }
        this.xiaomiReturnCardDisposable.dispose();
        this.xiaomiReturnCardDisposable = null;
    }

    public final void returnCard(@NotNull String appCode, @Nullable Integer blance, @Nullable String orderToken) {
        this.xiaomiReturnCardDisposable = Flowable.fromPublisher(this.returnCardMiRepo.returnCard(appCode, blance, orderToken)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: qz8
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                XiaomiRefundViewModel.m(this.a, (Resource) obj);
            }
        }, new Consumer() { // from class: tz8
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                XiaomiRefundViewModel.n((Throwable) obj);
            }
        });
    }

    public final void setXiaomiApplyRefundLiveData(@NotNull MutableLiveData<Resource<String>> mutableLiveData) {
        this.xiaomiApplyRefundLiveData = mutableLiveData;
    }

    public final void setXiaomiRefundStatusLiveData(@NotNull MutableLiveData<Resource<MiRefundStatus>> mutableLiveData) {
        this.xiaomiRefundStatusLiveData = mutableLiveData;
    }

    public final void setXiaomiReturnCardLiveData(@NotNull MutableLiveData<Resource<String>> mutableLiveData) {
        this.xiaomiReturnCardLiveData = mutableLiveData;
    }
}
