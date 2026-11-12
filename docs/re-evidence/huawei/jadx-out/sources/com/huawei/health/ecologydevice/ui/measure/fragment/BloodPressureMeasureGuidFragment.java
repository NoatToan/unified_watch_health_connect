package com.huawei.health.ecologydevice.ui.measure.fragment;

import android.content.ContentValues;
import android.os.Bundle;
import android.view.View;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import com.huawei.ecologydevice.R;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.ecologydevice.manager.BloodPressureStartFromDeviceHelper;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.hihealth.device.open.data.MeasureResult;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.dxw;
import defpackage.eij;
import defpackage.elg;
import defpackage.elh;
import defpackage.elo;
import defpackage.epn;
import defpackage.era;
import defpackage.etn;
import defpackage.lmf;
import defpackage.qrs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class BloodPressureMeasureGuidFragment extends BluetoothMeasureFragment {
    private static final String TAG = "BloodPressureMeasureGuidFragment";
    private elh mProductInfo;

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment, com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            LogUtil.e(TAG, "onCreate getArguments is empty");
            return;
        }
        this.mDeviceInfo = (ContentValues) arguments.getParcelable("commonDeviceInfo");
        if (this.mDeviceInfo == null) {
            LogUtil.j(TAG, "initData mDeviceInfo is empty");
        } else {
            this.mProductId = this.mDeviceInfo.getAsString("productId");
            this.mUniqueId = this.mDeviceInfo.getAsString("uniqueId");
        }
        if (BloodPressureStartFromDeviceHelper.b(era.b(this.mProductId)) || BloodPressureStartFromDeviceHelper.a()) {
            jumpToMeasureActivity(this.mProductId, this.mUniqueId);
        }
    }

    private void jumpToMeasureActivity(String str, String str2) {
        Bundle bundle = new Bundle();
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniqueId", str2);
        contentValues.put("productId", str);
        bundle.putParcelable("commonDeviceInfo", contentValues);
        bundle.putBoolean("isBindSuccess", true);
        Fragment productIntroductionFragment = new ProductIntroductionFragment();
        productIntroductionFragment.setArguments(bundle);
        switchFragment((Fragment) null, productIntroductionFragment);
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment
    public epn getMode() {
        LogUtil.a(TAG, "BloodPressureMeasureGuidFragment getmode()");
        this.mProductInfo = ResourceManager.c().d(this.mProductId);
        epn epnVar = new epn();
        epnVar.c(getMeasure());
        epnVar.a(getMeasureListForString());
        elh elhVar = this.mProductInfo;
        ArrayList<elh.c> arrayListS = elhVar != null ? elhVar.s() : null;
        if (arrayListS != null) {
            epnVar.d(elo.a(this.mProductId, arrayListS.get(0).c()));
        }
        epnVar.a(GravityCompat.START);
        epnVar.b(true);
        epnVar.a(true);
        elh elhVar2 = this.mProductInfo;
        super.setTitle(elo.a(this.mProductId, elhVar2 != null ? elhVar2.l().d() : null));
        return epnVar;
    }

    private ArrayList<Object> getMeasure() {
        LogUtil.a(TAG, "BloodPressureMeasureGuidFragment getMeasure()");
        ArrayList<Object> arrayList = new ArrayList<>(10);
        elh elhVar = this.mProductInfo;
        ArrayList<elh.c> arrayListS = elhVar != null ? elhVar.s() : null;
        if (arrayListS == null) {
            return arrayList;
        }
        Iterator<elh.c> it = arrayListS.iterator();
        while (it.hasNext()) {
            arrayList.add(elg.e().d(this.mProductId, it.next().d()));
        }
        LogUtil.a(TAG, "------" + arrayList.size());
        return arrayList;
    }

    private ArrayList<String> getMeasureListForString() {
        LogUtil.a(TAG, "BloodPressureMeasureGuidFragment getMeasureListForString()");
        ArrayList<String> arrayList = new ArrayList<>(10);
        elh elhVar = this.mProductInfo;
        ArrayList<elh.c> arrayListS = elhVar != null ? elhVar.s() : null;
        if (arrayListS == null) {
            return arrayList;
        }
        Iterator<elh.c> it = arrayListS.iterator();
        while (it.hasNext()) {
            arrayList.add(elo.a(this.mProductId, it.next().c()));
        }
        LogUtil.a(TAG, "imageListForString.size() = ", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    public void clickMeasure() {
        LogUtil.a(TAG, "BloodPressureMeasureGuidFragment clickMeasure(), mProductId = ", this.mProductId, ", mKind = ", this.mKind);
        HashMap map = new HashMap(16);
        elh elhVarD = ResourceManager.c().d(this.mProductId);
        eij.c().a(era.b(this.mProductId));
        if (elhVarD != null) {
            map.put("device_name", etn.c(this.mProductId, elhVarD.l().d()));
        }
        lmf.d().c(dxw.d(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_BEGIN_MEASURE_2060009.value(), map, 0);
        Bundle bundle = new Bundle();
        bundle.putString("kind", this.mKind);
        bundle.putString("productId", this.mProductId);
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniqueId", this.mUniqueId);
        contentValues.put("productId", this.mProductId);
        bundle.putParcelable("commonDeviceInfo", contentValues);
        bundle.putString("title", elo.a(this.mProductId, this.mProductInfo.l().d()));
        Fragment bloodPressureMeasuringProgressFragment = new BloodPressureMeasuringProgressFragment();
        bloodPressureMeasuringProgressFragment.setArguments(bundle);
        BloodPressureStartFromDeviceHelper.d(elhVarD);
        switchFragment(bloodPressureMeasuringProgressFragment);
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment
    public View.OnClickListener getOnClickListener() {
        return new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.BloodPressureMeasureGuidFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m978x83902909(view);
            }
        };
    }

    /* JADX INFO: renamed from: lambda$getOnClickListener$0$com-huawei-health-ecologydevice-ui-measure-fragment-BloodPressureMeasureGuidFragment, reason: not valid java name */
    /* synthetic */ void m978x83902909(View view) {
        if (qrs.r()) {
            LogUtil.a(TAG, "click too fast");
        } else if (view == null) {
            LogUtil.a(TAG, "onClick: view is null");
        } else if (R.id.bt_device_measure_guide_next == view.getId()) {
            clickMeasure();
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        qrs.e();
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment
    public void handleDataChangedInUiThread(HealthDevice healthDevice, HealthData healthData, boolean z) {
        LogUtil.a(TAG, "handleDataChangedInUiThread: data = " + healthData);
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment
    public void handleDataChangedInUiThreadUniversal(MeasureResult measureResult, boolean z) {
        LogUtil.a(TAG, "handleDataChangedInUiThreadUniversal: data = " + measureResult);
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment
    public void handleStatusChangedInUiThread(HealthDevice healthDevice, int i) {
        LogUtil.a(TAG, "handleStatusChangedInUiThread: status = " + i);
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment
    public void handleStatusChangedInUiThreadUniversal(int i) {
        LogUtil.a(TAG, "handleStatusChangedInUiThreadUniversal: status = " + i);
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment
    public void handleFailedEventInUiThread(int i) {
        LogUtil.a(TAG, "handleFailedEventInUiThread: code = " + i);
    }
}
