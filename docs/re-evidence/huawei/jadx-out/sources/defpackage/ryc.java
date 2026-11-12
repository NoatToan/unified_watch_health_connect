package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.devicearkui.delegate.CommonFeatureDelegate;
import com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class ryc extends CommonFeatureDelegate {
    public ryc(ComponentActivity componentActivity) {
        super(componentActivity);
    }

    @Override // com.huawei.ui.homehealth.devicearkui.delegate.BaseFeatureDelegate
    public void initItems(List<BaseFeatureItem> list) {
        list.add(new scw(this.activity));
        list.add(new sbl(this.activity));
        list.add(new sax(this.activity));
        list.add(new sed(this.activity));
        list.add(new scp(this.activity));
        list.add(new rzr(this.activity));
    }

    @Override // com.huawei.ui.homehealth.devicearkui.delegate.BaseFeatureDelegate
    public View createItemView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.delegate_device_functional, viewGroup, false);
    }

    @Override // com.huawei.ui.homehealth.devicearkui.delegate.BaseFeatureDelegate
    public LinearLayout getContainerLayout(View view) {
        return (LinearLayout) view;
    }
}
