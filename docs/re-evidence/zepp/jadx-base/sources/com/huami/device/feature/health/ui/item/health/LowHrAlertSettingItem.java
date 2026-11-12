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
import com.huami.device.feature.health.res.IAppRes;
import com.huami.device.feature.health.settings.LowHrAlertSetting;
import com.huami.device.feature.health.settings.device.SetToDevice;
import com.huami.device.feature.health.ui.item.SettingItem;
import com.huami.device.feature.health.ui.item.health.LowHrAlertSettingItem;
import com.huami.device.feature.health.user.HealthSettingConfig;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010\"\u001a\u00020\u000b¢\u0006\u0004\b#\u0010$J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J8\u0010\u000e\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\tH\u0002J\b\u0010\u000f\u001a\u00020\u000bH\u0002J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002JC\u0010\u0016\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/huami/device/feature/health/ui/item/health/LowHrAlertSettingItem;", "Lcom/huami/device/feature/health/ui/item/SettingItem;", "", "", GoogleApiAvailabilityLight.a, "Lcom/huami/device/feature/health/model/HealthSettingData;", "data", "Landroidx/fragment/app/Fragment;", "fragment", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "", "settingFunc", "g", "e", "enable", "supportAtrial", "f", "Lcom/huami/lib/rainbow/ListTile;", "itemView", "cornerStyle", "bindItemView", "(Landroidx/fragment/app/Fragment;Lcom/huami/lib/rainbow/ListTile;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "Lcom/huami/device/feature/health/settings/LowHrAlertSetting;", "a", "Lcom/huami/device/feature/health/settings/LowHrAlertSetting;", "setting", "Lcom/huami/device/feature/health/device/HealthDevice;", "b", "Lcom/huami/device/feature/health/device/HealthDevice;", "device", "c", "Z", "deviceEnable", "<init>", "(Lcom/huami/device/feature/health/settings/LowHrAlertSetting;Lcom/huami/device/feature/health/device/HealthDevice;Z)V", "health-ui_release"}, k = 1, mv = {1, 5, 1})
public final class LowHrAlertSettingItem implements SettingItem {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final LowHrAlertSetting setting;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final HealthDevice device;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean deviceEnable;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Boolean> {
        public final /* synthetic */ int b;

