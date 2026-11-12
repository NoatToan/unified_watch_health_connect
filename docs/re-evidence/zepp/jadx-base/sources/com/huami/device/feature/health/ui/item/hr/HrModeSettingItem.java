package com.huami.device.feature.health.ui.item.hr;

import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.device.feature.health.device.HealthDevice;
import com.huami.device.feature.health.model.HealthSettingData;
import com.huami.device.feature.health.res.AppResKt;
import com.huami.device.feature.health.settings.HrModeSetting;
import com.huami.device.feature.health.settings.device.SetToDevice;
import com.huami.device.feature.health.ui.item.SettingItem;
import com.huami.device.feature.health.ui.item.hr.HrModeSettingItem;
import com.huami.device.feature.health.util.HealthViewExtKt;
import com.huami.device.feature.health.util.HrModeExtKt;
import com.huami.lib.rainbow.ListTile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.g;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b#\u0010$J2\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0006H\u0002J2\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0006H\u0002J\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0010*\b\u0012\u0004\u0012\u00020\f0\u000fH\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\fH\u0002JC\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\f2\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/huami/device/feature/health/ui/item/hr/HrModeSettingItem;", "Lcom/huami/device/feature/health/ui/item/SettingItem;", "Landroidx/fragment/app/Fragment;", "fragment", "Lcom/huami/device/feature/health/settings/HrModeSetting;", "hrSetting", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "", "settingFunc", "f", "", "mode", "g", "Lcom/huami/device/feature/health/model/HealthSettingData;", "", "i", "", "e", "Lcom/huami/lib/rainbow/ListTile;", "itemView", "cornerStyle", "bindItemView", "(Landroidx/fragment/app/Fragment;Lcom/huami/lib/rainbow/ListTile;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "a", "Lcom/huami/device/feature/health/settings/HrModeSetting;", "setting", "Lcom/huami/device/feature/health/device/HealthDevice;", "b", "Lcom/huami/device/feature/health/device/HealthDevice;", "device", "c", "Z", "deviceEnable", "<init>", "(Lcom/huami/device/feature/health/settings/HrModeSetting;Lcom/huami/device/feature/health/device/HealthDevice;Z)V", "health-ui_release"}, k = 1, mv = {1, 5, 1})
public final class HrModeSettingItem implements SettingItem {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final HrModeSetting setting;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final HealthDevice device;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean deviceEnable;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Boolean> {
        public final /* synthetic */ int b;

