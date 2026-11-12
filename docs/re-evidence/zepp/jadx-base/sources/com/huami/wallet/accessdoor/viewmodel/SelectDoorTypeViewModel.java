package com.huami.wallet.accessdoor.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.nfc.web.entity.ProtocolEntity;
import com.huami.wallet.accessdoor.api.FunctionsConfig;
import com.huami.wallet.accessdoor.api.service.AccessDoorDataSource;
import com.huami.wallet.accessdoor.entity.DoorOpenCardData;
import com.huami.wallet.accessdoor.helper.Resource;
import com.huami.wallet.accessdoor.koinmodule.DoorScopeKt;
import io.reactivex.disposables.Disposable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0001/B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b-\u0010.J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0017\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0003J\b\u0010\u0010\u001a\u00020\u0005H\u0014R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R%\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR%\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00160\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0019\u0010)\u001a\u00020$8\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R%\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00160\u00158\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010\u0019\u001a\u0004\b+\u0010\u001b¨\u00060"}, d2 = {"Lcom/huami/wallet/accessdoor/viewmodel/SelectDoorTypeViewModel;", "Lcom/huami/wallet/accessdoor/viewmodel/BaseViewModel;", "Lorg/koin/core/component/KoinComponent;", "", "actionType", "", "getUserProtocol", "", "id", "userAgreementProtocol", "(Ljava/lang/Long;)V", "", "isMiDevice", "isSupportNfcTag", "key", "getDoorImageUrl", "onCleared", "Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;", "b", "Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;", "doorDataSource", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/wallet/accessdoor/helper/Resource;", "Lcom/huami/nfc/web/entity/ProtocolEntity;", "c", "Landroidx/lifecycle/MutableLiveData;", "getGetProtocolEntityLiveData", "()Landroidx/lifecycle/MutableLiveData;", "getProtocolEntityLiveData", GoogleApiAvailabilityLight.a, "getUserAgreementProtocolLiveData", "userAgreementProtocolLiveData", "Lio/reactivex/disposables/Disposable;", "e", "Lio/reactivex/disposables/Disposable;", "subscribe", "Lcom/huami/wallet/accessdoor/entity/DoorOpenCardData;", "f", "Lcom/huami/wallet/accessdoor/entity/DoorOpenCardData;", "getDoorOpenCardData", "()Lcom/huami/wallet/accessdoor/entity/DoorOpenCardData;", "doorOpenCardData", "g", "getDoorResUrlLiveData", "doorResUrlLiveData", "<init>", "(Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;)V", "Companion", "access-door_release"}, k = 1, mv = {1, 5, 1})
public final class SelectDoorTypeViewModel extends BaseViewModel implements KoinComponent {

    @NotNull
    private static final String h = "Wallet-StartAccessViewModel";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final AccessDoorDataSource doorDataSource;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Disposable subscribe;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<ProtocolEntity>> getProtocolEntityLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<String>> userAgreementProtocolLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final DoorOpenCardData doorOpenCardData = (DoorOpenCardData) DoorScopeKt.doorScope(getKoin()).get(Reflection.getOrCreateKotlinClass(DoorOpenCardData.class), null, null);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<String>> doorResUrlLiveData = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Resource<String>, Unit> {
        public a() {
            super(1);
        }

        public final void a(@NotNull Resource<String> resource) {
            SelectDoorTypeViewModel.this.getDoorResUrlLiveData().setValue(resource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<String> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "Lcom/huami/nfc/web/entity/ProtocolEntity;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Resource<ProtocolEntity>, Unit> {
        public b() {
            super(1);
        }

        public final void a(@NotNull Resource<ProtocolEntity> resource) {
            SelectDoorTypeViewModel.this.getGetProtocolEntityLiveData().setValue(resource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<ProtocolEntity> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Resource<String>, Unit> {
        public c() {
            super(1);
        }

        public final void a(@NotNull Resource<String> resource) {
            if (resource.isSuccessful()) {
                SelectDoorTypeViewModel.this.getDoorOpenCardData().clear();
            }
            SelectDoorTypeViewModel.this.getUserAgreementProtocolLiveData().setValue(resource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<String> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    public SelectDoorTypeViewModel(@NotNull AccessDoorDataSource accessDoorDataSource) {
        this.doorDataSource = accessDoorDataSource;
    }

    public final void getDoorImageUrl(@NotNull String key) throws Exception {
        publisherToResource("getSelectDoorImageUrl", this.doorDataSource.getDoorImageUrl(key), new a());
    }

    @NotNull
    public final DoorOpenCardData getDoorOpenCardData() {
        return this.doorOpenCardData;
    }

    @NotNull
    public final MutableLiveData<Resource<String>> getDoorResUrlLiveData() {
        return this.doorResUrlLiveData;
    }

    @NotNull
    public final MutableLiveData<Resource<ProtocolEntity>> getGetProtocolEntityLiveData() {
        return this.getProtocolEntityLiveData;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final MutableLiveData<Resource<String>> getUserAgreementProtocolLiveData() {
        return this.userAgreementProtocolLiveData;
    }

    public final void getUserProtocol(@NotNull String actionType) throws Exception {
        publisherToResource("getUserProtocol", this.doorDataSource.getProtocol(actionType), new b());
    }

    public final boolean isMiDevice() {
        return this.doorDataSource.isMiDevice();
    }

    public final boolean isSupportNfcTag() {
        return FunctionsConfig.getSupportNfcTag().invoke().booleanValue();
    }

    @Override // com.huami.wallet.accessdoor.viewmodel.BaseViewModel, androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        Disposable disposable = this.subscribe;
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        this.subscribe.dispose();
        this.subscribe = null;
    }

    public final void userAgreementProtocol(@Nullable Long id) throws Exception {
        publisherToResource("userAgreementProtocol", this.doorDataSource.agreeProtocol(id), new c());
    }
}
