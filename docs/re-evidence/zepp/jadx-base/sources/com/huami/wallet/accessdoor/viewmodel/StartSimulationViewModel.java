package com.huami.wallet.accessdoor.viewmodel;

import android.annotation.SuppressLint;
import androidx.p008lifecycle.MutableLiveData;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.nfc.door.NfcTag;
import com.huami.nfc.door.WorkerInfo;
import com.huami.tools.log.HMLog;
import com.huami.wallet.accessdoor.api.CloudAccessDoorSource;
import com.huami.wallet.accessdoor.api.service.AccessDoorDataSource;
import com.huami.wallet.accessdoor.entity.DoorOpenCardData;
import com.huami.wallet.accessdoor.helper.Resource;
import com.huami.wallet.accessdoor.koinmodule.DoorScopeKt;
import com.huami.wallet.accessdoor.utils.EventId;
import com.huami.wallet.accessdoor.utils.ParamKey;
import com.huami.wallet.accessdoor.viewmodel.StartSimulationViewModel;
import com.loc.z;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b:\u0010;J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\u0006\u0010\b\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\u0006J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0007R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R.\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b\u001f\u0010\u001aR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R%\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040%0\u00148\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010\u0016\u001a\u0004\b'\u0010\u0018R\u001b\u0010.\u001a\u0004\u0018\u00010)8\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001b\u00103\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001b\u00106\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b5\u00102R\u0016\u00109\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006<"}, d2 = {"Lcom/huami/wallet/accessdoor/viewmodel/StartSimulationViewModel;", "Lcom/huami/wallet/accessdoor/viewmodel/BaseViewModel;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/wallet/accessdoor/helper/Resource;", "", "booleanResource", "", SOAP.XMLNS, "startSimulation", "Lcom/huami/nfc/door/WorkerInfo;", "workerInfo", "startWorkCardSimulation", "getLoginStatus", "key1", "key2", "getDoorResUrl", "Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;", "b", "Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;", "doorDataSource", "Landroidx/lifecycle/MutableLiveData;", "c", "Landroidx/lifecycle/MutableLiveData;", "getSimulationStatusLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setSimulationStatusLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "simulationStatusLiveData", "", GoogleApiAvailabilityLight.a, "getLoginStatusLiveData", "setLoginStatusLiveData", "loginStatusLiveData", "Lcom/huami/wallet/accessdoor/entity/DoorOpenCardData;", "e", "Lcom/huami/wallet/accessdoor/entity/DoorOpenCardData;", "doorOpenCardData", "", "f", "getImageUrlList", "imageUrlList", "Lcom/huami/nfc/door/NfcTag;", "g", "Lcom/huami/nfc/door/NfcTag;", "getNfcTag", "()Lcom/huami/nfc/door/NfcTag;", "nfcTag", "h", "Ljava/lang/String;", "getPhoneNum", "()Ljava/lang/String;", "phoneNum", "i", "getDistrictName", "districtName", z.j, LogUtil.I, "nfcTagType", "<init>", "(Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;)V", "access-door_release"}, k = 1, mv = {1, 5, 1})
public final class StartSimulationViewModel extends BaseViewModel implements KoinComponent {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final AccessDoorDataSource doorDataSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Resource<String>> simulationStatusLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Integer> loginStatusLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final DoorOpenCardData doorOpenCardData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<String>> imageUrlList;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private final NfcTag nfcTag;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private final String phoneNum;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private final String districtName;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int nfcTagType;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Resource<String>, Unit> {
        public a() {
            super(1);
        }

