package com.xiaomi.fitness.active.pk.net;

import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.active.pk.PkConstants;
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
import com.xiaomi.fitness.active.pk.util.PkLogger;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.extensions.HttpPoint;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import com.xiaomi.fitness.sport.route.detail.server.RouteRequest;
import dagger.hilt.android.EntryPointAccessors;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 E2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001EB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0006H\u0086@¢\u0006\u0002\u0010\u0007JM\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\u000fj\b\u0012\u0004\u0012\u00020\u000e`\r2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u000fj\u0002`\u0011¢\u0006\u0002\u0010\u0013J]\u0010\u0014\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0017\u001a\u00020\u00182\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\t0\u000fj\b\u0012\u0004\u0012\u00020\u0019`\r2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u000fj\u0002`\u0011¢\u0006\u0002\u0010\u001aJ\"\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000bH\u0086@¢\u0006\u0002\u0010\u001dJ\u000e\u0010\u001e\u001a\u00020\u001fH\u0086@¢\u0006\u0002\u0010\u0007J\u000e\u0010 \u001a\u00020!H\u0086@¢\u0006\u0002\u0010\u0007J\u000e\u0010\"\u001a\u00020#H\u0086@¢\u0006\u0002\u0010\u0007J\u001e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010(J>\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\b\u0010'\u001a\u0004\u0018\u00010\u000b2\b\u0010-\u001a\u0004\u0018\u00010,2\b\u0010.\u001a\u0004\u0018\u00010,2\b\b\u0002\u0010/\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u00100J\u0016\u00101\u001a\u0002022\u0006\u0010'\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u00103J\u000e\u00104\u001a\u000205H\u0086@¢\u0006\u0002\u0010\u0007J2\u00106\u001a\u0002072\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u000b2\b\u0010.\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u000108H\u0086@¢\u0006\u0002\u00109J\u001e\u0010:\u001a\u00020;2\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010=J\u000e\u0010>\u001a\u00020?H\u0086@¢\u0006\u0002\u0010\u0007JO\u0010@\u001a\u00020\t2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000b0B2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\t0\u000fj\b\u0012\u0004\u0012\u00020C`\r2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u000fj\u0002`\u0011¢\u0006\u0002\u0010D¨\u0006F"}, d2 = {"Lcom/xiaomi/fitness/active/pk/net/ActivePkRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/active/pk/net/ActivePkApiService;", "<init>", "()V", "getRecommendFriendsList", "Lcom/xiaomi/fitness/active/pk/net/model/GetRecommendFriends;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createInviteRecordAsync", "", "inviteeUid", "", "onSuccess", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "Lcom/xiaomi/fitness/active/pk/net/model/CreateInviteRecordResult;", "Lkotlin/Function1;", "onFail", "Lcom/xiaomi/fitness/net/extensions/OnFail;", "Lcom/xiaomi/fitness/net/response/ApiException;", "(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "acceptOrRejectInvite", PkConstants.PARAM_INVITE_ID, PkConstants.PARAM_INVITER_UID, "isAccept", "", "Lcom/xiaomi/fitness/active/pk/net/model/CodeResult;", "(Ljava/lang/Long;Ljava/lang/Long;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getInviteDetail", "Lcom/xiaomi/fitness/active/pk/net/model/GetInviteRecordUserDetailResult;", "(Ljava/lang/Long;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getInviteRecords", "Lcom/xiaomi/fitness/active/pk/net/model/GetInviteRecordsResult;", "getPkEntranceResult", "Lcom/xiaomi/fitness/active/pk/net/model/GetEntranceResult;", "getProcessPkRecordsDetail", "Lcom/xiaomi/fitness/active/pk/net/model/GetProcessPkRecordsResult;", "getUserPkRecordDetail", "Lcom/xiaomi/fitness/active/pk/net/model/GetUserPkRecordDetailResult;", PkConstants.PARAM_PK_ID, PkConstants.PARAM_PK_UID, "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHistoryPkRecordsDetail", "Lcom/xiaomi/fitness/active/pk/net/model/GetHistoryPkRecordsResult;", "pkStatus", "", "nextKey", "count", "reverse", "(ILjava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPkUserAggregateHistory", "Lcom/xiaomi/fitness/active/pk/net/model/GetPkUserAggregateHistoryResult;", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPkAllAggregateHistoryList", "Lcom/xiaomi/fitness/active/pk/net/model/GetPkAggregateHistoryListResult;", "getSportRecords", "Lcom/xiaomi/fitness/active/pk/net/model/GetPkSportRecordsResult;", "", "(JJLjava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getActiveDataList", "Lcom/xiaomi/fitness/active/pk/net/model/GetActiveDataListResult;", "isOwn", "(JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWithDrawPrivacyUserList", "Lcom/xiaomi/fitness/active/pk/net/model/GetWithDrawPrivacyUsersResult;", "updateWithDrawRecordIdsAsync", "ids", "", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Companion", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nActivePkRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivePkRequest.kt\ncom/xiaomi/fitness/active/pk/net/ActivePkRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n+ 3 HttpExtension.kt\ncom/xiaomi/fitness/net/extensions/HttpExtensionKt\n*L\n1#1,193:1\n141#2:194\n89#2,5:198\n89#2,5:203\n141#2:208\n141#2:212\n141#2:216\n141#2:220\n141#2:224\n141#2:228\n141#2:232\n141#2:236\n141#2:240\n141#2:244\n141#2:248\n89#2,5:252\n31#3:195\n28#3,2:196\n31#3:209\n28#3,2:210\n31#3:213\n28#3,2:214\n31#3:217\n28#3,2:218\n31#3:221\n28#3,2:222\n31#3:225\n28#3,2:226\n31#3:229\n28#3,2:230\n31#3:233\n28#3,2:234\n31#3:237\n28#3,2:238\n31#3:241\n28#3,2:242\n31#3:245\n28#3,2:246\n31#3:249\n28#3,2:250\n*S KotlinDebug\n*F\n+ 1 ActivePkRequest.kt\ncom/xiaomi/fitness/active/pk/net/ActivePkRequest\n*L\n29#1:194\n38#1:198,5\n60#1:203,5\n90#1:208\n94#1:212\n105#1:216\n115#1:220\n122#1:224\n140#1:228\n146#1:232\n150#1:236\n168#1:240\n175#1:244\n179#1:248\n187#1:252,5\n29#1:195\n29#1:196,2\n90#1:209\n90#1:210,2\n94#1:213\n94#1:214,2\n105#1:217\n105#1:218,2\n115#1:221\n115#1:222,2\n122#1:225\n122#1:226,2\n140#1:229\n140#1:230,2\n146#1:233\n146#1:234,2\n150#1:237\n150#1:238,2\n168#1:241\n168#1:242,2\n175#1:245\n175#1:246,2\n179#1:249\n179#1:250,2\n*E\n"})
public final class ActivePkRequest extends BaseRequest<ActivePkApiService> {

    @NotNull
    private static final String PARAM_INVITEE_UID = "invitee_uid";

    @NotNull
    private static final String PARAM_INVITER_UID = "inviter_uid";

    @NotNull
    private static final String PARAM_INVITE_ID = "invite_id";

    @NotNull
    private static final String PARAM_PK_ID = "pk_id";

    @NotNull
    private static final String PARAM_PK_UID = "pk_uid";

    @NotNull
    private static final String PARAM_ZONE_OFFSET_IN_SEC = "zone_offset";

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.net.ActivePkRequest$acceptOrRejectInvite$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/active/pk/net/model/CodeResult;", "it", "Lcom/xiaomi/fitness/active/pk/net/ActivePkApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.net.ActivePkRequest$acceptOrRejectInvite$1", f = "ActivePkRequest.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<ActivePkApiService, Continuation<? super BaseResult<CodeResult>>, Object> {
        final /* synthetic */ Long $inviteId;
        final /* synthetic */ Long $inviterUid;
        final /* synthetic */ boolean $isAccept;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ActivePkRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Long l, Long l2, boolean z, ActivePkRequest activePkRequest, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$inviteId = l;
            this.$inviterUid = l2;
            this.$isAccept = z;
            this.this$0 = activePkRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$inviteId, this.$inviterUid, this.$isAccept, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ActivePkApiService activePkApiService, Continuation<? super BaseResult<CodeResult>> continuation) {
            return ((AnonymousClass1) create(activePkApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ActivePkApiService activePkApiService = (ActivePkApiService) this.L$0;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Long l = this.$inviteId;
                if (l != null) {
                    linkedHashMap.put(ActivePkRequest.PARAM_INVITE_ID, Boxing.boxLong(l.longValue()));
                }
                Long l2 = this.$inviterUid;
                if (l2 != null) {
                    linkedHashMap.put(ActivePkRequest.PARAM_INVITER_UID, Boxing.boxLong(l2.longValue()));
                }
                linkedHashMap.put(ActivePkRequest.PARAM_ZONE_OFFSET_IN_SEC, Boxing.boxInt(FitnessDateUtils.getCurrentTZOffsetInSec()));
                linkedHashMap.put("action", Boxing.boxInt(this.$isAccept ? 1 : 2));
                String json = this.this$0.getMGson().toJson(linkedHashMap);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = activePkApiService.acceptOrRejectInvite(json, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.net.ActivePkRequest$createInviteRecordAsync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/active/pk/net/model/CreateInviteRecordResult;", "it", "Lcom/xiaomi/fitness/active/pk/net/ActivePkApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.net.ActivePkRequest$createInviteRecordAsync$1", f = "ActivePkRequest.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17921 extends SuspendLambda implements Function2<ActivePkApiService, Continuation<? super BaseResult<CreateInviteRecordResult>>, Object> {
        final /* synthetic */ Long $inviteeUid;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ActivePkRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17921(Long l, ActivePkRequest activePkRequest, Continuation<? super C17921> continuation) {
            super(2, continuation);
            this.$inviteeUid = l;
            this.this$0 = activePkRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17921 c17921 = new C17921(this.$inviteeUid, this.this$0, continuation);
            c17921.L$0 = obj;
            return c17921;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ActivePkApiService activePkApiService, Continuation<? super BaseResult<CreateInviteRecordResult>> continuation) {
            return ((C17921) create(activePkApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ActivePkApiService activePkApiService = (ActivePkApiService) this.L$0;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Long l = this.$inviteeUid;
                if (l != null) {
                    linkedHashMap.put(ActivePkRequest.PARAM_INVITEE_UID, Boxing.boxLong(l.longValue()));
                }
                linkedHashMap.put(ActivePkRequest.PARAM_ZONE_OFFSET_IN_SEC, Boxing.boxInt(FitnessDateUtils.getCurrentTZOffsetInSec()));
                String json = this.this$0.getMGson().toJson(linkedHashMap);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = activePkApiService.createInviteRecord(json, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.net.ActivePkRequest$getActiveDataList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.net.ActivePkRequest", f = "ActivePkRequest.kt", i = {}, l = {175}, m = "getActiveDataList", n = {}, s = {})
    public static final class C17931 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C17931(Continuation<? super C17931> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ActivePkRequest.this.getActiveDataList(0L, false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.net.ActivePkRequest$getHistoryPkRecordsDetail$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.net.ActivePkRequest", f = "ActivePkRequest.kt", i = {}, l = {140}, m = "getHistoryPkRecordsDetail", n = {}, s = {})
    public static final class C17941 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C17941(Continuation<? super C17941> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ActivePkRequest.this.getHistoryPkRecordsDetail(0, null, null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.net.ActivePkRequest$getInviteDetail$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.net.ActivePkRequest", f = "ActivePkRequest.kt", i = {}, l = {90}, m = "getInviteDetail", n = {}, s = {})
    public static final class C17951 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C17951(Continuation<? super C17951> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ActivePkRequest.this.getInviteDetail(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.net.ActivePkRequest$getInviteRecords$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.net.ActivePkRequest", f = "ActivePkRequest.kt", i = {}, l = {94}, m = "getInviteRecords", n = {}, s = {})
    public static final class C17961 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C17961(Continuation<? super C17961> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ActivePkRequest.this.getInviteRecords(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.net.ActivePkRequest$getPkAllAggregateHistoryList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.net.ActivePkRequest", f = "ActivePkRequest.kt", i = {}, l = {150}, m = "getPkAllAggregateHistoryList", n = {}, s = {})
    public static final class C17971 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C17971(Continuation<? super C17971> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ActivePkRequest.this.getPkAllAggregateHistoryList(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.net.ActivePkRequest$getPkEntranceResult$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.net.ActivePkRequest", f = "ActivePkRequest.kt", i = {}, l = {99}, m = "getPkEntranceResult", n = {}, s = {})
    public static final class C17981 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C17981(Continuation<? super C17981> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ActivePkRequest.this.getPkEntranceResult(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.net.ActivePkRequest$getPkUserAggregateHistory$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.net.ActivePkRequest", f = "ActivePkRequest.kt", i = {}, l = {144}, m = "getPkUserAggregateHistory", n = {}, s = {})
    public static final class C17991 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C17991(Continuation<? super C17991> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ActivePkRequest.this.getPkUserAggregateHistory(0L, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.net.ActivePkRequest$getProcessPkRecordsDetail$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.net.ActivePkRequest", f = "ActivePkRequest.kt", i = {}, l = {109}, m = "getProcessPkRecordsDetail", n = {}, s = {})
    public static final class C18001 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C18001(Continuation<? super C18001> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ActivePkRequest.this.getProcessPkRecordsDetail(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.net.ActivePkRequest$getRecommendFriendsList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.net.ActivePkRequest", f = "ActivePkRequest.kt", i = {}, l = {29}, m = "getRecommendFriendsList", n = {}, s = {})
    public static final class C18011 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C18011(Continuation<? super C18011> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ActivePkRequest.this.getRecommendFriendsList(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.net.ActivePkRequest$getSportRecords$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.net.ActivePkRequest", f = "ActivePkRequest.kt", i = {}, l = {168}, m = "getSportRecords", n = {}, s = {})
    public static final class C18021 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C18021(Continuation<? super C18021> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ActivePkRequest.this.getSportRecords(0L, 0L, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.net.ActivePkRequest$getUserPkRecordDetail$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.net.ActivePkRequest", f = "ActivePkRequest.kt", i = {}, l = {122}, m = "getUserPkRecordDetail", n = {}, s = {})
    public static final class C18031 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C18031(Continuation<? super C18031> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ActivePkRequest.this.getUserPkRecordDetail(0L, 0L, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.net.ActivePkRequest$getWithDrawPrivacyUserList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.net.ActivePkRequest", f = "ActivePkRequest.kt", i = {}, l = {179}, m = "getWithDrawPrivacyUserList", n = {}, s = {})
    public static final class C18041 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C18041(Continuation<? super C18041> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ActivePkRequest.this.getWithDrawPrivacyUserList(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.net.ActivePkRequest$updateWithDrawRecordIdsAsync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "", "it", "Lcom/xiaomi/fitness/active/pk/net/ActivePkApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.net.ActivePkRequest$updateWithDrawRecordIdsAsync$1", f = "ActivePkRequest.kt", i = {}, l = {SportReportBaseParser.ReportType.avgDescentRate}, m = "invokeSuspend", n = {}, s = {})
    public static final class C18051 extends SuspendLambda implements Function2<ActivePkApiService, Continuation<? super BaseResult<Object>>, Object> {
        final /* synthetic */ List<Long> $ids;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18051(List<Long> list, Continuation<? super C18051> continuation) {
            super(2, continuation);
            this.$ids = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C18051 c18051 = ActivePkRequest.this.new C18051(this.$ids, continuation);
            c18051.L$0 = obj;
            return c18051;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ActivePkApiService activePkApiService, Continuation<? super BaseResult<Object>> continuation) {
            return ((C18051) create(activePkApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ActivePkApiService activePkApiService = (ActivePkApiService) this.L$0;
                String json = ActivePkRequest.this.getMGson().toJson(Collections.singletonMap("pk_record_ids", this.$ids));
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = activePkApiService.updateWithDrawPrivacy(json, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    public static /* synthetic */ void createInviteRecordAsync$default(ActivePkRequest activePkRequest, Long l, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        activePkRequest.createInviteRecordAsync(l, function1, function2);
    }

    public static /* synthetic */ Object getHistoryPkRecordsDetail$default(ActivePkRequest activePkRequest, int i, Long l, Integer num, Integer num2, boolean z, Continuation continuation, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            z = true;
        }
        return activePkRequest.getHistoryPkRecordsDetail(i, l, num, num2, z, continuation);
    }

    public final void acceptOrRejectInvite(@Nullable Long inviteId, @Nullable Long inviterUid, boolean isAccept, @NotNull Function1<? super CodeResult, Unit> onSuccess, @NotNull Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass1(inviteId, inviterUid, isAccept, this, null)).error(onFail).success(onSuccess);
    }

    public final void createInviteRecordAsync(@Nullable Long inviteeUid, @NotNull Function1<? super CreateInviteRecordResult, Unit> onSuccess, @NotNull Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C17921(inviteeUid, this, null)).error(onFail).success(onSuccess);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getActiveDataList(long j, boolean z, @NotNull Continuation<? super GetActiveDataListResult> continuation) {
        C17931 c17931;
        if (continuation instanceof C17931) {
            c17931 = (C17931) continuation;
            int i = c17931.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17931.label = i - Integer.MIN_VALUE;
            } else {
                c17931 = new C17931(continuation);
            }
        } else {
            c17931 = new C17931(continuation);
        }
        Object activeDataList = c17931.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c17931.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(activeDataList);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("primary", Boxing.boxBoolean(z));
            linkedHashMap.put(PARAM_PK_ID, Boxing.boxLong(j));
            ActivePkApiService mService = getMService();
            String json = getMGson().toJson(linkedHashMap);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            c17931.label = 1;
            activeDataList = mService.getActiveDataList(json, c17931);
            if (activeDataList == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(activeDataList);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(activeDataList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getHistoryPkRecordsDetail(int i, @Nullable Long l, @Nullable Integer num, @Nullable Integer num2, boolean z, @NotNull Continuation<? super GetHistoryPkRecordsResult> continuation) {
        C17941 c17941;
        if (continuation instanceof C17941) {
            c17941 = (C17941) continuation;
            int i2 = c17941.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c17941.label = i2 - Integer.MIN_VALUE;
            } else {
                c17941 = new C17941(continuation);
            }
        } else {
            c17941 = new C17941(continuation);
        }
        Object historyPkRecordsDetail = c17941.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c17941.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(historyPkRecordsDetail);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("pk_status", Boxing.boxInt(i));
            linkedHashMap.put("reverse", Boxing.boxBoolean(z));
            if (num2 != null) {
                linkedHashMap.put("count", Boxing.boxInt(num2.intValue()));
            }
            if (l != null) {
                linkedHashMap.put(PARAM_PK_UID, Boxing.boxLong(l.longValue()));
            }
            if (num != null) {
                linkedHashMap.put(RouteRequest.KEY_NEXT_KEY, Boxing.boxInt(num.intValue()));
            }
            ActivePkApiService mService = getMService();
            String json = getMGson().toJson(linkedHashMap);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            c17941.label = 1;
            historyPkRecordsDetail = mService.getHistoryPkRecordsDetail(json, c17941);
            if (historyPkRecordsDetail == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(historyPkRecordsDetail);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(historyPkRecordsDetail);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getInviteDetail(@Nullable Long l, @Nullable Long l2, @NotNull Continuation<? super GetInviteRecordUserDetailResult> continuation) {
        C17951 c17951;
        if (continuation instanceof C17951) {
            c17951 = (C17951) continuation;
            int i = c17951.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17951.label = i - Integer.MIN_VALUE;
            } else {
                c17951 = new C17951(continuation);
            }
        } else {
            c17951 = new C17951(continuation);
        }
        Object inviteUserDetail = c17951.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c17951.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(inviteUserDetail);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (l != null) {
                linkedHashMap.put(PARAM_INVITE_ID, Boxing.boxLong(l.longValue()));
            }
            if (l2 != null) {
                linkedHashMap.put(PARAM_INVITER_UID, Boxing.boxLong(l2.longValue()));
            }
            ActivePkApiService mService = getMService();
            String json = getMGson().toJson(linkedHashMap);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            c17951.label = 1;
            inviteUserDetail = mService.getInviteUserDetail(json, c17951);
            if (inviteUserDetail == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(inviteUserDetail);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(inviteUserDetail);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getInviteRecords(@NotNull Continuation<? super GetInviteRecordsResult> continuation) {
        C17961 c17961;
        if (continuation instanceof C17961) {
            c17961 = (C17961) continuation;
            int i = c17961.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17961.label = i - Integer.MIN_VALUE;
            } else {
                c17961 = new C17961(continuation);
            }
        } else {
            c17961 = new C17961(continuation);
        }
        Object inviteRecords = c17961.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c17961.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(inviteRecords);
            ActivePkApiService mService = getMService();
            c17961.label = 1;
            inviteRecords = mService.getInviteRecords(c17961);
            if (inviteRecords == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(inviteRecords);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(inviteRecords);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getPkAllAggregateHistoryList(@NotNull Continuation<? super GetPkAggregateHistoryListResult> continuation) {
        C17971 c17971;
        if (continuation instanceof C17971) {
            c17971 = (C17971) continuation;
            int i = c17971.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17971.label = i - Integer.MIN_VALUE;
            } else {
                c17971 = new C17971(continuation);
            }
        } else {
            c17971 = new C17971(continuation);
        }
        Object pkAggregateHistoryList = c17971.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c17971.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(pkAggregateHistoryList);
            ActivePkApiService mService = getMService();
            c17971.label = 1;
            pkAggregateHistoryList = mService.getPkAggregateHistoryList(c17971);
            if (pkAggregateHistoryList == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(pkAggregateHistoryList);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(pkAggregateHistoryList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getPkEntranceResult(@NotNull Continuation<? super GetEntranceResult> continuation) {
        C17981 c17981;
        if (continuation instanceof C17981) {
            c17981 = (C17981) continuation;
            int i = c17981.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17981.label = i - Integer.MIN_VALUE;
            } else {
                c17981 = new C17981(continuation);
            }
        } else {
            c17981 = new C17981(continuation);
        }
        Object pkEntranceResult = c17981.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c17981.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(pkEntranceResult);
            PkLogger.INSTANCE.i("PkRequest", "time_zone_in_sec " + FitnessDateUtils.getCurrentTZOffsetInSec(), new Object[0]);
            ActivePkApiService mService = getMService();
            String json = getMGson().toJson(Collections.singletonMap(PARAM_ZONE_OFFSET_IN_SEC, Boxing.boxInt(FitnessDateUtils.getCurrentTZOffsetInSec())));
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            c17981.label = 1;
            pkEntranceResult = mService.getPkEntranceResult(json, c17981);
            if (pkEntranceResult == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(pkEntranceResult);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(pkEntranceResult);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getPkUserAggregateHistory(long j, @NotNull Continuation<? super GetPkUserAggregateHistoryResult> continuation) {
        C17991 c17991;
        if (continuation instanceof C17991) {
            c17991 = (C17991) continuation;
            int i = c17991.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17991.label = i - Integer.MIN_VALUE;
            } else {
                c17991 = new C17991(continuation);
            }
        } else {
            c17991 = new C17991(continuation);
        }
        Object pkUserAggregateHistory = c17991.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c17991.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(pkUserAggregateHistory);
            ActivePkApiService mService = getMService();
            String json = getMGson().toJson(Collections.singletonMap(PARAM_PK_UID, Boxing.boxLong(j)));
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            c17991.label = 1;
            pkUserAggregateHistory = mService.getPkUserAggregateHistory(json, c17991);
            if (pkUserAggregateHistory == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(pkUserAggregateHistory);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(pkUserAggregateHistory);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getProcessPkRecordsDetail(@NotNull Continuation<? super GetProcessPkRecordsResult> continuation) {
        C18001 c18001;
        if (continuation instanceof C18001) {
            c18001 = (C18001) continuation;
            int i = c18001.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c18001.label = i - Integer.MIN_VALUE;
            } else {
                c18001 = new C18001(continuation);
            }
        } else {
            c18001 = new C18001(continuation);
        }
        Object processPkRecordsDetail = c18001.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c18001.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(processPkRecordsDetail);
            ActivePkApiService mService = getMService();
            String json = getMGson().toJson(Collections.singletonMap(PARAM_ZONE_OFFSET_IN_SEC, Boxing.boxInt(FitnessDateUtils.getCurrentTZOffsetInSec())));
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            c18001.label = 1;
            processPkRecordsDetail = mService.getProcessPkRecordsDetail(json, c18001);
            if (processPkRecordsDetail == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(processPkRecordsDetail);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(processPkRecordsDetail);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getRecommendFriendsList(@NotNull Continuation<? super GetRecommendFriends> continuation) {
        C18011 c18011;
        if (continuation instanceof C18011) {
            c18011 = (C18011) continuation;
            int i = c18011.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c18011.label = i - Integer.MIN_VALUE;
            } else {
                c18011 = new C18011(continuation);
            }
        } else {
            c18011 = new C18011(continuation);
        }
        Object recommendFriends = c18011.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c18011.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(recommendFriends);
            ActivePkApiService mService = getMService();
            c18011.label = 1;
            recommendFriends = mService.getRecommendFriends(c18011);
            if (recommendFriends == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(recommendFriends);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(recommendFriends);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getSportRecords(long j, long j2, @Nullable Integer num, @Nullable String str, @NotNull Continuation<? super GetPkSportRecordsResult> continuation) {
        C18021 c18021;
        if (continuation instanceof C18021) {
            c18021 = (C18021) continuation;
            int i = c18021.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c18021.label = i - Integer.MIN_VALUE;
            } else {
                c18021 = new C18021(continuation);
            }
        } else {
            c18021 = new C18021(continuation);
        }
        Object sportRecords = c18021.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c18021.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(sportRecords);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(PARAM_PK_ID, Boxing.boxLong(j));
            linkedHashMap.put(PARAM_PK_UID, Boxing.boxLong(j2));
            if (num != null) {
                linkedHashMap.put("limit", Boxing.boxInt(num.intValue()));
            }
            if (str != null) {
                linkedHashMap.put(RouteRequest.KEY_NEXT_KEY, str);
            }
            ActivePkApiService mService = getMService();
            String json = getMGson().toJson(linkedHashMap);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            c18021.label = 1;
            sportRecords = mService.getSportRecords(json, c18021);
            if (sportRecords == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(sportRecords);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(sportRecords);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getUserPkRecordDetail(long j, long j2, @NotNull Continuation<? super GetUserPkRecordDetailResult> continuation) {
        C18031 c18031;
        if (continuation instanceof C18031) {
            c18031 = (C18031) continuation;
            int i = c18031.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c18031.label = i - Integer.MIN_VALUE;
            } else {
                c18031 = new C18031(continuation);
            }
        } else {
            c18031 = new C18031(continuation);
        }
        Object userPkRecordDetail = c18031.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c18031.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(userPkRecordDetail);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(PARAM_PK_ID, Boxing.boxLong(j));
            linkedHashMap.put(PARAM_PK_UID, Boxing.boxLong(j2));
            ActivePkApiService mService = getMService();
            String json = getMGson().toJson(linkedHashMap);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            c18031.label = 1;
            userPkRecordDetail = mService.getUserPkRecordDetail(json, c18031);
            if (userPkRecordDetail == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(userPkRecordDetail);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(userPkRecordDetail);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getWithDrawPrivacyUserList(@NotNull Continuation<? super GetWithDrawPrivacyUsersResult> continuation) {
        C18041 c18041;
        if (continuation instanceof C18041) {
            c18041 = (C18041) continuation;
            int i = c18041.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c18041.label = i - Integer.MIN_VALUE;
            } else {
                c18041 = new C18041(continuation);
            }
        } else {
            c18041 = new C18041(continuation);
        }
        Object withDrawPrivacyUserList = c18041.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c18041.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(withDrawPrivacyUserList);
            ActivePkApiService mService = getMService();
            c18041.label = 1;
            withDrawPrivacyUserList = mService.getWithDrawPrivacyUserList(c18041);
            if (withDrawPrivacyUserList == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(withDrawPrivacyUserList);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(withDrawPrivacyUserList);
    }

    public final void updateWithDrawRecordIdsAsync(@NotNull List<Long> ids, @NotNull Function1<Object, Unit> onSuccess, @NotNull Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C18051(ids, null)).error(onFail).success(onSuccess);
    }
}
