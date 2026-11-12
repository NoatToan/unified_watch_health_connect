package com.unionpay.ui.viewmodel;

import android.app.Activity;
import android.app.Application;
import androidx.annotation.NonNull;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.MutableLiveData;
import com.unionpay.entity.UnionPayResource;
import com.unionpay.repo.WatchUnionpayRepo;
import com.unionpay.tsm.TsmHelper;
import com.unionpay.tsmservice.data.AppUniteApplyRecord;
import com.unionpay.tsmservice.data.CheckBinCodeInfo;
import com.unionpay.tsmservice.request.CheckBinRequestParams;
import com.unionpay.tsmservice.result.CheckBinCodeResult;
import com.unionpay.tsmservice.result.GetActivityUniteApplyResult;
import com.unionpay.util.WatchUnionpayConfig;
import defpackage.x9;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import java.util.Objects;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes18.dex */
public class AddUnionCardViewModel extends AndroidViewModel {
    private static final String f = "https://api.huami.com/t/huami.watch.unionpay.agreement";
    private Disposable a;
    public final MutableLiveData<UnionPayResource<GetActivityUniteApplyResult>> appApplyResultData;
    private Disposable b;
    private Disposable c;
    public final MutableLiveData<UnionPayResource<CheckBinCodeResult>> checkBinData;
    private Lazy<WatchUnionpayRepo> d;
    private Lazy<WatchUnionpayConfig> e;
    public final MutableLiveData<UnionPayResource<Integer>> mDownloadProgressData;

    public AddUnionCardViewModel(@NonNull Application application) {
        super(application);
        this.checkBinData = new MutableLiveData<>();
        this.appApplyResultData = new MutableLiveData<>();
        this.mDownloadProgressData = new MutableLiveData<>();
        this.d = KoinJavaComponent.inject(WatchUnionpayRepo.class);
        this.e = KoinJavaComponent.inject(WatchUnionpayConfig.class);
    }

    public void checkBinCode(@NonNull String str) {
        new CheckBinRequestParams().setSPan(str);
        Observable<UnionPayResource<CheckBinCodeResult>> observableCheckBinCode = TsmHelper.getHelper(getApplication()).checkBinCode(str);
        MutableLiveData<UnionPayResource<CheckBinCodeResult>> mutableLiveData = this.checkBinData;
        Objects.requireNonNull(mutableLiveData);
        this.a = observableCheckBinCode.subscribe(new x9(mutableLiveData));
    }

    public void downloadCard(AppUniteApplyRecord appUniteApplyRecord) {
        Observable<UnionPayResource<Integer>> observableDownloadCard = TsmHelper.getHelper(getApplication()).downloadCard(appUniteApplyRecord.getMPanId());
        MutableLiveData<UnionPayResource<Integer>> mutableLiveData = this.mDownloadProgressData;
        Objects.requireNonNull(mutableLiveData);
        this.c = observableDownloadCard.subscribe(new x9(mutableLiveData));
    }

    public String getBankCardId() {
        GetActivityUniteApplyResult getActivityUniteApplyResult;
        return (this.appApplyResultData.getValue() == null || (getActivityUniteApplyResult = this.appApplyResultData.getValue().data) == null) ? "" : getActivityUniteApplyResult.getApplyResult().getAppId();
    }

    public String getProtocolTitle() {
        return this.e.getValue().getProtocolTitle();
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        Disposable disposable = this.a;
        if (disposable != null && !disposable.isDisposed()) {
            this.a.dispose();
        }
        Disposable disposable2 = this.b;
        if (disposable2 != null && !disposable2.isDisposed()) {
            this.b.dispose();
        }
        Disposable disposable3 = this.c;
        if (disposable3 == null || disposable3.isDisposed()) {
            return;
        }
        this.c.dispose();
    }

    public void openUniteCardApply(Activity activity, String str, CheckBinCodeInfo checkBinCodeInfo) {
        Observable<UnionPayResource<GetActivityUniteApplyResult>> observableOpenUniteCardApply = TsmHelper.getHelper(getApplication()).openUniteCardApply(activity, str, checkBinCodeInfo);
        MutableLiveData<UnionPayResource<GetActivityUniteApplyResult>> mutableLiveData = this.appApplyResultData;
        Objects.requireNonNull(mutableLiveData);
        this.b = observableOpenUniteCardApply.subscribe(new x9(mutableLiveData));
    }

    public void showProtocol() {
        this.d.getValue().goToWeb(f, null);
    }

    public void syncIssueToDevice(String str) {
        this.d.getValue().syncIssueResultToDevice(str);
    }
}
