package com.huami.wallet.ui.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.nfc.bus.OrderEntity;
import com.huami.nfc.bus.PayType;
import com.huami.tools.log.HMLog;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.ui.repository.ShiftCardRepo;
import com.huami.wallet.ui.viewmodel.ShiftCardViewModel;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000 32\u00020\u0001:\u00013B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b1\u00102J\b\u0010\u0003\u001a\u00020\u0002H\u0014J \u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0004J\"\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004J\"\u0010\r\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0004R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R%\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00128\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR%\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00128\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018R\u0018\u0010\"\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001cR%\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00130\u00128\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010\u0016\u001a\u0004\b%\u0010\u0018R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0018\u00100\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010\u001c¨\u00064"}, d2 = {"Lcom/huami/wallet/ui/viewmodel/ShiftCardViewModel;", "Landroidx/lifecycle/ViewModel;", "", "onCleared", "", "appCode", "Lcom/huami/nfc/bus/PayType;", "payType", "shiftOrderNo", "generateShiftOrder", "orderID", "shiftIn", "orderToken", "shiftOut", "Lcom/huami/wallet/ui/repository/ShiftCardRepo;", "a", "Lcom/huami/wallet/ui/repository/ShiftCardRepo;", "shiftCardRepo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/wallet/lib/entity/Resource;", "", "b", "Landroidx/lifecycle/MutableLiveData;", "getShiftInLiveData", "()Landroidx/lifecycle/MutableLiveData;", "shiftInLiveData", "Lio/reactivex/disposables/Disposable;", "c", "Lio/reactivex/disposables/Disposable;", "shiftInDisposable", GoogleApiAvailabilityLight.a, "getShiftOutLiveData", "shiftOutLiveData", "e", "shiftOutDisposable", "Lcom/huami/nfc/bus/OrderEntity;", "f", "getShiftOrderLiveData", "shiftOrderLiveData", "", "g", LogUtil.I, "getShiftInRetryTime", "()I", "setShiftInRetryTime", "(I)V", "shiftInRetryTime", "h", "shiftOrderDisposable", "<init>", "(Lcom/huami/wallet/ui/repository/ShiftCardRepo;)V", "Companion", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class ShiftCardViewModel extends ViewModel {

    @NotNull
    private static final String i = "Wallet-ShiftCardViewModel";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ShiftCardRepo shiftCardRepo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Disposable shiftInDisposable;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Disposable shiftOutDisposable;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int shiftInRetryTime;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private Disposable shiftOrderDisposable;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<Boolean>> shiftInLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<Boolean>> shiftOutLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<OrderEntity>> shiftOrderLiveData = new MutableLiveData<>();

    public ShiftCardViewModel(@NotNull ShiftCardRepo shiftCardRepo) {
        this.shiftCardRepo = shiftCardRepo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(ShiftCardViewModel shiftCardViewModel, Resource resource) {
        shiftCardViewModel.getShiftOrderLiveData().setValue(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(Throwable th) {
        HMLog.w(i, th, "shiftOrder时发生了意外的错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(ShiftCardViewModel shiftCardViewModel, Resource resource) {
        shiftCardViewModel.getShiftInLiveData().setValue(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(Throwable th) {
        HMLog.w(i, th, "shiftIn时发生了意外的错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(ShiftCardViewModel shiftCardViewModel, Resource resource) {
        shiftCardViewModel.getShiftOutLiveData().setValue(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(Throwable th) {
        HMLog.w(i, th, "shiftOut时发生了意外的错误", new Object[0]);
    }

    public final void generateShiftOrder(@NotNull String appCode, @NotNull PayType payType, @Nullable String shiftOrderNo) {
        this.shiftInDisposable = Flowable.fromPublisher(this.shiftCardRepo.generateShiftOrder(appCode, payType, shiftOrderNo)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: kt6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ShiftCardViewModel.h(this.a, (Resource) obj);
            }
        }, new Consumer() { // from class: pt6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ShiftCardViewModel.i((Throwable) obj);
            }
        });
    }

    @NotNull
    public final MutableLiveData<Resource<Boolean>> getShiftInLiveData() {
        return this.shiftInLiveData;
    }

    public final int getShiftInRetryTime() {
        return this.shiftInRetryTime;
    }

    @NotNull
    public final MutableLiveData<Resource<OrderEntity>> getShiftOrderLiveData() {
        return this.shiftOrderLiveData;
    }

    @NotNull
    public final MutableLiveData<Resource<Boolean>> getShiftOutLiveData() {
        return this.shiftOutLiveData;
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        Disposable disposable = this.shiftInDisposable;
        if (disposable != null && !disposable.isDisposed()) {
            this.shiftInDisposable.dispose();
            this.shiftInDisposable = null;
        }
        Disposable disposable2 = this.shiftOutDisposable;
        if (disposable2 != null && !disposable2.isDisposed()) {
            this.shiftOutDisposable.dispose();
            this.shiftOutDisposable = null;
        }
        Disposable disposable3 = this.shiftOrderDisposable;
        if (disposable3 != null && !disposable3.isDisposed()) {
            this.shiftOrderDisposable.dispose();
            this.shiftOrderDisposable = null;
        }
        this.shiftInRetryTime = 0;
    }

    public final void setShiftInRetryTime(int i2) {
        this.shiftInRetryTime = i2;
    }

    public final void shiftIn(@NotNull String appCode, @Nullable String orderID, @Nullable String shiftOrderNo) {
        if (orderID == null || orderID.length() == 0) {
            generateShiftOrder(appCode, PayType.MoveIn, shiftOrderNo);
        } else {
            this.shiftInDisposable = Flowable.fromPublisher(this.shiftCardRepo.shiftIn(appCode, orderID)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: mt6
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ShiftCardViewModel.j(this.a, (Resource) obj);
                }
            }, new Consumer() { // from class: nt6
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ShiftCardViewModel.k((Throwable) obj);
                }
            });
        }
    }

    public final void shiftOut(@NotNull String appCode, @Nullable String orderID, @Nullable String orderToken) {
        if (orderID == null || orderID.length() == 0) {
            generateShiftOrder(appCode, PayType.MoveOut, null);
        } else {
            this.shiftOutDisposable = Flowable.fromPublisher(this.shiftCardRepo.shiftOut(appCode, orderID, orderToken)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: lt6
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ShiftCardViewModel.m(this.a, (Resource) obj);
                }
            }, new Consumer() { // from class: ot6
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ShiftCardViewModel.n((Throwable) obj);
                }
            });
        }
    }
}
