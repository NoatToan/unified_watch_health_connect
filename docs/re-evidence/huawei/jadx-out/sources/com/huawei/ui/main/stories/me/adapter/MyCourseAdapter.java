package com.huawei.ui.main.stories.me.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.fitnessadvice.api.FitnessAdviceApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.main.R;
import defpackage.idy;
import defpackage.iov;
import defpackage.lmf;
import defpackage.qqf;
import defpackage.qqz;
import defpackage.qrs;
import health.compact.a.CommonUtils;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.Utils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class MyCourseAdapter extends AdapterWithBottomView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LayoutInflater f28527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f28528c;
    private Map<Integer, String> d;
    private boolean e;

    @Override // com.huawei.ui.main.stories.me.adapter.AdapterWithBottomView
    public int getContentItem() {
        return 3;
    }

    @Override // com.huawei.ui.main.stories.me.adapter.AdapterWithBottomView
    public int getContentItemType() {
        return 0;
    }

    public MyCourseAdapter(Context context) {
        super(context);
        this.d = new HashMap(3);
        this.e = false;
        this.f28527b = LayoutInflater.from(context);
        this.f28528c = context;
    }

    public void d(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.d.put(Integer.valueOf(i), str);
        if (!(this.f28528c instanceof Activity)) {
            LogUtil.j("MyCourseAdapter", "mContext instanceof Activity false");
        } else if (this.d.size() == 3) {
            LogUtil.a("MyCourseAdapter", "setData");
            ((Activity) this.f28528c).runOnUiThread(new Runnable() { // from class: vvo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51628b.notifyDataSetChanged();
                }
            });
        }
    }

    @Override // com.huawei.ui.main.stories.me.adapter.AdapterWithBottomView
    public RecyclerView.ViewHolder onCreateChildViewHolder(ViewGroup viewGroup, int i) {
        return new e(this.f28527b.inflate(R.layout.item_my_course, viewGroup, false));
    }

    @Override // com.huawei.ui.main.stories.me.adapter.AdapterWithBottomView
    public void onBindChildViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof e) {
            b(i, (e) viewHolder);
        }
    }

    private void b(final int i, e eVar) {
        eVar.d.setSubHeaderBackgroundColor(ContextCompat.getColor(this.f28528c, R.color.transparent));
        final String strD = d(i, eVar);
        d(a(i), eVar, i);
        eVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: vvp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51629a.e(i, strD, view);
            }
        });
    }

    public /* synthetic */ void e(int i, String str, View view) {
        if (qrs.c(500)) {
            LogUtil.j("MyCourseAdapter", "view click too fast.");
        } else {
            b(i, str);
        }
    }

    private void d(String str, e eVar, int i) {
        if (TextUtils.isEmpty(str) || str.equals("invalidUrl")) {
            a(eVar, false);
            return;
        }
        if (str.startsWith("smartTrainPlanUrl")) {
            qqf.a(eVar.j, CommonUtils.j(str.replace("smartTrainPlanUrl", "")), qqf.e, 0, R.drawable.ic_collect_course);
            a(eVar, true);
        } else if (str.contains("customImage")) {
            d(str, eVar);
            a(eVar, true);
        } else if (i == 0) {
            qqf.b(eVar.j, str, qqf.f46647a, 3, R.drawable.ic_collect_course);
            a(eVar, true);
        } else {
            qqf.b(eVar.j, str, qqf.e, 0, R.drawable.ic_collect_course);
            a(eVar, true);
        }
    }

    private void b(int i, String str) {
        if (i == 0) {
            c();
            return;
        }
        if (i == 1) {
            c(str, 4);
        } else if (i == 2) {
            a();
            c(str, 7);
        } else {
            LogUtil.j("MyCourseAdapter", "itemView click, position = ", Integer.valueOf(i));
        }
    }

    private void c(String str, int i) {
        this.e = true;
        Intent intent = new Intent();
        intent.setClassName(BaseApplication.getContext(), "com.huawei.health.suggestion.ui.fitness.activity.MyFitnessCourseActivity");
        intent.putExtra("titleName", str);
        intent.putExtra("courseCategoryKey", i);
        intent.setFlags(268435456);
        iov.d(this.f28528c, intent);
        b();
    }

    private void b() {
        Object objJ = this.f28528c;
        if (!(objJ instanceof Activity)) {
            objJ = com.huawei.haf.application.BaseApplication.j();
        }
        if (objJ instanceof Activity) {
            ((Activity) objJ).overridePendingTransition(0, R.anim.activity_no_animation_short);
        }
    }

    private void c() {
        idy.c("1120020");
        FitnessAdviceApi fitnessAdviceApi = (FitnessAdviceApi) Services.d("PluginFitnessAdvice", FitnessAdviceApi.class);
        if (fitnessAdviceApi != null) {
            fitnessAdviceApi.launchMyPlanH5();
        }
    }

    private String d(int i, e eVar) {
        String string;
        String string2;
        String string3;
        String string4;
        if (i == 0) {
            string = this.f28528c.getString(R.string.sug_home_my_own_plans);
            string2 = this.f28528c.getResources().getString(R.string.IDS_course_lightweight_status, e(R.string.IDS_hwh_home_group_underway), e(R.string.IDS_completed));
        } else if (i == 1) {
            string = this.f28528c.getString(R.string.IDS_course_title_sport);
            String strE = e(R.string.IDS_FitnessAdvice_load_ok);
            String strE2 = e(R.string.IDS_FitnessAdvice_collected_ok);
            if (Utils.o()) {
                string2 = this.f28528c.getResources().getString(R.string.IDS_course_lightweight_status, strE, strE2);
            } else {
                string2 = this.f28528c.getResources().getString(R.string.IDS_course_status, strE, strE2, e(R.string.IDS_FitnessAdvice_purchase_ok));
            }
        } else {
            if (i == 2) {
                string3 = this.f28528c.getString(R.string.IDS_hw_sleep_relax);
                string = this.f28528c.getString(R.string.IDS_course_title_health);
                String strE3 = e(R.string.IDS_course_used);
                String strE4 = e(R.string.IDS_FitnessAdvice_collected_ok);
                if (Utils.o()) {
                    string4 = this.f28528c.getResources().getString(R.string.IDS_course_lightweight_status, strE3, strE4);
                } else {
                    string4 = this.f28528c.getResources().getString(R.string.IDS_course_status, strE3, strE4, e(R.string.IDS_FitnessAdvice_purchase_ok));
                }
            } else {
                LogUtil.j("MyCourseAdapter", "position is not exists");
                string2 = null;
                string = "";
            }
            eVar.d.setHeadTitleText(string);
            eVar.e.setText(string3);
            eVar.f28531c.setText(string4);
            return string3;
        }
        string4 = string2;
        string3 = string;
        eVar.d.setHeadTitleText(string);
        eVar.e.setText(string3);
        eVar.f28531c.setText(string4);
        return string3;
    }

    private String e(int i) {
        return this.f28528c.getString(i);
    }

    private void a() {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("from", 1);
        lmf.d().c(this.f28528c, AnalyticsValue.INT_PLAN_2030103.value(), map, 0);
    }

    private void d(String str, e eVar) {
        int i;
        long jC = c(str) % 3;
        if (jC == 0) {
            i = R.drawable.pic_custom_yellow_small;
        } else if (jC == 1) {
            i = R.drawable.pic_custom_red_small;
        } else {
            i = R.drawable.pic_custom_blue_small;
        }
        qqf.a(eVar.j, i, qqf.e, 0, R.drawable.ic_collect_course);
    }

    private void a(e eVar, boolean z) {
        if (LanguageUtil.ba(this.f28528c)) {
            Context context = this.f28528c;
            BitmapDrawable bitmapDrawableE = qqz.e(context, context.getResources().getDrawable(R.drawable.my_course_icon_stacking));
            if (bitmapDrawableE != null) {
                eVar.f28529a.setImageDrawable(bitmapDrawableE);
            }
        }
        if (z) {
            eVar.j.setVisibility(0);
            eVar.f28529a.setVisibility(0);
            eVar.f28530b.setVisibility(8);
        } else {
            eVar.j.setVisibility(8);
            eVar.f28529a.setVisibility(8);
            eVar.f28530b.setVisibility(0);
        }
    }

    private String a(int i) {
        Map<Integer, String> map = this.d;
        if (map != null && i <= map.size() && !TextUtils.isEmpty(this.d.get(Integer.valueOf(i)))) {
            return this.d.get(Integer.valueOf(i));
        }
        return "";
    }

    public boolean d() {
        return this.e;
    }

    public void b(boolean z) {
        this.e = z;
    }

    static class e extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ImageView f28529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ImageView f28530b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthTextView f28531c;
        HealthSubHeader d;
        HealthTextView e;
        ImageView j;

        e(View view) {
            super(view);
            this.d = (HealthSubHeader) view.findViewById(R.id.course_sub_header);
            this.e = (HealthTextView) view.findViewById(R.id.course_title);
            this.f28531c = (HealthTextView) view.findViewById(R.id.course_subtitle);
            this.f28530b = (ImageView) view.findViewById(R.id.default_icon);
            this.f28529a = (ImageView) view.findViewById(R.id.lamination_icon);
            this.j = (ImageView) view.findViewById(R.id.course_show_icon);
        }
    }

    public static String b(String str) {
        return "customImage" + str;
    }

    private long c(String str) {
        String[] strArrSplit = str.split("customImage");
        if (strArrSplit.length > 1) {
            return CommonUtils.i(strArrSplit[1]);
        }
        LogUtil.j("MyCourseAdapter", "error id ", str);
        return 0L;
    }
}
