package com.huami.training.ui.search;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.passport.Configs;
import com.huami.training.helper.AbsentLiveData;
import com.huami.training.repo.SearchRepo;
import com.huami.training.ui.search.SearchViewModel;
import com.huami.training.vo.Resource;
import com.huami.training.vo.SearchInfo;
import com.huami.training.vo.Status;
import com.huami.training.vo.TagVo;
import com.huami.training.vo.TrainingVo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002&'B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R+\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00150\u00148\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR+\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00160\u00150\u00148\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u0019\u0010#\u001a\b\u0012\u0004\u0012\u00020!0\u00148F@\u0006¢\u0006\u0006\u001a\u0004\b\"\u0010\u001b¨\u0006("}, d2 = {"Lcom/huami/training/ui/search/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huami/training/vo/SearchInfo;", "newSearchInfo", "", "setQuery", "retry", "loadNextPage", "Lcom/huami/training/repo/SearchRepo;", "a", "Lcom/huami/training/repo/SearchRepo;", "searchRepo", "Landroidx/lifecycle/MutableLiveData;", "b", "Landroidx/lifecycle/MutableLiveData;", "searchInfo", "Lcom/huami/training/ui/search/SearchViewModel$NextPageHandler;", "c", "Lcom/huami/training/ui/search/SearchViewModel$NextPageHandler;", "nextPageHandler", "Landroidx/lifecycle/LiveData;", "Lcom/huami/training/vo/Resource;", "", "Lcom/huami/training/vo/TagVo;", GoogleApiAvailabilityLight.a, "Landroidx/lifecycle/LiveData;", "getHotSearchResults", "()Landroidx/lifecycle/LiveData;", "hotSearchResults", "Lcom/huami/training/vo/TrainingVo;", "e", "getSearchResults", "searchResults", "Lcom/huami/training/ui/search/SearchViewModel$LoadMoreState;", "getLoadMoreStatus", "loadMoreStatus", "<init>", "(Lcom/huami/training/repo/SearchRepo;)V", "LoadMoreState", "NextPageHandler", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class SearchViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SearchRepo searchRepo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<SearchInfo> searchInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final NextPageHandler nextPageHandler;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Resource<List<TagVo>>> hotSearchResults;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Resource<List<TrainingVo>>> searchResults;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u00078F@\u0006¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/huami/training/ui/search/SearchViewModel$LoadMoreState;", "", "", "a", "Z", "isRunning", "()Z", "", "b", "Ljava/lang/String;", "getErrorMessage", "()Ljava/lang/String;", "errorMessage", "c", "handledError", "getErrorMessageIfNotHandled", "errorMessageIfNotHandled", "<init>", "(ZLjava/lang/String;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class LoadMoreState {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isRunning;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private final String errorMessage;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private boolean handledError;

        public LoadMoreState(boolean z, @Nullable String str) {
            this.isRunning = z;
            this.errorMessage = str;
        }

        @Nullable
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        @Nullable
        public final String getErrorMessageIfNotHandled() {
            if (this.handledError) {
                return null;
            }
            this.handledError = true;
            return this.errorMessage;
        }

        /* JADX INFO: renamed from: isRunning, reason: from getter */
        public final boolean getIsRunning() {
            return this.isRunning;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b#\u0010$J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\u0018\u0010\u000b\u001a\u00020\u00042\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\u0006\u0010\f\u001a\u00020\u0004R\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR$\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0013\u0010\"\u001a\u00020\u00038F@\u0006¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/huami/training/ui/search/SearchViewModel$NextPageHandler;", "Landroidx/lifecycle/Observer;", "Lcom/huami/training/vo/Resource;", "", "", "a", "", "query", "mode", "queryNextPage", "result", "onChanged", Configs.Params.RESET, "Lcom/huami/training/repo/SearchRepo;", "Lcom/huami/training/repo/SearchRepo;", CommonLanguageSettingFragment.KEY_REPO, "Landroidx/lifecycle/LiveData;", "b", "Landroidx/lifecycle/LiveData;", "nextPageLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/training/ui/search/SearchViewModel$LoadMoreState;", "c", "Landroidx/lifecycle/MutableLiveData;", "getLoadMoreState", "()Landroidx/lifecycle/MutableLiveData;", "loadMoreState", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "e", "Z", "_hasMore", "getHasMore", "()Z", "hasMore", "<init>", "(Lcom/huami/training/repo/SearchRepo;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class NextPageHandler implements Observer<Resource<? extends Boolean>> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final SearchRepo repo;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private LiveData<Resource<Boolean>> nextPageLiveData;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final MutableLiveData<LoadMoreState> loadMoreState = new MutableLiveData<>();

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        private String query;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private boolean _hasMore;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Status.values().length];
                iArr[Status.SUCCESS.ordinal()] = 1;
                iArr[Status.ERROR.ordinal()] = 2;
                iArr[Status.LOADING.ordinal()] = 3;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public NextPageHandler(@NotNull SearchRepo searchRepo) {
            this.repo = searchRepo;
            reset();
        }

        private final void a() {
            LiveData<Resource<Boolean>> liveData = this.nextPageLiveData;
            if (liveData != null) {
                liveData.removeObserver(this);
            }
            this.nextPageLiveData = null;
            if (this._hasMore) {
                this.query = null;
            }
        }

        /* JADX INFO: renamed from: getHasMore, reason: from getter */
        public final boolean get_hasMore() {
            return this._hasMore;
        }

        @NotNull
        public final MutableLiveData<LoadMoreState> getLoadMoreState() {
            return this.loadMoreState;
        }

        @Override // androidx.p008lifecycle.Observer
        public /* bridge */ /* synthetic */ void onChanged(Resource<? extends Boolean> resource) {
            onChanged2((Resource<Boolean>) resource);
        }

        public final void queryNextPage(@NotNull String query, @NotNull String mode) {
            if (Intrinsics.areEqual(this.query, query)) {
                return;
            }
            a();
            this.query = query;
            this.nextPageLiveData = this.repo.searchNextPage(query, mode);
            this.loadMoreState.setValue(new LoadMoreState(true, null));
            LiveData<Resource<Boolean>> liveData = this.nextPageLiveData;
            if (liveData == null) {
                return;
            }
            liveData.observeForever(this);
        }

        public final void reset() {
            a();
            this._hasMore = true;
            this.loadMoreState.setValue(new LoadMoreState(false, null));
        }

        /* JADX INFO: renamed from: onChanged, reason: avoid collision after fix types in other method */
        public void onChanged2(@Nullable Resource<Boolean> result) {
            if (result == null) {
                reset();
                return;
            }
            int i = WhenMappings.$EnumSwitchMapping$0[result.getStatus().ordinal()];
            if (i == 1) {
                this._hasMore = Intrinsics.areEqual(result.getData(), Boolean.TRUE);
                a();
                this.loadMoreState.setValue(new LoadMoreState(false, null));
            } else {
                if (i != 2) {
                    return;
                }
                this._hasMore = true;
                a();
                this.loadMoreState.setValue(new LoadMoreState(false, result.getMessage()));
            }
        }
    }

    public SearchViewModel(@NotNull SearchRepo searchRepo) {
        this.searchRepo = searchRepo;
        MutableLiveData<SearchInfo> mutableLiveData = new MutableLiveData<>();
        this.searchInfo = mutableLiveData;
        this.nextPageHandler = new NextPageHandler(searchRepo);
        this.hotSearchResults = searchRepo.loadHotSearchResults();
        this.searchResults = Transformations.switchMap(mutableLiveData, new Function() { // from class: gl6
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return SearchViewModel.b(this.a, (SearchInfo) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData b(SearchViewModel searchViewModel, SearchInfo searchInfo) {
        return (searchInfo == null || m.isBlank(searchInfo.getQuery())) ? AbsentLiveData.INSTANCE.create() : searchViewModel.searchRepo.search(searchInfo.getQuery(), searchInfo.getMode());
    }

    @NotNull
    public final LiveData<Resource<List<TagVo>>> getHotSearchResults() {
        return this.hotSearchResults;
    }

    @NotNull
    public final LiveData<LoadMoreState> getLoadMoreStatus() {
        return this.nextPageHandler.getLoadMoreState();
    }

    @NotNull
    public final LiveData<Resource<List<TrainingVo>>> getSearchResults() {
        return this.searchResults;
    }

    public final void loadNextPage() {
        SearchInfo value = this.searchInfo.getValue();
        if (value != null && (!m.isBlank(value.getQuery()))) {
            this.nextPageHandler.queryNextPage(value.getQuery(), value.getMode());
        }
    }

    public final void retry() {
        SearchInfo value = this.searchInfo.getValue();
        if (value == null) {
            value = null;
        }
        this.searchInfo.setValue(null);
        setQuery(value);
    }

    public final void setQuery(@Nullable SearchInfo newSearchInfo) {
        if (Intrinsics.areEqual(newSearchInfo, this.searchInfo.getValue())) {
            return;
        }
        this.nextPageHandler.reset();
        this.searchInfo.setValue(newSearchInfo);
    }
}
