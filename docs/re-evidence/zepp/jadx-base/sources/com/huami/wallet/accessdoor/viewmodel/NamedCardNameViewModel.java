package com.huami.wallet.accessdoor.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.nfc.door.DoorCardInfo;
import com.huami.nfc.door.entity.DoorCardExtraEntity;
import com.huami.tools.log.HMLog;
import com.huami.wallet.accessdoor.api.service.AccessDoorDataSource;
import com.huami.wallet.accessdoor.entity.DoorInfoAndDefaultCard;
import com.huami.wallet.accessdoor.helper.Resource;
import com.huami.wallet.accessdoor.viewmodel.NamedCardNameViewModel;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 32\u00020\u0001:\u00013B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b1\u00102J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006J\b\u0010\u000f\u001a\u00020\u0004H\u0014R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R.\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00150\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR.\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00150\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR4\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0\u00150\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0017\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001bR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00064"}, d2 = {"Lcom/huami/wallet/accessdoor/viewmodel/NamedCardNameViewModel;", "Lcom/huami/wallet/accessdoor/viewmodel/BaseViewModel;", "Lcom/huami/nfc/door/DoorCardInfo;", "doorCardInfo", "", "namedCardName", "", "isEncryptionCard", "", "sessionId", "getCardInfo", "cardName", "getCardInfoByNoNetWorkFirst", "isNeedRequest", "getCardList", "onCleared", "Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;", "b", "Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;", "doorDataSource", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/wallet/accessdoor/helper/Resource;", "c", "Landroidx/lifecycle/MutableLiveData;", "getNamedCardNameLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setNamedCardNameLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "namedCardNameLiveData", GoogleApiAvailabilityLight.a, "getCardInfoLiveData", "setCardInfoLiveData", "cardInfoLiveData", "", "Lcom/huami/wallet/accessdoor/entity/DoorInfoAndDefaultCard;", "e", "getCardListLiveData", "setCardListLiveData", "cardListLiveData", "f", "Lcom/huami/nfc/door/DoorCardInfo;", "getDoorCardInfo", "()Lcom/huami/nfc/door/DoorCardInfo;", "setDoorCardInfo", "(Lcom/huami/nfc/door/DoorCardInfo;)V", "Lio/reactivex/disposables/Disposable;", "g", "Lio/reactivex/disposables/Disposable;", "cardInfoDisposable", "<init>", "(Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;)V", "Companion", "access-door_release"}, k = 1, mv = {1, 5, 1})
public final class NamedCardNameViewModel extends BaseViewModel {

    @NotNull
    private static final String h = "Wallet-NamedCardNameViewModel";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final AccessDoorDataSource doorDataSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Resource<Boolean>> namedCardNameLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Resource<DoorCardInfo>> cardInfoLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Resource<List<DoorInfoAndDefaultCard>>> cardListLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private DoorCardInfo doorCardInfo;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private Disposable cardInfoDisposable;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "", "Lcom/huami/wallet/accessdoor/entity/DoorInfoAndDefaultCard;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Resource<List<? extends DoorInfoAndDefaultCard>>, Unit> {
        public a() {
            super(1);
        }

