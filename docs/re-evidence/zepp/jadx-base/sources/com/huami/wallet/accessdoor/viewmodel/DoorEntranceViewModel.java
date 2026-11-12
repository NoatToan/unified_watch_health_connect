package com.huami.wallet.accessdoor.viewmodel;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.nfc.door.DoorCardInfo;
import com.huami.nfc.door.WorkerInfo;
import com.huami.tools.log.HMLog;
import com.huami.wallet.accessdoor.api.service.AccessDoorDataSource;
import com.huami.wallet.accessdoor.helper.AccessDoorPageHelper;
import com.huami.wallet.accessdoor.helper.DoorCardExtensionKt;
import com.huami.wallet.accessdoor.helper.Resource;
import com.huami.wallet.accessdoor.koinmodule.DoorScopeKt;
import com.huami.wallet.accessdoor.viewmodel.DoorEntranceViewModel;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001,\u0018\u0000 42\u00020\u0001:\u00014B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\b3\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rJ\b\u0010\u0010\u001a\u00020\u0004H\u0014R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR4\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001e0\u001d0\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R.\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001d0\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001b\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n008F@\u0006¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00065"}, d2 = {"Lcom/huami/wallet/accessdoor/viewmodel/DoorEntranceViewModel;", "Lcom/huami/wallet/accessdoor/viewmodel/BaseViewModel;", "", "isRequestWorker", "", "getCardList", "", "aid", "isDefaultCard", "bindDeviceDeleteDoorCard", "Lcom/huami/nfc/door/WorkerInfo;", "workerInfo", "setWorkInfo", "Lcom/huami/nfc/door/DoorCardInfo;", "doorCardInfo", "isWorkCard", "onCleared", "Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;", "b", "Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;", "getDoorDataSource", "()Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;", "setDoorDataSource", "(Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;)V", "doorDataSource", "Landroidx/lifecycle/MutableLiveData;", "c", "Landroidx/lifecycle/MutableLiveData;", "mutableWorkerInfo", "Lcom/huami/wallet/accessdoor/helper/Resource;", "", GoogleApiAvailabilityLight.a, "getGetCardListLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setGetCardListLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "getCardListLiveData", "e", "isDefaultCardLiveData", "setDefaultCardLiveData", "Lio/reactivex/disposables/Disposable;", "f", "Lio/reactivex/disposables/Disposable;", "getCardListDisposable", "com/huami/wallet/accessdoor/viewmodel/DoorEntranceViewModel$mDoorPageListener$1", "g", "Lcom/huami/wallet/accessdoor/viewmodel/DoorEntranceViewModel$mDoorPageListener$1;", "mDoorPageListener", "Landroidx/lifecycle/LiveData;", "getWorkerInfo", "()Landroidx/lifecycle/LiveData;", "<init>", "Companion", "access-door_release"}, k = 1, mv = {1, 5, 1})
public final class DoorEntranceViewModel extends BaseViewModel {

