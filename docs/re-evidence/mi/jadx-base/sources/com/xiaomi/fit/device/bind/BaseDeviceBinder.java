package com.xiaomi.fit.device.bind;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fit.device.DeviceFactory;
import com.xiaomi.fit.device.bind.BaseDeviceBinder;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.DevicePreference;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.api.DeviceRequest;
import com.xiaomi.fitness.device.manager.b;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.e;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.DeviceActiveKt;
import com.xiaomi.fitness.device.manager.export.bean.WatchInfo;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.device.manager.extensions.InstanceExtKt;
import com.xiaomi.fitness.device.manager.remote.DeviceManagerRemoteImpl;
import com.xiaomi.fitness.device.manager.ui.bind.BindDataTrackerKt;
import com.xiaomi.fitness.device.model.api.DeviceBinder;
import com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.eu6;
import defpackage.kj2;
import defpackage.qa6;
import defpackage.z2h;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010I\u001a\u00020H¢\u0006\u0004\bi\u0010jJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010\"\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\b\u0010!\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u000fH\u0004¢\u0006\u0004\b$\u0010\u0012JA\u0010(\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\b\u0010!\u001a\u0004\u0018\u00010\u000f2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J!\u0010+\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b+\u0010\u001eJ\u000f\u0010,\u001a\u00020\fH\u0016¢\u0006\u0004\b,\u0010\u001aJ\u000f\u0010-\u001a\u00020\fH\u0016¢\u0006\u0004\b-\u0010\u001aJ\u000f\u0010.\u001a\u00020\fH\u0016¢\u0006\u0004\b.\u0010\u001aJ\u0017\u0010/\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b/\u00100J\u001f\u00103\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u000f2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\fH\u0016¢\u0006\u0004\b5\u0010\u001aJ\u001d\u00106\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u000f¢\u0006\u0004\b6\u0010\u001eJ\u000f\u00107\u001a\u00020\fH\u0004¢\u0006\u0004\b7\u0010\u001aJ\u0019\u00109\u001a\u0004\u0018\u0001082\u0006\u0010 \u001a\u00020\u000fH\u0004¢\u0006\u0004\b9\u0010:J\u0019\u0010;\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b=\u0010>J\u0018\u0010?\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0007H\u0094@¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u0004H\u0004¢\u0006\u0004\bA\u0010\u0006J\u0010\u0010?\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b?\u0010>J\u000f\u0010B\u001a\u00020\fH\u0016¢\u0006\u0004\bB\u0010\u001aJ\u0019\u0010C\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\bC\u0010\u0012J\u0019\u0010\u0019\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u0012J)\u0010\u001d\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010D\u001a\u00020\u00072\u0006\u0010E\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010FJ\u0019\u0010G\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\bG\u0010\u0012R\u001a\u0010I\u001a\u00020H8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010M\u001a\u00020\u000f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR$\u0010!\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010N\u001a\u0004\bQ\u0010P\"\u0004\bR\u0010\u0012R\"\u0010S\u001a\u00020\u00048\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bS\u0010\u0006\"\u0004\bU\u0010VR\u0016\u0010W\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010TR\u0016\u0010X\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010TR\"\u0010Y\u001a\u00020\u000f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bY\u0010N\u001a\u0004\bZ\u0010P\"\u0004\b[\u0010\u0012R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\\R\u0016\u0010]\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u001b\u0010d\u001a\u00020_8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\"\u0010e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010^\u001a\u0004\bf\u0010\t\"\u0004\bg\u00100R\u0016\u0010h\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010T¨\u0006k"}, d2 = {"Lcom/xiaomi/fit/device/bind/BaseDeviceBinder;", "Lcom/xiaomi/fitness/device/model/api/DeviceBinder;", "Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", "Lkj2;", "", "getPairStateBeforeBind", "()Z", "", "getHFPConnectedDevice", "()I", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "", "reportDeviceActive", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "", "did", "onReportActive", "(Ljava/lang/String;)V", "from", "Lcom/xiaomi/fitness/device/manager/a;", "callback", "bind", "(ILcom/xiaomi/fitness/device/manager/a;)V", "checkLogin", "onConnectSuccess", "()V", "status", "message", "onConnectFailure", "(ILjava/lang/String;)V", "model", "mac", "sn", "onBindSuccess", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "requestDevice", "appDeviceId", "", "appToken", "onLocalBindSuccess", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)V", "code", "onBindFailure", "onBondSuccess", "showButtonConfirmDialog", "dismissButtonConfirmDialog", "onBondFailure", "(I)V", "Lz2h;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "showOOB", "(Ljava/lang/String;Lz2h;)V", "dismissOOB", "reportBindFailure", "reportBindSuccess", "Lqa6;", "getDeviceModelByMac", "(Ljava/lang/String;)Lqa6;", "rebind", "(Lcom/xiaomi/fitness/device/manager/a;)V", "revokeAuthorization", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unbind", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isDeviceConnect", BroadcastsKt.SILENT_PUSHING_CANCEL, "onConnectStart", "errorCode", "retryTimes", "(Ljava/lang/String;II)V", "onDisconnect", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;", "mDeviceInfo", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;", "getMDeviceInfo", "()Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "getSn", "setSn", "isBindSuccess", "Z", "setBindSuccess", "(Z)V", "reportBindStatus", "isRebind", "mDid", "getMDid", "setMDid", "Lcom/xiaomi/fitness/device/manager/a;", "mFrom", "I", "Lcom/xiaomi/fitness/device/model/api/DeviceManagerInternalRemote;", "mDeviceManager$delegate", "Lkotlin/Lazy;", "getMDeviceManager", "()Lcom/xiaomi/fitness/device/model/api/DeviceManagerInternalRemote;", "mDeviceManager", "bindCount", "getBindCount", "setBindCount", "pairState", "<init>", "(Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;)V", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class BaseDeviceBinder implements DeviceBinder, OnDeviceStatusListener, kj2 {

    @NotNull
    private final String TAG;
    private int bindCount;

    @Nullable
    private com.xiaomi.fitness.device.manager.a callback;
    private boolean isBindSuccess;
    private boolean isRebind;

    @NotNull
    private final WearableDeviceInfo mDeviceInfo;

    /* JADX INFO: renamed from: mDeviceManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDeviceManager;

    @NotNull
    private String mDid;
    private int mFrom;
    private boolean pairState;
    private boolean reportBindStatus;

    @Nullable
    private String sn;

    /* JADX INFO: renamed from: com.xiaomi.fit.device.bind.BaseDeviceBinder$reportBindFailure$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.device.bind.BaseDeviceBinder$reportBindFailure$1", f = "BaseDeviceBinder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C15011 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $code;
        final /* synthetic */ boolean $isBound;
        final /* synthetic */ String $message;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15011(int i, String str, boolean z, Continuation<? super C15011> continuation) {
            super(2, continuation);
            this.$code = i;
            this.$message = str;
            this.$isBound = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseDeviceBinder.this.new C15011(this.$code, this.$message, this.$isBound, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws InterruptedException {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String model = BaseDeviceBinder.this.getMDeviceInfo().getModel();
            int i = this.$code;
            String str = this.$message;
            BaseDeviceBinder baseDeviceBinder = BaseDeviceBinder.this;
            baseDeviceBinder.setBindCount(baseDeviceBinder.getBindCount() + 1);
            int bindCount = BaseDeviceBinder.this.getBindCount();
            Product product = BaseDeviceBinder.this.getMDeviceInfo().getProduct();
            int type = product != null ? product.getType() : 0;
            int i2 = BaseDeviceBinder.this.mFrom;
            boolean z = this.$isBound;
            int hFPConnectedDevice = BaseDeviceBinder.this.getHFPConnectedDevice();
            boolean z2 = BaseDeviceBinder.this.pairState;
            String mac = BaseDeviceBinder.this.getMDeviceInfo().getMac();
            if (mac == null) {
                mac = "";
            }
            BindDataTrackerKt.reportBindFinish(false, model, "", i, str, bindCount, type, i2, z, hFPConnectedDevice, z2, mac);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C15011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.device.bind.BaseDeviceBinder$revokeAuthorization$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.device.bind.BaseDeviceBinder", f = "BaseDeviceBinder.kt", i = {0}, l = {373, 374}, m = "revokeAuthorization$suspendImpl", n = {"$this"}, s = {"L$0"})
    public static final class C15041 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C15041(Continuation<? super C15041> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BaseDeviceBinder.revokeAuthorization$suspendImpl(BaseDeviceBinder.this, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.device.bind.BaseDeviceBinder$unbind$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.device.bind.BaseDeviceBinder", f = "BaseDeviceBinder.kt", i = {0}, l = {392, 395}, m = "unbind$suspendImpl", n = {"$this"}, s = {"L$0"})
    public static final class AnonymousClass2 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BaseDeviceBinder.unbind$suspendImpl(BaseDeviceBinder.this, this);
        }
    }

    public BaseDeviceBinder(@NotNull WearableDeviceInfo mDeviceInfo) {
        Intrinsics.checkNotNullParameter(mDeviceInfo, "mDeviceInfo");
        this.mDeviceInfo = mDeviceInfo;
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        this.TAG = simpleName;
        this.mDid = "";
        this.mDeviceManager = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: w62
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseDeviceBinder.mDeviceManager_delegate$lambda$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getDeviceModelByMac$lambda$2(String mac, qa6 it) {
        Intrinsics.checkNotNullParameter(mac, "$mac");
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(DeviceModelExtKt.getMac(it), mac);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getHFPConnectedDevice() throws InterruptedException {
        final Ref.IntRef intRef = new Ref.IntRef();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi(this.TAG, "getHFPConnectedDevice() called");
        try {
            BluetoothAdapter.getDefaultAdapter().getProfileProxy(ApplicationExtKt.getApplication(), new BluetoothProfile.ServiceListener() { // from class: com.xiaomi.fit.device.bind.BaseDeviceBinder.getHFPConnectedDevice.1
                @Override // android.bluetooth.BluetoothProfile.ServiceListener
                public void onServiceConnected(int profile, BluetoothProfile proxy) {
                    List<BluetoothDevice> connectedDevices;
                    intRef.element = (proxy == null || (connectedDevices = proxy.getConnectedDevices()) == null) ? 0 : connectedDevices.size();
                    com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi(this.getTAG(), "getHFPConnectedDevice() called size:" + intRef.element);
                    countDownLatch.countDown();
                }

                @Override // android.bluetooth.BluetoothProfile.ServiceListener
                public void onServiceDisconnected(int profile) {
                    countDownLatch.countDown();
                }
            }, 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        countDownLatch.await(1200L, TimeUnit.MILLISECONDS);
        com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi(this.TAG, "getHFPConnectedDevice() called return");
        return intRef.element;
    }

    private final boolean getPairStateBeforeBind() {
        try {
            return ApplicationExtKt.getApplication().checkSelfPermission("android.permission.BLUETOOTH_CONNECT") == 0 && BluetoothAdapter.getDefaultAdapter().getRemoteDevice(this.mDeviceInfo.getMac()).getBondState() == 12;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceManagerRemoteImpl mDeviceManager_delegate$lambda$0() {
        return InstanceExtKt.getInstance(DeviceManagerRemoteImpl.INSTANCE);
    }

    private final void onReportActive(String did) {
        WearableDeviceModel wearableDeviceModel;
        if (!Intrinsics.areEqual(this.mDid, did) || !this.isBindSuccess || this.reportBindStatus || (wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did)) == null) {
            return;
        }
        reportDeviceActive(wearableDeviceModel);
        this.reportBindStatus = true;
    }

    private final void reportDeviceActive(final WearableDeviceModel deviceModel) {
        Logger.i(this.TAG, "reportDeviceActive() called with: deviceModel = " + DeviceModelExtKt.getFirmwareVersion(deviceModel));
        deviceModel.readWatchInfo(new eu6<WatchInfo>() { // from class: com.xiaomi.fit.device.bind.BaseDeviceBinder.reportDeviceActive.1
            @Override // defpackage.eu6
            public void onError(int errorCode) {
                com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi(BaseDeviceBinder.this.getTAG(), "readWatchInfo onError() called with: errorCode = " + errorCode);
                DeviceManagerExtKt.reportDeviceActive(deviceModel, DeviceActiveKt.ACTIVE_ACTIVATION);
            }

            @Override // defpackage.eu6
            public void onResult(WatchInfo result) {
                com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi(BaseDeviceBinder.this.getTAG(), "readWatchInfo onResult: result = " + result);
                DeviceManagerExtKt.reportDeviceActive(deviceModel, DeviceActiveKt.ACTIVE_ACTIVATION);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object revokeAuthorization$suspendImpl(BaseDeviceBinder baseDeviceBinder, Continuation<? super Integer> continuation) {
        C15041 c15041;
        if (continuation instanceof C15041) {
            c15041 = (C15041) continuation;
            int i = c15041.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c15041.label = i - Integer.MIN_VALUE;
            } else {
                c15041 = baseDeviceBinder.new C15041(continuation);
            }
        } else {
            c15041 = baseDeviceBinder.new C15041(continuation);
        }
        Object objRevoke = c15041.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c15041.label;
        if (i2 != 0) {
            if (i2 == 1) {
                baseDeviceBinder = (BaseDeviceBinder) c15041.L$0;
                ResultKt.throwOnFailure(objRevoke);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objRevoke);
            }
        }
        ResultKt.throwOnFailure(objRevoke);
        DeviceRequest deviceRequest = new DeviceRequest();
        String did = baseDeviceBinder.mDeviceInfo.getDid();
        c15041.L$0 = baseDeviceBinder;
        c15041.label = 1;
        objRevoke = deviceRequest.revoke(did, c15041);
        if (objRevoke == coroutine_suspended) {
            return coroutine_suspended;
        }
        int iIntValue = ((Number) objRevoke).intValue();
        c15041.L$0 = null;
        c15041.label = 2;
        objRevoke = baseDeviceBinder.unbind(iIntValue, c15041);
        return objRevoke == coroutine_suspended ? coroutine_suspended : objRevoke;
    }

    public static /* synthetic */ Object unbind$suspendImpl(BaseDeviceBinder baseDeviceBinder, int i, Continuation<? super Integer> continuation) {
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).removeDeviceStatusListener(baseDeviceBinder);
        return Boxing.boxInt(i);
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceBinder
    public void bind(int from, @Nullable com.xiaomi.fitness.device.manager.a callback) {
        this.mFrom = from;
        this.callback = callback;
        String userId = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId();
        if (checkLogin() && userId.length() == 0) {
            com.xiaomi.fit.device.extensions.DeviceModelExtKt.loge("device binder userId is null, return");
            return;
        }
        BindDataTrackerKt.reportBindStart();
        this.reportBindStatus = false;
        this.pairState = getPairStateBeforeBind();
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(this);
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceBinder
    public void cancel() {
        com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi(this.TAG, "device binder cancel bind");
        String model = this.mDeviceInfo.getModel();
        int i = this.bindCount + 1;
        this.bindCount = i;
        Product product = this.mDeviceInfo.getProduct();
        int type = product != null ? product.getType() : 0;
        int i2 = this.mFrom;
        String mac = this.mDeviceInfo.getMac();
        if (mac == null) {
            mac = "";
        }
        BindDataTrackerKt.reportBindFinish(false, model, "", 10000, "", i, type, i2, (1792 & 256) != 0 ? false : false, (1792 & 512) != 0 ? 0 : 0, (1792 & 1024) != 0 ? false : false, mac);
    }

    public boolean checkLogin() {
        return true;
    }

    @Override // defpackage.oyc
    public void dismissButtonConfirmDialog() {
        com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi("device binder local device confirm dismiss");
        try {
            com.xiaomi.fitness.device.manager.a aVar = this.callback;
            if (aVar != null) {
                aVar.dismissPairingCode();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.t9h
    public void dismissOOB() {
        com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi("device binder dismissOOB");
        try {
            com.xiaomi.fitness.device.manager.a aVar = this.callback;
            if (aVar != null) {
                aVar.dismissPairingCode();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final int getBindCount() {
        return this.bindCount;
    }

    @Nullable
    public final qa6 getDeviceModelByMac(@NotNull final String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        return getMDeviceManager().findDeviceModel(new Function1() { // from class: x62
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(BaseDeviceBinder.getDeviceModelByMac$lambda$2(mac, (qa6) obj));
            }
        });
    }

    @NotNull
    public final WearableDeviceInfo getMDeviceInfo() {
        return this.mDeviceInfo;
    }

    @NotNull
    public final DeviceManagerInternalRemote getMDeviceManager() {
        return (DeviceManagerInternalRemote) this.mDeviceManager.getValue();
    }

    @NotNull
    public final String getMDid() {
        return this.mDid;
    }

    @Nullable
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    /* JADX INFO: renamed from: isBindSuccess, reason: from getter */
    public final boolean getIsBindSuccess() {
        return this.isBindSuccess;
    }

    public final boolean isDeviceConnect() {
        return getMDeviceManager().isConnected(this.mDeviceInfo.getDid());
    }

    @Override // defpackage.kj2
    public void onBindFailure(int code, @Nullable String message) {
        com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi("device binder bind failure, code:" + code + ">>message:" + message);
        try {
            com.xiaomi.fitness.device.manager.a aVar = this.callback;
            if (aVar != null) {
                aVar.onBindFailure(code);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (message == null) {
            message = "";
        }
        reportBindFailure(code, message);
    }

    @Override // defpackage.kj2
    public void onBindSuccess(@NotNull String model, @NotNull String did, @NotNull String mac, @Nullable String sn) throws RemoteException {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(mac, "mac");
        com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi("device binder bind success, model:" + model + ">>did:" + did + ">>mac:" + mac + ">>" + sn);
        this.mDid = did;
        this.sn = sn;
        this.isBindSuccess = true;
        String upperCase = mac.toUpperCase();
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        DeviceFactory.INSTANCE.removeDeviceBinder(upperCase);
        qa6 deviceModelByMac = getDeviceModelByMac(upperCase);
        if (deviceModelByMac != null) {
            deviceModelByMac.onBindSuccess(this.isRebind);
        }
        reportBindSuccess();
        DevicePreference.INSTANCE.setIN_BIND_NEW_MODE(false);
        AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).removeDid(this.mDid);
        requestDevice(upperCase);
        try {
            com.xiaomi.fitness.device.manager.a aVar = this.callback;
            if (aVar != null) {
                aVar.onBindSuccess(this.mDid);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.o43
    public void onBondFailure(int status) {
        com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi("device binder bond failure");
        try {
            com.xiaomi.fitness.device.manager.a aVar = this.callback;
            if (aVar != null) {
                aVar.onPairingFailure(status);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        reportBindFailure(status, "bond failure");
    }

    @Override // defpackage.o43
    public void onBondSuccess() {
        com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi("device binder bond success");
        try {
            com.xiaomi.fitness.device.manager.a aVar = this.callback;
            if (aVar != null) {
                aVar.onPairingSuccess(null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.zd4
    public void onConnectFailure(int status, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi("device binder connect failure");
        try {
            com.xiaomi.fitness.device.manager.a aVar = this.callback;
            if (aVar != null) {
                aVar.onConnectFailure(status);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        reportBindFailure(status, message);
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectStart(@Nullable String did) {
    }

    @Override // defpackage.zd4
    public void onConnectSuccess() {
        com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi("device binder connect success");
        try {
            com.xiaomi.fitness.device.manager.a aVar = this.callback;
            if (aVar != null) {
                aVar.onConnectSuccess();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.zd4
    public /* bridge */ /* synthetic */ void onDisconnect() {
        super.onDisconnect();
    }

    @Override // defpackage.vie
    public void onLocalBindSuccess(@NotNull String model, @NotNull String did, @NotNull String mac, @Nullable String sn, @NotNull String appDeviceId, @NotNull byte[] appToken) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(appDeviceId, "appDeviceId");
        Intrinsics.checkNotNullParameter(appToken, "appToken");
        com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi("device binder bind local success");
        try {
            this.sn = sn;
            com.xiaomi.fitness.device.manager.a aVar = this.callback;
            if (aVar != null) {
                aVar.dismissPairingCode();
            }
            this.isBindSuccess = true;
            this.mDid = did;
            WearableDeviceModel localDeviceModel = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getLocalDeviceModel(model);
            if (localDeviceModel != null) {
                DeviceManagerExtKt.reportDeviceActive(localDeviceModel, DeviceActiveKt.ACTIVE_ACTIVATION);
            }
            String model2 = this.mDeviceInfo.getModel();
            String firmwareVersion = this.mDeviceInfo.getFirmwareVersion();
            String str = firmwareVersion == null ? "" : firmwareVersion;
            int i = this.bindCount + 1;
            this.bindCount = i;
            Product product = this.mDeviceInfo.getProduct();
            int type = product != null ? product.getType() : 0;
            int i2 = this.mFrom;
            String mac2 = this.mDeviceInfo.getMac();
            BindDataTrackerKt.reportBindFinish(true, model2, str, 0, "", i, type, i2, (1792 & 256) != 0 ? false : false, (1792 & 512) != 0 ? 0 : 0, (1792 & 1024) != 0 ? false : false, mac2 == null ? "" : mac2);
            this.bindCount = 0;
            com.xiaomi.fitness.device.manager.a aVar2 = this.callback;
            if (aVar2 != null) {
                aVar2.onBindSuccess(this.mDid);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.o43
    public /* bridge */ /* synthetic */ void onRemoveFailure(int i) {
        super.onRemoveFailure(i);
    }

    @Override // defpackage.o43
    public /* bridge */ /* synthetic */ void onRemoveSuccess() {
        super.onRemoveSuccess();
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceBinder
    public void rebind(@Nullable com.xiaomi.fitness.device.manager.a callback) {
        this.isRebind = true;
    }

    public final void reportBindFailure(int code, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String mac = this.mDeviceInfo.getMac();
        boolean z = false;
        if (mac != null && ((WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModelByMac(mac)) != null) {
            z = true;
        }
        AnyExtKt.io$default(null, new C15011(code, message, z, null), 1, null);
    }

    public final void reportBindSuccess() {
        String model = this.mDeviceInfo.getModel();
        String firmwareVersion = this.mDeviceInfo.getFirmwareVersion();
        String str = firmwareVersion == null ? "" : firmwareVersion;
        int i = this.bindCount + 1;
        this.bindCount = i;
        Product product = this.mDeviceInfo.getProduct();
        int type = product != null ? product.getType() : 0;
        int i2 = this.mFrom;
        String mac = this.mDeviceInfo.getMac();
        BindDataTrackerKt.reportBindFinish(true, model, str, 0, "", i, type, i2, (1792 & 256) != 0 ? false : false, (1792 & 512) != 0 ? 0 : 0, (1792 & 1024) != 0 ? false : false, mac == null ? "" : mac);
        this.bindCount = 0;
    }

    public final void requestDevice(@NotNull final String mac) throws RemoteException {
        Intrinsics.checkNotNullParameter(mac, "mac");
        getMDeviceManager().requestDeviceList(new b.a() { // from class: com.xiaomi.fit.device.bind.BaseDeviceBinder.requestDevice.1
            @Override // com.xiaomi.fitness.device.manager.b
            public void onFail(String cause, int code) {
                com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi("requestDeviceList with exception " + cause);
                try {
                    com.xiaomi.fitness.device.manager.a aVar = BaseDeviceBinder.this.callback;
                    if (aVar != null) {
                        aVar.onRequestDeviceFailure();
                    }
                } catch (Exception e) {
                    Logger.w(BaseDeviceBinder.this.getTAG(), "request device onFail() = " + e.getMessage());
                }
            }

            @Override // com.xiaomi.fitness.device.manager.b
            public void onSuccess() {
                Logger.i(BaseDeviceBinder.this.getTAG(), "onBindSuccess: " + BaseDeviceBinder.this.getDeviceModelByMac(mac));
                qa6 deviceModelByMac = BaseDeviceBinder.this.getDeviceModelByMac(mac);
                if (deviceModelByMac != null) {
                    BaseDeviceBinder.this.getMDeviceManager().switchDevice(deviceModelByMac);
                }
                BaseDeviceBinder.this.getMDeviceManager().notifyDeviceBind(BaseDeviceBinder.this.getMDid(), BaseDeviceBinder.this.isRebind);
            }
        });
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceBinder
    @Nullable
    public Object revokeAuthorization(@NotNull Continuation<? super Integer> continuation) {
        return revokeAuthorization$suspendImpl(this, continuation);
    }

    public final void setBindCount(int i) {
        this.bindCount = i;
    }

    public final void setBindSuccess(boolean z) {
        this.isBindSuccess = z;
    }

    public final void setMDid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mDid = str;
    }

    public final void setSn(@Nullable String str) {
        this.sn = str;
    }

    @Override // defpackage.oyc
    public void showButtonConfirmDialog() {
        com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi("device binder local device confirm show");
        try {
            com.xiaomi.fitness.device.manager.a aVar = this.callback;
            if (aVar != null) {
                aVar.showPairingCode("", null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.t9h
    public void showOOB(@NotNull String code, @NotNull final z2h listener) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi("device binder showOOB:" + code + ", safeCallback=" + this.callback);
        try {
            com.xiaomi.fitness.device.manager.a aVar = this.callback;
            if (aVar != null) {
                aVar.showPairingCode(code, new e.a() { // from class: com.xiaomi.fit.device.bind.BaseDeviceBinder.showOOB.1
                    @Override // com.xiaomi.fitness.device.manager.e
                    public void onCanceled() {
                        listener.onCanceled();
                    }

                    @Override // com.xiaomi.fitness.device.manager.e
                    public void onConfirm() {
                        listener.onConfirm();
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Nullable
    public Object unbind(int i, @NotNull Continuation<? super Integer> continuation) {
        return unbind$suspendImpl(this, i, continuation);
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onDisconnect(@Nullable String did) {
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceBinder
    @Nullable
    public Object unbind(@NotNull Continuation<? super Integer> continuation) {
        return unbind$suspendImpl(this, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object unbind$suspendImpl(BaseDeviceBinder baseDeviceBinder, Continuation<? super Integer> continuation) {
        AnonymousClass2 anonymousClass2;
        if (continuation instanceof AnonymousClass2) {
            anonymousClass2 = (AnonymousClass2) continuation;
            int i = anonymousClass2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass2.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass2 = baseDeviceBinder.new AnonymousClass2(continuation);
            }
        } else {
            anonymousClass2 = baseDeviceBinder.new AnonymousClass2(continuation);
        }
        Object objUnbind = anonymousClass2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass2.label;
        if (i2 != 0) {
            if (i2 == 1) {
                baseDeviceBinder = (BaseDeviceBinder) anonymousClass2.L$0;
                ResultKt.throwOnFailure(objUnbind);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objUnbind);
            }
        }
        ResultKt.throwOnFailure(objUnbind);
        com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi(baseDeviceBinder.TAG, "device binder unbind request did = " + baseDeviceBinder.mDeviceInfo.getDid() + ",model = " + baseDeviceBinder.mDeviceInfo.getModel());
        DeviceRequest deviceRequest = new DeviceRequest();
        String did = baseDeviceBinder.mDeviceInfo.getDid();
        String model = baseDeviceBinder.mDeviceInfo.getModel();
        anonymousClass2.L$0 = baseDeviceBinder;
        anonymousClass2.label = 1;
        objUnbind = deviceRequest.unbind(did, model, anonymousClass2);
        if (objUnbind == coroutine_suspended) {
            return coroutine_suspended;
        }
        int iIntValue = ((Number) objUnbind).intValue();
        com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi(baseDeviceBinder.TAG, "device binder unbind request code = " + iIntValue);
        String model2 = baseDeviceBinder.mDeviceInfo.getModel();
        String firmwareVersion = baseDeviceBinder.mDeviceInfo.getFirmwareVersion();
        if (firmwareVersion == null) {
            firmwareVersion = "";
        }
        BindDataTrackerKt.reportUnbind(model2, firmwareVersion);
        anonymousClass2.L$0 = null;
        anonymousClass2.label = 2;
        objUnbind = baseDeviceBinder.unbind(iIntValue, anonymousClass2);
        return objUnbind == coroutine_suspended ? coroutine_suspended : objUnbind;
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectSuccess(@Nullable String did) {
        onReportActive(did);
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).removeDeviceStatusListener(this);
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectFailure(@Nullable String did, int errorCode, int retryTimes) {
        onReportActive(did);
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).removeDeviceStatusListener(this);
    }
}
