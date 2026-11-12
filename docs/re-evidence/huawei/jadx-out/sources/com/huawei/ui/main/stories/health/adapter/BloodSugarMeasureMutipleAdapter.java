package com.huawei.ui.main.stories.health.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import defpackage.njy;
import defpackage.uvz;
import defpackage.uwh;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class BloodSugarMeasureMutipleAdapter extends BaseExpandableListAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f27701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27702c;
    private final Context d;
    private int e;
    private List<String> g = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<List<uwh>> f27700a = new ArrayList();

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

    public BloodSugarMeasureMutipleAdapter(Context context) {
        this.d = context;
        b();
    }

    private void b() {
        Resources resources = this.d.getResources();
        this.e = resources.getDimensionPixelSize(R.dimen.hw_show_public_size_4);
        this.f27702c = resources.getDimensionPixelSize(R.dimen.hw_show_public_size_72);
        this.f27701b = resources.getDimensionPixelSize(R.dimen.hw_show_public_size_48);
    }

    public void a(List<String> list, List<List<uwh>> list2) {
        if ((list instanceof ArrayList) && (list2 instanceof ArrayList)) {
            Object objClone = ((ArrayList) list).clone();
            if (objClone instanceof ArrayList) {
                this.g = (List) objClone;
            }
            Object objClone2 = ((ArrayList) list2).clone();
            if (objClone2 instanceof ArrayList) {
                this.f27700a = (List) objClone2;
            }
        }
    }

    @Override // android.widget.ExpandableListAdapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public uwh getChild(int i, int i2) {
        if (njy.c(this.f27700a, i) && !njy.e(this.f27700a.get(i), i2)) {
            return this.f27700a.get(i).get(i2);
        }
        return null;
    }

    @Override // android.widget.ExpandableListAdapter
    public int getChildrenCount(int i) {
        List<List<uwh>> list = this.f27700a;
        if (list != null && njy.c(list, i)) {
            return this.f27700a.get(i).size();
        }
        return 0;
    }

    @Override // android.widget.ExpandableListAdapter
    public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = d();
        }
        Object tag = view.getTag();
        if (tag instanceof b) {
            b bVar = (b) tag;
            d(bVar, z);
            uwh child = getChild(i, i2);
            if (child != null) {
                bVar.g.setText(this.d.getResources().getString(R.string.IDS_hw_show_healthdata_bloodsugar_list_item_value, Double.valueOf(child.o())));
                bVar.f27707b.setText(String.valueOf(uvz.d(this.d, BigDecimal.valueOf(child.m()).intValue(), BigDecimal.valueOf(child.o()).floatValue()).get("HEALTH_BLOOD_SUGAR_LEVEL_DESC")));
                bVar.f27707b.setTextColor(d(child));
                bVar.f27706a.setText(this.d.getResources().getString(R.string.IDS_hw_show_healthdata_bloodsugar_list_item_period_and_confirmed, uvz.b(this.d, BigDecimal.valueOf(child.m()).intValue()), this.d.getResources().getString(R.string.IDS_hw_show_healthdata_bloodsugar_to_be_confirmed)));
                bVar.h.setText(DateFormatUtil.a(child.g(), DateFormatUtil.DateFormatType.DATE_FORMAT_HOUR_MINUTE));
            }
        }
        return view;
    }

    private View d() {
        b bVar = new b();
        View viewInflate = LayoutInflater.from(this.d).inflate(R.layout.layout_blood_sugar_history_child_item, (ViewGroup) null);
        bVar.f27708c = viewInflate.findViewById(R.id.hw_show_blood_sugar_history_child_bg);
        bVar.d = (ImageView) viewInflate.findViewById(R.id.hw_show_blood_sugar_history_child_left_img);
        bVar.g = (HealthTextView) viewInflate.findViewById(R.id.hw_show_blood_sugar_history_child_value);
        bVar.f27707b = (HealthTextView) viewInflate.findViewById(R.id.hw_show_blood_sugar_history_child_status_text);
        bVar.f27706a = (HealthTextView) viewInflate.findViewById(R.id.hw_show_blood_sugar_history_child_period);
        bVar.h = (HealthTextView) viewInflate.findViewById(R.id.hw_show_blood_sugar_history_child_time);
        bVar.e = (HealthDivider) viewInflate.findViewById(R.id.hw_blood_sugar_history_child_middle_line);
        viewInflate.setTag(bVar);
        return viewInflate;
    }

    private void d(b bVar, boolean z) {
        bVar.d.setImageResource(R.drawable.ic_blood_sugar_meter);
        ViewGroup.LayoutParams layoutParams = bVar.f27708c.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            if (z) {
                bVar.e.setVisibility(8);
                bVar.f27708c.setBackground(this.d.getResources().getDrawable(R.drawable.blood_sugar_history_bg_round_bottom));
                layoutParams2.height = this.f27702c + this.e;
            } else {
                bVar.e.setVisibility(0);
                bVar.f27708c.setBackground(this.d.getResources().getDrawable(R.color.colorCardPanelBg));
                layoutParams2.height = this.f27702c;
            }
            bVar.f27708c.setLayoutParams(layoutParams2);
        }
    }

    private int d(uwh uwhVar) {
        int length;
        List<Float> listB = uvz.b(BigDecimal.valueOf(uwhVar.m()).intValue());
        int[] iArrC = uvz.c(this.d);
        for (int i = 0; i < listB.size(); i++) {
            if (uwhVar.o() <= listB.get(i).floatValue() && (length = (iArrC.length / 2) + i) < iArrC.length) {
                return iArrC[length];
            }
        }
        return ContextCompat.getColor(this.d, R.color.color_blood_low_light);
    }

    @Override // android.widget.ExpandableListAdapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public String getGroup(int i) {
        if (njy.c(this.g, i)) {
            return this.g.get(i);
        }
        return null;
    }

    @Override // android.widget.ExpandableListAdapter
    public int getGroupCount() {
        List<String> list = this.g;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.ExpandableListAdapter
    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = e();
        }
        Object tag = view.getTag();
        if (tag instanceof a) {
            a aVar = (a) tag;
            c(aVar, i, z);
            String group = getGroup(i);
            if (group != null) {
                aVar.f27703a.setText(group);
                int childrenCount = getChildrenCount(i);
                aVar.d.setText(this.d.getResources().getQuantityString(R.plurals.IDS_hw_show_healthdata_bloodsugar_times_per_day, childrenCount, Integer.valueOf(childrenCount)));
            }
        }
        return view;
    }

    private View e() {
        a aVar = new a();
        View viewInflate = LayoutInflater.from(this.d).inflate(R.layout.layout_blood_sugar_history_father_item, (ViewGroup) null);
        aVar.e = viewInflate.findViewById(R.id.hw_show_blood_sugar_history_father_bg);
        aVar.f27703a = (HealthTextView) viewInflate.findViewById(R.id.hw_show_blood_sugar_history_father_date);
        aVar.d = (HealthTextView) viewInflate.findViewById(R.id.hw_show_blood_sugar_history_father_count);
        aVar.f27704b = (ImageView) viewInflate.findViewById(R.id.hw_show_blood_sugar_history_father_arrow);
        aVar.h = viewInflate.findViewById(R.id.hw_show_blood_sugar_history_father_line);
        aVar.f27705c = viewInflate.findViewById(R.id.hw_show_blood_sugar_history_bottom_image_interval);
        viewInflate.setTag(aVar);
        return viewInflate;
    }

    private void c(a aVar, int i, boolean z) {
        ViewGroup.LayoutParams layoutParams = aVar.h.getLayoutParams();
        if (i == 0) {
            layoutParams.height = 0;
        } else {
            layoutParams.height = this.d.getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle);
        }
        aVar.h.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = aVar.e.getLayoutParams();
        if (layoutParams2 instanceof ConstraintLayout.LayoutParams) {
            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams2;
            if (z) {
                aVar.e.setBackground(this.d.getResources().getDrawable(R.drawable.blood_sugar_history_bg_round_top));
                aVar.f27704b.setImageResource(R.drawable.ic_health_list_drop_down_arrow_sel);
                aVar.f27705c.setVisibility(0);
                layoutParams3.height = this.f27701b + this.e;
            } else {
                aVar.e.setBackground(this.d.getResources().getDrawable(R.drawable.blood_sugar_history_bg_round));
                aVar.f27704b.setImageResource(R.drawable.ic_health_list_drop_down_arrow_nor);
                aVar.f27705c.setVisibility(8);
                int i2 = this.f27701b;
                int i3 = this.e;
                layoutParams3.height = i2 + i3 + i3;
            }
            aVar.e.setLayoutParams(layoutParams3);
        }
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f27703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ImageView f27704b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        View f27705c;
        HealthTextView d;
        View e;
        View h;

        private a() {
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f27706a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f27707b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        View f27708c;
        ImageView d;
        HealthDivider e;
        HealthTextView g;
        HealthTextView h;

        private b() {
        }
    }
}
