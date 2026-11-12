package com.huami.wallet.ui.viewmodel;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import com.huami.nfc.bus.entities.XiaomiBulletin;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.wallet.lib.api.WalletDataSource;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.entity.XiaomiBulletinType;
import com.huami.wallet.lib.util.BusKeeper;
import com.huami.wallet.ui.viewmodel.XiaomiBulletinViewModel;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b \u0010!J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u0016\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ\b\u0010\u000e\u001a\u00020\u0007H\u0017R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R.\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00140\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/huami/wallet/ui/viewmodel/XiaomiBulletinViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huami/wallet/lib/entity/XiaomiBulletinType;", "type", "", "xmCardName", "appCode", "", "getXiaomiBulletins", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/nfc/bus/entities/XiaomiBulletin;", "bulletin", "keep", "onCleared", "Lcom/huami/wallet/lib/api/WalletDataSource;", "a", "Lcom/huami/wallet/lib/api/WalletDataSource;", ParamKey.dataSource, "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/wallet/lib/entity/Resource;", "b", "Landroidx/lifecycle/MutableLiveData;", "getXiaomiBulletinLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setXiaomiBulletinLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "xiaomiBulletinLiveData", "Lio/reactivex/disposables/Disposable;", "c", "Lio/reactivex/disposables/Disposable;", "xiaomiBulletinDisposable", "<init>", "(Lcom/huami/wallet/lib/api/WalletDataSource;)V", "Companion", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public class XiaomiBulletinViewModel extends ViewModel {

    @NotNull
    public static final String TAG = "XiaomiBulletinViewModel";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final WalletDataSource dataSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Resource<XiaomiBulletin>> xiaomiBulletinLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Disposable xiaomiBulletinDisposable;

    public XiaomiBulletinViewModel(@NotNull WalletDataSource walletDataSource) {
        this.dataSource = walletDataSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(XiaomiBulletinViewModel xiaomiBulletinViewModel, Resource resource) {
        xiaomiBulletinViewModel.getXiaomiBulletinLiveData().setValue(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Throwable th) {
        HMLog.w(TAG, th, "getXiaomiBulletins时发生了意外的错误", new Object[0]);
    }

    public static /* synthetic */ void getXiaomiBulletins$default(XiaomiBulletinViewModel xiaomiBulletinViewModel, XiaomiBulletinType xiaomiBulletinType, String str, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getXiaomiBulletins");
        }
        if ((i & 2) != 0) {
            str = null;
        }
        xiaomiBulletinViewModel.getXiaomiBulletins(xiaomiBulletinType, str, str2);
    }

    @NotNull
    public final MutableLiveData<Resource<XiaomiBulletin>> getXiaomiBulletinLiveData() {
        return this.xiaomiBulletinLiveData;
    }

    public final void getXiaomiBulletins(@NotNull XiaomiBulletinType type, @Nullable String xmCardName, @NotNull String appCode) {
        this.xiaomiBulletinDisposable = Flowable.fromPublisher(this.dataSource.getXiaomiBulletins(type, xmCardName, appCode)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: nz8
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                XiaomiBulletinViewModel.c(this.a, (Resource) obj);
            }
        }, new Consumer() { // from class: oz8
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                XiaomiBulletinViewModel.e((Throwable) obj);
            }
        });
    }

    public final void keep(@NotNull Context context, @NotNull XiaomiBulletin bulletin) {
        BusKeeper.keepBulletin(context, this.dataSource.getUserId(), bulletin.getId());
    }

    @Override // androidx.p008lifecycle.ViewModel
    @VisibleForTesting
    public void onCleared() {
        super.onCleared();
        Disposable disposable = this.xiaomiBulletinDisposable;
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        this.xiaomiBulletinDisposable.dispose();
        this.xiaomiBulletinDisposable = null;
    }

    public final void setXiaomiBulletinLiveData(@NotNull MutableLiveData<Resource<XiaomiBulletin>> mutableLiveData) {
        this.xiaomiBulletinLiveData = mutableLiveData;
    }
}
