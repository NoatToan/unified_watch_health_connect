package com.xiaomi.hm.health.device;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.devicex.R;
import com.huami.devicex.injection.basic.AccountWebExtApi;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class InstallNormandyActivity extends BaseTitleActivity {
    public static final String EXTRA = "can_back";
    private TextView A;
    private TextView B;
    private HMPersonInfo C;
    private HMMiliConfig D;
    private final Lazy<AccountWebExtApi> E;
    private final Lazy<DeviceXNavigator> F;
    private boolean G;
    private ImageView x;
    private ImageView y;
    private TextView z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((DeviceXNavigator) InstallNormandyActivity.this.F.getValue()).startHMShoesCalibrateActivity(InstallNormandyActivity.this, 1, HMDeviceSource.SHOES_MARS);
            InstallNormandyActivity.this.finish();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            InstallNormandyActivity.this.r(true, false);
            InstallNormandyActivity.this.D.setShoePlaceMode("LEFT_SHOE");
            InstallNormandyActivity.this.C.saveInfo(2);
            ((AccountWebExtApi) InstallNormandyActivity.this.E.getValue()).updateProfile(false);
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            InstallNormandyActivity.this.r(false, true);
            InstallNormandyActivity.this.D.setShoePlaceMode(HMMiliConfig.RIGHT_SHOE);
            InstallNormandyActivity.this.C.saveInfo(2);
            ((AccountWebExtApi) InstallNormandyActivity.this.E.getValue()).updateProfile(false);
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            InstallNormandyActivity.this.finish();
        }
    }

    public InstallNormandyActivity() {
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        this.C = hMPersonInfo;
        this.D = hMPersonInfo.getMiliConfig();
        this.E = KoinJavaComponent.inject(AccountWebExtApi.class);
        this.F = KoinJavaComponent.inject(DeviceXNavigator.class);
        this.G = false;
    }

    private void initViews() {
        TextView textView = (TextView) findViewById(R.id.right_btn);
        this.B = textView;
        textView.setText(R.string.normandy_next_step);
        TextView textView2 = this.B;
        if (textView2 != null) {
            textView2.setOnClickListener(new a());
        }
        q();
        this.x = (ImageView) findViewById(R.id.normandy_left_img);
        this.y = (ImageView) findViewById(R.id.normandy_right_img);
        this.A = (TextView) findViewById(R.id.left_shoe_tv);
        this.z = (TextView) findViewById(R.id.right_shoe_tv);
        this.x.setOnClickListener(new b());
        this.y.setOnClickListener(new c());
        r(this.D.getShoePlaceMode().equals("LEFT_SHOE"), this.D.getShoePlaceMode().equals(HMMiliConfig.RIGHT_SHOE));
        ((TextView) findViewById(R.id.install_title_tv)).setText(getString(R.string.install_normandy, new Object[]{getString(R.string.chip_device_name)}));
    }

    private void q() {
        TextView textView = (TextView) findViewById(R.id.left_btn);
        textView.setText(R.string.cancel);
        if (this.G) {
            textView.setVisibility(0);
            textView.setOnClickListener(new d());
            return;
        }
        textView.setVisibility(8);
        ViewGroup.LayoutParams layoutParams = this.B.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        this.B.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(boolean z, boolean z2) {
        if (!z && !z2) {
            this.B.setEnabled(false);
        }
        if (z) {
            this.x.setAlpha(1.0f);
            this.A.setAlpha(1.0f);
            this.B.setEnabled(true);
        } else {
            this.x.setAlpha(0.5f);
            this.A.setAlpha(0.5f);
        }
        if (!z2) {
            this.y.setAlpha(0.5f);
            this.z.setAlpha(0.5f);
        } else {
            this.y.setAlpha(1.0f);
            this.z.setAlpha(1.0f);
            this.B.setEnabled(true);
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_install_normandy);
        setStyle(BaseTitleActivity.STYLE.NONE, ContextCompat.getColor(this, R.color.pale_grey_two), true);
        this.G = getIntent().getBooleanExtra(EXTRA, true);
        initViews();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.E.getValue().updateProfile(false);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        return !this.G || super.onKeyDown(i, keyEvent);
    }
}
