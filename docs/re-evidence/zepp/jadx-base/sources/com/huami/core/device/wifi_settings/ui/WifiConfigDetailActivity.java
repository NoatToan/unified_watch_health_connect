package com.huami.core.device.wifi_settings.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.core.device.wifi_settings.R;
import com.huami.core.device.wifi_settings.WifiRouter;
import com.huami.core.device.wifi_settings.bean.WifiBean;
import com.huami.core.device.wifi_settings.ui.WifiConfigDetailActivity;
import com.huami.view.basetitle.BaseTitleActivity;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0012\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0016\u0010\u0014\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/huami/core/device/wifi_settings/ui/WifiConfigDetailActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", GoogleApiAvailabilityLight.b, "initView", "initData", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroidx/appcompat/widget/AppCompatTextView;", "x", "Landroidx/appcompat/widget/AppCompatTextView;", "mTvWifiName", "y", "mTvWifiIP", "z", "mTvWifiMac", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "mTvRemove", "B", "mTvReset", "Lcom/huami/core/device/wifi_settings/bean/WifiBean;", "C", "Lcom/huami/core/device/wifi_settings/bean/WifiBean;", "mWifiBean", "<init>", "()V", "Companion", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
public final class WifiConfigDetailActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String D = "data";

    @NotNull
    private static final String E = "source";

    @NotNull
    public static final String TAG = "WifiConfigDetail_Activity";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private AppCompatTextView mTvRemove;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private AppCompatTextView mTvReset;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    private WifiBean mWifiBean;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private AppCompatTextView mTvWifiName;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private AppCompatTextView mTvWifiIP;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private AppCompatTextView mTvWifiMac;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/huami/core/device/wifi_settings/ui/WifiConfigDetailActivity$Companion;", "", "Landroid/app/Activity;", "activity", "", "source", "Lcom/huami/core/device/wifi_settings/bean/WifiBean;", "wifiBean", "requestCode", "", "startActivity", "", "KEY_DATA", "Ljava/lang/String;", "KEY_SOURCE", "TAG", "<init>", "()V", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void startActivity(@NotNull Activity activity, int source, @NotNull WifiBean wifiBean, int requestCode) {
            Intent intent = new Intent(activity, (Class<?>) WifiConfigDetailActivity.class);
            intent.putExtra("data", wifiBean);
            intent.putExtra("source", source);
            activity.startActivityForResult(intent, requestCode);
        }
    }

    private final void initData() {
        Serializable serializableExtra;
        Intent intent = getIntent();
        WifiBean wifiBean = (intent == null || (serializableExtra = intent.getSerializableExtra("data")) == null) ? null : (WifiBean) serializableExtra;
        this.mWifiBean = wifiBean;
        if (wifiBean != null) {
            AppCompatTextView appCompatTextView = this.mTvWifiName;
            if (appCompatTextView == null) {
                appCompatTextView = null;
            }
            appCompatTextView.setText(wifiBean.getWifiSSID());
            AppCompatTextView appCompatTextView2 = this.mTvWifiIP;
            if (appCompatTextView2 == null) {
                appCompatTextView2 = null;
            }
            appCompatTextView2.setText(wifiBean.getIpAddress());
            AppCompatTextView appCompatTextView3 = this.mTvWifiMac;
            (appCompatTextView3 != null ? appCompatTextView3 : null).setText(wifiBean.getMacAddress());
        }
    }

    private final void initView() {
        this.mTvWifiName = (AppCompatTextView) findViewById(R.id.tv_wifi_name);
        this.mTvWifiIP = (AppCompatTextView) findViewById(R.id.tv_wifi_ip);
        this.mTvWifiMac = (AppCompatTextView) findViewById(R.id.tv_wifi_mac);
        this.mTvRemove = (AppCompatTextView) findViewById(R.id.tv_remove);
        this.mTvReset = (AppCompatTextView) findViewById(R.id.tv_reset);
        AppCompatTextView appCompatTextView = this.mTvRemove;
        if (appCompatTextView == null) {
            appCompatTextView = null;
        }
        appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: vu8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WifiConfigDetailActivity.o(view);
            }
        });
        AppCompatTextView appCompatTextView2 = this.mTvReset;
        (appCompatTextView2 != null ? appCompatTextView2 : null).setOnClickListener(new View.OnClickListener() { // from class: uu8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WifiConfigDetailActivity.p(this.a, view);
            }
        });
    }

    private final void n() {
        setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, -1, true);
        setLeftImageRes(R.mipmap.wifi_setting_icon_back, R.color.color_black);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(WifiConfigDetailActivity wifiConfigDetailActivity, View view) {
        WifiRouter wifiRouter = WifiRouter.INSTANCE;
        Intent intent = wifiConfigDetailActivity.getIntent();
        WifiRouter.launchWifiSet$default(wifiRouter, wifiConfigDetailActivity, intent == null ? 0 : intent.getIntExtra("source", 0), wifiConfigDetailActivity.mWifiBean, false, 0, 16, null);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wifi_setting_activity_wifi_config_detail);
        n();
        initView();
        initData();
    }
}