        public final void a(@NotNull Resource<String> resource) {
            StartSimulationViewModel.this.getSimulationStatusLiveData().setValue(resource);
            if (resource.isSuccessful()) {
                DoorScopeKt.stopDoorScope();
            }
            if (resource.isCompleted()) {
                StartSimulationViewModel.this.s(resource);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<String> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Resource<String>, Unit> {
        public b() {
            super(1);
        }

        public final void a(@NotNull Resource<String> resource) {
            StartSimulationViewModel.this.getSimulationStatusLiveData().setValue(resource);
            if (resource.isSuccessful()) {
                DoorScopeKt.stopDoorScope();
            }
            if (resource.isCompleted()) {
                StartSimulationViewModel.this.s(resource);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<String> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    public StartSimulationViewModel(@NotNull AccessDoorDataSource accessDoorDataSource) {
        this.doorDataSource = accessDoorDataSource;
        DoorOpenCardData doorOpenCardData = (DoorOpenCardData) DoorScopeKt.doorScope(getKoin()).get(Reflection.getOrCreateKotlinClass(DoorOpenCardData.class), null, null);
        this.doorOpenCardData = doorOpenCardData;
        this.imageUrlList = new MutableLiveData<>();
        this.nfcTag = doorOpenCardData.getNfcTag();
        this.phoneNum = doorOpenCardData.getPhoneNum();
        this.districtName = doorOpenCardData.getDistrictName();
        this.nfcTagType = doorOpenCardData.getNfcTagType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Publisher n(StartSimulationViewModel startSimulationViewModel, String str) {
        return startSimulationViewModel.doorDataSource.getDoorImageUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void o(ArrayList arrayList, Resource resource) {
        String str;
        if (!resource.isSuccessful() || (str = (String) resource.data) == null) {
            return;
        }
        arrayList.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(Throwable th) {
        HMLog.w("StartSimulationViewModel", th, "获取门禁开卡轮播图时发生了意外的错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(StartSimulationViewModel startSimulationViewModel, ArrayList arrayList) {
        startSimulationViewModel.getImageUrlList().setValue(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(StartSimulationViewModel startSimulationViewModel, int i) {
        startSimulationViewModel.getLoginStatusLiveData().postValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(Resource<String> booleanResource) {
        HashMap map = new HashMap(2);
        map.put("DeviceSource", this.doorDataSource.getDeviceModel());
        if (booleanResource.isSuccessful()) {
            Analytics.recordEvent(new CountEventBuilder(EventId.NFC_ACCESS_OPEN_SUCCESS).putExtras(map));
            return;
        }
        map.put(ParamKey.ERROR_CODE, booleanResource.code);
        map.put("ErrorMsg", "code:" + booleanResource.code + "msg:" + booleanResource.message);
        Analytics.recordEvent(new CountEventBuilder(EventId.NFC_ACCESS_OPEN_FAIL).putExtras(map));
    }

    @Nullable
    public final String getDistrictName() {
        return this.districtName;
    }

    @SuppressLint({"CheckResult"})
    public final void getDoorResUrl(@NotNull String key1, @NotNull String key2) {
        final ArrayList arrayList = new ArrayList();
        Flowable.just(key1, key2).concatMap(new Function() { // from class: ff7
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return StartSimulationViewModel.n(this.a, (String) obj);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: df7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                StartSimulationViewModel.o(arrayList, (Resource) obj);
            }
        }, new Consumer() { // from class: ef7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                StartSimulationViewModel.p((Throwable) obj);
            }
        }, new Action() { // from class: cf7
            @Override // io.reactivex.functions.Action
            public final void run() {
                StartSimulationViewModel.q(this.a, arrayList);
            }
        });
    }

    @NotNull
    public final MutableLiveData<List<String>> getImageUrlList() {
        return this.imageUrlList;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final void getLoginStatus() {
        ((CloudAccessDoorSource) this.doorDataSource).setLoginListener(new CloudAccessDoorSource.LoginListener() { // from class: bf7
            @Override // com.huami.wallet.accessdoor.api.CloudAccessDoorSource.LoginListener
            public final void login(int i) {
                StartSimulationViewModel.r(this.a, i);
            }
        });
    }

    @NotNull
    public final MutableLiveData<Integer> getLoginStatusLiveData() {
        return this.loginStatusLiveData;
    }

    @Nullable
    public final NfcTag getNfcTag() {
        return this.nfcTag;
    }

    @Nullable
    public final String getPhoneNum() {
        return this.phoneNum;
    }

    @NotNull
    public final MutableLiveData<Resource<String>> getSimulationStatusLiveData() {
        return this.simulationStatusLiveData;
    }

    public final void setLoginStatusLiveData(@NotNull MutableLiveData<Integer> mutableLiveData) {
        this.loginStatusLiveData = mutableLiveData;
    }

    public final void setSimulationStatusLiveData(@NotNull MutableLiveData<Resource<String>> mutableLiveData) {
        this.simulationStatusLiveData = mutableLiveData;
    }

    public final void startSimulation() throws Exception {
        publisherToResource("startSimulation", this.doorDataSource.startSimulation(this.nfcTag, this.phoneNum, this.districtName, this.nfcTagType), new a());
    }

    public final void startWorkCardSimulation(@NotNull WorkerInfo workerInfo) throws Exception {
        NfcTag nfcTag = new NfcTag(0, 0, "", 0, "08", "0400", new ArrayList(), "", workerInfo);
        this.doorOpenCardData.setNfcTag(nfcTag);
        publisherToResource("startSimulation", this.doorDataSource.startSimulation(nfcTag, "", "", 0), new b());
    }
}
