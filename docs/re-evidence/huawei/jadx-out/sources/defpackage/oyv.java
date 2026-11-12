package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.manager.model.MedalInfoDesc;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.viewpager.HealthPagerAdapter;
import health.compact.a.LanguageUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes41.dex */
public class oyv extends HealthPagerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<MedalInfoDesc> f44994a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Integer> f44995c;
    private final Context e = BaseApplication.getContext();

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getItemPosition(Object obj) {
        return -2;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public oyv(List<MedalInfoDesc> list) {
        HashMap map = new HashMap(16);
        pax.c(map);
        this.f44995c = map;
        this.f44994a = list;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getCount() {
        List<MedalInfoDesc> list = this.f44994a;
        if (list == null) {
            return 0;
        }
        return Math.max(list.size(), 0);
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (obj instanceof View) {
            viewGroup.removeView((View) obj);
        }
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        String string;
        View viewInflate = View.inflate(this.e, R.layout.item_medal_dialog, null);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.item_medal_text);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.item_medal_image);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.medalViewLayout);
        if (njy.e(this.f44994a, i) || this.f44995c == null) {
            LogUtil.j("MedalViewPageAdapter", "instantiateItem mMedalInfoDescs is null");
            viewGroup.addView(viewInflate);
            return viewInflate;
        }
        ozc.e(this.f44994a.get(i), linearLayout, imageView);
        if (LanguageUtil.c(this.e)) {
            string = this.e.getResources().getString(R.string.IDS_plugin_achievement_tab_people_get_medal_date, this.f44994a.get(i).acquireText());
        } else {
            string = this.e.getResources().getString(R.string.IDS_achieve_sport_medal_button, this.f44994a.get(i).acquireText());
        }
        healthTextView.setText(string);
        viewGroup.addView(viewInflate);
        return viewInflate;
    }
}
