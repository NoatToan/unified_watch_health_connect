package com.huami.wallet.accessdoor.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.nfc.web.entity.ProtocolEntity;
import com.huami.wallet.accessdoor.api.service.AccessDoorDataSource;
import com.huami.wallet.accessdoor.helper.Resource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b!\u0010\"J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR.\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R.\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00110\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R%\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00110\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016¨\u0006#"}, d2 = {"Lcom/huami/wallet/accessdoor/viewmodel/StartAccessViewModel;", "Lcom/huami/wallet/accessdoor/viewmodel/BaseViewModel;", "", "actionType", "", "getUserProtocol", "", "id", "userAgreementProtocol", "(Ljava/lang/Long;)V", "key", "getDoorImageUrl", "Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;", "b", "Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;", "doorDataSource", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/wallet/accessdoor/helper/Resource;", "Lcom/huami/nfc/web/entity/ProtocolEntity;", "c", "Landroidx/lifecycle/MutableLiveData;", "getGetProtocolEntityLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setGetProtocolEntityLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "getProtocolEntityLiveData", GoogleApiAvailabilityLight.a, "getUserAgreementProtocolLiveData", "setUserAgreementProtocolLiveData", "userAgreementProtocolLiveData", "e", "getDoorResUrlLiveData", "doorResUrlLiveData", "<init>", "(Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;)V", "access-door_release"}, k = 1, mv = {1, 5, 1})
public final class StartAccessViewModel extends BaseViewModel {

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
    private final MutableLiveData<Resource<String>> doorResUrlLiveData = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Resource<String>, Unit> {
        public a() {
            super(1);
        }

        public final void a(@NotNull Resource<String> resource) {
            StartAccessViewModel.this.getDoorResUrlLiveData().setValue(resource);
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
            StartAccessViewModel.this.getGetProtocolEntityLiveData().setValue(resource);
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
            StartAccessViewModel.this.getUserAgreementProtocolLiveData().setValue(resource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<String> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    public StartAccessViewModel(@NotNull AccessDoorDataSource accessDoorDataSource) {
        this.doorDataSource = accessDoorDataSource;
    }

    public final void getDoorImageUrl(@NotNull String key) throws Exception {
        publisherToResource("getAccessDoorImageUrl", this.doorDataSource.getDoorImageUrl(key), new a());
    }

    @NotNull
    public final MutableLiveData<Resource<String>> getDoorResUrlLiveData() {
        return this.doorResUrlLiveData;
    }

    @NotNull
    public final MutableLiveData<Resource<ProtocolEntity>> getGetProtocolEntityLiveData() {
        return this.getProtocolEntityLiveData;
    }

    @NotNull
    public final MutableLiveData<Resource<String>> getUserAgreementProtocolLiveData() {
        return this.userAgreementProtocolLiveData;
    }

    public final void getUserProtocol(@NotNull String actionType) throws Exception {
        publisherToResource("getUserProtocol", this.doorDataSource.getProtocol(actionType), new b());
    }

    public final void setGetProtocolEntityLiveData(@NotNull MutableLiveData<Resource<ProtocolEntity>> mutableLiveData) {
        this.getProtocolEntityLiveData = mutableLiveData;
    }

    public final void setUserAgreementProtocolLiveData(@NotNull MutableLiveData<Resource<String>> mutableLiveData) {
        this.userAgreementProtocolLiveData = mutableLiveData;
    }

    public final void userAgreementProtocol(@Nullable Long id) throws Exception {
        publisherToResource("userAgreementProtocol", this.doorDataSource.agreeProtocol(id), new c());
    }
}
