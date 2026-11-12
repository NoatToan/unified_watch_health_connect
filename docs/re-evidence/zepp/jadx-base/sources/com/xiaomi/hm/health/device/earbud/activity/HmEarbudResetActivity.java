package com.xiaomi.hm.health.device.earbud.activity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelLazy;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.devicex.R;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HmEarbudDevice;
import com.xiaomi.hm.health.device.BaseEarbudDeviceActivity;
import com.xiaomi.hm.health.device.earbud.activity.HmEarbudResetActivity;
import com.xiaomi.hm.health.device.earbud.model.EarbudLoadingType;
import com.xiaomi.hm.health.device.earbud.view.EarbudImageView;
import com.xiaomi.hm.health.device.earbud.viewmodel.EarbudDeviceViewModel;
import com.xiaomi.hm.health.device.event.HmDeviceResetEvent;
import de.greenrobot.event.EventBus;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\t\u001a\u00020\u0003H\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u001d\u0010\u0011\u001a\u00020\u00028T@\u0014X\u0094\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/activity/HmEarbudResetActivity;", "Lcom/xiaomi/hm/health/device/BaseEarbudDeviceActivity;", "Lcom/xiaomi/hm/health/device/earbud/viewmodel/EarbudDeviceViewModel;", "", "initView", GoogleApiAvailabilityLight.b, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "observeData", "Lcom/xiaomi/hm/health/device/earbud/model/EarbudLoadingType;", "type", "onLoadingSuccess", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "getMViewModel", "()Lcom/xiaomi/hm/health/device/earbud/viewmodel/EarbudDeviceViewModel;", "mViewModel", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HmEarbudResetActivity extends BaseEarbudDeviceActivity<EarbudDeviceViewModel> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(EarbudDeviceViewModel.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.hm.health.device.earbud.activity.HmEarbudResetActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final ViewModelStore getA() {
            return this.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.xiaomi.hm.health.device.earbud.activity.HmEarbudResetActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final ViewModelProvider.Factory getA() {
            return this.getDefaultViewModelProviderFactory();
        }
    });

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<View, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            HmEarbudResetActivity.this.n();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<View, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            HmEarbudResetActivity.this.onBackPressed();
        }
    }

    private final void initView() {
        ExtKt.smartClick$default((Button) findViewById(R.id.btn_reset), 0L, new a(), 1, null);
        ExtKt.smartClick$default((Button) findViewById(R.id.btn_return), 0L, new b(), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(HmEarbudResetActivity hmEarbudResetActivity, HmEarbudDevice hmEarbudDevice) {
        if (hmEarbudDevice == null) {
            return;
        }
        ((Button) hmEarbudResetActivity.findViewById(R.id.btn_reset)).setEnabled(hmEarbudDevice.isAllConnected() && Intrinsics.areEqual(hmEarbudResetActivity.getMViewModel().getLeftRightConnectData().getValue(), Boolean.TRUE));
        int i = R.id.device_img;
        ((EarbudImageView) hmEarbudResetActivity.findViewById(i)).setLeftConnect(hmEarbudDevice.isConnected());
        ((EarbudImageView) hmEarbudResetActivity.findViewById(i)).setRightConnect(hmEarbudDevice.isRightConnect());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x002e  */
    public static final void l(HmEarbudResetActivity hmEarbudResetActivity, Boolean bool) {
        boolean z;
        Button button = (Button) hmEarbudResetActivity.findViewById(R.id.btn_reset);
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            HmEarbudDevice value = hmEarbudResetActivity.getMViewModel().getDeviceData().getValue();
            z = value != null && value.isAllConnected();
        }
        button.setEnabled(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(HmEarbudResetActivity hmEarbudResetActivity, View view) {
        hmEarbudResetActivity.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        new AlertDialogFragment.Builder(this).setMessage(R.string.earbud_reset_msg).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: u64
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                HmEarbudResetActivity.o(this.a, dialogInterface, i);
            }
        }).setPositiveButton(R.string.btn_confirm, new DialogInterface.OnClickListener() { // from class: v64
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                HmEarbudResetActivity.p(this.a, dialogInterface, i);
            }
        }).show(getSupportFragmentManager(), "Earbud Reset Tip");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(HmEarbudResetActivity hmEarbudResetActivity, DialogInterface dialogInterface, int i) {
        hmEarbudResetActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(HmEarbudResetActivity hmEarbudResetActivity, DialogInterface dialogInterface, int i) {
        hmEarbudResetActivity.getMViewModel().resetDevice();
    }

    @Override // com.xiaomi.hm.health.device.BaseEarbudDeviceActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.xiaomi.hm.health.device.BaseEarbudDeviceActivity
    @NotNull
    public EarbudDeviceViewModel getMViewModel() {
        return (EarbudDeviceViewModel) this.mViewModel.getValue();
    }

    @Override // com.xiaomi.hm.health.device.BaseEarbudDeviceActivity
    public void observeData() {
        super.observeData();
        getMViewModel().getDeviceData().observe(this, new Observer() { // from class: x64
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HmEarbudResetActivity.k(this.a, (HmEarbudDevice) obj);
            }
        });
        getMViewModel().getLeftRightConnectData().observe(this, new Observer() { // from class: y64
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HmEarbudResetActivity.l(this.a, (Boolean) obj);
            }
        });
    }

    @Override // com.xiaomi.hm.health.device.BaseEarbudDeviceActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earbud_reset);
        ((RainbowTitleBar) findViewById(R.id.tv_title_bar)).setNavigationOnClickListener(new View.OnClickListener() { // from class: w64
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HmEarbudResetActivity.m(this.a, view);
            }
        });
        initView();
        observeData();
    }

    @Override // com.xiaomi.hm.health.device.BaseEarbudDeviceActivity
    public void onLoadingSuccess(@NotNull EarbudLoadingType type) {
        super.onLoadingSuccess(type);
        if (type == EarbudLoadingType.RESET_DEVICE) {
            EventBus.getDefault().post(new HmDeviceResetEvent(HMDeviceType.EARBUD));
            finish();
        }
    }
}
