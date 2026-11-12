package com.unionpay.ui.viewmodel;

import android.app.Application;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import com.huami.tools.log.HMLog;
import com.unionpay.entity.UnionPayResource;
import com.unionpay.entity.WatchBankCardInfo;
import com.unionpay.repo.WatchUnionpayRepo;
import com.unionpay.tsm.TsmHelper;
import com.unionpay.tsmservice.ITsmProgressCallback;
import com.unionpay.tsmservice.data.UniteAppDetail;
import com.unionpay.tsmservice.data.UpdateInfo;
import com.unionpay.ui.viewmodel.CardDetailViewModel;
import com.unionpay.util.BankRx;
import defpackage.x9;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes18.dex */
public class CardDetailViewModel extends AndroidViewModel {
    private static final String h = "UnionPay-CardDetailViewModel";
    private static final String i = "/pages/huami.watch.unionpay.faq";
    private Disposable a;
    public final MediatorLiveData<UnionPayResource<List<UniteAppDetail>>> appListData;
    private Disposable b;
    private Disposable c;
    public final MediatorLiveData<UniteAppDetail> currentCardData;
    private Disposable d;
    public final MutableLiveData<UnionPayResource<UniteAppDetail>> deleteCardData;
    public final MutableLiveData<UnionPayResource<Integer>> downloadProgressData;
    private Lazy<WatchUnionpayRepo> e;
    private int f;
    private String g;
    public final MutableLiveData<UnionPayResource<UpdateInfo>> updateInfoData;

    public class a extends ITsmProgressCallback.Stub {
        public a() {
        }

        @Override // com.unionpay.tsmservice.ITsmProgressCallback
        public void onProgress(int i) {
        }
    }

    public CardDetailViewModel(@NonNull Application application) {
        super(application);
        this.updateInfoData = new MutableLiveData<>();
        this.appListData = new MediatorLiveData<>();
        this.deleteCardData = new MutableLiveData<>();
        this.currentCardData = new MediatorLiveData<>();
        this.downloadProgressData = new MutableLiveData<>();
        this.e = KoinJavaComponent.inject(WatchUnionpayRepo.class);
        initTsm();
        m();
    }

