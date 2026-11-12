package com.huami.device.feature.health.ui.item.health;

import android.bluetooth.BluetoothAdapter;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.device.feature.health.device.HealthDevice;
import com.huami.device.feature.health.res.AppResKt;
import com.huami.device.feature.health.settings.BloodPressureSetting;
import com.huami.device.feature.health.ui.R;
import com.huami.device.feature.health.ui.bloodpressure.BloodPressureSettingDialogView;
import com.huami.device.feature.health.ui.item.SettingItem;
import com.huami.device.feature.health.ui.item.health.BloodPressureSettingItem;
import com.huami.device.feature.health.util.BloodPressureCorrectDayStatus;
import com.huami.device.feature.health.util.BloodPressureExtKt;
import com.huami.device.feature.health.util.HealthViewExtKt;
import com.huami.lib.rainbow.ListTile;
import com.loc.z;
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
import kotlinx.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b \u0010!J2\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0006H\u0002J\"\u0010\f\u001a\u00020\t2\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0006H\u0002J*\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0006H\u0002J\b\u0010\u000e\u001a\u00020\bH\u0002JC\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/huami/device/feature/health/ui/item/health/BloodPressureSettingItem;", "Lcom/huami/device/feature/health/ui/item/SettingItem;", "Landroidx/fragment/app/Fragment;", "fragment", "Lcom/huami/device/feature/health/util/BloodPressureCorrectDayStatus;", "status", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "", "settingFunc", z.j, "f", "h", "g", "Lcom/huami/lib/rainbow/ListTile;", "itemView", "", "cornerStyle", "bindItemView", "(Landroidx/fragment/app/Fragment;Lcom/huami/lib/rainbow/ListTile;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "Lcom/huami/device/feature/health/settings/BloodPressureSetting;", "a", "Lcom/huami/device/feature/health/settings/BloodPressureSetting;", "setting", "Lcom/huami/device/feature/health/device/HealthDevice;", "b", "Lcom/huami/device/feature/health/device/HealthDevice;", "device", "c", "Z", "deviceEnable", "<init>", "(Lcom/huami/device/feature/health/settings/BloodPressureSetting;Lcom/huami/device/feature/health/device/HealthDevice;Z)V", "health-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureSettingItem implements SettingItem {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final BloodPressureSetting setting;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final HealthDevice device;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean deviceEnable;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: com.huami.device.feature.health.ui.item.health.BloodPressureSettingItem$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.device.feature.health.ui.item.health.BloodPressureSettingItem$checkStatus$1$1", f = "BloodPressureSettingItem.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0348a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            public int a;
            public final /* synthetic */ BloodPressureSettingItem b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0348a(BloodPressureSettingItem bloodPressureSettingItem, Continuation<? super C0348a> continuation) {
                super(2, continuation);
                this.b = bloodPressureSettingItem;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0348a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
                return ((C0348a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                boolean z = false;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    BloodPressureSetting bloodPressureSetting = this.b.setting;
                    if (bloodPressureSetting != null) {
                        this.a = 1;
                        obj = bloodPressureSetting.canNavigateToCorrect(this);
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

        public a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return (Boolean) d.b(null, new C0348a(BloodPressureSettingItem.this, null), 1, null);
        }
    }

    public BloodPressureSettingItem(@Nullable BloodPressureSetting bloodPressureSetting, @NotNull HealthDevice healthDevice, boolean z) {
        this.setting = bloodPressureSetting;
        this.device = healthDevice;
        this.deviceEnable = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(BloodPressureSettingItem bloodPressureSettingItem, Fragment fragment, BloodPressureCorrectDayStatus bloodPressureCorrectDayStatus, Function1 function1, View view) {
        bloodPressureSettingItem.j(fragment, bloodPressureCorrectDayStatus, function1);
    }

    private final void f(Function1<? super Function0<Boolean>, Unit> settingFunc) {
        settingFunc.invoke(new a());
    }

    private final boolean g() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return defaultAdapter != null && defaultAdapter.isEnabled();
    }

    private final void h(Fragment fragment, Function1<? super Function0<Boolean>, Unit> settingFunc) {
        if (this.device.isConnect()) {
            f(settingFunc);
            return;
        }
        boolean zG = g();
        new AlertDialogFragment.Builder(fragment.requireActivity()).setTitle(zG ? R.string.blood_pressure_device_disconnect : R.string.blood_pressure_bluetooth_disable).setMessage(zG ? R.string.blood_pressure_device_disconnect_msg_new : R.string.blood_pressure_bluetooth_disable_msg_new).setNeutralButton(R.string.btn_ok, new DialogInterface.OnClickListener() { // from class: h20
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                BloodPressureSettingItem.i(dialogInterface, i);
            }
        }).setCancelable(false).show(fragment.getChildFragmentManager(), "correct fail").setGravity(17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(DialogInterface dialogInterface, int i) {
    }

    private final void j(final Fragment fragment, BloodPressureCorrectDayStatus status, final Function1<? super Function0<Boolean>, Unit> settingFunc) {
        String string;
        Long data;
        if (status instanceof BloodPressureCorrectDayStatus.NOT_CORRECT) {
            f(settingFunc);
            return;
        }
        if (status instanceof BloodPressureCorrectDayStatus.VALID) {
            int day = (28 - ((BloodPressureCorrectDayStatus.VALID) status).getDay()) + 1;
            string = fragment.getResources().getQuantityString(R.plurals.blood_pressure_next_correct_days, day, Integer.valueOf(day));
        } else {
            string = fragment.getString(R.string.blood_pressure_correct_over_date);
        }
        AlertDialogFragment.Builder title = new AlertDialogFragment.Builder(fragment.requireActivity()).setTitle(string);
        BloodPressureSettingDialogView bloodPressureSettingDialogView = new BloodPressureSettingDialogView(fragment.requireActivity(), null, 0, 6, null);
        BloodPressureSetting bloodPressureSetting = this.setting;
        long jLongValue = 0;
        if (bloodPressureSetting != null && (data = bloodPressureSetting.getData()) != null) {
            jLongValue = data.longValue();
        }
        bloodPressureSettingDialogView.setCorrectDate(jLongValue);
        Unit unit = Unit.INSTANCE;
        title.setContentView(bloodPressureSettingDialogView).setNegativeButton(AppResKt.getHealthStr().getClose(), new DialogInterface.OnClickListener() { // from class: g20
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                BloodPressureSettingItem.k(dialogInterface, i);
            }
        }).setPositiveButton(R.string.blood_pressure_re_correct, new DialogInterface.OnClickListener() { // from class: f20
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                BloodPressureSettingItem.l(this.a, fragment, settingFunc, dialogInterface, i);
            }
        }).show(fragment.getChildFragmentManager(), "blood pressure dialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(DialogInterface dialogInterface, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(BloodPressureSettingItem bloodPressureSettingItem, Fragment fragment, Function1 function1, DialogInterface dialogInterface, int i) {
        bloodPressureSettingItem.h(fragment, function1);
    }

    @Override // com.huami.device.feature.health.ui.item.SettingItem
    public void bindItemView(@NotNull final Fragment fragment, @NotNull ListTile itemView, @Nullable Integer cornerStyle, @NotNull final Function1<? super Function0<Boolean>, Unit> settingFunc) {
        Long data;
        HealthViewExtKt.setVisible(itemView, this.setting != null);
        itemView.setEnabled(this.deviceEnable);
        if (cornerStyle != null) {
            itemView.setRadiusPosition(cornerStyle.intValue());
        }
        itemView.setTitle(R.string.blood_pressure_item_title);
        itemView.setSubtitle(fragment.getResources().getQuantityString(R.plurals.blood_pressure_item_summary_new, 28, 28));
        HealthViewExtKt.enableArrow(itemView);
        HealthViewExtKt.disableSwitch(itemView);
        BloodPressureSetting bloodPressureSetting = this.setting;
        final BloodPressureCorrectDayStatus bloodPressureCorrectDayStatusGenerateCorrectStatus = null;
        if (bloodPressureSetting != null && (data = bloodPressureSetting.getData()) != null) {
            bloodPressureCorrectDayStatusGenerateCorrectStatus = BloodPressureExtKt.generateCorrectStatus(data.longValue() * ((long) 1000));
        }
        if (bloodPressureCorrectDayStatusGenerateCorrectStatus == null) {
            bloodPressureCorrectDayStatusGenerateCorrectStatus = BloodPressureCorrectDayStatus.NOT_CORRECT.INSTANCE;
        }
        itemView.setTips(BloodPressureExtKt.format(bloodPressureCorrectDayStatusGenerateCorrectStatus));
        itemView.setOnClickListener(new View.OnClickListener() { // from class: i20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BloodPressureSettingItem.e(this.a, fragment, bloodPressureCorrectDayStatusGenerateCorrectStatus, settingFunc, view);
            }
        });
    }

    @Override // com.huami.device.feature.health.ui.item.SettingItem, com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return SettingItem.DefaultImpls.getItemType(this);
    }
}
