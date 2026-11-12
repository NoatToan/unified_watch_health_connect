package com.xiaomi.fitness.membership.api;

import com.google.gson.JsonObject;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.membership.export.data.MembershipListResponse;
import com.xiaomi.fitness.membership.export.data.VipConfigInfo;
import com.xiaomi.fitness.membership.export.data.VipExpiredFaceResponse;
import com.xiaomi.fitness.membership.export.data.VipInfoResult;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.extensions.HttpPoint;
import dagger.hilt.android.EntryPointAccessors;
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
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0086@¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u0004\u0018\u00010\tH\u0086@¢\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0086@¢\u0006\u0002\u0010\u0007J\u0010\u0010\f\u001a\u0004\u0018\u00010\rH\u0086@¢\u0006\u0002\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/membership/api/MembershipRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/membership/api/MembershipApiService;", "<init>", "()V", "getVipInfo", "Lcom/xiaomi/fitness/membership/export/data/VipInfoResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOperationConfig", "Lcom/xiaomi/fitness/membership/export/data/VipConfigInfo;", "getVipList", "Lcom/xiaomi/fitness/membership/export/data/MembershipListResponse;", "checkVipExpiredFaceList", "Lcom/xiaomi/fitness/membership/export/data/VipExpiredFaceResponse;", "membership_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMembershipRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MembershipRequest.kt\ncom/xiaomi/fitness/membership/api/MembershipRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n+ 3 HttpExtension.kt\ncom/xiaomi/fitness/net/extensions/HttpExtensionKt\n*L\n1#1,40:1\n141#2:41\n141#2:45\n141#2:49\n141#2:53\n31#3:42\n28#3,2:43\n31#3:46\n28#3,2:47\n31#3:50\n28#3,2:51\n31#3:54\n28#3,2:55\n*S KotlinDebug\n*F\n+ 1 MembershipRequest.kt\ncom/xiaomi/fitness/membership/api/MembershipRequest\n*L\n17#1:41\n21#1:45\n25#1:49\n38#1:53\n17#1:42\n17#1:43,2\n21#1:46\n21#1:47,2\n25#1:50\n25#1:51,2\n38#1:54\n38#1:55,2\n*E\n"})
public final class MembershipRequest extends BaseRequest<MembershipApiService> {

    /* JADX INFO: renamed from: com.xiaomi.fitness.membership.api.MembershipRequest$checkVipExpiredFaceList$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.membership.api.MembershipRequest", f = "MembershipRequest.kt", i = {}, l = {38}, m = "checkVipExpiredFaceList", n = {}, s = {})
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
            return MembershipRequest.this.checkVipExpiredFaceList(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.membership.api.MembershipRequest$getOperationConfig$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.membership.api.MembershipRequest", f = "MembershipRequest.kt", i = {}, l = {21}, m = "getOperationConfig", n = {}, s = {})
    public static final class C26081 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C26081(Continuation<? super C26081> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MembershipRequest.this.getOperationConfig(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.membership.api.MembershipRequest$getVipInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.membership.api.MembershipRequest", f = "MembershipRequest.kt", i = {}, l = {17}, m = "getVipInfo", n = {}, s = {})
    public static final class C26091 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C26091(Continuation<? super C26091> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MembershipRequest.this.getVipInfo(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.membership.api.MembershipRequest$getVipList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.membership.api.MembershipRequest", f = "MembershipRequest.kt", i = {}, l = {25}, m = "getVipList", n = {}, s = {})
    public static final class C26101 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C26101(Continuation<? super C26101> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MembershipRequest.this.getVipList(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object checkVipExpiredFaceList(@NotNull Continuation<? super VipExpiredFaceResponse> continuation) {
        AnonymousClass1 anonymousClass1;
        String string;
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
        Object objCheckVipExpiredFaceList = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCheckVipExpiredFaceList);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("popup_type", "membership_expire_paid_watch");
            jsonObject.addProperty("action", "validate_close");
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (wearableDeviceModel != null) {
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("model", DeviceModelExtKt.getModel(wearableDeviceModel));
                string = jsonObject2.toString();
            } else {
                string = null;
            }
            jsonObject.addProperty("extra", string);
            MembershipApiService mService = getMService();
            String string2 = jsonObject.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            anonymousClass1.label = 1;
            objCheckVipExpiredFaceList = mService.checkVipExpiredFaceList(string2, anonymousClass1);
            if (objCheckVipExpiredFaceList == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCheckVipExpiredFaceList);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objCheckVipExpiredFaceList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getOperationConfig(@NotNull Continuation<? super VipConfigInfo> continuation) {
        C26081 c26081;
        if (continuation instanceof C26081) {
            c26081 = (C26081) continuation;
            int i = c26081.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26081.label = i - Integer.MIN_VALUE;
            } else {
                c26081 = new C26081(continuation);
            }
        } else {
            c26081 = new C26081(continuation);
        }
        Object operationConfig = c26081.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c26081.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(operationConfig);
            MembershipApiService mService = getMService();
            c26081.label = 1;
            operationConfig = mService.getOperationConfig(c26081);
            if (operationConfig == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(operationConfig);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(operationConfig);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getVipInfo(@NotNull Continuation<? super VipInfoResult> continuation) {
        C26091 c26091;
        if (continuation instanceof C26091) {
            c26091 = (C26091) continuation;
            int i = c26091.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26091.label = i - Integer.MIN_VALUE;
            } else {
                c26091 = new C26091(continuation);
            }
        } else {
            c26091 = new C26091(continuation);
        }
        Object vipInfo = c26091.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c26091.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(vipInfo);
            MembershipApiService mService = getMService();
            c26091.label = 1;
            vipInfo = mService.getVipInfo(c26091);
            if (vipInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(vipInfo);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(vipInfo);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getVipList(@NotNull Continuation<? super MembershipListResponse> continuation) {
        C26101 c26101;
        if (continuation instanceof C26101) {
            c26101 = (C26101) continuation;
            int i = c26101.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26101.label = i - Integer.MIN_VALUE;
            } else {
                c26101 = new C26101(continuation);
            }
        } else {
            c26101 = new C26101(continuation);
        }
        Object vipList = c26101.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c26101.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(vipList);
            MembershipApiService mService = getMService();
            c26101.label = 1;
            vipList = mService.getVipList(c26101);
            if (vipList == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(vipList);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(vipList);
    }
}
