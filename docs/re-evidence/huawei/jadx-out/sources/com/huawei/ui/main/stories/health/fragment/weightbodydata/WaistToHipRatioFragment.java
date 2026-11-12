package com.huawei.ui.main.stories.health.fragment.weightbodydata;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.fatscale.multiusers.WeightDataManager;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.numberpicker.HealthNumberPicker;
import com.huawei.ui.commonui.subtab.HealthSubTabWidget;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.fragment.weightbodydata.WaistToHipRatioFragment;
import defpackage.dnb;
import defpackage.exz;
import defpackage.lmf;
import defpackage.njy;
import defpackage.qrs;
import defpackage.vcw;
import defpackage.vdo;
import defpackage.vei;
import defpackage.xfz;
import health.compact.a.UnitUtil;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public class WaistToHipRatioFragment extends AbstractWaistToHipRatioFragment {
    private static WaistToHipCallback e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CustomViewDialog f27979a;
    private Handler h;
    private HealthTextView i;

    /* JADX INFO: loaded from: classes3.dex */
    public interface WaistToHipCallback {
        void onWaistToHipRatioChanged(dnb dnbVar);
    }

    public static /* synthetic */ void c(View view) {
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public int getBiType() {
        return 25;
    }

    static class a extends BaseHandler<WaistToHipRatioFragment> {
        private a(WaistToHipRatioFragment waistToHipRatioFragment) {
            super(waistToHipRatioFragment);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(WaistToHipRatioFragment waistToHipRatioFragment, Message message) {
            if (message == null || waistToHipRatioFragment == null) {
                LogUtil.j("HealthWeight_WaistToHipRatioFragment", "MyHandler handleMessageWhenReferenceNotNull message or fragment is null");
            } else if (message.what == 0 && waistToHipRatioFragment.isAdded()) {
                LogUtil.a("HealthWeight_WaistToHipRatioFragment", "MyHandler handleMessageWhenReferenceNotNull REFRESH_UI");
                waistToHipRatioFragment.b();
            }
        }
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initView(View view) {
        super.initView(view);
        this.i = (HealthTextView) view.findViewById(R.id.fragment_weight_body_data_specification_edit);
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initData() {
        this.h = new a();
        this.mGender = this.mWeightBean.an();
        this.f27950b = this.mWeightBean.as();
        this.f27951c = this.mResources.getString(R.string.IDS_weight_waist_to_hip_ratio);
        if (this.f27950b == 0.0d) {
            this.f27950b = this.mWeightBean.ao();
            this.f27951c = vcw.p(0);
        }
        this.d = exz.c(this.mGender, this.f27950b);
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public String getBodyDataKey() {
        if (this.mWeightBean.as() == 0.0d) {
            return "waistHipRatio";
        }
        return "waistHipRatioUser";
    }

    @Override // com.huawei.ui.main.stories.health.fragment.weightbodydata.AbstractWaistToHipRatioFragment, com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initSpecification() {
        super.initSpecification();
        if (vdo.a() && this.mWeightBean.as() == 0.0d) {
            this.i.setText(this.mResources.getString(R.string.IDS_weight_adjustment_waist_to_hip_ratio));
            this.i.setVisibility(0);
            this.i.setOnClickListener(new View.OnClickListener() { // from class: uvx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.e(view);
                }
            });
        }
    }

    public /* synthetic */ void e(View view) {
        a();
    }

    private void a() {
        ArrayList arrayList = new ArrayList(16);
        final ArrayList<Double> arrayList2 = new ArrayList<>(16);
        BigDecimal bigDecimal = new BigDecimal("0.01");
        for (int i = 40; i <= 150; i++) {
            BigDecimal bigDecimalMultiply = new BigDecimal(i).multiply(bigDecimal);
            arrayList.add(UnitUtil.e(qrs.g(String.valueOf(bigDecimalMultiply)), 1, 2));
            arrayList2.add(Double.valueOf(bigDecimalMultiply.doubleValue()));
        }
        View viewInflate = View.inflate(this.mContext, R.layout.health_healthdata_userinfo_multiuserweight_dialog, null);
        ((HealthTextView) viewInflate.findViewById(R.id.hw_health_multiuserWeight_dialog_tips)).setText(this.mResources.getString(R.string.IDS_weight_waist_to_hip_ratio_description));
        final HealthNumberPicker healthNumberPicker = (HealthNumberPicker) viewInflate.findViewById(R.id.multiuserweight_number_picker);
        healthNumberPicker.setDisplayedValues((String[]) arrayList.toArray(new String[0]));
        healthNumberPicker.setMinValue(0);
        healthNumberPicker.setMaxValue(arrayList.size() - 1);
        e(arrayList2, healthNumberPicker);
        healthNumberPicker.setWrapSelectorWheel(false);
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.mActivity);
        builder.b(R.string.IDS_weight_adjustment_waist_to_hip_ratio).d(viewInflate).d(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: uvv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.e(healthNumberPicker, arrayList2, view);
            }
        }).c(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: uvw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WaistToHipRatioFragment.c(view);
            }
        });
        if (this.f27979a == null) {
            this.f27979a = builder.d();
        }
        CustomViewDialog customViewDialog = this.f27979a;
        if (customViewDialog == null || customViewDialog.isShowing()) {
            return;
        }
        this.f27979a.show();
    }

    public /* synthetic */ void e(HealthNumberPicker healthNumberPicker, ArrayList arrayList, View view) {
        e();
        int value = healthNumberPicker.getValue();
        if (njy.e(arrayList, value)) {
            LogUtil.j("HealthWeight_WaistToHipRatioFragment", "showRatioPickerDialog is Out Of Bounds");
            return;
        }
        this.f27950b = ((Double) arrayList.get(value)).doubleValue();
        this.d = exz.c(this.mGender, this.f27950b);
        this.mWeightBean.ah(this.f27950b);
        c();
        LogUtil.d("HealthWeight_WaistToHipRatioFragment", "showRatioPickerDialog mWaistToHipRatio ", Double.valueOf(this.f27950b));
        ObserverManagerUtil.e("WEIGHT_ADJUSTMENT_WAIST_TO_H5", new Object[0]);
    }

    private void e(ArrayList<Double> arrayList, HealthNumberPicker healthNumberPicker) {
        int iIndexOf = arrayList.indexOf(Double.valueOf(new BigDecimal(this.mWeightBean.ao()).setScale(2, 4).doubleValue()));
        if (iIndexOf != -1) {
            healthNumberPicker.setValue(iIndexOf);
        } else {
            healthNumberPicker.setValue(1);
        }
    }

    private void c() {
        HiHealthData hiHealthData = new HiHealthData(10006);
        vei.d(hiHealthData, this.mWeightBean);
        hiHealthData.setOwnerId(0);
        hiHealthData.setDeviceUuid(d());
        b(hiHealthData, MultiUsersManager.INSTANCE.getCurrentUser().i());
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.addData(hiHealthData);
        HiHealthManager.d(this.mContext).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: uvt
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i, Object obj) {
                this.d.a(i, obj);
            }
        });
    }

    public /* synthetic */ void a(int i, Object obj) {
        Handler handler;
        LogUtil.a("HealthWeight_WaistToHipRatioFragment", "insertData onResult errorCode ", Integer.valueOf(i));
        if (i != 0 || (handler = this.h) == null) {
            return;
        }
        handler.sendEmptyMessage(0);
    }

    private String d() {
        if (this.mWeightBean == null) {
            LogUtil.j("HealthWeight_WaistToHipRatioFragment", "getDeviceUuid mWeightBean is null");
            return String.valueOf(-1);
        }
        String strN = this.mWeightBean.n();
        if (TextUtils.isEmpty(strN)) {
            LogUtil.j("HealthWeight_WaistToHipRatioFragment", "getDeviceUuid deviceUuid is empty");
            return String.valueOf(-1);
        }
        LogUtil.a("HealthWeight_WaistToHipRatioFragment", "getDeviceUuid deviceUuid ", strN);
        return strN;
    }

    private void b(HiHealthData hiHealthData, String str) {
        String strI = MultiUsersManager.INSTANCE.getMainUser().i();
        if (str == null) {
            MultiUsersManager.INSTANCE.setCurrentUser(MultiUsersManager.INSTANCE.getMainUser());
            return;
        }
        if (strI == null) {
            hiHealthData.setMetaData(String.valueOf(0));
        } else if (strI.equals(str)) {
            hiHealthData.setMetaData(String.valueOf(0));
        } else {
            hiHealthData.setMetaData(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.f27951c = this.mResources.getString(R.string.IDS_weight_waist_to_hip_ratio);
        this.f27950b = UnitUtil.d(this.f27950b, 2);
        setLevel(this.f27950b, UnitUtil.e(this.f27950b, 1, 2));
        this.i.setVisibility(8);
        if (this.mActivity == null) {
            LogUtil.j("HealthWeight_WaistToHipRatioFragment", "refreshSubTabTitle mActivity is null");
        } else {
            HealthSubTabWidget healthSubTabWidgetD = this.mActivity.d();
            if (healthSubTabWidgetD == null) {
                LogUtil.j("HealthWeight_WaistToHipRatioFragment", "refreshSubTabTitle healthSubTabWidget is null");
            } else {
                xfz selectedSubTab = healthSubTabWidgetD.getSelectedSubTab();
                if (selectedSubTab == null) {
                    LogUtil.j("HealthWeight_WaistToHipRatioFragment", "refreshSubTabTitle hwSubTab is null");
                } else {
                    selectedSubTab.a(this.mResources.getText(R.string.IDS_weight_waist_to_hip_ratio));
                }
                healthSubTabWidgetD.e(25);
            }
        }
        WaistToHipCallback waistToHipCallback = e;
        if (waistToHipCallback == null) {
            LogUtil.j("HealthWeight_WaistToHipRatioFragment", "refreshSubTabTitle sWaistToHipCallback is null");
        } else {
            waistToHipCallback.onWaistToHipRatioChanged(this.mWeightBean);
        }
        initAnalysisAndInterpretation();
        WeightDataManager.INSTANCE.setInitFlag(true);
    }

    private void e() {
        if (this.mWeightBean == null) {
            LogUtil.j("HealthWeight_WaistToHipRatioFragment", "doBiEditWaistToHipRatio mWeightBean is null");
            return;
        }
        int iO = this.mWeightBean.o();
        LogUtil.d("HealthWeight_WaistToHipRatioFragment", "doBiEditWaistToHipRatio dataType ", Integer.valueOf(iO));
        HashMap map = new HashMap(16);
        map.put("type", Integer.valueOf(iO));
        map.put("click", "1");
        lmf.d().c(this.mContext, AnalyticsValue.HEALTH_HOME_BODY_DETAIL_WAIST_TO_HIP_RATIO_2030067.value(), map, 0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        Handler handler = this.h;
        if (handler != null) {
            handler.removeMessages(0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Handler handler = this.h;
        if (handler != null) {
            handler.removeMessages(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Context context) {
        e = (WaistToHipCallback) context;
    }
}
