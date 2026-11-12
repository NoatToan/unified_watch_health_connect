package com.huami.device.feature.health.ui.item.health;

import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.device.feature.health.HealthDetect;
import com.huami.device.feature.health.device.HealthDevice;
import com.huami.device.feature.health.model.HealthSettingData;
import com.huami.device.feature.health.res.AppResKt;
import com.huami.device.feature.health.settings.HrIntervalSetting;
import com.huami.device.feature.health.settings.device.SetToDevice;
import com.huami.device.feature.health.ui.dialog.HrAtrialRule;
import com.huami.device.feature.health.ui.dialog.HrChangeRule;
import com.huami.device.feature.health.ui.dialog.HrIntervalDialogRuleEngine;
import com.huami.device.feature.health.ui.dialog.HrShowBatteryWarningRule;
import com.huami.device.feature.health.ui.dialog.HuamiOSHrChangeRule;
import com.huami.device.feature.health.ui.item.SettingItem;
import com.huami.device.feature.health.ui.item.health.HrIntervalSettingItem;
import com.huami.device.feature.health.ui.model.DialogParams;
import com.huami.device.feature.health.ui.model.IntervalExp;
import com.huami.device.feature.health.util.HealthExt;
import com.huami.device.feature.health.util.HealthViewExtKt;
import com.huami.lib.rainbow.ListTile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B!\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010 \u001a\u00020\u000b¢\u0006\u0004\b%\u0010&J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J8\u0010\u000e\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\tH\u0002J*\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00022\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\tH\u0002JC\u0010\u0014\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lcom/huami/device/feature/health/ui/item/health/HrIntervalSettingItem;", "Lcom/huami/device/feature/health/ui/item/SettingItem;", "", "", "i", "Lcom/huami/device/feature/health/model/HealthSettingData;", "data", "Landroidx/fragment/app/Fragment;", "fragment", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "", "settingFunc", "f", "interval", "e", "Lcom/huami/lib/rainbow/ListTile;", "itemView", "cornerStyle", "bindItemView", "(Landroidx/fragment/app/Fragment;Lcom/huami/lib/rainbow/ListTile;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "Lcom/huami/device/feature/health/settings/HrIntervalSetting;", "a", "Lcom/huami/device/feature/health/settings/HrIntervalSetting;", "setting", "Lcom/huami/device/feature/health/device/HealthDevice;", "b", "Lcom/huami/device/feature/health/device/HealthDevice;", "device", "c", "Z", "deviceEnable", "Lcom/huami/device/feature/health/ui/dialog/HrIntervalDialogRuleEngine;", GoogleApiAvailabilityLight.a, "Lcom/huami/device/feature/health/ui/dialog/HrIntervalDialogRuleEngine;", "intervalDialogRuleEngine", "<init>", "(Lcom/huami/device/feature/health/settings/HrIntervalSetting;Lcom/huami/device/feature/health/device/HealthDevice;Z)V", "Companion", "health-ui_release"}, k = 1, mv = {1, 5, 1})
public final class HrIntervalSettingItem implements SettingItem {
    public static final int HR_ATRIAL = -1;
    public static final int HR_CLOSE = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final HrIntervalSetting setting;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final HealthDevice device;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean deviceEnable;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final HrIntervalDialogRuleEngine intervalDialogRuleEngine;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Boolean> {
        public final /* synthetic */ int b;

        /* JADX INFO: renamed from: com.huami.device.feature.health.ui.item.health.HrIntervalSettingItem$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.device.feature.health.ui.item.health.HrIntervalSettingItem$setToDevice$1$1", f = "HrIntervalSettingItem.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0350a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            public int a;
            public final /* synthetic */ HrIntervalSettingItem b;
            public final /* synthetic */ int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0350a(HrIntervalSettingItem hrIntervalSettingItem, int i, Continuation<? super C0350a> continuation) {
                super(2, continuation);
                this.b = hrIntervalSettingItem;
                this.c = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0350a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
                return ((C0350a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    HrIntervalSetting hrIntervalSetting = this.b.setting;
                    if (hrIntervalSetting != null && (setToDevice = hrIntervalSetting.getSetToDevice()) != null) {
                        Integer numBoxInt = Boxing.boxInt(this.c);
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
        public a(int i) {
            super(0);
            this.b = i;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final Boolean getA() {
            return (Boolean) d.b(null, new C0350a(HrIntervalSettingItem.this, this.b, null), 1, null);
        }
    }

    public HrIntervalSettingItem(@Nullable HrIntervalSetting hrIntervalSetting, @NotNull HealthDevice healthDevice, boolean z) {
        this.setting = hrIntervalSetting;
        this.device = healthDevice;
        this.deviceEnable = z;
        HrIntervalDialogRuleEngine hrIntervalDialogRuleEngine = new HrIntervalDialogRuleEngine();
        this.intervalDialogRuleEngine = hrIntervalDialogRuleEngine;
        hrIntervalDialogRuleEngine.addRule(new HrAtrialRule()).addRule(new HrShowBatteryWarningRule()).addRule(new HrChangeRule()).addRule(new HuamiOSHrChangeRule());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(HrIntervalSettingItem hrIntervalSettingItem, Fragment fragment, Function1 function1, View view) {
        HrIntervalSetting hrIntervalSetting = hrIntervalSettingItem.setting;
        if (hrIntervalSetting == null) {
            return;
        }
        hrIntervalSettingItem.f(hrIntervalSetting.getSettingData(), fragment, function1);
    }

    private final void e(int interval, Function1<? super Function0<Boolean>, Unit> settingFunc) {
        settingFunc.invoke(new a(interval));
    }

    private final void f(HealthSettingData<Integer> data, final Fragment fragment, final Function1<? super Function0<Boolean>, Unit> settingFunc) {
        final List<Integer> listSortZeroMax = HealthViewExtKt.sortZeroMax(data.getValueList());
        final int iIntValue = data.getValue().intValue();
        int iIndexOf = listSortZeroMax.indexOf(Integer.valueOf(iIntValue));
        AlertDialogFragment.Builder title = new AlertDialogFragment.Builder(fragment.requireActivity()).setTitle(AppResKt.getHealthStr().getAlldayHrFreq());
        AlertDialogFragment.ChoiceItems choiceItems = new AlertDialogFragment.ChoiceItems();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSortZeroMax, 10));
        Iterator<T> it2 = listSortZeroMax.iterator();
        while (it2.hasNext()) {
            arrayList.add(i(((Number) it2.next()).intValue()));
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        title.setSingleChoiceItems(choiceItems.setItems((String[]) array).setItemChoice(iIndexOf), new DialogInterface.OnClickListener() { // from class: k94
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                HrIntervalSettingItem.g(listSortZeroMax, iIntValue, this, settingFunc, fragment, dialogInterface, i);
            }
        }).setCancelable(true).show(fragment.getChildFragmentManager(), "allday hr dialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(List list, int i, final HrIntervalSettingItem hrIntervalSettingItem, final Function1 function1, Fragment fragment, DialogInterface dialogInterface, int i2) {
        final int iIntValue = ((Number) list.get(i2)).intValue();
        if (i != iIntValue) {
            DialogParams dialogParamsProcess = hrIntervalSettingItem.intervalDialogRuleEngine.process(new IntervalExp(i, iIntValue, hrIntervalSettingItem.device.isHuamiOs(), HealthDetect.INSTANCE.getHealthConfig().getUserConfig()));
            if (dialogParamsProcess == null) {
                hrIntervalSettingItem.e(iIntValue, function1);
            } else {
                new AlertDialogFragment.Builder(fragment.requireActivity()).setTitle(dialogParamsProcess.getTitle()).setMessage(dialogParamsProcess.getMessage()).setNegativeButton(dialogParamsProcess.getNegativeStr(), (DialogInterface.OnClickListener) null).setPositiveButton(dialogParamsProcess.getPositiveStr(), new DialogInterface.OnClickListener() { // from class: j94
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface2, int i3) {
                        HrIntervalSettingItem.h(this.a, iIntValue, function1, dialogInterface2, i3);
                    }
                }).show(fragment.getChildFragmentManager(), "hr detect dialog");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(HrIntervalSettingItem hrIntervalSettingItem, int i, Function1 function1, DialogInterface dialogInterface, int i2) {
        hrIntervalSettingItem.e(i, function1);
    }

    private final String i(int i) {
        if (i != -1) {
            return i != 0 ? AppResKt.getHealthStr().getTimeFormatMinute(i) : AppResKt.getHealthStr().getHrDetectClose();
        }
        return AppResKt.getHealthStr().getHrDetectAtrial();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    @Override // com.huami.device.feature.health.ui.item.SettingItem
    public void bindItemView(@NotNull final Fragment fragment, @NotNull ListTile itemView, @Nullable Integer cornerStyle, @NotNull final Function1<? super Function0<Boolean>, Unit> settingFunc) {
        boolean z;
        HealthSettingData<Integer> settingData;
        Integer value;
        HealthViewExtKt.setVisible(itemView, (this.setting == null || this.device.isForceHrAndRemEnable()) ? false : true);
        if (this.deviceEnable) {
            z = !HealthExt.INSTANCE.isSupportAtrial(this.device) || !HealthDetect.INSTANCE.getHealthConfig().getUserConfig().getAtrialFibEnable();
        }
        itemView.setEnabled(z);
        if (cornerStyle != null) {
            itemView.setRadiusPosition(cornerStyle.intValue());
        }
        itemView.setTitle(AppResKt.getHealthStr().getAlldayHrSettingTitleRes());
        itemView.setSubtitle(AppResKt.getHealthStr().getAlldayHrSettingSummaryRes());
        HealthViewExtKt.enableArrow(itemView);
        HealthViewExtKt.disableSwitch(itemView);
        HrIntervalSetting hrIntervalSetting = this.setting;
        if (hrIntervalSetting != null && (settingData = hrIntervalSetting.getSettingData()) != null && (value = settingData.getValue()) != null) {
            int iIntValue = value.intValue();
            if (HealthExt.INSTANCE.isSupportAtrial(this.device) && HealthDetect.INSTANCE.getHealthConfig().getUserConfig().getAtrialFibEnable()) {
                itemView.setTips(AppResKt.getHealthStr().getHrDetectAtrial());
                HealthViewExtKt.disableArrow(itemView);
            } else {
                itemView.setTips(i(iIntValue));
                HealthViewExtKt.enableArrow(itemView);
            }
        }
        itemView.setOnClickListener(new View.OnClickListener() { // from class: l94
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HrIntervalSettingItem.d(this.a, fragment, settingFunc, view);
            }
        });
    }

    @Override // com.huami.device.feature.health.ui.item.SettingItem, com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return SettingItem.DefaultImpls.getItemType(this);
    }
}
