package com.huami.wallet.accessdoor.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.nfc.web.entity.ProtocolEntity;
import com.huami.wallet.accessdoor.api.service.AccessDoorDataSource;
import com.huami.wallet.accessdoor.entity.DoorInfoAndDefaultCard;
import com.huami.wallet.accessdoor.helper.Resource;
import com.huami.wallet.accessdoor.helper.Status;
import com.huami.wallet.accessdoor.viewmodel.AccessDoorListViewModel;
import com.loc.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b;\u0010<J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J?\u0010\f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\b\u001a\u00020\u00022\u001d\u0010\u000b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0002\b\nH\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eJ\u0017\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R4\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00070\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00198\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001fR\u001f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00198\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001fR%\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00198\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010\u001d\u001a\u0004\b*\u0010\u001fR%\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u00070,8\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R%\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070,8\u0006@\u0006¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b4\u00101R\u001c\u00107\u001a\b\u0012\u0004\u0012\u00020-0,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010/R\"\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e088\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00109¨\u0006="}, d2 = {"Lcom/huami/wallet/accessdoor/viewmodel/AccessDoorListViewModel;", "Lcom/huami/wallet/accessdoor/viewmodel/BaseViewModel;", "", "actionType", "", "getUserProtocol", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/wallet/accessdoor/helper/Resource;", "tag", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "action", GoogleApiAvailabilityLight.b, z.j, "", "isNeedRequest", "getCardListAndDefault", "", "id", "userAgreementProtocol", "(Ljava/lang/Long;)V", "Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;", "b", "Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;", "doorDataSource", "Landroidx/lifecycle/MediatorLiveData;", "", "Lcom/huami/wallet/accessdoor/entity/DoorInfoAndDefaultCard;", "c", "Landroidx/lifecycle/MediatorLiveData;", "getGetAccessDoorCardListLiveData", "()Landroidx/lifecycle/MediatorLiveData;", "setGetAccessDoorCardListLiveData", "(Landroidx/lifecycle/MediatorLiveData;)V", "getAccessDoorCardListLiveData", GoogleApiAvailabilityLight.a, "getLoadingDialogStatusLiveData", "loadingDialogStatusLiveData", "e", "getDefaultCardIdLiveData", "defaultCardIdLiveData", "f", "getNotDefaultCardIdLiveData", "notDefaultCardIdLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/nfc/web/entity/ProtocolEntity;", "g", "Landroidx/lifecycle/MutableLiveData;", "getGetProtocolEntityLiveData", "()Landroidx/lifecycle/MutableLiveData;", "getProtocolEntityLiveData", "h", "getUserAgreementProtocolLiveData", "userAgreementProtocolLiveData", "i", "protocolEntityLiveData", "", "Ljava/util/Map;", SportAnalytics.ParamValue.MapButtonType.MAP, "<init>", "(Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;)V", "access-door_release"}, k = 1, mv = {1, 5, 1})
public final class AccessDoorListViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final AccessDoorDataSource doorDataSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private MediatorLiveData<Resource<List<DoorInfoAndDefaultCard>>> getAccessDoorCardListLiveData = new MediatorLiveData<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<Boolean> loadingDialogStatusLiveData = new MediatorLiveData<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<DoorInfoAndDefaultCard> defaultCardIdLiveData = new MediatorLiveData<>();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<List<DoorInfoAndDefaultCard>> notDefaultCardIdLiveData = new MediatorLiveData<>();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<ProtocolEntity>> getProtocolEntityLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<String>> userAgreementProtocolLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<ProtocolEntity> protocolEntityLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Map<String, Boolean> map = new LinkedHashMap();

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            iArr[Status.LOADING.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "", "Lcom/huami/wallet/accessdoor/entity/DoorInfoAndDefaultCard;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Resource<List<? extends DoorInfoAndDefaultCard>>, Unit> {

        /* JADX INFO: renamed from: com.huami.wallet.accessdoor.viewmodel.AccessDoorListViewModel$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "", "Lcom/huami/wallet/accessdoor/entity/DoorInfoAndDefaultCard;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0642a extends Lambda implements Function1<Resource<List<? extends DoorInfoAndDefaultCard>>, Unit> {
            public final /* synthetic */ AccessDoorListViewModel a;
            public final /* synthetic */ Resource<List<DoorInfoAndDefaultCard>> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0642a(AccessDoorListViewModel accessDoorListViewModel, Resource<List<DoorInfoAndDefaultCard>> resource) {
                super(1);
                this.a = accessDoorListViewModel;
                this.b = resource;
            }

            public final void a(@NotNull Resource<List<DoorInfoAndDefaultCard>> resource) {
                this.a.getGetAccessDoorCardListLiveData().setValue(this.b);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Resource<List<? extends DoorInfoAndDefaultCard>> resource) {
                a(resource);
                return Unit.INSTANCE;
            }
        }

        public a() {
            super(1);
        }

        public final void a(@NotNull Resource<List<DoorInfoAndDefaultCard>> resource) {
            AccessDoorListViewModel accessDoorListViewModel = AccessDoorListViewModel.this;
            accessDoorListViewModel.n(resource, "getCardListAndDefault", new C0642a(accessDoorListViewModel, resource));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<List<? extends DoorInfoAndDefaultCard>> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "Lcom/huami/nfc/web/entity/ProtocolEntity;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Resource<ProtocolEntity>, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "Lcom/huami/nfc/web/entity/ProtocolEntity;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Resource<ProtocolEntity>, Unit> {
            public final /* synthetic */ Resource<ProtocolEntity> a;
            public final /* synthetic */ AccessDoorListViewModel b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Resource<ProtocolEntity> resource, AccessDoorListViewModel accessDoorListViewModel) {
                super(1);
                this.a = resource;
                this.b = accessDoorListViewModel;
            }

            public final void a(@NotNull Resource<ProtocolEntity> resource) {
                if (this.a.isSuccessful()) {
                    this.b.protocolEntityLiveData.setValue(this.a.data);
                }
                this.b.getGetProtocolEntityLiveData().setValue(this.a);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Resource<ProtocolEntity> resource) {
                a(resource);
                return Unit.INSTANCE;
            }
        }

        public b() {
            super(1);
        }

        public final void a(@NotNull Resource<ProtocolEntity> resource) {
            AccessDoorListViewModel accessDoorListViewModel = AccessDoorListViewModel.this;
            accessDoorListViewModel.n(resource, "getUserProtocol", new a(resource, accessDoorListViewModel));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<ProtocolEntity> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Resource<String>, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Resource<String>, Unit> {
            public final /* synthetic */ Resource<String> a;
            public final /* synthetic */ AccessDoorListViewModel b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Resource<String> resource, AccessDoorListViewModel accessDoorListViewModel) {
                super(1);
                this.a = resource;
                this.b = accessDoorListViewModel;
            }

            public final void a(@NotNull Resource<String> resource) {
                if (this.a.isSuccessful()) {
                    this.b.protocolEntityLiveData.setValue(null);
                }
                this.b.getUserAgreementProtocolLiveData().setValue(this.a);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Resource<String> resource) {
                a(resource);
                return Unit.INSTANCE;
            }
        }

        public c() {
            super(1);
        }

        public final void a(@NotNull Resource<String> resource) {
            AccessDoorListViewModel accessDoorListViewModel = AccessDoorListViewModel.this;
            accessDoorListViewModel.n(resource, "userAgreementProtocol", new a(resource, accessDoorListViewModel));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<String> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    public AccessDoorListViewModel(@NotNull AccessDoorDataSource accessDoorDataSource) throws Exception {
        this.doorDataSource = accessDoorDataSource;
        j();
        getCardListAndDefault(false);
        getUserProtocol("UPDATE");
    }

    private final void getUserProtocol(String actionType) throws Exception {
        publisherToResource("getUserProtocol", this.doorDataSource.getProtocol(actionType), new b());
    }

    private final void j() {
        this.defaultCardIdLiveData.addSource(this.getAccessDoorCardListLiveData, new Observer() { // from class: y0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                AccessDoorListViewModel.k(this.a, (Resource) obj);
            }
        });
        this.notDefaultCardIdLiveData.addSource(this.getAccessDoorCardListLiveData, new Observer() { // from class: z0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                AccessDoorListViewModel.m(this.a, (Resource) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(AccessDoorListViewModel accessDoorListViewModel, Resource resource) {
        if ((resource == null ? null : (List) resource.data) == null || ((List) resource.data).isEmpty()) {
            return;
        }
        for (DoorInfoAndDefaultCard doorInfoAndDefaultCard : (List) resource.data) {
            if (doorInfoAndDefaultCard.getIdDefaultCard()) {
                accessDoorListViewModel.getDefaultCardIdLiveData().setValue(doorInfoAndDefaultCard);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(AccessDoorListViewModel accessDoorListViewModel, Resource resource) {
        if ((resource == null ? null : (List) resource.data) == null || ((List) resource.data).isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (DoorInfoAndDefaultCard doorInfoAndDefaultCard : (List) resource.data) {
            if (!doorInfoAndDefaultCard.getIdDefaultCard()) {
                arrayList.add(doorInfoAndDefaultCard);
            }
        }
        accessDoorListViewModel.getNotDefaultCardIdLiveData().setValue(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> void n(Resource<T> resource, String str, Function1<? super Resource<T>, Unit> function1) {
        boolean z = true;
        if (WhenMappings.$EnumSwitchMapping$0[resource.status.ordinal()] == 1) {
            this.map.put(str, Boolean.TRUE);
        } else {
            this.map.put(str, Boolean.FALSE);
        }
        function1.invoke(resource);
        Iterator<Map.Entry<String, Boolean>> it2 = this.map.entrySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().getValue().booleanValue()) {
                this.loadingDialogStatusLiveData.setValue(Boolean.valueOf(z));
            }
        }
        z = false;
        this.loadingDialogStatusLiveData.setValue(Boolean.valueOf(z));
    }

    public final void getCardListAndDefault(boolean isNeedRequest) throws Exception {
        publisherToResource("getCardListAndDefault", this.doorDataSource.getCardListAndIsDefaultCard(isNeedRequest), new a());
    }

    @NotNull
    public final MediatorLiveData<DoorInfoAndDefaultCard> getDefaultCardIdLiveData() {
        return this.defaultCardIdLiveData;
    }

    @NotNull
    public final MediatorLiveData<Resource<List<DoorInfoAndDefaultCard>>> getGetAccessDoorCardListLiveData() {
        return this.getAccessDoorCardListLiveData;
    }

    @NotNull
    public final MutableLiveData<Resource<ProtocolEntity>> getGetProtocolEntityLiveData() {
        return this.getProtocolEntityLiveData;
    }

    @NotNull
    public final MediatorLiveData<Boolean> getLoadingDialogStatusLiveData() {
        return this.loadingDialogStatusLiveData;
    }

    @NotNull
    public final MediatorLiveData<List<DoorInfoAndDefaultCard>> getNotDefaultCardIdLiveData() {
        return this.notDefaultCardIdLiveData;
    }

    @NotNull
    public final MutableLiveData<Resource<String>> getUserAgreementProtocolLiveData() {
        return this.userAgreementProtocolLiveData;
    }

    public final void setGetAccessDoorCardListLiveData(@NotNull MediatorLiveData<Resource<List<DoorInfoAndDefaultCard>>> mediatorLiveData) {
        this.getAccessDoorCardListLiveData = mediatorLiveData;
    }

    public final void userAgreementProtocol(@Nullable Long id) throws Exception {
        publisherToResource("userAgreementProtocol", this.doorDataSource.agreeProtocol(id), new c());
    }
}
