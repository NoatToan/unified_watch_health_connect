package com.xiaomi.fitness.active.pk;

import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ScopeExtKt;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.CachedPagingDataKt;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import androidx.paging.PagingSource;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport;
import com.xiaomi.fit.fitness.export.data.aggregation.GoalItem;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.active.pk.ActivePkViewModel;
import com.xiaomi.fitness.active.pk.net.model.AggregatePkInfo;
import com.xiaomi.fitness.active.pk.net.model.GetHistoryPkRecordsResult;
import com.xiaomi.fitness.active.pk.net.model.GetInviteRecordUserDetailResult;
import com.xiaomi.fitness.active.pk.net.model.GetPkSportRecordsResult;
import com.xiaomi.fitness.active.pk.net.model.GetProcessPkRecordsResult;
import com.xiaomi.fitness.active.pk.net.model.InviteRecordDetail;
import com.xiaomi.fitness.active.pk.net.model.PkRecordDetail;
import com.xiaomi.fitness.active.pk.net.model.UserInfo;
import com.xiaomi.fitness.active.pk.net.model.WithDrawPrivacyUser;
import com.xiaomi.fitness.active.pk.paging.HistoryPkRecordsDetailPagingSource;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.net.response.ApiException;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 ^2\u00020\u0001:\u0001^B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020%\u0018\u00010$0#JM\u0010&\u001a\u00020'2\u001c\u0010(\u001a\u0018\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020'0+j\b\u0012\u0004\u0012\u00020*`)2\u0016\u0010,\u001a\u0012\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020'0+j\u0002`-2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010*¢\u0006\u0002\u00100J]\u00101\u001a\u00020'2\b\u00102\u001a\u0004\u0018\u00010*2\b\u00103\u001a\u0004\u0018\u00010*2\u0006\u00104\u001a\u0002052\u001c\u0010(\u001a\u0018\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020'0+j\b\u0012\u0004\u0012\u000206`)2\u0016\u0010,\u001a\u0012\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020'0+j\u0002`-¢\u0006\u0002\u00107J%\u00108\u001a\b\u0012\u0004\u0012\u0002090#2\b\u00102\u001a\u0004\u0018\u00010*2\b\u00103\u001a\u0004\u0018\u00010*¢\u0006\u0002\u0010:J\u0014\u0010;\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020<\u0018\u00010$0#J\u0014\u0010=\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020>\u0018\u00010$0#J'\u0010?\u001a\b\u0012\u0004\u0012\u0002050#2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010A\u001a\u000206¢\u0006\u0002\u0010BJ-\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0D0#2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010A\u001a\u000206¢\u0006\u0002\u0010BJ\u001e\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010>0#2\u0006\u0010F\u001a\u00020*2\u0006\u0010@\u001a\u00020*J\u0016\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010H0#2\u0006\u0010@\u001a\u00020*J\u0014\u0010I\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020H\u0018\u00010$0#J;\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180#2\u0006\u0010F\u001a\u00020*2\u0006\u0010@\u001a\u00020*2\n\b\u0002\u0010K\u001a\u0004\u0018\u0001062\n\b\u0002\u0010L\u001a\u0004\u0018\u00010M¢\u0006\u0002\u0010NJ3\u0010O\u001a\u00020'2\u0006\u0010F\u001a\u00020*2\u0006\u0010@\u001a\u00020*2\n\b\u0002\u0010K\u001a\u0004\u0018\u0001062\n\b\u0002\u0010L\u001a\u0004\u0018\u00010M¢\u0006\u0002\u0010PJ8\u0010Q\u001a\u0004\u0018\u00010\u00182\u0006\u0010F\u001a\u00020*2\u0006\u0010@\u001a\u00020*2\n\b\u0002\u0010K\u001a\u0004\u0018\u0001062\n\b\u0002\u0010L\u001a\u0004\u0018\u00010MH\u0082@¢\u0006\u0002\u0010RJ&\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0$0#2\b\b\u0002\u0010U\u001a\u00020*2\b\b\u0002\u0010V\u001a\u000205J\f\u0010W\u001a\b\u0012\u0004\u0012\u0002050#J\u0014\u0010X\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020Y\u0018\u00010$0#JQ\u0010Z\u001a\u00020'2\u000e\u0010[\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010$2\u001c\u0010(\u001a\u0018\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020'0+j\b\u0012\u0004\u0012\u00020\\`)2\u0016\u0010,\u001a\u0012\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020'0+j\u0002`-¢\u0006\u0002\u0010]R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006_"}, d2 = {"Lcom/xiaomi/fitness/active/pk/ActivePkViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "activePkRepository", "Lcom/xiaomi/fitness/active/pk/ActivePkRepository;", "getActivePkRepository", "()Lcom/xiaomi/fitness/active/pk/ActivePkRepository;", "setActivePkRepository", "(Lcom/xiaomi/fitness/active/pk/ActivePkRepository;)V", "mUserInfoManager", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "getMUserInfoManager", "()Lcom/xiaomi/fitness/account/user/UserInfoManager;", "setMUserInfoManager", "(Lcom/xiaomi/fitness/account/user/UserInfoManager;)V", "repoProvider", "Lcom/xiaomi/fit/fitness/export/api/repository/IRepositoryProvider;", "getRepoProvider", "()Lcom/xiaomi/fit/fitness/export/api/repository/IRepositoryProvider;", "setRepoProvider", "(Lcom/xiaomi/fit/fitness/export/api/repository/IRepositoryProvider;)V", "pkSportRecordResultLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/active/pk/net/model/GetPkSportRecordsResult;", "getPkSportRecordResultLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setPkSportRecordResultLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "getPkSportRecordsResult", "getGetPkSportRecordsResult", "()Lcom/xiaomi/fitness/active/pk/net/model/GetPkSportRecordsResult;", "setGetPkSportRecordsResult", "(Lcom/xiaomi/fitness/active/pk/net/model/GetPkSportRecordsResult;)V", "queryRecommendFriendsLiveData", "Landroidx/lifecycle/LiveData;", "", "Lcom/xiaomi/fitness/active/pk/net/model/UserInfo;", "createInviteRecord", "", "onSuccess", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "", "Lkotlin/Function1;", "onFail", "Lcom/xiaomi/fitness/net/extensions/OnFail;", "Lcom/xiaomi/fitness/net/response/ApiException;", "inviteeUid", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Long;)V", "acceptOrRejectInvite", PkConstants.PARAM_INVITE_ID, PkConstants.PARAM_INVITER_UID, "isAccept", "", "", "(Ljava/lang/Long;Ljava/lang/Long;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "queryInviteUserDetailLiveData", "Lcom/xiaomi/fitness/active/pk/net/model/GetInviteRecordUserDetailResult;", "(Ljava/lang/Long;Ljava/lang/Long;)Landroidx/lifecycle/LiveData;", "queryInviteRecordsLiveData", "Lcom/xiaomi/fitness/active/pk/net/model/InviteRecordDetail;", "queryProcessPkRecordsDetailLiveData", "Lcom/xiaomi/fitness/active/pk/net/model/PkRecordDetail;", "queryHasUserHistoryStatusLiveData", PkConstants.PARAM_PK_UID, "pkStatus", "(Ljava/lang/Long;I)Landroidx/lifecycle/LiveData;", "queryHistoryPkRecordsDetailPagingData", "Landroidx/paging/PagingData;", "queryUserPkRecordDetailLiveData", PkConstants.PARAM_PK_ID, "queryPkUserAggregateHistoryLiveData", "Lcom/xiaomi/fitness/active/pk/net/model/AggregatePkInfo;", "queryPkAllAggregateHistoryListLiveData", "querySportRecordsLiveData", "count", "nextKey", "", "(JJLjava/lang/Integer;Ljava/lang/String;)Landroidx/lifecycle/LiveData;", "sendGetPkSportRecordResultRequestOnce", "(JJLjava/lang/Integer;Ljava/lang/String;)V", "sendSportRecordNetworkRequest", "(JJLjava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDefaultActiveGoalLiveData", "Lcom/xiaomi/fit/fitness/export/data/aggregation/GoalItem;", "timeInSecond", "widthDetail", "getIsMaleLiveData", "queryWithDrawPrivacyUserListLiveData", "Lcom/xiaomi/fitness/active/pk/net/model/WithDrawPrivacyUser;", "updateWithDrawRecordIdsAsync", "ids", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Companion", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nActivePkViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivePkViewModel.kt\ncom/xiaomi/fitness/active/pk/ActivePkViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,263:1\n1863#2,2:264\n*S KotlinDebug\n*F\n+ 1 ActivePkViewModel.kt\ncom/xiaomi/fitness/active/pk/ActivePkViewModel\n*L\n230#1:264,2\n*E\n"})
public final class ActivePkViewModel extends AbsViewModel {

