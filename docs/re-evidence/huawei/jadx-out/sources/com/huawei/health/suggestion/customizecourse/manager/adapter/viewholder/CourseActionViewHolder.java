package com.huawei.health.suggestion.customizecourse.manager.adapter.viewholder;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.customizecourse.manager.adapter.interfaceadapter.ItemEventListener;
import com.huawei.health.suggestion.customizecourse.manager.adapter.interfaceadapter.OnStartDragListener;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.hdr;
import health.compact.a.LanguageUtil;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class CourseActionViewHolder extends CustomCourseDragViewHolder<hdr> implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HealthTextView f8920a;
    private final HealthTextView aa;
    private final HealthTextView ab;
    private final HealthTextView ac;
    private final HealthTextView ad;
    private final HealthTextView ae;
    private final HealthTextView ai;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HealthTextView f8921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private hdr f8922c;
    private final HealthCardView d;
    private final Context e;
    private final ImageView f;
    private final View g;
    private final ImageView h;
    private final Space i;
    private final OnStartDragListener j;
    private final HealthTextView k;
    private final View l;
    private final LinearLayout m;
    private final LinearLayout n;
    private final HealthTextView o;
    private final HealthTextView p;
    private final HealthTextView q;
    private final LinearLayout r;
    private final ItemEventListener s;
    private final HealthTextView t;
    private final LinearLayout u;
    private final LinearLayout v;
    private final Space w;
    private final HealthTextView x;
    private final ImageView y;
    private final HealthTextView z;

    public CourseActionViewHolder(View view, Context context, OnStartDragListener onStartDragListener, ItemEventListener itemEventListener) {
        super(view);
        this.e = context;
        this.j = onStartDragListener;
        this.s = itemEventListener;
        this.r = (LinearLayout) view.findViewById(R.id.sug_custom_course_item_content);
        this.d = (HealthCardView) view.findViewById(R.id.sug_sug_custom_course_action_card);
        this.g = view.findViewById(R.id.sug_custom_course_item_space_left_multi);
        this.l = view.findViewById(R.id.sug_custom_course_item_space_right_multi);
        this.i = (Space) view.findViewById(R.id.sug_custom_course_item_icon_space);
        this.f = (ImageView) view.findViewById(R.id.sug_custom_course_item_icon_colum);
        this.f8921b = (HealthTextView) view.findViewById(R.id.sug_custom_course_item_action_name);
        this.h = (ImageView) view.findViewById(R.id.sug_custom_course_item_icon_edit_action);
        ImageView imageView = (ImageView) view.findViewById(R.id.sug_custom_course_item_icon_open_close);
        this.y = imageView;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.sug_custom_course_item_target_hint);
        this.v = linearLayout;
        this.x = (HealthTextView) view.findViewById(R.id.sug_course_item_target_name_hint);
        this.ab = (HealthTextView) view.findViewById(R.id.sug_course_item_target_value_hint_first);
        this.aa = (HealthTextView) view.findViewById(R.id.sug_course_item_target_value_hint_second);
        this.z = (HealthTextView) view.findViewById(R.id.sug_course_item_target_value_hint_third);
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.sug_custom_course_item_intensity_hint);
        this.m = linearLayout2;
        this.o = (HealthTextView) view.findViewById(R.id.sug_course_item_intensity_name_hint);
        this.q = (HealthTextView) view.findViewById(R.id.sug_course_item_intensity_value_hint);
        this.u = (LinearLayout) view.findViewById(R.id.sug_custom_course_item_target);
        this.ac = (HealthTextView) view.findViewById(R.id.sug_custom_course_item_target_name);
        this.ad = (HealthTextView) view.findViewById(R.id.sug_course_item_target_value_first);
        this.ae = (HealthTextView) view.findViewById(R.id.sug_course_item_target_value_second);
        this.ai = (HealthTextView) view.findViewById(R.id.sug_course_item_target_value_third);
        this.n = (LinearLayout) view.findViewById(R.id.sug_custom_course_item_intensity);
        this.k = (HealthTextView) view.findViewById(R.id.sug_course_item_intensity_name);
        this.p = (HealthTextView) view.findViewById(R.id.sug_course_item_intensity_value_first);
        this.t = (HealthTextView) view.findViewById(R.id.sug_course_item_intensity_value_last);
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.sug_custom_course_item_del_action);
        this.f8920a = healthTextView;
        this.w = (Space) view.findViewById(R.id.sug_custom_course_item_space_card_middle);
        view.findViewById(R.id.sug_course_item_open_close).setOnClickListener(this);
        view.findViewById(R.id.sug_course_item_target_value_parent).setOnClickListener(this);
        view.findViewById(R.id.sug_course_item_intensity_value_parent).setOnClickListener(this);
        view.findViewById(R.id.sug_custom_course_item_content).setOnLongClickListener(this);
        view.findViewById(R.id.sug_custom_course_item_icon_drag).setOnLongClickListener(this);
        view.findViewById(R.id.sug_course_item_open_close).setOnLongClickListener(this);
        linearLayout.setOnLongClickListener(this);
        linearLayout2.setOnLongClickListener(this);
        view.findViewById(R.id.sug_custom_course_item_action).setOnClickListener(this);
        view.findViewById(R.id.sug_custom_course_item_target_edit).setOnClickListener(this);
        view.findViewById(R.id.sug_custom_course_item_intensity_edit).setOnClickListener(this);
        imageView.setOnClickListener(this);
        healthTextView.setOnClickListener(this);
    }

    @Override // com.huawei.health.suggestion.customizecourse.manager.adapter.viewholder.CustomCourseDragViewHolder
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void init(hdr hdrVar, int i) {
        if (hdrVar == null) {
            LogUtil.j("Suggestion_CourseActionViewHolder", "init, itemConfig == null");
            return;
        }
        setIsCanDrag(true);
        this.f8922c = hdrVar;
        f();
        this.f8921b.setText(hdrVar.j());
        this.f.setBackgroundResource(hdrVar.d());
        b(hdrVar);
        d(hdrVar);
    }

    public hdr c() {
        return this.f8922c;
    }

    private void d(hdr hdrVar) {
        String string;
        if (!TextUtils.isEmpty(hdrVar.a())) {
            this.k.setText(hdrVar.a());
            this.o.setText(hdrVar.a());
            this.t.setVisibility(8);
            this.p.setVisibility(0);
            List<String> listE = hdrVar.e();
            int size = listE.size();
            if (size >= 2) {
                string = this.e.getResources().getString(R.string.IDS_indoor_skipper_minute_and_second, listE.get(0), listE.get(1));
            } else if (size >= 1) {
                string = listE.get(0);
            } else {
                string = this.e.getResources().getString(R.string.IDS_sug_none);
            }
            this.p.setText(string);
            this.q.setText(string);
            return;
        }
        this.n.setVisibility(8);
    }

    private void b(hdr hdrVar) {
        String string;
        if (TextUtils.isEmpty(hdrVar.n())) {
            this.u.setVisibility(8);
            return;
        }
        this.ac.setText(hdrVar.n());
        this.x.setText(hdrVar.n());
        this.ab.setVisibility(0);
        this.aa.setVisibility(8);
        this.z.setVisibility(8);
        this.ad.setVisibility(0);
        this.ae.setVisibility(8);
        this.ai.setVisibility(8);
        List<String> listK = hdrVar.k();
        int size = listK.size();
        if (size >= 3) {
            this.z.setVisibility(0);
            this.ai.setVisibility(0);
            this.aa.setVisibility(0);
            this.ae.setVisibility(0);
            this.z.setText(listK.get(2));
            this.ai.setText(listK.get(2));
            this.aa.setText(listK.get(1));
            this.ae.setText(listK.get(1));
            this.ab.setText(listK.get(0));
            this.ad.setText(listK.get(0));
            return;
        }
        if (size >= 2) {
            string = this.e.getResources().getString(R.string.IDS_indoor_skipper_minute_and_second, listK.get(0), listK.get(1));
        } else {
            string = listK.get(0);
        }
        this.ab.setText(string);
        this.ad.setText(string);
    }

    private void f() {
        this.w.setVisibility(0);
        if (this.f8922c.h() == 0) {
            this.g.setVisibility(8);
            this.l.setVisibility(8);
            this.f.setVisibility(0);
            this.i.setVisibility(0);
            this.r.setBackgroundColor(0);
            this.d.setCardBackgroundColor(this.e.getResources().getColor(R.color.sug_color_mimics_card_bg));
            this.d.setRadius(this.e.getResources().getDimension(R.dimen.defaultCornerRadiusL));
        } else {
            this.g.setVisibility(0);
            this.l.setVisibility(0);
            this.f.setVisibility(8);
            this.i.setVisibility(8);
            this.r.setBackgroundColor(this.e.getResources().getColor(R.color.sug_color_mimics_card_bg));
            this.d.setCardBackgroundColor(this.e.getResources().getColor(R.color.colorSubheaderDivider));
            this.d.setRadius(this.e.getResources().getDimension(R.dimen.defaultCornerRadiusS));
            d();
        }
        if (this.f8922c.o()) {
            a();
        } else {
            e();
        }
        if (LanguageUtil.f(BaseApplication.b())) {
            d(this.p);
            d(this.k);
            d(this.ai);
            d(this.ae);
            d(this.ad);
            d(this.ac);
            d(this.q);
            d(this.o);
            d(this.z);
            d(this.aa);
            d(this.ab);
            d(this.x);
            d(this.f8921b);
            return;
        }
        g();
    }

    private void g() {
        this.f8921b.setSplittable(true);
        this.x.setSplittable(true);
        this.ab.setSplittable(true);
        this.ac.setSplittable(true);
        this.ad.setSplittable(true);
        this.k.setSplittable(true);
        this.o.setSplittable(true);
        this.p.setSplittable(true);
        this.q.setSplittable(true);
    }

    private void d(HealthTextView healthTextView) {
        healthTextView.setAutoTextInfo(9, 1, 2);
    }

    public void b() {
        hdr hdrVar = this.f8922c;
        if (hdrVar == null) {
            LogUtil.j("Suggestion_CourseActionViewHolder", "updateSpaceState, mItemConfig == null");
            return;
        }
        if (hdrVar.h() == 0) {
            this.f.setVisibility(0);
            this.i.setVisibility(0);
            this.g.setVisibility(8);
            this.l.setVisibility(8);
            this.r.setBackgroundColor(0);
            this.d.setCardBackgroundColor(this.e.getResources().getColor(R.color.sug_color_mimics_card_bg));
            return;
        }
        this.f.setVisibility(8);
        this.i.setVisibility(8);
        this.g.setVisibility(0);
        this.l.setVisibility(0);
        this.r.setBackgroundColor(this.e.getResources().getColor(R.color.sug_color_mimics_card_bg));
        this.d.setCardBackgroundColor(this.e.getResources().getColor(R.color.colorSubheaderDivider));
    }

    public void e() {
        this.h.setVisibility(8);
        this.v.setVisibility(0);
        this.m.setVisibility(0);
        this.u.setVisibility(8);
        this.n.setVisibility(8);
        this.f8920a.setVisibility(8);
        this.y.setImageResource(R.drawable.ic_health_list_drop_down_arrow_nor);
    }

    public void a() {
        this.h.setVisibility(0);
        this.v.setVisibility(8);
        this.m.setVisibility(8);
        this.u.setVisibility(0);
        hdr hdrVar = this.f8922c;
        if (hdrVar == null || TextUtils.isEmpty(hdrVar.a())) {
            this.n.setVisibility(8);
        } else {
            this.n.setVisibility(0);
        }
        this.f8920a.setVisibility(0);
        this.y.setImageResource(R.drawable.ic_health_list_drop_down_arrow_sel);
    }

    @Override // com.huawei.health.suggestion.customizecourse.manager.adapter.viewholder.CustomCourseDragViewHolder
    public void setDragState(boolean z) {
        hdr hdrVar = this.f8922c;
        if (hdrVar == null) {
            LogUtil.j("Suggestion_CourseActionViewHolder", "setDragState, mItemConfig == null");
            return;
        }
        if (z) {
            if (hdrVar.h() != 0) {
                this.r.setBackgroundColor(0);
                return;
            }
            return;
        }
        if (hdrVar.m()) {
            this.f8922c.d(true);
            this.f8922c.c(false);
            a();
        }
        if (this.f8922c.h() != 0) {
            this.r.setBackgroundColor(this.e.getResources().getColor(R.color.sug_color_mimics_card_bg));
        }
    }

    private void d() {
        if (this.f8922c.h() == 2) {
            this.w.setVisibility(8);
        } else {
            this.w.setVisibility(0);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ItemEventListener itemEventListener;
        if (view == null) {
            LogUtil.j("Suggestion_CourseActionViewHolder", "onClick, view is null");
            return;
        }
        int id = view.getId();
        int adapterPosition = getAdapterPosition();
        if (adapterPosition < 0) {
            LogUtil.j("Suggestion_CourseActionViewHolder", "onClick, position < 0");
            return;
        }
        if (id == R.id.sug_custom_course_item_icon_open_close || id == R.id.sug_course_item_open_close) {
            ItemEventListener itemEventListener2 = this.s;
            if (itemEventListener2 != null) {
                itemEventListener2.onComItemClick(adapterPosition, 0);
                return;
            }
            return;
        }
        if (id == R.id.sug_custom_course_item_del_action) {
            ItemEventListener itemEventListener3 = this.s;
            if (itemEventListener3 != null) {
                itemEventListener3.onComItemClick(adapterPosition, 1);
                return;
            }
            return;
        }
        if (id == R.id.sug_custom_course_item_action) {
            hdr hdrVar = this.f8922c;
            if (hdrVar == null || !hdrVar.o() || (itemEventListener = this.s) == null) {
                return;
            }
            itemEventListener.onComItemClick(adapterPosition, 4);
            return;
        }
        a(id, adapterPosition);
    }

    private void a(int i, int i2) {
        if (this.s == null) {
            LogUtil.j("Suggestion_CourseActionViewHolder", "handleClick mItemEventListener is null.");
            return;
        }
        if (i == R.id.sug_custom_course_item_target_edit) {
            this.s.onComItemClick(i2, 5);
            return;
        }
        if (i == R.id.sug_course_item_target_value_parent) {
            this.s.onComItemClick(i2, 6);
            return;
        }
        if (i == R.id.sug_custom_course_item_intensity_edit) {
            this.s.onComItemClick(i2, 7);
        } else if (i == R.id.sug_course_item_intensity_value_parent) {
            this.s.onComItemClick(i2, 8);
        } else {
            LogUtil.j("Suggestion_CourseActionViewHolder", "onClick, id = ", Integer.valueOf(i));
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        hdr hdrVar;
        if (view == null) {
            LogUtil.j("Suggestion_CourseActionViewHolder", "onLongClick, view == null");
            return false;
        }
        if (view.getId() != R.id.sug_custom_course_item_content && view.getId() != R.id.sug_custom_course_item_icon_drag && view.getId() != R.id.sug_custom_course_item_target_hint && view.getId() != R.id.sug_custom_course_item_intensity_hint && view.getId() != R.id.sug_course_item_open_close) {
            return false;
        }
        int adapterPosition = getAdapterPosition();
        if (adapterPosition < 0) {
            LogUtil.j("Suggestion_CourseActionViewHolder", "onLongClick, position < 0");
            return false;
        }
        ItemEventListener itemEventListener = this.s;
        if (itemEventListener != null) {
            itemEventListener.onComItemClick(adapterPosition, 10);
        }
        if (this.j != null && (hdrVar = this.f8922c) != null) {
            if (hdrVar.o()) {
                this.f8922c.c(true);
                this.f8922c.d(false);
                e();
            }
            this.j.onStartDrag(this);
        }
        return true;
    }
}
