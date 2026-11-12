package com.huami.wallet.accessdoor.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.nfc.applet.CardScheduleTime;
import com.huami.nfc.ble.AppletType;
import com.huami.nfc.door.DoorCardInfo;
import com.huami.nfc.door.entity.DoorCardExtraEntity;
import com.huami.nfc.web.entity.ProtocolEntity;
import com.huami.wallet.accessdoor.api.service.AccessDoorDataSource;
import com.huami.wallet.accessdoor.entity.DoorInfoAndDefaultCard;
import com.huami.wallet.accessdoor.helper.Resource;
import com.huami.wallet.accessdoor.utils.EventId;
import com.huami.wallet.accessdoor.utils.ParamKey;
import com.huami.wallet.accessdoor.utils.ParamValue;
import com.huami.wallet.accessdoor.viewmodel.AccessDetailViewModel;
import com.loc.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u001a\u0018\u0000 c2\u00020\u0001:\u0001cB\u000f\u0012\u0006\u0010)\u001a\u00020&¢\u0006\u0004\ba\u0010bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0006\u0010\u000b\u001a\u00020\u0007J\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000fJ\u0017\u0010\u0017\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018JA\u0010 \u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042!\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\t0\u001bJ\u000e\u0010!\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\"\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010#\u001a\u00020\tJ\u000e\u0010%\u001a\u00020\t2\u0006\u0010$\u001a\u00020\u0004R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R.\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R.\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010,\u001a\u0004\b3\u0010.\"\u0004\b4\u00100R.\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010,\u001a\u0004\b7\u0010.\"\u0004\b8\u00100R.\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0\u00060*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010,\u001a\u0004\b<\u0010.\"\u0004\b=\u00100R.\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00060*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010,\u001a\u0004\b@\u0010.\"\u0004\bA\u00100R(\u0010G\u001a\b\u0012\u0004\u0012\u00020C0*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010,\u001a\u0004\bE\u0010.\"\u0004\bF\u00100R(\u0010I\u001a\b\u0012\u0004\u0012\u00020:0*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010,\u001a\u0004\b>\u0010.\"\u0004\bH\u00100R-\u0010M\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010J0\u00060*8\u0006@\u0006¢\u0006\f\n\u0004\bK\u0010,\u001a\u0004\bL\u0010.R%\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060*8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\bN\u0010.R%\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060*8\u0006@\u0006¢\u0006\f\n\u0004\bP\u0010,\u001a\u0004\bQ\u0010.R\u001f\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00070*8\u0006@\u0006¢\u0006\f\n\u0004\bS\u0010,\u001a\u0004\bT\u0010.R$\u0010U\u001a\u00020C2\u0006\u0010U\u001a\u00020C8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR(\u0010^\u001a\u0004\u0018\u00010:2\b\u0010U\u001a\u0004\u0018\u00010:8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u0015\u0010_\u001a\u0004\u0018\u00010\u00078F@\u0006¢\u0006\u0006\u001a\u0004\b_\u0010`¨\u0006d"}, d2 = {"Lcom/huami/wallet/accessdoor/viewmodel/AccessDetailViewModel;", "Lcom/huami/wallet/accessdoor/viewmodel/BaseViewModel;", "Lcom/huami/nfc/applet/CardScheduleTime;", "cardScheduleTime", "", "i", "Lcom/huami/wallet/accessdoor/helper/Resource;", "", "booleanResource", "", hl.k, "isEncryptionCard", "Lcom/huami/nfc/door/DoorCardInfo;", "doorCardInfo", "updateCardName", "", "aid", "deleteCard", "setDefaultCard", "actionType", "getUserProtocol", "", "id", "userAgreementProtocol", "(Ljava/lang/Long;)V", "hour", "minute", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "checkError", "callback", "setCardScheduleTime", "queryScheduleTimes", "deleteScheduleTimes", "isSupportTimeSwitchCard", "operaType", "recordDoorDetailOperation", "Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;", "b", "Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;", "accessDoorDataSource", "Landroidx/lifecycle/MutableLiveData;", "c", "Landroidx/lifecycle/MutableLiveData;", "getUpdateCardNameLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setUpdateCardNameLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "updateCardNameLiveData", GoogleApiAvailabilityLight.a, "getDeleteCardLiveData", "setDeleteCardLiveData", "deleteCardLiveData", "e", "getSetDefaultCardLiveData", "setSetDefaultCardLiveData", "setDefaultCardLiveData", "Lcom/huami/nfc/web/entity/ProtocolEntity;", "f", "getGetProtocolEntityLiveData", "setGetProtocolEntityLiveData", "getProtocolEntityLiveData", "g", "getUserAgreementProtocolLiveData", "setUserAgreementProtocolLiveData", "userAgreementProtocolLiveData", "Lcom/huami/wallet/accessdoor/entity/DoorInfoAndDefaultCard;", "h", "getDoorInfoLiveData", "setDoorInfoLiveData", "doorInfoLiveData", "setProtocolEntityLiveData", "protocolEntityLiveData", "", z.j, "getCardScheduleTimesLiveData", "cardScheduleTimesLiveData", "getDeleteCardScheduleTimeResultLiveData", "deleteCardScheduleTimeResultLiveData", "l", "getSetCardScheduleTimeResultLiveData", "setCardScheduleTimeResultLiveData", "m", "isSupportTimeSwitchCardLiveData", "doorInfoAndDefaultCard", "getDoorInfoAndDefaultCard", "()Lcom/huami/wallet/accessdoor/entity/DoorInfoAndDefaultCard;", "setDoorInfoAndDefaultCard", "(Lcom/huami/wallet/accessdoor/entity/DoorInfoAndDefaultCard;)V", "getProtocolEntity", "()Lcom/huami/nfc/web/entity/ProtocolEntity;", "setProtocolEntity", "(Lcom/huami/nfc/web/entity/ProtocolEntity;)V", "protocolEntity", "isMiDevice", "()Ljava/lang/Boolean;", "<init>", "(Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;)V", "Companion", "access-door_release"}, k = 1, mv = {1, 5, 1})
public final class AccessDetailViewModel extends BaseViewModel {
    public static final int CARD_TIME_SWITCH_MAX_TIMES = 5;
    public static final int CARD_TIME_SWITCH_REPEAT_SET = 66;
    public static final int CARD_TIME_SWITCH_REPEAT_SET_ANOTHER = 53;
    public static final int ERROR_MAX_TIMES = 2;
    public static final int ERROR_NULL = 0;
    public static final int ERROR_REPEAT_TIME = 1;
    public static final int FAQ = 1;
    private static final int n = 0;
    private static final int o = 2;
    private static final int p = 3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final AccessDoorDataSource accessDoorDataSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Resource<Boolean>> updateCardNameLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Resource<Boolean>> deleteCardLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Resource<Boolean>> setDefaultCardLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Resource<ProtocolEntity>> getProtocolEntityLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Resource<String>> userAgreementProtocolLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<DoorInfoAndDefaultCard> doorInfoLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<ProtocolEntity> protocolEntityLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<List<CardScheduleTime>>> cardScheduleTimesLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<Boolean>> deleteCardScheduleTimeResultLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<Boolean>> setCardScheduleTimeResultLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> isSupportTimeSwitchCardLiveData = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Resource<Boolean>, Unit> {
        public a() {
            super(1);
        }

        public final void a(@NotNull Resource<Boolean> resource) {
            AccessDetailViewModel.this.getDeleteCardLiveData().setValue(resource);
            if (resource.isCompleted()) {
                AccessDetailViewModel.this.k(resource);
                AccessDetailViewModel.this.recordDoorDetailOperation(2);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<Boolean> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Resource<Boolean>, Unit> {
        public final /* synthetic */ CardScheduleTime b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CardScheduleTime cardScheduleTime) {
            super(1);
            this.b = cardScheduleTime;
        }

        public final void a(@NotNull Resource<Boolean> resource) {
            List<CardScheduleTime> list;
            AccessDetailViewModel.this.getDeleteCardScheduleTimeResultLiveData().setValue(resource);
            if (resource.isSuccessful()) {
                Resource<List<CardScheduleTime>> value = AccessDetailViewModel.this.getCardScheduleTimesLiveData().getValue();
                List mutableList = null;
                if (value != null && (list = value.data) != null) {
                    mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) list);
                }
                if (mutableList == null) {
                    return;
                }
                mutableList.remove(this.b);
                AccessDetailViewModel.this.getCardScheduleTimesLiveData().postValue(Resource.success(mutableList));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<Boolean> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "Lcom/huami/nfc/web/entity/ProtocolEntity;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Resource<ProtocolEntity>, Unit> {
        public c() {
            super(1);
        }

        public final void a(@NotNull Resource<ProtocolEntity> resource) {
            AccessDetailViewModel.this.getGetProtocolEntityLiveData().setValue(resource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<ProtocolEntity> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<Boolean, Unit> {
        public d() {
            super(1);
        }

        public final void a(Boolean bool) {
            AccessDetailViewModel.this.isSupportTimeSwitchCardLiveData().setValue(bool);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            a(bool);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "", "Lcom/huami/nfc/applet/CardScheduleTime;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<Resource<List<? extends CardScheduleTime>>, Unit> {
        public e() {
            super(1);
        }

        public final void a(@NotNull Resource<List<CardScheduleTime>> resource) {
            AccessDetailViewModel.this.getCardScheduleTimesLiveData().setValue(resource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<List<? extends CardScheduleTime>> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<Resource<Boolean>, Unit> {
        public final /* synthetic */ CardScheduleTime b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(CardScheduleTime cardScheduleTime) {
            super(1);
            this.b = cardScheduleTime;
        }

        public final void a(@NotNull Resource<Boolean> resource) {
            List<CardScheduleTime> list;
            AccessDetailViewModel.this.getSetCardScheduleTimeResultLiveData().setValue(resource);
            if (resource.isSuccessful()) {
                Resource<List<CardScheduleTime>> value = AccessDetailViewModel.this.getCardScheduleTimesLiveData().getValue();
                List arrayList = null;
                if (value != null && (list = value.data) != null) {
                    arrayList = CollectionsKt___CollectionsKt.toMutableList((Collection) list);
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.b);
                AccessDetailViewModel.this.getCardScheduleTimesLiveData().postValue(Resource.success(arrayList));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<Boolean> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<Resource<Boolean>, Unit> {
        public g() {
            super(1);
        }

        public final void a(@NotNull Resource<Boolean> resource) {
            AccessDetailViewModel.this.getSetDefaultCardLiveData().setValue(resource);
            if (resource.isCompleted()) {
                AccessDetailViewModel.this.recordDoorDetailOperation(3);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<Boolean> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function1<Resource<Boolean>, Unit> {
        public h() {
            super(1);
        }

        public final void a(@NotNull Resource<Boolean> resource) {
            AccessDetailViewModel.this.getUpdateCardNameLiveData().setValue(resource);
            if (resource.isCompleted()) {
                AccessDetailViewModel.this.recordDoorDetailOperation(0);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<Boolean> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function1<Resource<String>, Unit> {
        public i() {
            super(1);
        }

        public final void a(@NotNull Resource<String> resource) {
            AccessDetailViewModel.this.getUserAgreementProtocolLiveData().setValue(resource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<String> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    public AccessDetailViewModel(@NotNull AccessDoorDataSource accessDoorDataSource) {
        this.accessDoorDataSource = accessDoorDataSource;
    }

    private final int i(CardScheduleTime cardScheduleTime) {
        Resource<List<CardScheduleTime>> value = this.cardScheduleTimesLiveData.getValue();
        List<CardScheduleTime> list = value == null ? null : value.data;
        if ((list == null ? 0 : list.size()) + 1 > 5) {
            return 2;
        }
        return list != null && list.contains(cardScheduleTime) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean j(AccessDetailViewModel accessDetailViewModel) {
        return Boolean.valueOf(accessDetailViewModel.accessDoorDataSource.isSupportTimeSwitchCard());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(Resource<Boolean> booleanResource) {
        HashMap map = new HashMap(2);
        map.put("DeviceSource", this.accessDoorDataSource.getDeviceModel());
        if (booleanResource.isSuccessful()) {
            Analytics.recordEvent(new CountEventBuilder(EventId.NFC_ACCESS_DELETE_SUCCESS).putExtras(map));
            return;
        }
        map.put(ParamKey.ERROR_CODE, booleanResource.code);
        map.put("ErrorMsg", "code:" + booleanResource.code + "msg:" + booleanResource.message);
        Analytics.recordEvent(new CountEventBuilder(EventId.NFC_ACCESS_DELETE_FAILURE).putExtras(map));
    }

    public final void deleteCard(@NotNull String aid) throws Exception {
        publisherToResource("deleteCard", this.accessDoorDataSource.deleteAccessDoorCard(aid), new a());
    }

    public final void deleteScheduleTimes(@NotNull CardScheduleTime cardScheduleTime) throws Exception {
        publisherToResource("deleteScheduleTimes", this.accessDoorDataSource.deleteCardScheduleTime(cardScheduleTime), new b(cardScheduleTime));
    }

    @NotNull
    public final MutableLiveData<Resource<List<CardScheduleTime>>> getCardScheduleTimesLiveData() {
        return this.cardScheduleTimesLiveData;
    }

    @NotNull
    public final MutableLiveData<Resource<Boolean>> getDeleteCardLiveData() {
        return this.deleteCardLiveData;
    }

    @NotNull
    public final MutableLiveData<Resource<Boolean>> getDeleteCardScheduleTimeResultLiveData() {
        return this.deleteCardScheduleTimeResultLiveData;
    }

    @NotNull
    public final DoorInfoAndDefaultCard getDoorInfoAndDefaultCard() {
        return this.doorInfoLiveData.getValue();
    }

    @NotNull
    public final MutableLiveData<DoorInfoAndDefaultCard> getDoorInfoLiveData() {
        return this.doorInfoLiveData;
    }

    @NotNull
    public final MutableLiveData<Resource<ProtocolEntity>> getGetProtocolEntityLiveData() {
        return this.getProtocolEntityLiveData;
    }

    @Nullable
    public final ProtocolEntity getProtocolEntity() {
        return this.protocolEntityLiveData.getValue();
    }

    @NotNull
    public final MutableLiveData<ProtocolEntity> getProtocolEntityLiveData() {
        return this.protocolEntityLiveData;
    }

    @NotNull
    public final MutableLiveData<Resource<Boolean>> getSetCardScheduleTimeResultLiveData() {
        return this.setCardScheduleTimeResultLiveData;
    }

    @NotNull
    public final MutableLiveData<Resource<Boolean>> getSetDefaultCardLiveData() {
        return this.setDefaultCardLiveData;
    }

    @NotNull
    public final MutableLiveData<Resource<Boolean>> getUpdateCardNameLiveData() {
        return this.updateCardNameLiveData;
    }

    @NotNull
    public final MutableLiveData<Resource<String>> getUserAgreementProtocolLiveData() {
        return this.userAgreementProtocolLiveData;
    }

    public final void getUserProtocol(@NotNull String actionType) throws Exception {
        publisherToResource("getUserProtocol", this.accessDoorDataSource.getProtocol(actionType), new c());
    }

    public final boolean isEncryptionCard() {
        DoorCardExtraEntity extra = getDoorInfoAndDefaultCard().getDoorCardInfo().getExtra();
        if (extra == null) {
            return false;
        }
        return Intrinsics.areEqual((Object) extra.getDataType(), (Object) 1);
    }

    @Nullable
    public final Boolean isMiDevice() {
        return Boolean.valueOf(this.accessDoorDataSource.isMiDevice());
    }

    public final void isSupportTimeSwitchCard() throws Exception {
        addCallable("isSupportTimeSwitchCard", new Callable() { // from class: v0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AccessDetailViewModel.j(this.a);
            }
        }, new d());
    }

    @NotNull
    public final MutableLiveData<Boolean> isSupportTimeSwitchCardLiveData() {
        return this.isSupportTimeSwitchCardLiveData;
    }

    public final void queryScheduleTimes(@NotNull String aid) throws Exception {
        publisherToResource("queryScheduleTimes", this.accessDoorDataSource.queryCardScheduleTime(AppletType.DOOR, aid), new e());
    }

    public final void recordDoorDetailOperation(int operaType) {
        HashMap map = new HashMap(2);
        map.put("DeviceSource", this.accessDoorDataSource.getDeviceModel());
        if (operaType == 0) {
            map.put(ParamKey.DOOR_DETAIL_OPERATION, ParamValue.Edit_Name);
        } else if (operaType == 1) {
            map.put(ParamKey.DOOR_DETAIL_OPERATION, ParamValue.FAQ);
        } else if (operaType != 2) {
            map.put(ParamKey.DOOR_DETAIL_OPERATION, ParamValue.SwitchCard);
        } else {
            map.put(ParamKey.DOOR_DETAIL_OPERATION, ParamValue.Delete);
        }
        Analytics.recordEvent(new CountEventBuilder(EventId.DOOR_DETAIL_OUT).putExtras(map));
    }

    public final void setCardScheduleTime(@NotNull String aid, int hour, int minute, @NotNull Function1<? super Integer, Unit> callback) throws Exception {
        CardScheduleTime cardScheduleTime = new CardScheduleTime(AppletType.DOOR.getBleValue(), aid.toLowerCase(), 2L, hour, minute);
        int i2 = i(cardScheduleTime);
        if (i2 != 0) {
            callback.invoke(Integer.valueOf(i2));
        } else {
            publisherToResource("setCardScheduleTime", this.accessDoorDataSource.setCardScheduleTime(cardScheduleTime), new f(cardScheduleTime));
        }
    }

    public final void setDefaultCard(@NotNull String aid) throws Exception {
        publisherToResource("setDefaultCard", this.accessDoorDataSource.setDefaultCard(aid), new g());
    }

    public final void setDeleteCardLiveData(@NotNull MutableLiveData<Resource<Boolean>> mutableLiveData) {
        this.deleteCardLiveData = mutableLiveData;
    }

    public final void setDoorInfoAndDefaultCard(@NotNull DoorInfoAndDefaultCard doorInfoAndDefaultCard) {
        this.doorInfoLiveData.setValue(doorInfoAndDefaultCard);
    }

    public final void setDoorInfoLiveData(@NotNull MutableLiveData<DoorInfoAndDefaultCard> mutableLiveData) {
        this.doorInfoLiveData = mutableLiveData;
    }

    public final void setGetProtocolEntityLiveData(@NotNull MutableLiveData<Resource<ProtocolEntity>> mutableLiveData) {
        this.getProtocolEntityLiveData = mutableLiveData;
    }

    public final void setProtocolEntity(@Nullable ProtocolEntity protocolEntity) {
        this.protocolEntityLiveData.setValue(protocolEntity);
    }

    public final void setProtocolEntityLiveData(@NotNull MutableLiveData<ProtocolEntity> mutableLiveData) {
        this.protocolEntityLiveData = mutableLiveData;
    }

    public final void setSetDefaultCardLiveData(@NotNull MutableLiveData<Resource<Boolean>> mutableLiveData) {
        this.setDefaultCardLiveData = mutableLiveData;
    }

    public final void setUpdateCardNameLiveData(@NotNull MutableLiveData<Resource<Boolean>> mutableLiveData) {
        this.updateCardNameLiveData = mutableLiveData;
    }

    public final void setUserAgreementProtocolLiveData(@NotNull MutableLiveData<Resource<String>> mutableLiveData) {
        this.userAgreementProtocolLiveData = mutableLiveData;
    }

    public final void updateCardName(@NotNull DoorCardInfo doorCardInfo) throws Exception {
        publisherToResource("updateCardName", this.accessDoorDataSource.namedOrUpdateCardName(doorCardInfo), new h());
    }

    public final void userAgreementProtocol(@Nullable Long id) throws Exception {
        publisherToResource("userAgreementProtocol", this.accessDoorDataSource.agreeProtocol(id), new i());
    }
}
