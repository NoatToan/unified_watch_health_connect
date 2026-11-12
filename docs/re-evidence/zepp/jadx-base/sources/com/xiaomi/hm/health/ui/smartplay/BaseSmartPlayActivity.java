package com.xiaomi.hm.health.ui.smartplay;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huami.devicex.R;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import com.xiaomi.hm.health.ui.UnifyTitleBarStyle;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public abstract class BaseSmartPlayActivity extends BaseTitleActivity {
    public static final float E = 4.0f;
    private ImageView A;
    private TextView B;
    private boolean C = true;
    private BLEStatueListenerAdapter D;
    public BTStatusFragment mFragment;
    private View x;
    private View y;
    private ViewGroup z;

    public class a extends BLEStatueListenerAdapter {
        public a() {
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public HMDeviceType getHMDeviceType() {
            return HMDeviceType.MILI;
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public List<HMDeviceSource> getSupportDevices() {
            return BaseSmartPlayActivity.this.D.getSupportDevices();
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public CharSequence getUnbindStr() {
            return BaseSmartPlayActivity.this.D.getUnbindStr();
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public void onEnableChange(boolean z) {
            BaseSmartPlayActivity.this.o(z);
            BaseSmartPlayActivity.this.D.onEnableChange(z);
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public BTStatusFragment.TopTips setTopTips() {
            return BaseSmartPlayActivity.this.D.setTopTips();
        }
    }

    private void initView() {
        if (GlobalConfig.get().isBuildMidong()) {
            getTitleTextView().setTextSize(16.0f);
        }
        this.y = findViewById(R.id.background_layout);
        this.x = findViewById(R.id.smart_logo);
        this.z = (ViewGroup) findViewById(R.id.smart_content);
        this.A = (ImageView) findViewById(R.id.smart_icon);
        this.B = (TextView) findViewById(R.id.smart_tips);
        if (this.C) {
            m();
        }
    }

    private void m() {
        BTStatusFragment bTStatusFragmentNewInstance = BTStatusFragment.newInstance(R.id.container, getSupportFragmentManager());
        this.mFragment = bTStatusFragmentNewInstance;
        bTStatusFragmentNewInstance.setBLEStatusListener(new a());
    }

    public boolean isConnected() {
        return this.mFragment.isConnected();
    }

    public void n(boolean z) {
        this.C = z;
    }

    public void o(boolean z) {
        if (z) {
            this.x.setEnabled(true);
            this.A.setEnabled(true);
        } else {
            this.x.setEnabled(false);
            this.A.setEnabled(false);
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_base_smart_play);
        initView();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.C && this.D == null) {
            throw new RuntimeException("you must call setStatusListener()!!! ");
        }
    }

    public void p(float f) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.A.getLayoutParams();
        layoutParams.setMarginStart((int) BaseTitleActivity.dp2px(this, f));
        this.A.setLayoutParams(layoutParams);
    }

    public void setRainbowTitleText(int i) {
        UnifyTitleBarStyle.setUnifyTitleStyle(this, getString(i));
    }

    public void setSmartContent(int i) {
        getLayoutInflater().inflate(i, this.z);
    }

    public void setSmartImageTopMargin(float f) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.x.getLayoutParams();
        layoutParams.setMargins(0, (int) BaseTitleActivity.dp2px(this, f), 0, 0);
        this.x.setLayoutParams(layoutParams);
    }

    public void setSmartImageView(int i, int i2) {
        this.x.setBackgroundResource(i);
        this.A.setBackgroundResource(i2);
    }

    public void setSmartTip(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.B.setVisibility(0);
        this.B.setText(str);
    }

    public void setStatusListener(BLEStatueListenerAdapter bLEStatueListenerAdapter) {
        if (bLEStatueListenerAdapter != null) {
            this.D = bLEStatueListenerAdapter;
        }
    }
}
