package com.xiaomi.fitness.homepage;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import com.fitness.banner.export.BannerExtKt;
import com.fitness.banner.export.BannerRequestParamV2;
import com.fitness.banner.export.IBanner;
import com.fitness.banner.export.v2.BannerItemV2;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.api.repository.IHomeDataRepository;
import com.xiaomi.fit.fitness.export.api.repository.IRainbowRepository;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.parser.net.SchemaNetUtils;
import com.xiaomi.fitness.account.api.AccountRequest;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.extensions.UserProfileExtKt;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.active.pk.export.ActivePkPageExtKt;
import com.xiaomi.fitness.active.pk.export.IPkExport;
import com.xiaomi.fitness.active.pk.export.entity.EntranceModel;
import com.xiaomi.fitness.banner.BannerGetBean;
import com.xiaomi.fitness.banner.BannerNetBean;
import com.xiaomi.fitness.banner.BannerRequest;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.device.manager.DeviceModel;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableProductManager;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.device.manager.export.bean.WearableProduct;
import com.xiaomi.fitness.health.curse.CurseManager;
import com.xiaomi.fitness.homepage.HealthViewModel;
import com.xiaomi.fitness.homepage.banner.HomeBannerModel;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.medal.export.IPopMedalListRepo;
import com.xiaomi.fitness.medal.export.MedalManager;
import com.xiaomi.fitness.medal.export.MedalManagerExtKt;
import com.xiaomi.fitness.medal.export.data.PopMedalData;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.sport_export.ISportAccessApi;
import com.xiaomi.fitness.sport_export.SportAccessExportExtKt;
import com.xiaomi.fitness.sport_manager_export.SportRouterKt;
import com.xiaomi.fitness.sport_manager_export.data.SportRecoverData;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import com.xiaomi.fitness.sport_manager_export.listener.ISportManagerPreference;
import defpackage.av6;
import defpackage.c0j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001dB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020)H\u0016J\u0006\u0010+\u001a\u00020\u001eJ\b\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020/H\u0002J\u001e\u00100\u001a\b\u0012\u0004\u0012\u000202012\u0006\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u000206J\"\u00107\u001a\u00020\u001e2\u0006\u00108\u001a\u00020)2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u001e0\"J\u0016\u0010;\u001a\u0002062\f\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u0019H\u0002J\u0006\u0010>\u001a\u00020\u001eJ\u0010\u0010?\u001a\u00020\u001e2\b\u0010@\u001a\u0004\u0018\u00010AJ\f\u0010B\u001a\b\u0012\u0004\u0012\u00020C01J\b\u0010O\u001a\u0004\u0018\u00010KJ\u0006\u0010P\u001a\u000206J\u0006\u0010Q\u001a\u00020\u001eJ\u0006\u0010R\u001a\u000206J\u0006\u0010S\u001a\u00020\u001eJ\u0006\u0010T\u001a\u00020\u001eJ\u0014\u0010U\u001a\u00020\u001e2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020K0\u0019J\u0006\u0010W\u001a\u000206J\u0006\u0010X\u001a\u00020\u001eJ\b\u0010Y\u001a\u00020\u001eH\u0002J\u0006\u0010Z\u001a\u00020\u001eJ\u0006\u0010[\u001a\u00020\u001eJ\u0012\u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u001901J\u0012\u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u001901J*\u0010a\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\f\u0010b\u001a\b\u0012\u0004\u0012\u00020=0\u00192\f\u0010c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR/\u0010!\u001a#\u0012\u0019\u0012\u0017\u0012\u0002\b\u0003\u0018\u00010#¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u001e0\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010D\u001a\u00020E8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR \u0010J\u001a\b\u0012\u0004\u0012\u00020K0\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u001c\"\u0004\bM\u0010NR\u001f\u0010\\\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020]\u0018\u00010\u00190\u0018¢\u0006\b\n\u0000\u001a\u0004\b^\u0010\u001c¨\u0006e"}, d2 = {"Lcom/xiaomi/fitness/homepage/HealthViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/homepage/HealthModel;", "<init>", "()V", "repoProvider", "Lcom/xiaomi/fit/fitness/export/api/repository/IRepositoryProvider;", "getRepoProvider", "()Lcom/xiaomi/fit/fitness/export/api/repository/IRepositoryProvider;", "setRepoProvider", "(Lcom/xiaomi/fit/fitness/export/api/repository/IRepositoryProvider;)V", "mAccountRequest", "Lcom/xiaomi/fitness/account/api/AccountRequest;", "getMAccountRequest", "()Lcom/xiaomi/fitness/account/api/AccountRequest;", "setMAccountRequest", "(Lcom/xiaomi/fitness/account/api/AccountRequest;)V", "bannerRequest", "Lcom/xiaomi/fitness/banner/BannerRequest;", "getBannerRequest", "()Lcom/xiaomi/fitness/banner/BannerRequest;", "setBannerRequest", "(Lcom/xiaomi/fitness/banner/BannerRequest;)V", "operationalBannerListLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/fitness/banner/export/v2/BannerItemV2;", "getOperationalBannerListLiveData", "()Landroidx/lifecycle/MutableLiveData;", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "deviceChangeListener", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/device/manager/DeviceModel;", "Lkotlin/ParameterName;", "name", "deviceModel", "onCreate", CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", LifecycleConstantKt.ON_DESTROY, "getUserInfoFromWeb", "getRainbowRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/IRainbowRepository;", "getHomeDataRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/IHomeDataRepository;", "triggerFetchRainbowReport", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "timeInSecond", "", "widthDetail", "", "loadOtherType", "lifecycleOwner", "success", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "isContantStand", "rainbowItemTypes", "", "getSchema", "checkSportRecover", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "queryEntrancePkRecordDetailLiveData", "Lcom/xiaomi/fitness/active/pk/export/entity/EntranceModel;", "mPopMedalRepo", "Lcom/xiaomi/fitness/medal/export/IPopMedalListRepo;", "getMPopMedalRepo", "()Lcom/xiaomi/fitness/medal/export/IPopMedalListRepo;", "setMPopMedalRepo", "(Lcom/xiaomi/fitness/medal/export/IPopMedalListRepo;)V", "medalToPopLiveData", "Lcom/xiaomi/fitness/medal/export/data/PopMedalData;", "getMedalToPopLiveData", "setMedalToPopLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "getFirstMedalFromPopMedalDataSP", "popMedalListFromSpIsEmpty", "removeMedalAlreadyPoppedFromSp", "shouldPullPopMedalDataFromNetwork", "setPopMedalDataAlreadyPulled", "setShouldPullPopMedalDataFromNetwork", "savePopMedalListToSp", "list", "getComeFromMedalDetailPageFromSP", "showPopMedalDialogIfNeed", "handlePopMedalData", "closeMedalDialogCallback", "loadBannerList", "bannerListData", "Lcom/xiaomi/fitness/homepage/banner/HomeBannerModel;", "getBannerListData", "queryHealthTabBannerList", "queryOperationalBannerList", "getFilteredBannerItemList", "requestIdList", "bannerItemList", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHealthViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthViewModel.kt\ncom/xiaomi/fitness/homepage/HealthViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,433:1\n1755#2,3:434\n1863#2:437\n1864#2:439\n1#3:438\n*S KotlinDebug\n*F\n+ 1 HealthViewModel.kt\ncom/xiaomi/fitness/homepage/HealthViewModel\n*L\n168#1:434,3\n423#1:437\n423#1:439\n*E\n"})
public final class HealthViewModel extends BaseViewModel<HealthModel> {

