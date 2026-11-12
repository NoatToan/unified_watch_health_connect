package com.huami.wallet.ui.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.util.ErrorCode;
import com.huami.wallet.ui.repository.ShiftCardMiRepo;
import com.huami.wallet.ui.viewmodel.ShiftCardMiViewModel;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 (2\u00020\u0001:\u0001(B\u000f\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\"\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\"\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR%\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000f0\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R%\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000f0\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006)"}, d2 = {"Lcom/huami/wallet/ui/viewmodel/ShiftCardMiViewModel;", "Landroidx/lifecycle/ViewModel;", "", "onCleared", "", "appCode", "orderID", "orderToken", "shiftOutCard", "shiftInCard", "Lcom/huami/wallet/ui/repository/ShiftCardMiRepo;", "a", "Lcom/huami/wallet/ui/repository/ShiftCardMiRepo;", "shiftCardMiRepo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/wallet/lib/entity/Resource;", "b", "Landroidx/lifecycle/MutableLiveData;", "getShiftOutLiveData", "()Landroidx/lifecycle/MutableLiveData;", "shiftOutLiveData", "c", "getShiftInLiveData", "shiftInLiveData", "Lio/reactivex/disposables/Disposable;", GoogleApiAvailabilityLight.a, "Lio/reactivex/disposables/Disposable;", "shiftOutDisposable", "e", "shiftInDisposable", "", "f", LogUtil.I, "getShiftInRetryTime", "()I", "setShiftInRetryTime", "(I)V", "shiftInRetryTime", "<init>", "(Lcom/huami/wallet/ui/repository/ShiftCardMiRepo;)V", "Companion", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class ShiftCardMiViewModel extends ViewModel {

    @NotNull
    private static final String g = "Wallet-ShiftCardMiViewModel";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ShiftCardMiRepo shiftCardMiRepo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<String>> shiftOutLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<String>> shiftInLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private Disposable shiftOutDisposable;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Disposable shiftInDisposable;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int shiftInRetryTime;

    public ShiftCardMiViewModel(@NotNull ShiftCardMiRepo shiftCardMiRepo) {
        this.shiftCardMiRepo = shiftCardMiRepo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(ShiftCardMiViewModel shiftCardMiViewModel, Resource resource) {
        if ((resource == null ? null : resource.code) != null) {
            String str = resource.code;
            if ((str != null ? Boolean.valueOf(StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) ErrorCode.NETWORK_ERROR, false, 2, (Object) null)) : null).booleanValue()) {
                shiftCardMiViewModel.getShiftInLiveData().setValue(Resource.error("(w10015)", "网络异常", ""));
                return;
            }
        }
        shiftCardMiViewModel.getShiftInLiveData().setValue(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Throwable th) {
        HMLog.w(g, th, "shiftInCard时发生了意外的错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(ShiftCardMiViewModel shiftCardMiViewModel, Resource resource) {
        if ((resource == null ? null : resource.code) != null) {
            String str = resource.code;
            if ((str != null ? Boolean.valueOf(StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) ErrorCode.NETWORK_ERROR, false, 2, (Object) null)) : null).booleanValue()) {
                shiftCardMiViewModel.getShiftOutLiveData().setValue(Resource.error("(w10015)", "网络异常", ""));
                return;
            }
        }
        shiftCardMiViewModel.getShiftOutLiveData().setValue(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(Throwable th) {
        HMLog.w(g, th, "shiftOutCard时发生了意外的错误", new Object[0]);
    }

    @NotNull
    public final MutableLiveData<Resource<String>> getShiftInLiveData() {
        return this.shiftInLiveData;
    }

    public final int getShiftInRetryTime() {
        return this.shiftInRetryTime;
    }

    @NotNull
    public final MutableLiveData<Resource<String>> getShiftOutLiveData() {
        return this.shiftOutLiveData;
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        Disposable disposable = this.shiftOutDisposable;
        if (disposable != null && !disposable.isDisposed()) {
            this.shiftOutDisposable.dispose();
            this.shiftOutDisposable = null;
        }
        Disposable disposable2 = this.shiftInDisposable;
        if (disposable2 != null && !disposable2.isDisposed()) {
            this.shiftInDisposable.dispose();
            this.shiftInDisposable = null;
        }
        this.shiftInRetryTime = 0;
    }

    public final void setShiftInRetryTime(int i) {
        this.shiftInRetryTime = i;
    }

    public final void shiftInCard(@NotNull String appCode, @Nullable String orderID, @Nullable String orderToken) {
        this.shiftInDisposable = Flowable.fromPublisher(this.shiftCardMiRepo.shiftInCard(appCode, orderID, orderToken)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: gt6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ShiftCardMiViewModel.f(this.a, (Resource) obj);
            }
        }, new Consumer() { // from class: it6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ShiftCardMiViewModel.g((Throwable) obj);
            }
        });
    }

    public final void shiftOutCard(@NotNull String appCode, @Nullable String orderID, @Nullable String orderToken) {
        this.shiftOutDisposable = Flowable.fromPublisher(this.shiftCardMiRepo.shiftOutCard(appCode, orderID, orderToken)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: ft6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ShiftCardMiViewModel.h(this.a, (Resource) obj);
            }
        }, new Consumer() { // from class: ht6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ShiftCardMiViewModel.i((Throwable) obj);
            }
        });
    }
}
