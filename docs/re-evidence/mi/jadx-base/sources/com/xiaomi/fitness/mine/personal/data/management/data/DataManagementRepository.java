package com.xiaomi.fitness.mine.personal.data.management.data;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.mine.personal.data.management.data.model.AuthConfigItem;
import com.xiaomi.fitness.mine.personal.data.management.data.model.GetLabCollaborationAuthConfigResult;
import com.xiaomi.fitness.mine.personal.data.management.data.model.GetMiAppAuthScopeListResult;
import com.xiaomi.fitness.mine.personal.data.management.data.model.GetThirdPartyAuthConfigListResult;
import com.xiaomi.fitness.mine.personal.data.management.data.model.GetThirdPartyRequest;
import com.xiaomi.fitness.mine.personal.data.management.data.model.GetThirdPartyResult;
import com.xiaomi.fitness.mine.personal.data.management.data.model.GrantLabAuthResult;
import com.xiaomi.fitness.mine.personal.data.management.data.model.LabCollaborationAuthConfig;
import com.xiaomi.fitness.mine.personal.data.management.data.model.RevokeLabAuthResult;
import com.xiaomi.fitness.mine.personal.data.management.data.model.Scope;
import com.xiaomi.fitness.mine.personal.data.management.data.model.SetThirdPartyAuthRequest;
import com.xiaomi.fitness.mine.personal.data.management.data.model.SetThirdPartyAuthResult;
import com.xiaomi.fitness.mine.personal.data.management.data.model.UpdateMiAppAuthScopeListResult;
import com.xiaomi.onetrack.c.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0086@¢\u0006\u0002\u0010\u000fJ*\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0086@¢\u0006\u0002\u0010\u0016J2\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010\u001bJ\"\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0086@¢\u0006\u0002\u0010\u001eJ \u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0086@¢\u0006\u0002\u0010\u001eJ \u0010 \u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0086@¢\u0006\u0002\u0010\u001eJ\u0016\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020#H\u0086@¢\u0006\u0002\u0010$J\u0018\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(H\u0086@¢\u0006\u0002\u0010)R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/mine/personal/data/management/data/DataManagementRepository;", "", "<init>", "()V", "dataManagementRequest", "Lcom/xiaomi/fitness/mine/personal/data/management/data/DataManagementRequest;", "getDataManagementRequest", "()Lcom/xiaomi/fitness/mine/personal/data/management/data/DataManagementRequest;", "setDataManagementRequest", "(Lcom/xiaomi/fitness/mine/personal/data/management/data/DataManagementRequest;)V", "getAuthConfigList", "", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/AuthConfigItem;", "sid", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMiAppAuthScopeList", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/Scope;", q.f13858b, "", "scopeType", "", "(JLjava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateMiAppAuthScopeList", "", "grantScopeIds", "revokeScopeIds", "(Ljava/util/List;Ljava/util/List;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLabCollaborationAuthConfig", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/LabCollaborationAuthConfig;", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "grantLabAuth", "revokeLabAuth", "setThirdPartyAuth", "setThirdPartyAuthRequest", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/SetThirdPartyAuthRequest;", "(Lcom/xiaomi/fitness/mine/personal/data/management/data/model/SetThirdPartyAuthRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getThirdParty", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/GetThirdPartyResult;", "partyAutRequest", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/GetThirdPartyRequest;", "(Lcom/xiaomi/fitness/mine/personal/data/management/data/model/GetThirdPartyRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataManagementRepository {

    @NotNull
    public static final String TAG = "DataManagementRepository";
    public DataManagementRequest dataManagementRequest;

    /* JADX INFO: renamed from: com.xiaomi.fitness.mine.personal.data.management.data.DataManagementRepository$getAuthConfigList$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.mine.personal.data.management.data.DataManagementRepository", f = "DataManagementRepository.kt", i = {}, l = {28}, m = "getAuthConfigList", n = {}, s = {})
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
            return DataManagementRepository.this.getAuthConfigList(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.mine.personal.data.management.data.DataManagementRepository$getLabCollaborationAuthConfig$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.mine.personal.data.management.data.DataManagementRepository", f = "DataManagementRepository.kt", i = {}, l = {79}, m = "getLabCollaborationAuthConfig", n = {}, s = {})
    public static final class C26311 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C26311(Continuation<? super C26311> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DataManagementRepository.this.getLabCollaborationAuthConfig(0L, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.mine.personal.data.management.data.DataManagementRepository$getMiAppAuthScopeList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.mine.personal.data.management.data.DataManagementRepository", f = "DataManagementRepository.kt", i = {}, l = {44}, m = "getMiAppAuthScopeList", n = {}, s = {})
    public static final class C26321 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C26321(Continuation<? super C26321> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DataManagementRepository.this.getMiAppAuthScopeList(0L, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.mine.personal.data.management.data.DataManagementRepository$getThirdParty$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.mine.personal.data.management.data.DataManagementRepository", f = "DataManagementRepository.kt", i = {}, l = {143}, m = "getThirdParty", n = {}, s = {})
    public static final class C26331 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C26331(Continuation<? super C26331> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DataManagementRepository.this.getThirdParty(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.mine.personal.data.management.data.DataManagementRepository$grantLabAuth$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.mine.personal.data.management.data.DataManagementRepository", f = "DataManagementRepository.kt", i = {0}, l = {100}, m = "grantLabAuth", n = {"result"}, s = {"I$0"})
    public static final class C26341 extends ContinuationImpl {
        int I$0;
        int label;
        /* synthetic */ Object result;

        public C26341(Continuation<? super C26341> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DataManagementRepository.this.grantLabAuth(0L, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.mine.personal.data.management.data.DataManagementRepository$revokeLabAuth$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.mine.personal.data.management.data.DataManagementRepository", f = "DataManagementRepository.kt", i = {0}, l = {115}, m = "revokeLabAuth", n = {"result"}, s = {"I$0"})
    public static final class C26351 extends ContinuationImpl {
        int I$0;
        int label;
        /* synthetic */ Object result;

        public C26351(Continuation<? super C26351> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DataManagementRepository.this.revokeLabAuth(0L, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.mine.personal.data.management.data.DataManagementRepository$setThirdPartyAuth$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.mine.personal.data.management.data.DataManagementRepository", f = "DataManagementRepository.kt", i = {0}, l = {129}, m = "setThirdPartyAuth", n = {"result"}, s = {"I$0"})
    public static final class C26361 extends ContinuationImpl {
        int I$0;
        int label;
        /* synthetic */ Object result;

        public C26361(Continuation<? super C26361> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DataManagementRepository.this.setThirdPartyAuth(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.mine.personal.data.management.data.DataManagementRepository$updateMiAppAuthScopeList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.mine.personal.data.management.data.DataManagementRepository", f = "DataManagementRepository.kt", i = {0}, l = {60}, m = "updateMiAppAuthScopeList", n = {"result"}, s = {"I$0"})
    public static final class C26371 extends ContinuationImpl {
        int I$0;
        int label;
        /* synthetic */ Object result;

        public C26371(Continuation<? super C26371> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DataManagementRepository.this.updateMiAppAuthScopeList(null, null, 0L, this);
        }
    }

    public static /* synthetic */ Object getMiAppAuthScopeList$default(DataManagementRepository dataManagementRepository, long j, Integer num, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return dataManagementRepository.getMiAppAuthScopeList(j, num, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getAuthConfigList(@Nullable String str, @NotNull Continuation<? super List<AuthConfigItem>> continuation) {
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
        Object authConfigList = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        List<AuthConfigItem> authConfigList2 = null;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(authConfigList);
                DataManagementRequest dataManagementRequest = getDataManagementRequest();
                anonymousClass1.label = 1;
                authConfigList = dataManagementRequest.getAuthConfigList(str, anonymousClass1);
                if (authConfigList == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(authConfigList);
            }
            authConfigList2 = ((GetThirdPartyAuthConfigListResult) authConfigList).getAuthConfigList();
            Logger.i(TAG, "getAuthConfigList succeed, result is " + authConfigList2);
            return authConfigList2;
        } catch (Exception e) {
            Logger.i(TAG, "getAuthConfigList failed, exception=" + e);
            return authConfigList2;
        }
    }

    @NotNull
    public final DataManagementRequest getDataManagementRequest() {
        DataManagementRequest dataManagementRequest = this.dataManagementRequest;
        if (dataManagementRequest != null) {
            return dataManagementRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dataManagementRequest");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getLabCollaborationAuthConfig(long j, @Nullable String str, @NotNull Continuation<? super LabCollaborationAuthConfig> continuation) {
        C26311 c26311;
        if (continuation instanceof C26311) {
            c26311 = (C26311) continuation;
            int i = c26311.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26311.label = i - Integer.MIN_VALUE;
            } else {
                c26311 = new C26311(continuation);
            }
        } else {
            c26311 = new C26311(continuation);
        }
        Object labCollaborationAuthConfig = c26311.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c26311.label;
        LabCollaborationAuthConfig labCollaborationAuthConfig2 = null;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(labCollaborationAuthConfig);
                DataManagementRequest dataManagementRequest = getDataManagementRequest();
                c26311.label = 1;
                labCollaborationAuthConfig = dataManagementRequest.getLabCollaborationAuthConfig(j, str, c26311);
                if (labCollaborationAuthConfig == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(labCollaborationAuthConfig);
            }
            GetLabCollaborationAuthConfigResult getLabCollaborationAuthConfigResult = (GetLabCollaborationAuthConfigResult) labCollaborationAuthConfig;
            LabCollaborationAuthConfig labCollaborationAuthConfig3 = new LabCollaborationAuthConfig(getLabCollaborationAuthConfigResult.getTitle(), getLabCollaborationAuthConfigResult.getContent(), getLabCollaborationAuthConfigResult.getAuthStatus(), getLabCollaborationAuthConfigResult.getExitable());
            try {
                Logger.i(TAG, "getLabCollaborationAuthConfig succeed, result is " + labCollaborationAuthConfig3);
                return labCollaborationAuthConfig3;
            } catch (Exception e) {
                labCollaborationAuthConfig2 = labCollaborationAuthConfig3;
                e = e;
                Logger.i(TAG, "getLabCollaborationAuthConfig failed, exception=" + e);
                return labCollaborationAuthConfig2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getMiAppAuthScopeList(long j, @Nullable Integer num, @NotNull Continuation<? super List<Scope>> continuation) {
        C26321 c26321;
        if (continuation instanceof C26321) {
            c26321 = (C26321) continuation;
            int i = c26321.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26321.label = i - Integer.MIN_VALUE;
            } else {
                c26321 = new C26321(continuation);
            }
        } else {
            c26321 = new C26321(continuation);
        }
        Object miAppAuthScopeList = c26321.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c26321.label;
        List<Scope> scopeList = null;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(miAppAuthScopeList);
                DataManagementRequest dataManagementRequest = getDataManagementRequest();
                c26321.label = 1;
                miAppAuthScopeList = dataManagementRequest.getMiAppAuthScopeList(j, num, c26321);
                if (miAppAuthScopeList == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(miAppAuthScopeList);
            }
            scopeList = ((GetMiAppAuthScopeListResult) miAppAuthScopeList).getScopeList();
            Logger.i(TAG, "getMiAppAuthScopeList succeed, result is " + scopeList);
            return scopeList;
        } catch (Exception e) {
            Logger.i(TAG, "getMiAppAuthScopeList failed, exception=" + e);
            return scopeList;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getThirdParty(@NotNull GetThirdPartyRequest getThirdPartyRequest, @NotNull Continuation<? super GetThirdPartyResult> continuation) {
        C26331 c26331;
        if (continuation instanceof C26331) {
            c26331 = (C26331) continuation;
            int i = c26331.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26331.label = i - Integer.MIN_VALUE;
            } else {
                c26331 = new C26331(continuation);
            }
        } else {
            c26331 = new C26331(continuation);
        }
        Object thirdParty = c26331.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c26331.label;
        GetThirdPartyResult getThirdPartyResult = null;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(thirdParty);
                DataManagementRequest dataManagementRequest = getDataManagementRequest();
                c26331.label = 1;
                thirdParty = dataManagementRequest.getThirdParty(getThirdPartyRequest, c26331);
                if (thirdParty == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(thirdParty);
            }
            GetThirdPartyResult getThirdPartyResult2 = (GetThirdPartyResult) thirdParty;
            try {
                Logger.i(TAG, "getThirdParty succeed, result is " + getThirdPartyResult2);
                return getThirdPartyResult2;
            } catch (Exception e) {
                e = e;
                getThirdPartyResult = getThirdPartyResult2;
                Logger.i(TAG, "getThirdParty failed, exception=" + e);
                return getThirdPartyResult;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.StringBuilder] */
    @Nullable
    public final Object grantLabAuth(long j, @Nullable String str, @NotNull Continuation<? super Boolean> continuation) {
        C26341 c26341;
        ?? result;
        ?? r7;
        if (continuation instanceof C26341) {
            c26341 = (C26341) continuation;
            int i = c26341.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26341.label = i - Integer.MIN_VALUE;
            } else {
                c26341 = new C26341(continuation);
            }
        } else {
            c26341 = new C26341(continuation);
        }
        Object objGrantLabAuth = c26341.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c26341.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGrantLabAuth);
            try {
                DataManagementRequest dataManagementRequest = getDataManagementRequest();
                c26341.I$0 = 0;
                c26341.label = 1;
                objGrantLabAuth = dataManagementRequest.grantLabAuth(j, str, c26341);
                if (objGrantLabAuth == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Exception e) {
                e = e;
                result = 0;
                Logger.i(TAG, "grantLabAuth failed, exception=" + e);
                r7 = result;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            result = c26341.I$0;
            try {
                ResultKt.throwOnFailure(objGrantLabAuth);
            } catch (Exception e2) {
                e = e2;
                Logger.i(TAG, "grantLabAuth failed, exception=" + e);
                r7 = result;
            }
        }
        result = ((GrantLabAuthResult) objGrantLabAuth).getResult();
        Logger.i(TAG, "grantLabAuth succeed, result is " + result);
        r7 = result;
        return Boxing.boxBoolean(r7 != 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.StringBuilder] */
    @Nullable
    public final Object revokeLabAuth(long j, @Nullable String str, @NotNull Continuation<? super Boolean> continuation) {
        C26351 c26351;
        ?? result;
        ?? r7;
        if (continuation instanceof C26351) {
            c26351 = (C26351) continuation;
            int i = c26351.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26351.label = i - Integer.MIN_VALUE;
            } else {
                c26351 = new C26351(continuation);
            }
        } else {
            c26351 = new C26351(continuation);
        }
        Object objRevokeLabAuth = c26351.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c26351.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objRevokeLabAuth);
            try {
                DataManagementRequest dataManagementRequest = getDataManagementRequest();
                c26351.I$0 = 0;
                c26351.label = 1;
                objRevokeLabAuth = dataManagementRequest.revokeLabAuth(j, str, c26351);
                if (objRevokeLabAuth == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Exception e) {
                e = e;
                result = 0;
                Logger.i(TAG, "revokeLabAuth failed, exception=" + e);
                r7 = result;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            result = c26351.I$0;
            try {
                ResultKt.throwOnFailure(objRevokeLabAuth);
            } catch (Exception e2) {
                e = e2;
                Logger.i(TAG, "revokeLabAuth failed, exception=" + e);
                r7 = result;
            }
        }
        result = ((RevokeLabAuthResult) objRevokeLabAuth).getResult();
        Logger.i(TAG, "revokeLabAuth succeed, result is " + result);
        r7 = result;
        return Boxing.boxBoolean(r7 != 0);
    }

    public final void setDataManagementRequest(@NotNull DataManagementRequest dataManagementRequest) {
        Intrinsics.checkNotNullParameter(dataManagementRequest, "<set-?>");
        this.dataManagementRequest = dataManagementRequest;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.StringBuilder] */
    @Nullable
    public final Object setThirdPartyAuth(@NotNull SetThirdPartyAuthRequest setThirdPartyAuthRequest, @NotNull Continuation<? super Boolean> continuation) {
        C26361 c26361;
        ?? success;
        ?? r7;
        if (continuation instanceof C26361) {
            c26361 = (C26361) continuation;
            int i = c26361.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26361.label = i - Integer.MIN_VALUE;
            } else {
                c26361 = new C26361(continuation);
            }
        } else {
            c26361 = new C26361(continuation);
        }
        Object thirdPartyAuth = c26361.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c26361.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(thirdPartyAuth);
            try {
                DataManagementRequest dataManagementRequest = getDataManagementRequest();
                c26361.I$0 = 0;
                c26361.label = 1;
                thirdPartyAuth = dataManagementRequest.setThirdPartyAuth(setThirdPartyAuthRequest, c26361);
                if (thirdPartyAuth == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Exception e) {
                e = e;
                success = 0;
                Logger.i(TAG, "setThirdPartyAuth failed, exception=" + e);
                r7 = success;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            success = c26361.I$0;
            try {
                ResultKt.throwOnFailure(thirdPartyAuth);
            } catch (Exception e2) {
                e = e2;
                Logger.i(TAG, "setThirdPartyAuth failed, exception=" + e);
                r7 = success;
            }
        }
        success = ((SetThirdPartyAuthResult) thirdPartyAuth).getSuccess();
        Logger.i(TAG, "setThirdPartyAuth succeed, result is " + success);
        r7 = success;
        return Boxing.boxBoolean(r7 != 0);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v9, types: [int] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.StringBuilder] */
    @Nullable
    public final Object updateMiAppAuthScopeList(@NotNull List<String> list, @NotNull List<String> list2, long j, @NotNull Continuation<? super Boolean> continuation) {
        C26371 c26371;
        ?? result;
        ?? r11;
        if (continuation instanceof C26371) {
            c26371 = (C26371) continuation;
            int i = c26371.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26371.label = i - Integer.MIN_VALUE;
            } else {
                c26371 = new C26371(continuation);
            }
        } else {
            c26371 = new C26371(continuation);
        }
        C26371 c26372 = c26371;
        Object objUpdateMiAppAuthScopeList = c26372.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c26372.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUpdateMiAppAuthScopeList);
            try {
                DataManagementRequest dataManagementRequest = getDataManagementRequest();
                c26372.I$0 = 0;
                c26372.label = 1;
                objUpdateMiAppAuthScopeList = dataManagementRequest.updateMiAppAuthScopeList(list, list2, j, c26372);
                if (objUpdateMiAppAuthScopeList == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Exception e) {
                e = e;
                result = 0;
                Logger.i(TAG, "updateMiAppAuthScopeList failed, exception=" + e);
                r11 = result;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            result = c26372.I$0;
            try {
                ResultKt.throwOnFailure(objUpdateMiAppAuthScopeList);
            } catch (Exception e2) {
                e = e2;
                Logger.i(TAG, "updateMiAppAuthScopeList failed, exception=" + e);
                r11 = result;
            }
        }
        result = ((UpdateMiAppAuthScopeListResult) objUpdateMiAppAuthScopeList).getResult();
        Logger.i(TAG, "updateMiAppAuthScopeList succeed, result is " + result);
        r11 = result;
        return Boxing.boxBoolean(r11 != 0);
    }
}
