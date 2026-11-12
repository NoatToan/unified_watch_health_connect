package com.huami.wallet.accessdoor.api;

import androidx.annotation.VisibleForTesting;
import com.huami.nfc.applet.CardScheduleTime;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.ble.AppletType;
import com.huami.nfc.door.DoorCardInfo;
import com.huami.nfc.door.NfcTag;
import com.huami.nfc.door.entity.CommunityNameEntity;
import com.huami.nfc.door.entity.IdCardEntity;
import com.huami.nfc.door.entity.VerifyEntity;
import com.huami.nfc.web.entity.ProtocolEntity;
import com.huami.wallet.accessdoor.api.cache.DoorWebApiCache;
import com.huami.wallet.accessdoor.api.service.AccessDoorDataSource;
import com.huami.wallet.accessdoor.api.service.AccessDoorDataSource2;
import com.huami.wallet.accessdoor.entity.DoorInfoAndDefaultCard;
import com.huami.wallet.accessdoor.helper.Resource;
import io.reactivex.Flowable;
import java.util.List;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes15.dex */
public class CloudAccessDoorSource implements AccessDoorDataSource {
    private static final String f = "Door-CloudAccessDoorSource";
    private DataSourceConfig a;
    private DoorWebApiCache b;
    private IHuamiPayWrapperApi c;
    private AccessDoorDataSource2 d;
    private LoginListener e;

    public interface LoginListener {
        void login(int i);
    }

