package com.huami.wallet.accessdoor.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
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
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\"\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0007R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR.\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/huami/wallet/accessdoor/viewmodel/IDCertificationViewModel;", "Lcom/huami/wallet/accessdoor/viewmodel/BaseViewModel;", "Lcom/huami/wallet/accessdoor/helper/Resource;", "", "booleanResource", "", "h", "", "type", "frontImage", "backImage", "verifyCertification", "Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;", "b", "Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;", "doorDataSource", "Landroidx/lifecycle/MutableLiveData;", "c", "Landroidx/lifecycle/MutableLiveData;", "getVerifyCertificationLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setVerifyCertificationLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "verifyCertificationLiveData", "<init>", "(Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;)V", "access-door_release"}, k = 1, mv = {1, 5, 1})
public final class IDCertificationViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final AccessDoorDataSource doorDataSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Resource<Boolean>> verifyCertificationLiveData = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Resource<Boolean>, Unit> {
        public a() {
            super(1);
        }

        public final void a(@NotNull Resource<Boolean> resource) {
            IDCertificationViewModel.this.getVerifyCertificationLiveData().setValue(resource);
            if (resource.isCompleted()) {
                IDCertificationViewModel.this.h(resource);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<Boolean> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    public IDCertificationViewModel(@NotNull AccessDoorDataSource accessDoorDataSource) {
        this.doorDataSource = accessDoorDataSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(Resource<Boolean> booleanResource) {
        HashMap map = new HashMap(2);
        map.put("DeviceSource", this.doorDataSource.getDeviceModel());
        if (booleanResource.isSuccessful()) {
            Analytics.recordEvent(new CountEventBuilder(EventId.NFC_ACCESS_CERTIFICATION_SUCCESS).putExtras(map));
            return;
        }
        String str = booleanResource.code;
        if (str == null) {
            str = "";
        }
        map.put(ParamKey.ERROR_CODE, str);
        map.put("ErrorMsg", "code:" + booleanResource.code + "msg:" + booleanResource.message);
        Analytics.recordEvent(new CountEventBuilder(EventId.NFC_ACCESS_CERTIFICATION_FAILURE).putExtras(map));
    }

    @NotNull
    public final MutableLiveData<Resource<Boolean>> getVerifyCertificationLiveData() {
        return this.verifyCertificationLiveData;
    }

    public final void setVerifyCertificationLiveData(@NotNull MutableLiveData<Resource<Boolean>> mutableLiveData) {
        this.verifyCertificationLiveData = mutableLiveData;
    }

    public final void verifyCertification(@NotNull String type, @Nullable String frontImage, @Nullable String backImage) throws Exception {
        if (frontImage == null || frontImage.length() == 0) {
            return;
        }
        if (backImage == null || backImage.length() == 0) {
            return;
        }
        publisherToResource("verifyCertification", this.doorDataSource.verify(type, frontImage, backImage), new a());
    }
}
