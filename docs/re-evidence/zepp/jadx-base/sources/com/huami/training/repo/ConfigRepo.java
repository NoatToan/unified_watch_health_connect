package com.huami.training.repo;

import androidx.p008lifecycle.LiveData;
import com.facebook.appevents.UserDataStore;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import com.huami.training.api.TrainingWebApi;
import com.huami.training.api.pojo.BackgroundImageBean;
import com.huami.training.api.pojo.EntranceKingBean;
import com.huami.training.api.pojo.FilterModeBean;
import com.huami.training.api.pojo.GenderStringPair;
import com.huami.training.api.pojo.TagBean;
import com.huami.training.api.pojo.TrainingConfig;
import com.huami.training.converter.WebBeanToPoExKt;
import com.huami.training.db.TrainingDb;
import com.huami.training.db.dao.EntranceDao;
import com.huami.training.db.dao.FilterDao;
import com.huami.training.dto.App;
import com.huami.training.helper.AppExecutors;
import com.huami.training.repo.ConfigRepo;
import com.huami.training.util.ConfigManager;
import com.huami.training.vo.ApiEmptyResponse;
import com.huami.training.vo.ApiErrorResponse;
import com.huami.training.vo.ApiResponse;
import com.huami.training.vo.ApiSuccessResponse;
import com.huami.training.vo.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B/\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b \u0010!J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\u0006J\u001e\u0010\u000b\u001a\u00020\u00042\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\tR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/huami/training/repo/ConfigRepo;", "", "", "should", "", "setShouldFetchConfigs", "Landroidx/lifecycle/LiveData;", "Lcom/huami/training/vo/Resource;", "loadConfigurationsOnActive", "Lkotlin/Function1;", "finishCallback", "loadConfigurations", "Lcom/huami/training/dto/App;", "a", "Lcom/huami/training/dto/App;", "app", "Lcom/huami/training/helper/AppExecutors;", "b", "Lcom/huami/training/helper/AppExecutors;", "appExecutors", "Lcom/huami/training/db/TrainingDb;", "c", "Lcom/huami/training/db/TrainingDb;", UserDataStore.DATE_OF_BIRTH, "Lcom/huami/training/api/TrainingWebApi;", GoogleApiAvailabilityLight.a, "Lcom/huami/training/api/TrainingWebApi;", "webApi", "Lcom/huami/training/util/ConfigManager;", "e", "Lcom/huami/training/util/ConfigManager;", "configManager", "<init>", "(Lcom/huami/training/dto/App;Lcom/huami/training/helper/AppExecutors;Lcom/huami/training/db/TrainingDb;Lcom/huami/training/api/TrainingWebApi;Lcom/huami/training/util/ConfigManager;)V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class ConfigRepo {

    @NotNull
    private static final String f = "Train-ConfigRepo";
    private static final int g = 10;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final App app;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final AppExecutors appExecutors;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final TrainingDb db;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final TrainingWebApi webApi;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final ConfigManager configManager;

    public ConfigRepo(@NotNull App app, @NotNull AppExecutors appExecutors, @NotNull TrainingDb trainingDb, @NotNull TrainingWebApi trainingWebApi, @NotNull ConfigManager configManager) {
        this.app = app;
        this.appExecutors = appExecutors;
        this.db = trainingDb;
        this.webApi = trainingWebApi;
        this.configManager = configManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final ConfigRepo configRepo, Function1 function1) {
        ApiResponse<TrainingConfig> apiResponseLoadConfigurations = configRepo.webApi.loadConfigurations(configRepo.app);
        if (apiResponseLoadConfigurations instanceof ApiSuccessResponse) {
            final TrainingConfig trainingConfig = (TrainingConfig) ((ApiSuccessResponse) apiResponseLoadConfigurations).getBody();
            configRepo.appExecutors.getDiskIO();
            configRepo.db.runInTransaction(new Runnable() { // from class: py0
                @Override // java.lang.Runnable
                public final void run() {
                    ConfigRepo.d(this.a, trainingConfig);
                }
            });
            configRepo.configManager.setShouldFetchConfigs(false);
            if (function1 == null) {
                return;
            }
            function1.invoke(Boolean.TRUE);
            return;
        }
        if (apiResponseLoadConfigurations instanceof ApiEmptyResponse) {
            HMLog.d(f, "请求训练配置信息为空", new Object[0]);
            if (function1 == null) {
                return;
            }
            function1.invoke(Boolean.FALSE);
            return;
        }
        if (apiResponseLoadConfigurations instanceof ApiErrorResponse) {
            HMLog.w(f, Intrinsics.stringPlus("请求训练配置信息发生错误. ", ((ApiErrorResponse) apiResponseLoadConfigurations).getErrorMessage()), new Object[0]);
            if (function1 == null) {
                return;
            }
            function1.invoke(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(ConfigRepo configRepo, TrainingConfig trainingConfig) {
        GenderStringPair backgroundImage;
        GenderStringPair backgroundImage2;
        EntranceDao entranceDao = configRepo.db.entranceDao();
        entranceDao.clearKingList();
        List<EntranceKingBean> icons = trainingConfig.getIcons();
        if (icons != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(icons, 10));
            Iterator<T> it2 = icons.iterator();
            while (it2.hasNext()) {
                arrayList.add(WebBeanToPoExKt.toEntranceKingPo((EntranceKingBean) it2.next()));
            }
            entranceDao.insertKingList(arrayList);
        }
        EntranceDao entranceDao2 = configRepo.db.entranceDao();
        entranceDao2.clearTodayTag();
        List<TagBean> tags = trainingConfig.getTags();
        if (tags != null) {
            List listTake = CollectionsKt___CollectionsKt.take(tags, 10);
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listTake, 10));
            Iterator it3 = listTake.iterator();
            while (it3.hasNext()) {
                arrayList2.add(WebBeanToPoExKt.toTodayTagPo((TagBean) it3.next()));
            }
            entranceDao2.insertTodayTag(arrayList2);
        }
        FilterDao filterDao = configRepo.db.filterDao();
        filterDao.clearFilterModes();
        List<FilterModeBean> filterModes = trainingConfig.getFilterModes();
        if (filterModes != null) {
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(filterModes, 10));
            Iterator<T> it4 = filterModes.iterator();
            while (it4.hasNext()) {
                arrayList3.add(WebBeanToPoExKt.toFilterModePo((FilterModeBean) it4.next()));
            }
            filterDao.insertFilterMode(arrayList3);
        }
        BackgroundImageBean planBgInFit = trainingConfig.getPlanBgInFit();
        if (planBgInFit != null && (backgroundImage2 = planBgInFit.getBackgroundImage()) != null) {
            configRepo.configManager.setPlanBackgroundImageInFitnessPage(backgroundImage2.getCom.xiaomi.hm.health.HMIntentHandler.NAME_FEMALE java.lang.String(), backgroundImage2.getMale());
        }
        BackgroundImageBean planBgInCourse = trainingConfig.getPlanBgInCourse();
        if (planBgInCourse == null || (backgroundImage = planBgInCourse.getBackgroundImage()) == null) {
            return;
        }
        configRepo.configManager.setPlanBackgroundImageInCoursePage(backgroundImage.getCom.xiaomi.hm.health.HMIntentHandler.NAME_FEMALE java.lang.String(), backgroundImage.getMale());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadConfigurations$default(ConfigRepo configRepo, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        configRepo.loadConfigurations(function1);
    }

    public final void loadConfigurations(@Nullable final Function1<? super Boolean, Unit> finishCallback) {
        if (this.configManager.shouldFetchConfigs()) {
            this.appExecutors.getNetworkIO().execute(new Runnable() { // from class: qy0
                @Override // java.lang.Runnable
                public final void run() {
                    ConfigRepo.c(this.a, finishCallback);
                }
            });
        }
    }

    @NotNull
    public final LiveData<Resource<Unit>> loadConfigurationsOnActive() {
        return new LiveData<Resource<? extends Unit>>() { // from class: com.huami.training.repo.ConfigRepo.loadConfigurationsOnActive.1

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private final AtomicBoolean started = new AtomicBoolean(false);

            /* JADX INFO: renamed from: com.huami.training.repo.ConfigRepo$loadConfigurationsOnActive$1$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function1<Boolean, Unit> {
                public a() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z) {
                    postValue(z ? Resource.Companion.success$default(Resource.INSTANCE, null, 1, null) : Resource.Companion.error$default(Resource.INSTANCE, null, null, 3, null));
                }
            }

            @Override // androidx.p008lifecycle.LiveData
            public void onActive() {
                if (this.started.compareAndSet(false, true)) {
                    postValue(Resource.Companion.loading$default(Resource.INSTANCE, null, 1, null));
                    ConfigRepo.this.loadConfigurations(new a());
                }
            }
        };
    }

    public final void setShouldFetchConfigs(boolean should) {
        this.configManager.setShouldFetchConfigs(should);
    }
}
