package com.xiaomi.xms.wearable.amap;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.autonavi.minimap.wearable.IWearableConnectProvider;
import com.autonavi.minimap.wearable.contract.ConnectResult;
import com.autonavi.minimap.wearable.contract.SendResult;
import com.autonavi.minimap.wearable.inter.IProviderConnectCallback;
import com.autonavi.minimap.wearable.inter.IProviderSendCallback;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.xms.wearable.Status;
import com.xiaomi.xms.wearable.WearableXmsService;
import com.xiaomi.xms.wearable.amap.AmapConnectProvider;
import com.xiaomi.xms.wearable.auth.Permission;
import com.xiaomi.xms.wearable.db.WatchAppRepository;
import com.xiaomi.xms.wearable.db.entity.WatchAppCapability;
import com.xiaomi.xms.wearable.db.entity.WatchAppItemEntity;
import com.xiaomi.xms.wearable.extensions.DeviceModelExtKt;
import com.xiaomi.xms.wearable.extensions.ExtensionsKt;
import com.xiaomi.xms.wearable.ui.PermissionManagementFragment;
import com.xiaomi.xms.wearable.ui.TransparentActivity;
import defpackage.eu6;
import defpackage.rxg;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 @2\u00020\u0001:\u0002?@B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0006\u0010\u0010\u001a\u00020\u000bJ\u0018\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u001a\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0015\u001a\u00020\tH\u0002J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\tH\u0002J \u0010\u0018\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0007H\u0002J \u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J,\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020!H\u0002J\u0006\u00103\u001a\u00020\u000bJ*\u00104\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J\u0018\u00107\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u0007H\u0016J\b\u0010:\u001a\u00020\u000bH\u0016J \u0010=\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020!2\u0006\u00108\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u0007H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\"\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010(\"\u0004\b,\u0010*R\u001a\u0010-\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010.\"\u0004\b2\u00100R\u0010\u00105\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020<X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/xiaomi/xms/wearable/amap/AmapConnectProvider;", "Lcom/autonavi/minimap/wearable/IWearableConnectProvider;", "<init>", "()V", "mProviderConnectCallback", "Lcom/autonavi/minimap/wearable/inter/IProviderConnectCallback;", "targetPkgName", "", "isNeedLaunchApp", "", "onReceiveMsg", "", "packageName", "msg", "lazyWatchAppRepository", "Lcom/xiaomi/xms/wearable/db/WatchAppRepository;", "onConnectChanged", "connect", "iProviderConnectCallback", "setConnectStatus", Constants.KEY_PACKAGE_NAME, "isConnected", "doConnect", "needLaunchApp", "isPermissionGranted", "permission", "Lcom/xiaomi/xms/wearable/auth/Permission;", "did", "send", "iProviderSendCallback", "Lcom/autonavi/minimap/wearable/inter/IProviderSendCallback;", "doSendMessage", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "sendCallback", "getSendCallback", "()Lcom/autonavi/minimap/wearable/inter/IProviderSendCallback;", "setSendCallback", "(Lcom/autonavi/minimap/wearable/inter/IProviderSendCallback;)V", "getPackageName", "()Ljava/lang/String;", "setPackageName", "(Ljava/lang/String;)V", "getMsg", "setMsg", "isGoRequestDevicePermission", "()Z", "setGoRequestDevicePermission", "(Z)V", "isGoRequestNotifyPermission", "setGoRequestNotifyPermission", "backFromPermissionPage", "requestPermission", "notifyTitle", "notifyMsg", "sendNotify", "title", "message", "onServiceDisconnect", "mSimpleDateFormat", "Ljava/text/SimpleDateFormat;", "doSendNotify", "model", "AmapConnectProviderHolder", "Companion", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAmapConnectProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmapConnectProvider.kt\ncom/xiaomi/xms/wearable/amap/AmapConnectProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,407:1\n1#2:408\n37#3:409\n36#3,3:410\n*S KotlinDebug\n*F\n+ 1 AmapConnectProvider.kt\ncom/xiaomi/xms/wearable/amap/AmapConnectProvider\n*L\n397#1:409\n397#1:410,3\n*E\n"})
public final class AmapConnectProvider implements IWearableConnectProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "AmapConnectProvider";
    private boolean isGoRequestDevicePermission;
    private boolean isGoRequestNotifyPermission;
    private boolean isNeedLaunchApp;

    @Nullable
    private IProviderConnectCallback mProviderConnectCallback;

    @NotNull
    private final SimpleDateFormat mSimpleDateFormat;

    @Nullable
    private String msg;

    @Nullable
    private String notifyMsg;

    @Nullable
    private String notifyTitle;

    @Nullable
    private String packageName;

    @Nullable
    private IProviderSendCallback sendCallback;

    @Nullable
    private String targetPkgName;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/xms/wearable/amap/AmapConnectProvider$AmapConnectProviderHolder;", "", "<init>", "()V", "instance", "Lcom/xiaomi/xms/wearable/amap/AmapConnectProvider;", "getInstance", "()Lcom/xiaomi/xms/wearable/amap/AmapConnectProvider;", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AmapConnectProviderHolder {

        @NotNull
        public static final AmapConnectProviderHolder INSTANCE = new AmapConnectProviderHolder();

        @NotNull
        private static final AmapConnectProvider instance = new AmapConnectProvider(null);

        private AmapConnectProviderHolder() {
        }

        @NotNull
        public final AmapConnectProvider getInstance() {
            return instance;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/xms/wearable/amap/AmapConnectProvider$Companion;", "", "<init>", "()V", "TAG", "", "instance", "Lcom/xiaomi/xms/wearable/amap/AmapConnectProvider;", "getInstance", "()Lcom/xiaomi/xms/wearable/amap/AmapConnectProvider;", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AmapConnectProvider getInstance() {
            return AmapConnectProviderHolder.INSTANCE.getInstance();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.xms.wearable.amap.AmapConnectProvider$doConnect$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.xms.wearable.amap.AmapConnectProvider$doConnect$1", f = "AmapConnectProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AmapConnectProvider.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            IProviderConnectCallback iProviderConnectCallback = AmapConnectProvider.this.mProviderConnectCallback;
            if (iProviderConnectCallback != null) {
                ConnectResult connectResult = ConnectResult.SUCCESS;
                iProviderConnectCallback.onConnect(connectResult.code, connectResult.message);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.xms.wearable.amap.AmapConnectProvider$doConnect$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.xms.wearable.amap.AmapConnectProvider$doConnect$2", f = "AmapConnectProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AmapConnectProvider.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            IProviderConnectCallback iProviderConnectCallback = AmapConnectProvider.this.mProviderConnectCallback;
            if (iProviderConnectCallback != null) {
                iProviderConnectCallback.onConnect(ConnectResult.FAILED_OTHER.code, "fingerPrint not match");
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.xms.wearable.amap.AmapConnectProvider$doConnect$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.xms.wearable.amap.AmapConnectProvider$doConnect$3", f = "AmapConnectProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AmapConnectProvider.this.new AnonymousClass3(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            IProviderConnectCallback iProviderConnectCallback = AmapConnectProvider.this.mProviderConnectCallback;
            if (iProviderConnectCallback != null) {
                ConnectResult connectResult = ConnectResult.FAILED_UNINSTALL_TARGET_APP;
                iProviderConnectCallback.onConnect(connectResult.code, connectResult.message);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.xms.wearable.amap.AmapConnectProvider$doConnect$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.xms.wearable.amap.AmapConnectProvider$doConnect$4", f = "AmapConnectProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AmapConnectProvider.this.new AnonymousClass4(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            IProviderConnectCallback iProviderConnectCallback = AmapConnectProvider.this.mProviderConnectCallback;
            if (iProviderConnectCallback != null) {
                ConnectResult connectResult = ConnectResult.FAILED_NO_DEVICE;
                iProviderConnectCallback.onConnect(connectResult.code, connectResult.message);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.xms.wearable.amap.AmapConnectProvider$onReceiveMsg$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.xms.wearable.amap.AmapConnectProvider$onReceiveMsg$1", f = "AmapConnectProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C35001 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $msg;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35001(String str, Continuation<? super C35001> continuation) {
            super(2, continuation);
            this.$msg = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AmapConnectProvider.this.new C35001(this.$msg, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            IProviderConnectCallback iProviderConnectCallback = AmapConnectProvider.this.mProviderConnectCallback;
            if (iProviderConnectCallback != null) {
                iProviderConnectCallback.onReceive(this.$msg);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C35001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.xms.wearable.amap.AmapConnectProvider$send$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/xiaomi/xms/wearable/amap/AmapConnectProvider$send$1", "Leu6;", "", "result", "onResult", "(Lkotlin/Unit;)V", "", "errorCode", "onError", "(I)V", "xmswearable_release"}, k = 1, mv = {2, 0, 0})
    public static final class C35011 implements eu6<Unit> {
        final /* synthetic */ WearableDeviceModel $deviceModel;
        final /* synthetic */ IProviderSendCallback $iProviderSendCallback;
        final /* synthetic */ String $msg;
        final /* synthetic */ String $targetPkgName;
        final /* synthetic */ AmapConnectProvider this$0;

        public C35011(String str, AmapConnectProvider amapConnectProvider, String str2, IProviderSendCallback iProviderSendCallback, WearableDeviceModel wearableDeviceModel) {
            this.$targetPkgName = str;
            this.this$0 = amapConnectProvider;
            this.$msg = str2;
            this.$iProviderSendCallback = iProviderSendCallback;
            this.$deviceModel = wearableDeviceModel;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onResult$lambda$0(AmapConnectProvider this$0, String targetPkgName, String msg, IProviderSendCallback iProviderSendCallback, WearableDeviceModel wearableDeviceModel) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(targetPkgName, "$targetPkgName");
            Intrinsics.checkNotNullParameter(msg, "$msg");
            Intrinsics.checkNotNullParameter(iProviderSendCallback, "$iProviderSendCallback");
            this$0.doSendMessage(targetPkgName, msg, iProviderSendCallback, wearableDeviceModel);
        }

        @Override // defpackage.eu6
        public void onError(int errorCode) {
            Logger.i(AmapConnectProvider.TAG, "launch app:" + this.$targetPkgName + " failed errorCode = " + errorCode);
            Status status = Status.RESULT_CANCELLED;
            if (errorCode == -3) {
                status = Status.RESULT_DISCONNECTED;
            } else if (errorCode == -1) {
                status = Status.RESULT_TIMEOUT;
            }
            this.$iProviderSendCallback.onSendCallback(SendResult.FAILED.code, "launch app failed:errorStatue = " + status);
        }

        @Override // defpackage.eu6
        public void onResult(Unit result) {
            Intrinsics.checkNotNullParameter(result, "result");
            Logger.i(AmapConnectProvider.TAG, "launch app:" + this.$targetPkgName + " success");
            Handler handler = new Handler(Looper.getMainLooper());
            final AmapConnectProvider amapConnectProvider = this.this$0;
            final String str = this.$targetPkgName;
            final String str2 = this.$msg;
            final IProviderSendCallback iProviderSendCallback = this.$iProviderSendCallback;
            final WearableDeviceModel wearableDeviceModel = this.$deviceModel;
            handler.postDelayed(new Runnable() { // from class: z61
                @Override // java.lang.Runnable
                public final void run() {
                    AmapConnectProvider.C35011.onResult$lambda$0(amapConnectProvider, str, str2, iProviderSendCallback, wearableDeviceModel);
                }
            }, 2500L);
        }
    }

    public /* synthetic */ AmapConnectProvider(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final void doConnect(String targetPkgName, boolean needLaunchApp) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected() || !DeviceModelExtKt.isSupportThirdPartyApp(wearableDeviceModel) || this.mProviderConnectCallback == null) {
            Logger.i(TAG, "connect failed:no available device");
            AnyExtKt.io$default(null, new AnonymousClass4(null), 1, null);
            return;
        }
        WatchAppItemEntity watchApp = lazyWatchAppRepository().getWatchApp(targetPkgName, wearableDeviceModel.getDid());
        if (watchApp == null) {
            Logger.i(TAG, "connect failed:target app not installed");
            AnyExtKt.io$default(null, new AnonymousClass3(null), 1, null);
            return;
        }
        if (!Arrays.equals(watchApp.getFingerprint(), ExtensionsKt.getFingerPrintByPackage(targetPkgName))) {
            Logger.i(TAG, "connect failed:fingerPrint not match");
            AnyExtKt.io$default(null, new AnonymousClass2(null), 1, null);
        } else {
            Logger.i(TAG, "connect success");
            this.isNeedLaunchApp = needLaunchApp;
            setConnectStatus(targetPkgName, true);
            AnyExtKt.io$default(null, new AnonymousClass1(null), 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doSendMessage(String targetPkgName, String msg, final IProviderSendCallback iProviderSendCallback, WearableDeviceModel deviceModel) {
        byte[] fingerPrintByPackage = ExtensionsKt.getFingerPrintByPackage(targetPkgName);
        Logger.i(TAG, "sendMessage to watch targetPkgName :" + targetPkgName + " msg:" + msg);
        Intrinsics.checkNotNull(msg);
        byte[] bytes = msg.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        DeviceModelExtKt.sendPhoneMessage(deviceModel, targetPkgName, fingerPrintByPackage, bytes, new eu6<Unit>() { // from class: com.xiaomi.xms.wearable.amap.AmapConnectProvider.doSendMessage.1
            @Override // defpackage.eu6
            public void onError(int errorCode) {
                Logger.d(AmapConnectProvider.TAG, "sendMessage failed errorCode:" + errorCode);
                IProviderSendCallback iProviderSendCallback2 = iProviderSendCallback;
                if (iProviderSendCallback2 != null) {
                    iProviderSendCallback2.onSendCallback(SendResult.FAILED.code, "send failed : errorCode:" + errorCode);
                }
            }

            @Override // defpackage.eu6
            public void onResult(Unit result) {
                Intrinsics.checkNotNullParameter(result, "result");
                Logger.d(AmapConnectProvider.TAG, "sendMessage success");
                IProviderSendCallback iProviderSendCallback2 = iProviderSendCallback;
                if (iProviderSendCallback2 != null) {
                    SendResult sendResult = SendResult.SUCCESS;
                    iProviderSendCallback2.onSendCallback(sendResult.code, sendResult.message);
                }
            }
        });
    }

    private final void doSendNotify(WearableDeviceModel model, String title, String message) {
        String str = this.targetPkgName;
        if (str != null && com.xiaomi.fitness.device.manager.DeviceModelExtKt.isBluetooth(model)) {
            ArrayList arrayList = new ArrayList();
            rxg rxgVar = new rxg();
            rxgVar.c = this.targetPkgName;
            rxgVar.e = title;
            rxgVar.g = message;
            rxgVar.d = ExtensionsKt.getAppName(str);
            rxgVar.h = this.mSimpleDateFormat.format(new Date(System.currentTimeMillis()));
            rxgVar.l = 0;
            arrayList.add(rxgVar);
            rxg.d dVar = new rxg.d();
            dVar.c = (rxg[]) arrayList.toArray(new rxg[0]);
            DeviceModelExtKt.addNotifications(model, dVar);
        }
    }

    private final boolean isPermissionGranted(String packageName, Permission permission, String did) {
        boolean zIsPermissionGranted = lazyWatchAppRepository().isPermissionGranted(packageName, permission);
        Logger.i(TAG, "is device:" + did + " Permission " + permission.a() + " Granted :" + zIsPermissionGranted);
        return zIsPermissionGranted;
    }

    private final WatchAppRepository lazyWatchAppRepository() {
        return WatchAppRepository.INSTANCE.getInstance();
    }

    private final boolean requestPermission(String packageName, String did, Permission permission, IProviderSendCallback iProviderSendCallback) {
        WatchAppRepository watchAppRepositoryLazyWatchAppRepository = lazyWatchAppRepository();
        if (watchAppRepositoryLazyWatchAppRepository.hasWatchAppCapability(packageName)) {
            Bundle bundle = new Bundle();
            bundle.putString(PermissionManagementFragment.KEY_PACKAGE_NAME, packageName);
            bundle.putParcelableArray(PermissionManagementFragment.KEY_PERMISSIONS, new Permission[]{permission});
            bundle.putBoolean(PermissionManagementFragment.KEY_IS_REQUEST, true);
            Intent intent = new Intent(ApplicationExtKt.getApplication(), (Class<?>) TransparentActivity.class);
            intent.addFlags(276889600);
            intent.putExtras(bundle);
            ApplicationExtKt.getApplication().startActivity(intent);
            if (permission == Permission.DEVICE_MANAGER) {
                this.isGoRequestDevicePermission = true;
            } else {
                this.isGoRequestNotifyPermission = true;
            }
            Logger.i(TAG, "request permission go request permission page");
            return false;
        }
        WatchAppItemEntity watchApp = watchAppRepositoryLazyWatchAppRepository.getWatchApp(packageName, did);
        if (watchApp == null) {
            Logger.i(TAG, "request permission failed target app not installed");
            if (iProviderSendCallback == null) {
                return false;
            }
            iProviderSendCallback.onSendCallback(SendResult.FAILED.code, "app not installed");
            return false;
        }
        WatchAppCapability watchAppCapability = new WatchAppCapability(watchApp.getPackageName(), watchApp.getAppName(), true, true);
        ArrayList arrayList = new ArrayList();
        arrayList.add(watchAppCapability);
        watchAppRepositoryLazyWatchAppRepository.insertWatchCapability(arrayList);
        Logger.i(TAG, "request permission success , watch capability inserted first");
        return true;
    }

    private final void setConnectStatus(String pkgName, boolean isConnected) {
        try {
            Intent intent = new Intent(WearableXmsService.XMS_WEARABLE_ACTION);
            intent.putExtra("amap_connected", isConnected);
            intent.putExtra("amap_pkgname", pkgName);
            AppUtil.getApp().sendBroadcast(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void backFromPermissionPage() {
        String str;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
            return;
        }
        if (!this.isGoRequestDevicePermission) {
            if (!this.isGoRequestNotifyPermission || (str = this.packageName) == null) {
                return;
            }
            Permission NOTIFY = Permission.NOTIFY;
            Intrinsics.checkNotNullExpressionValue(NOTIFY, "NOTIFY");
            if (isPermissionGranted(str, NOTIFY, wearableDeviceModel.getDid()) && !TextUtils.isEmpty(this.notifyTitle) && !TextUtils.isEmpty(this.notifyMsg)) {
                String str2 = this.notifyTitle;
                Intrinsics.checkNotNull(str2);
                String str3 = this.notifyMsg;
                Intrinsics.checkNotNull(str3);
                doSendNotify(wearableDeviceModel, str2, str3);
            }
            this.notifyTitle = null;
            this.notifyMsg = null;
            this.isGoRequestNotifyPermission = false;
            return;
        }
        String str4 = this.packageName;
        if (str4 == null) {
            return;
        }
        if (this.sendCallback != null && !TextUtils.isEmpty(this.msg) && !TextUtils.isEmpty(str4)) {
            Permission DEVICE_MANAGER = Permission.DEVICE_MANAGER;
            Intrinsics.checkNotNullExpressionValue(DEVICE_MANAGER, "DEVICE_MANAGER");
            if (isPermissionGranted(str4, DEVICE_MANAGER, wearableDeviceModel.getDid())) {
                Logger.i(TAG, "back from request permission page ,permission granted");
                doSendMessage(str4, this.msg, this.sendCallback, wearableDeviceModel);
            } else {
                Logger.i(TAG, "back from request permission page ,permission denied");
                IProviderSendCallback iProviderSendCallback = this.sendCallback;
                if (iProviderSendCallback != null) {
                    iProviderSendCallback.onSendCallback(SendResult.FAILED.code, "permission denied");
                }
            }
        }
        this.isGoRequestDevicePermission = false;
        this.sendCallback = null;
        this.packageName = null;
        this.msg = null;
    }

    @Override // com.autonavi.minimap.wearable.IWearableConnectProvider
    public void connect(@NotNull String targetPkgName, @NotNull IProviderConnectCallback iProviderConnectCallback) {
        Intrinsics.checkNotNullParameter(targetPkgName, "targetPkgName");
        Intrinsics.checkNotNullParameter(iProviderConnectCallback, "iProviderConnectCallback");
        Logger.i(TAG, "connect targetPkgName:" + targetPkgName);
        this.targetPkgName = targetPkgName;
        this.mProviderConnectCallback = iProviderConnectCallback;
        doConnect(targetPkgName, true);
    }

    @Nullable
    public final String getMsg() {
        return this.msg;
    }

    @Nullable
    public final String getPackageName() {
        return this.packageName;
    }

    @Nullable
    public final IProviderSendCallback getSendCallback() {
        return this.sendCallback;
    }

    /* JADX INFO: renamed from: isGoRequestDevicePermission, reason: from getter */
    public final boolean getIsGoRequestDevicePermission() {
        return this.isGoRequestDevicePermission;
    }

    /* JADX INFO: renamed from: isGoRequestNotifyPermission, reason: from getter */
    public final boolean getIsGoRequestNotifyPermission() {
        return this.isGoRequestNotifyPermission;
    }

    public final void onConnectChanged() {
        String str;
        if (TextUtils.isEmpty(this.targetPkgName) || (str = this.targetPkgName) == null) {
            return;
        }
        doConnect(str, false);
    }

    public final void onReceiveMsg(@Nullable String packageName, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (TextUtils.equals(this.targetPkgName, packageName)) {
            if (this.mProviderConnectCallback == null) {
                Logger.i(TAG, "onReceiveMsg mProviderConnectCallback is null");
                return;
            }
            Logger.i(TAG, "onReceiveMsg mProviderConnectCallback.onReceive msg:" + msg);
            AnyExtKt.io$default(null, new C35001(msg, null), 1, null);
        }
    }

    @Override // com.autonavi.minimap.wearable.IWearableConnectProvider
    public void onServiceDisconnect() {
        this.mProviderConnectCallback = null;
        setConnectStatus(this.targetPkgName, false);
    }

    @Override // com.autonavi.minimap.wearable.IWearableConnectProvider
    public void send(@NotNull String targetPkgName, @NotNull String msg, @NotNull IProviderSendCallback iProviderSendCallback) {
        Intrinsics.checkNotNullParameter(targetPkgName, "targetPkgName");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(iProviderSendCallback, "iProviderSendCallback");
        if (this.isGoRequestDevicePermission) {
            return;
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
            Logger.i(TAG, "sendMessage to watch failed: device not connected");
            iProviderSendCallback.onSendCallback(SendResult.FAILED.code, "device not connected");
            return;
        }
        Permission DEVICE_MANAGER = Permission.DEVICE_MANAGER;
        Intrinsics.checkNotNullExpressionValue(DEVICE_MANAGER, "DEVICE_MANAGER");
        if (!isPermissionGranted(targetPkgName, DEVICE_MANAGER, wearableDeviceModel.getDid())) {
            String did = wearableDeviceModel.getDid();
            Intrinsics.checkNotNullExpressionValue(DEVICE_MANAGER, "DEVICE_MANAGER");
            if (!requestPermission(targetPkgName, did, DEVICE_MANAGER, iProviderSendCallback)) {
                if (this.isGoRequestDevicePermission) {
                    this.msg = msg;
                    this.packageName = targetPkgName;
                    this.sendCallback = iProviderSendCallback;
                    return;
                }
                return;
            }
        }
        if (!this.isNeedLaunchApp) {
            doSendMessage(targetPkgName, msg, iProviderSendCallback, wearableDeviceModel);
        } else {
            this.isNeedLaunchApp = false;
            DeviceModelExtKt.launchApp(wearableDeviceModel, targetPkgName, "/", ExtensionsKt.getFingerPrintByPackage(targetPkgName), new C35011(targetPkgName, this, msg, iProviderSendCallback, wearableDeviceModel));
        }
    }

    @Override // com.autonavi.minimap.wearable.IWearableConnectProvider
    public void sendNotify(@NotNull String title, @NotNull String message) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        if (this.isGoRequestNotifyPermission) {
            return;
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
            Logger.i(TAG, "sendMessage to watch failed: device not connected");
            return;
        }
        String str = this.targetPkgName;
        if (str == null) {
            return;
        }
        Permission NOTIFY = Permission.NOTIFY;
        Intrinsics.checkNotNullExpressionValue(NOTIFY, "NOTIFY");
        if (!isPermissionGranted(str, NOTIFY, wearableDeviceModel.getDid())) {
            String did = wearableDeviceModel.getDid();
            Intrinsics.checkNotNullExpressionValue(NOTIFY, "NOTIFY");
            if (!requestPermission(str, did, NOTIFY, null)) {
                if (this.isGoRequestNotifyPermission) {
                    this.notifyTitle = title;
                    this.notifyMsg = message;
                    return;
                }
                return;
            }
        }
        doSendNotify(wearableDeviceModel, title, message);
    }

    public final void setGoRequestDevicePermission(boolean z) {
        this.isGoRequestDevicePermission = z;
    }

    public final void setGoRequestNotifyPermission(boolean z) {
        this.isGoRequestNotifyPermission = z;
    }

    public final void setMsg(@Nullable String str) {
        this.msg = str;
    }

    public final void setPackageName(@Nullable String str) {
        this.packageName = str;
    }

    public final void setSendCallback(@Nullable IProviderSendCallback iProviderSendCallback) {
        this.sendCallback = iProviderSendCallback;
    }

    private AmapConnectProvider() {
        this.mSimpleDateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss", Locale.ENGLISH);
    }
}
