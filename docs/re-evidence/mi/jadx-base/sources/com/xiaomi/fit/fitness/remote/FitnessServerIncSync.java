package com.xiaomi.fit.fitness.remote;

import android.os.Bundle;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.TextUtils;
import com.xiaomi.fit.data.common.constant.FitnessDataChangedSource;
import com.xiaomi.fit.data.common.constant.FitnessDataChangedUtils;
import com.xiaomi.fit.data.common.constant.FitnessDataConstants;
import com.xiaomi.fit.data.common.constant.SyncTriggerSource;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.b;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncer;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.export.sp.FitnessDataPreference;
import com.xiaomi.fit.fitness.persist.data.CloudSyncCheckResult;
import com.xiaomi.fit.fitness.persist.db.utils.SwitchSongDaoUtils;
import com.xiaomi.fit.fitness.persist.process.IncrementalSyncController;
import com.xiaomi.fit.fitness.persist.process.SyncRequestResult;
import com.xiaomi.fit.fitness.persist.utils.FitnessPersistUtils;
import com.xiaomi.fit.fitness.remote.FitnessServerIncSync;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.net.scope.AndroidScope;
import java.util.concurrent.atomic.AtomicBoolean;
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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 >2\u00020\u0001:\u0001>B\t\b\u0002¢\u0006\u0004\b=\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0011\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0016\u001a\u00020\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u0004J+\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010$\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0002¢\u0006\u0004\b&\u0010\u0004R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001e\u00105\u001a\n\u0012\u0004\u0012\u000204\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001e\u00107\u001a\n\u0012\u0004\u0012\u000204\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00106R\u001e\u00108\u001a\n\u0012\u0004\u0012\u000204\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00106R\u001e\u00109\u001a\n\u0012\u0004\u0012\u000204\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00106R!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010)\u001a\u0004\b;\u0010<¨\u0006?"}, d2 = {"Lcom/xiaomi/fit/fitness/remote/FitnessServerIncSync;", "", "", "pullDailyRainbowAndRedDotAsync", "()V", "", "triggerSource", "", "isForeground", "syncWithServer", "(Ljava/lang/String;Z)V", "syncDataWithServer", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "success", "", "errorCode", "isFirstCloudSync", "handleSyncResult", "(ZLjava/lang/Integer;Z)V", "Landroid/os/RemoteCallbackList;", "Lcom/xiaomi/fit/fitness/b;", "listenerList", "notifySyncResult", "(Landroid/os/RemoteCallbackList;Z)V", "addLoginListener", "markMigrate", "forceSync", "callback", "triggerSyncWithServer", "(ZLjava/lang/String;Lcom/xiaomi/fit/fitness/b;)V", "syncMedicalDataWithServer", "(Ljava/lang/String;)V", "", "time", "playerId", "value", "insertSwitchSongRecord", "(JILjava/lang/String;)V", "syncSwitchSongRecordWithServer", "Lcom/xiaomi/fitness/account/manager/AccountManager;", "accountMgr$delegate", "Lkotlin/Lazy;", "getAccountMgr", "()Lcom/xiaomi/fitness/account/manager/AccountManager;", "accountMgr", "Lcom/xiaomi/fit/fitness/persist/process/IncrementalSyncController;", "incSyncInstance", "Lcom/xiaomi/fit/fitness/persist/process/IncrementalSyncController;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isTaskSyncing", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lkotlinx/coroutines/Deferred;", "Lcom/xiaomi/fit/fitness/persist/process/SyncRequestResult;", "sportSyncJob", "Lkotlinx/coroutines/Deferred;", "dailySyncJob", "medicalSyncJob", "projectSyncJob", "listenerList$delegate", "getListenerList", "()Landroid/os/RemoteCallbackList;", "<init>", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FitnessServerIncSync {

    @Nullable
    private Deferred<SyncRequestResult> dailySyncJob;

    @Nullable
    private Deferred<SyncRequestResult> medicalSyncJob;

    @Nullable
    private Deferred<SyncRequestResult> projectSyncJob;

    @Nullable
    private Deferred<SyncRequestResult> sportSyncJob;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final FitnessServerIncSync instance = new FitnessServerIncSync();

    @NotNull
    private static final String TAG = "FitnessServerSyncInc";

    /* JADX INFO: renamed from: accountMgr$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy accountMgr = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: mv9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FitnessServerIncSync.accountMgr_delegate$lambda$0();
        }
    });

    @NotNull
    private final IncrementalSyncController incSyncInstance = IncrementalSyncController.INSTANCE.getInstance();

    @NotNull
    private final AtomicBoolean isTaskSyncing = new AtomicBoolean(false);

    /* JADX INFO: renamed from: listenerList$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy listenerList = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: nv9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FitnessServerIncSync.listenerList_delegate$lambda$1();
        }
    });

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fit/fitness/remote/FitnessServerIncSync$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fit/fitness/remote/FitnessServerIncSync;", "getInstance", "()Lcom/xiaomi/fit/fitness/remote/FitnessServerIncSync;", "TAG", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FitnessServerIncSync getInstance() {
            return FitnessServerIncSync.instance;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.remote.FitnessServerIncSync$insertSwitchSongRecord$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.remote.FitnessServerIncSync$insertSwitchSongRecord$1", f = "FitnessServerIncSync.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $playerId;
        final /* synthetic */ long $time;
        final /* synthetic */ String $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, int i, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$time = j;
            this.$playerId = i;
            this.$value = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$time, this.$playerId, this.$value, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SwitchSongDaoUtils switchSongDaoUtils = SwitchSongDaoUtils.INSTANCE;
            long j = this.$time;
            int i = this.$playerId;
            String str = this.$value;
            Intrinsics.checkNotNull(str);
            switchSongDaoUtils.updateOrInsertSwitchSong(j, i, str);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.remote.FitnessServerIncSync$markMigrate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.remote.FitnessServerIncSync$markMigrate$1", f = "FitnessServerIncSync.kt", i = {}, l = {229}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17101 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C17101(Continuation<? super C17101> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FitnessServerIncSync.this.new C17101(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String userId = FitnessServerIncSync.this.getAccountMgr().getUserId();
                FitnessLogUtils.i(FitnessServerIncSync.TAG, "markMigrate: start(" + (userId == null || userId.length() == 0) + ")");
                if (userId == null) {
                    return Unit.INSTANCE;
                }
                IncrementalSyncController incrementalSyncController = FitnessServerIncSync.this.incSyncInstance;
                this.label = 1;
                if (incrementalSyncController.markMigrateNewApp(userId, this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.remote.FitnessServerIncSync$syncDataWithServer$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.remote.FitnessServerIncSync$syncDataWithServer$2", f = "FitnessServerIncSync.kt", i = {4, 5, 5, 6, 6, 6, 7, 7, 7, 7}, l = {132, 132, 133, 133, 151, 152, 153, 154}, m = "invokeSuspend", n = {"startSyncTime", "sportResult", "startSyncTime", "sportResult", "dailySyncResult", "startSyncTime", "sportResult", "dailySyncResult", "medicalSyncResult", "startSyncTime"}, s = {"J$0", "L$0", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "L$2", "J$0"})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ boolean $isForeground;
        final /* synthetic */ String $triggerSource;
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fit.fitness.remote.FitnessServerIncSync$syncDataWithServer$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fit/fitness/persist/process/SyncRequestResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fit.fitness.remote.FitnessServerIncSync$syncDataWithServer$2$1", f = "FitnessServerIncSync.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SyncRequestResult>, Object> {
            final /* synthetic */ boolean $isForeground;
            final /* synthetic */ String $triggerSource;
            int label;
            final /* synthetic */ FitnessServerIncSync this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(FitnessServerIncSync fitnessServerIncSync, String str, boolean z, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = fitnessServerIncSync;
                this.$triggerSource = str;
                this.$isForeground = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$triggerSource, this.$isForeground, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    IncrementalSyncController incrementalSyncController = this.this$0.incSyncInstance;
                    String str = this.$triggerSource;
                    boolean z = this.$isForeground;
                    this.label = 1;
                    obj = incrementalSyncController.syncFitnessDataWithServer(str, z, this);
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

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SyncRequestResult> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.fit.fitness.remote.FitnessServerIncSync$syncDataWithServer$2$2, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fit/fitness/persist/process/SyncRequestResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fit.fitness.remote.FitnessServerIncSync$syncDataWithServer$2$2", f = "FitnessServerIncSync.kt", i = {}, l = {145}, m = "invokeSuspend", n = {}, s = {})
        public static final class C03702 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SyncRequestResult>, Object> {
            int label;
            final /* synthetic */ FitnessServerIncSync this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03702(FitnessServerIncSync fitnessServerIncSync, Continuation<? super C03702> continuation) {
                super(2, continuation);
                this.this$0 = fitnessServerIncSync;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C03702(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    IncrementalSyncController incrementalSyncController = this.this$0.incSyncInstance;
                    this.label = 1;
                    obj = incrementalSyncController.syncSportWithServer(this);
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

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SyncRequestResult> continuation) {
                return ((C03702) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.fit.fitness.remote.FitnessServerIncSync$syncDataWithServer$2$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fit/fitness/persist/process/SyncRequestResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fit.fitness.remote.FitnessServerIncSync$syncDataWithServer$2$3", f = "FitnessServerIncSync.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SyncRequestResult>, Object> {
            final /* synthetic */ boolean $isForeground;
            final /* synthetic */ String $triggerSource;
            int label;
            final /* synthetic */ FitnessServerIncSync this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(FitnessServerIncSync fitnessServerIncSync, String str, boolean z, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = fitnessServerIncSync;
                this.$triggerSource = str;
                this.$isForeground = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, this.$triggerSource, this.$isForeground, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    IncrementalSyncController incrementalSyncController = this.this$0.incSyncInstance;
                    String str = this.$triggerSource;
                    boolean z = this.$isForeground;
                    this.label = 1;
                    obj = incrementalSyncController.syncMedicalDataWithServer(str, z, this);
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

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SyncRequestResult> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.fit.fitness.remote.FitnessServerIncSync$syncDataWithServer$2$4, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fit/fitness/persist/process/SyncRequestResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fit.fitness.remote.FitnessServerIncSync$syncDataWithServer$2$4", f = "FitnessServerIncSync.kt", i = {}, l = {149}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SyncRequestResult>, Object> {
            final /* synthetic */ boolean $isForeground;
            final /* synthetic */ String $triggerSource;
            int label;
            final /* synthetic */ FitnessServerIncSync this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(FitnessServerIncSync fitnessServerIncSync, String str, boolean z, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = fitnessServerIncSync;
                this.$triggerSource = str;
                this.$isForeground = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, this.$triggerSource, this.$isForeground, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    IncrementalSyncController incrementalSyncController = this.this$0.incSyncInstance;
                    String str = this.$triggerSource;
                    boolean z = this.$isForeground;
                    this.label = 1;
                    obj = incrementalSyncController.syncProjectDataWithServer(str, z, this);
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

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SyncRequestResult> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, boolean z, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$triggerSource = str;
            this.$isForeground = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = FitnessServerIncSync.this.new AnonymousClass2(this.$triggerSource, this.$isForeground, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x009b  */
        /* JADX WARN: Code duplicated, block: B:28:0x00a3  */
        /* JADX WARN: Code duplicated, block: B:30:0x00ab A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:33:0x00b0  */
        /* JADX WARN: Code duplicated, block: B:38:0x00bf  */
        /* JADX WARN: Code duplicated, block: B:40:0x00c8 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:43:0x00cd  */
        /* JADX WARN: Code duplicated, block: B:46:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:48:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:50:0x00e5 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:53:0x00ea  */
        /* JADX WARN: Code duplicated, block: B:55:0x00f0  */
        /* JADX WARN: Code duplicated, block: B:64:0x01a1 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:67:0x01bc A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:68:0x01bd  */
        /* JADX WARN: Code duplicated, block: B:71:0x01df A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:72:0x01e0  */
        /* JADX WARN: Code duplicated, block: B:75:0x01ee  */
        /* JADX WARN: Code duplicated, block: B:83:0x0203  */
        /* JADX WARN: Code duplicated, block: B:86:0x020a  */
        /* JADX WARN: Code duplicated, block: B:90:0x0216  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objAwait;
            long j;
            Object objAwait2;
            Deferred deferred;
            Object objAwait3;
            SyncRequestResult syncRequestResult;
            Deferred deferred2;
            Object objAwait4;
            SyncRequestResult syncRequestResult2;
            Deferred deferred3;
            Object objAwait5;
            SyncRequestResult syncRequestResult3;
            SyncRequestResult syncRequestResult4;
            SyncRequestResult syncRequestResult5;
            Object objAwait6;
            SyncRequestResult syncRequestResult6;
            Object objAwait7;
            SyncRequestResult syncRequestResult7;
            SyncRequestResult syncRequestResult8;
            SyncRequestResult syncRequestResult9;
            Object objAwait8;
            SyncRequestResult syncRequestResult10;
            long j2;
            SyncRequestResult syncRequestResult11;
            boolean z;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            boolean z2 = false;
            boolean z3 = true;
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    if (!FitnessServerIncSync.this.isTaskSyncing.get()) {
                        FitnessLogUtils.i(FitnessServerIncSync.TAG, "syncDataWithServer");
                        FitnessServerIncSync.this.isTaskSyncing.set(true);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        FitnessServerIncSync fitnessServerIncSync = FitnessServerIncSync.this;
                        fitnessServerIncSync.sportSyncJob = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new AnonymousClass1(fitnessServerIncSync, this.$triggerSource, this.$isForeground, null), 3, null);
                        FitnessServerIncSync fitnessServerIncSync2 = FitnessServerIncSync.this;
                        fitnessServerIncSync2.dailySyncJob = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new C03702(fitnessServerIncSync2, null), 3, null);
                        FitnessServerIncSync fitnessServerIncSync3 = FitnessServerIncSync.this;
                        fitnessServerIncSync3.medicalSyncJob = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new AnonymousClass3(fitnessServerIncSync3, this.$triggerSource, this.$isForeground, null), 3, null);
                        FitnessServerIncSync fitnessServerIncSync4 = FitnessServerIncSync.this;
                        fitnessServerIncSync4.projectSyncJob = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new AnonymousClass4(fitnessServerIncSync4, this.$triggerSource, this.$isForeground, null), 3, null);
                        Deferred deferred4 = FitnessServerIncSync.this.sportSyncJob;
                        Intrinsics.checkNotNull(deferred4);
                        this.J$0 = jCurrentTimeMillis;
                        this.label = 5;
                        objAwait = deferred4.await(this);
                        if (objAwait == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        j = jCurrentTimeMillis;
                        syncRequestResult5 = (SyncRequestResult) objAwait;
                        Deferred deferred5 = FitnessServerIncSync.this.dailySyncJob;
                        Intrinsics.checkNotNull(deferred5);
                        this.L$0 = syncRequestResult5;
                        this.J$0 = j;
                        this.label = 6;
                        objAwait6 = deferred5.await(this);
                        if (objAwait6 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        syncRequestResult6 = (SyncRequestResult) objAwait6;
                        Deferred deferred6 = FitnessServerIncSync.this.medicalSyncJob;
                        Intrinsics.checkNotNull(deferred6);
                        this.L$0 = syncRequestResult5;
                        this.L$1 = syncRequestResult6;
                        this.J$0 = j;
                        this.label = 7;
                        objAwait7 = deferred6.await(this);
                        if (objAwait7 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        syncRequestResult7 = syncRequestResult5;
                        syncRequestResult8 = syncRequestResult6;
                        syncRequestResult9 = (SyncRequestResult) objAwait7;
                        Deferred deferred7 = FitnessServerIncSync.this.projectSyncJob;
                        Intrinsics.checkNotNull(deferred7);
                        this.L$0 = syncRequestResult7;
                        this.L$1 = syncRequestResult8;
                        this.L$2 = syncRequestResult9;
                        this.J$0 = j;
                        this.label = 8;
                        objAwait8 = deferred7.await(this);
                        if (objAwait8 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        syncRequestResult10 = syncRequestResult8;
                        j2 = j;
                        syncRequestResult11 = syncRequestResult9;
                        SyncRequestResult syncRequestResult12 = (SyncRequestResult) objAwait8;
                        if (!syncRequestResult7.getHasNewData() || syncRequestResult10.getHasNewData() || syncRequestResult11.getHasNewData() || syncRequestResult12.getHasNewData()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if ((syncRequestResult7.getSuccess() || !syncRequestResult10.getSuccess() || !syncRequestResult11.getSuccess()) && !syncRequestResult12.getSuccess()) {
                        }
                        FitnessLogUtils.i(FitnessServerIncSync.TAG, "syncDataWithServer: success = " + z3 + ", hasNewData = " + z + ", cost(" + (System.currentTimeMillis() - j2) + ")ms");
                        FitnessServerIncSync.this.handleSyncResult(z3, Boxing.boxInt(2), syncRequestResult10.isFirstCloudSync());
                        FitnessServerIncSync.this.isTaskSyncing.set(false);
                        return Boxing.boxBoolean(z3);
                    }
                    Deferred deferred8 = FitnessServerIncSync.this.sportSyncJob;
                    if (deferred8 == null) {
                        deferred = FitnessServerIncSync.this.dailySyncJob;
                        if (deferred == null) {
                            this.label = 2;
                            objAwait3 = deferred.await(this);
                            if (objAwait3 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            syncRequestResult2 = (SyncRequestResult) objAwait3;
                            if (syncRequestResult2 == null) {
                            }
                        }
                        deferred3 = FitnessServerIncSync.this.projectSyncJob;
                        if (deferred3 != null) {
                            this.label = 4;
                            objAwait5 = deferred3.await(this);
                            if (objAwait5 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            syncRequestResult4 = (SyncRequestResult) objAwait5;
                            if (syncRequestResult4 != null) {
                                z2 = true;
                            }
                        }
                        FitnessLogUtils.i(FitnessServerIncSync.TAG, "syncDataWithServer: waiting last sync task result = " + z2);
                        return Boxing.boxBoolean(z2);
                    }
                    this.label = 1;
                    objAwait2 = deferred8.await(this);
                    if (objAwait2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    syncRequestResult = (SyncRequestResult) objAwait2;
                    if (syncRequestResult == null && syncRequestResult.getSuccess()) {
                        z2 = true;
                    } else {
                        deferred = FitnessServerIncSync.this.dailySyncJob;
                        if (deferred == null) {
                            this.label = 2;
                            objAwait3 = deferred.await(this);
                            if (objAwait3 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            syncRequestResult2 = (SyncRequestResult) objAwait3;
                            if (syncRequestResult2 == null && syncRequestResult2.getSuccess()) {
                                z2 = true;
                            }
                        }
                        deferred3 = FitnessServerIncSync.this.projectSyncJob;
                        if (deferred3 != null) {
                            this.label = 4;
                            objAwait5 = deferred3.await(this);
                            if (objAwait5 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            syncRequestResult4 = (SyncRequestResult) objAwait5;
                            if (syncRequestResult4 != null && syncRequestResult4.getSuccess()) {
                                z2 = true;
                            }
                        }
                    }
                    FitnessLogUtils.i(FitnessServerIncSync.TAG, "syncDataWithServer: waiting last sync task result = " + z2);
                    return Boxing.boxBoolean(z2);
                    deferred2 = FitnessServerIncSync.this.medicalSyncJob;
                    if (deferred2 != null) {
                        this.label = 3;
                        objAwait4 = deferred2.await(this);
                        if (objAwait4 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        syncRequestResult3 = (SyncRequestResult) objAwait4;
                        if (syncRequestResult3 == null && syncRequestResult3.getSuccess()) {
                            z2 = true;
                        } else {
                            deferred3 = FitnessServerIncSync.this.projectSyncJob;
                            if (deferred3 != null) {
                                this.label = 4;
                                objAwait5 = deferred3.await(this);
                                if (objAwait5 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                syncRequestResult4 = (SyncRequestResult) objAwait5;
                                if (syncRequestResult4 != null) {
                                    z2 = true;
                                }
                            }
                        }
                    } else {
                        deferred3 = FitnessServerIncSync.this.projectSyncJob;
                        if (deferred3 != null) {
                            this.label = 4;
                            objAwait5 = deferred3.await(this);
                            if (objAwait5 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            syncRequestResult4 = (SyncRequestResult) objAwait5;
                            if (syncRequestResult4 != null) {
                                z2 = true;
                            }
                        }
                    }
                    FitnessLogUtils.i(FitnessServerIncSync.TAG, "syncDataWithServer: waiting last sync task result = " + z2);
                    return Boxing.boxBoolean(z2);
                case 1:
                    ResultKt.throwOnFailure(obj);
                    objAwait2 = obj;
                    syncRequestResult = (SyncRequestResult) objAwait2;
                    if (syncRequestResult == null) {
                        break;
                    }
                    deferred = FitnessServerIncSync.this.dailySyncJob;
                    if (deferred == null) {
                        deferred2 = FitnessServerIncSync.this.medicalSyncJob;
                        if (deferred2 != null) {
                            this.label = 3;
                            objAwait4 = deferred2.await(this);
                            if (objAwait4 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            syncRequestResult3 = (SyncRequestResult) objAwait4;
                            if (syncRequestResult3 == null) {
                            }
                            break;
                        }
                        FitnessLogUtils.i(FitnessServerIncSync.TAG, "syncDataWithServer: waiting last sync task result = " + z2);
                        return Boxing.boxBoolean(z2);
                    }
                    this.label = 2;
                    objAwait3 = deferred.await(this);
                    if (objAwait3 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    syncRequestResult2 = (SyncRequestResult) objAwait3;
                    if (syncRequestResult2 == null) {
                        break;
                    }
                    deferred2 = FitnessServerIncSync.this.medicalSyncJob;
                    if (deferred2 != null) {
                        this.label = 3;
                        objAwait4 = deferred2.await(this);
                        if (objAwait4 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        syncRequestResult3 = (SyncRequestResult) objAwait4;
                        if (syncRequestResult3 == null) {
                        }
                        break;
                    }
                    FitnessLogUtils.i(FitnessServerIncSync.TAG, "syncDataWithServer: waiting last sync task result = " + z2);
                    return Boxing.boxBoolean(z2);
                    deferred3 = FitnessServerIncSync.this.projectSyncJob;
                    if (deferred3 != null) {
                        this.label = 4;
                        objAwait5 = deferred3.await(this);
                        if (objAwait5 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        syncRequestResult4 = (SyncRequestResult) objAwait5;
                        if (syncRequestResult4 != null) {
                            z2 = true;
                        }
                    }
                    FitnessLogUtils.i(FitnessServerIncSync.TAG, "syncDataWithServer: waiting last sync task result = " + z2);
                    return Boxing.boxBoolean(z2);
                case 2:
                    ResultKt.throwOnFailure(obj);
                    objAwait3 = obj;
                    syncRequestResult2 = (SyncRequestResult) objAwait3;
                    if (syncRequestResult2 == null) {
                        break;
                    }
                    deferred2 = FitnessServerIncSync.this.medicalSyncJob;
                    if (deferred2 != null) {
                        this.label = 3;
                        objAwait4 = deferred2.await(this);
                        if (objAwait4 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        syncRequestResult3 = (SyncRequestResult) objAwait4;
                        if (syncRequestResult3 == null) {
                        }
                        deferred3 = FitnessServerIncSync.this.projectSyncJob;
                        if (deferred3 != null) {
                            this.label = 4;
                            objAwait5 = deferred3.await(this);
                            if (objAwait5 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            syncRequestResult4 = (SyncRequestResult) objAwait5;
                            if (syncRequestResult4 != null) {
                                z2 = true;
                            }
                        }
                        break;
                    } else {
                        deferred3 = FitnessServerIncSync.this.projectSyncJob;
                        if (deferred3 != null) {
                            this.label = 4;
                            objAwait5 = deferred3.await(this);
                            if (objAwait5 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            syncRequestResult4 = (SyncRequestResult) objAwait5;
                            if (syncRequestResult4 != null) {
                                z2 = true;
                            }
                        }
                    }
                    FitnessLogUtils.i(FitnessServerIncSync.TAG, "syncDataWithServer: waiting last sync task result = " + z2);
                    return Boxing.boxBoolean(z2);
                case 3:
                    ResultKt.throwOnFailure(obj);
                    objAwait4 = obj;
                    syncRequestResult3 = (SyncRequestResult) objAwait4;
                    if (syncRequestResult3 == null) {
                        break;
                    }
                    deferred3 = FitnessServerIncSync.this.projectSyncJob;
                    if (deferred3 != null) {
                        this.label = 4;
                        objAwait5 = deferred3.await(this);
                        if (objAwait5 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        syncRequestResult4 = (SyncRequestResult) objAwait5;
                        if (syncRequestResult4 != null) {
                            z2 = true;
                        }
                    }
                    FitnessLogUtils.i(FitnessServerIncSync.TAG, "syncDataWithServer: waiting last sync task result = " + z2);
                    return Boxing.boxBoolean(z2);
                case 4:
                    ResultKt.throwOnFailure(obj);
                    objAwait5 = obj;
                    syncRequestResult4 = (SyncRequestResult) objAwait5;
                    if (syncRequestResult4 != null) {
                        z2 = true;
                    }
                    FitnessLogUtils.i(FitnessServerIncSync.TAG, "syncDataWithServer: waiting last sync task result = " + z2);
                    return Boxing.boxBoolean(z2);
                case 5:
                    j = this.J$0;
                    ResultKt.throwOnFailure(obj);
                    objAwait = obj;
                    syncRequestResult5 = (SyncRequestResult) objAwait;
                    Deferred deferred9 = FitnessServerIncSync.this.dailySyncJob;
                    Intrinsics.checkNotNull(deferred9);
                    this.L$0 = syncRequestResult5;
                    this.J$0 = j;
                    this.label = 6;
                    objAwait6 = deferred9.await(this);
                    if (objAwait6 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    syncRequestResult6 = (SyncRequestResult) objAwait6;
                    Deferred deferred10 = FitnessServerIncSync.this.medicalSyncJob;
                    Intrinsics.checkNotNull(deferred10);
                    this.L$0 = syncRequestResult5;
                    this.L$1 = syncRequestResult6;
                    this.J$0 = j;
                    this.label = 7;
                    objAwait7 = deferred10.await(this);
                    if (objAwait7 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    syncRequestResult7 = syncRequestResult5;
                    syncRequestResult8 = syncRequestResult6;
                    syncRequestResult9 = (SyncRequestResult) objAwait7;
                    Deferred deferred11 = FitnessServerIncSync.this.projectSyncJob;
                    Intrinsics.checkNotNull(deferred11);
                    this.L$0 = syncRequestResult7;
                    this.L$1 = syncRequestResult8;
                    this.L$2 = syncRequestResult9;
                    this.J$0 = j;
                    this.label = 8;
                    objAwait8 = deferred11.await(this);
                    if (objAwait8 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    syncRequestResult10 = syncRequestResult8;
                    j2 = j;
                    syncRequestResult11 = syncRequestResult9;
                    SyncRequestResult syncRequestResult13 = (SyncRequestResult) objAwait8;
                    if (syncRequestResult7.getHasNewData()) {
                        z = true;
                    } else {
                        z = true;
                    }
                    z3 = syncRequestResult7.getSuccess() ? false : false;
                    FitnessLogUtils.i(FitnessServerIncSync.TAG, "syncDataWithServer: success = " + z3 + ", hasNewData = " + z + ", cost(" + (System.currentTimeMillis() - j2) + ")ms");
                    FitnessServerIncSync.this.handleSyncResult(z3, Boxing.boxInt(2), syncRequestResult10.isFirstCloudSync());
                    FitnessServerIncSync.this.isTaskSyncing.set(false);
                    return Boxing.boxBoolean(z3);
                case 6:
                    j = this.J$0;
                    syncRequestResult5 = (SyncRequestResult) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objAwait6 = obj;
                    syncRequestResult6 = (SyncRequestResult) objAwait6;
                    Deferred deferred12 = FitnessServerIncSync.this.medicalSyncJob;
                    Intrinsics.checkNotNull(deferred12);
                    this.L$0 = syncRequestResult5;
                    this.L$1 = syncRequestResult6;
                    this.J$0 = j;
                    this.label = 7;
                    objAwait7 = deferred12.await(this);
                    if (objAwait7 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    syncRequestResult7 = syncRequestResult5;
                    syncRequestResult8 = syncRequestResult6;
                    syncRequestResult9 = (SyncRequestResult) objAwait7;
                    Deferred deferred13 = FitnessServerIncSync.this.projectSyncJob;
                    Intrinsics.checkNotNull(deferred13);
                    this.L$0 = syncRequestResult7;
                    this.L$1 = syncRequestResult8;
                    this.L$2 = syncRequestResult9;
                    this.J$0 = j;
                    this.label = 8;
                    objAwait8 = deferred13.await(this);
                    if (objAwait8 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    syncRequestResult10 = syncRequestResult8;
                    j2 = j;
                    syncRequestResult11 = syncRequestResult9;
                    SyncRequestResult syncRequestResult14 = (SyncRequestResult) objAwait8;
                    if (syncRequestResult7.getHasNewData()) {
                        z = true;
                    } else {
                        z = true;
                    }
                    if (syncRequestResult7.getSuccess()) {
                    }
                    FitnessLogUtils.i(FitnessServerIncSync.TAG, "syncDataWithServer: success = " + z3 + ", hasNewData = " + z + ", cost(" + (System.currentTimeMillis() - j2) + ")ms");
                    FitnessServerIncSync.this.handleSyncResult(z3, Boxing.boxInt(2), syncRequestResult10.isFirstCloudSync());
                    FitnessServerIncSync.this.isTaskSyncing.set(false);
                    return Boxing.boxBoolean(z3);
                case 7:
                    j = this.J$0;
                    syncRequestResult8 = (SyncRequestResult) this.L$1;
                    syncRequestResult7 = (SyncRequestResult) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objAwait7 = obj;
                    syncRequestResult9 = (SyncRequestResult) objAwait7;
                    Deferred deferred14 = FitnessServerIncSync.this.projectSyncJob;
                    Intrinsics.checkNotNull(deferred14);
                    this.L$0 = syncRequestResult7;
                    this.L$1 = syncRequestResult8;
                    this.L$2 = syncRequestResult9;
                    this.J$0 = j;
                    this.label = 8;
                    objAwait8 = deferred14.await(this);
                    if (objAwait8 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    syncRequestResult10 = syncRequestResult8;
                    j2 = j;
                    syncRequestResult11 = syncRequestResult9;
                    SyncRequestResult syncRequestResult15 = (SyncRequestResult) objAwait8;
                    if (syncRequestResult7.getHasNewData()) {
                        z = true;
                    } else {
                        z = true;
                    }
                    if (syncRequestResult7.getSuccess()) {
                    }
                    FitnessLogUtils.i(FitnessServerIncSync.TAG, "syncDataWithServer: success = " + z3 + ", hasNewData = " + z + ", cost(" + (System.currentTimeMillis() - j2) + ")ms");
                    FitnessServerIncSync.this.handleSyncResult(z3, Boxing.boxInt(2), syncRequestResult10.isFirstCloudSync());
                    FitnessServerIncSync.this.isTaskSyncing.set(false);
                    return Boxing.boxBoolean(z3);
                case 8:
                    j2 = this.J$0;
                    syncRequestResult11 = (SyncRequestResult) this.L$2;
                    syncRequestResult10 = (SyncRequestResult) this.L$1;
                    syncRequestResult7 = (SyncRequestResult) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objAwait8 = obj;
                    SyncRequestResult syncRequestResult16 = (SyncRequestResult) objAwait8;
                    if (syncRequestResult7.getHasNewData()) {
                        z = true;
                    } else {
                        z = true;
                    }
                    if (syncRequestResult7.getSuccess()) {
                    }
                    FitnessLogUtils.i(FitnessServerIncSync.TAG, "syncDataWithServer: success = " + z3 + ", hasNewData = " + z + ", cost(" + (System.currentTimeMillis() - j2) + ")ms");
                    FitnessServerIncSync.this.handleSyncResult(z3, Boxing.boxInt(2), syncRequestResult10.isFirstCloudSync());
                    FitnessServerIncSync.this.isTaskSyncing.set(false);
                    return Boxing.boxBoolean(z3);
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.remote.FitnessServerIncSync$syncMedicalDataWithServer$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.remote.FitnessServerIncSync$syncMedicalDataWithServer$1", f = "FitnessServerIncSync.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17111 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $triggerSource;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17111(String str, Continuation<? super C17111> continuation) {
            super(2, continuation);
            this.$triggerSource = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FitnessServerIncSync.this.new C17111(this.$triggerSource, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IncrementalSyncController incrementalSyncController = FitnessServerIncSync.this.incSyncInstance;
                String str = this.$triggerSource;
                this.label = 1;
                obj = incrementalSyncController.syncMedicalDataWithServer(str, true, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            SyncRequestResult syncRequestResult = (SyncRequestResult) obj;
            FitnessLogUtils.i(FitnessServerIncSync.TAG, "syncMedicalData(" + this.$triggerSource + " - " + syncRequestResult.getSuccess() + "),hasData(" + syncRequestResult.getHasNewData() + ")");
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.remote.FitnessServerIncSync$syncSwitchSongRecordWithServer$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.remote.FitnessServerIncSync$syncSwitchSongRecordWithServer$1", f = "FitnessServerIncSync.kt", i = {}, l = {247}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17121 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C17121(Continuation<? super C17121> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C17121(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SwitchSongDaoUtils switchSongDaoUtils = SwitchSongDaoUtils.INSTANCE;
                this.label = 1;
                if (switchSongDaoUtils.uploadSwitchSong$fitness_data_core_chinaProductRelease(this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.remote.FitnessServerIncSync$syncWithServer$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.remote.FitnessServerIncSync$syncWithServer$1", f = "FitnessServerIncSync.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17131 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isForeground;
        final /* synthetic */ String $triggerSource;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17131(String str, boolean z, Continuation<? super C17131> continuation) {
            super(2, continuation);
            this.$triggerSource = str;
            this.$isForeground = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FitnessServerIncSync.this.new C17131(this.$triggerSource, this.$isForeground, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FitnessServerIncSync fitnessServerIncSync = FitnessServerIncSync.this;
                String str = this.$triggerSource;
                boolean z = this.$isForeground;
                this.label = 1;
                obj = fitnessServerIncSync.syncDataWithServer(str, z, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                FitnessDataPreference.INSTANCE.setSYNC_TIME(System.currentTimeMillis());
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17131) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private FitnessServerIncSync() {
        addLoginListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountManager accountMgr_delegate$lambda$0() {
        return AccountManagerExtKt.getInstance(AccountManager.INSTANCE);
    }

    private final void addLoginListener() {
        if (getAccountMgr().isLogin()) {
            markMigrate();
        } else {
            getAccountMgr().addAccountListener(new Function1() { // from class: rv9
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return FitnessServerIncSync.addLoginListener$lambda$4(this.f32942a, ((Boolean) obj).booleanValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addLoginListener$lambda$4(FitnessServerIncSync this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.markMigrate();
            FitnessLogUtils.i(TAG, "account login, and triggerSyncWithServer");
            triggerSyncWithServer$default(this$0, true, "account_login", null, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AccountManager getAccountMgr() {
        return (AccountManager) this.accountMgr.getValue();
    }

    private final RemoteCallbackList<b> getListenerList() {
        return (RemoteCallbackList) this.listenerList.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSyncResult(boolean success, Integer errorCode, boolean isFirstCloudSync) {
        notifySyncResult(getListenerList(), success);
        Bundle bundle = new Bundle();
        bundle.putBoolean(FitnessDataConstants.EXTRA_IS_FIRST_CLOUD_SYNC, isFirstCloudSync);
        FitnessDataChangedUtils.sendRecentDataChangedBroadcast$default(FitnessDataChangedUtils.INSTANCE, FitnessDataChangedSource.CloudSync, success, errorCode, bundle, false, 16, null);
    }

    public static /* synthetic */ void handleSyncResult$default(FitnessServerIncSync fitnessServerIncSync, boolean z, Integer num, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        fitnessServerIncSync.handleSyncResult(z, num, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RemoteCallbackList listenerList_delegate$lambda$1() {
        return new RemoteCallbackList();
    }

    private final void markMigrate() {
        ScopeExtKt.scopeNet(Dispatchers.getIO(), new C17101(null)).m503catch(new Function2() { // from class: ov9
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FitnessServerIncSync.markMigrate$lambda$5((AndroidScope) obj, (Throwable) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit markMigrate$lambda$5(AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        FitnessLogUtils.e(TAG, "markMigrate", it);
        return Unit.INSTANCE;
    }

    private final synchronized void notifySyncResult(RemoteCallbackList<b> listenerList, boolean success) {
        int iBeginBroadcast = listenerList.beginBroadcast();
        FitnessLogUtils.i(TAG, "notifySyncResult, notify Listener(" + iBeginBroadcast + ")");
        for (int i = 0; i < iBeginBroadcast; i++) {
            try {
                b bVar = (b) listenerList.getBroadcastItem(i);
                bVar.onSyncResult(success);
                listenerList.unregister(bVar);
            } catch (RemoteException e) {
                FitnessLogUtils.i(TAG, "notifySyncResult", e);
            }
        }
        listenerList.finishBroadcast();
    }

    private final void pullDailyRainbowAndRedDotAsync() {
        FitnessServerSyncer.Companion companion = FitnessServerSyncer.INSTANCE;
        FitnessDataExtKt.getInstance(companion).pullAndPushRainbowData();
        FitnessDataExtKt.getInstance(companion).pullRedDotData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object syncDataWithServer(@SyncTriggerSource String str, boolean z, Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(str, z, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit syncMedicalDataWithServer$lambda$2(AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        FitnessLogUtils.i(TAG, "syncMedicalData", it);
        return Unit.INSTANCE;
    }

    private final void syncWithServer(@SyncTriggerSource String triggerSource, boolean isForeground) {
        ScopeExtKt.scopeNet(Dispatchers.getIO(), new C17131(triggerSource, isForeground, null)).m503catch(new Function2() { // from class: qv9
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FitnessServerIncSync.syncWithServer$lambda$3((AndroidScope) obj, (Throwable) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit syncWithServer$lambda$3(AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        FitnessLogUtils.i(TAG, "syncWithServer", it);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void triggerSyncWithServer$default(FitnessServerIncSync fitnessServerIncSync, boolean z, String str, b bVar, int i, Object obj) {
        if ((i & 4) != 0) {
            bVar = null;
        }
        fitnessServerIncSync.triggerSyncWithServer(z, str, bVar);
    }

    public final void insertSwitchSongRecord(long time, int playerId, @Nullable String value) {
        if (TextUtils.isEmpty(value)) {
            FitnessLogUtils.i(TAG, "can not insert switch song with empty value");
        } else {
            ScopeExtKt.scopeNet(Dispatchers.getIO(), new AnonymousClass1(time, playerId, value, null));
        }
    }

    public final void syncMedicalDataWithServer(@SyncTriggerSource @NotNull String triggerSource) {
        Intrinsics.checkNotNullParameter(triggerSource, "triggerSource");
        ScopeExtKt.scopeNet(Dispatchers.getIO(), new C17111(triggerSource, null)).m503catch(new Function2() { // from class: pv9
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FitnessServerIncSync.syncMedicalDataWithServer$lambda$2((AndroidScope) obj, (Throwable) obj2);
            }
        });
    }

    public final void syncSwitchSongRecordWithServer() {
        ScopeExtKt.scopeNet(Dispatchers.getIO(), new C17121(null));
    }

    public final void triggerSyncWithServer(boolean forceSync, @SyncTriggerSource @NotNull String triggerSource, @Nullable b callback) {
        Intrinsics.checkNotNullParameter(triggerSource, "triggerSource");
        if (callback != null) {
            getListenerList().register(callback);
        }
        String str = TAG;
        FitnessLogUtils.i(str, "syncWithServer, forceSync = " + forceSync + ", triggerSource = " + triggerSource);
        CloudSyncCheckResult cloudSyncCheckResultCheckServerRequestEnable = FitnessPersistUtils.INSTANCE.checkServerRequestEnable();
        if (cloudSyncCheckResultCheckServerRequestEnable != CloudSyncCheckResult.SUCCESS && cloudSyncCheckResultCheckServerRequestEnable != CloudSyncCheckResult.BACKGROUND_RUNNING) {
            FitnessLogUtils.i(str, "syncWithServer: checkResult = " + cloudSyncCheckResultCheckServerRequestEnable.getMsg() + ", and abort");
            handleSyncResult$default(this, false, Integer.valueOf(cloudSyncCheckResultCheckServerRequestEnable.getCode()), false, 4, null);
            return;
        }
        boolean z = cloudSyncCheckResultCheckServerRequestEnable == CloudSyncCheckResult.BACKGROUND_RUNNING;
        if (!forceSync || z) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            FitnessDataConstants fitnessDataConstants = FitnessDataConstants.INSTANCE;
            long cloud_sync_bg_interval_in_milli = z ? fitnessDataConstants.getCLOUD_SYNC_BG_INTERVAL_IN_MILLI() : fitnessDataConstants.getSYNC_FORGOUND_INTERVAL_IN_MILLI();
            FitnessDataPreference fitnessDataPreference = FitnessDataPreference.INSTANCE;
            if (jCurrentTimeMillis - fitnessDataPreference.getSYNC_TIME() < cloud_sync_bg_interval_in_milli) {
                FitnessLogUtils.i(str, "syncWithServer: isBg = " + z + ", last sync time(" + fitnessDataPreference.getSYNC_TIME() + "), and abort");
                handleSyncResult$default(this, true, null, false, 4, null);
                return;
            }
        }
        syncWithServer(triggerSource, !z);
        pullDailyRainbowAndRedDotAsync();
    }
}
