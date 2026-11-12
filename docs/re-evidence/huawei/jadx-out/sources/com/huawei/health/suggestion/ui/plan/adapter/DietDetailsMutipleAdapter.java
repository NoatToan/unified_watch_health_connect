package com.huawei.health.suggestion.ui.plan.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.plan.viewholder.AiPlanWeekDetailViewHolder;
import com.huawei.health.suggestion.util.JumpUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginoperation.util.DietKakaUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.hdc;
import defpackage.hdp;
import defpackage.hvq;
import defpackage.hvu;
import defpackage.iun;
import defpackage.lmf;
import defpackage.lsl;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qrs;
import defpackage.vfy;
import defpackage.vgo;
import defpackage.vgu;
import defpackage.vgw;
import health.compact.a.ReleaseLogUtil;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class DietDetailsMutipleAdapter extends BaseExpandableListAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private vgo f9608c;
    private AiPlanWeekDetailViewHolder d;
    private final Context f;
    private int h;
    private int j;
    private String k;
    private IntPlan l;
    private List<String> i = new ArrayList();
    private List<List<hdc>> g = new ArrayList();
    private List<Integer> o = Arrays.asList(10, 20, 30);
    private List<String> m = Arrays.asList(" 08:00:00", " 12:00:00", " 18:00:00");
    private HashMap<Integer, List<String>> n = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<Integer, Boolean> f9606a = new HashMap<>(16);
    private Handler e = new Handler();

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ImageView f9609a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        LinearLayout f9610b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthTextView f9611c;
        HealthTextView d;
        View e;
        HealthTextView h;
        HealthTextView i;
        ImageView j;
    }

    @Override // android.widget.ExpandableListAdapter
    public long getChildId(int i, int i2) {
        return i2;
    }

    @Override // android.widget.BaseExpandableListAdapter, android.widget.HeterogeneousExpandableList
    public int getChildTypeCount() {
        return 2;
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

    public DietDetailsMutipleAdapter(Context context) {
        this.f = context;
        g();
    }

    private void g() {
        Resources resources = this.f.getResources();
        this.f9607b = resources.getDimensionPixelSize(R.dimen.hw_show_public_size_4);
        this.h = resources.getDimensionPixelSize(R.dimen.hw_group_view_height_64dp);
        this.j = resources.getDimensionPixelSize(R.dimen.hw_show_public_size_56);
    }

    public void d(IntPlan intPlan, List<String> list, List<List<hdc>> list2, vgo vgoVar, AiPlanWeekDetailViewHolder aiPlanWeekDetailViewHolder, String str) {
        if ((list instanceof ArrayList) && (list2 instanceof ArrayList)) {
            Object objClone = ((ArrayList) list).clone();
            if (objClone instanceof ArrayList) {
                this.i = (List) objClone;
            }
            Object objClone2 = ((ArrayList) list2).clone();
            if (objClone2 instanceof ArrayList) {
                this.g = (List) objClone2;
            }
        }
        this.d = aiPlanWeekDetailViewHolder;
        this.k = str;
        this.l = intPlan;
        a(vgoVar);
    }

    private void a(vgo vgoVar) {
        this.n.clear();
        this.f9606a.clear();
        this.f9608c = vgoVar;
        if (vgoVar != null) {
            for (vgw vgwVar : vgoVar.a()) {
                for (vgu vguVar : vgwVar.c()) {
                    List<String> arrayList = this.n.get(Integer.valueOf(vgwVar.i()));
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(vguVar.e());
                    this.n.put(Integer.valueOf(vgwVar.i()), arrayList);
                }
            }
            for (int i = 0; i < this.g.size(); i++) {
                List<hdc> list = this.g.get(i);
                if (this.n.get(this.o.get(i)) == null || list.isEmpty()) {
                    this.f9606a.put(Integer.valueOf(i), false);
                } else {
                    int i2 = 0;
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        if (this.n.get(this.o.get(i)).contains(list.get(i3).c())) {
                            i2++;
                        }
                    }
                    if (i2 == list.size()) {
                        this.f9606a.put(Integer.valueOf(i), true);
                    }
                }
            }
        }
        LogUtil.d("DietDetailsAdapter", "recordFoodMap " + this.n.toString());
    }

    @Override // android.widget.ExpandableListAdapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public hdc getChild(int i, int i2) {
        if (njy.e(this.g, i) || njy.e(this.g.get(i), i2)) {
            return null;
        }
        return this.g.get(i).get(i2);
    }

    @Override // android.widget.ExpandableListAdapter
    public int getChildrenCount(int i) {
        List<List<hdc>> list = this.g;
        if (list != null && njy.c(list, i)) {
            return this.g.get(i).size() + 1;
        }
        return 0;
    }

    @Override // android.widget.BaseExpandableListAdapter, android.widget.HeterogeneousExpandableList
    public int getChildType(int i, int i2) {
        List<List<hdc>> list = this.g;
        return (list == null || list.get(i) == null || i2 != this.g.get(i).size()) ? 1 : 0;
    }

    @Override // android.widget.ExpandableListAdapter
    public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        LogUtil.a("DietDetailsAdapter", "groupPosition", Integer.valueOf(i), " getChildView childPosition ", Integer.valueOf(i2));
        if (i2 == this.g.get(i).size()) {
            if (view == null) {
                view = b();
            }
            Object tag = view.getTag();
            if (!(tag instanceof d)) {
                LogUtil.a("DietDetailsAdapter", "buttonHolder is not ChildButtonViewHolder " + view);
                return view;
            }
            c(i, (d) tag);
            return view;
        }
        View viewC = view == null ? c() : view;
        Object tag2 = viewC.getTag();
        if (tag2 instanceof b) {
            b bVar = (b) tag2;
            if (njy.e(this.g, i) || njy.e(this.g.get(i), i2)) {
                LogUtil.e("groupPosition or childPosition out of range.", new Object[0]);
            } else {
                b(bVar, z);
                hdc child = getChild(i, i2);
                if (child != null) {
                    e(bVar, view, child, i, i2);
                    return viewC;
                }
            }
        }
        return viewC;
    }

    private void e(b bVar, final View view, hdc hdcVar, final int i, final int i2) {
        qqf.b(bVar.f9609a, hdcVar.g().trim(), qqf.f46647a, 0, R.drawable.blank_1008);
        bVar.d.setText(hdcVar.b());
        bVar.i.setText(String.valueOf(hdcVar.l()));
        bVar.h.setText(hdcVar.m());
        bVar.f9611c.setText(String.valueOf((int) hdcVar.h()));
        if (hvu.c(this.k)) {
            bVar.f9610b.setVisibility(8);
            return;
        }
        bVar.f9610b.setVisibility(0);
        List<String> list = this.n.get(this.o.get(i));
        LogUtil.d("DietDetailsAdapter", "recordFoods " + list);
        if (list != null && list.contains(hdcVar.c())) {
            bVar.j.setBackgroundResource(R.drawable.ic_plan_curriculum_completed_orange);
            bVar.f9610b.setOnClickListener(new View.OnClickListener() { // from class: hpp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f37026a.e(i, i2, view2);
                }
            });
        } else {
            bVar.j.setBackgroundResource(R.drawable.ic_plan_rotate);
            bVar.f9610b.setOnClickListener(new View.OnClickListener() { // from class: hpl
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.e.d(i, i2, view, view2);
                }
            });
        }
    }

    public /* synthetic */ void e(int i, int i2, View view) {
        d(i, i2);
    }

    public /* synthetic */ void d(int i, int i2, View view, View view2) {
        a(i, i2, view);
    }

    private void c(final int i, d dVar) {
        dVar.f9612a.setOnClickListener(new View.OnClickListener() { // from class: hpg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.a(i, view);
            }
        });
        dVar.e.setOnClickListener(new View.OnClickListener() { // from class: hpk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f37022b.e(view);
            }
        });
        dVar.f9614c.setOnClickListener(new View.OnClickListener() { // from class: hpj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f37021c.b(i, view);
            }
        });
        if (hvu.c(this.k)) {
            dVar.f9612a.setVisibility(8);
            dVar.f9614c.setVisibility(0);
            dVar.e.setVisibility(8);
            return;
        }
        dVar.f9612a.setVisibility(0);
        dVar.f9614c.setVisibility(0);
        dVar.e.setVisibility(0);
        if (i()) {
            dVar.f9612a.setText(BaseApplication.getContext().getString(R.string.IDS_make_up_record).toUpperCase());
        } else {
            dVar.f9612a.setText(BaseApplication.getContext().getString(R.string.IDS_record_all_diet).toUpperCase());
        }
    }

    public /* synthetic */ void a(int i, View view) {
        d(i);
    }

    public /* synthetic */ void e(View view) {
        JumpUtil.a(this.k, new String[0]);
    }

    public /* synthetic */ void b(int i, View view) {
        e(i);
    }

    private void e(int i) {
        if (qrs.r()) {
            LogUtil.j("DietDetailsAdapter", "FastClick on replacing food");
        } else {
            b(i);
        }
    }

    private View c() {
        b bVar = new b();
        View viewInflate = LayoutInflater.from(this.f).inflate(R.layout.layout_diet_detail_child_item, (ViewGroup) null);
        bVar.e = viewInflate.findViewById(R.id.hw_show_diet_detail_child_bg);
        bVar.f9609a = (ImageView) viewInflate.findViewById(R.id.hw_show_diet_detail_child_food_img);
        bVar.d = (HealthTextView) viewInflate.findViewById(R.id.hw_show_diet_detail_child_food_name);
        bVar.i = (HealthTextView) viewInflate.findViewById(R.id.hw_show_diet_detail_child_weight);
        bVar.h = (HealthTextView) viewInflate.findViewById(R.id.hw_show_diet_detail_child_unit);
        bVar.f9611c = (HealthTextView) viewInflate.findViewById(R.id.hw_show_diet_detail_heat);
        bVar.j = (ImageView) viewInflate.findViewById(R.id.hw_show_diet_child_right_image);
        bVar.f9610b = (LinearLayout) viewInflate.findViewById(R.id.replace_click_layout);
        viewInflate.setTag(bVar);
        return viewInflate;
    }

    private View b() {
        LogUtil.a("DietDetailsAdapter", "getChildButtonView");
        d dVar = new d();
        View viewInflate = LayoutInflater.from(this.f).inflate(R.layout.layout_diet_detail_child_button, (ViewGroup) null);
        dVar.f9612a = (HealthButton) viewInflate.findViewById(R.id.do_all_record_button);
        dVar.f9614c = (HealthButton) viewInflate.findViewById(R.id.do_change_button);
        dVar.e = (HealthButton) viewInflate.findViewById(R.id.record_other_diet_btn);
        dVar.f9613b = viewInflate.findViewById(R.id.hw_show_diet_detail_button_bar);
        dVar.f9613b.setBackground(this.f.getResources().getDrawable(R.drawable.blood_sugar_history_bg_round_bottom));
        viewInflate.setTag(dVar);
        return viewInflate;
    }

    private void b(final int i) {
        LogUtil.a("DietDetailsAdapter", "click replaceAllFood: ", Integer.valueOf(i));
        ArrayList arrayList = new ArrayList();
        if (njy.c(this.o, i) && this.n.containsKey(this.o.get(i)) && njy.c(this.g, i)) {
            List<String> list = this.n.get(this.o.get(i));
            for (hdc hdcVar : this.g.get(i)) {
                if (list.contains(hdcVar.c())) {
                    arrayList.add(hdcVar.c());
                }
            }
        }
        new hdp().getReplaceList(this.k, i + 1, arrayList, new UiCallback<List<hdc>>() { // from class: com.huawei.health.suggestion.ui.plan.adapter.DietDetailsMutipleAdapter.2
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i2, String str) {
                LogUtil.a("DietDetailsAdapter", "getReplaceList errorCode: ", Integer.valueOf(i2), ", info: ", str);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(List<hdc> list2) {
                LogUtil.a("DietDetailsAdapter", "getReplaceList onSuccess.");
                if (!njy.e(list2)) {
                    DietDetailsMutipleAdapter.this.d.a(list2, i, DietDetailsMutipleAdapter.this.k);
                } else {
                    LogUtil.j("DietDetailsAdapter", "getReplaceList data is empty");
                }
            }
        });
    }

    private void b(b bVar, boolean z) {
        ViewGroup.LayoutParams layoutParams = bVar.e.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            if (z) {
                bVar.e.setBackground(this.f.getResources().getDrawable(R.drawable.blood_sugar_history_bg_round_bottom));
                layoutParams2.height = this.h + this.f9607b;
            } else {
                bVar.e.setBackground(this.f.getResources().getDrawable(R.color.colorCardPanelBg));
                layoutParams2.height = this.h;
            }
            bVar.e.setLayoutParams(layoutParams2);
        }
    }

    @Override // android.widget.ExpandableListAdapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String getGroup(int i) {
        if (njy.c(this.i, i)) {
            return this.i.get(i);
        }
        return null;
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
            view = f();
        }
        Object tag = view.getTag();
        if (tag instanceof e) {
            e eVar = (e) tag;
            b(eVar, i, z);
            String group = getGroup(i);
            if (group != null) {
                eVar.e.setText(group);
            }
        }
        return view;
    }

    private View f() {
        e eVar = new e();
        View viewInflate = LayoutInflater.from(this.f).inflate(R.layout.layout_diet_detail_father_item, (ViewGroup) null);
        eVar.f9616b = viewInflate.findViewById(R.id.hw_show_diet_detail_father_bg);
        eVar.e = (HealthTextView) viewInflate.findViewById(R.id.hw_show_diet_detail_father_heat);
        eVar.d = (ImageView) viewInflate.findViewById(R.id.diet_record_finished);
        eVar.f9617c = viewInflate.findViewById(R.id.hw_show_diet_detail_father_line);
        eVar.f9615a = (HealthTextView) viewInflate.findViewById(R.id.has_recorded);
        viewInflate.setTag(eVar);
        return viewInflate;
    }

    private void d(int i) {
        Date date;
        List<List<hdc>> list = this.g;
        if (list == null || i >= list.size()) {
            return;
        }
        HashMap map = new HashMap(1);
        map.put("click", 1);
        lmf.d().c(this.f, AnalyticsValue.INT_PLAN_2040151.value(), map, 0);
        List<hdc> list2 = this.g.get(i);
        Iterator<hdc> it = list2.iterator();
        int iH = 0;
        while (it.hasNext()) {
            iH = (int) (iH + it.next().h());
        }
        List<vgu> listE = hvq.e(list2);
        try {
            date = DateFormatUtil.d(this.k + this.m.get(i), DateFormatUtil.DateFormatType.DEFAULT_DATE_FORMAT);
        } catch (ParseException e2) {
            ReleaseLogUtil.b("DietDetailsAdapter", "addAllRecord exception ", ExceptionUtils.c(e2));
            date = null;
        }
        if (date == null) {
            date = new Date();
        }
        vgw vgwVar = new vgw(this.o.get(i).intValue(), date.getTime(), iH, listE);
        vgwVar.e(lsl.q(System.currentTimeMillis()));
        d(vgwVar, date);
    }

    private void d(final vgw vgwVar, Date date) {
        int iA = DateFormatUtil.a(date.getTime());
        ReleaseLogUtil.c("DietDetailsAdapter", "getDietRecordLocal dayFormat ", Integer.valueOf(iA));
        final ResponseCallback responseCallback = new ResponseCallback() { // from class: hpt
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f37032c.a(i, (vgo) obj);
            }
        };
        iun.a(iA, iA, (ResponseCallback<List<vgo>>) new ResponseCallback() { // from class: hpu
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.d.d(vgwVar, responseCallback, i, (List) obj);
            }
        });
    }

    public /* synthetic */ void a(int i, vgo vgoVar) {
        LogUtil.a("DietDetailsAdapter", "getDietRecordLocal errorCode ", Integer.valueOf(i), " dietRecord ", vgoVar);
        if (vgoVar == null) {
            return;
        }
        this.e.post(new Runnable() { // from class: hpo
            @Override // java.lang.Runnable
            public final void run() {
                this.f37025a.e();
            }
        });
    }

    public /* synthetic */ void e() {
        this.d.b(true, true);
    }

    public /* synthetic */ void d(vgw vgwVar, ResponseCallback responseCallback, int i, List list) {
        LogUtil.a("DietDetailsAdapter", "getDietRecordLocal errorCode ", Integer.valueOf(i), " list ", list);
        a((List<vgo>) list, vgwVar, (ResponseCallback<vgo>) responseCallback);
    }

    private void a(List<vgo> list, vgw vgwVar, ResponseCallback<vgo> responseCallback) {
        if (njy.e(list)) {
            ReleaseLogUtil.d("DietDetailsAdapter", "processDietRecordData list ", list);
            iun.a(vgwVar, responseCallback);
            return;
        }
        vgw vgwVar2 = null;
        for (vgw vgwVar3 : list.get(0).a()) {
            if (vgwVar3.i() == vgwVar.i()) {
                vgwVar2 = vgwVar3;
            }
        }
        vgwVar.e(this.f9608c.g());
        if (vgwVar2 == null) {
            iun.a(vgwVar, responseCallback);
            DietKakaUtil.completeMeal(this.f, this.f9608c, vgwVar);
        } else {
            b(vgwVar2, vgwVar);
            iun.e(vgwVar, responseCallback);
        }
    }

    private void a(int i, int i2, View view) {
        List<List<hdc>> list = this.g;
        if (list == null || njy.e(list, i) || njy.e(this.g.get(i), i2)) {
            return;
        }
        HashMap map = new HashMap(1);
        map.put("click", 1);
        lmf.d().c(this.f, AnalyticsValue.INT_PLAN_2040152.value(), map, 0);
        hdc hdcVar = this.g.get(i).get(i2);
        hdcVar.c(i + 1);
        vfy vfyVarD = this.f9608c.d();
        String strValueOf = String.valueOf(1000);
        if (vfyVarD != null) {
            strValueOf = String.valueOf(Math.min(Math.max(1000, Math.round(vfyVarD.e())), 10000));
        }
        hvq.a(this.f, hdcVar, this.k, this.l, strValueOf);
        this.e.postDelayed(new Runnable() { // from class: hpm
            @Override // java.lang.Runnable
            public final void run() {
                btq.e().e("PLAN_UPDATE");
            }
        }, 1000L);
    }

    private boolean i() {
        return new SimpleDateFormat("yyyy-MM-dd").format(Long.valueOf(System.currentTimeMillis())).compareToIgnoreCase(this.k) > 0;
    }

    public boolean d(int i, int i2) {
        boolean z = false;
        if (njy.e(this.g, i) || njy.e(this.g.get(i), i2)) {
            return false;
        }
        HashMap map = new HashMap(1);
        map.put("click", 1);
        lmf.d().c(this.f, AnalyticsValue.INT_PLAN_2040154.value(), map, 0);
        if (hvu.c(this.k)) {
            return true;
        }
        vgo vgoVar = this.f9608c;
        if (vgoVar != null && !vgoVar.a().isEmpty()) {
            hdc child = getChild(i, i2);
            if (child != null) {
                List<String> list = this.n.get(this.o.get(i));
                if (list != null && list.contains(child.c())) {
                    z = true;
                }
            } else {
                LogUtil.e("foodData is null.", new Object[0]);
            }
        }
        hdc hdcVar = this.g.get(i).get(i2);
        hdcVar.c(i + 1);
        hvq.a(BaseApplication.getContext(), hdcVar, z, this.k, this.l);
        this.e.postDelayed(new Runnable() { // from class: hpn
            @Override // java.lang.Runnable
            public final void run() {
                btq.e().e("PLAN_UPDATE");
            }
        }, 1000L);
        return true;
    }

    private void b(e eVar, int i, boolean z) {
        ViewGroup.LayoutParams layoutParams = eVar.f9617c.getLayoutParams();
        if (i == 0) {
            layoutParams.height = 0;
        } else {
            layoutParams.height = this.f.getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle);
        }
        eVar.f9617c.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = eVar.f9616b.getLayoutParams();
        if (layoutParams2 instanceof ConstraintLayout.LayoutParams) {
            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams2;
            Boolean bool = this.f9606a.get(Integer.valueOf(i));
            Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
            int iIntValue = (((this.f.getResources().getDisplayMetrics().widthPixels - ((Integer) safeRegionWidth.first).intValue()) - ((Integer) safeRegionWidth.second).intValue()) - (((int) this.f.getResources().getDimension(R.dimen.defaultPaddingStart)) * 2)) - (((int) this.f.getResources().getDimension(R.dimen.defaultPaddingEnd)) * 2);
            float f = iIntValue;
            eVar.e.setWidth((int) (0.65f * f));
            if (bool != null && bool.booleanValue()) {
                eVar.f9615a.setWidth((int) (f * 0.35f));
                eVar.f9615a.setVisibility(0);
                eVar.d.setVisibility(0);
            } else {
                eVar.f9615a.setVisibility(8);
                eVar.d.setVisibility(8);
            }
            if (hvu.c(this.k)) {
                eVar.e.setWidth(iIntValue);
                eVar.f9615a.setVisibility(8);
                eVar.d.setVisibility(8);
            }
            if (!z) {
                eVar.d.setImageResource(R.drawable.ic_plan_arrow_right);
                int i2 = this.j;
                int i3 = this.f9607b;
                layoutParams3.height = i2 + i3 + i3;
                eVar.f9616b.setBackground(this.f.getResources().getDrawable(R.drawable.blood_sugar_history_bg_round));
            } else {
                eVar.d.setImageResource(R.drawable.ic_health_list_drop_down_arrow_sel);
                eVar.f9616b.setBackground(this.f.getResources().getDrawable(R.drawable.blood_sugar_history_bg_round_top));
                layoutParams3.height = this.j + this.f9607b;
            }
            eVar.f9616b.setLayoutParams(layoutParams3);
        }
    }

    private void b(vgw vgwVar, vgw vgwVar2) {
        int iH = 0;
        if (vgwVar2.c() != null && vgwVar.c() != null) {
            Iterator<vgu> it = vgwVar.c().iterator();
            while (it.hasNext()) {
                vgu next = it.next();
                Iterator<vgu> it2 = vgwVar2.c().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (it2.next().e().equals(next.e())) {
                            it.remove();
                            break;
                        }
                    } else {
                        iH = (int) (iH + next.h());
                        break;
                    }
                }
            }
        }
        vgwVar2.c(iH + vgwVar2.e());
        vgwVar2.a(vgwVar.d());
        vgwVar2.c().addAll(vgwVar.c());
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f9615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        View f9616b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        View f9617c;
        ImageView d;
        HealthTextView e;

        private e() {
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthButton f9612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        View f9613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthButton f9614c;
        HealthButton e;

        private d() {
        }
    }
}
