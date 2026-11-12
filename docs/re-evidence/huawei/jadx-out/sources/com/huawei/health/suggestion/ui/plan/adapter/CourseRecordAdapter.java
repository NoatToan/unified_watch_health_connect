package com.huawei.health.suggestion.ui.plan.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.huawei.basefitnessadvice.model.intplan.RecordData;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.main.api.MainCommonApi;
import com.huawei.health.suggestion.R;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hmf.services.codec.TypeToken;
import com.huawei.ui.commonui.adapter.BaseRecyclerAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.gzx;
import defpackage.ifp;
import defpackage.njy;
import defpackage.ped;
import defpackage.qqf;
import defpackage.qre;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class CourseRecordAdapter extends BaseRecyclerAdapter<RecordData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<RecordData> f9602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Type f9603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f9604c;
    private final MainCommonApi e;

    public CourseRecordAdapter() {
        super(new ArrayList(), R.layout.item_recycler_course_record);
        this.f9604c = BaseApplication.b();
        this.f9602a = new ArrayList();
        this.e = (MainCommonApi) Services.d("Main", MainCommonApi.class);
        this.f9603b = new TypeToken<Map<String, String>>() { // from class: com.huawei.health.suggestion.ui.plan.adapter.CourseRecordAdapter.5
        }.getType();
    }

    public void a(List<RecordData> list) {
        this.f9602a = list;
        refreshDataChange(list);
    }

    @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (njy.e(this.f9602a)) {
            return 0;
        }
        return this.f9602a.size();
    }

    @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void convert(RecyclerHolder recyclerHolder, int i, RecordData recordData) {
        if (recyclerHolder == null || recordData == null) {
            ReleaseLogUtil.d("CourseRecordAdapter", "convert holder ", recyclerHolder, " itemData ", recordData, " position ", Integer.valueOf(i));
            return;
        }
        e(recyclerHolder, recordData);
        b(recyclerHolder, recordData);
        a(recyclerHolder, recordData);
        recyclerHolder.e(R.id.divider, i >= getItemCount() + (-1) ? 8 : 0);
    }

    private void e(RecyclerHolder recyclerHolder, RecordData recordData) {
        FrameLayout frameLayout = (FrameLayout) recyclerHolder.d(R.id.course_record_icon_layout);
        ImageView imageView = (ImageView) recyclerHolder.d(R.id.course_record_icon);
        int sportType = recordData.getSportType();
        if (sportType <= 0) {
            ReleaseLogUtil.d("CourseRecordAdapter", "setIcon sportType ", Integer.valueOf(sportType));
            frameLayout.setVisibility(8);
            imageView.setVisibility(8);
        } else if (this.e == null) {
            ReleaseLogUtil.d("CourseRecordAdapter", "setIcon mApi is null");
            frameLayout.setVisibility(8);
            imageView.setVisibility(8);
        } else {
            frameLayout.setVisibility(0);
            imageView.setVisibility(0);
            Drawable background = frameLayout.getBackground();
            if (background != null) {
                frameLayout.setBackground(qqf.c(background, this.e.getSportIconBackgroundColor(this.f9604c, sportType)));
            }
            imageView.setImageDrawable(qqf.c(this.e.getSportIconDrawable(this.f9604c, sportType), ContextCompat.getColor(this.f9604c, R.color.common_color_white)));
        }
    }

    private void b(RecyclerHolder recyclerHolder, RecordData recordData) {
        HealthTextView healthTextView = (HealthTextView) recyclerHolder.d(R.id.course_record_name);
        int sportType = recordData.getSportType();
        if (sportType <= 0) {
            ReleaseLogUtil.d("CourseRecordAdapter", "setName sportType ", Integer.valueOf(sportType));
            healthTextView.setVisibility(8);
            return;
        }
        if (sportType == 10001) {
            String extraInfo = recordData.getExtraInfo();
            if (TextUtils.isEmpty(extraInfo)) {
                ReleaseLogUtil.d("CourseRecordAdapter", "setName json ", extraInfo);
                healthTextView.setVisibility(8);
                return;
            }
            Map map = (Map) HiJsonUtil.d(extraInfo, this.f9603b);
            if (map == null) {
                ReleaseLogUtil.d("CourseRecordAdapter", "setName map is null");
                healthTextView.setVisibility(8);
                return;
            } else {
                healthTextView.setVisibility(0);
                healthTextView.setText((CharSequence) map.get("name"));
                return;
            }
        }
        if (this.e == null) {
            ReleaseLogUtil.d("CourseRecordAdapter", "setName mApi is null");
            healthTextView.setVisibility(8);
        } else {
            healthTextView.setVisibility(0);
            healthTextView.setText(this.e.getSportName(this.f9604c, sportType));
        }
    }

    private void a(RecyclerHolder recyclerHolder, RecordData recordData) {
        HealthTextView healthTextView = (HealthTextView) recyclerHolder.d(R.id.course_record_info);
        if (healthTextView == null) {
            ReleaseLogUtil.d("CourseRecordAdapter", "setInfo textView is null");
            return;
        }
        float duration = recordData.getDuration();
        float fB = ped.b(recordData.getActualCalorie());
        if (duration <= 0.0f || fB <= 0.0f) {
            healthTextView.setVisibility(8);
            ReleaseLogUtil.d("CourseRecordAdapter", "setInfo duration ", Float.valueOf(duration), " kiloCalorie ", Float.valueOf(fB));
        } else {
            healthTextView.setVisibility(0);
            healthTextView.setText(qre.a(R.string.IDS_run_plan_calendar_title, gzx.d(R.plurals.IDS_plugin_fitnessadvice_min, UnitUtil.e(UnitUtil.d(duration / 60.0f, 0)), ifp.d(duration)), gzx.d(R.plurals.sug_chart_kcals, UnitUtil.e(fB), ped.f(fB))));
        }
    }
}
