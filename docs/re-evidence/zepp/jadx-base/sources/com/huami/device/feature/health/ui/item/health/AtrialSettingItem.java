package com.huami.device.feature.health.ui.item.health;

import android.content.DialogInterface;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.device.feature.health.device.HealthDevice;
import com.huami.device.feature.health.res.AppResKt;
import com.huami.device.feature.health.settings.AtrialSetting;
import com.huami.device.feature.health.settings.device.SetToDevice;
import com.huami.device.feature.health.ui.item.SettingItem;
import com.huami.device.feature.health.ui.item.health.AtrialSettingItem;
import com.huami.device.feature.health.ui.medical.MedicalResource;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ2\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0006H\u0002JC\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/huami/device/feature/health/ui/item/health/AtrialSettingItem;", "Lcom/huami/device/feature/health/ui/item/SettingItem;", "Landroidx/fragment/app/Fragment;", "fragment", "Lcom/huami/lib/rainbow/ListTile;", "itemView", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "", "settingFunc", "e", "", "cornerStyle", "bindItemView", "(Landroidx/fragment/app/Fragment;Lcom/huami/lib/rainbow/ListTile;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "Lcom/huami/device/feature/health/settings/AtrialSetting;", "a", "Lcom/huami/device/feature/health/settings/AtrialSetting;", "setting", "Lcom/huami/device/feature/health/device/HealthDevice;", "b", "Lcom/huami/device/feature/health/device/HealthDevice;", "device", "c", "Z", "deviceEnable", "<init>", "(Lcom/huami/device/feature/health/settings/AtrialSetting;Lcom/huami/device/feature/health/device/HealthDevice;Z)V", "health-ui_release"}, k = 1, mv = {1, 5, 1})
public final class AtrialSettingItem implements SettingItem {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final AtrialSetting setting;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final HealthDevice device;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean deviceEnable;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: com.huami.device.feature.health.ui.item.health.AtrialSettingItem$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.device.feature.health.ui.item.health.AtrialSettingItem$bindItemView$2$1$1", f = "AtrialSettingItem.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0346a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            public int a;
            public final /* synthetic */ AtrialSettingItem b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0346a(AtrialSettingItem atrialSettingItem, Continuation<? super C0346a> continuation) {
                super(2, continuation);
                this.b = atrialSettingItem;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0346a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
                return ((C0346a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    AtrialSetting atrialSetting = this.b.setting;
                    if (atrialSetting != null && (setToDevice = atrialSetting.getSetToDevice()) != null) {
                        Boolean boolBoxBoolean = Boxing.boxBoolean(false);
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

        public a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final Boolean getA() {
            return (Boolean) d.b(null, new C0346a(AtrialSettingItem.this, null), 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Boolean> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.device.feature.health.ui.item.health.AtrialSettingItem$showAtrialFibDialog$2$1$1", f = "AtrialSettingItem.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            public int a;
            public final /* synthetic */ AtrialSettingItem b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AtrialSettingItem atrialSettingItem, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = atrialSettingItem;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    AtrialSetting atrialSetting = this.b.setting;
                    if (atrialSetting != null && (setToDevice = atrialSetting.getSetToDevice()) != null) {
                        Boolean boolBoxBoolean = Boxing.boxBoolean(true);
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

        public b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final Boolean getA() {
            return (Boolean) d.b(null, new a(AtrialSettingItem.this, null), 1, null);
        }
    }

    public AtrialSettingItem(@Nullable AtrialSetting atrialSetting, @NotNull HealthDevice healthDevice, boolean z) {
        this.setting = atrialSetting;
        this.device = healthDevice;
        this.deviceEnable = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(AtrialSettingItem atrialSettingItem, Fragment fragment, ListTile listTile, Function1 function1, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            if (z) {
                atrialSettingItem.e(fragment, listTile, function1);
            } else {
                function1.invoke(atrialSettingItem.new a());
            }
        }
    }

    private final void e(Fragment fragment, final ListTile itemView, final Function1<? super Function0<Boolean>, Unit> settingFunc) {
        new AlertDialogFragment.Builder(fragment.requireActivity()).setTitle(AppResKt.getHealthStr().getHrAtrialFib()).setMessage(AppResKt.getHealthStr().getAtrialFibWarning()).setNegativeButton(AppResKt.getHealthStr().getBtnCancel(), new DialogInterface.OnClickListener() { // from class: cj
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                AtrialSettingItem.f(itemView, dialogInterface, i);
            }
        }).setPositiveButton(AppResKt.getHealthStr().getBtnYes(), new DialogInterface.OnClickListener() { // from class: dj
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                AtrialSettingItem.g(settingFunc, this, dialogInterface, i);
            }
        }).show(fragment.getChildFragmentManager(), "osa warn dialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(ListTile listTile, DialogInterface dialogInterface, int i) {
        listTile.setChecked(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Function1 function1, AtrialSettingItem atrialSettingItem, DialogInterface dialogInterface, int i) {
        function1.invoke(atrialSettingItem.new b());
    }

    @Override // com.huami.device.feature.health.ui.item.SettingItem
    public void bindItemView(@NotNull final Fragment fragment, @NotNull final ListTile itemView, @Nullable Integer cornerStyle, @NotNull final Function1<? super Function0<Boolean>, Unit> settingFunc) {
        Boolean data;
        boolean zBooleanValue = false;
        HealthViewExtKt.setVisible(itemView, this.setting != null);
        itemView.setEnabled(this.deviceEnable);
        if (cornerStyle != null) {
            itemView.setRadiusPosition(cornerStyle.intValue());
        }
        itemView.setTitle(AppResKt.getHealthStr().getHrAtrialFib());
        itemView.setSubtitle(MedicalResource.INSTANCE.get().getAtrial_fib_summary());
        AtrialSetting atrialSetting = this.setting;
        if (atrialSetting != null && (data = atrialSetting.getData()) != null) {
            zBooleanValue = data.booleanValue();
        }
        itemView.setChecked(zBooleanValue);
        itemView.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ej
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                AtrialSettingItem.d(this.a, fragment, itemView, settingFunc, compoundButton, z);
            }
        });
    }

    @Override // com.huami.device.feature.health.ui.item.SettingItem, com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return SettingItem.DefaultImpls.getItemType(this);
    }
}
