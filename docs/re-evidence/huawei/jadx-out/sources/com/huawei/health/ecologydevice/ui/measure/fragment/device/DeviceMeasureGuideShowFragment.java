package com.huawei.health.ecologydevice.ui.measure.fragment.device;

import android.content.ContentValues;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.huawei.ecologydevice.R;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.ProductIntroductionFragment;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.elg;
import defpackage.elh;
import defpackage.elo;
import defpackage.era;
import defpackage.qrs;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class DeviceMeasureGuideShowFragment extends BaseFragment {
    private static final int LRU_CACHE_SIZE = 1048576;
    private static final String TAG = "DeviceMeasureGuideShowFragment";
    private static final int THREE_FOLD_FONTS_SERVICE_AREA_TEXT_SIZE = 40;
    private final LruCache<String, Bitmap> mBitmapLruCache = new LruCache<>(1048576);
    private String mProductId;
    private elh mProductInfo;

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        LogUtil.a(TAG, "onCreate");
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            ContentValues contentValues = (ContentValues) arguments.getParcelable("commonDeviceInfo");
            if (contentValues != null) {
                this.mProductId = contentValues.getAsString("productId");
            }
            this.mProductInfo = ResourceManager.c().b(this.mProductId);
            return;
        }
        LogUtil.j(TAG, "onCreate bundle is null");
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Throwable {
        LogUtil.a(TAG, "onCreateView");
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (layoutInflater == null) {
            LogUtil.j(TAG, "onCreateView inflater is null!");
            return viewOnCreateView;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_device_measure_guide_show, viewGroup, false);
        if (viewInflate != null && viewOnCreateView != null) {
            initView(viewInflate);
            if (viewOnCreateView instanceof ViewGroup) {
                ((ViewGroup) viewOnCreateView).addView(viewInflate);
            }
            return viewOnCreateView;
        }
        LogUtil.j(TAG, "onCreateView child is null or view is null!");
        return viewOnCreateView;
    }

    private void showDeviceImage(String str, String str2, ImageView imageView) throws Throwable {
        Bitmap bitmapC;
        if (this.mBitmapLruCache.get(str) == null) {
            String strD = elg.e().d(str, str2);
            bitmapC = elo.c(strD);
            if (new File(strD).exists() && bitmapC != null) {
                LogUtil.a(TAG, "cache Image");
                this.mBitmapLruCache.put(str, bitmapC);
            }
        } else {
            LogUtil.a(TAG, "load exists Image");
            bitmapC = this.mBitmapLruCache.get(str);
        }
        if (bitmapC == null) {
            LogUtil.a(TAG, "showDeviceImage bitmap == null");
        } else {
            imageView.setImageBitmap(bitmapC);
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        }
    }

    private void initView(View view) throws Throwable {
        elh elhVar = this.mProductInfo;
        if (elhVar == null) {
            LogUtil.j(TAG, "initView mProductInfo is null");
            return;
        }
        if (elhVar.l() != null) {
            setTitle(elo.a(this.mProductId, this.mProductInfo.l().d()));
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.device_show_image_iv);
        showDeviceImage(this.mProductId, this.mProductInfo.d().get(0).d(), imageView);
        era.c(getActivity(), imageView, 0.7d, true);
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.device_prepare_measure_tv);
        HealthTextView healthTextView2 = (HealthTextView) view.findViewById(R.id.device_measure_tip_tv);
        HealthTextView healthTextView3 = (HealthTextView) view.findViewById(R.id.device_measure_tip2_tv);
        HealthTextView healthTextView4 = (HealthTextView) view.findViewById(R.id.device_measure_tip3_tv);
        HealthDevice.HealthDeviceKind healthDeviceKindM = this.mProductInfo.m();
        LogUtil.d(TAG, "initView mKind = ", healthDeviceKindM);
        if (healthDeviceKindM == HealthDevice.HealthDeviceKind.HDK_BLOOD_PRESSURE) {
            healthTextView3.setVisibility(0);
            healthTextView4.setVisibility(0);
        } else if (healthDeviceKindM == HealthDevice.HealthDeviceKind.HDK_BLOOD_SUGAR) {
            healthTextView2.setText(R.string.IDS_device_blood_sugar_measure_tip);
        } else {
            LogUtil.a(TAG, "initView mKind is not exist!");
        }
        if (qrs.ac()) {
            healthTextView.setTextSize(1, 40.0f);
            healthTextView2.setTextSize(1, 40.0f);
            healthTextView3.setTextSize(1, 40.0f);
            healthTextView4.setTextSize(1, 40.0f);
            ((HealthTextView) view.findViewById(R.id.device_start_measure_tip_tv)).setTextSize(1, 40.0f);
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public boolean onBackPressed() {
        LogUtil.a(TAG, "onBackPressed");
        popupFragment(ProductIntroductionFragment.class);
        return false;
    }
}