    public CloudAccessDoorSource(DataSourceConfig dataSourceConfig) {
        this.a = dataSourceConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource A(Integer num) throws Exception {
        return u().getCardList(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource B(boolean z) throws Exception {
        return u().getCardListAndIsDefaultCard(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource C(String str) throws Exception {
        return u().getDoorImageUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource D(String str) throws Exception {
        return u().getProtocol(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource E(String str, String str2) throws Exception {
        return u().getSupportCommunity(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource F(String str) throws Exception {
        return u().isDefaultCard(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource G(DoorCardInfo doorCardInfo) throws Exception {
        return u().namedOrUpdateCardName(doorCardInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource H() throws Exception {
        return u().query();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource I(AppletType appletType, String str) throws Exception {
        return u().queryCardScheduleTime(appletType, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource J(CardScheduleTime cardScheduleTime) throws Exception {
        return u().setCardScheduleTime(cardScheduleTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource K(String str) throws Exception {
        return u().setDefaultCard(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource L() throws Exception {
        return u().snowQuery();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource M(IdCardEntity idCardEntity) throws Exception {
        return u().snowVerify(idCardEntity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource N() throws Exception {
        return u().startDetection();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource O(NfcTag nfcTag, String str, String str2, int i) throws Exception {
        return u().startSimulation(nfcTag, str, str2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource P(String str, String str2, String str3) throws Exception {
        return u().verify(str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource w(Long l) throws Exception {
        return u().agreeProtocol(l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource x(String str) throws Exception {
        return u().deleteAccessDoorCard(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource y(CardScheduleTime cardScheduleTime) throws Exception {
        return u().deleteCardScheduleTime(cardScheduleTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource z(String str) throws Exception {
        return u().getCardInfo(str);
    }

    @VisibleForTesting
    public void Q(DoorWebApiCache doorWebApiCache) {
        this.b = doorWebApiCache;
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource
    public Publisher<Resource<String>> agreeProtocol(final Long l) {
        return Flowable.fromCallable(new Callable() { // from class: pp0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.w(l);
            }
        }).compose(new c(this.a.getOnAccessDoorHttpErrorSupplier()));
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource
    public void bindDeviceDeleteCard() {
        u().bindDeviceDeleteCard();
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource
    public void clearData() {
        DoorWebApiCache doorWebApiCache = this.b;
        if (doorWebApiCache != null) {
            doorWebApiCache.clear();
        }
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource
    public void closeWatchNfcTagReader() {
        u().closeWatchNfcTagReader();
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource
    @NotNull
    public Publisher<Resource<Boolean>> deleteAccessDoorCard(final String str) {
        return Flowable.fromCallable(new Callable() { // from class: sp0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.x(str);
            }
        }).compose(new c(this.a.getOnAccessDoorHttpErrorSupplier()));
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource
    @NotNull
    public Publisher<Resource<Boolean>> deleteCardScheduleTime(@NotNull final CardScheduleTime cardScheduleTime) {
        return Flowable.fromCallable(new Callable() { // from class: bq0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.y(cardScheduleTime);
            }
        }).compose(new c(this.a.getOnAccessDoorHttpErrorSupplier()));
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource
    @NotNull
    public Publisher<Resource<DoorCardInfo>> getCardInfo(final String str) {
        return Flowable.fromCallable(new Callable() { // from class: qp0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.z(str);
            }
        }).compose(new c(this.a.getOnAccessDoorHttpErrorSupplier()));
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource
    @NotNull
    public Publisher<Resource<List<DoorCardInfo>>> getCardList(@Nullable final Integer num) {
        return Flowable.fromCallable(new Callable() { // from class: hq0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.A(num);
            }
        }).compose(new c(this.a.getOnAccessDoorHttpErrorSupplier()));
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource
    @NotNull
    public Publisher<Resource<List<DoorInfoAndDefaultCard>>> getCardListAndIsDefaultCard(final boolean z) {
        return Flowable.fromCallable(new Callable() { // from class: yp0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.B(z);
            }
        }).compose(new c(this.a.getOnAccessDoorHttpErrorSupplier()));
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource
    @NotNull
    public Resource<List<DoorCardInfo>> getCardListByCplc() {
        return u().getCardListByCplc();
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource
    @NotNull
    public String getDeviceModel() {
        return v().getNfcDevice().getDeviceModel().getModel();
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource
    @NotNull
    public Publisher<Resource<String>> getDoorImageUrl(@NotNull final String str) {
        return Flowable.fromCallable(new Callable() { // from class: up0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.C(str);
            }
        }).compose(new c(this.a.getOnAccessDoorHttpErrorSupplier()));
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource
    @NotNull
    public Resource<Boolean> getNamedOrUpdateCardNameResource(@NotNull DoorCardInfo doorCardInfo) {
        return u().namedOrUpdateCardName(doorCardInfo);
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource
    @NotNull
    public Publisher<Resource<ProtocolEntity>> getProtocol(final String str) {
        return Flowable.fromCallable(new Callable() { // from class: tp0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.D(str);
            }
        }).compose(new c(this.a.getOnAccessDoorHttpErrorSupplier()));
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource
    @NotNull
    public Publisher<Resource<List<CommunityNameEntity>>> getSupportCommunity(@NotNull final String str, @NotNull final String str2) {
        return Flowable.fromCallable(new Callable() { // from class: wp0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.E(str, str2);
            }
        }).compose(new c(this.a.getOnAccessDoorHttpErrorSupplier()));
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource
    public void getToLogin(String str, String str2) {
        this.a.getOnAccessDoorHttpErrorSupplier().onHttpError(str, str2);
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource
    @NotNull
    public Publisher<Resource<Boolean>> isDefaultCard(final String str) {
        return Flowable.fromCallable(new Callable() { // from class: vp0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.F(str);
            }
        }).compose(new c(this.a.getOnAccessDoorHttpErrorSupplier()));
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource
    public boolean isMiDevice() {
        return v().isMiDevice();
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource
    public boolean isSupportTimeSwitchCard() {
        return u().isSupportCardScheduleTime();
    }

    public void login(int i) {
        LoginListener loginListener = this.e;
        if (loginListener != null) {
            loginListener.login(i);
        }
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource
    @NotNull
    public Publisher<Resource<Boolean>> namedOrUpdateCardName(final DoorCardInfo doorCardInfo) {
        return Flowable.fromCallable(new Callable() { // from class: eq0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.G(doorCardInfo);
            }
        }).compose(new c(this.a.getOnAccessDoorHttpErrorSupplier()));
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource
    @NotNull
    public Publisher<Resource<Integer>> query() {
        return Flowable.fromCallable(new Callable() { // from class: zp0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.H();
            }
        }).compose(new c(this.a.getOnAccessDoorHttpErrorSupplier()));
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource
    @NotNull
    public Publisher<Resource<List<CardScheduleTime>>> queryCardScheduleTime(@NotNull final AppletType appletType, @NotNull final String str) {
        return Flowable.fromCallable(new Callable() { // from class: dq0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.I(appletType, str);
            }
        }).compose(new c(this.a.getOnAccessDoorHttpErrorSupplier()));
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource
    @NotNull
    public Publisher<Resource<Boolean>> setCardScheduleTime(@NotNull final CardScheduleTime cardScheduleTime) {
        return Flowable.fromCallable(new Callable() { // from class: cq0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.J(cardScheduleTime);
            }
        }).compose(new c(this.a.getOnAccessDoorHttpErrorSupplier()));
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource
    @NotNull
    public Publisher<Resource<Boolean>> setDefaultCard(final String str) {
        return Flowable.fromCallable(new Callable() { // from class: rp0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.K(str);
            }
        }).compose(new c(this.a.getOnAccessDoorHttpErrorSupplier()));
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource
    @NotNull
    public Resource<Boolean> setDefaultCardByResource(@NotNull String str) {
        return u().setDefaultCard(str);
    }

    public void setLoginListener(LoginListener loginListener) {
        this.e = loginListener;
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource
    @NotNull
    public Publisher<Resource<List<VerifyEntity>>> snowQuery() {
        return Flowable.fromCallable(new Callable() { // from class: aq0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.L();
            }
        }).compose(new c(this.a.getOnAccessDoorHttpErrorSupplier()));
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource
    @NotNull
    public Publisher<Resource<VerifyEntity>> snowVerify(final IdCardEntity idCardEntity) {
        return Flowable.fromCallable(new Callable() { // from class: gq0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.M(idCardEntity);
            }
        }).compose(new c(this.a.getOnAccessDoorHttpErrorSupplier()));
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource
    @NotNull
    public Publisher<Resource<PayResponse<NfcTag>>> startDetection() {
        return Flowable.fromCallable(new Callable() { // from class: op0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.N();
            }
        }).compose(new c(this.a.getOnAccessDoorHttpErrorSupplier()));
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource
    @NotNull
    public Publisher<Resource<String>> startSimulation(@Nullable final NfcTag nfcTag, @Nullable final String str, @Nullable final String str2, final int i) {
        return Flowable.fromCallable(new Callable() { // from class: fq0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.O(nfcTag, str, str2, i);
            }
        }).compose(new c(this.a.getOnAccessDoorHttpErrorSupplier()));
    }

    @VisibleForTesting
    public AccessDoorDataSource2 u() {
        if (this.d == null) {
            this.d = new CloudAccessDoorSource2(v(), this.b);
        }
        return this.d;
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource
    public void updateNfcCardListSync(@NotNull List<DoorCardInfo> list) {
        v().syncAppletList(list);
    }

    @VisibleForTesting
    public IHuamiPayWrapperApi v() {
        if (this.c == null) {
            this.c = new HuamiPayApiRepo(this.a);
        }
        if (this.b == null) {
            this.b = new DoorWebApiCache();
        }
        return this.c;
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource
    @NotNull
    public Publisher<Resource<Boolean>> verify(final String str, final String str2, final String str3) {
        return Flowable.fromCallable(new Callable() { // from class: xp0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.P(str, str2, str3);
            }
        }).compose(new c(this.a.getOnAccessDoorHttpErrorSupplier()));
    }

    @Override // com.huami.wallet.accessdoor.api.service.AccessDoorDataSource
    public boolean withBleApi() {
        return this.a.getWithBleApi().getA().booleanValue();
    }
}
