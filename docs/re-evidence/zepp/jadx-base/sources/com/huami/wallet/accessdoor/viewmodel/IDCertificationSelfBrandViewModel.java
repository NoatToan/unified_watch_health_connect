package com.huami.wallet.accessdoor.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.nfc.door.entity.IdCardEntity;
import com.huami.nfc.door.entity.VerifyEntity;
import com.huami.wallet.accessdoor.api.service.AccessDoorDataSource;
import com.huami.wallet.accessdoor.helper.Resource;
import com.huami.wallet.accessdoor.utils.EventId;
import com.huami.wallet.accessdoor.utils.ParamKey;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR.\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/huami/wallet/accessdoor/viewmodel/IDCertificationSelfBrandViewModel;", "Lcom/huami/wallet/accessdoor/viewmodel/BaseViewModel;", "Lcom/huami/wallet/accessdoor/helper/Resource;", "Lcom/huami/nfc/door/entity/VerifyEntity;", "booleanResource", "", "h", "Lcom/huami/nfc/door/entity/IdCardEntity;", "info", "getSelfBrandVerifyCertification", "Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;", "b", "Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;", "doorDataSource", "Landroidx/lifecycle/MutableLiveData;", "c", "Landroidx/lifecycle/MutableLiveData;", "getGetSelfBrandVerifyCertificationLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setGetSelfBrandVerifyCertificationLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "getSelfBrandVerifyCertificationLiveData", "<init>", "(Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;)V", "access-door_release"}, k = 1, mv = {1, 5, 1})
public final class IDCertificationSelfBrandViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final AccessDoorDataSource doorDataSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Resource<VerifyEntity>> getSelfBrandVerifyCertificationLiveData = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "Lcom/huami/nfc/door/entity/VerifyEntity;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Resource<VerifyEntity>, Unit> {
        public a() {
            super(1);
        }

        public final void a(@NotNull Resource<VerifyEntity> resource) {
            IDCertificationSelfBrandViewModel.this.getGetSelfBrandVerifyCertificationLiveData().setValue(resource);
            if (resource.isCompleted()) {
                IDCertificationSelfBrandViewModel.this.h(resource);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<VerifyEntity> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    public IDCertificationSelfBrandViewModel(@NotNull AccessDoorDataSource accessDoorDataSource) {
        this.doorDataSource = accessDoorDataSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(Resource<VerifyEntity> booleanResource) {
        HashMap map = new HashMap(2);
        map.put("DeviceSource", this.doorDataSource.getDeviceModel());
        if (booleanResource.isSuccessful()) {
            Analytics.recordEvent(new CountEventBuilder(EventId.NFC_ACCESS_CERTIFICATION_SUCCESS).putExtras(map));
            return;
        }
        map.put(ParamKey.ERROR_CODE, booleanResource.code);
        map.put("ErrorMsg", "code:" + booleanResource.code + "msg:" + booleanResource.message);
        Analytics.recordEvent(new CountEventBuilder(EventId.NFC_ACCESS_CERTIFICATION_FAILURE).putExtras(map));
    }

    @NotNull
    public final MutableLiveData<Resource<VerifyEntity>> getGetSelfBrandVerifyCertificationLiveData() {
        return this.getSelfBrandVerifyCertificationLiveData;
    }

    public final void getSelfBrandVerifyCertification(@NotNull IdCardEntity info) throws Exception {
        publisherToResource("getQueryCertification", this.doorDataSource.snowVerify(info), new a());
    }

    public final void setGetSelfBrandVerifyCertificationLiveData(@NotNull MutableLiveData<Resource<VerifyEntity>> mutableLiveData) {
        this.getSelfBrandVerifyCertificationLiveData = mutableLiveData;
    }
}
