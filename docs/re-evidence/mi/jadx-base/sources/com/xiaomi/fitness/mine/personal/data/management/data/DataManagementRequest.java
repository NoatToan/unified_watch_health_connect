package com.xiaomi.fitness.mine.personal.data.management.data;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.mine.personal.data.management.data.model.GetLabCollaborationAuthConfigParam;
import com.xiaomi.fitness.mine.personal.data.management.data.model.GetLabCollaborationAuthConfigResult;
import com.xiaomi.fitness.mine.personal.data.management.data.model.GetMiAppAuthConfigListParam;
import com.xiaomi.fitness.mine.personal.data.management.data.model.GetMiAppAuthScopeListResult;
import com.xiaomi.fitness.mine.personal.data.management.data.model.GetThirdPartyAuthConfigListResult;
import com.xiaomi.fitness.mine.personal.data.management.data.model.GetThirdPartyAuthConfigParam;
import com.xiaomi.fitness.mine.personal.data.management.data.model.GetThirdPartyRequest;
import com.xiaomi.fitness.mine.personal.data.management.data.model.GetThirdPartyResult;
import com.xiaomi.fitness.mine.personal.data.management.data.model.GrantLabAuthParam;
import com.xiaomi.fitness.mine.personal.data.management.data.model.GrantLabAuthResult;
import com.xiaomi.fitness.mine.personal.data.management.data.model.RevokeLabAuthParam;
import com.xiaomi.fitness.mine.personal.data.management.data.model.RevokeLabAuthResult;
import com.xiaomi.fitness.mine.personal.data.management.data.model.SetThirdPartyAuthRequest;
import com.xiaomi.fitness.mine.personal.data.management.data.model.SetThirdPartyAuthResult;
import com.xiaomi.fitness.mine.personal.data.management.data.model.UpdateMiAppAuthScopeListResult;
import com.xiaomi.fitness.mine.personal.data.management.data.model.UpdateMiAppScopeParam;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.extensions.HttpPoint;
import com.xiaomi.onetrack.c.q;
import dagger.hilt.android.EntryPointAccessors;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0086@¢\u0006\u0002\u0010\tJ\"\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0086@¢\u0006\u0002\u0010\u0010J2\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00142\u0006\u0010\f\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u0016J \u0010\u0017\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0086@¢\u0006\u0002\u0010\u0019J \u0010\u001a\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0086@¢\u0006\u0002\u0010\u0019J \u0010\u001c\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0086@¢\u0006\u0002\u0010\u0019J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0086@¢\u0006\u0002\u0010\"J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0086@¢\u0006\u0002\u0010'¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/mine/personal/data/management/data/DataManagementRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/mine/personal/data/management/data/DataManagementService;", "<init>", "()V", "getAuthConfigList", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/GetThirdPartyAuthConfigListResult;", "sid", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMiAppAuthScopeList", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/GetMiAppAuthScopeListResult;", q.f13858b, "", "scopeType", "", "(JLjava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateMiAppAuthScopeList", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/UpdateMiAppAuthScopeListResult;", "grantScopeIds", "", "revokeScopeIds", "(Ljava/util/List;Ljava/util/List;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLabCollaborationAuthConfig", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/GetLabCollaborationAuthConfigResult;", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "grantLabAuth", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/GrantLabAuthResult;", "revokeLabAuth", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/RevokeLabAuthResult;", "setThirdPartyAuth", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/SetThirdPartyAuthResult;", "setThirdPartyAutRequest", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/SetThirdPartyAuthRequest;", "(Lcom/xiaomi/fitness/mine/personal/data/management/data/model/SetThirdPartyAuthRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getThirdParty", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/GetThirdPartyResult;", "partyAutRequest", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/GetThirdPartyRequest;", "(Lcom/xiaomi/fitness/mine/personal/data/management/data/model/GetThirdPartyRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDataManagementRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataManagementRequest.kt\ncom/xiaomi/fitness/mine/personal/data/management/data/DataManagementRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n+ 3 HttpExtension.kt\ncom/xiaomi/fitness/net/extensions/HttpExtensionKt\n*L\n1#1,101:1\n141#2:102\n141#2:106\n141#2:110\n141#2:114\n141#2:118\n141#2:122\n141#2:126\n141#2:130\n31#3:103\n28#3,2:104\n31#3:107\n28#3,2:108\n31#3:111\n28#3,2:112\n31#3:115\n28#3,2:116\n31#3:119\n28#3,2:120\n31#3:123\n28#3,2:124\n31#3:127\n28#3,2:128\n31#3:131\n28#3,2:132\n*S KotlinDebug\n*F\n+ 1 DataManagementRequest.kt\ncom/xiaomi/fitness/mine/personal/data/management/data/DataManagementRequest\n*L\n26#1:102\n38#1:106\n51#1:110\n63#1:114\n72#1:118\n81#1:122\n90#1:126\n99#1:130\n26#1:103\n26#1:104,2\n38#1:107\n38#1:108,2\n51#1:111\n51#1:112,2\n63#1:115\n63#1:116,2\n72#1:119\n72#1:120,2\n81#1:123\n81#1:124,2\n90#1:127\n90#1:128,2\n99#1:131\n99#1:132,2\n*E\n"})
public final class DataManagementRequest extends BaseRequest<DataManagementService> {

    @NotNull
    private static final String TAG = "DataManagementRequest";

    /* JADX INFO: renamed from: com.xiaomi.fitness.mine.personal.data.management.data.DataManagementRequest$getAuthConfigList$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.mine.personal.data.management.data.DataManagementRequest", f = "DataManagementRequest.kt", i = {}, l = {26}, m = "getAuthConfigList", n = {}, s = {})
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
            return DataManagementRequest.this.getAuthConfigList(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.mine.personal.data.management.data.DataManagementRequest$getLabCollaborationAuthConfig$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.mine.personal.data.management.data.DataManagementRequest", f = "DataManagementRequest.kt", i = {}, l = {63}, m = "getLabCollaborationAuthConfig", n = {}, s = {})
    public static final class C26381 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C26381(Continuation<? super C26381> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DataManagementRequest.this.getLabCollaborationAuthConfig(0L, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.mine.personal.data.management.data.DataManagementRequest$getMiAppAuthScopeList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.mine.personal.data.management.data.DataManagementRequest", f = "DataManagementRequest.kt", i = {}, l = {38}, m = "getMiAppAuthScopeList", n = {}, s = {})
    public static final class C26391 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C26391(Continuation<? super C26391> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DataManagementRequest.this.getMiAppAuthScopeList(0L, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.mine.personal.data.management.data.DataManagementRequest$getThirdParty$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.mine.personal.data.management.data.DataManagementRequest", f = "DataManagementRequest.kt", i = {}, l = {99}, m = "getThirdParty", n = {}, s = {})
    public static final class C26401 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C26401(Continuation<? super C26401> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DataManagementRequest.this.getThirdParty(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.mine.personal.data.management.data.DataManagementRequest$grantLabAuth$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.mine.personal.data.management.data.DataManagementRequest", f = "DataManagementRequest.kt", i = {}, l = {72}, m = "grantLabAuth", n = {}, s = {})
    public static final class C26411 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C26411(Continuation<? super C26411> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DataManagementRequest.this.grantLabAuth(0L, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.mine.personal.data.management.data.DataManagementRequest$revokeLabAuth$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.mine.personal.data.management.data.DataManagementRequest", f = "DataManagementRequest.kt", i = {}, l = {81}, m = "revokeLabAuth", n = {}, s = {})
    public static final class C26421 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C26421(Continuation<? super C26421> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DataManagementRequest.this.revokeLabAuth(0L, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.mine.personal.data.management.data.DataManagementRequest$setThirdPartyAuth$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.mine.personal.data.management.data.DataManagementRequest", f = "DataManagementRequest.kt", i = {}, l = {90}, m = "setThirdPartyAuth", n = {}, s = {})
    public static final class C26431 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C26431(Continuation<? super C26431> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DataManagementRequest.this.setThirdPartyAuth(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.mine.personal.data.management.data.DataManagementRequest$updateMiAppAuthScopeList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.mine.personal.data.management.data.DataManagementRequest", f = "DataManagementRequest.kt", i = {}, l = {51}, m = "updateMiAppAuthScopeList", n = {}, s = {})
    public static final class C26441 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C26441(Continuation<? super C26441> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DataManagementRequest.this.updateMiAppAuthScopeList(null, null, 0L, this);
        }
    }

    public static /* synthetic */ Object getMiAppAuthScopeList$default(DataManagementRequest dataManagementRequest, long j, Integer num, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return dataManagementRequest.getMiAppAuthScopeList(j, num, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getAuthConfigList(@Nullable String str, @NotNull Continuation<? super GetThirdPartyAuthConfigListResult> continuation) {
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
        if (i2 == 0) {
            ResultKt.throwOnFailure(authConfigList);
            String json = getMGson().toJson(new GetThirdPartyAuthConfigParam(str));
            DataManagementService mService = getMService();
            Intrinsics.checkNotNull(json);
            anonymousClass1.label = 1;
            authConfigList = mService.getAuthConfigList(json, anonymousClass1);
            if (authConfigList == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(authConfigList);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(authConfigList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getLabCollaborationAuthConfig(long j, @Nullable String str, @NotNull Continuation<? super GetLabCollaborationAuthConfigResult> continuation) {
        C26381 c26381;
        if (continuation instanceof C26381) {
            c26381 = (C26381) continuation;
            int i = c26381.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26381.label = i - Integer.MIN_VALUE;
            } else {
                c26381 = new C26381(continuation);
            }
        } else {
            c26381 = new C26381(continuation);
        }
        Object labCollaborationAuthConfig = c26381.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c26381.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(labCollaborationAuthConfig);
            String json = getMGson().toJson(new GetLabCollaborationAuthConfigParam(j, str));
            DataManagementService mService = getMService();
            Intrinsics.checkNotNull(json);
            c26381.label = 1;
            labCollaborationAuthConfig = mService.getLabCollaborationAuthConfig(json, c26381);
            if (labCollaborationAuthConfig == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(labCollaborationAuthConfig);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(labCollaborationAuthConfig);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getMiAppAuthScopeList(long j, @Nullable Integer num, @NotNull Continuation<? super GetMiAppAuthScopeListResult> continuation) {
        C26391 c26391;
        if (continuation instanceof C26391) {
            c26391 = (C26391) continuation;
            int i = c26391.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26391.label = i - Integer.MIN_VALUE;
            } else {
                c26391 = new C26391(continuation);
            }
        } else {
            c26391 = new C26391(continuation);
        }
        Object miAppAuthScopeList = c26391.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c26391.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(miAppAuthScopeList);
            String json = getMGson().toJson(new GetMiAppAuthConfigListParam(j, num));
            DataManagementService mService = getMService();
            Intrinsics.checkNotNull(json);
            c26391.label = 1;
            miAppAuthScopeList = mService.getMiAppAuthScopeList(json, c26391);
            if (miAppAuthScopeList == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(miAppAuthScopeList);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(miAppAuthScopeList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getThirdParty(@NotNull GetThirdPartyRequest getThirdPartyRequest, @NotNull Continuation<? super GetThirdPartyResult> continuation) {
        C26401 c26401;
        if (continuation instanceof C26401) {
            c26401 = (C26401) continuation;
            int i = c26401.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26401.label = i - Integer.MIN_VALUE;
            } else {
                c26401 = new C26401(continuation);
            }
        } else {
            c26401 = new C26401(continuation);
        }
        Object thirdParty = c26401.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c26401.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(thirdParty);
            String json = getMGson().toJson(getThirdPartyRequest);
            Logger.i(TAG, "getThirdParty " + json);
            DataManagementService mService = getMService();
            Intrinsics.checkNotNull(json);
            c26401.label = 1;
            thirdParty = mService.getThirdParty(json, c26401);
            if (thirdParty == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(thirdParty);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(thirdParty);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object grantLabAuth(long j, @Nullable String str, @NotNull Continuation<? super GrantLabAuthResult> continuation) {
        C26411 c26411;
        if (continuation instanceof C26411) {
            c26411 = (C26411) continuation;
            int i = c26411.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26411.label = i - Integer.MIN_VALUE;
            } else {
                c26411 = new C26411(continuation);
            }
        } else {
            c26411 = new C26411(continuation);
        }
        Object objGrantLabAuth = c26411.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c26411.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGrantLabAuth);
            String json = getMGson().toJson(new GrantLabAuthParam(j, str));
            DataManagementService mService = getMService();
            Intrinsics.checkNotNull(json);
            c26411.label = 1;
            objGrantLabAuth = mService.grantLabAuth(json, c26411);
            if (objGrantLabAuth == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGrantLabAuth);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objGrantLabAuth);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object revokeLabAuth(long j, @Nullable String str, @NotNull Continuation<? super RevokeLabAuthResult> continuation) {
        C26421 c26421;
        if (continuation instanceof C26421) {
            c26421 = (C26421) continuation;
            int i = c26421.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26421.label = i - Integer.MIN_VALUE;
            } else {
                c26421 = new C26421(continuation);
            }
        } else {
            c26421 = new C26421(continuation);
        }
        Object objRevokeLabAuth = c26421.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c26421.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objRevokeLabAuth);
            String json = getMGson().toJson(new RevokeLabAuthParam(j, str));
            DataManagementService mService = getMService();
            Intrinsics.checkNotNull(json);
            c26421.label = 1;
            objRevokeLabAuth = mService.revokeLabAuth(json, c26421);
            if (objRevokeLabAuth == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objRevokeLabAuth);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objRevokeLabAuth);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object setThirdPartyAuth(@NotNull SetThirdPartyAuthRequest setThirdPartyAuthRequest, @NotNull Continuation<? super SetThirdPartyAuthResult> continuation) {
        C26431 c26431;
        if (continuation instanceof C26431) {
            c26431 = (C26431) continuation;
            int i = c26431.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26431.label = i - Integer.MIN_VALUE;
            } else {
                c26431 = new C26431(continuation);
            }
        } else {
            c26431 = new C26431(continuation);
        }
        Object thirdPartyAuth = c26431.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c26431.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(thirdPartyAuth);
            String json = getMGson().toJson(setThirdPartyAuthRequest);
            Logger.i(TAG, "setThirdPartyAuth " + json);
            DataManagementService mService = getMService();
            Intrinsics.checkNotNull(json);
            c26431.label = 1;
            thirdPartyAuth = mService.setThirdPartyAuth(json, c26431);
            if (thirdPartyAuth == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(thirdPartyAuth);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(thirdPartyAuth);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object updateMiAppAuthScopeList(@NotNull List<String> list, @NotNull List<String> list2, long j, @NotNull Continuation<? super UpdateMiAppAuthScopeListResult> continuation) {
        C26441 c26441;
        if (continuation instanceof C26441) {
            c26441 = (C26441) continuation;
            int i = c26441.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26441.label = i - Integer.MIN_VALUE;
            } else {
                c26441 = new C26441(continuation);
            }
        } else {
            c26441 = new C26441(continuation);
        }
        Object objUpdateMiAppAuthScopeList = c26441.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c26441.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUpdateMiAppAuthScopeList);
            String json = getMGson().toJson(new UpdateMiAppScopeParam(list, list2, j));
            DataManagementService mService = getMService();
            Intrinsics.checkNotNull(json);
            c26441.label = 1;
            objUpdateMiAppAuthScopeList = mService.updateMiAppAuthScopeList(json, c26441);
            if (objUpdateMiAppAuthScopeList == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUpdateMiAppAuthScopeList);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objUpdateMiAppAuthScopeList);
    }
}
