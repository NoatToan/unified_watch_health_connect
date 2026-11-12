package com.xiaomi.fitness.mine.personal.data.management;

import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.mine.personal.data.management.data.DataManagementRepository;
import com.xiaomi.fitness.mine.personal.data.management.data.model.AuthConfigItem;
import com.xiaomi.fitness.mine.personal.data.management.data.model.GetThirdPartyRequest;
import com.xiaomi.fitness.mine.personal.data.management.data.model.GetThirdPartyResult;
import com.xiaomi.fitness.mine.personal.data.management.data.model.LabCollaborationAuthConfig;
import com.xiaomi.fitness.mine.personal.data.management.data.model.Scope;
import com.xiaomi.fitness.mine.personal.data.management.data.model.SetThirdPartyAuthRequest;
import com.xiaomi.onetrack.c.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ-\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f0\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016J0\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\u0006\u0010\u0012\u001a\u00020\u0013J \u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u001e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u000b2\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013J$\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b2\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0018R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/mine/personal/data/management/DataManagementViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "dataManagementRepository", "Lcom/xiaomi/fitness/mine/personal/data/management/data/DataManagementRepository;", "getDataManagementRepository", "()Lcom/xiaomi/fitness/mine/personal/data/management/data/DataManagementRepository;", "setDataManagementRepository", "(Lcom/xiaomi/fitness/mine/personal/data/management/data/DataManagementRepository;)V", "getAuthConfigListLiveData", "Landroidx/lifecycle/LiveData;", "", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/AuthConfigItem;", "sid", "", "getMiAppAuthScopeListLiveData", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/Scope;", q.f13858b, "", "scopeType", "", "(JLjava/lang/Integer;)Landroidx/lifecycle/LiveData;", "updateMiAppAuthScopeListLiveData", "", "grantScopeIds", "revokeScopeIds", "getLabCollaborationAuthConfigLiveData", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/LabCollaborationAuthConfig;", "grantLabAuthLiveData", "revokeLabAuthLiveData", "getThirdPartyAuthLiveData", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/GetThirdPartyResult;", "thirdPartyType", "setThirdPartyAuthResultLiveData", "authStatus", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataManagementViewModel extends AbsViewModel {
    public DataManagementRepository dataManagementRepository;

    /* JADX INFO: renamed from: com.xiaomi.fitness.mine.personal.data.management.DataManagementViewModel$getAuthConfigListLiveData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/AuthConfigItem;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.mine.personal.data.management.DataManagementViewModel$getAuthConfigListLiveData$1", f = "DataManagementViewModel.kt", i = {}, l = {28, 28}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<LiveDataScope<List<? extends AuthConfigItem>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $sid;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$sid = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = DataManagementViewModel.this.new AnonymousClass1(this.$sid, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(LiveDataScope<List<AuthConfigItem>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            DataManagementRepository dataManagementRepository = DataManagementViewModel.this.getDataManagementRepository();
            String str = this.$sid;
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = dataManagementRepository.getAuthConfigList(str, this);
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
        public /* bridge */ /* synthetic */ Object invoke(LiveDataScope<List<? extends AuthConfigItem>> liveDataScope, Continuation<? super Unit> continuation) {
            return invoke2((LiveDataScope<List<AuthConfigItem>>) liveDataScope, continuation);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.mine.personal.data.management.DataManagementViewModel$getLabCollaborationAuthConfigLiveData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/LabCollaborationAuthConfig;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.mine.personal.data.management.DataManagementViewModel$getLabCollaborationAuthConfigLiveData$1", f = "DataManagementViewModel.kt", i = {}, l = {71, 71}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26241 extends SuspendLambda implements Function2<LiveDataScope<LabCollaborationAuthConfig>, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $appId;
        final /* synthetic */ String $sid;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26241(long j, String str, Continuation<? super C26241> continuation) {
            super(2, continuation);
            this.$appId = j;
            this.$sid = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C26241 c26241 = DataManagementViewModel.this.new C26241(this.$appId, this.$sid, continuation);
            c26241.L$0 = obj;
            return c26241;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<LabCollaborationAuthConfig> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C26241) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            DataManagementRepository dataManagementRepository = DataManagementViewModel.this.getDataManagementRepository();
            long j = this.$appId;
            String str = this.$sid;
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = dataManagementRepository.getLabCollaborationAuthConfig(j, str, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.mine.personal.data.management.DataManagementViewModel$getMiAppAuthScopeListLiveData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/Scope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.mine.personal.data.management.DataManagementViewModel$getMiAppAuthScopeListLiveData$1", f = "DataManagementViewModel.kt", i = {}, l = {42, 42}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26251 extends SuspendLambda implements Function2<LiveDataScope<List<? extends Scope>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $appId;
        final /* synthetic */ Integer $scopeType;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26251(long j, Integer num, Continuation<? super C26251> continuation) {
            super(2, continuation);
            this.$appId = j;
            this.$scopeType = num;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C26251 c26251 = DataManagementViewModel.this.new C26251(this.$appId, this.$scopeType, continuation);
            c26251.L$0 = obj;
            return c26251;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(LiveDataScope<List<Scope>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C26251) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            DataManagementRepository dataManagementRepository = DataManagementViewModel.this.getDataManagementRepository();
            long j = this.$appId;
            Integer num = this.$scopeType;
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = dataManagementRepository.getMiAppAuthScopeList(j, num, this);
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
        public /* bridge */ /* synthetic */ Object invoke(LiveDataScope<List<? extends Scope>> liveDataScope, Continuation<? super Unit> continuation) {
            return invoke2((LiveDataScope<List<Scope>>) liveDataScope, continuation);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.mine.personal.data.management.DataManagementViewModel$getThirdPartyAuthLiveData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/GetThirdPartyResult;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.mine.personal.data.management.DataManagementViewModel$getThirdPartyAuthLiveData$1", f = "DataManagementViewModel.kt", i = {}, l = {102, 102}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26261 extends SuspendLambda implements Function2<LiveDataScope<GetThirdPartyResult>, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $appId;
        final /* synthetic */ int $thirdPartyType;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DataManagementViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26261(int i, long j, DataManagementViewModel dataManagementViewModel, Continuation<? super C26261> continuation) {
            super(2, continuation);
            this.$thirdPartyType = i;
            this.$appId = j;
            this.this$0 = dataManagementViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C26261 c26261 = new C26261(this.$thirdPartyType, this.$appId, this.this$0, continuation);
            c26261.L$0 = obj;
            return c26261;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<GetThirdPartyResult> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C26261) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            GetThirdPartyRequest getThirdPartyRequest = new GetThirdPartyRequest(this.$thirdPartyType, this.$appId);
            DataManagementRepository dataManagementRepository = this.this$0.getDataManagementRepository();
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = dataManagementRepository.getThirdParty(getThirdPartyRequest, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.mine.personal.data.management.DataManagementViewModel$grantLabAuthLiveData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.mine.personal.data.management.DataManagementViewModel$grantLabAuthLiveData$1", f = "DataManagementViewModel.kt", i = {}, l = {80, 80}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26271 extends SuspendLambda implements Function2<LiveDataScope<Boolean>, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $appId;
        final /* synthetic */ String $sid;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26271(long j, String str, Continuation<? super C26271> continuation) {
            super(2, continuation);
            this.$appId = j;
            this.$sid = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C26271 c26271 = DataManagementViewModel.this.new C26271(this.$appId, this.$sid, continuation);
            c26271.L$0 = obj;
            return c26271;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<Boolean> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C26271) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            DataManagementRepository dataManagementRepository = DataManagementViewModel.this.getDataManagementRepository();
            long j = this.$appId;
            String str = this.$sid;
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = dataManagementRepository.grantLabAuth(j, str, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.mine.personal.data.management.DataManagementViewModel$revokeLabAuthLiveData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.mine.personal.data.management.DataManagementViewModel$revokeLabAuthLiveData$1", f = "DataManagementViewModel.kt", i = {}, l = {89, 89}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26281 extends SuspendLambda implements Function2<LiveDataScope<Boolean>, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $appId;
        final /* synthetic */ String $sid;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26281(long j, String str, Continuation<? super C26281> continuation) {
            super(2, continuation);
            this.$appId = j;
            this.$sid = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C26281 c26281 = DataManagementViewModel.this.new C26281(this.$appId, this.$sid, continuation);
            c26281.L$0 = obj;
            return c26281;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<Boolean> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C26281) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            DataManagementRepository dataManagementRepository = DataManagementViewModel.this.getDataManagementRepository();
            long j = this.$appId;
            String str = this.$sid;
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = dataManagementRepository.revokeLabAuth(j, str, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.mine.personal.data.management.DataManagementViewModel$setThirdPartyAuthResultLiveData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.mine.personal.data.management.DataManagementViewModel$setThirdPartyAuthResultLiveData$1", f = "DataManagementViewModel.kt", i = {}, l = {118, 118}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26291 extends SuspendLambda implements Function2<LiveDataScope<Boolean>, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $appId;
        final /* synthetic */ boolean $authStatus;
        final /* synthetic */ int $thirdPartyType;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DataManagementViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26291(int i, long j, boolean z, DataManagementViewModel dataManagementViewModel, Continuation<? super C26291> continuation) {
            super(2, continuation);
            this.$thirdPartyType = i;
            this.$appId = j;
            this.$authStatus = z;
            this.this$0 = dataManagementViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C26291 c26291 = new C26291(this.$thirdPartyType, this.$appId, this.$authStatus, this.this$0, continuation);
            c26291.L$0 = obj;
            return c26291;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<Boolean> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C26291) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            SetThirdPartyAuthRequest setThirdPartyAuthRequest = new SetThirdPartyAuthRequest(this.$thirdPartyType, this.$appId, this.$authStatus ? 1 : 0);
            DataManagementRepository dataManagementRepository = this.this$0.getDataManagementRepository();
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = dataManagementRepository.setThirdPartyAuth(setThirdPartyAuthRequest, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.mine.personal.data.management.DataManagementViewModel$updateMiAppAuthScopeListLiveData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.mine.personal.data.management.DataManagementViewModel$updateMiAppAuthScopeListLiveData$1", f = "DataManagementViewModel.kt", i = {}, l = {54, 53}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26301 extends SuspendLambda implements Function2<LiveDataScope<Boolean>, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $appId;
        final /* synthetic */ List<String> $grantScopeIds;
        final /* synthetic */ List<String> $revokeScopeIds;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26301(List<String> list, List<String> list2, long j, Continuation<? super C26301> continuation) {
            super(2, continuation);
            this.$grantScopeIds = list;
            this.$revokeScopeIds = list2;
            this.$appId = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C26301 c26301 = DataManagementViewModel.this.new C26301(this.$grantScopeIds, this.$revokeScopeIds, this.$appId, continuation);
            c26301.L$0 = obj;
            return c26301;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<Boolean> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C26301) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            DataManagementRepository dataManagementRepository = DataManagementViewModel.this.getDataManagementRepository();
            List<String> list = this.$grantScopeIds;
            List<String> list2 = this.$revokeScopeIds;
            long j = this.$appId;
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = dataManagementRepository.updateMiAppAuthScopeList(list, list2, j, this);
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

    public static /* synthetic */ LiveData getMiAppAuthScopeListLiveData$default(DataManagementViewModel dataManagementViewModel, long j, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return dataManagementViewModel.getMiAppAuthScopeListLiveData(j, num);
    }

    @NotNull
    public final LiveData<List<AuthConfigItem>> getAuthConfigListLiveData(@Nullable String sid) {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new AnonymousClass1(sid, null), 3, (Object) null);
    }

    @NotNull
    public final DataManagementRepository getDataManagementRepository() {
        DataManagementRepository dataManagementRepository = this.dataManagementRepository;
        if (dataManagementRepository != null) {
            return dataManagementRepository;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dataManagementRepository");
        return null;
    }

    @NotNull
    public final LiveData<LabCollaborationAuthConfig> getLabCollaborationAuthConfigLiveData(long appId, @Nullable String sid) {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new C26241(appId, sid, null), 3, (Object) null);
    }

    @NotNull
    public final LiveData<List<Scope>> getMiAppAuthScopeListLiveData(long appId, @Nullable Integer scopeType) {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new C26251(appId, scopeType, null), 3, (Object) null);
    }

    @NotNull
    public final LiveData<GetThirdPartyResult> getThirdPartyAuthLiveData(int thirdPartyType, long appId) {
        return CoroutineLiveDataKt.liveData$default(Dispatchers.getIO(), 0L, new C26261(thirdPartyType, appId, this, null), 2, (Object) null);
    }

    @NotNull
    public final LiveData<Boolean> grantLabAuthLiveData(long appId, @Nullable String sid) {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new C26271(appId, sid, null), 3, (Object) null);
    }

    @NotNull
    public final LiveData<Boolean> revokeLabAuthLiveData(long appId, @Nullable String sid) {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new C26281(appId, sid, null), 3, (Object) null);
    }

    public final void setDataManagementRepository(@NotNull DataManagementRepository dataManagementRepository) {
        Intrinsics.checkNotNullParameter(dataManagementRepository, "<set-?>");
        this.dataManagementRepository = dataManagementRepository;
    }

    @NotNull
    public final LiveData<Boolean> setThirdPartyAuthResultLiveData(int thirdPartyType, long appId, boolean authStatus) {
        return CoroutineLiveDataKt.liveData$default(Dispatchers.getIO(), 0L, new C26291(thirdPartyType, appId, authStatus, this, null), 2, (Object) null);
    }

    @NotNull
    public final LiveData<Boolean> updateMiAppAuthScopeListLiveData(@NotNull List<String> grantScopeIds, @NotNull List<String> revokeScopeIds, long appId) {
        Intrinsics.checkNotNullParameter(grantScopeIds, "grantScopeIds");
        Intrinsics.checkNotNullParameter(revokeScopeIds, "revokeScopeIds");
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new C26301(grantScopeIds, revokeScopeIds, appId, null), 3, (Object) null);
    }
}
