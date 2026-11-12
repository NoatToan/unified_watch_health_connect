package com.huawei.ui.main.stories.history.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.huawei.android.airsharing.api.PlayInfo;
import com.huawei.healthcloud.plugintrack.ui.sporttypeconfig.bean.HwSportTypeInfo;
import com.huawei.hihealth.dictionary.model.HealthDataStatPolicy;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.history.view.MonthTitleContainer;
import com.huawei.ui.main.stories.history.view.MonthTitleItem;
import defpackage.der;
import defpackage.izn;
import defpackage.jaa;
import defpackage.jqq;
import defpackage.jry;
import defpackage.lrd;
import defpackage.njy;
import defpackage.nkw;
import defpackage.nub;
import defpackage.qqf;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrk;
import defpackage.qrs;
import defpackage.vps;
import defpackage.vqu;
import defpackage.vrb;
import defpackage.vrg;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.utils.StringUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class SportHistoryExpandableListAdapter extends BaseExpandableListAdapter {
    private static final List<Integer> e = new ArrayList(Arrays.asList(258, 257, 259, 260, 262, 283));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<vqu> f28292b;
    private Context d;
    private boolean g;
    private int j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f28291a = "--";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28293c = 0;

    private boolean h(double d2) {
        return d2 <= 0.0d;
    }

    @Override // android.widget.ExpandableListAdapter
    public long getChildId(int i, int i2) {
        if (i2 > 0) {
            return i2;
        }
        return 0L;
    }

    @Override // android.widget.ExpandableListAdapter
    public long getGroupId(int i) {
        if (i > 0) {
            return i;
        }
        return 0L;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean isChildSelectable(int i, int i2) {
        return true;
    }

    public SportHistoryExpandableListAdapter(Context context, Fragment fragment) {
        d(context, fragment);
    }

    private void d(Context context, Fragment fragment) {
        this.d = context;
        this.f28291a = context.getResources().getString(R.string.IDS_motiontrack_show_invalid_data);
    }

    public void b(List<vqu> list, int i) {
        LogUtil.a("Track_SportHistoryExpandableListAdapter", "resetGroupData");
        this.f28292b = list;
        this.f28293c = i;
        this.g = Utils.k();
    }

    public void b(int i) {
        this.j = i;
    }

    public void c() {
        List<vqu> list = this.f28292b;
        if (list != null) {
            list.clear();
        }
        notifyDataSetInvalidated();
    }

    @Override // android.widget.ExpandableListAdapter
    public int getGroupCount() {
        List<vqu> list = this.f28292b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.ExpandableListAdapter
    public int getChildrenCount(int i) {
        List<vqu> list = this.f28292b;
        if (list == null || i < 0 || list.size() <= i) {
            return 0;
        }
        return this.f28292b.get(i).b();
    }

    @Override // android.widget.ExpandableListAdapter
    public Object getGroup(int i) {
        List<vqu> list = this.f28292b;
        if (list == null || list.size() == 0 || njy.e(this.f28292b, i)) {
            return null;
        }
        return this.f28292b.get(i);
    }

    @Override // android.widget.ExpandableListAdapter
    public Object getChild(int i, int i2) {
        if (!njy.e(this.f28292b, i) && this.f28292b.get(i2).b() > i2) {
            return this.f28292b.get(i).d(i2);
        }
        return null;
    }

    @Override // android.widget.ExpandableListAdapter
    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        d dVar;
        if (view == null || (!this.g && !(view.getTag() instanceof d))) {
            dVar = new d();
            view = LayoutInflater.from(this.d).inflate(R.layout.layout_sport_history_father_item, (ViewGroup) null);
            d(view, dVar);
            view.setTag(dVar);
        } else {
            dVar = (d) view.getTag();
        }
        if (!njy.e(this.f28292b, i) && !e(i, z, dVar, this.f28292b.get(i).j()) && this.j == 1) {
            dVar.f.setVisibility(8);
            view.findViewById(R.id.hw_show_health_data_running_history_father_line).setVisibility(8);
        }
        return view;
    }

    private boolean e(int i, boolean z, d dVar, int i2) {
        if (njy.e(this.f28292b, i)) {
            return true;
        }
        if (this.f28293c == 0) {
            dVar.j.setVisibility(0);
            c(dVar, i);
        } else {
            dVar.j.setVisibility(8);
        }
        if (z) {
            dVar.f.setBackgroundResource(R.drawable.history_father_item_bg);
        } else {
            dVar.f.setBackgroundResource(R.drawable.history_father_item_close_bg);
        }
        if (dVar.j.getExpandStatus()) {
            dVar.d.setText(this.d.getResources().getString(R.string.IDS_device_health_retract));
            dVar.f28300b.setBackgroundResource(R.drawable.ic_health_list_drop_down_arrow_sel);
        } else {
            dVar.d.setText(this.d.getResources().getString(R.string.IDS_user_profile_more_new));
            dVar.f28300b.setBackgroundResource(R.drawable.ic_health_list_drop_down_arrow_nor);
        }
        dVar.f28301c.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.history.adapter.SportHistoryExpandableListAdapter.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (view != null) {
                    SportHistoryExpandableListAdapter.this.c(view);
                } else {
                    LogUtil.e("Track_SportHistoryExpandableListAdapter", "view is null");
                }
            }
        });
        if (i >= this.f28292b.size()) {
            LogUtil.j("Track_SportHistoryExpandableListAdapter", "groupPostition is is more than groupData size");
            return true;
        }
        a(z, dVar, i2);
        dVar.f28299a.setText(this.f28292b.get(i).i());
        c(i, dVar);
        lrd.b(dVar.h, qre.a(R.string.accessibility_sport_record_summary_month, dVar.f28299a.getText(), dVar.i.getText()), z);
        return false;
    }

    private void c(int i, d dVar) {
        if (njy.e(this.f28292b, i)) {
            LogUtil.e("Track_SportHistoryExpandableListAdapter", Integer.valueOf(i), "isOutOfBounds ");
        } else {
            dVar.i.setText(d(this.f28292b.get(i)));
        }
    }

    public String d(vqu vquVar) {
        String string;
        if (vquVar == null) {
            return "";
        }
        int iG = this.f28293c;
        if (iG == 0 && vquVar.k()) {
            iG = vquVar.g();
        }
        if (this.f28293c == 0 && vquVar.k() && iG == 287) {
            return vquVar.b(false);
        }
        if (iG == 287) {
            return vquVar.b(true);
        }
        String strC = c(vquVar);
        String strA = a(vquVar);
        double dE = e(vquVar);
        String strC2 = c(vquVar, iG);
        if (jqq.e(this.f28293c) || jqq.e(vquVar.g())) {
            string = this.d.getResources().getString(R.string.IDS_history_desc_four, strC2, a(dE), strC, strA);
        } else {
            string = this.d.getResources().getString(R.string.IDS_history_desc_three, a(dE), strC, strA);
        }
        return string.trim();
    }

    private String c(vqu vquVar, int i) {
        double dE = vquVar.e(i) / 1000.0d;
        if (h(dE)) {
            return "";
        }
        if (UnitUtil.f()) {
            return qre.e(R.plurals.IDS_indoor_run_mi, (int) dE, UnitUtil.e(UnitUtil.e(dE, 3), 1, 2));
        }
        return qre.e(R.plurals.IDS_indoor_run_km, (int) dE, UnitUtil.e(dE, 1, 2));
    }

    private double e(vqu vquVar) {
        return ((vquVar.b(this.f28293c) - ((double) ((int) vquVar.d(289, 4)))) - ((double) ((int) vquVar.d(288, 4)))) / 1000.0d;
    }

    private String c(vqu vquVar) {
        int iD;
        int iD2;
        int iF = vquVar.f();
        if (this.f28293c == 0) {
            iD2 = (int) vquVar.d(289, 5);
            iD = (int) vquVar.d(288, 5);
        } else {
            iD = 0;
            iD2 = 0;
        }
        int i = (iF - iD2) - iD;
        double d2 = i;
        if (h(d2)) {
            return "";
        }
        return this.d.getResources().getQuantityString(R.plurals.IDS_details_sleep_latency_times, i, UnitUtil.e(d2, 1, 0));
    }

    private String a(vqu vquVar) {
        double dC = vquVar.c(this.f28293c) / 1000.0d;
        if (h(dC)) {
            return "";
        }
        return qre.e(R.plurals.IDS_track_total_calorie_kcals, (int) dC, UnitUtil.e(dC, 1, 0));
    }

    private String a(double d2) {
        if (h(d2)) {
            return "";
        }
        return der.d(d2);
    }

    private void a(boolean z, d dVar, int i) {
        if (z) {
            dVar.e.setBackgroundResource(R.drawable.ic_health_list_drop_down_arrow_sel);
            dVar.f28301c.setVisibility(0);
        } else {
            dVar.f28301c.setVisibility(8);
            dVar.e.setBackgroundResource(R.drawable.ic_health_list_drop_down_arrow_nor);
        }
        if (i <= 6) {
            dVar.f28301c.setVisibility(8);
        }
    }

    private void d(View view, d dVar) {
        dVar.f28299a = (HealthTextView) view.findViewById(R.id.hw_show_health_data_running_history_father_date);
        dVar.e = (ImageView) view.findViewById(R.id.hw_show_health_data_running_history_father_arrow);
        dVar.i = (HealthTextView) view.findViewById(R.id.hw_show_health_father_summary_time);
        dVar.j = (MonthTitleContainer) view.findViewById(R.id.month_history_title);
        dVar.f = (LinearLayout) view.findViewById(R.id.history_father_layout);
        dVar.h = (LinearLayout) view.findViewById(R.id.first_item_title);
        dVar.g = (LinearLayout) view.findViewById(R.id.month_sport_summary_layout);
        dVar.g.setOnClickListener(null);
        dVar.j.setOnTouchListener(new View.OnTouchListener() { // from class: com.huawei.ui.main.stories.history.adapter.SportHistoryExpandableListAdapter.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view2, MotionEvent motionEvent) {
                return true;
            }
        });
        dVar.f28301c = (LinearLayout) view.findViewById(R.id.inner_center_layout);
        dVar.f28300b = (ImageView) view.findViewById(R.id.expand_arrow);
        dVar.d = (HealthTextView) view.findViewById(R.id.collapse_or_expand_text);
        view.setPadding(0, 0, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(View view) {
        MonthTitleContainer monthTitleContainer = (MonthTitleContainer) ((View) view.getParent()).findViewById(R.id.month_history_title);
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.collapse_or_expand_text);
        ImageView imageView = (ImageView) view.findViewById(R.id.expand_arrow);
        if (monthTitleContainer.getExpandStatus()) {
            monthTitleContainer.setExpandStatus(false);
            monthTitleContainer.requestLayout();
            healthTextView.setText(this.d.getResources().getString(R.string.IDS_user_profile_more_new));
            imageView.setBackgroundResource(R.drawable.ic_health_list_drop_down_arrow_nor);
            return;
        }
        monthTitleContainer.setExpandStatus(true);
        monthTitleContainer.requestLayout();
        healthTextView.setText(this.d.getResources().getString(R.string.IDS_device_health_retract));
        imageView.setBackgroundResource(R.drawable.ic_health_list_drop_down_arrow_sel);
    }

    private void c(d dVar, int i) {
        Context context;
        if (!njy.c(this.f28292b, i) || this.f28292b.get(i) == null || (context = this.d) == null) {
            return;
        }
        a aVar = new a(context, this.f28292b.get(i));
        if (this.f28293c == 0) {
            aVar.c(dVar.j, true, this.d.getResources().getDimensionPixelSize(R.dimen.maxPaddingStart));
        } else {
            aVar.c(dVar.j, false, this.d.getResources().getDimensionPixelSize(R.dimen.maxPaddingStart));
        }
    }

    private String c(int i) {
        return der.d(i, 0);
    }

    @Override // android.widget.ExpandableListAdapter
    public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        e eVar;
        if (view == null) {
            e eVar2 = new e();
            View viewInflate = LayoutInflater.from(this.d).inflate(R.layout.layout_sport_history_child_item, (ViewGroup) null);
            e(eVar2, viewInflate);
            viewInflate.setTag(eVar2);
            eVar = eVar2;
            view = viewInflate;
        } else {
            eVar = (e) view.getTag();
        }
        if (njy.e(this.f28292b, i)) {
            LogUtil.j("Track_SportHistoryExpandableListAdapter", "groupPostion is outOfBounds mGroupData");
            return view;
        }
        if (this.f28292b.get(i) == null) {
            LogUtil.j("Track_SportHistoryExpandableListAdapter", "groupData is null");
            return view;
        }
        vrb vrbVarD = this.f28292b.get(i).d(i2);
        if (vrbVarD == null) {
            LogUtil.j("Track_SportHistoryExpandableListAdapter", "child is null'");
            return view;
        }
        String strE = vrg.e(vrbVarD.y(), this.d);
        if (!TextUtils.isEmpty(vrbVarD.t()) && "7".equals(vrbVarD.t())) {
            strE = this.d.getResources().getString(R.string.IDS_lactate_threshold_measurement);
        }
        eVar.o.setText(strE);
        eVar.o.setCompoundDrawablePadding(0);
        eVar.o.setCompoundDrawables(null, null, null, null);
        b(eVar, vrbVarD);
        e(z, eVar, vrbVarD);
        b(i2, eVar);
        y(eVar, vrbVarD);
        return view;
    }

    private void e(boolean z, e eVar, vrb vrbVar) {
        if (vrbVar.ah()) {
            a(z, eVar.h, R.drawable.history_child_item_bottom_check_bg, R.drawable.history_child_item_normal_check_bg);
        } else {
            a(z, eVar.h, R.drawable.history_child_item_bottom_bg, R.drawable.history_child_item_normal_bg);
        }
    }

    private void b(int i, e eVar) {
        int dimension = (int) this.d.getResources().getDimension(R.dimen.defaultPaddingStart);
        if (this.j == 1) {
            eVar.j.setPadding((int) this.d.getResources().getDimension(R.dimen.emui_card_device_56dp), 0, 0, 0);
            dimension = 0;
        }
        if (i == 0) {
            eVar.j.setVisibility(8);
            eVar.h.setPadding(dimension, (int) this.d.getResources().getDimension(R.dimen.elementsMarginHorizontalM), dimension, (int) this.d.getResources().getDimension(R.dimen.defaultPaddingEnd));
        } else {
            eVar.j.setVisibility(0);
            eVar.h.setPadding(dimension, (int) this.d.getResources().getDimension(R.dimen.defaultPaddingStart), dimension, (int) this.d.getResources().getDimension(R.dimen.defaultPaddingEnd));
        }
    }

    public void a(boolean z, View view, int i, int i2) {
        if (this.j == 1) {
            return;
        }
        if (z) {
            view.setBackground(ContextCompat.getDrawable(this.d, i));
        } else {
            view.setBackground(ContextCompat.getDrawable(this.d, i2));
        }
    }

    private void y(e eVar, vrb vrbVar) {
        if (vrbVar.ai() == 7) {
            Drawable drawable = ContextCompat.getDrawable(this.d, R.drawable.ic_ai_small);
            if (LanguageUtil.ba(this.d)) {
                drawable = qqz.e(this.d, R.drawable.ic_ai_small);
            }
            if (drawable != null) {
                eVar.f28302a.setVisibility(0);
                eVar.f28302a.setBackground(drawable);
            }
        } else {
            eVar.f28302a.setVisibility(8);
        }
        if (vrbVar.a() == 0) {
            c(eVar, vrbVar);
        } else {
            eVar.e.setVisibility(0);
            eVar.e.setBackgroundResource(R.drawable.ic_sporthistory_abnormal_track);
        }
    }

    private void c(e eVar, vrb vrbVar) {
        if (vrbVar.f() == 1) {
            eVar.e.setBackgroundResource(R.drawable.ic_repetition);
            eVar.e.setVisibility(0);
        } else {
            eVar.e.setVisibility(8);
        }
    }

    private void e(e eVar, View view) {
        eVar.i = (LinearLayout) view.findViewById(R.id.hw_show_health_running_history_child_item_chief_sport_data_layout);
        eVar.g = (HealthTextView) view.findViewById(R.id.hw_show_health_running_history_child_item_chief_sport_data_text);
        eVar.f = (HealthTextView) view.findViewById(R.id.hw_show_health_running_history_child_item_chief_sport_data_unit);
        eVar.m = (HealthTextView) view.findViewById(R.id.hw_show_health_running_history_child_item_left_date_text);
        eVar.q = (HealthTextView) view.findViewById(R.id.hw_show_health_running_history_child_item_center_text);
        eVar.f28304c = (HealthTextView) view.findViewById(R.id.hw_show_health_running_history_child_item_right_text);
        eVar.n = (ImageView) view.findViewById(R.id.hw_show_health_running_history_child_item_left_img);
        eVar.l = (ImageView) view.findViewById(R.id.hw_show_health_running_history_child_item_left_bg);
        eVar.p = (ImageView) view.findViewById(R.id.hw_show_health_running_history_track_type_img);
        eVar.j = (HealthDivider) view.findViewById(R.id.hw_show_main_layout_sport_bottom_image_interval);
        eVar.h = (RelativeLayout) view.findViewById(R.id.hw_show_health_running_history_child_item_layout);
        eVar.t = (HealthTextView) view.findViewById(R.id.hw_show_health_running_history_child_item_date);
        eVar.o = (HealthTextView) view.findViewById(R.id.hw_show_health_running_history_child_item_chief_sport_type_text);
        if (LanguageUtil.aj(this.d)) {
            eVar.i.setLayoutDirection(1);
        }
        eVar.d = (HealthTextView) view.findViewById(R.id.hw_health_sport_item_accessory_sport_data_unit);
        eVar.f28303b = (ImageView) view.findViewById(R.id.hw_health_sport_history_child_3rd_icon);
        eVar.e = (ImageView) view.findViewById(R.id.hw_health_sport_history_child_abnormal_track);
        eVar.f28302a = (ImageView) view.findViewById(R.id.hw_health_sport_history_child_ai_track);
        eVar.k = (ImageView) view.findViewById(R.id.hw_show_health_running_history_workout_origin_img);
    }

    private void b(e eVar, vrb vrbVar) {
        if (eVar == null || vrbVar == null) {
            LogUtil.j("Track_SportHistoryExpandableListAdapter", "viewholder or data is null");
            return;
        }
        a(eVar);
        eVar.f.setVisibility(0);
        eVar.m.setText(e(0, vrbVar.w(), 1));
        eVar.q.setText(e(1, vrbVar.o(), 1));
        f(eVar, vrbVar);
        eVar.t.setText(e(2, vrbVar.w(), 1));
        int i = vrbVar.i();
        if (i == 0) {
            eVar.p.setVisibility(8);
        } else {
            eVar.p.setVisibility(0);
            b(eVar, vrbVar, i);
        }
        a(eVar, vrbVar);
        e(eVar, vrbVar);
        d(eVar, vrbVar);
    }

    private void d(e eVar, vrb vrbVar) {
        int iA = vrbVar.a(this.d);
        if (iA == 0) {
            eVar.f28303b.setVisibility(8);
            return;
        }
        eVar.f28303b.setVisibility(0);
        if (LanguageUtil.ba(this.d)) {
            Context context = this.d;
            eVar.f28303b.setBackground(qqz.e(context, ContextCompat.getDrawable(context, iA)));
            return;
        }
        eVar.f28303b.setBackgroundResource(iA);
    }

    private void f(e eVar, vrb vrbVar) {
        eVar.f28304c.setVisibility(0);
        eVar.d.setVisibility(0);
        eVar.q.setVisibility(0);
        if (vrbVar.b() == 0) {
            if (vrbVar.u() == 262 || vrbVar.u() == 266) {
                i(eVar, vrbVar);
            } else if (vrbVar.u() == 260) {
                h(eVar, vrbVar);
            } else if (vrbVar.ag() != null || !TextUtils.isEmpty(vrbVar.ae())) {
                a(vrbVar.ag(), eVar, vrbVar);
            } else {
                g(eVar, vrbVar);
            }
            eVar.d.setText(d(this.d, vrbVar, eVar));
        } else if (vrbVar.b() == 3) {
            n(eVar, vrbVar);
        } else if (vrbVar.b() == 4) {
            q(eVar, vrbVar);
        } else if (vrbVar.b() == 5) {
            j(eVar, vrbVar);
        } else if (vrbVar.b() == 6) {
            o(eVar, vrbVar);
        } else if (vrbVar.b() == 7) {
            r(eVar, vrbVar);
        } else if (vrbVar.b() == 8) {
            m(eVar, vrbVar);
        } else if (vrbVar.b() == 9) {
            t(eVar, vrbVar);
        } else if (vrbVar.b() == 10) {
            k(eVar, vrbVar);
        } else if (vrbVar.b() == 11) {
            p(eVar, vrbVar);
        } else {
            l(eVar, vrbVar);
        }
        if (TextUtils.isEmpty(vrbVar.ad())) {
            return;
        }
        eVar.o.setText(vrbVar.ad());
    }

    private void m(e eVar, vrb vrbVar) {
        String quantityString;
        double dE;
        LogUtil.a("Track_SportHistoryExpandableListAdapter", "setChiefDataTypeDiving");
        if (UnitUtil.f()) {
            quantityString = this.d.getResources().getQuantityString(R.plurals.IDS_altitude_ft, (int) UnitUtil.e(vrbVar.e(), 1), "");
        } else {
            quantityString = this.d.getResources().getQuantityString(R.plurals.IDS_altitude_meter, (int) vrbVar.e(), "");
        }
        if (vrbVar.u() == 291) {
            eVar.o.setText(der.e(vrbVar.af(), this.d));
        }
        if (UnitUtil.f()) {
            dE = UnitUtil.e(vrbVar.e(), 1);
        } else {
            dE = vrbVar.e();
        }
        String strD = der.d(dE, 1);
        eVar.f28304c.setText(this.d.getResources().getQuantityString(R.plurals.IDS_diving_times, (int) vrbVar.d(), UnitUtil.e((int) vrbVar.d(), 1, 0)));
        eVar.g.setText(strD);
        eVar.f.setText(quantityString);
        eVar.d.setText("");
    }

    private void t(e eVar, vrb vrbVar) {
        LogUtil.a("Track_SportHistoryExpandableListAdapter", "setChiefDataTypeTrain");
        if (vrbVar.d() == 0.0f) {
            eVar.q.setText(this.d.getResources().getQuantityString(R.plurals.IDS_Plugin_motion_track_heart_rate_unit, 0, this.f28291a));
        } else {
            eVar.q.setText(this.d.getResources().getQuantityString(R.plurals.IDS_Plugin_motion_track_heart_rate_unit, (int) vrbVar.d(), UnitUtil.e(vrbVar.d(), 1, 0)));
        }
        eVar.g.setText(e(1, vrbVar.o(), 1));
        eVar.f.setText("");
        eVar.d.setText("");
        eVar.f28304c.setText("");
    }

    private void r(e eVar, vrb vrbVar) {
        LogUtil.a("Track_SportHistoryExpandableListAdapter", "setChiefDataTypeSkipping");
        String strAe = vrbVar.ae();
        if (!TextUtils.isEmpty(strAe)) {
            eVar.o.setText(strAe);
        }
        eVar.f28304c.setText(UnitUtil.e((int) vrbVar.d(), 1, 0));
        eVar.g.setText(UnitUtil.e((int) vrbVar.e(), 1, 0));
        eVar.f.setText(this.d.getResources().getQuantityString(R.plurals.IDS_indoor_skipper_number_unit_value, (int) vrbVar.e(), ""));
        eVar.d.setText(this.d.getResources().getText(R.string.IDS_indoor_skipper_number_minute));
    }

    private void a(String str, e eVar, vrb vrbVar) {
        String strD = jaa.d(this.d, str, vrbVar.ae());
        if (TextUtils.isEmpty(strD)) {
            LogUtil.j("Track_SportHistoryExpandableListAdapter", "courseName is null,courseId= ", str);
            g(eVar, vrbVar);
            return;
        }
        eVar.o.setText(strD);
        eVar.f.setText(der.d(this.d, vrbVar.e()));
        eVar.g.setText(b(vrbVar.y(), 0, ((double) vrbVar.e()) / 1000.0d, 1));
        eVar.d.setVisibility(8);
        eVar.f28304c.setVisibility(8);
        if (this.f28293c == 10001) {
            return;
        }
        eVar.f28304c.setVisibility(0);
        eVar.d.setVisibility(0);
        if (!e(vrbVar.u())) {
            eVar.f28304c.setText(b(vrbVar.y(), 1, vrbVar.d(), 1));
        } else if (vrbVar.d() != 0.0f) {
            eVar.f28304c.setText(b(vrbVar.y(), 5, (1.0f / vrbVar.d()) * 3600.0f, 1));
        } else {
            eVar.f28304c.setText(this.f28291a);
        }
    }

    private void b(e eVar, vrb vrbVar, int i) {
        Drawable drawable = this.d.getResources().getDrawable(i);
        if (i != R.drawable.ic_health_history_autotrack && i != R.drawable.ic_sporthistory_nike && i != R.drawable.ic_sporthistory_huawei_wear && i != R.drawable.list_ic_custom) {
            eVar.p.setBackground(qqf.c(drawable, this.d.getResources().getColor(R.color.healthTintColorPrimary)));
        } else {
            eVar.p.setBackgroundResource(i);
        }
    }

    private void a(e eVar, vrb vrbVar) {
        LogUtil.a("Track_SportHistoryExpandableListAdapter", " workOutOriginType：", Integer.valueOf(vrbVar.ac()));
        if (vrbVar.ac() == 221) {
            eVar.k.setVisibility(0);
        } else {
            eVar.k.setVisibility(8);
        }
    }

    private void e(e eVar, vrb vrbVar) {
        Drawable drawableD = vrbVar.d(this.d);
        Drawable drawableB = der.b(this.d, drawableD, vrbVar.y());
        if (vrbVar.y() != 512) {
            drawableD = qqf.c(drawableD, this.d.getColor(R.color.common_color_white));
        }
        int iB = vrbVar.b(this.d);
        if (iB == 0) {
            iB = this.d.getColor(R.color.common_colorAccent);
        }
        Drawable drawableC = qqf.c(this.d.getDrawable(R.drawable.icon_bg), iB);
        if (!TextUtils.isEmpty(vrbVar.t()) && "7".equals(vrbVar.t())) {
            drawableB = this.d.getDrawable(R.drawable.ic_list_lactic);
            drawableD = drawableB;
        }
        if (vrbVar.y() != 512) {
            der.c(eVar.n, drawableB, drawableD);
            eVar.n.setVisibility(0);
            eVar.l.setBackground(drawableC);
        } else {
            eVar.n.setVisibility(8);
            der.c(eVar.l, drawableB, drawableD);
        }
    }

    private void k(e eVar, vrb vrbVar) {
        LogUtil.a("Track_SportHistoryExpandableListAdapter", "setChiefDataTypePaddle");
        eVar.g.setText(b(vrbVar.y(), 2, vrbVar.e(), 1));
        eVar.f.setText(this.d.getString(R.string.IDS_track_num_total_calorie_kcal, ""));
        eVar.f28304c.setText(UnitUtil.e((int) vrbVar.d(), 1, 0));
        eVar.d.setText(this.d.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_sport_data_time, (int) vrbVar.d()));
    }

    private void p(e eVar, vrb vrbVar) {
        LogUtil.a("Track_SportHistoryExpandableListAdapter", "setChiefDataTypeTime");
        eVar.g.setText(izn.c((long) vrbVar.e(), R.style.sport_day_hour_min_num_20dp, R.style.sport_day_hour_min_unit));
        eVar.f.setVisibility(8);
        eVar.f28304c.setText(b(vrbVar.y(), 0, ((double) vrbVar.d()) / 1000.0d, 1));
        eVar.d.setText(der.d(this.d, vrbVar.d()));
        eVar.q.setVisibility(8);
    }

    private void l(e eVar, vrb vrbVar) {
        if (vrbVar.y() == 290) {
            s(eVar, vrbVar);
            return;
        }
        eVar.g.setText(b(vrbVar.y(), 2, vrbVar.e(), 1));
        eVar.f.setText(this.d.getString(R.string.IDS_track_num_total_calorie_kcal, ""));
        if (vrbVar.b() == 1) {
            eVar.f28304c.setText(b(vrbVar.y(), 3, vrbVar.d(), 1));
            eVar.d.setText(R.string.IDS_main_watch_heart_rate_unit_string);
        } else if (vrbVar.b() != 2) {
            LogUtil.j("Track_SportHistoryExpandableListAdapter", "not has setChiefDataTypeOthers", Integer.valueOf(vrbVar.b()));
        } else {
            eVar.f28304c.setVisibility(4);
            eVar.d.setVisibility(4);
        }
    }

    private void q(e eVar, vrb vrbVar) {
        if (vrbVar.d() != 0.0f) {
            eVar.f28304c.setText(b(vrbVar.y(), 2, vrbVar.c(), 1));
        } else {
            eVar.f28304c.setText(this.f28291a);
        }
        eVar.d.setText(this.d.getString(R.string.IDS_band_data_sport_energy_unit));
        eVar.g.setText(g(vrbVar.e()));
        eVar.f.setText(der.d(this.d, vrbVar.e()));
    }

    private void j(e eVar, vrb vrbVar) {
        String str;
        eVar.f28304c.setText(UnitUtil.e((int) vrbVar.d(), 1, 0));
        String string = this.d.getString(R.string.IDS_aw_version2_show_score);
        String string2 = this.d.getString(R.string.IDS_aw_version2_basketball);
        if (LanguageUtil.c(this.d)) {
            str = String.format(this.d.getString(R.string.IDS_sport_history_run_course_name), string, string2);
        } else {
            str = String.format(this.d.getString(R.string.IDS_sport_history_run_course_name), string2, string);
        }
        eVar.o.setText(str);
        eVar.g.setText(UnitUtil.e((int) vrbVar.e(), 1, 0));
        eVar.f.setText(String.format(this.d.getResources().getQuantityString(R.plurals.IDS_sleep_referece_title_score_string, (int) vrbVar.e()), ""));
        eVar.d.setText(this.d.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_sport_data_time, (int) vrbVar.d()));
    }

    private void o(e eVar, vrb vrbVar) {
        eVar.g.setText(der.d(vrbVar.e(), 0));
        if (vrbVar.y() == 286) {
            String strL = vrbVar.l();
            if (StringUtils.a(strL)) {
                strL = der.d(Double.parseDouble(strL), 0);
            }
            eVar.g.setText(String.format(Locale.ROOT, "%s(%s)", der.d(vrbVar.e(), 0), strL));
            LogUtil.a("Track_SportHistoryExpandableListAdapter", "golfCourse ChiefDataValue :" + vrbVar.e() + ", golfCourse ParValue :" + vrbVar.l());
        }
        eVar.f.setText(this.d.getResources().getQuantityString(R.plurals.IDS_band_data_golf_count_unit, (int) vrbVar.e(), ""));
        eVar.f28304c.setText(b(vrbVar.y(), 2, vrbVar.c(), 1));
        eVar.d.setText(this.d.getString(R.string.IDS_band_data_sport_energy_unit));
        String strK = vrbVar.k();
        if (TextUtils.isEmpty(strK)) {
            return;
        }
        eVar.o.setText(strK);
    }

    private void s(e eVar, vrb vrbVar) {
        String strAd = vrbVar.ad();
        if (TextUtils.isEmpty(strAd)) {
            strAd = jaa.d(this.d, vrbVar.y());
        }
        eVar.o.setText(strAd);
        eVar.f28304c.setVisibility(8);
        eVar.d.setVisibility(8);
        eVar.f.setText(this.d.getString(R.string.IDS_track_num_total_calorie_kcal, ""));
        eVar.g.setText(b(vrbVar.y(), 2, vrbVar.e(), 1));
    }

    private void n(e eVar, vrb vrbVar) {
        Drawable drawable;
        eVar.o.setText(vrbVar.ab());
        if ((vrbVar.s() == 1 || vrbVar.s() == 2) && (drawable = ContextCompat.getDrawable(this.d, R.drawable.ai_course_grey_tag)) != null) {
            drawable.setBounds(0, 0, qrs.d(this.d, 19.0f), qrs.d(this.d, 13.0f));
            eVar.o.setCompoundDrawablePadding(qrs.d(this.d, 8.0f));
            eVar.o.setCompoundDrawables(null, null, drawable, null);
        }
        eVar.f28304c.setVisibility(8);
        eVar.d.setVisibility(8);
        eVar.f.setText(this.d.getString(R.string.IDS_track_num_total_calorie_kcal, ""));
        eVar.g.setText(b(vrbVar.y(), 2, vrbVar.e(), 1));
    }

    private void g(e eVar, vrb vrbVar) {
        eVar.g.setText(b(vrbVar.y(), 0, ((double) vrbVar.e()) / 1000.0d, 1));
        eVar.f.setText(der.d(this.d, vrbVar.e()));
        if (!e(vrbVar.u())) {
            eVar.f28304c.setText(b(vrbVar.y(), 1, vrbVar.d(), 1));
            return;
        }
        if (vrbVar.d() != 0.0f) {
            if (nub.e(vrbVar.u())) {
                eVar.f28304c.setText(b(vrbVar.y(), 5, vrbVar.d(), 1));
                return;
            } else {
                eVar.f28304c.setText(b(vrbVar.y(), 5, (1.0f / vrbVar.d()) * 3600.0f, 1));
                return;
            }
        }
        eVar.f28304c.setText(this.f28291a);
    }

    private void h(e eVar, vrb vrbVar) {
        eVar.g.setText(b(vrbVar.y(), 0, ((double) vrbVar.e()) / 1000.0d, 1));
        eVar.f.setText(der.d(this.d, vrbVar.e()));
        if (vrbVar.e() <= 0.0f) {
            eVar.g.setText(this.f28291a);
        }
        if (vrbVar.d() <= 0.0f) {
            eVar.f28304c.setText(this.f28291a);
        } else {
            eVar.f28304c.setText(d(vrbVar.d()));
        }
    }

    private void i(e eVar, vrb vrbVar) {
        eVar.g.setText(b(vrbVar.e()));
        eVar.f.setText(b(this.d, (int) vrbVar.e()));
        if (vrbVar.e() < 1.0f) {
            eVar.g.setText(this.f28291a);
        }
        eVar.f28304c.setText(c(vrbVar.d()));
    }

    private boolean e(int i) {
        return i == 259 || i == 265 || i == 273 || nub.c(i);
    }

    private void a(e eVar) {
        if (eVar.f28304c.getVisibility() == 4) {
            eVar.f28304c.setVisibility(0);
            eVar.d.setVisibility(0);
        }
        if (eVar.e.getVisibility() == 4) {
            eVar.e.setVisibility(0);
        }
        if (eVar.f28302a.getVisibility() == 4) {
            eVar.f28302a.setVisibility(0);
        }
        if (eVar.p.getVisibility() == 4) {
            eVar.p.setVisibility(0);
        }
    }

    private String b(int i, int i2, double d2, int i3) {
        String strC = c(i2, d2, i3);
        if (strC != null) {
            return strC;
        }
        switch (i2) {
            case 0:
            case 10:
                return e(d2);
            case 1:
                if (d2 > 360000.0d || d2 <= 3.6d) {
                    return this.f28291a;
                }
                return izn.a((float) nkw.e(i, true, 3, d2));
            case 2:
                return der.d(d2 / 1000.0d, 0);
            case 3:
                return der.d(d2, 0);
            case 4:
            case 6:
            case 8:
            case 9:
            case 11:
                return der.b(d2);
            case 5:
                return UnitUtil.e(nkw.d(false, 3, d2), 1, 2);
            case 7:
                return c((int) d2);
            default:
                return this.f28291a;
        }
    }

    private String e(double d2) {
        if (!UnitUtil.f()) {
            if (d2 < 0.005d) {
                return this.f28291a;
            }
            if (this.f28293c == 262) {
                return der.d(d2, 0);
            }
            return der.d(d2, 2);
        }
        if (this.f28293c == 262) {
            double dE = UnitUtil.e(d2, 2);
            if (dE < 0.005d) {
                return this.f28291a;
            }
            return der.d(dE, 0);
        }
        double dE2 = UnitUtil.e(d2, 3);
        if (dE2 < 0.005d) {
            return this.f28291a;
        }
        return der.d(dE2, 2);
    }

    private String c(int i, double d2, int i2) {
        if (d2 != 0.0d && !der.e(d2)) {
            return null;
        }
        if (i2 == 1) {
            return this.f28291a;
        }
        if (i == 0 && this.f28293c != 262) {
            return UnitUtil.e(0.0d, 1, 2);
        }
        return UnitUtil.e(0.0d, 1, 0);
    }

    private String b(double d2) {
        if (UnitUtil.f()) {
            return der.d(UnitUtil.e(d2, 2), 0);
        }
        return der.d(d2, 0);
    }

    private String g(double d2) {
        if (!UnitUtil.f()) {
            if (d2 < 0.005d) {
                return this.f28291a;
            }
            return der.d(d2 / 1000.0d, 2);
        }
        double dE = UnitUtil.e(d2 / 1000.0d, 3);
        if (dE < 0.005d) {
            return this.f28291a;
        }
        return der.d(dE, 2);
    }

    private String d(double d2) {
        if (UnitUtil.f()) {
            return der.d(UnitUtil.e(d2, 1), 2);
        }
        return der.d(d2, 1);
    }

    private String b(Context context, int i) {
        if (context == null) {
            LogUtil.j("Track_SportHistoryExpandableListAdapter", "acquireSumFitUnit  and context is null");
            return " ";
        }
        if (UnitUtil.f()) {
            return " " + context.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_unit_yd, i);
        }
        return context.getResources().getQuantityString(R.plurals.IDS_altitude_meter, i, "");
    }

    private String c(double d2) {
        float fC = ((float) d2) / 10.0f;
        double d3 = fC;
        if (d3 > 360000.0d || d3 <= 3.6d) {
            return this.f28291a;
        }
        if (UnitUtil.f()) {
            fC = (float) UnitUtil.c(d3, 2);
        }
        return izn.a(fC);
    }

    private String e(int i, long j, int i2) {
        String strC = c(i, j, i2);
        if (strC != null) {
            return strC;
        }
        if (i == 0) {
            if (LanguageUtil.az(this.d) || LanguageUtil.bc(this.d)) {
                return new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), "HH:mm")).format(Long.valueOf(j));
            }
            return qrk.a(this.d, j, 1);
        }
        if (i == 1) {
            return UnitUtil.e((int) (j / 1000));
        }
        if (i == 2) {
            return DateUtils.formatDateTime(this.d, j, 24);
        }
        return this.f28291a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0034 A[FALL_THROUGH] */
    private String d(Context context, vrb vrbVar, e eVar) {
        int iU = vrbVar.u();
        if (iU != 226 && iU != 227) {
            if (iU != 262) {
                if (iU != 273) {
                    if (iU != 274) {
                        switch (iU) {
                            default:
                                switch (iU) {
                                    default:
                                        switch (iU) {
                                            case 257:
                                            case 258:
                                                break;
                                            case 259:
                                                break;
                                            case 260:
                                                return e(context);
                                            default:
                                                switch (iU) {
                                                    case 264:
                                                        break;
                                                    case OldToNewMotionPath.SPORT_TYPE_INDOOR_BIKE /* 265 */:
                                                        break;
                                                    case OldToNewMotionPath.SPORT_TYPE_OPEN_AREA_SWIM /* 266 */:
                                                        break;
                                                    default:
                                                        switch (iU) {
                                                            case OldToNewMotionPath.SPORT_TYPE_CROSS_COUNTRY_RACE /* 280 */:
                                                            case 281:
                                                            case 282:
                                                                break;
                                                            default:
                                                                return "";
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                    case 229:
                                    case 230:
                                    case 231:
                                    case 232:
                                    case 233:
                                        return e(context, eVar, vrbVar);
                                }
                            case 217:
                            case 218:
                            case 219:
                                return e(context, eVar, vrbVar);
                        }
                    } else {
                        return a(context);
                    }
                }
                return e(context, eVar, vrbVar);
            }
            return d(context);
        }
        return der.e(context);
    }

    private String e(Context context) {
        if (context == null) {
            LogUtil.j("Track_SportHistoryExpandableListAdapter", "acquireClimHillUnit and context is null");
            return "";
        }
        if (!UnitUtil.f()) {
            return context.getResources().getString(R.string.IDS_fitness_data_list_activity_meter_unit);
        }
        return context.getResources().getString(R.string.IDS_ft);
    }

    private String d(Context context) {
        if (context == null) {
            LogUtil.j("Track_SportHistoryExpandableListAdapter", "acquire Swim Unit and context is null");
            return "";
        }
        if (UnitUtil.f()) {
            return context.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_swim_pace_unit_mi, 100, 100);
        }
        return context.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_swim_pace_unit, 100, 100);
    }

    private String a(Context context) {
        if (context == null) {
            LogUtil.j("Track_SportHistoryExpandableListAdapter", "acquire Swim Unit and context is null");
            return "";
        }
        if (UnitUtil.f()) {
            return context.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_swim_pace_unit_mi, 100, 100);
        }
        return context.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_swim_pace_unit, 500, 500);
    }

    private String e(Context context, e eVar, vrb vrbVar) {
        double d2;
        if (context == null) {
            return "";
        }
        String string = eVar.f28304c.getText().toString();
        if (string.equals(this.f28291a)) {
            d2 = 0.0d;
        } else if (nub.e(vrbVar.u())) {
            d2 = nkw.d(false, 3, vrbVar.d());
        } else {
            d2 = nkw.d(false, 3, (1.0f / vrbVar.d()) * 3600.0f);
        }
        if (UnitUtil.f()) {
            eVar.f28304c.setText(qre.e(R.plurals.ie_motiontrack_show_sport_unit_mi_per_h, (int) d2, string));
            return "";
        }
        eVar.f28304c.setText(qre.e(R.plurals.IDS_motiontrack_detail_average_speed, (int) d2, string));
        return "";
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthTextView f28299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ImageView f28300b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private LinearLayout f28301c;
        private HealthTextView d;
        private ImageView e;
        private LinearLayout f;
        private LinearLayout g;
        private LinearLayout h;
        private HealthTextView i;
        private MonthTitleContainer j;
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ImageView f28302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ImageView f28303b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f28304c;
        private HealthTextView d;
        private ImageView e;
        private HealthTextView f;
        private HealthTextView g;
        private RelativeLayout h;
        private LinearLayout i;
        private HealthDivider j;
        private ImageView k;
        private ImageView l;
        private HealthTextView m;
        private ImageView n;
        private HealthTextView o;
        private ImageView p;
        private HealthTextView q;
        private HealthTextView t;
    }

    class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<MonthTitleItem.d> f28296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Context f28297b;
        private vqu d;

        private a(Context context, vqu vquVar) {
            this.f28297b = context;
            this.d = vquVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(MonthTitleContainer monthTitleContainer, boolean z, int i) {
            if (SportHistoryExpandableListAdapter.this.f28292b == null) {
                LogUtil.a("SportHistoryTitleDrawer", "drawMonthHistoryTitle ", "mGroupData is null");
                return;
            }
            List<MonthTitleItem.d> list = this.f28296a;
            if (list == null) {
                this.f28296a = new ArrayList(16);
            } else {
                list.clear();
            }
            if (!z) {
                c(SportHistoryExpandableListAdapter.this.f28293c, false);
            } else {
                b(monthTitleContainer);
            }
            c(monthTitleContainer, i);
        }

        private void b(MonthTitleContainer monthTitleContainer) {
            List<String> listC = this.d.c();
            if (listC == null) {
                LogUtil.e("SportHistoryTitleDrawer", "allRequestString is null");
                return;
            }
            listC.remove("Track_Count_Sum");
            if (listC.size() == 0) {
                LogUtil.e("SportHistoryTitleDrawer", "allRequestString is null");
                return;
            }
            List<HwSportTypeInfo> listB = jry.a(this.f28297b).b(listC);
            if (njy.e(listB)) {
                monthTitleContainer.setVisibility(8);
                LogUtil.e("SportHistoryTitleDrawer", "buildAllCategoryItems requestInfo == null ");
                return;
            }
            e(listC, listB);
            boolean z = true;
            boolean z2 = true;
            boolean z3 = true;
            for (HwSportTypeInfo hwSportTypeInfo : listB) {
                if (hwSportTypeInfo.getSportTypeId() == 220 || hwSportTypeInfo.getSportTypeId() == 286) {
                    if (z) {
                        b(286);
                        z = false;
                    }
                } else if (hwSportTypeInfo.getSportTypeId() == 287 || hwSportTypeInfo.getSportTypeId() == 291) {
                    if (z2) {
                        b(287);
                        z2 = false;
                    }
                } else if (!nub.c(hwSportTypeInfo.getSportTypeId())) {
                    c(c(hwSportTypeInfo, listC), hwSportTypeInfo);
                } else if (z3) {
                    b(217);
                    z3 = false;
                }
            }
        }

        private void b(int i) {
            HwSportTypeInfo hwSportTypeInfoB = jry.a(this.f28297b).b(i);
            c(hwSportTypeInfoB.getHistoryList().mainPositionData(false), hwSportTypeInfoB);
        }

        private void e(List<String> list, List<HwSportTypeInfo> list2) {
            HwSportTypeInfo next;
            for (Integer num : SportHistoryExpandableListAdapter.e) {
                Iterator<HwSportTypeInfo> it = list2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!num.equals(Integer.valueOf(next.getSportTypeId())));
                if (next != null && list.contains(vrg.e(num.intValue(), 5)) && list.contains(vrg.e(num.intValue(), 4))) {
                    list2.remove(list2.lastIndexOf(next));
                }
            }
        }

        private void c(String str, HwSportTypeInfo hwSportTypeInfo) {
            MonthTitleItem.d dVarA = vps.a(str, this.d.e(), hwSportTypeInfo, this.f28297b);
            if (dVarA == null) {
                LogUtil.j("SportHistoryTitleDrawer", "buildItem itemData is null");
            } else {
                this.f28296a.add(dVarA);
            }
        }

        private void c(int i, boolean z) {
            jry jryVarA = jry.a(this.f28297b);
            LogUtil.a("SportHistoryTitleDrawer", " mSportType= ", Integer.valueOf(i));
            HwSportTypeInfo hwSportTypeInfoB = jryVarA.b(i);
            if (hwSportTypeInfoB == null) {
                LogUtil.e("SportHistoryTitleDrawer", " hwSportTypeInfo == null ");
                return;
            }
            ArrayList<String> allMonthlyType = hwSportTypeInfoB.getHistoryList().getAllMonthlyType();
            if (allMonthlyType == null) {
                LogUtil.e("SportHistoryTitleDrawer", " config == null ");
                return;
            }
            for (int i2 = 0; i2 < 3 && i2 < allMonthlyType.size(); i2++) {
                if (allMonthlyType.get(i2) != null) {
                    if (z) {
                        c(b(allMonthlyType.get(i2)), hwSportTypeInfoB);
                    } else if (!allMonthlyType.get(i2).equals(HealthDataStatPolicy.COUNT) || hwSportTypeInfoB.getSportTypeId() != 287) {
                        c(c(allMonthlyType.get(i2)), hwSportTypeInfoB);
                    }
                }
            }
        }

        private String b(String str) {
            return "METER_DISTANCE".equals(str) ? e() : str;
        }

        private String c(HwSportTypeInfo hwSportTypeInfo, List<String> list) {
            if (hwSportTypeInfo != null) {
                if (SportHistoryExpandableListAdapter.this.a(list, hwSportTypeInfo.getSportTypeId())) {
                    return HealthDataStatPolicy.COUNT;
                }
                if (hwSportTypeInfo.getSportTypeId() == 262) {
                    return e();
                }
                if (njy.e(hwSportTypeInfo.getHistoryList().getMonthlyStatisticsData())) {
                    return PlayInfo.KEY_DURATION;
                }
                return hwSportTypeInfo.getHistoryList().mainPositionData(false);
            }
            return PlayInfo.KEY_DURATION;
        }

        private String e() {
            if (izn.a(this.d.o()) && this.d.m() > 0) {
                return PlayInfo.KEY_DURATION;
            }
            return "METER_DISTANCE";
        }

        private String c(String str) {
            if ("METER_DISTANCE".equals(str)) {
                return (!izn.a(this.d.o()) || this.d.m() <= 0) ? "FIRST_METER_DISTANCE" : "FIRST_DURATION";
            }
            if (PlayInfo.KEY_DURATION.equals(str)) {
                return "FIRST_DURATION";
            }
            if ("DISTANCE".equals(str)) {
                return "FIRST_DISTANCE";
            }
            return "BASKETBALL_COUNT".equals(str) ? "TIME" : str;
        }

        private void c(MonthTitleContainer monthTitleContainer, int i) {
            if (njy.e(this.f28296a)) {
                LogUtil.a("SportHistoryTitleDrawer", "fillTitleContainer mItemDataList is null");
                return;
            }
            if (monthTitleContainer == null) {
                LogUtil.a("SportHistoryTitleDrawer", "fillTitleContainer container is null");
                return;
            }
            monthTitleContainer.removeAllViews();
            Object systemService = this.f28297b.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
            if (!(systemService instanceof WindowManager)) {
                LogUtil.e("SportHistoryTitleDrawer", "object is invalid type");
                return;
            }
            int size = this.f28296a.size();
            monthTitleContainer.e(3);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(((((WindowManager) systemService).getDefaultDisplay().getWidth() - (i * 2)) - (((Integer) BaseActivity.getSafeRegionWidth().first).intValue() * 2)) / 3, -2);
            layoutParams.gravity = 7;
            MonthTitleItem monthTitleItem = new MonthTitleItem(this.f28297b);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int iB = monthTitleItem.b(iMakeMeasureSpec, iMakeMeasureSpec);
            for (int i2 = 0; i2 < size; i2++) {
                MonthTitleItem monthTitleItem2 = new MonthTitleItem(this.f28297b);
                monthTitleItem2.setLinearLayoutParams(layoutParams);
                MonthTitleItem.d dVar = this.f28296a.get(i2);
                monthTitleItem2.setValueUnitMaxLine(2);
                monthTitleItem2.setItemView(dVar);
                monthTitleItem2.setValueMinHeight(iB);
                monthTitleItem2.setValueGravity(80);
                monthTitleContainer.addView(monthTitleItem2);
                if (SportHistoryExpandableListAdapter.this.b(3, i2, this.f28296a)) {
                    monthTitleContainer.addView(SportHistoryExpandableListAdapter.this.a(19));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(List<String> list, int i) {
        return e.contains(Integer.valueOf(i)) && list.contains(vrg.e(i, 5)) && !list.contains(vrg.e(i, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(int i, int i2, List<MonthTitleItem.d> list) {
        return ((i2 + 1) % i == 0 || i2 == list.size() - 1) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public LinearLayout a(int i) {
        ImageView imageView = new ImageView(this.d);
        float fI = qrs.i();
        imageView.setBackgroundColor(this.d.getResources().getColor(R.color.listDivider));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.d.getResources().getDimensionPixelSize(R.dimen.hw_show_public_size_0_5), (int) (this.d.getResources().getDimensionPixelSize(R.dimen.hw_show_public_margin_26dp) * fI));
        float f = i * fI;
        layoutParams.setMargins(0, qrs.d(this.d, f), 0, qrs.d(this.d, f));
        imageView.setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(this.d);
        linearLayout.addView(imageView);
        return linearLayout;
    }

    public void d(List<MonthTitleItem.d> list, LinearLayout linearLayout) {
        if (njy.e(list)) {
            LogUtil.a("Track_SportHistoryExpandableListAdapter", "fillTitleContainer mItemDataList is null");
            return;
        }
        if (linearLayout == null) {
            LogUtil.a("Track_SportHistoryExpandableListAdapter", "fillTitleContainer container is null");
            return;
        }
        linearLayout.removeAllViews();
        Object systemService = this.d.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        if (!(systemService instanceof WindowManager)) {
            LogUtil.e("Track_SportHistoryExpandableListAdapter", "object is invalid type");
            return;
        }
        int width = ((WindowManager) systemService).getDefaultDisplay().getWidth();
        int dimensionPixelSize = this.d.getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart);
        int size = list.size();
        int iIntValue = ((width - (dimensionPixelSize * 2)) - (((Integer) BaseActivity.getSafeRegionWidth().first).intValue() * 2)) / size;
        for (int i = 0; i < size; i++) {
            MonthTitleItem monthTitleItem = new MonthTitleItem(this.d);
            monthTitleItem.setLinearLayoutParams(new LinearLayout.LayoutParams(iIntValue, -2, 1.0f));
            MonthTitleItem.d dVar = njy.c(list, i) ? list.get(i) : null;
            monthTitleItem.setValueAutoTextSize(R.dimen.textSizeHeadline7);
            monthTitleItem.setValueAutoTextInfo(9, 1);
            monthTitleItem.setValueTypeFace(Typeface.createFromAsset(this.d.getAssets(), "font/HarmonyOSCondensedClockProportional-Medium.ttf"));
            monthTitleItem.setValueUnitMaxLine(2);
            monthTitleItem.setItemView(dVar);
            if (monthTitleItem.getValueUnitTextWidth() < iIntValue || qrs.y()) {
                monthTitleItem.setDefaultHeight(48);
            }
            monthTitleItem.setValueLineSpacing(false);
            linearLayout.addView(monthTitleItem);
            if (b(size, i, list)) {
                linearLayout.addView(a(11));
            }
        }
    }
}