        /* JADX INFO: renamed from: com.huami.device.feature.health.ui.item.health.LowHrAlertSettingItem$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.device.feature.health.ui.item.health.LowHrAlertSettingItem$showLowHrAlertSetDialog$2$1$1", f = "LowHrAlertSettingItem.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0351a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            public int a;
            public final /* synthetic */ LowHrAlertSettingItem b;
            public final /* synthetic */ int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0351a(LowHrAlertSettingItem lowHrAlertSettingItem, int i, Continuation<? super C0351a> continuation) {
                super(2, continuation);
                this.b = lowHrAlertSettingItem;
                this.c = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0351a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
                return ((C0351a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    LowHrAlertSetting lowHrAlertSetting = this.b.setting;
                    if (lowHrAlertSetting != null && (setToDevice = lowHrAlertSetting.getSetToDevice()) != null) {
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
            return (Boolean) d.b(null, new C0351a(LowHrAlertSettingItem.this, this.b, null), 1, null);
        }
    }

    public LowHrAlertSettingItem(@Nullable LowHrAlertSetting lowHrAlertSetting, @NotNull HealthDevice healthDevice, boolean z) {
        this.setting = lowHrAlertSetting;
        this.device = healthDevice;
        this.deviceEnable = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(LowHrAlertSettingItem lowHrAlertSettingItem, Fragment fragment, Function1 function1, View view) {
        HealthSettingData<Integer> settingData;
        LowHrAlertSetting lowHrAlertSetting = lowHrAlertSettingItem.setting;
        if (lowHrAlertSetting == null || (settingData = lowHrAlertSetting.getSettingData()) == null) {
            return;
        }
        lowHrAlertSettingItem.g(settingData, fragment, function1);
    }

    private final String d(int i) {
        return i == 0 ? AppResKt.getHealthStr().getHrNotAlertRes() : AppResKt.getHealthStr().getHrWarnTimesFormat(i);
    }

    private final boolean e() {
        int i = this.device.isHuamiOs() ? 1 : 10;
        HealthSettingConfig userConfig = HealthDetect.INSTANCE.getHealthConfig().getUserConfig();
        if (this.device.isForceHrAndRemEnable()) {
            return true;
        }
        if (HealthExt.INSTANCE.isSupportAtrial(this.device)) {
            if (userConfig.getAtrialFibEnable()) {
                return true;
            }
            if (userConfig.getHrEnable() && userConfig.getFreq() <= i) {
                return true;
            }
        } else if (userConfig.getHrEnable() && userConfig.getFreq() <= i) {
            return true;
        }
        return false;
    }

    private final String f(boolean enable, boolean supportAtrial) {
        if (enable) {
            return AppResKt.getHealthStr().getLowHrWaringSettingEnableSummary();
        }
        IAppRes healthStr = AppResKt.getHealthStr();
        return supportAtrial ? healthStr.getHuamiOsHrWarningSettingDisableAtrialSummary() : healthStr.getHuamiOsHrWarningSettingDisableSummary();
    }

    private final void g(HealthSettingData<Integer> data, Fragment fragment, final Function1<? super Function0<Boolean>, Unit> settingFunc) {
        final List<Integer> listSortZeroMax = HealthViewExtKt.sortZeroMax(data.getValueList());
        final int iIntValue = data.getValue().intValue();
        AlertDialogFragment.Builder title = new AlertDialogFragment.Builder(fragment.requireActivity()).setTitle(AppResKt.getHealthStr().getLowHrWarningSettingTitle());
        AlertDialogFragment.ChoiceItems choiceItems = new AlertDialogFragment.ChoiceItems();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSortZeroMax, 10));
        Iterator<T> it2 = listSortZeroMax.iterator();
        while (it2.hasNext()) {
            arrayList.add(d(((Number) it2.next()).intValue()));
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        title.setSingleChoiceItems(choiceItems.setItems((String[]) array).setItemChoice(listSortZeroMax.indexOf(Integer.valueOf(iIntValue))), new DialogInterface.OnClickListener() { // from class: st4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                LowHrAlertSettingItem.h(listSortZeroMax, iIntValue, settingFunc, this, dialogInterface, i);
            }
        }).setCancelable(true).show(fragment.getChildFragmentManager(), "low hr alert dialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(List list, int i, Function1 function1, LowHrAlertSettingItem lowHrAlertSettingItem, DialogInterface dialogInterface, int i2) {
        int iIntValue = ((Number) list.get(i2)).intValue();
        if (i != iIntValue) {
            function1.invoke(lowHrAlertSettingItem.new a(iIntValue));
        }
    }

    @Override // com.huami.device.feature.health.ui.item.SettingItem
    public void bindItemView(@NotNull final Fragment fragment, @NotNull ListTile itemView, @Nullable Integer cornerStyle, @NotNull final Function1<? super Function0<Boolean>, Unit> settingFunc) {
        HealthSettingData<Integer> settingData;
        HealthViewExtKt.setVisible(itemView, this.setting != null);
        boolean zE = e();
        itemView.setEnabled(this.deviceEnable && zE);
        if (cornerStyle != null) {
            itemView.setRadiusPosition(cornerStyle.intValue());
        }
        itemView.setTitle(AppResKt.getHealthStr().getLowHrWarningSettingTitle());
        itemView.setSubtitle(f(zE, HealthExt.INSTANCE.isSupportAtrial(this.device)));
        HealthViewExtKt.enableArrow(itemView);
        HealthViewExtKt.disableSwitch(itemView);
        LowHrAlertSetting lowHrAlertSetting = this.setting;
        if (lowHrAlertSetting != null && (settingData = lowHrAlertSetting.getSettingData()) != null) {
            itemView.setTips(d(settingData.getValue().intValue()));
        }
        itemView.setOnClickListener(new View.OnClickListener() { // from class: tt4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LowHrAlertSettingItem.c(this.a, fragment, settingFunc, view);
            }
        });
    }

    @Override // com.huami.device.feature.health.ui.item.SettingItem, com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return SettingItem.DefaultImpls.getItemType(this);
    }
}
