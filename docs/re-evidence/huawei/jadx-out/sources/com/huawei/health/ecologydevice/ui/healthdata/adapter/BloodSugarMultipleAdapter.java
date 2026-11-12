package com.huawei.health.ecologydevice.ui.healthdata.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.huawei.ecologydevice.R;
import com.huawei.hihealth.HiHealthData;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.emq;
import defpackage.njy;
import defpackage.qrk;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public class BloodSugarMultipleAdapter extends BaseExpandableListAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f6596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6597b;
    private int d;
    private int e;
    private final Resources h;
    private List<String> i = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<List<HiHealthData>> f6598c = new ArrayList();

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

    public BloodSugarMultipleAdapter(Context context) {
        this.f6596a = context;
        this.h = context.getResources();
        e();
    }

    private void e() {
        this.d = this.h.getDimensionPixelSize(R.dimen.health_common_4dp);
        this.f6597b = this.h.getDimensionPixelSize(R.dimen.health_common_64dp);
        this.e = this.h.getDimensionPixelSize(R.dimen.health_common_48dp);
    }

    public void e(List<String> list, List<List<HiHealthData>> list2) {
        if ((list instanceof ArrayList) && (list2 instanceof ArrayList)) {
            Object objClone = ((ArrayList) list).clone();
            if (objClone instanceof ArrayList) {
                this.i = (List) objClone;
            }
            Object objClone2 = ((ArrayList) list2).clone();
            if (objClone2 instanceof ArrayList) {
                this.f6598c = (List) objClone2;
            }
        }
    }

    @Override // android.widget.ExpandableListAdapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public HiHealthData getChild(int i, int i2) {
        if (njy.c(this.f6598c, i) && !njy.e(this.f6598c.get(i), i2)) {
            return this.f6598c.get(i).get(i2);
        }
        return null;
    }

    @Override // android.widget.ExpandableListAdapter
    public int getChildrenCount(int i) {
        List<List<HiHealthData>> list = this.f6598c;
        if (list != null && njy.c(list, i)) {
            return this.f6598c.get(i).size();
        }
        return 0;
    }

    @Override // android.widget.ExpandableListAdapter
    public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = a();
        }
        Object tag = view.getTag();
        if (tag instanceof b) {
            b bVar = (b) tag;
            e(bVar, z);
            HiHealthData child = getChild(i, i2);
            if (child != null) {
                bVar.j.setText(UnitUtil.e(child.getValue(), 1, 1));
                int iIntValue = BigDecimal.valueOf(child.getType()).intValue();
                bVar.f.setText(emq.b(emq.c(this.f6596a, iIntValue, BigDecimal.valueOf(child.getValue()).floatValue())));
                bVar.f.setTextColor(e(child));
                bVar.f6600b.setText(emq.d(iIntValue));
                bVar.f6599a.setText(this.h.getString(R.string.IDS_hw_show_healthdata_bloodsugar_to_be_confirmed));
                bVar.h.setText(qrk.g(child.getEndTime()));
                if (LanguageUtil.ba(this.f6596a)) {
                    bVar.g.setImageResource(R.drawable.common_ui_arrow_left);
                    return view;
                }
                bVar.g.setImageResource(R.drawable.common_ui_arrow_right);
            }
        }
        return view;
    }

    private View a() {
        b bVar = new b();
        View viewInflate = LayoutInflater.from(this.f6596a).inflate(R.layout.item_blood_sugar_history_child, (ViewGroup) null);
        bVar.e = viewInflate.findViewById(R.id.blood_sugar_history_child_bg);
        bVar.f6601c = (ImageView) viewInflate.findViewById(R.id.blood_sugar_history_child_left_img);
        bVar.j = (HealthTextView) viewInflate.findViewById(R.id.blood_sugar_history_child_value);
        bVar.f = (HealthTextView) viewInflate.findViewById(R.id.blood_sugar_history_child_status_text);
        bVar.f6600b = (HealthTextView) viewInflate.findViewById(R.id.blood_sugar_history_child_period);
        bVar.f6599a = (HealthTextView) viewInflate.findViewById(R.id.blood_sugar_history_child_confirmed);
        bVar.h = (HealthTextView) viewInflate.findViewById(R.id.blood_sugar_history_child_time);
        bVar.g = (ImageView) viewInflate.findViewById(R.id.blood_sugar_history_child_right_arrow);
        bVar.d = (HealthDivider) viewInflate.findViewById(R.id.blood_sugar_history_child_middle_line);
        viewInflate.setTag(bVar);
        return viewInflate;
    }

    private void e(b bVar, boolean z) {
        bVar.f6601c.setImageResource(R.drawable.ic_blood_sugar_meter);
        ViewGroup.LayoutParams layoutParams = bVar.e.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            if (z) {
                bVar.d.setVisibility(8);
                bVar.e.setBackground(ContextCompat.getDrawable(this.f6596a, R.drawable.blood_sugar_history_bg_round_bottom));
                layoutParams2.height = this.f6597b + this.d;
            } else {
                bVar.d.setVisibility(0);
                bVar.e.setBackgroundColor(ContextCompat.getColor(this.f6596a, R.color.colorCardPanelBg));
                layoutParams2.height = this.f6597b;
            }
            bVar.e.setLayoutParams(layoutParams2);
        }
    }

    private int e(HiHealthData hiHealthData) {
        int length;
        List<Float> listA = emq.a(BigDecimal.valueOf(hiHealthData.getType()).intValue());
        int[] iArrB = emq.b();
        for (int i = 0; i < listA.size(); i++) {
            if (hiHealthData.getValue() <= listA.get(i).floatValue() && (length = (iArrB.length / 2) + i) < iArrB.length) {
                return iArrB[length];
            }
        }
        return ContextCompat.getColor(this.f6596a, R.color.color_blood_low_light);
    }

    @Override // android.widget.ExpandableListAdapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public String getGroup(int i) {
        if (!njy.c(this.i, i)) {
            return "";
        }
        return this.i.get(i);
    }

    @Override // android.widget.ExpandableListAdapter
    public int getGroupCount() {
        List<String> list = this.i;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.ExpandableListAdapter
    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = c();
        }
        Object tag = view.getTag();
        if (tag instanceof c) {
            c cVar = (c) tag;
            c(cVar, i, z);
            String group = getGroup(i);
            if (group != null) {
                cVar.f6602a.setText(group);
                int childrenCount = getChildrenCount(i);
                cVar.e.setText(this.h.getQuantityString(R.plurals.IDS_hw_show_healthdata_bloodsugar_times_per_day, childrenCount, Integer.valueOf(childrenCount)));
            }
        }
        return view;
    }

    private View c() {
        c cVar = new c();
        View viewInflate = LayoutInflater.from(this.f6596a).inflate(R.layout.item_blood_sugar_history_father, (ViewGroup) null);
        cVar.f6604c = viewInflate.findViewById(R.id.blood_sugar_history_father_bg);
        cVar.f6602a = (HealthTextView) viewInflate.findViewById(R.id.blood_sugar_history_father_date);
        cVar.e = (HealthTextView) viewInflate.findViewById(R.id.blood_sugar_history_father_count);
        cVar.f6603b = (ImageView) viewInflate.findViewById(R.id.blood_sugar_history_father_arrow);
        cVar.f = viewInflate.findViewById(R.id.blood_sugar_history_father_line);
        cVar.d = viewInflate.findViewById(R.id.blood_sugar_history_bottom_image_interval);
        viewInflate.setTag(cVar);
        return viewInflate;
    }

    private void c(c cVar, int i, boolean z) {
        ViewGroup.LayoutParams layoutParams = cVar.f.getLayoutParams();
        if (i == 0) {
            layoutParams.height = 0;
        } else {
            layoutParams.height = this.h.getDimensionPixelSize(R.dimen.cardMarginMiddle);
        }
        cVar.f.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = cVar.f6604c.getLayoutParams();
        if (layoutParams2 instanceof ConstraintLayout.LayoutParams) {
            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams2;
            if (z) {
                cVar.f6604c.setBackground(ContextCompat.getDrawable(this.f6596a, R.drawable.blood_sugar_history_bg_round_top));
                cVar.f6603b.setImageResource(R.drawable.ic_health_list_drop_down_arrow_sel);
                cVar.d.setVisibility(0);
                layoutParams3.height = this.e + this.d;
            } else {
                cVar.f6604c.setBackground(ContextCompat.getDrawable(this.f6596a, R.drawable.blood_sugar_history_bg_round));
                cVar.f6603b.setImageResource(R.drawable.ic_health_list_drop_down_arrow_nor);
                cVar.d.setVisibility(8);
                int i2 = this.e;
                int i3 = this.d;
                layoutParams3.height = i2 + i3 + i3;
            }
            cVar.f6604c.setLayoutParams(layoutParams3);
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f6602a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ImageView f6603b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        View f6604c;
        View d;
        HealthTextView e;
        View f;

        private c() {
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f6599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f6600b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ImageView f6601c;
        HealthDivider d;
        View e;
        HealthTextView f;
        ImageView g;
        HealthTextView h;
        HealthTextView j;

        private b() {
        }
    }
}
