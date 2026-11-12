package com.xiaomi.fitness.account.user;

import android.content.Intent;
import android.text.TextUtils;
import androidx.health.connect.client.records.CervicalMucusRecord;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.broadcast.UserInfoBroadcastReceiver;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.extensions.OnRegularGoalChange;
import com.xiaomi.fitness.account.extensions.OnUserInfoChange;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.account.manager.IMiAccountManager;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.heartrate.finger.MiuiHeartRateCode;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
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
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 E2\u00020\u0001:\u0001EB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010#\u001a\u00020$H\u0002J&\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020\r2\u0014\u0010'\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020$0(J\u001a\u0010)\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010&\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010*J\b\u0010+\u001a\u0004\u0018\u00010\u0005J\n\u0010,\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010-\u001a\u0004\u0018\u00010\u0005J\b\u0010.\u001a\u00020$H\u0002J\u0010\u0010/\u001a\u00020\u000b2\b\b\u0002\u00100\u001a\u00020\rJ\u000e\u00101\u001a\u00020$2\u0006\u00102\u001a\u00020\u000bJ\u001a\u00103\u001a\u00020\u000b2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020$0(J2\u00105\u001a\u00020$2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020$0(2\u0016\b\u0002\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020$\u0018\u00010(J\u000e\u00107\u001a\u00020$2\u0006\u00108\u001a\u00020 J\u0006\u00109\u001a\u00020$J\u0006\u0010:\u001a\u00020$J\u0006\u0010;\u001a\u00020$J\u0006\u0010<\u001a\u00020$J\u0010\u0010=\u001a\u00020$2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u000e\u0010>\u001a\u00020$2\u0006\u0010?\u001a\u00020\u0016J\u000e\u0010@\u001a\u00020$2\u0006\u0010?\u001a\u00020\u0016J\u000e\u0010A\u001a\u00020$2\u0006\u0010?\u001a\u00020\u0018J\u000e\u0010B\u001a\u00020$2\u0006\u0010?\u001a\u00020\u0018J\u0006\u0010C\u001a\u00020\rJ\u0006\u0010D\u001a\u00020\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001f\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006F"}, d2 = {"Lcom/xiaomi/fitness/account/user/UserInfoManager;", "", "<init>", "()V", "xiaomiCoreInfo", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "getXiaomiCoreInfo", "()Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "setXiaomiCoreInfo", "(Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;)V", "userProfile", "Lcom/xiaomi/fitness/account/api/bean/UserProfile;", "xiaomiCoreInfoUpdated", "", "mMiAccountManager", "Lcom/xiaomi/fitness/account/manager/IMiAccountManager;", "getMMiAccountManager", "()Lcom/xiaomi/fitness/account/manager/IMiAccountManager;", "setMMiAccountManager", "(Lcom/xiaomi/fitness/account/manager/IMiAccountManager;)V", "mChangeListeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lcom/xiaomi/fitness/account/extensions/OnRegularGoalChange;", "mUserInfoChangeListeners", "Lcom/xiaomi/fitness/account/extensions/OnUserInfoChange;", "mUserDao", "Lcom/xiaomi/fitness/account/user/UserDao;", "getMUserDao", "()Lcom/xiaomi/fitness/account/user/UserDao;", "mUserDao$delegate", "Lkotlin/Lazy;", "userId", "", "getUserId", "()Ljava/lang/String;", TSMAuthContants.PARAM_SIGN_OUT, "", "getAccountCoreInfo", "forceRefresh", "callback", "Lkotlin/Function1;", "getMiAccountCoreInfo", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMiAccountCoreInfoSyncAndForceRefresh", "loadAccountCoreInfoFromDB", "loadAccountCoreInfo", "saveAccountCoreInfoToDB", "getUserProfile", "cached", "saveUserProfile", Scopes.PROFILE, "updateUserProfile", "block", "saveProfileToDb", "Lcom/xiaomi/fitness/account/user/UserInfoProfile;", "removeDid", "did", "init", CervicalMucusRecord.Appearance.CLEAR, "resetXiaoMiCoreInfo", "notifyUserGoalChanged", "notifyUserInfoChangeListener", "addRegularGoalChangeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeRegularGoalChangeListener", "addUserInfoChangeListener", "removeUserInfoChangeListener", "isMale", "isFemale", "Companion", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUserInfoManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserInfoManager.kt\ncom/xiaomi/fitness/account/user/UserInfoManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,252:1\n1863#2,2:253\n1863#2,2:255\n*S KotlinDebug\n*F\n+ 1 UserInfoManager.kt\ncom/xiaomi/fitness/account/user/UserInfoManager\n*L\n221#1:253,2\n227#1:255,2\n*E\n"})
public final class UserInfoManager {

