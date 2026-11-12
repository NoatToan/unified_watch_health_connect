package com.huami.core.device.wifi_settings.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.core.device.wifi_settings.R;
import com.huami.core.device.wifi_settings.WifiRouter;
import com.huami.core.device.wifi_settings.bean.WifiBean;
import com.huami.core.device.wifi_settings.service.IWiFiControllerProxy;
import com.huami.core.device.wifi_settings.service.WiFiSettingInit;
import com.huami.core.device.wifi_settings.ui.WifiSetActivity;
import com.huami.core.device.wifi_settings.wifiscan.WifiUtil;
import com.huami.tools.log.HMLog;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000]\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\b*\u00014\u0018\u0000 :2\u00020\u0001:\u0001:B\u0007¢\u0006\u0004\b8\u00109J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\"\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014J\u0018\u0010\u0019\u001a\u00020\u00022\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u000eH\u0016R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010!R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010+R\u0016\u0010.\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010+R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010+R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u0006;"}, d2 = {"Lcom/huami/core/device/wifi_settings/ui/WifiSetActivity;", "Lcom/huami/core/device/wifi_settings/ui/BaseWifiActivity;", "", "B", "Lcom/huami/core/device/wifi_settings/bean/WifiBean;", "wifiBean", "H", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "K", "F", "", "initLayout", "maskViewId", "statusContainerId", "", "scanWifiEnable", "initView", "initData", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "", "list", "resultSuc", "filter5G", "Landroid/widget/Button;", "C", "Landroid/widget/Button;", "mTvConnect", "Landroidx/appcompat/widget/AppCompatEditText;", LogUtil.D, "Landroidx/appcompat/widget/AppCompatEditText;", "mEdWifiPwd", "E", "mEdWifiName", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "mIvShowWifiPwd", "G", "Lcom/huami/core/device/wifi_settings/bean/WifiBean;", "mWifiBean", "Z", "needWifiPwd", LogUtil.I, "isCanFinished", "Lcom/huami/core/device/wifi_settings/service/IWiFiControllerProxy;", "J", "Lcom/huami/core/device/wifi_settings/service/IWiFiControllerProxy;", "mWifiProxy", "wifiScanEnable", "com/huami/core/device/wifi_settings/ui/WifiSetActivity$mEditTextWatcher$1", "L", "Lcom/huami/core/device/wifi_settings/ui/WifiSetActivity$mEditTextWatcher$1;", "mEditTextWatcher", "<init>", "()V", "Companion", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
public final class WifiSetActivity extends BaseWifiActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String KEY_CONNECT = "connect";

    @NotNull
    public static final String KEY_CONNECT_RESULT = "connectResult";

    @NotNull
    public static final String KEY_CONNECT_SSID = "wifiSSID";

    @NotNull
    public static final String KEY_WIFI_SCAN_ENABLE = "wifiEnable";
    public static final int REQUEST_CODE_FOR_CONNECT_RESULT = 103;
    public static final int REQUEST_CODE_FOR_OTHER_RESULT = 102;

    @NotNull
    public static final String TAG = "WifiSet_Activity";

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private Button mTvConnect;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private AppCompatEditText mEdWifiPwd;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private AppCompatEditText mEdWifiName;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private AppCompatImageView mIvShowWifiPwd;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @Nullable
    private WifiBean mWifiBean;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private boolean isCanFinished;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @Nullable
    private IWiFiControllerProxy mWifiProxy;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private boolean needWifiPwd = true;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private boolean wifiScanEnable = true;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @NotNull
    private final WifiSetActivity$mEditTextWatcher$1 mEditTextWatcher = new TextWatcher() { // from class: com.huami.core.device.wifi_settings.ui.WifiSetActivity$mEditTextWatcher$1
        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable p0) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence p0, int p1, int p2, int p3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence p0, int p1, int p2, int p3) {
            AppCompatEditText appCompatEditText = this.a.mEdWifiPwd;
            if (appCompatEditText == null) {
                appCompatEditText = null;
            }
            int length = appCompatEditText.length();
            boolean z = true;
            boolean z2 = length >= 8;
            AppCompatImageView appCompatImageView = this.a.mIvShowWifiPwd;
            if (appCompatImageView == null) {
                appCompatImageView = null;
            }
            appCompatImageView.setVisibility(length > 0 ? 0 : 8);
            Button button = this.a.mTvConnect;
            Button button2 = button != null ? button : null;
            if (this.a.needWifiPwd && !z2) {
                z = false;
            }
            button2.setEnabled(z);
        }
    };

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J4\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004R\u0016\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\r8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\r8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\r8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\r8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/huami/core/device/wifi_settings/ui/WifiSetActivity$Companion;", "", "Landroid/app/Activity;", "activity", "", "source", "Lcom/huami/core/device/wifi_settings/bean/WifiBean;", "wifiBean", "", "wifiScanEnable", "requestCode", "", "startActivity", "", "KEY_CONNECT", "Ljava/lang/String;", "KEY_CONNECT_RESULT", "KEY_CONNECT_SSID", "KEY_WIFI_SCAN_ENABLE", "REQUEST_CODE_FOR_CONNECT_RESULT", LogUtil.I, "REQUEST_CODE_FOR_OTHER_RESULT", "TAG", "<init>", "()V", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void startActivity$default(Companion companion, Activity activity, int i, WifiBean wifiBean, boolean z, int i2, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                wifiBean = null;
            }
            companion.startActivity(activity, i, wifiBean, (i3 & 8) != 0 ? true : z, i2);
        }

        public final void startActivity(@NotNull Activity activity, int source, @Nullable WifiBean wifiBean, boolean wifiScanEnable, int requestCode) {
            Intent intent = new Intent(activity, (Class<?>) WifiSetActivity.class);
            if (wifiBean != null) {
                intent.putExtra(WifiSetActivity.KEY_CONNECT, wifiBean);
            }
            intent.putExtra(WifiSetActivity.KEY_WIFI_SCAN_ENABLE, wifiScanEnable);
            intent.putExtra("source", source);
            activity.startActivityForResult(intent, requestCode);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "connect success!!!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ List<WifiBean> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<WifiBean> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("resultSuc:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "wifiBean list is empty";
        }
    }

    private final void A() {
        this.isCanFinished = true;
        WifiRouter.INSTANCE.launchWifiList(this, getMSource(), 102);
    }

    private final void B() {
        F();
        AppCompatEditText appCompatEditText = this.mEdWifiPwd;
        if (appCompatEditText == null) {
            appCompatEditText = null;
        }
        appCompatEditText.addTextChangedListener(this.mEditTextWatcher);
        Button button = this.mTvConnect;
        (button != null ? button : null).setOnClickListener(new View.OnClickListener() { // from class: tv8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WifiSetActivity.C(this.a, view);
            }
        });
        ((AppCompatTextView) findViewById(R.id.tv_other_wifi)).setOnClickListener(new View.OnClickListener() { // from class: uv8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WifiSetActivity.D(this.a, view);
            }
        });
        ((AppCompatTextView) findViewById(R.id.tv_wifi_tips)).setOnClickListener(new View.OnClickListener() { // from class: vv8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WifiSetActivity.E(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(WifiSetActivity wifiSetActivity, View view) {
        WifiBean wifiBean = wifiSetActivity.mWifiBean;
        if (wifiBean == null) {
            return;
        }
        wifiBean.setWifiPwd(String.valueOf(((AppCompatEditText) wifiSetActivity.findViewById(R.id.edit_wifi_pwd)).getText()));
        wifiSetActivity.H(wifiBean);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(WifiSetActivity wifiSetActivity, View view) {
        wifiSetActivity.isCanFinished = false;
        WifiRouter.INSTANCE.launchWifiList(wifiSetActivity, wifiSetActivity.getMSource(), 102);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(WifiSetActivity wifiSetActivity, View view) {
        IWiFiControllerProxy iWiFiControllerProxy = wifiSetActivity.mWifiProxy;
        if (iWiFiControllerProxy == null) {
            return;
        }
        iWiFiControllerProxy.onClickHelp(wifiSetActivity, IWiFiControllerProxy.ClickType.CONNECT_TIPS);
    }

    private final void F() {
        AppCompatEditText appCompatEditText = this.mEdWifiPwd;
        if (appCompatEditText == null) {
            appCompatEditText = null;
        }
        final int inputType = appCompatEditText.getInputType();
        AppCompatImageView appCompatImageView = this.mIvShowWifiPwd;
        (appCompatImageView != null ? appCompatImageView : null).setOnClickListener(new View.OnClickListener() { // from class: wv8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WifiSetActivity.G(this.a, inputType, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(WifiSetActivity wifiSetActivity, int i, View view) {
        AppCompatEditText appCompatEditText = wifiSetActivity.mEdWifiPwd;
        if (appCompatEditText == null) {
            appCompatEditText = null;
        }
        if (appCompatEditText.getInputType() == i) {
            AppCompatEditText appCompatEditText2 = wifiSetActivity.mEdWifiPwd;
            if (appCompatEditText2 == null) {
                appCompatEditText2 = null;
            }
            appCompatEditText2.setInputType(144);
            AppCompatImageView appCompatImageView = wifiSetActivity.mIvShowWifiPwd;
            if (appCompatImageView == null) {
                appCompatImageView = null;
            }
            appCompatImageView.setImageResource(R.mipmap.wifi_setting_icon_pwd_eye_open);
        } else {
            AppCompatEditText appCompatEditText3 = wifiSetActivity.mEdWifiPwd;
            if (appCompatEditText3 == null) {
                appCompatEditText3 = null;
            }
            appCompatEditText3.setInputType(i);
            AppCompatImageView appCompatImageView2 = wifiSetActivity.mIvShowWifiPwd;
            if (appCompatImageView2 == null) {
                appCompatImageView2 = null;
            }
            appCompatImageView2.setImageResource(R.mipmap.wifi_setting_icon_pwd_eye_close);
        }
        AppCompatEditText appCompatEditText4 = wifiSetActivity.mEdWifiPwd;
        if (appCompatEditText4 == null) {
            appCompatEditText4 = null;
        }
        appCompatEditText4.setTypeface(Typeface.MONOSPACE);
        AppCompatEditText appCompatEditText5 = wifiSetActivity.mEdWifiPwd;
        if (appCompatEditText5 == null) {
            appCompatEditText5 = null;
        }
        AppCompatEditText appCompatEditText6 = wifiSetActivity.mEdWifiPwd;
        appCompatEditText5.setSelection((appCompatEditText6 != null ? appCompatEditText6 : null).length());
    }

    private final void H(WifiBean wifiBean) {
        if (WifiUtil.INSTANCE.wifiBeanIsWifi5G(wifiBean)) {
            CenterDialogFragment.setPositiveButton$default(CenterDialogFragment.setNegativeButton$default(CenterDialogFragment.Companion.newInstance$default(CenterDialogFragment.INSTANCE, 0, 1, null).setTitle(getString(R.string.wifi_set_not_support_title)).setMessage(getString(R.string.wifi_set_not_support_msg)), getString(R.string.wifi_help), null, new DialogInterface.OnClickListener() { // from class: rv8
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    WifiSetActivity.I(this.a, dialogInterface, i);
                }
            }, 2, null), getString(R.string.wifi_connect_success), null, new DialogInterface.OnClickListener() { // from class: sv8
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    WifiSetActivity.J(dialogInterface, i);
                }
            }, 2, null).show(getSupportFragmentManager());
        } else {
            WifiRouter.INSTANCE.launchWifiConnect(this, getMSource(), wifiBean, 103);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(WifiSetActivity wifiSetActivity, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        IWiFiControllerProxy iWiFiControllerProxy = wifiSetActivity.mWifiProxy;
        if (iWiFiControllerProxy == null) {
            return;
        }
        iWiFiControllerProxy.onClickHelp(wifiSetActivity, IWiFiControllerProxy.ClickType.CONNECT_TIPS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    private final void K() {
        WifiBean wifiBean = this.mWifiBean;
        if (wifiBean != null) {
            AppCompatEditText appCompatEditText = this.mEdWifiName;
            if (appCompatEditText == null) {
                appCompatEditText = null;
            }
            appCompatEditText.setText(wifiBean.getWifiSSID());
            AppCompatEditText appCompatEditText2 = this.mEdWifiName;
            if (appCompatEditText2 == null) {
                appCompatEditText2 = null;
            }
            String wifiSSID = wifiBean.getWifiSSID();
            appCompatEditText2.setSelection(wifiSSID == null ? 0 : wifiSSID.length());
            this.needWifiPwd = WifiUtil.INSTANCE.needWifiPwd(wifiBean.getCapabilities());
            ((FrameLayout) findViewById(R.id.layout_wifi_pwd)).setVisibility(this.needWifiPwd ? 0 : 8);
            Button button = this.mTvConnect;
            if (button == null) {
                button = null;
            }
            button.setEnabled(!this.needWifiPwd);
        }
        AppCompatEditText appCompatEditText3 = this.mEdWifiPwd;
        (appCompatEditText3 != null ? appCompatEditText3 : null).setText("");
    }

    @Override // com.huami.core.device.wifi_settings.ui.BaseWifiActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.core.device.wifi_settings.ui.BaseWifiActivity
    public boolean filter5G() {
        return false;
    }

    @Override // com.huami.core.device.wifi_settings.ui.BaseWifiActivity
    public void initData() {
        Intent intent = getIntent();
        if (intent != null) {
            Serializable serializableExtra = intent.getSerializableExtra(KEY_CONNECT);
            this.mWifiBean = serializableExtra == null ? null : (WifiBean) serializableExtra;
        }
        this.mWifiProxy = WiFiSettingInit.INSTANCE.getControllerProxy(getMSource());
        if (this.mWifiBean != null) {
            K();
            return;
        }
        WifiUtil wifiUtil = WifiUtil.INSTANCE;
        if (!wifiUtil.isWifiConnect(this) || wifiUtil.currentIsWifi5G(this)) {
            A();
        }
    }

    @Override // com.huami.core.device.wifi_settings.ui.BaseWifiActivity
    public int initLayout() {
        return R.layout.wifi_setting_activity_wifi_set;
    }

    @Override // com.huami.core.device.wifi_settings.ui.BaseWifiActivity
    public void initView() {
        this.mTvConnect = (Button) findViewById(R.id.tv_connect);
        this.mIvShowWifiPwd = (AppCompatImageView) findViewById(R.id.iv_show_password);
        this.mEdWifiName = (AppCompatEditText) findViewById(R.id.edit_wifi_name);
        this.mEdWifiPwd = (AppCompatEditText) findViewById(R.id.edit_wifi_pwd);
        B();
        Intent intent = getIntent();
        this.wifiScanEnable = (intent == null ? true : intent.getBooleanExtra(KEY_WIFI_SCAN_ENABLE, true)) && WifiUtil.INSTANCE.isWifiConnect(this);
    }

    @Override // com.huami.core.device.wifi_settings.ui.BaseWifiActivity
    public int maskViewId() {
        return R.id.mask_view;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode != -1) {
            if (this.isCanFinished) {
                finish();
                return;
            }
            return;
        }
        if (requestCode == 102) {
            Serializable serializableExtra = data != null ? data.getSerializableExtra(KEY_CONNECT) : null;
            if (this.isCanFinished && serializableExtra == null) {
                finish();
                return;
            } else {
                if (serializableExtra == null) {
                    return;
                }
                this.mWifiBean = (WifiBean) serializableExtra;
                K();
                return;
            }
        }
        if (requestCode != 103) {
            return;
        }
        if (data != null ? data.getBooleanExtra(KEY_CONNECT_RESULT, false) : false) {
            HMLog.debug(TAG, a.a);
            Intent intent = getIntent();
            WifiBean wifiBean = this.mWifiBean;
            intent.putExtra(KEY_CONNECT_SSID, wifiBean != null ? wifiBean.getWifiSSID() : null);
            setResult(-1, getIntent());
            finish();
        }
    }

    @Override // com.huami.core.device.wifi_settings.ui.BaseWifiActivity, com.huami.core.device.wifi_settings.wifiscan.listener.ScanResultListener
    public void resultSuc(@Nullable List<WifiBean> list) {
        super.resultSuc(list);
        HMLog.verbose(TAG, new b(list));
        if (this.mWifiBean != null) {
            HMLog.i(TAG, "wifiBean is not Empty!!!", new Object[0]);
            return;
        }
        if (list != null && list.isEmpty()) {
            HMLog.info$default(null, c.a, 1, null);
            return;
        }
        if (WifiUtil.INSTANCE.isWifiConnect(this) && list != null) {
            this.mWifiBean = list.get(0);
        }
        K();
    }

    @Override // com.huami.core.device.wifi_settings.ui.BaseWifiActivity
    /* JADX INFO: renamed from: scanWifiEnable, reason: from getter */
    public boolean getWifiScanEnable() {
        return this.wifiScanEnable;
    }

    @Override // com.huami.core.device.wifi_settings.ui.BaseWifiActivity
    public int statusContainerId() {
        return R.id.device_status;
    }
}
