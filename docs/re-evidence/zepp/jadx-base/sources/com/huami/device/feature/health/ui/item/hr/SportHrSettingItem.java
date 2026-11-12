package com.huami.device.feature.health.ui.item.hr;

import android.content.DialogInterface;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.device.feature.health.HealthDetect;
import com.huami.device.feature.health.device.HealthDevice;
import com.huami.device.feature.health.res.AppResKt;
import com.huami.device.feature.health.settings.SportHrSetting;
import com.huami.device.feature.health.settings.device.SetToDevice;
import com.huami.device.feature.health.ui.item.SettingItem;
import com.huami.device.feature.health.ui.item.hr.SportHrSettingItem;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ2\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0006H\u0002JC\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/huami/device/feature/health/ui/item/hr/SportHrSettingItem;", "Lcom/huami/device/feature/health/ui/item/SettingItem;", "Landroidx/fragment/app/Fragment;", "fragment", "Lcom/huami/lib/rainbow/ListTile;", "itemView", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "", "settingFunc", "e", "", "cornerStyle", "bindItemView", "(Landroidx/fragment/app/Fragment;Lcom/huami/lib/rainbow/ListTile;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "Lcom/huami/device/feature/health/settings/SportHrSetting;", "a", "Lcom/huami/device/feature/health/settings/SportHrSetting;", "setting", "Lcom/huami/device/feature/health/device/HealthDevice;", "b", "Lcom/huami/device/feature/health/device/HealthDevice;", "device", "c", "Z", "deviceEnable", "<init>", "(Lcom/huami/device/feature/health/settings/SportHrSetting;Lcom/huami/device/feature/health/device/HealthDevice;Z)V", "health-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SportHrSettingItem implements SettingItem {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final SportHrSetting setting;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final HealthDevice device;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean deviceEnable;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: com.huami.device.feature.health.ui.item.hr.SportHrSettingItem$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.device.feature.health.ui.item.hr.SportHrSettingItem$bindItemView$3$2$1$1", f = "SportHrSettingItem.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0366a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            public int a;
            public final /* synthetic */ SportHrSettingItem b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0366a(SportHrSettingItem sportHrSettingItem, Continuation<? super C0366a> continuation) {
                super(2, continuation);
                this.b = sportHrSettingItem;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0366a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
                return ((C0366a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                boolean z = false;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SetToDevice<Boolean> setToDevice = this.b.setting.getSetToDevice();
                    if (setToDevice != null) {
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
            return (Boolean) d.b(null, new C0366a(SportHrSettingItem.this, null), 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Boolean> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.device.feature.health.ui.item.hr.SportHrSettingItem$showSportHrDialog$2$1$1", f = "SportHrSettingItem.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            public int a;
            public final /* synthetic */ SportHrSettingItem b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SportHrSettingItem sportHrSettingItem, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = sportHrSettingItem;
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
                    SportHrSetting sportHrSetting = this.b.setting;
                    if (sportHrSetting != null && (setToDevice = sportHrSetting.getSetToDevice()) != null) {
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
            return (Boolean) d.b(null, new a(SportHrSettingItem.this, null), 1, null);
        }
    }

    public SportHrSettingItem(@Nullable SportHrSetting sportHrSetting, @NotNull HealthDevice healthDevice, boolean z) {
        this.setting = sportHrSetting;
        this.device = healthDevice;
        this.deviceEnable = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(SportHrSettingItem sportHrSettingItem, Fragment fragment, ListTile listTile, Function1 function1, CompoundButton compoundButton, boolean z) {
        SportHrSetting sportHrSetting = sportHrSettingItem.setting;
        if (sportHrSetting == null) {
            return;
        }
        if (!compoundButton.isPressed()) {
            sportHrSetting = null;
        }
        if (sportHrSetting == null) {
            return;
        }
        if (z) {
            sportHrSettingItem.e(fragment, listTile, function1);
        } else {
            function1.invoke(sportHrSettingItem.new a());
        }
    }

    private final void e(Fragment fragment, final ListTile itemView, final Function1<? super Function0<Boolean>, Unit> settingFunc) {
        new AlertDialogFragment.Builder(fragment.requireActivity()).setMessage(AppResKt.getHealthStr().getHrBatteryTips()).setNegativeButton(AppResKt.getHealthStr().getBtnCancel(), new DialogInterface.OnClickListener() { // from class: ja7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SportHrSettingItem.f(itemView, dialogInterface, i);
            }
        }).setPositiveButton(AppResKt.getHealthStr().getBtnYes(), new DialogInterface.OnClickListener() { // from class: ka7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SportHrSettingItem.g(settingFunc, this, dialogInterface, i);
            }
        }).setCancelable(false).show(fragment.getChildFragmentManager(), "sport hr dialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(ListTile listTile, DialogInterface dialogInterface, int i) {
        listTile.setChecked(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Function1 function1, SportHrSettingItem sportHrSettingItem, DialogInterface dialogInterface, int i) {
        function1.invoke(sportHrSettingItem.new b());
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0034  */
    @Override // com.huami.device.feature.health.ui.item.SettingItem
    public void bindItemView(@NotNull final Fragment fragment, @NotNull final ListTile itemView, @Nullable Integer cornerStyle, @NotNull final Function1<? super Function0<Boolean>, Unit> settingFunc) {
        boolean z;
        HealthViewExtKt.setVisible(itemView, (this.setting == null || this.device.isForceHrAndRemEnable()) ? false : true);
        if (this.deviceEnable) {
            int hrDetectType = HealthDetect.INSTANCE.getHealthConfig().getUserConfig().getHrDetectType();
            if (hrDetectType == 2 || hrDetectType == 3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        itemView.setEnabled(z);
        if (cornerStyle != null) {
            itemView.setRadiusPosition(cornerStyle.intValue());
        }
        itemView.setTitle(AppResKt.getHealthStr().getSportHr());
        itemView.setSubtitle(AppResKt.getHealthStr().getSportHrTips());
        SportHrSetting sportHrSetting = this.setting;
        itemView.setChecked(sportHrSetting != null && sportHrSetting.getData().booleanValue());
        itemView.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: la7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                SportHrSettingItem.d(this.a, fragment, itemView, settingFunc, compoundButton, z2);
            }
        });
    }

    @Override // com.huami.device.feature.health.ui.item.SettingItem, com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return SettingItem.DefaultImpls.getItemType(this);
    }
}
