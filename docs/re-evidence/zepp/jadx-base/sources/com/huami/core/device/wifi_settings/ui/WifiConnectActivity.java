package com.huami.core.device.wifi_settings.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.core.device.wifi_settings.R;
import com.huami.core.device.wifi_settings.bean.ConnectStatus;
import com.huami.core.device.wifi_settings.bean.WiFiConnectStatus;
import com.huami.core.device.wifi_settings.bean.WifiBean;
import com.huami.core.device.wifi_settings.bean.WifiDeviceConnect;
import com.huami.core.device.wifi_settings.service.IWiFiControllerProxy;
import com.huami.core.device.wifi_settings.service.WiFiSettingInit;
import com.huami.core.device.wifi_settings.ui.WifiConnectActivity;
import com.huami.core.device.wifi_settings.ui.view.ProgressView;
import com.huami.core.device.wifi_settings.utils.WiFiConnectErrorCode;
import com.huami.core.device.wifi_settings.viewmodel.WifiViewModel;
import com.huami.core.device.wifi_settings.viewmodel.WifiViewModelFactory;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0007¢\u0006\u0004\b9\u0010:J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J#\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\u0012\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0002H\u0016J\b\u0010\u0016\u001a\u00020\u0002H\u0014R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0004\u0010\u001eR\u0016\u0010!\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0016\u0010#\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u0016\u0010%\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010\u001eR\u0016\u0010'\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010&R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00108\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u00107¨\u0006<"}, d2 = {"Lcom/huami/core/device/wifi_settings/ui/WifiConnectActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "initData", "z", DTransferConstants.SEARCH_KEY, LogUtil.D, "initView", "w", "", "status", "errorCode", "u", "(ILjava/lang/Integer;)V", "t", SOAP.XMLNS, "r", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onLeftClicked", "onBackPressed", "onDestroy", "Lcom/huami/core/device/wifi_settings/ui/view/ProgressView;", "x", "Lcom/huami/core/device/wifi_settings/ui/view/ProgressView;", "mProgressView", "y", "mProgressEndView", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "mTvTitle", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "mTvTips", "B", "mTvBottom", "C", "mTvHelp", LogUtil.I, "mStatus", "Lcom/huami/core/device/wifi_settings/bean/WifiBean;", "E", "Lcom/huami/core/device/wifi_settings/bean/WifiBean;", "mWifiBean", "F", "mSource", "Lcom/huami/core/device/wifi_settings/viewmodel/WifiViewModel;", "G", "Lcom/huami/core/device/wifi_settings/viewmodel/WifiViewModel;", "mWifiViewModel", "Lcom/huami/core/device/wifi_settings/ui/WifiConnectActivity$Companion$MyHandler;", "H", "Lcom/huami/core/device/wifi_settings/ui/WifiConnectActivity$Companion$MyHandler;", "mHandler", "", "Z", "timeOut", "<init>", "()V", "Companion", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
public final class WifiConnectActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String J = "data";

    @NotNull
    private static final String K = "source";
    public static final int MESSAGE_TIME_OUT = 100;
    public static final int STATUS_CONNECT_FAILED = 2;
    public static final int STATUS_CONNECT_ING = 0;
    public static final int STATUS_CONNECT_SUCCESS = 1;

    @NotNull
    public static final String TAG = "WifiConnect_Activity";
    public static final long TIME_OUT = 60000;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private AppCompatTextView mTvTips;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private AppCompatTextView mTvBottom;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private AppCompatTextView mTvHelp;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private int mStatus;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    private WifiBean mWifiBean;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private int mSource;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @Nullable
    private WifiViewModel mWifiViewModel;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    private final Companion.MyHandler mHandler = new Companion.MyHandler(this);

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private boolean timeOut;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private ProgressView mProgressView;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private ProgressView mProgressEndView;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private AppCompatTextView mTvTitle;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u001aB\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0004R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0016\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/huami/core/device/wifi_settings/ui/WifiConnectActivity$Companion;", "", "Landroid/app/Activity;", "activity", "", "source", "Lcom/huami/core/device/wifi_settings/bean/WifiBean;", "wifiBean", "requestCode", "", "startActivity", "", "KEY_DATA", "Ljava/lang/String;", "KEY_SOURCE", "MESSAGE_TIME_OUT", LogUtil.I, "STATUS_CONNECT_FAILED", "STATUS_CONNECT_ING", "STATUS_CONNECT_SUCCESS", "TAG", "", "TIME_OUT", "J", "<init>", "()V", "MyHandler", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R$\u0010\u000b\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/huami/core/device/wifi_settings/ui/WifiConnectActivity$Companion$MyHandler;", "Landroid/os/Handler;", "Landroid/os/Message;", "msg", "", "handleMessage", "Ljava/lang/ref/WeakReference;", "Lcom/huami/core/device/wifi_settings/ui/WifiConnectActivity;", "kotlin.jvm.PlatformType", "a", "Ljava/lang/ref/WeakReference;", "mWeakReference", "activity", "<init>", "(Lcom/huami/core/device/wifi_settings/ui/WifiConnectActivity;)V", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
        public static final class MyHandler extends Handler {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private WeakReference<WifiConnectActivity> mWeakReference;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public static final a a = new a();

                public a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "connect failed: time out!!!";
                }
            }

            public MyHandler(@NotNull WifiConnectActivity wifiConnectActivity) {
                this.mWeakReference = new WeakReference<>(wifiConnectActivity);
            }

            @Override // android.os.Handler
            public void handleMessage(@NotNull Message msg) {
                super.handleMessage(msg);
                WifiConnectActivity wifiConnectActivity = this.mWeakReference.get();
                if (wifiConnectActivity != null && msg.what == 100) {
                    HMLog.info(WifiConnectActivity.TAG, a.a);
                    wifiConnectActivity.timeOut = true;
                    WifiConnectActivity.v(wifiConnectActivity, 2, null, 2, null);
                }
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void startActivity(@NotNull Activity activity, int source, @Nullable WifiBean wifiBean, int requestCode) {
            Intent intent = new Intent(activity, (Class<?>) WifiConnectActivity.class);
            intent.putExtra("data", wifiBean);
            intent.putExtra("source", source);
            activity.startActivityForResult(intent, requestCode);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[WifiViewModel.UpdateState.values().length];
            iArr[WifiViewModel.UpdateState.START.ordinal()] = 1;
            iArr[WifiViewModel.UpdateState.FAIL.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ConnectStatus.values().length];
            iArr2[ConnectStatus.CONNECTING.ordinal()] = 1;
            iArr2[ConnectStatus.CONNECTED.ordinal()] = 2;
            $EnumSwitchMapping$1 = iArr2;
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
        public final String invoke() {
            return "connect wifi  data is EMPTY!!!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ WifiViewModel.UpdateState a;
        public final /* synthetic */ WifiConnectActivity b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(WifiViewModel.UpdateState updateState, WifiConnectActivity wifiConnectActivity) {
            super(0);
            this.a = updateState;
            this.b = wifiConnectActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "wifi send cmd status" + this.a + ":timeOut" + this.b.timeOut;
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
        public final String invoke() {
            return "send connect cmd  success!!!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ WiFiConnectStatus a;
        public final /* synthetic */ WifiConnectActivity b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(WiFiConnectStatus wiFiConnectStatus, WifiConnectActivity wifiConnectActivity) {
            super(0);
            this.a = wiFiConnectStatus;
            this.b = wifiConnectActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "wifi status change:" + this.a + JsonLexerKt.COLON + this.b.timeOut;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ WifiDeviceConnect a;
        public final /* synthetic */ WifiConnectActivity b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(WifiDeviceConnect wifiDeviceConnect, WifiConnectActivity wifiConnectActivity) {
            super(0);
            this.a = wifiDeviceConnect;
            this.b = wifiConnectActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "DeviceConnectEvent:" + this.a + ":mSource:" + this.b.mSource;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(WifiConnectActivity wifiConnectActivity, WifiViewModel.UpdateState updateState) {
        if (updateState == null) {
            return;
        }
        HMLog.info(TAG, new b(updateState, wifiConnectActivity));
        int i = WhenMappings.$EnumSwitchMapping$0[updateState.ordinal()];
        if (i == 1) {
            v(wifiConnectActivity, 0, null, 2, null);
        } else {
            if (i == 2) {
                v(wifiConnectActivity, 2, null, 2, null);
                return;
            }
            wifiConnectActivity.mHandler.sendEmptyMessageDelayed(100, 60000L);
            wifiConnectActivity.timeOut = false;
            HMLog.info(TAG, c.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(WifiConnectActivity wifiConnectActivity, WiFiConnectStatus wiFiConnectStatus) {
        HMLog.info(TAG, new d(wiFiConnectStatus, wifiConnectActivity));
        if (wiFiConnectStatus == null || wifiConnectActivity.timeOut) {
            return;
        }
        int i = WhenMappings.$EnumSwitchMapping$1[wiFiConnectStatus.getStatus().ordinal()];
        if (i == 1) {
            String ssid = wiFiConnectStatus.getSsid();
            WifiBean wifiBean = wifiConnectActivity.mWifiBean;
            if (Intrinsics.areEqual(ssid, wifiBean == null ? null : wifiBean.getWifiSSID())) {
                v(wifiConnectActivity, 0, null, 2, null);
                return;
            }
            return;
        }
        if (i != 2) {
            wifiConnectActivity.u(2, wiFiConnectStatus.getErrorCode());
            return;
        }
        String ssid2 = wiFiConnectStatus.getSsid();
        WifiBean wifiBean2 = wifiConnectActivity.mWifiBean;
        if (Intrinsics.areEqual(ssid2, wifiBean2 == null ? null : wifiBean2.getWifiSSID())) {
            v(wifiConnectActivity, 1, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(WifiConnectActivity wifiConnectActivity, WifiDeviceConnect wifiDeviceConnect) {
        if (wifiDeviceConnect == null) {
            return;
        }
        HMLog.info(TAG, new e(wifiDeviceConnect, wifiConnectActivity));
        if (wifiDeviceConnect.getDeviceSource() == wifiConnectActivity.mSource && wifiDeviceConnect.isDisconnected()) {
            v(wifiConnectActivity, 2, null, 2, null);
        }
    }

    private final void D() {
        String wifiSSID;
        WifiBean wifiBean = this.mWifiBean;
        if (wifiBean == null || (wifiSSID = wifiBean.getWifiSSID()) == null) {
            return;
        }
        this.timeOut = false;
        WifiViewModel wifiViewModel = this.mWifiViewModel;
        if (wifiViewModel == null) {
            return;
        }
        WifiBean wifiBean2 = this.mWifiBean;
        wifiViewModel.connectWifi(wifiSSID, wifiBean2 == null ? null : wifiBean2.getWifiPwd());
    }

    private final void initData() {
        Intent intent = getIntent();
        if (intent != null) {
            Serializable serializableExtra = intent.getSerializableExtra("data");
            this.mWifiBean = serializableExtra == null ? null : (WifiBean) serializableExtra;
            this.mSource = intent.getIntExtra("source", 0);
        }
        if (this.mWifiBean == null) {
            HMLog.info(TAG, a.a);
            finish();
        } else {
            this.mWifiViewModel = (WifiViewModel) new ViewModelProvider(this, new WifiViewModelFactory(this.mSource)).get(WifiViewModel.class);
            z();
            q();
            D();
        }
    }

    private final void initView() {
        this.mTvTitle = (AppCompatTextView) findViewById(R.id.tv_title);
        this.mTvTips = (AppCompatTextView) findViewById(R.id.tv_tip);
        this.mProgressView = (ProgressView) findViewById(R.id.progress_load);
        this.mProgressEndView = (ProgressView) findViewById(R.id.progress_end);
        this.mTvBottom = (AppCompatTextView) findViewById(R.id.tv_bottom);
        AppCompatTextView appCompatTextView = (AppCompatTextView) findViewById(R.id.tv_help);
        this.mTvHelp = appCompatTextView;
        if (appCompatTextView == null) {
            appCompatTextView = null;
        }
        appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: cv8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WifiConnectActivity.x(this.a, view);
            }
        });
        AppCompatTextView appCompatTextView2 = this.mTvBottom;
        (appCompatTextView2 != null ? appCompatTextView2 : null).setOnClickListener(new View.OnClickListener() { // from class: bv8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WifiConnectActivity.y(this.a, view);
            }
        });
    }

    private final void q() {
        WifiViewModel wifiViewModel = this.mWifiViewModel;
        if (wifiViewModel == null) {
            return;
        }
        wifiViewModel.registerWifiStatusCallBack();
    }

    private final void r() {
        getIntent().putExtra(WifiSetActivity.KEY_CONNECT_RESULT, this.mStatus == 1);
        setResult(-1, getIntent());
        finish();
    }

    private final void s() {
        this.mHandler.removeMessages(100);
        WifiViewModel wifiViewModel = this.mWifiViewModel;
        if (wifiViewModel == null) {
            return;
        }
        wifiViewModel.cancelConnectWifi();
    }

    private final void t() {
        ProgressView progressView = this.mProgressView;
        if (progressView == null) {
            progressView = null;
        }
        progressView.stopLoading();
        ProgressView progressView2 = this.mProgressView;
        if (progressView2 == null) {
            progressView2 = null;
        }
        progressView2.setVisibility(8);
        ProgressView progressView3 = this.mProgressEndView;
        if (progressView3 == null) {
            progressView3 = null;
        }
        progressView3.setVisibility(0);
        AppCompatTextView appCompatTextView = this.mTvBottom;
        (appCompatTextView != null ? appCompatTextView : null).setVisibility(0);
    }

    private final void u(int status, Integer errorCode) {
        this.mStatus = status;
        if (status == 1) {
            this.mHandler.removeMessages(100);
            t();
            AppCompatTextView appCompatTextView = this.mTvTitle;
            if (appCompatTextView == null) {
                appCompatTextView = null;
            }
            appCompatTextView.setText(R.string.wifi_set_success);
            AppCompatTextView appCompatTextView2 = this.mTvTips;
            if (appCompatTextView2 == null) {
                appCompatTextView2 = null;
            }
            appCompatTextView2.setText(R.string.wifi_set_success_tips);
            AppCompatTextView appCompatTextView3 = this.mTvHelp;
            if (appCompatTextView3 == null) {
                appCompatTextView3 = null;
            }
            appCompatTextView3.setVisibility(8);
            ProgressView progressView = this.mProgressEndView;
            if (progressView == null) {
                progressView = null;
            }
            progressView.setImageResource(R.mipmap.wifi_setting_icon_wifi_con_success);
            AppCompatTextView appCompatTextView4 = this.mTvBottom;
            (appCompatTextView4 != null ? appCompatTextView4 : null).setText(R.string.wifi_connect_success);
            return;
        }
        if (status != 2) {
            AppCompatTextView appCompatTextView5 = this.mTvTitle;
            if (appCompatTextView5 == null) {
                appCompatTextView5 = null;
            }
            appCompatTextView5.setText(getString(R.string.wifi_connect_ing, new Object[]{this.mWifiBean.getWifiSSID()}));
            AppCompatTextView appCompatTextView6 = this.mTvTips;
            if (appCompatTextView6 == null) {
                appCompatTextView6 = null;
            }
            appCompatTextView6.setText(R.string.wifi_nearby_router);
            ProgressView progressView2 = this.mProgressView;
            if (progressView2 == null) {
                progressView2 = null;
            }
            progressView2.setVisibility(0);
            ProgressView progressView3 = this.mProgressEndView;
            if (progressView3 == null) {
                progressView3 = null;
            }
            progressView3.setVisibility(8);
            AppCompatTextView appCompatTextView7 = this.mTvBottom;
            if (appCompatTextView7 == null) {
                appCompatTextView7 = null;
            }
            appCompatTextView7.setVisibility(8);
            AppCompatTextView appCompatTextView8 = this.mTvHelp;
            if (appCompatTextView8 == null) {
                appCompatTextView8 = null;
            }
            appCompatTextView8.setVisibility(8);
            ProgressView progressView4 = this.mProgressView;
            (progressView4 != null ? progressView4 : null).startLoading();
            return;
        }
        this.mHandler.removeMessages(100);
        t();
        AppCompatTextView appCompatTextView9 = this.mTvTitle;
        if (appCompatTextView9 == null) {
            appCompatTextView9 = null;
        }
        appCompatTextView9.setText(R.string.wifi_set_failed);
        int auth_fail = WiFiConnectErrorCode.INSTANCE.getAUTH_FAIL();
        if (errorCode != null && errorCode.intValue() == auth_fail) {
            AppCompatTextView appCompatTextView10 = this.mTvTips;
            if (appCompatTextView10 == null) {
                appCompatTextView10 = null;
            }
            appCompatTextView10.setText(R.string.wifi_set_pwd_error);
        } else {
            AppCompatTextView appCompatTextView11 = this.mTvTips;
            if (appCompatTextView11 == null) {
                appCompatTextView11 = null;
            }
            appCompatTextView11.setText(R.string.wifi_set_failed_tips);
        }
        AppCompatTextView appCompatTextView12 = this.mTvHelp;
        if (appCompatTextView12 == null) {
            appCompatTextView12 = null;
        }
        appCompatTextView12.setVisibility(0);
        ProgressView progressView5 = this.mProgressEndView;
        if (progressView5 == null) {
            progressView5 = null;
        }
        progressView5.setImageResource(R.mipmap.wifi_setting_icon_wifi_con_failed);
        AppCompatTextView appCompatTextView13 = this.mTvBottom;
        (appCompatTextView13 != null ? appCompatTextView13 : null).setText(R.string.wifi_reset);
    }

    public static /* synthetic */ void v(WifiConnectActivity wifiConnectActivity, int i, Integer num, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            num = null;
        }
        wifiConnectActivity.u(i, num);
    }

    private final void w() {
        BaseWifiActivityKt.setUnifyTitleStyle$default(this, "", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(WifiConnectActivity wifiConnectActivity, View view) {
        WifiViewModel wifiViewModel = wifiConnectActivity.mWifiViewModel;
        if (wifiViewModel == null) {
            return;
        }
        wifiViewModel.clickHelp(wifiConnectActivity, IWiFiControllerProxy.ClickType.CONNECT_FAILED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(WifiConnectActivity wifiConnectActivity, View view) {
        wifiConnectActivity.r();
    }

    private final void z() {
        WifiViewModel wifiViewModel = this.mWifiViewModel;
        if (wifiViewModel != null) {
            wifiViewModel.getMStatusLiveData().observe(this, new Observer() { // from class: fv8
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    WifiConnectActivity.A(this.a, (WifiViewModel.UpdateState) obj);
                }
            });
            wifiViewModel.getMWifiConnectStatus().observe(this, new Observer() { // from class: dv8
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    WifiConnectActivity.B(this.a, (WiFiConnectStatus) obj);
                }
            });
        }
        LiveEventBus.get(WiFiSettingInit.KEY_DEVICE_EVENT, WifiDeviceConnect.class).observe(this, new Observer() { // from class: ev8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WifiConnectActivity.C(this.a, (WifiDeviceConnect) obj);
            }
        });
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.mStatus == 0) {
            s();
        }
        r();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wifi_setting_activity_wifi_connect);
        w();
        initView();
        initData();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.mStatus == 0) {
            ProgressView progressView = this.mProgressView;
            if (progressView == null) {
                progressView = null;
            }
            progressView.stopLoading();
        }
        this.mHandler.removeMessages(100);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity
    public void onLeftClicked() {
        onBackPressed();
    }
}
