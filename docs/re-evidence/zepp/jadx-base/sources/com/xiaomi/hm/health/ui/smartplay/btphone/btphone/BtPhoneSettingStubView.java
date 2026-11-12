package com.xiaomi.hm.health.ui.smartplay.btphone.btphone;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.Observer;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.databinding.ViewBtphoneSettingBinding;
import com.xiaomi.hm.health.ui.smartplay.btphone.btphone.BtPhoneSettingData;
import com.xiaomi.hm.health.ui.smartplay.btphone.btphone.BtPhoneSettingStubView;
import com.xiaomi.hm.health.ui.smartplay.btphone.incomingalert.IncomingCallAnalytics;
import com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.AuthStatus;
import com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.DelayTimeWheelDialog;
import com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.IController;
import com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.PhoneSettingStubView;
import com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.PhoneSettingStubView$viewModels$$inlined$viewModels$1;
import com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.ShowAuthInfo;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 32\u00020\u0001:\u00013B\u0017\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J&\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0006\u0010\u0012\u001a\u00020\u0004J\u0012\u0010\u0013\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u0012\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016R\u001d\u0010\u001f\u001a\u00020\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010$\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+¨\u00064"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/btphone/BtPhoneSettingStubView;", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/PhoneSettingStubView;", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/btphone/BtPhoneSettingData;", "config", "", "w", "v", SOAP.XMLNS, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "showRealConfig", "onActivityCreated", "onResume", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/IController;", "getViewController", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/ShowAuthInfo;", "authInfo", "onPermissionTipClick", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/btphone/BtPhoneSettingViewModel;", "f", "Lkotlin/Lazy;", hl.k, "()Lcom/xiaomi/hm/health/ui/smartplay/btphone/btphone/BtPhoneSettingViewModel;", "btPhoneViewModel", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/DelayTimeWheelDialog;", "g", "l", "()Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/DelayTimeWheelDialog;", "timeWheelDialog", "Landroid/content/DialogInterface$OnClickListener;", "h", "Landroid/content/DialogInterface$OnClickListener;", "dialogClick", "Lcom/xiaomi/hm/health/databinding/ViewBtphoneSettingBinding;", "i", "Lcom/xiaomi/hm/health/databinding/ViewBtphoneSettingBinding;", "binding", "Landroidx/fragment/app/Fragment;", "fragment", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/PhoneSettingStubView$IOnStubViewListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroidx/fragment/app/Fragment;Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/PhoneSettingStubView$IOnStubViewListener;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class BtPhoneSettingStubView extends PhoneSettingStubView {

    @NotNull
    private static final String j = "BtPhoneSettingStubView";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy btPhoneViewModel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy timeWheelDialog;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final DialogInterface.OnClickListener dialogClick;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private ViewBtphoneSettingBinding binding;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ BtPhoneSettingData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BtPhoneSettingData btPhoneSettingData) {
            super(0);
            this.a = btPhoneSettingData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "config changed: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Boolean bool) {
            super(0);
            this.a = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "show paiDialog: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "isOpen", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Boolean, Unit> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            IconToast.showError(BtPhoneSettingStubView.this.getFragment().requireContext(), "设备蓝牙电话是否打开：" + z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/DelayTimeWheelDialog;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<DelayTimeWheelDialog> {
        public final /* synthetic */ Fragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DelayTimeWheelDialog getA() {
            return new DelayTimeWheelDialog(this.a.requireContext());
        }
    }

    public BtPhoneSettingStubView(@NotNull Fragment fragment, @NotNull PhoneSettingStubView.IOnStubViewListener iOnStubViewListener) {
        super(fragment, iOnStubViewListener, R.layout.view_btphone_setting);
        this.btPhoneViewModel = FragmentViewModelLazyKt.createViewModelLazy(getFragment(), Reflection.getOrCreateKotlinClass(BtPhoneSettingViewModel.class), new PhoneSettingStubView$viewModels$$inlined$viewModels$1(new PhoneSettingStubView.AnonymousClass1()), null);
        this.timeWheelDialog = LazyKt__LazyJVMKt.lazy(new d(fragment));
        this.dialogClick = new DialogInterface.OnClickListener() { // from class: e90
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                BtPhoneSettingStubView.j(this.a, dialogInterface, i);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(BtPhoneSettingStubView btPhoneSettingStubView, DialogInterface dialogInterface, int i) {
        if (i == -1) {
            int currentDelay = btPhoneSettingStubView.l().getCurrentDelay();
            IncomingCallAnalytics.INSTANCE.recordDelayTime(currentDelay);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(btPhoneSettingStubView.getString(R.string.incoming_call_delay_alert_tips), Arrays.copyOf(new Object[]{String.valueOf(currentDelay)}, 1));
            ViewBtphoneSettingBinding viewBtphoneSettingBinding = btPhoneSettingStubView.binding;
            Objects.requireNonNull(viewBtphoneSettingBinding);
            viewBtphoneSettingBinding.delayTimeIv.setTips(str);
            btPhoneSettingStubView.k().setAlertDelayTime(currentDelay);
        }
    }

    private final BtPhoneSettingViewModel k() {
        return (BtPhoneSettingViewModel) this.btPhoneViewModel.getValue();
    }

    private final DelayTimeWheelDialog l() {
        return (DelayTimeWheelDialog) this.timeWheelDialog.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(BtPhoneSettingStubView btPhoneSettingStubView, BtPhoneSettingData btPhoneSettingData) {
        HMLog.info(j, new a(btPhoneSettingData));
        btPhoneSettingStubView.w(btPhoneSettingData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(BtPhoneSettingStubView btPhoneSettingStubView, Boolean bool) {
        btPhoneSettingStubView.showLoading(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(BtPhoneSettingStubView btPhoneSettingStubView, Boolean bool) {
        HMLog.info(j, new b(bool));
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            btPhoneSettingStubView.s();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(BtPhoneSettingStubView btPhoneSettingStubView, Boolean bool) {
        if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            IconToast.showError(btPhoneSettingStubView.getFragment().requireContext(), btPhoneSettingStubView.getString(R.string.bt_phone_operation_failed));
            btPhoneSettingStubView.k().resetOperationResult();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(BtPhoneSettingStubView btPhoneSettingStubView, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            btPhoneSettingStubView.k().enableAlertDelay(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(BtPhoneSettingStubView btPhoneSettingStubView, View view) {
        IncomingCallAnalytics.INSTANCE.recordDelayItemClick();
        btPhoneSettingStubView.v();
    }

    private final void s() {
        new AlertDialogFragment.Builder(getFragment().requireContext()).setTitle(R.string.bt_phone_tips).setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: f90
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                BtPhoneSettingStubView.t(this.a, dialogInterface, i);
            }
        }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: d90
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                BtPhoneSettingStubView.u(this.a, dialogInterface, i);
            }
        }).show(getFragment().getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(BtPhoneSettingStubView btPhoneSettingStubView, DialogInterface dialogInterface, int i) {
        btPhoneSettingStubView.k().goToPairGuild();
        btPhoneSettingStubView.findNavController().navigate(R.id.to_guide_fragment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(BtPhoneSettingStubView btPhoneSettingStubView, DialogInterface dialogInterface, int i) {
        btPhoneSettingStubView.setVisibility(false);
        btPhoneSettingStubView.k().giveUpPair();
    }

    private final void v() {
        l().setListener(this.dialogClick);
        l().show(k().getAlertDelayTime(), getFragment().getChildFragmentManager());
    }

    private final void w(BtPhoneSettingData config) {
        BtPhonePropertyData userSetting = config.getUserSetting();
        ViewBtphoneSettingBinding viewBtphoneSettingBinding = this.binding;
        Objects.requireNonNull(viewBtphoneSettingBinding);
        viewBtphoneSettingBinding.delayIv.setChecked(userSetting.getDelayEnable());
        AuthStatus authStatus = config.getAuthStatus();
        boolean z = userSetting.getEnable() || config.isBtConnected();
        if (z && config.getDeviceEnable()) {
            boolean z2 = authStatus.getReadPhoneCallLogEnable() && authStatus.getContactPermissionEnabled();
            ViewBtphoneSettingBinding viewBtphoneSettingBinding2 = this.binding;
            Objects.requireNonNull(viewBtphoneSettingBinding2);
            if (viewBtphoneSettingBinding2.delayIv.isShown()) {
                ViewBtphoneSettingBinding viewBtphoneSettingBinding3 = this.binding;
                Objects.requireNonNull(viewBtphoneSettingBinding3);
                viewBtphoneSettingBinding3.delayIv.setEnabled(z && z2);
            }
            ViewBtphoneSettingBinding viewBtphoneSettingBinding4 = this.binding;
            Objects.requireNonNull(viewBtphoneSettingBinding4);
            if (viewBtphoneSettingBinding4.delayTimeIv.isShown()) {
                ViewBtphoneSettingBinding viewBtphoneSettingBinding5 = this.binding;
                Objects.requireNonNull(viewBtphoneSettingBinding5);
                viewBtphoneSettingBinding5.delayTimeIv.setEnabled(z && userSetting.getDelayEnable() && z2);
            }
        } else {
            ViewBtphoneSettingBinding viewBtphoneSettingBinding6 = this.binding;
            Objects.requireNonNull(viewBtphoneSettingBinding6);
            if (viewBtphoneSettingBinding6.delayIv.isShown()) {
                ViewBtphoneSettingBinding viewBtphoneSettingBinding7 = this.binding;
                Objects.requireNonNull(viewBtphoneSettingBinding7);
                viewBtphoneSettingBinding7.delayIv.setEnabled(false);
            }
            ViewBtphoneSettingBinding viewBtphoneSettingBinding8 = this.binding;
            Objects.requireNonNull(viewBtphoneSettingBinding8);
            if (viewBtphoneSettingBinding8.delayTimeIv.isShown()) {
                ViewBtphoneSettingBinding viewBtphoneSettingBinding9 = this.binding;
                Objects.requireNonNull(viewBtphoneSettingBinding9);
                viewBtphoneSettingBinding9.delayTimeIv.setEnabled(false);
            }
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(getString(R.string.incoming_call_delay_alert_tips), Arrays.copyOf(new Object[]{String.valueOf(userSetting.getDelayTime())}, 1));
        ViewBtphoneSettingBinding viewBtphoneSettingBinding10 = this.binding;
        Objects.requireNonNull(viewBtphoneSettingBinding10);
        viewBtphoneSettingBinding10.delayTimeIv.setTips(str);
        Objects.requireNonNull(this.binding);
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.PhoneSettingStubView
    @NotNull
    public IController getViewController() {
        return k();
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.PhoneSettingStubView
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        k().getBtPhoneSettingLiveData().observe(getViewLifeCycleOwner(), new Observer() { // from class: i90
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BtPhoneSettingStubView.m(this.a, (BtPhoneSettingData) obj);
            }
        });
        k().getLoadingDialogLiveData().observe(getViewLifeCycleOwner(), new Observer() { // from class: k90
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BtPhoneSettingStubView.n(this.a, (Boolean) obj);
            }
        });
        k().getShowPairDialogLiveData().observe(getViewLifeCycleOwner(), new Observer() { // from class: l90
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BtPhoneSettingStubView.o(this.a, (Boolean) obj);
            }
        });
        k().getOperateResultLiveData().observe(getViewLifeCycleOwner(), new Observer() { // from class: j90
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BtPhoneSettingStubView.p(this.a, (Boolean) obj);
            }
        });
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.PhoneSettingStubView
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        if (viewOnCreateView == null) {
            return null;
        }
        this.binding = ViewBtphoneSettingBinding.bind(viewOnCreateView);
        return viewOnCreateView;
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.PhoneSettingStubView
    public void onPermissionTipClick(@Nullable ShowAuthInfo authInfo) {
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.PhoneSettingStubView
    public void onResume() {
        k().checkFunctionNormal();
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.PhoneSettingStubView
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        ViewBtphoneSettingBinding viewBtphoneSettingBinding = this.binding;
        Objects.requireNonNull(viewBtphoneSettingBinding);
        viewBtphoneSettingBinding.delayIv.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: h90
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                BtPhoneSettingStubView.q(this.a, compoundButton, z);
            }
        });
        ViewBtphoneSettingBinding viewBtphoneSettingBinding2 = this.binding;
        Objects.requireNonNull(viewBtphoneSettingBinding2);
        viewBtphoneSettingBinding2.delayTimeIv.setOnClickListener(new View.OnClickListener() { // from class: g90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BtPhoneSettingStubView.r(this.a, view2);
            }
        });
    }

    public final void showRealConfig() {
        k().queryBtPhoneStatus(new c());
    }
}