    @NotNull
    private static final String h = "Wallet-DoorEntranceViewModel";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private AccessDoorDataSource doorDataSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<WorkerInfo> mutableWorkerInfo = new MutableLiveData<>(null);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Resource<List<DoorCardInfo>>> getCardListLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Resource<Boolean>> isDefaultCardLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private Disposable getCardListDisposable;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final DoorEntranceViewModel$mDoorPageListener$1 mDoorPageListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Resource<Boolean>, Unit> {
        public a() {
            super(1);
        }

        public final void a(@NotNull Resource<Boolean> resource) {
            DoorEntranceViewModel.this.isDefaultCardLiveData().setValue(resource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<Boolean> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.huami.wallet.accessdoor.helper.AccessDoorPageHelper$AccessDoorPageListener, com.huami.wallet.accessdoor.viewmodel.DoorEntranceViewModel$mDoorPageListener$1] */
    public DoorEntranceViewModel(@NotNull AccessDoorDataSource accessDoorDataSource) {
        this.doorDataSource = accessDoorDataSource;
        ?? r3 = new AccessDoorPageHelper.AccessDoorPageListener() { // from class: com.huami.wallet.accessdoor.viewmodel.DoorEntranceViewModel$mDoorPageListener$1
            @Override // com.huami.wallet.accessdoor.helper.AccessDoorPageHelper.AccessDoorPageListener
            public void onEnter() {
            }

            @Override // com.huami.wallet.accessdoor.helper.AccessDoorPageHelper.AccessDoorPageListener
            public void onLeave() {
                this.a.getDoorDataSource().clearData();
                DoorScopeKt.stopDoorScope();
            }
        };
        this.mDoorPageListener = r3;
        AccessDoorPageHelper.getInstance().registerAccessDoorPageListener(r3);
        HMLog.i(h, "门禁的版本号为:2.7.5", new Object[0]);
    }

    public static /* synthetic */ void getCardList$default(DoorEntranceViewModel doorEntranceViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        doorEntranceViewModel.getCardList(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Resource m(DoorEntranceViewModel doorEntranceViewModel, Resource resource) {
        doorEntranceViewModel.getGetCardListLiveData().setValue(resource);
        return resource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Resource n(DoorEntranceViewModel doorEntranceViewModel, Resource resource) {
        List<DoorCardInfo> list;
        if (resource.isSuccessful()) {
            ArrayList arrayList = new ArrayList();
            List list2 = (List) resource.data;
            if (list2 != null) {
                arrayList.addAll(list2);
            }
            if (doorEntranceViewModel.getDoorDataSource().isMiDevice()) {
                Resource<List<DoorCardInfo>> cardListByCplc = doorEntranceViewModel.getDoorDataSource().getCardListByCplc();
                if (cardListByCplc.isSuccessful() && (list = cardListByCplc.data) != null) {
                    for (DoorCardInfo doorCardInfo : list) {
                        if (DoorCardExtensionKt.isMiDoorCard(doorCardInfo)) {
                            arrayList.add(doorCardInfo);
                        }
                    }
                }
            }
            doorEntranceViewModel.getDoorDataSource().updateNfcCardListSync(arrayList);
        }
        return resource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(Resource resource) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(DoorEntranceViewModel doorEntranceViewModel, Throwable th) {
        doorEntranceViewModel.getGetCardListLiveData().setValue(Resource.error("Unknown", th.getMessage(), null));
        HMLog.w(h, th, "DoorEntranceViewModel-模拟门禁卡发生错误-getCardList", new Object[0]);
    }

    public final void bindDeviceDeleteDoorCard() {
        this.doorDataSource.bindDeviceDeleteCard();
    }

    public final void getCardList(boolean isRequestWorker) {
        this.getCardListDisposable = Flowable.fromPublisher(this.doorDataSource.getCardList(isRequestWorker ? 1 : null)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).map(new Function() { // from class: ic1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return DoorEntranceViewModel.m(this.a, (Resource) obj);
            }
        }).observeOn(Schedulers.io()).map(new Function() { // from class: jc1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return DoorEntranceViewModel.n(this.a, (Resource) obj);
            }
        }).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: hc1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DoorEntranceViewModel.o((Resource) obj);
            }
        }, new Consumer() { // from class: gc1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DoorEntranceViewModel.p(this.a, (Throwable) obj);
            }
        });
    }

    @NotNull
    public final AccessDoorDataSource getDoorDataSource() {
        return this.doorDataSource;
    }

    @NotNull
    public final MutableLiveData<Resource<List<DoorCardInfo>>> getGetCardListLiveData() {
        return this.getCardListLiveData;
    }

    @NotNull
    public final LiveData<WorkerInfo> getWorkerInfo() {
        return this.mutableWorkerInfo;
    }

    public final void isDefaultCard(@NotNull String aid) throws Exception {
        publisherToResource("isDefaultCard", this.doorDataSource.isDefaultCard(aid), new a());
    }

    @NotNull
    public final MutableLiveData<Resource<Boolean>> isDefaultCardLiveData() {
        return this.isDefaultCardLiveData;
    }

    public final boolean isWorkCard(@NotNull DoorCardInfo doorCardInfo) {
        Integer bizType = doorCardInfo.getBizType();
        return bizType != null && bizType.intValue() == 1;
    }

    @Override // com.huami.wallet.accessdoor.viewmodel.BaseViewModel, androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        AccessDoorPageHelper.getInstance().unregisterAccessDoorPageListener(this.mDoorPageListener);
        Disposable disposable = this.getCardListDisposable;
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        this.getCardListDisposable.dispose();
        this.getCardListDisposable = null;
    }

    public final void setDefaultCardLiveData(@NotNull MutableLiveData<Resource<Boolean>> mutableLiveData) {
        this.isDefaultCardLiveData = mutableLiveData;
    }

    public final void setDoorDataSource(@NotNull AccessDoorDataSource accessDoorDataSource) {
        this.doorDataSource = accessDoorDataSource;
    }

    public final void setGetCardListLiveData(@NotNull MutableLiveData<Resource<List<DoorCardInfo>>> mutableLiveData) {
        this.getCardListLiveData = mutableLiveData;
    }

    public final void setWorkInfo(@NotNull WorkerInfo workerInfo) {
        this.mutableWorkerInfo.setValue(workerInfo);
    }
}
