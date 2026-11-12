package com.xiaomi.hm.health.ui.smartplay.btphone.incomingalert;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
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
import com.huami.lib.rainbow.ListTile;
import com.huami.watch.hmwatchmanager.R;
import com.loc.z;
import com.xiaomi.hm.health.databinding.ViewIncommingCallSettingBinding;
import com.xiaomi.hm.health.ui.keekalive.KeepAliveTipsActivity;
import com.xiaomi.hm.health.ui.smartplay.btphone.incomingalert.InComingCallStubView;
import com.xiaomi.hm.health.ui.smartplay.btphone.incomingalert.IncomingCallSettingData;
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
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J&\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u001a\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\u0011\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0012\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016R\u001d\u0010\u001c\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010!\u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(¨\u00060"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/incomingalert/InComingCallStubView;", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/PhoneSettingStubView;", "", SOAP.XMLNS, "Lcom/xiaomi/hm/health/ui/smartplay/btphone/incomingalert/IncomingCallSettingData;", "alertSettingData", "t", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onActivityCreated", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/IController;", "getViewController", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/ShowAuthInfo;", "authInfo", "onPermissionTipClick", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/incomingalert/InComingCallViewModel;", "f", "Lkotlin/Lazy;", hl.k, "()Lcom/xiaomi/hm/health/ui/smartplay/btphone/incomingalert/InComingCallViewModel;", "viewModel", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/DelayTimeWheelDialog;", "g", z.j, "()Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/DelayTimeWheelDialog;", "timeWheelDialog", "Landroid/content/DialogInterface$OnClickListener;", "h", "Landroid/content/DialogInterface$OnClickListener;", "dialogClick", "Lcom/xiaomi/hm/health/databinding/ViewIncommingCallSettingBinding;", "i", "Lcom/xiaomi/hm/health/databinding/ViewIncommingCallSettingBinding;", "binding", "Landroidx/fragment/app/Fragment;", "fragment", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/PhoneSettingStubView$IOnStubViewListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroidx/fragment/app/Fragment;Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/PhoneSettingStubView$IOnStubViewListener;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class InComingCallStubView extends PhoneSettingStubView {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy timeWheelDialog;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final DialogInterface.OnClickListener dialogClick;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private ViewIncommingCallSettingBinding binding;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/DelayTimeWheelDialog;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<DelayTimeWheelDialog> {
        public final /* synthetic */ Fragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
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

    public InComingCallStubView(@NotNull Fragment fragment, @NotNull PhoneSettingStubView.IOnStubViewListener iOnStubViewListener) {
        super(fragment, iOnStubViewListener, R.layout.view_incomming_call_setting);
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(getFragment(), Reflection.getOrCreateKotlinClass(InComingCallViewModel.class), new PhoneSettingStubView$viewModels$$inlined$viewModels$1(new PhoneSettingStubView.AnonymousClass1()), null);
        this.timeWheelDialog = LazyKt__LazyJVMKt.lazy(new a(fragment));
        this.dialogClick = new DialogInterface.OnClickListener() { // from class: od4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                InComingCallStubView.i(this.a, dialogInterface, i);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(InComingCallStubView inComingCallStubView, DialogInterface dialogInterface, int i) {
        if (i == -1) {
            int currentDelay = inComingCallStubView.j().getCurrentDelay();
            IncomingCallAnalytics.INSTANCE.recordDelayTime(currentDelay);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String.format(inComingCallStubView.getString(R.string.incoming_call_delay_alert_tips), Arrays.copyOf(new Object[]{String.valueOf(currentDelay)}, 1));
            inComingCallStubView.k().setDelayTime(currentDelay);
        }
    }

    private final DelayTimeWheelDialog j() {
        return (DelayTimeWheelDialog) this.timeWheelDialog.getValue();
    }

    private final InComingCallViewModel k() {
        return (InComingCallViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(InComingCallStubView inComingCallStubView, IncomingCallSettingData incomingCallSettingData) {
        inComingCallStubView.t(incomingCallSettingData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(InComingCallStubView inComingCallStubView, Boolean bool) {
        if (bool == null) {
            return;
        }
        inComingCallStubView.getFragment().startActivity(new Intent(inComingCallStubView.getFragment().requireContext(), (Class<?>) KeepAliveTipsActivity.class));
        inComingCallStubView.k().clearShowKeepLiveTipsLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(InComingCallStubView inComingCallStubView, DialogInterface dialogInterface, int i) {
        inComingCallStubView.getFragment().startActivity(new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(InComingCallStubView inComingCallStubView, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            IncomingCallAnalytics.INSTANCE.recordContactShowEvent(z);
            inComingCallStubView.k().enableShowContactInfo(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(InComingCallStubView inComingCallStubView, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            inComingCallStubView.k().enableIncomingCallDelay(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(InComingCallStubView inComingCallStubView, View view) {
        IncomingCallAnalytics.INSTANCE.recordDelayItemClick();
        inComingCallStubView.s();
    }

    private final void s() {
        j().setListener(this.dialogClick);
        j().show(k().getDelayTime(), getFragment().getChildFragmentManager());
    }

    private final void t(IncomingCallSettingData alertSettingData) {
        AuthStatus authStatus = alertSettingData.getAuthStatus();
        boolean alertEnable = alertSettingData.getAlertEnable();
        boolean delayEnable = alertSettingData.getDelayEnable();
        boolean supportShowContact = alertSettingData.getSupportShowContact();
        boolean showContact = alertSettingData.getShowContact();
        boolean deviceEnable = alertSettingData.getDeviceEnable();
        ViewIncommingCallSettingBinding viewIncommingCallSettingBinding = this.binding;
        Objects.requireNonNull(viewIncommingCallSettingBinding);
        ListTile listTile = viewIncommingCallSettingBinding.showDialInfoItv;
        if (listTile.isShown()) {
            listTile.setEnabled(alertEnable && authStatus.getContactPermissionEnabled() && authStatus.getReadPhoneCallLogEnable() && authStatus.getPhonePermissionEnabled() && deviceEnable);
            listTile.setChecked(showContact);
        }
        ViewIncommingCallSettingBinding viewIncommingCallSettingBinding2 = this.binding;
        Objects.requireNonNull(viewIncommingCallSettingBinding2);
        ListTile listTile2 = viewIncommingCallSettingBinding2.delayItv;
        if (listTile2.isShown()) {
            listTile2.setEnabled(alertEnable && authStatus.getPhonePermissionEnabled() && deviceEnable);
            listTile2.setChecked(delayEnable);
        }
        ViewIncommingCallSettingBinding viewIncommingCallSettingBinding3 = this.binding;
        Objects.requireNonNull(viewIncommingCallSettingBinding3);
        ListTile listTile3 = viewIncommingCallSettingBinding3.delayTimeItv;
        if (listTile3.isShown()) {
            ViewIncommingCallSettingBinding viewIncommingCallSettingBinding4 = this.binding;
            Objects.requireNonNull(viewIncommingCallSettingBinding4);
            boolean zIsEnabled = viewIncommingCallSettingBinding4.delayItv.isEnabled();
            int delayTime = alertSettingData.getDelayTime();
            listTile3.setEnabled(delayEnable && zIsEnabled && deviceEnable);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            listTile3.setTips(String.format(getString(R.string.incoming_call_delay_alert_tips), Arrays.copyOf(new Object[]{String.valueOf(delayTime)}, 1)));
        }
        ViewIncommingCallSettingBinding viewIncommingCallSettingBinding5 = this.binding;
        Objects.requireNonNull(viewIncommingCallSettingBinding5);
        viewIncommingCallSettingBinding5.showDialInfoItv.setVisibility(supportShowContact ? 0 : 8);
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.PhoneSettingStubView
    @NotNull
    public IController getViewController() {
        return k();
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.PhoneSettingStubView
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        k().getPhoneAlertLiveData().observe(getViewLifeCycleOwner(), new Observer() { // from class: ud4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                InComingCallStubView.l(this.a, (IncomingCallSettingData) obj);
            }
        });
        k().getShowKeepLiveTipsLiveData().observe(getViewLifeCycleOwner(), new Observer() { // from class: vd4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                InComingCallStubView.m(this.a, (Boolean) obj);
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
        this.binding = ViewIncommingCallSettingBinding.bind(viewOnCreateView);
        return viewOnCreateView;
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.PhoneSettingStubView
    public void onPermissionTipClick(@Nullable ShowAuthInfo authInfo) {
        String[] permission;
        if (Build.VERSION.SDK_INT >= 23) {
            if ((authInfo == null || (permission = authInfo.getPermission()) == null) ? false : ArraysKt___ArraysKt.contains(permission, "android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS")) {
                new AlertDialogFragment.Builder(getFragment().requireContext()).setCancelable(false).setTitle(R.string.permission_disturb_title).setMessage(R.string.permission_disturb_msg_watch).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: qd4
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        InComingCallStubView.n(dialogInterface, i);
                    }
                }).setPositiveButton(R.string.per_go_setting, new DialogInterface.OnClickListener() { // from class: pd4
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        InComingCallStubView.o(this.a, dialogInterface, i);
                    }
                }).show(getFragment().getChildFragmentManager());
            }
        }
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.PhoneSettingStubView
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        ViewIncommingCallSettingBinding viewIncommingCallSettingBinding = this.binding;
        Objects.requireNonNull(viewIncommingCallSettingBinding);
        viewIncommingCallSettingBinding.showDialInfoItv.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: sd4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                InComingCallStubView.p(this.a, compoundButton, z);
            }
        });
        ViewIncommingCallSettingBinding viewIncommingCallSettingBinding2 = this.binding;
        Objects.requireNonNull(viewIncommingCallSettingBinding2);
        viewIncommingCallSettingBinding2.delayItv.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: td4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                InComingCallStubView.q(this.a, compoundButton, z);
            }
        });
        ViewIncommingCallSettingBinding viewIncommingCallSettingBinding3 = this.binding;
        Objects.requireNonNull(viewIncommingCallSettingBinding3);
        viewIncommingCallSettingBinding3.delayTimeItv.setOnClickListener(new View.OnClickListener() { // from class: rd4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                InComingCallStubView.r(this.a, view2);
            }
        });
    }
}
