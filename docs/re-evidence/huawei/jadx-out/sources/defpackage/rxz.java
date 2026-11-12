package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwdevice.outofprocess.mgr.device.CloudDeviceInfo;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.devicearkui.delegate.CommonFeatureDelegate;
import com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class rxz extends CommonFeatureDelegate {
    public rxz(ComponentActivity componentActivity) {
        super(componentActivity);
    }

    @Override // com.huawei.ui.homehealth.devicearkui.delegate.BaseFeatureDelegate
    public void initItems(List<BaseFeatureItem> list) {
        list.add(new sas(this.activity));
        list.add(new sbc(this.activity));
        list.add(new sbs(this.activity));
        list.add(new rzi(this.activity));
        list.add(new sdc(this.activity));
        list.add(new sex(this.activity));
        list.add(new scv(this.activity));
        list.add(new rzb(this.activity));
        list.add(new sfg(this.activity));
        list.add(new sak(this.activity));
        list.add(new san(this.activity));
        list.add(new ryw(this.activity));
        list.add(new sdy(this.activity));
        list.add(new sar(this.activity));
        list.add(new sfj(this.activity));
        list.add(new ryx(this.activity));
        list.add(new sdg(this.activity));
        list.add(new saa(this.activity));
        list.add(new sep(this.activity));
        list.add(new ser(this.activity));
        list.add(new sbv(this.activity));
        list.add(new sdq(this.activity));
        list.add(new sae(this.activity));
        list.add(new rzx(this.activity));
        list.add(new scj(this.activity));
        list.add(new sbx(this.activity));
        list.add(new sdl(this.activity));
        list.add(new sdw(this.activity));
        list.add(new sdx(this.activity));
        list.add(new rzh(this.activity));
        list.add(new sew(this.activity));
        list.add(new sbk(this.activity));
        list.add(new scb(this.activity));
        list.add(new sco(this.activity));
    }

    @Override // com.huawei.ui.homehealth.devicearkui.delegate.BaseFeatureDelegate
    public View createItemView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.delegate_device_feature, viewGroup, false);
        HealthSubHeader healthSubHeader = (HealthSubHeader) qsp.a(viewInflate, R.id.device_feature_title);
        if (healthSubHeader != null) {
            healthSubHeader.setSubHeaderBackgroundColor(0);
        }
        return viewInflate;
    }

    @Override // com.huawei.ui.homehealth.devicearkui.delegate.BaseFeatureDelegate
    public LinearLayout getContainerLayout(View view) {
        return (LinearLayout) view.findViewById(R.id.device_feature_container);
    }

    @Override // com.huawei.ui.homehealth.devicearkui.delegate.CommonFeatureDelegate, com.huawei.ui.homehealth.devicearkui.delegate.DeviceViewDelegate
    public void updateDevice(DeviceInfo deviceInfo) {
        if (deviceInfo instanceof CloudDeviceInfo) {
            super.updateDevice(null);
        } else {
            super.updateDevice(deviceInfo);
        }
    }
}
