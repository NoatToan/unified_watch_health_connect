package com.huami.wallet.accessdoor.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.door.NfcTag;
import com.huami.wallet.accessdoor.api.service.AccessDoorDataSource;
import com.huami.wallet.accessdoor.entity.DoorOpenCardData;
import com.huami.wallet.accessdoor.helper.Resource;
import com.huami.wallet.accessdoor.koinmodule.DoorScopeKt;
import com.huami.wallet.accessdoor.utils.EventId;
import com.huami.wallet.accessdoor.utils.ParamKey;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001&B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b$\u0010%J\u001c\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u0002J\u0006\u0010\t\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR4\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR.\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\u0013\u0010\"\u001a\u00020!8F@\u0006¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/huami/wallet/accessdoor/viewmodel/StartAccessDoorViewModel;", "Lcom/huami/wallet/accessdoor/viewmodel/BaseViewModel;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/wallet/accessdoor/helper/Resource;", "Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/door/NfcTag;", "booleanResource", "", "h", "isDetectionSuccess", "", "key", "getDoorImageUrl", "Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;", "b", "Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;", "doorDataSource", "Landroidx/lifecycle/MutableLiveData;", "c", "Landroidx/lifecycle/MutableLiveData;", "getDetectionStatusLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setDetectionStatusLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "detectionStatusLiveData", "Lcom/huami/wallet/accessdoor/entity/DoorOpenCardData;", GoogleApiAvailabilityLight.a, "Lcom/huami/wallet/accessdoor/entity/DoorOpenCardData;", "doorOpenCardData", "e", "getDoorResUrlLiveData", "setDoorResUrlLiveData", "doorResUrlLiveData", "", "isMiDevice", "()Z", "<init>", "(Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;)V", "Companion", "access-door_release"}, k = 1, mv = {1, 5, 1})
public final class StartAccessDoorViewModel extends BaseViewModel implements KoinComponent {
    private static final int f = 8;
    private static final int g = 9;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final AccessDoorDataSource doorDataSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Resource<PayResponse<NfcTag>>> detectionStatusLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final DoorOpenCardData doorOpenCardData = (DoorOpenCardData) DoorScopeKt.doorScope(getKoin()).get(Reflection.getOrCreateKotlinClass(DoorOpenCardData.class), null, null);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Resource<String>> doorResUrlLiveData = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Resource<String>, Unit> {
        public a() {
            super(1);
        }

        public final void a(@NotNull Resource<String> resource) {
            StartAccessDoorViewModel.this.getDoorResUrlLiveData().setValue(resource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<String> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/door/NfcTag;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Resource<PayResponse<? extends NfcTag>>, Unit> {
        public b() {
            super(1);
        }

        public final void a(@NotNull Resource<PayResponse<NfcTag>> resource) {
            NfcTag data;
            NfcTag data2;
            if (resource.isSuccessful()) {
                PayResponse<NfcTag> payResponse = resource.data;
                if (payResponse != null && (data2 = payResponse.getData()) != null) {
                    StartAccessDoorViewModel startAccessDoorViewModel = StartAccessDoorViewModel.this;
                    startAccessDoorViewModel.doorOpenCardData.setNfcTag(data2);
                    startAccessDoorViewModel.doorOpenCardData.setNfcTagType(0);
                }
            } else {
                PayResponse<NfcTag> payResponse2 = resource.data;
                if (payResponse2 != null && (data = payResponse2.getData()) != null) {
                    StartAccessDoorViewModel startAccessDoorViewModel2 = StartAccessDoorViewModel.this;
                    if (data.getResult() == 9) {
                        startAccessDoorViewModel2.doorOpenCardData.setNfcTag(data);
                        startAccessDoorViewModel2.doorOpenCardData.setNfcTagType(1);
                    } else {
                        startAccessDoorViewModel2.doorOpenCardData.setNfcTagType(0);
                    }
                }
            }
            StartAccessDoorViewModel.this.getDetectionStatusLiveData().setValue(resource);
            if (resource.isCompleted()) {
                StartAccessDoorViewModel.this.h(resource);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<PayResponse<? extends NfcTag>> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    public StartAccessDoorViewModel(@NotNull AccessDoorDataSource accessDoorDataSource) {
        this.doorDataSource = accessDoorDataSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(Resource<PayResponse<NfcTag>> booleanResource) {
        HashMap map = new HashMap(2);
        map.put("DeviceSource", this.doorDataSource.getDeviceModel());
        if (booleanResource.isSuccessful()) {
            Analytics.recordEvent(new CountEventBuilder(EventId.NFC_ACCESS_DETECTION_SUCCESS).putExtras(map));
            return;
        }
        PayResponse<NfcTag> payResponse = booleanResource.data;
        if (payResponse == null) {
            return;
        }
        NfcTag data = payResponse.getData();
        if (data != null) {
            map.put(ParamKey.ERROR_CODE, String.valueOf(data.getResult()));
            if (data.getResult() == 8) {
                map.put("ErrorMsg", "非MiFare卡");
            } else if (data.getResult() == 9) {
                map.put("ErrorMsg", "加密卡");
            } else {
                map.put("ErrorMsg", "不支持卡类型");
            }
        } else {
            map.put(ParamKey.ERROR_CODE, "255");
            map.put("ErrorMsg", "code:" + booleanResource.code + "msg:" + booleanResource.message);
        }
        Analytics.recordEvent(new CountEventBuilder(EventId.NFC_ACCESS_DETECTION_FAILURE).putExtras(map));
    }

    @NotNull
    public final MutableLiveData<Resource<PayResponse<NfcTag>>> getDetectionStatusLiveData() {
        return this.detectionStatusLiveData;
    }

    public final void getDoorImageUrl(@NotNull String key) throws Exception {
        publisherToResource("getStartAccessDoorImageUrl", this.doorDataSource.getDoorImageUrl(key), new a());
    }

    @NotNull
    public final MutableLiveData<Resource<String>> getDoorResUrlLiveData() {
        return this.doorResUrlLiveData;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final void isDetectionSuccess() throws Exception {
        publisherToResource("isDetectionSuccess", this.doorDataSource.startDetection(), new b());
    }

    public final boolean isMiDevice() {
        return this.doorDataSource.isMiDevice();
    }

    public final void setDetectionStatusLiveData(@NotNull MutableLiveData<Resource<PayResponse<NfcTag>>> mutableLiveData) {
        this.detectionStatusLiveData = mutableLiveData;
    }

    public final void setDoorResUrlLiveData(@NotNull MutableLiveData<Resource<String>> mutableLiveData) {
        this.doorResUrlLiveData = mutableLiveData;
    }
}
