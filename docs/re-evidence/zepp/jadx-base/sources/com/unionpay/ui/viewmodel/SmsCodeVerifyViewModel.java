package com.unionpay.ui.viewmodel;

import android.app.Application;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import com.unionpay.entity.UnionPayResource;
import com.unionpay.tsm.TsmHelper;
import com.unionpay.tsmservice.result.GetSMSAuthCodeResult;
import com.unionpay.util.BankRx;
import defpackage.x9;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes18.dex */
public class SmsCodeVerifyViewModel extends AndroidViewModel {
    private Disposable a;
    private Disposable b;
    private Disposable c;
    public final MutableLiveData<UnionPayResource<GetSMSAuthCodeResult>> getSmsCodeData;
    public final MediatorLiveData<Integer> remainTimeData;
    public final MutableLiveData<UnionPayResource<Bundle>> verifySmsCodeData;

    public SmsCodeVerifyViewModel(@NonNull Application application) {
        super(application);
        this.remainTimeData = new MediatorLiveData<>();
        this.getSmsCodeData = new MutableLiveData<>();
        this.verifySmsCodeData = new MutableLiveData<>();
        c();
    }

    private void c() {
        this.remainTimeData.addSource(this.getSmsCodeData, new Observer() { // from class: q47
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.e((UnionPayResource) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void e(UnionPayResource unionPayResource) {
        T t;
        if (unionPayResource == null || !unionPayResource.isSuccessful() || (t = unionPayResource.data) == 0) {
            return;
        }
        g(Integer.parseInt(((GetSMSAuthCodeResult) t).getSmsAuthCode().getExpireNote()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(int i, Long l) throws Exception {
        if (this.remainTimeData.getValue() == null) {
            this.remainTimeData.postValue(Integer.valueOf(i));
        } else {
            this.remainTimeData.postValue(Integer.valueOf(this.remainTimeData.getValue().intValue() - 1));
        }
    }

    private void g(final int i) {
        Disposable disposable = this.a;
        if (disposable != null && !disposable.isDisposed()) {
            this.a.dispose();
        }
        this.remainTimeData.postValue(Integer.valueOf(i));
        this.a = Observable.interval(1L, TimeUnit.SECONDS).subscribeOn(Schedulers.io()).observeOn(Schedulers.io()).subscribe(new Consumer() { // from class: r47
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.f(i, (Long) obj);
            }
        });
    }

    public void getSmsCode(String str) {
        Observable<UnionPayResource<GetSMSAuthCodeResult>> smsCode = TsmHelper.getHelper(getApplication()).getSmsCode(str);
        MutableLiveData<UnionPayResource<GetSMSAuthCodeResult>> mutableLiveData = this.getSmsCodeData;
        Objects.requireNonNull(mutableLiveData);
        this.b = smsCode.subscribe(new x9(mutableLiveData));
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

    public void verifySmsCode(String str, String str2) {
        BankRx.RxBuilder<UnionPayResource<Bundle>> rxBuilderVerifySmsCode = TsmHelper.getHelper(getApplication()).verifySmsCode(str, str2);
        MutableLiveData<UnionPayResource<Bundle>> mutableLiveData = this.verifySmsCodeData;
        Objects.requireNonNull(mutableLiveData);
        this.c = rxBuilderVerifySmsCode.safeSubscribe(new x9(mutableLiveData));
    }
}
