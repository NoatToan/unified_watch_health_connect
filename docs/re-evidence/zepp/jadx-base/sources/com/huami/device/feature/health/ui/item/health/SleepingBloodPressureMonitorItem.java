package com.huami.device.feature.health.ui.item.health;

import android.content.DialogInterface;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.device.feature.health.device.HealthDevice;
import com.huami.device.feature.health.device.HealthFunc;
import com.huami.device.feature.health.res.AppResKt;
import com.huami.device.feature.health.settings.BloodPressureSetting;
import com.huami.device.feature.health.settings.SleepingBloodPressureMonitorSetting;
import com.huami.device.feature.health.settings.device.SetToDevice;
import com.huami.device.feature.health.ui.item.SettingItem;
import com.huami.device.feature.health.ui.item.health.SleepingBloodPressureMonitorItem;
import com.huami.device.feature.health.util.BloodPressureCorrectDayStatus;
import com.huami.device.feature.health.util.BloodPressureExtKt;
import com.huami.device.feature.health.util.HealthViewExtKt;
import com.huami.lib.rainbow.ListTile;
import com.huami.tools.log.HMLog;
import java.util.Map;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 '2\u00020\u0001:\u0001\u001bB!\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010$\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002JG\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u000bH\u0002JC\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0018\u0010\u0017\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0016\u0012\u0004\u0012\u00020\u000f0\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lcom/huami/device/feature/health/ui/item/health/SleepingBloodPressureMonitorItem;", "Lcom/huami/device/feature/health/ui/item/SettingItem;", "", "e", "enable", "f", "Landroidx/fragment/app/Fragment;", "fragment", "", "", "itemStr", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "accept", "", "userClick", "g", "Lcom/huami/lib/rainbow/ListTile;", "itemView", "", "cornerStyle", "Lkotlin/Function0;", "settingFunc", "bindItemView", "(Landroidx/fragment/app/Fragment;Lcom/huami/lib/rainbow/ListTile;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "Lcom/huami/device/feature/health/settings/SleepingBloodPressureMonitorSetting;", "a", "Lcom/huami/device/feature/health/settings/SleepingBloodPressureMonitorSetting;", "setting", "Lcom/huami/device/feature/health/device/HealthDevice;", "b", "Lcom/huami/device/feature/health/device/HealthDevice;", "device", "c", "Z", "deviceEnable", "<init>", "(Lcom/huami/device/feature/health/settings/SleepingBloodPressureMonitorSetting;Lcom/huami/device/feature/health/device/HealthDevice;Z)V", GoogleApiAvailabilityLight.a, "health-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SleepingBloodPressureMonitorItem implements SettingItem {

    @NotNull
    private static final a d = new a(null);

    @Deprecated
    @NotNull
    private static final String e = "SleepingBloodPressureMonitorItem";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final SleepingBloodPressureMonitorSetting setting;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final HealthDevice device;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean deviceEnable;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/device/feature/health/ui/item/health/SleepingBloodPressureMonitorItem$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "health-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "accept", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ ListTile a;
        public final /* synthetic */ Function1<Function0<Boolean>, Unit> b;
        public final /* synthetic */ SleepingBloodPressureMonitorItem c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Boolean> {
            public final /* synthetic */ SleepingBloodPressureMonitorItem a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SleepingBloodPressureMonitorItem sleepingBloodPressureMonitorItem) {
                super(0);
                this.a = sleepingBloodPressureMonitorItem;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final Boolean getA() {
                return Boolean.valueOf(this.a.f(true));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(ListTile listTile, Function1<? super Function0<Boolean>, Unit> function1, SleepingBloodPressureMonitorItem sleepingBloodPressureMonitorItem) {
            super(1);
            this.a = listTile;
            this.b = function1;
            this.c = sleepingBloodPressureMonitorItem;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (!z) {
                this.a.setChecked(false);
            }
            if (z) {
                this.b.invoke(new a(this.c));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Boolean> {
        public c() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final Boolean getA() {
            return Boolean.valueOf(SleepingBloodPressureMonitorItem.this.f(false));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ BloodPressureCorrectDayStatus a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(BloodPressureCorrectDayStatus bloodPressureCorrectDayStatus) {
            super(0);
            this.a = bloodPressureCorrectDayStatus;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "correct time: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.ui.item.health.SleepingBloodPressureMonitorItem$saveUserEnable$1", f = "SleepingBloodPressureMonitorItem.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z, Continuation<? super e> continuation) {
            super(2, continuation);
            this.c = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SleepingBloodPressureMonitorItem.this.new e(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            SetToDevice<Boolean> setToDevice;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            boolean z = false;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SleepingBloodPressureMonitorSetting sleepingBloodPressureMonitorSetting = SleepingBloodPressureMonitorItem.this.setting;
                if (sleepingBloodPressureMonitorSetting != null && (setToDevice = sleepingBloodPressureMonitorSetting.getSetToDevice()) != null) {
                    Boolean boolBoxBoolean = Boxing.boxBoolean(this.c);
                    this.a = 1;
                    obj = setToDevice.set(boolBoxBoolean, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Boxing.boxBoolean(z);
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (((Boolean) obj).booleanValue()) {
                z = true;
            }
            return Boxing.boxBoolean(z);
        }
    }

    public SleepingBloodPressureMonitorItem(@Nullable SleepingBloodPressureMonitorSetting sleepingBloodPressureMonitorSetting, @NotNull HealthDevice healthDevice, boolean z) {
        this.setting = sleepingBloodPressureMonitorSetting;
        this.device = healthDevice;
        this.deviceEnable = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(SleepingBloodPressureMonitorItem sleepingBloodPressureMonitorItem, Fragment fragment, Map map, Function1 function1, ListTile listTile, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            if (z) {
                sleepingBloodPressureMonitorItem.g(fragment, map, new b(listTile, function1, sleepingBloodPressureMonitorItem));
            } else {
                function1.invoke(sleepingBloodPressureMonitorItem.new c());
            }
        }
    }

    private final boolean e() {
        Long data;
        BloodPressureSetting service = HealthFunc.BLOOD_PRESSURE.INSTANCE.getService();
        BloodPressureCorrectDayStatus bloodPressureCorrectDayStatusGenerateCorrectStatus = null;
        if (service != null && (data = service.getData()) != null) {
            bloodPressureCorrectDayStatusGenerateCorrectStatus = BloodPressureExtKt.generateCorrectStatus(data.longValue() * ((long) 1000));
        }
        if (bloodPressureCorrectDayStatusGenerateCorrectStatus == null) {
            bloodPressureCorrectDayStatusGenerateCorrectStatus = BloodPressureCorrectDayStatus.NOT_CORRECT.INSTANCE;
        }
        HMLog.info(e, new d(bloodPressureCorrectDayStatusGenerateCorrectStatus));
        return bloodPressureCorrectDayStatusGenerateCorrectStatus instanceof BloodPressureCorrectDayStatus.VALID;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean f(boolean enable) {
        return ((Boolean) kotlinx.coroutines.d.b(null, new e(enable, null), 1, null)).booleanValue();
    }

    private final void g(Fragment fragment, Map<String, String> itemStr, final Function1<? super Boolean, Unit> userClick) {
        new AlertDialogFragment.Builder(fragment.requireContext()).setTitle(itemStr.get("dialogTitle")).setMessage(itemStr.get("dialogContent")).setNegativeButton(itemStr.get("dialogCancel"), new DialogInterface.OnClickListener() { // from class: j37
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SleepingBloodPressureMonitorItem.h(userClick, dialogInterface, i);
            }
        }).setPositiveButton(itemStr.get("dialogOk"), new DialogInterface.OnClickListener() { // from class: k37
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SleepingBloodPressureMonitorItem.i(userClick, dialogInterface, i);
            }
        }).show(fragment.getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Function1 function1, DialogInterface dialogInterface, int i) {
        function1.invoke(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(Function1 function1, DialogInterface dialogInterface, int i) {
        function1.invoke(Boolean.TRUE);
    }

    @Override // com.huami.device.feature.health.ui.item.SettingItem
    public void bindItemView(@NotNull final Fragment fragment, @NotNull final ListTile itemView, @Nullable Integer cornerStyle, @NotNull final Function1<? super Function0<Boolean>, Unit> settingFunc) {
        SleepingBloodPressureMonitorSetting sleepingBloodPressureMonitorSetting = this.setting;
        HealthViewExtKt.setVisible(itemView, sleepingBloodPressureMonitorSetting != null);
        if (sleepingBloodPressureMonitorSetting == null) {
            return;
        }
        boolean zE = e();
        if (cornerStyle != null) {
            itemView.setRadiusPosition(cornerStyle.intValue());
        }
        final Map<String, String> sleepingBloodPressureMonitorStr = AppResKt.getHealthStr().getSleepingBloodPressureMonitorStr();
        itemView.setTitle(sleepingBloodPressureMonitorStr.get("title"));
        itemView.setSubtitle(zE ? sleepingBloodPressureMonitorStr.get("subTitle") : sleepingBloodPressureMonitorStr.get("subTitleDisable"));
        itemView.setChecked(sleepingBloodPressureMonitorSetting.getData().booleanValue());
        itemView.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l37
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SleepingBloodPressureMonitorItem.d(this.a, fragment, sleepingBloodPressureMonitorStr, settingFunc, itemView, compoundButton, z);
            }
        });
        itemView.setEnabled(this.deviceEnable && zE);
    }

    @Override // com.huami.device.feature.health.ui.item.SettingItem, com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return SettingItem.DefaultImpls.getItemType(this);
    }
}
