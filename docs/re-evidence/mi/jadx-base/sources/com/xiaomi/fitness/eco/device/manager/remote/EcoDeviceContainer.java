package com.xiaomi.fitness.eco.device.manager.remote;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.eco.device.manager.dao.EcoDeviceDao;
import com.xiaomi.fitness.eco.device.manager.dao.EcoDeviceDatabase;
import com.xiaomi.fitness.eco.device.manager.dao.EcoLocalDeviceDao;
import com.xiaomi.fitness.eco.device.manager.dao.EcoLocalDeviceDatabase;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDevice;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoLocalDevice;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequest;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequestExtKt;
import com.xiaomi.fitness.electronic.scale.export.bean.Detail;
import com.xiaomi.fitness.electronic.scale.export.bean.RespDeviceInfo;
import com.xiaomi.fitness.electronic.scale.export.bean.ScaleData;
import com.xiaomi.fitness.electronic.scale.export.bean.ShareAccount;
import com.xiaomi.fitness.electronic.scale.export.bean.SharedUser;
import defpackage.xpd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u0000 92\u00020\u0001:\u00019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0013H\u0086@¢\u0006\u0002\u0010\u0014J\u000e\u0010\u0015\u001a\u00020\u0016H\u0086@¢\u0006\u0002\u0010\u0014J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0013H\u0086@¢\u0006\u0002\u0010\u0014J\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u0013H\u0086@¢\u0006\u0002\u0010\u0014J(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0082@¢\u0006\u0002\u0010\u001fJ\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u001a2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\u001aH\u0002J4\u0010$\u001a\u0004\u0018\u00010\f2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\u00132\u0006\u0010&\u001a\u00020'2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020*0)H\u0002J\u0014\u0010+\u001a\u00020\u00162\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\u0013J\u000e\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u000fJ\u0006\u0010.\u001a\u00020\u0016J\b\u0010/\u001a\u00020\u0016H\u0002J\u0006\u00100\u001a\u00020\u0016J\f\u00101\u001a\b\u0012\u0004\u0012\u00020\f0\u0013J\f\u00102\u001a\b\u0012\u0004\u0012\u00020\f0\u0013J\f\u00103\u001a\b\u0012\u0004\u0012\u00020\f0\u0013J\u000e\u00104\u001a\u00020\u00162\u0006\u0010&\u001a\u00020'J\u000e\u00105\u001a\u00020\u00162\u0006\u0010&\u001a\u00020'J\u000e\u00106\u001a\u00020\u00162\u0006\u00107\u001a\u00020\fJ\u0006\u00108\u001a\u00020\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/remote/EcoDeviceContainer;", "", "<init>", "()V", "mEcoDeviceDao", "Lcom/xiaomi/fitness/eco/device/manager/dao/EcoDeviceDao;", "mEcoLocalDeviceDao", "Lcom/xiaomi/fitness/eco/device/manager/dao/EcoLocalDeviceDao;", "mEcoScaleRequest", "Lcom/xiaomi/fitness/electronic/scale/export/ElectronicScaleRequest;", "mEcoBindDevices", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDevice;", "mEcoUnbindDevices", "mEcoLocalDevices", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoLocalDevice;", "mLastRequestTime", "", "loadEcoBindDeviceList", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadEcoUnbindDeviceList", "", "loadLocalDeviceList", "requestEcoBindDeviceList", "getEcoDevices", "", "Lcom/xiaomi/fitness/electronic/scale/export/bean/RespDeviceInfo;", "status", "", "pageSize", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "changeEcoDeviceInfoToDevice", "ecoBindDevices", "changeEcoShareAccountToDeviceInfo", "Lcom/xiaomi/fitness/electronic/scale/export/bean/ShareAccount;", "findEcoCurrentDevice", "devices", "did", "", "predicate", "Lkotlin/Function1;", "", "saveEcoDevice", "saveLocalDevice", "localDevice", "clearEcoBindDevice", "clearEcoUnbindDevice", "clearLocalDevice", "getEcoBindDeviceList", "getEcoUnbindDeviceList", "getEcoAllDeviceList", "removeEcoDevice", "removeLocalDevice", "updateEcoDeviceInfo", "device", "clearEcoAll", "Companion", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEcoDeviceContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcoDeviceContainer.kt\ncom/xiaomi/fitness/eco/device/manager/remote/EcoDeviceContainer\n+ 2 GsonExt.kt\ncom/xiaomi/fitness/common/extensions/GsonExtKt\n*L\n1#1,313:1\n29#2:314\n*S KotlinDebug\n*F\n+ 1 EcoDeviceContainer.kt\ncom/xiaomi/fitness/eco/device/manager/remote/EcoDeviceContainer\n*L\n118#1:314\n*E\n"})
public final class EcoDeviceContainer {

    @NotNull
    private static final String TAG = "EcoDeviceContainer";
    public static final int TYPE_BIND_DEVICE = 1;
    public static final int TYPE_UNBIND_DEVICE = 2;
    private volatile long mLastRequestTime;

    @NotNull
    private final EcoDeviceDao mEcoDeviceDao = EcoDeviceDatabase.INSTANCE.getInstance().getEcoDeviceDao();

    @NotNull
    private final EcoLocalDeviceDao mEcoLocalDeviceDao = EcoLocalDeviceDatabase.INSTANCE.getInstance().getEcoLocalDeviceDao();

    @NotNull
    private final ElectronicScaleRequest mEcoScaleRequest = ElectronicScaleRequestExtKt.getInstance(ElectronicScaleRequest.INSTANCE);

    @NotNull
    private final CopyOnWriteArrayList<EcoDevice> mEcoBindDevices = new CopyOnWriteArrayList<>();

    @NotNull
    private final CopyOnWriteArrayList<EcoDevice> mEcoUnbindDevices = new CopyOnWriteArrayList<>();

    @NotNull
    private final CopyOnWriteArrayList<EcoLocalDevice> mEcoLocalDevices = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceContainer$clearEcoBindDevice$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceContainer$clearEcoBindDevice$1", f = "EcoDeviceContainer.kt", i = {}, l = {234}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EcoDeviceContainer.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EcoDeviceDao ecoDeviceDao = EcoDeviceContainer.this.mEcoDeviceDao;
                this.label = 1;
                if (ecoDeviceDao.delete(1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceContainer$clearEcoUnbindDevice$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceContainer$clearEcoUnbindDevice$1", f = "EcoDeviceContainer.kt", i = {}, l = {245}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22651 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C22651(Continuation<? super C22651> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EcoDeviceContainer.this.new C22651(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EcoDeviceDao ecoDeviceDao = EcoDeviceContainer.this.mEcoDeviceDao;
                this.label = 1;
                if (ecoDeviceDao.delete(2, this) == coroutine_suspended) {
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
            return ((C22651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceContainer$clearLocalDevice$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceContainer$clearLocalDevice$1", f = "EcoDeviceContainer.kt", i = {}, l = {253}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22661 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C22661(Continuation<? super C22661> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EcoDeviceContainer.this.new C22661(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EcoLocalDeviceDao ecoLocalDeviceDao = EcoDeviceContainer.this.mEcoLocalDeviceDao;
                this.label = 1;
                if (ecoLocalDeviceDao.deleteAll(this) == coroutine_suspended) {
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
            return ((C22661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceContainer$getEcoDevices$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceContainer", f = "EcoDeviceContainer.kt", i = {0, 0, 1, 1}, l = {99, 116}, m = "getEcoDevices", n = {"this", "devices", "this", "devices"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class C22671 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C22671(Continuation<? super C22671> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EcoDeviceContainer.this.getEcoDevices(0, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceContainer$loadEcoBindDeviceList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceContainer", f = "EcoDeviceContainer.kt", i = {0}, l = {56}, m = "loadEcoBindDeviceList", n = {"this"}, s = {"L$0"})
    public static final class C22681 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C22681(Continuation<? super C22681> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EcoDeviceContainer.this.loadEcoBindDeviceList(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceContainer$loadEcoUnbindDeviceList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceContainer", f = "EcoDeviceContainer.kt", i = {0}, l = {63}, m = "loadEcoUnbindDeviceList", n = {"this"}, s = {"L$0"})
    public static final class C22691 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C22691(Continuation<? super C22691> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EcoDeviceContainer.this.loadEcoUnbindDeviceList(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceContainer$loadEcoUnbindDeviceList$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceContainer$loadEcoUnbindDeviceList$2", f = "EcoDeviceContainer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<EcoDevice> $list;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(List<? extends EcoDevice> list, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$list = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EcoDeviceContainer.this.new AnonymousClass2(this.$list, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EcoDeviceManagerExtKt.setList(EcoDeviceContainer.this.mEcoUnbindDevices, this.$list);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceContainer$loadLocalDeviceList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceContainer", f = "EcoDeviceContainer.kt", i = {0}, l = {70}, m = "loadLocalDeviceList", n = {"this"}, s = {"L$0"})
    public static final class C22701 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C22701(Continuation<? super C22701> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EcoDeviceContainer.this.loadLocalDeviceList(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceContainer$removeEcoDevice$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceContainer$removeEcoDevice$1", f = "EcoDeviceContainer.kt", i = {}, l = {279}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22711 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22711(String str, Continuation<? super C22711> continuation) {
            super(2, continuation);
            this.$did = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EcoDeviceContainer.this.new C22711(this.$did, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EcoDeviceDao ecoDeviceDao = EcoDeviceContainer.this.mEcoDeviceDao;
                String str = this.$did;
                this.label = 1;
                if (ecoDeviceDao.delete(str, this) == coroutine_suspended) {
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
            return ((C22711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceContainer$removeLocalDevice$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceContainer$removeLocalDevice$1", f = "EcoDeviceContainer.kt", i = {}, l = {289}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22721 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ EcoLocalDevice $filter;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22721(EcoLocalDevice ecoLocalDevice, Continuation<? super C22721> continuation) {
            super(2, continuation);
            this.$filter = ecoLocalDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EcoDeviceContainer.this.new C22721(this.$filter, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EcoLocalDeviceDao ecoLocalDeviceDao = EcoDeviceContainer.this.mEcoLocalDeviceDao;
                EcoLocalDevice[] ecoLocalDeviceArr = {this.$filter};
                this.label = 1;
                obj = ecoLocalDeviceDao.delete(ecoLocalDeviceArr, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Logger.i(EcoDeviceContainer.TAG, "removeLocalDevice: delete " + ((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C22721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceContainer$requestEcoBindDeviceList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceContainer", f = "EcoDeviceContainer.kt", i = {0, 1}, l = {82, 86}, m = "requestEcoBindDeviceList", n = {"this", "this"}, s = {"L$0", "L$0"})
    public static final class C22731 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C22731(Continuation<? super C22731> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EcoDeviceContainer.this.requestEcoBindDeviceList(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceContainer$saveEcoDevice$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceContainer$saveEcoDevice$1", f = "EcoDeviceContainer.kt", i = {}, l = {214}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nEcoDeviceContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcoDeviceContainer.kt\ncom/xiaomi/fitness/eco/device/manager/remote/EcoDeviceContainer$saveEcoDevice$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,313:1\n1863#2,2:314\n*S KotlinDebug\n*F\n+ 1 EcoDeviceContainer.kt\ncom/xiaomi/fitness/eco/device/manager/remote/EcoDeviceContainer$saveEcoDevice$1\n*L\n213#1:314,2\n*E\n"})
    public static final class C22741 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<EcoDevice> $devices;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ EcoDeviceContainer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C22741(List<? extends EcoDevice> list, EcoDeviceContainer ecoDeviceContainer, Continuation<? super C22741> continuation) {
            super(2, continuation);
            this.$devices = list;
            this.this$0 = ecoDeviceContainer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C22741(this.$devices, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            EcoDeviceContainer ecoDeviceContainer;
            Iterator it;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List<EcoDevice> list = this.$devices;
                ecoDeviceContainer = this.this$0;
                it = list.iterator();
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$1;
                ecoDeviceContainer = (EcoDeviceContainer) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            while (it.hasNext()) {
                EcoDevice ecoDevice = (EcoDevice) it.next();
                this.L$0 = ecoDeviceContainer;
                this.L$1 = it;
                this.label = 1;
                if (ecoDeviceContainer.mEcoDeviceDao.insert(new EcoDevice[]{ecoDevice}, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C22741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceContainer$saveLocalDevice$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceContainer$saveLocalDevice$1", f = "EcoDeviceContainer.kt", i = {}, l = {221, 222}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22751 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ EcoLocalDevice $localDevice;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22751(EcoLocalDevice ecoLocalDevice, Continuation<? super C22751> continuation) {
            super(2, continuation);
            this.$localDevice = ecoLocalDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EcoDeviceContainer.this.new C22751(this.$localDevice, continuation);
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
            EcoLocalDeviceDao ecoLocalDeviceDao = EcoDeviceContainer.this.mEcoLocalDeviceDao;
            EcoLocalDevice[] ecoLocalDeviceArr = {this.$localDevice};
            this.label = 1;
            if (ecoLocalDeviceDao.insert(ecoLocalDeviceArr, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            EcoDeviceContainer ecoDeviceContainer = EcoDeviceContainer.this;
            this.label = 2;
            if (ecoDeviceContainer.loadLocalDeviceList(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C22751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceContainer$updateEcoDeviceInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceContainer$updateEcoDeviceInfo$1", f = "EcoDeviceContainer.kt", i = {}, l = {303}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22761 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ EcoDevice $device;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22761(EcoDevice ecoDevice, Continuation<? super C22761> continuation) {
            super(2, continuation);
            this.$device = ecoDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EcoDeviceContainer.this.new C22761(this.$device, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EcoDeviceDao ecoDeviceDao = EcoDeviceContainer.this.mEcoDeviceDao;
                EcoDevice ecoDevice = this.$device;
                this.label = 1;
                obj = ecoDeviceDao.update(ecoDevice, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            EcoDeviceModelExtKt.logi("update device info success " + ((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C22761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final List<EcoDevice> changeEcoDeviceInfoToDevice(List<RespDeviceInfo> ecoBindDevices) {
        ArrayList arrayList = new ArrayList();
        for (RespDeviceInfo respDeviceInfo : ecoBindDevices) {
            if (respDeviceInfo != null) {
                String sid = respDeviceInfo.getSid();
                String identifier = respDeviceInfo.getIdentifier();
                String name = respDeviceInfo.getName();
                String model = respDeviceInfo.getModel();
                int status = respDeviceInfo.getStatus();
                boolean z = respDeviceInfo.getType() == 1;
                arrayList.add(new EcoDevice(sid, 0, model, name, null, identifier, null, status, new Device.Detail(respDeviceInfo.getDetail().getMac(), respDeviceInfo.getDetail().getSn(), respDeviceInfo.getDetail().getToken(), respDeviceInfo.getDetail().getEncryptKey(), respDeviceInfo.getDetail().getIrqKey(), respDeviceInfo.getDetail().getBeaconkey(), null, null, null, null, null, null, null, null, 16320, null), 1, z, respDeviceInfo.getUserId(), respDeviceInfo.getShareUserId(), respDeviceInfo.getShareId(), 82, null));
            }
        }
        return arrayList;
    }

    private final List<RespDeviceInfo> changeEcoShareAccountToDeviceInfo(List<ShareAccount> ecoBindDevices) {
        ArrayList arrayList = new ArrayList();
        for (ShareAccount shareAccount : ecoBindDevices) {
            if (!shareAccount.isBondBoolean()) {
                arrayList.add(new RespDeviceInfo(null, 0L, shareAccount.getName(), shareAccount.getModel(), 0L, new Detail(null, null, null, null, shareAccount.getMac(), null, 47, null), shareAccount.getDid(), 0, 2, shareAccount.getUserId(), shareAccount.getShareUserId(), shareAccount.getShareId(), 147, null));
            }
        }
        return arrayList;
    }

    private final void clearEcoUnbindDevice() {
        EcoDeviceModelExtKt.logi("clear unbind devices");
        this.mEcoUnbindDevices.clear();
        AnyExtKt.io$default(null, new C22651(null), 1, null);
    }

    private final EcoDevice findEcoCurrentDevice(List<? extends EcoDevice> devices, String did, Function1<? super EcoDevice, Boolean> predicate) {
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
        EcoDevice ecoDevice = (EcoDevice) obj;
        return ecoDevice == null ? devices.get(0) : ecoDevice;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x0107  */
    /* JADX WARN: Code duplicated, block: B:38:0x0114  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getEcoDevices(int i, int i2, Continuation<? super List<RespDeviceInfo>> continuation) {
        C22671 c22671;
        EcoDeviceContainer ecoDeviceContainer;
        List list;
        List listAsMutableList;
        List<ShareAccount> data;
        List<RespDeviceInfo> listChangeEcoShareAccountToDeviceInfo;
        if (continuation instanceof C22671) {
            c22671 = (C22671) continuation;
            int i3 = c22671.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c22671.label = i3 - Integer.MIN_VALUE;
            } else {
                c22671 = new C22671(continuation);
            }
        } else {
            c22671 = new C22671(continuation);
        }
        Object shareListSync = c22671.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c22671.label;
        if (i4 != 0) {
            if (i4 == 1) {
                list = (List) c22671.L$1;
                ecoDeviceContainer = (EcoDeviceContainer) c22671.L$0;
                ResultKt.throwOnFailure(shareListSync);
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) c22671.L$1;
                ecoDeviceContainer = (EcoDeviceContainer) c22671.L$0;
                ResultKt.throwOnFailure(shareListSync);
            }
            ScaleData scaleData = (ScaleData) shareListSync;
            EcoDeviceModelExtKt.logi("getEcoDevices shareList is " + scaleData);
            data = ((SharedUser) new Gson().fromJson(scaleData.getResp(), new TypeToken<SharedUser>() { // from class: com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceContainer$getEcoDevices$$inlined$fromJson$1
            }.getType())).getData();
            if (!data.isEmpty()) {
                listChangeEcoShareAccountToDeviceInfo = ecoDeviceContainer.changeEcoShareAccountToDeviceInfo(data);
                if (!listChangeEcoShareAccountToDeviceInfo.isEmpty()) {
                    list.addAll(listChangeEcoShareAccountToDeviceInfo);
                }
            }
            return list;
        }
        ResultKt.throwOnFailure(shareListSync);
        ArrayList arrayList = new ArrayList();
        ElectronicScaleRequest electronicScaleRequest = this.mEcoScaleRequest;
        c22671.L$0 = this;
        c22671.L$1 = arrayList;
        c22671.label = 1;
        Object ecoDevices = electronicScaleRequest.getEcoDevices(1, i2, i, c22671);
        if (ecoDevices == coroutine_suspended) {
            return coroutine_suspended;
        }
        ecoDeviceContainer = this;
        shareListSync = ecoDevices;
        list = arrayList;
        ScaleData scaleData2 = (ScaleData) shareListSync;
        EcoDeviceModelExtKt.logi("getEcoDevices scaleData is " + scaleData2);
        JSONObject jSONObject = new JSONObject(scaleData2.getResp());
        int iOptInt = jSONObject.optInt("code");
        JSONArray jSONArrayOptJSONArray = jSONObject.getJSONObject("result").optJSONArray("list");
        if (iOptInt != 0 || jSONArrayOptJSONArray == null) {
            listAsMutableList = null;
        } else {
            List listG = xpd.g(jSONArrayOptJSONArray.toString(), RespDeviceInfo.class);
            Intrinsics.checkNotNull(listG, "null cannot be cast to non-null type kotlin.collections.MutableList<com.xiaomi.fitness.electronic.scale.export.bean.RespDeviceInfo>");
            listAsMutableList = TypeIntrinsics.asMutableList(listG);
        }
        List list2 = listAsMutableList;
        if (list2 != null && !list2.isEmpty()) {
            list.addAll(list2);
        }
        ElectronicScaleRequest electronicScaleRequest2 = ecoDeviceContainer.mEcoScaleRequest;
        c22671.L$0 = ecoDeviceContainer;
        c22671.L$1 = list;
        c22671.label = 2;
        shareListSync = electronicScaleRequest2.getShareListSync(c22671);
        if (shareListSync == coroutine_suspended) {
            return coroutine_suspended;
        }
        ScaleData scaleData3 = (ScaleData) shareListSync;
        EcoDeviceModelExtKt.logi("getEcoDevices shareList is " + scaleData3);
        data = ((SharedUser) new Gson().fromJson(scaleData3.getResp(), new TypeToken<SharedUser>() { // from class: com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceContainer$getEcoDevices$$inlined$fromJson$1
        }.getType())).getData();
        if (!data.isEmpty()) {
            listChangeEcoShareAccountToDeviceInfo = ecoDeviceContainer.changeEcoShareAccountToDeviceInfo(data);
            if (!listChangeEcoShareAccountToDeviceInfo.isEmpty()) {
                list.addAll(listChangeEcoShareAccountToDeviceInfo);
            }
        }
        return list;
    }

    public static /* synthetic */ Object getEcoDevices$default(EcoDeviceContainer ecoDeviceContainer, int i, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 50;
        }
        return ecoDeviceContainer.getEcoDevices(i, i2, continuation);
    }

    public final void clearEcoAll() {
        clearEcoBindDevice();
        clearEcoUnbindDevice();
        clearLocalDevice();
    }

    public final void clearEcoBindDevice() {
        EcoDeviceModelExtKt.logi("clear bind devices");
        this.mEcoBindDevices.clear();
        AnyExtKt.io$default(null, new AnonymousClass1(null), 1, null);
    }

    public final void clearLocalDevice() {
        EcoDeviceModelExtKt.logi("clear local devices");
        this.mEcoLocalDevices.clear();
        AnyExtKt.io$default(null, new C22661(null), 1, null);
    }

    @NotNull
    public final List<EcoDevice> getEcoAllDeviceList() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.mEcoBindDevices);
        arrayList.addAll(this.mEcoUnbindDevices);
        arrayList.addAll(this.mEcoLocalDevices);
        return arrayList;
    }

    @NotNull
    public final List<EcoDevice> getEcoBindDeviceList() {
        return this.mEcoBindDevices;
    }

    @NotNull
    public final List<EcoDevice> getEcoUnbindDeviceList() {
        return this.mEcoUnbindDevices;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object loadEcoBindDeviceList(@NotNull Continuation<? super List<? extends EcoDevice>> continuation) {
        C22681 c22681;
        EcoDeviceContainer ecoDeviceContainer;
        if (continuation instanceof C22681) {
            c22681 = (C22681) continuation;
            int i = c22681.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22681.label = i - Integer.MIN_VALUE;
            } else {
                c22681 = new C22681(continuation);
            }
        } else {
            c22681 = new C22681(continuation);
        }
        Object objQueryDevices = c22681.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c22681.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objQueryDevices);
            EcoDeviceDao ecoDeviceDao = this.mEcoDeviceDao;
            c22681.L$0 = this;
            c22681.label = 1;
            objQueryDevices = ecoDeviceDao.queryDevices(1, c22681);
            if (objQueryDevices == coroutine_suspended) {
                return coroutine_suspended;
            }
            ecoDeviceContainer = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ecoDeviceContainer = (EcoDeviceContainer) c22681.L$0;
            ResultKt.throwOnFailure(objQueryDevices);
        }
        List list = (List) objQueryDevices;
        Logger.i(TAG, "loadBindDeviceList: devices " + list);
        EcoDeviceManagerExtKt.setList(ecoDeviceContainer.mEcoBindDevices, list);
        return ecoDeviceContainer.mEcoBindDevices;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object loadEcoUnbindDeviceList(@NotNull Continuation<? super Unit> continuation) {
        C22691 c22691;
        EcoDeviceContainer ecoDeviceContainer;
        if (continuation instanceof C22691) {
            c22691 = (C22691) continuation;
            int i = c22691.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22691.label = i - Integer.MIN_VALUE;
            } else {
                c22691 = new C22691(continuation);
            }
        } else {
            c22691 = new C22691(continuation);
        }
        Object objQueryDevices = c22691.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c22691.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objQueryDevices);
            EcoDeviceDao ecoDeviceDao = this.mEcoDeviceDao;
            c22691.L$0 = this;
            c22691.label = 1;
            objQueryDevices = ecoDeviceDao.queryDevices(2, c22691);
            if (objQueryDevices == coroutine_suspended) {
                return coroutine_suspended;
            }
            ecoDeviceContainer = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ecoDeviceContainer = (EcoDeviceContainer) c22691.L$0;
            ResultKt.throwOnFailure(objQueryDevices);
        }
        AnyExtKt.main$default(null, ecoDeviceContainer.new AnonymousClass2((List) objQueryDevices, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object loadLocalDeviceList(@NotNull Continuation<? super List<EcoLocalDevice>> continuation) {
        C22701 c22701;
        EcoDeviceContainer ecoDeviceContainer;
        if (continuation instanceof C22701) {
            c22701 = (C22701) continuation;
            int i = c22701.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22701.label = i - Integer.MIN_VALUE;
            } else {
                c22701 = new C22701(continuation);
            }
        } else {
            c22701 = new C22701(continuation);
        }
        Object objQueryAllLocalDevices = c22701.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c22701.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objQueryAllLocalDevices);
            EcoLocalDeviceDao ecoLocalDeviceDao = this.mEcoLocalDeviceDao;
            c22701.L$0 = this;
            c22701.label = 1;
            objQueryAllLocalDevices = ecoLocalDeviceDao.queryAllLocalDevices(c22701);
            if (objQueryAllLocalDevices == coroutine_suspended) {
                return coroutine_suspended;
            }
            ecoDeviceContainer = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ecoDeviceContainer = (EcoDeviceContainer) c22701.L$0;
            ResultKt.throwOnFailure(objQueryAllLocalDevices);
        }
        EcoDeviceManagerExtKt.setList(ecoDeviceContainer.mEcoLocalDevices, (List) objQueryAllLocalDevices);
        return ecoDeviceContainer.mEcoLocalDevices;
    }

    public final void removeEcoDevice(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        for (Object obj : this.mEcoBindDevices) {
            if (Intrinsics.areEqual(((EcoDevice) obj).getDid(), did)) {
                this.mEcoBindDevices.remove((EcoDevice) obj);
                AnyExtKt.io$default(null, new C22711(did, null), 1, null);
            }
        }
        obj = null;
        this.mEcoBindDevices.remove((EcoDevice) obj);
        AnyExtKt.io$default(null, new C22711(did, null), 1, null);
    }

    public final void removeLocalDevice(@NotNull String did) {
        Object next;
        Intrinsics.checkNotNullParameter(did, "did");
        Iterator<T> it = this.mEcoLocalDevices.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((EcoLocalDevice) next).getDid(), did));
        EcoLocalDevice ecoLocalDevice = (EcoLocalDevice) next;
        if (ecoLocalDevice == null) {
            return;
        }
        this.mEcoLocalDevices.remove(ecoLocalDevice);
        AnyExtKt.io$default(null, new C22721(ecoLocalDevice, null), 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object requestEcoBindDeviceList(@NotNull Continuation<? super List<? extends EcoDevice>> continuation) {
        C22731 c22731;
        EcoDeviceContainer ecoDeviceContainer;
        EcoDeviceContainer ecoDeviceContainer2;
        if (continuation instanceof C22731) {
            c22731 = (C22731) continuation;
            int i = c22731.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22731.label = i - Integer.MIN_VALUE;
            } else {
                c22731 = new C22731(continuation);
            }
        } else {
            c22731 = new C22731(continuation);
        }
        Object ecoDevices$default = c22731.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c22731.label;
        if (i2 != 0) {
            if (i2 == 1) {
                ecoDeviceContainer = (EcoDeviceContainer) c22731.L$0;
                ResultKt.throwOnFailure(ecoDevices$default);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ecoDeviceContainer2 = (EcoDeviceContainer) c22731.L$0;
                ResultKt.throwOnFailure(ecoDevices$default);
            }
            return ecoDeviceContainer2.mEcoBindDevices;
        }
        ResultKt.throwOnFailure(ecoDevices$default);
        this.mLastRequestTime = System.currentTimeMillis();
        c22731.L$0 = this;
        c22731.label = 1;
        ecoDevices$default = getEcoDevices$default(this, 1, 0, c22731, 2, null);
        if (ecoDevices$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        ecoDeviceContainer = this;
        List<RespDeviceInfo> list = (List) ecoDevices$default;
        EcoDeviceModelExtKt.logi("requestBindDeviceList ecoBindDevices is " + list);
        ecoDeviceContainer.mEcoBindDevices.clear();
        ecoDeviceContainer.mEcoBindDevices.addAll(ecoDeviceContainer.changeEcoDeviceInfoToDevice(list));
        EcoDeviceDao ecoDeviceDao = ecoDeviceContainer.mEcoDeviceDao;
        CopyOnWriteArrayList<EcoDevice> copyOnWriteArrayList = ecoDeviceContainer.mEcoBindDevices;
        c22731.L$0 = ecoDeviceContainer;
        c22731.label = 2;
        if (ecoDeviceDao.updateBindDeviceList(copyOnWriteArrayList, c22731) == coroutine_suspended) {
            return coroutine_suspended;
        }
        ecoDeviceContainer2 = ecoDeviceContainer;
        return ecoDeviceContainer2.mEcoBindDevices;
    }

    public final void saveEcoDevice(@NotNull List<? extends EcoDevice> devices) {
        Intrinsics.checkNotNullParameter(devices, "devices");
        AnyExtKt.io$default(null, new C22741(devices, this, null), 1, null);
    }

    public final void saveLocalDevice(@NotNull EcoLocalDevice localDevice) {
        Intrinsics.checkNotNullParameter(localDevice, "localDevice");
        AnyExtKt.io$default(null, new C22751(localDevice, null), 1, null);
    }

    public final void updateEcoDeviceInfo(@NotNull EcoDevice device) {
        Intrinsics.checkNotNullParameter(device, "device");
        Logger.i(TAG, "updateDeviceInfo() called with: " + device + " ");
        Device.Detail detail = device.getDetail();
        if ((detail != null ? detail.getPhoneId() : null) != null) {
            AnyExtKt.io$default(null, new C22761(device, null), 1, null);
            return;
        }
        EcoDeviceModelExtKt.logi(TAG, "updateDeviceInfo: " + detail + " ");
    }
}
