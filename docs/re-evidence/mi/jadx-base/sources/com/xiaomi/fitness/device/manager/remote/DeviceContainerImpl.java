package com.xiaomi.fitness.device.manager.remote;

import android.text.TextUtils;
import com.xiaomi.fit.device.extensions.DeviceModelExtKt;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceContainer;
import com.xiaomi.fitness.device.manager.DevicePreference;
import com.xiaomi.fitness.device.manager.api.DeviceRequest;
import com.xiaomi.fitness.device.manager.api.model.DeviceRecordInfo;
import com.xiaomi.fitness.device.manager.api.model.UpdateDeviceInfoResult;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.dao.DeviceDao;
import com.xiaomi.fitness.device.manager.dao.DeviceDatabase;
import com.xiaomi.fitness.device.manager.dao.LocalDeviceDao;
import com.xiaomi.fitness.device.manager.export.bean.LocalDevice;
import com.xiaomi.fitness.device.manager.export.bean.WearableDevice;
import com.xiaomi.fitness.device.manager.extensions.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.remote.DeviceContainerImpl;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.scope.AndroidScope;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u0000 @2\u00020\u0001:\u0001@B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u0019H\u0086@¢\u0006\u0002\u0010\u001aJ\u000e\u0010\u001b\u001a\u00020\u001cH\u0086@¢\u0006\u0002\u0010\u001aJ\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0019H\u0086@¢\u0006\u0002\u0010\u001aJ\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u0019H\u0096@¢\u0006\u0002\u0010\u001aJ\b\u0010\u001f\u001a\u00020\u001cH\u0002J\u0006\u0010 \u001a\u00020\u001cJ\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u0019H\u0086@¢\u0006\u0002\u0010\u001aJ\u001c\u0010\"\u001a\u00020\u001c2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0$H\u0086@¢\u0006\u0002\u0010%J\u001c\u0010&\u001a\u00020\u001c2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u0019H\u0082@¢\u0006\u0002\u0010%J\u0016\u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010)J\u0016\u0010*\u001a\u00020\u001c2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0$J\u001c\u0010+\u001a\u0004\u0018\u00010,2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00110.J$\u0010/\u001a\u0004\u0018\u00010,2\u0006\u00100\u001a\u0002012\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00110.J4\u00102\u001a\u0004\u0018\u00010,2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020,0\u00192\u0006\u00100\u001a\u0002012\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00110.H\u0002J\u0014\u00103\u001a\u00020\u001c2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u0019J\u000e\u00104\u001a\u00020\u001c2\u0006\u00105\u001a\u00020\u000fJ\u0006\u00106\u001a\u00020\u001cJ\b\u00107\u001a\u00020\u001cH\u0002J\u0006\u00108\u001a\u00020\u001cJ\u000e\u00109\u001a\b\u0012\u0004\u0012\u00020,0\u0019H\u0016J\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\f0\u0019J\u000e\u0010;\u001a\b\u0012\u0004\u0012\u00020\f0\u0019H\u0016J\u0010\u0010<\u001a\u00020\u001c2\u0006\u00100\u001a\u000201H\u0016J\u000e\u0010=\u001a\u00020\u001c2\u0006\u00100\u001a\u000201J\u000e\u0010>\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\fJ\b\u0010?\u001a\u00020\u001cH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/xiaomi/fitness/device/manager/remote/DeviceContainerImpl;", "Lcom/xiaomi/fitness/device/manager/DeviceContainer;", "<init>", "()V", "mDeviceDao", "Lcom/xiaomi/fitness/device/manager/dao/DeviceDao;", "mLocalDeviceDao", "Lcom/xiaomi/fitness/device/manager/dao/LocalDeviceDao;", "mDeviceRequest", "Lcom/xiaomi/fitness/device/manager/api/DeviceRequest;", "mBindDevices", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableDevice;", "mUnbindDevices", "mLocalDevices", "Lcom/xiaomi/fitness/device/manager/export/bean/LocalDevice;", "phoneInfoUpdated", "", "getPhoneInfoUpdated", "()Z", "setPhoneInfoUpdated", "(Z)V", "mLastRequestTime", "", "loadBindDeviceList", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadUnbindDeviceList", "", "loadLocalDeviceList", "requestBindDeviceList", "recodePhone", "rawRecordPhone", "requestUnbindDeviceList", "updateBindDeviceList", "devices", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mergeDeviceList", "recordLocalBindDevice", "device", "(Lcom/xiaomi/fitness/device/manager/export/bean/WearableDevice;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUnbindDeviceList", "findBindDevice", "Lcom/xiaomi/fitness/device/manager/bean/Device;", "predicate", "Lkotlin/Function1;", "findCurrentBindDevice", "did", "", "findCurrentDevice", "saveDevice", "saveLocalDevice", "localDevice", "clearBindDevice", "clearUnbindDevice", "clearLocalDevice", "getBindDeviceList", "getUnbindDeviceList", "getAllDeviceList", "removeDevice", "removeLocalDevice", "updateDeviceInfo", "clearAll", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceContainerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceContainerImpl.kt\ncom/xiaomi/fitness/device/manager/remote/DeviceContainerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,351:1\n1863#2,2:352\n*S KotlinDebug\n*F\n+ 1 DeviceContainerImpl.kt\ncom/xiaomi/fitness/device/manager/remote/DeviceContainerImpl\n*L\n147#1:352,2\n*E\n"})
public final class DeviceContainerImpl implements DeviceContainer {

