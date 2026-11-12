package com.xiaomi.fitness.relative.server;

import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.data.aggregation.cloud.CloudKey;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.sp.RelativeDataPreference;
import com.xiaomi.fitness.account.api.AccountRequest;
import com.xiaomi.fitness.account.api.bean.QrInfo;
import com.xiaomi.fitness.active.pk.PkConstants;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.relative.export.RelativeResult;
import com.xiaomi.fitness.relative.server.RelativeShipRequest;
import com.xiaomi.fitness.relative.server.api.RelativeRequest;
import com.xiaomi.fitness.relative.server.model.AbnormalLatestTime;
import com.xiaomi.fitness.relative.server.model.AcceptInvitationModel;
import com.xiaomi.fitness.relative.server.model.AccountUserInfo;
import com.xiaomi.fitness.relative.server.model.DeleteRelativeResult;
import com.xiaomi.fitness.relative.server.model.GetFamilyMemberResult;
import com.xiaomi.fitness.relative.server.model.GetInviteLinkIdResult;
import com.xiaomi.fitness.relative.server.model.GetRelativeListResult;
import com.xiaomi.fitness.relative.server.model.GetRelativeSettingsResult;
import com.xiaomi.fitness.relative.server.model.GetSharedDataTypesResult;
import com.xiaomi.fitness.relative.server.model.GetTopSubscriptionResult;
import com.xiaomi.fitness.relative.server.model.InviteAuthContent;
import com.xiaomi.fitness.relative.server.model.ModifyRelativeNodeResult;
import com.xiaomi.fitness.relative.server.model.OperateInviteResult;
import com.xiaomi.fitness.relative.server.model.RelativeSetting;
import com.xiaomi.fitness.relative.server.model.RelativeUserInfo;
import com.xiaomi.fitness.relative.server.model.SendInvitationModel;
import com.xiaomi.fitness.relative.server.model.SendInviteParam;
import com.xiaomi.fitness.relative.server.model.SendInviteResult;
import com.xiaomi.fitness.relative.server.model.SharedDataBooleanResult;
import com.xiaomi.fitness.relative.server.model.TopicSubscriptions;
import com.xiaomi.fitness.relative.server.model.ValidateSharedDataTypeResult;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 R2\u00020\u0001:\u0001RB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00110\u0010J\u0016\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u0018\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00120\u00110\u0010J\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00110\u0010J\u001a\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00110\u00102\u0006\u0010\u001d\u001a\u00020\u001eJ\u001a\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00110\u00102\u0006\u0010\u001d\u001a\u00020 J\"\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00110\u00102\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u001aJ5\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00110\u00102\b\u0010%\u001a\u0004\u0018\u00010\u001a2\b\u0010&\u001a\u0004\u0018\u00010\u001a2\b\u0010'\u001a\u0004\u0018\u00010\u001a¢\u0006\u0002\u0010(J\"\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00110\u00102\u0006\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020,J\u0012\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u00110\u0010J\u001a\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00110\u00102\u0006\u0010*\u001a\u00020\u001aJ \u00100\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\u00120\u00110\u00102\u0006\u0010*\u001a\u00020\u001aJ \u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\u00120\u00110\u00102\u0006\u0010*\u001a\u00020\u001aJ \u00103\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\u00120\u00110\u00102\u0006\u0010*\u001a\u00020\u001aJ(\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00110\u00102\u0006\u0010*\u001a\u00020\u001a2\f\u00105\u001a\b\u0012\u0004\u0012\u0002010\u0012JH\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00110\u00102\u0006\u0010*\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u001a2\f\u00107\u001a\b\u0012\u0004\u0012\u0002010\u00122\u000e\u00108\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u0012J:\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00110\u00102\u0006\u0010*\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u001a2\u000e\u00105\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u0012J\"\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00110\u00102\u0006\u0010;\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u001aJ(\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00110\u00102\u0006\u0010*\u001a\u00020\u001a2\f\u00105\u001a\b\u0012\u0004\u0012\u0002010\u0012J.\u0010=\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0\u00120\u00110\u00102\u0006\u0010*\u001a\u00020\u001a2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020,0\u0012J*\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00110\u00102\u0006\u0010*\u001a\u00020\u001a2\u0006\u0010?\u001a\u00020,2\u0006\u0010A\u001a\u00020BJ.\u0010C\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0\u00120\u00110\u00102\u0006\u0010*\u001a\u00020\u001a2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020,0\u0012J(\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00110\u00102\u0006\u0010*\u001a\u00020\u001a2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020D0\u0012JK\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002HI0\u00110\u0010\"\u0004\b\u0000\u0010I2\"\u0010J\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002HI0\u00110L\u0012\u0006\u0012\u0004\u0018\u00010\u00010K2\u0006\u0010M\u001a\u00020,H\u0002¢\u0006\u0002\u0010NJ \u0010O\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010\u00122\u000e\u0010P\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u0012H\u0002J \u0010Q\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u00122\u000e\u0010E\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010\u0012H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r¨\u0006S"}, d2 = {"Lcom/xiaomi/fitness/relative/server/RelativeShipRequest;", "", "<init>", "()V", "cloudRequest", "Lcom/xiaomi/fitness/relative/server/api/RelativeRequest;", "getCloudRequest", "()Lcom/xiaomi/fitness/relative/server/api/RelativeRequest;", "cloudRequest$delegate", "Lkotlin/Lazy;", "accountRequest", "Lcom/xiaomi/fitness/account/api/AccountRequest;", "getAccountRequest", "()Lcom/xiaomi/fitness/account/api/AccountRequest;", "accountRequest$delegate", "getRelativeList", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/fitness/relative/export/RelativeResult;", "", "Lcom/xiaomi/fitness/relative/server/model/RelativeUserInfo;", "checkHasNewData", "", "userList", "getFamilyMembers", "Lcom/xiaomi/fitness/relative/server/model/AccountUserInfo;", "getInviteLinkId", "", "sendInvitation", "", "model", "Lcom/xiaomi/fitness/relative/server/model/SendInvitationModel;", "acceptInvitation", "Lcom/xiaomi/fitness/relative/server/model/AcceptInvitationModel;", "refuseInvitation", "msgId", PkConstants.PARAM_INVITE_ID, "getUserInfoByUid", "accountUid", "inviteLinkId", "qrCodeId", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Landroidx/lifecycle/LiveData;", "modifyRelativeNode", "relativeId", "relativeNode", "", "getPersonalQrCode", "Lcom/xiaomi/fitness/account/api/bean/QrInfo;", "deleteRelative", "getSharedDataTypesToRelative", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "getSharedDataTypesToMe", "getAppliedSharedDataTypes", "applySharedDataTypes", "dataTypes", "acceptAppliedSharedDataTypes", "appliedTypes", "confirmedTypes", "refuseAppliedSharedDataTypes", "validateAppliedSharedDataTypes", "relativeUid", "updateSharedDataTypes", "getTopicSubscriptions", "Lcom/xiaomi/fitness/relative/server/model/TopicSubscriptions;", "topic", "updateTopicSubscription", "act", "", "getRelativeSettings", "Lcom/xiaomi/fitness/relative/server/model/RelativeSetting;", "keys", "upRelativeSettings", "settings", "cloudRequestAsync", "T", "realCall", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "callName", "(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Landroidx/lifecycle/LiveData;", "convertToCloudDataKey", "types", "convertToHomeDataType", "Companion", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRelativeShipRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RelativeShipRequest.kt\ncom/xiaomi/fitness/relative/server/RelativeShipRequest\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,428:1\n1863#2:429\n1863#2,2:430\n1864#2:432\n*S KotlinDebug\n*F\n+ 1 RelativeShipRequest.kt\ncom/xiaomi/fitness/relative/server/RelativeShipRequest\n*L\n51#1:429\n55#1:430,2\n51#1:432\n*E\n"})
public final class RelativeShipRequest {

    @NotNull
    private static final String TAG = "RelativeShipRequest";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<RelativeShipRequest> instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: mik
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RelativeShipRequest.instance_delegate$lambda$4();
        }
    });

    /* JADX INFO: renamed from: cloudRequest$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy cloudRequest = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: nik
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RelativeShipRequest.cloudRequest_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: accountRequest$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy accountRequest = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: oik
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RelativeShipRequest.accountRequest_delegate$lambda$1();
        }
    });

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/relative/server/RelativeShipRequest$Companion;", "", "<init>", "()V", "TAG", "", "instance", "Lcom/xiaomi/fitness/relative/server/RelativeShipRequest;", "getInstance", "()Lcom/xiaomi/fitness/relative/server/RelativeShipRequest;", "instance$delegate", "Lkotlin/Lazy;", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RelativeShipRequest getInstance() {
            return (RelativeShipRequest) RelativeShipRequest.instance$delegate.getValue();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.server.RelativeShipRequest$acceptAppliedSharedDataTypes$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/relative/export/RelativeResult;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.server.RelativeShipRequest$acceptAppliedSharedDataTypes$1", f = "RelativeShipRequest.kt", i = {}, l = {284}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super RelativeResult<Boolean>>, Object> {
        final /* synthetic */ List<HomeDataType> $appliedTypes;
        final /* synthetic */ List<HomeDataType> $confirmedTypes;
        final /* synthetic */ long $inviteId;
        final /* synthetic */ long $msgId;
        final /* synthetic */ long $relativeId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(List<? extends HomeDataType> list, List<? extends HomeDataType> list2, long j, long j2, long j3, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.$appliedTypes = list;
            this.$confirmedTypes = list2;
            this.$relativeId = j;
            this.$msgId = j2;
            this.$inviteId = j3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RelativeShipRequest.this.new AnonymousClass1(this.$appliedTypes, this.$confirmedTypes, this.$relativeId, this.$msgId, this.$inviteId, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List<String> listConvertToCloudDataKey = RelativeShipRequest.this.convertToCloudDataKey(this.$appliedTypes);
                if (listConvertToCloudDataKey == null) {
                    listConvertToCloudDataKey = CollectionsKt__CollectionsKt.emptyList();
                }
                List<String> listConvertToCloudDataKey2 = RelativeShipRequest.this.convertToCloudDataKey(this.$confirmedTypes);
                RelativeRequest cloudRequest = RelativeShipRequest.this.getCloudRequest();
                long j = this.$relativeId;
                long j2 = this.$msgId;
                long j3 = this.$inviteId;
                this.label = 1;
                obj = cloudRequest.acceptAppliedSharedDataTypes(j, j2, j3, listConvertToCloudDataKey, listConvertToCloudDataKey2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return new RelativeResult(Boxing.boxBoolean(((SharedDataBooleanResult) obj).getResult()), 0, null, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super RelativeResult<Boolean>> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.server.RelativeShipRequest$acceptInvitation$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/relative/export/RelativeResult;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.server.RelativeShipRequest$acceptInvitation$1", f = "RelativeShipRequest.kt", i = {}, l = {140}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27561 extends SuspendLambda implements Function1<Continuation<? super RelativeResult<Boolean>>, Object> {
        final /* synthetic */ AcceptInvitationModel $model;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27561(AcceptInvitationModel acceptInvitationModel, Continuation<? super C27561> continuation) {
            super(1, continuation);
            this.$model = acceptInvitationModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RelativeShipRequest.this.new C27561(this.$model, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List listConvertToCloudDataKey = RelativeShipRequest.this.convertToCloudDataKey(this.$model.getAuthTypes());
                InviteAuthContent inviteAuthContent = (this.$model.getAuthTimeScope() == null && ((list = listConvertToCloudDataKey) == null || list.isEmpty())) ? null : new InviteAuthContent(listConvertToCloudDataKey, this.$model.getAuthTimeScope());
                RelativeRequest cloudRequest = RelativeShipRequest.this.getCloudRequest();
                long msgId = this.$model.getMsgId();
                long inviteId = this.$model.getInviteId();
                String relativeNode = this.$model.getRelativeNode();
                this.label = 1;
                obj = cloudRequest.acceptInvitation(msgId, inviteId, relativeNode, inviteAuthContent, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return new RelativeResult(Boxing.boxBoolean(((OperateInviteResult) obj).getResult()), 0, null, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super RelativeResult<Boolean>> continuation) {
            return ((C27561) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.server.RelativeShipRequest$applySharedDataTypes$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/relative/export/RelativeResult;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.server.RelativeShipRequest$applySharedDataTypes$1", f = "RelativeShipRequest.kt", i = {}, l = {SportSummary.VERSION_103}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27571 extends SuspendLambda implements Function1<Continuation<? super RelativeResult<Boolean>>, Object> {
        final /* synthetic */ List<HomeDataType> $dataTypes;
        final /* synthetic */ long $relativeId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C27571(List<? extends HomeDataType> list, long j, Continuation<? super C27571> continuation) {
            super(1, continuation);
            this.$dataTypes = list;
            this.$relativeId = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RelativeShipRequest.this.new C27571(this.$dataTypes, this.$relativeId, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List<String> listConvertToCloudDataKey = RelativeShipRequest.this.convertToCloudDataKey(this.$dataTypes);
                List<String> list = listConvertToCloudDataKey;
                if (list == null || list.isEmpty()) {
                    FitnessLogUtils.i(RelativeShipRequest.TAG, "applySharedDataTypes: no keys to add ");
                    return new RelativeResult(Boxing.boxBoolean(false), 0, null, 6, null);
                }
                RelativeRequest cloudRequest = RelativeShipRequest.this.getCloudRequest();
                long j = this.$relativeId;
                this.label = 1;
                obj = cloudRequest.applySharedDataTypes(j, listConvertToCloudDataKey, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return new RelativeResult(Boxing.boxBoolean(((SharedDataBooleanResult) obj).getResult()), 0, null, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super RelativeResult<Boolean>> continuation) {
            return ((C27571) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.server.RelativeShipRequest$cloudRequestAsync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "T", "Landroidx/lifecycle/LiveDataScope;", "Lcom/xiaomi/fitness/relative/export/RelativeResult;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.server.RelativeShipRequest$cloudRequestAsync$1", f = "RelativeShipRequest.kt", i = {0, 1}, l = {408, 409, 413, 415}, m = "invokeSuspend", n = {"$this$liveData", "$this$liveData"}, s = {"L$0", "L$0"})
    public static final class C27581<T> extends SuspendLambda implements Function2<LiveDataScope<RelativeResult<T>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $callName;
        final /* synthetic */ Function1<Continuation<? super RelativeResult<T>>, Object> $realCall;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C27581(Function1<? super Continuation<? super RelativeResult<T>>, ? extends Object> function1, String str, Continuation<? super C27581> continuation) {
            super(2, continuation);
            this.$realCall = function1;
            this.$callName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C27581 c27581 = new C27581(this.$realCall, this.$callName, continuation);
            c27581.L$0 = obj;
            return c27581;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<RelativeResult<T>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C27581) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [androidx.lifecycle.LiveDataScope, int] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        jadx.core.utils.exceptions.JadxRuntimeException: Not class type: int
        	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:59)
        	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:32)
        	at jadx.core.dex.nodes.RootNode.resolveClass(RootNode.java:508)
        	at jadx.core.dex.nodes.utils.TypeUtils.getClassTypeVars(TypeUtils.java:53)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:175)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r1 = this.label;
            try {
                if (r1 != 0) {
                    if (r1 == 1) {
                        liveDataScope = (LiveDataScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else if (r1 == 2) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (r1 != 3 && r1 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                liveDataScope = (LiveDataScope) this.L$0;
                Function1<Continuation<? super RelativeResult<T>>, Object> function1 = this.$realCall;
                this.L$0 = liveDataScope;
                this.label = 1;
                obj = function1.invoke2(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.L$0 = liveDataScope;
                this.label = 2;
                if (liveDataScope.emit((RelativeResult) obj, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Exception e) {
                FitnessLogUtils.e(RelativeShipRequest.TAG, this.$callName, e);
                if (e instanceof ApiException) {
                    RelativeResult relativeResult = new RelativeResult(null, ((ApiException) e).getErrorCode(), e.getMessage());
                    this.L$0 = null;
                    this.label = 3;
                    if (r1.emit(relativeResult, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    RelativeResult relativeResult2 = new RelativeResult(null, 1002, e.getMessage());
                    this.L$0 = null;
                    this.label = 4;
                    if (r1.emit(relativeResult2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.server.RelativeShipRequest$deleteRelative$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/relative/export/RelativeResult;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.server.RelativeShipRequest$deleteRelative$1", f = "RelativeShipRequest.kt", i = {}, l = {202}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27591 extends SuspendLambda implements Function1<Continuation<? super RelativeResult<Boolean>>, Object> {
        final /* synthetic */ long $relativeId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27591(long j, Continuation<? super C27591> continuation) {
            super(1, continuation);
            this.$relativeId = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RelativeShipRequest.this.new C27591(this.$relativeId, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RelativeRequest cloudRequest = RelativeShipRequest.this.getCloudRequest();
                long j = this.$relativeId;
                this.label = 1;
                obj = cloudRequest.deleteRelative(j, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return new RelativeResult(Boxing.boxBoolean(((DeleteRelativeResult) obj).getResult()), 0, null, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super RelativeResult<Boolean>> continuation) {
            return ((C27591) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.server.RelativeShipRequest$getAppliedSharedDataTypes$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/relative/export/RelativeResult;", "", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.server.RelativeShipRequest$getAppliedSharedDataTypes$1", f = "RelativeShipRequest.kt", i = {}, l = {238}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27601 extends SuspendLambda implements Function1<Continuation<? super RelativeResult<List<? extends HomeDataType>>>, Object> {
        final /* synthetic */ long $relativeId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27601(long j, Continuation<? super C27601> continuation) {
            super(1, continuation);
            this.$relativeId = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RelativeShipRequest.this.new C27601(this.$relativeId, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object invoke2(Continuation<? super RelativeResult<List<? extends HomeDataType>>> continuation) {
            return invoke2((Continuation<? super RelativeResult<List<HomeDataType>>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RelativeRequest cloudRequest = RelativeShipRequest.this.getCloudRequest();
                long j = this.$relativeId;
                this.label = 1;
                obj = cloudRequest.getAppliedSharedDataTypes(j, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return new RelativeResult(RelativeShipRequest.this.convertToHomeDataType(((GetSharedDataTypesResult) obj).getKeys()), 0, null, 6, null);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super RelativeResult<List<HomeDataType>>> continuation) {
            return ((C27601) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.server.RelativeShipRequest$getFamilyMembers$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/relative/export/RelativeResult;", "", "Lcom/xiaomi/fitness/relative/server/model/AccountUserInfo;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.server.RelativeShipRequest$getFamilyMembers$1", f = "RelativeShipRequest.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27611 extends SuspendLambda implements Function1<Continuation<? super RelativeResult<List<? extends AccountUserInfo>>>, Object> {
        int label;

        public C27611(Continuation<? super C27611> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RelativeShipRequest.this.new C27611(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object invoke2(Continuation<? super RelativeResult<List<? extends AccountUserInfo>>> continuation) {
            return invoke2((Continuation<? super RelativeResult<List<AccountUserInfo>>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RelativeRequest cloudRequest = RelativeShipRequest.this.getCloudRequest();
                this.label = 1;
                obj = cloudRequest.getFamilyMembers(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return new RelativeResult(((GetFamilyMemberResult) obj).getUserList(), 0, null, 6, null);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super RelativeResult<List<AccountUserInfo>>> continuation) {
            return ((C27611) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.server.RelativeShipRequest$getInviteLinkId$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/relative/export/RelativeResult;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.server.RelativeShipRequest$getInviteLinkId$1", f = "RelativeShipRequest.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27621 extends SuspendLambda implements Function1<Continuation<? super RelativeResult<Long>>, Object> {
        int label;

        public C27621(Continuation<? super C27621> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RelativeShipRequest.this.new C27621(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RelativeRequest cloudRequest = RelativeShipRequest.this.getCloudRequest();
                this.label = 1;
                obj = cloudRequest.getInviteLinkId(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return new RelativeResult(Boxing.boxLong(((GetInviteLinkIdResult) obj).getInviteLinkId()), 0, null, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super RelativeResult<Long>> continuation) {
            return ((C27621) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.server.RelativeShipRequest$getPersonalQrCode$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/relative/export/RelativeResult;", "Lcom/xiaomi/fitness/account/api/bean/QrInfo;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.server.RelativeShipRequest$getPersonalQrCode$1", f = "RelativeShipRequest.kt", i = {}, l = {192}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27631 extends SuspendLambda implements Function1<Continuation<? super RelativeResult<QrInfo>>, Object> {
        int label;

        public C27631(Continuation<? super C27631> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RelativeShipRequest.this.new C27631(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccountRequest accountRequest = RelativeShipRequest.this.getAccountRequest();
                this.label = 1;
                obj = accountRequest.getPersonalQrCode(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return new RelativeResult((QrInfo) obj, 0, null, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super RelativeResult<QrInfo>> continuation) {
            return ((C27631) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.server.RelativeShipRequest$getRelativeList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/relative/export/RelativeResult;", "", "Lcom/xiaomi/fitness/relative/server/model/RelativeUserInfo;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.server.RelativeShipRequest$getRelativeList$1", f = "RelativeShipRequest.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27641 extends SuspendLambda implements Function1<Continuation<? super RelativeResult<List<? extends RelativeUserInfo>>>, Object> {
        int label;

        public C27641(Continuation<? super C27641> continuation) {
            super(1, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invokeSuspend$lambda$0(RelativeUserInfo relativeUserInfo, RelativeUserInfo relativeUserInfo2) {
            return (int) (relativeUserInfo2.getLatestDataTime() - relativeUserInfo.getLatestDataTime());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invokeSuspend$lambda$1(Function2 function2, Object obj, Object obj2) {
            return ((Number) function2.invoke(obj, obj2)).intValue();
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RelativeShipRequest.this.new C27641(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object invoke2(Continuation<? super RelativeResult<List<? extends RelativeUserInfo>>> continuation) {
            return invoke2((Continuation<? super RelativeResult<List<RelativeUserInfo>>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RelativeRequest cloudRequest = RelativeShipRequest.this.getCloudRequest();
                this.label = 1;
                obj = cloudRequest.getRelativeList(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            List<RelativeUserInfo> relativeUserList = ((GetRelativeListResult) obj).getRelativeUserList();
            List<RelativeUserInfo> list = relativeUserList;
            if (list != null && !list.isEmpty()) {
                RelativeShipRequest.this.checkHasNewData(relativeUserList);
                final Function2 function2 = new Function2() { // from class: com.xiaomi.fitness.relative.server.a
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return Integer.valueOf(RelativeShipRequest.C27641.invokeSuspend$lambda$0((RelativeUserInfo) obj2, (RelativeUserInfo) obj3));
                    }
                };
                Collections.sort(relativeUserList, new Comparator() { // from class: com.xiaomi.fitness.relative.server.b
                    @Override // java.util.Comparator
                    public final int compare(Object obj2, Object obj3) {
                        return RelativeShipRequest.C27641.invokeSuspend$lambda$1(function2, obj2, obj3);
                    }
                });
            }
            return new RelativeResult(relativeUserList, 0, null, 6, null);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super RelativeResult<List<RelativeUserInfo>>> continuation) {
            return ((C27641) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.server.RelativeShipRequest$getRelativeSettings$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/relative/export/RelativeResult;", "", "Lcom/xiaomi/fitness/relative/server/model/RelativeSetting;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.server.RelativeShipRequest$getRelativeSettings$1", f = "RelativeShipRequest.kt", i = {}, l = {383}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27651 extends SuspendLambda implements Function1<Continuation<? super RelativeResult<List<? extends RelativeSetting>>>, Object> {
        final /* synthetic */ List<String> $keys;
        final /* synthetic */ long $relativeId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27651(long j, List<String> list, Continuation<? super C27651> continuation) {
            super(1, continuation);
            this.$relativeId = j;
            this.$keys = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RelativeShipRequest.this.new C27651(this.$relativeId, this.$keys, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object invoke2(Continuation<? super RelativeResult<List<? extends RelativeSetting>>> continuation) {
            return invoke2((Continuation<? super RelativeResult<List<RelativeSetting>>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RelativeRequest cloudRequest = RelativeShipRequest.this.getCloudRequest();
                long j = this.$relativeId;
                List<String> list = this.$keys;
                this.label = 1;
                obj = cloudRequest.getRelativeSettings(j, list, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return new RelativeResult(((GetRelativeSettingsResult) obj).getSettings(), 0, null, 6, null);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super RelativeResult<List<RelativeSetting>>> continuation) {
            return ((C27651) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.server.RelativeShipRequest$getSharedDataTypesToMe$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/relative/export/RelativeResult;", "", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.server.RelativeShipRequest$getSharedDataTypesToMe$1", f = "RelativeShipRequest.kt", i = {}, l = {226}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27661 extends SuspendLambda implements Function1<Continuation<? super RelativeResult<List<? extends HomeDataType>>>, Object> {
        final /* synthetic */ long $relativeId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27661(long j, Continuation<? super C27661> continuation) {
            super(1, continuation);
            this.$relativeId = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RelativeShipRequest.this.new C27661(this.$relativeId, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object invoke2(Continuation<? super RelativeResult<List<? extends HomeDataType>>> continuation) {
            return invoke2((Continuation<? super RelativeResult<List<HomeDataType>>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RelativeRequest cloudRequest = RelativeShipRequest.this.getCloudRequest();
                long j = this.$relativeId;
                this.label = 1;
                obj = cloudRequest.getSharedDataTypes(j, 2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return new RelativeResult(RelativeShipRequest.this.convertToHomeDataType(((GetSharedDataTypesResult) obj).getKeys()), 0, null, 6, null);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super RelativeResult<List<HomeDataType>>> continuation) {
            return ((C27661) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.server.RelativeShipRequest$getSharedDataTypesToRelative$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/relative/export/RelativeResult;", "", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.server.RelativeShipRequest$getSharedDataTypesToRelative$1", f = "RelativeShipRequest.kt", i = {}, l = {214}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27671 extends SuspendLambda implements Function1<Continuation<? super RelativeResult<List<? extends HomeDataType>>>, Object> {
        final /* synthetic */ long $relativeId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27671(long j, Continuation<? super C27671> continuation) {
            super(1, continuation);
            this.$relativeId = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RelativeShipRequest.this.new C27671(this.$relativeId, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object invoke2(Continuation<? super RelativeResult<List<? extends HomeDataType>>> continuation) {
            return invoke2((Continuation<? super RelativeResult<List<HomeDataType>>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RelativeRequest cloudRequest = RelativeShipRequest.this.getCloudRequest();
                long j = this.$relativeId;
                this.label = 1;
                obj = cloudRequest.getSharedDataTypes(j, 1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return new RelativeResult(RelativeShipRequest.this.convertToHomeDataType(((GetSharedDataTypesResult) obj).getKeys()), 0, null, 6, null);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super RelativeResult<List<HomeDataType>>> continuation) {
            return ((C27671) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.server.RelativeShipRequest$getTopicSubscriptions$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/relative/export/RelativeResult;", "", "Lcom/xiaomi/fitness/relative/server/model/TopicSubscriptions;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.server.RelativeShipRequest$getTopicSubscriptions$1", f = "RelativeShipRequest.kt", i = {}, l = {353}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27681 extends SuspendLambda implements Function1<Continuation<? super RelativeResult<List<? extends TopicSubscriptions>>>, Object> {
        final /* synthetic */ long $relativeId;
        final /* synthetic */ List<String> $topic;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27681(long j, List<String> list, Continuation<? super C27681> continuation) {
            super(1, continuation);
            this.$relativeId = j;
            this.$topic = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RelativeShipRequest.this.new C27681(this.$relativeId, this.$topic, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object invoke2(Continuation<? super RelativeResult<List<? extends TopicSubscriptions>>> continuation) {
            return invoke2((Continuation<? super RelativeResult<List<TopicSubscriptions>>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RelativeRequest cloudRequest = RelativeShipRequest.this.getCloudRequest();
                long j = this.$relativeId;
                List<String> list = this.$topic;
                this.label = 1;
                obj = cloudRequest.getTopicSubscriptions(j, list, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return new RelativeResult(((GetTopSubscriptionResult) obj).getSubscriptions(), 0, null, 6, null);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super RelativeResult<List<TopicSubscriptions>>> continuation) {
            return ((C27681) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.server.RelativeShipRequest$getUserInfoByUid$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/relative/export/RelativeResult;", "Lcom/xiaomi/fitness/relative/server/model/AccountUserInfo;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.server.RelativeShipRequest$getUserInfoByUid$1", f = "RelativeShipRequest.kt", i = {}, l = {170}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27691 extends SuspendLambda implements Function1<Continuation<? super RelativeResult<AccountUserInfo>>, Object> {
        final /* synthetic */ Long $accountUid;
        final /* synthetic */ Long $inviteLinkId;
        final /* synthetic */ Long $qrCodeId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27691(Long l, Long l2, Long l3, Continuation<? super C27691> continuation) {
            super(1, continuation);
            this.$accountUid = l;
            this.$inviteLinkId = l2;
            this.$qrCodeId = l3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RelativeShipRequest.this.new C27691(this.$accountUid, this.$inviteLinkId, this.$qrCodeId, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RelativeRequest cloudRequest = RelativeShipRequest.this.getCloudRequest();
                Long l = this.$accountUid;
                Long l2 = this.$inviteLinkId;
                Long l3 = this.$qrCodeId;
                this.label = 1;
                obj = cloudRequest.getUserInfoByVerifyId(l, l2, l3, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return new RelativeResult((AccountUserInfo) obj, 0, null, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super RelativeResult<AccountUserInfo>> continuation) {
            return ((C27691) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.server.RelativeShipRequest$modifyRelativeNode$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/relative/export/RelativeResult;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.server.RelativeShipRequest$modifyRelativeNode$1", f = "RelativeShipRequest.kt", i = {}, l = {182}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27701 extends SuspendLambda implements Function1<Continuation<? super RelativeResult<Boolean>>, Object> {
        final /* synthetic */ long $relativeId;
        final /* synthetic */ String $relativeNode;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27701(long j, String str, Continuation<? super C27701> continuation) {
            super(1, continuation);
            this.$relativeId = j;
            this.$relativeNode = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RelativeShipRequest.this.new C27701(this.$relativeId, this.$relativeNode, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RelativeRequest cloudRequest = RelativeShipRequest.this.getCloudRequest();
                long j = this.$relativeId;
                String str = this.$relativeNode;
                this.label = 1;
                obj = cloudRequest.modifyRelativeNode(j, str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return new RelativeResult(Boxing.boxBoolean(((ModifyRelativeNodeResult) obj).getResult()), 0, null, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super RelativeResult<Boolean>> continuation) {
            return ((C27701) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.server.RelativeShipRequest$refuseAppliedSharedDataTypes$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/relative/export/RelativeResult;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.server.RelativeShipRequest$refuseAppliedSharedDataTypes$1", f = "RelativeShipRequest.kt", i = {}, l = {308}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27711 extends SuspendLambda implements Function1<Continuation<? super RelativeResult<Boolean>>, Object> {
        final /* synthetic */ List<HomeDataType> $dataTypes;
        final /* synthetic */ long $inviteId;
        final /* synthetic */ long $msgId;
        final /* synthetic */ long $relativeId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C27711(List<? extends HomeDataType> list, long j, long j2, long j3, Continuation<? super C27711> continuation) {
            super(1, continuation);
            this.$dataTypes = list;
            this.$relativeId = j;
            this.$inviteId = j2;
            this.$msgId = j3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RelativeShipRequest.this.new C27711(this.$dataTypes, this.$relativeId, this.$inviteId, this.$msgId, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List<String> listConvertToCloudDataKey = RelativeShipRequest.this.convertToCloudDataKey(this.$dataTypes);
                List<String> list = listConvertToCloudDataKey;
                if (list == null || list.isEmpty()) {
                    FitnessLogUtils.i(RelativeShipRequest.TAG, "refuseAppliedSharedDataTypes: no keys ");
                    return new RelativeResult(Boxing.boxBoolean(false), 0, null, 6, null);
                }
                RelativeRequest cloudRequest = RelativeShipRequest.this.getCloudRequest();
                long j = this.$relativeId;
                long j2 = this.$inviteId;
                long j3 = this.$msgId;
                this.label = 1;
                obj = cloudRequest.refuseAppliedSharedDataTypes(j, j2, listConvertToCloudDataKey, j3, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return new RelativeResult(Boxing.boxBoolean(((SharedDataBooleanResult) obj).getResult()), 0, null, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super RelativeResult<Boolean>> continuation) {
            return ((C27711) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.server.RelativeShipRequest$refuseInvitation$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/relative/export/RelativeResult;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.server.RelativeShipRequest$refuseInvitation$1", f = "RelativeShipRequest.kt", i = {}, l = {152}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27721 extends SuspendLambda implements Function1<Continuation<? super RelativeResult<Boolean>>, Object> {
        final /* synthetic */ long $inviteId;
        final /* synthetic */ long $msgId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27721(long j, long j2, Continuation<? super C27721> continuation) {
            super(1, continuation);
            this.$msgId = j;
            this.$inviteId = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RelativeShipRequest.this.new C27721(this.$msgId, this.$inviteId, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RelativeRequest cloudRequest = RelativeShipRequest.this.getCloudRequest();
                long j = this.$msgId;
                long j2 = this.$inviteId;
                this.label = 1;
                obj = cloudRequest.refuseInvitation(j, j2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return new RelativeResult(Boxing.boxBoolean(((OperateInviteResult) obj).getResult()), 0, null, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super RelativeResult<Boolean>> continuation) {
            return ((C27721) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.server.RelativeShipRequest$sendInvitation$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/relative/export/RelativeResult;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.server.RelativeShipRequest$sendInvitation$1", f = "RelativeShipRequest.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27731 extends SuspendLambda implements Function1<Continuation<? super RelativeResult<Boolean>>, Object> {
        final /* synthetic */ SendInvitationModel $model;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27731(SendInvitationModel sendInvitationModel, Continuation<? super C27731> continuation) {
            super(1, continuation);
            this.$model = sendInvitationModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RelativeShipRequest.this.new C27731(this.$model, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List listConvertToCloudDataKey = RelativeShipRequest.this.convertToCloudDataKey(this.$model.getAuthTypes());
                SendInviteParam sendInviteParam = new SendInviteParam(this.$model.getRelativeId(), this.$model.getInviteLinkId(), this.$model.getRelativeNode(), (this.$model.getAuthTimeScope() == null && ((list = listConvertToCloudDataKey) == null || list.isEmpty())) ? null : new InviteAuthContent(listConvertToCloudDataKey, this.$model.getAuthTimeScope()));
                RelativeRequest cloudRequest = RelativeShipRequest.this.getCloudRequest();
                this.label = 1;
                obj = cloudRequest.sendInvitation(sendInviteParam, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            int result = ((SendInviteResult) obj).getResult();
            if (result == 1) {
                return new RelativeResult(Boxing.boxBoolean(true), 0, null, 6, null);
            }
            if (result != 2) {
                return result != 3 ? new RelativeResult(Boxing.boxBoolean(false), 1002, null, 4, null) : new RelativeResult(Boxing.boxBoolean(false), 1003, "repeat invite");
            }
            return new RelativeResult(Boxing.boxBoolean(false), 1004, "already relatives");
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super RelativeResult<Boolean>> continuation) {
            return ((C27731) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.server.RelativeShipRequest$upRelativeSettings$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/relative/export/RelativeResult;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.server.RelativeShipRequest$upRelativeSettings$1", f = "RelativeShipRequest.kt", i = {}, l = {397}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27741 extends SuspendLambda implements Function1<Continuation<? super RelativeResult<Boolean>>, Object> {
        final /* synthetic */ long $relativeId;
        final /* synthetic */ List<RelativeSetting> $settings;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27741(long j, List<RelativeSetting> list, Continuation<? super C27741> continuation) {
            super(1, continuation);
            this.$relativeId = j;
            this.$settings = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RelativeShipRequest.this.new C27741(this.$relativeId, this.$settings, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RelativeRequest cloudRequest = RelativeShipRequest.this.getCloudRequest();
                long j = this.$relativeId;
                List<RelativeSetting> list = this.$settings;
                this.label = 1;
                obj = cloudRequest.upRelativeSettings(j, list, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return new RelativeResult(Boxing.boxBoolean(((SharedDataBooleanResult) obj).getResult()), 0, null, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super RelativeResult<Boolean>> continuation) {
            return ((C27741) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.server.RelativeShipRequest$updateSharedDataTypes$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/relative/export/RelativeResult;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.server.RelativeShipRequest$updateSharedDataTypes$1", f = "RelativeShipRequest.kt", i = {}, l = {339}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27751 extends SuspendLambda implements Function1<Continuation<? super RelativeResult<Boolean>>, Object> {
        final /* synthetic */ List<HomeDataType> $dataTypes;
        final /* synthetic */ long $relativeId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C27751(List<? extends HomeDataType> list, long j, Continuation<? super C27751> continuation) {
            super(1, continuation);
            this.$dataTypes = list;
            this.$relativeId = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RelativeShipRequest.this.new C27751(this.$dataTypes, this.$relativeId, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List<String> listConvertToCloudDataKey = RelativeShipRequest.this.convertToCloudDataKey(this.$dataTypes);
                if (listConvertToCloudDataKey == null) {
                    listConvertToCloudDataKey = CollectionsKt__CollectionsKt.emptyList();
                }
                RelativeRequest cloudRequest = RelativeShipRequest.this.getCloudRequest();
                long j = this.$relativeId;
                this.label = 1;
                obj = cloudRequest.updateSharedDataTypes(j, listConvertToCloudDataKey, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return new RelativeResult(Boxing.boxBoolean(((SharedDataBooleanResult) obj).getResult()), 0, null, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super RelativeResult<Boolean>> continuation) {
            return ((C27751) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.server.RelativeShipRequest$updateTopicSubscription$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/relative/export/RelativeResult;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.server.RelativeShipRequest$updateTopicSubscription$1", f = "RelativeShipRequest.kt", i = {}, l = {369}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27761 extends SuspendLambda implements Function1<Continuation<? super RelativeResult<Boolean>>, Object> {
        final /* synthetic */ int $act;
        final /* synthetic */ long $relativeId;
        final /* synthetic */ String $topic;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27761(long j, String str, int i, Continuation<? super C27761> continuation) {
            super(1, continuation);
            this.$relativeId = j;
            this.$topic = str;
            this.$act = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RelativeShipRequest.this.new C27761(this.$relativeId, this.$topic, this.$act, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RelativeRequest cloudRequest = RelativeShipRequest.this.getCloudRequest();
                long j = this.$relativeId;
                String str = this.$topic;
                int i2 = this.$act;
                this.label = 1;
                obj = cloudRequest.updateTopicSubscription(j, str, i2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return new RelativeResult(Boxing.boxBoolean(((SharedDataBooleanResult) obj).getResult()), 0, null, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super RelativeResult<Boolean>> continuation) {
            return ((C27761) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.server.RelativeShipRequest$validateAppliedSharedDataTypes$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/relative/export/RelativeResult;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.server.RelativeShipRequest$validateAppliedSharedDataTypes$1", f = "RelativeShipRequest.kt", i = {}, l = {324}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27771 extends SuspendLambda implements Function1<Continuation<? super RelativeResult<Boolean>>, Object> {
        final /* synthetic */ long $inviteId;
        final /* synthetic */ long $relativeUid;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27771(long j, long j2, Continuation<? super C27771> continuation) {
            super(1, continuation);
            this.$relativeUid = j;
            this.$inviteId = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RelativeShipRequest.this.new C27771(this.$relativeUid, this.$inviteId, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RelativeRequest cloudRequest = RelativeShipRequest.this.getCloudRequest();
                long j = this.$relativeUid;
                long j2 = this.$inviteId;
                this.label = 1;
                obj = cloudRequest.validateAppliedSharedDataTypes(j, j2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return new RelativeResult(Boxing.boxBoolean(((ValidateSharedDataTypeResult) obj).getResult()), 0, null, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super RelativeResult<Boolean>> continuation) {
            return ((C27771) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private RelativeShipRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountRequest accountRequest_delegate$lambda$1() {
        return new AccountRequest();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkHasNewData(List<RelativeUserInfo> userList) {
        boolean z;
        List<RelativeUserInfo> list = userList;
        if (list == null || list.isEmpty()) {
            return;
        }
        RelativeDataPreference relativeDataPreference = RelativeDataPreference.INSTANCE;
        Map<Long, Long> lastLatestDataTime = relativeDataPreference.getLastLatestDataTime();
        Map<Long, Long> lastLatestAbnormalHrTime = relativeDataPreference.getLastLatestAbnormalHrTime();
        Map<Long, Long> lastLatestAbnormalSpo2Time = relativeDataPreference.getLastLatestAbnormalSpo2Time();
        for (RelativeUserInfo relativeUserInfo : userList) {
            relativeUserInfo.setHasNewData(RelativeDataPreference.INSTANCE.hasNewData(lastLatestDataTime, relativeUserInfo.getUid(), relativeUserInfo.getLatestDataTime()));
            List<AbnormalLatestTime> latestAbnormalRecordList = relativeUserInfo.getLatestAbnormalRecordList();
            boolean z2 = false;
            if (latestAbnormalRecordList != null) {
                Iterator<T> it = latestAbnormalRecordList.iterator();
                while (true) {
                    z = false;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        AbnormalLatestTime abnormalLatestTime = (AbnormalLatestTime) it.next();
                        String key = abnormalLatestTime.getKey();
                        boolean zHasNewData = Intrinsics.areEqual(key, "spo2") ? RelativeDataPreference.INSTANCE.hasNewData(lastLatestAbnormalSpo2Time, relativeUserInfo.getUid(), abnormalLatestTime.getTime()) : Intrinsics.areEqual(key, "heart_rate") ? RelativeDataPreference.INSTANCE.hasNewData(lastLatestAbnormalHrTime, relativeUserInfo.getUid(), abnormalLatestTime.getTime()) : false;
                        if (z || zHasNewData) {
                            z = true;
                        }
                    }
                }
                z2 = z;
            }
            relativeUserInfo.setHasNewAbnormalRecord(z2);
        }
    }

    private final <T> LiveData<RelativeResult<T>> cloudRequestAsync(Function1<? super Continuation<? super RelativeResult<T>>, ? extends Object> realCall, String callName) {
        return CoroutineLiveDataKt.liveData$default(Dispatchers.getIO(), 0L, new C27581(realCall, callName, null), 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeRequest cloudRequest_delegate$lambda$0() {
        return RelativeRequest.INSTANCE.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<String> convertToCloudDataKey(List<? extends HomeDataType> types) {
        return CloudKey.INSTANCE.convertToCloudDataKeys(types);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<HomeDataType> convertToHomeDataType(List<String> keys) {
        return CloudKey.INSTANCE.convertToHomeDataTypes(keys);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AccountRequest getAccountRequest() {
        return (AccountRequest) this.accountRequest.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RelativeRequest getCloudRequest() {
        return (RelativeRequest) this.cloudRequest.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeShipRequest instance_delegate$lambda$4() {
        return new RelativeShipRequest();
    }

    @NotNull
    public final LiveData<RelativeResult<Boolean>> acceptAppliedSharedDataTypes(long relativeId, long msgId, long inviteId, @NotNull List<? extends HomeDataType> appliedTypes, @Nullable List<? extends HomeDataType> confirmedTypes) {
        Intrinsics.checkNotNullParameter(appliedTypes, "appliedTypes");
        return cloudRequestAsync(new AnonymousClass1(appliedTypes, confirmedTypes, relativeId, msgId, inviteId, null), "acceptAppliedSharedDataTypes");
    }

    @NotNull
    public final LiveData<RelativeResult<Boolean>> acceptInvitation(@NotNull AcceptInvitationModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return cloudRequestAsync(new C27561(model, null), "acceptInvitation");
    }

    @NotNull
    public final LiveData<RelativeResult<Boolean>> applySharedDataTypes(long relativeId, @NotNull List<? extends HomeDataType> dataTypes) {
        Intrinsics.checkNotNullParameter(dataTypes, "dataTypes");
        return cloudRequestAsync(new C27571(dataTypes, relativeId, null), "applySharedDataTypes");
    }

    @NotNull
    public final LiveData<RelativeResult<Boolean>> deleteRelative(long relativeId) {
        return cloudRequestAsync(new C27591(relativeId, null), "deleteRelative");
    }

    @NotNull
    public final LiveData<RelativeResult<List<HomeDataType>>> getAppliedSharedDataTypes(long relativeId) {
        return cloudRequestAsync(new C27601(relativeId, null), "getAppliedSharedDataTypes");
    }

    @NotNull
    public final LiveData<RelativeResult<List<AccountUserInfo>>> getFamilyMembers() {
        return cloudRequestAsync(new C27611(null), "getFamilyMembers");
    }

    @NotNull
    public final LiveData<RelativeResult<Long>> getInviteLinkId() {
        return cloudRequestAsync(new C27621(null), "getInviteLinkId");
    }

    @NotNull
    public final LiveData<RelativeResult<QrInfo>> getPersonalQrCode() {
        return cloudRequestAsync(new C27631(null), "getPersonalQrCode");
    }

    @NotNull
    public final LiveData<RelativeResult<List<RelativeUserInfo>>> getRelativeList() {
        return cloudRequestAsync(new C27641(null), "getRelativeList");
    }

    @NotNull
    public final LiveData<RelativeResult<List<RelativeSetting>>> getRelativeSettings(long relativeId, @NotNull List<String> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        return cloudRequestAsync(new C27651(relativeId, keys, null), "getRelativeSettings");
    }

    @NotNull
    public final LiveData<RelativeResult<List<HomeDataType>>> getSharedDataTypesToMe(long relativeId) {
        return cloudRequestAsync(new C27661(relativeId, null), "getSharedDataTypesToMe");
    }

    @NotNull
    public final LiveData<RelativeResult<List<HomeDataType>>> getSharedDataTypesToRelative(long relativeId) {
        return cloudRequestAsync(new C27671(relativeId, null), "getSharedDataTypesToRelative");
    }

    @NotNull
    public final LiveData<RelativeResult<List<TopicSubscriptions>>> getTopicSubscriptions(long relativeId, @NotNull List<String> topic) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        return cloudRequestAsync(new C27681(relativeId, topic, null), "getTopicSubscriptions");
    }

    @NotNull
    public final LiveData<RelativeResult<AccountUserInfo>> getUserInfoByUid(@Nullable Long accountUid, @Nullable Long inviteLinkId, @Nullable Long qrCodeId) {
        return cloudRequestAsync(new C27691(accountUid, inviteLinkId, qrCodeId, null), "getUserInfoByUid");
    }

    @NotNull
    public final LiveData<RelativeResult<Boolean>> modifyRelativeNode(long relativeId, @NotNull String relativeNode) {
        Intrinsics.checkNotNullParameter(relativeNode, "relativeNode");
        return cloudRequestAsync(new C27701(relativeId, relativeNode, null), "modifyRelativeNode");
    }

    @NotNull
    public final LiveData<RelativeResult<Boolean>> refuseAppliedSharedDataTypes(long relativeId, long msgId, long inviteId, @Nullable List<? extends HomeDataType> dataTypes) {
        return cloudRequestAsync(new C27711(dataTypes, relativeId, inviteId, msgId, null), "refuseAppliedSharedDataTypes");
    }

    @NotNull
    public final LiveData<RelativeResult<Boolean>> refuseInvitation(long msgId, long inviteId) {
        return cloudRequestAsync(new C27721(msgId, inviteId, null), "refuseInvitation");
    }

    @NotNull
    public final LiveData<RelativeResult<Boolean>> sendInvitation(@NotNull SendInvitationModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return cloudRequestAsync(new C27731(model, null), "sendInvitation");
    }

    @NotNull
    public final LiveData<RelativeResult<Boolean>> upRelativeSettings(long relativeId, @NotNull List<RelativeSetting> settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        return cloudRequestAsync(new C27741(relativeId, settings, null), "upRelativeSettings");
    }

    @NotNull
    public final LiveData<RelativeResult<Boolean>> updateSharedDataTypes(long relativeId, @NotNull List<? extends HomeDataType> dataTypes) {
        Intrinsics.checkNotNullParameter(dataTypes, "dataTypes");
        return cloudRequestAsync(new C27751(dataTypes, relativeId, null), "updateSharedDataTypes");
    }

    @NotNull
    public final LiveData<RelativeResult<Boolean>> updateTopicSubscription(long relativeId, @NotNull String topic, int act) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        return cloudRequestAsync(new C27761(relativeId, topic, act, null), "updateTopicSubscription");
    }

    @NotNull
    public final LiveData<RelativeResult<Boolean>> validateAppliedSharedDataTypes(long relativeUid, long inviteId) {
        return cloudRequestAsync(new C27771(relativeUid, inviteId, null), "validateAppliedSharedDataTypes");
    }
}
