package com.huawei.health.ecologydevice.ui.measure.fragment.device;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.ecologydevice.R;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.button.HealthButton;
import defpackage.elh;
import defpackage.elo;
import defpackage.era;
import defpackage.etn;
import defpackage.qrs;

/* JADX INFO: loaded from: classes7.dex */
public class DeviceIllustrationFragment extends BaseFragment {
    private static final String TAG = "DeviceIllustrationFragment";
    private static final int THREE_FOLD_FONTS_SERVICE_AREA_TEXT_SIZE = 40;
    private String mProductId;
    private elh mProductInfo;
    private String mUniqueId;

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        LogUtil.a(TAG, "DeviceIllustrationFragment onCreate");
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            ContentValues contentValues = (ContentValues) arguments.getParcelable("commonDeviceInfo");
            if (contentValues != null) {
                this.mProductId = contentValues.getAsString("productId");
                this.mUniqueId = contentValues.getAsString("uniqueId");
            }
            this.mProductInfo = ResourceManager.c().d(this.mProductId);
            return;
        }
        LogUtil.j(TAG, "onCreate bundle is null");
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LogUtil.a(TAG, "DeviceIllustrationFragment onCreateView");
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (layoutInflater == null) {
            LogUtil.j(TAG, "DeviceIllustrationFragment onCreateView inflater is null");
            return viewOnCreateView;
        }
        View viewInflate = layoutInflater.inflate(R.layout.illustrate_device_fragment_layout, viewGroup, false);
        if (viewInflate != null && viewOnCreateView != null) {
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.hw_device_rope_skipping_img_1);
            imageView.setBackground(getActivity().getResources().getDrawable(R.drawable.skipping_time));
            era.c(getActivity(), imageView, 0.7d, true);
            TextView textView = (TextView) viewInflate.findViewById(R.id.hw_device_start_rope_tip);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.hw_device_use_instructions);
            HealthButton healthButton = (HealthButton) viewInflate.findViewById(R.id.hw_device_ok);
            textView.setMovementMethod(ScrollingMovementMethod.getInstance());
            if (qrs.ac()) {
                textView.setTextSize(1, 40.0f);
                textView2.setTextSize(1, 40.0f);
                healthButton.setTextSize(1, 40.0f);
            }
            healthButton.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceIllustrationFragment$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m1062x7098f935(view);
                }
            });
            if (viewOnCreateView instanceof ViewGroup) {
                ((ViewGroup) viewOnCreateView).addView(viewInflate);
            }
        } else {
            LogUtil.j(TAG, "DeviceIllustrationFragment onCreateView:child == null");
        }
        elh elhVar = this.mProductInfo;
        if (elhVar != null && elhVar.l() != null) {
            setTitle(elo.a(this.mProductId, this.mProductInfo.l().d()));
        }
        return viewOnCreateView;
    }

    /* JADX INFO: renamed from: lambda$onCreateView$0$com-huawei-health-ecologydevice-ui-measure-fragment-device-DeviceIllustrationFragment, reason: not valid java name */
    /* synthetic */ void m1062x7098f935(View view) {
        switchToH5Intro();
    }

    private void switchToH5Intro() {
        elh elhVar = this.mProductInfo;
        if (elhVar != null && "1".equals(elhVar.g())) {
            etn.c(getContext(), this.mProductInfo, this.mProductId, this.mUniqueId);
            return;
        }
        Intent intentB = etn.b(this.mProductInfo, this.mProductId, this.mUniqueId);
        if (intentB != null) {
            startActivity(intentB);
            popupFragment(null);
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public boolean onBackPressed() {
        LogUtil.a(TAG, "DeviceIllustrationFragment onBackPressed");
        popupFragment(null);
        return false;
    }
}