    @NotNull
    private static final String TAG = "DeviceContainer";
    public static final int TYPE_BIND_DEVICE = 1;
    public static final int TYPE_UNBIND_DEVICE = 2;

    @NotNull
    private final CopyOnWriteArrayList<WearableDevice> mBindDevices;

    @NotNull
    private final DeviceDao mDeviceDao;

    @NotNull
    private final DeviceRequest mDeviceRequest;
    private volatile long mLastRequestTime;

    @NotNull
    private final LocalDeviceDao mLocalDeviceDao;

    @NotNull
    private final CopyOnWriteArrayList<LocalDevice> mLocalDevices;

    @NotNull
    private final CopyOnWriteArrayList<WearableDevice> mUnbindDevices;
    private boolean phoneInfoUpdated;

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.remote.DeviceContainerImpl$clearBindDevice$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.remote.DeviceContainerImpl$clearBindDevice$1", f = "DeviceContainerImpl.kt", i = {}, l = {260}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceContainerImpl.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceDao deviceDao = DeviceContainerImpl.this.mDeviceDao;
                this.label = 1;
                if (deviceDao.delete(1, this) == coroutine_suspended) {
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
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.remote.DeviceContainerImpl$clearLocalDevice$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.remote.DeviceContainerImpl$clearLocalDevice$1", f = "DeviceContainerImpl.kt", i = {}, l = {278}, m = "invokeSuspend", n = {}, s = {})
    public static final class C19331 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C19331(Continuation<? super C19331> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceContainerImpl.this.new C19331(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LocalDeviceDao localDeviceDao = DeviceContainerImpl.this.mLocalDeviceDao;
                this.label = 1;
                if (localDeviceDao.deleteAll(this) == coroutine_suspended) {
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
            return ((C19331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.remote.DeviceContainerImpl$clearUnbindDevice$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.remote.DeviceContainerImpl$clearUnbindDevice$1", f = "DeviceContainerImpl.kt", i = {}, l = {271}, m = "invokeSuspend", n = {}, s = {})
    public static final class C19341 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C19341(Continuation<? super C19341> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceContainerImpl.this.new C19341(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceDao deviceDao = DeviceContainerImpl.this.mDeviceDao;
                this.label = 1;
                if (deviceDao.delete(2, this) == coroutine_suspended) {
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
            return ((C19341) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.remote.DeviceContainerImpl$loadBindDeviceList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.remote.DeviceContainerImpl", f = "DeviceContainerImpl.kt", i = {0}, l = {56}, m = "loadBindDeviceList", n = {"this"}, s = {"L$0"})
    public static final class C19351 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C19351(Continuation<? super C19351> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceContainerImpl.this.loadBindDeviceList(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.remote.DeviceContainerImpl$loadLocalDeviceList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.remote.DeviceContainerImpl", f = "DeviceContainerImpl.kt", i = {0}, l = {70}, m = "loadLocalDeviceList", n = {"this"}, s = {"L$0"})
    public static final class C19361 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C19361(Continuation<? super C19361> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceContainerImpl.this.loadLocalDeviceList(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.remote.DeviceContainerImpl$loadUnbindDeviceList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.remote.DeviceContainerImpl", f = "DeviceContainerImpl.kt", i = {0}, l = {63}, m = "loadUnbindDeviceList", n = {"this"}, s = {"L$0"})
    public static final class C19371 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C19371(Continuation<? super C19371> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceContainerImpl.this.loadUnbindDeviceList(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.remote.DeviceContainerImpl$loadUnbindDeviceList$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.remote.DeviceContainerImpl$loadUnbindDeviceList$2", f = "DeviceContainerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<WearableDevice> $list;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(List<? extends WearableDevice> list, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$list = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceContainerImpl.this.new AnonymousClass2(this.$list, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DeviceManagerExtKt.setList(DeviceContainerImpl.this.mUnbindDevices, this.$list);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.remote.DeviceContainerImpl$mergeDeviceList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.remote.DeviceContainerImpl", f = "DeviceContainerImpl.kt", i = {0}, l = {160}, m = "mergeDeviceList", n = {"this"}, s = {"L$0"})
    public static final class C19381 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C19381(Continuation<? super C19381> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceContainerImpl.this.mergeDeviceList(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.remote.DeviceContainerImpl$rawRecordPhone$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.remote.DeviceContainerImpl$rawRecordPhone$1", f = "DeviceContainerImpl.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
    public static final class C19391 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C19391(Continuation<? super C19391> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceContainerImpl.this.new C19391(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceRequest deviceRequest = DeviceContainerImpl.this.mDeviceRequest;
                this.label = 1;
                if (deviceRequest.recordDevices(this) == coroutine_suspended) {
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
            return ((C19391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.remote.DeviceContainerImpl$recodePhone$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.remote.DeviceContainerImpl$recodePhone$1", f = "DeviceContainerImpl.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
    public static final class C19401 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $userId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19401(String str, Continuation<? super C19401> continuation) {
            super(2, continuation);
            this.$userId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceContainerImpl.this.new C19401(this.$userId, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceRequest deviceRequest = DeviceContainerImpl.this.mDeviceRequest;
                this.label = 1;
                obj = deviceRequest.recordDevices(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            DeviceModelExtKt.logi("This phone's sid is " + ((DeviceRecordInfo) obj).getSid());
            DevicePreference devicePreference = DevicePreference.INSTANCE;
            String str = this.$userId;
            if (str == null) {
                str = "";
            }
            devicePreference.setRECORD_PHONE_USER(str);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.remote.DeviceContainerImpl$recordLocalBindDevice$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.remote.DeviceContainerImpl", f = "DeviceContainerImpl.kt", i = {0, 0, 1}, l = {168, SportReportBaseParser.ReportType.entryTime}, m = "recordLocalBindDevice", n = {"this", "device", "device"}, s = {"L$0", "L$1", "L$0"})
    public static final class C19411 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C19411(Continuation<? super C19411> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceContainerImpl.this.recordLocalBindDevice(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.remote.DeviceContainerImpl$removeDevice$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.remote.DeviceContainerImpl$removeDevice$1", f = "DeviceContainerImpl.kt", i = {}, l = {307}, m = "invokeSuspend", n = {}, s = {})
    public static final class C19421 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ WearableDevice $removeDevice;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19421(WearableDevice wearableDevice, Continuation<? super C19421> continuation) {
            super(2, continuation);
            this.$removeDevice = wearableDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceContainerImpl.this.new C19421(this.$removeDevice, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceDao deviceDao = DeviceContainerImpl.this.mDeviceDao;
                WearableDevice wearableDevice = this.$removeDevice;
                this.label = 1;
                if (deviceDao.update(wearableDevice, this) == coroutine_suspended) {
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
            return ((C19421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.remote.DeviceContainerImpl$removeLocalDevice$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.remote.DeviceContainerImpl$removeLocalDevice$1", f = "DeviceContainerImpl.kt", i = {}, l = {320}, m = "invokeSuspend", n = {}, s = {})
    public static final class C19431 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LocalDevice $filter;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19431(LocalDevice localDevice, Continuation<? super C19431> continuation) {
            super(2, continuation);
            this.$filter = localDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceContainerImpl.this.new C19431(this.$filter, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LocalDeviceDao localDeviceDao = DeviceContainerImpl.this.mLocalDeviceDao;
                LocalDevice[] localDeviceArr = {this.$filter};
                this.label = 1;
                obj = localDeviceDao.delete(localDeviceArr, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Logger.i(DeviceContainerImpl.TAG, "removeLocalDevice: delete " + ((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.remote.DeviceContainerImpl$requestBindDeviceList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.remote.DeviceContainerImpl", f = "DeviceContainerImpl.kt", i = {0, 1}, l = {82, 87}, m = "requestBindDeviceList", n = {"this", "this"}, s = {"L$0", "L$0"})
    public static final class C19441 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C19441(Continuation<? super C19441> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceContainerImpl.this.requestBindDeviceList(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.remote.DeviceContainerImpl$requestUnbindDeviceList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.remote.DeviceContainerImpl", f = "DeviceContainerImpl.kt", i = {0}, l = {126}, m = "requestUnbindDeviceList", n = {"this"}, s = {"L$0"})
    public static final class C19451 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C19451(Continuation<? super C19451> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceContainerImpl.this.requestUnbindDeviceList(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.remote.DeviceContainerImpl$saveDevice$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.remote.DeviceContainerImpl$saveDevice$1", f = "DeviceContainerImpl.kt", i = {}, l = {241}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nDeviceContainerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceContainerImpl.kt\ncom/xiaomi/fitness/device/manager/remote/DeviceContainerImpl$saveDevice$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,351:1\n1863#2,2:352\n*S KotlinDebug\n*F\n+ 1 DeviceContainerImpl.kt\ncom/xiaomi/fitness/device/manager/remote/DeviceContainerImpl$saveDevice$1\n*L\n240#1:352,2\n*E\n"})
    public static final class C19461 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<WearableDevice> $devices;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ DeviceContainerImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C19461(List<? extends WearableDevice> list, DeviceContainerImpl deviceContainerImpl, Continuation<? super C19461> continuation) {
            super(2, continuation);
            this.$devices = list;
            this.this$0 = deviceContainerImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C19461(this.$devices, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            DeviceContainerImpl deviceContainerImpl;
            Iterator it;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List<WearableDevice> list = this.$devices;
                deviceContainerImpl = this.this$0;
                it = list.iterator();
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$1;
                deviceContainerImpl = (DeviceContainerImpl) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            while (it.hasNext()) {
                WearableDevice wearableDevice = (WearableDevice) it.next();
                this.L$0 = deviceContainerImpl;
                this.L$1 = it;
                this.label = 1;
                if (deviceContainerImpl.mDeviceDao.insert(new WearableDevice[]{wearableDevice}, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.remote.DeviceContainerImpl$saveLocalDevice$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.remote.DeviceContainerImpl$saveLocalDevice$1", f = "DeviceContainerImpl.kt", i = {}, l = {248, 249}, m = "invokeSuspend", n = {}, s = {})
    public static final class C19471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LocalDevice $localDevice;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19471(LocalDevice localDevice, Continuation<? super C19471> continuation) {
            super(2, continuation);
            this.$localDevice = localDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceContainerImpl.this.new C19471(this.$localDevice, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
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
            LocalDeviceDao localDeviceDao = DeviceContainerImpl.this.mLocalDeviceDao;
            LocalDevice[] localDeviceArr = {this.$localDevice};
            this.label = 1;
            if (localDeviceDao.insert(localDeviceArr, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            DeviceContainerImpl deviceContainerImpl = DeviceContainerImpl.this;
            this.label = 2;
            if (deviceContainerImpl.loadLocalDeviceList(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.remote.DeviceContainerImpl$updateBindDeviceList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.remote.DeviceContainerImpl", f = "DeviceContainerImpl.kt", i = {0}, l = {133, 134}, m = "updateBindDeviceList", n = {"this"}, s = {"L$0"})
    public static final class C19481 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C19481(Continuation<? super C19481> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceContainerImpl.this.updateBindDeviceList(null, this);
        }
    }

    public DeviceContainerImpl() {
        DeviceDatabase.Companion companion = DeviceDatabase.INSTANCE;
        this.mDeviceDao = companion.getInstance().getDeviceDao();
        this.mLocalDeviceDao = companion.getInstance().getLocalDeviceDao();
        this.mDeviceRequest = new DeviceRequest();
        this.mBindDevices = new CopyOnWriteArrayList<>();
        this.mUnbindDevices = new CopyOnWriteArrayList<>();
        this.mLocalDevices = new CopyOnWriteArrayList<>();
    }

    private final void clearUnbindDevice() {
        DeviceModelExtKt.logi("clear unbind devices");
        this.mUnbindDevices.clear();
        AnyExtKt.io$default(null, new C19341(null), 1, null);
    }

    private final Device findCurrentDevice(List<? extends Device> devices, String did, Function1<? super Device, Boolean> predicate) {
        Logger.i("Find current device what did is " + did, new Object[0]);
        Object obj = null;
        if (devices.isEmpty()) {
            Logger.i("findCurrentDevice: devices are empty", new Object[0]);
            return null;
        }
        if (did.length() == 0) {
            return devices.get(0);
        }
        for (Object obj2 : devices) {
            if (predicate.invoke2(obj2).booleanValue()) {
                obj = obj2;
                break;
            }
        }
        Device device = (Device) obj;
        return device == null ? devices.get(0) : device;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object mergeDeviceList(List<? extends WearableDevice> list, Continuation<? super Unit> continuation) {
        C19381 c19381;
        Iterator it;
        DeviceContainerImpl deviceContainerImpl;
        if (continuation instanceof C19381) {
            c19381 = (C19381) continuation;
            int i = c19381.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c19381.label = i - Integer.MIN_VALUE;
            } else {
                c19381 = new C19381(continuation);
            }
        } else {
            c19381 = new C19381(continuation);
        }
        Object obj = c19381.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c19381.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) this.mBindDevices);
            Logger.i(TAG, "mergeDeviceList: " + mutableList);
            DeviceManagerExtKt.setList(this.mBindDevices, list);
            if (mutableList.isEmpty()) {
                return Unit.INSTANCE;
            }
            it = mutableList.iterator();
            deviceContainerImpl = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) c19381.L$1;
            deviceContainerImpl = (DeviceContainerImpl) c19381.L$0;
            ResultKt.throwOnFailure(obj);
        }
        while (it.hasNext()) {
            final WearableDevice wearableDevice = (WearableDevice) it.next();
            if (wearableDevice.getUploaded() == 1) {
                DeviceModelExtKt.logi("local is already uploaded " + wearableDevice);
            } else if (wearableDevice.getNodeId().length() == 0) {
                continue;
            } else {
                Device deviceFindBindDevice = deviceContainerImpl.findBindDevice(new Function1() { // from class: l26
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return Boolean.valueOf(DeviceContainerImpl.mergeDeviceList$lambda$2$lambda$1(wearableDevice, (Device) obj2));
                    }
                });
                Logger.i(TAG, "merge in list device: " + deviceFindBindDevice);
                if (deviceFindBindDevice == null) {
                    Intrinsics.checkNotNull(wearableDevice);
                    c19381.L$0 = deviceContainerImpl;
                    c19381.L$1 = it;
                    c19381.label = 1;
                    if (deviceContainerImpl.recordLocalBindDevice(wearableDevice, c19381) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    continue;
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean mergeDeviceList$lambda$2$lambda$1(WearableDevice wearableDevice, Device remote) {
        Intrinsics.checkNotNullParameter(remote, "remote");
        return Intrinsics.areEqual(wearableDevice.getDid(), remote.getDid()) && Intrinsics.areEqual(wearableDevice.getNodeId(), remote.getNodeId());
    }

    private final void recodePhone() {
        String userId = AccountManagerExtKt.getInstance(AccountManager.INSTANCE).getUserId();
        if (TextUtils.isEmpty(userId) || Intrinsics.areEqual(DevicePreference.INSTANCE.getRECORD_PHONE_USER(), userId)) {
            return;
        }
        ScopeExtKt.scopeNet$default(null, new C19401(userId, null), 1, null).m503catch(new Function2() { // from class: k26
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DeviceContainerImpl.recodePhone$lambda$0((AndroidScope) obj, (Throwable) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit recodePhone$lambda$0(AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        DeviceModelExtKt.loge("recordPhone errorMsg=" + it.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateDeviceInfo$lambda$5(DeviceContainerImpl this$0, WearableDevice device, UpdateDeviceInfoResult it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(device, "$device");
        Intrinsics.checkNotNullParameter(it, "it");
        AnyExtKt.io$default(null, new DeviceContainerImpl$updateDeviceInfo$1$1(this$0, device, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateDeviceInfo$lambda$6(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        DeviceModelExtKt.logi("update device info error " + it);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateUnbindDeviceList$default(DeviceContainerImpl deviceContainerImpl, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = deviceContainerImpl.mUnbindDevices;
        }
        deviceContainerImpl.updateUnbindDeviceList(list);
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceContainer
    public void clearAll() {
        clearBindDevice();
        clearUnbindDevice();
        clearLocalDevice();
    }

    public final void clearBindDevice() {
        DeviceModelExtKt.logi("clear bind devices");
        this.mBindDevices.clear();
        AnyExtKt.io$default(null, new AnonymousClass1(null), 1, null);
    }

    public final void clearLocalDevice() {
        DeviceModelExtKt.logi("clear local devices");
        this.mLocalDevices.clear();
        AnyExtKt.io$default(null, new C19331(null), 1, null);
    }

    @Nullable
    public final Device findBindDevice(@NotNull Function1<? super Device, Boolean> predicate) {
        Object next;
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Iterator<T> it = this.mBindDevices.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (predicate.invoke2(next).booleanValue()) {
                return (Device) next;
            }
        }
        next = null;
        return (Device) next;
    }

    @Nullable
    public final Device findCurrentBindDevice(@NotNull String did, @NotNull Function1<? super Device, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return findCurrentDevice(this.mBindDevices, did, predicate);
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceContainer
    @NotNull
    public List<WearableDevice> getAllDeviceList() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.mBindDevices);
        arrayList.addAll(this.mLocalDevices);
        arrayList.addAll(this.mUnbindDevices);
        return arrayList;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceContainer
    @NotNull
    public List<Device> getBindDeviceList() {
        return this.mBindDevices;
    }

    public final boolean getPhoneInfoUpdated() {
        return this.phoneInfoUpdated;
    }

    @NotNull
    public final List<WearableDevice> getUnbindDeviceList() {
        return this.mUnbindDevices;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object loadBindDeviceList(@NotNull Continuation<? super List<? extends WearableDevice>> continuation) {
        C19351 c19351;
        DeviceContainerImpl deviceContainerImpl;
        if (continuation instanceof C19351) {
            c19351 = (C19351) continuation;
            int i = c19351.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c19351.label = i - Integer.MIN_VALUE;
            } else {
                c19351 = new C19351(continuation);
            }
        } else {
            c19351 = new C19351(continuation);
        }
        Object objQueryDevices = c19351.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c19351.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objQueryDevices);
            DeviceDao deviceDao = this.mDeviceDao;
            c19351.L$0 = this;
            c19351.label = 1;
            objQueryDevices = deviceDao.queryDevices(1, c19351);
            if (objQueryDevices == coroutine_suspended) {
                return coroutine_suspended;
            }
            deviceContainerImpl = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            deviceContainerImpl = (DeviceContainerImpl) c19351.L$0;
            ResultKt.throwOnFailure(objQueryDevices);
        }
        List list = (List) objQueryDevices;
        Logger.i(TAG, "loadBindDeviceList: devices " + list);
        DeviceManagerExtKt.setList(deviceContainerImpl.mBindDevices, list);
        return deviceContainerImpl.mBindDevices;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object loadLocalDeviceList(@NotNull Continuation<? super List<LocalDevice>> continuation) {
        C19361 c19361;
        DeviceContainerImpl deviceContainerImpl;
        if (continuation instanceof C19361) {
            c19361 = (C19361) continuation;
            int i = c19361.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c19361.label = i - Integer.MIN_VALUE;
            } else {
                c19361 = new C19361(continuation);
            }
        } else {
            c19361 = new C19361(continuation);
        }
        Object objQueryAllLocalDevices = c19361.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c19361.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objQueryAllLocalDevices);
            LocalDeviceDao localDeviceDao = this.mLocalDeviceDao;
            c19361.L$0 = this;
            c19361.label = 1;
            objQueryAllLocalDevices = localDeviceDao.queryAllLocalDevices(c19361);
            if (objQueryAllLocalDevices == coroutine_suspended) {
                return coroutine_suspended;
            }
            deviceContainerImpl = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            deviceContainerImpl = (DeviceContainerImpl) c19361.L$0;
            ResultKt.throwOnFailure(objQueryAllLocalDevices);
        }
        DeviceManagerExtKt.setList(deviceContainerImpl.mLocalDevices, (List) objQueryAllLocalDevices);
        return deviceContainerImpl.mLocalDevices;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object loadUnbindDeviceList(@NotNull Continuation<? super Unit> continuation) {
        C19371 c19371;
        DeviceContainerImpl deviceContainerImpl;
        if (continuation instanceof C19371) {
            c19371 = (C19371) continuation;
            int i = c19371.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c19371.label = i - Integer.MIN_VALUE;
            } else {
                c19371 = new C19371(continuation);
            }
        } else {
            c19371 = new C19371(continuation);
        }
        Object objQueryDevices = c19371.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c19371.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objQueryDevices);
            DeviceDao deviceDao = this.mDeviceDao;
            c19371.L$0 = this;
            c19371.label = 1;
            objQueryDevices = deviceDao.queryDevices(2, c19371);
            if (objQueryDevices == coroutine_suspended) {
                return coroutine_suspended;
            }
            deviceContainerImpl = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            deviceContainerImpl = (DeviceContainerImpl) c19371.L$0;
            ResultKt.throwOnFailure(objQueryDevices);
        }
        AnyExtKt.main$default(null, deviceContainerImpl.new AnonymousClass2((List) objQueryDevices, null), 1, null);
        return Unit.INSTANCE;
    }

    public final void rawRecordPhone() {
        if (this.phoneInfoUpdated) {
            return;
        }
        ScopeExtKt.scopeNet$default(null, new C19391(null), 1, null);
        this.phoneInfoUpdated = true;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0084  */
    /* JADX WARN: Code duplicated, block: B:34:0x0088  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object recordLocalBindDevice(@NotNull WearableDevice wearableDevice, @NotNull Continuation<? super Unit> continuation) {
        C19411 c19411;
        DeviceContainerImpl deviceContainerImpl;
        boolean z;
        if (continuation instanceof C19411) {
            c19411 = (C19411) continuation;
            int i = c19411.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c19411.label = i - Integer.MIN_VALUE;
            } else {
                c19411 = new C19411(continuation);
            }
        } else {
            c19411 = new C19411(continuation);
        }
        Object obj = c19411.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c19411.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
                try {
                    DeviceRequest deviceRequest = this.mDeviceRequest;
                    c19411.L$0 = this;
                    c19411.L$1 = wearableDevice;
                    c19411.label = 1;
                    if (deviceRequest.uploadDeviceLocalBind(wearableDevice, c19411) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    deviceContainerImpl = this;
                    z = true;
                    if (z) {
                        wearableDevice.setUploaded(1);
                    } else {
                        wearableDevice.setUploaded(0);
                    }
                    deviceContainerImpl.mBindDevices.add(wearableDevice);
                    c19411.L$0 = wearableDevice;
                    c19411.L$1 = null;
                    c19411.label = 2;
                    if (deviceContainerImpl.mDeviceDao.insert(new WearableDevice[]{wearableDevice}, c19411) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Exception e) {
                    e = e;
                    deviceContainerImpl = this;
                    DeviceModelExtKt.loge("uploadDeviceSafety error " + e);
                    z = false;
                }
            } else {
                deviceContainerImpl = this;
                z = false;
                if (z) {
                    wearableDevice.setUploaded(1);
                } else {
                    wearableDevice.setUploaded(0);
                }
                deviceContainerImpl.mBindDevices.add(wearableDevice);
                c19411.L$0 = wearableDevice;
                c19411.L$1 = null;
                c19411.label = 2;
                if (deviceContainerImpl.mDeviceDao.insert(new WearableDevice[]{wearableDevice}, c19411) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i2 == 1) {
            wearableDevice = (WearableDevice) c19411.L$1;
            deviceContainerImpl = (DeviceContainerImpl) c19411.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                z = true;
            } catch (Exception e2) {
                e = e2;
                DeviceModelExtKt.loge("uploadDeviceSafety error " + e);
                z = false;
            }
            if (z) {
                wearableDevice.setUploaded(1);
            } else {
                wearableDevice.setUploaded(0);
            }
            deviceContainerImpl.mBindDevices.add(wearableDevice);
            c19411.L$0 = wearableDevice;
            c19411.L$1 = null;
            c19411.label = 2;
            if (deviceContainerImpl.mDeviceDao.insert(new WearableDevice[]{wearableDevice}, c19411) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wearableDevice = (WearableDevice) c19411.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Logger.i(TAG, "recordLocalBindDevice() called with: device = " + wearableDevice + ", uploaded = " + wearableDevice.getUploaded());
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceContainer
    public void removeDevice(@NotNull String did) {
        Object next;
        Intrinsics.checkNotNullParameter(did, "did");
        Iterator<T> it = this.mBindDevices.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((WearableDevice) next).getDid(), did));
        WearableDevice wearableDevice = (WearableDevice) next;
        if (wearableDevice == null) {
            DeviceModelExtKt.logi("Cant find device(" + did + ") in bind device list.");
            return;
        }
        DeviceModelExtKt.logi("Remove device(" + did + ") from bind device list, add it to unbind device list.");
        wearableDevice.setStatus(2);
        this.mBindDevices.remove(wearableDevice);
        this.mUnbindDevices.add(wearableDevice);
        AnyExtKt.io$default(null, new C19421(wearableDevice, null), 1, null);
    }

    public final void removeLocalDevice(@NotNull String did) {
        Object next;
        Intrinsics.checkNotNullParameter(did, "did");
        Iterator<T> it = this.mLocalDevices.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((LocalDevice) next).getDid(), did));
        LocalDevice localDevice = (LocalDevice) next;
        if (localDevice == null) {
            return;
        }
        this.mLocalDevices.remove(localDevice);
        AnyExtKt.io$default(null, new C19431(localDevice, null), 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.xiaomi.fitness.device.manager.DeviceContainer
    @Nullable
    public Object requestBindDeviceList(@NotNull Continuation<? super List<? extends WearableDevice>> continuation) {
        C19441 c19441;
        DeviceContainerImpl deviceContainerImpl;
        DeviceContainerImpl deviceContainerImpl2;
        if (continuation instanceof C19441) {
            c19441 = (C19441) continuation;
            int i = c19441.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c19441.label = i - Integer.MIN_VALUE;
            } else {
                c19441 = new C19441(continuation);
            }
        } else {
            c19441 = new C19441(continuation);
        }
        Object devices = c19441.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c19441.label;
        if (i2 != 0) {
            if (i2 == 1) {
                deviceContainerImpl = (DeviceContainerImpl) c19441.L$0;
                ResultKt.throwOnFailure(devices);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                deviceContainerImpl2 = (DeviceContainerImpl) c19441.L$0;
                ResultKt.throwOnFailure(devices);
            }
            return deviceContainerImpl2.mBindDevices;
        }
        ResultKt.throwOnFailure(devices);
        this.mLastRequestTime = System.currentTimeMillis();
        recodePhone();
        DeviceRequest deviceRequest = this.mDeviceRequest;
        c19441.L$0 = this;
        c19441.label = 1;
        devices = deviceRequest.getDevices(1, true, c19441);
        if (devices == coroutine_suspended) {
            return coroutine_suspended;
        }
        deviceContainerImpl = this;
        List<WearableDevice> list = (List) devices;
        DeviceManagerExtKt.filterDeviceList(list);
        DeviceModelExtKt.logi("requestBindDeviceList bindDevices is " + list);
        c19441.L$0 = deviceContainerImpl;
        c19441.label = 2;
        if (deviceContainerImpl.updateBindDeviceList(list, c19441) == coroutine_suspended) {
            return coroutine_suspended;
        }
        deviceContainerImpl2 = deviceContainerImpl;
        return deviceContainerImpl2.mBindDevices;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object requestUnbindDeviceList(@NotNull Continuation<? super List<? extends WearableDevice>> continuation) {
        C19451 c19451;
        DeviceContainerImpl deviceContainerImpl;
        if (continuation instanceof C19451) {
            c19451 = (C19451) continuation;
            int i = c19451.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c19451.label = i - Integer.MIN_VALUE;
            } else {
                c19451 = new C19451(continuation);
            }
        } else {
            c19451 = new C19451(continuation);
        }
        Object devices = c19451.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c19451.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(devices);
            DeviceRequest deviceRequest = this.mDeviceRequest;
            c19451.L$0 = this;
            c19451.label = 1;
            devices = deviceRequest.getDevices(2, false, c19451);
            if (devices == coroutine_suspended) {
                return coroutine_suspended;
            }
            deviceContainerImpl = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            deviceContainerImpl = (DeviceContainerImpl) c19451.L$0;
            ResultKt.throwOnFailure(devices);
        }
        deviceContainerImpl.updateUnbindDeviceList((List) devices);
        return deviceContainerImpl.mUnbindDevices;
    }

    public final void saveDevice(@NotNull List<? extends WearableDevice> devices) {
        Intrinsics.checkNotNullParameter(devices, "devices");
        AnyExtKt.io$default(null, new C19461(devices, this, null), 1, null);
    }

    public final void saveLocalDevice(@NotNull LocalDevice localDevice) {
        Intrinsics.checkNotNullParameter(localDevice, "localDevice");
        AnyExtKt.io$default(null, new C19471(localDevice, null), 1, null);
    }

    public final void setPhoneInfoUpdated(boolean z) {
        this.phoneInfoUpdated = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object updateBindDeviceList(@NotNull List<WearableDevice> list, @NotNull Continuation<? super Unit> continuation) {
        C19481 c19481;
        DeviceContainerImpl deviceContainerImpl;
        if (continuation instanceof C19481) {
            c19481 = (C19481) continuation;
            int i = c19481.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c19481.label = i - Integer.MIN_VALUE;
            } else {
                c19481 = new C19481(continuation);
            }
        } else {
            c19481 = new C19481(continuation);
        }
        Object obj = c19481.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c19481.label;
        if (i2 != 0) {
            if (i2 == 1) {
                deviceContainerImpl = (DeviceContainerImpl) c19481.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        if (!(!list.isEmpty()) && !(!this.mBindDevices.isEmpty())) {
            clearBindDevice();
            return Unit.INSTANCE;
        }
        c19481.L$0 = this;
        c19481.label = 1;
        if (mergeDeviceList(list, c19481) == coroutine_suspended) {
            return coroutine_suspended;
        }
        deviceContainerImpl = this;
        DeviceDao deviceDao = deviceContainerImpl.mDeviceDao;
        CopyOnWriteArrayList<WearableDevice> copyOnWriteArrayList = deviceContainerImpl.mBindDevices;
        c19481.L$0 = null;
        c19481.label = 2;
        if (deviceDao.updateBindDeviceList(copyOnWriteArrayList, c19481) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    public final void updateDeviceInfo(@NotNull final WearableDevice device) {
        Intrinsics.checkNotNullParameter(device, "device");
        Logger.i(TAG, "updateDeviceInfo() called with: " + device + " ");
        Device.Detail detail = device.getDetail();
        if ((detail != null ? detail.getPhoneId() : null) == null) {
            DeviceModelExtKt.logi(TAG, "updateDeviceInfo: " + detail + " ");
            return;
        }
        DeviceRequest deviceRequest = this.mDeviceRequest;
        String did = device.getDid();
        String phoneId = detail.getPhoneId();
        Intrinsics.checkNotNull(phoneId);
        deviceRequest.updateDeviceInfo(did, phoneId, new Function1() { // from class: i26
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceContainerImpl.updateDeviceInfo$lambda$5(this.f20689a, device, (UpdateDeviceInfoResult) obj);
            }
        }, new Function1() { // from class: j26
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceContainerImpl.updateDeviceInfo$lambda$6((ApiException) obj);
            }
        });
    }

    public final synchronized void updateUnbindDeviceList(@NotNull List<WearableDevice> devices) {
        try {
            Intrinsics.checkNotNullParameter(devices, "devices");
            if (!devices.isEmpty()) {
                DeviceManagerExtKt.setList(this.mUnbindDevices, devices);
                saveDevice(this.mUnbindDevices);
            } else {
                clearUnbindDevice();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
