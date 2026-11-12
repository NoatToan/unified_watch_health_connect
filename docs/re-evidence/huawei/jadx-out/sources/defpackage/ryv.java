package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.devicearkui.delegate.BaseFeatureDelegate;
import com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class ryv extends BaseFeatureDelegate {
    public ryv(ComponentActivity componentActivity) {
        super(componentActivity);
    }

    @Override // com.huawei.ui.homehealth.devicearkui.delegate.BaseFeatureDelegate
    public void initItems(List<BaseFeatureItem> list) {
        list.add(new sek(this.activity));
    }

    @Override // com.huawei.ui.homehealth.devicearkui.delegate.BaseFeatureDelegate
    public View createItemView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.delegate_device_functional, viewGroup, false);
        viewInflate.setVisibility(0);
        return viewInflate;
    }

    @Override // com.huawei.ui.homehealth.devicearkui.delegate.BaseFeatureDelegate
    public LinearLayout getContainerLayout(View view) {
        return (LinearLayout) view;
    }

    @Override // com.huawei.ui.homehealth.devicearkui.delegate.DeviceViewDelegate
    public void updateDevice(DeviceInfo deviceInfo) {
        ArrayList arrayList = new ArrayList();
        Iterator<BaseFeatureItem> it = this.defaultFeatureItems.iterator();
        while (it.hasNext()) {
            arrayList.add(new AbstractMap.SimpleEntry(it.next(), true));
        }
        refreshAllView(arrayList, deviceInfo);
    }
}
