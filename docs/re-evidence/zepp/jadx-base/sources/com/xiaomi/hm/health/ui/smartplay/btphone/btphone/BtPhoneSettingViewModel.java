package com.xiaomi.hm.health.ui.smartplay.btphone.btphone;

import android.app.Application;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.account.utils.SingleLiveEvent;
import com.huami.moving.ui.utils.SportDeviceUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import com.loc.z;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneDevice;
import com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.AuthStatus;
import com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.IController;
import com.xiaomi.hm.health.utils.ex.LiveDataExKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 V2\u00020\u00012\u00020\u0002:\u0001VB\u000f\u0012\u0006\u0010S\u001a\u00020R¢\u0006\u0004\bT\u0010UJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0013\u0010\u0005\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\nJ\u001b\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\nJ#\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0006J\u0012\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0007H\u0002J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u000e\u0010\u0019\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u001b\u001a\u00020\u000fJ\u0006\u0010\u001c\u001a\u00020\u0003J\u0006\u0010\u001d\u001a\u00020\u0003J\u0013\u0010\u001e\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0006J\u0013\u0010\u001f\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0006J\u0013\u0010 \u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b \u0010\u0006J\u001b\u0010!\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0010\u0010%\u001a\u00020\u00032\u0006\u0010$\u001a\u00020#H\u0016J\u0013\u0010&\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b&\u0010\u0006J\u0013\u0010'\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b'\u0010\u0006J\u0013\u0010(\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b(\u0010\u0006J\u0013\u0010)\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b)\u0010\u0006J\u0010\u0010*\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010+\u001a\u00020\u0003H\u0014J\u0006\u0010,\u001a\u00020\u0003J\u0006\u0010-\u001a\u00020\u0003J)\u00102\u001a\u00020\u00032!\u00101\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00030.R\u001f\u00107\u001a\b\u0012\u0004\u0012\u00020\u0007038\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u00106R!\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0007088\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u00109\u001a\u0004\b:\u0010;R\"\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010>R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010F\u001a\u00020D8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010ER\u001f\u0010H\u001a\b\u0012\u0004\u0012\u00020D038\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\bG\u00106R\u001c\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00030I8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010JR\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010LR!\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0007038\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u00104\u001a\u0004\bM\u00106R\u0016\u0010Q\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010P\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006W"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/btphone/BtPhoneSettingViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/IController;", "", "g", "f", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "enable", "e", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "wantTo", "c", "delayEnable", "", "delayTime", hl.k, "(ZILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "h", "local", "i", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/AuthStatus;", "authStatus", "b", "enableAlertDelay", "setAlertDelayTime", "getAlertDelayTime", "resetOperationResult", "giveUpPair", "open", "restore", "close", "updateAuthStatus", "(Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/AuthStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/IController$IListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "needShow", "supportShowByCondition", "needConditionShow", "conditionShow", "setDeviceEnable", "onCleared", "checkFunctionNormal", "goToPairGuild", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "callback", "queryBtPhoneStatus", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/MutableLiveData;", "getLoadingDialogLiveData", "()Landroidx/lifecycle/MutableLiveData;", "loadingDialogLiveData", "Lcom/huami/account/utils/SingleLiveEvent;", "Lcom/huami/account/utils/SingleLiveEvent;", "getShowPairDialogLiveData", "()Lcom/huami/account/utils/SingleLiveEvent;", "showPairDialogLiveData", "Lkotlin/Pair;", "Lkotlin/Pair;", "pairStatus", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/btphone/BtPhoneSettingRepo;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/ui/smartplay/btphone/btphone/BtPhoneSettingRepo;", "btPhoneNetRepo", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/btphone/BtPhoneSettingData;", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/btphone/BtPhoneSettingData;", "btPhoneSetting", "getBtPhoneSettingLiveData", "btPhoneSettingLiveData", "Lkotlinx/coroutines/CompletableDeferred;", "Lkotlinx/coroutines/CompletableDeferred;", "waitForInitBlock", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/IController$IListener;", "getOperateResultLiveData", "operateResultLiveData", z.j, "Z", "needCheckPairStatus", "Landroid/app/Application;", "app", "<init>", "(Landroid/app/Application;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class BtPhoneSettingViewModel extends AndroidViewModel implements IController {

    @NotNull
    private static final String k = "BtPhoneSettingViewModel";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> loadingDialogLiveData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SingleLiveEvent<Boolean> showPairDialogLiveData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private Pair<Boolean, Boolean> pairStatus;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final BtPhoneSettingRepo btPhoneNetRepo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final BtPhoneSettingData btPhoneSetting;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<BtPhoneSettingData> btPhoneSettingLiveData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final CompletableDeferred<Unit> waitForInitBlock;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private IController.IListener listener;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> operateResultLiveData;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean needCheckPairStatus;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.btphone.BtPhoneSettingViewModel", f = "BtPhoneSettingViewModel.kt", i = {0, 0, 0, 1}, l = {142, 144}, m = "adjustSetting", n = {"this", "userSetting", "enable", "this"}, s = {"L$0", "L$1", "Z$0", "L$0"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public Object b;
        public boolean c;
        public /* synthetic */ Object d;
        public int f;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return BtPhoneSettingViewModel.this.a(false, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.btphone.BtPhoneSettingViewModel", f = "BtPhoneSettingViewModel.kt", i = {0}, l = {268}, m = "close", n = {"this"}, s = {"L$0"})
    public static final class b extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return BtPhoneSettingViewModel.this.close(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.btphone.BtPhoneSettingViewModel", f = "BtPhoneSettingViewModel.kt", i = {0, 1, 2, 3}, l = {TypedValues.AttributesType.TYPE_PATH_ROTATE, 322, SportDeviceUtils.SOURCE_ZURICH, 328}, m = "conditionShow", n = {"this", "this", "this", "this"}, s = {"L$0", "L$0", "L$0", "L$0"})
    public static final class c extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return BtPhoneSettingViewModel.this.conditionShow(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "condition show";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "condition show result: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "conditionShow prepare result: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "enable alert delay, enable: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.btphone.BtPhoneSettingViewModel", f = "BtPhoneSettingViewModel.kt", i = {0, 0}, l = {154}, m = "isCurrentStatusSame", n = {"this", "wantTo"}, s = {"L$0", "Z$0"})
    public static final class h extends ContinuationImpl {
        public Object a;
        public boolean b;
        public /* synthetic */ Object c;
        public int e;

        public h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return BtPhoneSettingViewModel.this.c(false, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.btphone.BtPhoneSettingViewModel", f = "BtPhoneSettingViewModel.kt", i = {0, 1, 2, 2}, l = {294, 296, 299}, m = "needConditionShow", n = {"this", "this", "this", "btConnected"}, s = {"L$0", "L$0", "L$0", "Z$0"})
    public static final class i extends ContinuationImpl {
        public Object a;
        public boolean b;
        public /* synthetic */ Object c;
        public int e;

        public i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return BtPhoneSettingViewModel.this.needConditionShow(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "needConditionShow judge pair status: " + BtPhoneSettingViewModel.this.pairStatus;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.btphone.BtPhoneSettingViewModel", f = "BtPhoneSettingViewModel.kt", i = {0, 1}, l = {256, 256}, m = "open", n = {"this", "this"}, s = {"L$0", "L$0"})
    public static final class k extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return BtPhoneSettingViewModel.this.open(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.btphone.BtPhoneSettingViewModel", f = "BtPhoneSettingViewModel.kt", i = {0, 0, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5}, l = {94, 96, 101, 104, 112, 124}, m = "openBtPhone", n = {"this", "enable", "this", "enable", "this", "enable", "result", "this", "enable", "result", "this", "opSuccess", "this"}, s = {"L$0", "Z$0", "L$0", "Z$0", "L$0", "Z$0", "I$0", "L$0", "Z$0", "I$0", "L$0", "I$0", "L$0"})
    public static final class l extends ContinuationImpl {
        public Object a;
        public boolean b;
        public int c;
        public /* synthetic */ Object d;
        public int f;

        public l(Continuation<? super l> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return BtPhoneSettingViewModel.this.e(false, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "try to " + (this.a ? "enable" : WatchFaceApi.CUSTOMIZABLE_DISABLE) + " bt phone";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(boolean z, boolean z2) {
            super(0);
            this.a = z;
            this.b = z2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "user want to " + (this.a ? "enable" : WatchFaceApi.CUSTOMIZABLE_DISABLE) + " btPhoneand result: " + this.b + "; ";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "prepare result: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.btphone.BtPhoneSettingViewModel$queryBtPhoneStatus$1$1", f = "BtPhoneSettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class p extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Function1<Boolean, Unit> b;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public p(Function1<? super Boolean, Unit> function1, boolean z, Continuation<? super p> continuation) {
            super(2, continuation);
            this.b = function1;
            this.c = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new p(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.b.invoke(Boxing.boxBoolean(this.c));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.btphone.BtPhoneSettingViewModel", f = "BtPhoneSettingViewModel.kt", i = {}, l = {88}, m = "refreshPairStatus", n = {}, s = {})
    public static final class q extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public q(Continuation<? super q> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return BtPhoneSettingViewModel.this.f(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.btphone.BtPhoneSettingViewModel", f = "BtPhoneSettingViewModel.kt", i = {}, l = {219}, m = "resetBtPhoneDelayTime", n = {}, s = {})
    public static final class r extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public r(Continuation<? super r> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return BtPhoneSettingViewModel.this.h(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "resetBtPhoneDelayTime result: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.btphone.BtPhoneSettingViewModel", f = "BtPhoneSettingViewModel.kt", i = {0, 0, 0}, l = {193}, m = "setAlertDelayTimeInner", n = {"this", "delayEnable", "delayTime"}, s = {"L$0", "Z$0", "I$0"})
    public static final class t extends ContinuationImpl {
        public Object a;
        public boolean b;
        public int c;
        public /* synthetic */ Object d;
        public int f;

        public t(Continuation<? super t> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return BtPhoneSettingViewModel.this.k(false, 0, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(int i, boolean z) {
            super(0);
            this.a = i;
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "set device delay time: " + this.a + " and result: " + this.b;
        }
    }

    public BtPhoneSettingViewModel(@NotNull Application application) {
        super(application);
        this.loadingDialogLiveData = new MutableLiveData<>();
        this.showPairDialogLiveData = new SingleLiveEvent<>();
        Boolean bool = Boolean.FALSE;
        this.pairStatus = new Pair<>(bool, bool);
        this.btPhoneNetRepo = new BtPhoneSettingRepo();
        this.btPhoneSetting = new BtPhoneSettingData(false, false, null, null, 15, null);
        this.btPhoneSettingLiveData = new MutableLiveData<>();
        this.waitForInitBlock = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.operateResultLiveData = new MutableLiveData<>();
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new BtPhoneSettingViewModel$special$$inlined$safeLaunch$1(null, this), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x0090  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(boolean z, Continuation<? super Unit> continuation) {
        a aVar;
        BtPhonePropertyData userSetting;
        BtPhoneSettingViewModel btPhoneSettingViewModel;
        BtPhoneSettingViewModel btPhoneSettingViewModel2;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.f = i2 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objK = aVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = aVar.f;
        if (i3 != 0) {
            if (i3 == 1) {
                z = aVar.c;
                userSetting = (BtPhonePropertyData) aVar.b;
                btPhoneSettingViewModel = (BtPhoneSettingViewModel) aVar.a;
                ResultKt.throwOnFailure(objK);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                btPhoneSettingViewModel2 = (BtPhoneSettingViewModel) aVar.a;
                ResultKt.throwOnFailure(objK);
            }
            if (((Boolean) objK).booleanValue()) {
                j(btPhoneSettingViewModel2, false, 1, null);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objK);
        userSetting = this.btPhoneSetting.getUserSetting();
        this.btPhoneSetting.getUserSetting().setEnable(z);
        j(this, false, 1, null);
        aVar.a = this;
        aVar.b = userSetting;
        aVar.c = z;
        aVar.f = 1;
        if (BtPhoneDevice.showContact(z, aVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        btPhoneSettingViewModel = this;
        BtPhoneDeviceLifeCycle.INSTANCE.cacheBtPhoneEnable(z);
        boolean delayEnable = userSetting.getDelayEnable();
        int delayTime = userSetting.getDelayTime();
        aVar.a = btPhoneSettingViewModel;
        aVar.b = null;
        aVar.f = 2;
        objK = btPhoneSettingViewModel.k(delayEnable, delayTime, aVar);
        if (objK == coroutine_suspended) {
            return coroutine_suspended;
        }
        btPhoneSettingViewModel2 = btPhoneSettingViewModel;
        if (((Boolean) objK).booleanValue()) {
            j(btPhoneSettingViewModel2, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    private final void b(AuthStatus authStatus) {
        AuthStatus authStatus2 = this.btPhoneSetting.getAuthStatus();
        authStatus2.setContactPermissionEnabled(authStatus.getContactPermissionEnabled());
        authStatus2.setPhonePermissionEnabled(authStatus.getPhonePermissionEnabled());
        authStatus2.setReadPhoneCallLogEnable(authStatus.getReadPhoneCallLogEnable());
        LiveDataExKt.put(this.btPhoneSettingLiveData, this.btPhoneSetting);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(boolean z, Continuation<? super Boolean> continuation) {
        h hVar;
        BtPhoneSettingViewModel btPhoneSettingViewModel;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i2 = hVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.e = i2 - Integer.MIN_VALUE;
            } else {
                hVar = new h(continuation);
            }
        } else {
            hVar = new h(continuation);
        }
        Object objIsBtPhoneEnabled = hVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = hVar.e;
        boolean z2 = true;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objIsBtPhoneEnabled);
            BtPhoneDevice btPhoneDevice = BtPhoneDevice.INSTANCE;
            hVar.a = this;
            hVar.b = z;
            hVar.e = 1;
            objIsBtPhoneEnabled = btPhoneDevice.isBtPhoneEnabled(hVar);
            if (objIsBtPhoneEnabled == coroutine_suspended) {
                return coroutine_suspended;
            }
            btPhoneSettingViewModel = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = hVar.b;
            btPhoneSettingViewModel = (BtPhoneSettingViewModel) hVar.a;
            ResultKt.throwOnFailure(objIsBtPhoneEnabled);
        }
        boolean zBooleanValue = ((Boolean) objIsBtPhoneEnabled).booleanValue();
        boolean zBooleanValue2 = btPhoneSettingViewModel.pairStatus.getSecond().booleanValue();
        if (!z ? zBooleanValue != z : !zBooleanValue2 || zBooleanValue != z) {
            z2 = false;
        }
        return Boxing.boxBoolean(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x00a6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x00b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:36:0x00f1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:41:0x0102  */
    /* JADX WARN: Code duplicated, block: B:43:0x0113 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x0127  */
    /* JADX WARN: Code duplicated, block: B:49:0x0134 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x0135  */
    /* JADX WARN: Code duplicated, block: B:52:0x0138  */
    /* JADX WARN: Code duplicated, block: B:54:0x013b  */
    /* JADX WARN: Code duplicated, block: B:58:0x015d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v8 */
    public final Object e(boolean z, Continuation<? super Boolean> continuation) {
        l lVar;
        BtPhoneSettingViewModel btPhoneSettingViewModel;
        boolean z2;
        BtPhoneSettingViewModel btPhoneSettingViewModel2;
        Object objC;
        BtPhoneSettingViewModel btPhoneSettingViewModel3;
        int i2;
        boolean z3;
        int i3;
        ?? r10;
        BtPhoneSettingViewModel btPhoneSettingViewModel4;
        ?? r11;
        ?? r12;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i4 = lVar.f;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                lVar.f = i4 - Integer.MIN_VALUE;
            } else {
                lVar = new l(continuation);
            }
        } else {
            lVar = new l(continuation);
        }
        Object objPrepareForPair = lVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        switch (lVar.f) {
            case 0:
                ResultKt.throwOnFailure(objPrepareForPair);
                HMLog.info(k, new m(z));
                LiveDataExKt.put(getLoadingDialogLiveData(), Boxing.boxBoolean(true));
                CompletableDeferred<Unit> completableDeferred = this.waitForInitBlock;
                lVar.a = this;
                lVar.b = z;
                lVar.f = 1;
                if (completableDeferred.await(lVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                btPhoneSettingViewModel = this;
                lVar.a = btPhoneSettingViewModel;
                lVar.b = z;
                lVar.f = 2;
                if (btPhoneSettingViewModel.f(lVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                z2 = z;
                btPhoneSettingViewModel2 = btPhoneSettingViewModel;
                if (btPhoneSettingViewModel2.pairStatus.getFirst().booleanValue() && z2) {
                    BtPhoneDevice btPhoneDevice = BtPhoneDevice.INSTANCE;
                    lVar.a = btPhoneSettingViewModel2;
                    lVar.f = 6;
                    objPrepareForPair = btPhoneDevice.prepareForPair(lVar);
                    if (objPrepareForPair == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    HMLog.info(k, new o(((Boolean) objPrepareForPair).booleanValue()));
                    LiveDataExKt.put(btPhoneSettingViewModel2.getShowPairDialogLiveData(), Boxing.boxBoolean(true));
                    i3 = 1;
                    LiveDataExKt.put(btPhoneSettingViewModel2.getLoadingDialogLiveData(), Boxing.boxBoolean(false));
                    return Boxing.boxBoolean(i3 != 0);
                }
                lVar.a = btPhoneSettingViewModel2;
                lVar.b = z2;
                lVar.c = 0;
                lVar.f = 3;
                objC = btPhoneSettingViewModel2.c(z2, lVar);
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
                btPhoneSettingViewModel3 = btPhoneSettingViewModel2;
                i2 = 0;
                z3 = z2;
                objPrepareForPair = objC;
                if (((Boolean) objPrepareForPair).booleanValue()) {
                    i3 = i2;
                    r10 = 1;
                } else {
                    BtPhoneDevice btPhoneDevice2 = BtPhoneDevice.INSTANCE;
                    lVar.a = btPhoneSettingViewModel3;
                    lVar.b = z3;
                    lVar.c = i2;
                    lVar.f = 4;
                    objPrepareForPair = btPhoneDevice2.enableBtPhone(z3, lVar);
                    if (objPrepareForPair == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    boolean zBooleanValue = ((Boolean) objPrepareForPair).booleanValue();
                    i3 = i2;
                    r10 = zBooleanValue;
                }
                HMLog.info(k, new n(z3, r10));
                if (r10 != 0) {
                    lVar.a = btPhoneSettingViewModel3;
                    lVar.c = r10;
                    lVar.f = 5;
                    if (btPhoneSettingViewModel3.a(z3, lVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    btPhoneSettingViewModel4 = btPhoneSettingViewModel3;
                    r12 = r10;
                    i3 = 1;
                    r11 = r12;
                } else {
                    btPhoneSettingViewModel4 = btPhoneSettingViewModel3;
                }
                if (r11 == 0) {
                    r11 = r10;
                    LiveDataExKt.put(btPhoneSettingViewModel4.getOperateResultLiveData(), Boxing.boxBoolean(false));
                }
                r11 = r10;
                LiveDataExKt.put(btPhoneSettingViewModel4.getBtPhoneSettingLiveData(), btPhoneSettingViewModel4.btPhoneSetting);
                btPhoneSettingViewModel2 = btPhoneSettingViewModel4;
                LiveDataExKt.put(btPhoneSettingViewModel2.getLoadingDialogLiveData(), Boxing.boxBoolean(false));
                return Boxing.boxBoolean(i3 != 0);
            case 1:
                z = lVar.b;
                btPhoneSettingViewModel = (BtPhoneSettingViewModel) lVar.a;
                ResultKt.throwOnFailure(objPrepareForPair);
                lVar.a = btPhoneSettingViewModel;
                lVar.b = z;
                lVar.f = 2;
                if (btPhoneSettingViewModel.f(lVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                z2 = z;
                btPhoneSettingViewModel2 = btPhoneSettingViewModel;
                if (btPhoneSettingViewModel2.pairStatus.getFirst().booleanValue()) {
                }
                lVar.a = btPhoneSettingViewModel2;
                lVar.b = z2;
                lVar.c = 0;
                lVar.f = 3;
                objC = btPhoneSettingViewModel2.c(z2, lVar);
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
                btPhoneSettingViewModel3 = btPhoneSettingViewModel2;
                i2 = 0;
                z3 = z2;
                objPrepareForPair = objC;
                if (((Boolean) objPrepareForPair).booleanValue()) {
                    i3 = i2;
                    r10 = 1;
                } else {
                    BtPhoneDevice btPhoneDevice3 = BtPhoneDevice.INSTANCE;
                    lVar.a = btPhoneSettingViewModel3;
                    lVar.b = z3;
                    lVar.c = i2;
                    lVar.f = 4;
                    objPrepareForPair = btPhoneDevice3.enableBtPhone(z3, lVar);
                    if (objPrepareForPair == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    boolean zBooleanValue2 = ((Boolean) objPrepareForPair).booleanValue();
                    i3 = i2;
                    r10 = zBooleanValue2;
                }
                HMLog.info(k, new n(z3, r10));
                if (r10 != 0) {
                    lVar.a = btPhoneSettingViewModel3;
                    lVar.c = r10;
                    lVar.f = 5;
                    if (btPhoneSettingViewModel3.a(z3, lVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    btPhoneSettingViewModel4 = btPhoneSettingViewModel3;
                    r12 = r10;
                    i3 = 1;
                    r11 = r12;
                } else {
                    btPhoneSettingViewModel4 = btPhoneSettingViewModel3;
                }
                if (r11 == 0) {
                    r11 = r10;
                    LiveDataExKt.put(btPhoneSettingViewModel4.getOperateResultLiveData(), Boxing.boxBoolean(false));
                }
                r11 = r10;
                LiveDataExKt.put(btPhoneSettingViewModel4.getBtPhoneSettingLiveData(), btPhoneSettingViewModel4.btPhoneSetting);
                btPhoneSettingViewModel2 = btPhoneSettingViewModel4;
                LiveDataExKt.put(btPhoneSettingViewModel2.getLoadingDialogLiveData(), Boxing.boxBoolean(false));
                return Boxing.boxBoolean(i3 != 0);
            case 2:
                z = lVar.b;
                btPhoneSettingViewModel = (BtPhoneSettingViewModel) lVar.a;
                ResultKt.throwOnFailure(objPrepareForPair);
                z2 = z;
                btPhoneSettingViewModel2 = btPhoneSettingViewModel;
                if (btPhoneSettingViewModel2.pairStatus.getFirst().booleanValue()) {
                }
                lVar.a = btPhoneSettingViewModel2;
                lVar.b = z2;
                lVar.c = 0;
                lVar.f = 3;
                objC = btPhoneSettingViewModel2.c(z2, lVar);
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
                btPhoneSettingViewModel3 = btPhoneSettingViewModel2;
                i2 = 0;
                z3 = z2;
                objPrepareForPair = objC;
                if (((Boolean) objPrepareForPair).booleanValue()) {
                    i3 = i2;
                    r10 = 1;
                } else {
                    BtPhoneDevice btPhoneDevice4 = BtPhoneDevice.INSTANCE;
                    lVar.a = btPhoneSettingViewModel3;
                    lVar.b = z3;
                    lVar.c = i2;
                    lVar.f = 4;
                    objPrepareForPair = btPhoneDevice4.enableBtPhone(z3, lVar);
                    if (objPrepareForPair == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    boolean zBooleanValue3 = ((Boolean) objPrepareForPair).booleanValue();
                    i3 = i2;
                    r10 = zBooleanValue3;
                }
                HMLog.info(k, new n(z3, r10));
                if (r10 != 0) {
                    lVar.a = btPhoneSettingViewModel3;
                    lVar.c = r10;
                    lVar.f = 5;
                    if (btPhoneSettingViewModel3.a(z3, lVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    btPhoneSettingViewModel4 = btPhoneSettingViewModel3;
                    r12 = r10;
                    i3 = 1;
                    r11 = r12;
                } else {
                    btPhoneSettingViewModel4 = btPhoneSettingViewModel3;
                }
                if (r11 == 0) {
                    r11 = r10;
                    LiveDataExKt.put(btPhoneSettingViewModel4.getOperateResultLiveData(), Boxing.boxBoolean(false));
                }
                r11 = r10;
                LiveDataExKt.put(btPhoneSettingViewModel4.getBtPhoneSettingLiveData(), btPhoneSettingViewModel4.btPhoneSetting);
                btPhoneSettingViewModel2 = btPhoneSettingViewModel4;
                LiveDataExKt.put(btPhoneSettingViewModel2.getLoadingDialogLiveData(), Boxing.boxBoolean(false));
                return Boxing.boxBoolean(i3 != 0);
            case 3:
                i2 = lVar.c;
                z3 = lVar.b;
                btPhoneSettingViewModel3 = (BtPhoneSettingViewModel) lVar.a;
                ResultKt.throwOnFailure(objPrepareForPair);
                if (((Boolean) objPrepareForPair).booleanValue()) {
                    i3 = i2;
                    r10 = 1;
                } else {
                    BtPhoneDevice btPhoneDevice5 = BtPhoneDevice.INSTANCE;
                    lVar.a = btPhoneSettingViewModel3;
                    lVar.b = z3;
                    lVar.c = i2;
                    lVar.f = 4;
                    objPrepareForPair = btPhoneDevice5.enableBtPhone(z3, lVar);
                    if (objPrepareForPair == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    boolean zBooleanValue4 = ((Boolean) objPrepareForPair).booleanValue();
                    i3 = i2;
                    r10 = zBooleanValue4;
                }
                HMLog.info(k, new n(z3, r10));
                if (r10 != 0) {
                    lVar.a = btPhoneSettingViewModel3;
                    lVar.c = r10;
                    lVar.f = 5;
                    if (btPhoneSettingViewModel3.a(z3, lVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    btPhoneSettingViewModel4 = btPhoneSettingViewModel3;
                    r12 = r10;
                    i3 = 1;
                    r11 = r12;
                } else {
                    btPhoneSettingViewModel4 = btPhoneSettingViewModel3;
                }
                if (r11 == 0) {
                    r11 = r10;
                    LiveDataExKt.put(btPhoneSettingViewModel4.getOperateResultLiveData(), Boxing.boxBoolean(false));
                }
                r11 = r10;
                LiveDataExKt.put(btPhoneSettingViewModel4.getBtPhoneSettingLiveData(), btPhoneSettingViewModel4.btPhoneSetting);
                btPhoneSettingViewModel2 = btPhoneSettingViewModel4;
                LiveDataExKt.put(btPhoneSettingViewModel2.getLoadingDialogLiveData(), Boxing.boxBoolean(false));
                return Boxing.boxBoolean(i3 != 0);
            case 4:
                i2 = lVar.c;
                z3 = lVar.b;
                btPhoneSettingViewModel3 = (BtPhoneSettingViewModel) lVar.a;
                ResultKt.throwOnFailure(objPrepareForPair);
                boolean zBooleanValue5 = ((Boolean) objPrepareForPair).booleanValue();
                i3 = i2;
                r10 = zBooleanValue5;
                HMLog.info(k, new n(z3, r10));
                if (r10 != 0) {
                    lVar.a = btPhoneSettingViewModel3;
                    lVar.c = r10;
                    lVar.f = 5;
                    if (btPhoneSettingViewModel3.a(z3, lVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    btPhoneSettingViewModel4 = btPhoneSettingViewModel3;
                    r12 = r10;
                    i3 = 1;
                    r11 = r12;
                } else {
                    btPhoneSettingViewModel4 = btPhoneSettingViewModel3;
                }
                if (r11 == 0) {
                    r11 = r10;
                    LiveDataExKt.put(btPhoneSettingViewModel4.getOperateResultLiveData(), Boxing.boxBoolean(false));
                }
                r11 = r10;
                LiveDataExKt.put(btPhoneSettingViewModel4.getBtPhoneSettingLiveData(), btPhoneSettingViewModel4.btPhoneSetting);
                btPhoneSettingViewModel2 = btPhoneSettingViewModel4;
                LiveDataExKt.put(btPhoneSettingViewModel2.getLoadingDialogLiveData(), Boxing.boxBoolean(false));
                return Boxing.boxBoolean(i3 != 0);
            case 5:
                int i5 = lVar.c;
                btPhoneSettingViewModel4 = (BtPhoneSettingViewModel) lVar.a;
                ResultKt.throwOnFailure(objPrepareForPair);
                r12 = i5;
                i3 = 1;
                r11 = r12;
                if (r11 == 0) {
                    r11 = r10;
                    LiveDataExKt.put(btPhoneSettingViewModel4.getOperateResultLiveData(), Boxing.boxBoolean(false));
                }
                r11 = r10;
                LiveDataExKt.put(btPhoneSettingViewModel4.getBtPhoneSettingLiveData(), btPhoneSettingViewModel4.btPhoneSetting);
                btPhoneSettingViewModel2 = btPhoneSettingViewModel4;
                LiveDataExKt.put(btPhoneSettingViewModel2.getLoadingDialogLiveData(), Boxing.boxBoolean(false));
                return Boxing.boxBoolean(i3 != 0);
            case 6:
                btPhoneSettingViewModel2 = (BtPhoneSettingViewModel) lVar.a;
                ResultKt.throwOnFailure(objPrepareForPair);
                HMLog.info(k, new o(((Boolean) objPrepareForPair).booleanValue()));
                LiveDataExKt.put(btPhoneSettingViewModel2.getShowPairDialogLiveData(), Boxing.boxBoolean(true));
                i3 = 1;
                LiveDataExKt.put(btPhoneSettingViewModel2.getLoadingDialogLiveData(), Boxing.boxBoolean(false));
                return Boxing.boxBoolean(i3 != 0);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(Continuation<? super Unit> continuation) {
        q qVar;
        BtPhoneSettingViewModel btPhoneSettingViewModel;
        if (continuation instanceof q) {
            qVar = (q) continuation;
            int i2 = qVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qVar.d = i2 - Integer.MIN_VALUE;
            } else {
                qVar = new q(continuation);
            }
        } else {
            qVar = new q(continuation);
        }
        Object pairStatus = qVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = qVar.d;
        if (i3 == 0) {
            ResultKt.throwOnFailure(pairStatus);
            BtPhoneDevice btPhoneDevice = BtPhoneDevice.INSTANCE;
            qVar.a = this;
            qVar.d = 1;
            pairStatus = btPhoneDevice.getPairStatus(qVar);
            if (pairStatus == coroutine_suspended) {
                return coroutine_suspended;
            }
            btPhoneSettingViewModel = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            btPhoneSettingViewModel = (BtPhoneSettingViewModel) qVar.a;
            ResultKt.throwOnFailure(pairStatus);
        }
        btPhoneSettingViewModel.pairStatus = (Pair) pairStatus;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        BtPhonePropertyData btPhoneSetting = this.btPhoneNetRepo.getBtPhoneSetting();
        BtPhonePropertyData userSetting = this.btPhoneSetting.getUserSetting();
        userSetting.setEnable(btPhoneSetting.getEnable());
        userSetting.setDelayEnable(btPhoneSetting.getDelayEnable());
        userSetting.setDelayTime(btPhoneSetting.getDelayTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(Continuation<? super Boolean> continuation) {
        r rVar;
        if (continuation instanceof r) {
            rVar = (r) continuation;
            int i2 = rVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rVar.c = i2 - Integer.MIN_VALUE;
            } else {
                rVar = new r(continuation);
            }
        } else {
            rVar = new r(continuation);
        }
        Object btPhoneDelay = rVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = rVar.c;
        if (i3 == 0) {
            ResultKt.throwOnFailure(btPhoneDelay);
            int iNeedDelayTime = this.btPhoneSetting.getUserSetting().needDelayTime();
            g();
            if (iNeedDelayTime == this.btPhoneSetting.getUserSetting().needDelayTime()) {
                return Boxing.boxBoolean(true);
            }
            BtPhoneDevice btPhoneDevice = BtPhoneDevice.INSTANCE;
            int delayTime = this.btPhoneSetting.getUserSetting().getDelayTime();
            rVar.c = 1;
            btPhoneDelay = btPhoneDevice.setBtPhoneDelay(delayTime, rVar);
            if (btPhoneDelay == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(btPhoneDelay);
        }
        boolean zBooleanValue = ((Boolean) btPhoneDelay).booleanValue();
        HMLog.info(k, new s(zBooleanValue));
        return Boxing.boxBoolean(zBooleanValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(boolean local) {
        this.btPhoneNetRepo.saveBtPhoneSetting(this.btPhoneSetting.getUserSetting());
        if (local) {
            return;
        }
        this.btPhoneNetRepo.uploadSettings();
    }

    public static /* synthetic */ void j(BtPhoneSettingViewModel btPhoneSettingViewModel, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        btPhoneSettingViewModel.i(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(boolean z, int i2, Continuation<? super Boolean> continuation) {
        t tVar;
        BtPhoneSettingViewModel btPhoneSettingViewModel;
        if (continuation instanceof t) {
            tVar = (t) continuation;
            int i3 = tVar.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tVar.f = i3 - Integer.MIN_VALUE;
            } else {
                tVar = new t(continuation);
            }
        } else {
            tVar = new t(continuation);
        }
        Object btPhoneDelay = tVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i4 = tVar.f;
        if (i4 == 0) {
            ResultKt.throwOnFailure(btPhoneDelay);
            int i5 = z ? i2 : 0;
            BtPhoneDevice btPhoneDevice = BtPhoneDevice.INSTANCE;
            tVar.a = this;
            tVar.b = z;
            tVar.c = i2;
            tVar.f = 1;
            btPhoneDelay = btPhoneDevice.setBtPhoneDelay(i5, tVar);
            if (btPhoneDelay == coroutine_suspended) {
                return coroutine_suspended;
            }
            btPhoneSettingViewModel = this;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = tVar.c;
            z = tVar.b;
            btPhoneSettingViewModel = (BtPhoneSettingViewModel) tVar.a;
            ResultKt.throwOnFailure(btPhoneDelay);
        }
        boolean zBooleanValue = ((Boolean) btPhoneDelay).booleanValue();
        HMLog.info(k, new u(i2, zBooleanValue));
        if (zBooleanValue) {
            btPhoneSettingViewModel.btPhoneSetting.getUserSetting().setDelayTime(i2);
            btPhoneSettingViewModel.btPhoneSetting.getUserSetting().setDelayEnable(z);
        } else {
            LiveDataExKt.put(btPhoneSettingViewModel.getOperateResultLiveData(), Boxing.boxBoolean(false));
        }
        LiveDataExKt.put(btPhoneSettingViewModel.getBtPhoneSettingLiveData(), btPhoneSettingViewModel.btPhoneSetting);
        return Boxing.boxBoolean(zBooleanValue);
    }

    public final void checkFunctionNormal() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new BtPhoneSettingViewModel$checkFunctionNormal$$inlined$safeLaunch$1(null, this), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.IController
    @Nullable
    public Object close(@NotNull Continuation<? super Boolean> continuation) {
        b bVar;
        BtPhoneSettingViewModel btPhoneSettingViewModel;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.d = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objE = bVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = bVar.d;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objE);
            bVar.a = this;
            bVar.d = 1;
            objE = e(false, bVar);
            if (objE == coroutine_suspended) {
                return coroutine_suspended;
            }
            btPhoneSettingViewModel = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            btPhoneSettingViewModel = (BtPhoneSettingViewModel) bVar.a;
            ResultKt.throwOnFailure(objE);
        }
        boolean zBooleanValue = ((Boolean) objE).booleanValue();
        if (!zBooleanValue) {
            LiveDataExKt.put(btPhoneSettingViewModel.getOperateResultLiveData(), Boxing.boxBoolean(false));
        }
        return Boxing.boxBoolean(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.IController
    @Nullable
    public Object conditionShow(@NotNull Continuation<? super Boolean> continuation) {
        c cVar;
        BtPhoneSettingViewModel btPhoneSettingViewModel;
        boolean zBooleanValue;
        BtPhoneSettingViewModel btPhoneSettingViewModel2;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i2 = cVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.d = i2 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objC = cVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = cVar.d;
        if (i3 != 0) {
            if (i3 == 1) {
                btPhoneSettingViewModel = (BtPhoneSettingViewModel) cVar.a;
                ResultKt.throwOnFailure(objC);
            } else {
                if (i3 == 2) {
                    btPhoneSettingViewModel = (BtPhoneSettingViewModel) cVar.a;
                    ResultKt.throwOnFailure(objC);
                    HMLog.info(k, new f(((Boolean) objC).booleanValue()));
                    BtPhoneDevice btPhoneDevice = BtPhoneDevice.INSTANCE;
                    cVar.a = btPhoneSettingViewModel;
                    cVar.d = 3;
                    objC = btPhoneDevice.enableBtPhone(true, cVar);
                    if (objC == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    zBooleanValue = ((Boolean) objC).booleanValue();
                    HMLog.info(k, new e(zBooleanValue));
                    if (zBooleanValue) {
                        cVar.a = btPhoneSettingViewModel;
                        cVar.d = 4;
                        if (btPhoneSettingViewModel.a(true, cVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        btPhoneSettingViewModel2 = btPhoneSettingViewModel;
                    }
                    btPhoneSettingViewModel.btPhoneSetting.setBtConnected(btPhoneSettingViewModel.pairStatus.getSecond().booleanValue());
                    LiveDataExKt.put(btPhoneSettingViewModel.getBtPhoneSettingLiveData(), btPhoneSettingViewModel.btPhoneSetting);
                    LiveDataExKt.put(btPhoneSettingViewModel.getLoadingDialogLiveData(), Boxing.boxBoolean(false));
                    return Boxing.boxBoolean(true);
                }
                if (i3 == 3) {
                    btPhoneSettingViewModel = (BtPhoneSettingViewModel) cVar.a;
                    ResultKt.throwOnFailure(objC);
                    zBooleanValue = ((Boolean) objC).booleanValue();
                    HMLog.info(k, new e(zBooleanValue));
                    if (zBooleanValue) {
                        cVar.a = btPhoneSettingViewModel;
                        cVar.d = 4;
                        if (btPhoneSettingViewModel.a(true, cVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        btPhoneSettingViewModel2 = btPhoneSettingViewModel;
                    }
                    btPhoneSettingViewModel.btPhoneSetting.setBtConnected(btPhoneSettingViewModel.pairStatus.getSecond().booleanValue());
                    LiveDataExKt.put(btPhoneSettingViewModel.getBtPhoneSettingLiveData(), btPhoneSettingViewModel.btPhoneSetting);
                    LiveDataExKt.put(btPhoneSettingViewModel.getLoadingDialogLiveData(), Boxing.boxBoolean(false));
                    return Boxing.boxBoolean(true);
                }
                if (i3 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                btPhoneSettingViewModel2 = (BtPhoneSettingViewModel) cVar.a;
                ResultKt.throwOnFailure(objC);
            }
            btPhoneSettingViewModel = btPhoneSettingViewModel2;
            btPhoneSettingViewModel.btPhoneSetting.setBtConnected(btPhoneSettingViewModel.pairStatus.getSecond().booleanValue());
            LiveDataExKt.put(btPhoneSettingViewModel.getBtPhoneSettingLiveData(), btPhoneSettingViewModel.btPhoneSetting);
            LiveDataExKt.put(btPhoneSettingViewModel.getLoadingDialogLiveData(), Boxing.boxBoolean(false));
            return Boxing.boxBoolean(true);
        }
        ResultKt.throwOnFailure(objC);
        LiveDataExKt.put(getLoadingDialogLiveData(), Boxing.boxBoolean(true));
        HMLog.info(k, d.a);
        cVar.a = this;
        cVar.d = 1;
        objC = c(true, cVar);
        if (objC == coroutine_suspended) {
            return coroutine_suspended;
        }
        btPhoneSettingViewModel = this;
        if (((Boolean) objC).booleanValue()) {
            zBooleanValue = true;
        } else {
            BtPhoneDevice btPhoneDevice2 = BtPhoneDevice.INSTANCE;
            cVar.a = btPhoneSettingViewModel;
            cVar.d = 2;
            objC = btPhoneDevice2.prepareForPair(cVar);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
            HMLog.info(k, new f(((Boolean) objC).booleanValue()));
            BtPhoneDevice btPhoneDevice3 = BtPhoneDevice.INSTANCE;
            cVar.a = btPhoneSettingViewModel;
            cVar.d = 3;
            objC = btPhoneDevice3.enableBtPhone(true, cVar);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
            zBooleanValue = ((Boolean) objC).booleanValue();
        }
        HMLog.info(k, new e(zBooleanValue));
        if (zBooleanValue) {
            cVar.a = btPhoneSettingViewModel;
            cVar.d = 4;
            if (btPhoneSettingViewModel.a(true, cVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            btPhoneSettingViewModel2 = btPhoneSettingViewModel;
            btPhoneSettingViewModel = btPhoneSettingViewModel2;
        }
        btPhoneSettingViewModel.btPhoneSetting.setBtConnected(btPhoneSettingViewModel.pairStatus.getSecond().booleanValue());
        LiveDataExKt.put(btPhoneSettingViewModel.getBtPhoneSettingLiveData(), btPhoneSettingViewModel.btPhoneSetting);
        LiveDataExKt.put(btPhoneSettingViewModel.getLoadingDialogLiveData(), Boxing.boxBoolean(false));
        return Boxing.boxBoolean(true);
    }

    public final void enableAlertDelay(boolean enable) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new BtPhoneSettingViewModel$enableAlertDelay$$inlined$safeLaunch$1(null, this, enable), 2, null);
    }

    public final int getAlertDelayTime() {
        return this.btPhoneSetting.getUserSetting().getDelayTime();
    }

    @NotNull
    public final MutableLiveData<BtPhoneSettingData> getBtPhoneSettingLiveData() {
        return this.btPhoneSettingLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getLoadingDialogLiveData() {
        return this.loadingDialogLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getOperateResultLiveData() {
        return this.operateResultLiveData;
    }

    @NotNull
    public final SingleLiveEvent<Boolean> getShowPairDialogLiveData() {
        return this.showPairDialogLiveData;
    }

    public final void giveUpPair() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new BtPhoneSettingViewModel$giveUpPair$$inlined$safeLaunch$1(null, this), 2, null);
    }

    public final void goToPairGuild() {
        this.needCheckPairStatus = true;
        LiveDataExKt.put(this.showPairDialogLiveData, null);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0096 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0097  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.IController
    @Nullable
    public Object needConditionShow(@NotNull Continuation<? super Boolean> continuation) {
        i iVar;
        BtPhoneSettingViewModel btPhoneSettingViewModel;
        boolean zBooleanValue;
        Object objNeedShow;
        boolean z;
        BtPhoneSettingViewModel btPhoneSettingViewModel2;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i2 = iVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.e = i2 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        } else {
            iVar = new i(continuation);
        }
        Object obj = iVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = iVar.e;
        if (i3 != 0) {
            if (i3 == 1) {
                btPhoneSettingViewModel = (BtPhoneSettingViewModel) iVar.a;
                ResultKt.throwOnFailure(obj);
            } else if (i3 == 2) {
                btPhoneSettingViewModel = (BtPhoneSettingViewModel) iVar.a;
                ResultKt.throwOnFailure(obj);
                zBooleanValue = btPhoneSettingViewModel.pairStatus.getSecond().booleanValue();
                iVar.a = btPhoneSettingViewModel;
                iVar.b = zBooleanValue;
                iVar.e = 3;
                objNeedShow = btPhoneSettingViewModel.needShow(iVar);
                if (objNeedShow == coroutine_suspended) {
                    return coroutine_suspended;
                }
                z = zBooleanValue;
                obj = objNeedShow;
                btPhoneSettingViewModel2 = btPhoneSettingViewModel;
            } else {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = iVar.b;
                btPhoneSettingViewModel2 = (BtPhoneSettingViewModel) iVar.a;
                ResultKt.throwOnFailure(obj);
            }
            if (!((Boolean) obj).booleanValue() && !z) {
                LiveDataExKt.put(btPhoneSettingViewModel2.getLoadingDialogLiveData(), Boxing.boxBoolean(false));
            }
            return Boxing.boxBoolean(z);
        }
        ResultKt.throwOnFailure(obj);
        LiveDataExKt.put(getLoadingDialogLiveData(), Boxing.boxBoolean(true));
        CompletableDeferred<Unit> completableDeferred = this.waitForInitBlock;
        iVar.a = this;
        iVar.e = 1;
        if (completableDeferred.await(iVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        btPhoneSettingViewModel = this;
        HMLog.info(k, btPhoneSettingViewModel.new j());
        iVar.a = btPhoneSettingViewModel;
        iVar.e = 2;
        if (btPhoneSettingViewModel.f(iVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        zBooleanValue = btPhoneSettingViewModel.pairStatus.getSecond().booleanValue();
        iVar.a = btPhoneSettingViewModel;
        iVar.b = zBooleanValue;
        iVar.e = 3;
        objNeedShow = btPhoneSettingViewModel.needShow(iVar);
        if (objNeedShow == coroutine_suspended) {
            return coroutine_suspended;
        }
        z = zBooleanValue;
        obj = objNeedShow;
        btPhoneSettingViewModel2 = btPhoneSettingViewModel;
        if (!((Boolean) obj).booleanValue()) {
            LiveDataExKt.put(btPhoneSettingViewModel2.getLoadingDialogLiveData(), Boxing.boxBoolean(false));
        }
        return Boxing.boxBoolean(z);
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.IController
    @Nullable
    public Object needShow(@NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(this.btPhoneNetRepo.getBtPhoneSetting().getEnable());
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new BtPhoneSettingViewModel$onCleared$$inlined$safeLaunch$1(null, this), 2, null);
        super.onCleared();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0072  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.IController
    @Nullable
    public Object open(@NotNull Continuation<? super Boolean> continuation) {
        k kVar;
        BtPhoneSettingViewModel btPhoneSettingViewModel;
        BtPhoneSettingViewModel btPhoneSettingViewModel2;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i2 = kVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.d = i2 - Integer.MIN_VALUE;
            } else {
                kVar = new k(continuation);
            }
        } else {
            kVar = new k(continuation);
        }
        Object objH = kVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = kVar.d;
        boolean z = true;
        if (i3 != 0) {
            if (i3 == 1) {
                btPhoneSettingViewModel = (BtPhoneSettingViewModel) kVar.a;
                ResultKt.throwOnFailure(objH);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                btPhoneSettingViewModel2 = (BtPhoneSettingViewModel) kVar.a;
                ResultKt.throwOnFailure(objH);
            }
            if (!((Boolean) objH).booleanValue()) {
                btPhoneSettingViewModel = btPhoneSettingViewModel2;
                btPhoneSettingViewModel2 = btPhoneSettingViewModel;
                z = false;
            }
            if (!z) {
                LiveDataExKt.put(btPhoneSettingViewModel2.getOperateResultLiveData(), Boxing.boxBoolean(false));
            }
            return Boxing.boxBoolean(z);
        }
        ResultKt.throwOnFailure(objH);
        kVar.a = this;
        kVar.d = 1;
        objH = h(kVar);
        if (objH == coroutine_suspended) {
            return coroutine_suspended;
        }
        btPhoneSettingViewModel = this;
        if (((Boolean) objH).booleanValue()) {
            kVar.a = btPhoneSettingViewModel;
            kVar.d = 2;
            objH = btPhoneSettingViewModel.e(true, kVar);
            if (objH == coroutine_suspended) {
                return coroutine_suspended;
            }
            btPhoneSettingViewModel2 = btPhoneSettingViewModel;
            if (!((Boolean) objH).booleanValue()) {
                btPhoneSettingViewModel = btPhoneSettingViewModel2;
                btPhoneSettingViewModel2 = btPhoneSettingViewModel;
                z = false;
            }
        } else {
            btPhoneSettingViewModel2 = btPhoneSettingViewModel;
            z = false;
        }
        if (!z) {
            LiveDataExKt.put(btPhoneSettingViewModel2.getOperateResultLiveData(), Boxing.boxBoolean(false));
        }
        return Boxing.boxBoolean(z);
    }

    public final void queryBtPhoneStatus(@NotNull Function1<? super Boolean, Unit> callback) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new BtPhoneSettingViewModel$queryBtPhoneStatus$$inlined$safeLaunch$1(null, callback), 2, null);
    }

    public final void resetOperationResult() {
        LiveDataExKt.put(this.operateResultLiveData, null);
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.IController
    @Nullable
    public Object restore(@NotNull Continuation<? super Boolean> continuation) {
        return open(continuation);
    }

    public final void setAlertDelayTime(int delayTime) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new BtPhoneSettingViewModel$setAlertDelayTime$$inlined$safeLaunch$1(null, this, delayTime), 2, null);
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.IController
    public void setDeviceEnable(boolean enable) {
        this.btPhoneSetting.setDeviceEnable(enable);
        LiveDataExKt.put(this.btPhoneSettingLiveData, this.btPhoneSetting);
        if (enable) {
            checkFunctionNormal();
        }
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.IController
    public void setListener(@NotNull IController.IListener listener) {
        this.listener = listener;
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.IController
    @Nullable
    public Object supportShowByCondition(@NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(true);
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.IController
    @Nullable
    public Object updateAuthStatus(@NotNull AuthStatus authStatus, @NotNull Continuation<? super Unit> continuation) {
        b(authStatus);
        return Unit.INSTANCE;
    }
}
