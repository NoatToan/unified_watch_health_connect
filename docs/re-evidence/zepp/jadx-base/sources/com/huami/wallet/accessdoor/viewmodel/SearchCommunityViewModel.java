package com.huami.wallet.accessdoor.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import com.huami.nfc.door.entity.CommunityNameEntity;
import com.huami.wallet.accessdoor.api.service.AccessDoorDataSource;
import com.huami.wallet.accessdoor.helper.Resource;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR4\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f0\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/huami/wallet/accessdoor/viewmodel/SearchCommunityViewModel;", "Lcom/huami/wallet/accessdoor/viewmodel/BaseViewModel;", "", "type", "name", "", "getSupportCommunity", "Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;", "b", "Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;", "doorDataSource", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/wallet/accessdoor/helper/Resource;", "", "Lcom/huami/nfc/door/entity/CommunityNameEntity;", "c", "Landroidx/lifecycle/MutableLiveData;", "getSearchCommunityLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setSearchCommunityLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "searchCommunityLiveData", "<init>", "(Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;)V", "access-door_release"}, k = 1, mv = {1, 5, 1})
public final class SearchCommunityViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final AccessDoorDataSource doorDataSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Resource<List<CommunityNameEntity>>> searchCommunityLiveData = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "", "Lcom/huami/nfc/door/entity/CommunityNameEntity;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Resource<List<CommunityNameEntity>>, Unit> {
        public a() {
            super(1);
        }

        public final void a(@NotNull Resource<List<CommunityNameEntity>> resource) {
            SearchCommunityViewModel.this.getSearchCommunityLiveData().setValue(resource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<List<CommunityNameEntity>> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    public SearchCommunityViewModel(@NotNull AccessDoorDataSource accessDoorDataSource) {
        this.doorDataSource = accessDoorDataSource;
    }

    @NotNull
    public final MutableLiveData<Resource<List<CommunityNameEntity>>> getSearchCommunityLiveData() {
        return this.searchCommunityLiveData;
    }

    public final void getSupportCommunity(@NotNull String type, @NotNull String name) throws Exception {
        publisherToResource("getSupportCommunity", this.doorDataSource.getSupportCommunity(type, name), new a());
    }

    public final void setSearchCommunityLiveData(@NotNull MutableLiveData<Resource<List<CommunityNameEntity>>> mutableLiveData) {
        this.searchCommunityLiveData = mutableLiveData;
    }
}