    @NotNull
    public static final String HOME_BANNER_BUSINESS = "MI_WATCH_ARTICLE";
    public BannerRequest bannerRequest;
    public AccountRequest mAccountRequest;
    public IPopMedalListRepo mPopMedalRepo;
    public IRepositoryProvider repoProvider;

    @NotNull
    private final MutableLiveData<List<BannerItemV2>> operationalBannerListLiveData = new MutableLiveData<>();

    @NotNull
    private final Function1<DeviceModel<?>, Unit> deviceChangeListener = new Function1() { // from class: f3c
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2(Object obj) {
            return HealthViewModel.deviceChangeListener$lambda$2((DeviceModel) obj);
        }
    };

    @NotNull
    private MutableLiveData<PopMedalData> medalToPopLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<List<HomeBannerModel>> bannerListData = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.homepage.HealthViewModel$checkSportRecover$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/homepage/HealthViewModel$checkSportRecover$1", "Lav6;", "", "dialogName", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onDialogClick", "(Ljava/lang/String;Landroid/content/DialogInterface;I)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nHealthViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthViewModel.kt\ncom/xiaomi/fitness/homepage/HealthViewModel$checkSportRecover$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,433:1\n1#2:434\n*E\n"})
    public static final class AnonymousClass1 extends av6 {
        final /* synthetic */ FragmentActivity $activity;
        final /* synthetic */ SportRecoverData $recoverSport;
        final /* synthetic */ HealthViewModel this$0;

        public AnonymousClass1(SportRecoverData sportRecoverData, HealthViewModel healthViewModel, FragmentActivity fragmentActivity) {
            this.$recoverSport = sportRecoverData;
            this.this$0 = healthViewModel;
            this.$activity = fragmentActivity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$1(FragmentActivity fragmentActivity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "$bundle");
            if (fragmentActivity != null) {
                SportRouterKt.startIndoorSportActivity$default(fragmentActivity, null, bundle, 2, null);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$4(FragmentActivity fragmentActivity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "$bundle");
            if (fragmentActivity != null) {
                SportRouterKt.startCommonSportActivity$default(fragmentActivity, null, bundle, 2, null);
            }
            return Unit.INSTANCE;
        }

        @Override // defpackage.av6
        public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
            if (which == -1) {
                final Bundle bundle = new Bundle();
                bundle.putInt("KEY_SPORT_TYPE", this.$recoverSport.getSportType());
                bundle.putBoolean("IS_RECOVER_SPORT", true);
                bundle.putInt("WEAR_MODE", SportManagerExtKt.getInstance(ISportManagerPreference.INSTANCE).getLaunchSportWearMode());
                FitnessLogUtils.i(this.this$0.getTAG(), "Recover Sport Positive, SportType " + this.$recoverSport.getSportType());
                if (this.$recoverSport.getSportType() == 3) {
                    ISportAccessApi instance = SportAccessExportExtKt.getINSTANCE(ISportAccessApi.INSTANCE);
                    final FragmentActivity fragmentActivity = this.$activity;
                    instance.getSportPermissions(fragmentActivity, 3, new Function0() { // from class: k3c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HealthViewModel.AnonymousClass1.onDialogClick$lambda$1(fragmentActivity, bundle);
                        }
                    });
                } else if (this.$recoverSport.getSportType() == 7) {
                    FragmentActivity fragmentActivity2 = this.$activity;
                    if (fragmentActivity2 != null) {
                        com.xiaomi.fitness.sport_eco_manager_export.SportRouterKt.startIndoorRidingSportActivity$default(fragmentActivity2, null, bundle, 2, null);
                    }
                } else {
                    ISportAccessApi instance2 = SportAccessExportExtKt.getINSTANCE(ISportAccessApi.INSTANCE);
                    final FragmentActivity fragmentActivity3 = this.$activity;
                    instance2.getSportPermissions(fragmentActivity3, 1, new Function0() { // from class: l3c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HealthViewModel.AnonymousClass1.onDialogClick$lambda$4(fragmentActivity3, bundle);
                        }
                    });
                }
            }
            if (which == -2) {
                FitnessLogUtils.i(this.this$0.getTAG(), "Recover Sport Negative, SportType : " + this.$recoverSport.getSportType());
                SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).syncRecoverSport();
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.homepage.HealthViewModel$queryHealthTabBannerList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "", "Lcom/fitness/banner/export/v2/BannerItemV2;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.homepage.HealthViewModel$queryHealthTabBannerList$1", f = "HealthViewModel.kt", i = {0}, l = {390, 396}, m = "invokeSuspend", n = {"$this$liveData"}, s = {"L$0"})
    public static final class C25771 extends SuspendLambda implements Function2<LiveDataScope<List<? extends BannerItemV2>>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public C25771(Continuation<? super C25771> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C25771 c25771 = new C25771(continuation);
            c25771.L$0 = obj;
            return c25771;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(LiveDataScope<List<BannerItemV2>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C25771) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.L$0;
            IBanner instance = BannerExtKt.getINSTANCE(IBanner.INSTANCE);
            List listListOf = CollectionsKt__CollectionsJVMKt.listOf(Boxing.boxInt(1));
            String lowerCase = RegionExtKt.getInstance(RegionManager.INSTANCE).getLocalCountry().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            BannerRequestParamV2 bannerRequestParamV2 = new BannerRequestParamV2(listListOf, lowerCase, null, null, 12, null);
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = instance.getBannerListV2(bannerRequestParamV2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.L$0 = null;
            this.label = 2;
            if (liveDataScope.emit((List) obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(LiveDataScope<List<? extends BannerItemV2>> liveDataScope, Continuation<? super Unit> continuation) {
            return invoke2((LiveDataScope<List<BannerItemV2>>) liveDataScope, continuation);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.homepage.HealthViewModel$queryOperationalBannerList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "", "Lcom/fitness/banner/export/v2/BannerItemV2;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.homepage.HealthViewModel$queryOperationalBannerList$1", f = "HealthViewModel.kt", i = {0, 0, 1}, l = {407, 414}, m = "invokeSuspend", n = {"$this$liveData", "requestIds", "filteredBannerItemList"}, s = {"L$0", "L$1", "L$0"})
    public static final class C25781 extends SuspendLambda implements Function2<LiveDataScope<List<? extends BannerItemV2>>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        public C25781(Continuation<? super C25781> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C25781 c25781 = HealthViewModel.this.new C25781(continuation);
            c25781.L$0 = obj;
            return c25781;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(LiveDataScope<List<BannerItemV2>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C25781) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List listListOf;
            LiveDataScope liveDataScope;
            List<BannerItemV2> list;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    listListOf = (List) this.L$1;
                    liveDataScope = (LiveDataScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                HealthViewModel.this.getOperationalBannerListLiveData().postValue(list);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            LiveDataScope liveDataScope2 = (LiveDataScope) this.L$0;
            listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Boxing.boxInt(3), Boxing.boxInt(4), Boxing.boxInt(5)});
            IBanner instance = BannerExtKt.getINSTANCE(IBanner.INSTANCE);
            String lowerCase = RegionExtKt.getInstance(RegionManager.INSTANCE).getLocalCountry().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            BannerRequestParamV2 bannerRequestParamV2 = new BannerRequestParamV2(listListOf, lowerCase, null, null, 12, null);
            this.L$0 = liveDataScope2;
            this.L$1 = listListOf;
            this.label = 1;
            Object bannerListV2 = instance.getBannerListV2(bannerRequestParamV2, this);
            if (bannerListV2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            liveDataScope = liveDataScope2;
            obj = bannerListV2;
            List<BannerItemV2> filteredBannerItemList = HealthViewModel.this.getFilteredBannerItemList(listListOf, (List) obj);
            this.L$0 = filteredBannerItemList;
            this.L$1 = null;
            this.label = 2;
            if (liveDataScope.emit(filteredBannerItemList, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = filteredBannerItemList;
            HealthViewModel.this.getOperationalBannerListLiveData().postValue(list);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(LiveDataScope<List<? extends BannerItemV2>> liveDataScope, Continuation<? super Unit> continuation) {
            return invoke2((LiveDataScope<List<BannerItemV2>>) liveDataScope, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit deviceChangeListener$lambda$2(DeviceModel deviceModel) {
        String did;
        Logger.d("HealthViewModel", "attach addDeviceChangeListener onChange: " + (deviceModel != null ? deviceModel.getDid() : null));
        if (deviceModel != null && (did = deviceModel.getDid()) != null) {
            int deviceCapabilityV2 = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceCapabilityV2(did);
            CurseManager.Companion companion = CurseManager.INSTANCE;
            companion.getInstance().setHasIntelligentPredictionCapability((deviceCapabilityV2 & 65536) == 65536);
            companion.getInstance().setSupportMenstrualFeature(((WearableProduct) DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE).findProduct(new Function1() { // from class: h3c
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(HealthViewModel.deviceChangeListener$lambda$2$lambda$1$lambda$0((WearableProduct) obj));
                }
            })) != null);
            Logger.d("HealthViewModel", "attach addDeviceChangeListener hasIntelligentPredictionCapability: " + companion.getInstance().getHasIntelligentPredictionCapability() + ",supportMenstrualFeature: " + companion.getInstance().getSupportMenstrualFeature());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean deviceChangeListener$lambda$2$lambda$1$lambda$0(WearableProduct it) {
        Intrinsics.checkNotNullParameter(it, "it");
        List<String> features = it.getFeatures();
        if (features != null) {
            return features.contains(Feature.MENSTRUATION_INTELLIGENT_PREDICT);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<BannerItemV2> getFilteredBannerItemList(List<Integer> requestIdList, List<BannerItemV2> bannerItemList) {
        Object next;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = requestIdList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            Iterator<T> it2 = bannerItemList.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((BannerItemV2) next).getResourceId() != iIntValue);
            BannerItemV2 bannerItemV2 = (BannerItemV2) next;
            if (bannerItemV2 != null) {
                arrayList.add(bannerItemV2);
            }
        }
        return arrayList;
    }

    private final IHomeDataRepository getHomeDataRepo() {
        return getRepoProvider().getHomeDataRepository();
    }

    private final IRainbowRepository getRainbowRepo() {
        return getRepoProvider().getRainbowRepository();
    }

    private final void handlePopMedalData() {
        boolean comeFromMedalDetailPageFromSP = getComeFromMedalDetailPageFromSP();
        Logger.d(getTAG(), "showPopMedalDialogIfNeed removePoppedMedalData=" + comeFromMedalDetailPageFromSP);
        if (popMedalListFromSpIsEmpty()) {
            return;
        }
        if (comeFromMedalDetailPageFromSP) {
            removeMedalAlreadyPoppedFromSp();
        }
        if (popMedalListFromSpIsEmpty()) {
            setShouldPullPopMedalDataFromNetwork();
        } else {
            this.medalToPopLiveData.setValue(getFirstMedalFromPopMedalDataSP());
        }
    }

    private final boolean isContantStand(List<Integer> rainbowItemTypes) {
        List<Integer> list = rainbowItemTypes;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((Number) it.next()).intValue() == 3) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadBannerList$lambda$6(HealthViewModel this$0, BannerGetBean it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        List<BannerNetBean> bannerList = it.getBannerList();
        ArrayList arrayList = new ArrayList();
        for (BannerNetBean bannerNetBean : bannerList) {
            arrayList.add(new HomeBannerModel(bannerNetBean.getImgUrl(), bannerNetBean.getJumpLink(), ""));
        }
        if (arrayList.size() > 0) {
            this$0.bannerListData.postValue(arrayList);
        }
        Logger.e("getBannerList success", it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadBannerList$lambda$7(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.e("getBannerList error", it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadOtherType$lambda$3(HomeDataType type, Function1 success, Map map) {
        Intrinsics.checkNotNullParameter(type, "$type");
        Intrinsics.checkNotNullParameter(success, "$success");
        Object obj = map.get(type);
        if (type == HomeDataType.MH_STRENGTH) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport");
            success.invoke2((DailyBasicReport) obj);
        } else {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport");
            success.invoke2((DailyBasicReport) obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showPopMedalDialogIfNeed$lambda$5(HealthViewModel this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.d(this$0.getTAG(), "showPopMedalDialogIfNeed popMedalDataList=" + it);
        if (it.isEmpty()) {
            this$0.setShouldPullPopMedalDataFromNetwork();
        } else {
            this$0.savePopMedalListToSp(it);
            this$0.setPopMedalDataAlreadyPulled();
        }
        this$0.handlePopMedalData();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ LiveData triggerFetchRainbowReport$default(HealthViewModel healthViewModel, long j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return healthViewModel.triggerFetchRainbowReport(j, z);
    }

    @Override // com.xiaomi.fitness.baseui.BaseViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceChangeListener(this.deviceChangeListener);
    }

    public final void checkSportRecover(@Nullable FragmentActivity activity) {
        ISportRemoteState.Companion companion = ISportRemoteState.INSTANCE;
        SportRecoverData recoverSport = SportManagerExtKt.getInstance(companion).getRecoverSport();
        FitnessLogUtils.i(getTAG(), "recoverSport:" + recoverSport);
        if (recoverSport != null) {
            FitnessLogUtils.i("sport recover", "sport type :" + recoverSport + " , duration:" + recoverSport.getDuration());
            if (TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - recoverSport.getCacheTime() > TimeDateUtil.TIME_HOUR) {
                SportManagerExtKt.getInstance(companion).syncRecoverSport();
                return;
            }
            ISportManagerPreference.Companion companion2 = ISportManagerPreference.INSTANCE;
            if (SportManagerExtKt.getInstance(companion2).getLaunchSportWearMode() == 1 || recoverSport.getDuration() < 15) {
                FitnessLogUtils.i(getTAG(), "Recover Sport Negative, SportType : " + recoverSport.getSportType());
                SportManagerExtKt.getInstance(companion).removeRecoverSport();
                return;
            }
            if (SportManagerExtKt.getInstance(companion2).sportHasPreRoute()) {
                FitnessLogUtils.i(getTAG(), "Recover Sport hasPreRoute");
                return;
            }
            CommonDialog commonDialogCreate = new CommonDialog.c("recoverSport").setDialogDescription(c0j.hl).setPositiveText(c0j.m9).setNegativeText(c0j.H8).create();
            if (commonDialogCreate != null) {
                commonDialogCreate.setCancelable(false);
            }
            if (commonDialogCreate != null) {
                commonDialogCreate.addDialogCallback(new AnonymousClass1(recoverSport, this, activity));
            }
            if (commonDialogCreate != null) {
                commonDialogCreate.showIfNeed(activity != null ? activity.getSupportFragmentManager() : null);
            }
        }
    }

    public final void closeMedalDialogCallback() {
        removeMedalAlreadyPoppedFromSp();
        if (popMedalListFromSpIsEmpty()) {
            setShouldPullPopMedalDataFromNetwork();
        } else {
            this.medalToPopLiveData.setValue(getFirstMedalFromPopMedalDataSP());
        }
    }

    @NotNull
    public final MutableLiveData<List<HomeBannerModel>> getBannerListData() {
        return this.bannerListData;
    }

    @NotNull
    public final BannerRequest getBannerRequest() {
        BannerRequest bannerRequest = this.bannerRequest;
        if (bannerRequest != null) {
            return bannerRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bannerRequest");
        return null;
    }

    public final boolean getComeFromMedalDetailPageFromSP() {
        return getMPopMedalRepo().cameFromMedalDetailPage();
    }

    @Nullable
    public final PopMedalData getFirstMedalFromPopMedalDataSP() {
        return getMPopMedalRepo().getFirstMedal();
    }

    @NotNull
    public final AccountRequest getMAccountRequest() {
        AccountRequest accountRequest = this.mAccountRequest;
        if (accountRequest != null) {
            return accountRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAccountRequest");
        return null;
    }

    @NotNull
    public final IPopMedalListRepo getMPopMedalRepo() {
        IPopMedalListRepo iPopMedalListRepo = this.mPopMedalRepo;
        if (iPopMedalListRepo != null) {
            return iPopMedalListRepo;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mPopMedalRepo");
        return null;
    }

    @NotNull
    public final MutableLiveData<PopMedalData> getMedalToPopLiveData() {
        return this.medalToPopLiveData;
    }

    @NotNull
    public final MutableLiveData<List<BannerItemV2>> getOperationalBannerListLiveData() {
        return this.operationalBannerListLiveData;
    }

    @NotNull
    public final IRepositoryProvider getRepoProvider() {
        IRepositoryProvider iRepositoryProvider = this.repoProvider;
        if (iRepositoryProvider != null) {
            return iRepositoryProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("repoProvider");
        return null;
    }

    public final void getSchema() {
        SchemaNetUtils.INSTANCE.getSchema();
    }

    public final void getUserInfoFromWeb() {
        CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).getUserInfoFromWeb();
    }

    public final void loadBannerList() {
        getBannerRequest().getBannerList(new Function1() { // from class: i3c
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HealthViewModel.loadBannerList$lambda$6(this.f20735a, (BannerGetBean) obj);
            }
        }, new Function1() { // from class: j3c
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HealthViewModel.loadBannerList$lambda$7((ApiException) obj);
            }
        });
    }

    public final void loadOtherType(@NotNull LifecycleOwner lifecycleOwner, @NotNull final Function1<? super DailyBasicReport, Unit> success) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(success, "success");
        final HomeDataType homeDataType = isContantStand(UserProfileExtKt.getRainbowItemTypes(UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null))) ? HomeDataType.MH_STRENGTH : HomeDataType.VALID_STAND;
        getHomeDataRepo().getHomeData(CollectionsKt__CollectionsJVMKt.listOf(homeDataType)).observe(lifecycleOwner, new HealthViewModel$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: e3c
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HealthViewModel.loadOtherType$lambda$3(homeDataType, success, (Map) obj);
            }
        }));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onCreate(owner);
        setBannerRequest(new BannerRequest());
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).removeDeviceChangeListener(this.deviceChangeListener);
    }

    public final boolean popMedalListFromSpIsEmpty() {
        return getMPopMedalRepo().isMedalListEmpty();
    }

    @NotNull
    public final LiveData<EntranceModel> queryEntrancePkRecordDetailLiveData() {
        return ActivePkPageExtKt.getINSTANCE(IPkExport.INSTANCE).queryPkEntranceModel();
    }

    @NotNull
    public final LiveData<List<BannerItemV2>> queryHealthTabBannerList() {
        return CoroutineLiveDataKt.liveData$default(Dispatchers.getIO(), 0L, new C25771(null), 2, (Object) null);
    }

    @NotNull
    public final LiveData<List<BannerItemV2>> queryOperationalBannerList() {
        return CoroutineLiveDataKt.liveData$default(Dispatchers.getIO(), 0L, new C25781(null), 2, (Object) null);
    }

    public final void removeMedalAlreadyPoppedFromSp() {
        getMPopMedalRepo().removePoppedMedalFromSp();
    }

    public final void savePopMedalListToSp(@NotNull List<PopMedalData> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        getMPopMedalRepo().savePopMedalList(list);
    }

    public final void setBannerRequest(@NotNull BannerRequest bannerRequest) {
        Intrinsics.checkNotNullParameter(bannerRequest, "<set-?>");
        this.bannerRequest = bannerRequest;
    }

    public final void setMAccountRequest(@NotNull AccountRequest accountRequest) {
        Intrinsics.checkNotNullParameter(accountRequest, "<set-?>");
        this.mAccountRequest = accountRequest;
    }

    public final void setMPopMedalRepo(@NotNull IPopMedalListRepo iPopMedalListRepo) {
        Intrinsics.checkNotNullParameter(iPopMedalListRepo, "<set-?>");
        this.mPopMedalRepo = iPopMedalListRepo;
    }

    public final void setMedalToPopLiveData(@NotNull MutableLiveData<PopMedalData> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.medalToPopLiveData = mutableLiveData;
    }

    public final void setPopMedalDataAlreadyPulled() {
        getMPopMedalRepo().setShouldPullPopMedalData(false);
    }

    public final void setRepoProvider(@NotNull IRepositoryProvider iRepositoryProvider) {
        Intrinsics.checkNotNullParameter(iRepositoryProvider, "<set-?>");
        this.repoProvider = iRepositoryProvider;
    }

    public final void setShouldPullPopMedalDataFromNetwork() {
        getMPopMedalRepo().setShouldPullPopMedalData(true);
    }

    public final boolean shouldPullPopMedalDataFromNetwork() {
        return getMPopMedalRepo().getShouldPullPopMedalData();
    }

    public final void showPopMedalDialogIfNeed() {
        Logger.d(getTAG(), "showPopMedalDialogIfNeed shouldPullData = " + shouldPullPopMedalDataFromNetwork());
        if (RegionPreference.INSTANCE.getSyncWeb()) {
            if (shouldPullPopMedalDataFromNetwork()) {
                MedalManagerExtKt.getInstance(MedalManager.INSTANCE).requestAllTypeMedalPopupList(new Function1() { // from class: g3c
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return HealthViewModel.showPopMedalDialogIfNeed$lambda$5(this.f18546a, (List) obj);
                    }
                });
            } else {
                handlePopMedalData();
            }
        }
    }

    @NotNull
    public final LiveData<DailyGoalReport> triggerFetchRainbowReport(long timeInSecond, boolean widthDetail) {
        return getRainbowRepo().getDailyReport(timeInSecond, widthDetail);
    }
}
