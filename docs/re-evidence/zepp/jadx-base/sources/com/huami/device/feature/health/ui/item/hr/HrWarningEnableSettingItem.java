package com.huami.device.feature.health.ui.item.hr;

import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.device.feature.health.HealthDetect;
import com.huami.device.feature.health.device.HealthDevice;
import com.huami.device.feature.health.res.AppResKt;
import com.huami.device.feature.health.settings.HighHrAlertSetting;
import com.huami.device.feature.health.settings.device.SetToDevice;
import com.huami.device.feature.health.ui.item.SettingItem;
import com.huami.device.feature.health.ui.item.hr.HrWarningEnableSettingItem;
import com.huami.device.feature.health.user.HealthSettingConfig;
import com.huami.device.feature.health.util.HealthViewExtKt;
import com.huami.lib.rainbow.ListTile;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004H\u0002JC\u0010\u0013\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/huami/device/feature/health/ui/item/hr/HrWarningEnableSettingItem;", "Lcom/huami/device/feature/health/ui/item/SettingItem;", "Lcom/huami/device/feature/health/device/HealthDevice;", "device", "", "c", "enable", "", GoogleApiAvailabilityLight.a, "Landroidx/fragment/app/Fragment;", "fragment", "Lcom/huami/lib/rainbow/ListTile;", "itemView", "", "cornerStyle", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "settingFunc", "bindItemView", "(Landroidx/fragment/app/Fragment;Lcom/huami/lib/rainbow/ListTile;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "Lcom/huami/device/feature/health/settings/HighHrAlertSetting;", "a", "Lcom/huami/device/feature/health/settings/HighHrAlertSetting;", "setting", "b", "Lcom/huami/device/feature/health/device/HealthDevice;", "Z", "deviceEnable", "<init>", "(Lcom/huami/device/feature/health/settings/HighHrAlertSetting;Lcom/huami/device/feature/health/device/HealthDevice;Z)V", "health-ui_release"}, k = 1, mv = {1, 5, 1})
public final class HrWarningEnableSettingItem implements SettingItem {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final HighHrAlertSetting setting;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final HealthDevice device;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean deviceEnable;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Boolean> {
        public final /* synthetic */ boolean b;

        /* JADX INFO: renamed from: com.huami.device.feature.health.ui.item.hr.HrWarningEnableSettingItem$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.device.feature.health.ui.item.hr.HrWarningEnableSettingItem$bindItemView$2$1$1", f = "HrWarningEnableSettingItem.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0362a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            public int a;
            public final /* synthetic */ HrWarningEnableSettingItem b;
            public final /* synthetic */ boolean c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0362a(HrWarningEnableSettingItem hrWarningEnableSettingItem, boolean z, Continuation<? super C0362a> continuation) {
                super(2, continuation);
                this.b = hrWarningEnableSettingItem;
                this.c = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0362a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
                return ((C0362a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                SetToDevice<Integer> setToDevice;
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                boolean z = false;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    HighHrAlertSetting highHrAlertSetting = this.b.setting;
                    if (highHrAlertSetting != null && (setToDevice = highHrAlertSetting.getSetToDevice()) != null) {
                        Integer numBoxInt = Boxing.boxInt(this.c ? 100 : 0);
                        this.a = 1;
                        obj = setToDevice.set(numBoxInt, this);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z) {
            super(0);
            this.b = z;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final Boolean getA() {
            return (Boolean) d.b(null, new C0362a(HrWarningEnableSettingItem.this, this.b, null), 1, null);
        }
    }

    public HrWarningEnableSettingItem(@Nullable HighHrAlertSetting highHrAlertSetting, @NotNull HealthDevice healthDevice, boolean z) {
        this.setting = highHrAlertSetting;
        this.device = healthDevice;
        this.deviceEnable = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Function1 function1, HrWarningEnableSettingItem hrWarningEnableSettingItem, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            function1.invoke(hrWarningEnableSettingItem.new a(z));
        }
    }

    private final boolean c(HealthDevice device) {
        HealthSettingConfig userConfig = HealthDetect.INSTANCE.getHealthConfig().getUserConfig();
        if (userConfig.getHrDetectType() != 4) {
            if (userConfig.getHrDetectType() != 2 && userConfig.getHrDetectType() != 3) {
                return false;
            }
            if (userConfig.getFreq() > 10 && device.getDeviceSource() != 65) {
                return false;
            }
        }
        return true;
    }

    private final String d(boolean enable) {
        return enable ? AppResKt.getHealthStr().getHrWarnSettingSummary() : AppResKt.getHealthStr().getHrWarnSettingFreqSummary();
    }

    @Override // com.huami.device.feature.health.ui.item.SettingItem
    public void bindItemView(@NotNull Fragment fragment, @NotNull ListTile itemView, @Nullable Integer cornerStyle, @NotNull final Function1<? super Function0<Boolean>, Unit> settingFunc) {
        Integer data;
        HealthViewExtKt.setVisible(itemView, this.setting != null);
        boolean zC = c(this.device);
        itemView.setEnabled(this.deviceEnable && zC);
        if (cornerStyle != null) {
            itemView.setRadiusPosition(cornerStyle.intValue());
        }
        itemView.setTitle(AppResKt.getHealthStr().getHrWarnSettingTitle());
        itemView.setSubtitle(d(zC));
        HighHrAlertSetting highHrAlertSetting = this.setting;
        itemView.setChecked(((highHrAlertSetting != null && (data = highHrAlertSetting.getData()) != null) ? data.intValue() : 0) > 0);
        itemView.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ma4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                HrWarningEnableSettingItem.b(settingFunc, this, compoundButton, z);
            }
        });
    }

    @Override // com.huami.device.feature.health.ui.item.SettingItem, com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return SettingItem.DefaultImpls.getItemType(this);
    }
}