    private void m() {
        this.appListData.addSource(this.updateInfoData, new Observer() { // from class: xk0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.n((UnionPayResource) obj);
            }
        });
        this.currentCardData.addSource(this.appListData, new Observer() { // from class: zk0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.o((UnionPayResource) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void n(UnionPayResource unionPayResource) {
        T t;
        if (unionPayResource == null || (t = unionPayResource.data) == 0 || "02".equals(((UpdateInfo) t).getType())) {
            return;
        }
        loadCardList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(UnionPayResource unionPayResource) {
        setCurrentCard();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(ArrayList arrayList, ObservableEmitter observableEmitter) throws Exception {
        this.e.getValue().syncCardListToDevice(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q(Void r0) throws Exception {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(UniteAppDetail uniteAppDetail, ObservableEmitter observableEmitter) throws Exception {
        this.e.getValue().syncCardInfoToDevice(uniteAppDetail.getAppID(), uniteAppDetail.getAppProviderName() + "（****" + uniteAppDetail.getSPan() + "）");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s(Void r0) throws Exception {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(String str, ObservableEmitter observableEmitter) throws Exception {
        this.e.getValue().syncDeleteResultToDevice(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u(Void r0) throws Exception {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(String str, ObservableEmitter observableEmitter) throws Exception {
        this.e.getValue().syncIssueResultToDevice(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w(Void r0) throws Exception {
    }

    public void deleteCard(@NonNull UniteAppDetail uniteAppDetail) {
        Observable<UnionPayResource<UniteAppDetail>> observableDeleteCard = TsmHelper.getHelper(getApplication()).deleteCard(uniteAppDetail, new a(), true);
        MutableLiveData<UnionPayResource<UniteAppDetail>> mutableLiveData = this.deleteCardData;
        Objects.requireNonNull(mutableLiveData);
        this.c = observableDeleteCard.subscribe(new x9(mutableLiveData));
    }

    public void downloadCard(String str) {
        Observable<UnionPayResource<Integer>> observableDownloadCard = TsmHelper.getHelper(getApplication()).downloadCard(str);
        MutableLiveData<UnionPayResource<Integer>> mutableLiveData = this.downloadProgressData;
        Objects.requireNonNull(mutableLiveData);
        this.d = observableDownloadCard.subscribe(new x9(mutableLiveData));
    }

    public String getDeviceModel() {
        return this.e.getValue().getDeviceModel();
    }

    public String getWebHost() {
        return this.e.getValue().getWebHost();
    }

    public void initTsm() {
        Observable<UnionPayResource<UpdateInfo>> observableInit = TsmHelper.getHelper(getApplication()).init();
        MutableLiveData<UnionPayResource<UpdateInfo>> mutableLiveData = this.updateInfoData;
        Objects.requireNonNull(mutableLiveData);
        this.a = observableInit.subscribe(new x9(mutableLiveData));
    }

    public void loadCardList() {
        Observable<UnionPayResource<List<UniteAppDetail>>> observableLoadCardList = TsmHelper.getHelper(getApplication()).loadCardList("1", "2");
        final MediatorLiveData<UnionPayResource<List<UniteAppDetail>>> mediatorLiveData = this.appListData;
        Objects.requireNonNull(mediatorLiveData);
        this.b = observableLoadCardList.subscribe(new Consumer() { // from class: el0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                mediatorLiveData.setValue((UnionPayResource) obj);
            }
        });
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        TsmHelper.getHelper(getApplication()).release();
        Disposable disposable = this.a;
        if (disposable != null && !disposable.isDisposed()) {
            this.a.dispose();
        }
        Disposable disposable2 = this.b;
        if (disposable2 != null && !disposable2.isDisposed()) {
            this.b.dispose();
        }
        Disposable disposable3 = this.c;
        if (disposable3 != null && !disposable3.isDisposed()) {
            this.c.dispose();
        }
        Disposable disposable4 = this.d;
        if (disposable4 == null || disposable4.isDisposed()) {
            return;
        }
        this.d.dispose();
    }

    public boolean queryPwd() {
        return this.e.getValue().queryPwd();
    }

    public void setCardId(String str) {
        this.g = str;
        if (str == null) {
            this.g = "";
        }
        setCurrentCard();
    }

    public void setCurrentCard() {
        List<UniteAppDetail> list;
        if (TextUtils.isEmpty(this.g)) {
            this.f = 0;
        }
        if (this.appListData.getValue() == null || (list = this.appListData.getValue().data) == null || list.isEmpty()) {
            return;
        }
        int size = list.size();
        HMLog.d(h, "size:" + size + ",mCardId:" + this.g, new Object[0]);
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2).getAppID().equalsIgnoreCase(this.g)) {
                this.f = i2;
                HMLog.i(h, "mIndex:" + this.f, new Object[0]);
                break;
            }
        }
        int i3 = this.f;
        if (i3 < 0 || i3 >= list.size()) {
            this.f = 0;
        }
        HMLog.i(h, "final mIndex:" + this.f, new Object[0]);
        this.currentCardData.setValue(list.get(this.f));
    }

    public void showFaq() {
        this.e.getValue().goToWeb(this.e.getValue().getWebHost() + i, null);
    }

    public void syncAllUnionCardInfoToWatch(final ArrayList<WatchBankCardInfo> arrayList) {
        BankRx.io(new ObservableOnSubscribe() { // from class: dl0
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.p(arrayList, observableEmitter);
            }
        }).safeSubscribe(new Consumer() { // from class: gl0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                CardDetailViewModel.q((Void) obj);
            }
        });
    }

    public void syncCardInfoToDevice(final UniteAppDetail uniteAppDetail) {
        BankRx.io(new ObservableOnSubscribe() { // from class: al0
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.r(uniteAppDetail, observableEmitter);
            }
        }).safeSubscribe(new Consumer() { // from class: hl0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                CardDetailViewModel.s((Void) obj);
            }
        });
    }

    public void syncDeleteResultToWatch(final String str) {
        BankRx.io(new ObservableOnSubscribe() { // from class: cl0
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.t(str, observableEmitter);
            }
        }).safeSubscribe(new Consumer() { // from class: yk0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                CardDetailViewModel.u((Void) obj);
            }
        });
    }

    public void syncIssueResultToWatch(final String str) {
        BankRx.io(new ObservableOnSubscribe() { // from class: bl0
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.v(str, observableEmitter);
            }
        }).safeSubscribe(new Consumer() { // from class: fl0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                CardDetailViewModel.w((Void) obj);
            }
        });
    }
}
