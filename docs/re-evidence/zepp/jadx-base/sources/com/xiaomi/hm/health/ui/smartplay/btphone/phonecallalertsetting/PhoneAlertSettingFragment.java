package com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStore;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p010navigation.fragment.FragmentKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.injection.basic.MiuiFnApi;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.view.widget.TipComponent;
import com.huami.phone_call.sms.PhoneCallSmsReplySettingFragment;
import com.huami.phone_call.sms.SmsReplySettingViewModel;
import com.huami.phone_call.sms.data.PermissionInfo;
import com.huami.phone_call.sms.data.SmsReplySetting;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.tbruyelle.rxpermissions2.Permission;
import com.tbruyelle.rxpermissions2.RxPermissions;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.databinding.FragmentPhoneAlertSettingBinding;
import com.xiaomi.hm.health.device.deviceproperty.HMDevicePropertyCache;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import com.xiaomi.hm.health.ui.smartplay.btphone.btphone.BtPhoneSettingStubView;
import com.xiaomi.hm.health.ui.smartplay.btphone.incomingalert.InComingCallStubView;
import com.xiaomi.hm.health.ui.smartplay.btphone.incomingalert.IncomingCallAnalytics;
import com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.PhoneAlertSettingData;
import com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.PhoneAlertSettingFragment;
import com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.SettingType;
import com.xiaomi.hm.health.utils.TelephonyUtil;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 S2\u00020\u00012\u00020\u0002:\u0002STB\u0007¢\u0006\u0004\bQ\u0010RJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0003J\u001d\u0010\r\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\u0012\u001a\u00020\u0003H\u0002J\b\u0010\u0013\u001a\u00020\u0003H\u0002J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0012\u0010\u001c\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u0003H\u0016J\b\u0010\u001e\u001a\u00020\u0003H\u0016J&\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010&\u001a\u00020\u00032\u0006\u0010%\u001a\u00020#2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J\u0012\u0010'\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016R\u001d\u0010-\u001a\u00020(8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001d\u00102\u001a\u00020.8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u00101R\u0016\u00105\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u001d\u0010:\u001a\u0002068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010*\u001a\u0004\b8\u00109R\u001d\u0010?\u001a\u00020;8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010*\u001a\u0004\b=\u0010>R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR\u001d\u0010H\u001a\u00020D8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010*\u001a\u0004\bF\u0010GR\u0018\u0010K\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u001d\u0010P\u001a\u00020L8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010*\u001a\u0004\bN\u0010O¨\u0006U"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/PhoneAlertSettingFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/koin/core/component/KoinComponent;", "", "C", "K", "E", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/ShowAuthInfo;", "authInfo", "w", "", "", "permissions", "R", "([Ljava/lang/String;)V", "", "deviceEnable", "U", "G", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/AuthStatus;", "settingData", "Q", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/SettingType;", "type", "V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onResume", "onStart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onActivityCreated", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/btphone/BtPhoneSettingStubView;", "a", "Lkotlin/Lazy;", DTransferConstants.SEARCH_KEY, "()Lcom/xiaomi/hm/health/ui/smartplay/btphone/btphone/BtPhoneSettingStubView;", "btPhoneStubView", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/incomingalert/InComingCallStubView;", "b", SOAP.XMLNS, "()Lcom/xiaomi/hm/health/ui/smartplay/btphone/incomingalert/InComingCallStubView;", "incomingCallStubView", "c", "Landroid/view/View;", "smsReplySettingContainer", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", GoogleApiAvailabilityLight.a, "t", "()Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mLoadingDialog", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/PhoneAlertSettingViewModel;", "e", "v", "()Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/PhoneAlertSettingViewModel;", "viewModel", "Lcom/xiaomi/hm/health/databinding/FragmentPhoneAlertSettingBinding;", "f", "Lcom/xiaomi/hm/health/databinding/FragmentPhoneAlertSettingBinding;", "binding", "Lcom/huami/phone_call/sms/SmsReplySettingViewModel;", "g", "u", "()Lcom/huami/phone_call/sms/SmsReplySettingViewModel;", "smsReplyViewModel", "h", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/ShowAuthInfo;", "curShowAuthInfo", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "i", "r", "()Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtilsApi", "<init>", "()V", "Companion", "StubViewListener", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class PhoneAlertSettingFragment extends Fragment implements KoinComponent {

    @NotNull
    private static final String j = "PhoneAlertSettingFragment";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy btPhoneStubView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy incomingCallStubView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private View smsReplySettingContainer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy mLoadingDialog;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private FragmentPhoneAlertSettingBinding binding;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy smsReplyViewModel;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private ShowAuthInfo curShowAuthInfo;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceUtilsApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/PhoneAlertSettingFragment$StubViewListener;", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/PhoneSettingStubView$IOnStubViewListener;", "", "show", "", "showLoading", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/SettingType;", "a", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/SettingType;", "getType", "()Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/SettingType;", "type", "<init>", "(Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/PhoneAlertSettingFragment;Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/SettingType;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public final class StubViewListener implements PhoneSettingStubView.IOnStubViewListener {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final SettingType type;

        public StubViewListener(SettingType settingType) {
            this.type = settingType;
        }

        @NotNull
        public final SettingType getType() {
            return this.type;
        }

        @Override // com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.PhoneSettingStubView.IOnStubViewListener
        public void showLoading(boolean show) {
            if (show && !PhoneAlertSettingFragment.this.t().isShowing()) {
                PhoneAlertSettingFragment.this.t().show();
            } else {
                if (show || !PhoneAlertSettingFragment.this.t().isShowing()) {
                    return;
                }
                PhoneAlertSettingFragment.this.t().dismiss();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/btphone/BtPhoneSettingStubView;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<BtPhoneSettingStubView> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BtPhoneSettingStubView getA() {
            PhoneAlertSettingFragment phoneAlertSettingFragment = PhoneAlertSettingFragment.this;
            return new BtPhoneSettingStubView(phoneAlertSettingFragment, phoneAlertSettingFragment.new StubViewListener(SettingType.BtPhone));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String[] strArr) {
            super(0);
            this.a = strArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "there is no needePermissions and needePermissions are : " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Permission a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Permission permission) {
            super(0);
            this.a = permission;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "user operate permission: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "user denied permission";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "activity is null or alert msg is null; alert msg: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/incomingalert/InComingCallStubView;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<InComingCallStubView> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InComingCallStubView getA() {
            PhoneAlertSettingFragment phoneAlertSettingFragment = PhoneAlertSettingFragment.this;
            return new InComingCallStubView(phoneAlertSettingFragment, phoneAlertSettingFragment.new StubViewListener(SettingType.PhoneAlert));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/android/design/dialog/loading/LoadingDialog;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<LoadingDialog> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadingDialog getA() {
            LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(PhoneAlertSettingFragment.this.getContext());
            loadingDialogShowDialog.setCancelable(false);
            return loadingDialogShowDialog;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Request send SMS permission failed!";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PhoneAlertSettingFragment() {
        super(R.layout.fragment_phone_alert_setting);
        this.btPhoneStubView = LazyKt__LazyJVMKt.lazy(new a());
        this.incomingCallStubView = LazyKt__LazyJVMKt.lazy(new g());
        this.mLoadingDialog = LazyKt__LazyJVMKt.lazy(new h());
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.PhoneAlertSettingFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final Fragment getA() {
                return this;
            }
        };
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PhoneAlertSettingViewModel.class);
        Function0<ViewModelStore> function1 = new Function0<ViewModelStore>() { // from class: com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.PhoneAlertSettingFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelStore getA() {
                return ((ViewModelStoreOwner) function0.getA()).getViewModelStore();
            }
        };
        final Qualifier qualifier = null;
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, orCreateKotlinClass, function1, null);
        final Function0<ViewModelOwner> function2 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.PhoneAlertSettingFragment$special$$inlined$sharedViewModel$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                return ViewModelOwner.INSTANCE.from(this.requireActivity(), this.requireActivity());
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.smsReplyViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SmsReplySettingViewModel>() { // from class: com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.PhoneAlertSettingFragment$special$$inlined$sharedViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.phone_call.sms.SmsReplySettingViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final SmsReplySettingViewModel getA() {
                return FragmentExtKt.getSharedViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(SmsReplySettingViewModel.class), function2, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.deviceUtilsApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.PhoneAlertSettingFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.DeviceUtilsApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceUtilsApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), objArr2, objArr3);
            }
        });
    }

    private final void A() {
        int i2 = HMDevicePropertyCache.INSTANCE.getInstance().getMiliFeature().hasSw(36) ? 0 : 8;
        FragmentPhoneAlertSettingBinding fragmentPhoneAlertSettingBinding = this.binding;
        Objects.requireNonNull(fragmentPhoneAlertSettingBinding);
        fragmentPhoneAlertSettingBinding.contactItv.setVisibility(i2);
        FragmentPhoneAlertSettingBinding fragmentPhoneAlertSettingBinding2 = this.binding;
        Objects.requireNonNull(fragmentPhoneAlertSettingBinding2);
        fragmentPhoneAlertSettingBinding2.watchSettingTitle.setVisibility(i2);
        FragmentPhoneAlertSettingBinding fragmentPhoneAlertSettingBinding3 = this.binding;
        Objects.requireNonNull(fragmentPhoneAlertSettingBinding3);
        fragmentPhoneAlertSettingBinding3.contactItv.setOnClickListener(new View.OnClickListener() { // from class: mv5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhoneAlertSettingFragment.B(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(PhoneAlertSettingFragment phoneAlertSettingFragment, View view) {
        FragmentKt.findNavController(phoneAlertSettingFragment).navigate(R.id.to_contact_fragment);
    }

    private final void C() {
        if (GlobalConfig.get().isBuildInner()) {
            FragmentPhoneAlertSettingBinding fragmentPhoneAlertSettingBinding = this.binding;
            Objects.requireNonNull(fragmentPhoneAlertSettingBinding);
            fragmentPhoneAlertSettingBinding.titleBar.setOnLongClickListener(new View.OnLongClickListener() { // from class: yv5
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return PhoneAlertSettingFragment.D(this.a, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean D(PhoneAlertSettingFragment phoneAlertSettingFragment, View view) {
        phoneAlertSettingFragment.q().showRealConfig();
        return true;
    }

    private final void E() {
        View view = getView();
        ((TipComponent) (view == null ? null : view.findViewById(com.xiaomi.hm.health.R.id.permission_tips))).setDividerVisibility(8);
        View view2 = getView();
        ((TipComponent) (view2 != null ? view2.findViewById(com.xiaomi.hm.health.R.id.permission_tips) : null)).setActionGoto(new View.OnClickListener() { // from class: uv5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                PhoneAlertSettingFragment.F(this.a, view3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(PhoneAlertSettingFragment phoneAlertSettingFragment, View view) {
        ShowAuthInfo showAuthInfo = phoneAlertSettingFragment.curShowAuthInfo;
        SettingType owner = showAuthInfo == null ? null : showAuthInfo.getOwner();
        if (owner == SettingType.BtPhone) {
            phoneAlertSettingFragment.q().onPermissionTipClick(phoneAlertSettingFragment.curShowAuthInfo);
        } else if (owner == SettingType.PhoneAlert) {
            phoneAlertSettingFragment.s().onPermissionTipClick(phoneAlertSettingFragment.curShowAuthInfo);
        } else {
            phoneAlertSettingFragment.w(phoneAlertSettingFragment.curShowAuthInfo);
        }
    }

    private final void G() {
        FragmentPhoneAlertSettingBinding fragmentPhoneAlertSettingBinding = this.binding;
        Objects.requireNonNull(fragmentPhoneAlertSettingBinding);
        fragmentPhoneAlertSettingBinding.closeItv.setOnClickListener(new View.OnClickListener() { // from class: vv5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhoneAlertSettingFragment.H(this.a, view);
            }
        });
        FragmentPhoneAlertSettingBinding fragmentPhoneAlertSettingBinding2 = this.binding;
        Objects.requireNonNull(fragmentPhoneAlertSettingBinding2);
        fragmentPhoneAlertSettingBinding2.phoneAlertItv.setOnClickListener(new View.OnClickListener() { // from class: tv5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhoneAlertSettingFragment.I(this.a, view);
            }
        });
        FragmentPhoneAlertSettingBinding fragmentPhoneAlertSettingBinding3 = this.binding;
        Objects.requireNonNull(fragmentPhoneAlertSettingBinding3);
        fragmentPhoneAlertSettingBinding3.btPhoneItv.setOnClickListener(new View.OnClickListener() { // from class: wv5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhoneAlertSettingFragment.J(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(PhoneAlertSettingFragment phoneAlertSettingFragment, View view) {
        FragmentPhoneAlertSettingBinding fragmentPhoneAlertSettingBinding = phoneAlertSettingFragment.binding;
        Objects.requireNonNull(fragmentPhoneAlertSettingBinding);
        if (fragmentPhoneAlertSettingBinding.closeItv.isSelectedStatus()) {
            return;
        }
        IncomingCallAnalytics incomingCallAnalytics = IncomingCallAnalytics.INSTANCE;
        SettingType settingType = SettingType.None;
        incomingCallAnalytics.recordUserSelect(settingType);
        phoneAlertSettingFragment.v().tryToOpen(settingType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(PhoneAlertSettingFragment phoneAlertSettingFragment, View view) {
        FragmentPhoneAlertSettingBinding fragmentPhoneAlertSettingBinding = phoneAlertSettingFragment.binding;
        Objects.requireNonNull(fragmentPhoneAlertSettingBinding);
        if (fragmentPhoneAlertSettingBinding.phoneAlertItv.isSelectedStatus()) {
            return;
        }
        IncomingCallAnalytics incomingCallAnalytics = IncomingCallAnalytics.INSTANCE;
        SettingType settingType = SettingType.PhoneAlert;
        incomingCallAnalytics.recordUserSelect(settingType);
        phoneAlertSettingFragment.v().tryToOpen(settingType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(PhoneAlertSettingFragment phoneAlertSettingFragment, View view) {
        FragmentPhoneAlertSettingBinding fragmentPhoneAlertSettingBinding = phoneAlertSettingFragment.binding;
        Objects.requireNonNull(fragmentPhoneAlertSettingBinding);
        if (fragmentPhoneAlertSettingBinding.btPhoneItv.isSelectedStatus()) {
            return;
        }
        IncomingCallAnalytics incomingCallAnalytics = IncomingCallAnalytics.INSTANCE;
        SettingType settingType = SettingType.BtPhone;
        incomingCallAnalytics.recordUserSelect(settingType);
        phoneAlertSettingFragment.v().tryToOpen(settingType);
    }

    private final void K() {
        BTStatusFragment.newInstance(R.id.container, getChildFragmentManager()).setBLEStatusListener(v().getBleStatusListener());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(PhoneAlertSettingFragment phoneAlertSettingFragment, SettingType settingType) {
        phoneAlertSettingFragment.V(settingType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(PhoneAlertSettingFragment phoneAlertSettingFragment, PhoneAlertSettingData phoneAlertSettingData) {
        phoneAlertSettingFragment.u().setDeviceConnected(phoneAlertSettingData.getDeviceEnable());
        phoneAlertSettingFragment.U(phoneAlertSettingData.getDeviceEnable(), phoneAlertSettingData.getShowAuthInfo());
        phoneAlertSettingFragment.Q(phoneAlertSettingData.getDeviceEnable(), phoneAlertSettingData.getAuthStatus());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(PhoneAlertSettingFragment phoneAlertSettingFragment, SmsReplySetting smsReplySetting) {
        if (smsReplySetting.getVisible()) {
            View view = phoneAlertSettingFragment.smsReplySettingContainer;
            Objects.requireNonNull(view);
            view.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(PhoneAlertSettingFragment phoneAlertSettingFragment, List list) {
        phoneAlertSettingFragment.v().setSendSmsPermission((PermissionInfo) CollectionsKt.firstOrNull(list));
        phoneAlertSettingFragment.v().checkAuth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(PhoneAlertSettingFragment phoneAlertSettingFragment, View view) {
        FragmentActivity activity = phoneAlertSettingFragment.getActivity();
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    private final void Q(boolean deviceEnable, AuthStatus settingData) {
        boolean z = false;
        if (!deviceEnable) {
            FragmentPhoneAlertSettingBinding fragmentPhoneAlertSettingBinding = this.binding;
            Objects.requireNonNull(fragmentPhoneAlertSettingBinding);
            fragmentPhoneAlertSettingBinding.closeItv.setEnabled(false);
            FragmentPhoneAlertSettingBinding fragmentPhoneAlertSettingBinding2 = this.binding;
            Objects.requireNonNull(fragmentPhoneAlertSettingBinding2);
            fragmentPhoneAlertSettingBinding2.phoneAlertItv.setEnabled(false);
            FragmentPhoneAlertSettingBinding fragmentPhoneAlertSettingBinding3 = this.binding;
            Objects.requireNonNull(fragmentPhoneAlertSettingBinding3);
            fragmentPhoneAlertSettingBinding3.btPhoneItv.setEnabled(false);
            FragmentPhoneAlertSettingBinding fragmentPhoneAlertSettingBinding4 = this.binding;
            Objects.requireNonNull(fragmentPhoneAlertSettingBinding4);
            fragmentPhoneAlertSettingBinding4.contactItv.setEnabled(false);
            return;
        }
        FragmentPhoneAlertSettingBinding fragmentPhoneAlertSettingBinding5 = this.binding;
        Objects.requireNonNull(fragmentPhoneAlertSettingBinding5);
        fragmentPhoneAlertSettingBinding5.closeItv.setEnabled(settingData.getPhonePermissionEnabled());
        FragmentPhoneAlertSettingBinding fragmentPhoneAlertSettingBinding6 = this.binding;
        Objects.requireNonNull(fragmentPhoneAlertSettingBinding6);
        fragmentPhoneAlertSettingBinding6.phoneAlertItv.setEnabled(settingData.getPhonePermissionEnabled());
        FragmentPhoneAlertSettingBinding fragmentPhoneAlertSettingBinding7 = this.binding;
        Objects.requireNonNull(fragmentPhoneAlertSettingBinding7);
        fragmentPhoneAlertSettingBinding7.btPhoneItv.setEnabled(settingData.getPhonePermissionEnabled());
        FragmentPhoneAlertSettingBinding fragmentPhoneAlertSettingBinding8 = this.binding;
        Objects.requireNonNull(fragmentPhoneAlertSettingBinding8);
        ListTile listTile = fragmentPhoneAlertSettingBinding8.contactItv;
        if (settingData.getPhonePermissionEnabled() && settingData.getContactPermissionEnabled()) {
            z = true;
        }
        listTile.setEnabled(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void R(String[] permissions) {
        boolean z = this instanceof KoinScopeComponent;
        if (((MiuiFnApi) (z ? ((KoinScopeComponent) this).getScope() : getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(MiuiFnApi.class), null, null)).isMiui(requireContext())) {
            ((DeviceXNavigator) (z ? ((KoinScopeComponent) this).getScope() : getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceXNavigator.class), null, null)).startAppSettings(requireContext());
        } else {
            new RxPermissions(requireActivity()).requestEach((String[]) Arrays.copyOf(permissions, permissions.length)).subscribe(new Consumer() { // from class: pv5
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    PhoneAlertSettingFragment.S(this.a, (Permission) obj);
                }
            }, new Consumer() { // from class: sv5
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    PhoneAlertSettingFragment.T((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(PhoneAlertSettingFragment phoneAlertSettingFragment, Permission permission) {
        if (permission.granted) {
            phoneAlertSettingFragment.u().refresh();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(Throwable th) {
        HMLog.error$default(j, null, th, i.a, 2, null);
    }

    private final void U(boolean deviceEnable, ShowAuthInfo authInfo) {
        if (authInfo != null && authInfo.getShow() && deviceEnable) {
            View view = getView();
            ((TipComponent) (view == null ? null : view.findViewById(com.xiaomi.hm.health.R.id.permission_tips))).showWarningIcon();
            Integer titleRes = authInfo.getTitleRes();
            if (titleRes == null) {
                return;
            }
            int iIntValue = titleRes.intValue();
            View view2 = getView();
            ((TipComponent) (view2 == null ? null : view2.findViewById(com.xiaomi.hm.health.R.id.permission_tips))).setVisibility(0);
            View view3 = getView();
            ((TipComponent) (view3 == null ? null : view3.findViewById(com.xiaomi.hm.health.R.id.permission_tips))).setTitle(iIntValue);
            Integer subTitleRes = authInfo.getSubTitleRes();
            if (subTitleRes == null) {
                return;
            }
            int iIntValue2 = subTitleRes.intValue();
            View view4 = getView();
            ((TipComponent) (view4 != null ? view4.findViewById(com.xiaomi.hm.health.R.id.permission_tips) : null)).setSubTitle(getString(iIntValue2));
        } else {
            View view5 = getView();
            ((TipComponent) (view5 != null ? view5.findViewById(com.xiaomi.hm.health.R.id.permission_tips) : null)).setVisibility(8);
        }
        this.curShowAuthInfo = authInfo;
    }

    private final void V(SettingType type) {
        int i2 = 0;
        boolean z = type == SettingType.PhoneAlert;
        boolean z2 = type == SettingType.BtPhone;
        FragmentPhoneAlertSettingBinding fragmentPhoneAlertSettingBinding = this.binding;
        Objects.requireNonNull(fragmentPhoneAlertSettingBinding);
        fragmentPhoneAlertSettingBinding.closeItv.showSelectStatus(type == SettingType.None);
        FragmentPhoneAlertSettingBinding fragmentPhoneAlertSettingBinding2 = this.binding;
        Objects.requireNonNull(fragmentPhoneAlertSettingBinding2);
        fragmentPhoneAlertSettingBinding2.phoneAlertItv.showSelectStatus(z);
        FragmentPhoneAlertSettingBinding fragmentPhoneAlertSettingBinding3 = this.binding;
        Objects.requireNonNull(fragmentPhoneAlertSettingBinding3);
        fragmentPhoneAlertSettingBinding3.btPhoneItv.showSelectStatus(z2);
        s().show(z);
        q().show(z2);
        SmsReplySetting value = u().getSettingLiveData().getValue();
        if (value != null && value.getVisible()) {
            View view = this.smsReplySettingContainer;
            Objects.requireNonNull(view);
            if (!z && !z2) {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
    }

    private final BtPhoneSettingStubView q() {
        return (BtPhoneSettingStubView) this.btPhoneStubView.getValue();
    }

    private final DeviceUtilsApi r() {
        return (DeviceUtilsApi) this.deviceUtilsApi.getValue();
    }

    private final InComingCallStubView s() {
        return (InComingCallStubView) this.incomingCallStubView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoadingDialog t() {
        return (LoadingDialog) this.mLoadingDialog.getValue();
    }

    private final SmsReplySettingViewModel u() {
        return (SmsReplySettingViewModel) this.smsReplyViewModel.getValue();
    }

    private final PhoneAlertSettingViewModel v() {
        return (PhoneAlertSettingViewModel) this.viewModel.getValue();
    }

    @SuppressLint({"CheckResult"})
    private final void w(final ShowAuthInfo authInfo) {
        String str;
        String[] permission = authInfo == null ? null : authInfo.getPermission();
        if (permission != null) {
            boolean z = true;
            if (!(permission.length == 0)) {
                int length = permission.length;
                int i2 = 0;
                do {
                    if (i2 >= length) {
                        z = false;
                        break;
                    } else {
                        str = permission[i2];
                        i2++;
                    }
                } while (!Intrinsics.areEqual(str, "android.permission.SEND_SMS"));
                if (z) {
                    R(permission);
                    return;
                }
                RxPermissions rxPermissions = new RxPermissions(requireActivity());
                final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                rxPermissions.requestEach((String[]) Arrays.copyOf(permission, permission.length)).subscribe(new Consumer() { // from class: qv5
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        PhoneAlertSettingFragment.y(this.a, booleanRef, (Permission) obj);
                    }
                }, new Consumer() { // from class: rv5
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        PhoneAlertSettingFragment.z((Throwable) obj);
                    }
                }, new Action() { // from class: ov5
                    @Override // io.reactivex.functions.Action
                    public final void run() {
                        PhoneAlertSettingFragment.x(booleanRef, this, authInfo);
                    }
                });
                return;
            }
        }
        HMLog.info(j, new b(permission));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(Ref.BooleanRef booleanRef, PhoneAlertSettingFragment phoneAlertSettingFragment, ShowAuthInfo showAuthInfo) {
        if (booleanRef.element) {
            AppCompatActivity appCompatActivity = (AppCompatActivity) phoneAlertSettingFragment.requireActivity();
            Integer denyPromoteId = showAuthInfo.getDenyPromoteId();
            String string = denyPromoteId == null ? null : phoneAlertSettingFragment.getString(denyPromoteId.intValue());
            if (appCompatActivity == null || string == null) {
                HMLog.info(j, new f(string));
            } else {
                phoneAlertSettingFragment.r().showPermissionDenieDialog(appCompatActivity, string);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(PhoneAlertSettingFragment phoneAlertSettingFragment, Ref.BooleanRef booleanRef, Permission permission) {
        HMLog.info(j, new c(permission));
        if (permission.granted) {
            TelephonyUtil.INSTANCE.preReadContacts(phoneAlertSettingFragment.requireContext(), j);
            phoneAlertSettingFragment.v().onPermission(permission);
        } else if (permission.shouldShowRequestPermissionRationale) {
            HMLog.info(j, d.a);
        } else {
            booleanRef.element = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(Throwable th) {
        HMLog.warn$default(null, th, e.a, 1, null);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        s().onActivityCreated(savedInstanceState);
        q().onActivityCreated(savedInstanceState);
        v().getShowTypeLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: bw5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                PhoneAlertSettingFragment.L(this.a, (SettingType) obj);
            }
        });
        v().getViewSettingLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: aw5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                PhoneAlertSettingFragment.M(this.a, (PhoneAlertSettingData) obj);
            }
        });
        u().getSettingLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: zv5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                PhoneAlertSettingFragment.N(this.a, (SmsReplySetting) obj);
            }
        });
        u().getPermissionLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: nv5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                PhoneAlertSettingFragment.O(this.a, (List) obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        v().initWithController(q().getViewController(), s().getViewController());
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        if (viewOnCreateView == null) {
            return null;
        }
        FragmentPhoneAlertSettingBinding fragmentPhoneAlertSettingBindingBind = FragmentPhoneAlertSettingBinding.bind(viewOnCreateView);
        this.binding = fragmentPhoneAlertSettingBindingBind;
        Objects.requireNonNull(fragmentPhoneAlertSettingBindingBind);
        FrameLayout frameLayout = fragmentPhoneAlertSettingBindingBind.phoneAlertSettingLayout;
        View viewOnCreateView2 = s().onCreateView(inflater, frameLayout, savedInstanceState);
        if (viewOnCreateView2 != null) {
            frameLayout.addView(viewOnCreateView2);
        }
        FragmentPhoneAlertSettingBinding fragmentPhoneAlertSettingBinding = this.binding;
        Objects.requireNonNull(fragmentPhoneAlertSettingBinding);
        FrameLayout frameLayout2 = fragmentPhoneAlertSettingBinding.btPhoneSettingLayout;
        View viewOnCreateView3 = q().onCreateView(inflater, frameLayout2, savedInstanceState);
        if (viewOnCreateView3 != null) {
            frameLayout2.addView(viewOnCreateView3);
        }
        return viewOnCreateView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        v().checkAuth();
        if (s().isShown()) {
            s().onResume();
        } else if (q().isShown()) {
            q().onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        IncomingCallAnalytics.INSTANCE.pageOpen();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        K();
        C();
        FragmentPhoneAlertSettingBinding fragmentPhoneAlertSettingBinding = this.binding;
        Objects.requireNonNull(fragmentPhoneAlertSettingBinding);
        fragmentPhoneAlertSettingBinding.titleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: xv5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PhoneAlertSettingFragment.P(this.a, view2);
            }
        });
        s().onViewCreated(view, savedInstanceState);
        q().onViewCreated(view, savedInstanceState);
        E();
        G();
        A();
        View viewFindViewById = view.findViewById(R.id.phone_call_sms_reply_container);
        getChildFragmentManager().beginTransaction().add(R.id.phone_call_sms_reply_container, PhoneCallSmsReplySettingFragment.class, (Bundle) null).commitAllowingStateLoss();
        Unit unit = Unit.INSTANCE;
        this.smsReplySettingContainer = viewFindViewById;
        u().refresh();
    }
}
