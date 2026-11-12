package com.huami.applet.jslog;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.applet.AppletConfig;
import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.huami.bluetooth.profile.channel.module.assistant.response.Success;
import com.huami.bluetooth.profile.channel.module.lumberjack.LaumberjackApi;
import com.huami.bluetooth.profile.channel.module.lumberjack.LaumberjackModule;
import com.huami.bluetooth.profile.channel.module.lumberjack.LogCallback;
import com.huami.bluetooth.profile.channel.module.lumberjack.LogStream;
import com.huami.bluetooth.profile.channel.module.lumberjack.Version;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.r;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000o\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u00013\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bG\u0010HJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0004J\u0006\u0010\u0010\u001a\u00020\u0004J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000bJ\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR,\u0010$\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\"\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010!0\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001fR\u001e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001fR\u001e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001fR\u001e\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u001fR2\u00100\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0,j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b`-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R2\u00102\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060,j\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0006`-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/R\u001d\u00107\u001a\u0002038B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b\u0016\u00106R\u0018\u0010:\u001a\u0004\u0018\u0001088B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u00109R\u001b\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0;8F@\u0006¢\u0006\u0006\u001a\u0004\b<\u0010=R)\u0010@\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\"\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010!0;8F@\u0006¢\u0006\u0006\u001a\u0004\b?\u0010=R\u001b\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0;8F@\u0006¢\u0006\u0006\u001a\u0004\bA\u0010=R\u001b\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0;8F@\u0006¢\u0006\u0006\u001a\u0004\bC\u0010=R\u001b\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0;8F@\u0006¢\u0006\u0006\u001a\u0004\bE\u0010=¨\u0006I"}, d2 = {"Lcom/huami/applet/jslog/LaumberjackViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "", "initViewModel", "", "domainName", "queryVersion", "domain", "openLogStream", "", "streamId", "closeLogStream", "closeAllLogStream", "registerLogCallback", "unRegisterLogCallback", "getDomain", "getStreamId", "(Ljava/lang/String;)Ljava/lang/Integer;", "tag", "getTagStr", "a", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "b", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "hmDevice", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/bluetooth/profile/channel/module/lumberjack/Version;", "c", "Landroidx/lifecycle/MutableLiveData;", "_versionLd", "Lkotlin/Pair;", "", GoogleApiAvailabilityLight.a, "_rlOpenLog", "e", "_rlCloseLog", "Lcom/huami/bluetooth/profile/channel/module/lumberjack/LogStream;", "f", "_logStream", "g", "_error", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "h", "Ljava/util/HashMap;", "domainMap", "i", "tagMap", "com/huami/applet/jslog/LaumberjackViewModel$callback$2$1", z.j, "Lkotlin/Lazy;", "()Lcom/huami/applet/jslog/LaumberjackViewModel$callback$2$1;", "callback", "Lcom/huami/bluetooth/profile/channel/module/lumberjack/LaumberjackModule;", "()Lcom/huami/bluetooth/profile/channel/module/lumberjack/LaumberjackModule;", "laumberjackModule", "Landroidx/lifecycle/LiveData;", "getVersionLd", "()Landroidx/lifecycle/LiveData;", "versionLd", "getRlOpenLog", "rlOpenLog", "getRlCloseLog", "rlCloseLog", "getLogStream", "logStream", "getError", "error", "<init>", "()V", "applet_release"}, k = 1, mv = {1, 5, 1})
public final class LaumberjackViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private HMDeviceSource deviceSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final HMBaseDevice hmDevice = AppletConfig.INSTANCE.getHmBaseDevice();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Version> _versionLd = new MutableLiveData<>(null);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Pair<Boolean, Integer>> _rlOpenLog = new MutableLiveData<>(null);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> _rlCloseLog = new MutableLiveData<>(null);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<LogStream> _logStream = new MutableLiveData<>(null);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Integer> _error = new MutableLiveData<>(null);

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final HashMap<String, Integer> domainMap = new HashMap<>();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final HashMap<Integer, String> tagMap = r.hashMapOf(new Pair(0, "V"), new Pair(1, LogUtil.D), new Pair(2, LogUtil.I), new Pair(3, "W"), new Pair(4, "E"), new Pair(5, "F"));

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy callback = LazyKt__LazyJVMKt.lazy(new Function0<LaumberjackViewModel$callback$2.AnonymousClass1>() { // from class: com.huami.applet.jslog.LaumberjackViewModel$callback$2
        {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.huami.applet.jslog.LaumberjackViewModel$callback$2$1] */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AnonymousClass1 invoke() {
            final LaumberjackViewModel laumberjackViewModel = this.a;
            return new LogCallback() { // from class: com.huami.applet.jslog.LaumberjackViewModel$callback$2.1
                @Override // com.huami.bluetooth.profile.channel.module.lumberjack.LogCallback
                public void onError(int code) {
                    laumberjackViewModel._error.postValue(Integer.valueOf(code));
                }

                @Override // com.huami.bluetooth.profile.channel.module.lumberjack.LogCallback
                public void onReceive(@NotNull LogStream logStream) {
                    laumberjackViewModel._logStream.postValue(logStream);
                }
            };
        }
    });

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.applet.jslog.LaumberjackViewModel$closeAllLogStream$1", f = "LaumberjackViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LaumberjackViewModel.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LaumberjackApi laumberjackApiLoadApi;
            Response<Boolean> responseCloseAll;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            LaumberjackModule laumberjackModuleB = LaumberjackViewModel.this.b();
            Boolean boolBoxBoolean = null;
            if (laumberjackModuleB != null && (laumberjackApiLoadApi = laumberjackModuleB.loadApi()) != null && (responseCloseAll = laumberjackApiLoadApi.closeAll()) != null) {
                if (!Boxing.boxBoolean(responseCloseAll instanceof Success).booleanValue()) {
                    responseCloseAll = null;
                }
                if (responseCloseAll != null) {
                    boolBoxBoolean = Boxing.boxBoolean(true);
                }
            }
            LaumberjackViewModel.this._rlCloseLog.postValue(boolBoxBoolean);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.applet.jslog.LaumberjackViewModel$closeLogStream$1", f = "LaumberjackViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LaumberjackViewModel.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LaumberjackApi laumberjackApiLoadApi;
            Response<Boolean> responseCloseStream;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            LaumberjackModule laumberjackModuleB = LaumberjackViewModel.this.b();
            Boolean boolBoxBoolean = null;
            if (laumberjackModuleB != null && (laumberjackApiLoadApi = laumberjackModuleB.loadApi()) != null && (responseCloseStream = laumberjackApiLoadApi.closeStream(this.c)) != null) {
                if (!Boxing.boxBoolean(responseCloseStream instanceof Success).booleanValue()) {
                    responseCloseStream = null;
                }
                if (responseCloseStream != null) {
                    boolBoxBoolean = Boxing.boxBoolean(true);
                }
            }
            LaumberjackViewModel.this._rlCloseLog.postValue(boolBoxBoolean);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.applet.jslog.LaumberjackViewModel$openLogStream$1", f = "LaumberjackViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LaumberjackViewModel.this.new c(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:6:0x0013  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LaumberjackApi laumberjackApiLoadApi;
            Response<Integer> responseOpenStream;
            Integer numBoxInt;
            Pair pair;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            LaumberjackModule laumberjackModuleB = LaumberjackViewModel.this.b();
            if (laumberjackModuleB == null || (laumberjackApiLoadApi = laumberjackModuleB.loadApi()) == null || (responseOpenStream = laumberjackApiLoadApi.openStream(this.c)) == null) {
                numBoxInt = null;
            } else {
                if (!Boxing.boxBoolean(responseOpenStream instanceof Success).booleanValue()) {
                    responseOpenStream = null;
                }
                if (responseOpenStream == null) {
                    numBoxInt = null;
                } else {
                    numBoxInt = Boxing.boxInt(((Number) ((Success) responseOpenStream).getData()).intValue());
                }
            }
            MutableLiveData mutableLiveData = LaumberjackViewModel.this._rlOpenLog;
            if (numBoxInt == null) {
                pair = null;
            } else {
                LaumberjackViewModel laumberjackViewModel = LaumberjackViewModel.this;
                String str = this.c;
                int iIntValue = numBoxInt.intValue();
                laumberjackViewModel.domainMap.put(str, Boxing.boxInt(iIntValue));
                pair = new Pair(Boxing.boxBoolean(true), Boxing.boxInt(iIntValue));
            }
            if (pair == null) {
                pair = new Pair(Boxing.boxBoolean(false), null);
            }
            mutableLiveData.postValue(pair);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.applet.jslog.LaumberjackViewModel$queryVersion$1", f = "LaumberjackViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Continuation<? super d> continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LaumberjackViewModel.this.new d(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LaumberjackApi laumberjackApiLoadApi;
            Response<Version> responseQueryVersion;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            LaumberjackModule laumberjackModuleB = LaumberjackViewModel.this.b();
            Version version = null;
            if (laumberjackModuleB != null && (laumberjackApiLoadApi = laumberjackModuleB.loadApi()) != null && (responseQueryVersion = laumberjackApiLoadApi.queryVersion()) != null) {
                if (!Boxing.boxBoolean(responseQueryVersion instanceof Success).booleanValue()) {
                    responseQueryVersion = null;
                }
                if (responseQueryVersion != null) {
                    version = (Version) ((Success) responseQueryVersion).getData();
                }
            }
            LaumberjackViewModel.this._versionLd.postValue(version);
            LaumberjackViewModel.this.openLogStream(this.c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.applet.jslog.LaumberjackViewModel$registerLogCallback$1", f = "LaumberjackViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LaumberjackViewModel.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LaumberjackApi laumberjackApiLoadApi;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            LaumberjackModule laumberjackModuleB = LaumberjackViewModel.this.b();
            if (laumberjackModuleB != null && (laumberjackApiLoadApi = laumberjackModuleB.loadApi()) != null) {
                laumberjackApiLoadApi.registerLogCallback(LaumberjackViewModel.this.a());
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.applet.jslog.LaumberjackViewModel$unRegisterLogCallback$1", f = "LaumberjackViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LaumberjackViewModel.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LaumberjackApi laumberjackApiLoadApi;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            LaumberjackModule laumberjackModuleB = LaumberjackViewModel.this.b();
            if (laumberjackModuleB != null && (laumberjackApiLoadApi = laumberjackModuleB.loadApi()) != null) {
                laumberjackApiLoadApi.unregisterLogCallback(LaumberjackViewModel.this.a());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LaumberjackViewModel$callback$2.AnonymousClass1 a() {
        return (LaumberjackViewModel$callback$2.AnonymousClass1) this.callback.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LaumberjackModule b() {
        HMBaseDevice hMBaseDevice = this.hmDevice;
        if (hMBaseDevice == null) {
            return null;
        }
        return (LaumberjackModule) hMBaseDevice.getChannelModule(LaumberjackModule.class);
    }

    public final void closeAllLogStream() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(null), 2, null);
    }

    public final void closeLogStream(int streamId) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new b(streamId, null), 2, null);
    }

    @Nullable
    public final String getDomain(int streamId) {
        HashMap<String, Integer> map = this.domainMap;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue().intValue() == streamId) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return (String) CollectionsKt.firstOrNull(linkedHashMap.keySet());
    }

    @NotNull
    public final LiveData<Integer> getError() {
        return this._error;
    }

    @NotNull
    public final LiveData<LogStream> getLogStream() {
        return this._logStream;
    }

    @NotNull
    public final LiveData<Boolean> getRlCloseLog() {
        return this._rlCloseLog;
    }

    @NotNull
    public final LiveData<Pair<Boolean, Integer>> getRlOpenLog() {
        return this._rlOpenLog;
    }

    @Nullable
    public final Integer getStreamId(@NotNull String domain) {
        return this.domainMap.get(domain);
    }

    @Nullable
    public final String getTagStr(int tag) {
        return this.tagMap.get(Integer.valueOf(tag));
    }

    @NotNull
    public final LiveData<Version> getVersionLd() {
        return this._versionLd;
    }

    public final void initViewModel(@NotNull HMDeviceSource deviceSource) {
        this.deviceSource = deviceSource;
    }

    public final void openLogStream(@NotNull String domain) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new c(domain, null), 2, null);
    }

    public final void queryVersion(@NotNull String domainName) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new d(domainName, null), 2, null);
    }

    public final void registerLogCallback() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new e(null), 2, null);
    }

    public final void unRegisterLogCallback() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new f(null), 2, null);
    }
}
