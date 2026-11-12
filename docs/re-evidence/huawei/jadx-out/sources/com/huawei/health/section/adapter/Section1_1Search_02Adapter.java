package com.huawei.health.section.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.marketing.datatype.SingleDailyMomentContent;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import defpackage.fts;
import defpackage.fya;
import defpackage.gvp;
import defpackage.qqf;
import defpackage.qsp;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class Section1_1Search_02Adapter extends RecyclerView.Adapter<d> {
    private static final int d = (int) BaseApplication.getContext().getResources().getDimension(R.dimen.health_common_8dp);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f8724a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f8725b;
    private gvp e;

    public Section1_1Search_02Adapter(Context context, gvp gvpVar) {
        this.f8725b = context;
        this.e = gvpVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new d(LayoutInflater.from(this.f8725b).inflate(R.layout.section1_1search_02_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(d dVar, int i) {
        fts.a(this.f8725b, dVar.e, i, getItemCount());
        a(dVar, i);
    }

    private void a(d dVar, int i) {
        String string;
        int i2;
        Resources resources = BaseApplication.getContext().getResources();
        if (dVar.f8727b != null) {
            dVar.f8727b.setText(String.valueOf(i + 1));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(resources.getDimension(R.dimen.defaultCornerRadiusXS));
            if (i == 0) {
                gradientDrawable.setColor(ContextCompat.getColor(this.f8725b, R.color.search_hot_list_bg_first));
            } else if (i == 1) {
                gradientDrawable.setColor(ContextCompat.getColor(this.f8725b, R.color.search_hot_list_bg_second));
            } else if (i == 2) {
                gradientDrawable.setColor(ContextCompat.getColor(this.f8725b, R.color.search_hot_list_bg_third));
            } else {
                gradientDrawable.setColor(ContextCompat.getColor(this.f8725b, R.color.search_hot_list_bg_after_third));
            }
            dVar.f8727b.setBackground(gradientDrawable);
            HealthTextView healthTextView = dVar.f8727b;
            Context context = this.f8725b;
            if (i <= 2) {
                i2 = R.color.search_hot_list_text_before_third;
            } else {
                i2 = R.color.search_hot_list_text_after_third;
            }
            healthTextView.setTextColor(ContextCompat.getColor(context, i2));
        }
        List<SingleGridContent> listC = this.e.c();
        if (fts.d(listC, i)) {
            SingleGridContent singleGridContent = listC.get(i);
            d(singleGridContent, dVar);
            fya.e(dVar.j, singleGridContent.getTheme(), singleGridContent.isThemeVisibility());
            fya.d(dVar.i, singleGridContent);
            fya.d(dVar.h, singleGridContent.getDescription(), singleGridContent.getDescriptionVisibility());
            if (dVar.g != null && !TextUtils.isEmpty(singleGridContent.getItemCategory())) {
                String itemCategory = singleGridContent.getItemCategory();
                itemCategory.hashCode();
                if (itemCategory.equals("BreathExercise")) {
                    string = resources.getString(R.string.IDS_settings_one_level_menu_settings_item_text_id13);
                } else if (itemCategory.equals("SleepAudio")) {
                    string = resources.getString(R.string.IDS_hwh_motiontrack_music);
                } else {
                    string = fya.d(singleGridContent.getItemCategory());
                }
                b(string, dVar, resources, singleGridContent);
            }
            fts.d(dVar.d, this.e.e(), i);
        }
    }

    private int d(String str) {
        if (SingleDailyMomentContent.COURSE_TYPE.equals(str)) {
            return ContextCompat.getColor(this.f8725b, R.color.search_hot_list_attr_course);
        }
        return ContextCompat.getColor(this.f8725b, R.color.search_hot_list_attr_other);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.f8724a == -1) {
            this.f8724a = fts.e(this.e.c());
        }
        return this.f8724a;
    }

    private void d(SingleGridContent singleGridContent, d dVar) {
        if (dVar.f8726a != null) {
            String picture = singleGridContent.getPicture();
            if (!TextUtils.isEmpty(picture)) {
                qqf.e(dVar.f8726a, picture, d, 0, R.drawable.section_sug_bg_trining_defuct_section);
            } else {
                qqf.a(R.drawable.section_sug_bg_trining_defuct_section, dVar.f8726a, d);
            }
        }
    }

    private void b(String str, d dVar, Resources resources, SingleGridContent singleGridContent) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        qsp.c((View) dVar.g, 0);
        dVar.g.setText(str);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(resources.getDimension(R.dimen.health_common_4dp));
        int iD = d(singleGridContent.getItemCategory());
        gradientDrawable.setStroke((int) resources.getDimension(R.dimen.health_common_1dp), iD);
        dVar.g.setTextColor(iD);
        dVar.g.setBackground(gradientDrawable);
    }

    class d extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthImageView f8726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthTextView f8727b;
        private RelativeLayout d;
        private LinearLayout e;
        private HealthTextView g;
        private HealthTextView h;
        private HealthTextView i;
        private HealthTextView j;

        d(View view) {
            super(view);
            this.d = (RelativeLayout) view.findViewById(R.id.recycle_item);
            this.f8727b = (HealthTextView) view.findViewById(R.id.item_index_text);
            this.f8726a = (HealthImageView) view.findViewById(R.id.item_picture);
            this.j = (HealthTextView) view.findViewById(R.id.item_title);
            this.i = (HealthTextView) view.findViewById(R.id.item_special_tag);
            this.h = (HealthTextView) view.findViewById(R.id.item_subtitle);
            this.g = (HealthTextView) view.findViewById(R.id.item_type);
            this.e = (LinearLayout) view.findViewById(R.id.item_divider);
        }
    }
}
