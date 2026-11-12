package com.huawei.pluginachievement.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.njy;
import defpackage.out;
import defpackage.pal;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes41.dex */
public class AchieveAnnualAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f22152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Integer> f22153b;
    private LayoutInflater d;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public AchieveAnnualAdapter(Context context, List<Integer> list) {
        this.f22152a = context;
        this.f22153b = list;
        this.d = LayoutInflater.from(context);
    }

    public void d(List<Integer> list) {
        if (list == null) {
            this.f22153b = new ArrayList(10);
        } else {
            this.f22153b = list;
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<Integer> list = this.f22153b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (njy.e(this.f22153b, i)) {
            return null;
        }
        return this.f22153b.get(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewInflate;
        b bVar;
        if (view == null) {
            bVar = new b();
            viewInflate = this.d.inflate(R.layout.achieve_report_annual_item, (ViewGroup) null);
            bVar.d = (HealthTextView) out.b(viewInflate, R.id.annual_title);
            bVar.f22154c = (ImageView) out.b(viewInflate, R.id.annual_view);
            bVar.e = (HealthDivider) out.b(viewInflate, R.id.data_line);
            viewInflate.setTag(bVar);
        } else {
            viewInflate = view;
            bVar = (b) view.getTag();
        }
        if (njy.e(this.f22153b)) {
            return viewInflate;
        }
        bVar.d.setText(String.format(Locale.ENGLISH, this.f22152a.getString(R.string.IDS_plugin_achievement_report_annual_year), this.f22153b.get(i)));
        if (i == this.f22153b.size() - 1) {
            bVar.e.setVisibility(4);
        } else {
            bVar.e.setVisibility(0);
        }
        b(this.f22153b.get(i).intValue(), bVar.f22154c);
        return viewInflate;
    }

    private void b(int i, ImageView imageView) {
        double d;
        if (qrs.af(this.f22152a)) {
            d(i, imageView);
            d = 0.1557377049180328d;
        } else {
            e(i, imageView);
            d = 0.36145574855252277d;
        }
        a(imageView, d);
    }

    private void a(ImageView imageView, double d) {
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.height = (int) (((double) (qrs.i(this.f22152a) - qrs.d(this.f22152a, 24.0f))) * d);
        imageView.setLayoutParams(layoutParams);
    }

    private void e(int i, ImageView imageView) {
        switch (i) {
            case 2018:
                imageView.setBackgroundResource(R.mipmap.achieve_pic_report_year_eighteen);
                break;
            case 2019:
                imageView.setBackgroundResource(R.mipmap.achieve_pic_report_year_nineteen);
                break;
            case 2020:
                imageView.setBackgroundResource(R.mipmap.achieve_pic_report_year_twenty);
                break;
            default:
                a(imageView, i);
                break;
        }
    }

    private void d(int i, ImageView imageView) {
        switch (i) {
            case 2018:
                imageView.setBackgroundResource(R.mipmap.achieve_pic_report_year_eighteen_daxidi);
                break;
            case 2019:
                imageView.setBackgroundResource(R.mipmap.achieve_pic_report_year_nineteen_daxidi);
                break;
            case 2020:
                imageView.setBackgroundResource(R.mipmap.achieve_pic_report_year_twenty_daxidi);
                break;
            default:
                a(imageView, i);
                break;
        }
    }

    private void a(ImageView imageView, int i) {
        String strReplace;
        String strReplace2;
        if (CommonUtil.cl()) {
            strReplace2 = "/sandbox/cch5/testappCCH5/com.huawei.health.h5.annual-report-2021/static/image/entry.png";
            strReplace = "/sandbox/cch5/testappCCH5/com.huawei.health.h5.annual-report-2021/static/image/entry-big.png";
        } else if (CommonUtil.ap() || !CommonUtil.bu()) {
            strReplace = "/sandbox/cch5/health/com.huawei.health.h5.annual-report-2021/static/image/entry-big.png";
            strReplace2 = "/sandbox/cch5/health/com.huawei.health.h5.annual-report-2021/static/image/entry.png";
        } else {
            strReplace2 = "/cch5/health/com.huawei.health.h5.annual-report-2021/static/image/entry.png";
            strReplace = "/cch5/health/com.huawei.health.h5.annual-report-2021/static/image/entry-big.png";
        }
        if (i >= 2022) {
            strReplace2 = strReplace2.replace(String.valueOf(2021), String.valueOf(i));
            strReplace = strReplace.replace(String.valueOf(2021), String.valueOf(i));
        }
        LogUtil.a("PLGACHIEVE_AchieveAnnualAdapter", "setEnterPic picUrl ", strReplace2, " bigPicUrl ", strReplace);
        pal.e(imageView, strReplace2, strReplace, this.f22152a.getResources().getDrawable(R.mipmap.annual_default));
    }

    static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ImageView f22154c;
        private HealthTextView d;
        private HealthDivider e;

        b() {
        }
    }
}
