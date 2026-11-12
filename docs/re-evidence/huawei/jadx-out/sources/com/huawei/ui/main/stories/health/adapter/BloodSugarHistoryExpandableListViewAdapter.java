package com.huawei.ui.main.stories.health.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.view.timeperiod.BloodSugarTimePeriod;
import com.huawei.ui.main.R;
import defpackage.njy;
import defpackage.qrs;
import defpackage.uvy;
import defpackage.uvz;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class BloodSugarHistoryExpandableListViewAdapter extends BaseExpandableListAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f27689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f27690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27691c;
    private ArrayList<List<Boolean>> d;
    private Drawable e;
    private int f;
    private int g;
    private Context h;
    private Drawable i;
    private Drawable j;
    private int k;
    private int l;
    private List<uvy> m;
    private int n;
    private Drawable o;
    private OnItemClickListener p;
    private String q;
    private int r = 0;
    private String s;

    public interface OnItemClickListener {
        void onItemClickListener(int i, int i2);
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
        return false;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean isChildSelectable(int i, int i2) {
        return true;
    }

    public BloodSugarHistoryExpandableListViewAdapter(Context context) {
        d(context);
    }

    private static void a(Context context, int i, boolean z, HealthTextView healthTextView, String str) {
        BloodSugarTimePeriod timePeriodByCode = BloodSugarTimePeriod.getTimePeriodByCode(i);
        if (timePeriodByCode == null) {
            return;
        }
        String string = context.getResources().getString(timePeriodByCode.getTimePeriodNameRes());
        if (!z) {
            string = string + " | " + str;
        }
        healthTextView.setText(string);
    }

    private void d(Context context) {
        this.h = context;
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.hw_show_public_size_4);
        this.k = dimensionPixelSize;
        this.f27689a = dimensionPixelSize;
        this.n = resources.getDimensionPixelSize(R.dimen.cardMarginMiddle);
        this.s = resources.getString(R.string.IDS_hw_health_show_healthdata_bloodsugar_mmol);
        this.q = resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_to_be_confirmed);
        this.o = resources.getDrawable(R.drawable.blood_sugar_history_bg_round_top);
        this.i = resources.getDrawable(R.drawable.blood_sugar_history_bg_round);
        this.j = resources.getDrawable(R.drawable.blood_sugar_history_bg_round_bottom);
        this.e = resources.getDrawable(R.color.colorCardPanelBg);
        this.g = resources.getColor(R.color.color_blood_low);
        this.f = resources.getColor(R.color.color_blood_normal);
        this.f27691c = resources.getColor(R.color.color_blood_high);
        this.f27690b = resources.getDimensionPixelSize(R.dimen.hw_show_public_size_72);
        this.l = resources.getDimensionPixelSize(R.dimen.hw_show_public_size_48);
        this.d = new ArrayList<>();
    }

    @Override // android.widget.ExpandableListAdapter
    public int getGroupCount() {
        List<uvy> list = this.m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.ExpandableListAdapter
    public int getChildrenCount(int i) {
        if (njy.e(this.m, i)) {
            LogUtil.c("BloodSugarHistoryExpand", "getChildrenCount is out of bounds");
            return 0;
        }
        ArrayList<uvy.e> arrayListC = this.m.get(i).c();
        if (arrayListC == null) {
            return 0;
        }
        return arrayListC.size();
    }

    @Override // android.widget.ExpandableListAdapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public uvy getGroup(int i) {
        if (njy.c(this.m, i)) {
            return this.m.get(i);
        }
        LogUtil.c("BloodSugarHistoryExpand", "getGroup is out of bounds");
        return new uvy();
    }

    @Override // android.widget.ExpandableListAdapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public uvy.e getChild(int i, int i2) {
        if (njy.c(this.m, i)) {
            ArrayList<uvy.e> arrayListC = this.m.get(i).c();
            if (njy.c(arrayListC, i2)) {
                return arrayListC.get(i2);
            }
            LogUtil.c("BloodSugarHistoryExpand", "getChild is out of bounds");
            return new uvy.e();
        }
        LogUtil.c("BloodSugarHistoryExpand", "getChild is out of bounds");
        return new uvy.e();
    }

    @Override // android.widget.ExpandableListAdapter
    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        View viewInflate;
        b bVar;
        String quantityString;
        int i2;
        if (view == null) {
            bVar = new b();
            if (qrs.ac()) {
                i2 = R.layout.layout_blood_sugar_history_father_item_large;
            } else {
                i2 = R.layout.layout_blood_sugar_history_father_item;
            }
            viewInflate = LayoutInflater.from(this.h).inflate(i2, (ViewGroup) null);
            e(viewInflate, bVar);
            viewInflate.setTag(bVar);
        } else {
            Object tag = view.getTag();
            if (!(tag instanceof b)) {
                return view;
            }
            b bVar2 = (b) tag;
            viewInflate = view;
            bVar = bVar2;
        }
        b(bVar, i, z);
        bVar.f27696c.setVisibility(0);
        if (njy.e(this.m, i)) {
            return viewInflate;
        }
        uvy uvyVar = this.m.get(i);
        ArrayList<uvy.e> arrayListC = uvyVar.c();
        HealthTextView healthTextView = bVar.f27696c;
        if (arrayListC == null) {
            quantityString = this.h.getResources().getQuantityString(R.plurals.IDS_hw_show_healthdata_bloodsugar_times_per_day, 0, 0);
        } else {
            quantityString = this.h.getResources().getQuantityString(R.plurals.IDS_hw_show_healthdata_bloodsugar_times_per_day, arrayListC.size(), Integer.valueOf(arrayListC.size()));
        }
        healthTextView.setText(quantityString);
        bVar.f27694a.setText(DateFormatUtil.a(uvyVar.a(), DateFormatUtil.DateFormatType.DATE_FORMAT_YYYYMD));
        return viewInflate;
    }

    @Override // android.widget.ExpandableListAdapter
    public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        c cVar;
        int i3;
        if (view == null) {
            c cVar2 = new c();
            if (qrs.ac()) {
                i3 = R.layout.layout_blood_sugar_history_child_item_large;
            } else {
                i3 = R.layout.layout_blood_sugar_history_child_item;
            }
            View viewInflate = LayoutInflater.from(this.h).inflate(i3, (ViewGroup) null);
            b(cVar2, viewInflate);
            viewInflate.setTag(cVar2);
            cVar = cVar2;
            view = viewInflate;
        } else {
            Object tag = view.getTag();
            if (tag instanceof c) {
                cVar = (c) tag;
            }
            return view;
        }
        if (!njy.e(this.m, i)) {
            ArrayList<uvy.e> arrayListC = this.m.get(i).c();
            if (!njy.e(arrayListC, i2)) {
                c(arrayListC, cVar, i2, i, z);
                return view;
            }
        }
        return view;
    }

    private void b(b bVar, int i, boolean z) {
        ViewGroup.LayoutParams layoutParams = bVar.f.getLayoutParams();
        if (i == 0) {
            layoutParams.height = this.k;
        } else {
            layoutParams.height = this.n;
        }
        bVar.f.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = bVar.d.getLayoutParams();
        if (layoutParams2 instanceof ConstraintLayout.LayoutParams) {
            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams2;
            if (z) {
                bVar.e.setImageResource(R.drawable.ic_health_list_drop_down_arrow_sel);
                bVar.d.setBackground(this.o);
                bVar.f27695b.setVisibility(0);
                layoutParams3.height = this.l + this.f27689a;
                layoutParams3.bottomMargin = 0;
            } else {
                bVar.e.setImageResource(R.drawable.ic_health_list_drop_down_arrow_nor);
                bVar.d.setBackground(this.i);
                bVar.f27695b.setVisibility(8);
                int i2 = this.l;
                int i3 = this.f27689a;
                layoutParams3.height = i2 + i3 + i3;
                if (i == this.m.size() - 1) {
                    layoutParams3.bottomMargin = this.n;
                } else {
                    layoutParams3.bottomMargin = 0;
                }
            }
            bVar.d.setLayoutParams(layoutParams3);
        }
    }

    private void b(c cVar, int i, int i2, uvy.e eVar) {
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            cVar.i.setScaleX(-1.0f);
        }
        if (eVar.b()) {
            cVar.i.setImageResource(R.drawable.ic_blood_sugar_measure);
        } else {
            cVar.i.setImageResource(R.drawable.ic_blood_sugar_meter);
        }
        if (this.r != 1) {
            if (LanguageUtil.ba(BaseApplication.getContext())) {
                cVar.d.setScaleX(-1.0f);
            }
            cVar.d.setVisibility(0);
            cVar.e.setVisibility(8);
            return;
        }
        cVar.d.setVisibility(8);
        cVar.e.setVisibility(0);
        cVar.e.setOnCheckedChangeListener(null);
        if (njy.c(this.d, i2)) {
            List<Boolean> list = this.d.get(i2);
            if (njy.c(list, i)) {
                cVar.e.setChecked(list.get(i).booleanValue());
            }
        }
    }

    private void c(ArrayList<uvy.e> arrayList, c cVar, final int i, final int i2, boolean z) {
        uvy.e eVar = arrayList.get(i);
        double dI = eVar.i();
        cVar.f27697a.setText(this.h.getResources().getQuantityString(R.plurals.IDS_health_bloodsugar_mmol, (int) dI, UnitUtil.e(dI, 1, 1)));
        String strA = DateFormatUtil.a(eVar.n(), DateFormatUtil.DateFormatType.DATE_FORMAT_HOUR_MINUTE);
        a(this.h, eVar.d(), eVar.o(), cVar.h, this.q);
        cVar.f27699c.setText(strA);
        e(dI, eVar, cVar);
        b(cVar, i, i2, eVar);
        c(cVar, i2, z);
        cVar.e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.main.stories.health.adapter.BloodSugarHistoryExpandableListViewAdapter$$ExternalSyntheticLambda0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                this.f27693b.d(i2, i, compoundButton, z2);
            }
        });
    }

    /* synthetic */ void d(int i, int i2, CompoundButton compoundButton, boolean z) {
        OnItemClickListener onItemClickListener = this.p;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClickListener(i, i2);
        }
    }

    private void c(c cVar, int i, boolean z) {
        if (z) {
            cVar.f27698b.setVisibility(8);
            cVar.j.setBackground(this.j);
        } else {
            cVar.f27698b.setVisibility(0);
            cVar.j.setBackground(this.e);
        }
        ViewGroup.LayoutParams layoutParams = cVar.j.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            if (z && i == this.m.size() - 1) {
                layoutParams2.bottomMargin = this.n;
            } else {
                layoutParams2.bottomMargin = 0;
            }
            if (z) {
                layoutParams2.height = this.f27690b + this.f27689a;
            } else {
                layoutParams2.height = this.f27690b;
            }
            cVar.j.setLayoutParams(layoutParams2);
        }
    }

    private void e(double d, uvy.e eVar, c cVar) {
        Map<String, String> mapD = uvz.d(this.h, eVar.d(), (float) d);
        cVar.f.setText(mapD.get("HEALTH_BLOOD_SUGAR_LEVEL_DESC"));
        String str = mapD.get("HEALTH_BLOOD_SUGAR_LEVEL_KEY");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!str.equals(String.valueOf(1001)) && !str.equals(String.valueOf(1002))) {
            if (str.equals(String.valueOf(1004)) || str.equals(String.valueOf(1005)) || str.equals(String.valueOf(1006))) {
                cVar.f.setTextColor(this.f27691c);
                return;
            } else {
                cVar.f.setTextColor(this.f);
                return;
            }
        }
        cVar.f.setTextColor(this.g);
    }

    public void c(int i) {
        if (i == 1 && this.r == 0) {
            d();
        }
        this.r = i;
        notifyDataSetChanged();
    }

    public void c() {
        for (List<Boolean> list : this.d) {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, true);
            }
        }
        notifyDataSetChanged();
    }

    public void a() {
        for (List<Boolean> list : this.d) {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, false);
            }
        }
        notifyDataSetChanged();
    }

    public void d() {
        ArrayList<List<Boolean>> arrayList = this.d;
        if (arrayList == null) {
            this.d = new ArrayList<>();
        } else {
            arrayList.clear();
        }
        if (njy.e(this.m)) {
            return;
        }
        for (uvy uvyVar : this.m) {
            if (uvyVar != null) {
                ArrayList<uvy.e> arrayListC = uvyVar.c();
                if (arrayListC != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < arrayListC.size(); i++) {
                        arrayList2.add(false);
                    }
                    this.d.add(arrayList2);
                } else {
                    this.d.add(new ArrayList());
                }
            }
        }
    }

    public List<uvy> b() {
        return this.m;
    }

    public void c(List<uvy> list) {
        if (list == null) {
            LogUtil.c("BloodSugarHistoryExpand", "setList list is null");
            return;
        }
        this.m = new ArrayList(list);
        d();
        notifyDataSetChanged();
    }

    public ArrayList<List<Boolean>> e() {
        return this.d;
    }

    public void b(ArrayList<List<Boolean>> arrayList) {
        if (arrayList == null) {
            LogUtil.c("BloodSugarHistoryExpand", "setCheckList checkList is null");
        } else {
            this.d = new ArrayList<>(arrayList);
            notifyDataSetChanged();
        }
    }

    private void e(View view, b bVar) {
        bVar.d = view.findViewById(R.id.hw_show_blood_sugar_history_father_bg);
        bVar.f27694a = (HealthTextView) view.findViewById(R.id.hw_show_blood_sugar_history_father_date);
        bVar.f27696c = (HealthTextView) view.findViewById(R.id.hw_show_blood_sugar_history_father_count);
        bVar.e = (ImageView) view.findViewById(R.id.hw_show_blood_sugar_history_father_arrow);
        bVar.f = view.findViewById(R.id.hw_show_blood_sugar_history_father_line);
        bVar.f27695b = view.findViewById(R.id.hw_show_blood_sugar_history_bottom_image_interval);
    }

    private void b(c cVar, View view) {
        cVar.j = view.findViewById(R.id.hw_show_blood_sugar_history_child_bg);
        cVar.i = (ImageView) view.findViewById(R.id.hw_show_blood_sugar_history_child_left_img);
        cVar.f27697a = (HealthTextView) view.findViewById(R.id.hw_show_blood_sugar_history_child_value);
        cVar.f = (HealthTextView) view.findViewById(R.id.hw_show_blood_sugar_history_child_status_text);
        cVar.h = (HealthTextView) view.findViewById(R.id.hw_show_blood_sugar_history_child_period);
        cVar.f27699c = (HealthTextView) view.findViewById(R.id.hw_show_blood_sugar_history_child_time);
        cVar.d = (ImageView) view.findViewById(R.id.hw_blood_sugar_history_child_right_arrow);
        cVar.e = (HealthCheckBox) view.findViewById(R.id.hw_blood_sugar_history_child_right_check);
        cVar.f27698b = (HealthDivider) view.findViewById(R.id.hw_blood_sugar_history_child_middle_line);
    }

    public void c(OnItemClickListener onItemClickListener) {
        this.p = onItemClickListener;
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthTextView f27694a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private View f27695b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f27696c;
        private View d;
        private ImageView e;
        private View f;

        private b() {
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthTextView f27697a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthDivider f27698b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f27699c;
        private ImageView d;
        private HealthCheckBox e;
        private HealthTextView f;
        private HealthTextView h;
        private ImageView i;
        private View j;

        private c() {
        }
    }
}
