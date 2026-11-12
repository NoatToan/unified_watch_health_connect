package com.huawei.health.device.ui.measure.fragment;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;

/* JADX INFO: loaded from: classes7.dex */
public class WiFiDeviceScanFailFragment extends BaseFragment {
    private static final int IMAGE_HEIGHT_OF_SCREEN = 3;
    private static final double REST_HEIGHT = 0.5d;
    private static final String TAG = "WiFiDeviceScanFailFragment";
    private static final int TITLE_BAR_HEIGHT = 48;
    private static final int TOP_MARGIN_HEIGHT = 25;
    private HealthTextView mContextTv;
    private ImageView mErrorImg;
    private HealthTextView mFailTitle;
    private Button mRetryBtn;

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LogUtil.a(TAG, "onCreateView");
        ViewGroup viewGroup2 = super.onCreateView(layoutInflater, viewGroup, bundle) instanceof ViewGroup ? (ViewGroup) super.onCreateView(layoutInflater, viewGroup, bundle) : null;
        this.child = layoutInflater.inflate(R.layout.failed_bind_fragment, viewGroup, false);
        initView();
        initViewData();
        if (viewGroup2 != null) {
            viewGroup2.addView(this.child);
        }
        return viewGroup2;
    }

    private void initViewData() {
        this.mErrorImg.setVisibility(0);
        setErrorImg();
        this.mFailTitle.setText(R.string.IDS_device_wifi_scan_fail_tip_title);
        this.mRetryBtn.setText(R.string.IDS_retry);
        this.mContextTv.setText(R.string.IDS_device_wifi_scan_fail_msg);
        this.mRetryBtn.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.WiFiDeviceScanFailFragment.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                WiFiDeviceScanFailFragment.this.retry();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void retry() {
        popupFragment(WiFiDeviceScanFragment.class);
    }

    private void setErrorImg() {
        int height = getActivity().getWindowManager().getDefaultDisplay().getHeight();
        float f = Resources.getSystem().getDisplayMetrics().density;
        this.mErrorImg.setBackground(getResources().getDrawable(R.drawable.ic_health_equipment_bind_failed));
        if (this.mErrorImg.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mErrorImg.getLayoutParams();
            layoutParams.topMargin = (int) ((((double) height) / 3.0d) - (((double) f) * 72.5d));
            this.mErrorImg.setLayoutParams(layoutParams);
        }
    }

    private void initView() {
        this.mErrorImg = (ImageView) this.child.findViewById(R.id.device_measure_top_square);
        this.mFailTitle = (HealthTextView) this.child.findViewById(R.id.device_measure_fail_tip_title);
        this.mRetryBtn = (Button) this.child.findViewById(R.id.bt_device_measure_error_confirm);
        this.mContextTv = (HealthTextView) this.child.findViewById(R.id.device_measure_error_tips_tv);
        setTitle(this.mainActivity.getString(R.string.IDS_device_wifi_scan_title));
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public boolean onBackPressed() {
        LogUtil.a(TAG, " onBackPressed");
        popupFragment(WiFiProductIntroductionFragment.class);
        return false;
    }
}
