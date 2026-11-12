package com.xiaomi.fitness.device.manager.passtoken;

import android.content.Intent;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.accountsdk.account.data.SecondaryDeviceInfo;
import com.xiaomi.accountsdk.account.exception.RequestSecondaryDeviceLoginDataException;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.passtoken.PassTokenDataHandler;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.passport.accountmanager.XiaomiAccountManager;
import defpackage.fc0;
import defpackage.gc0;
import defpackage.hc0;
import defpackage.p90;
import defpackage.s7r;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/device/manager/passtoken/PassTokenDataHandler;", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "", "addAccountListener", "()V", "Lcom/xiaomi/accountsdk/account/data/SecondaryDeviceInfo;", "secondaryDeviceInfo", "", "transactionId", "requestSecondaryDeviceLoginData", "(Lcom/xiaomi/accountsdk/account/data/SecondaryDeviceInfo;J)V", "", "loginData", "replayDevicePassToken", "(Ljava/lang/String;J)V", "", "status", "notifyLoginStatusChanged", "(I)V", "message", "safeLogcat", "(Ljava/lang/String;)V", "did", "type", "Ls7r;", "packet", "", "handlePacket", "(Ljava/lang/String;ILs7r;)Z", "TAG", "Ljava/lang/String;", "<init>", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class PassTokenDataHandler extends DataHandlerWrapper {

    @NotNull
    public static final PassTokenDataHandler INSTANCE = new PassTokenDataHandler();

    @NotNull
    private static final String TAG = "PassTokenDataHandler";

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.passtoken.PassTokenDataHandler$requestSecondaryDeviceLoginData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.passtoken.PassTokenDataHandler$requestSecondaryDeviceLoginData$1", f = "PassTokenDataHandler.kt", i = {0, 0, 1, 1}, l = {102, 109, 124}, m = "invokeSuspend", n = {"loginData", PluginDeviceInfo.FICONOFFLINE, "loginData", PluginDeviceInfo.FICONOFFLINE}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class C19321 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SecondaryDeviceInfo $secondaryDeviceInfo;
        final /* synthetic */ long $transactionId;
        Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.passtoken.PassTokenDataHandler$requestSecondaryDeviceLoginData$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.device.manager.passtoken.PassTokenDataHandler$requestSecondaryDeviceLoginData$1$1", f = "PassTokenDataHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C04341 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Intent $intent;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04341(Intent intent, Continuation<? super C04341> continuation) {
                super(2, continuation);
                this.$intent = intent;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04341(this.$intent, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ApplicationExtKt.getApplication().startActivity(this.$intent);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04341) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.passtoken.PassTokenDataHandler$requestSecondaryDeviceLoginData$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.device.manager.passtoken.PassTokenDataHandler$requestSecondaryDeviceLoginData$1$2", f = "PassTokenDataHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;

            public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ToastUtil.showToast("不支持的小米账号版本,请升级小米账号版本后重试");
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.passtoken.PassTokenDataHandler$requestSecondaryDeviceLoginData$1$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.device.manager.passtoken.PassTokenDataHandler$requestSecondaryDeviceLoginData$1$3", f = "PassTokenDataHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Ref.ObjectRef<String> $loginData;
            final /* synthetic */ long $transactionId;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(Ref.ObjectRef<String> objectRef, long j, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$loginData = objectRef;
                this.$transactionId = j;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$loginData, this.$transactionId, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                PassTokenDataHandler.INSTANCE.replayDevicePassToken(this.$loginData.element, this.$transactionId);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.passtoken.PassTokenDataHandler$requestSecondaryDeviceLoginData$1$WhenMappings */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[RequestSecondaryDeviceLoginDataException.Code.values().length];
                try {
                    iArr[RequestSecondaryDeviceLoginDataException.Code.INVALID_PASS_TOKEN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RequestSecondaryDeviceLoginDataException.Code.UN_SUPPORT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19321(SecondaryDeviceInfo secondaryDeviceInfo, long j, Continuation<? super C19321> continuation) {
            super(2, continuation);
            this.$secondaryDeviceInfo = secondaryDeviceInfo;
            this.$transactionId = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C19321(this.$secondaryDeviceInfo, this.$transactionId, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:38:0x00f5 A[RETURN] */
        /* JADX WARN: Type inference failed for: r1v12, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Ref.ObjectRef objectRef;
            Ref.ObjectRef objectRef2;
            MainCoroutineDispatcher main;
            AnonymousClass3 anonymousClass3;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i != 0) {
                    if (i == 1 || i == 2) {
                        e = (RequestSecondaryDeviceLoginDataException) this.L$1;
                        objectRef2 = (Ref.ObjectRef) this.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                objectRef = new Ref.ObjectRef();
                try {
                    objectRef.element = XiaomiAccountManager.get(ApplicationExtKt.getApplication()).requestSecondaryDeviceLoginData(this.$secondaryDeviceInfo);
                } catch (RequestSecondaryDeviceLoginDataException e) {
                    e = e;
                    Logger.e(PassTokenDataHandler.TAG, "requestSecondaryDeviceLoginData error:" + e.code);
                    RequestSecondaryDeviceLoginDataException.Code code = e.code;
                    int i2 = code == null ? -1 : WhenMappings.$EnumSwitchMapping$0[code.ordinal()];
                    if (i2 == 1) {
                        Intent intent = e.handleIntent;
                        if (intent != null) {
                            MainCoroutineDispatcher main2 = Dispatchers.getMain();
                            C04341 c04341 = new C04341(intent, null);
                            this.L$0 = objectRef;
                            this.L$1 = e;
                            this.label = 1;
                            if (BuildersKt.withContext(main2, c04341, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            objectRef2 = objectRef;
                            objectRef = objectRef2;
                        }
                    } else if (i2 == 2) {
                        MainCoroutineDispatcher main3 = Dispatchers.getMain();
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
                        this.L$0 = objectRef;
                        this.L$1 = e;
                        this.label = 2;
                        if (BuildersKt.withContext(main3, anonymousClass2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef2 = objectRef;
                        objectRef = objectRef2;
                    }
                    objectRef.element = e.createGetSecondaryDeviceLoginDataFailInfo();
                }
                PassTokenDataHandler.INSTANCE.safeLogcat("loginData:" + objectRef.element);
                main = Dispatchers.getMain();
                anonymousClass3 = new AnonymousClass3(objectRef, this.$transactionId, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                if (BuildersKt.withContext(main, anonymousClass3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
                objectRef.element = e.createGetSecondaryDeviceLoginDataFailInfo();
            } catch (Exception e2) {
                Logger.e(PassTokenDataHandler.TAG, "requestSecondaryDeviceLoginData error:" + e2.getMessage());
                objectRef.element = "";
            }
            objectRef = objectRef2;
            PassTokenDataHandler.INSTANCE.safeLogcat("loginData:" + objectRef.element);
            main = Dispatchers.getMain();
            anonymousClass3 = new AnonymousClass3(objectRef, this.$transactionId, null);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
            if (BuildersKt.withContext(main, anonymousClass3, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private PassTokenDataHandler() {
    }

    private final void addAccountListener() {
        Logger.i(TAG, "addAccountListener");
        AccountManagerExtKt.getInstance(AccountManager.INSTANCE).addAccountListener(new Function1() { // from class: hlh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PassTokenDataHandler.addAccountListener$lambda$1(((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addAccountListener$lambda$1(boolean z) {
        Logger.i(TAG, "account login/logout " + z);
        if (z) {
            INSTANCE.notifyLoginStatusChanged(1);
        } else {
            INSTANCE.notifyLoginStatusChanged(2);
        }
        return Unit.INSTANCE;
    }

    private final void notifyLoginStatusChanged(int status) {
        Logger.i(TAG, "notifyLoginStatusChanged, status:" + status);
        s7r s7rVar = new s7r();
        s7rVar.e = 1;
        s7rVar.f = 30;
        p90 p90Var = new p90();
        hc0 hc0Var = new hc0();
        hc0Var.c = status;
        p90Var.P(hc0Var);
        s7rVar.M(p90Var);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.device.manager.passtoken.PassTokenDataHandler.notifyLoginStatusChanged.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(PassTokenDataHandler.TAG, "notifyLoginStatusChanged fail: " + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                Logger.i(PassTokenDataHandler.TAG, "notifyLoginStatusChanged success");
            }
        }, 0, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void replayDevicePassToken(String loginData, final long transactionId) {
        s7r s7rVar = new s7r();
        s7rVar.e = 1;
        s7rVar.f = 29;
        p90 p90Var = new p90();
        gc0 gc0Var = new gc0();
        gc0Var.d = loginData;
        gc0Var.c = transactionId;
        p90Var.M(gc0Var);
        s7rVar.M(p90Var);
        safeLogcat("replayDevicePassToken packet:" + s7rVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.device.manager.passtoken.PassTokenDataHandler.replayDevicePassToken.2
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(PassTokenDataHandler.TAG, "replayDevicePassToken fail: " + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                Logger.i(PassTokenDataHandler.TAG, "replayDevicePassToken success: " + transactionId);
            }
        }, 0, 8, null);
    }

    private final void requestSecondaryDeviceLoginData(SecondaryDeviceInfo secondaryDeviceInfo, long transactionId) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new C19321(secondaryDeviceInfo, transactionId, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void safeLogcat(String message) {
        if (AppUtil.INSTANCE.isDevChannel()) {
            Logger.i("PassTokenDataHandler:safeLogcat", message);
        } else {
            Logger.d("PassTokenDataHandler:safeLogcat", message);
        }
    }

    @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
    public boolean handlePacket(@NotNull String did, int type, @Nullable s7r packet) {
        Intrinsics.checkNotNullParameter(did, "did");
        if (packet == null) {
            return false;
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (!Intrinsics.areEqual(did, wearableDeviceModel != null ? wearableDeviceModel.getDid() : null) || packet.e != 1 || packet.f != 28) {
            return false;
        }
        addAccountListener();
        Logger.i(TAG, "handlePacket in apply device pass token");
        String userId = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId();
        String lowerCase = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        fc0 fc0VarU = packet.o().u();
        if (fc0VarU != null) {
            String str = fc0VarU.d;
            String str2 = fc0VarU.f;
            String str3 = fc0VarU.e;
            long j = fc0VarU.c;
            PassTokenDataHandler passTokenDataHandler = INSTANCE;
            passTokenDataHandler.safeLogcat("ua:" + str + ", sign:" + str2 + ", nonce:" + str3 + ", transactionId:" + j + ", did:" + did + ", userId:" + userId + ", region:" + lowerCase);
            SecondaryDeviceInfo secondaryDeviceInfoBuild = new SecondaryDeviceInfo.Builder().ua(str).sign(str2).nonce(str3).deviceId(did).bindUid(userId).exceptPwdChange(false).bizIdcInfo(lowerCase).build();
            StringBuilder sb = new StringBuilder();
            sb.append("secondaryDeviceInfo:");
            sb.append(secondaryDeviceInfoBuild);
            passTokenDataHandler.safeLogcat(sb.toString());
            passTokenDataHandler.requestSecondaryDeviceLoginData(secondaryDeviceInfoBuild, j);
        }
        return true;
    }
}
