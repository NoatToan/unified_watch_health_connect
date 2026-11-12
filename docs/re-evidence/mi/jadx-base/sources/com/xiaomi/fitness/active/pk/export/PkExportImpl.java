package com.xiaomi.fitness.active.pk.export;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fitness.active.pk.ActivePkRepository;
import com.xiaomi.fitness.active.pk.PkConstants;
import com.xiaomi.fitness.active.pk.export.entity.EntranceModel;
import com.xiaomi.fitness.active.pk.export.entity.EntrancePkRecordInfo;
import com.xiaomi.fitness.active.pk.net.model.GetEntranceResult;
import com.xiaomi.fitness.active.pk.net.model.GetHistoryPkRecordsResult;
import com.xiaomi.fitness.active.pk.net.model.GetProcessPkRecordsResult;
import com.xiaomi.fitness.active.pk.net.model.PkRecordDetail;
import com.xiaomi.fitness.active.pk.net.model.UserInfo;
import com.xiaomi.fitness.active.pk.net.model.UserPkDetail;
import com.xiaomi.fitness.active.pk.ui.InviteReceiveActivity;
import com.xiaomi.fitness.active.pk.ui.PkListActivity;
import com.xiaomi.fitness.active.pk.ui.SendingInvitationActivity;
import com.xiaomi.fitness.active.pk.util.PkLogger;
import com.xiaomi.fitness.common.utils.AppUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u000e\u0010\r\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u000fJ\"\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001aH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/active/pk/export/PkExportImpl;", "Lcom/xiaomi/fitness/active/pk/export/IPkExport;", "<init>", "()V", "activePkRepository", "Lcom/xiaomi/fitness/active/pk/ActivePkRepository;", "getActivePkRepository", "()Lcom/xiaomi/fitness/active/pk/ActivePkRepository;", "setActivePkRepository", "(Lcom/xiaomi/fitness/active/pk/ActivePkRepository;)V", "getInviteReceiveIntent", "Landroid/content/Intent;", "srcIntent", "syncGetPkCount", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "goToPKActivity", "", "pkCount", "contextParam", "Landroid/content/Context;", SdkContants.KEY_BUNDLE, "Landroid/os/Bundle;", "goToSendInvitationActivity", "goToPkListActivity", "queryPkEntranceModel", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/fitness/active/pk/export/entity/EntranceModel;", "getPkCountInProgress", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PkExportImpl implements IPkExport {
    public ActivePkRepository activePkRepository;

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.export.PkExportImpl$getPkCountInProgress$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.export.PkExportImpl$getPkCountInProgress$1", f = "PkExportImpl.kt", i = {}, l = {110, 110}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<LiveDataScope<Integer>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = PkExportImpl.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<Integer> liveDataScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            ActivePkRepository activePkRepository = PkExportImpl.this.getActivePkRepository();
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = activePkRepository.getProcessPkRecordsDetail(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            GetProcessPkRecordsResult getProcessPkRecordsResult = (GetProcessPkRecordsResult) obj;
            Integer numBoxInt = Boxing.boxInt((getProcessPkRecordsResult == null || (pkList = getProcessPkRecordsResult.getPkList()) == null) ? 0 : pkList.size());
            this.L$0 = null;
            this.label = 2;
            if (liveDataScope.emit(numBoxInt, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.export.PkExportImpl$queryPkEntranceModel$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "Lcom/xiaomi/fitness/active/pk/export/entity/EntranceModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.export.PkExportImpl$queryPkEntranceModel$1", f = "PkExportImpl.kt", i = {0}, l = {82, 86, 92}, m = "invokeSuspend", n = {"$this$liveData"}, s = {"L$0"})
    public static final class C17901 extends SuspendLambda implements Function2<LiveDataScope<EntranceModel>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public C17901(Continuation<? super C17901> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17901 c17901 = PkExportImpl.this.new C17901(continuation);
            c17901.L$0 = obj;
            return c17901;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<EntranceModel> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C17901) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope;
            Object pkEntranceResult;
            UserInfo userInfo;
            UserInfo userInfo2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    pkEntranceResult = obj;
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
            ActivePkRepository activePkRepository = PkExportImpl.this.getActivePkRepository();
            this.L$0 = liveDataScope;
            this.label = 1;
            pkEntranceResult = activePkRepository.getPkEntranceResult(this);
            if (pkEntranceResult == coroutine_suspended) {
                return coroutine_suspended;
            }
            GetEntranceResult getEntranceResult = (GetEntranceResult) pkEntranceResult;
            PkRecordDetail pkRecordDetail = getEntranceResult != null ? getEntranceResult.getPkRecordDetail() : null;
            int pkCount = getEntranceResult != null ? getEntranceResult.getPkCount() : 0;
            if (pkRecordDetail == null) {
                EntranceModel entranceModel = new EntranceModel(null, pkCount);
                this.L$0 = null;
                this.label = 2;
                if (liveDataScope.emit(entranceModel, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                UserPkDetail ownPkDetail = pkRecordDetail.getOwnPkDetail();
                String icon = (ownPkDetail == null || (userInfo2 = ownPkDetail.getUserInfo()) == null) ? null : userInfo2.getIcon();
                UserPkDetail oppPkDetail = pkRecordDetail.getOppPkDetail();
                String icon2 = (oppPkDetail == null || (userInfo = oppPkDetail.getUserInfo()) == null) ? null : userInfo.getIcon();
                UserPkDetail ownPkDetail2 = pkRecordDetail.getOwnPkDetail();
                long totalScore = ownPkDetail2 != null ? ownPkDetail2.getTotalScore() : 0L;
                UserPkDetail oppPkDetail2 = pkRecordDetail.getOppPkDetail();
                EntranceModel entranceModel2 = new EntranceModel(new EntrancePkRecordInfo(icon, icon2, Boxing.boxInt((int) totalScore), Boxing.boxInt((int) (oppPkDetail2 != null ? oppPkDetail2.getTotalScore() : 0L)), pkRecordDetail.getPkStatus() == 2), pkCount);
                this.L$0 = null;
                this.label = 3;
                if (liveDataScope.emit(entranceModel2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.export.PkExportImpl$syncGetPkCount$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.export.PkExportImpl", f = "PkExportImpl.kt", i = {0, 1}, l = {47, 49}, m = "syncGetPkCount", n = {"this", "processCount"}, s = {"L$0", "I$0"})
    public static final class C17911 extends ContinuationImpl {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C17911(Continuation<? super C17911> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PkExportImpl.this.syncGetPkCount(this);
        }
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

    /* JADX WARN: Code duplicated, block: B:19:0x005b A[Catch: Exception -> 0x0057, TRY_LEAVE, TryCatch #0 {Exception -> 0x0057, blocks: (B:15:0x004f, B:19:0x005b), top: B:24:0x004f }] */
    @Override // com.xiaomi.fitness.active.pk.export.IPkExport
    @NotNull
    public Intent getInviteReceiveIntent(@Nullable Intent srcIntent) {
        Uri data;
        Uri data2;
        Intent intent = new Intent(AppUtil.getApp(), (Class<?>) InviteReceiveActivity.class);
        String queryParameter = null;
        String queryParameter2 = (srcIntent == null || (data2 = srcIntent.getData()) == null) ? null : data2.getQueryParameter("source");
        if (srcIntent != null && (data = srcIntent.getData()) != null) {
            queryParameter = data.getQueryParameter(PkConstants.PARAM_INVITE_ID);
        }
        PkLogger.INSTANCE.i("PkPageImpl", "querySource " + queryParameter2 + " queryId " + queryParameter, new Object[0]);
        if (queryParameter2 != null) {
            try {
                intent.putExtra("source", Integer.parseInt(queryParameter2));
                if (queryParameter != null) {
                    intent.putExtra(PkConstants.PARAM_INVITE_ID, Long.parseLong(queryParameter));
                }
            } catch (Exception e) {
                PkLogger.INSTANCE.i("PkPageImpl", "exception " + e, new Object[0]);
            }
        } else if (queryParameter != null) {
            intent.putExtra(PkConstants.PARAM_INVITE_ID, Long.parseLong(queryParameter));
        }
        intent.setFlags(268468224);
        return intent;
    }

    @Override // com.xiaomi.fitness.active.pk.export.IPkExport
    @NotNull
    public LiveData<Integer> getPkCountInProgress() {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new AnonymousClass1(null), 3, (Object) null);
    }

    @Override // com.xiaomi.fitness.active.pk.export.IPkExport
    public void goToPKActivity(int pkCount, @NotNull Context contextParam, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(contextParam, "contextParam");
        if (pkCount <= 0) {
            goToSendInvitationActivity(contextParam, bundle);
        } else {
            goToPkListActivity(contextParam, bundle);
        }
    }

    @Override // com.xiaomi.fitness.active.pk.export.IPkExport
    public void goToPkListActivity(@NotNull Context contextParam, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(contextParam, "contextParam");
        contextParam.startActivity(new Intent(contextParam, (Class<?>) PkListActivity.class), bundle);
    }

    @Override // com.xiaomi.fitness.active.pk.export.IPkExport
    public void goToSendInvitationActivity(@NotNull Context contextParam, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(contextParam, "contextParam");
        contextParam.startActivity(new Intent(contextParam, (Class<?>) SendingInvitationActivity.class), bundle);
    }

    @Override // com.xiaomi.fitness.active.pk.export.IPkExport
    @NotNull
    public LiveData<EntranceModel> queryPkEntranceModel() {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new C17901(null), 3, (Object) null);
    }

    public final void setActivePkRepository(@NotNull ActivePkRepository activePkRepository) {
        Intrinsics.checkNotNullParameter(activePkRepository, "<set-?>");
        this.activePkRepository = activePkRepository;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    public final Object syncGetPkCount(@NotNull Continuation<? super Integer> continuation) {
        C17911 c17911;
        PkExportImpl pkExportImpl;
        int i;
        List<PkRecordDetail> pkList;
        GetHistoryPkRecordsResult getHistoryPkRecordsResult;
        int size;
        List<PkRecordDetail> pkList2;
        if (continuation instanceof C17911) {
            c17911 = (C17911) continuation;
            int i2 = c17911.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c17911.label = i2 - Integer.MIN_VALUE;
            } else {
                c17911 = new C17911(continuation);
            }
        } else {
            c17911 = new C17911(continuation);
        }
        C17911 c17912 = c17911;
        Object processPkRecordsDetail = c17912.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c17912.label;
        if (i3 != 0) {
            if (i3 == 1) {
                pkExportImpl = (PkExportImpl) c17912.L$0;
                ResultKt.throwOnFailure(processPkRecordsDetail);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = c17912.I$0;
                ResultKt.throwOnFailure(processPkRecordsDetail);
            }
            getHistoryPkRecordsResult = (GetHistoryPkRecordsResult) processPkRecordsDetail;
            if (getHistoryPkRecordsResult != null || (pkList2 = getHistoryPkRecordsResult.getPkList()) == null) {
                size = 0;
            } else {
                size = pkList2.size();
            }
            PkLogger.INSTANCE.i("PkPageImpl", "syncGetPkCount processCount " + i + " historyCount " + size, new Object[0]);
            return Boxing.boxInt(i + size);
        }
        ResultKt.throwOnFailure(processPkRecordsDetail);
        ActivePkRepository activePkRepository = getActivePkRepository();
        c17912.L$0 = this;
        c17912.label = 1;
        processPkRecordsDetail = activePkRepository.getProcessPkRecordsDetail(c17912);
        if (processPkRecordsDetail == coroutine_suspended) {
            return coroutine_suspended;
        }
        pkExportImpl = this;
        GetProcessPkRecordsResult getProcessPkRecordsResult = (GetProcessPkRecordsResult) processPkRecordsDetail;
        int size2 = (getProcessPkRecordsResult == null || (pkList = getProcessPkRecordsResult.getPkList()) == null) ? 0 : pkList.size();
        ActivePkRepository activePkRepository2 = pkExportImpl.getActivePkRepository();
        Integer numBoxInt = Boxing.boxInt(20);
        c17912.L$0 = null;
        c17912.I$0 = size2;
        c17912.label = 2;
        Object historyPkRecordsDetail$default = ActivePkRepository.getHistoryPkRecordsDetail$default(activePkRepository2, 2, null, null, numBoxInt, false, c17912, 16, null);
        if (historyPkRecordsDetail$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        i = size2;
        processPkRecordsDetail = historyPkRecordsDetail$default;
        getHistoryPkRecordsResult = (GetHistoryPkRecordsResult) processPkRecordsDetail;
        if (getHistoryPkRecordsResult != null) {
            size = 0;
        } else {
            size = 0;
        }
        PkLogger.INSTANCE.i("PkPageImpl", "syncGetPkCount processCount " + i + " historyCount " + size, new Object[0]);
        return Boxing.boxInt(i + size);
    }
}
