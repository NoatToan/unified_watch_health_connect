package com.huawei.health.suggestion.customizecourse.manager.adapter.viewholder;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.suggestion.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.hdr;
import health.compact.a.LanguageUtil;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class CourseDetailActionViewHolder extends CustomCourseDragViewHolder<hdr> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HealthTextView f8927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HealthTextView f8928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LinearLayout f8929c;
    private final HealthTextView d;
    private final ImageView e;
    private View f;
    private final HealthTextView g;
    private final Space h;
    private final HealthTextView i;
    private final LinearLayout j;
    private final HealthTextView k;
    private final HealthTextView m;
    private final HealthTextView o;

    @Override // com.huawei.health.suggestion.customizecourse.manager.adapter.viewholder.CustomCourseDragViewHolder
    public void setDragState(boolean z) {
    }

    public CourseDetailActionViewHolder(View view, int i) {
        super(view);
        this.e = (ImageView) view.findViewById(R.id.sug_custom_course_item_icon_column);
        this.d = (HealthTextView) view.findViewById(R.id.sug_custom_course_item_action_name);
        this.j = (LinearLayout) view.findViewById(R.id.sug_custom_course_item_target);
        this.i = (HealthTextView) view.findViewById(R.id.sug_custom_course_item_target_name);
        this.m = (HealthTextView) view.findViewById(R.id.sug_custom_item_target_value_first);
        this.k = (HealthTextView) view.findViewById(R.id.sug_custom_item_target_value_middle);
        this.o = (HealthTextView) view.findViewById(R.id.sug_custom_item_target_value_last);
        this.f8929c = (LinearLayout) view.findViewById(R.id.sug_custom_course_item_intensity);
        this.f8927a = (HealthTextView) view.findViewById(R.id.sug_course_item_intensity_name);
        this.f8928b = (HealthTextView) view.findViewById(R.id.sug_course_item_intensity_value_first);
        this.g = (HealthTextView) view.findViewById(R.id.sug_course_item_intensity_value_last);
        this.h = (Space) view.findViewById(R.id.sug_custom_course_card_padding_bottom);
        if (i != 0) {
            this.f = view.findViewById(R.id.sug_custom_course_detail_item_line);
        }
    }

    @Override // com.huawei.health.suggestion.customizecourse.manager.adapter.viewholder.CustomCourseDragViewHolder
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void init(hdr hdrVar, int i) {
        if (hdrVar == null) {
            LogUtil.j("Suggestion_CourseDetailActionViewHolder", "init, actionItemConfig == null");
            return;
        }
        this.d.setText(hdrVar.j());
        this.e.setBackgroundResource(hdrVar.d());
        b(hdrVar.h());
        d(hdrVar);
        c(hdrVar);
        if (LanguageUtil.f(BaseApplication.b())) {
            a(this.m);
            a(this.k);
            a(this.o);
            a(this.f8927a);
            a(this.f8928b);
            a(this.g);
        }
    }

    private void a(HealthTextView healthTextView) {
        healthTextView.setAutoTextInfo(9, 1, 2);
    }

    private void c(hdr hdrVar) {
        String string;
        String strA = hdrVar.a();
        String string2 = BaseApplication.b().getResources().getString(R.string.IDS_sug_intensity_type);
        if (!TextUtils.isEmpty(strA) && !strA.equals(string2)) {
            this.f8927a.setText(hdrVar.a());
            this.f8928b.setVisibility(0);
            this.g.setVisibility(8);
            List<String> listE = hdrVar.e();
            int size = listE.size();
            if (size >= 2) {
                string = BaseApplication.b().getResources().getString(R.string.IDS_indoor_skipper_minute_and_second, listE.get(0), listE.get(1));
            } else if (size >= 1) {
                string = listE.get(0);
            } else {
                string = BaseApplication.b().getResources().getString(R.string.IDS_sug_none);
            }
            this.f8928b.setText(string);
            return;
        }
        this.f8929c.setVisibility(8);
    }

    private void d(hdr hdrVar) {
        String string;
        if (TextUtils.isEmpty(hdrVar.n())) {
            this.j.setVisibility(8);
            return;
        }
        this.i.setText(hdrVar.n());
        this.m.setVisibility(0);
        this.k.setVisibility(8);
        this.o.setVisibility(8);
        List<String> listK = hdrVar.k();
        int size = listK.size();
        if (size >= 3) {
            this.o.setVisibility(0);
            this.k.setVisibility(0);
            this.o.setText(listK.get(2));
            this.k.setText(listK.get(1));
            this.m.setText(listK.get(0));
            return;
        }
        if (size >= 2) {
            string = BaseApplication.b().getResources().getString(R.string.IDS_indoor_skipper_minute_and_second, listK.get(0), listK.get(1));
        } else {
            string = listK.get(0);
        }
        this.m.setText(string);
    }

    private void b(int i) {
        if (i == 0) {
            this.e.setVisibility(0);
            this.h.setVisibility(0);
            return;
        }
        LogUtil.a("Suggestion_CourseDetailActionViewHolder", "init, in multi");
        this.e.setVisibility(4);
        if (i == 1) {
            this.f.setVisibility(0);
            this.h.setVisibility(0);
        } else {
            this.f.setVisibility(8);
            this.h.setVisibility(8);
        }
    }
}