        /* JADX INFO: renamed from: com.huami.device.feature.health.ui.item.hr.HrModeSettingItem$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.device.feature.health.ui.item.hr.HrModeSettingItem$showHrBatteryDialog$1$1$1", f = "HrModeSettingItem.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0360a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            public int a;
            public final /* synthetic */ HrModeSettingItem b;
            public final /* synthetic */ int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0360a(HrModeSettingItem hrModeSettingItem, int i, Continuation<? super C0360a> continuation) {
                super(2, continuation);
                this.b = hrModeSettingItem;
                this.c = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0360a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
                return ((C0360a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    HrModeSetting hrModeSetting = this.b.setting;
                    if (hrModeSetting != null && (setToDevice = hrModeSetting.getSetToDevice()) != null) {
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
            return (Boolean) d.b(null, new C0360a(HrModeSettingItem.this, this.b, null), 1, null);
        }
    }

    public HrModeSettingItem(@Nullable HrModeSetting hrModeSetting, @NotNull HealthDevice healthDevice, boolean z) {
        this.setting = hrModeSetting;
        this.device = healthDevice;
        this.deviceEnable = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(HrModeSettingItem hrModeSettingItem, Fragment fragment, Function1 function1, View view) {
        HrModeSetting hrModeSetting = hrModeSettingItem.setting;
        if (hrModeSetting == null) {
            return;
        }
        hrModeSettingItem.f(fragment, hrModeSetting, function1);
    }

    private final String e(int mode) {
        if (mode != 3) {
            return mode != 4 ? AppResKt.getHealthStr().getHrModeAutoOrSleepWarning() : AppResKt.getHealthStr().getHrModeAtrialWarning();
        }
        return AppResKt.getHealthStr().getHrModeAutoSleepWarning();
    }

    private final void f(final Fragment fragment, HrModeSetting hrSetting, final Function1<? super Function0<Boolean>, Unit> settingFunc) {
        final int iIntValue = hrSetting.getData().intValue();
        final List<Integer> listI = i(hrSetting.getSettingData());
        int iIndexOf = listI.indexOf(Integer.valueOf(iIntValue));
        AlertDialogFragment.ChoiceItems choiceItems = new AlertDialogFragment.ChoiceItems();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listI, 10));
        Iterator<T> it2 = listI.iterator();
        while (it2.hasNext()) {
            arrayList.add(HrModeExtKt.getHrDetectModelResId(((Number) it2.next()).intValue(), this.device.getDeviceSource()));
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        AlertDialogFragment.ChoiceItems items = choiceItems.setItems((String[]) array);
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listI, 10));
        Iterator<T> it3 = listI.iterator();
        while (it3.hasNext()) {
            arrayList2.add(HrModeExtKt.getNormalDetectModelSummaryRes(((Number) it3.next()).intValue()));
        }
        Object[] array2 = arrayList2.toArray(new String[0]);
        Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
        new AlertDialogFragment.Builder(fragment.requireActivity()).setTitle(AppResKt.getHealthStr().getHrDetectMode()).setSingleChoiceItems(items.setItemsSummaries((String[]) array2).setItemChoice(iIndexOf), new DialogInterface.OnClickListener() { // from class: com.huami.device.feature.health.ui.item.hr.HrModeSettingItem$setHrDetectType$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<Boolean> {
                public final /* synthetic */ HrModeSettingItem a;
                public final /* synthetic */ int b;

                /* JADX INFO: renamed from: com.huami.device.feature.health.ui.item.hr.HrModeSettingItem$setHrDetectType$1$a$a, reason: collision with other inner class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.device.feature.health.ui.item.hr.HrModeSettingItem$setHrDetectType$1$onClick$1$1", f = "HrModeSettingItem.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
                public static final class C0361a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
                    public int a;
                    public final /* synthetic */ HrModeSettingItem b;
                    public final /* synthetic */ int c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0361a(HrModeSettingItem hrModeSettingItem, int i, Continuation<? super C0361a> continuation) {
                        super(2, continuation);
                        this.b = hrModeSettingItem;
                        this.c = i;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new C0361a(this.b, this.c, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
                        return ((C0361a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                            HrModeSetting hrModeSetting = this.b.setting;
                            if (hrModeSetting != null && (setToDevice = hrModeSetting.getSetToDevice()) != null) {
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
                public a(HrModeSettingItem hrModeSettingItem, int i) {
                    super(0);
                    this.a = hrModeSettingItem;
                    this.b = i;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* JADX INFO: renamed from: invoke */
                public final Boolean getA() {
                    return (Boolean) d.b(null, new C0361a(this.a, this.b, null), 1, null);
                }
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(@Nullable DialogInterface dialog, int position) {
                int iIntValue2 = listI.get(position).intValue();
                if (listI.get(position).intValue() == iIntValue) {
                    return;
                }
                if (iIntValue2 == 0) {
                    settingFunc.invoke(new a(this, iIntValue2));
                } else {
                    this.g(iIntValue2, fragment, settingFunc);
                }
            }
        }).setCancelable(false).show(fragment.getChildFragmentManager(), "hr mode select");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(final int mode, Fragment fragment, final Function1<? super Function0<Boolean>, Unit> settingFunc) {
        new AlertDialogFragment.Builder(fragment.requireActivity()).setMessage(e(mode)).setNegativeButton(AppResKt.getHealthStr().getBtnCancel(), (DialogInterface.OnClickListener) null).setPositiveButton(AppResKt.getHealthStr().getBtnYes(), new DialogInterface.OnClickListener() { // from class: q94
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                HrModeSettingItem.h(settingFunc, this, mode, dialogInterface, i);
            }
        }).setCancelable(true).show(fragment.getChildFragmentManager(), "hr battery dialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Function1 function1, HrModeSettingItem hrModeSettingItem, int i, DialogInterface dialogInterface, int i2) {
        function1.invoke(hrModeSettingItem.new a(i));
    }

    private final List<Integer> i(HealthSettingData<Integer> healthSettingData) {
        List<Integer> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) healthSettingData.getValueList());
        g.sortWith(mutableList, new Comparator() { // from class: s94
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return HrModeSettingItem.j((Integer) obj, (Integer) obj2);
            }
        });
        return mutableList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int j(Integer num, Integer num2) {
        if (num != null && num.intValue() == 0) {
            return 1;
        }
        return Intrinsics.compare(num2.intValue(), num.intValue());
    }

    @Override // com.huami.device.feature.health.ui.item.SettingItem
    public void bindItemView(@NotNull final Fragment fragment, @NotNull ListTile itemView, @Nullable Integer cornerStyle, @NotNull final Function1<? super Function0<Boolean>, Unit> settingFunc) {
        HealthSettingData<Integer> settingData;
        HealthViewExtKt.setVisible(itemView, (this.setting == null || this.device.isForceHrAndRemEnable()) ? false : true);
        itemView.setEnabled(this.deviceEnable);
        if (cornerStyle != null) {
            itemView.setRadiusPosition(cornerStyle.intValue());
        }
        itemView.setTitle(AppResKt.getHealthStr().getHrDetectMode());
        itemView.setSubtitle(this.device.isWatch() ? AppResKt.getHealthStr().getHrModeSummaryWatch() : AppResKt.getHealthStr().getHrModeSummary());
        HealthViewExtKt.enableArrow(itemView);
        HealthViewExtKt.disableSwitch(itemView);
        HrModeSetting hrModeSetting = this.setting;
        if (hrModeSetting != null && (settingData = hrModeSetting.getSettingData()) != null) {
            itemView.setTips(HrModeExtKt.getHrDetectModelResId(settingData.getValue().intValue(), this.device.getDeviceSource()));
        }
        itemView.setOnClickListener(new View.OnClickListener() { // from class: r94
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HrModeSettingItem.d(this.a, fragment, settingFunc, view);
            }
        });
    }

    @Override // com.huami.device.feature.health.ui.item.SettingItem, com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return SettingItem.DefaultImpls.getItemType(this);
    }
}
