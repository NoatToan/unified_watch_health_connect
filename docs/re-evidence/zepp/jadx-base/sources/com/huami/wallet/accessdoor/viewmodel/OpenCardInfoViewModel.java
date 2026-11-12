package com.huami.wallet.accessdoor.viewmodel;

import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.nfc.web.entity.ProtocolEntity;
import com.huami.wallet.accessdoor.api.service.AccessDoorDataSource;
import com.huami.wallet.accessdoor.entity.DoorOpenCardData;
import com.huami.wallet.accessdoor.helper.Resource;
import com.huami.wallet.accessdoor.helper.Status;
import com.huami.wallet.accessdoor.koinmodule.DoorScopeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b*\u0010+J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0017\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR.\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R.\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00100\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\u001f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010)\u001a\u00020$8\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/huami/wallet/accessdoor/viewmodel/OpenCardInfoViewModel;", "Lcom/huami/wallet/accessdoor/viewmodel/BaseViewModel;", "Lorg/koin/core/component/KoinComponent;", "", "actionType", "", "getUserProtocol", "", "id", "userAgreementProtocol", "(Ljava/lang/Long;)V", "Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;", "b", "Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;", "doorDataSource", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/wallet/accessdoor/helper/Resource;", "Lcom/huami/nfc/web/entity/ProtocolEntity;", "c", "Landroidx/lifecycle/MutableLiveData;", "getGetProtocolEntityLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setGetProtocolEntityLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "getProtocolEntityLiveData", GoogleApiAvailabilityLight.a, "getUserAgreementProtocolLiveData", "setUserAgreementProtocolLiveData", "userAgreementProtocolLiveData", "Landroidx/lifecycle/MediatorLiveData;", "", "e", "Landroidx/lifecycle/MediatorLiveData;", "getLoadingDialogStatusLiveData", "()Landroidx/lifecycle/MediatorLiveData;", "loadingDialogStatusLiveData", "Lcom/huami/wallet/accessdoor/entity/DoorOpenCardData;", "f", "Lcom/huami/wallet/accessdoor/entity/DoorOpenCardData;", "getDoorOpenCardData", "()Lcom/huami/wallet/accessdoor/entity/DoorOpenCardData;", "doorOpenCardData", "<init>", "(Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;)V", "access-door_release"}, k = 1, mv = {1, 5, 1})
public final class OpenCardInfoViewModel extends BaseViewModel implements KoinComponent {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final AccessDoorDataSource doorDataSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Resource<ProtocolEntity>> getProtocolEntityLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Resource<String>> userAgreementProtocolLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<Boolean> loadingDialogStatusLiveData = new MediatorLiveData<>();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final DoorOpenCardData doorOpenCardData = (DoorOpenCardData) DoorScopeKt.doorScope(getKoin()).get(Reflection.getOrCreateKotlinClass(DoorOpenCardData.class), null, null);

    public OpenCardInfoViewModel(@NotNull AccessDoorDataSource accessDoorDataSource) {
        this.doorDataSource = accessDoorDataSource;
    }

    @NotNull
    public final DoorOpenCardData getDoorOpenCardData() {
        return this.doorOpenCardData;
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
    public final MediatorLiveData<Boolean> getLoadingDialogStatusLiveData() {
        return this.loadingDialogStatusLiveData;
    }

    @NotNull
    public final MutableLiveData<Resource<String>> getUserAgreementProtocolLiveData() {
        return this.userAgreementProtocolLiveData;
    }

    public final void getUserProtocol(@NotNull String actionType) throws Exception {
        publisherToResource("getUserProtocol", this.doorDataSource.getProtocol(actionType), new Function1<Resource<ProtocolEntity>, Unit>() { // from class: com.huami.wallet.accessdoor.viewmodel.OpenCardInfoViewModel.getUserProtocol.1

            /* JADX INFO: renamed from: com.huami.wallet.accessdoor.viewmodel.OpenCardInfoViewModel$getUserProtocol$1$WhenMappings */
            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Status.values().length];
                    iArr[Status.LOADING.ordinal()] = 1;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            {
                super(1);
            }

            public final void a(@NotNull Resource<ProtocolEntity> resource) {
                OpenCardInfoViewModel.this.getLoadingDialogStatusLiveData().setValue(Boolean.valueOf(WhenMappings.$EnumSwitchMapping$0[resource.status.ordinal()] == 1));
                if (resource.isCompleted()) {
                    OpenCardInfoViewModel.this.getGetProtocolEntityLiveData().setValue(resource);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Resource<ProtocolEntity> resource) {
                a(resource);
                return Unit.INSTANCE;
            }
        });
    }

    public final void setGetProtocolEntityLiveData(@NotNull MutableLiveData<Resource<ProtocolEntity>> mutableLiveData) {
        this.getProtocolEntityLiveData = mutableLiveData;
    }

    public final void setUserAgreementProtocolLiveData(@NotNull MutableLiveData<Resource<String>> mutableLiveData) {
        this.userAgreementProtocolLiveData = mutableLiveData;
    }

    public final void userAgreementProtocol(@Nullable Long id) throws Exception {
        publisherToResource("userAgreementProtocol", this.doorDataSource.agreeProtocol(id), new Function1<Resource<String>, Unit>() { // from class: com.huami.wallet.accessdoor.viewmodel.OpenCardInfoViewModel.userAgreementProtocol.1

            /* JADX INFO: renamed from: com.huami.wallet.accessdoor.viewmodel.OpenCardInfoViewModel$userAgreementProtocol$1$WhenMappings */
            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Status.values().length];
                    iArr[Status.LOADING.ordinal()] = 1;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            {
                super(1);
            }

            public final void a(@NotNull Resource<String> resource) {
                OpenCardInfoViewModel.this.getLoadingDialogStatusLiveData().setValue(Boolean.valueOf(WhenMappings.$EnumSwitchMapping$0[resource.status.ordinal()] == 1));
                if (resource.isCompleted()) {
                    OpenCardInfoViewModel.this.getUserAgreementProtocolLiveData().setValue(resource);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Resource<String> resource) {
                a(resource);
                return Unit.INSTANCE;
            }
        });
    }
}