    @NotNull
    public static final String ACTION_SEND_GOAL_UPDATE = "action.USER_GOAL_UPDATE";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "UserInfoManager";
    public IMiAccountManager mMiAccountManager;

    @Nullable
    private volatile UserProfile userProfile;

    @Nullable
    private AccountCoreInfo xiaomiCoreInfo;
    private boolean xiaomiCoreInfoUpdated;

    @NotNull
    private final CopyOnWriteArraySet<OnRegularGoalChange> mChangeListeners = new CopyOnWriteArraySet<>();

    @NotNull
    private final CopyOnWriteArraySet<OnUserInfoChange> mUserInfoChangeListeners = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: mUserDao$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mUserDao = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ahq
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UserInfoManager.mUserDao_delegate$lambda$0();
        }
    });

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/account/user/UserInfoManager$Companion;", "", "<init>", "()V", "TAG", "", "ACTION_SEND_GOAL_UPDATE", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.account.user.UserInfoManager$getAccountCoreInfo$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.account.user.UserInfoManager$getAccountCoreInfo$1", f = "UserInfoManager.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<AccountCoreInfo, Unit> $callback;
        final /* synthetic */ boolean $forceRefresh;
        Object L$0;
        int label;
        final /* synthetic */ UserInfoManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super AccountCoreInfo, Unit> function1, UserInfoManager userInfoManager, boolean z, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$callback = function1;
            this.this$0 = userInfoManager;
            this.$forceRefresh = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$callback, this.this$0, this.$forceRefresh, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Function1 function1;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Function1<AccountCoreInfo, Unit> function2 = this.$callback;
                if (function2 != null) {
                    UserInfoManager userInfoManager = this.this$0;
                    boolean z = this.$forceRefresh;
                    this.L$0 = function2;
                    this.label = 1;
                    Object miAccountCoreInfo = userInfoManager.getMiAccountCoreInfo(z, this);
                    if (miAccountCoreInfo == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    function1 = function2;
                    obj = miAccountCoreInfo;
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function1 = (Function1) this.L$0;
            ResultKt.throwOnFailure(obj);
            function1.invoke2(obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.account.user.UserInfoManager$getMiAccountCoreInfo$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.account.user.UserInfoManager$getMiAccountCoreInfo$2", f = "UserInfoManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AccountCoreInfo>, Object> {
        final /* synthetic */ boolean $forceRefresh;
        int label;
        final /* synthetic */ UserInfoManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, UserInfoManager userInfoManager, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$forceRefresh = z;
            this.this$0 = userInfoManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$forceRefresh, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Logger.i(UserInfoManager.TAG, "xiaomiCoreInfo is " + this.$forceRefresh);
            return this.this$0.getMMiAccountManager().getMiAccountCoreInfoSync(this.$forceRefresh);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AccountCoreInfo> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.account.user.UserInfoManager$init$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.account.user.UserInfoManager$init$1", f = "UserInfoManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17611 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C17611(Continuation<? super C17611> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UserInfoManager.this.new C17611(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            UserInfoManager.this.getUserProfile(false);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.account.user.UserInfoManager$removeDid$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.account.user.UserInfoManager$removeDid$1", f = "UserInfoManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17621 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17621(String str, Continuation<? super C17621> continuation) {
            super(2, continuation);
            this.$did = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UserInfoManager.this.new C17621(this.$did, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            UserProfile userProfile = UserInfoManager.this.getUserProfile(false);
            String str = this.$did;
            UserInfoManager userInfoManager = UserInfoManager.this;
            List<String> dids = userProfile.getDids();
            if (dids != null) {
                Boxing.boxBoolean(dids.remove(str));
            }
            userInfoManager.saveUserProfile(userProfile);
            userInfoManager.userProfile = userProfile;
            UserInfoProfile userInfoProfileByName = userInfoManager.getMUserDao().getUserInfoProfileByName(userInfoManager.getUserId());
            Logger.i(UserInfoManager.TAG, "profile remove did:" + str + " userInfo.toUserInfoProfile().dids is " + (userInfoProfileByName != null ? userInfoProfileByName.getDids() : null));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.account.user.UserInfoManager$saveProfileToDb$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.account.user.UserInfoManager$saveProfileToDb$1", f = "UserInfoManager.kt", i = {}, l = {182}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17631 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<UserInfoProfile, Unit> $block;
        final /* synthetic */ Function1<Boolean, Unit> $callback;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C17631(Function1<? super UserInfoProfile, Unit> function1, Function1<? super Boolean, Unit> function2, Continuation<? super C17631> continuation) {
            super(2, continuation);
            this.$block = function1;
            this.$callback = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UserInfoManager.this.new C17631(this.$block, this.$callback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objUpdate;
            Function1<Boolean, Unit> function1;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UserInfoProfile userInfoProfileByName = UserInfoManager.this.getMUserDao().getUserInfoProfileByName(UserInfoManager.this.getUserId());
                if (userInfoProfileByName == null) {
                    userInfoProfileByName = new UserInfoProfile(UserInfoManager.this.getUserId(), null, null, null, 0.0f, 0.0f, null, 0, 0, 0, null, null, 0, 0, 0, null, 0, 0.0f, 0L, 0.0f, null, null, 4194302, null);
                }
                this.$block.invoke2(userInfoProfileByName);
                Function1<Boolean, Unit> function2 = this.$callback;
                if (function2 != null) {
                    UserDao mUserDao = UserInfoManager.this.getMUserDao();
                    this.L$0 = function2;
                    this.label = 1;
                    objUpdate = mUserDao.update(userInfoProfileByName, this);
                    if (objUpdate == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    function1 = function2;
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function1 = (Function1) this.L$0;
            ResultKt.throwOnFailure(obj);
            objUpdate = obj;
            function1.invoke2(Boxing.boxBoolean(((Number) objUpdate).intValue() != -1));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.account.user.UserInfoManager$saveUserProfile$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.account.user.UserInfoManager$saveUserProfile$1", f = "UserInfoManager.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17641 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.BooleanRef $userGoalChanged;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17641(Ref.BooleanRef booleanRef, Continuation<? super C17641> continuation) {
            super(2, continuation);
            this.$userGoalChanged = booleanRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UserInfoManager.this.new C17641(this.$userGoalChanged, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UserDao mUserDao = UserInfoManager.this.getMUserDao();
                UserProfile userProfile = UserInfoManager.this.userProfile;
                Intrinsics.checkNotNull(userProfile);
                UserInfoProfile[] userInfoProfileArr = {AccountManagerExtKt.toUserInfoProfile$default(userProfile, null, 1, null)};
                this.label = 1;
                if (mUserDao.insert(userInfoProfileArr, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Logger.i(UserInfoManager.TAG, "getUserProfile userGoalChanged is " + this.$userGoalChanged.element);
            if (this.$userGoalChanged.element) {
                ApplicationExtKt.getApplication().sendBroadcast(new Intent(UserInfoManager.ACTION_SEND_GOAL_UPDATE));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17641) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static /* synthetic */ void getAccountCoreInfo$default(UserInfoManager userInfoManager, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        userInfoManager.getAccountCoreInfo(z, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UserDao getMUserDao() {
        return (UserDao) this.mUserDao.getValue();
    }

    public static /* synthetic */ Object getMiAccountCoreInfo$default(UserInfoManager userInfoManager, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return userInfoManager.getMiAccountCoreInfo(z, continuation);
    }

    public static /* synthetic */ UserProfile getUserProfile$default(UserInfoManager userInfoManager, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return userInfoManager.getUserProfile(z);
    }

    private final AccountCoreInfo loadAccountCoreInfoFromDB() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserDao mUserDao_delegate$lambda$0() {
        return UserDatabase.INSTANCE.getInstance().getUserDao();
    }

    private final void notifyUserInfoChangeListener(UserProfile userProfile) {
        Iterator<T> it = this.mUserInfoChangeListeners.iterator();
        while (it.hasNext()) {
            ((OnUserInfoChange) it.next()).userInfoChange(userProfile);
        }
    }

    private final void saveAccountCoreInfoToDB() {
        if (this.xiaomiCoreInfo == null) {
            return;
        }
        this.xiaomiCoreInfoUpdated = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void saveProfileToDb$default(UserInfoManager userInfoManager, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        userInfoManager.saveProfileToDb(function1, function2);
    }

    private final void signOut() {
    }

    public final void addRegularGoalChangeListener(@NotNull OnRegularGoalChange listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mChangeListeners.add(listener);
        Logger.i(TAG, "addRegularGoalChangeListener " + listener);
    }

    public final void addUserInfoChangeListener(@NotNull OnUserInfoChange listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mUserInfoChangeListeners.add(listener);
        Logger.i(TAG, "addRegularGoalChangeListener " + listener);
    }

    public final synchronized void clear() {
        Logger.i(TAG, "account is logout clear all tables.");
        this.userProfile = null;
        resetXiaoMiCoreInfo();
        UserDatabase.INSTANCE.getInstance().clearAllTables();
    }

    public final void getAccountCoreInfo(boolean forceRefresh, @NotNull Function1<? super AccountCoreInfo, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (this.xiaomiCoreInfo == null) {
            this.xiaomiCoreInfo = loadAccountCoreInfoFromDB();
        }
        AnyExtKt.io$default(null, new AnonymousClass1(callback, this, forceRefresh, null), 1, null);
    }

    @NotNull
    public final IMiAccountManager getMMiAccountManager() {
        IMiAccountManager iMiAccountManager = this.mMiAccountManager;
        if (iMiAccountManager != null) {
            return iMiAccountManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mMiAccountManager");
        return null;
    }

    @Nullable
    public final Object getMiAccountCoreInfo(boolean z, @NotNull Continuation<? super AccountCoreInfo> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(z, this, null), continuation);
    }

    @Nullable
    public final AccountCoreInfo getMiAccountCoreInfoSyncAndForceRefresh() {
        return getMMiAccountManager().getMiAccountCoreInfoSync(true);
    }

    @NotNull
    public final String getUserId() {
        try {
            String userId = getMMiAccountManager().getUserId();
            Logger.d("userId:" + userId + ",  system is " + getMMiAccountManager().isUseSystem(), new Object[0]);
            if (userId != null) {
                return userId;
            }
            signOut();
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    @NotNull
    public final synchronized UserProfile getUserProfile(boolean cached) {
        if (this.userProfile != null) {
            UserProfile userProfile = this.userProfile;
            Intrinsics.checkNotNull(userProfile);
            if (!TextUtils.isEmpty(userProfile.getName()) && cached) {
                UserProfile userProfile2 = this.userProfile;
                Intrinsics.checkNotNull(userProfile2);
                return userProfile2;
            }
        }
        this.userProfile = new UserProfile(getUserId(), null, null, null, 0.0f, 0.0f, null, 0, 0, 0, null, 0, 0, 0, 0, null, 0, 0, null, 0, null, 0.0f, null, null, MiuiHeartRateCode.HEARTBEAT_RATE_REGISTER, null);
        UserInfoProfile userInfoProfileByName = getMUserDao().getUserInfoProfileByName(getUserId());
        if (userInfoProfileByName == null) {
            UserProfile userProfile3 = this.userProfile;
            Intrinsics.checkNotNull(userProfile3);
            return userProfile3;
        }
        this.userProfile = AccountManagerExtKt.toUserProfile(userInfoProfileByName, this.userProfile);
        Logger.d(TAG, "getUserProfile userProfile is " + this.userProfile);
        UserProfile userProfile4 = this.userProfile;
        Intrinsics.checkNotNull(userProfile4);
        return userProfile4;
    }

    @Nullable
    public final AccountCoreInfo getXiaomiCoreInfo() {
        return this.xiaomiCoreInfo;
    }

    public final void init() {
        UserInfoBroadcastReceiver.INSTANCE.register();
        AnyExtKt.io$default(null, new C17611(null), 1, null);
    }

    public final boolean isFemale() {
        return Intrinsics.areEqual(getUserProfile$default(AccountManagerExtKt.getInstance(INSTANCE), false, 1, null).getSex(), "female");
    }

    public final boolean isMale() {
        return Intrinsics.areEqual(getUserProfile$default(AccountManagerExtKt.getInstance(INSTANCE), false, 1, null).getSex(), "male");
    }

    @Nullable
    public final AccountCoreInfo loadAccountCoreInfo() {
        AccountCoreInfo accountCoreInfo;
        return (!this.xiaomiCoreInfoUpdated || (accountCoreInfo = this.xiaomiCoreInfo) == null) ? IMiAccountManager.DefaultImpls.getMiAccountCoreInfoSync$default(getMMiAccountManager(), false, 1, null) : accountCoreInfo;
    }

    public final void notifyUserGoalChanged() {
        Logger.i(TAG, "notifyUserGoalChanged: action.USER_GOAL_UPDATE");
        Iterator<T> it = this.mChangeListeners.iterator();
        while (it.hasNext()) {
            ((OnRegularGoalChange) it.next()).regularGoalChange();
        }
    }

    public final void removeDid(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        AnyExtKt.io$default(null, new C17621(did, null), 1, null);
    }

    public final void removeRegularGoalChangeListener(@NotNull OnRegularGoalChange listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mChangeListeners.remove(listener);
    }

    public final void removeUserInfoChangeListener(@NotNull OnUserInfoChange listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mUserInfoChangeListeners.remove(listener);
    }

    public final void resetXiaoMiCoreInfo() {
        this.xiaomiCoreInfo = null;
        this.xiaomiCoreInfoUpdated = false;
    }

    public final void saveProfileToDb(@NotNull Function1<? super UserInfoProfile, Unit> block, @Nullable Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(block, "block");
        AnyExtKt.io$default(null, new C17631(block, callback, null), 1, null);
    }

    public final void saveUserProfile(@NotNull UserProfile profile) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        if (profile.getRegion() == null) {
            profile.setRegion(LocaleUtil.INSTANCE.getCurrentRegion());
            Logger.i(TAG, "profile.region is " + profile.getRegion());
        }
        if (profile.getName().length() == 0) {
            profile.setName(getUserId());
        }
        Logger.d(TAG, "saveUserProfile BEFORE is " + profile + " name is " + getUserId() + " after " + this.userProfile + " userDao");
        this.userProfile = profile;
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        if (getUserId().length() > 0) {
            UserInfoProfile userInfoProfileByName = getMUserDao().getUserInfoProfileByName(getUserId());
            if (userInfoProfileByName != null && profile.regularGoalChange(AccountManagerExtKt.toUserProfile$default(userInfoProfileByName, null, 1, null))) {
                booleanRef.element = true;
                if (!Intrinsics.areEqual(profile, AccountManagerExtKt.toUserProfile$default(userInfoProfileByName, null, 1, null)) && this.userProfile != null) {
                    UserProfile userProfile = this.userProfile;
                    Intrinsics.checkNotNull(userProfile);
                    notifyUserInfoChangeListener(userProfile);
                }
            } else if (userInfoProfileByName == null || Intrinsics.areEqual(profile, AccountManagerExtKt.toUserProfile$default(userInfoProfileByName, null, 1, null))) {
                if (userInfoProfileByName == null) {
                    booleanRef.element = true;
                    if (this.userProfile != null) {
                        UserProfile userProfile2 = this.userProfile;
                        Intrinsics.checkNotNull(userProfile2);
                        notifyUserInfoChangeListener(userProfile2);
                    }
                }
            } else if (this.userProfile != null) {
                UserProfile userProfile3 = this.userProfile;
                Intrinsics.checkNotNull(userProfile3);
                notifyUserInfoChangeListener(userProfile3);
            }
        }
        Logger.i(TAG, "saveUserProfile after is " + profile + " BEFORE " + this.userProfile);
        AnyExtKt.io$default(null, new C17641(booleanRef, null), 1, null);
    }

    public final void setMMiAccountManager(@NotNull IMiAccountManager iMiAccountManager) {
        Intrinsics.checkNotNullParameter(iMiAccountManager, "<set-?>");
        this.mMiAccountManager = iMiAccountManager;
    }

    public final void setXiaomiCoreInfo(@Nullable AccountCoreInfo accountCoreInfo) {
        this.xiaomiCoreInfo = accountCoreInfo;
    }

    @NotNull
    public final UserProfile updateUserProfile(@NotNull Function1<? super UserProfile, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        UserProfile userProfile$default = getUserProfile$default(this, false, 1, null);
        block.invoke2(userProfile$default);
        return userProfile$default;
    }
}
