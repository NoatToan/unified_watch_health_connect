package com.huami.device.feature.health.ui.item.hr;

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
import com.huami.device.feature.health.ui.item.SettingItem;
import com.huami.device.feature.health.ui.item.hr.HrIntervalSettingItem;
import com.huami.device.feature.health.user.HealthSettingConfig;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001fJ8\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u0007H\u0002J\f\u0010\u000e\u001a\u00020\r*\u00020\u0005H\u0002JC\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001c¨\u0006 "}, d2 = {"Lcom/huami/device/feature/health/ui/item/hr/HrIntervalSettingItem;", "Lcom/huami/device/feature/health/ui/item/SettingItem;", "Landroidx/fragment/app/Fragment;", "fragment", "Lcom/huami/device/feature/health/model/HealthSettingData;", "", "data", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "", "settingFunc", GoogleApiAvailabilityLight.a, "", "c", "Lcom/huami/lib/rainbow/ListTile;", "itemView", "cornerStyle", "bindItemView", "(Landroidx/fragment/app/Fragment;Lcom/huami/lib/rainbow/ListTile;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "Lcom/huami/device/feature/health/settings/HrIntervalSetting;", "a", "Lcom/huami/device/feature/health/settings/HrIntervalSetting;", "setting", "Lcom/huami/device/feature/health/device/HealthDevice;", "b", "Lcom/huami/device/feature/health/device/HealthDevice;", "device", "Z", "deviceEnable", "<init>", "(Lcom/huami/device/feature/health/settings/HrIntervalSetting;Lcom/huami/device/feature/health/device/HealthDevice;Z)V", "health-ui_release"}, k = 1, mv = {1, 5, 1})
public final class HrIntervalSettingItem implements SettingItem {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final HrIntervalSetting setting;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final HealthDevice device;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean deviceEnable;

    public HrIntervalSettingItem(@Nullable HrIntervalSetting hrIntervalSetting, @NotNull HealthDevice healthDevice, boolean z) {
        this.setting = hrIntervalSetting;
        this.device = healthDevice;
        this.deviceEnable = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(HrIntervalSettingItem hrIntervalSettingItem, Fragment fragment, Function1 function1, View view) {
        HealthSettingData<Integer> settingData;
        HrIntervalSetting hrIntervalSetting = hrIntervalSettingItem.setting;
        if (hrIntervalSetting == null || (settingData = hrIntervalSetting.getSettingData()) == null) {
            return;
        }
        hrIntervalSettingItem.d(fragment, settingData, function1);
    }

    private final String c(int i) {
        return i == 0 ? AppResKt.getHealthStr().getClose() : AppResKt.getHealthStr().getTimeFormatMinute(i);
    }

    private final void d(Fragment fragment, HealthSettingData<Integer> data, final Function1<? super Function0<Boolean>, Unit> settingFunc) {
        final int iIntValue = data.getValue().intValue();
        final List<Integer> listSortZeroMax = HealthViewExtKt.sortZeroMax(data.getValueList());
        int iIndexOf = listSortZeroMax.indexOf(Integer.valueOf(iIntValue));
        AlertDialogFragment.ChoiceItems choiceItems = new AlertDialogFragment.ChoiceItems();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSortZeroMax, 10));
        Iterator<T> it2 = listSortZeroMax.iterator();
        while (it2.hasNext()) {
            arrayList.add(c(((Number) it2.next()).intValue()));
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        new AlertDialogFragment.Builder(fragment.requireActivity()).setTitle(AppResKt.getHealthStr().getHrFreq()).setSingleChoiceItems(choiceItems.setItems((String[]) array).setItemChoice(iIndexOf), new DialogInterface.OnClickListener() { // from class: com.huami.device.feature.health.ui.item.hr.HrIntervalSettingItem$setHrFreq$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<Boolean> {
                public final /* synthetic */ HrIntervalSettingItem a;
                public final /* synthetic */ int b;

                /* JADX INFO: renamed from: com.huami.device.feature.health.ui.item.hr.HrIntervalSettingItem$setHrFreq$1$a$a, reason: collision with other inner class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.device.feature.health.ui.item.hr.HrIntervalSettingItem$setHrFreq$1$onClick$1$1", f = "HrIntervalSettingItem.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
                public static final class C0359a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
                    public int a;
                    public final /* synthetic */ HrIntervalSettingItem b;
                    public final /* synthetic */ int c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0359a(HrIntervalSettingItem hrIntervalSettingItem, int i, Continuation<? super C0359a> continuation) {
                        super(2, continuation);
                        this.b = hrIntervalSettingItem;
                        this.c = i;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new C0359a(this.b, this.c, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
                        return ((C0359a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                public a(HrIntervalSettingItem hrIntervalSettingItem, int i) {
                    super(0);
                    this.a = hrIntervalSettingItem;
                    this.b = i;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* JADX INFO: renamed from: invoke */
                public final Boolean getA() {
                    return (Boolean) d.b(null, new C0359a(this.a, this.b, null), 1, null);
                }
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(@Nullable DialogInterface dialog, int position) {
                int iIntValue2 = listSortZeroMax.get(position).intValue();
                if (listSortZeroMax.get(position).intValue() == iIntValue) {
                    return;
                }
                settingFunc.invoke(new a(this, iIntValue2));
            }
        }).setCancelable(false).show(fragment.getChildFragmentManager(), "hr mode select");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    @Override // com.huami.device.feature.health.ui.item.SettingItem
    public void bindItemView(@NotNull final Fragment fragment, @NotNull ListTile itemView, @Nullable Integer cornerStyle, @NotNull final Function1<? super Function0<Boolean>, Unit> settingFunc) {
        boolean z;
        HealthSettingData<Integer> settingData;
        Integer value;
        HealthViewExtKt.setVisible(itemView, (this.setting == null || this.device.isForceHrAndRemEnable()) ? false : true);
        if (this.deviceEnable) {
            HealthSettingConfig userConfig = HealthDetect.INSTANCE.getHealthConfig().getUserConfig();
            z = userConfig.getHrDetectType() == 2 || userConfig.getHrDetectType() == 3;
        }
        itemView.setEnabled(z);
        if (cornerStyle != null) {
            itemView.setRadiusPosition(cornerStyle.intValue());
        }
        itemView.setTitle(AppResKt.getHealthStr().getHrFreq());
        itemView.setSubtitle(AppResKt.getHealthStr().getHrFreqSummary());
        HealthViewExtKt.enableArrow(itemView);
        HealthViewExtKt.disableSwitch(itemView);
        HrIntervalSetting hrIntervalSetting = this.setting;
        if (hrIntervalSetting != null && (settingData = hrIntervalSetting.getSettingData()) != null && (value = settingData.getValue()) != null) {
            itemView.setTips(c(value.intValue()));
        }
        itemView.setOnClickListener(new View.OnClickListener() { // from class: m94
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HrIntervalSettingItem.b(this.a, fragment, settingFunc, view);
            }
        });
    }

    @Override // com.huami.device.feature.health.ui.item.SettingItem, com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return SettingItem.DefaultImpls.getItemType(this);
    }
}
