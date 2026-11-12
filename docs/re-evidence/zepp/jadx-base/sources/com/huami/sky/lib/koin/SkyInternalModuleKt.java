package com.huami.sky.lib.koin;

import android.content.Context;
import com.huami.account.service.AccountService;
import com.huami.account.service.AreaService;
import com.huami.sky.lib.api.DeviceDataApi;
import com.huami.sky.lib.api.RecommendMusicApi;
import com.huami.sky.lib.api.RecommendMusicApiImpl;
import com.huami.sky.lib.api.RelaxDataApi;
import com.huami.sky.lib.api.RelaxDataApiImpl;
import com.huami.sky.lib.api.RelaxDataServiceImpl;
import com.huami.sky.lib.api.SkyAppSettingApi;
import com.huami.sky.lib.api.SkyAppSettingApiImpl;
import com.huami.sky.lib.api.SkyCardServiceImpl;
import com.huami.sky.lib.api.SkyPromotionApi;
import com.huami.sky.lib.api.SkyPromotionApiImpl;
import com.huami.sky.lib.api.UploadUserDataApi;
import com.huami.sky.lib.api.UploadUserDataApiImpl;
import com.huami.sky.lib.api.preference.MusicPreferenceApi;
import com.huami.sky.lib.api.preference.MusicPreferenceApiImpl;
import com.huami.sky.lib.repo.DeviceDataRepository;
import com.huami.sky.lib.repo.DeviceDataRepositoryImpl;
import com.huami.sky.lib.repo.SkyAppSettingRepo;
import com.huami.sky.lib.repo.SkyAppSettingRepoImpl;
import com.huami.sky.lib.repo.SkyPromotionRepo;
import com.huami.sky.lib.repo.SkyPromotionRepoImpl;
import com.huami.sky.lib.repo.SkyRepository;
import com.huami.sky.lib.repo.SkyRepositoryImpl;
import com.huami.sky.lib.repo.intro.EditQuestionnaireRepoImpl;
import com.huami.sky.lib.repo.intro.IQuestionnaireRepo;
import com.huami.sky.lib.repo.intro.QuestionnaireRepoImpl;
import com.huami.sky.lib.repo.intro.SelectedMusicPrefsRepo;
import com.huami.sky.lib.repo.intro.SelectedMusicPrefsRepoImpl;
import com.huami.sky.lib.repo.reminder.ISleepReminderRepo;
import com.huami.sky.lib.repo.reminder.SleepReminderRepoImpl;
import com.huami.sky.lib.repo.settings.IPlaySettingRepo;
import com.huami.sky.lib.repo.settings.PlaySettingRepoImp;
import com.huami.sky.lib.repo.weekplan.IWeekPlanHintRepo;
import com.huami.sky.lib.repo.weekplan.IWeekPlanRepo;
import com.huami.sky.lib.repo.weekplan.WeekPlanHintRepoImpl;
import com.huami.sky.lib.repo.weekplan.WeekPlanRepoImpl;
import com.huami.sky.lib.room.MusicInfoDao;
import com.huami.sky.lib.room.MusicTagDao;
import com.huami.sky.lib.room.RelaxScoreDao;
import com.huami.sky.lib.room.SkyDatabase;
import com.huami.sky.lib.usecase.GetMusicPreferenceInfoUseCase;
import com.huami.sky.lib.usecase.GetRelaxScoreUseCase;
import com.huami.sky.lib.usecase.GetReminderDetailUseCase;
import com.huami.sky.lib.usecase.RecommendMusicUseCase;
import com.huami.sky.lib.usecase.SetReminderOpenUseCase;
import com.huami.sky.lib.usecase.SyncRelaxScoreFromServerUseCase;
import com.huami.sky.lib.utils.SkyApiWrapperKt;
import com.huami.sky.service.RelaxDataService;
import com.huami.sky.service.SkyCardService;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleKt;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0019\u0010\u0005\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getSkyInternalModule", "()Lorg/koin/core/module/Module;", "skyInternalModule", "sky-lib_release"}, k = 2, mv = {1, 5, 1})
public final class SkyInternalModuleKt {

