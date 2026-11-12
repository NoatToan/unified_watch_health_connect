package com.xiaomi.fitness.active.pk;

import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.active.pk.net.ActivePkRequest;
import com.xiaomi.fitness.active.pk.net.model.AggregatePkInfo;
import com.xiaomi.fitness.active.pk.net.model.AggregatedFitnessData;
import com.xiaomi.fitness.active.pk.net.model.CodeResult;
import com.xiaomi.fitness.active.pk.net.model.CreateInviteRecordResult;
import com.xiaomi.fitness.active.pk.net.model.GetActiveDataListResult;
import com.xiaomi.fitness.active.pk.net.model.GetEntranceResult;
import com.xiaomi.fitness.active.pk.net.model.GetHistoryPkRecordsResult;
import com.xiaomi.fitness.active.pk.net.model.GetInviteRecordUserDetailResult;
import com.xiaomi.fitness.active.pk.net.model.GetInviteRecordsResult;
import com.xiaomi.fitness.active.pk.net.model.GetPkAggregateHistoryListResult;
import com.xiaomi.fitness.active.pk.net.model.GetPkSportRecordsResult;
import com.xiaomi.fitness.active.pk.net.model.GetPkUserAggregateHistoryResult;
import com.xiaomi.fitness.active.pk.net.model.GetProcessPkRecordsResult;
import com.xiaomi.fitness.active.pk.net.model.GetRecommendFriends;
import com.xiaomi.fitness.active.pk.net.model.GetUserPkRecordDetailResult;
import com.xiaomi.fitness.active.pk.net.model.GetWithDrawPrivacyUsersResult;
import com.xiaomi.fitness.active.pk.net.model.InviteRecordDetail;
import com.xiaomi.fitness.active.pk.net.model.PkRecordDetail;
import com.xiaomi.fitness.active.pk.net.model.UserInfo;
import com.xiaomi.fitness.active.pk.net.model.WithDrawPrivacyUser;
import com.xiaomi.fitness.active.pk.util.PkLogger;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.net.response.ApiException;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 F2\u00020\u0001:\u0001FB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0086@¢\u0006\u0002\u0010\rJM\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\u0014j\b\u0012\u0004\u0012\u00020\u0011`\u00132\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f0\u0014j\u0002`\u0016¢\u0006\u0002\u0010\u0018J]\u0010\u0019\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001c\u001a\u00020\u001d2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000f0\u0014j\b\u0012\u0004\u0012\u00020\u001e`\u00132\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f0\u0014j\u0002`\u0016¢\u0006\u0002\u0010\u001fJ\"\u0010 \u001a\u00020!2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u0011H\u0086@¢\u0006\u0002\u0010\"J\u0016\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u000bH\u0086@¢\u0006\u0002\u0010\rJ\u0010\u0010%\u001a\u0004\u0018\u00010&H\u0086@¢\u0006\u0002\u0010\rJ\u0010\u0010'\u001a\u0004\u0018\u00010(H\u0086@¢\u0006\u0002\u0010\rJB\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u001e2\b\u0010,\u001a\u0004\u0018\u00010\u00112\b\u0010-\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010/\u001a\u00020\u001dH\u0086@¢\u0006\u0002\u00100J \u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u00104J\u0018\u00105\u001a\u0004\u0018\u0001062\u0006\u0010,\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u00107J\u0016\u00108\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010\u000bH\u0086@¢\u0006\u0002\u0010\rJ4\u00109\u001a\u0004\u0018\u00010:2\u0006\u00103\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00112\b\u0010.\u001a\u0004\u0018\u00010\u001e2\b\u0010-\u001a\u0004\u0018\u00010;H\u0086@¢\u0006\u0002\u0010<J&\u0010=\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010\u000b2\u0006\u00103\u001a\u00020\u00112\u0006\u0010?\u001a\u00020\u001dH\u0086@¢\u0006\u0002\u0010@J\u0016\u0010A\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010\u000bH\u0086@¢\u0006\u0002\u0010\rJQ\u0010C\u001a\u00020\u000f2\u000e\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000b2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000f0\u0014j\b\u0012\u0004\u0012\u00020\u0001`\u00132\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f0\u0014j\u0002`\u0016¢\u0006\u0002\u0010ER\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006G"}, d2 = {"Lcom/xiaomi/fitness/active/pk/ActivePkRepository;", "", "<init>", "()V", "activePkRequest", "Lcom/xiaomi/fitness/active/pk/net/ActivePkRequest;", "getActivePkRequest", "()Lcom/xiaomi/fitness/active/pk/net/ActivePkRequest;", "setActivePkRequest", "(Lcom/xiaomi/fitness/active/pk/net/ActivePkRequest;)V", "getRecommendFriendsList", "", "Lcom/xiaomi/fitness/active/pk/net/model/UserInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createInviteRecord", "", "inviteeUid", "", "onSuccess", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "Lkotlin/Function1;", "onFail", "Lcom/xiaomi/fitness/net/extensions/OnFail;", "Lcom/xiaomi/fitness/net/response/ApiException;", "(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "acceptOrRejectInvite", PkConstants.PARAM_INVITE_ID, PkConstants.PARAM_INVITER_UID, "isAccept", "", "", "(Ljava/lang/Long;Ljava/lang/Long;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getInviteRecordUserDetail", "Lcom/xiaomi/fitness/active/pk/net/model/GetInviteRecordUserDetailResult;", "(Ljava/lang/Long;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getInviteRecords", "Lcom/xiaomi/fitness/active/pk/net/model/InviteRecordDetail;", "getPkEntranceResult", "Lcom/xiaomi/fitness/active/pk/net/model/GetEntranceResult;", "getProcessPkRecordsDetail", "Lcom/xiaomi/fitness/active/pk/net/model/GetProcessPkRecordsResult;", "getHistoryPkRecordsDetail", "Lcom/xiaomi/fitness/active/pk/net/model/GetHistoryPkRecordsResult;", "pkStatus", PkConstants.PARAM_PK_UID, "nextKey", "count", "reverse", "(ILjava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserPkRecordDetail", "Lcom/xiaomi/fitness/active/pk/net/model/PkRecordDetail;", PkConstants.PARAM_PK_ID, "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPkUserAggregateHistory", "Lcom/xiaomi/fitness/active/pk/net/model/AggregatePkInfo;", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPkAllAggregateHistoryList", "getSportRecords", "Lcom/xiaomi/fitness/active/pk/net/model/GetPkSportRecordsResult;", "", "(JJLjava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getActiveDataList", "Lcom/xiaomi/fitness/active/pk/net/model/AggregatedFitnessData;", "isOwn", "(JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWithDrawPrivacyUserList", "Lcom/xiaomi/fitness/active/pk/net/model/WithDrawPrivacyUser;", "updateWithDrawRecordIdsAsync", "ids", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Companion", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ActivePkRepository {

    @NotNull
    public static final String TAG = "Repository";
    public ActivePkRequest activePkRequest;

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.ActivePkRepository$getActiveDataList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.ActivePkRepository", f = "ActivePkRepository.kt", i = {}, l = {212}, m = "getActiveDataList", n = {}, s = {})
    public static final class C17671 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C17671(Continuation<? super C17671> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ActivePkRepository.this.getActiveDataList(0L, false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.ActivePkRepository$getHistoryPkRecordsDetail$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.ActivePkRepository", f = "ActivePkRepository.kt", i = {}, l = {150}, m = "getHistoryPkRecordsDetail", n = {}, s = {})
    public static final class C17681 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C17681(Continuation<? super C17681> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ActivePkRepository.this.getHistoryPkRecordsDetail(0, null, null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.ActivePkRepository$getInviteRecordUserDetail$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.ActivePkRepository", f = "ActivePkRepository.kt", i = {0}, l = {98}, m = "getInviteRecordUserDetail", n = {"resultRecordUser"}, s = {"L$0"})
    public static final class C17691 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C17691(Continuation<? super C17691> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ActivePkRepository.this.getInviteRecordUserDetail(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.ActivePkRepository$getInviteRecords$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.ActivePkRepository", f = "ActivePkRepository.kt", i = {}, l = {112}, m = "getInviteRecords", n = {}, s = {})
    public static final class C17701 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C17701(Continuation<? super C17701> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ActivePkRepository.this.getInviteRecords(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.ActivePkRepository$getPkAllAggregateHistoryList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.ActivePkRepository", f = "ActivePkRepository.kt", i = {}, l = {185}, m = "getPkAllAggregateHistoryList", n = {}, s = {})
    public static final class C17711 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C17711(Continuation<? super C17711> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ActivePkRepository.this.getPkAllAggregateHistoryList(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.ActivePkRepository$getPkEntranceResult$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.ActivePkRepository", f = "ActivePkRepository.kt", i = {}, l = {123}, m = "getPkEntranceResult", n = {}, s = {})
    public static final class C17721 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C17721(Continuation<? super C17721> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ActivePkRepository.this.getPkEntranceResult(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.ActivePkRepository$getPkUserAggregateHistory$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.ActivePkRepository", f = "ActivePkRepository.kt", i = {}, l = {172}, m = "getPkUserAggregateHistory", n = {}, s = {})
    public static final class C17731 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C17731(Continuation<? super C17731> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ActivePkRepository.this.getPkUserAggregateHistory(0L, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.ActivePkRepository$getProcessPkRecordsDetail$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.ActivePkRepository", f = "ActivePkRepository.kt", i = {}, l = {135}, m = "getProcessPkRecordsDetail", n = {}, s = {})
    public static final class C17741 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C17741(Continuation<? super C17741> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ActivePkRepository.this.getProcessPkRecordsDetail(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.ActivePkRepository$getRecommendFriendsList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.ActivePkRepository", f = "ActivePkRepository.kt", i = {}, l = {27}, m = "getRecommendFriendsList", n = {}, s = {})
    public static final class C17751 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C17751(Continuation<? super C17751> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ActivePkRepository.this.getRecommendFriendsList(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.ActivePkRepository$getSportRecords$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.ActivePkRepository", f = "ActivePkRepository.kt", i = {}, l = {201}, m = "getSportRecords", n = {}, s = {})
    public static final class C17761 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C17761(Continuation<? super C17761> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ActivePkRepository.this.getSportRecords(0L, 0L, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.ActivePkRepository$getUserPkRecordDetail$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.ActivePkRepository", f = "ActivePkRepository.kt", i = {}, l = {161}, m = "getUserPkRecordDetail", n = {}, s = {})
    public static final class C17771 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C17771(Continuation<? super C17771> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ActivePkRepository.this.getUserPkRecordDetail(0L, 0L, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.ActivePkRepository$getWithDrawPrivacyUserList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.ActivePkRepository", f = "ActivePkRepository.kt", i = {}, l = {SportReportBaseParser.ReportType.targetValueNumber}, m = "getWithDrawPrivacyUserList", n = {}, s = {})
    public static final class C17781 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C17781(Continuation<? super C17781> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ActivePkRepository.this.getWithDrawPrivacyUserList(this);
        }
    }

    public static /* synthetic */ void createInviteRecord$default(ActivePkRepository activePkRepository, Long l, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        activePkRepository.createInviteRecord(l, function1, function2);
    }

    public static /* synthetic */ Object getHistoryPkRecordsDetail$default(ActivePkRepository activePkRepository, int i, Long l, Integer num, Integer num2, boolean z, Continuation continuation, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            num2 = null;
        }
        Integer num3 = num2;
        if ((i2 & 16) != 0) {
            z = false;
        }
        return activePkRepository.getHistoryPkRecordsDetail(i, l, num, num3, z, continuation);
    }

    public final void acceptOrRejectInvite(@Nullable Long inviteId, @Nullable Long inviterUid, boolean isAccept, @NotNull final Function1<? super Integer, Unit> onSuccess, @NotNull final Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        getActivePkRequest().acceptOrRejectInvite(inviteId, inviterUid, isAccept, new Function1<CodeResult, Unit>() { // from class: com.xiaomi.fitness.active.pk.ActivePkRepository.acceptOrRejectInvite.1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(CodeResult codeResult) {
                invoke2(codeResult);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public void invoke2(CodeResult p1) {
                Intrinsics.checkNotNullParameter(p1, "p1");
                int code = p1.getCode();
                boolean z = code == 1000;
                PkLogger.INSTANCE.i(ActivePkRepository.TAG, "acceptOrRejectInvite result code " + code + " ,success status is " + z, new Object[0]);
                if (z) {
                    onSuccess.invoke2(Integer.valueOf(code));
                } else {
                    onFail.invoke2(new ApiException(code));
                }
            }
        }, new Function1<ApiException, Unit>() { // from class: com.xiaomi.fitness.active.pk.ActivePkRepository.acceptOrRejectInvite.2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(ApiException apiException) {
                invoke2(apiException);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public void invoke2(ApiException p1) {
                Intrinsics.checkNotNullParameter(p1, "p1");
                PkLogger.INSTANCE.i(ActivePkRepository.TAG, "acceptOrRejectInvite fail " + p1, new Object[0]);
                onFail.invoke2(p1);
            }
        });
    }

    public final void createInviteRecord(@Nullable Long inviteeUid, @NotNull Function1<? super Long, Unit> onSuccess, @NotNull Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        final WeakReference weakReference = new WeakReference(onSuccess);
        final WeakReference weakReference2 = new WeakReference(onFail);
        getActivePkRequest().createInviteRecordAsync(inviteeUid, new Function1<CreateInviteRecordResult, Unit>() { // from class: com.xiaomi.fitness.active.pk.ActivePkRepository.createInviteRecord.1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(CreateInviteRecordResult createInviteRecordResult) {
                invoke2(createInviteRecordResult);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public void invoke2(CreateInviteRecordResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                PkLogger.INSTANCE.i(ActivePkRepository.TAG, "createInviteRecord success ,result is " + result, new Object[0]);
                if (result.getCode() == 1000) {
                    Function1<Long, Unit> function1 = weakReference.get();
                    if (function1 != null) {
                        function1.invoke2(Long.valueOf(result.getInviteId()));
                        return;
                    }
                    return;
                }
                Function1<ApiException, Unit> function2 = weakReference2.get();
                if (function2 != null) {
                    function2.invoke2(new ApiException(result.getCode()));
                }
            }
        }, new Function1<ApiException, Unit>() { // from class: com.xiaomi.fitness.active.pk.ActivePkRepository.createInviteRecord.2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(ApiException apiException) {
                invoke2(apiException);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public void invoke2(ApiException p1) {
                Intrinsics.checkNotNullParameter(p1, "p1");
                PkLogger.INSTANCE.i(ActivePkRepository.TAG, "createInviteRecord fail " + p1, new Object[0]);
                Function1<ApiException, Unit> function1 = weakReference2.get();
                if (function1 != null) {
                    function1.invoke2(p1);
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getActiveDataList(long j, boolean z, @NotNull Continuation<? super List<AggregatedFitnessData>> continuation) {
        C17671 c17671;
        if (continuation instanceof C17671) {
            c17671 = (C17671) continuation;
            int i = c17671.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17671.label = i - Integer.MIN_VALUE;
            } else {
                c17671 = new C17671(continuation);
            }
        } else {
            c17671 = new C17671(continuation);
        }
        Object activeDataList = c17671.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c17671.label;
        List<AggregatedFitnessData> aggregatedFitnessDataList = null;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(activeDataList);
                ActivePkRequest activePkRequest = getActivePkRequest();
                c17671.label = 1;
                activeDataList = activePkRequest.getActiveDataList(j, z, c17671);
                if (activeDataList == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(activeDataList);
            }
            aggregatedFitnessDataList = ((GetActiveDataListResult) activeDataList).getAggregatedFitnessDataList();
            PkLogger.INSTANCE.i(TAG, "getActiveDataList success ,result is " + aggregatedFitnessDataList, new Object[0]);
            return aggregatedFitnessDataList;
        } catch (Exception e) {
            PkLogger.INSTANCE.i(TAG, "getActiveDataList exception " + e, new Object[0]);
            return aggregatedFitnessDataList;
        }
    }

    @NotNull
    public final ActivePkRequest getActivePkRequest() {
        ActivePkRequest activePkRequest = this.activePkRequest;
        if (activePkRequest != null) {
            return activePkRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("activePkRequest");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Nullable
    public final Object getHistoryPkRecordsDetail(int i, @Nullable Long l, @Nullable Integer num, @Nullable Integer num2, boolean z, @NotNull Continuation<? super GetHistoryPkRecordsResult> continuation) {
        C17681 c17681;
        if (continuation instanceof C17681) {
            c17681 = (C17681) continuation;
            int i2 = c17681.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c17681.label = i2 - Integer.MIN_VALUE;
            } else {
                c17681 = new C17681(continuation);
            }
        } else {
            c17681 = new C17681(continuation);
        }
        C17681 c17682 = c17681;
        Object historyPkRecordsDetail = c17682.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c17682.label;
        GetHistoryPkRecordsResult getHistoryPkRecordsResult = null;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(historyPkRecordsDetail);
                PkLogger.INSTANCE.i(TAG, "getHistoryPkRecordsDetail param next key " + num + ", count:" + num2 + " ", new Object[0]);
                ActivePkRequest activePkRequest = getActivePkRequest();
                c17682.label = 1;
                historyPkRecordsDetail = activePkRequest.getHistoryPkRecordsDetail(i, l, num, num2, z, c17682);
                if (historyPkRecordsDetail == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(historyPkRecordsDetail);
            }
            GetHistoryPkRecordsResult getHistoryPkRecordsResult2 = (GetHistoryPkRecordsResult) historyPkRecordsDetail;
            try {
                PkLogger.INSTANCE.i(TAG, "getHistoryPkRecordsDetail success ,result is " + getHistoryPkRecordsResult2, new Object[0]);
                return getHistoryPkRecordsResult2;
            } catch (Exception e) {
                e = e;
                getHistoryPkRecordsResult = getHistoryPkRecordsResult2;
                PkLogger.INSTANCE.i(TAG, "getHistoryPkRecordsDetail exception " + e, new Object[0]);
                return getHistoryPkRecordsResult;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getInviteRecordUserDetail(@Nullable Long l, @Nullable Long l2, @NotNull Continuation<? super GetInviteRecordUserDetailResult> continuation) {
        C17691 c17691;
        GetInviteRecordUserDetailResult getInviteRecordUserDetailResult;
        if (continuation instanceof C17691) {
            c17691 = (C17691) continuation;
            int i = c17691.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17691.label = i - Integer.MIN_VALUE;
            } else {
                c17691 = new C17691(continuation);
            }
        } else {
            c17691 = new C17691(continuation);
        }
        Object obj = c17691.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c17691.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            GetInviteRecordUserDetailResult getInviteRecordUserDetailResult2 = new GetInviteRecordUserDetailResult(null, -1);
            try {
                ActivePkRequest activePkRequest = getActivePkRequest();
                c17691.L$0 = getInviteRecordUserDetailResult2;
                c17691.label = 1;
                Object inviteDetail = activePkRequest.getInviteDetail(l, l2, c17691);
                if (inviteDetail == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = inviteDetail;
                getInviteRecordUserDetailResult = getInviteRecordUserDetailResult2;
            } catch (Exception e) {
                e = e;
                getInviteRecordUserDetailResult = getInviteRecordUserDetailResult2;
                if (e instanceof ApiException) {
                    getInviteRecordUserDetailResult.setCode(((ApiException) e).getErrorCode());
                }
                PkLogger.INSTANCE.i(TAG, "getUserInviteRecordDetail exception " + e, new Object[0]);
                return getInviteRecordUserDetailResult;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            getInviteRecordUserDetailResult = (GetInviteRecordUserDetailResult) c17691.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception e2) {
                e = e2;
                if (e instanceof ApiException) {
                    getInviteRecordUserDetailResult.setCode(((ApiException) e).getErrorCode());
                }
                PkLogger.INSTANCE.i(TAG, "getUserInviteRecordDetail exception " + e, new Object[0]);
                return getInviteRecordUserDetailResult;
            }
        }
        GetInviteRecordUserDetailResult getInviteRecordUserDetailResult3 = (GetInviteRecordUserDetailResult) obj;
        try {
            PkLogger.INSTANCE.i(TAG, "getUserInviteRecordDetail success ,result is " + getInviteRecordUserDetailResult3, new Object[0]);
            return getInviteRecordUserDetailResult3;
        } catch (Exception e3) {
            e = e3;
            getInviteRecordUserDetailResult = getInviteRecordUserDetailResult3;
            if (e instanceof ApiException) {
                getInviteRecordUserDetailResult.setCode(((ApiException) e).getErrorCode());
            }
            PkLogger.INSTANCE.i(TAG, "getUserInviteRecordDetail exception " + e, new Object[0]);
            return getInviteRecordUserDetailResult;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getInviteRecords(@NotNull Continuation<? super List<InviteRecordDetail>> continuation) {
        C17701 c17701;
        if (continuation instanceof C17701) {
            c17701 = (C17701) continuation;
            int i = c17701.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17701.label = i - Integer.MIN_VALUE;
            } else {
                c17701 = new C17701(continuation);
            }
        } else {
            c17701 = new C17701(continuation);
        }
        Object inviteRecords = c17701.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c17701.label;
        List<InviteRecordDetail> inviteRecordList = null;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(inviteRecords);
                ActivePkRequest activePkRequest = getActivePkRequest();
                c17701.label = 1;
                inviteRecords = activePkRequest.getInviteRecords(c17701);
                if (inviteRecords == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(inviteRecords);
            }
            inviteRecordList = ((GetInviteRecordsResult) inviteRecords).getInviteRecordList();
            PkLogger.INSTANCE.i(TAG, "getInviteRecords success ,result is " + inviteRecordList, new Object[0]);
            return inviteRecordList;
        } catch (Exception e) {
            PkLogger.INSTANCE.i(TAG, "getInviteRecords exception " + e, new Object[0]);
            return inviteRecordList;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getPkAllAggregateHistoryList(@NotNull Continuation<? super List<AggregatePkInfo>> continuation) {
        C17711 c17711;
        if (continuation instanceof C17711) {
            c17711 = (C17711) continuation;
            int i = c17711.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17711.label = i - Integer.MIN_VALUE;
            } else {
                c17711 = new C17711(continuation);
            }
        } else {
            c17711 = new C17711(continuation);
        }
        Object pkAllAggregateHistoryList = c17711.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c17711.label;
        List<AggregatePkInfo> aggregatePkInfoList = null;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(pkAllAggregateHistoryList);
                ActivePkRequest activePkRequest = getActivePkRequest();
                c17711.label = 1;
                pkAllAggregateHistoryList = activePkRequest.getPkAllAggregateHistoryList(c17711);
                if (pkAllAggregateHistoryList == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(pkAllAggregateHistoryList);
            }
            aggregatePkInfoList = ((GetPkAggregateHistoryListResult) pkAllAggregateHistoryList).getAggregatePkInfoList();
            PkLogger.INSTANCE.i(TAG, "getPkAllAggregateHistoryList success ,result is " + aggregatePkInfoList, new Object[0]);
            return aggregatePkInfoList;
        } catch (Exception e) {
            PkLogger.INSTANCE.i(TAG, "getPkAllAggregateHistoryList exception " + e, new Object[0]);
            return aggregatePkInfoList;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getPkEntranceResult(@NotNull Continuation<? super GetEntranceResult> continuation) {
        C17721 c17721;
        if (continuation instanceof C17721) {
            c17721 = (C17721) continuation;
            int i = c17721.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17721.label = i - Integer.MIN_VALUE;
            } else {
                c17721 = new C17721(continuation);
            }
        } else {
            c17721 = new C17721(continuation);
        }
        Object pkEntranceResult = c17721.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c17721.label;
        GetEntranceResult getEntranceResult = null;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(pkEntranceResult);
                ActivePkRequest activePkRequest = getActivePkRequest();
                c17721.label = 1;
                pkEntranceResult = activePkRequest.getPkEntranceResult(c17721);
                if (pkEntranceResult == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(pkEntranceResult);
            }
            GetEntranceResult getEntranceResult2 = (GetEntranceResult) pkEntranceResult;
            try {
                PkLogger.INSTANCE.i(TAG, "getPkEntranceResult success ,result is " + getEntranceResult2, new Object[0]);
                return getEntranceResult2;
            } catch (Exception e) {
                getEntranceResult = getEntranceResult2;
                e = e;
                PkLogger.INSTANCE.i(TAG, "getPkEntranceResult exception " + e, new Object[0]);
                return getEntranceResult;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getPkUserAggregateHistory(long j, @NotNull Continuation<? super AggregatePkInfo> continuation) {
        C17731 c17731;
        if (continuation instanceof C17731) {
            c17731 = (C17731) continuation;
            int i = c17731.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17731.label = i - Integer.MIN_VALUE;
            } else {
                c17731 = new C17731(continuation);
            }
        } else {
            c17731 = new C17731(continuation);
        }
        Object pkUserAggregateHistory = c17731.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c17731.label;
        AggregatePkInfo aggregatePkInfo = null;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(pkUserAggregateHistory);
                ActivePkRequest activePkRequest = getActivePkRequest();
                c17731.label = 1;
                pkUserAggregateHistory = activePkRequest.getPkUserAggregateHistory(j, c17731);
                if (pkUserAggregateHistory == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(pkUserAggregateHistory);
            }
            GetPkUserAggregateHistoryResult getPkUserAggregateHistoryResult = (GetPkUserAggregateHistoryResult) pkUserAggregateHistory;
            aggregatePkInfo = getPkUserAggregateHistoryResult.getAggregatePkInfo();
            if (aggregatePkInfo != null) {
                aggregatePkInfo.setMedalUrl(getPkUserAggregateHistoryResult.getMedalIcon());
            }
            PkLogger.INSTANCE.i(TAG, "getPkUserAggregateHistory success ,result is " + aggregatePkInfo, new Object[0]);
        } catch (Exception e) {
            PkLogger.INSTANCE.i(TAG, "getPkUserAggregateHistory exception " + e, new Object[0]);
        }
        return aggregatePkInfo;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getProcessPkRecordsDetail(@NotNull Continuation<? super GetProcessPkRecordsResult> continuation) {
        C17741 c17741;
        if (continuation instanceof C17741) {
            c17741 = (C17741) continuation;
            int i = c17741.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17741.label = i - Integer.MIN_VALUE;
            } else {
                c17741 = new C17741(continuation);
            }
        } else {
            c17741 = new C17741(continuation);
        }
        Object processPkRecordsDetail = c17741.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c17741.label;
        GetProcessPkRecordsResult getProcessPkRecordsResult = null;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(processPkRecordsDetail);
                PkLogger.INSTANCE.i(TAG, "getProcessPkRecordsDetail", new Object[0]);
                ActivePkRequest activePkRequest = getActivePkRequest();
                c17741.label = 1;
                processPkRecordsDetail = activePkRequest.getProcessPkRecordsDetail(c17741);
                if (processPkRecordsDetail == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(processPkRecordsDetail);
            }
            GetProcessPkRecordsResult getProcessPkRecordsResult2 = (GetProcessPkRecordsResult) processPkRecordsDetail;
            try {
                PkLogger.INSTANCE.i(TAG, "getProcessPkRecordsDetail success ,result is " + getProcessPkRecordsResult2, new Object[0]);
                return getProcessPkRecordsResult2;
            } catch (Exception e) {
                getProcessPkRecordsResult = getProcessPkRecordsResult2;
                e = e;
                PkLogger.INSTANCE.i(TAG, "getProcessPkRecordsDetail exception " + e, new Object[0]);
                return getProcessPkRecordsResult;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getRecommendFriendsList(@NotNull Continuation<? super List<UserInfo>> continuation) {
        C17751 c17751;
        if (continuation instanceof C17751) {
            c17751 = (C17751) continuation;
            int i = c17751.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17751.label = i - Integer.MIN_VALUE;
            } else {
                c17751 = new C17751(continuation);
            }
        } else {
            c17751 = new C17751(continuation);
        }
        Object recommendFriendsList = c17751.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c17751.label;
        List<UserInfo> userInfoList = null;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(recommendFriendsList);
                ActivePkRequest activePkRequest = getActivePkRequest();
                c17751.label = 1;
                recommendFriendsList = activePkRequest.getRecommendFriendsList(c17751);
                if (recommendFriendsList == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(recommendFriendsList);
            }
            userInfoList = ((GetRecommendFriends) recommendFriendsList).getUserInfoList();
            PkLogger.INSTANCE.i(TAG, "getRecommendFriendsList success ,result is " + userInfoList, new Object[0]);
            return userInfoList;
        } catch (Exception e) {
            PkLogger.INSTANCE.i(TAG, "getRecommendFriendsList exception " + e, new Object[0]);
            return userInfoList;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Nullable
    public final Object getSportRecords(long j, long j2, @Nullable Integer num, @Nullable String str, @NotNull Continuation<? super GetPkSportRecordsResult> continuation) {
        C17761 c17761;
        if (continuation instanceof C17761) {
            c17761 = (C17761) continuation;
            int i = c17761.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17761.label = i - Integer.MIN_VALUE;
            } else {
                c17761 = new C17761(continuation);
            }
        } else {
            c17761 = new C17761(continuation);
        }
        C17761 c17762 = c17761;
        Object sportRecords = c17762.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c17762.label;
        GetPkSportRecordsResult getPkSportRecordsResult = null;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(sportRecords);
                ActivePkRequest activePkRequest = getActivePkRequest();
                c17762.label = 1;
                sportRecords = activePkRequest.getSportRecords(j, j2, num, str, c17762);
                if (sportRecords == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(sportRecords);
            }
            GetPkSportRecordsResult getPkSportRecordsResult2 = (GetPkSportRecordsResult) sportRecords;
            try {
                PkLogger.INSTANCE.i(TAG, "getSportRecords success ,result is " + getPkSportRecordsResult2, new Object[0]);
                return getPkSportRecordsResult2;
            } catch (Exception e) {
                e = e;
                getPkSportRecordsResult = getPkSportRecordsResult2;
                PkLogger.INSTANCE.i(TAG, "getSportRecords exception " + e, new Object[0]);
                return getPkSportRecordsResult;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    public final Object getUserPkRecordDetail(long j, long j2, @NotNull Continuation<? super PkRecordDetail> continuation) {
        C17771 c17771;
        if (continuation instanceof C17771) {
            c17771 = (C17771) continuation;
            int i = c17771.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17771.label = i - Integer.MIN_VALUE;
            } else {
                c17771 = new C17771(continuation);
            }
        } else {
            c17771 = new C17771(continuation);
        }
        C17771 c17772 = c17771;
        Object userPkRecordDetail = c17772.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c17772.label;
        PkRecordDetail pkRecordDetail = null;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(userPkRecordDetail);
                ActivePkRequest activePkRequest = getActivePkRequest();
                c17772.label = 1;
                userPkRecordDetail = activePkRequest.getUserPkRecordDetail(j, j2, c17772);
                if (userPkRecordDetail == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(userPkRecordDetail);
            }
            pkRecordDetail = ((GetUserPkRecordDetailResult) userPkRecordDetail).getPkRecordDetail();
            PkLogger.INSTANCE.i(TAG, "getUserPkRecordDetail success ,result is " + pkRecordDetail, new Object[0]);
            return pkRecordDetail;
        } catch (Exception e) {
            PkLogger.INSTANCE.i(TAG, "getUserPkRecordDetail exception " + e, new Object[0]);
            return pkRecordDetail;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getWithDrawPrivacyUserList(@NotNull Continuation<? super List<WithDrawPrivacyUser>> continuation) {
        C17781 c17781;
        if (continuation instanceof C17781) {
            c17781 = (C17781) continuation;
            int i = c17781.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17781.label = i - Integer.MIN_VALUE;
            } else {
                c17781 = new C17781(continuation);
            }
        } else {
            c17781 = new C17781(continuation);
        }
        Object withDrawPrivacyUserList = c17781.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c17781.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(withDrawPrivacyUserList);
                ActivePkRequest activePkRequest = getActivePkRequest();
                c17781.label = 1;
                withDrawPrivacyUserList = activePkRequest.getWithDrawPrivacyUserList(c17781);
                if (withDrawPrivacyUserList == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(withDrawPrivacyUserList);
            }
            List<WithDrawPrivacyUser> list = ((GetWithDrawPrivacyUsersResult) withDrawPrivacyUserList).getList();
            PkLogger.INSTANCE.i(TAG, "getWithDrawPrivacyUserList success ,result is " + list, new Object[0]);
            return list;
        } catch (Exception e) {
            PkLogger.INSTANCE.i(TAG, "getWithDrawPrivacyUserList exception " + e, new Object[0]);
            return null;
        }
    }

    public final void setActivePkRequest(@NotNull ActivePkRequest activePkRequest) {
        Intrinsics.checkNotNullParameter(activePkRequest, "<set-?>");
        this.activePkRequest = activePkRequest;
    }

    public final void updateWithDrawRecordIdsAsync(@Nullable List<Long> ids, @NotNull Function1<Object, Unit> onSuccess, @NotNull Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        if (ArrayUtils.isEmpty(ids)) {
            onSuccess.invoke2(0);
            return;
        }
        ActivePkRequest activePkRequest = getActivePkRequest();
        Intrinsics.checkNotNull(ids);
        activePkRequest.updateWithDrawRecordIdsAsync(ids, onSuccess, onFail);
    }
}