    @NotNull
    public static final String TAG = "ActivePkViewModel";
    public ActivePkRepository activePkRepository;

    @Nullable
    private GetPkSportRecordsResult getPkSportRecordsResult;
    public UserInfoManager mUserInfoManager;

    @NotNull
    private MutableLiveData<GetPkSportRecordsResult> pkSportRecordResultLiveData = new MutableLiveData<>();
    public IRepositoryProvider repoProvider;

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.ActivePkViewModel$getIsMaleLiveData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.ActivePkViewModel$getIsMaleLiveData$1", f = "ActivePkViewModel.kt", i = {}, l = {242}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<LiveDataScope<Boolean>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = ActivePkViewModel.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<Boolean> liveDataScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LiveDataScope liveDataScope = (LiveDataScope) this.L$0;
                Boolean boolBoxBoolean = Boxing.boxBoolean(!Intrinsics.areEqual(UserInfoManager.getUserProfile$default(ActivePkViewModel.this.getMUserInfoManager(), false, 1, null).getSex(), "female"));
                this.label = 1;
                if (liveDataScope.emit(boolBoxBoolean, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.ActivePkViewModel$queryHasUserHistoryStatusLiveData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.ActivePkViewModel$queryHasUserHistoryStatusLiveData$1", f = "ActivePkViewModel.kt", i = {0}, l = {124, 125}, m = "invokeSuspend", n = {"$this$liveData"}, s = {"L$0"})
    public static final class C17791 extends SuspendLambda implements Function2<LiveDataScope<Boolean>, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $pkStatus;
        final /* synthetic */ Long $pkUid;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17791(int i, Long l, Continuation<? super C17791> continuation) {
            super(2, continuation);
            this.$pkStatus = i;
            this.$pkUid = l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17791 c17791 = ActivePkViewModel.this.new C17791(this.$pkStatus, this.$pkUid, continuation);
            c17791.L$0 = obj;
            return c17791;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<Boolean> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C17791) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope;
            List<PkRecordDetail> pkList;
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
            ActivePkRepository activePkRepository = ActivePkViewModel.this.getActivePkRepository();
            int i2 = this.$pkStatus;
            Long l = this.$pkUid;
            Integer numBoxInt = Boxing.boxInt(20);
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = ActivePkRepository.getHistoryPkRecordsDetail$default(activePkRepository, i2, l, null, numBoxInt, false, this, 16, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            GetHistoryPkRecordsResult getHistoryPkRecordsResult = (GetHistoryPkRecordsResult) obj;
            Boolean boolBoxBoolean = Boxing.boxBoolean((getHistoryPkRecordsResult == null || (pkList = getHistoryPkRecordsResult.getPkList()) == null || pkList.size() <= 0) ? false : true);
            this.L$0 = null;
            this.label = 2;
            if (liveDataScope.emit(boolBoxBoolean, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.ActivePkViewModel$queryInviteRecordsLiveData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "", "Lcom/xiaomi/fitness/active/pk/net/model/InviteRecordDetail;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.ActivePkViewModel$queryInviteRecordsLiveData$1", f = "ActivePkViewModel.kt", i = {}, l = {103, 103}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17801 extends SuspendLambda implements Function2<LiveDataScope<List<? extends InviteRecordDetail>>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public C17801(Continuation<? super C17801> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17801 c17801 = ActivePkViewModel.this.new C17801(continuation);
            c17801.L$0 = obj;
            return c17801;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(LiveDataScope<List<InviteRecordDetail>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C17801) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            ActivePkRepository activePkRepository = ActivePkViewModel.this.getActivePkRepository();
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = activePkRepository.getInviteRecords(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.L$0 = null;
            this.label = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(LiveDataScope<List<? extends InviteRecordDetail>> liveDataScope, Continuation<? super Unit> continuation) {
            return invoke2((LiveDataScope<List<InviteRecordDetail>>) liveDataScope, continuation);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.ActivePkViewModel$queryInviteUserDetailLiveData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "Lcom/xiaomi/fitness/active/pk/net/model/GetInviteRecordUserDetailResult;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.ActivePkViewModel$queryInviteUserDetailLiveData$1", f = "ActivePkViewModel.kt", i = {}, l = {93, 92}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17811 extends SuspendLambda implements Function2<LiveDataScope<GetInviteRecordUserDetailResult>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Long $inviteId;
        final /* synthetic */ Long $inviterUid;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17811(Long l, Long l2, Continuation<? super C17811> continuation) {
            super(2, continuation);
            this.$inviteId = l;
            this.$inviterUid = l2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17811 c17811 = ActivePkViewModel.this.new C17811(this.$inviteId, this.$inviterUid, continuation);
            c17811.L$0 = obj;
            return c17811;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<GetInviteRecordUserDetailResult> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C17811) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            ActivePkRepository activePkRepository = ActivePkViewModel.this.getActivePkRepository();
            Long l = this.$inviteId;
            Long l2 = this.$inviterUid;
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = activePkRepository.getInviteRecordUserDetail(l, l2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.L$0 = null;
            this.label = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.ActivePkViewModel$queryPkAllAggregateHistoryListLiveData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "", "Lcom/xiaomi/fitness/active/pk/net/model/AggregatePkInfo;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.ActivePkViewModel$queryPkAllAggregateHistoryListLiveData$1", f = "ActivePkViewModel.kt", i = {}, l = {174, 174}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17821 extends SuspendLambda implements Function2<LiveDataScope<List<? extends AggregatePkInfo>>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public C17821(Continuation<? super C17821> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17821 c17821 = ActivePkViewModel.this.new C17821(continuation);
            c17821.L$0 = obj;
            return c17821;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(LiveDataScope<List<AggregatePkInfo>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C17821) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            ActivePkRepository activePkRepository = ActivePkViewModel.this.getActivePkRepository();
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = activePkRepository.getPkAllAggregateHistoryList(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.L$0 = null;
            this.label = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(LiveDataScope<List<? extends AggregatePkInfo>> liveDataScope, Continuation<? super Unit> continuation) {
            return invoke2((LiveDataScope<List<AggregatePkInfo>>) liveDataScope, continuation);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.ActivePkViewModel$queryPkUserAggregateHistoryLiveData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "Lcom/xiaomi/fitness/active/pk/net/model/AggregatePkInfo;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.ActivePkViewModel$queryPkUserAggregateHistoryLiveData$1", f = "ActivePkViewModel.kt", i = {}, l = {164, 164}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17831 extends SuspendLambda implements Function2<LiveDataScope<AggregatePkInfo>, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $pkUid;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17831(long j, Continuation<? super C17831> continuation) {
            super(2, continuation);
            this.$pkUid = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17831 c17831 = ActivePkViewModel.this.new C17831(this.$pkUid, continuation);
            c17831.L$0 = obj;
            return c17831;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<AggregatePkInfo> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C17831) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            ActivePkRepository activePkRepository = ActivePkViewModel.this.getActivePkRepository();
            long j = this.$pkUid;
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = activePkRepository.getPkUserAggregateHistory(j, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.L$0 = null;
            this.label = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.ActivePkViewModel$queryProcessPkRecordsDetailLiveData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "", "Lcom/xiaomi/fitness/active/pk/net/model/PkRecordDetail;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.ActivePkViewModel$queryProcessPkRecordsDetailLiveData$1", f = "ActivePkViewModel.kt", i = {}, l = {111, 111}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17841 extends SuspendLambda implements Function2<LiveDataScope<List<? extends PkRecordDetail>>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public C17841(Continuation<? super C17841> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17841 c17841 = ActivePkViewModel.this.new C17841(continuation);
            c17841.L$0 = obj;
            return c17841;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(LiveDataScope<List<PkRecordDetail>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C17841) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            ActivePkRepository activePkRepository = ActivePkViewModel.this.getActivePkRepository();
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = activePkRepository.getProcessPkRecordsDetail(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            GetProcessPkRecordsResult getProcessPkRecordsResult = (GetProcessPkRecordsResult) obj;
            List<PkRecordDetail> pkList = getProcessPkRecordsResult != null ? getProcessPkRecordsResult.getPkList() : null;
            this.L$0 = null;
            this.label = 2;
            if (liveDataScope.emit(pkList, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(LiveDataScope<List<? extends PkRecordDetail>> liveDataScope, Continuation<? super Unit> continuation) {
            return invoke2((LiveDataScope<List<PkRecordDetail>>) liveDataScope, continuation);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.ActivePkViewModel$queryRecommendFriendsLiveData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "", "Lcom/xiaomi/fitness/active/pk/net/model/UserInfo;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.ActivePkViewModel$queryRecommendFriendsLiveData$1", f = "ActivePkViewModel.kt", i = {}, l = {48, 48}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17851 extends SuspendLambda implements Function2<LiveDataScope<List<? extends UserInfo>>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public C17851(Continuation<? super C17851> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17851 c17851 = ActivePkViewModel.this.new C17851(continuation);
            c17851.L$0 = obj;
            return c17851;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(LiveDataScope<List<UserInfo>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C17851) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            ActivePkRepository activePkRepository = ActivePkViewModel.this.getActivePkRepository();
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = activePkRepository.getRecommendFriendsList(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.L$0 = null;
            this.label = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(LiveDataScope<List<? extends UserInfo>> liveDataScope, Continuation<? super Unit> continuation) {
            return invoke2((LiveDataScope<List<UserInfo>>) liveDataScope, continuation);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.ActivePkViewModel$querySportRecordsLiveData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "Lcom/xiaomi/fitness/active/pk/net/model/GetPkSportRecordsResult;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.ActivePkViewModel$querySportRecordsLiveData$1", f = "ActivePkViewModel.kt", i = {}, l = {SportReportBaseParser.ReportType.descentCount, SportReportBaseParser.ReportType.descentCount}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17861 extends SuspendLambda implements Function2<LiveDataScope<GetPkSportRecordsResult>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Integer $count;
        final /* synthetic */ String $nextKey;
        final /* synthetic */ long $pkId;
        final /* synthetic */ long $pkUid;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17861(long j, long j2, Integer num, String str, Continuation<? super C17861> continuation) {
            super(2, continuation);
            this.$pkId = j;
            this.$pkUid = j2;
            this.$count = num;
            this.$nextKey = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17861 c17861 = ActivePkViewModel.this.new C17861(this.$pkId, this.$pkUid, this.$count, this.$nextKey, continuation);
            c17861.L$0 = obj;
            return c17861;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<GetPkSportRecordsResult> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C17861) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            ActivePkRepository activePkRepository = ActivePkViewModel.this.getActivePkRepository();
            long j = this.$pkId;
            long j2 = this.$pkUid;
            Integer num = this.$count;
            String str = this.$nextKey;
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = activePkRepository.getSportRecords(j, j2, num, str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.L$0 = null;
            this.label = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.ActivePkViewModel$queryUserPkRecordDetailLiveData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "Lcom/xiaomi/fitness/active/pk/net/model/PkRecordDetail;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.ActivePkViewModel$queryUserPkRecordDetailLiveData$1", f = "ActivePkViewModel.kt", i = {}, l = {155, 155}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17871 extends SuspendLambda implements Function2<LiveDataScope<PkRecordDetail>, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $pkId;
        final /* synthetic */ long $pkUid;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17871(long j, long j2, Continuation<? super C17871> continuation) {
            super(2, continuation);
            this.$pkId = j;
            this.$pkUid = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17871 c17871 = ActivePkViewModel.this.new C17871(this.$pkId, this.$pkUid, continuation);
            c17871.L$0 = obj;
            return c17871;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<PkRecordDetail> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C17871) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            ActivePkRepository activePkRepository = ActivePkViewModel.this.getActivePkRepository();
            long j = this.$pkId;
            long j2 = this.$pkUid;
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = activePkRepository.getUserPkRecordDetail(j, j2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.L$0 = null;
            this.label = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.ActivePkViewModel$queryWithDrawPrivacyUserListLiveData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "", "Lcom/xiaomi/fitness/active/pk/net/model/WithDrawPrivacyUser;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.ActivePkViewModel$queryWithDrawPrivacyUserListLiveData$1", f = "ActivePkViewModel.kt", i = {}, l = {248, 248}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17881 extends SuspendLambda implements Function2<LiveDataScope<List<? extends WithDrawPrivacyUser>>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public C17881(Continuation<? super C17881> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17881 c17881 = ActivePkViewModel.this.new C17881(continuation);
            c17881.L$0 = obj;
            return c17881;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(LiveDataScope<List<WithDrawPrivacyUser>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C17881) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            ActivePkRepository activePkRepository = ActivePkViewModel.this.getActivePkRepository();
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = activePkRepository.getWithDrawPrivacyUserList(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.L$0 = null;
            this.label = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(LiveDataScope<List<? extends WithDrawPrivacyUser>> liveDataScope, Continuation<? super Unit> continuation) {
            return invoke2((LiveDataScope<List<WithDrawPrivacyUser>>) liveDataScope, continuation);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.ActivePkViewModel$sendGetPkSportRecordResultRequestOnce$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.ActivePkViewModel$sendGetPkSportRecordResultRequestOnce$1", f = "ActivePkViewModel.kt", i = {}, l = {205}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17891 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Integer $count;
        final /* synthetic */ String $nextKey;
        final /* synthetic */ long $pkId;
        final /* synthetic */ long $pkUid;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17891(long j, long j2, Integer num, String str, Continuation<? super C17891> continuation) {
            super(2, continuation);
            this.$pkId = j;
            this.$pkUid = j2;
            this.$count = num;
            this.$nextKey = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ActivePkViewModel.this.new C17891(this.$pkId, this.$pkUid, this.$count, this.$nextKey, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ActivePkViewModel activePkViewModel;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ActivePkViewModel activePkViewModel2 = ActivePkViewModel.this;
                long j = this.$pkId;
                long j2 = this.$pkUid;
                Integer num = this.$count;
                String str = this.$nextKey;
                this.L$0 = activePkViewModel2;
                this.label = 1;
                Object objSendSportRecordNetworkRequest = activePkViewModel2.sendSportRecordNetworkRequest(j, j2, num, str, this);
                if (objSendSportRecordNetworkRequest == coroutine_suspended) {
                    return coroutine_suspended;
                }
                activePkViewModel = activePkViewModel2;
                obj = objSendSportRecordNetworkRequest;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                activePkViewModel = (ActivePkViewModel) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            activePkViewModel.setGetPkSportRecordsResult((GetPkSportRecordsResult) obj);
            ActivePkViewModel.this.getPkSportRecordResultLiveData().setValue(ActivePkViewModel.this.getGetPkSportRecordsResult());
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17891) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static /* synthetic */ void createInviteRecord$default(ActivePkViewModel activePkViewModel, Function1 function1, Function1 function2, Long l, int i, Object obj) {
        if ((i & 4) != 0) {
            l = null;
        }
        activePkViewModel.createInviteRecord(function1, function2, l);
    }

    public static /* synthetic */ LiveData getDefaultActiveGoalLiveData$default(ActivePkViewModel activePkViewModel, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = TimeDateUtil.changZeroOfTheDay(System.currentTimeMillis() / ((long) 1000));
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return activePkViewModel.getDefaultActiveGoalLiveData(j, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getDefaultActiveGoalLiveData$lambda$2(DailyGoalReport report) {
        Intrinsics.checkNotNullParameter(report, "report");
        List<GoalItem> listGoalList = report.goalList();
        for (GoalItem goalItem : listGoalList) {
            goalItem.setAchievedValue(goalItem.getGoalValue());
        }
        return listGoalList;
    }

    public static /* synthetic */ LiveData queryHasUserHistoryStatusLiveData$default(ActivePkViewModel activePkViewModel, Long l, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            l = null;
        }
        if ((i2 & 2) != 0) {
            i = 2;
        }
        return activePkViewModel.queryHasUserHistoryStatusLiveData(l, i);
    }

    public static /* synthetic */ LiveData queryHistoryPkRecordsDetailPagingData$default(ActivePkViewModel activePkViewModel, Long l, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            l = null;
        }
        if ((i2 & 2) != 0) {
            i = 2;
        }
        return activePkViewModel.queryHistoryPkRecordsDetailPagingData(l, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PagingSource queryHistoryPkRecordsDetailPagingData$lambda$0(int i, Long l, ActivePkViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new HistoryPkRecordsDetailPagingSource(i, l, this$0.getActivePkRepository());
    }

    public static /* synthetic */ void sendGetPkSportRecordResultRequestOnce$default(ActivePkViewModel activePkViewModel, long j, long j2, Integer num, String str, int i, Object obj) {
        String nextKey;
        Integer num2 = (i & 4) != 0 ? null : num;
        if ((i & 8) != 0) {
            GetPkSportRecordsResult value = activePkViewModel.pkSportRecordResultLiveData.getValue();
            nextKey = value != null ? value.getNextKey() : null;
        } else {
            nextKey = str;
        }
        activePkViewModel.sendGetPkSportRecordResultRequestOnce(j, j2, num2, nextKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sendSportRecordNetworkRequest(long j, long j2, Integer num, String str, Continuation<? super GetPkSportRecordsResult> continuation) {
        Logger.d(TAG, "sendSportRecordNetworkRequest once");
        return getActivePkRepository().getSportRecords(j, j2, num, str, continuation);
    }

    public final void acceptOrRejectInvite(@Nullable Long inviteId, @Nullable Long inviterUid, boolean isAccept, @NotNull Function1<? super Integer, Unit> onSuccess, @NotNull Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        getActivePkRepository().acceptOrRejectInvite(inviteId, inviterUid, isAccept, onSuccess, onFail);
    }

    public final void createInviteRecord(@NotNull Function1<? super Long, Unit> onSuccess, @NotNull Function1<? super ApiException, Unit> onFail, @Nullable Long inviteeUid) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        getActivePkRepository().createInviteRecord(inviteeUid, onSuccess, onFail);
    }

    @NotNull
    public final ActivePkRepository getActivePkRepository() {
        ActivePkRepository activePkRepository = this.activePkRepository;
        if (activePkRepository != null) {
            return activePkRepository;
        }
        Intrinsics.throwUninitializedPropertyAccessException("activePkRepository");
        return null;
    }

    @NotNull
    public final LiveData<List<GoalItem>> getDefaultActiveGoalLiveData(long timeInSecond, boolean widthDetail) {
        return Transformations.map(getRepoProvider().getRainbowRepository().getDailyReport(timeInSecond, widthDetail), new Function1() { // from class: jf0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ActivePkViewModel.getDefaultActiveGoalLiveData$lambda$2((DailyGoalReport) obj);
            }
        });
    }

    @Nullable
    public final GetPkSportRecordsResult getGetPkSportRecordsResult() {
        return this.getPkSportRecordsResult;
    }

    @NotNull
    public final LiveData<Boolean> getIsMaleLiveData() {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new AnonymousClass1(null), 3, (Object) null);
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

    @NotNull
    public final MutableLiveData<GetPkSportRecordsResult> getPkSportRecordResultLiveData() {
        return this.pkSportRecordResultLiveData;
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

    @NotNull
    public final LiveData<Boolean> queryHasUserHistoryStatusLiveData(@Nullable Long pkUid, int pkStatus) {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new C17791(pkStatus, pkUid, null), 3, (Object) null);
    }

    @NotNull
    public final LiveData<PagingData<PkRecordDetail>> queryHistoryPkRecordsDetailPagingData(@Nullable final Long pkUid, final int pkStatus) {
        return FlowLiveDataConversions.asLiveData$default(CachedPagingDataKt.cachedIn(new Pager(new PagingConfig(20, 5, false, 0, 0, 0, 56, null), null, new Function0() { // from class: kf0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ActivePkViewModel.queryHistoryPkRecordsDetailPagingData$lambda$0(pkStatus, pkUid, this);
            }
        }, 2, null).getFlow(), ViewModelKt.getViewModelScope(this)), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    @NotNull
    public final LiveData<List<InviteRecordDetail>> queryInviteRecordsLiveData() {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new C17801(null), 3, (Object) null);
    }

    @NotNull
    public final LiveData<GetInviteRecordUserDetailResult> queryInviteUserDetailLiveData(@Nullable Long inviteId, @Nullable Long inviterUid) {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new C17811(inviteId, inviterUid, null), 3, (Object) null);
    }

    @NotNull
    public final LiveData<List<AggregatePkInfo>> queryPkAllAggregateHistoryListLiveData() {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new C17821(null), 3, (Object) null);
    }

    @NotNull
    public final LiveData<AggregatePkInfo> queryPkUserAggregateHistoryLiveData(long pkUid) {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new C17831(pkUid, null), 3, (Object) null);
    }

    @NotNull
    public final LiveData<List<PkRecordDetail>> queryProcessPkRecordsDetailLiveData() {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new C17841(null), 3, (Object) null);
    }

    @NotNull
    public final LiveData<List<UserInfo>> queryRecommendFriendsLiveData() {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new C17851(null), 3, (Object) null);
    }

    @NotNull
    public final LiveData<GetPkSportRecordsResult> querySportRecordsLiveData(long pkId, long pkUid, @Nullable Integer count, @Nullable String nextKey) {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new C17861(pkId, pkUid, count, nextKey, null), 3, (Object) null);
    }

    @NotNull
    public final LiveData<PkRecordDetail> queryUserPkRecordDetailLiveData(long pkId, long pkUid) {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new C17871(pkId, pkUid, null), 3, (Object) null);
    }

    @NotNull
    public final LiveData<List<WithDrawPrivacyUser>> queryWithDrawPrivacyUserListLiveData() {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new C17881(null), 3, (Object) null);
    }

    public final void sendGetPkSportRecordResultRequestOnce(long pkId, long pkUid, @Nullable Integer count, @Nullable String nextKey) {
        GetPkSportRecordsResult value = this.pkSportRecordResultLiveData.getValue();
        if (value == null || value.getHasMore()) {
            ScopeExtKt.scopeNetLife$default(this, null, new C17891(pkId, pkUid, count, nextKey, null), 1, null);
        }
    }

    public final void setActivePkRepository(@NotNull ActivePkRepository activePkRepository) {
        Intrinsics.checkNotNullParameter(activePkRepository, "<set-?>");
        this.activePkRepository = activePkRepository;
    }

    public final void setGetPkSportRecordsResult(@Nullable GetPkSportRecordsResult getPkSportRecordsResult) {
        this.getPkSportRecordsResult = getPkSportRecordsResult;
    }

    public final void setMUserInfoManager(@NotNull UserInfoManager userInfoManager) {
        Intrinsics.checkNotNullParameter(userInfoManager, "<set-?>");
        this.mUserInfoManager = userInfoManager;
    }

    public final void setPkSportRecordResultLiveData(@NotNull MutableLiveData<GetPkSportRecordsResult> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.pkSportRecordResultLiveData = mutableLiveData;
    }

    public final void setRepoProvider(@NotNull IRepositoryProvider iRepositoryProvider) {
        Intrinsics.checkNotNullParameter(iRepositoryProvider, "<set-?>");
        this.repoProvider = iRepositoryProvider;
    }

    public final void updateWithDrawRecordIdsAsync(@Nullable List<Long> ids, @NotNull Function1<Object, Unit> onSuccess, @NotNull Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        if (ArrayUtils.isEmpty(ids)) {
            onSuccess.invoke2(0);
            return;
        }
        ActivePkRepository activePkRepository = getActivePkRepository();
        Intrinsics.checkNotNull(ids);
        activePkRepository.updateWithDrawRecordIdsAsync(ids, onSuccess, onFail);
    }
}
