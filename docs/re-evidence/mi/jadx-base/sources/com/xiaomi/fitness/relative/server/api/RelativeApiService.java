package com.xiaomi.fitness.relative.server.api;

import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import com.xiaomi.fitness.relative.server.model.AccountUserInfo;
import com.xiaomi.fitness.relative.server.model.DeleteRelativeResult;
import com.xiaomi.fitness.relative.server.model.GetFamilyMemberResult;
import com.xiaomi.fitness.relative.server.model.GetInviteLinkIdResult;
import com.xiaomi.fitness.relative.server.model.GetRelativeListResult;
import com.xiaomi.fitness.relative.server.model.GetRelativeSettingsResult;
import com.xiaomi.fitness.relative.server.model.GetSharedDataTypesResult;
import com.xiaomi.fitness.relative.server.model.GetTopSubscriptionResult;
import com.xiaomi.fitness.relative.server.model.ModifyRelativeNodeResult;
import com.xiaomi.fitness.relative.server.model.OperateInviteResult;
import com.xiaomi.fitness.relative.server.model.SendInviteResult;
import com.xiaomi.fitness.relative.server.model.SharedDataBooleanResult;
import com.xiaomi.fitness.relative.server.model.ValidateSharedDataTypeResult;
import defpackage.ngh;
import defpackage.u0a;
import defpackage.uua;
import defpackage.xfi;
import defpackage.zk9;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@BaseUrl(host = "https://hlth.io.mi.com/", path = "app/v1/")
@Secret(pathPrefix = "")
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u0000 &2\u00020\u0001:\u0001&J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003H§@¢\u0006\u0002\u0010\u0015J\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0003H§@¢\u0006\u0002\u0010\u0015J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0003H§@¢\u0006\u0002\u0010\u0015J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/relative/server/api/RelativeApiService;", "", "getSharedDataTypes", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/relative/server/model/GetSharedDataTypesResult;", "data", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAppliedSharedDataTypes", "applySharedDataTypes", "Lcom/xiaomi/fitness/relative/server/model/SharedDataBooleanResult;", "operateAppliedSharedDataTypes", "updateSharedDataTypes", "getTopicSubscriptions", "Lcom/xiaomi/fitness/relative/server/model/GetTopSubscriptionResult;", "updateTopicSubscription", "upSettings", "getSettings", "Lcom/xiaomi/fitness/relative/server/model/GetRelativeSettingsResult;", "getRelativeList", "Lcom/xiaomi/fitness/relative/server/model/GetRelativeListResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFamilyMembers", "Lcom/xiaomi/fitness/relative/server/model/GetFamilyMemberResult;", "deleteRelative", "Lcom/xiaomi/fitness/relative/server/model/DeleteRelativeResult;", "getInviteLinkId", "Lcom/xiaomi/fitness/relative/server/model/GetInviteLinkIdResult;", "sendInvitation", "Lcom/xiaomi/fitness/relative/server/model/SendInviteResult;", "operateInvitation", "Lcom/xiaomi/fitness/relative/server/model/OperateInviteResult;", "getUserInfoByVerifyId", "Lcom/xiaomi/fitness/relative/server/model/AccountUserInfo;", "modifyRelativeNode", "Lcom/xiaomi/fitness/relative/server/model/ModifyRelativeNodeResult;", "validateAppliedSharedDataTypes", "Lcom/xiaomi/fitness/relative/server/model/ValidateSharedDataTypeResult;", "Companion", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface RelativeApiService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String HTTP_HOST = "https://hlth.io.mi.com/";

    @NotNull
    public static final String HTTP_PATH = "app/v1/";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/relative/server/api/RelativeApiService$Companion;", "", "<init>", "()V", "HTTP_PATH", "", "HTTP_HOST", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String HTTP_HOST = "https://hlth.io.mi.com/";

        @NotNull
        public static final String HTTP_PATH = "app/v1/";

        private Companion() {
        }
    }

    @Nullable
    @uua("relatives/apply_shared_data_types")
    Object applySharedDataTypes(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<SharedDataBooleanResult>> continuation);

    @u0a
    @ngh("relatives/delete_relative")
    @Nullable
    Object deleteRelative(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<DeleteRelativeResult>> continuation);

    @Nullable
    @uua("relatives/get_applied_shared_data_types")
    Object getAppliedSharedDataTypes(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<GetSharedDataTypesResult>> continuation);

    @Nullable
    @uua("relatives/get_family_member")
    Object getFamilyMembers(@NotNull Continuation<? super BaseResult<GetFamilyMemberResult>> continuation);

    @Nullable
    @uua("relatives/get_invite_unique_id")
    Object getInviteLinkId(@NotNull Continuation<? super BaseResult<GetInviteLinkIdResult>> continuation);

    @Nullable
    @uua("relatives/get_relative_list")
    Object getRelativeList(@NotNull Continuation<? super BaseResult<GetRelativeListResult>> continuation);

    @Nullable
    @uua("relatives/get_settings")
    Object getSettings(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<GetRelativeSettingsResult>> continuation);

    @Nullable
    @uua("relatives/get_shared_data_types")
    Object getSharedDataTypes(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<GetSharedDataTypesResult>> continuation);

    @Nullable
    @uua("relatives/get_topic_subscriptions")
    Object getTopicSubscriptions(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<GetTopSubscriptionResult>> continuation);

    @Nullable
    @uua("relatives/verify_userinfo_by_id")
    Object getUserInfoByVerifyId(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<AccountUserInfo>> continuation);

    @u0a
    @ngh("relatives/modify_relative_note")
    @Nullable
    Object modifyRelativeNode(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<ModifyRelativeNodeResult>> continuation);

    @u0a
    @ngh("relatives/operate_applied_shared_data_types")
    @Nullable
    Object operateAppliedSharedDataTypes(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<SharedDataBooleanResult>> continuation);

    @u0a
    @ngh("relatives/operate_invite")
    @Nullable
    Object operateInvitation(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<OperateInviteResult>> continuation);

    @u0a
    @ngh("relatives/send_invite")
    @Nullable
    Object sendInvitation(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<SendInviteResult>> continuation);

    @u0a
    @ngh("relatives/up_settings")
    @Nullable
    Object upSettings(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<SharedDataBooleanResult>> continuation);

    @u0a
    @ngh("relatives/update_shared_data_types")
    @Nullable
    Object updateSharedDataTypes(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<SharedDataBooleanResult>> continuation);

    @u0a
    @ngh("relatives/update_topic_subscription")
    @Nullable
    Object updateTopicSubscription(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<SharedDataBooleanResult>> continuation);

    @u0a
    @ngh("relatives/validate_applied_shared_data_types")
    @Nullable
    Object validateAppliedSharedDataTypes(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<ValidateSharedDataTypeResult>> continuation);
}