    @NotNull
    private static final Module a = ModuleKt.module$default(false, a.a, 1, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Module, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.huami.sky.lib.koin.SkyInternalModuleKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/lib/repo/settings/IPlaySettingRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0553a extends Lambda implements Function2<Scope, ParametersHolder, IPlaySettingRepo> {
            public static final C0553a a = new C0553a();

            public C0553a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IPlaySettingRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new PlaySettingRepoImp();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/lib/repo/DeviceDataRepository;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a0 extends Lambda implements Function2<Scope, ParametersHolder, DeviceDataRepository> {
            public static final a0 a = new a0();

            public a0() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DeviceDataRepository invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new DeviceDataRepositoryImpl((DeviceDataApi) scope.get(Reflection.getOrCreateKotlinClass(DeviceDataApi.class), null, null), (UploadUserDataApi) scope.get(Reflection.getOrCreateKotlinClass(UploadUserDataApi.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/lib/api/RelaxDataApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, RelaxDataApi> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final RelaxDataApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new RelaxDataApiImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/lib/usecase/RecommendMusicUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b0 extends Lambda implements Function2<Scope, ParametersHolder, RecommendMusicUseCase> {
            public static final b0 a = new b0();

            public b0() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final RecommendMusicUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new RecommendMusicUseCase((SkyRepository) scope.get(Reflection.getOrCreateKotlinClass(SkyRepository.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/service/RelaxDataService;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, RelaxDataService> {
            public static final c a = new c();

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final RelaxDataService invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new RelaxDataServiceImpl((AccountService) scope.get(Reflection.getOrCreateKotlinClass(AccountService.class), null, null), (RelaxDataApi) scope.get(Reflection.getOrCreateKotlinClass(RelaxDataApi.class), null, null), (MusicTagDao) scope.get(Reflection.getOrCreateKotlinClass(MusicTagDao.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/service/SkyCardService;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function2<Scope, ParametersHolder, SkyCardService> {
            public static final d a = new d();

            public d() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SkyCardService invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SkyCardServiceImpl((AreaService) scope.get(Reflection.getOrCreateKotlinClass(AreaService.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/lib/api/preference/MusicPreferenceApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function2<Scope, ParametersHolder, MusicPreferenceApi> {
            public static final e a = new e();

            public e() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final MusicPreferenceApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new MusicPreferenceApiImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "<name for destructuring parameter 0>", "Lcom/huami/sky/lib/repo/intro/IQuestionnaireRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class f extends Lambda implements Function2<Scope, ParametersHolder, IQuestionnaireRepo> {
            public static final f a = new f();

            public f() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IQuestionnaireRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return ((Boolean) parametersHolder.elementAt(0, Reflection.getOrCreateKotlinClass(Boolean.class))).booleanValue() ? new EditQuestionnaireRepoImpl((MusicPreferenceApi) scope.get(Reflection.getOrCreateKotlinClass(MusicPreferenceApi.class), null, null), (SelectedMusicPrefsRepo) scope.get(Reflection.getOrCreateKotlinClass(SelectedMusicPrefsRepo.class), null, null)) : new QuestionnaireRepoImpl((MusicPreferenceApi) scope.get(Reflection.getOrCreateKotlinClass(MusicPreferenceApi.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/lib/usecase/SyncRelaxScoreFromServerUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class g extends Lambda implements Function2<Scope, ParametersHolder, SyncRelaxScoreFromServerUseCase> {
            public static final g a = new g();

            public g() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SyncRelaxScoreFromServerUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SyncRelaxScoreFromServerUseCase((SkyRepository) scope.get(Reflection.getOrCreateKotlinClass(SkyRepository.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/lib/usecase/GetRelaxScoreUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class h extends Lambda implements Function2<Scope, ParametersHolder, GetRelaxScoreUseCase> {
            public static final h a = new h();

            public h() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GetRelaxScoreUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new GetRelaxScoreUseCase((SkyRepository) scope.get(Reflection.getOrCreateKotlinClass(SkyRepository.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/lib/repo/reminder/ISleepReminderRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class i extends Lambda implements Function2<Scope, ParametersHolder, ISleepReminderRepo> {
            public static final i a = new i();

            public i() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ISleepReminderRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SleepReminderRepoImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/lib/repo/intro/SelectedMusicPrefsRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class j extends Lambda implements Function2<Scope, ParametersHolder, SelectedMusicPrefsRepo> {
            public static final j a = new j();

            public j() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SelectedMusicPrefsRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SelectedMusicPrefsRepoImpl((MusicPreferenceApi) scope.get(Reflection.getOrCreateKotlinClass(MusicPreferenceApi.class), null, null), (AccountService) scope.get(Reflection.getOrCreateKotlinClass(AccountService.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/lib/api/RecommendMusicApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class k extends Lambda implements Function2<Scope, ParametersHolder, RecommendMusicApi> {
            public static final k a = new k();

            public k() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final RecommendMusicApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return (RecommendMusicApi) SkyApiWrapperKt.wrapperApiLog(new RecommendMusicApiImpl());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/lib/usecase/GetMusicPreferenceInfoUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class l extends Lambda implements Function2<Scope, ParametersHolder, GetMusicPreferenceInfoUseCase> {
            public static final l a = new l();

            public l() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GetMusicPreferenceInfoUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new GetMusicPreferenceInfoUseCase((SelectedMusicPrefsRepo) scope.get(Reflection.getOrCreateKotlinClass(SelectedMusicPrefsRepo.class), null, null), null, 2, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/lib/usecase/GetReminderDetailUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class m extends Lambda implements Function2<Scope, ParametersHolder, GetReminderDetailUseCase> {
            public static final m a = new m();

            public m() {
                super(2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GetReminderDetailUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new GetReminderDetailUseCase((ISleepReminderRepo) scope.get(Reflection.getOrCreateKotlinClass(ISleepReminderRepo.class), null, null), null, 2, 0 == true ? 1 : 0);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/lib/usecase/SetReminderOpenUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class n extends Lambda implements Function2<Scope, ParametersHolder, SetReminderOpenUseCase> {
            public static final n a = new n();

            public n() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SetReminderOpenUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SetReminderOpenUseCase((ISleepReminderRepo) scope.get(Reflection.getOrCreateKotlinClass(ISleepReminderRepo.class), null, null), null, 2, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/lib/api/SkyPromotionApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class o extends Lambda implements Function2<Scope, ParametersHolder, SkyPromotionApi> {
            public static final o a = new o();

            public o() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SkyPromotionApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SkyPromotionApiImpl((AccountService) scope.get(Reflection.getOrCreateKotlinClass(AccountService.class), null, null), (AreaService) scope.get(Reflection.getOrCreateKotlinClass(AreaService.class), null, null), (DeviceDataApi) scope.get(Reflection.getOrCreateKotlinClass(DeviceDataApi.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/lib/repo/SkyPromotionRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class p extends Lambda implements Function2<Scope, ParametersHolder, SkyPromotionRepo> {
            public static final p a = new p();

            public p() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SkyPromotionRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SkyPromotionRepoImpl((SkyPromotionApi) scope.get(Reflection.getOrCreateKotlinClass(SkyPromotionApi.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/lib/api/SkyAppSettingApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class q extends Lambda implements Function2<Scope, ParametersHolder, SkyAppSettingApi> {
            public static final q a = new q();

            public q() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SkyAppSettingApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SkyAppSettingApiImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/lib/repo/SkyAppSettingRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class r extends Lambda implements Function2<Scope, ParametersHolder, SkyAppSettingRepo> {
            public static final r a = new r();

            public r() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SkyAppSettingRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SkyAppSettingRepoImpl((SkyAppSettingApi) scope.get(Reflection.getOrCreateKotlinClass(SkyAppSettingApi.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/lib/repo/weekplan/IWeekPlanRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class s extends Lambda implements Function2<Scope, ParametersHolder, IWeekPlanRepo> {
            public static final s a = new s();

            public s() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IWeekPlanRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new WeekPlanRepoImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/lib/repo/weekplan/IWeekPlanHintRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class t extends Lambda implements Function2<Scope, ParametersHolder, IWeekPlanHintRepo> {
            public static final t a = new t();

            public t() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IWeekPlanHintRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new WeekPlanHintRepoImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/lib/api/UploadUserDataApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class u extends Lambda implements Function2<Scope, ParametersHolder, UploadUserDataApi> {
            public static final u a = new u();

            public u() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UploadUserDataApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return (UploadUserDataApi) SkyApiWrapperKt.wrapperApiLog(new UploadUserDataApiImpl());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/lib/room/SkyDatabase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class v extends Lambda implements Function2<Scope, ParametersHolder, SkyDatabase> {
            public static final v a = new v();

            public v() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SkyDatabase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return SkyDatabase.INSTANCE.createDb((Context) scope.get(Reflection.getOrCreateKotlinClass(Context.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/lib/room/RelaxScoreDao;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class w extends Lambda implements Function2<Scope, ParametersHolder, RelaxScoreDao> {
            public static final w a = new w();

            public w() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final RelaxScoreDao invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return ((SkyDatabase) scope.get(Reflection.getOrCreateKotlinClass(SkyDatabase.class), null, null)).getRelaxScoreDao();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/lib/room/MusicTagDao;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class x extends Lambda implements Function2<Scope, ParametersHolder, MusicTagDao> {
            public static final x a = new x();

            public x() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final MusicTagDao invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return ((SkyDatabase) scope.get(Reflection.getOrCreateKotlinClass(SkyDatabase.class), null, null)).getMusicTagDao();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/lib/room/MusicInfoDao;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class y extends Lambda implements Function2<Scope, ParametersHolder, MusicInfoDao> {
            public static final y a = new y();

            public y() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final MusicInfoDao invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return ((SkyDatabase) scope.get(Reflection.getOrCreateKotlinClass(SkyDatabase.class), null, null)).getMusicInfoDao();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/lib/repo/SkyRepository;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class z extends Lambda implements Function2<Scope, ParametersHolder, SkyRepository> {
            public static final z a = new z();

            public z() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SkyRepository invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SkyRepositoryImpl((AccountService) scope.get(Reflection.getOrCreateKotlinClass(AccountService.class), null, null), (RecommendMusicApi) scope.get(Reflection.getOrCreateKotlinClass(RecommendMusicApi.class), null, null), (RelaxDataApi) scope.get(Reflection.getOrCreateKotlinClass(RelaxDataApi.class), null, null), (RelaxScoreDao) scope.get(Reflection.getOrCreateKotlinClass(RelaxScoreDao.class), null, null), (MusicInfoDao) scope.get(Reflection.getOrCreateKotlinClass(MusicInfoDao.class), null, null));
            }
        }

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Module module) {
            invoke2(module);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Module module) {
            k kVar = k.a;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Factory;
            BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(RecommendMusicApi.class), null, kVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, rootScopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
            u uVar = u.a;
            StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition2 = new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(UploadUserDataApi.class), null, uVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, rootScopeQualifier2);
            FactoryInstanceFactory factoryInstanceFactory2 = new FactoryInstanceFactory(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, factoryInstanceFactory2, false, 4, null);
            new Pair(module, factoryInstanceFactory2);
            v vVar = v.a;
            Kind kind2 = Kind.Singleton;
            BeanDefinition beanDefinition3 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SkyDatabase.class), null, vVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition3);
            Module.saveMapping$default(module, strIndexKey3, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
            w wVar = w.a;
            StringQualifier rootScopeQualifier3 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition4 = new BeanDefinition(rootScopeQualifier3, Reflection.getOrCreateKotlinClass(RelaxScoreDao.class), null, wVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, rootScopeQualifier3);
            FactoryInstanceFactory factoryInstanceFactory3 = new FactoryInstanceFactory(beanDefinition4);
            Module.saveMapping$default(module, strIndexKey4, factoryInstanceFactory3, false, 4, null);
            new Pair(module, factoryInstanceFactory3);
            x xVar = x.a;
            StringQualifier rootScopeQualifier4 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition5 = new BeanDefinition(rootScopeQualifier4, Reflection.getOrCreateKotlinClass(MusicTagDao.class), null, xVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, rootScopeQualifier4);
            FactoryInstanceFactory factoryInstanceFactory4 = new FactoryInstanceFactory(beanDefinition5);
            Module.saveMapping$default(module, strIndexKey5, factoryInstanceFactory4, false, 4, null);
            new Pair(module, factoryInstanceFactory4);
            y yVar = y.a;
            StringQualifier rootScopeQualifier5 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition6 = new BeanDefinition(rootScopeQualifier5, Reflection.getOrCreateKotlinClass(MusicInfoDao.class), null, yVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey6 = BeanDefinitionKt.indexKey(beanDefinition6.getPrimaryType(), null, rootScopeQualifier5);
            FactoryInstanceFactory factoryInstanceFactory5 = new FactoryInstanceFactory(beanDefinition6);
            Module.saveMapping$default(module, strIndexKey6, factoryInstanceFactory5, false, 4, null);
            new Pair(module, factoryInstanceFactory5);
            z zVar = z.a;
            StringQualifier rootScopeQualifier6 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition7 = new BeanDefinition(rootScopeQualifier6, Reflection.getOrCreateKotlinClass(SkyRepository.class), null, zVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey7 = BeanDefinitionKt.indexKey(beanDefinition7.getPrimaryType(), null, rootScopeQualifier6);
            FactoryInstanceFactory factoryInstanceFactory6 = new FactoryInstanceFactory(beanDefinition7);
            Module.saveMapping$default(module, strIndexKey7, factoryInstanceFactory6, false, 4, null);
            new Pair(module, factoryInstanceFactory6);
            a0 a0Var = a0.a;
            StringQualifier rootScopeQualifier7 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition8 = new BeanDefinition(rootScopeQualifier7, Reflection.getOrCreateKotlinClass(DeviceDataRepository.class), null, a0Var, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey8 = BeanDefinitionKt.indexKey(beanDefinition8.getPrimaryType(), null, rootScopeQualifier7);
            FactoryInstanceFactory factoryInstanceFactory7 = new FactoryInstanceFactory(beanDefinition8);
            Module.saveMapping$default(module, strIndexKey8, factoryInstanceFactory7, false, 4, null);
            new Pair(module, factoryInstanceFactory7);
            b0 b0Var = b0.a;
            StringQualifier rootScopeQualifier8 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition9 = new BeanDefinition(rootScopeQualifier8, Reflection.getOrCreateKotlinClass(RecommendMusicUseCase.class), null, b0Var, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey9 = BeanDefinitionKt.indexKey(beanDefinition9.getPrimaryType(), null, rootScopeQualifier8);
            FactoryInstanceFactory factoryInstanceFactory8 = new FactoryInstanceFactory(beanDefinition9);
            Module.saveMapping$default(module, strIndexKey9, factoryInstanceFactory8, false, 4, null);
            new Pair(module, factoryInstanceFactory8);
            C0553a c0553a = C0553a.a;
            BeanDefinition beanDefinition10 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(IPlaySettingRepo.class), null, c0553a, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey10 = BeanDefinitionKt.indexKey(beanDefinition10.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory2 = new SingleInstanceFactory<>(beanDefinition10);
            Module.saveMapping$default(module, strIndexKey10, singleInstanceFactory2, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory2);
            }
            new Pair(module, singleInstanceFactory2);
            b bVar = b.a;
            StringQualifier rootScopeQualifier9 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition11 = new BeanDefinition(rootScopeQualifier9, Reflection.getOrCreateKotlinClass(RelaxDataApi.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey11 = BeanDefinitionKt.indexKey(beanDefinition11.getPrimaryType(), null, rootScopeQualifier9);
            FactoryInstanceFactory factoryInstanceFactory9 = new FactoryInstanceFactory(beanDefinition11);
            Module.saveMapping$default(module, strIndexKey11, factoryInstanceFactory9, false, 4, null);
            new Pair(module, factoryInstanceFactory9);
            c cVar = c.a;
            StringQualifier rootScopeQualifier10 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition12 = new BeanDefinition(rootScopeQualifier10, Reflection.getOrCreateKotlinClass(RelaxDataService.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey12 = BeanDefinitionKt.indexKey(beanDefinition12.getPrimaryType(), null, rootScopeQualifier10);
            FactoryInstanceFactory factoryInstanceFactory10 = new FactoryInstanceFactory(beanDefinition12);
            Module.saveMapping$default(module, strIndexKey12, factoryInstanceFactory10, false, 4, null);
            new Pair(module, factoryInstanceFactory10);
            d dVar = d.a;
            StringQualifier rootScopeQualifier11 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition13 = new BeanDefinition(rootScopeQualifier11, Reflection.getOrCreateKotlinClass(SkyCardService.class), null, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey13 = BeanDefinitionKt.indexKey(beanDefinition13.getPrimaryType(), null, rootScopeQualifier11);
            FactoryInstanceFactory factoryInstanceFactory11 = new FactoryInstanceFactory(beanDefinition13);
            Module.saveMapping$default(module, strIndexKey13, factoryInstanceFactory11, false, 4, null);
            new Pair(module, factoryInstanceFactory11);
            e eVar = e.a;
            BeanDefinition beanDefinition14 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(MusicPreferenceApi.class), null, eVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey14 = BeanDefinitionKt.indexKey(beanDefinition14.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory3 = new SingleInstanceFactory<>(beanDefinition14);
            Module.saveMapping$default(module, strIndexKey14, singleInstanceFactory3, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory3);
            }
            new Pair(module, singleInstanceFactory3);
            f fVar = f.a;
            StringQualifier rootScopeQualifier12 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition15 = new BeanDefinition(rootScopeQualifier12, Reflection.getOrCreateKotlinClass(IQuestionnaireRepo.class), null, fVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey15 = BeanDefinitionKt.indexKey(beanDefinition15.getPrimaryType(), null, rootScopeQualifier12);
            FactoryInstanceFactory factoryInstanceFactory12 = new FactoryInstanceFactory(beanDefinition15);
            Module.saveMapping$default(module, strIndexKey15, factoryInstanceFactory12, false, 4, null);
            new Pair(module, factoryInstanceFactory12);
            g gVar = g.a;
            StringQualifier rootScopeQualifier13 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition16 = new BeanDefinition(rootScopeQualifier13, Reflection.getOrCreateKotlinClass(SyncRelaxScoreFromServerUseCase.class), null, gVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey16 = BeanDefinitionKt.indexKey(beanDefinition16.getPrimaryType(), null, rootScopeQualifier13);
            FactoryInstanceFactory factoryInstanceFactory13 = new FactoryInstanceFactory(beanDefinition16);
            Module.saveMapping$default(module, strIndexKey16, factoryInstanceFactory13, false, 4, null);
            new Pair(module, factoryInstanceFactory13);
            h hVar = h.a;
            StringQualifier rootScopeQualifier14 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition17 = new BeanDefinition(rootScopeQualifier14, Reflection.getOrCreateKotlinClass(GetRelaxScoreUseCase.class), null, hVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey17 = BeanDefinitionKt.indexKey(beanDefinition17.getPrimaryType(), null, rootScopeQualifier14);
            FactoryInstanceFactory factoryInstanceFactory14 = new FactoryInstanceFactory(beanDefinition17);
            Module.saveMapping$default(module, strIndexKey17, factoryInstanceFactory14, false, 4, null);
            new Pair(module, factoryInstanceFactory14);
            i iVar = i.a;
            BeanDefinition beanDefinition18 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ISleepReminderRepo.class), null, iVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey18 = BeanDefinitionKt.indexKey(beanDefinition18.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory4 = new SingleInstanceFactory<>(beanDefinition18);
            Module.saveMapping$default(module, strIndexKey18, singleInstanceFactory4, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory4);
            }
            new Pair(module, singleInstanceFactory4);
            j jVar = j.a;
            BeanDefinition beanDefinition19 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SelectedMusicPrefsRepo.class), null, jVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey19 = BeanDefinitionKt.indexKey(beanDefinition19.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory5 = new SingleInstanceFactory<>(beanDefinition19);
            Module.saveMapping$default(module, strIndexKey19, singleInstanceFactory5, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory5);
            }
            new Pair(module, singleInstanceFactory5);
            l lVar = l.a;
            StringQualifier rootScopeQualifier15 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition20 = new BeanDefinition(rootScopeQualifier15, Reflection.getOrCreateKotlinClass(GetMusicPreferenceInfoUseCase.class), null, lVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey20 = BeanDefinitionKt.indexKey(beanDefinition20.getPrimaryType(), null, rootScopeQualifier15);
            FactoryInstanceFactory factoryInstanceFactory15 = new FactoryInstanceFactory(beanDefinition20);
            Module.saveMapping$default(module, strIndexKey20, factoryInstanceFactory15, false, 4, null);
            new Pair(module, factoryInstanceFactory15);
            m mVar = m.a;
            StringQualifier rootScopeQualifier16 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition21 = new BeanDefinition(rootScopeQualifier16, Reflection.getOrCreateKotlinClass(GetReminderDetailUseCase.class), null, mVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey21 = BeanDefinitionKt.indexKey(beanDefinition21.getPrimaryType(), null, rootScopeQualifier16);
            FactoryInstanceFactory factoryInstanceFactory16 = new FactoryInstanceFactory(beanDefinition21);
            Module.saveMapping$default(module, strIndexKey21, factoryInstanceFactory16, false, 4, null);
            new Pair(module, factoryInstanceFactory16);
            n nVar = n.a;
            StringQualifier rootScopeQualifier17 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition22 = new BeanDefinition(rootScopeQualifier17, Reflection.getOrCreateKotlinClass(SetReminderOpenUseCase.class), null, nVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey22 = BeanDefinitionKt.indexKey(beanDefinition22.getPrimaryType(), null, rootScopeQualifier17);
            FactoryInstanceFactory factoryInstanceFactory17 = new FactoryInstanceFactory(beanDefinition22);
            Module.saveMapping$default(module, strIndexKey22, factoryInstanceFactory17, false, 4, null);
            new Pair(module, factoryInstanceFactory17);
            o oVar = o.a;
            StringQualifier rootScopeQualifier18 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition23 = new BeanDefinition(rootScopeQualifier18, Reflection.getOrCreateKotlinClass(SkyPromotionApi.class), null, oVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey23 = BeanDefinitionKt.indexKey(beanDefinition23.getPrimaryType(), null, rootScopeQualifier18);
            FactoryInstanceFactory factoryInstanceFactory18 = new FactoryInstanceFactory(beanDefinition23);
            Module.saveMapping$default(module, strIndexKey23, factoryInstanceFactory18, false, 4, null);
            new Pair(module, factoryInstanceFactory18);
            p pVar = p.a;
            BeanDefinition beanDefinition24 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SkyPromotionRepo.class), null, pVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey24 = BeanDefinitionKt.indexKey(beanDefinition24.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory6 = new SingleInstanceFactory<>(beanDefinition24);
            Module.saveMapping$default(module, strIndexKey24, singleInstanceFactory6, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory6);
            }
            new Pair(module, singleInstanceFactory6);
            q qVar = q.a;
            StringQualifier rootScopeQualifier19 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition25 = new BeanDefinition(rootScopeQualifier19, Reflection.getOrCreateKotlinClass(SkyAppSettingApi.class), null, qVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey25 = BeanDefinitionKt.indexKey(beanDefinition25.getPrimaryType(), null, rootScopeQualifier19);
            FactoryInstanceFactory factoryInstanceFactory19 = new FactoryInstanceFactory(beanDefinition25);
            Module.saveMapping$default(module, strIndexKey25, factoryInstanceFactory19, false, 4, null);
            new Pair(module, factoryInstanceFactory19);
            r rVar = r.a;
            BeanDefinition beanDefinition26 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SkyAppSettingRepo.class), null, rVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey26 = BeanDefinitionKt.indexKey(beanDefinition26.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory7 = new SingleInstanceFactory<>(beanDefinition26);
            Module.saveMapping$default(module, strIndexKey26, singleInstanceFactory7, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory7);
            }
            new Pair(module, singleInstanceFactory7);
            s sVar = s.a;
            StringQualifier rootScopeQualifier20 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition27 = new BeanDefinition(rootScopeQualifier20, Reflection.getOrCreateKotlinClass(IWeekPlanRepo.class), null, sVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey27 = BeanDefinitionKt.indexKey(beanDefinition27.getPrimaryType(), null, rootScopeQualifier20);
            FactoryInstanceFactory factoryInstanceFactory20 = new FactoryInstanceFactory(beanDefinition27);
            Module.saveMapping$default(module, strIndexKey27, factoryInstanceFactory20, false, 4, null);
            new Pair(module, factoryInstanceFactory20);
            t tVar = t.a;
            StringQualifier rootScopeQualifier21 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition28 = new BeanDefinition(rootScopeQualifier21, Reflection.getOrCreateKotlinClass(IWeekPlanHintRepo.class), null, tVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey28 = BeanDefinitionKt.indexKey(beanDefinition28.getPrimaryType(), null, rootScopeQualifier21);
            FactoryInstanceFactory factoryInstanceFactory21 = new FactoryInstanceFactory(beanDefinition28);
            Module.saveMapping$default(module, strIndexKey28, factoryInstanceFactory21, false, 4, null);
            new Pair(module, factoryInstanceFactory21);
        }
    }

    @NotNull
    public static final Module getSkyInternalModule() {
        return a;
    }
}
