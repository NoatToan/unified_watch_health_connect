package com.xiaomi.fitness.active.pk.net;

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
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import defpackage.ngh;
import defpackage.u0a;
import defpackage.uua;
import defpackage.xfi;
import defpackage.zk9;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@BaseUrl(host = "https://hlth.io.mi.com/", path = "ops/v1/")
@Secret(pathPrefix = "")
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 $2\u00020\u0001:\u0001$J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0001\u0010\b\u001a\u00020\tH§@¢\u0006\u0002\u0010\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\b\u001a\u00020\tH§@¢\u0006\u0002\u0010\nJ\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\b\u001a\u00020\tH§@¢\u0006\u0002\u0010\nJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003H§@¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\b\u001a\u00020\tH§@¢\u0006\u0002\u0010\nJ\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010\b\u001a\u00020\tH§@¢\u0006\u0002\u0010\nJ\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\b\b\u0001\u0010\b\u001a\u00020\tH§@¢\u0006\u0002\u0010\nJ\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\b\b\u0001\u0010\b\u001a\u00020\tH§@¢\u0006\u0002\u0010\nJ\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0003H§@¢\u0006\u0002\u0010\u0005J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00032\b\b\u0001\u0010\b\u001a\u00020\tH§@¢\u0006\u0002\u0010\nJ\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\b\b\u0001\u0010\b\u001a\u00020\tH§@¢\u0006\u0002\u0010\nJ\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00032\b\b\u0001\u0010\b\u001a\u00020\tH§@¢\u0006\u0002\u0010\nJ\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0003H§@¢\u0006\u0002\u0010\u0005J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\b\u001a\u00020\tH§@¢\u0006\u0002\u0010\n¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/active/pk/net/ActivePkApiService;", "", "getRecommendFriends", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/active/pk/net/model/GetRecommendFriends;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createInviteRecord", "Lcom/xiaomi/fitness/active/pk/net/model/CreateInviteRecordResult;", "data", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "acceptOrRejectInvite", "Lcom/xiaomi/fitness/active/pk/net/model/CodeResult;", "getInviteUserDetail", "Lcom/xiaomi/fitness/active/pk/net/model/GetInviteRecordUserDetailResult;", "getInviteRecords", "Lcom/xiaomi/fitness/active/pk/net/model/GetInviteRecordsResult;", "getPkEntranceResult", "Lcom/xiaomi/fitness/active/pk/net/model/GetEntranceResult;", "getProcessPkRecordsDetail", "Lcom/xiaomi/fitness/active/pk/net/model/GetProcessPkRecordsResult;", "getHistoryPkRecordsDetail", "Lcom/xiaomi/fitness/active/pk/net/model/GetHistoryPkRecordsResult;", "getPkUserAggregateHistory", "Lcom/xiaomi/fitness/active/pk/net/model/GetPkUserAggregateHistoryResult;", "getPkAggregateHistoryList", "Lcom/xiaomi/fitness/active/pk/net/model/GetPkAggregateHistoryListResult;", "getUserPkRecordDetail", "Lcom/xiaomi/fitness/active/pk/net/model/GetUserPkRecordDetailResult;", "getSportRecords", "Lcom/xiaomi/fitness/active/pk/net/model/GetPkSportRecordsResult;", "getActiveDataList", "Lcom/xiaomi/fitness/active/pk/net/model/GetActiveDataListResult;", "getWithDrawPrivacyUserList", "Lcom/xiaomi/fitness/active/pk/net/model/GetWithDrawPrivacyUsersResult;", "updateWithDrawPrivacy", "Companion", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ActivePkApiService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String HTTP_HOST = "https://hlth.io.mi.com/";

    @NotNull
    public static final String HTTP_PATH = "ops/v1/";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/active/pk/net/ActivePkApiService$Companion;", "", "<init>", "()V", "HTTP_PATH", "", "HTTP_HOST", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String HTTP_HOST = "https://hlth.io.mi.com/";

        @NotNull
        public static final String HTTP_PATH = "ops/v1/";

        private Companion() {
        }
    }

    @u0a
    @ngh("pk/accept_invite")
    @Nullable
    Object acceptOrRejectInvite(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<CodeResult>> continuation);

    @u0a
    @ngh("pk/create_invite")
    @Nullable
    Object createInviteRecord(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<CreateInviteRecordResult>> continuation);

    @Nullable
    @uua("pk/get_regular_goal_list")
    Object getActiveDataList(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<GetActiveDataListResult>> continuation);

    @Nullable
    @uua("pk/get_competition_record_list")
    Object getHistoryPkRecordsDetail(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<GetHistoryPkRecordsResult>> continuation);

    @Nullable
    @uua("pk/get_user_invite_records")
    Object getInviteRecords(@NotNull Continuation<? super BaseResult<GetInviteRecordsResult>> continuation);

    @Nullable
    @uua("pk/get_user_invite_detail")
    Object getInviteUserDetail(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<GetInviteRecordUserDetailResult>> continuation);

    @Nullable
    @uua("pk/get_competed_friends_list")
    Object getPkAggregateHistoryList(@NotNull Continuation<? super BaseResult<GetPkAggregateHistoryListResult>> continuation);

    @Nullable
    @uua("pk/get_pk_entrance")
    Object getPkEntranceResult(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<GetEntranceResult>> continuation);

    @Nullable
    @uua("pk/get_pk_statistics")
    Object getPkUserAggregateHistory(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<GetPkUserAggregateHistoryResult>> continuation);

    @Nullable
    @uua("pk/get_competing_record_list")
    Object getProcessPkRecordsDetail(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<GetProcessPkRecordsResult>> continuation);

    @Nullable
    @uua("pk/get_recommend_friends")
    Object getRecommendFriends(@NotNull Continuation<? super BaseResult<GetRecommendFriends>> continuation);

    @Nullable
    @uua("pk/get_sport_records")
    Object getSportRecords(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<GetPkSportRecordsResult>> continuation);

    @Nullable
    @uua("pk/get_pk_detail")
    Object getUserPkRecordDetail(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<GetUserPkRecordDetailResult>> continuation);

    @Nullable
    @uua("pk/get_withdraw_privacy_users")
    Object getWithDrawPrivacyUserList(@NotNull Continuation<? super BaseResult<GetWithDrawPrivacyUsersResult>> continuation);

    @u0a
    @ngh("pk/update_withdraw_privacy_pk_record")
    @Nullable
    Object updateWithDrawPrivacy(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<Object>> continuation);
}
