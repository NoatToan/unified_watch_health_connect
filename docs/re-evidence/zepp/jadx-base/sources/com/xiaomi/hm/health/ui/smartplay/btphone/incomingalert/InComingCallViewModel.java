package com.xiaomi.hm.health.ui.smartplay.btphone.incomingalert;

import android.app.Application;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.device.feature.unlock.MiuiUnlockAPI;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import com.loc.z;
import com.xiaomi.hm.health.device.service.residentnoti.ResidentNotificationManager;
import com.xiaomi.hm.health.device.service.residentnoti.notify.ResidentNotify;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.ui.smartplay.MiuiAPI;
import com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.AuthStatus;
import com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.IController;
import com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.PhoneAlertAuthChecker;
import com.xiaomi.hm.health.utils.ex.LiveDataExKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 G2\u00020\u00012\u00020\u0002:\u0001GB\u000f\u0012\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bE\u0010FJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\u0003H\u0002J\b\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000f\u001a\u00020\u0003H\u0002J$\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u0012H\u0002J\u000e\u0010\u0016\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0013J\u000e\u0010\u0019\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bJ\u0006\u0010\u001a\u001a\u00020\u0003J\u0006\u0010\u001b\u001a\u00020\u0013J\u0013\u0010\u001c\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001dJ\u001b\u0010 \u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0010\u0010$\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\"H\u0016J\u0013\u0010%\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b%\u0010\u001dJ\u0013\u0010&\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b&\u0010\u001dJ\u0013\u0010'\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b'\u0010\u001dJ\u0013\u0010(\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH\u0016R%\u0010/\u001a\n +*\u0004\u0018\u00010*0*8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010.R\u0016\u00102\u001a\u0002008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00101R\u001f\u00107\u001a\b\u0012\u0004\u0012\u000200038\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u00104\u001a\u0004\b5\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001d\u0010>\u001a\u00020\b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010,\u001a\u0004\b<\u0010=R\u001d\u0010@\u001a\u00020\b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010,\u001a\u0004\b?\u0010=R!\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b038\u0006@\u0006¢\u0006\f\n\u0004\b?\u00104\u001a\u0004\bA\u00106\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006H"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/incomingalert/InComingCallViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/IController;", "", "i", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/AuthStatus;", "auth", "a", "", "restore", "enable", "b", z.j, "h", "m", hl.k, "Lcom/xiaomi/hm/health/model/account/HMMiliConfig;", "config", "Lkotlin/Function1;", "", "action", "c", "enableIncomingCallDelay", "time", "setDelayTime", "enableShowContactInfo", "clearShowKeepLiveTipsLiveData", "getDelayTime", "open", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "authStatus", "updateAuthStatus", "(Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/AuthStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/IController$IListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "needShow", "supportShowByCondition", "needConditionShow", "conditionShow", "setDeviceEnable", "Lcom/xiaomi/hm/health/model/account/HMPersonInfo;", "kotlin.jvm.PlatformType", "Lkotlin/Lazy;", "f", "()Lcom/xiaomi/hm/health/model/account/HMPersonInfo;", "personInfo", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/incomingalert/IncomingCallSettingData;", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/incomingalert/IncomingCallSettingData;", "phoneAlertSettingData", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/MutableLiveData;", "getPhoneAlertLiveData", "()Landroidx/lifecycle/MutableLiveData;", "phoneAlertLiveData", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/PhoneAlertAuthChecker;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/PhoneAlertAuthChecker;", "authChecker", "e", "()Z", "needAlertKeepAlive", "g", "screenUnLockOpen", "getShowKeepLiveTipsLiveData", "showKeepLiveTipsLiveData", "Landroid/app/Application;", "app", "<init>", "(Landroid/app/Application;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class InComingCallViewModel extends AndroidViewModel implements IController {

    @NotNull
    private static final String h = "InComingCallViewModel";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy personInfo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final IncomingCallSettingData phoneAlertSettingData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<IncomingCallSettingData> phoneAlertLiveData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final PhoneAlertAuthChecker authChecker;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy needAlertKeepAlive;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy screenUnLockOpen;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> showKeepLiveTipsLiveData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "init and setting data is: " + InComingCallViewModel.this.phoneAlertSettingData;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return (this.a ? "enable" : WatchFaceApi.CUSTOMIZABLE_DISABLE) + " incoming call!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return (this.a ? "enable" : WatchFaceApi.CUSTOMIZABLE_DISABLE) + " incoming call delay!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z, boolean z2) {
            super(0);
            this.a = z;
            this.b = z2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return (this.a ? "enable" : WatchFaceApi.CUSTOMIZABLE_DISABLE) + " show contact info result: " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.incomingalert.InComingCallViewModel$getDelayTime$1", f = "InComingCallViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HMMiliConfig b;
        public final /* synthetic */ Function1<Integer, Unit> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(HMMiliConfig hMMiliConfig, Function1<? super Integer, Unit> function1, Continuation<? super e> continuation) {
            super(2, continuation);
            this.b = hMMiliConfig;
            this.c = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new e(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int delayTime = IncomingCallDevice.INSTANCE.getDelayTime();
            if (delayTime == -1 || delayTime == 0) {
                delayTime = this.b.getInComingCallNotifyTime();
            }
            this.c.invoke(Boxing.boxInt(delayTime));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Boolean> {
        public final /* synthetic */ Application a;
        public final /* synthetic */ InComingCallViewModel b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Application application, InComingCallViewModel inComingCallViewModel) {
            super(0);
            this.a = application;
            this.b = inComingCallViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return !MiuiAPI.isMiui(this.a) || (MiuiAPI.isMiui(this.a) && !this.b.g());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ InComingCallViewModel b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z, InComingCallViewModel inComingCallViewModel) {
            super(0);
            this.a = z;
            this.b = inComingCallViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "needShow :" + this.a + " and phoneAlertSettingData is: " + this.b.phoneAlertSettingData;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/model/account/HMPersonInfo;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<HMPersonInfo> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HMPersonInfo invoke() {
            return HMPersonInfo.getInstance();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function1<Integer, Unit> {
        public i() {
            super(1);
        }

        public final void a(int i) {
            InComingCallViewModel.this.phoneAlertSettingData.setDelayTime(i);
            LiveDataExKt.put(InComingCallViewModel.this.getPhoneAlertLiveData(), InComingCallViewModel.this.phoneAlertSettingData);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            a(num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function1<Integer, Unit> {
        public j() {
            super(1);
        }

        public final void a(int i) {
            InComingCallViewModel.this.phoneAlertSettingData.setDelayTime(i);
            LiveDataExKt.put(InComingCallViewModel.this.getPhoneAlertLiveData(), InComingCallViewModel.this.phoneAlertSettingData);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            a(num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<Boolean> {
        public final /* synthetic */ Application a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Application application) {
            super(0);
            this.a = application;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return MiuiUnlockAPI.isUnlockEnabled(this.a, IncomingCallDevice.INSTANCE.getDeviceAddress());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "set delay time: " + this.a;
        }
    }

    public InComingCallViewModel(@NotNull Application application) {
        super(application);
        this.personInfo = LazyKt__LazyJVMKt.lazy(h.a);
        this.phoneAlertSettingData = new IncomingCallSettingData(false, false, false, 0, false, false, null, 127, null);
        this.phoneAlertLiveData = new MutableLiveData<>();
        this.authChecker = new PhoneAlertAuthChecker(application);
        this.needAlertKeepAlive = LazyKt__LazyJVMKt.lazy(new f(application, this));
        this.screenUnLockOpen = LazyKt__LazyJVMKt.lazy(new k(application));
        this.showKeepLiveTipsLiveData = new MutableLiveData<>();
        i();
        HMLog.info(h, new a());
    }

    private final void a(AuthStatus auth) {
        AuthStatus authStatus = this.phoneAlertSettingData.getAuthStatus();
        authStatus.setContactPermissionEnabled(auth.getContactPermissionEnabled());
        authStatus.setPhonePermissionEnabled(auth.getPhonePermissionEnabled());
        authStatus.setReadPhoneCallLogEnable(auth.getReadPhoneCallLogEnable());
        authStatus.setDisturbPermissionEnabled(auth.getDisturbPermissionEnabled());
        LiveDataExKt.put(this.phoneAlertLiveData, this.phoneAlertSettingData);
    }

    private final void b(boolean restore, boolean enable) {
        HMLog.info(h, new b(enable));
        if (enable) {
            m(restore);
        } else {
            k();
        }
        h();
        this.phoneAlertSettingData.setAlertEnable(enable);
        LiveDataExKt.put(this.phoneAlertLiveData, this.phoneAlertSettingData);
    }

    private final void c(HMMiliConfig config, Function1<? super Integer, Unit> action) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new e(config, action, null), 2, null);
    }

    private final boolean e() {
        return ((Boolean) this.needAlertKeepAlive.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HMPersonInfo f() {
        return (HMPersonInfo) this.personInfo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean g() {
        return ((Boolean) this.screenUnLockOpen.getValue()).booleanValue();
    }

    private final void h() {
        if (HMKeeper.hasClosedNotificationByUser()) {
            return;
        }
        ResidentNotificationManager.showNotification(ResidentNotify.INSTANCE);
        f().getMiliConfig().setNotificationOn(true);
    }

    private final void i() {
        HMMiliConfig miliConfig = f().getMiliConfig();
        this.phoneAlertSettingData.setSupportShowContact(IncomingCallDevice.INSTANCE.supportShowContact());
        this.phoneAlertSettingData.setShowContact(miliConfig.isIncallNameDisplayEnabled());
        this.phoneAlertSettingData.setAlertEnable(miliConfig.isInComingCallEnabled());
        this.phoneAlertSettingData.setDelayEnable(miliConfig.isPhoneNotifyDelayEnable());
        AuthStatus authStatus = this.phoneAlertSettingData.getAuthStatus();
        authStatus.setContactPermissionEnabled(!this.authChecker.getContactPermissionAuthInfo().getShow());
        authStatus.setPhonePermissionEnabled(!this.authChecker.getPhoneCallPermissionAuthInfo().getShow());
        authStatus.setReadPhoneCallLogEnable(!this.authChecker.getPhoneCallLogPermissionAuthInfo().getShow());
        authStatus.setDisturbPermissionEnabled(!this.authChecker.getDisturbPermissionAuthInfo().getShow());
        c(miliConfig, new i());
    }

    private final void j() {
        HMMiliConfig miliConfig = f().getMiliConfig();
        this.phoneAlertSettingData.setDelayEnable(miliConfig.isPhoneNotifyDelayEnable());
        c(miliConfig, new j());
    }

    private final void k() {
        f().getMiliConfig().disableInComingCallTime();
        f().saveInfo(2);
    }

    private final void m(boolean restore) {
        if (e() && !restore) {
            LiveDataExKt.put(this.showKeepLiveTipsLiveData, Boolean.TRUE);
        }
        if (this.phoneAlertSettingData.getShowContact()) {
            IncomingCallDevice.INSTANCE.checkUpgrade(getApplication());
        }
        f().getMiliConfig().enableInComingCallTime();
        f().saveInfo(2);
    }

    public final void clearShowKeepLiveTipsLiveData() {
        LiveDataExKt.put(this.showKeepLiveTipsLiveData, null);
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.IController
    @Nullable
    public Object close(@NotNull Continuation<? super Boolean> continuation) {
        b(false, false);
        return Boxing.boxBoolean(true);
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.IController
    @Nullable
    public Object conditionShow(@NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(false);
    }

    public final void enableIncomingCallDelay(boolean enable) {
        HMLog.info(h, new c(enable));
        f().getMiliConfig().setPhoneNotifyDelayEnable(enable);
        IncomingCallDevice.INSTANCE.setDelayTime(enable ? f().getMiliConfig().getInComingCallNotifyTime() : 0);
        f().saveInfo(2);
        this.phoneAlertSettingData.setDelayEnable(enable);
        LiveDataExKt.put(this.phoneAlertLiveData, this.phoneAlertSettingData);
    }

    public final void enableShowContactInfo(boolean enable) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new InComingCallViewModel$enableShowContactInfo$$inlined$safeLaunch$1(null, enable, this), 2, null);
    }

    public final int getDelayTime() {
        return this.phoneAlertSettingData.getDelayTime();
    }

    @NotNull
    public final MutableLiveData<IncomingCallSettingData> getPhoneAlertLiveData() {
        return this.phoneAlertLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getShowKeepLiveTipsLiveData() {
        return this.showKeepLiveTipsLiveData;
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.IController
    @Nullable
    public Object needConditionShow(@NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(false);
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.IController
    @Nullable
    public Object needShow(@NotNull Continuation<? super Boolean> continuation) {
        boolean zIsInComingCallEnabled = f().getMiliConfig().isInComingCallEnabled();
        HMLog.info(h, new g(zIsInComingCallEnabled, this));
        return Boxing.boxBoolean(zIsInComingCallEnabled);
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.IController
    @Nullable
    public Object open(@NotNull Continuation<? super Boolean> continuation) {
        j();
        b(false, true);
        return Boxing.boxBoolean(true);
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.IController
    @Nullable
    public Object restore(@NotNull Continuation<? super Boolean> continuation) {
        j();
        b(true, true);
        return Boxing.boxBoolean(true);
    }

    public final void setDelayTime(int time) {
        HMLog.info(h, new l(time));
        f().getMiliConfig().setInComingCallNotifyTime(time);
        IncomingCallDevice.INSTANCE.setDelayTime(time);
        f().saveInfo(2);
        this.phoneAlertSettingData.setDelayTime(time);
        LiveDataExKt.put(this.phoneAlertLiveData, this.phoneAlertSettingData);
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.IController
    public void setDeviceEnable(boolean enable) {
        this.phoneAlertSettingData.setDeviceEnable(enable);
        LiveDataExKt.put(this.phoneAlertLiveData, this.phoneAlertSettingData);
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.IController
    public void setListener(@NotNull IController.IListener listener) {
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.IController
    @Nullable
    public Object supportShowByCondition(@NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(false);
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.IController
    @Nullable
    public Object updateAuthStatus(@NotNull AuthStatus authStatus, @NotNull Continuation<? super Unit> continuation) {
        a(authStatus);
        return Unit.INSTANCE;
    }
}
