package com.xiaomi.fitness.mine;

import android.os.Bundle;
import androidx.databinding.ObservableField;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelKt;
import com.fitness.banner.export.BannerExtKt;
import com.fitness.banner.export.BannerItem;
import com.fitness.banner.export.BannerRequestParam;
import com.fitness.banner.export.BusinessKey;
import com.fitness.banner.export.IBanner;
import com.google.android.gms.common.Scopes;
import com.mi.health.course.export.CourseApiKt;
import com.mi.health.course.export.data.AidongVipUserInfo;
import com.mibi.sdk.common.CommonConstants;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fitness.access.export.AccessManager;
import com.xiaomi.fitness.access.export.AccessManagerExtKt;
import com.xiaomi.fitness.access.export.bean.MiSportData;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.active.pk.export.ActivePkPageExtKt;
import com.xiaomi.fitness.active.pk.export.IPkExport;
import com.xiaomi.fitness.active.pk.export.entity.EntranceModel;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.medal.export.IPopMedalListRepo;
import com.xiaomi.fitness.medal.export.MedalManager;
import com.xiaomi.fitness.medal.export.MedalManagerExtKt;
import com.xiaomi.fitness.medal.export.data.MedalEntrance;
import com.xiaomi.fitness.medal.export.data.PopMedalData;
import com.xiaomi.fitness.mine.MineViewModel;
import com.xiaomi.fitness.mine.company.CompanyUserEntranceResult;
import com.xiaomi.fitness.mine.company.CompanyUserRepository;
import com.xiaomi.fitness.net.response.ApiException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 p2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001pB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:H\u0016J\u0010\u0010;\u001a\u0002082\u0006\u0010<\u001a\u00020=H\u0016J\u0006\u0010>\u001a\u000208J\u0006\u0010?\u001a\u000208J\u0006\u0010D\u001a\u00020AJ\u0006\u0010E\u001a\u00020 J\u0006\u0010F\u001a\u00020 J\b\u00105\u001a\u0004\u0018\u00010 J\u0006\u0010G\u001a\u000208J\u0006\u0010H\u001a\u000208J\f\u0010I\u001a\b\u0012\u0004\u0012\u00020A0JJ\u0006\u0010K\u001a\u000208J\b\u0010V\u001a\u0004\u0018\u00010MJ\u0006\u0010W\u001a\u00020XJ\u0006\u0010Y\u001a\u000208J\u0006\u0010Z\u001a\u00020XJ\u0006\u0010[\u001a\u000208J\u0006\u0010\\\u001a\u000208J\u0014\u0010]\u001a\u0002082\f\u0010^\u001a\b\u0012\u0004\u0012\u00020M0_J\u0006\u0010`\u001a\u00020XJ,\u0010d\u001a\u0002082\u000e\b\u0002\u0010e\u001a\b\u0012\u0004\u0012\u0002080f2\u0014\b\u0002\u0010g\u001a\u000e\u0012\u0004\u0012\u00020i\u0012\u0004\u0012\u0002080hJ\u000e\u0010j\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010k0JJ\u0006\u0010o\u001a\u000208R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010%\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R\"\u0010(\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0015\"\u0004\b+\u0010\u0017R\"\u0010,\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0015\"\u0004\b/\u0010\u0017R\u0018\u00100\u001a\n 2*\u0004\u0018\u00010101X\u0082\u0004¢\u0006\u0004\n\u0002\u00103R \u00104\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\"\"\u0004\b6\u0010$R\u0014\u0010@\u001a\u00020AX\u0086D¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR \u0010L\u001a\b\u0012\u0004\u0012\u00020M0\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u0015\"\u0004\bO\u0010\u0017R\u001e\u0010P\u001a\u00020Q8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u0019\u0010a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010b0\u0012¢\u0006\b\n\u0000\u001a\u0004\bc\u0010\u0015R\u0019\u0010l\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010m0\u0012¢\u0006\b\n\u0000\u001a\u0004\bn\u0010\u0015¨\u0006q"}, d2 = {"Lcom/xiaomi/fitness/mine/MineViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/mine/MineModel;", "<init>", "()V", "mUserInfoManager", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "getMUserInfoManager", "()Lcom/xiaomi/fitness/account/user/UserInfoManager;", "setMUserInfoManager", "(Lcom/xiaomi/fitness/account/user/UserInfoManager;)V", "companyUserRepository", "Lcom/xiaomi/fitness/mine/company/CompanyUserRepository;", "getCompanyUserRepository", "()Lcom/xiaomi/fitness/mine/company/CompanyUserRepository;", "setCompanyUserRepository", "(Lcom/xiaomi/fitness/mine/company/CompanyUserRepository;)V", "xiaomiCoreInfo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "getXiaomiCoreInfo", "()Landroidx/lifecycle/MutableLiveData;", "setXiaomiCoreInfo", "(Landroidx/lifecycle/MutableLiveData;)V", Scopes.PROFILE, "Lcom/xiaomi/fitness/account/api/bean/UserProfile;", "getProfile", "()Lcom/xiaomi/fitness/account/api/bean/UserProfile;", "setProfile", "(Lcom/xiaomi/fitness/account/api/bean/UserProfile;)V", "medalDes", "Landroidx/databinding/ObservableField;", "", "getMedalDes", "()Landroidx/databinding/ObservableField;", "setMedalDes", "(Landroidx/databinding/ObservableField;)V", "medalDesDetail", "getMedalDesDetail", "setMedalDesDetail", "medalMedalEntrance", "Lcom/xiaomi/fitness/medal/export/data/MedalEntrance;", "getMedalMedalEntrance", "setMedalMedalEntrance", "mMiSportStatus", "Lcom/xiaomi/fitness/access/export/bean/MiSportData$MiSportStatus;", "getMMiSportStatus", "setMMiSportStatus", "mBirthdayCalendar", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "Ljava/util/Calendar;", CommonConstants.KEY_USER_NAME, "getUserName", "setUserName", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "initUserProfile", "updateUserProfile", "DEFAULT_AGE", "", "getDEFAULT_AGE", "()I", "getUserAge", "getUserSex", "getUserHeight", "getMiSportLastMigrateStatus", "getAccountCoreInfo", "queryProcessPkCountLiveData", "Landroidx/lifecycle/LiveData;", "getMedalEntrance", "medalToPopLiveData", "Lcom/xiaomi/fitness/medal/export/data/PopMedalData;", "getMedalToPopLiveData", "setMedalToPopLiveData", "mPopMedalRepo", "Lcom/xiaomi/fitness/medal/export/IPopMedalListRepo;", "getMPopMedalRepo", "()Lcom/xiaomi/fitness/medal/export/IPopMedalListRepo;", "setMPopMedalRepo", "(Lcom/xiaomi/fitness/medal/export/IPopMedalListRepo;)V", "getFirstMedalFromPopMedalDataSP", "popMedalListFromSpIsEmpty", "", "removeMedalAlreadyPoppedFromSp", "shouldPullPopMedalDataFromNetwork", "setPopMedalDataAlreadyPulled", "setShouldPullPopMedalDataFromNetwork", "savePopMedalListToSp", "list", "", "getComeFromMedalDetailPageFromSP", "miTvAidongVipUserInfoLiveData", "Lcom/mi/health/course/export/data/AidongVipUserInfo;", "getMiTvAidongVipUserInfoLiveData", "sendGetAidongVipUseInfoRequestOnce", "onSuccess", "Lkotlin/Function0;", "onError", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/net/response/ApiException;", "queryBannerDetailLiveData", "Lcom/fitness/banner/export/BannerItem;", "companyUserEntranceLiveData", "Lcom/xiaomi/fitness/mine/company/CompanyUserEntranceResult;", "getCompanyUserEntranceLiveData", "requestCompanyEntrance", "Companion", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MineViewModel extends BaseViewModel<MineModel> {

    @NotNull
    public static final String TAG_MINE = "MineViewModel";
    private final int DEFAULT_AGE;
    public CompanyUserRepository companyUserRepository;
    public IPopMedalListRepo mPopMedalRepo;
    public UserInfoManager mUserInfoManager;

    @Nullable
    private UserProfile profile;

    @NotNull
    private MutableLiveData<AccountCoreInfo> xiaomiCoreInfo = new MutableLiveData<>();

    @Nullable
    private ObservableField<String> medalDes = new ObservableField<>();

    @Nullable
    private ObservableField<String> medalDesDetail = new ObservableField<>();

    @Nullable
    private MutableLiveData<MedalEntrance> medalMedalEntrance = new MutableLiveData<>();

    @Nullable
    private MutableLiveData<MiSportData.MiSportStatus> mMiSportStatus = new MutableLiveData<>();
    private final Calendar mBirthdayCalendar = Calendar.getInstance();

    @NotNull
    private ObservableField<String> userName = new ObservableField<>();

    @NotNull
    private MutableLiveData<PopMedalData> medalToPopLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<AidongVipUserInfo> miTvAidongVipUserInfoLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<CompanyUserEntranceResult> companyUserEntranceLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.mine.MineViewModel$queryBannerDetailLiveData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "Lcom/fitness/banner/export/BannerItem;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.mine.MineViewModel$queryBannerDetailLiveData$1", f = "MineViewModel.kt", i = {0}, l = {238, 244, 244}, m = "invokeSuspend", n = {"$this$liveData"}, s = {"L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<LiveDataScope<BannerItem>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<BannerItem> liveDataScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    if (i != 2 && i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.L$0;
            IBanner instance = BannerExtKt.getINSTANCE(IBanner.INSTANCE);
            BannerRequestParam bannerRequestParam = new BannerRequestParam(BusinessKey.BUSINESS_TAG_USER_CENTER, 0, 1, 2, null);
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = instance.getBannerListV1(bannerRequestParam, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            List list = (List) obj;
            if (list.isEmpty()) {
                this.L$0 = null;
                this.label = 2;
                if (liveDataScope.emit(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                Object obj2 = list.get(0);
                this.L$0 = null;
                this.label = 3;
                if (liveDataScope.emit(obj2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.mine.MineViewModel$requestCompanyEntrance$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.mine.MineViewModel$requestCompanyEntrance$1", f = "MineViewModel.kt", i = {}, l = {255}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26231 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        public C26231(Continuation<? super C26231> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MineViewModel.this.new C26231(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableLiveData mutableLiveData;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableLiveData<CompanyUserEntranceResult> companyUserEntranceLiveData = MineViewModel.this.getCompanyUserEntranceLiveData();
                CompanyUserRepository companyUserRepository = MineViewModel.this.getCompanyUserRepository();
                this.L$0 = companyUserEntranceLiveData;
                this.label = 1;
                Object companyUserEntrance = companyUserRepository.getCompanyUserEntrance(this);
                if (companyUserEntrance == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableLiveData = companyUserEntranceLiveData;
                obj = companyUserEntrance;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableLiveData = (MutableLiveData) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            mutableLiveData.postValue(obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C26231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAccountCoreInfo$lambda$1(MineViewModel this$0, AccountCoreInfo accountCoreInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d(this$0.getTAG(), "getAccountCoreInfo is " + accountCoreInfo);
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new MineViewModel$getAccountCoreInfo$1$1(this$0, accountCoreInfo, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getMedalEntrance$lambda$3(MineViewModel this$0, MedalEntrance it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        MutableLiveData<MedalEntrance> mutableLiveData = this$0.medalMedalEntrance;
        if (mutableLiveData != null) {
            mutableLiveData.setValue(it);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getMedalEntrance$lambda$4(MineViewModel this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.getTAG(), "getMedalEntrance failed. errorCode=" + it.getErrorCode() + " errorMessage=" + it.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getMiSportLastMigrateStatus$lambda$0(MineViewModel this$0, MiSportData.MiSportStatus it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        MutableLiveData<MiSportData.MiSportStatus> mutableLiveData = this$0.mMiSportStatus;
        if (mutableLiveData != null) {
            mutableLiveData.setValue(it);
        }
        Logger.d(BaseFragment.TAG, "getMiSportLastMigrateStatus mMiSportStatus" + it.status);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int queryProcessPkCountLiveData$lambda$2(EntranceModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getPkCount();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void sendGetAidongVipUseInfoRequestOnce$default(MineViewModel mineViewModel, Function0 function0, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = new Function0() { // from class: g4g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: h4g
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return MineViewModel.sendGetAidongVipUseInfoRequestOnce$lambda$6((ApiException) obj2);
                }
            };
        }
        mineViewModel.sendGetAidongVipUseInfoRequestOnce(function0, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendGetAidongVipUseInfoRequestOnce$lambda$6(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendGetAidongVipUseInfoRequestOnce$lambda$7(MineViewModel this$0, Function0 onSuccess, AidongVipUserInfo it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(onSuccess, "$onSuccess");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.miTvAidongVipUserInfoLiveData.setValue(it);
        onSuccess.invoke();
        Logger.i(TAG_MINE, "sendOneRequestAndGetAidongVipUseInfo succeed. userInfo=" + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendGetAidongVipUseInfoRequestOnce$lambda$8(Function1 onError, ApiException it) {
        Intrinsics.checkNotNullParameter(onError, "$onError");
        Intrinsics.checkNotNullParameter(it, "it");
        onError.invoke2(it);
        Logger.i(TAG_MINE, "sendOneRequestAndGetAidongVipUseInfo failed. error=" + it);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.BaseViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final void getAccountCoreInfo() {
        getMUserInfoManager().getAccountCoreInfo(true, new Function1() { // from class: f4g
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MineViewModel.getAccountCoreInfo$lambda$1(this.f17390a, (AccountCoreInfo) obj);
            }
        });
    }

    public final boolean getComeFromMedalDetailPageFromSP() {
        return getMPopMedalRepo().cameFromMedalDetailPage();
    }

    @NotNull
    public final MutableLiveData<CompanyUserEntranceResult> getCompanyUserEntranceLiveData() {
        return this.companyUserEntranceLiveData;
    }

    @NotNull
    public final CompanyUserRepository getCompanyUserRepository() {
        CompanyUserRepository companyUserRepository = this.companyUserRepository;
        if (companyUserRepository != null) {
            return companyUserRepository;
        }
        Intrinsics.throwUninitializedPropertyAccessException("companyUserRepository");
        return null;
    }

    public final int getDEFAULT_AGE() {
        return this.DEFAULT_AGE;
    }

    @Nullable
    public final PopMedalData getFirstMedalFromPopMedalDataSP() {
        return getMPopMedalRepo().getFirstMedal();
    }

    @Nullable
    public final MutableLiveData<MiSportData.MiSportStatus> getMMiSportStatus() {
        return this.mMiSportStatus;
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
    public final UserInfoManager getMUserInfoManager() {
        UserInfoManager userInfoManager = this.mUserInfoManager;
        if (userInfoManager != null) {
            return userInfoManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mUserInfoManager");
        return null;
    }

    @Nullable
    public final ObservableField<String> getMedalDes() {
        return this.medalDes;
    }

    @Nullable
    public final ObservableField<String> getMedalDesDetail() {
        return this.medalDesDetail;
    }

    public final void getMedalEntrance() {
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            MedalManagerExtKt.getInstance(MedalManager.INSTANCE).getMedalEntrance(new Function1() { // from class: a4g
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MineViewModel.getMedalEntrance$lambda$3(this.f603a, (MedalEntrance) obj);
                }
            }, new Function1() { // from class: b4g
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MineViewModel.getMedalEntrance$lambda$4(this.f3786a, (ApiException) obj);
                }
            });
        }
    }

    @Nullable
    public final MutableLiveData<MedalEntrance> getMedalMedalEntrance() {
        return this.medalMedalEntrance;
    }

    @NotNull
    public final MutableLiveData<PopMedalData> getMedalToPopLiveData() {
        return this.medalToPopLiveData;
    }

    public final void getMiSportLastMigrateStatus() {
        AccessManagerExtKt.getInstance(AccessManager.INSTANCE).getMiSportLastMigrateStatus(new Function1() { // from class: c4g
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MineViewModel.getMiSportLastMigrateStatus$lambda$0(this.f4911a, (MiSportData.MiSportStatus) obj);
            }
        });
    }

    @NotNull
    public final MutableLiveData<AidongVipUserInfo> getMiTvAidongVipUserInfoLiveData() {
        return this.miTvAidongVipUserInfoLiveData;
    }

    @Nullable
    public final UserProfile getProfile() {
        return this.profile;
    }

    public final int getUserAge() throws ParseException {
        UserProfile userProfile = this.profile;
        Intrinsics.checkNotNull(userProfile);
        String birth = userProfile.getBirth();
        if (birth == null || birth.length() == 0) {
            return this.DEFAULT_AGE;
        }
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(birth);
        if (this.mBirthdayCalendar.before(Long.valueOf(date.getTime()))) {
            return 0;
        }
        this.mBirthdayCalendar.setTime(new Date());
        int i = this.mBirthdayCalendar.get(1);
        int i2 = this.mBirthdayCalendar.get(2);
        int i3 = this.mBirthdayCalendar.get(5);
        this.mBirthdayCalendar.setTime(new Date(date.getTime()));
        int i4 = this.mBirthdayCalendar.get(1);
        int i5 = this.mBirthdayCalendar.get(2);
        int i6 = i - i4;
        return (i2 >= i5 && (i2 != i5 || i3 >= this.mBirthdayCalendar.get(5))) ? i6 : i6 - 1;
    }

    @NotNull
    public final String getUserHeight() {
        UserProfile userProfile = this.profile;
        Intrinsics.checkNotNull(userProfile);
        return String.valueOf(userProfile.getHeight());
    }

    @NotNull
    public final ObservableField<String> getUserName() {
        return this.userName;
    }

    @NotNull
    public final String getUserSex() {
        UserProfile userProfile = this.profile;
        Intrinsics.checkNotNull(userProfile);
        return String.valueOf(userProfile.getSex());
    }

    @NotNull
    public final MutableLiveData<AccountCoreInfo> getXiaomiCoreInfo() {
        return this.xiaomiCoreInfo;
    }

    public final void initUserProfile() {
        this.profile = UserInfoManager.getUserProfile$default(getMUserInfoManager(), false, 1, null);
        getTAG();
        UserProfile userProfile = this.profile;
        StringBuilder sb = new StringBuilder();
        sb.append("profile == ");
        sb.append(userProfile);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onCreate(owner);
    }

    public final boolean popMedalListFromSpIsEmpty() {
        return getMPopMedalRepo().isMedalListEmpty();
    }

    @NotNull
    public final LiveData<BannerItem> queryBannerDetailLiveData() {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new AnonymousClass1(null), 3, (Object) null);
    }

    @NotNull
    public final LiveData<Integer> queryProcessPkCountLiveData() {
        return Transformations.map(ActivePkPageExtKt.getINSTANCE(IPkExport.INSTANCE).queryPkEntranceModel(), new Function1() { // from class: z3g
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Integer.valueOf(MineViewModel.queryProcessPkCountLiveData$lambda$2((EntranceModel) obj));
            }
        });
    }

    public final void removeMedalAlreadyPoppedFromSp() {
        getMPopMedalRepo().removePoppedMedalFromSp();
    }

    public final void requestCompanyEntrance() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C26231(null), 2, null);
    }

    public final void savePopMedalListToSp(@NotNull List<PopMedalData> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        getMPopMedalRepo().savePopMedalList(list);
    }

    public final void sendGetAidongVipUseInfoRequestOnce(@NotNull final Function0<Unit> onSuccess, @NotNull final Function1<? super ApiException, Unit> onError) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        CourseApiKt.getCourseApi().getAidongMemberUserInfo(new Function1() { // from class: d4g
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MineViewModel.sendGetAidongVipUseInfoRequestOnce$lambda$7(this.f15072a, onSuccess, (AidongVipUserInfo) obj);
            }
        }, new Function1() { // from class: e4g
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MineViewModel.sendGetAidongVipUseInfoRequestOnce$lambda$8(onError, (ApiException) obj);
            }
        });
    }

    public final void setCompanyUserRepository(@NotNull CompanyUserRepository companyUserRepository) {
        Intrinsics.checkNotNullParameter(companyUserRepository, "<set-?>");
        this.companyUserRepository = companyUserRepository;
    }

    public final void setMMiSportStatus(@Nullable MutableLiveData<MiSportData.MiSportStatus> mutableLiveData) {
        this.mMiSportStatus = mutableLiveData;
    }

    public final void setMPopMedalRepo(@NotNull IPopMedalListRepo iPopMedalListRepo) {
        Intrinsics.checkNotNullParameter(iPopMedalListRepo, "<set-?>");
        this.mPopMedalRepo = iPopMedalListRepo;
    }

    public final void setMUserInfoManager(@NotNull UserInfoManager userInfoManager) {
        Intrinsics.checkNotNullParameter(userInfoManager, "<set-?>");
        this.mUserInfoManager = userInfoManager;
    }

    public final void setMedalDes(@Nullable ObservableField<String> observableField) {
        this.medalDes = observableField;
    }

    public final void setMedalDesDetail(@Nullable ObservableField<String> observableField) {
        this.medalDesDetail = observableField;
    }

    public final void setMedalMedalEntrance(@Nullable MutableLiveData<MedalEntrance> mutableLiveData) {
        this.medalMedalEntrance = mutableLiveData;
    }

    public final void setMedalToPopLiveData(@NotNull MutableLiveData<PopMedalData> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.medalToPopLiveData = mutableLiveData;
    }

    public final void setPopMedalDataAlreadyPulled() {
        getMPopMedalRepo().setShouldPullPopMedalData(false);
    }

    public final void setProfile(@Nullable UserProfile userProfile) {
        this.profile = userProfile;
    }

    public final void setShouldPullPopMedalDataFromNetwork() {
        getMPopMedalRepo().setShouldPullPopMedalData(true);
    }

    public final void setUserName(@NotNull ObservableField<String> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.userName = observableField;
    }

    public final void setXiaomiCoreInfo(@NotNull MutableLiveData<AccountCoreInfo> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.xiaomiCoreInfo = mutableLiveData;
    }

    public final boolean shouldPullPopMedalDataFromNetwork() {
        return getMPopMedalRepo().getShouldPullPopMedalData();
    }

    public final void updateUserProfile() {
        this.profile = UserInfoManager.getUserProfile$default(getMUserInfoManager(), false, 1, null);
        Logger.i(getTAG(), "updateUserProfile update profile == " + this.profile);
    }

    @Nullable
    /* JADX INFO: renamed from: getUserName, reason: collision with other method in class */
    public final String m494getUserName() {
        return this.userName.get();
    }
}
