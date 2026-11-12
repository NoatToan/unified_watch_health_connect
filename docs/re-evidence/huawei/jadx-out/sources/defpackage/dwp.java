package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.health.device.ui.measure.view.holder.HealthViewPagerHolder;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;

/* JADX INFO: loaded from: classes7.dex */
public class dwp implements HealthViewPagerHolder<dwc> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f32462a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f32463c;
    private HealthTextView d;
    private LinearLayout e;

    @Override // com.huawei.health.device.ui.measure.view.holder.HealthViewPagerHolder
    public View createView(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.fragment_hagrid_usage_guide_item_view, (ViewGroup) null);
        this.e = (LinearLayout) viewInflate.findViewById(R.id.hagrid_usage_guide_image_container);
        this.f32462a = (ImageView) viewInflate.findViewById(R.id.hagrid_usage_guide_image);
        this.d = (HealthTextView) viewInflate.findViewById(R.id.hagrid_usage_guide_title_tv);
        this.f32463c = (HealthTextView) viewInflate.findViewById(R.id.hagrid_usage_guide_content_tv);
        return viewInflate;
    }

    @Override // com.huawei.health.device.ui.measure.view.holder.HealthViewPagerHolder
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBind(Context context, int i, dwc dwcVar) {
        if (dwcVar == null) {
            LogUtil.j("HagridUsageGuideViewHolder", "onBind model is null");
            return;
        }
        LinearLayout linearLayout = this.e;
        if (linearLayout != null) {
            qrs.b(linearLayout, 2);
        }
        Object objA = dwcVar.a();
        if (objA instanceof Integer) {
            this.f32462a.setImageResource(((Integer) objA).intValue());
        }
        if (objA instanceof String) {
            this.f32462a.setImageBitmap(elo.c((String) objA));
        }
        this.d.setText(dwcVar.d());
        this.f32463c.setText(dwcVar.e());
    }
}
