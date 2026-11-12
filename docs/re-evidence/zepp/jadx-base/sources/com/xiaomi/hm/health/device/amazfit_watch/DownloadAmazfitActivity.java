package com.xiaomi.hm.health.device.amazfit_watch;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.web.service.WebItem;
import com.huami.web.service.WebViewService;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class DownloadAmazfitActivity extends BaseTitleActivity {
    public static final String AMAZFIT_WATCH_APP_PACKAGE_NAME = "com.huami.watch.hmwatchmanager";
    public static final String AMAZFIT_WATCH_BIND_ACTION = "com.huami.watch.companion.show.me";
    private static final String B = "DownloadAmazfitActivity";
    private static final String C = "https://api-watch.huami.com/forwarding/watchAppLink";
    public static final String DOWNLOAD_EXTRA = "download_direct";
    private TextView A;
    private final Lazy<DeviceXNavigator> x = KoinJavaComponent.inject(DeviceXNavigator.class);
    private final Lazy<WebViewService> y = KoinJavaComponent.inject(WebViewService.class);
    private TextView z;

    @SuppressLint({"StringFormatInvalid"})
    private void initViews() {
        TextView textView = (TextView) findViewById(R.id.left_btn);
        textView.setText(R.string.cancel);
        textView.setOnClickListener(new View.OnClickListener() { // from class: mc1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.q(view);
            }
        });
        this.z = (TextView) findViewById(R.id.right_btn);
        this.A = (TextView) findViewById(R.id.title_tv);
        if (getIntent() != null && getIntent().getBooleanExtra(DOWNLOAD_EXTRA, false)) {
            o();
            return;
        }
        this.z.setText(R.string.go_to_bind);
        this.z.setOnClickListener(new View.OnClickListener() { // from class: nc1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.r(view);
            }
        });
        this.A.setText(getString(R.string.bind_in_amazfit_app, new Object[]{getString(R.string.amazfit_watch_app)}));
    }

    private void o() {
        this.A.setText(getString(R.string.install_amazfit_tips, new Object[]{getString(R.string.amazfit_watch_app)}));
        this.z.setText(R.string.download_now);
        this.z.setOnClickListener(new View.OnClickListener() { // from class: lc1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.p(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(View view) {
        HMLog.i(B, "isMIUI: " + DeviceXFunctionsKt.getAppStateApi().isMiui(), new Object[0]);
        if (DeviceXFunctionsKt.getAppStateApi().isMiui()) {
            this.x.getValue().goToMarket(this, "com.huami.watch.hmwatchmanager");
            return;
        }
        WebItem webItem = new WebItem(C);
        webItem.from = "FROM_VIRTUAL_WATCH";
        this.y.getValue().launch(webItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(View view) {
        if (this.z.getText().equals(getString(R.string.go_to_bind))) {
            boolean z = false;
            try {
                if (getPackageManager().getPackageInfo("com.huami.watch.hmwatchmanager", 0) != null) {
                    z = true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (!z) {
                o();
                return;
            }
            try {
                startActivity(new Intent(AMAZFIT_WATCH_BIND_ACTION));
            } catch (Exception e2) {
                e2.printStackTrace();
                o();
            }
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_download_amazfit);
        setStyle(BaseTitleActivity.STYLE.NONE, ContextCompat.getColor(this, R.color.pale_grey_two), true);
        initViews();
    }
}
