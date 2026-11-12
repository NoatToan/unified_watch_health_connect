package com.huawei.pluginachievement.ui.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.manager.model.ExperienceHistoryBean;
import com.huawei.pluginachievement.manager.model.NewLevelDetailDataBean;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.ltc;
import defpackage.njy;
import defpackage.osa;
import defpackage.out;
import defpackage.paq;
import defpackage.qqs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes13.dex */
public class LevelExpandableAdapter extends BaseExpandableListAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<NewLevelDetailDataBean> f22181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<String> f22182b;
    private Context e;
    private static final Integer[] d = {Integer.valueOf(R.mipmap.level_dot_on_huo), Integer.valueOf(R.mipmap.level_dot_on_zi), Integer.valueOf(R.mipmap.level_dot_on_neng), Integer.valueOf(R.mipmap.level_dot_on_wang), Integer.valueOf(R.mipmap.level_dot_on_quan), Integer.valueOf(R.mipmap.level_dot_on_chuan), Integer.valueOf(R.mipmap.level_dot_on_wang)};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Integer[] f22180c = {Integer.valueOf(R.drawable.level_record_zi_bg), Integer.valueOf(R.drawable.level_record_zi_bg), Integer.valueOf(R.drawable.level_record_neng_bg), Integer.valueOf(R.drawable.level_record_wang_bg), Integer.valueOf(R.drawable.level_record_quan_bg), Integer.valueOf(R.drawable.level_record_chuan_bg), Integer.valueOf(R.drawable.level_record_dian_bg)};

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f22183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ImageView f22184b;
        HealthTextView d;
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f22185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        RelativeLayout f22186b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthTextView f22187c;
        LinearLayout d;
        HealthTextView e;
        ImageView f;
        HealthTextView g;
        ImageView h;
        View i;
        ImageView j;
        ImageView k;
        ImageView l;
        LinearLayout m;
        ImageView n;
        ImageView o;
        LinearLayout p;
        HealthTextView r;
        HealthTextView s;
    }

    @Override // android.widget.ExpandableListAdapter
    public long getChildId(int i, int i2) {
        return i2;
    }

    @Override // android.widget.ExpandableListAdapter
    public long getGroupId(int i) {
        return i;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean isChildSelectable(int i, int i2) {
        return true;
    }

    public LevelExpandableAdapter(Context context, List<ExperienceHistoryBean> list) {
        this.e = context;
        if (list == null) {
            return;
        }
        a(list);
    }

    public void c(List<ExperienceHistoryBean> list) {
        if (njy.e(list)) {
            return;
        }
        a(list);
        notifyDataSetChanged();
    }

    private void a(List<ExperienceHistoryBean> list) {
        this.f22181a = e(list);
        String strE = osa.e(BaseApplication.getContext(), "levelTypeData");
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        this.f22182b = paq.c(strE);
    }

    private List<NewLevelDetailDataBean> e(List<ExperienceHistoryBean> list) {
        ArrayList arrayList = new ArrayList(8);
        if (!njy.e(list)) {
            List<String> listD = d(list);
            List<String> listB = b(list);
            for (String str : listD) {
                int iB = b(list, str);
                NewLevelDetailDataBean newLevelDetailDataBean = new NewLevelDetailDataBean();
                newLevelDetailDataBean.setDate(str);
                newLevelDetailDataBean.setCount(iB);
                newLevelDetailDataBean.setChildLevelDataList(a(list, listB, str));
                arrayList.add(newLevelDetailDataBean);
            }
        }
        return arrayList;
    }

    private ArrayList<NewLevelDetailDataBean.ChildLevelDataBean> a(List<ExperienceHistoryBean> list, List<String> list2, String str) {
        ArrayList<NewLevelDetailDataBean.ChildLevelDataBean> arrayList = new ArrayList<>(8);
        if (!njy.e(list) && !njy.e(list2)) {
            Iterator<String> it = list2.iterator();
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                for (ExperienceHistoryBean experienceHistoryBean : list) {
                    if (str.equals(experienceHistoryBean.getMonthOfYear()) && next.equals(experienceHistoryBean.getDayOfMonth())) {
                        NewLevelDetailDataBean.ChildLevelDataBean childLevelDataBean = new NewLevelDetailDataBean.ChildLevelDataBean();
                        childLevelDataBean.setEachFirstChildTitle(z);
                        childLevelDataBean.setEndChild(false);
                        childLevelDataBean.setFirstChild(false);
                        childLevelDataBean.setDate(next);
                        childLevelDataBean.setName(experienceHistoryBean.getReasonDesc());
                        childLevelDataBean.setTime(experienceHistoryBean.getTime());
                        childLevelDataBean.setNewLevel(experienceHistoryBean.getNewLevel());
                        childLevelDataBean.setValue(experienceHistoryBean.getExperienceValue());
                        arrayList.add(childLevelDataBean);
                        z = false;
                    }
                }
            }
            if (njy.c(arrayList, 0)) {
                arrayList.get(0).setFirstChild(true);
            }
            if (njy.c(arrayList, arrayList.size() - 1)) {
                arrayList.get(arrayList.size() - 1).setEndChild(true);
            }
        }
        return arrayList;
    }

    private int b(List<ExperienceHistoryBean> list, String str) {
        int experienceValue = 0;
        if (njy.e(list)) {
            return 0;
        }
        for (ExperienceHistoryBean experienceHistoryBean : list) {
            if (str.equals(experienceHistoryBean.getMonthOfYear())) {
                experienceValue += experienceHistoryBean.getExperienceValue();
            }
        }
        return experienceValue;
    }

    private List<String> d(List<ExperienceHistoryBean> list) {
        ArrayList arrayList = new ArrayList(8);
        if (!njy.e(list)) {
            for (ExperienceHistoryBean experienceHistoryBean : list) {
                if (!arrayList.contains(experienceHistoryBean.getMonthOfYear())) {
                    arrayList.add(experienceHistoryBean.getMonthOfYear());
                }
            }
        }
        return arrayList;
    }

    private List<String> b(List<ExperienceHistoryBean> list) {
        ArrayList arrayList = new ArrayList(8);
        if (!njy.e(list)) {
            for (ExperienceHistoryBean experienceHistoryBean : list) {
                if (!arrayList.contains(experienceHistoryBean.getDayOfMonth())) {
                    arrayList.add(experienceHistoryBean.getDayOfMonth());
                }
            }
        }
        return arrayList;
    }

    @Override // android.widget.ExpandableListAdapter
    public int getGroupCount() {
        List<NewLevelDetailDataBean> list = this.f22181a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.ExpandableListAdapter
    public int getChildrenCount(int i) {
        ArrayList<NewLevelDetailDataBean.ChildLevelDataBean> childLevelDataList;
        if (njy.e(this.f22181a, i) || (childLevelDataList = this.f22181a.get(i).getChildLevelDataList()) == null) {
            return 0;
        }
        return childLevelDataList.size();
    }

    @Override // android.widget.ExpandableListAdapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public NewLevelDetailDataBean getGroup(int i) {
        return njy.e(this.f22181a, i) ? new NewLevelDetailDataBean() : this.f22181a.get(i);
    }

    @Override // android.widget.ExpandableListAdapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public NewLevelDetailDataBean.ChildLevelDataBean getChild(int i, int i2) {
        NewLevelDetailDataBean.ChildLevelDataBean childLevelDataBean = new NewLevelDetailDataBean.ChildLevelDataBean();
        if (!njy.e(this.f22181a, i)) {
            ArrayList<NewLevelDetailDataBean.ChildLevelDataBean> childLevelDataList = this.f22181a.get(i).getChildLevelDataList();
            if (!njy.e(childLevelDataList, i2)) {
                return childLevelDataList.get(i2);
            }
        }
        return childLevelDataBean;
    }

    @Override // android.widget.ExpandableListAdapter
    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        return b(i, z, view);
    }

    private View b(int i, boolean z, View view) {
        View viewInflate;
        a aVar;
        int i2;
        int i3;
        if (view == null) {
            aVar = new a();
            viewInflate = LayoutInflater.from(this.e).inflate(R.layout.achieve_level_expandable_father_item, (ViewGroup) null);
            aVar.d = (HealthTextView) out.b(viewInflate, R.id.group_name);
            aVar.f22183a = (HealthTextView) out.b(viewInflate, R.id.group_count);
            aVar.f22184b = (ImageView) out.b(viewInflate, R.id.group_arrow);
            viewInflate.setTag(aVar);
        } else {
            Object tag = view.getTag();
            if (!(tag instanceof a)) {
                return view;
            }
            a aVar2 = (a) tag;
            viewInflate = view;
            aVar = aVar2;
        }
        if (njy.e(this.f22181a, i)) {
            return viewInflate;
        }
        aVar.d.setText(this.f22181a.get(i).getDate());
        aVar.f22183a.setText(this.e.getResources().getString(R.string.IDS_level_record_total, String.valueOf(this.f22181a.get(i).getCount())));
        if (qqs.e(this.e)) {
            i2 = R.mipmap.level_arrow_dark_up;
            i3 = R.mipmap.level_arrow_dark_down;
        } else {
            i2 = R.mipmap.level_arrow_light_up;
            i3 = R.mipmap.level_arrow_light_down;
        }
        if (z) {
            aVar.f22184b.setImageResource(i2);
            return viewInflate;
        }
        aVar.f22184b.setImageResource(i3);
        return viewInflate;
    }

    @Override // android.widget.ExpandableListAdapter
    public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        return c(i, i2, view);
    }

    private View c(int i, int i2, View view) {
        View viewInflate;
        d dVar;
        if (view == null) {
            dVar = new d();
            viewInflate = LayoutInflater.from(this.e).inflate(R.layout.achieve_level_expandable_child_item, (ViewGroup) null);
            dVar.e = (HealthTextView) out.b(viewInflate, R.id.child_date);
            dVar.f22185a = (HealthTextView) out.b(viewInflate, R.id.child_time);
            dVar.f22187c = (HealthTextView) out.b(viewInflate, R.id.child_dec);
            dVar.g = (HealthTextView) out.b(viewInflate, R.id.child_value);
            dVar.j = (ImageView) out.b(viewInflate, R.id.image_line);
            dVar.f = (ImageView) out.b(viewInflate, R.id.head_down_line);
            dVar.h = (ImageView) out.b(viewInflate, R.id.head_up_line);
            dVar.f22186b = (RelativeLayout) out.b(viewInflate, R.id.childLayout);
            dVar.d = (LinearLayout) out.b(viewInflate, R.id.child_date_layout);
            dVar.p = (LinearLayout) out.b(viewInflate, R.id.style_layout);
            dVar.m = (LinearLayout) out.b(viewInflate, R.id.style_bg_layout);
            dVar.o = (ImageView) out.b(viewInflate, R.id.style_image_dot);
            dVar.k = (ImageView) out.b(viewInflate, R.id.style_head_down_line);
            dVar.l = (ImageView) out.b(viewInflate, R.id.style_head_up_line);
            dVar.r = (HealthTextView) out.b(viewInflate, R.id.style_name);
            dVar.s = (HealthTextView) out.b(viewInflate, R.id.style_super);
            dVar.n = (ImageView) out.b(viewInflate, R.id.level_image);
            dVar.i = out.b(viewInflate, R.id.level_data_line);
            viewInflate.setTag(dVar);
        } else {
            Object tag = view.getTag();
            if (!(tag instanceof d)) {
                return view;
            }
            d dVar2 = (d) tag;
            viewInflate = view;
            dVar = dVar2;
        }
        if (!njy.e(this.f22181a, i)) {
            ArrayList<NewLevelDetailDataBean.ChildLevelDataBean> childLevelDataList = this.f22181a.get(i).getChildLevelDataList();
            if (!njy.e(childLevelDataList, i2)) {
                c(dVar, childLevelDataList, childLevelDataList.get(i2), i2);
                return viewInflate;
            }
        }
        return viewInflate;
    }

    private void c(d dVar, ArrayList<NewLevelDetailDataBean.ChildLevelDataBean> arrayList, NewLevelDetailDataBean.ChildLevelDataBean childLevelDataBean, int i) {
        String str;
        dVar.e.setText(childLevelDataBean.getDate());
        dVar.f22185a.setText(childLevelDataBean.getTime());
        dVar.f22187c.setText(childLevelDataBean.getName());
        if (childLevelDataBean.isEachFirstChildTitle()) {
            dVar.d.setVisibility(0);
        } else {
            dVar.d.setVisibility(8);
        }
        if (i == 0) {
            dVar.f22186b.setBackgroundResource(R.drawable.level_white_background_up);
            dVar.h.setVisibility(8);
            dVar.f.setVisibility(0);
            dVar.j.setVisibility(0);
        } else if (i == arrayList.size() - 1) {
            dVar.f22186b.setBackgroundResource(R.drawable.level_white_background_bottom);
            dVar.h.setVisibility(0);
            dVar.l.setVisibility(0);
            b(dVar, childLevelDataBean);
        } else {
            dVar.j.setVisibility(0);
            dVar.h.setVisibility(0);
            dVar.f.setVisibility(0);
            dVar.f22186b.setBackgroundResource(R.color.colorCardPanelBg);
        }
        if (arrayList.size() == 1) {
            dVar.f22186b.setBackgroundResource(R.drawable.level_white_background);
        }
        if (childLevelDataBean.getValue() > 0) {
            str = Marker.ANY_NON_NULL_MARKER;
        } else {
            str = Constants.LINK;
        }
        dVar.g.setText(str + childLevelDataBean.getValue());
        a(dVar, childLevelDataBean);
    }

    private void b(d dVar, NewLevelDetailDataBean.ChildLevelDataBean childLevelDataBean) {
        if (childLevelDataBean.getNewLevel() != 0) {
            dVar.j.setVisibility(0);
            dVar.f.setVisibility(0);
            dVar.k.setVisibility(8);
        } else {
            dVar.f.setVisibility(8);
            dVar.j.setVisibility(8);
            dVar.k.setVisibility(0);
        }
    }

    private void a(d dVar, NewLevelDetailDataBean.ChildLevelDataBean childLevelDataBean) {
        if (childLevelDataBean.getNewLevel() != 0) {
            dVar.i.setVisibility(8);
            dVar.p.setVisibility(0);
            if (childLevelDataBean.getNewLevel() > 0) {
                int newLevel = childLevelDataBean.getNewLevel();
                Integer[] numArr = d;
                if (newLevel - 1 < numArr.length) {
                    dVar.m.setBackgroundResource(f22180c[childLevelDataBean.getNewLevel() - 1].intValue());
                    dVar.o.setImageResource(numArr[childLevelDataBean.getNewLevel() - 1].intValue());
                    dVar.n.setImageResource(paq.b(childLevelDataBean.getNewLevel()));
                }
            }
            dVar.r.setText(paq.d(childLevelDataBean.getNewLevel()));
            String strC = ltc.c(0.0d, 2, 0);
            if (njy.c(this.f22182b, childLevelDataBean.getNewLevel() + 1)) {
                strC = this.f22182b.get(childLevelDataBean.getNewLevel() + 1);
            }
            dVar.s.setText(BaseApplication.getContext().getResources().getString(R.string.IDS_level_super_dec, strC));
            return;
        }
        dVar.i.setVisibility(0);
        dVar.p.setVisibility(8);
    }
}
