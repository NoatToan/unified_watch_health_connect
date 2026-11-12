package com.huami.hid.takepic;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.hid.HidSdk;
import com.huami.hid.R;
import com.huami.hid.bluetooth.AbsBluetoothCallback;
import com.huami.hid.bluetooth.BluetoothBroadcastReceiver;
import com.huami.hid.bluetooth.BluetoothUtil;
import com.huami.hid.takepic.TakePicViewModel;
import com.huami.hid.utils.IntentRouter;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import it.sauronsoftware.ftp4j.FTPCodes;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 K2\u00020\u0001:\u0002LKB\u0007¢\u0006\u0004\bJ\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0012\u0010\u0010J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u001b8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\"\u001a\u00020!8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010/\u001a\u0004\u0018\u00010(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R+\u00107\u001a\u00020\f2\u0006\u00100\u001a\u00020\f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R+\u0010=\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u000e8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b8\u00102\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R+\u0010A\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00058@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0004\u00102\u001a\u0004\b>\u0010?\"\u0004\b@\u0010\bR\u0016\u0010D\u001a\u00020B8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010CR\u001d\u0010I\u001a\u00020E8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\b)\u0010H¨\u0006M"}, d2 = {"Lcom/huami/hid/takepic/TakePicViewModel;", "Landroidx/lifecycle/ViewModel;", "", "f", "e", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "registerReceiver$hid_release", "(Landroid/content/Context;)V", "registerReceiver", "unregisterReceiver$hid_release", "unregisterReceiver", "", "paired", "", "tipBluetoothOperation$hid_release", "(Z)Ljava/lang/String;", "tipBluetoothOperation", "btnLabel$hid_release", "btnLabel", "Landroid/graphics/drawable/Drawable;", "picBluetoothState$hid_release", "(Z)Landroid/graphics/drawable/Drawable;", "picBluetoothState", "clickBtnBluetoothOperation$hid_release", "()V", "clickBtnBluetoothOperation", "Landroidx/lifecycle/MutableLiveData;", "a", "Landroidx/lifecycle/MutableLiveData;", "isConnected$hid_release", "()Landroidx/lifecycle/MutableLiveData;", "isConnected", "Lcom/huami/hid/takepic/AdaptedLoadingDialog;", "loadingDialog", "Lcom/huami/hid/takepic/AdaptedLoadingDialog;", "getLoadingDialog$hid_release", "()Lcom/huami/hid/takepic/AdaptedLoadingDialog;", "setLoadingDialog$hid_release", "(Lcom/huami/hid/takepic/AdaptedLoadingDialog;)V", "Lcom/huami/hid/takepic/TakePicViewModel$BondListener;", "b", "Lcom/huami/hid/takepic/TakePicViewModel$BondListener;", "getMBondListener$hid_release", "()Lcom/huami/hid/takepic/TakePicViewModel$BondListener;", "setMBondListener$hid_release", "(Lcom/huami/hid/takepic/TakePicViewModel$BondListener;)V", "mBondListener", "<set-?>", "c", "Lkotlin/properties/ReadWriteProperty;", "isWatch$hid_release", "()Z", "setWatch$hid_release", "(Z)V", TakePicSettingActivity.KEY_IS_WATCH, GoogleApiAvailabilityLight.a, "getMacAddress$hid_release", "()Ljava/lang/String;", "setMacAddress$hid_release", "(Ljava/lang/String;)V", TakePicSettingActivity.KEY_ADDRESS, "getApplicationContext$hid_release", "()Landroid/content/Context;", "setApplicationContext$hid_release", "applicationContext", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Lcom/huami/hid/bluetooth/BluetoothBroadcastReceiver;", "g", "Lkotlin/Lazy;", "()Lcom/huami/hid/bluetooth/BluetoothBroadcastReceiver;", "bluetoothReceiver", "<init>", "Companion", "BondListener", "hid_release"}, k = 1, mv = {1, 5, 1})
public final class TakePicViewModel extends ViewModel {
    private static final long i = 10000;
    private static final int j = 1001;

    @NotNull
    private static final String k = "BluetoothUtil";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> isConnected = new MutableLiveData<>(Boolean.FALSE);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private BondListener mBondListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty isWatch;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty macAddress;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty applicationContext;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Handler handler;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy bluetoothReceiver;
    public AdaptedLoadingDialog loadingDialog;
    public static final /* synthetic */ KProperty<Object>[] h = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(TakePicViewModel.class, TakePicSettingActivity.KEY_IS_WATCH, "isWatch$hid_release()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(TakePicViewModel.class, TakePicSettingActivity.KEY_ADDRESS, "getMacAddress$hid_release()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(TakePicViewModel.class, "applicationContext", "getApplicationContext$hid_release()Landroid/content/Context;", 0))};

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lcom/huami/hid/takepic/TakePicViewModel$BondListener;", "", "", "removeBond", "hid_release"}, k = 1, mv = {1, 5, 1})
    public interface BondListener {
        void removeBond();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.hid.takepic.TakePicViewModel$clickBtnBluetoothOperation$1", f = "TakePicViewModel.kt", i = {}, l = {292}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: com.huami.hid.takepic.TakePicViewModel$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.hid.takepic.TakePicViewModel$clickBtnBluetoothOperation$1$1", f = "TakePicViewModel.kt", i = {}, l = {300}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0442a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            private /* synthetic */ Object b;
            public final /* synthetic */ TakePicViewModel c;

            /* JADX INFO: renamed from: com.huami.hid.takepic.TakePicViewModel$a$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.hid.takepic.TakePicViewModel$clickBtnBluetoothOperation$1$1$1", f = "TakePicViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0443a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int a;

                /* JADX INFO: renamed from: com.huami.hid.takepic.TakePicViewModel$a$a$a$a, reason: collision with other inner class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class C0444a extends Lambda implements Function0<String> {
                    public static final C0444a a = new C0444a();

                    public C0444a() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "发送断连hid指令";
                    }
                }

                public C0443a(Continuation<? super C0443a> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0443a(continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C0443a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    HMLog.info("BluetoothUtil", C0444a.a);
                    HidListener hidListener$hid_release = HidSdk.INSTANCE.getHidListener$hid_release();
                    if (hidListener$hid_release != null) {
                        hidListener$hid_release.onHidDisconnected();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0442a(TakePicViewModel takePicViewModel, Continuation<? super C0442a> continuation) {
                super(2, continuation);
                this.c = takePicViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0442a c0442a = new C0442a(this.c, continuation);
                c0442a.b = obj;
                return c0442a;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0442a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Job jobF = e.f((CoroutineScope) this.b, null, null, new C0443a(null), 3, null);
                    this.b = jobF;
                    this.a = 1;
                    if (jobF.join(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (HidSdk.INSTANCE.isMIUIBased11$hid_release()) {
                    IntentRouter.INSTANCE.openBluetoothSetting(this.c.getApplicationContext$hid_release());
                } else {
                    DeviceConnectionHelper.INSTANCE.unPairDevice$hid_release(this.c.getApplicationContext$hid_release(), this.c.getMacAddress$hid_release());
                }
                return Unit.INSTANCE;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TakePicViewModel.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C0442a c0442a = new C0442a(TakePicViewModel.this, null);
                this.a = 1;
                if (TimeoutKt.withTimeoutOrNull(10000L, c0442a, this) == coroutine_suspended) {
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
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "连接HID";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.hid.takepic.TakePicViewModel$onHidDisconnected$1", f = "TakePicViewModel.kt", i = {}, l = {323}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/Job;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.hid.takepic.TakePicViewModel$onHidDisconnected$1$1", f = "TakePicViewModel.kt", i = {}, l = {FTPCodes.USERNAME_OK}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
            public int a;
            private /* synthetic */ Object b;

            /* JADX INFO: renamed from: com.huami.hid.takepic.TakePicViewModel$c$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.hid.takepic.TakePicViewModel$onHidDisconnected$1$1$1", f = "TakePicViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0445a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int a;

                /* JADX INFO: renamed from: com.huami.hid.takepic.TakePicViewModel$c$a$a$a, reason: collision with other inner class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class C0446a extends Lambda implements Function0<String> {
                    public static final C0446a a = new C0446a();

                    public C0446a() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "发送断连hid指令";
                    }
                }

                public C0445a(Continuation<? super C0445a> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0445a(continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C0445a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    HMLog.info("BluetoothUtil", C0446a.a);
                    HidListener hidListener$hid_release = HidSdk.INSTANCE.getHidListener$hid_release();
                    if (hidListener$hid_release != null) {
                        hidListener$hid_release.onHidDisconnected();
                    }
                    return Unit.INSTANCE;
                }
            }

            public a(Continuation<? super a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                a aVar = new a(continuation);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Job> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Job job = (Job) this.b;
                    ResultKt.throwOnFailure(obj);
                    return job;
                }
                ResultKt.throwOnFailure(obj);
                Job jobF = e.f((CoroutineScope) this.b, null, null, new C0445a(null), 3, null);
                this.b = jobF;
                this.a = 1;
                return jobF.join(this) == coroutine_suspended ? coroutine_suspended : jobF;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                a aVar = new a(null);
                this.a = 1;
                if (TimeoutKt.withTimeoutOrNull(10000L, aVar, this) == coroutine_suspended) {
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
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.hid.takepic.TakePicViewModel$performAfterConnected$1", f = "TakePicViewModel.kt", i = {0, 1}, l = {193, 198, 208}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/Job;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.hid.takepic.TakePicViewModel$performAfterConnected$1$1", f = "TakePicViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
            public int a;
            private /* synthetic */ Object b;

            /* JADX INFO: renamed from: com.huami.hid.takepic.TakePicViewModel$d$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.hid.takepic.TakePicViewModel$performAfterConnected$1$1$1", f = "TakePicViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0447a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int a;

                public C0447a(Continuation<? super C0447a> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0447a(continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C0447a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    HidListener hidListener$hid_release = HidSdk.INSTANCE.getHidListener$hid_release();
                    if (hidListener$hid_release != null) {
                        hidListener$hid_release.onHidConnected();
                    }
                    return Unit.INSTANCE;
                }
            }

            public a(Continuation<? super a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                a aVar = new a(continuation);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Job> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return e.f((CoroutineScope) this.b, null, null, new C0447a(null), 3, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.hid.takepic.TakePicViewModel$performAfterConnected$1$2", f = "TakePicViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ TakePicViewModel b;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ Exception a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Exception exc) {
                    super(0);
                    this.a = exc;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return this.a.getLocalizedMessage();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(TakePicViewModel takePicViewModel, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = takePicViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                try {
                    AdaptedLoadingDialog.setSuccess$hid_release$default(this.b.getLoadingDialog$hid_release(), this.b.getApplicationContext$hid_release().getString(R.string.bracelet_pair_succeed), 0, null, 6, null);
                } catch (Exception e) {
                    HMLog.info("BluetoothUtil", new a(e));
                }
                this.b.isConnected$hid_release().setValue(Boxing.boxBoolean(true));
                return Unit.INSTANCE;
            }
        }

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            d dVar = TakePicViewModel.this.new d(continuation);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0077 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CoroutineScope coroutineScope;
            Job jobF;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    coroutineScope = (CoroutineScope) this.b;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    coroutineScope = (CoroutineScope) this.b;
                    ResultKt.throwOnFailure(obj);
                    jobF = e.f(coroutineScope, Dispatchers.getMain(), null, new b(TakePicViewModel.this, null), 2, null);
                    this.b = null;
                    this.a = 3;
                    if (jobF.join(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.b;
            a aVar = new a(null);
            this.b = coroutineScope2;
            this.a = 1;
            Object objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, aVar, this);
            if (objWithTimeoutOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
            coroutineScope = coroutineScope2;
            obj = objWithTimeoutOrNull;
            Job job = (Job) obj;
            if (job != null) {
                this.b = coroutineScope;
                this.a = 2;
                if (job.join(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            jobF = e.f(coroutineScope, Dispatchers.getMain(), null, new b(TakePicViewModel.this, null), 2, null);
            this.b = null;
            this.a = 3;
            if (jobF.join(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public TakePicViewModel() {
        Delegates delegates = Delegates.INSTANCE;
        this.isWatch = delegates.notNull();
        this.macAddress = delegates.notNull();
        this.applicationContext = delegates.notNull();
        this.handler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: wk7
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return TakePicViewModel.c(this.a, message);
            }
        });
        this.bluetoothReceiver = LazyKt__LazyJVMKt.lazy(new Function0<BluetoothBroadcastReceiver>() { // from class: com.huami.hid.takepic.TakePicViewModel$bluetoothReceiver$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BluetoothBroadcastReceiver getA() {
                final TakePicViewModel takePicViewModel = this.a;
                return new BluetoothBroadcastReceiver(new AbsBluetoothCallback() { // from class: com.huami.hid.takepic.TakePicViewModel$bluetoothReceiver$2.1

                    /* JADX INFO: renamed from: com.huami.hid.takepic.TakePicViewModel$bluetoothReceiver$2$1$a */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class a extends Lambda implements Function0<String> {
                        public final /* synthetic */ Exception a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public a(Exception exc) {
                            super(0);
                            this.a = exc;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final String getA() {
                            return this.a.getLocalizedMessage();
                        }
                    }

                    /* JADX INFO: renamed from: com.huami.hid.takepic.TakePicViewModel$bluetoothReceiver$2$1$b */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class b extends Lambda implements Function0<String> {
                        public final /* synthetic */ BluetoothDevice a;
                        public final /* synthetic */ int b;
                        public final /* synthetic */ int c;
                        public final /* synthetic */ TakePicViewModel d;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public b(BluetoothDevice bluetoothDevice, int i, int i2, TakePicViewModel takePicViewModel) {
                            super(0);
                            this.a = bluetoothDevice;
                            this.b = i;
                            this.c = i2;
                            this.d = takePicViewModel;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final String getA() {
                            return "device: " + this.a + " state: " + this.b + " > " + this.c + " current macAddress: " + this.d.getMacAddress$hid_release();
                        }
                    }

                    @Override // com.huami.hid.bluetooth.AbsBluetoothCallback, com.huami.hid.bluetooth.BluetoothCallback
                    public void bondBonded() {
                        super.bondBonded();
                        if (HidSdk.INSTANCE.isMIUIBased11$hid_release()) {
                            takePicViewModel.f();
                        } else {
                            DeviceConnectionHelper.INSTANCE.connectHid$hid_release(takePicViewModel.getApplicationContext$hid_release(), takePicViewModel.getMacAddress$hid_release());
                        }
                    }

                    @Override // com.huami.hid.bluetooth.AbsBluetoothCallback, com.huami.hid.bluetooth.BluetoothCallback
                    public void bondNone() {
                        super.bondNone();
                        if (!HidSdk.INSTANCE.isMIUIBased11$hid_release()) {
                            TakePicViewModel.BondListener mBondListener = takePicViewModel.getMBondListener();
                            if (mBondListener == null) {
                                return;
                            }
                            mBondListener.removeBond();
                            return;
                        }
                        try {
                            if (takePicViewModel.isConnected$hid_release().getValue().booleanValue()) {
                                takePicViewModel.e();
                                AdaptedLoadingDialog.setSuccess$hid_release$default(takePicViewModel.getLoadingDialog$hid_release(), takePicViewModel.getApplicationContext$hid_release().getString(R.string.bracelet_unpair_succeed), 0, null, 6, null);
                            } else {
                                AdaptedLoadingDialog.setFailed$hid_release$default(takePicViewModel.getLoadingDialog$hid_release(), takePicViewModel.getApplicationContext$hid_release().getString(R.string.bracelet_pair_failed), 0, null, 6, null);
                            }
                        } catch (Exception e) {
                            HMLog.info(BluetoothUtil.TAG, new a(e));
                        }
                    }

                    @Override // com.huami.hid.bluetooth.AbsBluetoothCallback, com.huami.hid.bluetooth.BluetoothCallback
                    public void stateConnectionChanged(@NotNull BluetoothDevice device, int previousState, int newState) {
                        HMLog.info(BluetoothUtil.TAG, new b(device, previousState, newState, takePicViewModel));
                        if (newState != 0) {
                            if (newState == 2 && Intrinsics.areEqual(device.getAddress(), takePicViewModel.getMacAddress$hid_release()) && !takePicViewModel.isConnected$hid_release().getValue().booleanValue()) {
                                takePicViewModel.f();
                                Analytics.recordEvent(new CountEventBuilder("Bluetooth_Pair").setValue("Success"));
                                return;
                            }
                            return;
                        }
                        if (Intrinsics.areEqual(device.getAddress(), takePicViewModel.getMacAddress$hid_release()) && takePicViewModel.isConnected$hid_release().getValue().booleanValue()) {
                            if (previousState == 1) {
                                AdaptedLoadingDialog.setFailed$hid_release$default(takePicViewModel.getLoadingDialog$hid_release(), takePicViewModel.getApplicationContext$hid_release().getString(R.string.bracelet_pair_failed), 0, null, 6, null);
                                Analytics.recordEvent(new CountEventBuilder("Bluetooth_Pair").setValue("Fail"));
                            } else {
                                AdaptedLoadingDialog.setSuccess$hid_release$default(takePicViewModel.getLoadingDialog$hid_release(), takePicViewModel.getApplicationContext$hid_release().getString(R.string.bracelet_unpair_succeed), 0, null, 6, null);
                                Analytics.recordEvent(new CountEventBuilder("Bluetooth_UnPair").setValue("Success"));
                            }
                            takePicViewModel.handler.removeMessages(1001);
                            takePicViewModel.isConnected$hid_release().setValue(Boolean.FALSE);
                        }
                    }
                });
            }
        });
    }

    private final BluetoothBroadcastReceiver b() {
        return (BluetoothBroadcastReceiver) this.bluetoothReceiver.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(TakePicViewModel takePicViewModel, Message message) {
        if (message.what != 1001) {
            return true;
        }
        DeviceConnectionHelper.INSTANCE.disconnect$hid_release();
        Boolean value = takePicViewModel.isConnected$hid_release().getValue();
        if (value == null) {
            return true;
        }
        Analytics.recordEvent(new CountEventBuilder(value.booleanValue() ? "Bluetooth_UnPair" : "Bluetooth_Pair").setValue("Fail"));
        AdaptedLoadingDialog.setFailed$hid_release$default(takePicViewModel.getLoadingDialog$hid_release(), value.booleanValue() ? takePicViewModel.getApplicationContext$hid_release().getString(R.string.bracelet_unpair_failed) : takePicViewModel.getApplicationContext$hid_release().getString(R.string.bracelet_pair_failed), 0, null, 6, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        Job jobF = e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new c(null), 3, null);
        if (jobF.isActive()) {
            return;
        }
        jobF.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        this.handler.removeMessages(1001);
        Job jobF = e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new d(null), 3, null);
        if (jobF.isActive()) {
            return;
        }
        jobF.start();
    }

    @NotNull
    public final String btnLabel$hid_release(boolean paired) {
        return paired ? getApplicationContext$hid_release().getString(R.string.bluetooth_unpair) : getApplicationContext$hid_release().getString(R.string.bluetooth_pair);
    }

    public final void clickBtnBluetoothOperation$hid_release() {
        boolean zBooleanValue = this.isConnected.getValue().booleanValue();
        getLoadingDialog$hid_release().show$hid_release(zBooleanValue ? getApplicationContext$hid_release().getString(R.string.bracelet_unpairing) : getApplicationContext$hid_release().getString(R.string.bluetooth_pairing));
        this.handler.sendEmptyMessageDelayed(1001, 10000L);
        if (!zBooleanValue) {
            HMLog.info("BluetoothUtil", b.a);
            DeviceConnectionHelper.INSTANCE.createBond$hid_release(getApplicationContext$hid_release(), getMacAddress$hid_release());
        } else {
            Job jobF = e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new a(null), 3, null);
            if (jobF.isActive()) {
                return;
            }
            jobF.start();
        }
    }

    @NotNull
    public final Context getApplicationContext$hid_release() {
        return (Context) this.applicationContext.getValue(this, h[2]);
    }

    @NotNull
    public final AdaptedLoadingDialog getLoadingDialog$hid_release() {
        AdaptedLoadingDialog adaptedLoadingDialog = this.loadingDialog;
        if (adaptedLoadingDialog != null) {
            return adaptedLoadingDialog;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: getMBondListener$hid_release, reason: from getter */
    public final BondListener getMBondListener() {
        return this.mBondListener;
    }

    @NotNull
    public final String getMacAddress$hid_release() {
        return (String) this.macAddress.getValue(this, h[1]);
    }

    @NotNull
    public final MutableLiveData<Boolean> isConnected$hid_release() {
        return this.isConnected;
    }

    public final boolean isWatch$hid_release() {
        return ((Boolean) this.isWatch.getValue(this, h[0])).booleanValue();
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    @Nullable
    public final Drawable picBluetoothState$hid_release(boolean paired) {
        Pair pair = new Pair(Boolean.valueOf(paired), Boolean.valueOf(isWatch$hid_release()));
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(pair, new Pair(bool, bool))) {
            return getApplicationContext$hid_release().getResources().getDrawable(R.mipmap.watch_need_unpair, null);
        }
        Boolean bool2 = Boolean.FALSE;
        if (Intrinsics.areEqual(pair, new Pair(bool2, bool))) {
            return getApplicationContext$hid_release().getResources().getDrawable(R.mipmap.watch_need_pair, null);
        }
        if (Intrinsics.areEqual(pair, new Pair(bool, bool2))) {
            return getApplicationContext$hid_release().getResources().getDrawable(R.mipmap.bracelet_need_unpair, null);
        }
        if (Intrinsics.areEqual(pair, new Pair(bool2, bool2))) {
            return getApplicationContext$hid_release().getResources().getDrawable(R.mipmap.bracelet_need_pair, null);
        }
        return null;
    }

    public final void registerReceiver$hid_release(@NotNull Context context) {
        b().registerSelf$hid_release(context);
    }

    public final void setApplicationContext$hid_release(@NotNull Context context) {
        this.applicationContext.setValue(this, h[2], context);
    }

    public final void setLoadingDialog$hid_release(@NotNull AdaptedLoadingDialog adaptedLoadingDialog) {
        this.loadingDialog = adaptedLoadingDialog;
    }

    public final void setMBondListener$hid_release(@Nullable BondListener bondListener) {
        this.mBondListener = bondListener;
    }

    public final void setMacAddress$hid_release(@NotNull String str) {
        this.macAddress.setValue(this, h[1], str);
    }

    public final void setWatch$hid_release(boolean z) {
        this.isWatch.setValue(this, h[0], Boolean.valueOf(z));
    }

    @NotNull
    public final String tipBluetoothOperation$hid_release(boolean paired) {
        Pair pair = new Pair(Boolean.valueOf(paired), Boolean.valueOf(isWatch$hid_release()));
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(pair, new Pair(bool, bool))) {
            return getApplicationContext$hid_release().getString(R.string.watch_tip_bluetooth_unpair);
        }
        Boolean bool2 = Boolean.FALSE;
        if (Intrinsics.areEqual(pair, new Pair(bool2, bool))) {
            return getApplicationContext$hid_release().getString(R.string.watch_tip_bluetooth_pair);
        }
        if (Intrinsics.areEqual(pair, new Pair(bool, bool2))) {
            return getApplicationContext$hid_release().getString(R.string.tip_bluetooth_unpair);
        }
        return Intrinsics.areEqual(pair, new Pair(bool2, bool2)) ? getApplicationContext$hid_release().getString(R.string.tip_bluetooth_pair) : "";
    }

    public final void unregisterReceiver$hid_release(@NotNull Context context) {
        b().unregisterSelf$hid_release(context);
    }
}
