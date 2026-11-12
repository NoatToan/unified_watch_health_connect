package com.xiaomi.fitness.relative.server.api;

import com.google.gson.Gson;
import com.xiaomi.fitness.active.pk.PkConstants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.extensions.HttpPoint;
import com.xiaomi.fitness.relative.server.model.AccountUserInfo;
import com.xiaomi.fitness.relative.server.model.DeleteRelativeResult;
import com.xiaomi.fitness.relative.server.model.DeleteRelativeShipParam;
import com.xiaomi.fitness.relative.server.model.GetFamilyMemberResult;
import com.xiaomi.fitness.relative.server.model.GetInviteLinkIdResult;
import com.xiaomi.fitness.relative.server.model.GetRelativeListResult;
import com.xiaomi.fitness.relative.server.model.GetRelativeSettingsResult;
import com.xiaomi.fitness.relative.server.model.GetSettingsParam;
import com.xiaomi.fitness.relative.server.model.GetSharedDataTypesParam;
import com.xiaomi.fitness.relative.server.model.GetSharedDataTypesResult;
import com.xiaomi.fitness.relative.server.model.GetTopSubscriptionParam;
import com.xiaomi.fitness.relative.server.model.GetTopSubscriptionResult;
import com.xiaomi.fitness.relative.server.model.GetUserInfoByUidParam;
import com.xiaomi.fitness.relative.server.model.InviteAuthContent;
import com.xiaomi.fitness.relative.server.model.ModifyRelativeNodeParam;
import com.xiaomi.fitness.relative.server.model.ModifyRelativeNodeResult;
import com.xiaomi.fitness.relative.server.model.OperateInviteParam;
import com.xiaomi.fitness.relative.server.model.OperateInviteResult;
import com.xiaomi.fitness.relative.server.model.OperateSharedDataTypeParam;
import com.xiaomi.fitness.relative.server.model.RelativeSetting;
import com.xiaomi.fitness.relative.server.model.SendInviteParam;
import com.xiaomi.fitness.relative.server.model.SendInviteResult;
import com.xiaomi.fitness.relative.server.model.SharedDataBooleanResult;
import com.xiaomi.fitness.relative.server.model.SubscribeTopicParam;
import com.xiaomi.fitness.relative.server.model.UpSettingsParam;
import com.xiaomi.fitness.relative.server.model.UpdateSharedDataTypeParam;
import com.xiaomi.fitness.relative.server.model.ValidateSharedDataTypeParam;
import com.xiaomi.fitness.relative.server.model.ValidateSharedDataTypeResult;
import dagger.hilt.android.EntryPointAccessors;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 P2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001PB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u000fJ$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0086@¢\u0006\u0002\u0010\u0015JD\u0010\u0016\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0086@¢\u0006\u0002\u0010\u001bJ4\u0010\u001c\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0017\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u001dJ$\u0010\u001e\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0086@¢\u0006\u0002\u0010\u0015J$\u0010\u001f\u001a\u00020 2\u0006\u0010\t\u001a\u00020\n2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0086@¢\u0006\u0002\u0010\u0015J&\u0010\"\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010%J$\u0010&\u001a\u00020'2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0086@¢\u0006\u0002\u0010\u0015J$\u0010(\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\n2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u0013H\u0086@¢\u0006\u0002\u0010\u0015J\u000e\u0010+\u001a\u00020,H\u0086@¢\u0006\u0002\u0010-J\u000e\u0010.\u001a\u00020/H\u0086@¢\u0006\u0002\u0010-J\u0016\u00100\u001a\u0002012\u0006\u0010\t\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u000fJ\u000e\u00102\u001a\u000203H\u0086@¢\u0006\u0002\u0010-J\u0016\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0086@¢\u0006\u0002\u00108J2\u00109\u001a\u00020:2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\b\u0010;\u001a\u0004\u0018\u00010\u00142\b\u0010<\u001a\u0004\u0018\u00010=H\u0086@¢\u0006\u0002\u0010>J\u001e\u0010?\u001a\u00020:2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010@J>\u0010A\u001a\u00020:2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010B\u001a\u00020\f2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=H\u0082@¢\u0006\u0002\u0010CJ,\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010\n2\b\u0010G\u001a\u0004\u0018\u00010\n2\b\u0010H\u001a\u0004\u0018\u00010\nH\u0086@¢\u0006\u0002\u0010IJ\u001e\u0010J\u001a\u00020K2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010L\u001a\u00020\u0014H\u0086@¢\u0006\u0002\u0010MJ\u001e\u0010N\u001a\u00020O2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010@R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006Q"}, d2 = {"Lcom/xiaomi/fitness/relative/server/api/RelativeRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/relative/server/api/RelativeApiService;", "<init>", "()V", "gson", "Lcom/google/gson/Gson;", "getSharedDataTypes", "Lcom/xiaomi/fitness/relative/server/model/GetSharedDataTypesResult;", "relativeId", "", "type", "", "(JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAppliedSharedDataTypes", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applySharedDataTypes", "Lcom/xiaomi/fitness/relative/server/model/SharedDataBooleanResult;", "keys", "", "", "(JLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "acceptAppliedSharedDataTypes", "msgId", PkConstants.PARAM_INVITE_ID, "appliedKeys", "confirmedKeys", "(JJJLjava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refuseAppliedSharedDataTypes", "(JJLjava/util/List;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSharedDataTypes", "getTopicSubscriptions", "Lcom/xiaomi/fitness/relative/server/model/GetTopSubscriptionResult;", "topics", "updateTopicSubscription", "topic", "act", "(JLjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRelativeSettings", "Lcom/xiaomi/fitness/relative/server/model/GetRelativeSettingsResult;", "upRelativeSettings", "settings", "Lcom/xiaomi/fitness/relative/server/model/RelativeSetting;", "getRelativeList", "Lcom/xiaomi/fitness/relative/server/model/GetRelativeListResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFamilyMembers", "Lcom/xiaomi/fitness/relative/server/model/GetFamilyMemberResult;", "deleteRelative", "Lcom/xiaomi/fitness/relative/server/model/DeleteRelativeResult;", "getInviteLinkId", "Lcom/xiaomi/fitness/relative/server/model/GetInviteLinkIdResult;", "sendInvitation", "Lcom/xiaomi/fitness/relative/server/model/SendInviteResult;", "param", "Lcom/xiaomi/fitness/relative/server/model/SendInviteParam;", "(Lcom/xiaomi/fitness/relative/server/model/SendInviteParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "acceptInvitation", "Lcom/xiaomi/fitness/relative/server/model/OperateInviteResult;", "identityNode", "authContent", "Lcom/xiaomi/fitness/relative/server/model/InviteAuthContent;", "(JJLjava/lang/String;Lcom/xiaomi/fitness/relative/server/model/InviteAuthContent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refuseInvitation", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "operateInvitation", "operate", "(JJILjava/lang/String;Lcom/xiaomi/fitness/relative/server/model/InviteAuthContent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserInfoByVerifyId", "Lcom/xiaomi/fitness/relative/server/model/AccountUserInfo;", "accountUid", "inviteLinkId", "qrCodeId", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "modifyRelativeNode", "Lcom/xiaomi/fitness/relative/server/model/ModifyRelativeNodeResult;", "relativeNote", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validateAppliedSharedDataTypes", "Lcom/xiaomi/fitness/relative/server/model/ValidateSharedDataTypeResult;", "Companion", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRelativeRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RelativeRequest.kt\ncom/xiaomi/fitness/relative/server/api/RelativeRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n+ 3 HttpExtension.kt\ncom/xiaomi/fitness/net/extensions/HttpExtensionKt\n*L\n1#1,178:1\n141#2:179\n141#2:183\n141#2:187\n141#2:191\n141#2:195\n141#2:199\n141#2:203\n141#2:207\n141#2:211\n141#2:215\n141#2:219\n141#2:223\n141#2:227\n141#2:231\n141#2:235\n141#2:239\n141#2:243\n141#2:247\n141#2:251\n31#3:180\n28#3,2:181\n31#3:184\n28#3,2:185\n31#3:188\n28#3,2:189\n31#3:192\n28#3,2:193\n31#3:196\n28#3,2:197\n31#3:200\n28#3,2:201\n31#3:204\n28#3,2:205\n31#3:208\n28#3,2:209\n31#3:212\n28#3,2:213\n31#3:216\n28#3,2:217\n31#3:220\n28#3,2:221\n31#3:224\n28#3,2:225\n31#3:228\n28#3,2:229\n31#3:232\n28#3,2:233\n31#3:236\n28#3,2:237\n31#3:240\n28#3,2:241\n31#3:244\n28#3,2:245\n31#3:248\n28#3,2:249\n31#3:252\n28#3,2:253\n*S KotlinDebug\n*F\n+ 1 RelativeRequest.kt\ncom/xiaomi/fitness/relative/server/api/RelativeRequest\n*L\n17#1:179\n23#1:183\n31#1:187\n44#1:191\n55#1:195\n63#1:199\n72#1:203\n82#1:207\n91#1:211\n100#1:215\n105#1:219\n109#1:223\n115#1:227\n119#1:231\n124#1:235\n146#1:239\n159#1:243\n167#1:247\n176#1:251\n17#1:180\n17#1:181,2\n23#1:184\n23#1:185,2\n31#1:188\n31#1:189,2\n44#1:192\n44#1:193,2\n55#1:196\n55#1:197,2\n63#1:200\n63#1:201,2\n72#1:204\n72#1:205,2\n82#1:208\n82#1:209,2\n91#1:212\n91#1:213,2\n100#1:216\n100#1:217,2\n105#1:220\n105#1:221,2\n109#1:224\n109#1:225,2\n115#1:228\n115#1:229,2\n119#1:232\n119#1:233,2\n124#1:236\n124#1:237,2\n146#1:240\n146#1:241,2\n159#1:244\n159#1:245,2\n167#1:248\n167#1:249,2\n176#1:252\n176#1:253,2\n*E\n"})
public final class RelativeRequest extends BaseRequest<RelativeApiService> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final RelativeRequest instance = new RelativeRequest();

    @NotNull
    private final Gson gson = new Gson();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/relative/server/api/RelativeRequest$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fitness/relative/server/api/RelativeRequest;", "getInstance", "()Lcom/xiaomi/fitness/relative/server/api/RelativeRequest;", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RelativeRequest getInstance() {
            return RelativeRequest.instance;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.server.api.RelativeRequest$acceptAppliedSharedDataTypes$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.server.api.RelativeRequest", f = "RelativeRequest.kt", i = {}, l = {44}, m = "acceptAppliedSharedDataTypes", n = {}, s = {})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RelativeRequest.this.acceptAppliedSharedDataTypes(0L, 0L, 0L, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.server.api.RelativeRequest$applySharedDataTypes$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.server.api.RelativeRequest", f = "RelativeRequest.kt", i = {}, l = {31}, m = "applySharedDataTypes", n = {}, s = {})
    public static final class C27781 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C27781(Continuation<? super C27781> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RelativeRequest.this.applySharedDataTypes(0L, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.server.api.RelativeRequest$deleteRelative$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.server.api.RelativeRequest", f = "RelativeRequest.kt", i = {}, l = {115}, m = "deleteRelative", n = {}, s = {})
    public static final class C27791 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C27791(Continuation<? super C27791> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RelativeRequest.this.deleteRelative(0L, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.server.api.RelativeRequest$getAppliedSharedDataTypes$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.server.api.RelativeRequest", f = "RelativeRequest.kt", i = {}, l = {23}, m = "getAppliedSharedDataTypes", n = {}, s = {})
    public static final class C27801 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C27801(Continuation<? super C27801> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RelativeRequest.this.getAppliedSharedDataTypes(0L, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.server.api.RelativeRequest$getFamilyMembers$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.server.api.RelativeRequest", f = "RelativeRequest.kt", i = {}, l = {109}, m = "getFamilyMembers", n = {}, s = {})
    public static final class C27811 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C27811(Continuation<? super C27811> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RelativeRequest.this.getFamilyMembers(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.server.api.RelativeRequest$getInviteLinkId$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.server.api.RelativeRequest", f = "RelativeRequest.kt", i = {}, l = {119}, m = "getInviteLinkId", n = {}, s = {})
    public static final class C27821 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C27821(Continuation<? super C27821> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RelativeRequest.this.getInviteLinkId(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.server.api.RelativeRequest$getRelativeList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.server.api.RelativeRequest", f = "RelativeRequest.kt", i = {}, l = {105}, m = "getRelativeList", n = {}, s = {})
    public static final class C27831 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C27831(Continuation<? super C27831> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RelativeRequest.this.getRelativeList(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.server.api.RelativeRequest$getRelativeSettings$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.server.api.RelativeRequest", f = "RelativeRequest.kt", i = {}, l = {91}, m = "getRelativeSettings", n = {}, s = {})
    public static final class C27841 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C27841(Continuation<? super C27841> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RelativeRequest.this.getRelativeSettings(0L, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.server.api.RelativeRequest$getSharedDataTypes$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.server.api.RelativeRequest", f = "RelativeRequest.kt", i = {}, l = {17}, m = "getSharedDataTypes", n = {}, s = {})
    public static final class C27851 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C27851(Continuation<? super C27851> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RelativeRequest.this.getSharedDataTypes(0L, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.server.api.RelativeRequest$getTopicSubscriptions$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.server.api.RelativeRequest", f = "RelativeRequest.kt", i = {}, l = {72}, m = "getTopicSubscriptions", n = {}, s = {})
    public static final class C27861 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C27861(Continuation<? super C27861> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RelativeRequest.this.getTopicSubscriptions(0L, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.server.api.RelativeRequest$getUserInfoByVerifyId$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.server.api.RelativeRequest", f = "RelativeRequest.kt", i = {}, l = {159}, m = "getUserInfoByVerifyId", n = {}, s = {})
    public static final class C27871 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C27871(Continuation<? super C27871> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RelativeRequest.this.getUserInfoByVerifyId(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.server.api.RelativeRequest$modifyRelativeNode$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.server.api.RelativeRequest", f = "RelativeRequest.kt", i = {}, l = {167}, m = "modifyRelativeNode", n = {}, s = {})
    public static final class C27881 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C27881(Continuation<? super C27881> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RelativeRequest.this.modifyRelativeNode(0L, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.server.api.RelativeRequest$operateInvitation$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.server.api.RelativeRequest", f = "RelativeRequest.kt", i = {}, l = {146}, m = "operateInvitation", n = {}, s = {})
    public static final class C27891 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C27891(Continuation<? super C27891> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RelativeRequest.this.operateInvitation(0L, 0L, 0, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.server.api.RelativeRequest$refuseAppliedSharedDataTypes$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.server.api.RelativeRequest", f = "RelativeRequest.kt", i = {}, l = {55}, m = "refuseAppliedSharedDataTypes", n = {}, s = {})
    public static final class C27901 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C27901(Continuation<? super C27901> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RelativeRequest.this.refuseAppliedSharedDataTypes(0L, 0L, null, 0L, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.server.api.RelativeRequest$sendInvitation$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.server.api.RelativeRequest", f = "RelativeRequest.kt", i = {}, l = {124}, m = "sendInvitation", n = {}, s = {})
    public static final class C27911 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C27911(Continuation<? super C27911> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RelativeRequest.this.sendInvitation(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.server.api.RelativeRequest$upRelativeSettings$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.server.api.RelativeRequest", f = "RelativeRequest.kt", i = {}, l = {100}, m = "upRelativeSettings", n = {}, s = {})
    public static final class C27921 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C27921(Continuation<? super C27921> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RelativeRequest.this.upRelativeSettings(0L, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.server.api.RelativeRequest$updateSharedDataTypes$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.server.api.RelativeRequest", f = "RelativeRequest.kt", i = {}, l = {63}, m = "updateSharedDataTypes", n = {}, s = {})
    public static final class C27931 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C27931(Continuation<? super C27931> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RelativeRequest.this.updateSharedDataTypes(0L, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.server.api.RelativeRequest$updateTopicSubscription$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.server.api.RelativeRequest", f = "RelativeRequest.kt", i = {}, l = {82}, m = "updateTopicSubscription", n = {}, s = {})
    public static final class C27941 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C27941(Continuation<? super C27941> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RelativeRequest.this.updateTopicSubscription(0L, null, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.server.api.RelativeRequest$validateAppliedSharedDataTypes$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.server.api.RelativeRequest", f = "RelativeRequest.kt", i = {}, l = {176}, m = "validateAppliedSharedDataTypes", n = {}, s = {})
    public static final class C27951 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C27951(Continuation<? super C27951> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RelativeRequest.this.validateAppliedSharedDataTypes(0L, 0L, this);
        }
    }

    private RelativeRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object operateInvitation(long j, long j2, int i, String str, InviteAuthContent inviteAuthContent, Continuation<? super OperateInviteResult> continuation) {
        C27891 c27891;
        if (continuation instanceof C27891) {
            c27891 = (C27891) continuation;
            int i2 = c27891.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c27891.label = i2 - Integer.MIN_VALUE;
            } else {
                c27891 = new C27891(continuation);
            }
        } else {
            c27891 = new C27891(continuation);
        }
        Object objOperateInvitation = c27891.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c27891.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objOperateInvitation);
            String json = this.gson.toJson(new OperateInviteParam(j, j2, i, str, inviteAuthContent));
            RelativeApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c27891.label = 1;
            objOperateInvitation = mService.operateInvitation(json, c27891);
            if (objOperateInvitation == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objOperateInvitation);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objOperateInvitation);
    }

    public static /* synthetic */ Object operateInvitation$default(RelativeRequest relativeRequest, long j, long j2, int i, String str, InviteAuthContent inviteAuthContent, Continuation continuation, int i2, Object obj) {
        return relativeRequest.operateInvitation(j, j2, i, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : inviteAuthContent, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object acceptAppliedSharedDataTypes(long j, long j2, long j3, @NotNull List<String> list, @Nullable List<String> list2, @NotNull Continuation<? super SharedDataBooleanResult> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objOperateAppliedSharedDataTypes = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOperateAppliedSharedDataTypes);
            String json = this.gson.toJson(new OperateSharedDataTypeParam(j, j2, j3, 1, list, list2));
            RelativeApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            anonymousClass1.label = 1;
            objOperateAppliedSharedDataTypes = mService.operateAppliedSharedDataTypes(json, anonymousClass1);
            if (objOperateAppliedSharedDataTypes == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objOperateAppliedSharedDataTypes);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objOperateAppliedSharedDataTypes);
    }

    @Nullable
    public final Object acceptInvitation(long j, long j2, @Nullable String str, @Nullable InviteAuthContent inviteAuthContent, @NotNull Continuation<? super OperateInviteResult> continuation) {
        return operateInvitation(j, j2, 1, str, inviteAuthContent, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object applySharedDataTypes(long j, @NotNull List<String> list, @NotNull Continuation<? super SharedDataBooleanResult> continuation) {
        C27781 c27781;
        if (continuation instanceof C27781) {
            c27781 = (C27781) continuation;
            int i = c27781.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27781.label = i - Integer.MIN_VALUE;
            } else {
                c27781 = new C27781(continuation);
            }
        } else {
            c27781 = new C27781(continuation);
        }
        Object objApplySharedDataTypes = c27781.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c27781.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objApplySharedDataTypes);
            String json = this.gson.toJson(new UpdateSharedDataTypeParam(j, list));
            RelativeApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c27781.label = 1;
            objApplySharedDataTypes = mService.applySharedDataTypes(json, c27781);
            if (objApplySharedDataTypes == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objApplySharedDataTypes);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objApplySharedDataTypes);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object deleteRelative(long j, @NotNull Continuation<? super DeleteRelativeResult> continuation) {
        C27791 c27791;
        if (continuation instanceof C27791) {
            c27791 = (C27791) continuation;
            int i = c27791.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27791.label = i - Integer.MIN_VALUE;
            } else {
                c27791 = new C27791(continuation);
            }
        } else {
            c27791 = new C27791(continuation);
        }
        Object objDeleteRelative = c27791.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c27791.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objDeleteRelative);
            String json = this.gson.toJson(new DeleteRelativeShipParam(j));
            RelativeApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c27791.label = 1;
            objDeleteRelative = mService.deleteRelative(json, c27791);
            if (objDeleteRelative == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objDeleteRelative);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objDeleteRelative);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getAppliedSharedDataTypes(long j, @NotNull Continuation<? super GetSharedDataTypesResult> continuation) {
        C27801 c27801;
        if (continuation instanceof C27801) {
            c27801 = (C27801) continuation;
            int i = c27801.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27801.label = i - Integer.MIN_VALUE;
            } else {
                c27801 = new C27801(continuation);
            }
        } else {
            c27801 = new C27801(continuation);
        }
        Object appliedSharedDataTypes = c27801.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c27801.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(appliedSharedDataTypes);
            String json = this.gson.toJson(new GetSharedDataTypesParam(j, null, 2, null));
            RelativeApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c27801.label = 1;
            appliedSharedDataTypes = mService.getAppliedSharedDataTypes(json, c27801);
            if (appliedSharedDataTypes == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(appliedSharedDataTypes);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(appliedSharedDataTypes);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getFamilyMembers(@NotNull Continuation<? super GetFamilyMemberResult> continuation) {
        C27811 c27811;
        if (continuation instanceof C27811) {
            c27811 = (C27811) continuation;
            int i = c27811.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27811.label = i - Integer.MIN_VALUE;
            } else {
                c27811 = new C27811(continuation);
            }
        } else {
            c27811 = new C27811(continuation);
        }
        Object familyMembers = c27811.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c27811.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(familyMembers);
            RelativeApiService mService = getMService();
            c27811.label = 1;
            familyMembers = mService.getFamilyMembers(c27811);
            if (familyMembers == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(familyMembers);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(familyMembers);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getInviteLinkId(@NotNull Continuation<? super GetInviteLinkIdResult> continuation) {
        C27821 c27821;
        if (continuation instanceof C27821) {
            c27821 = (C27821) continuation;
            int i = c27821.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27821.label = i - Integer.MIN_VALUE;
            } else {
                c27821 = new C27821(continuation);
            }
        } else {
            c27821 = new C27821(continuation);
        }
        Object inviteLinkId = c27821.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c27821.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(inviteLinkId);
            RelativeApiService mService = getMService();
            c27821.label = 1;
            inviteLinkId = mService.getInviteLinkId(c27821);
            if (inviteLinkId == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(inviteLinkId);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(inviteLinkId);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getRelativeList(@NotNull Continuation<? super GetRelativeListResult> continuation) {
        C27831 c27831;
        if (continuation instanceof C27831) {
            c27831 = (C27831) continuation;
            int i = c27831.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27831.label = i - Integer.MIN_VALUE;
            } else {
                c27831 = new C27831(continuation);
            }
        } else {
            c27831 = new C27831(continuation);
        }
        Object relativeList = c27831.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c27831.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(relativeList);
            RelativeApiService mService = getMService();
            c27831.label = 1;
            relativeList = mService.getRelativeList(c27831);
            if (relativeList == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(relativeList);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(relativeList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getRelativeSettings(long j, @NotNull List<String> list, @NotNull Continuation<? super GetRelativeSettingsResult> continuation) {
        C27841 c27841;
        if (continuation instanceof C27841) {
            c27841 = (C27841) continuation;
            int i = c27841.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27841.label = i - Integer.MIN_VALUE;
            } else {
                c27841 = new C27841(continuation);
            }
        } else {
            c27841 = new C27841(continuation);
        }
        Object settings = c27841.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c27841.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(settings);
            String json = this.gson.toJson(new GetSettingsParam(j, list));
            RelativeApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c27841.label = 1;
            settings = mService.getSettings(json, c27841);
            if (settings == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(settings);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(settings);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getSharedDataTypes(long j, int i, @NotNull Continuation<? super GetSharedDataTypesResult> continuation) {
        C27851 c27851;
        if (continuation instanceof C27851) {
            c27851 = (C27851) continuation;
            int i2 = c27851.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c27851.label = i2 - Integer.MIN_VALUE;
            } else {
                c27851 = new C27851(continuation);
            }
        } else {
            c27851 = new C27851(continuation);
        }
        Object sharedDataTypes = c27851.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c27851.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(sharedDataTypes);
            String json = this.gson.toJson(new GetSharedDataTypesParam(j, Boxing.boxInt(i)));
            RelativeApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c27851.label = 1;
            sharedDataTypes = mService.getSharedDataTypes(json, c27851);
            if (sharedDataTypes == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(sharedDataTypes);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(sharedDataTypes);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getTopicSubscriptions(long j, @NotNull List<String> list, @NotNull Continuation<? super GetTopSubscriptionResult> continuation) {
        C27861 c27861;
        if (continuation instanceof C27861) {
            c27861 = (C27861) continuation;
            int i = c27861.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27861.label = i - Integer.MIN_VALUE;
            } else {
                c27861 = new C27861(continuation);
            }
        } else {
            c27861 = new C27861(continuation);
        }
        Object topicSubscriptions = c27861.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c27861.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(topicSubscriptions);
            String json = this.gson.toJson(new GetTopSubscriptionParam(j, list));
            RelativeApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c27861.label = 1;
            topicSubscriptions = mService.getTopicSubscriptions(json, c27861);
            if (topicSubscriptions == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(topicSubscriptions);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(topicSubscriptions);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getUserInfoByVerifyId(@Nullable Long l, @Nullable Long l2, @Nullable Long l3, @NotNull Continuation<? super AccountUserInfo> continuation) {
        C27871 c27871;
        GetUserInfoByUidParam getUserInfoByUidParam;
        if (continuation instanceof C27871) {
            c27871 = (C27871) continuation;
            int i = c27871.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27871.label = i - Integer.MIN_VALUE;
            } else {
                c27871 = new C27871(continuation);
            }
        } else {
            c27871 = new C27871(continuation);
        }
        Object userInfoByVerifyId = c27871.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c27871.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(userInfoByVerifyId);
            if (l != null) {
                getUserInfoByUidParam = new GetUserInfoByUidParam(l.longValue(), 1L);
            } else if (l2 != null) {
                getUserInfoByUidParam = new GetUserInfoByUidParam(l2.longValue(), 2L);
            } else {
                if (l3 == null) {
                    throw new IllegalArgumentException("getUserInfoByVerifyId: id is null");
                }
                getUserInfoByUidParam = new GetUserInfoByUidParam(l3.longValue(), 3L);
            }
            String json = this.gson.toJson(getUserInfoByUidParam);
            RelativeApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c27871.label = 1;
            userInfoByVerifyId = mService.getUserInfoByVerifyId(json, c27871);
            if (userInfoByVerifyId == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(userInfoByVerifyId);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(userInfoByVerifyId);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object modifyRelativeNode(long j, @NotNull String str, @NotNull Continuation<? super ModifyRelativeNodeResult> continuation) {
        C27881 c27881;
        if (continuation instanceof C27881) {
            c27881 = (C27881) continuation;
            int i = c27881.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27881.label = i - Integer.MIN_VALUE;
            } else {
                c27881 = new C27881(continuation);
            }
        } else {
            c27881 = new C27881(continuation);
        }
        Object objModifyRelativeNode = c27881.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c27881.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objModifyRelativeNode);
            String json = this.gson.toJson(new ModifyRelativeNodeParam(j, str));
            RelativeApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c27881.label = 1;
            objModifyRelativeNode = mService.modifyRelativeNode(json, c27881);
            if (objModifyRelativeNode == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objModifyRelativeNode);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objModifyRelativeNode);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object refuseAppliedSharedDataTypes(long j, long j2, @NotNull List<String> list, long j3, @NotNull Continuation<? super SharedDataBooleanResult> continuation) {
        C27901 c27901;
        if (continuation instanceof C27901) {
            c27901 = (C27901) continuation;
            int i = c27901.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27901.label = i - Integer.MIN_VALUE;
            } else {
                c27901 = new C27901(continuation);
            }
        } else {
            c27901 = new C27901(continuation);
        }
        Object objOperateAppliedSharedDataTypes = c27901.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c27901.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOperateAppliedSharedDataTypes);
            String json = this.gson.toJson(new OperateSharedDataTypeParam(j, j3, j2, 2, list, null, 32, null));
            RelativeApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c27901.label = 1;
            objOperateAppliedSharedDataTypes = mService.operateAppliedSharedDataTypes(json, c27901);
            if (objOperateAppliedSharedDataTypes == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objOperateAppliedSharedDataTypes);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objOperateAppliedSharedDataTypes);
    }

    @Nullable
    public final Object refuseInvitation(long j, long j2, @NotNull Continuation<? super OperateInviteResult> continuation) {
        return operateInvitation$default(this, j, j2, 0, null, null, continuation, 24, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object sendInvitation(@NotNull SendInviteParam sendInviteParam, @NotNull Continuation<? super SendInviteResult> continuation) {
        C27911 c27911;
        if (continuation instanceof C27911) {
            c27911 = (C27911) continuation;
            int i = c27911.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27911.label = i - Integer.MIN_VALUE;
            } else {
                c27911 = new C27911(continuation);
            }
        } else {
            c27911 = new C27911(continuation);
        }
        Object objSendInvitation = c27911.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c27911.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSendInvitation);
            String json = this.gson.toJson(sendInviteParam);
            RelativeApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c27911.label = 1;
            objSendInvitation = mService.sendInvitation(json, c27911);
            if (objSendInvitation == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSendInvitation);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objSendInvitation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object upRelativeSettings(long j, @NotNull List<RelativeSetting> list, @NotNull Continuation<? super SharedDataBooleanResult> continuation) {
        C27921 c27921;
        if (continuation instanceof C27921) {
            c27921 = (C27921) continuation;
            int i = c27921.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27921.label = i - Integer.MIN_VALUE;
            } else {
                c27921 = new C27921(continuation);
            }
        } else {
            c27921 = new C27921(continuation);
        }
        Object objUpSettings = c27921.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c27921.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUpSettings);
            String json = this.gson.toJson(new UpSettingsParam(j, list));
            RelativeApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c27921.label = 1;
            objUpSettings = mService.upSettings(json, c27921);
            if (objUpSettings == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUpSettings);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objUpSettings);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object updateSharedDataTypes(long j, @NotNull List<String> list, @NotNull Continuation<? super SharedDataBooleanResult> continuation) {
        C27931 c27931;
        if (continuation instanceof C27931) {
            c27931 = (C27931) continuation;
            int i = c27931.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27931.label = i - Integer.MIN_VALUE;
            } else {
                c27931 = new C27931(continuation);
            }
        } else {
            c27931 = new C27931(continuation);
        }
        Object objUpdateSharedDataTypes = c27931.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c27931.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUpdateSharedDataTypes);
            String json = this.gson.toJson(new UpdateSharedDataTypeParam(j, list));
            RelativeApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c27931.label = 1;
            objUpdateSharedDataTypes = mService.updateSharedDataTypes(json, c27931);
            if (objUpdateSharedDataTypes == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUpdateSharedDataTypes);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objUpdateSharedDataTypes);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object updateTopicSubscription(long j, @NotNull String str, int i, @NotNull Continuation<? super SharedDataBooleanResult> continuation) {
        C27941 c27941;
        if (continuation instanceof C27941) {
            c27941 = (C27941) continuation;
            int i2 = c27941.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c27941.label = i2 - Integer.MIN_VALUE;
            } else {
                c27941 = new C27941(continuation);
            }
        } else {
            c27941 = new C27941(continuation);
        }
        Object objUpdateTopicSubscription = c27941.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c27941.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUpdateTopicSubscription);
            String json = this.gson.toJson(new SubscribeTopicParam(j, str, i));
            RelativeApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c27941.label = 1;
            objUpdateTopicSubscription = mService.updateTopicSubscription(json, c27941);
            if (objUpdateTopicSubscription == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUpdateTopicSubscription);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objUpdateTopicSubscription);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object validateAppliedSharedDataTypes(long j, long j2, @NotNull Continuation<? super ValidateSharedDataTypeResult> continuation) {
        C27951 c27951;
        if (continuation instanceof C27951) {
            c27951 = (C27951) continuation;
            int i = c27951.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27951.label = i - Integer.MIN_VALUE;
            } else {
                c27951 = new C27951(continuation);
            }
        } else {
            c27951 = new C27951(continuation);
        }
        Object objValidateAppliedSharedDataTypes = c27951.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c27951.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objValidateAppliedSharedDataTypes);
            String json = this.gson.toJson(new ValidateSharedDataTypeParam(j, j2));
            RelativeApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c27951.label = 1;
            objValidateAppliedSharedDataTypes = mService.validateAppliedSharedDataTypes(json, c27951);
            if (objValidateAppliedSharedDataTypes == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objValidateAppliedSharedDataTypes);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objValidateAppliedSharedDataTypes);
    }
}
