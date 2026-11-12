package com.xiaomi.hm.health.bodyfat.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.arch.helper.Resource;
import com.huami.bluetooth.profile.channel.module.BodyMode;
import com.huami.bluetooth.profile.channel.module.Gender;
import com.huami.bluetooth.profile.channel.module.MeasureMode;
import com.huami.bluetooth.profile.channel.module.ScaleGuestData;
import com.huami.bluetooth.profile.channel.module.ScaleSettingModule;
import com.huami.bluetooth.profile.channel.module.SettingResult;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bodyfat.activity.ConnectScaleActivity;
import com.xiaomi.hm.health.bodyfat.event.BFDeviceConnectionEvent;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.StringUtilsKt;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.mipush.sdk.Constants;
import de.greenrobot.event.EventBus;
import java.util.List;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b,\u0010-J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\nJ\b\u0010\r\u001a\u00020\nH\u0014R%\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0018\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010'\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R#\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0013¨\u0006."}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/viewmodel/ConnectScaleViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "a", "Lcom/huami/bluetooth/profile/channel/module/ScaleGuestData;", "b", "Lcom/xiaomi/hm/health/bodyfat/event/BFDeviceConnectionEvent;", "event", "", "onEventMainThread", "enterMode", "onCleared", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/arch/helper/Resource;", "Ljava/lang/Void;", "Landroidx/lifecycle/MutableLiveData;", "getEnterModeResult", "()Landroidx/lifecycle/MutableLiveData;", "enterModeResult", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "mTag", "", "c", LogUtil.I, "getType", "()I", "setType", "(I)V", "type", GoogleApiAvailabilityLight.a, "Z", "getSetModelWhenConnected", "()Z", "setSetModelWhenConnected", "(Z)V", "setModelWhenConnected", "e", "Lkotlin/Lazy;", "getConnectPage", "connectPage", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class ConnectScaleViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<Void>> enterModeResult = new MutableLiveData<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String mTag = ConnectScaleViewModel.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean setModelWhenConnected;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy connectPage;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<MutableLiveData<Boolean>> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Boolean> invoke() {
            MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
            mutableLiveData.setValue(Boolean.TRUE);
            return mutableLiveData;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.viewmodel.ConnectScaleViewModel$enterMode$1", f = "ConnectScaleViewModel.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ConnectScaleViewModel.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.a = 1;
                if (DelayKt.delay(30000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ConnectScaleViewModel.this.getEnterModeResult().postValue(Resource.Companion.error$default(Resource.INSTANCE, "", null, 2, null));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.viewmodel.ConnectScaleViewModel$enterMode$2", f = "ConnectScaleViewModel.kt", i = {}, l = {87, 91}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ConnectScaleViewModel.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:45:0x00cf  */
        /* JADX WARN: Code duplicated, block: B:49:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:50:0x00e8  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            SettingResult settingResult;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            boolean z = false;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HMBaseDevice device = BFCallback.getHMDeviceManager().getDevice(HMDeviceType.WEIGHT);
                HMLog.i(ConnectScaleViewModel.this.mTag, Intrinsics.stringPlus("check connect status is ", Boxing.boxBoolean(ConnectScaleViewModel.this.a(device))), new Object[0]);
                if (ConnectScaleViewModel.this.a(device)) {
                    ScaleSettingModule scaleSettingModule = (ScaleSettingModule) device.getChannelModule(ScaleSettingModule.class);
                    int type = ConnectScaleViewModel.this.getType();
                    ConnectScaleActivity.Companion companion = ConnectScaleActivity.INSTANCE;
                    if (type == companion.getTYPE_GUEST()) {
                        ScaleGuestData scaleGuestDataB = ConnectScaleViewModel.this.b();
                        if (scaleGuestDataB != null && scaleSettingModule != null) {
                            this.a = 1;
                            obj = scaleSettingModule.setGuestModel(true, scaleGuestDataB, this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            settingResult = (SettingResult) obj;
                        }
                        HMLog.i(ConnectScaleViewModel.this.mTag, Intrinsics.stringPlus("connect result is ", settingResult), new Object[0]);
                        if (settingResult != null) {
                            z = true;
                        }
                        if (z) {
                            ConnectScaleViewModel.this.getEnterModeResult().postValue(Resource.Companion.success$default(Resource.INSTANCE, null, 1, null));
                        } else {
                            ConnectScaleViewModel.this.getEnterModeResult().postValue(Resource.Companion.error$default(Resource.INSTANCE, "", null, 2, null));
                        }
                    } else if (type == companion.getTYPE_BABY_WEIGHT()) {
                        if (scaleSettingModule != null) {
                            MeasureMode measureMode = MeasureMode.MODEL_BABY_WEIGHT;
                            this.a = 2;
                            obj = scaleSettingModule.setModel(measureMode, true, this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            settingResult = (SettingResult) obj;
                        }
                        HMLog.i(ConnectScaleViewModel.this.mTag, Intrinsics.stringPlus("connect result is ", settingResult), new Object[0]);
                        if (settingResult != null) {
                            z = true;
                        }
                        if (z) {
                            ConnectScaleViewModel.this.getEnterModeResult().postValue(Resource.Companion.success$default(Resource.INSTANCE, null, 1, null));
                        } else {
                            ConnectScaleViewModel.this.getEnterModeResult().postValue(Resource.Companion.error$default(Resource.INSTANCE, "", null, 2, null));
                        }
                    } else {
                        if (type == companion.getTYPE_BALANCE() || type == companion.getTYPE_GUEST_BALANCE()) {
                            ConnectScaleViewModel.this.getEnterModeResult().postValue(Resource.Companion.success$default(Resource.INSTANCE, null, 1, null));
                            return Unit.INSTANCE;
                        }
                    }
                    settingResult = null;
                    HMLog.i(ConnectScaleViewModel.this.mTag, Intrinsics.stringPlus("connect result is ", settingResult), new Object[0]);
                    if (settingResult != null) {
                        z = true;
                    }
                    if (z) {
                        ConnectScaleViewModel.this.getEnterModeResult().postValue(Resource.Companion.success$default(Resource.INSTANCE, null, 1, null));
                    } else {
                        ConnectScaleViewModel.this.getEnterModeResult().postValue(Resource.Companion.error$default(Resource.INSTANCE, "", null, 2, null));
                    }
                } else {
                    ConnectScaleViewModel.this.setSetModelWhenConnected(true);
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                settingResult = (SettingResult) obj;
                HMLog.i(ConnectScaleViewModel.this.mTag, Intrinsics.stringPlus("connect result is ", settingResult), new Object[0]);
                if (settingResult != null) {
                    z = true;
                }
                if (z) {
                    ConnectScaleViewModel.this.getEnterModeResult().postValue(Resource.Companion.success$default(Resource.INSTANCE, null, 1, null));
                } else {
                    ConnectScaleViewModel.this.getEnterModeResult().postValue(Resource.Companion.error$default(Resource.INSTANCE, "", null, 2, null));
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                settingResult = (SettingResult) obj;
                HMLog.i(ConnectScaleViewModel.this.mTag, Intrinsics.stringPlus("connect result is ", settingResult), new Object[0]);
                if (settingResult != null && settingResult.getSuccess()) {
                    z = true;
                }
                if (z) {
                    ConnectScaleViewModel.this.getEnterModeResult().postValue(Resource.Companion.success$default(Resource.INSTANCE, null, 1, null));
                } else {
                    ConnectScaleViewModel.this.getEnterModeResult().postValue(Resource.Companion.error$default(Resource.INSTANCE, "", null, 2, null));
                }
            }
            return Unit.INSTANCE;
        }
    }

    public ConnectScaleViewModel() {
        BFCallback.getInstance().eventBusConnect(true);
        EventBus.getDefault().register(this);
        this.connectPage = LazyKt__LazyJVMKt.lazy(a.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a(HMBaseDevice device) {
        return device != null && device.getMDeviceSource().getValue() == HMDeviceSource.WEIGHT_AMAZFIT_SCALE.getValue() && device.isConnected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ScaleGuestData b() {
        UserInfos guest = UserInfoManager.getManager().getGuest();
        if (guest == null) {
            return null;
        }
        String birthday = guest.getBirthday();
        List listSplit$default = birthday == null ? null : StringsKt__StringsKt.split$default((CharSequence) birthday, new String[]{Constants.ACCEPT_TIME_SEPARATOR_SERVER}, false, 0, 6, (Object) null);
        if (listSplit$default == null || listSplit$default.size() != 2) {
            return null;
        }
        Integer gender = guest.getGender();
        return new ScaleGuestData((gender != null && gender.intValue() == 0) ? Gender.FEMALE : Gender.MALE, guest.getHeight().intValue(), StringUtilsKt.toIntValue$default((String) listSplit$default.get(0), 0, 1, null), StringUtilsKt.toIntValue$default((String) listSplit$default.get(1), 0, 1, null), guest.getMeasureMode() == 0 ? BodyMode.MODE_NORMAL : BodyMode.MODE_SPORT);
    }

    public final void enterMode() {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getDefault(), null, new b(null), 2, null);
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new c(null), 2, null);
    }

    @NotNull
    public final MutableLiveData<Boolean> getConnectPage() {
        return (MutableLiveData) this.connectPage.getValue();
    }

    @NotNull
    public final MutableLiveData<Resource<Void>> getEnterModeResult() {
        return this.enterModeResult;
    }

    public final boolean getSetModelWhenConnected() {
        return this.setModelWhenConnected;
    }

    public final int getType() {
        return this.type;
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        BFCallback.getInstance().eventBusConnect(false);
        EventBus.getDefault().unregister(this);
    }

    public final void onEventMainThread(@NotNull BFDeviceConnectionEvent event) {
        HMBaseDevice device = BFCallback.getHMDeviceManager().getDevice(event.getDeviceType());
        HMLog.i(this.mTag, Intrinsics.stringPlus("connect status is ", Boolean.valueOf(device.isConnected())), new Object[0]);
        if (a(device) && Intrinsics.areEqual(getConnectPage().getValue(), Boolean.TRUE) && this.setModelWhenConnected) {
            this.setModelWhenConnected = false;
            enterMode();
        }
    }

    public final void setSetModelWhenConnected(boolean z) {
        this.setModelWhenConnected = z;
    }

    public final void setType(int i) {
        this.type = i;
    }
}