        public final void a(@NotNull Resource<List<DoorInfoAndDefaultCard>> resource) {
            NamedCardNameViewModel.this.getCardListLiveData().setValue(resource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<List<? extends DoorInfoAndDefaultCard>> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Resource<Boolean>, Unit> {
        public b() {
            super(1);
        }

        public final void a(@NotNull Resource<Boolean> resource) {
            NamedCardNameViewModel.this.getNamedCardNameLiveData().setValue(resource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<Boolean> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    public NamedCardNameViewModel(@NotNull AccessDoorDataSource accessDoorDataSource) {
        this.doorDataSource = accessDoorDataSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Resource p(NamedCardNameViewModel namedCardNameViewModel, Resource resource) {
        namedCardNameViewModel.getCardInfoLiveData().setValue(resource);
        return resource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Resource q(NamedCardNameViewModel namedCardNameViewModel, Resource resource) {
        if (resource.isSuccessful()) {
            DoorCardInfo doorCardInfo = (DoorCardInfo) resource.data;
            if (doorCardInfo != null) {
                namedCardNameViewModel.doorDataSource.setDefaultCardByResource(doorCardInfo.getAid());
                namedCardNameViewModel.doorDataSource.closeWatchNfcTagReader();
            }
            return resource;
        }
        return Resource.error(resource.code, "获取卡信息失败，失败原因：" + resource.message, Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(Resource resource) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(NamedCardNameViewModel namedCardNameViewModel, Throwable th) {
        namedCardNameViewModel.getCardInfoLiveData().setValue(Resource.error("Unknown", th.getMessage(), null));
        HMLog.w(h, th, "NamedCardNameViewModel-获取CardInfo发生错误-getCardList", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Resource t(NamedCardNameViewModel namedCardNameViewModel, String str, Resource resource) {
        T t;
        if (resource.isSuccessful() && (t = resource.data) != 0) {
            namedCardNameViewModel.doorDataSource.setDefaultCardByResource(((DoorCardInfo) t).getAid());
            namedCardNameViewModel.doorDataSource.closeWatchNfcTagReader();
            DoorCardInfo doorCardInfo = (DoorCardInfo) resource.data;
            doorCardInfo.setName(str);
            return namedCardNameViewModel.doorDataSource.getNamedOrUpdateCardNameResource(doorCardInfo);
        }
        return Resource.error(resource.code, "获取卡信息失败，失败原因：" + resource.message, Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(NamedCardNameViewModel namedCardNameViewModel, Resource resource) {
        namedCardNameViewModel.getNamedCardNameLiveData().setValue(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(NamedCardNameViewModel namedCardNameViewModel, Throwable th) {
        namedCardNameViewModel.getNamedCardNameLiveData().setValue(Resource.error("Unknown", th.getMessage(), null));
        HMLog.w(h, th, "NamedCardNameViewModel-获取CardInfo发生错误-getCardList", new Object[0]);
    }

    public final void getCardInfo(@NotNull String sessionId) {
        this.cardInfoDisposable = Flowable.fromPublisher(this.doorDataSource.getCardInfo(sessionId)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).map(new Function() { // from class: wb5
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return NamedCardNameViewModel.p(this.a, (Resource) obj);
            }
        }).observeOn(Schedulers.io()).map(new Function() { // from class: vb5
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return NamedCardNameViewModel.q(this.a, (Resource) obj);
            }
        }).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: ub5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NamedCardNameViewModel.r((Resource) obj);
            }
        }, new Consumer() { // from class: tb5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NamedCardNameViewModel.s(this.a, (Throwable) obj);
            }
        });
    }

    public final void getCardInfoByNoNetWorkFirst(@NotNull String sessionId, @NotNull final String cardName) {
        this.cardInfoDisposable = Flowable.fromPublisher(this.doorDataSource.getCardInfo(sessionId)).observeOn(Schedulers.io()).map(new Function() { // from class: xb5
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return NamedCardNameViewModel.t(this.a, cardName, (Resource) obj);
            }
        }).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: rb5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NamedCardNameViewModel.u(this.a, (Resource) obj);
            }
        }, new Consumer() { // from class: sb5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NamedCardNameViewModel.v(this.a, (Throwable) obj);
            }
        });
    }

    @NotNull
    public final MutableLiveData<Resource<DoorCardInfo>> getCardInfoLiveData() {
        return this.cardInfoLiveData;
    }

    public final void getCardList(boolean isNeedRequest) throws Exception {
        publisherToResource("getCardList", this.doorDataSource.getCardListAndIsDefaultCard(isNeedRequest), new a());
    }

    @NotNull
    public final MutableLiveData<Resource<List<DoorInfoAndDefaultCard>>> getCardListLiveData() {
        return this.cardListLiveData;
    }

    @Nullable
    public final DoorCardInfo getDoorCardInfo() {
        return this.doorCardInfo;
    }

    @NotNull
    public final MutableLiveData<Resource<Boolean>> getNamedCardNameLiveData() {
        return this.namedCardNameLiveData;
    }

    public final boolean isEncryptionCard() {
        DoorCardExtraEntity extra;
        DoorCardInfo doorCardInfo = this.doorCardInfo;
        if (doorCardInfo == null || (extra = doorCardInfo.getExtra()) == null) {
            return false;
        }
        return Intrinsics.areEqual((Object) extra.getDataType(), (Object) 1);
    }

    public final void namedCardName(@NotNull DoorCardInfo doorCardInfo) throws Exception {
        publisherToResource("namedCardName", this.doorDataSource.namedOrUpdateCardName(doorCardInfo), new b());
    }

    @Override // com.huami.wallet.accessdoor.viewmodel.BaseViewModel, androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        Disposable disposable = this.cardInfoDisposable;
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        this.cardInfoDisposable.dispose();
        this.cardInfoDisposable = null;
    }

    public final void setCardInfoLiveData(@NotNull MutableLiveData<Resource<DoorCardInfo>> mutableLiveData) {
        this.cardInfoLiveData = mutableLiveData;
    }

    public final void setCardListLiveData(@NotNull MutableLiveData<Resource<List<DoorInfoAndDefaultCard>>> mutableLiveData) {
        this.cardListLiveData = mutableLiveData;
    }

    public final void setDoorCardInfo(@Nullable DoorCardInfo doorCardInfo) {
        this.doorCardInfo = doorCardInfo;
    }

    public final void setNamedCardNameLiveData(@NotNull MutableLiveData<Resource<Boolean>> mutableLiveData) {
        this.namedCardNameLiveData = mutableLiveData;
    }
}
