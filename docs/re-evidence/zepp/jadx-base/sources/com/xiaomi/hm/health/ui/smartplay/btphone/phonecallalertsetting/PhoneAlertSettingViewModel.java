package com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting;

import android.app.Application;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.phone_call.sms.data.PermissionInfo;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.tbruyelle.rxpermissions2.Permission;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.utils.ex.LiveDataExKt;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 Q2\u00020\u0001:\u0003\rQRB\u000f\u0012\u0006\u0010N\u001a\u00020M¢\u0006\u0004\bO\u0010PJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001b\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0013\u0010\r\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bJ\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0016\u001a\u00020\u0004R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\"\u0010\u001f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\"\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\u001f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060#8\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001f\u0010+\u001a\b\u0012\u0004\u0012\u00020)0#8\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b*\u0010'R\u0019\u0010/\u001a\u00020)8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010.R$\u00107\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0016\u0010\u000f\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010\u0010\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u00109R\u001a\u0010>\u001a\u00060;R\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010B\u001a\u00060?R\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0019\u0010L\u001a\u00020G8\u0006@\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006S"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/PhoneAlertSettingViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "", "enable", "", "e", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/SettingType;", "type", "b", "(Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/SettingType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/IController;", "c", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "btPhoneController", "incomingCallController", "initWithController", "tryToOpen", "Lcom/tbruyelle/rxpermissions2/Permission;", PointCategory.PERMISSION, "onPermission", "checkAuth", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/PhoneAlertAuthChecker;", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/PhoneAlertAuthChecker;", "authChecker", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/SettingType;", "getCurSettingType", "()Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/SettingType;", "setCurSettingType", "(Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/SettingType;)V", "curSettingType", "getPreSettingType", "setPreSettingType", "preSettingType", "Landroidx/lifecycle/MutableLiveData;", GoogleApiAvailabilityLight.a, "Landroidx/lifecycle/MutableLiveData;", "getShowTypeLiveData", "()Landroidx/lifecycle/MutableLiveData;", "showTypeLiveData", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/PhoneAlertSettingData;", "getViewSettingLiveData", "viewSettingLiveData", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/PhoneAlertSettingData;", "getViewSettingData", "()Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/PhoneAlertSettingData;", "viewSettingData", "Lcom/huami/phone_call/sms/data/PermissionInfo;", "g", "Lcom/huami/phone_call/sms/data/PermissionInfo;", "getSendSmsPermission", "()Lcom/huami/phone_call/sms/data/PermissionInfo;", "setSendSmsPermission", "(Lcom/huami/phone_call/sms/data/PermissionInfo;)V", "sendSmsPermission", "h", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/IController;", "i", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/PhoneAlertSettingViewModel$a;", z.j, "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/PhoneAlertSettingViewModel$a;", "commonSettingController", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/PhoneAlertSettingViewModel$SubSettingListener;", hl.k, "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/PhoneAlertSettingViewModel$SubSettingListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlinx/coroutines/sync/Mutex;", "l", "Lkotlinx/coroutines/sync/Mutex;", "lock", "Lcom/xiaomi/hm/health/ui/BLEStatueListenerAdapter;", "m", "Lcom/xiaomi/hm/health/ui/BLEStatueListenerAdapter;", "getBleStatusListener", "()Lcom/xiaomi/hm/health/ui/BLEStatueListenerAdapter;", "bleStatusListener", "Landroid/app/Application;", "app", "<init>", "(Landroid/app/Application;)V", "Companion", "SubSettingListener", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class PhoneAlertSettingViewModel extends AndroidViewModel {

    @NotNull
    private static final String n = "PhoneAlertSettingViewModel";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final PhoneAlertAuthChecker authChecker;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private SettingType curSettingType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private SettingType preSettingType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<SettingType> showTypeLiveData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<PhoneAlertSettingData> viewSettingLiveData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final PhoneAlertSettingData viewSettingData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private PermissionInfo sendSmsPermission;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private IController btPhoneController;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private IController incomingCallController;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final a commonSettingController;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final SubSettingListener listener;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Mutex lock;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final BLEStatueListenerAdapter bleStatusListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/PhoneAlertSettingViewModel$SubSettingListener;", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/IController$IListener;", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/SettingType;", "type", "", "onOpenFailed", "<init>", "(Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/PhoneAlertSettingViewModel;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public final class SubSettingListener implements IController.IListener {
        public SubSettingListener() {
        }

        @Override // com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.IController.IListener
        public void onOpenFailed(@NotNull SettingType type) {
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(PhoneAlertSettingViewModel.this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new PhoneAlertSettingViewModel$SubSettingListener$onOpenFailed$$inlined$safeLaunch$1(null, PhoneAlertSettingViewModel.this), 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SettingType.values().length];
            iArr[SettingType.BtPhone.ordinal()] = 1;
            iArr[SettingType.PhoneAlert.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0004J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0013\u0010\u000f\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0004J\u0013\u0010\u0010\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0004J\u0013\u0010\u0011\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0004J\u0013\u0010\u0012\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0004J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"com/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/PhoneAlertSettingViewModel$a", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/IController;", "", "open", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "restore", "close", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/AuthStatus;", "authStatus", "", "updateAuthStatus", "(Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/AuthStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/IController$IListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "needShow", "supportShowByCondition", "needConditionShow", "conditionShow", "enable", "setDeviceEnable", "<init>", "(Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/PhoneAlertSettingViewModel;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public final class a implements IController {
        public a() {
        }

        @Override // com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.IController
        @Nullable
        public Object close(@NotNull Continuation<? super Boolean> continuation) {
            return Boxing.boxBoolean(true);
        }

        @Override // com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.IController
        @Nullable
        public Object conditionShow(@NotNull Continuation<? super Boolean> continuation) {
            return Boxing.boxBoolean(false);
        }

        @Override // com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.IController
        @Nullable
        public Object needConditionShow(@NotNull Continuation<? super Boolean> continuation) {
            return Boxing.boxBoolean(false);
        }

        @Override // com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.IController
        @Nullable
        public Object needShow(@NotNull Continuation<? super Boolean> continuation) {
            return Boxing.boxBoolean(true);
        }

        @Override // com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.IController
        @Nullable
        public Object open(@NotNull Continuation<? super Boolean> continuation) {
            return Boxing.boxBoolean(true);
        }

        @Override // com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.IController
        @Nullable
        public Object restore(@NotNull Continuation<? super Boolean> continuation) {
            return Boxing.boxBoolean(true);
        }

        @Override // com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.IController
        public void setDeviceEnable(boolean enable) {
            PhoneAlertSettingViewModel.this.getViewSettingData().setDeviceEnable(enable);
            LiveDataExKt.put(PhoneAlertSettingViewModel.this.getViewSettingLiveData(), PhoneAlertSettingViewModel.this.getViewSettingData());
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
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.PhoneAlertSettingViewModel", f = "PhoneAlertSettingViewModel.kt", i = {0, 0, 1, 2}, l = {284, 188, 189}, m = "_checkAuth", n = {"this", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$1", "L$1"})
    public static final class b extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public Object g;
        public /* synthetic */ Object h;
        public int j;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            return PhoneAlertSettingViewModel.this.a(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ ShowAuthInfo a;
        public final /* synthetic */ PhoneAlertSettingViewModel b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ShowAuthInfo showAuthInfo, PhoneAlertSettingViewModel phoneAlertSettingViewModel) {
            super(0);
            this.a = showAuthInfo;
            this.b = phoneAlertSettingViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "show auth info: " + this.a + " and curSettingType: " + this.b.getCurSettingType().name();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.PhoneAlertSettingViewModel", f = "PhoneAlertSettingViewModel.kt", i = {0}, l = {114}, m = "conditionShow", n = {"this"}, s = {"L$0"})
    public static final class d extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return PhoneAlertSettingViewModel.this.b(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ SettingType a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(SettingType settingType) {
            super(0);
            this.a = settingType;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.name() + " need condition show!!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ Permission a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Permission permission) {
            super(0);
            this.a = permission;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "on Permission: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.PhoneAlertSettingViewModel", f = "PhoneAlertSettingViewModel.kt", i = {0}, l = {122}, m = "restoreType", n = {"this"}, s = {"L$0"})
    public static final class g extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return PhoneAlertSettingViewModel.this.f(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ SettingType a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(SettingType settingType) {
            super(0);
            this.a = settingType;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.name() + " restore!!";
        }
    }

    public PhoneAlertSettingViewModel(@NotNull Application application) {
        super(application);
        this.authChecker = new PhoneAlertAuthChecker(application);
        SettingType settingType = SettingType.None;
        this.curSettingType = settingType;
        this.preSettingType = settingType;
        this.showTypeLiveData = new MutableLiveData<>();
        this.viewSettingLiveData = new MutableLiveData<>();
        this.viewSettingData = new PhoneAlertSettingData(null, null, false, 7, null);
        this.commonSettingController = new a();
        this.listener = new SubSettingListener();
        this.lock = MutexKt.Mutex$default(false, 1, null);
        this.bleStatusListener = new BLEStatueListenerAdapter() { // from class: com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.PhoneAlertSettingViewModel$bleStatusListener$1

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @Nullable
            private Boolean preEnable;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ boolean a;
                public final /* synthetic */ PhoneAlertSettingViewModel$bleStatusListener$1 b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(boolean z, PhoneAlertSettingViewModel$bleStatusListener$1 phoneAlertSettingViewModel$bleStatusListener$1) {
                    super(0);
                    this.a = z;
                    this.b = phoneAlertSettingViewModel$bleStatusListener$1;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "notifyStatusWhenSetting enable: " + this.a + ", preEnable: " + this.b.preEnable;
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ boolean a;
                public final /* synthetic */ PhoneAlertSettingViewModel$bleStatusListener$1 b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(boolean z, PhoneAlertSettingViewModel$bleStatusListener$1 phoneAlertSettingViewModel$bleStatusListener$1) {
                    super(0);
                    this.a = z;
                    this.b = phoneAlertSettingViewModel$bleStatusListener$1;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "on ble device status changed: " + this.a + ", preEnable: " + this.b.preEnable;
                }
            }

            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            public void notifyStatusWhenSetting(boolean enable) {
                HMLog.info("PhoneAlertSettingViewModel", new a(enable, this));
                if (Intrinsics.areEqual(this.preEnable, Boolean.valueOf(enable))) {
                    return;
                }
                this.preEnable = Boolean.valueOf(enable);
                this.b.e(enable);
            }

            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            public void onEnableChange(boolean enable) {
                HMLog.info("PhoneAlertSettingViewModel", new b(enable, this));
                if (Intrinsics.areEqual(this.preEnable, Boolean.valueOf(enable))) {
                    return;
                }
                this.preEnable = Boolean.valueOf(enable);
                this.b.e(enable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:54:0x0113 A[Catch: all -> 0x007c, TRY_LEAVE, TryCatch #1 {all -> 0x007c, blocks: (B:21:0x0074, B:52:0x010f, B:54:0x0113, B:82:0x01a8), top: B:89:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0129 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x012a  */
    /* JADX WARN: Code duplicated, block: B:60:0x0136  */
    /* JADX WARN: Code duplicated, block: B:61:0x0139 A[Catch: all -> 0x004d, TryCatch #2 {all -> 0x004d, blocks: (B:14:0x0048, B:58:0x0130, B:62:0x0156, B:79:0x0186, B:67:0x0163, B:70:0x016b, B:73:0x0173, B:75:0x0179, B:77:0x0181, B:61:0x0139), top: B:90:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x015c  */
    /* JADX WARN: Code duplicated, block: B:65:0x015e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0160  */
    /* JADX WARN: Code duplicated, block: B:67:0x0163 A[Catch: all -> 0x004d, TryCatch #2 {all -> 0x004d, blocks: (B:14:0x0048, B:58:0x0130, B:62:0x0156, B:79:0x0186, B:67:0x0163, B:70:0x016b, B:73:0x0173, B:75:0x0179, B:77:0x0181, B:61:0x0139), top: B:90:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0169  */
    /* JADX WARN: Code duplicated, block: B:70:0x016b A[Catch: all -> 0x004d, TryCatch #2 {all -> 0x004d, blocks: (B:14:0x0048, B:58:0x0130, B:62:0x0156, B:79:0x0186, B:67:0x0163, B:70:0x016b, B:73:0x0173, B:75:0x0179, B:77:0x0181, B:61:0x0139), top: B:90:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0171  */
    /* JADX WARN: Code duplicated, block: B:73:0x0173 A[Catch: all -> 0x004d, TryCatch #2 {all -> 0x004d, blocks: (B:14:0x0048, B:58:0x0130, B:62:0x0156, B:79:0x0186, B:67:0x0163, B:70:0x016b, B:73:0x0173, B:75:0x0179, B:77:0x0181, B:61:0x0139), top: B:90:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0179 A[Catch: all -> 0x004d, TryCatch #2 {all -> 0x004d, blocks: (B:14:0x0048, B:58:0x0130, B:62:0x0156, B:79:0x0186, B:67:0x0163, B:70:0x016b, B:73:0x0173, B:75:0x0179, B:77:0x0181, B:61:0x0139), top: B:90:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0181 A[Catch: all -> 0x004d, TryCatch #2 {all -> 0x004d, blocks: (B:14:0x0048, B:58:0x0130, B:62:0x0156, B:79:0x0186, B:67:0x0163, B:70:0x016b, B:73:0x0173, B:75:0x0179, B:77:0x0181, B:61:0x0139), top: B:90:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0185  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a8 A[Catch: all -> 0x007c, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x007c, blocks: (B:21:0x0074, B:52:0x010f, B:54:0x0113, B:82:0x01a8), top: B:89:0x0074 }] */
    public final Object a(Continuation<? super Unit> continuation) throws Throwable {
        b bVar;
        Mutex mutex;
        PhoneAlertSettingViewModel phoneAlertSettingViewModel;
        Mutex mutex2;
        ShowAuthInfo phoneCallPermissionAuthInfo;
        ShowAuthInfo contactPermissionAuthInfo;
        ShowAuthInfo showAuthInfo;
        ShowAuthInfo showAuthInfo2;
        Mutex mutex3;
        AuthStatus authStatus;
        IController iController;
        ShowAuthInfo showAuthInfo3;
        ShowAuthInfo showAuthInfo4;
        PhoneAlertSettingViewModel phoneAlertSettingViewModel2;
        ShowAuthInfo showAuthInfo5;
        ShowAuthInfo showAuthInfo6;
        PermissionInfo sendSmsPermission;
        ShowAuthInfo showAuthInfo7;
        SettingType curSettingType;
        SettingType settingType;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.j = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.h;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = bVar.j;
        boolean z = true;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Mutex mutex4 = this.lock;
                bVar.a = this;
                bVar.b = mutex4;
                bVar.j = 1;
                if (mutex4.lock(null, bVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutex = mutex4;
                phoneAlertSettingViewModel = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        showAuthInfo3 = (ShowAuthInfo) bVar.f;
                        showAuthInfo4 = (ShowAuthInfo) bVar.e;
                        showAuthInfo5 = (ShowAuthInfo) bVar.d;
                        showAuthInfo6 = (ShowAuthInfo) bVar.c;
                        mutex2 = (Mutex) bVar.b;
                        phoneAlertSettingViewModel2 = (PhoneAlertSettingViewModel) bVar.a;
                        try {
                            ResultKt.throwOnFailure(obj);
                            sendSmsPermission = phoneAlertSettingViewModel2.getSendSmsPermission();
                            if (sendSmsPermission == null) {
                                showAuthInfo7 = null;
                            } else {
                                showAuthInfo7 = new ShowAuthInfo(Boxing.boxInt(sendSmsPermission.getMessage()), sendSmsPermission.getTips(), true, sendSmsPermission.getPermission(), null, 16, null);
                            }
                            if (showAuthInfo6.getShow()) {
                                showAuthInfo3 = showAuthInfo6;
                            } else if (showAuthInfo7 != null) {
                                showAuthInfo3 = showAuthInfo7;
                            } else if (showAuthInfo5.getShow()) {
                                showAuthInfo3 = showAuthInfo5;
                            } else if (showAuthInfo4.getShow()) {
                                showAuthInfo3 = showAuthInfo4;
                            } else if (showAuthInfo3.getShow()) {
                                curSettingType = phoneAlertSettingViewModel2.getCurSettingType();
                                settingType = SettingType.PhoneAlert;
                                if (curSettingType == settingType) {
                                    showAuthInfo3.setOwner(settingType);
                                } else {
                                    showAuthInfo3 = null;
                                }
                            } else {
                                showAuthInfo3 = null;
                            }
                            HMLog.info(n, new c(showAuthInfo3, phoneAlertSettingViewModel2));
                            phoneAlertSettingViewModel2.getViewSettingData().setShowAuthInfo(showAuthInfo3);
                            LiveDataExKt.put(phoneAlertSettingViewModel2.getViewSettingLiveData(), phoneAlertSettingViewModel2.getViewSettingData());
                            Unit unit = Unit.INSTANCE;
                            mutex2.unlock(null);
                            return unit;
                        } catch (Throwable th) {
                            th = th;
                            mutex2.unlock(null);
                            throw th;
                        }
                    }
                    authStatus = (AuthStatus) bVar.g;
                    showAuthInfo2 = (ShowAuthInfo) bVar.f;
                    showAuthInfo = (ShowAuthInfo) bVar.e;
                    ShowAuthInfo showAuthInfo8 = (ShowAuthInfo) bVar.d;
                    ShowAuthInfo showAuthInfo9 = (ShowAuthInfo) bVar.c;
                    mutex3 = (Mutex) bVar.b;
                    PhoneAlertSettingViewModel phoneAlertSettingViewModel3 = (PhoneAlertSettingViewModel) bVar.a;
                    try {
                        ResultKt.throwOnFailure(obj);
                        phoneCallPermissionAuthInfo = showAuthInfo9;
                        contactPermissionAuthInfo = showAuthInfo8;
                        phoneAlertSettingViewModel = phoneAlertSettingViewModel3;
                        iController = phoneAlertSettingViewModel.incomingCallController;
                        if (iController != null) {
                            throw null;
                        }
                        bVar.a = phoneAlertSettingViewModel;
                        bVar.b = mutex3;
                        bVar.c = phoneCallPermissionAuthInfo;
                        bVar.d = contactPermissionAuthInfo;
                        bVar.e = showAuthInfo;
                        bVar.f = showAuthInfo2;
                        bVar.g = null;
                        bVar.j = 3;
                        if (iController.updateAuthStatus(authStatus, bVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        showAuthInfo3 = showAuthInfo2;
                        showAuthInfo4 = showAuthInfo;
                        phoneAlertSettingViewModel2 = phoneAlertSettingViewModel;
                        showAuthInfo5 = contactPermissionAuthInfo;
                        mutex2 = mutex3;
                        showAuthInfo6 = phoneCallPermissionAuthInfo;
                        sendSmsPermission = phoneAlertSettingViewModel2.getSendSmsPermission();
                        if (sendSmsPermission == null) {
                            showAuthInfo7 = null;
                        } else {
                            showAuthInfo7 = new ShowAuthInfo(Boxing.boxInt(sendSmsPermission.getMessage()), sendSmsPermission.getTips(), true, sendSmsPermission.getPermission(), null, 16, null);
                        }
                        if (showAuthInfo6.getShow()) {
                            showAuthInfo3 = showAuthInfo6;
                        } else if (showAuthInfo7 != null) {
                            showAuthInfo3 = showAuthInfo7;
                        } else if (showAuthInfo5.getShow()) {
                            showAuthInfo3 = showAuthInfo5;
                        } else if (showAuthInfo4.getShow()) {
                            showAuthInfo3 = showAuthInfo4;
                        } else if (showAuthInfo3.getShow()) {
                            curSettingType = phoneAlertSettingViewModel2.getCurSettingType();
                            settingType = SettingType.PhoneAlert;
                            if (curSettingType == settingType) {
                                showAuthInfo3.setOwner(settingType);
                            } else {
                                showAuthInfo3 = null;
                            }
                        } else {
                            showAuthInfo3 = null;
                        }
                        HMLog.info(n, new c(showAuthInfo3, phoneAlertSettingViewModel2));
                        phoneAlertSettingViewModel2.getViewSettingData().setShowAuthInfo(showAuthInfo3);
                        LiveDataExKt.put(phoneAlertSettingViewModel2.getViewSettingLiveData(), phoneAlertSettingViewModel2.getViewSettingData());
                        Unit unit2 = Unit.INSTANCE;
                        mutex2.unlock(null);
                        return unit2;
                    } catch (Throwable th2) {
                        th = th2;
                        mutex2 = mutex3;
                        mutex2.unlock(null);
                        throw th;
                    }
                }
                mutex = (Mutex) bVar.b;
                phoneAlertSettingViewModel = (PhoneAlertSettingViewModel) bVar.a;
                ResultKt.throwOnFailure(obj);
            }
            phoneCallPermissionAuthInfo = phoneAlertSettingViewModel.authChecker.getPhoneCallPermissionAuthInfo();
            contactPermissionAuthInfo = phoneAlertSettingViewModel.authChecker.getContactPermissionAuthInfo();
            ShowAuthInfo phoneCallLogPermissionAuthInfo = phoneAlertSettingViewModel.authChecker.getPhoneCallLogPermissionAuthInfo();
            ShowAuthInfo disturbPermissionAuthInfo = phoneAlertSettingViewModel.authChecker.getDisturbPermissionAuthInfo();
            AuthStatus authStatus2 = phoneAlertSettingViewModel.getViewSettingData().getAuthStatus();
            authStatus2.setPhonePermissionEnabled(!phoneCallPermissionAuthInfo.getShow());
            authStatus2.setContactPermissionEnabled(!contactPermissionAuthInfo.getShow());
            authStatus2.setReadPhoneCallLogEnable(!phoneCallLogPermissionAuthInfo.getShow());
            if (disturbPermissionAuthInfo.getShow()) {
                z = false;
            }
            authStatus2.setDisturbPermissionEnabled(z);
            IController iController2 = phoneAlertSettingViewModel.btPhoneController;
            if (iController2 == null) {
                throw null;
            }
            bVar.a = phoneAlertSettingViewModel;
            bVar.b = mutex;
            bVar.c = phoneCallPermissionAuthInfo;
            bVar.d = contactPermissionAuthInfo;
            bVar.e = phoneCallLogPermissionAuthInfo;
            bVar.f = disturbPermissionAuthInfo;
            bVar.g = authStatus2;
            bVar.j = 2;
            if (iController2.updateAuthStatus(authStatus2, bVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            showAuthInfo = phoneCallLogPermissionAuthInfo;
            showAuthInfo2 = disturbPermissionAuthInfo;
            mutex3 = mutex;
            authStatus = authStatus2;
            iController = phoneAlertSettingViewModel.incomingCallController;
            if (iController != null) {
                throw null;
            }
            bVar.a = phoneAlertSettingViewModel;
            bVar.b = mutex3;
            bVar.c = phoneCallPermissionAuthInfo;
            bVar.d = contactPermissionAuthInfo;
            bVar.e = showAuthInfo;
            bVar.f = showAuthInfo2;
            bVar.g = null;
            bVar.j = 3;
            if (iController.updateAuthStatus(authStatus, bVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            showAuthInfo3 = showAuthInfo2;
            showAuthInfo4 = showAuthInfo;
            phoneAlertSettingViewModel2 = phoneAlertSettingViewModel;
            showAuthInfo5 = contactPermissionAuthInfo;
            mutex2 = mutex3;
            showAuthInfo6 = phoneCallPermissionAuthInfo;
            sendSmsPermission = phoneAlertSettingViewModel2.getSendSmsPermission();
            if (sendSmsPermission == null) {
                showAuthInfo7 = null;
            } else {
                showAuthInfo7 = new ShowAuthInfo(Boxing.boxInt(sendSmsPermission.getMessage()), sendSmsPermission.getTips(), true, sendSmsPermission.getPermission(), null, 16, null);
            }
            if (showAuthInfo6.getShow()) {
                showAuthInfo3 = showAuthInfo6;
            } else if (showAuthInfo7 != null) {
                showAuthInfo3 = showAuthInfo7;
            } else if (showAuthInfo5.getShow()) {
                showAuthInfo3 = showAuthInfo5;
            } else if (showAuthInfo4.getShow()) {
                showAuthInfo3 = showAuthInfo4;
            } else if (showAuthInfo3.getShow()) {
                curSettingType = phoneAlertSettingViewModel2.getCurSettingType();
                settingType = SettingType.PhoneAlert;
                if (curSettingType == settingType) {
                    showAuthInfo3.setOwner(settingType);
                } else {
                    showAuthInfo3 = null;
                }
            } else {
                showAuthInfo3 = null;
            }
            HMLog.info(n, new c(showAuthInfo3, phoneAlertSettingViewModel2));
            phoneAlertSettingViewModel2.getViewSettingData().setShowAuthInfo(showAuthInfo3);
            LiveDataExKt.put(phoneAlertSettingViewModel2.getViewSettingLiveData(), phoneAlertSettingViewModel2.getViewSettingData());
            Unit unit3 = Unit.INSTANCE;
            mutex2.unlock(null);
            return unit3;
        } catch (Throwable th3) {
            th = th3;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(SettingType settingType, Continuation<? super Unit> continuation) {
        d dVar;
        PhoneAlertSettingViewModel phoneAlertSettingViewModel;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i = dVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.d = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objConditionShow = dVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = dVar.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objConditionShow);
            HMLog.info(n, new e(settingType));
            IController iControllerC = c(settingType);
            dVar.a = this;
            dVar.d = 1;
            objConditionShow = iControllerC.conditionShow(dVar);
            if (objConditionShow == coroutine_suspended) {
                return coroutine_suspended;
            }
            phoneAlertSettingViewModel = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            phoneAlertSettingViewModel = (PhoneAlertSettingViewModel) dVar.a;
            ResultKt.throwOnFailure(objConditionShow);
        }
        if (!((Boolean) objConditionShow).booleanValue()) {
            phoneAlertSettingViewModel.setCurSettingType(SettingType.None);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IController c(SettingType type) {
        int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            IController iController = this.btPhoneController;
            Objects.requireNonNull(iController);
            return iController;
        }
        if (i != 2) {
            return this.commonSettingController;
        }
        IController iController2 = this.incomingCallController;
        Objects.requireNonNull(iController2);
        return iController2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(boolean enable) {
        IController iController = this.btPhoneController;
        Objects.requireNonNull(iController);
        iController.setDeviceEnable(enable);
        IController iController2 = this.incomingCallController;
        Objects.requireNonNull(iController2);
        iController2.setDeviceEnable(enable);
        this.commonSettingController.setDeviceEnable(enable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(SettingType settingType, Continuation<? super Unit> continuation) {
        g gVar;
        PhoneAlertSettingViewModel phoneAlertSettingViewModel;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i = gVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                gVar.d = i - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object objRestore = gVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = gVar.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objRestore);
            HMLog.info(n, new h(settingType));
            IController iControllerC = c(settingType);
            gVar.a = this;
            gVar.d = 1;
            objRestore = iControllerC.restore(gVar);
            if (objRestore == coroutine_suspended) {
                return coroutine_suspended;
            }
            phoneAlertSettingViewModel = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            phoneAlertSettingViewModel = (PhoneAlertSettingViewModel) gVar.a;
            ResultKt.throwOnFailure(objRestore);
        }
        if (!((Boolean) objRestore).booleanValue()) {
            phoneAlertSettingViewModel.setCurSettingType(SettingType.None);
        }
        return Unit.INSTANCE;
    }

    public final void checkAuth() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new PhoneAlertSettingViewModel$checkAuth$$inlined$safeLaunch$1(null, this), 2, null);
    }

    @NotNull
    public final BLEStatueListenerAdapter getBleStatusListener() {
        return this.bleStatusListener;
    }

    @NotNull
    public final SettingType getCurSettingType() {
        return this.curSettingType;
    }

    @NotNull
    public final SettingType getPreSettingType() {
        return this.preSettingType;
    }

    @Nullable
    public final PermissionInfo getSendSmsPermission() {
        return this.sendSmsPermission;
    }

    @NotNull
    public final MutableLiveData<SettingType> getShowTypeLiveData() {
        return this.showTypeLiveData;
    }

    @NotNull
    public final PhoneAlertSettingData getViewSettingData() {
        return this.viewSettingData;
    }

    @NotNull
    public final MutableLiveData<PhoneAlertSettingData> getViewSettingLiveData() {
        return this.viewSettingLiveData;
    }

    public final void initWithController(@NotNull IController btPhoneController, @NotNull IController incomingCallController) {
        this.btPhoneController = btPhoneController;
        this.incomingCallController = incomingCallController;
        btPhoneController.setListener(this.listener);
        incomingCallController.setListener(this.listener);
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new PhoneAlertSettingViewModel$initWithController$$inlined$safeLaunch$1(null, btPhoneController, incomingCallController, this), 2, null);
    }

    public final void onPermission(@NotNull Permission permission) {
        HMLog.info(n, new f(permission));
        checkAuth();
    }

    public final void setCurSettingType(@NotNull SettingType settingType) {
        this.curSettingType = settingType;
    }

    public final void setPreSettingType(@NotNull SettingType settingType) {
        this.preSettingType = settingType;
    }

    public final void setSendSmsPermission(@Nullable PermissionInfo permissionInfo) {
        this.sendSmsPermission = permissionInfo;
    }

    public final void tryToOpen(@NotNull SettingType type) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new PhoneAlertSettingViewModel$tryToOpen$$inlined$safeLaunch$1(null, this, type), 2, null);
    }
}
