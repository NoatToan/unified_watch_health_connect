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
import com.huami.device.feature.health.settings.HighHrAlertSetting;
import com.huami.device.feature.health.settings.device.SetToDevice;
import com.huami.device.feature.health.ui.item.SettingItem;
import com.huami.device.feature.health.ui.item.health.HighHrAlertSettingItem;
import com.huami.device.feature.health.user.HealthSettingConfig;
import com.huami.device.feature.health.util.HealthExt;
import com.huami.device.feature.health.util.HealthViewExtKt;
import com.huami.lib.rainbow.ListTile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010#\u001a\u00020\t¢\u0006\u0004\b$\u0010%J8\u0010\f\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u0007H\u0002J\f\u0010\u000e\u001a\u00020\r*\u00020\u0003H\u0002J\b\u0010\u000f\u001a\u00020\tH\u0002J \u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0002JC\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/huami/device/feature/health/ui/item/health/HighHrAlertSettingItem;", "Lcom/huami/device/feature/health/ui/item/SettingItem;", "Lcom/huami/device/feature/health/model/HealthSettingData;", "", "data", "Landroidx/fragment/app/Fragment;", "fragment", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "", "settingFunc", "g", "", GoogleApiAvailabilityLight.a, "e", "enable", "huamiOs", "supportAtrial", "f", "Lcom/huami/lib/rainbow/ListTile;", "itemView", "cornerStyle", "bindItemView", "(Landroidx/fragment/app/Fragment;Lcom/huami/lib/rainbow/ListTile;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "Lcom/huami/device/feature/health/settings/HighHrAlertSetting;", "a", "Lcom/huami/device/feature/health/settings/HighHrAlertSetting;", "setting", "Lcom/huami/device/feature/health/device/HealthDevice;", "b", "Lcom/huami/device/feature/health/device/HealthDevice;", "device", "c", "Z", "deviceEnable", "<init>", "(Lcom/huami/device/feature/health/settings/HighHrAlertSetting;Lcom/huami/device/feature/health/device/HealthDevice;Z)V", "health-ui_release"}, k = 1, mv = {1, 5, 1})
public final class HighHrAlertSettingItem implements SettingItem {

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
        public final /* synthetic */ int b;

        /* JADX INFO: renamed from: com.huami.device.feature.health.ui.item.health.HighHrAlertSettingItem$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.device.feature.health.ui.item.health.HighHrAlertSettingItem$showHrAlertSetDialog$2$1$1", f = "HighHrAlertSettingItem.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0349a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            public int a;
            public final /* synthetic */ HighHrAlertSettingItem b;
            public final /* synthetic */ int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0349a(HighHrAlertSettingItem highHrAlertSettingItem, int i, Continuation<? super C0349a> continuation) {
                super(2, continuation);
                this.b = highHrAlertSettingItem;
                this.c = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0349a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
                return ((C0349a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            return (Boolean) d.b(null, new C0349a(HighHrAlertSettingItem.this, this.b, null), 1, null);
        }
    }

    public HighHrAlertSettingItem(@Nullable HighHrAlertSetting highHrAlertSetting, @NotNull HealthDevice healthDevice, boolean z) {
        this.setting = highHrAlertSetting;
        this.device = healthDevice;
        this.deviceEnable = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(HighHrAlertSettingItem highHrAlertSettingItem, Fragment fragment, Function1 function1, View view) {
        HealthSettingData<Integer> settingData;
        HighHrAlertSetting highHrAlertSetting = highHrAlertSettingItem.setting;
        if (highHrAlertSetting == null || (settingData = highHrAlertSetting.getSettingData()) == null) {
            return;
        }
        highHrAlertSettingItem.g(settingData, fragment, function1);
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

    private final String f(boolean enable, boolean huamiOs, boolean supportAtrial) {
        if (enable) {
            return huamiOs ? AppResKt.getHealthStr().getHighHrWaringSettingEnableSummary() : AppResKt.getHealthStr().getHrWarnSettingSummary();
        }
        if (!huamiOs) {
            return AppResKt.getHealthStr().getHrWarnSettingFreqSummary();
        }
        IAppRes healthStr = AppResKt.getHealthStr();
        return supportAtrial ? healthStr.getHuamiOsHrWarningSettingDisableAtrialSummary() : healthStr.getHuamiOsHrWarningSettingDisableSummary();
    }

    private final void g(HealthSettingData<Integer> data, Fragment fragment, final Function1<? super Function0<Boolean>, Unit> settingFunc) {
        List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) data.getValueList());
        if (!mutableList.contains(0)) {
            mutableList.add(0);
        }
        final List<Integer> listSortZeroMax = HealthViewExtKt.sortZeroMax(mutableList);
        final int iIntValue = data.getValue().intValue();
        AlertDialogFragment.Builder title = new AlertDialogFragment.Builder(fragment.requireActivity()).setTitle(this.device.isHuamiOs() ? AppResKt.getHealthStr().getHighHrWarnSettingTitle() : AppResKt.getHealthStr().getHrWarnValueSettingTitle());
        AlertDialogFragment.ChoiceItems choiceItems = new AlertDialogFragment.ChoiceItems();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSortZeroMax, 10));
        Iterator<T> it2 = listSortZeroMax.iterator();
        while (it2.hasNext()) {
            arrayList.add(d(((Number) it2.next()).intValue()));
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        title.setSingleChoiceItems(choiceItems.setItems((String[]) array).setItemChoice(listSortZeroMax.indexOf(Integer.valueOf(iIntValue))), new DialogInterface.OnClickListener() { // from class: o04
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                HighHrAlertSettingItem.h(listSortZeroMax, iIntValue, settingFunc, this, dialogInterface, i);
            }
        }).setCancelable(true).show(fragment.getChildFragmentManager(), "hr alert dialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(List list, int i, Function1 function1, HighHrAlertSettingItem highHrAlertSettingItem, DialogInterface dialogInterface, int i2) {
        int iIntValue = ((Number) list.get(i2)).intValue();
        if (i != iIntValue) {
            function1.invoke(highHrAlertSettingItem.new a(iIntValue));
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
        itemView.setTitle(this.device.isHuamiOs() ? AppResKt.getHealthStr().getHighHrWarnSettingTitle() : AppResKt.getHealthStr().getHrWarnSettingTitle());
        itemView.setSubtitle(f(zE, this.device.isHuamiOs(), HealthExt.INSTANCE.isSupportAtrial(this.device)));
        HealthViewExtKt.enableArrow(itemView);
        HealthViewExtKt.disableSwitch(itemView);
        HighHrAlertSetting highHrAlertSetting = this.setting;
        if (highHrAlertSetting != null && (settingData = highHrAlertSetting.getSettingData()) != null) {
            itemView.setTips(d(settingData.getValue().intValue()));
        }
        itemView.setOnClickListener(new View.OnClickListener() { // from class: p04
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HighHrAlertSettingItem.c(this.a, fragment, settingFunc, view);
            }
        });
    }

    @Override // com.huami.device.feature.health.ui.item.SettingItem, com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return SettingItem.DefaultImpls.getItemType(this);
    }
}
