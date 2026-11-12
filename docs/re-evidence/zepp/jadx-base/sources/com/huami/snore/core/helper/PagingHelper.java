package com.huami.snore.core.helper;

import androidx.p008lifecycle.LiveData;
import androidx.paging.DataSource;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PagedList;
import com.facebook.appevents.UserDataStore;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.snore.core.db.VoiceRecorderDB;
import com.huami.snore.core.vo.VoiceListingModel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u0018\u0010\u0019J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\"\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R@\u0010\u0017\u001a,\u0012(\u0012&\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00130\u00130\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/huami/snore/core/helper/PagingHelper;", "Vo", "", "Lcom/huami/snore/core/vo/VoiceListingModel;", "getVoiceListing", "Lcom/huami/snore/core/db/VoiceRecorderDB;", "a", "Lcom/huami/snore/core/db/VoiceRecorderDB;", UserDataStore.DATE_OF_BIRTH, "Landroidx/paging/DataSource$Factory;", "", "b", "Landroidx/paging/DataSource$Factory;", "pagingDbSource", "Landroidx/paging/PagedList$Config;", "c", "Landroidx/paging/PagedList$Config;", "pagedListConfig", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "kotlin.jvm.PlatformType", GoogleApiAvailabilityLight.a, "Landroidx/lifecycle/LiveData;", "livePagedList", "<init>", "(Lcom/huami/snore/core/db/VoiceRecorderDB;Landroidx/paging/DataSource$Factory;)V", "snore_release"}, k = 1, mv = {1, 5, 1})
public final class PagingHelper<Vo> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final VoiceRecorderDB db;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final DataSource.Factory<Integer, Vo> pagingDbSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final PagedList.Config pagedListConfig;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final LiveData<PagedList<Vo>> livePagedList;

    public PagingHelper(@NotNull VoiceRecorderDB voiceRecorderDB, @NotNull DataSource.Factory<Integer, Vo> factory) {
        this.db = voiceRecorderDB;
        this.pagingDbSource = factory;
        PagedList.Config configBuild = new PagedList.Config.Builder().setEnablePlaceholders(true).setPageSize(20).setInitialLoadSizeHint(20).setPrefetchDistance(0).build();
        this.pagedListConfig = configBuild;
        this.livePagedList = new LivePagedListBuilder(factory, configBuild).build();
    }

    @NotNull
    public final VoiceListingModel<Vo> getVoiceListing() {
        return new VoiceListingModel<>(this.livePagedList);
    }
}
