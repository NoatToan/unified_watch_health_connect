package com.unionpay.ui.viewmodel;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.MutableLiveData;
import com.unionpay.entity.SupportBank;
import com.unionpay.entity.UnionPayResource;
import com.unionpay.tsm.TsmHelper;
import defpackage.x9;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes18.dex */
public class SupportBankViewModel extends AndroidViewModel {
    private Disposable a;
    public final MutableLiveData<UnionPayResource<List<SupportBank>>> mSupportBankData;

    public SupportBankViewModel(@NonNull Application application) {
        super(application);
        this.mSupportBankData = new MutableLiveData<>();
        loadSupportBank();
    }

    public void loadSupportBank() {
        Observable<UnionPayResource<List<SupportBank>>> supportBank = TsmHelper.getHelper(getApplication()).getSupportBank();
        MutableLiveData<UnionPayResource<List<SupportBank>>> mutableLiveData = this.mSupportBankData;
        Objects.requireNonNull(mutableLiveData);
        this.a = supportBank.subscribe(new x9(mutableLiveData));
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        Disposable disposable = this.a;
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        this.a.dispose();
    }
}
