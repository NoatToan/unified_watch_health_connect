package com.huami.wallet.ui.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import com.huami.wallet.lib.entity.Protocol;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.ui.repository.ShiftCardRepo;
import com.huami.wallet.ui.viewmodel.ShiftOutTipsCardViewModel;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR%\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R%\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016¨\u0006 "}, d2 = {"Lcom/huami/wallet/ui/viewmodel/ShiftOutTipsCardViewModel;", "Landroidx/lifecycle/ViewModel;", "", "onCleared", "", "appCode", "getShiftProtocol", "agreeShiftProtocol", "Lcom/huami/wallet/ui/repository/ShiftCardRepo;", "a", "Lcom/huami/wallet/ui/repository/ShiftCardRepo;", "shiftCardRepo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/wallet/lib/entity/Resource;", "Lcom/huami/wallet/lib/entity/Protocol;", "b", "Landroidx/lifecycle/MutableLiveData;", "getShiftProtocolLiveData", "()Landroidx/lifecycle/MutableLiveData;", "shiftProtocolLiveData", "Lio/reactivex/disposables/Disposable;", "c", "Lio/reactivex/disposables/Disposable;", "shiftProtocolDisposable", GoogleApiAvailabilityLight.a, "getAgreeShiftProtocolLiveData", "agreeShiftProtocolLiveData", "e", "agreeShiftProtocolDisposable", "<init>", "(Lcom/huami/wallet/ui/repository/ShiftCardRepo;)V", "Companion", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class ShiftOutTipsCardViewModel extends ViewModel {

    @NotNull
    private static final String f = "Wallet-ShiftCardViewModel";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ShiftCardRepo shiftCardRepo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Disposable shiftProtocolDisposable;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Disposable agreeShiftProtocolDisposable;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<Protocol>> shiftProtocolLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<String>> agreeShiftProtocolLiveData = new MutableLiveData<>();

    public ShiftOutTipsCardViewModel(@NotNull ShiftCardRepo shiftCardRepo) {
        this.shiftCardRepo = shiftCardRepo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(ShiftOutTipsCardViewModel shiftOutTipsCardViewModel, Resource resource) {
        shiftOutTipsCardViewModel.getAgreeShiftProtocolLiveData().setValue(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Throwable th) {
        HMLog.w(f, th, "agreeShiftProtocol时发生了意外的错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(ShiftOutTipsCardViewModel shiftOutTipsCardViewModel, Resource resource) {
        shiftOutTipsCardViewModel.getShiftProtocolLiveData().setValue(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(Throwable th) {
        HMLog.w(f, th, "getShiftProtocol时发生了意外的错误", new Object[0]);
    }

    public final void agreeShiftProtocol(@NotNull String appCode) {
        Protocol protocol;
        Protocol protocol2;
        if (this.shiftProtocolLiveData.getValue() != null) {
            Resource<Protocol> value = this.shiftProtocolLiveData.getValue();
            Long id = null;
            if ((value == null ? null : value.data) != null) {
                Resource<Protocol> value2 = this.shiftProtocolLiveData.getValue();
                if (((value2 == null || (protocol = value2.data) == null) ? null : protocol.getId()) != null) {
                    ShiftCardRepo shiftCardRepo = this.shiftCardRepo;
                    Resource<Protocol> value3 = this.shiftProtocolLiveData.getValue();
                    if (value3 != null && (protocol2 = value3.data) != null) {
                        id = protocol2.getId();
                    }
                    this.agreeShiftProtocolDisposable = Flowable.fromPublisher(shiftCardRepo.agreeShiftProtocol(appCode, id)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: rt6
                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            ShiftOutTipsCardViewModel.f(this.a, (Resource) obj);
                        }
                    }, new Consumer() { // from class: st6
                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            ShiftOutTipsCardViewModel.g((Throwable) obj);
                        }
                    });
                    return;
                }
            }
        }
        this.agreeShiftProtocolLiveData.setValue(Resource.success(""));
    }

    @NotNull
    public final MutableLiveData<Resource<String>> getAgreeShiftProtocolLiveData() {
        return this.agreeShiftProtocolLiveData;
    }

    public final void getShiftProtocol(@NotNull String appCode) {
        this.shiftProtocolDisposable = Flowable.fromPublisher(this.shiftCardRepo.getShiftProtocol(appCode)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: qt6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ShiftOutTipsCardViewModel.h(this.a, (Resource) obj);
            }
        }, new Consumer() { // from class: tt6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ShiftOutTipsCardViewModel.i((Throwable) obj);
            }
        });
    }

    @NotNull
    public final MutableLiveData<Resource<Protocol>> getShiftProtocolLiveData() {
        return this.shiftProtocolLiveData;
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        Disposable disposable = this.shiftProtocolDisposable;
        if (disposable != null && !disposable.isDisposed()) {
            Disposable disposable2 = this.shiftProtocolDisposable;
            if (disposable2 != null) {
                disposable2.dispose();
            }
            this.shiftProtocolDisposable = null;
        }
        Disposable disposable3 = this.agreeShiftProtocolDisposable;
        if (disposable3 == null || disposable3.isDisposed()) {
            return;
        }
        Disposable disposable4 = this.agreeShiftProtocolDisposable;
        if (disposable4 != null) {
            disposable4.dispose();
        }
        this.agreeShiftProtocolDisposable = null;
    }
}
